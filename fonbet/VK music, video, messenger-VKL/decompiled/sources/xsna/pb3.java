package xsna;

import com.vk.log.L;
import ru.mail.verify.core.utils.LogReceiver;

/* compiled from: AppUtils.kt */
/* loaded from: classes11.dex */
public final class pb3 implements LogReceiver {
    @Override // ru.mail.verify.core.utils.LogReceiver
    public final void d(String str, String str2) {
        L.e(str, str2);
    }

    @Override // ru.mail.verify.core.utils.LogReceiver
    public final void e(String str, String str2) {
        L.l(str, str2);
    }

    @Override // ru.mail.verify.core.utils.LogReceiver
    public final void v(String str, String str2) {
        L.A(str, str2);
    }

    @Override // ru.mail.verify.core.utils.LogReceiver
    public final void d(String str, String str2, Throwable th) {
        L.e(th, str, str2);
    }

    @Override // ru.mail.verify.core.utils.LogReceiver
    public final void e(String str, String str2, Throwable th) {
        L.j(th, str, str2);
    }

    @Override // ru.mail.verify.core.utils.LogReceiver
    public final void v(String str, String str2, Throwable th) {
        L.A(th, str, str2);
    }
}
