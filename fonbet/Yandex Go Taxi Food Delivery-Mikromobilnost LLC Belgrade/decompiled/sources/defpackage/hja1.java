package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.gson.reflect.TypeToken;
import com.yandex.payment.sdk.flex.actions.ftrequestaction.FTRequestActionHandlerKt$parseBodyAsMap$mapType$1;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public abstract class hja1 {
    public static final String a(long j) {
        return j < 0 ? "invalid" : j < 1000 ? "<1" : (1000 > j || j >= 2001) ? (2001 > j || j >= 3001) ? (3001 > j || j >= 5001) ? (5001 > j || j >= 10001) ? (10001 > j || j >= 15001) ? (15001 > j || j >= 20001) ? (20001 > j || j >= 30001) ? (30001 > j || j >= 60001) ? (60001 > j || j >= 300001) ? (300001 > j || j >= 1800001) ? (1800001 > j || j >= 7200001) ? ">7200" : "1800-7200" : "300-1800" : "60-300" : "30-60" : "20-30" : "15-20" : "10-15" : "5-10" : "3-5" : "2-3" : "1-2";
    }

    public static final Map b(kvj0 kvj0Var) {
        if (!kvj0Var.J) {
            ny61.v(oyr.k(kvj0Var.w, "Unexpected response code ", Extension.COLON_SPACE, kvj0Var.c));
            return null;
        }
        rvj0 rvj0Var = kvj0Var.z;
        if (rvj0Var != null) {
            String string = rvj0Var.string();
            return evu0.J(string) ? b.f() : (Map) new u3u().d(string, TypeToken.get(new FTRequestActionHandlerKt$parseBodyAsMap$mapType$1().getType()));
        }
        ny61.v("Response body is null");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r0.isTouchExplorationEnabled() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean c(fid fidVar) {
        boolean z;
        bts btsVar = (bts) fidVar;
        Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        boolean k = btsVar.k(context);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService(AccessibilityManager.class);
            if (accessibilityManager != null) {
                z = true;
                if (accessibilityManager.isEnabled()) {
                }
            }
            z = false;
            Q = Boolean.valueOf(z);
            btsVar.o0(Q);
        }
        return ((Boolean) Q).booleanValue();
    }
}
