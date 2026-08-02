package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public abstract class mkn {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static pkn c;

    public static final void a(ComponentActivity componentActivity, b2x0 b2x0Var, b2x0 b2x0Var2) {
        View decorView = componentActivity.getWindow().getDecorView();
        boolean booleanValue = ((Boolean) b2x0Var.d.invoke(decorView.getResources())).booleanValue();
        boolean booleanValue2 = ((Boolean) b2x0Var2.d.invoke(decorView.getResources())).booleanValue();
        pkn pknVar = c;
        if (pknVar == null) {
            int i = Build.VERSION.SDK_INT;
            pknVar = i >= 35 ? new rkn() : i >= 30 ? new qkn() : new pkn();
            c = pknVar;
        }
        pkn pknVar2 = pknVar;
        pknVar2.a(b2x0Var, b2x0Var2, componentActivity.getWindow(), decorView, booleanValue, booleanValue2);
        pknVar2.b(componentActivity.getWindow());
    }

    public static void b(FragmentActivity fragmentActivity) {
        int i = 8;
        a(fragmentActivity, new b2x0(0, 0, 0, new ceu0(i)), new b2x0(a, b, 0, new ceu0(i)));
    }
}
