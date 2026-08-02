package defpackage;

import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class k0h implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ k0h(n0h n0hVar, boolean z, boolean z2, cmd0 cmd0Var, String str) {
        this.w = n0hVar;
        this.b = z;
        this.c = z2;
        this.x = cmd0Var;
        this.y = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.a;
        r2 = false;
        boolean z = false;
        Object obj = this.y;
        Object obj2 = this.x;
        boolean z2 = this.c;
        Object obj3 = this.w;
        boolean z3 = this.b;
        switch (i) {
            case 0:
                cmd0 cmd0Var = (cmd0) obj2;
                String str = (String) obj;
                Map map = (Map) ((n0h) obj3).d.getValue();
                String[] strArr = {"BROADCASTING", "UPD_TARGETS", "SMART_WEBVIEW", "SERVICE_INFORMATION", "MINI_STORIES", z3 ? "COOKIE_INJECT" : null, "CARD_OVER_BRIDGE", "CARD_OVER_BRIDGE", "PAY_BUTTON_CONFIG", "ANDROID_SELL_IN_STORY", "NATIVE_PURCHASE", "INAPP_PURCHASE", "HOST_PURCHASE", "PURCHASE_TARIFFICATOR", z2 ? "BANK" : null, z2 ? "WALLET" : null, "BACKGROUND_FOREGROUND_MESSAGES", "OVERLAP_MESSAGES", "NATIVE_VIBRATE"};
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < 19; i2++) {
                    String str2 = strArr[i2];
                    if (str2 != null) {
                        linkedHashSet.add(str2);
                    }
                }
                return b.n(map, b.i(new Pair("available_features", linkedHashSet), new Pair("loyalty[0].currency", u4r0.e(cmd0Var != null ? cmd0Var.b : null)), new Pair("loyalty[0].amount", u4r0.e(cmd0Var != null ? Double.valueOf(cmd0Var.a).toString() : null)), new Pair("from", u4r0.e(str))));
            default:
                androidx.compose.foundation.lazy.b bVar = (androidx.compose.foundation.lazy.b) obj3;
                oz40 oz40Var = (oz40) obj2;
                oz40 oz40Var2 = (oz40) obj;
                if (!z3) {
                    Object[] objArr = bVar.h() == 0 && bVar.i() == 0;
                    boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
                    if (z2) {
                        if (!((Boolean) oz40Var2.getValue()).booleanValue()) {
                            if (!booleanValue) {
                            }
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ k0h(boolean z, androidx.compose.foundation.lazy.b bVar, boolean z2, oz40 oz40Var, oz40 oz40Var2) {
        this.b = z;
        this.w = bVar;
        this.c = z2;
        this.x = oz40Var;
        this.y = oz40Var2;
    }
}
