package xsna;

import com.vk.fcmerrorhandler.taostutils.EventType;

/* compiled from: FcmErrorHandlerImpl.kt */
/* loaded from: classes18.dex */
public final class qtq implements tmv {
    public final ttq a = new ttq();

    @Override // xsna.tmv
    public final void b(EventType eventType) {
        ttq.a();
        this.a.c(eventType);
    }

    public final void c(Throwable th) {
        if (th.getMessage() == null) {
            return;
        }
        ttq.b(th).a().a();
    }
}
