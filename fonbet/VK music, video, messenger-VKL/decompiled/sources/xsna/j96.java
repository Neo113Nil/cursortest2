package xsna;

import android.content.Context;
import com.vk.stories.design.view.editor.StickerDeleteAreaView;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;

/* compiled from: BaseCameraEditorViewDelegates.kt */
/* loaded from: classes16.dex */
public final class j96 implements t76 {
    public final Object A;
    public final Object B;
    public final Object C;
    public zlo0 D;
    public final Object E;
    public final i96 F;
    public final l7s b;
    public final x1e0 c;
    public final ei9 d;
    public final ke90 e;
    public final z4d0 f;
    public final wp40 g;
    public imo0 h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public e7m0 m;
    public c4m0 n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public j96(l7s l7sVar, x1e0 x1e0Var, ei9 ei9Var, ke90 ke90Var, z4d0 z4d0Var, wp40 wp40Var) {
        this.b = l7sVar;
        this.c = x1e0Var;
        this.d = ei9Var;
        this.e = ke90Var;
        this.f = z4d0Var;
        this.g = wp40Var;
        j1 j1Var = new j1(this, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, j1Var);
        this.j = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.f(this, 8));
        this.k = msy.a(lazyThreadSafetyMode, new l1(this, 9));
        this.l = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.g(this, 12));
        this.o = msy.a(lazyThreadSafetyMode, new m1(this, 4));
        this.p = msy.a(lazyThreadSafetyMode, new jd(this, 5));
        this.q = msy.a(lazyThreadSafetyMode, new kd(this, 11));
        this.r = msy.a(lazyThreadSafetyMode, new ld(this, 7));
        this.s = msy.a(lazyThreadSafetyMode, new h6(this, 8));
        this.t = msy.a(lazyThreadSafetyMode, new we0(this, 7));
        this.u = msy.a(lazyThreadSafetyMode, new s1(this, 9));
        this.v = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.t(this, 7));
        this.w = msy.a(lazyThreadSafetyMode, new sx0(this, 4));
        this.x = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.b(this, 6));
        int i = 5;
        this.y = msy.a(lazyThreadSafetyMode, new v6(this, i));
        this.z = msy.a(lazyThreadSafetyMode, new y6(this, i));
        this.A = msy.a(lazyThreadSafetyMode, new rj1(this, 6));
        int i2 = 7;
        this.B = msy.a(lazyThreadSafetyMode, new no(this, i2));
        this.C = msy.a(lazyThreadSafetyMode, new oo(this, i2));
        this.E = msy.a(lazyThreadSafetyMode, new hd(this, i2));
        this.F = new i96(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final e8m0 a() {
        return (e8m0) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final xpa0 b() {
        return (xpa0) this.r.getValue();
    }

    public final int c() {
        int measuredHeight = getStickersDrawingView().getMeasuredHeight();
        if (measuredHeight != 0) {
            return measuredHeight;
        }
        HashSet hashSet = iah0.a;
        return this.b.getResources().getDisplayMetrics().heightPixels;
    }

    public final int d() {
        int measuredWidth = getStickersDrawingView().getMeasuredWidth();
        if (measuredWidth != 0) {
            return measuredWidth;
        }
        HashSet hashSet = iah0.a;
        return this.b.getResources().getDisplayMetrics().widthPixels;
    }

    @Override // xsna.t76
    public final zlo0 getCurrentTextDialog() {
        return this.D;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final m4m0 getHashtagDelegate() {
        return (m4m0) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final z5m0 getMarketItemStickerDelegate() {
        return (z5m0) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final p6m0 getMentionDelegate() {
        return (p6m0) this.p.getValue();
    }

    @Override // xsna.t76
    public final nov getMovingSticker() {
        return getStickersDrawingView().getMovingSticker();
    }

    @Override // xsna.t76
    public final kh6 getMusicDelegate() {
        return this.m;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final y7m0 getPhotoAlbumStickerDelegate() {
        return (y7m0) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final f8m0 getPhotoStickerRedesignDelegate() {
        return (f8m0) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final o8m0 getPollStickerDelegate() {
        return (o8m0) this.z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final x0m0 getQuestionDelegate() {
        return (x0m0) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final vam0 getReactionDelegate() {
        return (vam0) this.C.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final obm0 getReplyVideoStickerDelegate() {
        return (obm0) this.y.getValue();
    }

    @Override // xsna.t76
    public final Context getRequireContext() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final ddm0 getServiceItemStickerDelegate() {
        return (ddm0) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final StickerDeleteAreaView getStickerDeleteArea() {
        return (StickerDeleteAreaView) this.s.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final StickersDrawingViewGroup getStickersDrawingView() {
        return (StickersDrawingViewGroup) this.E.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final p5m0 getStoryLinkDelegate() {
        return (p5m0) this.A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final v8m0 getStoryPostDelegate() {
        return (v8m0) this.B.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final bmo0 getTextStickerDialogDelegate() {
        return (bmo0) this.q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t76
    public final xjm0 getTimeStickerDelegate() {
        return (xjm0) this.u.getValue();
    }

    @Override // xsna.t76
    public final void setCurrentTextDialog(zlo0 zlo0Var) {
        this.D = zlo0Var;
    }

    @Override // xsna.t76
    public final void setLastTextStickerInfo(imo0 imo0Var) {
        this.h = imo0Var;
    }
}
