package com.yandex.passport.legacy.lx;

/* loaded from: classes8.dex */
public abstract class m {
    public final m a;
    public boolean b;

    public m(m mVar) {
        this.a = mVar;
    }

    public static n d(Runnable runnable) {
        return new f(new l(new d(1, runnable))).e(new com.yandex.passport.internal.sloth.performers.usermenu.b(1), new com.yandex.passport.internal.sloth.performers.usermenu.b(2));
    }

    public final boolean a() {
        this.b = true;
        m mVar = this.a;
        if (mVar != null) {
            return mVar.a();
        }
        return true;
    }

    public final void b() {
        if (this.b) {
            throw new RuntimeException() { // from class: com.yandex.passport.legacy.lx.Task$TaskCancelledException
            };
        }
    }

    public abstract Object c();
}
