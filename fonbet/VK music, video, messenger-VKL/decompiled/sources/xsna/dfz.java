package xsna;

import com.vk.im.engine.models.InfoBar;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.bfz;
import xsna.pdg0;

/* compiled from: ListHeaderSupplierImpl.kt */
/* loaded from: classes18.dex */
public final class dfz implements bfz {
    public final a1w a;
    public final d02 b;
    public volatile bfz.a c = bfz.a.b.a;
    public final io.reactivex.rxjava3.subjects.d<bfz.a> d = io.reactivex.rxjava3.subjects.d.N0();
    public io.reactivex.rxjava3.disposables.c e;
    public io.reactivex.rxjava3.disposables.c f;

    public dfz(a1w a1wVar, d02 d02Var) {
        this.a = a1wVar;
        this.b = d02Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        return new xsna.bfz.a.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r0.equals("memories") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0.equals("gifts_holidays") == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bfz.a.h b(InfoBar infoBar) {
        String str = infoBar.b;
        switch (str.hashCode()) {
            case -1847644774:
                if (str.equals("gifts_birthdays")) {
                    return new bfz.a.c(infoBar);
                }
                return new bfz.a.e(infoBar);
            case -1081138978:
                if (str.equals("max_ad")) {
                    return new bfz.a.f(infoBar);
                }
                return new bfz.a.e(infoBar);
            case -637054625:
                break;
            case -531262825:
                break;
            case 722597741:
                if (str.equals("dialogs_list_info_bar_connect_edu_chats")) {
                    return new bfz.a.g(infoBar);
                }
                return new bfz.a.e(infoBar);
            default:
                return new bfz.a.e(infoBar);
        }
    }

    @Override // xsna.bfz
    public final io.reactivex.rxjava3.core.q<bfz.a> a() {
        a1w a1wVar = this.a;
        io.reactivex.rxjava3.internal.jdk8.a aVar = new io.reactivex.rxjava3.internal.jdk8.a(a1wVar.l.a().a0(io.reactivex.rxjava3.schedulers.a.b()), new nb(new j4x(this, 3), 20));
        jz jzVar = new jz(new wpg(this, 22), 23);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.e = aVar.E(jzVar, lVar, kVar, kVar).o0(new io.reactivex.rxjava3.internal.operators.single.d0(a1wVar.C(this, new tsm()).l(new iu4(new g54(this, 29), 17)), new yh1(this, 21), null).q(io.reactivex.rxjava3.schedulers.a.b())).subscribe(new ir0(new igh(this, 23), 21));
        h8 h8Var = new h8(new zkh(this, 27), 21);
        io.reactivex.rxjava3.subjects.d<bfz.a> dVar = this.d;
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.jdk8.a(dVar, h8Var).U(new cfz(new qcl(this, 23), 0)).E(new m3y(new fgh(this, 24), 2), lVar, kVar, kVar), lVar, new g30(this, 5));
    }

    public final boolean c() {
        Object obj;
        pdg0 n = this.a.n(this, new lsm());
        if (n instanceof pdg0.a) {
            obj = Boolean.FALSE;
        } else {
            if (!(n instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((pdg0.b) n).a;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final void d() {
        if (c()) {
            io.reactivex.rxjava3.disposables.c cVar = this.f;
            if (cVar != null) {
                cVar.dispose();
            }
            this.b.getClass();
            this.f = io.reactivex.rxjava3.internal.operators.observable.g0.b.r0(io.reactivex.rxjava3.schedulers.a.b()).U(new mm6(new f1s(6), 22)).subscribe(new m5y(new r9k(this, 23), 2), io.reactivex.rxjava3.internal.functions.a.d);
        }
    }
}
