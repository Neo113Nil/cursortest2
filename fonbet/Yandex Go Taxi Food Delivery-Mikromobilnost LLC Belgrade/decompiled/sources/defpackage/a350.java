package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import com.yandex.go.payments.cards.ui.ConfirmationType;
import java.util.WeakHashMap;

/* loaded from: classes13.dex */
public abstract class a350 implements r3e {
    public final View a;
    public final q5t0 b;
    public boolean c;

    public a350(View view) {
        this.a = view;
        Context context = view.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        this.b = activity != null ? new q5t0(activity) : null;
    }

    public abstract void b();

    public abstract void c();

    public abstract ConfirmationType d();

    public final View e(int i) {
        WeakHashMap weakHashMap = b.a;
        return (View) rp31.d(this.a, i);
    }

    public abstract void f();

    public abstract void g();
}
