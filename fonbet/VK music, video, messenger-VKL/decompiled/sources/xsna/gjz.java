package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.ui.ClipSeekBarController;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.design.view.preview.PreviewImageView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import xsna.nlh0;
import xsna.ye0;
import xsna.yks0;

/* compiled from: LiveFeedItemView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes17.dex */
public final class gjz extends FrameLayout implements mnt0, nlh0.a, gv5, piz {
    public static final Object h = msy.a(LazyThreadSafetyMode.NONE, new nh(16));
    public final gxp0 b;
    public final kxc c;
    public final piz d;
    public cnt0 e;
    public boolean f;
    public final r4k g;

    public gjz(Context context, gxp0 gxp0Var, kxc kxcVar, piz pizVar) {
        super(context);
        this.b = gxp0Var;
        this.c = kxcVar;
        this.d = pizVar;
        this.g = new r4k(this);
        addView(pizVar.getView());
    }

    private final boolean getSeekbarEnabled() {
        rnz C1 = getPresenter().C1();
        return (C1 == null || !C1.c() || C1.a() == 0) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nlh0.a
    public final void A1(SdkVideoFile sdkVideoFile, List<? extends olh0> list) {
        VideoFile A = k15.A(sdkVideoFile);
        List<? extends olh0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(w1t0.a((olh0) it.next()));
        }
        getPresenter().i0(this);
        piz pizVar = this.d;
        yks0.a aVar = pizVar instanceof yks0.a ? (yks0.a) pizVar : null;
        if (aVar != null) {
            aVar.He(arrayList, A);
        }
        bwt0.d(getView(), ((Number) h.getValue()).floatValue(), (r4 & 2) != 0, (r4 & 4) != 0);
    }

    @Override // xsna.piz
    public final VideoTextureView A3() {
        return this.d.A3();
    }

    @Override // xsna.piz
    public final void A4() {
        this.d.A4();
    }

    @Override // xsna.piz
    public final void B0(long j) {
        this.d.B0(j);
    }

    @Override // xsna.piz
    public final f2y0 C(boolean z) {
        return this.d.C(z);
    }

    @Override // xsna.piz
    public final void D1(@Nullable Image image, boolean z, boolean z2) {
        this.d.D1(image, z, z2);
    }

    @Override // xsna.piz
    public final a7q0 H1(boolean z, boolean z2) {
        return this.d.H1(z, z2);
    }

    @Override // xsna.piz
    public final void I() {
        this.d.I();
    }

    @Override // xsna.piz
    public final void I3(VideoRestriction videoRestriction) {
        this.d.I3(videoRestriction);
    }

    @Override // xsna.piz
    public final uur J() {
        return this.d.J();
    }

    @Override // xsna.piz
    public final rpb K() {
        return this.d.K();
    }

    @Override // xsna.piz
    public final uoc M1() {
        return this.d.M1();
    }

    @Override // xsna.piz
    public final void M2(long j, long j2, boolean z) {
        this.d.M2(j, j2, z);
        wjk0 spectatorsViewNew = getSpectatorsViewNew();
        if (spectatorsViewNew != null) {
            spectatorsViewNew.T1(z);
        }
    }

    @Override // xsna.piz
    public final flz P3() {
        View actualView;
        llz llzVar = null;
        if (!getSeekbarEnabled()) {
            return null;
        }
        if (getLiveSeekView() != null) {
            flz liveSeekView = getLiveSeekView();
            if (liveSeekView != null) {
                liveSeekView.release();
            }
            flz liveSeekView2 = getLiveSeekView();
            if (liveSeekView2 != null && (actualView = liveSeekView2.getActualView()) != null) {
                getMainHolder().removeView(actualView);
            }
        }
        flz c = fxc0.B().T().c(this.c, this.g);
        if (c != null) {
            FrameLayout mainHolder = getMainHolder();
            boolean w = getPresenter().w();
            llz llzVar2 = (llz) c;
            flz a = llzVar2.a();
            if (a != null) {
                a.E0();
            } else {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iah0.a(48), 80);
                layoutParams.bottomMargin = w ? iah0.a(8) : iah0.a(52.0f);
                klz klzVar = new klz(llzVar2.getViewContext());
                klzVar.setLayoutParams(layoutParams);
                mainHolder.addView(klzVar);
                if (w) {
                    klzVar.E0();
                }
                llzVar2.b = klzVar;
            }
            llzVar = llzVar2;
        }
        setLiveSeekView(c);
        if (getVideoFocused()) {
            post(new yn2(c, 9));
        }
        return llzVar;
    }

    @Override // xsna.piz
    public final void Q1() {
        this.d.Q1();
    }

    @Override // xsna.piz
    public final void Q2(boolean z) {
        this.d.Q2(z);
    }

    @Override // xsna.piz
    public final mk0 R1(boolean z) {
        return this.d.R1(z);
    }

    @Override // xsna.piz
    public final void T(dvp dvpVar) {
        this.d.T(dvpVar);
    }

    @Override // xsna.piz
    public final k4m T2(boolean z) {
        return this.d.T2(z);
    }

    public final void a(boolean z) {
        ClipSeekBarView view;
        ClipSeekBarView view2;
        kxc kxcVar = this.c;
        if (z) {
            this.d.d0();
            ClipSeekBarController clipSeekBarController = (ClipSeekBarController) kxcVar.invoke();
            if (clipSeekBarController == null || (view = clipSeekBarController.getView()) == null) {
                return;
            }
            d3m.e(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            return;
        }
        if (getSeekbarEnabled()) {
            post(new oh(this, 7));
            return;
        }
        ClipSeekBarController clipSeekBarController2 = (ClipSeekBarController) kxcVar.invoke();
        if (clipSeekBarController2 == null || (view2 = clipSeekBarController2.getView()) == null) {
            return;
        }
        f4m.j(view2);
    }

    @Override // xsna.gv5
    public final boolean a0() {
        piz pizVar = this.d;
        gv5 gv5Var = pizVar instanceof gv5 ? (gv5) pizVar : null;
        if (gv5Var != null) {
            return gv5Var.a0();
        }
        return false;
    }

    @Override // xsna.piz
    public final void d0() {
        this.d.d0();
    }

    @Override // xsna.piz
    public final vcd e3() {
        return this.d.e3();
    }

    @Override // xsna.piz
    public final void g(@NonNull com.vk.libvideo.api.ad.a aVar, @NonNull ye0.a aVar2) {
        this.d.g(aVar, aVar2);
    }

    @Override // xsna.piz
    public final void g4(boolean z, boolean z2) {
        this.d.g4(z, true);
    }

    @Override // xsna.piz
    public Set<rr6<?>> getBaseViews() {
        return this.d.getBaseViews();
    }

    @Override // xsna.piz
    @Nullable
    public ImageView getCloseView() {
        return this.d.getCloseView();
    }

    @Override // xsna.piz
    public List<View> getFadeTransitionViews() {
        return this.d.getFadeTransitionViews();
    }

    public cnt0 getFocusController() {
        return this.e;
    }

    @Override // xsna.piz
    @Nullable
    public flz getLiveSeekView() {
        return this.d.getLiveSeekView();
    }

    @Override // xsna.piz
    public FrameLayout getMainHolder() {
        return this.d.getMainHolder();
    }

    @Override // xsna.rr6
    public oiz getPresenter() {
        return this.d.getPresenter();
    }

    @Override // xsna.piz
    public PreviewImageView getPreviewImageView() {
        return this.d.getPreviewImageView();
    }

    @Override // xsna.piz
    @Nullable
    public wjk0 getSpectatorsViewNew() {
        return this.d.getSpectatorsViewNew();
    }

    public final gxp0 getUiVisibilityBehavior() {
        return this.b;
    }

    @Override // xsna.piz
    @Nullable
    public a7q0 getUpcomingView() {
        return this.d.getUpcomingView();
    }

    @Override // xsna.dnt0
    public VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    @Override // xsna.mnt0
    public com.vk.libvideo.autoplay.a getVideoConfig() {
        return new com.vk.libvideo.autoplay.a(true, null, null, false, false, false, null, null, null, null, null, null, false, null, 524282);
    }

    @Override // xsna.dnt0
    public boolean getVideoFocused() {
        return this.f;
    }

    @Override // xsna.piz
    public VideoTextureView getVideoTextureView() {
        return this.d.getVideoTextureView();
    }

    @Override // xsna.mnt0
    /* renamed from: getVideoView */
    public VideoTextureView mo407getVideoView() {
        return getVideoTextureView();
    }

    @Override // xsna.rr6
    public View getView() {
        return this.d.getView();
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return this.d.getViewContext();
    }

    @Override // xsna.piz
    public Window getWindow() {
        return this.d.getWindow();
    }

    @Override // xsna.piz
    public final void h() {
        this.d.h();
    }

    @Override // xsna.piz
    public final boolean isVisible() {
        return this.d.isVisible();
    }

    @Override // xsna.piz
    public final void j() {
        this.d.j();
    }

    @Override // xsna.piz
    public final void m(@NonNull je0 je0Var, @NonNull com.vk.libvideo.api.ad.a aVar) {
        this.d.m(je0Var, aVar);
    }

    @Override // xsna.piz
    public final void n0(boolean z) {
        this.d.n0(z);
    }

    @Override // xsna.piz
    public final kkp n1() {
        return this.d.n1();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getVideoFocused()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVideoFocused()) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // xsna.rr6
    public final void pause() {
        this.d.pause();
        flz liveSeekView = getLiveSeekView();
        if (liveSeekView != null) {
            liveSeekView.pause();
        }
    }

    @Override // xsna.piz
    public final void r() {
        this.d.r();
    }

    @Override // xsna.rr6
    public final void release() {
        this.d.release();
    }

    @Override // xsna.rr6
    public final void resume() {
        ClipSeekBarView view;
        this.d.resume();
        if (getSeekbarEnabled()) {
            flz liveSeekView = getLiveSeekView();
            if (liveSeekView != null) {
                liveSeekView.resume();
                return;
            }
            return;
        }
        ClipSeekBarController clipSeekBarController = (ClipSeekBarController) this.c.invoke();
        if (clipSeekBarController == null || (view = clipSeekBarController.getView()) == null) {
            return;
        }
        f4m.j(view);
    }

    @Override // xsna.mnt0
    public void setFocusController(cnt0 cnt0Var) {
        this.e = cnt0Var;
    }

    @Override // xsna.piz
    public void setLiveSeekView(flz flzVar) {
        this.d.setLiveSeekView(flzVar);
    }

    @Override // xsna.piz
    public void setLoaderColor(int i) {
        this.d.setLoaderColor(i);
    }

    @Override // xsna.piz
    public void setLoaderEnabled(boolean z) {
        this.d.setLoaderEnabled(z);
    }

    @Override // xsna.piz
    public void setMediaRouteConnectStatus(MediaRouteConnectStatus mediaRouteConnectStatus) {
        this.d.setMediaRouteConnectStatus(mediaRouteConnectStatus);
    }

    @Override // xsna.rr6
    public void setPresenter(oiz oizVar) {
        this.d.setPresenter(oizVar);
    }

    @Override // xsna.piz
    public void setSmoothHideBack(boolean z) {
        this.d.setSmoothHideBack(z);
    }

    @Override // xsna.dnt0
    public void setVideoFocused(boolean z) {
        this.f = z;
        oiz presenter = getPresenter();
        if (presenter != null) {
            presenter.setActive(z);
        }
        if (z) {
            resume();
        } else {
            pause();
        }
    }

    @Override // xsna.piz
    public void setVisibilityFaded(boolean z) {
        this.d.setVisibilityFaded(z);
    }

    @Override // xsna.piz
    public void setWindow(Window window) {
        this.d.setWindow(window);
    }

    @Override // xsna.piz
    public void setWriteBarVisible(boolean z) {
        this.d.setWriteBarVisible(z);
    }

    @Override // xsna.piz
    public final wjk0 v(boolean z) {
        return this.d.v(z);
    }

    @Override // xsna.piz
    public final void v1() {
        this.d.v1();
    }

    @Override // xsna.piz
    public final por0 w3() {
        return this.d.w3();
    }

    @Override // xsna.piz
    public final void x() {
        this.d.x();
    }

    @Override // xsna.piz
    public final h520 z1(boolean z) {
        return this.d.z1(z);
    }

    @Override // xsna.mnt0
    public final void G2(View view) {
    }

    @Override // xsna.nlh0.a
    public final void L2(boolean z) {
    }

    @Override // xsna.piz
    public /* bridge */ /* synthetic */ void setAdvertBanner(VideoAdvertisementsRepository.a aVar) {
    }

    @Override // xsna.mnt0
    public final void w0(View view) {
    }
}
