package xsna;

import androidx.annotation.Nullable;
import java.util.Stack;

/* compiled from: TrimmedThrowableData.java */
/* loaded from: classes13.dex */
public final class hrp0 {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;

    @Nullable
    public final hrp0 d;

    public hrp0(String str, String str2, StackTraceElement[] stackTraceElementArr, @Nullable hrp0 hrp0Var) {
        this.a = str;
        this.b = str2;
        this.c = stackTraceElementArr;
        this.d = hrp0Var;
    }

    public static hrp0 a(Throwable th, yl20 yl20Var) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        hrp0 hrp0Var = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            hrp0Var = new hrp0(th2.getLocalizedMessage(), th2.getClass().getName(), yl20Var.a(th2.getStackTrace()), hrp0Var);
        }
        return hrp0Var;
    }
}
