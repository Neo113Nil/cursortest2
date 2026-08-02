package xsna;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: SdkScrollAdapter.kt */
/* loaded from: classes17.dex */
public final class pkh0 implements leh0 {
    public static final /* synthetic */ qcy<Object>[] g = {new MutablePropertyReference1Impl(pkh0.class, "authDialogShown", "getAuthDialogShown()Z", 0), p5j.a(0, pkh0.class, "inlineNpsOverlayFocused", "getInlineNpsOverlayFocused()Z", fpf0.a), new MutablePropertyReference1Impl(pkh0.class, "forcePaused", "getForcePaused()Z", 0)};
    public final q2f a;
    public final gzs<Boolean> b;
    public final ckm c;
    public final a d;
    public final a e;
    public final a f;

    /* compiled from: SdkScrollAdapter.kt */
    public final class a<T> extends wq70<T> {
        public a(Boolean bool) {
            super(bool);
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, T t, T t2) {
            if (epx.f(t, t2)) {
                return;
            }
            pkh0 pkh0Var = pkh0.this;
            q2f q2fVar = pkh0Var.a;
            a aVar = pkh0Var.f;
            qcy<?>[] qcyVarArr = pkh0.g;
            if (((Boolean) aVar.getValue(pkh0Var, qcyVarArr[2])).booleanValue()) {
                q2fVar.a();
                return;
            }
            if (pkh0Var.b.invoke().booleanValue()) {
                if (((Boolean) pkh0Var.e.getValue(pkh0Var, qcyVarArr[1])).booleanValue() || ((Boolean) pkh0Var.d.getValue(pkh0Var, qcyVarArr[0])).booleanValue()) {
                    q2fVar.a();
                    return;
                }
                r2f r2fVar = q2fVar.a;
                if (r2fVar.h) {
                    r2fVar.h = false;
                    r2fVar.c(false);
                    r2fVar.b();
                }
            }
        }
    }

    public pkh0(q2f q2fVar, gzs<Boolean> gzsVar, Context context, vou vouVar) {
        this.a = q2fVar;
        this.b = gzsVar;
        this.c = vouVar.g(context, new daz(15), new jo60(7));
        Boolean bool = Boolean.FALSE;
        this.d = new a(bool);
        this.e = new a(bool);
        this.f = new a(Boolean.TRUE);
    }

    @Override // xsna.leh0
    public final void a() {
        this.f.setValue(this, g[2], Boolean.TRUE);
    }

    @Override // xsna.leh0
    public final void b() {
        q2f q2fVar = this.a;
        q8e q8eVar = q2fVar.d;
        if (q8eVar != null && q8eVar.getScrollState() == 0) {
            View findSnapView = q2fVar.b.b().findSnapView((LinearLayoutManager) q8eVar.getLayoutManager());
            q2fVar.e = findSnapView == null ? 0 : q8eVar.getChildLayoutPosition(findSnapView);
        }
        r2f r2fVar = q2fVar.a;
        r2fVar.c(false);
        r2fVar.b();
    }

    @Override // xsna.leh0
    public final void c(boolean z) {
        this.e.setValue(this, g[1], Boolean.valueOf(z));
    }

    @Override // xsna.leh0
    public final void d() {
        this.f.setValue(this, g[2], Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.leh0
    public final void e(q8e q8eVar, LinearLayoutManager linearLayoutManager, ClipFeedAdapter clipFeedAdapter) {
        q2f q2fVar = this.a;
        q2fVar.d = q8eVar;
        f4o0 f4o0Var = q2fVar.b;
        f4o0Var.c(new sh3(12, q2fVar, q8eVar));
        r2f r2fVar = q2fVar.a;
        u5f0 u5f0Var = q2fVar.c;
        r2fVar.c = new i0d0((xmf) u5f0Var.a, new yxt0(q8eVar, (xxt0) u5f0Var.b), (mgk0) u5f0Var.c, (m960) u5f0Var.d);
        r2fVar.d = new uj0(q2fVar, q8eVar);
        f4o0Var.b().attachToRecyclerView(q8eVar);
        q8eVar.addOnScrollListener((RecyclerView.t) q2fVar.f.getValue());
    }

    @Override // xsna.leh0
    public final void onDestroy() {
        ckm ckmVar = this.c;
        ww50<?> ww50Var = ckmVar.f;
        if (ww50Var != null) {
            ww50Var.c0(ckmVar);
        }
        ckmVar.f = null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.leh0
    public final void onDestroyView() {
        q2f q2fVar = this.a;
        f4o0 f4o0Var = q2fVar.b;
        q8e q8eVar = q2fVar.d;
        if (q8eVar != null) {
            q8eVar.removeOnScrollListener((RecyclerView.t) q2fVar.f.getValue());
        }
        f4o0Var.b().attachToRecyclerView(null);
        r2f r2fVar = q2fVar.a;
        r2fVar.d = null;
        r2fVar.c = null;
        f4o0Var.a();
        q2fVar.d = null;
        q2fVar.e = -1;
    }
}
