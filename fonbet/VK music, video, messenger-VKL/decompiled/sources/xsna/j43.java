package xsna;

import android.net.Uri;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.translate.impl.models.LanguageModel;
import com.vk.translate.impl.models.SupportedTranslateLanguage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AppForegroundNotifier.kt */
/* loaded from: classes6.dex */
public final class j43 {
    public final Object a;
    public final Object b;
    public Serializable c;

    public j43(hw3 hw3Var, pll pllVar) {
        this.a = hw3Var;
        this.b = pllVar;
        this.c = new bpn0(new tu80(this, 20));
    }

    public c9i0 a(LanguageModel languageModel, LanguageModel languageModel2) {
        return b(languageModel.d(), languageModel2.d());
    }

    public c9i0 b(SupportedTranslateLanguage supportedTranslateLanguage, SupportedTranslateLanguage supportedTranslateLanguage2) {
        pll pllVar = (pll) this.b;
        LanguageModel h = pllVar.h(supportedTranslateLanguage);
        bpn0 bpn0Var = (bpn0) this.c;
        List list = (List) bpn0Var.getValue();
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new mai0((LanguageModel) it.next(), true));
        }
        zha0 zha0Var = new zha0(h, arrayList);
        LanguageModel h2 = pllVar.h(supportedTranslateLanguage2);
        List list2 = (List) bpn0Var.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (!supportedTranslateLanguage.h().contains(((LanguageModel) obj).d().d())) {
                arrayList2.add(obj);
            }
        }
        List list3 = (List) bpn0Var.getValue();
        ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new mai0((LanguageModel) it2.next(), !arrayList2.contains(r3)));
        }
        return new c9i0(zha0Var, new zha0(h2, arrayList3));
    }

    public void c() {
        i43 i43Var = (i43) this.c;
        i43 i43Var2 = i43.BACKGROUND;
        if (i43Var != i43Var2) {
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if (superappUiRouterBridge == null) {
                superappUiRouterBridge = null;
            }
            Long e = superappUiRouterBridge.e();
            ((mfu0) this.a).getState().g().a.R().B0((e != null && e.longValue() == ((fvv0) this.b).getAppId()) ? "pip" : "hide");
            this.c = i43Var2;
        }
    }

    public void d() {
        mfu0 mfu0Var = (mfu0) this.a;
        i43 i43Var = (i43) this.c;
        if (i43Var == i43.UNKNOWN) {
            this.c = i43.OPENED;
            return;
        }
        i43 i43Var2 = i43.FOREGROUND;
        if (i43Var == i43Var2) {
            return;
        }
        String c = ((fvv0) this.b).c();
        if (mfu0Var.getState().k() && c != null && mfu0Var.getState().q() && ((i43) this.c) != i43.BACKGROUND) {
            mfu0Var.getState().g().a.R().t(Uri.parse(c).getFragment());
        }
        mfu0Var.getState().g().a.R().q();
        this.c = i43Var2;
    }

    public j43(mfu0 mfu0Var, fvv0 fvv0Var) {
        this.a = mfu0Var;
        this.b = fvv0Var;
        this.c = i43.UNKNOWN;
    }
}
