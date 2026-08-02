package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.group.Group;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fli implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ fli(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List<ConversationCard.ConversationButton> list;
        r1 = null;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1911519584, intValue, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$StorefrontLoadingKt.lambda$-1911519584.<anonymous> (StorefrontLoading.kt:87)");
                    }
                    sk1.a(6, 0, aVar, s200.F(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue2 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue2, chatSettings != null ? Boolean.valueOf(chatSettings.E) : null);
                return s3q0.a;
            case 2:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                ConversationCard conversationCard = ((com.vk.im.engine.models.dialogs.b) obj2).x;
                if (conversationCard != null && (list = conversationCard.g) != null) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    bArr = Serializer.b.f(list);
                }
                rdi.h(sQLiteStatement2, intValue3, bArr);
                return s3q0.a;
            default:
                return new Pair((Group) obj, (kna0) obj2);
        }
    }
}
