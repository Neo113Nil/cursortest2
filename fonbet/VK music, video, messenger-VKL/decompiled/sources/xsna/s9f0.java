package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: RecentStickersStorage.kt */
/* loaded from: classes5.dex */
public final class s9f0 {
    public final m9l0 a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final io.reactivex.rxjava3.subjects.f<List<StickerItem>> c = new io.reactivex.rxjava3.subjects.f<>();
    public List<StickerItem> d = new ArrayList();
    public final int e = 32;

    public s9f0(m9l0 m9l0Var, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = m9l0Var;
        this.b = bVar;
    }

    public final void a() {
        HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
        List<f4l0> i = StickersDatabase.a.b().E().i();
        ArrayList arrayList = new ArrayList(c5g.u(i, 10));
        for (f4l0 f4l0Var : i) {
            arrayList.add(new StickerItem(f4l0Var.a, f4l0Var.b, f4l0Var.c, f4l0Var.d, f4l0Var.e, f4l0Var.f, f4l0Var.g, f4l0Var.h, f4l0Var.i, f4l0Var.j));
        }
        this.c.onNext(arrayList);
    }
}
