package xsna;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.dto.common.Image;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.design.view.preview.PreviewImageView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import xsna.ye0;

/* compiled from: LiveViewStub.kt */
/* loaded from: classes3.dex */
public final class znz implements piz {
    public final Context b;

    public znz(Context context) {
        this.b = context;
    }

    @Override // xsna.piz
    public final VideoTextureView A3() {
        return new VideoTextureView(this.b, null, 6, 0);
    }

    @Override // xsna.piz
    public final f2y0 C(boolean z) {
        return new m3y0(this.b);
    }

    @Override // xsna.piz
    public final a7q0 H1(boolean z, boolean z2) {
        return new l7q0(this.b);
    }

    @Override // xsna.piz
    public final uur J() {
        return new bvr(this.b);
    }

    @Override // xsna.piz
    public final rpb K() {
        return new ozb(this.b);
    }

    @Override // xsna.piz
    public final uoc M1() {
        return new crj(this.b);
    }

    @Override // xsna.piz
    public final flz P3() {
        return new y3i0(this.b);
    }

    @Override // xsna.piz
    public final mk0 R1(boolean z) {
        return new ip0(this.b);
    }

    @Override // xsna.piz
    public final k4m T2(boolean z) {
        return new d5m();
    }

    @Override // xsna.piz
    public final vcd e3() {
        return new evm0();
    }

    @Override // xsna.piz
    public final Set<rr6<?>> getBaseViews() {
        return new LinkedHashSet();
    }

    @Override // xsna.piz
    public final ImageView getCloseView() {
        return null;
    }

    @Override // xsna.piz
    public final List<View> getFadeTransitionViews() {
        return new ArrayList();
    }

    @Override // xsna.piz
    public final flz getLiveSeekView() {
        return null;
    }

    @Override // xsna.piz
    public final FrameLayout getMainHolder() {
        return new FrameLayout(this.b);
    }

    @Override // xsna.rr6
    public final oiz getPresenter() {
        return new alz();
    }

    @Override // xsna.piz
    public final PreviewImageView getPreviewImageView() {
        return new PreviewImageView(this.b, null);
    }

    @Override // xsna.piz
    public final wjk0 getSpectatorsViewNew() {
        return new tjk0(this.b);
    }

    @Override // xsna.piz
    public final a7q0 getUpcomingView() {
        return null;
    }

    @Override // xsna.piz
    public final VideoTextureView getVideoTextureView() {
        return new VideoTextureView(this.b, null, 6, 0);
    }

    @Override // xsna.rr6
    public final View getView() {
        return new View(this.b);
    }

    @Override // xsna.rr6
    public final Context getViewContext() {
        return this.b;
    }

    @Override // xsna.piz
    public final Window getWindow() {
        return null;
    }

    @Override // xsna.piz
    public final boolean isVisible() {
        return false;
    }

    @Override // xsna.piz
    public final kkp n1() {
        return new hlp(this.b);
    }

    @Override // xsna.piz
    public final wjk0 v(boolean z) {
        return new tjk0(this.b);
    }

    @Override // xsna.piz
    public final por0 w3() {
        return new sor0();
    }

    @Override // xsna.piz
    public final h520 z1(boolean z) {
        return new l520(this.b);
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
    public final void h() {
    }

    @Override // xsna.piz
    public final void j() {
    }

    @Override // xsna.rr6
    public final void pause() {
    }

    @Override // xsna.piz
    public final void r() {
    }

    @Override // xsna.rr6
    public final void release() {
    }

    @Override // xsna.rr6
    public final void resume() {
    }

    @Override // xsna.piz
    public final void v1() {
    }

    @Override // xsna.piz
    public final void x() {
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
    public final void setAdvertBanner(VideoAdvertisementsRepository.a aVar) {
    }

    @Override // xsna.piz
    public final void setLiveSeekView(flz flzVar) {
    }

    @Override // xsna.piz
    public final void setLoaderColor(int i) {
    }

    @Override // xsna.piz
    public final void setLoaderEnabled(boolean z) {
    }

    @Override // xsna.piz
    public final void setMediaRouteConnectStatus(MediaRouteConnectStatus mediaRouteConnectStatus) {
    }

    @Override // xsna.rr6
    public final /* bridge */ /* synthetic */ void setPresenter(oiz oizVar) {
    }

    @Override // xsna.piz
    public final void setSmoothHideBack(boolean z) {
    }

    @Override // xsna.piz
    public final void setVisibilityFaded(boolean z) {
    }

    @Override // xsna.piz
    public final void setWindow(Window window) {
    }

    @Override // xsna.piz
    public final void setWriteBarVisible(boolean z) {
    }

    @Override // xsna.piz
    public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
    }

    @Override // xsna.piz
    public final void g4(boolean z, boolean z2) {
    }

    @Override // xsna.piz
    public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
    }

    @Override // xsna.piz
    public final void D1(Image image, boolean z, boolean z2) {
    }

    @Override // xsna.piz
    public final void M2(long j, long j2, boolean z) {
    }
}
