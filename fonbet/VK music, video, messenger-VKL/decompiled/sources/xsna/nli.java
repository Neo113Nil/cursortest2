package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nli implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ nli(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChatPermissions chatPermissions;
        Set<Peer> set;
        List O0;
        String str = null;
        r6 = null;
        r6 = null;
        byte[] bArr = null;
        str = null;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-278055417, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$SubnavigationBarScreenContentKt.lambda$-278055417.<anonymous> (SubnavigationBarScreenContent.kt:487)");
                    }
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, q630.a.a);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar2);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    qzu0.a.getClass();
                    pzu0.b(qzu0.p1(aVar), null, null, 0L, aVar, 56, 12);
                    yqv0.c("Кастомный", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar, 6, 0, 16382);
                    pzu0.b(qzu0.p1(aVar), null, null, 0L, aVar, 56, 12);
                    yqv0.c("контент", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar, 6, 0, 16382);
                    pzu0.b(qzu0.p1(aVar), null, null, 0L, aVar, 56, 12);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1106916411, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkTopBarKt.lambda$1106916411.<anonymous> (VkTopBar.kt:188)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                if (chatSettings != null && (chatPermissions = chatSettings.B) != null) {
                    str = chatPermissions.f;
                }
                rdi.m(sQLiteStatement, intValue3, str);
                return s3q0.a;
            default:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                ChatSettings chatSettings2 = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                if (chatSettings2 != null && (set = chatSettings2.e) != null && (O0 = j5g.O0(set)) != null) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    bArr = Serializer.b.f(O0);
                }
                rdi.h(sQLiteStatement2, intValue4, bArr);
                return s3q0.a;
        }
    }
}
