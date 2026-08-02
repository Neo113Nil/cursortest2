package xsna;

import androidx.appcompat.widget.SwitchCompat;
import com.vk.dto.stickers.PopupStickersChatSettingsModel;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class byb0 implements izs {
    public final /* synthetic */ SwitchCompat b;
    public final /* synthetic */ long c;

    public /* synthetic */ byb0(SwitchCompat switchCompat, long j) {
        this.b = switchCompat;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        this.b.setChecked(!((PopupStickersChatSettingsModel) obj).Bb().contains(Long.valueOf(this.c)));
        return s3q0.a;
    }
}
