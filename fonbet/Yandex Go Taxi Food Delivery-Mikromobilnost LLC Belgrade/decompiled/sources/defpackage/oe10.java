package defpackage;

import android.content.res.Resources;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.MediaMessageData;

/* loaded from: classes15.dex */
public final class oe10 extends me10 {
    public final /* synthetic */ MediaMessageData b;
    public final /* synthetic */ pe10 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe10(Resources resources, MediaMessageData mediaMessageData, pe10 pe10Var) {
        super(resources);
        this.b = mediaMessageData;
        this.c = pe10Var;
    }

    @Override // defpackage.me10, com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    /* renamed from: i */
    public final String e(GalleryMessageData galleryMessageData) {
        MediaMessageData mediaMessageData = this.b;
        String str = mediaMessageData.text;
        if (str == null || str.length() == 0) {
            return super.e(galleryMessageData);
        }
        return ((v3k0) ((noy0) this.c.c)).b(0, mediaMessageData.text).toString();
    }
}
