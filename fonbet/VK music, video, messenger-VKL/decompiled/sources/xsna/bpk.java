package xsna;

import com.vk.dto.newsfeed.entries.Post;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class bpk implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bpk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                f4m.j(((cpk) this.c).b);
                break;
            case 1:
                xam xamVar = (xam) this.c;
                xamVar.p = null;
                zam zamVar = xamVar.u;
                if (zamVar != null) {
                    zamVar.b();
                    break;
                }
                break;
            case 2:
                ((w920) this.c).q.compareAndSet(true, false);
                break;
            case 3:
                ((o2c0) this.c).a.a(mic0.b);
                break;
            case 4:
                ((jn2) this.c).invoke();
                break;
            case 5:
                ((p5u0) this.c).c = null;
                break;
            case 6:
                ((com.vk.auth.ui.password.askpassword.a) this.c).b.r();
                break;
            default:
                ((Post) this.c).l.Ab(134217728L, false);
                break;
        }
    }
}
