package xsna;

import com.vk.cameraui.impl.a.b;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.stories.analytics.StoryPublishEvent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class nm9 implements gzs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ com.vk.cameraui.impl.a d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ nm9(boolean z, boolean z2, com.vk.cameraui.impl.a aVar, boolean z3, boolean z4, boolean z5) {
        this.b = z;
        this.c = z2;
        this.d = aVar;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = this.b;
        com.vk.cameraui.impl.a aVar = this.d;
        if (z || this.c) {
            an9 an9Var = aVar.i;
            CameraUIView cameraUIView = aVar.b;
            an9Var.e = true;
            lmv clipsControls = cameraUIView.getClipsControls();
            if (clipsControls != null) {
                lmv.J2(clipsControls, null, 7);
            }
            cameraUIView.setClipsProgressCounterVisible(this.e);
            cameraUIView.getPositions().d();
            cameraUIView.setShutterPosition(true);
            if (this.f) {
                cameraUIView.n(0.12f, 550L);
            }
            int b0 = aVar.b0();
            long min = StrictMath.min(b0, 60000L);
            if (this.g) {
                cameraUIView.v(min, 1.0f, true);
            }
            zd9 camera1View = cameraUIView.getCamera1View();
            if (camera1View != null) {
                camera1View.setMaxRecordingLengthMs(b0);
            }
            if (z) {
                aVar.F0();
                aVar.h.c(StoryPublishEvent.START_STORY_VIDEO, new xx0(7));
            }
        } else {
            CameraUIView cameraUIView2 = aVar.b;
            zd9 camera1View2 = cameraUIView2.getCamera1View();
            if (camera1View2 != null) {
                camera1View2.setOnCameraResultListener(aVar.new b(new com.vk.movika.sdk.base.logic.interactor.j(aVar, 13)));
            }
            cameraUIView2.w();
            cameraUIView2.u();
            aVar.T0();
        }
        return s3q0.a;
    }
}
