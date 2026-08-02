package xsna;

import androidx.compose.runtime.a;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.ldj0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class thi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ thi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChatPermissions chatPermissions;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2146389638, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$ModalPageScreenContentKt.lambda$-2146389638.<anonymous> (ModalPageScreenContent.kt:234)");
                    }
                    q630 f = txj0.f(q630.a.a, 1.0f);
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new sc(17);
                        aVar.R(x);
                    }
                    lqy.a(f, null, null, null, null, null, false, null, (izs) x, aVar, 805306374, 510);
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
                rdi.m(sQLiteStatement, intValue2, (chatSettings == null || (chatPermissions = chatSettings.B) == null) ? null : chatPermissions.i);
                return s3q0.a;
            default:
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                aVar2.K(-1444366233);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1444366233, intValue3, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.textCustomShimmer.<anonymous> (SubscriptionMenuItem.kt:151)");
                }
                ldj0.b bVar = ldj0.b.a;
                long j = l5g.d;
                q630 a = wdj0.a(q630Var, xx1.D(bVar, tjv0.a((tjv0) aVar2.r(ujv0.b), jq2.b(2, new dtp0(800, 1000, luo.d), null, 0L, 12), 6, e43.l(new l5g(l5g.c(14, j, 0.5f)), new l5g(l5g.c(14, j, 1.0f)), new l5g(l5g.c(14, j, 0.5f))), null, 50, 16), aVar2, 64, 0));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return a;
        }
    }
}
