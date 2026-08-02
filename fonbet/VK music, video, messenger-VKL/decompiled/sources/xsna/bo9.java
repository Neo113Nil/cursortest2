package xsna;

import android.os.Build;
import android.view.View;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicCameraData;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.media.ok.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import ru.ok.gl.util.ThreadHelper;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.recognition.GalleryPanelSettings;
import xsna.bm9;
import xsna.kk9;

/* compiled from: CameraUIView.kt */
/* loaded from: classes17.dex */
public final class bo9 implements com.vk.media.ok.a {
    public boolean a;
    public final /* synthetic */ CameraUIView b;

    public bo9(CameraUIView cameraUIView) {
        this.b = cameraUIView;
    }

    @Override // com.vk.media.ok.a
    public final void A() {
        ThreadHelper.queueOnMain(new sc2(this.b, 2));
        this.a = true;
    }

    @Override // com.vk.media.ok.a
    public final void B(boolean z) {
        bm9 presenter = this.b.getPresenter();
        if (presenter != null) {
            presenter.i3(z);
        }
    }

    @Override // com.vk.media.ok.a
    public final void C() {
        bm9 presenter = this.b.getPresenter();
        if (presenter != null) {
            presenter.A4();
        }
    }

    @Override // com.vk.media.ok.a
    public final void b(boolean z) {
        bm9 presenter = this.b.getPresenter();
        if (presenter != null) {
            presenter.b(z);
        }
    }

    @Override // com.vk.media.ok.a
    public final void clearSavedStorage() {
        bm9 presenter = this.b.getPresenter();
        if (presenter != null) {
            presenter.clearSavedStorage();
        }
    }

    @Override // com.vk.media.ok.a
    public final void e(ArrayList<Long> arrayList) {
        bm9 presenter = this.b.getPresenter();
        if (presenter != null) {
            presenter.e(arrayList);
        }
    }

    @Override // com.vk.media.ok.a
    public final void f(b.C1263b c1263b) {
        zd9 camera1View = this.b.getCamera1View();
        if (camera1View != null) {
            camera1View.setDuetsTouchListener(c1263b);
        }
    }

    @Override // com.vk.media.ok.a
    public final void g(boolean z) {
        an9 state;
        bm9 presenter = this.b.getPresenter();
        if (presenter == null || (state = presenter.getState()) == null) {
            return;
        }
        state.P = !z;
    }

    @Override // com.vk.media.ok.a
    public final boolean h() {
        an9 state;
        bm9 presenter = this.b.getPresenter();
        return (presenter == null || (state = presenter.getState()) == null || !state.j) ? false : true;
    }

    @Override // com.vk.media.ok.a
    public final void i(boolean z) {
        an9 state;
        CameraUIView cameraUIView = this.b;
        bm9 presenter = cameraUIView.getPresenter();
        if (presenter != null && (state = presenter.getState()) != null) {
            state.w = z;
        }
        if (cameraUIView.g1) {
            return;
        }
        cameraUIView.B.d();
    }

    @Override // com.vk.media.ok.a
    public final void j(boolean z) {
        bm9 presenter;
        an9 state;
        bm9 presenter2;
        bm9 presenter3;
        an9 state2;
        CameraUIView cameraUIView = this.b;
        if ((!z && ((presenter3 = cameraUIView.getPresenter()) == null || (state2 = presenter3.getState()) == null || state2.e)) || (presenter = cameraUIView.getPresenter()) == null || (state = presenter.getState()) == null || state.d || (presenter2 = cameraUIView.getPresenter()) == null) {
            return;
        }
        presenter2.r3(new bm9.a(z));
    }

    @Override // com.vk.media.ok.a
    public final int k(int i) {
        bm9 presenter = this.b.getPresenter();
        if (presenter != null) {
            return presenter.G3(i);
        }
        return 0;
    }

    @Override // com.vk.media.ok.a
    public final void l() {
        bm9 presenter = this.b.getPresenter();
        if (presenter != null) {
            presenter.k3(true);
        }
    }

    @Override // com.vk.media.ok.a
    public final void m() {
        if (this.a) {
            ThreadHelper.queueOnMain(new vq3(this.b, 3));
        }
        this.a = false;
    }

    @Override // com.vk.media.ok.a
    public final void n(boolean z) {
        an9 state;
        CameraUIView cameraUIView = this.b;
        bm9 presenter = cameraUIView.getPresenter();
        if (presenter != null) {
            presenter.getState();
        }
        bm9 presenter2 = cameraUIView.getPresenter();
        if (presenter2 == null || (state = presenter2.getState()) == null) {
            return;
        }
        state.O = !z;
    }

    @Override // com.vk.media.ok.a
    public final void o(boolean z, GalleryPanelSettings galleryPanelSettings) {
        View clipsGalleryListContainer;
        an9 state;
        an9 state2;
        CameraUIView cameraUIView = this.b;
        bm9 presenter = cameraUIView.getPresenter();
        if (presenter == null || (state2 = presenter.getState()) == null || state2.x != z) {
            bm9 presenter2 = cameraUIView.getPresenter();
            if (presenter2 != null && (state = presenter2.getState()) != null) {
                state.x = z;
            }
            if (z && galleryPanelSettings != null) {
                GalleryPanelSettings.Mode mode = galleryPanelSettings.mode;
                boolean z2 = mode == GalleryPanelSettings.Mode.DefaultImages || mode == GalleryPanelSettings.Mode.GalleryAndDefaultImages;
                boolean z3 = mode == GalleryPanelSettings.Mode.GalleryImages || mode == GalleryPanelSettings.Mode.GalleryAndDefaultImages;
                String[] strArr = galleryPanelSettings.defaultFiles;
                if (strArr == null || !z2) {
                    strArr = null;
                }
                MasksWrap masksWrap = cameraUIView.b0;
                if (masksWrap != null) {
                    masksWrap.F(z3, strArr, z2 ? Integer.valueOf(galleryPanelSettings.defaultSelected) : null);
                }
            }
            if (cameraUIView.g1) {
                return;
            }
            gm9 gm9Var = cameraUIView.B;
            MasksWrap masksWrap2 = gm9Var.g;
            if (masksWrap2 != null && masksWrap2.getSelectedMask() != null) {
                Mask selectedMask = masksWrap2.getSelectedMask();
                if (selectedMask == null || selectedMask.d != (-EffectRegistry.EffectId.UGC_SKY_BACKGROUND.id)) {
                    View view = masksWrap2.L;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    o9e o9eVar = masksWrap2.J;
                    if (o9eVar != null) {
                        o9eVar.a.setHorizontalFadingEdgeEnabled(false);
                    }
                } else {
                    View view2 = masksWrap2.L;
                    if (view2 != null) {
                        f4m.j(view2);
                    }
                    o9e o9eVar2 = masksWrap2.J;
                    if (o9eVar2 != null) {
                        o9eVar2.a.setHorizontalFadingEdgeEnabled(true);
                    }
                }
            }
            MasksWrap masksWrap3 = gm9Var.g;
            if (masksWrap3 == null || (clipsGalleryListContainer = masksWrap3.getClipsGalleryListContainer()) == null) {
                return;
            }
            gm9Var.f.c(clipsGalleryListContainer, gm9Var.F(gm9Var.b, z));
        }
    }

    @Override // com.vk.media.ok.a
    public final void onChangeAudioPitch(float f) {
        zd9 camera1View = this.b.getCamera1View();
        if (camera1View != null) {
            camera1View.setPitch(f);
        }
    }

    @Override // com.vk.media.ok.a
    public final void onChangeMicMute(boolean z) {
        zd9 camera1View = this.b.getCamera1View();
        if (camera1View != null) {
            camera1View.setEffectSilence(z);
        }
    }

    @Override // com.vk.media.ok.a
    public final void onChangeReadyToStartRecording(boolean z) {
        an9 state;
        StoryCameraMode I3;
        bm9 presenter;
        CameraUIView cameraUIView = this.b;
        cameraUIView.setShutterEnabled(z);
        bm9 presenter2 = cameraUIView.getPresenter();
        if (presenter2 == null || (state = presenter2.getState()) == null) {
            return;
        }
        state.T = z;
        bm9 presenter3 = cameraUIView.getPresenter();
        if (presenter3 == null || (I3 = presenter3.I3(state.H)) == null) {
            return;
        }
        if (!I3.i() || (presenter = cameraUIView.getPresenter()) == null) {
            return;
        }
        presenter.d4(cameraUIView.getGesturedControl() && z);
    }

    @Override // com.vk.media.ok.a
    public final void p(boolean z, boolean z2) {
        bm9 presenter = this.b.getPresenter();
        if (presenter != null) {
            presenter.P3(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.vk.media.ok.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        boolean z;
        bm9 presenter;
        an9 state;
        StoryCameraMode I3;
        CameraUIView cameraUIView = this.b;
        bm9 presenter2 = cameraUIView.getPresenter();
        if (presenter2 != null) {
            presenter2.k3(true);
        }
        bm9 presenter3 = cameraUIView.getPresenter();
        if (presenter3 != null) {
            presenter3.W3();
        }
        bm9 presenter4 = cameraUIView.getPresenter();
        if (presenter4 != null && (state = presenter4.getState()) != null) {
            bm9 presenter5 = cameraUIView.getPresenter();
            Boolean valueOf = (presenter5 == null || (I3 = presenter5.I3(state.H)) == null) ? null : Boolean.valueOf(I3.i());
            if (valueOf != null) {
                z = valueOf.booleanValue();
                presenter = cameraUIView.getPresenter();
                if (presenter == null) {
                    ClipsControlsView clipsControls = cameraUIView.getClipsControls();
                    presenter.t3(clipsControls != null && clipsControls.getGesturedControl() && z);
                    return;
                }
                return;
            }
        }
        z = false;
        presenter = cameraUIView.getPresenter();
        if (presenter == null) {
        }
    }

    @Override // com.vk.media.ok.a
    public final void r(final float f) {
        if (this.a) {
            final CameraUIView cameraUIView = this.b;
            ThreadHelper.queueOnMain(new Runnable() { // from class: xsna.ao9
                @Override // java.lang.Runnable
                public final void run() {
                    MasksWrap masksWrap = CameraUIView.this.b0;
                    if (masksWrap != null) {
                        masksWrap.setLoadingResourcesProgress(f);
                    }
                }
            });
        }
    }

    @Override // com.vk.media.ok.a
    public final void setMusicById(String str) {
        bm9 presenter = this.b.getPresenter();
        if (presenter != null) {
            presenter.m3(new MusicCameraData(str, false));
        }
    }

    @Override // com.vk.media.ok.a
    public final void stopRecording() {
        an9 state;
        bm9 presenter;
        CameraUIView cameraUIView = this.b;
        bm9 presenter2 = cameraUIView.getPresenter();
        if (presenter2 == null || (state = presenter2.getState()) == null || !state.e || (presenter = cameraUIView.getPresenter()) == null) {
            return;
        }
        presenter.r3(new bm9.a(false));
    }

    @Override // com.vk.media.ok.a
    public final void submitTaskOnWorkerThread(Runnable runnable) {
        io.reactivex.rxjava3.internal.operators.completable.o oVar = new io.reactivex.rxjava3.internal.operators.completable.o(runnable);
        asu0.a.getClass();
        oVar.q(asu0.i()).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe();
    }

    @Override // com.vk.media.ok.a
    public final void t() {
        cvk.u(R.string.masks_mask_error, false);
        CameraUIView cameraUIView = this.b;
        MasksWrap masksWrap = cameraUIView.b0;
        if (masksWrap != null) {
            masksWrap.q(false);
        }
        MasksWrap masksWrap2 = cameraUIView.b0;
        if (masksWrap2 != null) {
            masksWrap2.setSelectedMask(null);
        }
    }

    @Override // com.vk.media.ok.a
    public final void u(boolean z) {
        MasksWrap masksWrap = this.b.b0;
        if (masksWrap != null) {
            masksWrap.J(z);
        }
    }

    @Override // com.vk.media.ok.a
    public final void v(boolean z) {
        boolean z2;
        jhu0 jhu0Var;
        sj9 e;
        zd9 camera1View = this.b.getCamera1View();
        if (camera1View == null || camera1View.A == (!z) || (jhu0Var = camera1View.m) == null || (e = ij9.a.e()) == null) {
            return;
        }
        kk9.b bVar = kk9.F;
        tj9 tj9Var = (tj9) e;
        if (tj9Var.l()) {
            bpn0 bpn0Var = t5m.a;
            "volantis".equalsIgnoreCase(Build.PRODUCT);
            tj9Var.q(z2);
        }
        kk9.c.a(jhu0Var);
        camera1View.A = z2;
    }

    @Override // com.vk.media.ok.a
    public final void w() {
        MasksWrap masksWrap = this.b.b0;
        if (masksWrap == null || masksWrap.getSelectedMask() == null || !masksWrap.getSelectedMask().u) {
            return;
        }
        Mask selectedMask = masksWrap.getSelectedMask();
        masksWrap.B(selectedMask.h, selectedMask, true);
    }

    @Override // com.vk.media.ok.a
    public final void x(String str) {
        MasksWrap masksWrap = this.b.b0;
        if (masksWrap != null) {
            int i = MasksWrap.e0;
            masksWrap.G(Long.MAX_VALUE, str);
        }
    }

    @Override // com.vk.media.ok.a
    public final void y(boolean z) {
        an9 state;
        bm9 presenter = this.b.getPresenter();
        if (presenter == null || (state = presenter.getState()) == null) {
            return;
        }
        state.v = z;
    }

    @Override // com.vk.media.ok.a
    public final void z(boolean z, boolean z2) {
        bm9 presenter = this.b.getPresenter();
        if (presenter != null) {
            presenter.A3(z, z2);
        }
    }
}
