package com.yandex.passport.legacy.lx;

/* loaded from: classes8.dex */
public final class c implements a {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ a c;
    public final /* synthetic */ f w;

    public /* synthetic */ c(f fVar, n nVar, a aVar, int i) {
        this.a = i;
        this.w = fVar;
        this.b = nVar;
        this.c = aVar;
    }

    @Override // com.yandex.passport.legacy.lx.a
    /* renamed from: a */
    public final void mo290a(Object obj) {
        int i = this.a;
        f fVar = this.w;
        switch (i) {
            case 0:
                fVar.c.post(new b(this, obj));
                break;
            default:
                fVar.c.post(new androidx.core.app.c(this, (Throwable) obj));
                break;
        }
    }
}
