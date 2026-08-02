package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookItem;
import com.vk.dto.music.audiobook.AudioBook;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class aom implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ aom(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, this.c, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -8388609, 2097151);
            default:
                UIBlock uIBlock = (UIBlock) obj;
                return uIBlock instanceof UIBlockAudioBookItem ? new UIBlockAudioBookItem(sua.l(uIBlock), AudioBook.zb(((UIBlockAudioBookItem) uIBlock).y, null, this.c, 4128767)) : uIBlock;
        }
    }
}
