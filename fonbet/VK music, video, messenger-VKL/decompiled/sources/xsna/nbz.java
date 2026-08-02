package xsna;

import android.net.Uri;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.hbz;
import xsna.obz;
import xsna.qbz;

/* compiled from: LinkVKBidFeature.kt */
/* loaded from: classes18.dex */
public final class nbz extends wk50<dcz, obz, hbz, qbz> {
    public final androidx.lifecycle.j f;
    public final vbz g;
    public final UserId h;
    public final f4z i;

    public nbz(hbz hbzVar, rbz rbzVar, androidx.lifecycle.j jVar, vbz vbzVar, UserId userId) {
        super(hbzVar, rbzVar);
        this.f = jVar;
        this.g = vbzVar;
        this.h = userId;
        this.i = new f4z();
    }

    public static final void U(nbz nbzVar, long j) {
        nbzVar.getClass();
        String builder = new Uri.Builder().appendPath("https://bid." + a0a.d + "/?action=need_verify&org_id=").appendPath(String.valueOf(j)).toString();
        nbzVar.T(qbz.g.b);
        nbzVar.i.b(new jbz(builder));
    }

    @Override // xsna.wk50
    public final void N(obz obzVar, hbz hbzVar) {
        xeu0 xeu0Var;
        obz obzVar2 = obzVar;
        hbz hbzVar2 = hbzVar;
        if (hbzVar2 instanceof hbz.b) {
            myc0.h(this.f, null, null, new lbz(this, true, null), 3);
            return;
        }
        if (hbzVar2 instanceof hbz.d) {
            this.i.b(ibz.a);
            return;
        }
        if (hbzVar2 instanceof hbz.a) {
            this.i.b(new jbz(i5s.a(new StringBuilder("https://bid."), a0a.d, "/?action=new_org")));
            this.i.b(ibz.a);
            return;
        }
        if (hbzVar2 instanceof hbz.c) {
            if (obzVar2 instanceof obz.a) {
                afu0 afu0Var = ((obz.a) obzVar2).b;
                xeu0Var = (xeu0) j5g.b0(afu0Var.a, afu0Var.b);
            } else {
                xeu0Var = null;
            }
            if (xeu0Var != null) {
                myc0.h(this.f, null, null, new mbz(this, xeu0Var.a, null), 3);
                return;
            }
            return;
        }
        if (hbzVar2 instanceof hbz.f) {
            T(new qbz.d(((hbz.f) hbzVar2).b));
            return;
        }
        if (!(hbzVar2 instanceof hbz.e)) {
            throw new NoWhenBranchMatchedException();
        }
        if (obzVar2 instanceof obz.a) {
            obz.a aVar = (obz.a) obzVar2;
            if (aVar.e) {
                myc0.h(this.f, null, null, new lbz(this, aVar.d, null), 3);
            }
        }
    }
}
