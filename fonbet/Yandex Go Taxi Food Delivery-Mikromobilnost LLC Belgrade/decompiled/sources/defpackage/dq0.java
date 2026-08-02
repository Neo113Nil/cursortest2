package defpackage;

import android.content.Intent;
import com.yandex.go.flex.main_screen.presentation.feed.e;
import com.yandex.go.intentprocessor.PriorityIntentHandlerImpl$processIntent$$inlined$suspendCallbackApi$2;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.clarification.UpdateReason;
import ru.yandex.taxi.address.clarification.impl.repo.a;

/* loaded from: classes9.dex */
public final class dq0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Boolean bool;
        Boolean bool2;
        String str;
        long j;
        Boolean bool3;
        Boolean bool4;
        switch (this.a) {
            case 0:
                g2t g2tVar = (g2t) obj;
                a aVar = (a) this.b;
                if (!jl40.l(aVar.k, g2tVar)) {
                    aVar.b.a = null;
                    aVar.k = g2tVar;
                    aVar.a(g2tVar, aVar.l, UpdateReason.NEW_FINAL_SUGGEST);
                }
                return zy11.a;
            case 1:
                ((t18) this.b).cancel();
                return zy11.a;
            case 2:
                c231 c231Var = (c231) obj;
                if (jl40.l(c231Var.c(), "is_feed_go_available") && (bool = (Boolean) c231Var.d()) != null) {
                    jst.e.getClass();
                    r0 r0Var = ((aoq) ((znq) this.b).b).a;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                }
                return zy11.a;
            case 3:
                c231 c231Var2 = (c231) obj;
                if (jl40.l(c231Var2.c(), "is_feed_go_loading") && (bool2 = (Boolean) c231Var2.d()) != null) {
                    jst.e.getClass();
                    r0 r0Var2 = ((woq) ((znq) this.b).b).a;
                    r0Var2.getClass();
                    r0Var2.m(null, bool2);
                }
                return zy11.a;
            case 4:
                c231 c231Var3 = (c231) obj;
                dpq dpqVar = (dpq) ((znq) this.b).b;
                if (jl40.l(c231Var3.c(), "feed_onboarding_visibility_variable") && (str = (String) c231Var3.d()) != null) {
                    jst.e.getClass();
                    if (str.equals("visible")) {
                        r0 r0Var3 = dpqVar.a;
                        Boolean bool5 = Boolean.TRUE;
                        r0Var3.getClass();
                        r0Var3.m(null, bool5);
                    } else if (str.equals("invisible")) {
                        r0 r0Var4 = dpqVar.a;
                        Boolean bool6 = Boolean.FALSE;
                        r0Var4.getClass();
                        r0Var4.m(null, bool6);
                    }
                }
                return zy11.a;
            case 5:
                androidx.compose.runtime.snapshots.a aVar2 = (androidx.compose.runtime.snapshots.a) obj;
                synchronized (q2t0.c) {
                    j = q2t0.e;
                    q2t0.e = 1 + j;
                }
                return new fci0(j, aVar2, (tls) this.b);
            case 6:
                kf5 kf5Var = ((ndx) this.b).a.b;
                kotlinx.serialization.modules.a aVar3 = new kotlinx.serialization.modules.a();
                bvf0.b0(aVar3);
                ((acx) obj).n = itq0.a(kf5Var, aVar3.a());
                return zy11.a;
            case 7:
                ((euy) this.b).cancel(false);
                return zy11.a;
            case 8:
                ((PriorityIntentHandlerImpl$processIntent$$inlined$suspendCallbackApi$2) this.b).invoke((Intent) obj);
                return zy11.a;
            case 9:
                j18 j18Var = (j18) this.b;
                zy11 zy11Var = zy11.a;
                j18Var.resumeWith(zy11Var);
                return zy11Var;
            case 10:
                c231 c231Var4 = (c231) obj;
                if (jl40.l(c231Var4.c(), "is_sticked_feed") && (bool3 = (Boolean) c231Var4.d()) != null) {
                    jst.e.getClass();
                    r0 r0Var5 = ((e) ((znq) this.b).b).d;
                    r0Var5.getClass();
                    r0Var5.m(null, bool3);
                }
                return zy11.a;
            default:
                c231 c231Var5 = (c231) obj;
                if (jl40.l(c231Var5.c(), "is_sticked_orders") && (bool4 = (Boolean) c231Var5.d()) != null) {
                    boolean booleanValue = bool4.booleanValue();
                    jst.e.getClass();
                    geu0 geu0Var = (geu0) ((znq) this.b).b;
                    if (booleanValue) {
                        r0 r0Var6 = geu0Var.a;
                        Boolean bool7 = Boolean.TRUE;
                        r0Var6.getClass();
                        r0Var6.m(null, bool7);
                    } else {
                        r0 r0Var7 = geu0Var.a;
                        Boolean bool8 = Boolean.FALSE;
                        r0Var7.getClass();
                        r0Var7.m(null, bool8);
                    }
                }
                return zy11.a;
        }
    }
}
