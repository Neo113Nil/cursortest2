package xsna;

import com.vk.knet.core.exceptions.CauseException;

/* compiled from: HttpContext.kt */
/* loaded from: classes2.dex */
public final class wiv {
    public volatile Exception a;

    public final Throwable a(Exception exc) {
        Exception exc2 = this.a;
        if (exc2 != null) {
            try {
                mnh0.d(exc, new CauseException(exc2));
            } catch (Throwable unused) {
            }
        }
        this.a = exc;
        return exc;
    }
}
