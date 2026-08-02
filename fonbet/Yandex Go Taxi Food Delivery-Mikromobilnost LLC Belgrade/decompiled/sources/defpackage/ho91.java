package defpackage;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.yx360.design.compose.atoms.DsButtonClose$Type;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class ho91 {
    public static final StackTraceElement[] a = new StackTraceElement[0];

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(sls slsVar, DsButtonClose$Type dsButtonClose$Type, f530 f530Var, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        Object Q;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1357067682);
        if ((i & 6) == 0) {
            i3 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.c(dsButtonClose$Type.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            if ((i3 & 147) == 146 || !btsVar.E()) {
                f530 f530Var3 = i4 == 0 ? c530.a : f530Var2;
                btsVar.e0(1849434622);
                Q = btsVar.Q();
                if (Q == did.a) {
                    Q = ly3.i(btsVar);
                }
                zx40 zx40Var = (zx40) Q;
                btsVar.t(false);
                qxi a2 = ycb1.a(zx40Var, btsVar);
                qnm qnmVar = qnm.a;
                sb2.b(esk0.a.a(new trk0(new rrk0(0.0f, 0.0f, 0.0f, 0.0f), 1)), wwg.S(132476702, true, new dpm(qnm.c(btsVar).W(), ldc.b(qnm.c(btsVar).V(), 0.16f, 0.0f, 0.0f, 0.0f, 14), qnm.c(btsVar).h0(), f530Var3, slsVar, zx40Var, a2, dsButtonClose$Type), btsVar), btsVar, 56);
                f530Var2 = f530Var3;
            } else {
                btsVar.Y();
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new v4(slsVar, dsButtonClose$Type, f530Var2, i, i2);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        btsVar.e0(1849434622);
        Q = btsVar.Q();
        if (Q == did.a) {
        }
        zx40 zx40Var2 = (zx40) Q;
        btsVar.t(false);
        qxi a22 = ycb1.a(zx40Var2, btsVar);
        qnm qnmVar2 = qnm.a;
        sb2.b(esk0.a.a(new trk0(new rrk0(0.0f, 0.0f, 0.0f, 0.0f), 1)), wwg.S(132476702, true, new dpm(qnm.c(btsVar).W(), ldc.b(qnm.c(btsVar).V(), 0.16f, 0.0f, 0.0f, 0.0f, 14), qnm.c(btsVar).h0(), f530Var3, slsVar, zx40Var2, a22, dsButtonClose$Type), btsVar), btsVar, 56);
        f530Var2 = f530Var3;
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.fragment.app.FragmentActivity] */
    public static final ArrayList b(Fragment fragment) {
        ArrayList arrayList = new ArrayList();
        while (fragment != null) {
            if (fragment instanceof Fragment) {
                Fragment fragment2 = fragment;
                Fragment parentFragment = fragment2.getParentFragment();
                fragment = parentFragment == null ? fragment2.getActivity() : parentFragment;
            } else {
                fragment = null;
            }
            e2d0 e2d0Var = fragment instanceof e2d0 ? (e2d0) fragment : null;
            if (e2d0Var != null) {
                arrayList.add(e2d0Var);
            }
        }
        return arrayList;
    }

    public static final String c(AppCompatActivity appCompatActivity) {
        Bundle extras;
        Intent intent = appCompatActivity.getIntent();
        String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("INSTANCE_ID");
        if (string != null) {
            return string;
        }
        ny61.r("instanceId must be passed as argument for Activity");
        return null;
    }

    public static void d(Paint paint, int i) {
        paint.setBlendMode(sta1.b(i));
    }
}
