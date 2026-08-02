package xsna;

import com.vk.dto.hints.HintId;
import com.vk.newsfeed.api.data.NewsfeedList;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import xsna.ds60;
import xsna.jm50;
import xsna.jv60;
import xsna.r070;
import xsna.xh60;
import xsna.yo60;

/* compiled from: NewsfeedEnableSmartNewsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class wh60 extends evg0<qz60, on50, r070.c, r070, jv60, xh60> {
    public final qn60 f;
    public final Lazy g;
    public final Lazy h;

    public wh60(es60 es60Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = es60Var.a;
        this.g = es60Var.e;
        this.h = es60Var.f;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        final r070.c cVar = (r070.c) hn50Var;
        final qz60 qz60Var = (qz60) this.b.getCurrentState();
        Lazy lazy = this.g;
        io.reactivex.rxjava3.internal.operators.completable.b c = ((NewsFeedComponent) lazy.getValue()).Aa().g(cVar.b).c(new io.reactivex.rxjava3.internal.operators.completable.m(new thc(2, this, qz60Var)));
        final int i = qz60Var.c;
        return g(c.c(new io.reactivex.rxjava3.internal.operators.completable.m(new Callable() { // from class: xsna.vh60
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wh60.this.b.e(new jv60.a.c(i));
            }
        })).e(((NewsFeedComponent) lazy.getValue()).Aa().d()), new le50(com.vk.metrics.eventtracking.b.a, 25), new io.reactivex.rxjava3.functions.f() { // from class: xsna.uh60
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wh60 wh60Var = wh60.this;
                if (booleanValue) {
                    wh60Var.c(new xh60.e(new yo60.k(new eij0(HintId.INFO_BUBBLE_DISABLE_TOP_NEWS.getId()))));
                    ((NewsFeedBridgeComponent) wh60Var.h.getValue()).Ad().n();
                }
                if (cVar.c) {
                    if (qz60Var.c == 0) {
                        wh60Var.a(new r070.h.c(ds60.f.c.b));
                    } else {
                        wh60Var.a(new r070.h.a(new NewsfeedList(0, "")));
                    }
                }
            }
        });
    }
}
