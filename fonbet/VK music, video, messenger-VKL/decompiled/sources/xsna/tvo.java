package xsna;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import xsna.h90;

/* compiled from: EasyPermissions.java */
/* loaded from: classes11.dex */
public final class tvo {

    /* compiled from: EasyPermissions.java */
    public interface a extends h90.a {
        void pc(int i, @NonNull List<String> list);

        void wi(int i, @NonNull List<String> list);
    }

    public static boolean a(@NonNull Context context, @NonNull String... strArr) {
        if (context == null) {
            throw new IllegalArgumentException("Can't check permissions for null context");
        }
        for (String str : strArr) {
            if (anj.a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(int i, @NonNull String[] strArr, @NonNull int[] iArr, @NonNull Object... objArr) {
        boolean isInstance;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr[i2] == 0) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        for (Object obj : objArr) {
            if (!arrayList.isEmpty() && (obj instanceof a)) {
                ((a) obj).pc(i, arrayList);
            }
            if (!arrayList2.isEmpty() && (obj instanceof a)) {
                ((a) obj).wi(i, arrayList2);
            }
            if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                Class<?> cls = obj.getClass();
                if (obj.getClass().getSimpleName().endsWith(BundleUtil.UNDERLINE_TAG)) {
                    try {
                        isInstance = Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj);
                    } catch (ClassNotFoundException unused) {
                    }
                    if (isInstance) {
                        cls = cls.getSuperclass();
                    }
                    while (cls != null) {
                        for (Method method : cls.getDeclaredMethods()) {
                            e71 e71Var = (e71) method.getAnnotation(e71.class);
                            if (e71Var != null && e71Var.value() == i) {
                                if (method.getParameterTypes().length > 0) {
                                    throw new RuntimeException("Cannot execute method " + method.getName() + " because it is non-void method and/or has input parameters.");
                                }
                                try {
                                    if (!method.isAccessible()) {
                                        method.setAccessible(true);
                                    }
                                    method.invoke(obj, null);
                                } catch (IllegalAccessException e) {
                                    Log.e("EasyPermissions", "runDefaultMethod:IllegalAccessException", e);
                                } catch (InvocationTargetException e2) {
                                    Log.e("EasyPermissions", "runDefaultMethod:InvocationTargetException", e2);
                                }
                            }
                        }
                        cls = cls.getSuperclass();
                    }
                }
                isInstance = false;
                if (isInstance) {
                }
                while (cls != null) {
                }
            }
        }
    }
}
