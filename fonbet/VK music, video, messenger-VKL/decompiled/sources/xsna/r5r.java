package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.PopupStickersChatSettingsModel;
import com.vk.toggle.features.CoreFeatures;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import xsna.kbl0;
import xsna.u5r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class r5r implements Callable {
    public final /* synthetic */ int b;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                return new u5r(false, EmptyList.b, new u5r.a(false, false));
            case 1:
                HashMap<UserId, kbl0> hashMap = kbl0.b;
                PopupStickersChatSettingsModel b = kbl0.a.b().b();
                return new PopupStickersChatSettingsModel(b.Ab(), b.zb(), myb0.d().c());
            default:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                CoreFeatures coreFeatures = CoreFeatures.MOURNING_MODE;
                coreFeatures.getClass();
                fll fllVar = com.vk.toggle.b.A.a(coreFeatures) ? new fll(context) : new fll(context);
                fllVar.a();
                return fllVar;
        }
    }

    public /* synthetic */ r5r(Object obj, int i) {
        this.b = i;
    }
}
