package xsna;

import com.vk.content.design.view.camera.CameraUIView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hm9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ com.vk.cameraui.impl.a c;

    public /* synthetic */ hm9(com.vk.cameraui.impl.a aVar, int i) {
        this.b = i;
        this.c = aVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                com.vk.cameraui.impl.a aVar = this.c;
                aVar.b.n(0.12f, 350L);
                CameraUIView cameraUIView = aVar.b;
                cameraUIView.v(1900L, 1.0f, true);
                aVar.F0();
                aVar.i.e = true;
                cameraUIView.getPositions().d();
                cameraUIView.setShutterPosition(true);
                aVar.l0();
                return s3q0.a;
            default:
                return new vky(new d80(this.c));
        }
    }
}
