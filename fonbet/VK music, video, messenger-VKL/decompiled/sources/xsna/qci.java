package xsna;

import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptyList;
import xsna.eg20;
import xsna.kxi0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qci implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qci(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33, types: [kotlin.collections.EmptyList] */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChatPermissions chatPermissions;
        Peer peer;
        Peer.Type type;
        ?? arrayList;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(886131373, intValue, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.clip.ComposableSingletons$ClipKt.lambda$886131373.<anonymous> (Clip.kt:130)");
                    }
                    akv0.a(SkeletonType.Block, txj0.d(q630.a.a, 1.0f), aVar, 54);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ksy ksyVar = (ksy) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(ksyVar) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(970245226, intValue2, -1, "com.vk.profile.community.members.impl.ui.ComposableSingletons$MembersScreenKt.lambda$970245226.<anonymous> (MembersScreen.kt:158)");
                    }
                    com.vk.profile.community.members.impl.ui.d.c(ksyVar, null, aVar2, intValue2 & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1523443300, intValue3, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$SubnavigationBarScreenContentKt.lambda$1523443300.<anonymous> (SubnavigationBarScreenContent.kt:204)");
                    }
                    yqv0.c("Удалить кнопку", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar3, 6, 0, 16382);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.m(sQLiteStatement, intValue4, (chatSettings == null || (chatPermissions = chatSettings.B) == null) ? null : chatPermissions.h);
                return s3q0.a;
            case 4:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue5 = ((Integer) obj3).intValue();
                ChatSettings chatSettings2 = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.k(sQLiteStatement2, intValue5, (chatSettings2 == null || (peer = chatSettings2.d) == null || (type = peer.c) == null) ? null : Integer.valueOf(type.h()));
                return s3q0.a;
            case 5:
                return new eg20.a((w8v) obj, (xf20) obj2, (ProfilesInfo) obj3);
            case 6:
                kxi0.a aVar4 = (kxi0.a) obj;
                Collection collection = (Collection) obj2;
                izs izsVar = (izs) obj3;
                int i = aVar4 == null ? -1 : kxi0.b.$EnumSwitchMapping$0[aVar4.ordinal()];
                if (i == 2 || i == 4) {
                    arrayList = new ArrayList();
                    for (Object obj4 : collection) {
                        if (((Boolean) izsVar.invoke(obj4)).booleanValue()) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = EmptyList.b;
                }
                return (Collection) arrayList;
            default:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                ((nov) obj3).e(udl0.c, udl0.d);
                return s3q0.a;
        }
    }
}
