package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.core.preference.Preference;
import com.vk.permission.PermissionHelper;
import java.util.HashSet;

/* compiled from: SelectionController.kt */
/* loaded from: classes11.dex */
public final class lyk0 implements mlo {
    public static final lyk0 d;
    public final Object b;
    public final Object c;

    static {
        Object obj = null;
        d = new lyk0(obj, obj);
    }

    public /* synthetic */ lyk0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public static lyk0 a(lyk0 lyk0Var, tny tnyVar, ljo0 ljo0Var, int i) {
        if ((i & 1) != 0) {
            tnyVar = (tny) lyk0Var.b;
        }
        if ((i & 2) != 0) {
            ljo0Var = (ljo0) lyk0Var.c;
        }
        return new lyk0(tnyVar, ljo0Var);
    }

    @Override // xsna.mlo
    public void b(izs izsVar) {
        ((pb7) this.c).c(izsVar);
    }

    public boolean c() {
        PermissionHelper permissionHelper = PermissionHelper.a;
        Context context = (Context) this.b;
        String[] strArr = PermissionHelper.l;
        permissionHelper.getClass();
        return PermissionHelper.b(context, strArr) && Preference.d("JoinCallStorage", "camera_state", false);
    }

    @Override // xsna.mlo
    public void clear() {
        pb7 pb7Var = (pb7) this.b;
        Bitmap bitmap = pb7Var.a;
        pb7Var.a = null;
        pb7Var.b = null;
        if (bitmap != null) {
            bitmap.recycle();
        }
        pb7 pb7Var2 = (pb7) this.c;
        Bitmap bitmap2 = pb7Var2.a;
        pb7Var2.a = null;
        pb7Var2.b = null;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
    }

    public boolean e() {
        PermissionHelper permissionHelper = PermissionHelper.a;
        Context context = (Context) this.b;
        String[] strArr = PermissionHelper.m;
        permissionHelper.getClass();
        return PermissionHelper.b(context, strArr) && Preference.d("JoinCallStorage", "mic_state", false);
    }

    public void f(boolean z) {
        ((o19) this.c).getClass();
        Preference.I("JoinCallStorage", "camera_state", z);
    }

    public lyk0(r73 r73Var, j4k j4kVar) {
        this.c = j4kVar;
        r73Var.a.zzC(new c701(this));
        this.b = new HashSet();
    }

    public lyk0() {
        this.b = new pb7();
        this.c = new pb7();
    }
}
