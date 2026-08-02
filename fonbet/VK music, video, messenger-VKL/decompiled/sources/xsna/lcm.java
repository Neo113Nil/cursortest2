package xsna;

import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class lcm implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ lcm(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lg90 d1;
        switch (this.b) {
            case 0:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.m(sQLiteStatement, intValue, chatSettings != null ? chatSettings.A : null);
                return s3q0.a;
            case 1:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue2 = ((Integer) obj3).intValue();
                InfoBar infoBar = ((com.vk.im.engine.models.dialogs.b) obj2).w;
                rdi.m(sQLiteStatement2, intValue2, infoBar != null ? infoBar.e : null);
                return s3q0.a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                aVar.K(-112332957);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-112332957, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.MusicButtons.Content.<anonymous>.<anonymous> (TopPlayerControls.kt:466)");
                }
                if (booleanValue) {
                    aVar.K(-577787158);
                    qzu0.a.getClass();
                    d1 = qzu0.V0(aVar);
                } else {
                    aVar.K(-577786487);
                    qzu0.a.getClass();
                    d1 = qzu0.d1(aVar);
                }
                aVar.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return d1;
        }
    }
}
