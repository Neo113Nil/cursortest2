package xsna;

import androidx.compose.ui.graphics.e;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.HashMap;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tbi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ tbi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList;
        r6 = null;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1597764083, intValue, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.ComposableSingletons$BookingEditScreenMviViewKt.lambda$-1597764083.<anonymous> (BookingEditScreenMviView.kt:292)");
                    }
                    com.vk.core.compose.component.group.header.g.b(f.a.a(d370.N(R.string.master_address_title, 0, aVar), null, null, null, null, null, null, null, false, aVar, 805306368, 510), s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), b.d.a, null, null, null, false, aVar, Tensorflow.FRAME_WIDTH, 120);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1423985859, intValue2, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.ComposableSingletons$OrderListScreenKt.lambda$-1423985859.<anonymous> (OrderListScreen.kt:77)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getBackground().g;
                    e.a aVar3 = androidx.compose.ui.graphics.e.a;
                    float f = kqu0.b;
                    jqu0.a(s200.H(hr80.m(q630.a.a, j, aVar3), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, (float) 0.5d, 2), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue3, chatSettings != null ? Boolean.valueOf(chatSettings.o) : null);
                break;
            default:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                PinnedMsg pinnedMsg = ((com.vk.im.engine.models.dialogs.b) obj2).t;
                if (pinnedMsg != null && (arrayList = pinnedMsg.k) != null) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    bArr = Serializer.b.f(arrayList);
                }
                rdi.h(sQLiteStatement2, intValue4, bArr);
                break;
        }
        return s3q0.a;
    }
}
