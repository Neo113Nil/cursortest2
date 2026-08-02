package yads;

import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.R$style;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.j5g;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.xh50;

/* loaded from: classes10.dex */
public final class mc1 extends SuspendLambda implements wzs {
    public s70 b;
    public Object c;
    public int d;
    public final /* synthetic */ nc1 e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc1(nc1 nc1Var, boolean z, spj spjVar) {
        super(2, spjVar);
        this.e = nc1Var;
        this.f = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new mc1(this.e, this.f, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new mc1(this.e, this.f, (spj) obj2).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0418 A[LOOP:3: B:70:0x0412->B:72:0x0418, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0235  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s70 s70Var;
        Object value;
        Object a;
        s70 s70Var2;
        Object a2;
        List a3;
        Object a4;
        qb qbVar;
        Object a5;
        x70 x70Var;
        List list;
        ListBuilder e;
        v90 v90Var;
        int ordinal;
        x80 x80Var;
        b40 b40Var;
        String str;
        String str2;
        String str3;
        d50 d50Var;
        j40 j40Var;
        ListBuilder g;
        c50 c50Var;
        Object value2;
        Object value3;
        b50 b50Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            kotlin.a.a(obj);
            s70Var = ((p90) this.e.m.getValue()).b;
            if (((p90) this.e.m.getValue()).d.isEmpty() || this.f) {
                nc1 nc1Var = this.e;
                p90 a6 = p90.a((p90) nc1Var.m.getValue(), null, null, true, null, 11);
                xh50 xh50Var = nc1Var.m;
                do {
                    value = xh50Var.getValue();
                } while (!xh50Var.compareAndSet(value, a6));
            }
            if (s70Var instanceof q70) {
                nc1 nc1Var2 = this.e;
                x70 x70Var2 = nc1Var2.h;
                iz0 iz0Var = nc1Var2.d;
                boolean z = this.f;
                this.b = s70Var;
                this.c = x70Var2;
                this.d = 1;
                a5 = iz0Var.a(z, this);
                if (a5 != coroutineSingletons) {
                    x70Var = x70Var2;
                    v70 v70Var = (v70) a5;
                    x70Var.getClass();
                    e = e43.e();
                    m50 m50Var = v70Var.b;
                    v90Var = v90.a;
                    e.add(v90Var);
                    e.add(new w90(x70Var.a.getString(R$string.debug_panel_application_info)));
                    e.add(new x90(x70Var.a.getString(R$string.debug_panel_app_id), m50Var.a));
                    e.add(new x90(x70Var.a.getString(R$string.debug_panel_app_version), m50Var.b));
                    e.add(new x90(x70Var.a.getString(R$string.debug_panel_system), m50Var.c));
                    e.add(new x90(x70Var.a.getString(R$string.debug_panel_api_level), m50Var.d));
                    u80 u80Var = v70Var.c;
                    e.add(v90Var);
                    e.add(new w90(x70Var.a.getString(R$string.debug_panel_sdk_integration)));
                    e.add(new x90(x70Var.a.getString(R$string.debug_panel_ads_sdk_version), u80Var.a));
                    ordinal = u80Var.b.a.ordinal();
                    if (ordinal != 0) {
                    }
                    w80 w80Var = u80Var.b;
                    if (w80Var.a != v80.b) {
                    }
                    List list2 = w80Var.b;
                    e.add(new x90(x70Var.a.getString(R$string.debug_panel_sdk_integration_status), x80Var, list2 == null ? new q50(r6, R$style.DebugPanelText_Body2, j5g.g0(list2, "\n", null, null, 0, null, 62)) : null));
                    b40Var = v70Var.d;
                    if (b40Var.a == null) {
                    }
                    e.add(v90Var);
                    e.add(new w90(x70Var.a.getString(R$string.debug_panel_advertisement_network_settings)));
                    str = b40Var.a;
                    if (str != null) {
                    }
                    str2 = b40Var.b;
                    if (str2 != null) {
                    }
                    str3 = b40Var.c;
                    if (str3 != null) {
                    }
                    e.add(s90.a);
                    d50Var = v70Var.e;
                    if (!d50Var.a.isEmpty()) {
                    }
                    t50 t50Var = v70Var.f;
                    v90 v90Var2 = v90.a;
                    e.add(v90Var2);
                    e.add(new w90(x70Var.a.getString(R$string.debug_panel_user_privacy)));
                    e.add(new x90(x70Var.a.getString(R$string.debug_panel_age_restricted_user), x70Var.a(t50Var.b), null));
                    e.add(new x90(x70Var.a.getString(R$string.debug_panel_has_location_consent), x70Var.a(Boolean.valueOf(t50Var.a)), null));
                    e.add(new x90(x70Var.a.getString(R$string.debug_panel_has_user_consent), x70Var.a(t50Var.c), null));
                    e.add(new x90(x70Var.a.getString(R$string.debug_panel_tcf_consent), !t50Var.d ? new x80(x70Var.a.getString(R$string.debug_panel_provided), 0, null, 0, 14) : new x80(x70Var.a.getString(R$string.debug_panel_no_value_set), 0, null, 0, 14), null));
                    u70 u70Var = v70Var.g;
                    e.add(v90Var2);
                    e.add(new w90(x70Var.a.getString(R$string.debug_panel_features)));
                    z90 z90Var = z90.b;
                    e.add(new aa0(u70Var.a));
                    a3 = e.g();
                    list = a3;
                }
            } else if (s70Var instanceof p70) {
                nc1 nc1Var3 = this.e;
                qb qbVar2 = nc1Var3.i;
                gz0 gz0Var = nc1Var3.e;
                boolean z2 = this.f;
                this.b = s70Var;
                this.c = qbVar2;
                this.d = 2;
                a4 = gz0Var.a(z2, this);
                if (a4 != coroutineSingletons) {
                    qbVar = qbVar2;
                    qbVar.getClass();
                    List<i40> list3 = ((v40) a4).a;
                    ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                    while (r1.hasNext()) {
                    }
                    list = arrayList;
                }
            } else if (s70Var instanceof o70) {
                kb kbVar = this.e.k;
                y90 y90Var = ((o70) s70Var).b;
                kbVar.getClass();
                a3 = kb.a(y90Var);
                list = a3;
            } else if (s70Var instanceof n70) {
                ez0 ez0Var = this.e.f;
                String str4 = ((n70) s70Var).b;
                boolean z3 = this.f;
                this.b = s70Var;
                this.d = 3;
                a2 = ez0Var.a(str4, z3, this);
                if (a2 != coroutineSingletons) {
                    s70Var2 = s70Var;
                    j40Var = (j40) a2;
                    if (j40Var != null) {
                    }
                    s70Var = s70Var2;
                    list = null;
                }
            } else {
                if (!(s70Var instanceof r70)) {
                    throw new NoWhenBranchMatchedException();
                }
                lz0 lz0Var = this.e.g;
                String str5 = ((r70) s70Var).b;
                boolean z4 = this.f;
                this.b = s70Var;
                this.d = 4;
                a = lz0Var.a(str5, z4, this);
                if (a != coroutineSingletons) {
                    s70Var2 = s70Var;
                    b50Var = (b50) a;
                    if (b50Var != null) {
                    }
                    s70Var = s70Var2;
                    list = null;
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            x70Var = (x70) this.c;
            s70Var = this.b;
            kotlin.a.a(obj);
            a5 = obj;
            v70 v70Var2 = (v70) a5;
            x70Var.getClass();
            e = e43.e();
            m50 m50Var2 = v70Var2.b;
            v90Var = v90.a;
            e.add(v90Var);
            e.add(new w90(x70Var.a.getString(R$string.debug_panel_application_info)));
            e.add(new x90(x70Var.a.getString(R$string.debug_panel_app_id), m50Var2.a));
            e.add(new x90(x70Var.a.getString(R$string.debug_panel_app_version), m50Var2.b));
            e.add(new x90(x70Var.a.getString(R$string.debug_panel_system), m50Var2.c));
            e.add(new x90(x70Var.a.getString(R$string.debug_panel_api_level), m50Var2.d));
            u80 u80Var2 = v70Var2.c;
            e.add(v90Var);
            e.add(new w90(x70Var.a.getString(R$string.debug_panel_sdk_integration)));
            e.add(new x90(x70Var.a.getString(R$string.debug_panel_ads_sdk_version), u80Var2.a));
            ordinal = u80Var2.b.a.ordinal();
            if (ordinal != 0) {
                x80Var = new x80(x70Var.a.getString(R$string.debug_panel_integrated), R$attr.debug_panel_color_green, Integer.valueOf(R$drawable.debug_panel_icon_success), 0, 8);
            } else if (ordinal == 1) {
                x80Var = new x80(x70Var.a.getString(R$string.debug_panel_integrated), R$attr.debug_panel_color_red, Integer.valueOf(R$drawable.debug_panel_icon_error), 0, 8);
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                x80Var = new x80(x70Var.a.getString(R$string.debug_panel_integration_errors), R$attr.debug_panel_color_red, Integer.valueOf(R$drawable.debug_panel_icon_error), 0, 8);
            }
            w80 w80Var2 = u80Var2.b;
            int i2 = w80Var2.a != v80.b ? R$attr.debug_panel_label_primary : x80Var.b;
            List list22 = w80Var2.b;
            e.add(new x90(x70Var.a.getString(R$string.debug_panel_sdk_integration_status), x80Var, list22 == null ? new q50(i2, R$style.DebugPanelText_Body2, j5g.g0(list22, "\n", null, null, 0, null, 62)) : null));
            b40Var = v70Var2.d;
            if (b40Var.a == null || b40Var.c != null || b40Var.b != null) {
                e.add(v90Var);
                e.add(new w90(x70Var.a.getString(R$string.debug_panel_advertisement_network_settings)));
                str = b40Var.a;
                if (str != null) {
                    e.add(new x90("Page ID", str));
                }
                str2 = b40Var.b;
                if (str2 != null) {
                    e.add(new x90(x70Var.a.getString(R$string.debug_panel_app_review_status), str2));
                }
                str3 = b40Var.c;
                if (str3 != null) {
                    e.add(new x90("app-ads.txt", str3));
                }
                e.add(s90.a);
            }
            d50Var = v70Var2.e;
            if (!d50Var.a.isEmpty()) {
                e.add(v90Var);
                List D0 = j5g.D0(new w70(), d50Var.a);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : D0) {
                    if (((b50) obj2).g instanceof x40) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : D0) {
                    if (((b50) obj3).g instanceof y40) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : D0) {
                    if (((b50) obj4).g instanceof z40) {
                        arrayList4.add(obj4);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    e.add(new w90(x70Var.a.getString(R$string.debug_panel_completed_integration)));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        x70Var.a(e, (b50) it.next());
                    }
                }
                if (!arrayList3.isEmpty()) {
                    e.add(new w90(x70Var.a.getString(R$string.debug_panel_invalid_integration)));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        x70Var.a(e, (b50) it2.next());
                    }
                }
                if (!arrayList4.isEmpty()) {
                    e.add(new w90(x70Var.a.getString(R$string.debug_panel_missing_integration)));
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        x70Var.a(e, (b50) it3.next());
                    }
                }
            }
            t50 t50Var2 = v70Var2.f;
            v90 v90Var22 = v90.a;
            e.add(v90Var22);
            e.add(new w90(x70Var.a.getString(R$string.debug_panel_user_privacy)));
            e.add(new x90(x70Var.a.getString(R$string.debug_panel_age_restricted_user), x70Var.a(t50Var2.b), null));
            e.add(new x90(x70Var.a.getString(R$string.debug_panel_has_location_consent), x70Var.a(Boolean.valueOf(t50Var2.a)), null));
            e.add(new x90(x70Var.a.getString(R$string.debug_panel_has_user_consent), x70Var.a(t50Var2.c), null));
            e.add(new x90(x70Var.a.getString(R$string.debug_panel_tcf_consent), !t50Var2.d ? new x80(x70Var.a.getString(R$string.debug_panel_provided), 0, null, 0, 14) : new x80(x70Var.a.getString(R$string.debug_panel_no_value_set), 0, null, 0, 14), null));
            u70 u70Var2 = v70Var2.g;
            e.add(v90Var22);
            e.add(new w90(x70Var.a.getString(R$string.debug_panel_features)));
            z90 z90Var2 = z90.b;
            e.add(new aa0(u70Var2.a));
            a3 = e.g();
            list = a3;
        } else if (i == 2) {
            qbVar = (qb) this.c;
            s70Var = this.b;
            kotlin.a.a(obj);
            a4 = obj;
            qbVar.getClass();
            List<i40> list32 = ((v40) a4).a;
            ArrayList arrayList5 = new ArrayList(c5g.u(list32, 10));
            for (i40 i40Var : list32) {
                arrayList5.add(new r90(i40Var.a, i40Var.b, i40Var.c));
            }
            list = arrayList5;
        } else if (i == 3) {
            s70Var2 = this.b;
            kotlin.a.a(obj);
            a2 = obj;
            j40Var = (j40) a2;
            if (j40Var != null) {
                this.e.j.getClass();
                ListBuilder e2 = e43.e();
                e2.add(v90.a);
                e2.add(new w90(j40Var.a));
                e2.add(new x90("Format", j40Var.b));
                e2.add(new x90("ID", j40Var.c));
                for (q40 q40Var : j40Var.d.a) {
                    p40 p40Var = q40Var.f;
                    if (p40Var instanceof n40) {
                        c50Var = c50.c;
                    } else {
                        if (!(p40Var instanceof o40)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c50Var = c50.d;
                    }
                    o40 o40Var = p40Var instanceof o40 ? (o40) p40Var : null;
                    e2.add(new y90(q40Var.b, q40Var.a, new x80("Mediation", R$attr.debug_panel_label_secondary, null, R$style.DebugPanelText_Body2, 4), new q50(R$attr.debug_panel_label_primary, R$style.DebugPanelText_Body1, c50Var.b), null, q40Var.d, q40Var.e, q40Var.c, o40Var != null ? o40Var.b : null, c50Var, null, 1024));
                }
                g = e2.g();
                list = g;
                s70Var = s70Var2;
            }
            s70Var = s70Var2;
            list = null;
        } else {
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s70Var2 = this.b;
            kotlin.a.a(obj);
            a = obj;
            b50Var = (b50) a;
            if (b50Var != null) {
                this.e.l.getClass();
                ListBuilder e3 = e43.e();
                e3.add(v90.a);
                e3.add(new w90("Integration"));
                String str6 = b50Var.d;
                if (str6 != null) {
                    e3.add(new x90("Adapter Version", str6));
                }
                String str7 = b50Var.e;
                if (str7 != null) {
                    e3.add(new x90("Latest Adapter Version", str7));
                }
                t90 t90Var = t90.b;
                e3.add(new u90());
                g = e3.g();
                list = g;
                s70Var = s70Var2;
            }
            s70Var = s70Var2;
            list = null;
        }
        if (list == null) {
            nc1 nc1Var4 = this.e;
            p90 p90Var = ((p90) nc1Var4.m.getValue()).a;
            if (p90Var == null) {
                myc0.h(nc1Var4.a, null, null, new jc1(nc1Var4, h90.a, null), 3);
            } else {
                p90 a7 = p90.a(p90Var, null, null, false, null, 11);
                xh50 xh50Var2 = nc1Var4.m;
                do {
                    value3 = xh50Var2.getValue();
                } while (!xh50Var2.compareAndSet(value3, a7));
            }
        } else if (epx.f(s70Var, ((p90) this.e.m.getValue()).b)) {
            p90 a8 = p90.a((p90) this.e.m.getValue(), null, null, false, list, 3);
            xh50 xh50Var3 = this.e.m;
            do {
                value2 = xh50Var3.getValue();
            } while (!xh50Var3.compareAndSet(value2, a8));
        }
        return s3q0.a;
    }
}
