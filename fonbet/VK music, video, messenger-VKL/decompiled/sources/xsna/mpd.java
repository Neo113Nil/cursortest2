package xsna;

import com.vk.log.L;
import kotlin.NoWhenBranchMatchedException;
import xsna.eqo;
import xsna.mpo;

/* compiled from: ClipsDelegate.kt */
/* loaded from: classes16.dex */
public final class mpd implements eqo.a<mpo> {
    public final /* synthetic */ jpd a;

    public mpd(jpd jpdVar) {
        this.a = jpdVar;
    }

    @Override // xsna.eqo.a
    public final void b(mpo mpoVar) {
        mpo mpoVar2 = mpoVar;
        boolean equals = mpoVar2.equals(mpo.a.b);
        jpd jpdVar = this.a;
        if (equals) {
            jpdVar.w();
        } else {
            if (!mpoVar2.equals(mpo.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            jpdVar.w();
        }
    }

    @Override // xsna.eqo.a
    public final void c(mpo mpoVar) {
        mpo mpoVar2 = mpoVar;
        boolean equals = mpoVar2.equals(mpo.a.b);
        jpd jpdVar = this.a;
        if (equals) {
            jpdVar.w();
        } else {
            if (!mpoVar2.equals(mpo.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            jpdVar.w();
        }
    }

    @Override // xsna.eqo.a
    public final void d(mpo mpoVar, Throwable th) {
        mpo mpoVar2 = mpoVar;
        L.i(th);
        boolean equals = mpoVar2.equals(mpo.a.b);
        jpd jpdVar = this.a;
        if (equals) {
            jpdVar.w();
        } else {
            if (!mpoVar2.equals(mpo.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            jpdVar.w();
        }
    }

    @Override // xsna.eqo.a
    public final void a(boolean z) {
    }
}
