package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.catalog.api.v2.SuperappCatalogCallbackProvider;
import xsna.hhn0;
import xsna.pgn0;

/* compiled from: BaseSuperappMiniAppsPresenter.kt */
/* loaded from: classes6.dex */
public abstract class zo6 implements ehn0 {
    public final String a;
    public final lgn0 b;
    public com.vk.lists.c c;
    public wo6 d;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public yo6 f;

    public zo6(String str, lgn0 lgn0Var) {
        this.a = str;
        this.b = lgn0Var;
    }

    @Override // xsna.ehn0
    public final void d(WebApiApplication webApiApplication) {
        FragmentActivity activity;
        oe5 oe5Var = new oe5(1, this, webApiApplication);
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        if (wdx0Var.k()) {
            oe5Var.invoke();
            return;
        }
        yo6 yo6Var = new yo6(oe5Var, this);
        this.f = yo6Var;
        q55 q55Var = q55.a;
        q55.a(yo6Var);
        wo6 wo6Var = this.d;
        if (wo6Var == null || (activity = wo6Var.getActivity()) == null) {
            return;
        }
        wdx0 wdx0Var2 = e370.f;
        wdx0 wdx0Var3 = wdx0Var2 != null ? wdx0Var2 : null;
        new pgn0.b();
        wdx0Var3.l(activity);
    }

    @Override // xsna.ehn0
    public final void e() {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.e.b(vdx0Var.d().v().subscribe(new zl0(new com.vk.movika.sdk.base.logic.interactor.d(this, 12), 5), new j50(new am0(9), 5)));
    }

    @Override // xsna.ehn0
    public final void f(String str, String str2) {
        wo6 wo6Var = this.d;
        if (wo6Var != null) {
            hhn0 hhn0Var = (hhn0) wo6Var;
            hhn0.a aVar = new hhn0.a();
            Bundle bundle = aVar.a;
            bundle.putString("sectionId", str);
            if (str2 != null) {
                bundle.putString("title", str2);
            }
            Bundle arguments = hhn0Var.getArguments();
            SuperappCatalogCallbackProvider superappCatalogCallbackProvider = (SuperappCatalogCallbackProvider) (arguments != null ? arguments.getSerializable("callback_provider") : null);
            if (superappCatalogCallbackProvider != null) {
                bundle.putSerializable("callback_provider", superappCatalogCallbackProvider);
            }
            Object invoke = aVar.b.invoke();
            ((wo6) invoke).setArguments(bundle);
            Fragment fragment = (Fragment) invoke;
            FragmentActivity activity = hhn0Var.getActivity();
            if (activity != null) {
                int id = hhn0Var.getId();
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                aVar2.g(id, fragment, null);
                aVar2.d(null);
                aVar2.k(true);
            }
        }
    }

    @Override // xsna.ehn0
    public final void g() {
        com.vk.lists.c cVar = this.c;
        if (cVar == null) {
            cVar = null;
        }
        cVar.p(false);
    }
}
