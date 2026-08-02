package xsna;

import com.vk.log.L;
import xsna.cfn;

/* compiled from: DisplayLayoutUpdateTriggerImpl.kt */
/* loaded from: classes11.dex */
public final class dfn implements cfn {
    public final io.reactivex.rxjava3.subjects.f<cfn.a> a = new io.reactivex.rxjava3.subjects.f<>();
    public boolean b;
    public int c;

    @Override // xsna.cfn
    public final void a() {
        boolean b = i0q0.b();
        io.reactivex.rxjava3.subjects.f<cfn.a> fVar = this.a;
        if (!b) {
            fVar.onNext(cfn.a.a);
        } else if (this.c == 0) {
            fVar.onNext(cfn.a.a);
        } else {
            this.b = true;
        }
    }

    @Override // xsna.cfn
    public final void b() {
        if (this.c > 0) {
            this.b = false;
        } else {
            L.G("cancel trigger called outside runDeferringTriggers");
        }
    }

    @Override // xsna.cfn
    public final void c(izs<? super cfn, s3q0> izsVar) {
        if (!i0q0.b()) {
            izsVar.invoke(this);
            return;
        }
        this.c++;
        izsVar.invoke(this);
        int i = this.c - 1;
        this.c = i;
        if (i == 0 && this.b) {
            this.a.onNext(cfn.a.a);
        }
        this.b = false;
    }
}
