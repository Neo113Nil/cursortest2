package xsna;

import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.stickers.keyboard.StickersView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class rdl0 implements yzs {
    public final /* synthetic */ StickersView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ rdl0(StickersView stickersView, boolean z) {
        this.b = stickersView;
        this.c = z;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        return StickersView.a(this.b, this.c, (UGCChatSettingsModel) obj, booleanValue, booleanValue2);
    }
}
