package xsna;

import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.user.RequestUserProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class oe6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ oe6(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return (AttachmentWithMedia) wdw.b((AttachWithImage) obj, null, this.c, 2);
            default:
                ((RequestUserProfile) obj).s.putInt("friend_request_status", this.c ? -2 : 0);
                return s3q0.a;
        }
    }
}
