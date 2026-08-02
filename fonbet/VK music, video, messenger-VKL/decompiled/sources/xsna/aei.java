package xsna;

import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class aei implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ aei(int i) {
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
                        androidx.compose.runtime.b.f(474343090, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$ContextMenuScreenContentKt.lambda$474343090.<anonymous> (ContextMenuScreenContent.kt:386)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue2 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.l(sQLiteStatement, intValue2, chatSettings != null ? chatSettings.C : null);
                break;
            default:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                InfoBar infoBar = ((com.vk.im.engine.models.dialogs.b) obj2).w;
                rdi.m(sQLiteStatement2, intValue3, infoBar != null ? infoBar.f : null);
                break;
        }
        return s3q0.a;
    }
}
