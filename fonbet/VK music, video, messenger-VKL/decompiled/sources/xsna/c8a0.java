package xsna;

import com.vk.dto.photo.Photo;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.photos.root.photoflow.presentation.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.b9a0;
import xsna.qfa0;
import xsna.tlo0;

/* compiled from: PhotoFlowPopupMenuDelegate.kt */
/* loaded from: classes4.dex */
public final class c8a0 {
    public final ysg0<m7a0> a;
    public final x7a0 b;
    public final AlbumsRepository c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final uh40 e;
    public final q130 f;
    public final zb60 g;
    public final qfa0.k h;

    public c8a0(ysg0 ysg0Var, x7a0 x7a0Var, AlbumsRepository albumsRepository, io.reactivex.rxjava3.disposables.b bVar, uh40 uh40Var, q130 q130Var, zb60 zb60Var, qfa0.k kVar) {
        this.a = ysg0Var;
        this.b = x7a0Var;
        this.c = albumsRepository;
        this.d = bVar;
        this.e = uh40Var;
        this.f = q130Var;
        this.g = zb60Var;
        this.h = kVar;
    }

    public final void a(List<? extends Photo> list) {
        if (list.isEmpty()) {
            return;
        }
        List<? extends Photo> list2 = list;
        int i = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (fcg0.a.contains(Integer.valueOf(((Photo) it.next()).d)) && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!fcg0.a.contains(Integer.valueOf(((Photo) obj).d))) {
                arrayList.add(obj);
            }
        }
        int i2 = list.size() == 1 ? R.string.photo_flow_confirm_archive_photo_title : R.string.photo_flow_confirm_archive_photos_title;
        if (i > 0) {
            this.g.invoke(new b9a0.c.C2599c(new b5(this, arrayList, list, 2), new tlo0.f(i2), tq.h(tlo0.Companion, i == 1 ? R.string.photo_flow_confirm_move_photo_from_system_album_archive : R.string.photo_flow_confirm_move_photos_from_system_album_archive)));
        } else {
            this.h.j(arrayList);
            this.f.invoke(new a.b(arrayList, list));
        }
    }
}
