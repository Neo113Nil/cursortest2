package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class nu6 {
    public static PackageInfo a(Context context, PackageManager packageManager) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object b(Bundle bundle, Class cls, String str) {
        return bundle.getParcelable(str, cls);
    }

    public static Object[] c(Bundle bundle, Class cls, String str) {
        return bundle.getParcelableArray(str, cls);
    }

    public static ArrayList d(Bundle bundle, Class cls, String str) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Object e(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    public static Serializable f(Bundle bundle, Class cls, String str) {
        return bundle.getSerializable(str, cls);
    }

    public static Serializable g(Intent intent, String str, Class cls) {
        return intent.getSerializableExtra(str, cls);
    }
}
