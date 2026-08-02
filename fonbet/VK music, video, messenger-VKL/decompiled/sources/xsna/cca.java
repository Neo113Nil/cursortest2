package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;

/* compiled from: CatalogPreloadCallback.kt */
/* loaded from: classes16.dex */
public final class cca implements s0d0, View.OnAttachStateChangeListener {
    public final gzs<Context> b;
    public final CatalogConfiguration c;
    public final izs<Integer, UIBlock> d;
    public final izs<Integer, s8a> e;
    public io.reactivex.rxjava3.disposables.b f;

    /* JADX WARN: Multi-variable type inference failed */
    public cca(gzs<? extends Context> gzsVar, CatalogConfiguration catalogConfiguration, izs<? super Integer, ? extends UIBlock> izsVar, izs<? super Integer, s8a> izsVar2) {
        this.b = gzsVar;
        this.c = catalogConfiguration;
        this.d = izsVar;
        this.e = izsVar2;
    }

    @Override // xsna.s0d0
    public final u0d0 a(int i) {
        Context invoke = this.b.invoke();
        if (invoke == null) {
            return u0d0.a;
        }
        UIBlock invoke2 = this.d.invoke(Integer.valueOf(i));
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        s8a invoke3 = this.e.invoke(Integer.valueOf(i));
        CatalogConfiguration catalogConfiguration = this.c;
        int C = catalogConfiguration.C(invoke2);
        for (int i2 = 0; i2 < C; i2++) {
            hg1.e(bVar, mcr0.s(catalogConfiguration.X(invoke, i2, invoke2, invoke3)).subscribe());
        }
        io.reactivex.rxjava3.disposables.b bVar2 = this.f;
        if (bVar2 == null) {
            bVar2 = null;
        }
        hg1.e(bVar2, bVar);
        return new v0d0(bVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        io.reactivex.rxjava3.disposables.b bVar = this.f;
        if (bVar == null) {
            bVar = null;
        }
        bVar.dispose();
    }
}
