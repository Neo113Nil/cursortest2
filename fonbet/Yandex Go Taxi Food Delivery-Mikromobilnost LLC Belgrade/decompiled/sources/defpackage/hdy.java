package defpackage;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class hdy {
    public final Activity a;

    public hdy(Activity activity) {
        cvw.m(activity, "Activity must not be null");
        this.a = activity;
    }

    public final boolean a() {
        return this.a instanceof FragmentActivity;
    }

    public final boolean b() {
        return Objects.nonNull(this.a);
    }

    public final Activity c() {
        return this.a;
    }

    public final FragmentActivity d() {
        return (FragmentActivity) this.a;
    }
}
