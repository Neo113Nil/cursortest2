package defpackage;

import android.app.Application;
import android.content.Context;
import com.fluttercandies.photo_manager.core.entity.PermissionResult;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final class kya0 extends lya0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.fluttercandies.photo_manager.core.entity.PermissionResult] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.fluttercandies.photo_manager.core.entity.PermissionResult] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, com.fluttercandies.photo_manager.core.entity.PermissionResult] */
    public static final void j(Ref$ObjectRef ref$ObjectRef, PermissionResult permissionResult) {
        T t = ref$ObjectRef.element;
        if (t == PermissionResult.NotDetermined) {
            ref$ObjectRef.element = permissionResult;
            return;
        }
        int i = jya0.a[((PermissionResult) t).ordinal()];
        if (i == 1) {
            ?? r0 = PermissionResult.Limited;
            if (permissionResult == r0 || permissionResult == PermissionResult.Authorized) {
                ref$ObjectRef.element = r0;
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            ref$ObjectRef.element = PermissionResult.Limited;
        } else {
            ?? r02 = PermissionResult.Limited;
            if (permissionResult == r02 || permissionResult == PermissionResult.Denied) {
                ref$ObjectRef.element = r02;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.fluttercandies.photo_manager.core.entity.PermissionResult] */
    @Override // defpackage.lya0
    public final PermissionResult a(Application application, int i) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = PermissionResult.NotDetermined;
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        if ((i & 4) == 4) {
            j(ref$ObjectRef, e(application, "android.permission.READ_MEDIA_AUDIO") ? PermissionResult.Authorized : PermissionResult.Denied);
        }
        if (z2) {
            j(ref$ObjectRef, e(application, "android.permission.READ_MEDIA_VIDEO") ? PermissionResult.Authorized : qke.h(application, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0 ? PermissionResult.Limited : PermissionResult.Denied);
        }
        if (z) {
            j(ref$ObjectRef, e(application, "android.permission.READ_MEDIA_IMAGES") ? PermissionResult.Authorized : qke.h(application, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0 ? PermissionResult.Limited : PermissionResult.Denied);
        }
        return (PermissionResult) ref$ObjectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    @Override // defpackage.lya0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(t0b0 t0b0Var, Context context, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        boolean z;
        m0b0 m0b0Var;
        if (i == 3002) {
            ozj0 ozj0Var = this.a;
            if (ozj0Var == null) {
                return;
            }
            this.a = null;
            ozj0Var.a(1);
            return;
        }
        boolean contains = arrayList.contains("android.permission.READ_MEDIA_IMAGES");
        boolean contains2 = arrayList.contains("android.permission.READ_MEDIA_VIDEO");
        boolean contains3 = arrayList.contains("android.permission.READ_MEDIA_AUDIO");
        boolean contains4 = arrayList.contains("android.permission.ACCESS_MEDIA_LOCATION");
        boolean contains5 = arrayList.contains("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        if (contains || contains2 || contains5) {
            String[] strArr = {"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
            for (int i2 = 0; i2 < 3; i2++) {
                if (qke.h(context, strArr[i2]) != 0) {
                }
            }
            z = false;
            if (contains3) {
                z = z && lya0.d(context, "android.permission.READ_MEDIA_AUDIO");
            }
            if (contains4) {
                z = z && qke.h(context, "android.permission.ACCESS_MEDIA_LOCATION") == 0;
            }
            m0b0Var = t0b0Var.g;
            if (m0b0Var != null) {
                return;
            }
            if (z) {
                m0b0Var.f();
                return;
            } else {
                m0b0Var.i();
                return;
            }
        }
        z = true;
        if (contains3) {
        }
        if (contains4) {
        }
        m0b0Var = t0b0Var.g;
        if (m0b0Var != null) {
        }
    }

    @Override // defpackage.lya0
    public final boolean c(Context context) {
        return lya0.d(context, "android.permission.ACCESS_MEDIA_LOCATION");
    }

    @Override // defpackage.lya0
    public final void f(t0b0 t0b0Var, int i, ozj0 ozj0Var) {
        this.a = ozj0Var;
        ArrayList arrayList = new ArrayList();
        if ((i & 1) == 1 || (i & 2) == 2) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
            arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        }
        lya0.h(t0b0Var, arrayList, 3002);
    }

    @Override // defpackage.lya0
    public final void g(t0b0 t0b0Var, Context context, int i, boolean z) {
        int i2 = i & 1;
        boolean z2 = i2 == 1;
        int i3 = i & 2;
        boolean z3 = i3 == 2;
        int i4 = i & 4;
        boolean z4 = i4 == 4;
        boolean z5 = !(z2 || z3) || lya0.d(context, "android.permission.READ_MEDIA_IMAGES") || lya0.d(context, "android.permission.READ_MEDIA_VIDEO") || lya0.d(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        if (z4) {
            z5 = z5 && lya0.d(context, "android.permission.READ_MEDIA_AUDIO");
        }
        if (z5 && (!z || lya0.d(context, "android.permission.ACCESS_MEDIA_LOCATION"))) {
            m0b0 m0b0Var = t0b0Var.g;
            if (m0b0Var != null) {
                new ArrayList();
                m0b0Var.f();
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z6 = i2 == 1;
        boolean z7 = i3 == 2;
        boolean z8 = i4 == 4;
        if (z6 || z7) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
            arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
            if (z) {
                arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
            }
        }
        if (z8) {
            arrayList.add("android.permission.READ_MEDIA_AUDIO");
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (!e(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            lya0.h(t0b0Var, arrayList, 3001);
            return;
        }
        m0b0 m0b0Var2 = t0b0Var.g;
        if (m0b0Var2 != null) {
            m0b0Var2.f();
        }
    }
}
