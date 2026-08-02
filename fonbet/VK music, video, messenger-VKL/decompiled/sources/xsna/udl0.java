package xsna;

import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.clips.editor.stickers.api.NewStickersArranger;
import xsna.hyd;

/* compiled from: StickersViewInteractorImpl.kt */
/* loaded from: classes16.dex */
public final class udl0 implements tdl0 {
    public static final float c = iah0.a(10);
    public static final float d = iah0.a(18);
    public final ClipsStickersView a;
    public final qci b = new qci(7);

    /* compiled from: StickersViewInteractorImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NewStickersArranger.values().length];
            try {
                iArr[NewStickersArranger.LEFT_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewStickersArranger.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public udl0(ClipsStickersView clipsStickersView) {
        this.a = clipsStickersView;
    }

    @Override // xsna.tdl0
    public final void a(nov novVar) {
        this.a.setAllowedStickerToMove(novVar);
    }

    @Override // xsna.tdl0
    public final void b(boolean z) {
        this.a.setIgnoreStickerTouches(z);
    }

    @Override // xsna.tdl0
    public final void c(ClipsStickersView.b bVar) {
        this.a.setCallback(bVar);
    }

    @Override // xsna.tdl0
    public final void d(ClipsStickersView.d dVar) {
        this.a.setOnMotionEventListener(dVar);
    }

    @Override // xsna.tdl0
    public final void e(jwf0 jwf0Var) {
        this.a.h.add(jwf0Var);
    }

    @Override // xsna.tdl0
    public final void f(boolean z) {
        this.a.setTouchFalseIfNoSticker(z);
    }

    @Override // xsna.tdl0
    public final void g(boolean z) {
        this.a.setLockAllStickersMovement(z);
    }

    @Override // xsna.tdl0
    public final nov getMovingSticker() {
        return this.a.getMovingSticker();
    }

    @Override // xsna.tdl0
    public final void h(ClipsStickersView.e eVar) {
        this.a.setOnStickerMoveListener(eVar);
    }

    @Override // xsna.tdl0
    public final void i(ClipsStickersView.c cVar) {
        this.a.setOnEmptySpaceClickListener(cVar);
    }

    @Override // xsna.tdl0
    public final void j() {
        this.a.h.clear();
    }

    @Override // xsna.tdl0
    public final void k(boolean z) {
        this.a.setLockStickersAlpha(z);
    }

    @Override // xsna.tdl0
    public final void l(boolean z, boolean z2) {
        ClipsStickersView clipsStickersView = this.a;
        ial0 ial0Var = clipsStickersView.f;
        if (ial0Var != null) {
            clipsStickersView.G = z;
            ial0Var.f(z2);
        }
        clipsStickersView.invalidate();
    }

    @Override // xsna.tdl0
    public final void m(hyd.b bVar) {
        this.a.setStickerListener(bVar);
    }
}
