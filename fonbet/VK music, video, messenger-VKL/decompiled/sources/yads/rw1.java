package yads;

import java.util.Arrays;
import org.json.JSONObject;
import xsna.ss9;

/* loaded from: classes10.dex */
public final class rw1 {
    public final ic2 a;

    public rw1(ix1 ix1Var) {
        this.a = ix1Var;
    }

    public final void a(String str) {
        this.a.loadUrl("javascript: " + str);
    }

    public final void b(String str) {
        a(String.format("window.mraidbridge.%s", Arrays.copyOf(new Object[]{str}, 1)));
    }

    public final void a(ge1... ge1VarArr) {
        int i = 0;
        if (ge1VarArr.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("fireChangeEvent({");
        int length = ge1VarArr.length;
        String str = "";
        while (i < length) {
            ge1 ge1Var = ge1VarArr[i];
            sb.append(str);
            sb.append(ge1Var.a());
            i++;
            str = ", ";
        }
        sb.append("})");
        b(sb.toString());
    }

    public final void a(cx1 cx1Var, String str) {
        b(ss9.a("notifyErrorEvent(", JSONObject.quote(cx1Var.a()), ", ", JSONObject.quote(str), ")"));
    }

    public final void a(cx1 cx1Var) {
        b("nativeCallComplete(" + JSONObject.quote(cx1Var.a()) + ")");
    }
}
