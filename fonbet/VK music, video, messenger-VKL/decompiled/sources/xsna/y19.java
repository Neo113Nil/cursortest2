package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import java.util.HashMap;
import org.chromium.base.CallbackUtils;
import ru.ok.android.externcalls.sdk.dev.CallsSDKException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class y19 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ y19(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                throw new CallsSDKException("It's test application crash... Please don't worry!", null, 2, null);
            case 1:
                CallbackUtils.lambda$static$1();
                return;
            default:
                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                StickersDatabase.a.b().L().b();
                return;
        }
    }

    public /* synthetic */ y19(VmojiPromoInSuggestsRepositoryImpl vmojiPromoInSuggestsRepositoryImpl) {
        this.b = 2;
    }
}
