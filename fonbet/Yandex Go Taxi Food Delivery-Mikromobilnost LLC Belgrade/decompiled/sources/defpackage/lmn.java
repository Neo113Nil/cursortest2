package defpackage;

import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.UnsupportedMessageData;
import java.util.Date;

/* loaded from: classes15.dex */
public final class lmn implements s3z {
    @Override // defpackage.s3z
    public final Object g(Date date, String str, UnsupportedMessageData unsupportedMessageData) {
        throw new IllegalStateException("unavailable");
    }

    @Override // defpackage.s3z
    public final Object k(Date date, TechBaseMessage techBaseMessage, String str, boolean z) {
        throw new IllegalStateException("unavailable");
    }

    @Override // defpackage.s3z
    public final Object l(Date date) {
        throw new IllegalStateException("unavailable");
    }

    @Override // defpackage.s3z
    public final Object m(Date date, RemovedMessageData removedMessageData) {
        throw new IllegalStateException("unavailable");
    }

    @Override // defpackage.s3z
    public final Object o(my40 my40Var, boolean z) {
        z83.c(null, my40Var.c);
        return Boolean.valueOf(Boolean.TRUE.equals(my40Var.g.urlPreviewDisabled));
    }
}
