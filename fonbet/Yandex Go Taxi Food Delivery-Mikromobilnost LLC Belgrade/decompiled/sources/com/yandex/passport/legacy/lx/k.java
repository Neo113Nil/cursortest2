package com.yandex.passport.legacy.lx;

/* loaded from: classes15.dex */
public final class k extends m {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ m e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, m mVar2, Object obj, int i) {
        super(mVar2);
        this.c = i;
        this.e = mVar;
        this.d = obj;
    }

    @Override // com.yandex.passport.legacy.lx.m
    public final Object c() {
        int i = this.c;
        Object obj = this.d;
        m mVar = this.e;
        switch (i) {
            case 0:
                Object call = ((l) mVar).c.call();
                b();
                m mVar2 = (m) ((com.yandex.passport.internal.network.requester.e) obj).a(call);
                b();
                return mVar2.c();
            case 1:
                Object c = ((k) mVar).c();
                b();
                ((com.yandex.passport.internal.network.requester.e) obj).mo290a(c);
                b();
                return c;
            default:
                Object call2 = ((l) mVar).c.call();
                b();
                Object a = ((com.yandex.passport.common.util.b) obj).a(call2);
                b();
                return a;
        }
    }
}
