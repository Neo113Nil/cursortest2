package xsna;

import com.vk.superapp.qr.web2app.loader.errors.AccountsLimitReachedException;
import com.vk.superapp.qr.web2app.loader.errors.WrongAuthCodeReceivedException;
import kotlin.NoWhenBranchMatchedException;
import xsna.ksz;
import xsna.msz;

/* compiled from: LoaderScreenReducer.kt */
/* loaded from: classes6.dex */
public final class lsz extends dm50<nsz, ksz, msz> {
    public final gsz d;

    public lsz(gsz gszVar) {
        super(msz.b.b);
        this.d = gszVar;
    }

    @Override // xsna.dm50
    public final msz c(msz mszVar, ksz kszVar) {
        ksz kszVar2 = kszVar;
        if (kszVar2.equals(ksz.d.b)) {
            return new msz.a(new WrongAuthCodeReceivedException());
        }
        if (kszVar2.equals(ksz.a.b)) {
            return new msz.a(new AccountsLimitReachedException());
        }
        if (kszVar2 instanceof ksz.b) {
            return new msz.a(((ksz.b) kszVar2).b);
        }
        if (kszVar2.equals(ksz.c.b)) {
            return msz.b.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final nsz d() {
        return new nsz(e(new qey(1)), e(new x2y(this, 5)));
    }

    @Override // xsna.dm50
    public final void h(msz mszVar, nsz nszVar) {
        msz mszVar2 = mszVar;
        nsz nszVar2 = nszVar;
        if (mszVar2 instanceof msz.b) {
            f(nszVar2.a, mszVar2);
        } else {
            if (!(mszVar2 instanceof msz.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(nszVar2.b, mszVar2);
        }
    }
}
