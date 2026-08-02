package xsna;

import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.ugc.UgcStatus;

/* compiled from: Sticker.kt */
/* loaded from: classes18.dex */
public interface n1l0 extends zk2 {
    default boolean B() {
        return false;
    }

    default UgcStatus O() {
        return UgcStatus.OK;
    }

    @Override // xsna.zk2
    default boolean V0() {
        return false;
    }

    ImageList Z();

    @Override // xsna.zk2
    default String a(boolean z) {
        return "";
    }

    @Override // xsna.zk2
    default String b(boolean z) {
        return "";
    }

    long getProductId();

    int o2();

    default boolean z9() {
        return false;
    }
}
