package xsna;

import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.niz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class o2z0 {
    public static final WeakHashMap c = new WeakHashMap();
    public final ArrayList a;
    public b b;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface b {
        void a(boolean z);
    }

    public o2z0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public static o2z0 a(ArrayList arrayList) {
        return b(arrayList, 0, giy0.d);
    }

    public static o2z0 b(ArrayList arrayList, int i, giy0 giy0Var) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new wdz0((kiw) it.next(), giy0Var, i));
        }
        return new o2z0(arrayList2);
    }

    public static void c(Bitmap bitmap, ImageView imageView) {
        if (!(imageView instanceof whz0)) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        whz0 whz0Var = (whz0) imageView;
        whz0Var.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        whz0Var.setImageBitmap(bitmap);
        whz0Var.animate().alpha(1.0f).setDuration(300L);
    }

    public static void d(kiw kiwVar, ImageView imageView) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            gu8.e(null, "ImageLoaderUtils: Method cancel called from worker thread");
            return;
        }
        WeakHashMap weakHashMap = c;
        if (weakHashMap.get(imageView) == kiwVar) {
            weakHashMap.remove(imageView);
        }
    }

    public static void e(kiw kiwVar, ImageView imageView, b bVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            gu8.e(null, "ImageLoaderUtils: Method loadAndDisplay called from worker thread");
            return;
        }
        WeakHashMap weakHashMap = c;
        if (weakHashMap.get(imageView) == kiwVar) {
            return;
        }
        weakHashMap.remove(imageView);
        if (kiwVar.a() != null) {
            c(kiwVar.a(), imageView);
            return;
        }
        weakHashMap.put(imageView, kiwVar);
        WeakReference weakReference = new WeakReference(imageView);
        giy0 giy0Var = giy0.d;
        ArrayList arrayList = new ArrayList();
        arrayList.add(kiwVar);
        o2z0 b2 = b(arrayList, 0, giy0Var);
        b2.b = new pjq(weakReference, kiwVar, bVar);
        if (!b2.a.isEmpty()) {
            b2.f(new uxb0(b2, 23));
        } else {
            if (b2.b == null) {
                return;
            }
            o8z0.d(new vb(b2, 22));
        }
    }

    public final void f(b bVar) {
        AtomicInteger atomicInteger = new AtomicInteger(this.a.size());
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            wdz0 wdz0Var = (wdz0) it.next();
            kiw kiwVar = (kiw) wdz0Var.a;
            if (kiwVar.a() != null) {
                atomicInteger.decrementAndGet();
                i++;
            } else {
                String str = kiwVar.a;
                b bVar2 = bVar;
                a aVar = new a(kiwVar, wdz0Var, str, atomicInteger, bVar2);
                r1z0 r1z0Var = r1z0.b;
                if (r1z0Var == null) {
                    synchronized (r1z0.class) {
                        try {
                            r1z0Var = r1z0.b;
                            if (r1z0Var == null) {
                                r1z0Var = new r1z0();
                                r1z0.b = r1z0Var;
                            }
                        } finally {
                        }
                    }
                }
                o8z0.a.execute(new v4h0(r1z0Var, str, aVar, 2));
                bVar = bVar2;
            }
        }
        b bVar3 = bVar;
        if (i == this.a.size()) {
            bVar3.a(true);
        }
    }

    public final void g() {
        if (o8z0.b()) {
            gu8.e(null, "ImageLoaderUtils: Method load called from main thread");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        f(new fe60(countDownLatch, 18));
        try {
            countDownLatch.await();
            gu8.c(null, "ImageLoaderUtils: success media loading");
        } catch (InterruptedException unused) {
            gu8.c(null, "ImageLoaderUtils: awaiting media files load failed");
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements niz0.a {
        public final /* synthetic */ kiw a;
        public final /* synthetic */ wdz0 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ AtomicInteger d;
        public final /* synthetic */ b e;

        public a(kiw kiwVar, wdz0 wdz0Var, String str, AtomicInteger atomicInteger, b bVar) {
            this.a = kiwVar;
            this.b = wdz0Var;
            this.c = str;
            this.d = atomicInteger;
            this.e = bVar;
        }

        @Override // xsna.niz0.a
        public final void a(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            kiw kiwVar = this.a;
            if (!kiwVar.e) {
                kiwVar.d = bitmap;
            } else if (bitmap == null) {
                kiw.f.remove(kiwVar.a);
            } else {
                kiw.f.put(kiwVar.a, bitmap);
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            kiw kiwVar2 = this.a;
            if (kiwVar2.c == 0 || kiwVar2.b == 0) {
                kiwVar2.c = height;
                kiwVar2.b = width;
            }
            int i = kiwVar2.b;
            int i2 = kiwVar2.c;
            if (i != width || i2 != height) {
                gu8.f(null, String.format(Locale.getDefault(), "JSON image params (%d x %d) differ than loaded bitmap params (%d x %d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(width), Integer.valueOf(height)));
            }
            if (this.d.decrementAndGet() == 0) {
                this.e.a(true);
            }
        }

        @Override // xsna.niz0.a
        public final void a() {
            wdz0 wdz0Var = this.b;
            wdz0Var.b.g(wdz0Var.c, 4001, "imageUrl=" + this.c);
            if (this.d.decrementAndGet() == 0) {
                this.e.a(true);
            }
        }
    }
}
