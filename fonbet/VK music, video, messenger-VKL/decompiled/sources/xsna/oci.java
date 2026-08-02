package xsna;

import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashMap;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class oci implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ oci(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChatPermissions chatPermissions;
        ImageList imageList;
        int i = this.b;
        String str = null;
        r2 = null;
        byte[] bArr = null;
        str = null;
        q630.a aVar = q630.a.a;
        switch (i) {
            case 0:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1056194571, intValue, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.ComposableSingletons$CheckoutContentRedesignedKt.lambda$1056194571.<anonymous> (CheckoutContentRedesigned.kt:216)");
                }
                x3c.a(txj0.d(ahn.E(aVar, "checkout_blocking_progress"), 1.0f), aVar2, 6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            case 1:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1994439530, intValue2, -1, "com.vk.video.playlist.playlistscreen.ui.view.ComposableSingletons$CoverViewKt.lambda$1994439530.<anonymous> (CoverView.kt:108)");
                    }
                    akv0.a(SkeletonType.Block, txj0.d(aVar, 1.0f), aVar3, 54);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 2:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(346032812, intValue3, -1, "com.vk.profile.community.members.impl.ui.ComposableSingletons$MembersScreenKt.lambda$346032812.<anonymous> (MembersScreen.kt:152)");
                    }
                    zfr0.e(txj0.f(aVar, 1.0f), 0L, null, aVar4, 6, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 3:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-605450721, intValue4, -1, "com.vk.donut.privacy.levels.levelsbottomsheet.ComposableSingletons$PrivacyEditDonutLevelsBottomSheetViewKt.lambda$-605450721.<anonymous> (PrivacyEditDonutLevelsBottomSheetView.kt:160)");
                    }
                    kdd0.d(0, aVar5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 4:
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (aVar6.t(intValue5 & 1, (intValue5 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1342188603, intValue5, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$SubnavigationBarScreenContentKt.lambda$1342188603.<anonymous> (SubnavigationBarScreenContent.kt:191)");
                    }
                    yqv0.c("Добавить кнопку", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar6, 6, 0, 16382);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
            case 5:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue6 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                if (chatSettings != null && (chatPermissions = chatSettings.B) != null) {
                    str = chatPermissions.e;
                }
                rdi.m(sQLiteStatement, intValue6, str);
                break;
            default:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue7 = ((Integer) obj3).intValue();
                ChatSettings chatSettings2 = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                if (chatSettings2 != null && (imageList = chatSettings2.c) != null) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    bArr = Serializer.b.e(imageList);
                }
                rdi.h(sQLiteStatement2, intValue7, bArr);
                break;
        }
        return s3q0.a;
    }
}
