package xsna;

import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.profile.community.chats.api.di.CommunityChatsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ qia(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (CameraClipsComponent) this.c.a(fpf0.a(CameraClipsComponent.class));
            default:
                return (CommunityChatsComponent) this.c.a(fpf0.a(CommunityChatsComponent.class));
        }
    }
}
