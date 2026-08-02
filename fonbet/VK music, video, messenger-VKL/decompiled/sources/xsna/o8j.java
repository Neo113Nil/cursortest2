package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import com.vk.im.engine.models.contacts.Contact;
import java.util.Collection;
import xsna.gqu0;

/* compiled from: ContactHintVc.kt */
/* loaded from: classes2.dex */
public final class o8j {
    public final Context a;
    public final gqu0.b b;
    public final Rect c = new Rect();
    public final RectF d = new RectF();
    public com.vk.core.tips.b e;
    public Collection<Contact> f;
    public final p8j g;

    public o8j(Context context, gqu0.b bVar) {
        this.a = context;
        this.b = bVar;
        p8j p8jVar = new p8j(context);
        int i = 0;
        bwt0.i0(p8jVar.v, new com.vk.movika.sdk.base.observable.o(new i2f(0, this, o8j.class, "onHintActionClick", "onHintActionClick()V", i, 2), 23));
        bwt0.i0(p8jVar, new o8(1, this, o8j.class, "onBubbleClick", "onBubbleClick(Landroid/view/View;)V", i, 4));
        this.g = p8jVar;
    }
}
