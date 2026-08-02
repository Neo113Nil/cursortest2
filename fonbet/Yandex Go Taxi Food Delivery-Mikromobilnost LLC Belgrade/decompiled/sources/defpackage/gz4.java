package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class gz4 extends d7 implements mse {
    public final /* synthetic */ int a;
    public final /* synthetic */ StackTraceElement[] b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gz4(StackTraceElement[] stackTraceElementArr, int i) {
        super(r0);
        this.a = i;
        lse lseVar = lse.a;
        this.b = stackTraceElementArr;
        switch (i) {
            case 1:
                super(lseVar);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        int i = this.a;
        x4c x4cVar = pse.b;
        StackTraceElement[] stackTraceElementArr = this.b;
        switch (i) {
            case 0:
                IllegalStateException illegalStateException = new IllegalStateException("No exception handlers defined");
                illegalStateException.setStackTrace(stackTraceElementArr);
                illegalStateException.initCause(th);
                String p = g8e.p(th.getClass().getSimpleName(), Extension.COLON_SPACE, th.getMessage());
                xby.d.x(illegalStateException, "Unexpected exception " + p + " in " + fseVar.get(x4cVar));
                break;
            default:
                IllegalStateException illegalStateException2 = new IllegalStateException("No exception handlers defined");
                illegalStateException2.setStackTrace(stackTraceElementArr);
                illegalStateException2.initCause(th);
                String p2 = g8e.p(th.getClass().getSimpleName(), Extension.COLON_SPACE, th.getMessage());
                xby.l(xby.d, "UncaughtException", null, illegalStateException2, "Unexpected exception " + p2 + " in " + fseVar.get(x4cVar), 2);
                break;
        }
    }
}
