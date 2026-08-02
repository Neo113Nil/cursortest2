package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookItem;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.user.UserProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class cju implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ cju(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ImageSize Cb;
        switch (this.b) {
            case 0:
                Image image = ((UserProfile) obj).O;
                if (image == null || (Cb = image.Cb(this.c, true, true)) == null) {
                    return null;
                }
                return Cb.d.d;
            default:
                UIBlock uIBlock = (UIBlock) obj;
                return Boolean.valueOf((uIBlock instanceof UIBlockAudioBookItem) && ((UIBlockAudioBookItem) uIBlock).y.getId() == this.c);
        }
    }
}
