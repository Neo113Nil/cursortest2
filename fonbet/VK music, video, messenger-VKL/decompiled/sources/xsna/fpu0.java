package xsna;

import android.app.Activity;
import android.view.Window;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VkDatingBrowserFragment.kt */
/* loaded from: classes6.dex */
public final class fpu0 extends hgr0 {
    public static final /* synthetic */ int c0 = 0;
    public final Object a0 = msy.a(LazyThreadSafetyMode.NONE, new acp0(this, 10));
    public final a b0 = new a(this);

    /* compiled from: VkDatingBrowserFragment.kt */
    public static final class a implements i1v0 {
        public final Object a;

        public a(fpu0 fpu0Var) {
            this.a = msy.a(LazyThreadSafetyMode.NONE, new j8n0(fpu0Var, 23));
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.i1v0
        public final zxx get() {
            return new zxx((r6y) this.a.getValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.superapp.browser.ui.a
    public final void An() {
        w1l w1lVar = (w1l) this.a0.getValue();
        if (w1lVar.f) {
            ((zdh0) w1lVar.g.getValue()).e(w1lVar.h);
        }
        super.An();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.superapp.browser.ui.a
    public final void Bn() {
        boolean contains;
        super.Bn();
        w1l w1lVar = (w1l) this.a0.getValue();
        v1l v1lVar = w1lVar.h;
        if (w1lVar.f) {
            zdh0 zdh0Var = (zdh0) w1lVar.g.getValue();
            synchronized (zdh0Var) {
                contains = zdh0Var.d.contains(v1lVar);
            }
            if (contains) {
                return;
            }
            ((zdh0) w1lVar.g.getValue()).a(v1lVar);
        }
    }

    @Override // com.vk.superapp.browser.ui.a
    public final r6y Dn() {
        return new g7y(yn());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Activity activity;
        Window window;
        w1l w1lVar = (w1l) this.a0.getValue();
        if (w1lVar.f) {
            ((zdh0) w1lVar.g.getValue()).e(w1lVar.h);
        }
        if (w1lVar.e && (activity = (Activity) w1lVar.b.invoke()) != null && (window = activity.getWindow()) != null) {
            window.clearFlags(8192);
        }
        super.onDestroyView();
    }

    @Override // xsna.hgr0, com.vk.superapp.browser.ui.a
    public final i1v0 xn() {
        return this.b0;
    }
}
