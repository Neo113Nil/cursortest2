package yads;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;
import xsna.go9;
import xsna.i6n0;

/* loaded from: classes10.dex */
public final class m30 extends eo {
    public u30 e;
    public byte[] f;
    public int g;
    public int h;

    public m30() {
        super(false);
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        e();
        this.e = u30Var;
        Uri uri = u30Var.a;
        String scheme = uri.getScheme();
        ni.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = mc3.a;
        String[] split = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (split.length != 2) {
            throw new pc2(i6n0.a(uri, "Unexpected URI format: "), null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new pc2(go9.b("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.f = mc3.c(URLDecoder.decode(str, bu.a.name()));
        }
        long j = u30Var.f;
        byte[] bArr = this.f;
        if (j > bArr.length) {
            this.f = null;
            throw new q30(2008);
        }
        int i2 = (int) j;
        this.g = i2;
        int length = bArr.length - i2;
        this.h = length;
        long j2 = u30Var.g;
        if (j2 != -1) {
            this.h = (int) Math.min(length, j2);
        }
        b(u30Var);
        long j3 = u30Var.g;
        return j3 != -1 ? j3 : this.h;
    }

    @Override // yads.p30
    public final void close() {
        if (this.f != null) {
            this.f = null;
            d();
        }
        this.e = null;
    }

    @Override // yads.p30
    public final Uri getUri() {
        u30 u30Var = this.e;
        if (u30Var != null) {
            return u30Var.a;
        }
        return null;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        int i4 = mc3.a;
        System.arraycopy(bArr2, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        c(min);
        return min;
    }
}
