package xsna;

import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class pm implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pm(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChatPermissions chatPermissions;
        switch (this.b) {
            case 0:
                ep10 ep10Var = (ep10) obj;
                int r0 = ep10Var.r0(vm.a);
                long j = ((o6j) obj3).a;
                int i = r0 * 2;
                tra0 N = ((zo10) obj2).N(s6j.i(i, 0, j));
                break;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2080136929, intValue, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.ComposableSingletons$ClipMetaViewKt.lambda$2080136929.<anonymous> (ClipMetaView.kt:160)");
                    }
                    qzu0.a.getClass();
                    lg90 E1 = qzu0.E1(aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(E1, null, null, ylu0Var.getIcon().c, aVar, 56, 4);
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
                rdi.m(sQLiteStatement, intValue2, (chatSettings == null || (chatPermissions = chatSettings.B) == null) ? null : chatPermissions.g);
                break;
            default:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).g);
                break;
        }
        return s3q0.a;
    }
}
