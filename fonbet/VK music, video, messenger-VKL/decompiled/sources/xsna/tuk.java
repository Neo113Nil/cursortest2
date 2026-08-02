package xsna;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: DataSchemeDataSource.java */
/* loaded from: classes12.dex */
public final class tuk extends gc6 {

    @Nullable
    public evk r;

    @Nullable
    public byte[] s;
    public int t;
    public int u;

    @Override // androidx.media3.datasource.a
    public final void close() {
        if (this.s != null) {
            this.s = null;
            transferEnded();
        }
        this.r = null;
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        evk evkVar = this.r;
        if (evkVar != null) {
            return evkVar.a;
        }
        return null;
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws IOException {
        transferInitializing(evkVar);
        this.r = evkVar;
        Uri uri = evkVar.a;
        long j = evkVar.h;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        fxc0.o(scheme, "Unsupported scheme: %s", "data".equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = y2r0.a;
        String[] split = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (split.length != 2) {
            throw new ParserException(0, i6n0.a(normalizeScheme, "Unexpected URI format: "), null, true);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.s = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(0, go9.b("Error while parsing Base64 encoded string: ", str2), e, true);
            }
        } else {
            this.s = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = evkVar.g;
        byte[] bArr = this.s;
        if (j2 > bArr.length) {
            this.s = null;
            throw new DataSourceException(2008);
        }
        int i = (int) j2;
        this.t = i;
        int length = bArr.length - i;
        this.u = length;
        if (j != -1) {
            this.u = (int) Math.min(length, j);
        }
        transferStarted(evkVar);
        return j != -1 ? j : this.u;
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.u;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.s;
        String str = y2r0.a;
        System.arraycopy(bArr2, this.t, bArr, i, min);
        this.t += min;
        this.u -= min;
        bytesTransferred(min);
        return min;
    }
}
