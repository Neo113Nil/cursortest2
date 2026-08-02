package xsna;

/* compiled from: MiddleOutFallbackStrategy.java */
/* loaded from: classes.dex */
public final class yl20 implements pok0 {
    public final pok0[] a;
    public final qz9 b = new qz9();

    public yl20(pok0... pok0VarArr) {
        this.a = pok0VarArr;
    }

    @Override // xsna.pok0
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            pok0 pok0Var = this.a[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = pok0Var.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? this.b.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
