package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.profile.community.api.component.CommunityComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class oze implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ oze(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (CameraClipsComponent) this.c.a(fpf0.a(CameraClipsComponent.class));
            case 1:
                return ((CameraClipsComponent) this.c.a(fpf0.a(CameraClipsComponent.class))).c4();
            case 2:
                return ((CommunityComponent) this.c.a(fpf0.a(CommunityComponent.class))).ke();
            default:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).O();
        }
    }
}
