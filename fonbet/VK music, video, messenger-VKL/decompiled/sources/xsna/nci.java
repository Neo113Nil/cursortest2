package xsna;

import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nci implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ nci(int i) {
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
                        androidx.compose.runtime.b.f(-1193998476, intValue, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.ComposableSingletons$CheckoutContentRedesignedKt.lambda$-1193998476.<anonymous> (CheckoutContentRedesigned.kt:129)");
                    }
                    q630 h = txj0.h(txj0.f(q630.a.a, 1.0f), kqu0.v);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    ja8.a(hr80.m(h, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), aVar, 0);
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
                        androidx.compose.runtime.b.f(2117094480, intValue2, -1, "com.vk.libvideo.design.compose.base.media.ComposableSingletons$MediaViewKt.lambda$2117094480.<anonymous> (MediaView.kt:66)");
                    }
                    akv0.a(SkeletonType.Block, txj0.d(q630.a.a, 1.0f), aVar2, 54);
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
                rdi.m(sQLiteStatement, intValue3, (chatSettings == null || (chatPermissions = chatSettings.B) == null) ? null : chatPermissions.d);
                break;
            default:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                ChatSettings chatSettings2 = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.m(sQLiteStatement2, intValue4, chatSettings2 != null ? chatSettings2.b : null);
                break;
        }
        return s3q0.a;
    }
}
