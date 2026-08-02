package xsna;

import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.bj1;
import xsna.m7a0;

/* compiled from: AlbumPhotoEventsHandlerImpl.kt */
/* loaded from: classes4.dex */
public final class ej1 implements bj1 {
    public final cj1 a;
    public final dj1 b;

    public ej1() {
        int i = 0;
        this.a = new cj1(i);
        this.b = new dj1(i);
    }

    @Override // xsna.bj1
    public final void a(ArrayList arrayList, m7a0 m7a0Var, bj1.a aVar) {
        Object obj;
        if (m7a0Var instanceof m7a0.a) {
            c(arrayList, (m7a0.a) m7a0Var, aVar);
            return;
        }
        if (m7a0Var instanceof m7a0.b) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (Photo photo : ((m7a0.b) m7a0Var).a) {
                hashSet.add(Integer.valueOf(photo.d));
                hashSet2.add(Integer.valueOf(photo.c));
            }
            d(arrayList, hashSet, hashSet2, aVar);
            return;
        }
        if (m7a0Var instanceof m7a0.d) {
            return;
        }
        if (!(m7a0Var instanceof m7a0.e)) {
            if (!(m7a0Var instanceof m7a0.f) && !(m7a0Var instanceof m7a0.g) && !(m7a0Var instanceof m7a0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        m7a0.e eVar = (m7a0.e) m7a0Var;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((PhotoAlbum) obj).b == eVar.a) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        PhotoAlbum photoAlbum = (PhotoAlbum) obj;
        if (photoAlbum != null) {
            aVar.b(photoAlbum.b, this.b);
        }
        if (photoAlbum != null) {
            aVar.a(photoAlbum);
        }
    }

    @Override // xsna.bj1
    public final void b(ArrayList arrayList, nda0 nda0Var, bj1.a aVar) {
        if (nda0Var instanceof s4a0) {
            s4a0 s4a0Var = (s4a0) nda0Var;
            c(arrayList, new m7a0.a(s4a0Var.a, Collections.singletonList(s4a0Var.b)), aVar);
        } else {
            if (!(nda0Var instanceof zaa0)) {
                throw new NoWhenBranchMatchedException();
            }
            zaa0 zaa0Var = (zaa0) nda0Var;
            d(arrayList, Collections.singleton(Integer.valueOf(zaa0Var.a)), Collections.singleton(Integer.valueOf(zaa0Var.b)), aVar);
        }
    }

    public final void c(ArrayList arrayList, m7a0.a aVar, bj1.a aVar2) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((PhotoAlbum) obj).b == aVar.a) {
                    break;
                }
            }
        }
        PhotoAlbum photoAlbum = (PhotoAlbum) obj;
        if (photoAlbum != null) {
            aVar2.b(photoAlbum.b, this.b);
        }
        if (photoAlbum != null) {
            aVar2.a(photoAlbum);
        }
    }

    public final void d(ArrayList arrayList, Set set, Set set2, bj1.a aVar) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (set.contains(Integer.valueOf(((PhotoAlbum) obj).b))) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            PhotoAlbum photoAlbum = (PhotoAlbum) it.next();
            aVar.b(photoAlbum.b, this.a);
            if (set2.contains(Integer.valueOf(photoAlbum.m))) {
                aVar.a(photoAlbum);
            }
        }
    }
}
