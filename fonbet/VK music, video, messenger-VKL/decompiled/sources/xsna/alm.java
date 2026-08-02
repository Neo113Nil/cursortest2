package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogTheme;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DialogThemeObserverImpl.kt */
/* loaded from: classes2.dex */
public final class alm implements com.vk.im.ui.fragments.chat.c {
    public final a1w a;
    public final DialogExt b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final bpn0 d;
    public final io.reactivex.rxjava3.subjects.d<DialogTheme> e;
    public final io.reactivex.rxjava3.subjects.d f;
    public final kkm g;
    public final io.reactivex.rxjava3.subjects.d<DialogTheme> h;
    public final io.reactivex.rxjava3.subjects.d<com.vk.im.engine.models.dialogs.c> i;

    /* compiled from: DialogThemeObserverImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<DialogTheme, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(DialogTheme dialogTheme) {
            ((io.reactivex.rxjava3.subjects.d) this.receiver).onNext(dialogTheme);
            return s3q0.a;
        }
    }

    public alm(dhr0 dhr0Var, a1w a1wVar, cew cewVar, DialogExt dialogExt) {
        com.vk.im.engine.models.dialogs.c cVar;
        this.a = a1wVar;
        this.b = dialogExt;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.c = bVar;
        this.d = new bpn0(new com.vk.movika.sdk.base.logic.interactor.c(11, this, cewVar));
        io.reactivex.rxjava3.subjects.d<DialogTheme> N0 = io.reactivex.rxjava3.subjects.d.N0();
        this.e = N0;
        this.f = N0;
        this.g = new kkm(dhr0Var);
        io.reactivex.rxjava3.subjects.d N02 = io.reactivex.rxjava3.subjects.d.N0();
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = N02.a0(asu0Var.d());
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(a0, qVar, aVar);
        int i = kwg0.a;
        int i2 = 2;
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, yVar, null, new nu2("DialogThemeObserverImpl: themeBinderSubject error", 2), new wzf(this, 8)));
        io.reactivex.rxjava3.subjects.d<DialogTheme> N03 = io.reactivex.rxjava3.subjects.d.N0();
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, N03, null, new nu2("DialogThemeObserverImpl: themeSubject error", 2), new a(1, N02, io.reactivex.rxjava3.subjects.d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0)));
        this.h = N03;
        if (dialogExt == null || (cVar = dialogExt.c) == null) {
            uy2 uy2Var = DialogTheme.f;
            cVar = DialogTheme.a.a().b;
        }
        io.reactivex.rxjava3.subjects.d<com.vk.im.engine.models.dialogs.c> O0 = io.reactivex.rxjava3.subjects.d.O0(cVar);
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.y(O0.a0(asu0Var.c()), qVar, aVar).s0(new ux0(new com.vk.movika.sdk.base.logic.interactor.e(this, 27), 21)), null, new nu2("DialogThemeObserverImpl: themeIdSubject error", 2), new vfk(this, i2)));
        this.i = O0;
    }

    @Override // com.vk.im.ui.fragments.chat.c
    public final kkm a() {
        return this.g;
    }

    @Override // com.vk.im.ui.fragments.chat.c
    public final io.reactivex.rxjava3.subjects.d b() {
        return this.f;
    }

    public final void c(Lifecycle lifecycle) {
        lifecycle.addObserver(new d5z(this));
    }

    public final void d(com.vk.im.engine.models.dialogs.c cVar) {
        DialogTheme P0 = this.h.P0();
        if (cVar.equals(P0 != null ? P0.b : null)) {
            return;
        }
        this.i.onNext(cVar);
    }

    public final void e() {
        DialogTheme P0 = this.h.P0();
        if (P0 == null) {
            return;
        }
        this.g.i(P0);
    }
}
