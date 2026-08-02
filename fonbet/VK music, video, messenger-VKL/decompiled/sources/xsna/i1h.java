package xsna;

import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.profile.community.chats.api.di.CommunityChatsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class i1h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ i1h(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (CommunityChatsComponent) this.c.a(fpf0.a(CommunityChatsComponent.class));
            default:
                return ((ClipsUploadSdkUploaderComponent) this.c.a(fpf0.a(ClipsUploadSdkUploaderComponent.class))).Zb();
        }
    }
}
