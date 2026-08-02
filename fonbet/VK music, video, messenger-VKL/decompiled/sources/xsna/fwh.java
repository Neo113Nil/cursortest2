package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.user.UserProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class fwh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ fwh(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ImageSize Cb;
        switch (this.b) {
            case 0:
                UserProfile userProfile = (UserProfile) obj;
                String str = userProfile.g;
                int i = this.c;
                String a = js5.a(i, str);
                if (a != null) {
                    return a;
                }
                Image image = userProfile.O;
                if (image == null || (Cb = image.Cb(i, true, true)) == null) {
                    return null;
                }
                return Cb.d.d;
            default:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                return com.vk.im.engine.models.dialogs.b.a(bVar, new vjm(bVar.d.b, this.c), null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -5, 2097151);
        }
    }
}
