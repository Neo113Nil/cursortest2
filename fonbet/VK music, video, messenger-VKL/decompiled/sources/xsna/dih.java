package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.messages.PinnedMsg;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.List;
import xsna.fih;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class dih implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ dih(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List<MarketMarketAlbumDto> list;
        List<MarketMarketAlbumDto> list2;
        switch (this.b) {
            case 0:
                it80 it80Var = (it80) obj;
                it80 it80Var2 = (it80) obj2;
                fih.b bVar = (fih.b) ((it80) obj3).a;
                if (bVar == null || (list2 = bVar.a) == null) {
                    fih.b bVar2 = (fih.b) it80Var2.a;
                    if (bVar2 == null) {
                        list = null;
                        fih.b bVar3 = (fih.b) it80Var2.a;
                        break;
                    } else {
                        list2 = bVar2.a;
                    }
                }
                list = list2;
                fih.b bVar32 = (fih.b) it80Var2.a;
                if (bVar32 == null) {
                }
                break;
            case 1:
                k7k0 k7k0Var = (k7k0) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? aVar.J(k7k0Var) : aVar.y(k7k0Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1890101041, intValue, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda$1890101041.<anonymous> (SnackbarHost.kt:154)");
                    }
                    t8k0.c(k7k0Var, null, null, 0L, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, intValue & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue2 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue2, chatSettings != null ? Boolean.valueOf(chatSettings.l) : null);
                break;
            default:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                PinnedMsg pinnedMsg = ((com.vk.im.engine.models.dialogs.b) obj2).t;
                rdi.m(sQLiteStatement2, intValue3, pinnedMsg != null ? pinnedMsg.f : null);
                break;
        }
        return s3q0.a;
    }
}
