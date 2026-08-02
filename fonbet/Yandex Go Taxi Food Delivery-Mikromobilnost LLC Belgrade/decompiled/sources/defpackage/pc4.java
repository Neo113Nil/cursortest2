package defpackage;

import com.yandex.mapkit.map.IconStyle;
import kotlin.a;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class pc4 implements yq00 {
    public final jw2 a;
    public final i3y b;
    public final i3y c;

    public pc4(jw2 jw2Var) {
        this.a = jw2Var;
        final int i = 0;
        this.b = a.a(new sls(this) { // from class: oc4
            public final /* synthetic */ pc4 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                pc4 pc4Var = this.b;
                switch (i2) {
                    case 0:
                        return new bl00(pc4Var.a.a(mqg0.component_gray_450, f1h0.ic_poi_market_24, a2i0.IconWhiteNormal), new IconStyle());
                    default:
                        return new bl00(pc4Var.a.a(mqg0.component_gray_450, f1h0.ic_flag_24, a2i0.IconWhiteNormal), new IconStyle());
                }
            }
        });
        final int i2 = 1;
        this.c = a.a(new sls(this) { // from class: oc4
            public final /* synthetic */ pc4 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                pc4 pc4Var = this.b;
                switch (i22) {
                    case 0:
                        return new bl00(pc4Var.a.a(mqg0.component_gray_450, f1h0.ic_poi_market_24, a2i0.IconWhiteNormal), new IconStyle());
                    default:
                        return new bl00(pc4Var.a.a(mqg0.component_gray_450, f1h0.ic_flag_24, a2i0.IconWhiteNormal), new IconStyle());
                }
            }
        });
    }

    @Override // defpackage.yq00
    public final Object a(Continuation continuation) {
        return (bl00) this.c.getValue();
    }

    @Override // defpackage.yq00
    public final Object b(Continuation continuation) {
        return (bl00) this.b.getValue();
    }
}
