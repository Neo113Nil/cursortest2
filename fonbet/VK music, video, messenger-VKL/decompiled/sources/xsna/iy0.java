package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.nlh0;

/* compiled from: AdsItemMviViewHolder.kt */
/* loaded from: classes17.dex */
public final class iy0 extends vfz<FeedItem.a> implements pi5, t1b0, e9d, z8e, w4r {
    public final gxp0 l;
    public final yof m;
    public final xod n;
    public final gzs<Integer> o;
    public final jw0 p;
    public boolean q;
    public final Object r;
    public final Object s;
    public final a t;
    public FeedItem.a u;

    public iy0() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iy0(Context context, ow0 ow0Var, kxc kxcVar, okh0 okh0Var, gxp0 gxp0Var, yux yuxVar, pih0 pih0Var, hme hmeVar, int i, pb pbVar, boolean z, lyc lycVar, yof yofVar, ibr0 ibr0Var, x1c0 x1c0Var) {
        super(r2);
        com.vk.clips.sdk.shared.item.ads.c cVar = new com.vk.clips.sdk.shared.item.ads.c(context, ow0Var, yofVar, ibr0Var, kxcVar, okh0Var, lycVar, gxp0Var, yuxVar, pih0Var, hmeVar, i, pbVar, z, x1c0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(cVar);
        this.l = gxp0Var;
        this.m = yofVar;
        this.n = ibr0Var;
        this.o = x1c0Var;
        this.p = cVar;
        ah ahVar = new ah(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.r = msy.a(lazyThreadSafetyMode, ahVar);
        this.s = msy.a(lazyThreadSafetyMode, new m4(this, 3));
        this.t = new a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.e9d
    public final g64 D4() {
        return (g64) this.s.getValue();
    }

    @Override // xsna.w4r
    public final void E0() {
        this.p.E0();
    }

    @Override // xsna.z8e
    public final List<View> N0() {
        return this.p.getFastFadeViews();
    }

    @Override // xsna.w4r
    public final void O() {
        this.p.O();
    }

    @Override // xsna.vfz
    public final void V5() {
        kih0 kih0Var;
        nlh0 nlh0Var;
        FeedItem.a aVar = this.u;
        if (aVar != null && (nlh0Var = aVar.f) != null) {
            nlh0Var.b(this.t);
        }
        FeedItem.a aVar2 = this.u;
        jw0 jw0Var = this.p;
        if (aVar2 != null && (kih0Var = aVar2.g) != null) {
            kih0Var.p(jw0Var.getVideoUIEventListener());
        }
        this.l.b(jw0Var.getUiVisibilityConfigChangedListener());
    }

    @Override // xsna.vfz
    public final void W5(FeedItem.a aVar) {
        h6(aVar);
    }

    @Override // xsna.vfz
    public final void a6() {
        kih0 kih0Var;
        nlh0 nlh0Var;
        FeedItem.a aVar = this.u;
        if (aVar != null && (nlh0Var = aVar.f) != null) {
            nlh0Var.a(this.t);
        }
        FeedItem.a aVar2 = this.u;
        jw0 jw0Var = this.p;
        if (aVar2 != null && (kih0Var = aVar2.g) != null) {
            kih0Var.o(jw0Var.getVideoUIEventListener());
        }
        this.l.d(jw0Var.getUiVisibilityConfigChangedListener());
    }

    @Override // xsna.pi5
    public final oi5 e4() {
        FeedItem.a aVar = this.u;
        if (aVar != null) {
            return aVar.h;
        }
        return null;
    }

    @Override // xsna.vfz
    public final void g6() {
        this.p.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t1b0
    public final o0f getAttachedPlayer() {
        return (p0f) this.r.getValue();
    }

    public final void h6(FeedItem.a aVar) {
        kih0 kih0Var;
        nlh0 nlh0Var;
        FeedItem.a aVar2 = this.u;
        a aVar3 = this.t;
        if (aVar2 != null && (nlh0Var = aVar2.f) != null) {
            nlh0Var.a(aVar3);
        }
        jw0 jw0Var = this.p;
        if (aVar2 != null && (kih0Var = aVar2.g) != null) {
            kih0Var.o(jw0Var.getVideoUIEventListener());
        }
        SdkClipVideoFile sdkClipVideoFile = aVar.e;
        kih0 kih0Var2 = aVar.g;
        nlh0 nlh0Var2 = aVar.f;
        jw0Var.H0(new qu0(sdkClipVideoFile, nlh0Var2, kih0Var2, aVar.i));
        this.u = aVar;
        nlh0Var2.b(aVar3);
        kih0Var2.p(jw0Var.getVideoUIEventListener());
    }

    public final void i6(boolean z) {
        this.p.c(z);
    }

    @Override // xsna.pi5
    public final kih0 j() {
        FeedItem.a aVar = this.u;
        if (aVar != null) {
            return aVar.g;
        }
        return null;
    }

    @Override // xsna.z8e
    public final List<View> q1() {
        return this.p.getTranslationTransitionViews();
    }

    @Override // xsna.z8e
    public final List<View> w2() {
        return this.p.getFadeTransitionViews();
    }

    /* compiled from: AdsItemMviViewHolder.kt */
    public final class a implements nlh0.a {
        public a() {
        }

        @Override // xsna.nlh0.a
        public final void A1(SdkVideoFile sdkVideoFile, List<? extends olh0> list) {
            iy0 iy0Var = iy0.this;
            FeedItem.a aVar = iy0Var.u;
            if (aVar != null) {
                iy0Var.h6(new FeedItem.a(aVar.b, aVar.c, aVar.d, (SdkClipVideoFile) sdkVideoFile, aVar.f, aVar.g, aVar.h, aVar.i));
            }
        }

        @Override // xsna.nlh0.a
        public final void L2(boolean z) {
        }
    }
}
