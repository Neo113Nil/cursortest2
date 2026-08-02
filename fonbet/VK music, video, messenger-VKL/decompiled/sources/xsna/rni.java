package xsna;

import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rni implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ rni(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChatPermissions chatPermissions;
        lg90 d1;
        tra0 N;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(310151998, intValue, -1, "com.vk.core.compose.component.ComposableSingletons$VkDropdownKt.lambda$310151998.<anonymous> (VkDropdown.kt:75)");
                    }
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
                rdi.m(sQLiteStatement, intValue2, (chatSettings == null || (chatPermissions = chatSettings.B) == null) ? null : chatPermissions.b);
                return s3q0.a;
            case 2:
                rdi.i((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).y);
                return s3q0.a;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                aVar2.K(-1209443379);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1209443379, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.RadioButtons.Content.<anonymous>.<anonymous> (TopPlayerControls.kt:781)");
                }
                if (booleanValue) {
                    aVar2.K(1661052116);
                    qzu0.a.getClass();
                    d1 = qzu0.V0(aVar2);
                } else {
                    aVar2.K(1661052787);
                    qzu0.a.getClass();
                    d1 = qzu0.d1(aVar2);
                }
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return d1;
            default:
                ep10 ep10Var = (ep10) obj;
                zo10 zo10Var = (zo10) obj2;
                long j = ((o6j) obj3).a;
                if (o6j.g(j)) {
                    N = zo10Var.N(j);
                } else {
                    int M = zo10Var.M(o6j.h(j));
                    if (M < 0) {
                        wzw.a("width must be >= 0");
                    }
                    N = zo10Var.N(s6j.e(j, s6j.h(M, M, 0, Integer.MAX_VALUE)));
                }
                return ep10Var.Q(N.b, N.c, jgp.b, new hfm0(N, 21));
        }
    }
}
