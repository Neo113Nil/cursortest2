package xsna;

import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.photoviewer.ClippingImageView;
import com.vk.photoviewer.PhotoViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.qe6;

/* compiled from: BaseImageViewer.kt */
/* loaded from: classes7.dex */
public final class se6 implements ImageViewer.e<Object> {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ com.vk.photoviewer.b<?> b;
    public final /* synthetic */ qe6.b<Object> c;

    public se6(PhotoViewer photoViewer, com.vk.photoviewer.b<?> bVar, qe6.b<Object> bVar2, qe6 qe6Var) {
        this.a = photoViewer;
        this.b = bVar;
        this.c = bVar2;
    }

    @Override // com.vk.bridges.ImageViewer.c
    public final void a(boolean z) {
        this.a.g(z);
    }

    @Override // com.vk.bridges.ImageViewer.c
    public final void c(List<Object> list) {
        List<Object> list2 = list;
        qe6.b<Object> bVar = this.c;
        izs<Object, AttachmentWithMedia> izsVar = bVar.e;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(qe6.m(izsVar.invoke(it.next()), bVar.k));
        }
        PhotoViewer photoViewer = this.a;
        photoViewer.p.addAll(arrayList);
        q4a0 q4a0Var = photoViewer.q;
        q4a0Var.j.addAll(arrayList);
        q4a0Var.notifyDataSetChanged();
        photoViewer.onPageSelected(photoViewer.r);
        com.vk.photoviewer.b<?> bVar2 = this.b;
        if (bVar2 instanceof q3v0) {
            q3v0 q3v0Var = (q3v0) bVar2;
            izs<Object, AttachWithImage> izsVar2 = bVar.f;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(izsVar2.invoke(it2.next()));
            }
            q3v0Var.f = j5g.u0(arrayList2, q3v0Var.f);
            return;
        }
        if (bVar2 instanceof z8u0) {
            z8u0 z8u0Var = (z8u0) bVar2;
            ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(izsVar.invoke(it3.next()));
            }
            z8u0Var.Q(arrayList3);
        }
    }

    @Override // com.vk.bridges.ImageViewer.c
    public final int e() {
        return -1;
    }

    @Override // com.vk.bridges.ImageViewer.e
    public final void m() {
        RectF rectF = PhotoViewer.U;
        this.a.o(false);
    }

    @Override // com.vk.bridges.ImageViewer.e
    public final void n(float f, float f2, float f3, float f4, float f5) {
        PhotoViewer photoViewer = this.a;
        ClippingImageView clippingImageView = photoViewer.q.l.get(photoViewer.r);
        if (photoViewer.l == null || clippingImageView == null || !photoViewer.Q) {
            photoViewer.R *= f3;
            return;
        }
        float f6 = photoViewer.O * f3;
        photoViewer.O = f6;
        mrx0 mrx0Var = photoViewer.N;
        una0 una0Var = null;
        if (mrx0Var == null) {
            mrx0Var = null;
        }
        boolean z = photoViewer.e;
        float f7 = mrx0Var.f;
        float f8 = mrx0Var.e;
        if (mrx0Var.a != null) {
            float max = Math.max(r4.width() / f8, r4.height() / f7);
            float min = (Float.isNaN(max) || Math.abs(max) > Float.MAX_VALUE || z) ? 1.0f : Math.min(max, 1.0f);
            float b = bn10.b(f6, 0.2f, 3.0f);
            float f9 = min >= 0.7f ? 2.0f * min : 1.0f;
            float b2 = !z ? bn10.b(bn10.b((b - min) / (f9 - min), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) : 0.0f;
            float f10 = b2 / f9;
            float b3 = u11.b(f8, r4.width(), f10, r4.width());
            float b4 = u11.b(f7, r4.height(), f10, r4.height());
            float max2 = min < b ? Math.max(b, 1.0f) : Math.max(bn10.b((b - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / (min - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), 0.2f);
            float f11 = 2;
            float f12 = b3 / f11;
            float f13 = (f12 - f) / f12;
            float f14 = b4 / f11;
            una0Var = new una0(b2, max2, b3, b4, wq.a(r4.width(), b3, f11, r4.left + ((((b3 * max2) - b3) / f11) * f13) + f4), wq.a(r4.height(), b4, f11, r4.top + ((((b4 * max2) - b4) / f11) * ((f14 - f2) / f14)) + f5));
        }
        if (una0Var == null) {
            return;
        }
        float f15 = una0Var.b;
        Iterator it = photoViewer.J.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(una0Var.a);
        }
        clippingImageView.setScaleX(f15);
        clippingImageView.setScaleY(f15);
        clippingImageView.setX(una0Var.e);
        clippingImageView.setY(una0Var.f);
        twt0.g(an10.b(una0Var.c), an10.b(una0Var.d), clippingImageView);
    }

    @Override // com.vk.bridges.ImageViewer.c
    public final void d(boolean z) {
    }

    @Override // com.vk.bridges.ImageViewer.c
    public final void b(List<Object> list, List<Object> list2) {
    }
}
