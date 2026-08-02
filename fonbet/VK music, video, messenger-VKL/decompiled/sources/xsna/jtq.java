package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: FavoritesStickersStorage.kt */
/* loaded from: classes5.dex */
public final class jtq {
    public final m9l0 a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final io.reactivex.rxjava3.subjects.f<List<StickerItem>> c = new io.reactivex.rxjava3.subjects.f<>();
    public List<StickerItem> d = new ArrayList();
    public final int e = 20;

    public jtq(m9l0 m9l0Var, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = m9l0Var;
        this.b = bVar;
    }

    public final void a() {
        HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
        List<atq> d = StickersDatabase.a.b().A().d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (atq atqVar : d) {
            arrayList.add(new StickerItem(atqVar.a, atqVar.b, atqVar.c, atqVar.d, atqVar.e, atqVar.f, atqVar.g, atqVar.h, atqVar.i, atqVar.j));
        }
        this.c.onNext(arrayList);
    }

    public final void b(StickerItem stickerItem, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.d);
        if (z) {
            arrayList.remove(stickerItem);
        } else {
            arrayList.add(0, stickerItem);
            while (arrayList.size() > this.e) {
                arrayList.remove(e43.h(arrayList));
            }
        }
        this.c.onNext(arrayList);
        m9l0 m9l0Var = this.a;
        m9l0Var.a(new jaa0(arrayList, m9l0Var));
    }
}
