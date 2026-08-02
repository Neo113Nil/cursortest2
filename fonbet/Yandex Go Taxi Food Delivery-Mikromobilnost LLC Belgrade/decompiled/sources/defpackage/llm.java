package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigator.main_screen.o;
import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;

/* loaded from: classes12.dex */
public final class llm extends kl80 {
    public final /* synthetic */ int b;
    public final Address c;
    public final /* synthetic */ h55 w;

    public /* synthetic */ llm(h55 h55Var, Address address, int i) {
        this.b = i;
        this.w = h55Var;
        this.c = address;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.b;
        h55 h55Var = this.w;
        switch (i) {
            case 0:
                mlm.P((mlm) h55Var);
                break;
            case 1:
                o.P((o) h55Var);
                break;
            default:
                ((zsa) h55Var).Q(this.c);
                break;
        }
    }

    @Override // defpackage.kl80
    public final void n1(OpenNavigatorActionSubtype openNavigatorActionSubtype, String str) {
        int i = this.b;
        wgu0 wgu0Var = wgu0.a;
        Address address = this.c;
        h55 h55Var = this.w;
        switch (i) {
            case 0:
                int i2 = klm.a[openNavigatorActionSubtype.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        w511.b();
                        break;
                    } else {
                        wgu0Var = null;
                    }
                }
                ((mlm) h55Var).S(new gfl0(new o8g0(new b8l0(new uhu0(wgu0Var)), address)));
                break;
            case 1:
                int i3 = wb00.a[openNavigatorActionSubtype.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        w511.b();
                        break;
                    } else {
                        wgu0Var = null;
                    }
                }
                ((o) h55Var).S(new gfl0(new o8g0(new b8l0(new uhu0(wgu0Var)), address)));
                break;
            default:
                zsa zsaVar = (zsa) h55Var;
                ((re50) zsaVar.F).a(new ne50(address), null);
                zsaVar.r(new z0l0(2));
                break;
        }
    }
}
