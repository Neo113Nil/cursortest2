package ru.mail.libverify.o;

import android.content.Context;
import java.util.ArrayList;
import ru.mail.libverify.p.d;
import ru.mail.libverify.u.w;

/* loaded from: classes9.dex */
public final class g implements e {
    private final w a;
    private final ru.mail.libverify.q.d b;
    private final ru.mail.libverify.i0.a c;
    private final ru.mail.libverify.g0.d d;
    private final ru.mail.libverify.p.c e = ru.mail.libverify.p.c.a();

    public g(w wVar, ru.mail.libverify.q.d dVar, ru.mail.libverify.i0.a aVar, ru.mail.libverify.g0.d dVar2) {
        this.a = wVar;
        this.b = dVar;
        this.c = aVar;
        this.d = dVar2;
    }

    @Override // ru.mail.libverify.o.e
    public final void a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.b);
        ru.mail.libverify.p.c cVar = this.e;
        Context context = this.a.getContext();
        int i = ru.mail.libverify.p.d.k;
        cVar.a(context, new d.a().a(this.a).a().c().a(this.a.getId()).d().a(arrayList).a(this.c).a(this.d.d()).b());
    }

    @Override // ru.mail.libverify.o.e
    public final boolean b() {
        return this.e.b();
    }

    @Override // ru.mail.libverify.o.e
    public final void c() {
        this.e.c();
    }
}
