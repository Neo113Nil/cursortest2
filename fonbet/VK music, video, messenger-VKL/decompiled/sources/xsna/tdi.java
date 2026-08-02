package xsna;

import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.messages.PinnedMsg;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class tdi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ tdi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1584368694, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.wall.ComposableSingletons$CommunityProfileContentWallViewHolderKt.lambda$1584368694.<anonymous> (CommunityProfileContentWallViewHolder.kt:148)");
                    }
                    bmh.a(0, 0, 0L, aVar, null);
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
                        androidx.compose.runtime.b.f(-1359485477, intValue2, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$InputSelectScreenContentKt.lambda$-1359485477.<anonymous> (InputSelectScreenContent.kt:202)");
                    }
                    yqv0.c("Test dropdown content", s200.D(txj0.f(q630.a.a, 1.0f), 16), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar2, 54, 0, 16380);
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
                rdi.j(sQLiteStatement, intValue3, chatSettings != null ? Boolean.valueOf(chatSettings.k) : null);
                break;
            default:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                PinnedMsg pinnedMsg = ((com.vk.im.engine.models.dialogs.b) obj2).t;
                rdi.l(sQLiteStatement2, intValue4, pinnedMsg != null ? Long.valueOf(pinnedMsg.e) : null);
                break;
        }
        return s3q0.a;
    }
}
