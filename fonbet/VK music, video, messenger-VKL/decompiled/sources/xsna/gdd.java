package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.core.files.a;
import com.vk.dto.common.id.UserId;
import java.util.concurrent.Callable;
import xsna.gfc0;
import xsna.hfc0;
import xsna.mny;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class gdd implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gdd(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                mny mnyVar = ((kdd) obj2).d;
                mny.a aVar = mny.a;
                Bitmap e = mnyVar.e(null, bitmap, null);
                return e == null ? bitmap : e;
            case 1:
                gfo gfoVar = (gfo) obj2;
                UserId userId = (UserId) obj;
                Long c = gfoVar.h().y().c(userId);
                long longValue = c != null ? c.longValue() : 0L;
                gfoVar.c.put(userId, Long.valueOf(longValue));
                return Long.valueOf(longValue);
            case 2:
                return ((com.vk.im.ui.components.msg_list.c) obj2).n((izs) obj);
            default:
                Uri uri = (Uri) obj2;
                Uri uri2 = (Uri) obj;
                Context context = e43.a;
                Context context2 = context != null ? context : null;
                return new gfc0.b(uri2.toString(), a.b.c(context2, uri, a.c.c(context2, uri2), new hfc0.a(uri, uri2)));
        }
    }
}
