package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.im.engine.models.SearchMode;
import java.io.Serializable;

/* compiled from: BundleCompat.java */
/* loaded from: classes.dex */
public final class zn8 {

    /* compiled from: BundleCompat.java */
    /* loaded from: classes11.dex */
    public static class a {
        public static Object a(Class cls, Bundle bundle, String str) {
            return bundle.getParcelable(str, cls);
        }

        public static Serializable b(Bundle bundle) {
            return bundle.getSerializable("arg_search_mode", SearchMode.class);
        }
    }

    public static Object a(Class cls, Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(cls, bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
