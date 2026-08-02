package defpackage;

import android.app.Activity;
import android.app.Application;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.feedsdk.di.Yatagan$FeedSdkComponent;
import com.yandex.go.feedsdk.log.c;
import com.yandex.go.flex.common.api.FeedSdkTheme;
import com.yandex.go.flex.common.data.bdui.b;
import com.yandex.go.flex.common.ui.theme.f;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final /* synthetic */ class mir {
    public final /* synthetic */ ypq a;
    public final /* synthetic */ f b;

    public /* synthetic */ mir(ypq ypqVar, f fVar) {
        this.a = ypqVar;
        this.b = fVar;
    }

    public final FeedSdkComponent a(final vlr vlrVar) {
        ypq ypqVar = this.a;
        f fVar = this.b;
        upq upqVar = new upq(new g0p(null, null, null, null, null, null, null, null, 1023));
        btl btlVar = ypqVar.a;
        pav pavVar = ypqVar.b;
        yvf0 yvf0Var = ypqVar.c;
        yvf0 yvf0Var2 = ypqVar.d;
        c cVar = ypqVar.e;
        i6r i6rVar = ypqVar.f;
        su00 su00Var = ypqVar.g;
        ru00 ru00Var = ypqVar.h;
        hhr hhrVar = ypqVar.i;
        gmr gmrVar = ypqVar.j;
        alr alrVar = ypqVar.k;
        gir girVar = ypqVar.l;
        yvf0 yvf0Var3 = ypqVar.m;
        o631 o631Var = ypqVar.n;
        vv2 vv2Var = ypqVar.o;
        vpq vpqVar = ypqVar.p;
        ra10 ra10Var = ypqVar.q;
        Activity activity = ypqVar.r;
        wa90 wa90Var = ypqVar.s;
        pav pavVar2 = vlrVar.q;
        if (pavVar2 == null) {
            pavVar2 = pavVar;
        }
        tjk tjkVar = new tjk(new mtk(pavVar2, btlVar.a));
        ((hir) yvf0Var.get()).a(tjkVar);
        vlrVar.b.a(tjkVar);
        ((hir) yvf0Var2.get()).a(tjkVar);
        ysl yslVar = new ysl(tjkVar);
        String str = vlrVar.a;
        cVar.getClass();
        zpq zpqVar = new zpq(0, new hzk(cVar, str));
        final c0g c0gVar = (c0g) i6rVar;
        Application application = (Application) c0gVar.e2().getApplicationContext();
        s59 s59Var = new s59(activity);
        b bVar = new b(su00Var, ru00Var, hhrVar, gmrVar, alrVar, vlrVar.o);
        List list = vlrVar.j;
        t6o t6oVar = vlrVar.c;
        gp50 gp50Var = new gp50(18, zpqVar);
        ent entVar = new ent(zpqVar);
        g0p U = q5z.U(girVar.a(), vlrVar.d);
        xei0 xei0Var = vlrVar.p;
        if (xei0Var == null) {
            xei0Var = new xei0(0);
        }
        xei0 xei0Var2 = xei0Var;
        final ou ouVar = new ou(16, yvf0Var3, vlrVar);
        r3l0 r3l0Var = new r3l0() { // from class: bqq
            @Override // defpackage.r3l0
            public final o3l0 get() {
                o3l0 e;
                q3l0 q3l0Var = vlr.this.e;
                ou ouVar2 = ouVar;
                if (q3l0Var != null && (e = q3l0Var.e(ouVar2)) != null) {
                    return e;
                }
                c0g c0gVar2 = (c0g) c0gVar;
                return new wbh(c0gVar2.e2(), c0gVar2.G(), ouVar2, new vbh(true));
            }
        };
        bki0 bki0Var = vlrVar.f;
        xxw0 xxw0Var = vlrVar.g;
        s59 s59Var2 = new s59(yslVar);
        aqq aqqVar = new aqq(wa90Var);
        jp50 jp50Var = vlrVar.l;
        fxl fxlVar = vlrVar.m;
        o631 o631Var2 = vlrVar.s;
        FeedSdkComponent a = upqVar.a(new xpq(application, s59Var, s59Var2, bVar, vv2Var, xei0Var2, vpqVar, gp50Var, entVar, U, r3l0Var, t6oVar, null, jp50Var, fxlVar, xxw0Var, bki0Var, null, o631Var2 == null ? o631Var : o631Var2, null, list, aqqVar, null, null, vlrVar.n.c(), ra10Var, null, null, vlrVar.r, null, new mdy(), new kdy(), null, null, null, 1503268864, 30), vlrVar.k);
        Yatagan$FeedSdkComponent yatagan$FeedSdkComponent = (Yatagan$FeedSdkComponent) a;
        pvy0 D = yatagan$FeedSdkComponent.D();
        fVar.b.removeIf(new md3(20, new ceu0(10)));
        fVar.b.add(new WeakReference(D));
        FeedSdkTheme feedSdkTheme = fVar.c;
        if (feedSdkTheme == null) {
            fVar.d.start();
            zqq zqqVar = (zqq) fVar.a;
            feedSdkTheme = (FeedSdkTheme) a.R(((hnr0) zqqVar.f.getValue()).b());
            if (feedSdkTheme == null) {
                feedSdkTheme = zqqVar.b();
            }
        }
        D.a(feedSdkTheme.getId());
        List list2 = vlrVar.i;
        flex.engine.a w = yatagan$FeedSdkComponent.w();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            w.c((i3m) it.next());
        }
        return a;
    }
}
