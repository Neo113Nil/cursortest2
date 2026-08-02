package xsna;

import android.os.Bundle;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.sharing.core.SharingActivity;
import com.vk.sharing.core.view.k;
import java.util.concurrent.TimeUnit;
import ru.mail.libverify.n.g;
import xsna.drz;
import xsna.f0g0;
import xsna.mfg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class z250 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.s, k.a, f0g0.b, g.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z250(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // ru.mail.libverify.n.g.a
    public boolean a(String str) {
        boolean c;
        c = ((ru.mail.libverify.api.s) this.c).c(str);
        return c;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (NewsEntry) ((j4x) this.c).invoke(obj);
            case 1:
                return (jbh) ((vq80) this.c).invoke(obj);
            case 2:
                return (drz.a) ((k990) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.t) ((ll1) this.c).invoke(obj);
            case 4:
                return (ncq0) ((k990) this.c).invoke(obj);
            case 5:
                io.reactivex.rxjava3.core.w wVar = (io.reactivex.rxjava3.core.w) this.c;
                mfg0.a aVar = (mfg0.a) obj;
                long j = aVar.b;
                return j == -1 ? io.reactivex.rxjava3.core.g.e(aVar.a) : new io.reactivex.rxjava3.internal.operators.flowable.c0(io.reactivex.rxjava3.core.g.p(j, TimeUnit.MILLISECONDS, wVar), new j630(new b140(aVar, 16), 14));
            case 6:
            case 7:
            case 10:
            case 11:
            default:
                return (eag0) ((tgx0) this.c).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.t) ((ogd) this.c).invoke(obj);
            case 9:
                return (ffe0) ((k990) this.c).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.t) ((gib0) this.c).invoke(obj);
        }
    }

    @Override // xsna.f0g0.b
    public void b(long j, xi90 xi90Var) {
        yla.b(j, xi90Var, ((hhq0) this.c).b);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        final zdh0 zdh0Var = (zdh0) this.c;
        final aeh0 aeh0Var = new aeh0(rVar);
        zdh0Var.a(aeh0Var);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.ydh0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                zdh0.this.e(aeh0Var);
            }
        });
    }

    @Override // com.vk.sharing.core.view.k.a
    public void a() {
        SharingActivity sharingActivity = (SharingActivity) this.c;
        Bundle bundle = SharingActivity.n0;
        sharingActivity.H2(7);
    }
}
