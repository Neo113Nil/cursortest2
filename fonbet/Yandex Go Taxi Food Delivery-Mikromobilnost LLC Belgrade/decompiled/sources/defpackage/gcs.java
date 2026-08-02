package defpackage;

import android.os.Handler;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public abstract class gcs extends acs {
    public final FragmentActivity a;
    public final FragmentActivity b;
    public final Handler c;
    public final xcs w;

    public gcs(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.a = fragmentActivity;
        this.b = fragmentActivity;
        this.c = handler;
        this.w = new xcs();
    }
}
