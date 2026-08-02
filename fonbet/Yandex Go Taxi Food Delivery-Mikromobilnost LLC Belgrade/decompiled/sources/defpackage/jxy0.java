package defpackage;

import com.yandex.go.places.models.data.entities.network.ImageDto;

/* loaded from: classes13.dex */
public final class jxy0 {
    public final mxy0 a;
    public final dbv b;

    public jxy0(mxy0 mxy0Var, dbv dbvVar) {
        this.a = mxy0Var;
        this.b = dbvVar;
    }

    public final ixy0 a(String str, String str2) {
        String a;
        if (str != null || str2 != null) {
            if (str == null || evu0.J(str)) {
                this.b.getClass();
                k7v b = dbv.b(str2);
                if (b != null) {
                    return new ixy0(b, null);
                }
            } else {
                mxy0 mxy0Var = this.a;
                String a2 = mxy0Var.a(str, false);
                if (a2 != null && (a = mxy0Var.a(str, true)) != null) {
                    return new ixy0(new k7v(a2, 2), new k7v(a, 2));
                }
            }
        }
        return null;
    }

    public final ixy0 b(ImageDto imageDto) {
        return a(imageDto != null ? imageDto.b : null, imageDto != null ? imageDto.a : null);
    }
}
