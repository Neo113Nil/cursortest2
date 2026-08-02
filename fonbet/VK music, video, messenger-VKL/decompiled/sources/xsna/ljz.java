package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.preview.PreviewImageView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import xsna.ye0;

/* compiled from: LiveInlineView.java */
/* loaded from: classes3.dex */
public final class ljz extends FrameLayout implements piz {
    public lnz b;
    public yrb c;
    public oiz d;
    public HashSet e;
    public WeakReference<wjk0> f;
    public t0x g;
    public boolean h;

    @Override // xsna.piz
    public final VideoTextureView A3() {
        return null;
    }

    @Override // xsna.piz
    public final f2y0 C(boolean z) {
        return null;
    }

    @Override // xsna.piz
    public final a7q0 H1(boolean z, boolean z2) {
        if (!z2) {
            return null;
        }
        this.g = new t0x(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        this.g.setLayoutParams(layoutParams);
        if (z) {
            this.g.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.g.animate().alpha(1.0f).setDuration(300L).start();
        }
        addView(this.g, 0);
        this.e.add(this.g);
        return this.g;
    }

    @Override // xsna.piz
    public final uur J() {
        this.b = new lnz(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(150.0f), -1);
        layoutParams.gravity = 85;
        layoutParams.bottomMargin = iah0.a(8.0f);
        layoutParams.rightMargin = iah0.a(-48.0f);
        this.b.setLayoutParams(layoutParams);
        addView(this.b, 0);
        this.e.add(this.b);
        return this.b;
    }

    @Override // xsna.piz
    public final rpb K() {
        if (!this.h) {
            return null;
        }
        this.c = new yrb(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        this.c.setLayoutParams(layoutParams);
        addView(this.c, 0);
        this.e.add(this.c);
        return this.c;
    }

    @Override // xsna.piz
    public final uoc M1() {
        return null;
    }

    @Override // xsna.piz
    @Nullable
    public final flz P3() {
        return null;
    }

    @Override // xsna.piz
    public final mk0 R1(boolean z) {
        return null;
    }

    @Override // xsna.piz
    public final k4m T2(boolean z) {
        return null;
    }

    @Override // xsna.piz
    public final vcd e3() {
        return null;
    }

    @Override // xsna.piz
    public final void g4(boolean z, boolean z2) {
        lnz lnzVar = this.b;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (lnzVar != null) {
            lnzVar.animate().alpha(z ? 1.0f : 0.0f).setInterpolator(new LinearInterpolator()).setDuration(250L).start();
        }
        yrb yrbVar = this.c;
        if (yrbVar != null) {
            ViewPropertyAnimator animate = yrbVar.animate();
            if (z) {
                f = 1.0f;
            }
            animate.alpha(f).setInterpolator(new LinearInterpolator()).setDuration(250L).start();
        }
    }

    @Override // xsna.piz
    public Set<rr6<?>> getBaseViews() {
        return Collections.EMPTY_SET;
    }

    @Override // xsna.piz
    @Nullable
    public ImageView getCloseView() {
        return null;
    }

    @Override // xsna.piz
    public List<View> getFadeTransitionViews() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            Object obj = (rr6) it.next();
            if (obj instanceof View) {
                arrayList.add((View) obj);
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return super.getForeground();
    }

    @Override // xsna.piz
    @Nullable
    public flz getLiveSeekView() {
        return null;
    }

    public VideoOverlayView getOverlayView() {
        return null;
    }

    @Override // xsna.piz
    public PreviewImageView getPreviewImageView() {
        return null;
    }

    @Override // xsna.piz
    @Nullable
    public wjk0 getSpectatorsViewNew() {
        return null;
    }

    @Override // xsna.piz
    @Nullable
    public a7q0 getUpcomingView() {
        return this.g;
    }

    @Override // xsna.piz
    public VideoTextureView getVideoTextureView() {
        return null;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.piz
    public Window getWindow() {
        return null;
    }

    @Override // xsna.piz
    public final boolean isVisible() {
        return false;
    }

    @Override // xsna.piz
    public final kkp n1() {
        return null;
    }

    @Override // xsna.rr6
    public final void pause() {
        oiz oizVar = this.d;
        if (oizVar != null) {
            oizVar.pause();
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((rr6) it.next()).pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        HashSet hashSet = this.e;
        oiz oizVar = this.d;
        if (oizVar != null) {
            oizVar.release();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((rr6) it.next()).release();
        }
        hashSet.clear();
        this.f = null;
    }

    @Override // xsna.rr6
    public final void resume() {
        oiz oizVar = this.d;
        if (oizVar != null) {
            oizVar.resume();
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((rr6) it.next()).resume();
        }
    }

    public void setDisplayComments(Boolean bool) {
        this.h = bool.booleanValue();
    }

    public void setExternalSpectatorsView(wjk0 wjk0Var) {
        this.f = new WeakReference<>(wjk0Var);
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        super.setForeground(drawable);
    }

    @Override // xsna.piz
    public void setVisibilityFaded(boolean z) {
        g4(z, true);
    }

    @Override // xsna.piz
    public final wjk0 v(boolean z) {
        return this.f.get();
    }

    @Override // xsna.piz
    public final por0 w3() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.piz
    public final void x() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            rr6 rr6Var = (rr6) it.next();
            rr6Var.release();
            View view = (View) rr6Var;
            ((ViewGroup) view.getParent()).removeView(view);
        }
        hashSet.clear();
    }

    @Override // xsna.piz
    public final h520 z1(boolean z) {
        return null;
    }

    @Override // xsna.rr6
    public oiz getPresenter() {
        return this.d;
    }

    @Override // xsna.rr6
    public void setPresenter(oiz oizVar) {
        this.d = oizVar;
    }

    @Override // xsna.piz
    public final void A4() {
    }

    @Override // xsna.piz
    public final void I() {
    }

    @Override // xsna.piz
    public final void Q1() {
    }

    @Override // xsna.piz
    public final void d0() {
    }

    @Override // xsna.piz
    public FrameLayout getMainHolder() {
        return this;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.piz
    public final void h() {
    }

    @Override // xsna.piz
    public final void j() {
    }

    @Override // xsna.piz
    public final void r() {
    }

    @Override // xsna.piz
    public final void v1() {
    }

    @Override // xsna.piz
    public final void B0(long j) {
    }

    @Override // xsna.piz
    public final void I3(VideoRestriction videoRestriction) {
    }

    @Override // xsna.piz
    public final void Q2(boolean z) {
    }

    @Override // xsna.piz
    public final void T(dvp dvpVar) {
    }

    @Override // xsna.piz
    public final void n0(boolean z) {
    }

    @Override // xsna.piz
    public /* bridge */ /* synthetic */ void setAdvertBanner(VideoAdvertisementsRepository.a aVar) {
    }

    @Override // xsna.piz
    public void setLiveSeekView(flz flzVar) {
    }

    @Override // xsna.piz
    public void setLoaderColor(int i) {
    }

    @Override // xsna.piz
    public void setLoaderEnabled(boolean z) {
    }

    @Override // xsna.piz
    public void setMediaRouteConnectStatus(MediaRouteConnectStatus mediaRouteConnectStatus) {
    }

    @Override // xsna.piz
    public void setSmoothHideBack(boolean z) {
    }

    @Override // xsna.piz
    public void setWindow(Window window) {
    }

    @Override // xsna.piz
    public void setWriteBarVisible(boolean z) {
    }

    @Override // xsna.piz
    public final void g(@NonNull com.vk.libvideo.api.ad.a aVar, @NonNull ye0.a aVar2) {
    }

    @Override // xsna.piz
    public final void m(@NonNull je0 je0Var, @NonNull com.vk.libvideo.api.ad.a aVar) {
    }

    @Override // xsna.piz
    public final void D1(@Nullable Image image, boolean z, boolean z2) {
    }

    @Override // xsna.piz
    public final void M2(long j, long j2, boolean z) {
    }
}
