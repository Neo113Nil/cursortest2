package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.internal.images.b;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class ic3 {
    public final h3y a;
    public final r6e b;
    public final Context c;

    public ic3(h3y h3yVar, r6e r6eVar, Context context) {
        this.a = h3yVar;
        this.b = r6eVar;
        this.c = context;
    }

    public static String a(String str, Point point) {
        Uri.parse(str);
        int i = point.x;
        int i2 = point.y;
        ScaleMode scaleMode = ScaleMode.FIT_CENTER;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (i != -1 || i2 != -1) {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
        }
        if (scaleMode != null) {
            arrayList.add(scaleMode);
        }
        return n8u.a(arrayList.toArray(new Object[0]));
    }

    public final void b(String str, AttachInfo attachInfo) {
        int i = attachInfo.width;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(attachInfo.height);
        r6e r6eVar = this.b;
        int i2 = r6eVar.d;
        if (i2 > 0) {
            i = i2;
        }
        Point a = r6eVar.a(i, valueOf, valueOf2);
        String a2 = a(b.f(str), a);
        if (a2 == null) {
            return;
        }
        String str2 = attachInfo.existingId;
        h3y h3yVar = this.a;
        if (str2 != null) {
            String a3 = a(attachInfo.uri.toString(), a);
            if (a3 == null) {
                return;
            }
            ((xav) h3yVar.get()).b(a3, a2);
            return;
        }
        try {
            ((xav) h3yVar.get()).e(d5b1.h(this.c, attachInfo.uri, a.x, a.y, ScaleMode.FIT_CENTER), a2);
        } catch (IOException e) {
            if (ydz.a.a()) {
                ydz.c("AttachmentsCacheController", "Couldn't decode original image", e);
            }
        }
    }
}
