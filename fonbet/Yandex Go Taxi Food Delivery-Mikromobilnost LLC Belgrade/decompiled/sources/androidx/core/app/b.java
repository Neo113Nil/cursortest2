package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qke;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class b extends qke {
    /* JADX WARN: Multi-variable type inference failed */
    public static void J(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                ny61.g(oyr.t(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof a) {
            ((a) activity).validateRequestPermissionsRequestCode(i);
        }
        e.g(activity, strArr, i);
    }

    public static void K(FragmentActivity fragmentActivity, e1 e1Var) {
        e.h(fragmentActivity, e1Var != null ? new ActivityCompat$SharedElementCallback21Impl(e1Var) : null);
    }

    public static void L(FragmentActivity fragmentActivity, e1 e1Var) {
        e.i(fragmentActivity, e1Var != null ? new ActivityCompat$SharedElementCallback21Impl(e1Var) : null);
    }

    public static boolean M(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i >= 32 ? e.l(activity, str) : i == 31 ? e.k(activity, str) : e.j(activity, str);
        }
        return false;
    }
}
