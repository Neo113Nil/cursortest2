package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.LocalizationDescriptor;
import java.util.Map;

/* loaded from: classes15.dex */
public final /* synthetic */ class dv21 implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gv21 b;
    public final /* synthetic */ String c;

    public /* synthetic */ dv21(gv21 gv21Var, String str) {
        this.b = gv21Var;
        this.c = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.c;
        gv21 gv21Var = this.b;
        oll0 oll0Var = (oll0) obj;
        switch (i) {
            case 0:
                ull0 T0 = oll0Var.T0("\n        SELECT *\n        FROM localized_data\n        WHERE user_id = ?\n    ");
                boolean z = true;
                try {
                    T0.g1(1, str);
                    int r = eja1.r(T0, "user_id");
                    int r2 = eja1.r(T0, "loaded");
                    int r3 = eja1.r(T0, "descriptor");
                    int r4 = eja1.r(T0, "localization_map");
                    hv21 hv21Var = null;
                    String Y1 = null;
                    if (T0.q()) {
                        String Y12 = T0.Y1(r);
                        if (((int) T0.getLong(r2)) == 0) {
                            z = false;
                        }
                        LocalizationDescriptor localizationDescriptor = (LocalizationDescriptor) ((w5z) gv21Var.c.getValue()).l(T0.isNull(r3) ? null : T0.Y1(r3));
                        if (!T0.isNull(r4)) {
                            Y1 = T0.Y1(r4);
                        }
                        hv21Var = new hv21(Y12, z, localizationDescriptor, (Map) ((x5z) gv21Var.d.getValue()).l(Y1));
                    }
                    return hv21Var;
                } finally {
                    T0.close();
                }
            default:
                gv21.f(gv21Var, str);
                return zy11.a;
        }
    }

    public /* synthetic */ dv21(String str, gv21 gv21Var) {
        this.c = str;
        this.b = gv21Var;
    }
}
