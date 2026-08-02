package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashSet;
import xsna.efu;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vgi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vgi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        q630.a aVar = q630.a.a;
        switch (i) {
            case 0:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1581535133, intValue, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.ComposableSingletons$LinkVKBidScreenContentKt.lambda$1581535133.<anonymous> (LinkVKBidScreenContent.kt:62)");
                    }
                    if (a690.d(aVar, 16, aVar2, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 1:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(684771380, intValue2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$StorefrontLoadingKt.lambda$684771380.<anonymous> (StorefrontLoading.kt:54)");
                    }
                    dsy a = gsy.a(0, 3, aVar3);
                    Context context = (Context) aVar3.r(AndroidCompositionLocals_androidKt.b);
                    HashSet hashSet = iah0.a;
                    int i2 = fnj.d(context) ? 3 : 2;
                    q630 f = txj0.f(aVar, 1.0f);
                    efu.b bVar = new efu.b(i2);
                    float f2 = 16;
                    u890 u890Var = new u890(f2, 12, f2, f2);
                    a.j g = androidx.compose.foundation.layout.a.g(0);
                    a.j g2 = androidx.compose.foundation.layout.a.g(6);
                    Object x = aVar3.x();
                    if (x == a.C0011a.a) {
                        x = new qt(18);
                        aVar3.R(x);
                    }
                    uqy.b(bVar, f, a, u890Var, g, g2, null, false, null, (izs) x, aVar3, 102432816, 6, 656);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue3, chatSettings != null ? Boolean.valueOf(chatSettings.s) : null);
                break;
            default:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                ConversationCard conversationCard = ((com.vk.im.engine.models.dialogs.b) obj2).x;
                rdi.m(sQLiteStatement2, intValue4, conversationCard != null ? conversationCard.d : null);
                break;
        }
        return s3q0.a;
    }
}
