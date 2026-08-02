package xsna;

import com.vk.dto.photo.Photo;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.i;
import java.util.List;
import xsna.gg1;
import xsna.qfa0;

/* compiled from: AlbumDetailsPopupMenuDelegate.kt */
/* loaded from: classes4.dex */
public final class th1 {
    public final ch1 a;
    public final f4z b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final r7 d;
    public final gg1.d e;
    public final qfa0.b f;

    public th1(ch1 ch1Var, f4z f4zVar, io.reactivex.rxjava3.disposables.b bVar, r7 r7Var, gg1.d dVar, qfa0.b bVar2) {
        this.a = ch1Var;
        this.b = f4zVar;
        this.c = bVar;
        this.d = r7Var;
        this.e = dVar;
        this.f = bVar2;
    }

    public final void a(com.vk.photos.root.albumdetails.presentation.j jVar, a.w wVar) {
        List<Photo> b = jVar.b(wVar.c);
        if (b.isEmpty()) {
            return;
        }
        this.f.m(b);
        this.d.invoke(new a.h(new i.n.a.C1486a(b)));
    }
}
