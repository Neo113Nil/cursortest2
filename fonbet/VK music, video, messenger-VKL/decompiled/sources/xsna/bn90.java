package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.a990;
import xsna.dn90;
import xsna.gn90;
import xsna.um90;

/* compiled from: PastAsrListFeature.kt */
/* loaded from: classes7.dex */
public final class bn90 extends wk50<com.vk.voip.ui.asr.ui.list.a, gn90, um90, dn90> {
    public final jvi f;
    public final dv3 g;
    public final f4z h;

    public bn90(fn90 fn90Var, jvi jviVar, dv3 dv3Var) {
        super(um90.c.b, fn90Var);
        this.f = jviVar;
        this.g = dv3Var;
        this.h = new f4z();
    }

    @Override // xsna.wk50
    public final void N(gn90 gn90Var, um90 um90Var) {
        String str;
        String str2;
        gn90 gn90Var2 = gn90Var;
        um90 um90Var2 = um90Var;
        int i = 0;
        int i2 = 1;
        if (um90Var2 instanceof um90.c) {
            C(um90.d.b);
        } else {
            boolean z = um90Var2 instanceof um90.d;
            int i3 = 28;
            jvi jviVar = this.f;
            if (z) {
                T(dn90.a.c.b);
                a7f0.a.f(this, jviVar.f(null).l(new qs6(new cd10(7), i3)), new q1(1, this, bn90.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 4), new mgz(this, 18), 1);
            } else {
                boolean z2 = um90Var2 instanceof um90.e;
                if (z2) {
                    if (gn90Var2 instanceof gn90.a) {
                        a990<Integer> a990Var = ((gn90.a) gn90Var2).c;
                        if (a990Var.b && (a990Var.d instanceof a990.b.a) && (!z2 || (a990Var.c instanceof a990.a.b))) {
                            T(dn90.b.c.b);
                            a7f0.a.f(this, jviVar.f(a990Var.a).l(new o40(new kb40(gn90Var2, 8), i3)), new t440(this, 6), new mi10(this, 11), 1);
                        }
                    }
                } else if (!(um90Var2 instanceof um90.f)) {
                    boolean z3 = um90Var2 instanceof um90.a;
                    dv3 dv3Var = this.g;
                    if (z3) {
                        ev3 ev3Var = ((um90.a) um90Var2).b;
                        dv3Var.getClass();
                        String str3 = ev3Var.c;
                        if (str3 != null && (str2 = ev3Var.b) != null) {
                            try {
                                if (!vao.j((Context) dv3Var.b, Uri.parse(str3), true)) {
                                    bv3 bv3Var = new bv3(dv3Var, str2, str3, i);
                                    if (gz80.a(34)) {
                                        bv3Var.invoke();
                                    } else {
                                        PermissionHelper permissionHelper = PermissionHelper.a;
                                        Context context = (Context) dv3Var.b;
                                        permissionHelper.getClass();
                                        PermissionHelper.f(permissionHelper, context, PermissionHelper.e, R.string.vkim_permissions_storage, R.string.vkim_permissions_storage, bv3Var, null, 32);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } else if (um90Var2 instanceof um90.b) {
                        ev3 ev3Var2 = ((um90.b) um90Var2).b;
                        dv3Var.getClass();
                        String str4 = ev3Var2.c;
                        if (str4 != null && (str = ev3Var2.b) != null) {
                            cv3 cv3Var = new cv3(dv3Var, str, str4, 0);
                            if (gz80.a(34)) {
                                cv3Var.invoke();
                            } else {
                                PermissionHelper permissionHelper2 = PermissionHelper.a;
                                Context context2 = (Context) dv3Var.b;
                                permissionHelper2.getClass();
                                PermissionHelper.f(permissionHelper2, context2, PermissionHelper.e, R.string.vkim_permissions_storage, R.string.vkim_permissions_storage, cv3Var, null, 32);
                            }
                        }
                    } else {
                        if (!(um90Var2 instanceof um90.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        um90.g gVar = (um90.g) um90Var2;
                        if (gn90Var2 instanceof gn90.a) {
                            List singletonList = Collections.singletonList(gVar.b.a);
                            jviVar.getClass();
                            tfx tfxVar = new tfx("calls.deleteAsrTranscriptions", new mr(9), new sn(10));
                            tfxVar.i("doc_ids", singletonList);
                            dz2 x = yfb.x(tfxVar);
                            x.n = true;
                            int i4 = 12;
                            a7f0.a.d(this, rsg0.Z(x), null, new lw20(this, i4), new rs0(i4, this, gVar), 1);
                        }
                    }
                } else if (!(gn90Var2 instanceof gn90.a)) {
                    C(um90.d.b);
                } else if (((gn90.a) gn90Var2).c.d instanceof a990.b.a) {
                    T(dn90.c.C2744c.b);
                    a7f0.a.f(this, jviVar.f(null).l(new u5(new xmz(17), 26)), new odg(1, this, bn90.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 3), new l850(this, i2), 1);
                }
            }
        }
        s3q0 s3q0Var = s3q0.a;
    }
}
