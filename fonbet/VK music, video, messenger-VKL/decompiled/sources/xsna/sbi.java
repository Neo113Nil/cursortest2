package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.messages.PinnedMsg;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class sbi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ sbi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Peer peer;
        Peer.Type type;
        switch (this.b) {
            case 0:
                wzs wzsVar = (wzs) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.y(wzsVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(486633673, intValue, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda$486633673.<anonymous> (BasicTextField.kt:932)");
                    }
                    wzsVar.invoke(aVar, Integer.valueOf(intValue & 14));
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
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1135896978, intValue2, -1, "com.vk.ecomm.design.compose.imagegallery.ComposableSingletons$ImageGalleryEditModeCellKt.lambda$1135896978.<anonymous> (ImageGalleryEditModeCell.kt:170)");
                }
                float f = 2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                mku0.a(f, 390, 24, ylu0Var.getIcon().c, aVar2, ahn.E(q630.a.a, "loaderImage"));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue3, chatSettings != null ? Boolean.valueOf(chatSettings.i) : null);
                break;
            default:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                PinnedMsg pinnedMsg = ((com.vk.im.engine.models.dialogs.b) obj2).t;
                rdi.k(sQLiteStatement2, intValue4, (pinnedMsg == null || (peer = pinnedMsg.d) == null || (type = peer.c) == null) ? null : Integer.valueOf(type.h()));
                break;
        }
        return s3q0.a;
    }
}
