package xsna;

import androidx.compose.runtime.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class m0r implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0r(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        int i2 = 2;
        Object obj4 = a.C0011a.a;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                v0r v0rVar = (v0r) obj5;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-585950047, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:86)");
                    }
                    v0rVar.n("VkFeedInlineCommentContainer", aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                bei0 bei0Var = (bei0) obj5;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                aVar2.K(-1914520728);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1914520728, intValue2, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:51)");
                }
                azl azlVar = (azl) aVar2.r(uvi.h);
                Object x = aVar2.x();
                if (x == obj4) {
                    x = androidx.compose.runtime.k.b(new q9x(0L));
                    aVar2.R(x);
                }
                wh50 wh50Var = (wh50) x;
                boolean y = aVar2.y(bei0Var);
                Object x2 = aVar2.x();
                if (y || x2 == obj4) {
                    x2 = new k75(14, bei0Var, wh50Var);
                    aVar2.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                boolean J = aVar2.J(azlVar);
                Object x3 = aVar2.x();
                if (J || x3 == obj4) {
                    x3 = new hn0(25, azlVar, wh50Var);
                    aVar2.R(x3);
                }
                tq2 tq2Var = sdi0.a;
                q630 a = qri.a(q630Var, a5x.a, new tp7(i2, gzsVar, (izs) x3));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return a;
            case 2:
                wh50 wh50Var2 = (wh50) obj5;
                ep10 ep10Var = (ep10) obj;
                o6j o6jVar = (o6j) obj3;
                tra0 N = ((zo10) obj2).N(o6j.b(0, o6jVar.a, Integer.MAX_VALUE, 0, 0, 13));
                int min = Math.min(N.b, o6j.i(o6jVar.a));
                wh50Var2.setValue(Boolean.valueOf(N.b > min));
                return ep10Var.Q(min, N.c, jgp.b, new b140(N, 29));
            default:
                gzs gzsVar2 = (gzs) obj5;
                q630 q630Var2 = (q630) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                aVar3.K(2103701835);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2103701835, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.debouncedClickable.<anonymous> (Utils.kt:69)");
                }
                boolean J2 = aVar3.J(gzsVar2);
                Object x4 = aVar3.x();
                if (J2 || x4 == obj4) {
                    x4 = new a54(2, gzsVar2);
                    aVar3.R(x4);
                }
                gzs d = z3r0.d(0, 0, aVar3, (gzs) x4);
                boolean J3 = aVar3.J(d);
                Object x5 = aVar3.x();
                if (J3 || x5 == obj4) {
                    x5 = new y8q(3, d);
                    aVar3.R(x5);
                }
                q630 c = ojc.c(q630Var2, false, null, null, (gzs) x5, 15);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return c;
        }
    }
}
