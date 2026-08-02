package xsna;

import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.osh;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class msh implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ msh(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                it80 it80Var = (it80) obj2;
                osh.a aVar = (osh.a) ((it80) obj).a;
                if (aVar == null) {
                    aVar = new osh.a(null, false, null, null, null, 0, 255);
                }
                osh.a aVar2 = (osh.a) it80Var.a;
                if (aVar2 != null) {
                    break;
                }
                break;
            case 1:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(169422354, intValue, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.ComposableSingletons$CartContentKt.lambda$169422354.<anonymous> (CartContent.kt:108)");
                    }
                    if (a690.d(q630.a.a, kqu0.t, aVar3, 0)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 2:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1959181099, intValue2, -1, "com.vk.core.compose.utils.ComposableSingletons$ComposableFunctionKt.lambda$1959181099.<anonymous> (ComposableFunction.kt:58)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 3:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1151876827, intValue3, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.ComposableSingletons$LinkVKBidScreenContentKt.lambda$1151876827.<anonymous> (LinkVKBidScreenContent.kt:78)");
                    }
                    if (a690.d(q630.a.a, 8, aVar5, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 4:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue4, chatSettings != null ? Boolean.valueOf(chatSettings.u) : null);
                break;
            default:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue5 = ((Integer) obj3).intValue();
                ConversationCard conversationCard = ((com.vk.im.engine.models.dialogs.b) obj2).x;
                rdi.m(sQLiteStatement2, intValue5, conversationCard != null ? conversationCard.f : null);
                break;
        }
        return s3q0.a;
    }
}
