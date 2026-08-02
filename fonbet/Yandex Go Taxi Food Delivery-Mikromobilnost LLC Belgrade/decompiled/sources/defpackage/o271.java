package defpackage;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.net.URLDecoder;
import yads.aa2;
import yads.h30;

/* loaded from: classes7.dex */
public final class o271 extends yd71 {
    public int A;
    public no71 x;
    public byte[] y;
    public int z;

    public o271() {
        super(false);
    }

    @Override // defpackage.u871
    public final long Q(no71 no71Var) {
        h();
        this.x = no71Var;
        Uri uri = no71Var.a;
        long j = no71Var.f;
        String scheme = uri.getScheme();
        cha1.c("Unsupported scheme: " + scheme, Constants.KEY_DATA.equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = rf71.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new aa2(unr0.n(uri, "Unexpected URI format: "), null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.y = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new aa2(g8e.o("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.y = URLDecoder.decode(str, md81.a.name()).getBytes(md81.c);
        }
        long j2 = no71Var.e;
        byte[] bArr = this.y;
        if (j2 > bArr.length) {
            this.y = null;
            throw new h30();
        }
        int i2 = (int) j2;
        this.z = i2;
        int length = bArr.length - i2;
        this.A = length;
        if (j != -1) {
            this.A = (int) Math.min(length, j);
        }
        a(no71Var);
        return j != -1 ? j : this.A;
    }

    @Override // defpackage.u871
    public final void close() {
        if (this.y != null) {
            this.y = null;
            g();
        }
        this.x = null;
    }

    @Override // defpackage.u871
    public final Uri d() {
        no71 no71Var = this.x;
        if (no71Var != null) {
            return no71Var.a;
        }
        return null;
    }

    @Override // defpackage.jz61
    public final int v(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.A;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.y;
        int i4 = rf71.a;
        System.arraycopy(bArr2, this.z, bArr, i, min);
        this.z += min;
        this.A -= min;
        c(min);
        return min;
    }
}
