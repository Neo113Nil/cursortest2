package xsna;

import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.chromium.base.version_info.VersionConstants;
import xsna.poa;
import xsna.voa;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class rch implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ rch(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        LinkedHashMap linkedHashMap;
        List<List<BotButton>> list;
        switch (this.b) {
            case 0:
                rzh rzhVar = (rzh) obj;
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj3;
                LinkedHashMap linkedHashMap2 = rzhVar.e;
                Iterator it = linkedHashMap2.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj4 = it.next();
                        if (((txh) obj4).s) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                txh txhVar = (txh) obj4;
                if (txhVar != null) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                    linkedHashMap3.put(Integer.valueOf(txhVar.a), txh.a(txhVar, 0, false, false, false, null, true, 1048575));
                    linkedHashMap = linkedHashMap3;
                } else {
                    linkedHashMap = linkedHashMap2;
                }
                break;
            case 1:
                break;
            case 2:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1950472951, intValue, -1, "com.vk.profile.core.tabs.ui.articles.ComposableSingletons$ProfileContentArticlesViewHolderKt.lambda$1950472951.<anonymous> (ProfileContentArticlesViewHolder.kt:102)");
                    }
                    for (int i = 0; i < 10; i++) {
                        yiu0.a(null, poa.a.a(soa.a(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 76), null, aVar, 2), voa.a.a(xoa.a(VersionConstants.PRODUCT_MAJOR_VERSION, aVar, 390, 2), xoa.a(80, aVar, 390, 2), null, null, aVar, 196608, 28), null, aVar, 0, 9);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 3:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1905731318, intValue2, -1, "com.vk.core.compose.utils.swipable.ComposableSingletons$SwipeToDismissKt.lambda$-1905731318.<anonymous> (SwipeToDismiss.kt:252)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                BotKeyboard botKeyboard = ((com.vk.im.engine.models.dialogs.b) obj2).D;
                rdi.h(sQLiteStatement, intValue3, (botKeyboard == null || (list = botKeyboard.f) == null) ? null : apm0.b(list));
                break;
        }
        return s3q0.a;
    }
}
