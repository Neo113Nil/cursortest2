package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.movika.api.InteractiveData;
import xsna.rcx;

/* compiled from: StubInteractiveVideoView.kt */
/* loaded from: classes3.dex */
public final class csm0 implements rcx {
    public final Context b;
    public final com.vk.libvideo.autoplay.a c = com.vk.libvideo.autoplay.a.t;
    public boolean d;

    public csm0(Context context) {
        this.b = context;
    }

    @Override // xsna.bcx
    public final boolean a(acx acxVar) {
        return false;
    }

    @Override // xsna.rcx
    public final rcx.c getState() {
        return new rcx.c(0);
    }

    @Override // xsna.dnt0
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    @Override // xsna.mnt0
    public final com.vk.libvideo.autoplay.a getVideoConfig() {
        return this.c;
    }

    @Override // xsna.dnt0
    public final boolean getVideoFocused() {
        return this.d;
    }

    @Override // xsna.mnt0
    /* renamed from: getVideoView */
    public final VideoTextureView mo407getVideoView() {
        return null;
    }

    @Override // xsna.rcx
    public final View getView() {
        return new View(this.b);
    }

    @Override // xsna.rcx
    public final View o0() {
        return null;
    }

    @Override // xsna.rcx
    public final boolean o4() {
        return false;
    }

    @Override // xsna.rcx
    @ozl
    public final tn10 q3() {
        return null;
    }

    @Override // xsna.dnt0
    public final void setVideoFocused(boolean z) {
        this.d = z;
    }

    @Override // xsna.rcx
    public final void b() {
    }

    @Override // xsna.rcx
    public final void destroy() {
    }

    @Override // xsna.rcx
    public final void s2() {
    }

    @Override // xsna.rcx
    public final void E2(boolean z) {
    }

    @Override // xsna.mnt0
    public final void G2(View view) {
    }

    @Override // xsna.rcx
    public final void G3(com.vk.video.ui.discovery.minimizable.player.a aVar) {
    }

    @Override // xsna.rcx
    public final void L1(rcx.e eVar) {
    }

    @Override // xsna.rcx
    public final void X0(com.vk.video.ui.discovery.minimizable.player.a aVar) {
    }

    @Override // xsna.rcx
    public final void b3(boolean z) {
    }

    @Override // xsna.rcx
    public final void r2(rcx.e eVar) {
    }

    @Override // xsna.mnt0
    public final void setFocusController(cnt0 cnt0Var) {
    }

    @Override // xsna.rcx
    public final void t1(VideoFile videoFile) {
    }

    @Override // xsna.mnt0
    public final void w0(View view) {
    }

    @Override // xsna.rcx
    public final void y0(InteractiveData interactiveData) {
    }

    @Override // xsna.rcx
    public final void P(boolean z, boolean z2) {
    }

    @Override // xsna.rcx
    public final void j2(boolean z, boolean z2) {
    }
}
