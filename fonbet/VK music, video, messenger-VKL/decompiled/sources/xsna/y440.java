package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.View;
import com.vk.dto.im.MsgType;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.g5m0;
import xsna.h7u0;
import xsna.n930;
import xsna.w1m0;
import xsna.wo80;

/* compiled from: MultiCameraEditorView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class y440 extends u86 implements g440 {
    public static final /* synthetic */ int T = 0;
    public f440 S;

    @Override // xsna.p5p
    public final void A() {
        u76 presenter = getPresenter();
        if (presenter != null) {
            presenter.x2(true);
        }
    }

    @Override // xsna.p5p
    public final void A2() {
        u76 presenter = getPresenter();
        if (presenter != null) {
            presenter.A2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [xsna.d8m0] */
    @Override // xsna.p5p
    public final void B(int i, final int i2, final Intent intent) {
        hpb0 hpb0Var;
        getRequirePresenter().onActivityResult(i, i2, intent);
        final e8m0 photoStickerDelegate = getPhotoStickerDelegate();
        u76 u76Var = photoStickerDelegate.b;
        if (i == 1993) {
            if (u76Var.O2() != null) {
                photoStickerDelegate.b(i2, intent);
            } else if (u76Var instanceof f440) {
                ((f440) u76Var).w6(new gzs() { // from class: xsna.d8m0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        int i3 = i2;
                        Intent intent2 = intent;
                        e8m0 e8m0Var = e8m0.this;
                        e8m0Var.b(i3, intent2);
                        ((f440) e8m0Var.b).w6(null);
                        return s3q0.a;
                    }
                });
            }
        }
        WeakReference<hpb0> weakReference = getPollStickerDelegate().e;
        if (weakReference == null || (hpb0Var = weakReference.get()) == null) {
            return;
        }
        hpb0Var.r(i, i2, intent);
    }

    @Override // xsna.p5p
    public final void E(StoryMusicInfo storyMusicInfo) {
        kh6 musicDelegate = getMusicDelegate();
        if (musicDelegate != null) {
            musicDelegate.d(storyMusicInfo, MusicStickerStyle.Album, false);
        }
    }

    @Override // xsna.v76
    public final void K() {
        getStickersDrawingView().p();
    }

    @Override // xsna.v76
    public final void S3(boolean z, bb bbVar, cb cbVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z) {
            i = R.string.picker_editor_stories_exit_title;
            i2 = R.string.picker_editor_stories_exit_confirm;
            i3 = R.string.picker_stories_positive;
            i4 = R.string.picker_stories_negative;
        } else {
            i = R.string.confirm;
            i2 = R.string.picker_editor_exit_confirm;
            i3 = R.string.picker_yes;
            i4 = R.string.picker_no;
        }
        int i5 = h7u0.p;
        h7u0.a c = h7u0.b.c(getRequireContext());
        c.g0(i);
        c.U(i2);
        c.c0(i3, new oyb0(3, bbVar));
        c.W(i4, new x440());
        c.a0(new j9a(cbVar, 1));
        c.m();
    }

    @Override // xsna.g440
    public final void S6(izs<? super Integer, s3q0> izsVar) {
        u76 presenter = getPresenter();
        if (presenter != null) {
            n930.i Y6 = presenter.Y6();
            new g5m0.a(getRequireContext(), epx.f(Y6, n930.k.d) ? 1 : epx.f(Y6, n930.j.d) ? 12 : (!epx.f(Y6, n930.l.d) && epx.f(Y6, n930.m.d)) ? 48 : 24, new h57(17, presenter, izsVar), new ut30(presenter, 1)).I0(null);
        }
    }

    @Override // xsna.v76
    public final void X0(w1m0.a aVar) {
        tam0 O2;
        getDrawToolControlsDelegate().X0(aVar);
        StickersDrawingViewGroup stickersDrawingView = getStickersDrawingView();
        List<vlo> list = aVar.d;
        stickersDrawingView.setDrawingState(list.get(aVar.c));
        u76 presenter = getPresenter();
        if (presenter == null || (O2 = presenter.O2()) == null) {
            return;
        }
        O2.j = list.get(aVar.c);
    }

    @Override // xsna.p5p
    public final void b0() {
        u76 presenter = getPresenter();
        if (presenter != null) {
            presenter.b0();
        }
    }

    @Override // xsna.p5p
    public final void c() {
        f440 f440Var = this.S;
        if (f440Var != null) {
            f440Var.C2(!f440Var.g4() || f440Var.A0().e());
        }
    }

    @Override // xsna.p5p
    public final boolean d() {
        u76 presenter = getPresenter();
        if (presenter != null) {
            return presenter.a0();
        }
        return false;
    }

    @Override // xsna.g440
    public final void dk(kpd kpdVar) {
        Boolean m3;
        Context requireContext = getRequireContext();
        u76 presenter = getPresenter();
        new wo80.a(requireContext, kpdVar, (presenter == null || (m3 = presenter.m3()) == null) ? false : m3.booleanValue()).I0(null);
    }

    @Override // xsna.p5p
    public final void f() {
        u76 presenter = getPresenter();
        if (presenter != null) {
            presenter.onDestroy();
        }
    }

    @Override // xsna.u86, xsna.v76, xsna.t76
    public Context getRequireContext() {
        return getContext();
    }

    @Override // xsna.u86
    public Integer getStoriesCount() {
        u76 presenter = getPresenter();
        if (presenter != null) {
            return Integer.valueOf(presenter.G2());
        }
        return null;
    }

    @Override // xsna.p5p
    public final void h(int i, String[] strArr, int[] iArr) {
        c4m0 geoStickerDelegate = getGeoStickerDelegate();
        if (geoStickerDelegate != null) {
            geoStickerDelegate.h.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // xsna.p5p
    public final void j(List<? extends nov> list) {
        u76 presenter = getPresenter();
        if (presenter != null) {
            presenter.Z2(list);
        }
    }

    @Override // xsna.p5p
    public final void l() {
        u76 presenter = getPresenter();
        if (presenter != null) {
            presenter.onPause();
        }
    }

    @Override // xsna.p5p
    public final void n() {
        f440 f440Var = this.S;
        if (f440Var != null) {
            f440Var.U5();
        }
    }

    @Override // xsna.p5p
    public final void o() {
        u76 presenter = getPresenter();
        if (presenter != null) {
            presenter.onClose();
        }
    }

    @Override // xsna.p5p
    public final void p(w1m0 w1m0Var, boolean z) {
        u76 presenter = getPresenter();
        if (presenter != null) {
            presenter.C5(w1m0Var, z);
        }
    }

    @Override // xsna.v76
    public final void p9(tam0 tam0Var, c230 c230Var) {
        getDrawToolControlsDelegate().e(tam0Var, c230Var);
    }

    @Override // xsna.g440
    public final void pauseVideo() {
        getStickersDrawingView().o();
    }

    @Override // xsna.v76
    public final void pk(w76 w76Var) {
        h7u0.a aVar = new h7u0.a(getRequireContext());
        aVar.g0(R.string.confirm);
        aVar.U(R.string.story_discard_previous_background_confirm);
        aVar.c0(R.string.picker_yes, new rg1(w76Var, 2));
        aVar.W(R.string.picker_no, new sg1(2));
        aVar.m();
    }

    @Override // xsna.p5p
    public final void r(StoryCameraTarget storyCameraTarget) {
        u76 presenter = getPresenter();
        if (presenter != null) {
            presenter.W4(true, false);
            presenter.T(storyCameraTarget);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(50L);
        b96 animationsDelegate = getAnimationsDelegate();
        animationsDelegate.getClass();
        animatorSet.addListener(new h96(animationsDelegate));
        b96 animationsDelegate2 = getAnimationsDelegate();
        animationsDelegate2.getClass();
        AnimatorSet animatorSet2 = new AnimatorSet();
        y440 y440Var = animationsDelegate2.a;
        List I = rl3.I(new View[]{y440Var.getCloseButtonBackground(), y440Var.getTopButtonsPanel(), y440Var.getBottomPanel(), y440Var.getEndButtonsPanel()});
        ArrayList arrayList = new ArrayList(c5g.u(I, 10));
        Iterator it = I.iterator();
        while (it.hasNext()) {
            ObjectAnimator duration = ObjectAnimator.ofFloat((View) it.next(), (Property<View, Float>) View.ALPHA, 1.0f).setDuration(195L);
            duration.setInterpolator(qq2.e);
            arrayList.add(duration);
        }
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new g96(animationsDelegate2));
        animatorSet2.start();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.u86, xsna.v76
    public final void release() {
        jpr0 verticalizationDelegate = getVerticalizationDelegate();
        if (verticalizationDelegate.g) {
            ((zdh0) verticalizationDelegate.f.getValue()).e(verticalizationDelegate.n);
        }
        getStickersDrawingView().q();
    }

    @Override // xsna.v76
    public final void sc(nov novVar, yzs<? super Integer, ? super Integer, ? super nov, s3q0> yzsVar) {
        getStickersDrawingView().g(novVar, yzsVar);
    }

    @Override // xsna.u86, xsna.p5p
    public void setMsgType(MsgType msgType) {
        u76 presenter = getPresenter();
        if (presenter != null) {
            presenter.setMsgType(msgType);
        }
    }

    @Override // xsna.u86, xsna.v76
    public void setNeedRequestAudioFocus(boolean z) {
        getStickersDrawingView().setNeedRequestAudioFocus(z);
    }

    @Override // xsna.g440
    public void setStoryPickerData(hg6<zif0> hg6Var) {
        f640 f640Var = new f640(hg6Var, new bjk(this, 21), new el30(this, 2), new ecm(this, 28));
        androidx.recyclerview.widget.r rVar = new androidx.recyclerview.widget.r(new e440(f640Var, this.S));
        getBottomControlPanel().setIsMultiStories(true);
        getBottomControlPanel().j(f640Var, rVar);
    }

    @Override // xsna.p5p
    public final void t(Bitmap bitmap) {
        f440 f440Var = this.S;
        if (f440Var != null) {
            f440Var.setImageBitmap(bitmap);
        }
    }

    @Override // xsna.p5p
    public final void u() {
        u76 presenter = getPresenter();
        if (presenter != null) {
            presenter.onResume();
        }
    }

    @Override // xsna.p5p
    public final void v(boolean z) {
        ial0 guidesDrawer = getStickersDrawingView().getGuidesDrawer();
        if (guidesDrawer instanceof pim0) {
            if (!z) {
                pim0 pim0Var = (pim0) guidesDrawer;
                pim0Var.L = null;
                if (pim0Var.B) {
                    pim0Var.D();
                    return;
                }
                return;
            }
            Context context = getContext();
            String string = context.getString(R.string.story_template_meta_text_default, context.getResources().getQuantityString(R.plurals.stories_count, 12100, xpm0.b(12100)));
            ArrayList arrayList = new ArrayList(2);
            for (int i = 0; i < 2; i++) {
                arrayList.add("");
            }
            pim0 pim0Var2 = (pim0) guidesDrawer;
            pim0Var2.L = new x0n0(string, null, null, null, arrayList, false, 1, null, false, null);
            if (pim0Var2.B) {
                pim0Var2.D();
            }
        }
    }

    @Override // xsna.v76
    public final void w0() {
        getStickersDrawingView().j(new x620(24));
    }

    @Override // xsna.p5p
    public final void z0() {
        u76 presenter = getPresenter();
        if (presenter != null) {
            presenter.z0();
        }
    }

    @Override // xsna.u86, xsna.dc6
    public u76 getPresenter() {
        return super.getPresenter();
    }

    @Override // xsna.u86, xsna.dc6
    public void setPresenter(u76 u76Var) {
        super.setPresenter(u76Var);
        this.S = (f440) u76Var;
    }

    @Override // xsna.p5p
    public final View b() {
        return this;
    }
}
