package defpackage;

import com.arkivanov.mvikotlin.core.rx.internal.BaseSubject;

/* loaded from: classes.dex */
public final class kl5 extends BaseSubject {
    public volatile Object c;

    @Override // com.arkivanov.mvikotlin.core.rx.internal.BaseSubject
    public final void b(rq60 rq60Var) {
        rq60Var.a(this.c);
    }

    @Override // com.arkivanov.mvikotlin.core.rx.internal.BaseSubject
    public final void c(Object obj) {
        this.c = obj;
    }
}
