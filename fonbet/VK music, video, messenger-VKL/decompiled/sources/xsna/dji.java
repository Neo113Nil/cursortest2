package xsna;

import androidx.compose.runtime.a;
import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.messages.PinnedMsg;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dji implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ dji(int i) {
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
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-583490610, intValue, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.ComposableSingletons$OrderContentKt.lambda$-583490610.<anonymous> (OrderContent.kt:98)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 m = hr80.m(q630.a.a, l5g.c(14, ylu0Var.getBackground().g, 0.64f), androidx.compose.ui.graphics.e.a);
                Object x = aVar.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = ir.h(aVar);
                }
                sg50 sg50Var = (sg50) x;
                Object x2 = aVar.x();
                if (x2 == c0012a) {
                    x2 = new vg0(6);
                    aVar.R(x2);
                }
                fy80.a(0, 0, aVar, ojc.b(m, sg50Var, null, false, null, (gzs) x2, 28));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue2 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue2, chatSettings != null ? Boolean.valueOf(chatSettings.L) : null);
                return s3q0.a;
            case 2:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                PinnedMsg pinnedMsg = ((com.vk.im.engine.models.dialogs.b) obj2).t;
                if (pinnedMsg != null && (arrayList = pinnedMsg.i) != null) {
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        bArr = Serializer.b.f(arrayList);
                    }
                }
                rdi.h(sQLiteStatement2, intValue3, bArr);
                return s3q0.a;
            default:
                return new t460((JSONObject) obj, (s460) obj2, (String) obj3);
        }
    }
}
