package xsna;

import android.util.SparseArray;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.id.UserId;
import com.vk.photoviewer.PhotoViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.qe6;

/* compiled from: BaseImageViewer.kt */
/* loaded from: classes7.dex */
public final class te6 implements ImageViewer.c<Object> {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ com.vk.photoviewer.b<?> b;
    public final /* synthetic */ qe6.b<Object> c;

    public te6(PhotoViewer photoViewer, com.vk.photoviewer.b<?> bVar, qe6.b<Object> bVar2, qe6 qe6Var) {
        this.a = photoViewer;
        this.b = bVar;
        this.c = bVar2;
    }

    @Override // com.vk.bridges.ImageViewer.c
    public final void a(boolean z) {
        this.a.g(z);
    }

    @Override // com.vk.bridges.ImageViewer.c
    public final void b(List<? extends Object> list, List<? extends Object> list2) {
        qe6.b<Object> bVar = this.c;
        Long l = bVar.k;
        izs<Object, AttachWithImage> izsVar = bVar.f;
        izs<Object, AttachmentWithMedia> izsVar2 = bVar.e;
        com.vk.photoviewer.b<?> bVar2 = this.b;
        if (bVar2 instanceof q3v0) {
            q3v0 q3v0Var = (q3v0) bVar2;
            List<? extends Object> list3 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(izsVar.invoke(it.next()));
            }
            List<? extends Object> list4 = list2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(izsVar.invoke(it2.next()));
            }
            q3v0Var.f = c5g.v(e43.l(arrayList, q3v0Var.f, arrayList2));
        } else if (bVar2 instanceof z8u0) {
            z8u0 z8u0Var = (z8u0) bVar2;
            List<? extends Object> list5 = list;
            ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
            Iterator<T> it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList3.add(izsVar2.invoke(it3.next()));
            }
            List<? extends Object> list6 = list2;
            ArrayList arrayList4 = new ArrayList(c5g.u(list6, 10));
            Iterator<T> it4 = list6.iterator();
            while (it4.hasNext()) {
                arrayList4.add(izsVar2.invoke(it4.next()));
            }
            z8u0Var.getClass();
        }
        List<? extends Object> list7 = list;
        ArrayList arrayList5 = new ArrayList(c5g.u(list7, 10));
        Iterator<T> it5 = list7.iterator();
        while (it5.hasNext()) {
            arrayList5.add(qe6.m(izsVar2.invoke(it5.next()), l));
        }
        List<? extends Object> list8 = list2;
        ArrayList arrayList6 = new ArrayList(c5g.u(list8, 10));
        Iterator<T> it6 = list8.iterator();
        while (it6.hasNext()) {
            arrayList6.add(qe6.m(izsVar2.invoke(it6.next()), l));
        }
        PhotoViewer photoViewer = this.a;
        ArrayList arrayList7 = photoViewer.p;
        if (arrayList5.isEmpty() && arrayList6.isEmpty()) {
            return;
        }
        PhotoViewer.g gVar = (PhotoViewer.g) arrayList7.get(photoViewer.r);
        arrayList7.addAll(0, arrayList5);
        arrayList7.addAll(arrayList6);
        int indexOf = arrayList7.indexOf(gVar);
        if (photoViewer.r != indexOf) {
            photoViewer.r = indexOf;
        }
        q4a0 q4a0Var = photoViewer.q;
        ArrayList arrayList8 = q4a0Var.j;
        arrayList8.addAll(0, arrayList5);
        arrayList8.addAll(arrayList6);
        q4a0Var.notifyDataSetChanged();
    }

    @Override // com.vk.bridges.ImageViewer.c
    public final void c(List<? extends Object> list) {
        List<? extends Object> list2 = list;
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
    public final void d(boolean z) {
        UserId userId = this.c.j;
        q4a0 q4a0Var = this.a.q;
        SparseArray<ggs> sparseArray = q4a0Var.k;
        Integer num = q4a0Var.p;
        ggs ggsVar = sparseArray.get(num != null ? num.intValue() : 0);
        k120 k120Var = ggsVar instanceof k120 ? (k120) ggsVar : null;
        if (k120Var != null) {
            k120Var.f(userId, z);
        }
    }

    @Override // com.vk.bridges.ImageViewer.c
    public final int e() {
        return this.a.r;
    }
}
