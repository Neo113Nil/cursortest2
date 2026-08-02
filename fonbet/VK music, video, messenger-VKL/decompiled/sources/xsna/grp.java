package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.e9l;
import xsna.jzf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class grp implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ grp(EntriesListPresenter entriesListPresenter, boolean z) {
        this.d = entriesListPresenter;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                final EntriesListPresenter entriesListPresenter = (EntriesListPresenter) this.d;
                final x960 x960Var = (x960) obj;
                final boolean z = this.c;
                io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.uqp
                    /* JADX WARN: Can't wrap try/catch for region: R(9:4|(3:6|7|(2:9|10)(2:22|17))(1:26)|11|12|13|14|16|17|2) */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
                    
                        r0 = th;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
                    
                        r5 = r16;
                     */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object call() {
                        x960 x960Var2 = x960.this;
                        NewsEntriesContainer a = x960Var2.a();
                        List<NewsEntry> list = a.c;
                        awq b = x960Var2.b();
                        List<NewsEntry> g = rdi.g(list);
                        EntriesListPresenter entriesListPresenter2 = entriesListPresenter;
                        ((e9l) entriesListPresenter2.y.getValue()).b(e9l.a.C2788a.a, entriesListPresenter2.d, g, z, b);
                        awq b2 = x960Var2.b();
                        ArrayList arrayList = new ArrayList(g.size());
                        for (NewsEntry newsEntry : g) {
                            if (b2 != null) {
                                try {
                                } catch (Throwable th) {
                                    Throwable th2 = th;
                                    com.vk.metrics.eventtracking.b.a.a(th2);
                                }
                                if (((ArrayList) b2.f(newsEntry, new zgo(entriesListPresenter2, newsEntry, arrayList, 1))) == null) {
                                }
                            }
                            ArrayList arrayList2 = arrayList;
                            com.vk.newsfeed.common.util.j.h(entriesListPresenter2.A, newsEntry, entriesListPresenter2.b.M0(), entriesListPresenter2.getRef(), entriesListPresenter2.a(), arrayList2, jzf0.a.a.getSTUB(), 64);
                        }
                        return new f2c0(x960Var2, g, a.b.b, arrayList);
                    }
                });
                asu0 asu0Var = asu0.a;
                asu0Var.getClass();
                return s0Var.r0(asu0.i()).a0(asu0Var.d());
            default:
                g1k0 g1k0Var = (g1k0) this.d;
                tgi0 tgi0Var = (tgi0) obj;
                if (!this.c) {
                    qgi0.a(tgi0Var);
                }
                qgi0.q(tgi0Var, String.valueOf(an10.b(g1k0Var.c() * 100) / 100.0f));
                qgi0.l(tgi0Var, new q130(g1k0Var, 28));
                return s3q0.a;
        }
    }

    public /* synthetic */ grp(boolean z, g1k0 g1k0Var) {
        this.c = z;
        this.d = g1k0Var;
    }
}
