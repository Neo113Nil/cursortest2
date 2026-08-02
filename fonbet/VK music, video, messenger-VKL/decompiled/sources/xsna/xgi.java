package xsna;

import com.vk.im.engine.models.ConversationCard;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xgi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ xgi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lg90 d1;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(722218521, intValue, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.ComposableSingletons$LinkVKBidScreenContentKt.lambda$722218521.<anonymous> (LinkVKBidScreenContent.kt:94)");
                    }
                    if (a690.d(q630.a.a, 18, aVar, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).i);
                return s3q0.a;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue2 = ((Integer) obj3).intValue();
                ConversationCard conversationCard = ((com.vk.im.engine.models.dialogs.b) obj2).x;
                rdi.m(sQLiteStatement, intValue2, conversationCard != null ? conversationCard.h : null);
                return s3q0.a;
            case 3:
                return s3q0.a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                aVar2.K(503547520);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(503547520, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.AudioBookButtons.Content.<anonymous>.<anonymous> (TopPlayerControls.kt:675)");
                }
                if (booleanValue) {
                    aVar2.K(-1422135609);
                    qzu0.a.getClass();
                    d1 = qzu0.V0(aVar2);
                } else {
                    aVar2.K(-1422134938);
                    qzu0.a.getClass();
                    d1 = qzu0.d1(aVar2);
                }
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return d1;
        }
    }
}
