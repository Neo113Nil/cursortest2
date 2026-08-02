package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.messages.PinnedMsg;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ugi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ugi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList;
        r1 = null;
        r1 = null;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(735267983, intValue, -1, "com.vk.music.stickyplayer.presentation.components.music.ComposableSingletons$KidsMusicActionsPanelKt.lambda$735267983.<anonymous> (KidsMusicActionsPanel.kt:185)");
                    }
                    z3r0.b(null, false, aVar, 0, 3);
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
                rdi.j(sQLiteStatement, intValue2, chatSettings != null ? Boolean.valueOf(chatSettings.n) : null);
                break;
            default:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                PinnedMsg pinnedMsg = ((com.vk.im.engine.models.dialogs.b) obj2).t;
                if (pinnedMsg != null && (arrayList = pinnedMsg.j) != null) {
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        bArr = Serializer.b.f(arrayList);
                    }
                }
                rdi.h(sQLiteStatement2, intValue3, bArr);
                break;
        }
        return s3q0.a;
    }
}
