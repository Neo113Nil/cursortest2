package defpackage;

import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.UnsupportedMessageData;
import java.util.Date;

/* loaded from: classes15.dex */
public final class gmn implements s3z {
    @Override // defpackage.s3z
    public final /* bridge */ /* synthetic */ Object g(Date date, String str, UnsupportedMessageData unsupportedMessageData) {
        return null;
    }

    @Override // defpackage.s3z
    public final /* bridge */ /* synthetic */ Object k(Date date, TechBaseMessage techBaseMessage, String str, boolean z) {
        return null;
    }

    @Override // defpackage.s3z
    public final /* bridge */ /* synthetic */ Object l(Date date) {
        return null;
    }

    @Override // defpackage.s3z
    public final /* bridge */ /* synthetic */ Object m(Date date, RemovedMessageData removedMessageData) {
        return null;
    }

    @Override // defpackage.s3z
    public final Object o(my40 my40Var, boolean z) {
        MessageData messageData = my40Var.g;
        if (messageData instanceof GalleryMessageData) {
            return (GalleryMessageData) messageData;
        }
        return null;
    }
}
