package xsna;

import com.vk.stat.scheme.CommonVideoAdsStat$CommonFields;
import java.util.ArrayList;
import xsna.it80;
import xsna.nmk0;
import xsna.uu1;
import xsna.wc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class mmk0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mmk0(com.vk.superapp.widget_settings.p004new.b bVar, boolean z, ArrayList arrayList) {
        this.d = bVar;
        this.c = z;
        this.e = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                nmk0 nmk0Var = (nmk0) this.d;
                it80 it80Var = (it80) this.e;
                it80 it80Var2 = (it80) obj;
                g08 g08Var = (g08) it80Var2.a;
                nmk0.a aVar = (nmk0.a) it80Var.a;
                lmk0 lmk0Var = nmk0Var.a;
                wc0 wc0Var = this.c ? lmk0Var.b : lmk0Var.a;
                it80 it80Var3 = null;
                String str = g08Var != null ? g08Var.a : null;
                wc0Var.f(!(str == null || drm0.N(str)), g08Var == null ? null : g08Var.f == null ? CommonVideoAdsStat$CommonFields.BannerType.FREEBET : CommonVideoAdsStat$CommonFields.BannerType.ODDS, new wc0.a(aVar != null ? aVar.e : null, aVar != null ? aVar.f : null, aVar != null ? aVar.d : null, g08Var != null ? g08Var.g : null));
                T t = it80Var2.a;
                T t2 = it80Var.a;
                if (t != 0 && t2 != 0) {
                    nmk0.a aVar2 = (nmk0.a) t2;
                    it80.a aVar3 = it80.b;
                    l31 l31Var = new l31((g08) t, aVar2.a, aVar2.b, aVar2.c);
                    aVar3.getClass();
                    it80Var3 = new it80(l31Var);
                }
                if (it80Var3 != null) {
                    return it80Var3;
                }
                it80.b.getClass();
                return it80.a.a();
            default:
                com.vk.superapp.widget_settings.p004new.b bVar = (com.vk.superapp.widget_settings.p004new.b) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                if (((Boolean) obj).booleanValue()) {
                    uu1.b l = bVar.l(arrayList, this.c);
                    bVar.f = l;
                    if (bVar.o) {
                        bVar.o = false;
                        bVar.a.onNext(l);
                        bVar.o();
                    }
                } else {
                    bVar.p();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ mmk0(nmk0 nmk0Var, it80 it80Var, boolean z) {
        this.d = nmk0Var;
        this.e = it80Var;
        this.c = z;
    }
}
