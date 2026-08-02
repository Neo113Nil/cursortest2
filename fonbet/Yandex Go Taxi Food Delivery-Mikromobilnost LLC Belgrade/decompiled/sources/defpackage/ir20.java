package defpackage;

import android.util.Log;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ir20 extends d7 implements mse {
    public final /* synthetic */ rot a;
    public final /* synthetic */ StackTraceElement[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir20(rot rotVar, StackTraceElement[] stackTraceElementArr) {
        super(lse.a);
        this.a = rotVar;
        this.b = stackTraceElementArr;
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        this.a.a("Unexpected.Error", th);
        IllegalStateException illegalStateException = new IllegalStateException("No exception handlers defined");
        illegalStateException.setStackTrace(this.b);
        illegalStateException.initCause(th);
        Log.e("MobLog", th.getClass().getSimpleName() + Extension.COLON_SPACE + th.getMessage());
    }
}
