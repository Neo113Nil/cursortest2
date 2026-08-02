package xsna;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: PermissionHelper.java */
/* loaded from: classes9.dex */
public abstract class wx90<T> {
    public final T a;

    /* JADX WARN: Multi-variable type inference failed */
    public wx90(@NonNull Activity activity) {
        this.a = activity;
    }

    @NonNull
    public static wx90<? extends Activity> b(Activity activity) {
        return activity instanceof AppCompatActivity ? new d23((AppCompatActivity) activity) : new pa0(activity);
    }

    public abstract void a(int i, @NonNull String... strArr);

    public abstract boolean c(@NonNull String str);

    public final boolean d(@NonNull LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (!c((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
