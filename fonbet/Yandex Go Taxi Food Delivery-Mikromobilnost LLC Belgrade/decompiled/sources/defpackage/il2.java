package defpackage;

import ru.yandex.mt.antirobot.a;

/* loaded from: classes.dex */
public final class il2 implements r8o {
    public final /* synthetic */ a a;
    public final /* synthetic */ a b;

    public il2(a aVar) {
        this.b = aVar;
        this.a = aVar;
    }

    @Override // defpackage.r8o
    public final void a(Exception exc) {
        this.b.a(exc);
        jst.e.j(exc);
    }

    @Override // defpackage.r8o
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.r8o
    public final Throwable c() {
        return this.a.c();
    }

    @Override // defpackage.r8o
    public final void reset() {
        this.a.reset();
    }
}
