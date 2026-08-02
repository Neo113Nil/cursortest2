package xsna;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import com.vk.clips.sdk.viewer.engine.feed.api.FeedMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: SdkFeedEngineScrollAdapter.kt */
/* loaded from: classes17.dex */
public final class ljh0 implements leh0 {
    public static final /* synthetic */ qcy<Object>[] h = {new MutablePropertyReference1Impl(ljh0.class, "authDialogShown", "getAuthDialogShown()Z", 0), p5j.a(0, ljh0.class, "inlineNpsOverlayFocused", "getInlineNpsOverlayFocused()Z", fpf0.a), new MutablePropertyReference1Impl(ljh0.class, "forcePaused", "getForcePaused()Z", 0)};
    public final h6e<?> a;
    public final o6e b;
    public final gzs<Boolean> c;
    public final ckm d;
    public final a e;
    public final a f;
    public final a g;

    /* compiled from: SdkFeedEngineScrollAdapter.kt */
    public final class a<T> extends wq70<T> {
        public a(Boolean bool) {
            super(bool);
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, T t, T t2) {
            if (epx.f(t, t2)) {
                return;
            }
            ljh0 ljh0Var = ljh0.this;
            o6e o6eVar = ljh0Var.b;
            a aVar = ljh0Var.g;
            qcy<?>[] qcyVarArr = ljh0.h;
            if (((Boolean) aVar.getValue(ljh0Var, qcyVarArr[2])).booleanValue()) {
                o6eVar.a();
                return;
            }
            if (ljh0Var.c.invoke().booleanValue()) {
                if (((Boolean) ljh0Var.f.getValue(ljh0Var, qcyVarArr[1])).booleanValue() || ((Boolean) ljh0Var.e.getValue(ljh0Var, qcyVarArr[0])).booleanValue()) {
                    o6eVar.a();
                } else {
                    o6eVar.b();
                }
            }
        }
    }

    public ljh0(h6e<?> h6eVar, o6e o6eVar, gzs<Boolean> gzsVar, Context context, vou vouVar) {
        this.a = h6eVar;
        this.b = o6eVar;
        this.c = gzsVar;
        this.d = vouVar.g(context, new gwd0(2), new vqf0(2));
        Boolean bool = Boolean.FALSE;
        this.e = new a(bool);
        this.f = new a(bool);
        this.g = new a(Boolean.TRUE);
    }

    @Override // xsna.leh0
    public final void a() {
        this.g.setValue(this, h[2], Boolean.TRUE);
    }

    @Override // xsna.leh0
    public final void c(boolean z) {
        this.f.setValue(this, h[1], Boolean.valueOf(z));
    }

    @Override // xsna.leh0
    public final void d() {
        this.g.setValue(this, h[2], Boolean.FALSE);
    }

    @Override // xsna.leh0
    public final void e(q8e q8eVar, LinearLayoutManager linearLayoutManager, ClipFeedAdapter clipFeedAdapter) {
        this.a.b(q8eVar, linearLayoutManager, clipFeedAdapter, FeedMode.Vertical);
    }

    @Override // xsna.leh0
    public final void onDestroy() {
        ckm ckmVar = this.d;
        ww50<?> ww50Var = ckmVar.f;
        if (ww50Var != null) {
            ww50Var.c0(ckmVar);
        }
        ckmVar.f = null;
    }

    @Override // xsna.leh0
    public final void onDestroyView() {
        this.a.c();
    }

    @Override // xsna.leh0
    public final void b() {
    }
}
