package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.editor.swap.SwapItemsView;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.wn2;

/* compiled from: ClipsEditorSwapView.kt */
/* loaded from: classes16.dex */
public final class k0e implements ClipsEditorScreen {
    public final ViewStub b;
    public final wn2 c;
    public final com.vk.clips.editor.base.api.b d;
    public final hwd e;
    public final i0e f;
    public final ClipsEditorScreen.State g = ClipsEditorScreen.State.SWAP;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public k0e(ViewStub viewStub, wn2 wn2Var, uy50 uy50Var, hwd hwdVar, i0e i0eVar) {
        this.b = viewStub;
        this.c = wn2Var;
        this.d = uy50Var;
        this.e = hwdVar;
        this.f = i0eVar;
        com.vk.movika.sdk.base.logic.processor.actions.f fVar = new com.vk.movika.sdk.base.logic.processor.actions.f(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, fVar);
        this.i = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.g(this, 25));
        Lazy a = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.h(this, 22));
        this.j = a;
        Lazy a2 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.i(this, 17));
        this.k = a2;
        this.l = msy.a(lazyThreadSafetyMode, new bu1(this, 14));
        i0eVar.d(this);
        jjc.g(((SwapItemsView) a.getValue()).getReadyButton(), new r7(this, 28));
        jjc.g((View) a2.getValue(), new eqd(this, 1));
    }

    public final void a() {
        this.d.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final boolean a0() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void b(boolean z, ClipsEditorScreen.a aVar) {
        wn2.a.a(this.c, (ViewGroup) this.h.getValue(), (View) this.i.getValue(), new wn2.b(z, true), null, 24);
        i0e i0eVar = this.f;
        i0eVar.m();
        ?? r8 = this.l;
        ((gvc) r8.getValue()).b(i0eVar.f());
        ((gvc) r8.getValue()).c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(boolean z) {
        ?? r0 = this.j;
        if (z) {
            d3m.c(((SwapItemsView) r0.getValue()).v, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e(((SwapItemsView) r0.getValue()).v, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void close() {
        this.c.d((ViewGroup) this.h.getValue(), null);
        this.f.onClosed();
        ((gvc) this.l.getValue()).a();
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final ClipsEditorScreen.State getState() {
        return this.g;
    }
}
