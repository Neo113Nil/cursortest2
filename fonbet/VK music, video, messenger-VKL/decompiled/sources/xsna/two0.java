package xsna;

import com.vk.media.MediaUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: TimelineOutputSizeBuilderHelper.kt */
/* loaded from: classes16.dex */
public final class two0 {
    public static final MediaUtils.d a = new MediaUtils.d(1080, 1920);

    public static MediaUtils.d a(List list, float f) {
        if (list.isEmpty()) {
            return b(a, f);
        }
        int i = 0;
        if (list.size() == 1) {
            return b((MediaUtils.d) list.get(0), f);
        }
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            int i4 = i2 + 1;
            MediaUtils.d dVar = (MediaUtils.d) it.next();
            int max = Math.max(dVar.a, dVar.b);
            if (max > i3) {
                i = i2;
                i2 = i4;
                i3 = max;
            } else {
                i2 = i4;
            }
        }
        return b((MediaUtils.d) list.get(i), f);
    }

    public static MediaUtils.d b(MediaUtils.d dVar, float f) {
        MediaUtils.d dVar2;
        int i = dVar.a;
        int i2 = dVar.b;
        if (i / i2 == f) {
            return c(dVar);
        }
        if (f > 1.0f) {
            dVar2 = new MediaUtils.d(Math.max(i, i2), (int) Math.ceil(r4 / f));
        } else {
            dVar2 = new MediaUtils.d((int) Math.ceil(r4 * f), Math.max(i, i2));
        }
        return c(dVar2);
    }

    public static MediaUtils.d c(MediaUtils.d dVar) {
        float max = Math.max(dVar.b, dVar.a);
        return 3840.0f / max < 1.0f ? new MediaUtils.d((int) ((dVar.a * 3840.0f) / max), (int) ((dVar.b * 3840.0f) / max)) : dVar;
    }
}
