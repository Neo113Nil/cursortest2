package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.tvo;

/* compiled from: RequiredPermissionHelper.kt */
/* loaded from: classes4.dex */
public final class s8g0 implements tvo.a, nht {
    public final xx90 b;
    public final FrameLayout c;
    public final ey90 d;
    public final yx90 e;
    public final gzs<s3q0> f;
    public final gzs<s3q0> g;
    public final gzs<s3q0> h;
    public final gzs<s3q0> i;
    public final h090 j;
    public final izs<Boolean, s3q0> k;
    public boolean l;
    public Object m;
    public androidx.appcompat.app.d n;

    /* compiled from: RequiredPermissionHelper.kt */
    public static final class a {
        public static s8g0 a(q90 q90Var, ey90 ey90Var, yx90 yx90Var, hd hdVar, kd kdVar, we0 we0Var, s1 s1Var) {
            return new s8g0(q90Var, null, ey90Var, yx90Var, hdVar, kdVar, we0Var, s1Var, null, null);
        }
    }

    public s8g0() {
        throw null;
    }

    public s8g0(xx90 xx90Var, FrameLayout frameLayout, ey90 ey90Var, yx90 yx90Var, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, gzs gzsVar4, h090 h090Var, sf4 sf4Var) {
        this.b = xx90Var;
        this.c = frameLayout;
        this.d = ey90Var;
        this.e = yx90Var;
        this.f = gzsVar;
        this.g = gzsVar2;
        this.h = gzsVar3;
        this.i = gzsVar4;
        this.j = h090Var;
        this.k = sf4Var;
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        this.l = false;
        if (this.e.b == i) {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                f(frameLayout);
            }
            gzs<s3q0> gzsVar = this.h;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public final void a() {
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        izs<Boolean, s3q0> izsVar = this.k;
        if (izsVar != null) {
            izsVar.invoke(Boolean.FALSE);
        }
    }

    public final void b() {
        c(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z) {
        boolean z2;
        String[] strArr;
        boolean z3;
        com.vk.permission.c s;
        xx90 xx90Var = this.b;
        Context b = xx90Var.b();
        if (b == null) {
            return;
        }
        boolean a2 = gz80.a(34);
        yx90 yx90Var = this.e;
        if (a2) {
            String[] strArr2 = yx90Var.c;
            PermissionHelper.a.getClass();
            if (Arrays.equals(strArr2, PermissionHelper.f) && !PermissionHelper.b(b, PermissionHelper.d) && PermissionHelper.c(b, PermissionHelper.c)) {
                z2 = true;
                PermissionHelper permissionHelper = PermissionHelper.a;
                strArr = yx90Var.c;
                int i = yx90Var.a;
                String[] strArr3 = yx90Var.d;
                int i2 = yx90Var.b;
                permissionHelper.getClass();
                if (!PermissionHelper.b(b, strArr) && !z2) {
                    a();
                    gzs<s3q0> gzsVar = this.f;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout = this.c;
                z3 = frameLayout != null || frameLayout.getChildCount() <= 0 || z;
                if (z3) {
                    if (xx90Var instanceof q90) {
                        q90 q90Var = (q90) xx90Var;
                        Activity activity = q90Var.a;
                        Integer num = q90Var.b;
                        if (tvo.a(activity, (String[]) Arrays.copyOf(strArr3, strArr3.length))) {
                            int[] iArr = new int[strArr3.length];
                            int length = strArr3.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                iArr[i3] = 0;
                            }
                            tvo.b(i2, strArr3, iArr, activity);
                            PermissionHelper.w(strArr3);
                        } else {
                            Resources resources = activity.getResources();
                            if (activity instanceof AppCompatActivity) {
                                FragmentManager supportFragmentManager = ((AppCompatActivity) activity).getSupportFragmentManager();
                                String string = resources.getString(i);
                                String string2 = resources.getString(R.string.vk_permissions_ok);
                                String string3 = resources.getString(R.string.vk_permissions_cancel);
                                if (!(supportFragmentManager.H("com.vk.permission.GdprRationaleDialogFragmentCompat") instanceof com.vk.permission.c)) {
                                    com.vk.permission.c cVar = new com.vk.permission.c();
                                    Bundle b2 = qr.b("arg_rationale_text", string, "arg_positive_button_text", string2);
                                    b2.putString("arg_negative_button_text", string3);
                                    b2.putInt("arg_request_code", i2);
                                    b2.putStringArray("arg_permissions", strArr3);
                                    if (num != null) {
                                        b2.putInt("arg_theme_id", num.intValue());
                                    }
                                    cVar.setArguments(b2);
                                    if (!supportFragmentManager.T()) {
                                        cVar.Td(supportFragmentManager, "com.vk.permission.GdprRationaleDialogFragmentCompat");
                                    }
                                    s = cVar;
                                }
                            } else {
                                int i4 = com.vk.permission.a.c;
                                android.app.FragmentManager fragmentManager = activity.getFragmentManager();
                                String string4 = resources.getString(i);
                                String string5 = resources.getString(R.string.vk_permissions_ok);
                                String string6 = resources.getString(R.string.vk_permissions_cancel);
                                if (!(fragmentManager.findFragmentByTag("com.vk.permission.GdprRationaleDialogFragment") instanceof com.vk.permission.a)) {
                                    com.vk.permission.a aVar = new com.vk.permission.a();
                                    Bundle b3 = qr.b("arg_rationale_text", string4, "arg_positive_button_text", string5);
                                    b3.putString("arg_negative_button_text", string6);
                                    b3.putInt("arg_request_code", i2);
                                    b3.putStringArray("arg_permissions", strArr3);
                                    if (num != null) {
                                        b3.putInt("arg_theme_id", num.intValue());
                                    }
                                    aVar.setArguments(b3);
                                    if (!fragmentManager.isStateSaved() && !aVar.b) {
                                        aVar.show(fragmentManager, "com.vk.permission.GdprRationaleDialogFragment");
                                    }
                                    s = aVar;
                                }
                            }
                        }
                        s = null;
                    } else {
                        if (!(xx90Var instanceof ebs)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ebs ebsVar = (ebs) xx90Var;
                        Fragment fragment = ebsVar.a;
                        s = PermissionHelper.s(fragment, i2, strArr3, fragment.getResources().getString(i), ebsVar.b);
                    }
                    this.m = s;
                }
                this.l = !z3 || this.l;
            }
        }
        z2 = false;
        PermissionHelper permissionHelper2 = PermissionHelper.a;
        strArr = yx90Var.c;
        int i5 = yx90Var.a;
        String[] strArr32 = yx90Var.d;
        int i22 = yx90Var.b;
        permissionHelper2.getClass();
        if (!PermissionHelper.b(b, strArr)) {
        }
        FrameLayout frameLayout2 = this.c;
        if (frameLayout2 != null) {
        }
        if (z3) {
        }
        this.l = !z3 || this.l;
    }

    public final boolean d() {
        return this.l;
    }

    public final void e() {
        xx90 xx90Var = this.b;
        Activity a2 = xx90Var.a();
        if (a2 == null) {
            return;
        }
        if (xx90Var instanceof q90) {
            PermissionHelper permissionHelper = PermissionHelper.a;
            Activity activity = ((q90) xx90Var).a;
            permissionHelper.getClass();
            activity.startActivityForResult(PermissionHelper.m(activity), 7534);
            return;
        }
        if (!(xx90Var instanceof ebs)) {
            throw new NoWhenBranchMatchedException();
        }
        PermissionHelper permissionHelper2 = PermissionHelper.a;
        Fragment fragment = ((ebs) xx90Var).a;
        permissionHelper2.getClass();
        fragment.startActivityForResult(PermissionHelper.m(a2), 7534);
    }

    public final void f(FrameLayout frameLayout) {
        Context b = this.b.b();
        if (b == null) {
            return;
        }
        a();
        fy90 fy90Var = new fy90(b);
        fy90Var.setMessageTextResId(this.e.a);
        ey90 ey90Var = this.d;
        int i = ey90Var.a;
        int i2 = ey90Var.b;
        fy90Var.setBackgroundColor(i);
        TextView textView = fy90Var.b;
        if (textView != null) {
            textView.setTextColor(i2);
        }
        fy90Var.setGrantAccessAction(new m960(this, 23));
        h090 h090Var = this.j;
        if (h090Var != null) {
            fy90Var.setOpenOtherButtonVisibility(h090Var.a);
            fy90Var.setOtherButtonTextResId(R.string.vk_permissions_no_permissions_open_gallery);
            fy90Var.setOpenOtherAction(h090Var.b);
        }
        frameLayout.setVisibility(0);
        frameLayout.setOnClickListener(new o44(0));
        frameLayout.addView(fy90Var);
        izs<Boolean, s3q0> izsVar = this.k;
        if (izsVar != null) {
            izsVar.invoke(Boolean.TRUE);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.l = false;
        if (i == 7534) {
            yx90 yx90Var = this.e;
            if (yx90Var.e) {
                c(false);
            }
            Context b = this.b.b();
            if (b != null) {
                PermissionHelper permissionHelper = PermissionHelper.a;
                String[] strArr = yx90Var.d;
                permissionHelper.getClass();
                if (PermissionHelper.b(b, strArr)) {
                    gzs<s3q0> gzsVar = this.i;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                    a();
                }
            }
        }
    }

    @Override // xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Object obj;
        this.m = null;
        if (this.e.b == i) {
            xx90 xx90Var = this.b;
            if (xx90Var instanceof q90) {
                obj = ((q90) xx90Var).a;
            } else {
                if (!(xx90Var instanceof ebs)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = ((ebs) xx90Var).a;
            }
            tvo.b(i, strArr, iArr, obj);
            Context b = xx90Var.b();
            if (b != null) {
                PermissionHelper permissionHelper = PermissionHelper.a;
                List u0 = rl3.u0(strArr);
                permissionHelper.getClass();
                PermissionHelper.A.onNext(new gy90(b, u0));
            }
        }
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        this.l = false;
        yx90 yx90Var = this.e;
        if (yx90Var.b == i) {
            int size = list.size();
            String[] strArr = yx90Var.c;
            if (size >= strArr.length) {
                for (String str : strArr) {
                    if (!list.contains(str)) {
                        return;
                    }
                }
                a();
                gzs<s3q0> gzsVar = this.i;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                gzs<s3q0> gzsVar2 = this.f;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                PermissionHelper permissionHelper = PermissionHelper.a;
                String[] strArr2 = yx90Var.d;
                permissionHelper.getClass();
                PermissionHelper.w(strArr2);
            }
        }
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        xx90 xx90Var;
        Activity a2;
        this.l = false;
        yx90 yx90Var = this.e;
        if (yx90Var.b != i || (a2 = (xx90Var = this.b).a()) == null) {
            return;
        }
        String[] strArr = yx90Var.c;
        PermissionHelper.a.getClass();
        if (PermissionHelper.t(a2, strArr)) {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                f(frameLayout);
            }
            androidx.appcompat.app.d dVar = this.n;
            if (dVar != null) {
                dVar.dismiss();
            }
            Context b = xx90Var.b();
            if (b == null) {
                b = a2;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (!tvo.a(a2, str)) {
                    arrayList.add(str);
                }
            }
            androidx.appcompat.app.d a3 = n3u.a(b, arrayList, new q010(this, 26), new g880(this, 16));
            a3.show();
            this.n = a3;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        String[] strArr2 = yx90Var.d;
        permissionHelper.getClass();
        PermissionHelper.w(strArr2);
    }
}
