package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AvatarDataSource.java */
/* loaded from: classes2.dex */
public final class dr5 extends ae<uvf<svf>> {
    public final iez<svf> h;

    /* compiled from: AvatarDataSource.java */
    public class a extends ic6<List<uvf<svf>>> {
        public a() {
        }

        @Override // xsna.ic6
        public final void e(zuk<List<uvf<svf>>> zukVar) {
            dr5.this.j(null, false, null);
        }

        @Override // xsna.ic6
        public final void f(zuk<List<uvf<svf>>> zukVar) {
            dr5.this.j(dr5.n(zukVar.getResult()), true, null);
        }
    }

    public dr5(ArrayList<zuk<uvf<svf>>> arrayList) {
        iez<svf> l = iez.l((zuk[]) arrayList.toArray(new zuk[0]));
        this.h = l;
        l.d(new a(), ac9.b);
    }

    public static dr5 l(Uri uri) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= 4) {
                break;
            }
            String queryParameter = uri.getQueryParameter("photo" + i);
            if (queryParameter == null) {
                break;
            }
            arrayList.add(rhs.b().a(queryParameter.length() != 0 ? ImageRequest.a(Uri.parse(queryParameter)) : null, null, lpa0.q(AbstractDraweeControllerBuilder.CacheLevel.FULL_FETCH), null, null));
            i++;
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return new dr5(arrayList);
    }

    public static void m(int i, int i2, Rect rect, Rect rect2, int i3, int i4, int i5) {
        if (i2 == 2) {
            if (i == 0) {
                rect2.set(0, 0, i3 / 2, i3);
                int i6 = i4 / 4;
                rect.set(i6, 0, i6 * 3, i5);
                return;
            } else {
                rect2.set(i3 / 2, 0, i3, i3);
                int i7 = i4 / 4;
                rect.set(i7, 0, i7 * 3, i5);
                return;
            }
        }
        if (i2 == 3) {
            if (i == 0) {
                rect2.set(0, 0, i3 / 2, i3);
                int i8 = i4 / 4;
                rect.set(i8, 0, i8 * 3, i5);
                return;
            } else if (i == 1) {
                int i9 = i3 / 2;
                rect2.set(i9, 0, i3, i9);
                rect.set(0, 0, i4, i5);
                return;
            } else {
                int i10 = i3 / 2;
                rect2.set(i10, i10, i3, i3);
                rect.set(0, 0, i4, i5);
                return;
            }
        }
        if (i2 == 4) {
            if (i == 0) {
                int i11 = i3 / 2;
                rect2.set(0, 0, i11, i11);
                rect.set(0, 0, i4, i5);
            } else if (i == 1) {
                int i12 = i3 / 2;
                rect2.set(0, i12, i12, i3);
                rect.set(0, 0, i4, i5);
            } else if (i == 2) {
                int i13 = i3 / 2;
                rect2.set(i13, 0, i3, i13);
                rect.set(0, 0, i4, i5);
            } else {
                int i14 = i3 / 2;
                rect2.set(i14, i14, i3, i3);
                rect.set(0, 0, i4, i5);
            }
        }
    }

    public static uvf<svf> n(List<uvf<svf>> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        hta0 g = rhs.c().g();
        int i = (int) (Resources.getSystem().getDisplayMetrics().density * 64.0f);
        g.getClass();
        uvf<Bitmap> c = g.c(i, i, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(c.r());
            Rect rect = (Rect) fkw.b.get();
            Rect rect2 = (Rect) fkw.c.get();
            int min = Math.min(list.size(), 4);
            for (int i2 = 0; i2 < min; i2++) {
                uvf<svf> uvfVar = list.get(i2);
                try {
                    svf r = uvfVar.r();
                    if (r instanceof qvf) {
                        Bitmap W3 = ((qvf) r).W3();
                        m(i2, min, rect, rect2, i, W3.getWidth(), W3.getHeight());
                        canvas.drawBitmap(W3, rect, rect2, fkw.a);
                    }
                    uvfVar.close();
                } catch (Throwable th) {
                    uvf.q(uvfVar);
                    throw th;
                }
            }
            kcl v = uvf.v(xvf.B2(c, gpw.d, 0, 0));
            c.close();
            return v;
        } catch (Throwable th2) {
            c.close();
            throw th2;
        }
    }

    @Override // xsna.ae, xsna.zuk
    public final synchronized boolean a() {
        if (super.a()) {
            return true;
        }
        return this.h.a();
    }

    @Override // xsna.ae, xsna.zuk
    public final boolean close() {
        return this.h.close();
    }

    @Override // xsna.ae, xsna.zuk
    public final Object getResult() {
        uvf uvfVar;
        synchronized (this) {
            try {
                if (!super.a() && this.h.a()) {
                    j(n(this.h.getResult()), true, null);
                }
                uvfVar = (uvf) super.getResult();
            } catch (Throwable th) {
                throw th;
            }
        }
        return uvfVar;
    }
}
