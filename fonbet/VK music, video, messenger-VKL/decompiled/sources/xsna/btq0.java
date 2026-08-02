package xsna;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.ikv0;

/* compiled from: UserProfileNotifier.kt */
/* loaded from: classes5.dex */
public class btq0 {
    public final o0r0 a;
    public final slq0 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public WeakReference<ikv0> d;

    public btq0(o0r0 o0r0Var, slq0 slq0Var) {
        this.a = o0r0Var;
        this.b = slq0Var;
    }

    public static void b(FragmentActivity fragmentActivity, String str) {
        ikv0.a aVar = new ikv0.a(fragmentActivity);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        aVar.n();
    }

    public void a(FragmentActivity fragmentActivity, atq0 atq0Var) {
        this.c.post(new nm30(atq0Var, this, fragmentActivity, 1));
    }
}
