package xsna;

import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.dto.common.Image;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.design.view.preview.PreviewImageView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import java.util.List;
import java.util.Set;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import xsna.ye0;

/* compiled from: LiveContract.java */
/* loaded from: classes3.dex */
public interface piz extends rr6<oiz> {
    VideoTextureView A3();

    void A4();

    void B0(long j);

    f2y0 C(boolean z);

    void D1(@Nullable Image image, boolean z, boolean z2);

    a7q0 H1(boolean z, boolean z2);

    void I();

    void I3(VideoRestriction videoRestriction);

    uur J();

    rpb K();

    uoc M1();

    void M2(long j, long j2, boolean z);

    flz P3();

    void Q1();

    void Q2(boolean z);

    mk0 R1(boolean z);

    void T(dvp dvpVar);

    k4m T2(boolean z);

    void d0();

    vcd e3();

    void g(@NonNull com.vk.libvideo.api.ad.a aVar, @NonNull ye0.a aVar2);

    void g4(boolean z, boolean z2);

    Set<rr6<?>> getBaseViews();

    @Nullable
    ImageView getCloseView();

    List<View> getFadeTransitionViews();

    @Nullable
    flz getLiveSeekView();

    FrameLayout getMainHolder();

    PreviewImageView getPreviewImageView();

    @Nullable
    wjk0 getSpectatorsViewNew();

    @Nullable
    a7q0 getUpcomingView();

    VideoTextureView getVideoTextureView();

    Window getWindow();

    void h();

    boolean isVisible();

    void j();

    void m(@NonNull je0 je0Var, @NonNull com.vk.libvideo.api.ad.a aVar);

    void n0(boolean z);

    kkp n1();

    void r();

    void setLiveSeekView(flz flzVar);

    void setLoaderColor(int i);

    void setLoaderEnabled(boolean z);

    void setMediaRouteConnectStatus(MediaRouteConnectStatus mediaRouteConnectStatus);

    void setSmoothHideBack(boolean z);

    void setVisibilityFaded(boolean z);

    void setWindow(Window window);

    void setWriteBarVisible(boolean z);

    wjk0 v(boolean z);

    void v1();

    por0 w3();

    void x();

    h520 z1(boolean z);

    default void setAdvertBanner(VideoAdvertisementsRepository.a aVar) {
    }
}
