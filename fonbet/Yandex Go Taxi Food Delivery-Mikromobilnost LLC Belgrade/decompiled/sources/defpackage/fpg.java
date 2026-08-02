package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes10.dex */
public final class fpg extends nz4 {
    public npg a;
    public byte[] b;
    public int c;
    public int w;

    public fpg() {
        super(false);
    }

    @Override // defpackage.kpg
    public final void close() {
        if (this.b != null) {
            this.b = null;
            transferEnded();
        }
        this.a = null;
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public final Uri getInflatedUri() {
        npg npgVar = this.a;
        if (npgVar != null) {
            return npgVar.a;
        }
        return null;
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        transferInitializing(npgVar);
        this.a = npgVar;
        Uri uri = npgVar.a;
        long j = npgVar.g;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        d6z.k("Unsupported scheme: " + scheme, Constants.KEY_DATA.equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i = tw21.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new ParserException(0, unr0.n(normalizeScheme, "Unexpected URI format: "), null, true);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(0, g8e.o("Error while parsing Base64 encoded string: ", str), e, true);
            }
        } else {
            this.b = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = npgVar.f;
        byte[] bArr = this.b;
        if (j2 > bArr.length) {
            this.b = null;
            throw new DataSourceException(2008);
        }
        int i2 = (int) j2;
        this.c = i2;
        int length = bArr.length - i2;
        this.w = length;
        if (j != -1) {
            this.w = (int) Math.min(length, j);
        }
        transferStarted(npgVar);
        return j != -1 ? j : this.w;
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.w;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.b;
        int i4 = tw21.a;
        System.arraycopy(bArr2, this.c, bArr, i, min);
        this.c += min;
        this.w -= min;
        bytesTransferred(min);
        return min;
    }
}
