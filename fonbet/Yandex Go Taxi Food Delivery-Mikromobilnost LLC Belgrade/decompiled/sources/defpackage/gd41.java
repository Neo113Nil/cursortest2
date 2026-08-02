package defpackage;

import com.yandex.quark.webchat.feature.delegate.b;

/* loaded from: classes8.dex */
public final /* synthetic */ class gd41 implements oe41 {
    public final /* synthetic */ b a;

    public /* synthetic */ gd41(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.oe41
    public final void onDestroy() {
        b bVar = this.a;
        bVar.f.dispose();
        bvf0.j(bVar.e, null);
        bVar.c.p.onDestroy();
    }
}
