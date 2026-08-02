package xsna;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import xsna.sg90;

/* compiled from: DominantColorUtil.kt */
/* loaded from: classes17.dex */
public final class bwn {
    public final bpn0 a = new bpn0(new gu0(12));

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((sg90.d) t2).e), Integer.valueOf(((sg90.d) t).e));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r2 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Bitmap bitmap) {
        sg90.d dVar;
        sg90.b bVar = new sg90.b(bitmap);
        bVar.d = 256;
        bVar.e = -1;
        List H0 = j5g.H0(j5g.D0(new a(), Collections.unmodifiableList(bVar.b().a)), 5);
        ArrayList arrayList = new ArrayList();
        for (Object obj : H0) {
            sg90.d dVar2 = (sg90.d) obj;
            if (dVar2 != null && dVar2.e / 2 >= 5) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                float f = ((sg90.d) next).b()[1];
                do {
                    Object next2 = it.next();
                    float f2 = ((sg90.d) next2).b()[1];
                    if (Float.compare(f, f2) < 0) {
                        next = next2;
                        f = f2;
                    }
                } while (it.hasNext());
            }
            dVar = (sg90.d) next;
        }
        dVar = (sg90.d) j5g.a0(H0);
        if (dVar == null && (dVar = (sg90.d) j5g.a0(H0)) == null) {
            return -1;
        }
        float[] b = dVar.b();
        b[2] = 0.4f;
        float f3 = b[2];
        for (double e = n8g.e(-1, n8g.a(b)); e < 3.5d && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT; e = n8g.e(-1, n8g.a(b))) {
            f3 = b[2] - 0.01f;
            b[2] = f3;
        }
        int i = n8g.i(n8g.a(b), n8g.l(((Number) this.a.getValue()).intValue(), 30));
        return Color.argb(255, Color.red(i), Color.green(i), Color.blue(i));
    }
}
