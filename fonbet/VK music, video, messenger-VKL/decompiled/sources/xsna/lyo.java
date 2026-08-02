package xsna;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.vkontakte.android.MainActivity;

/* compiled from: EdgeToEdge.kt */
/* loaded from: classes11.dex */
public final class lyo {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static nyo c;

    public static final void a(MainActivity mainActivity) {
        b(mainActivity);
    }

    public static void b(AppCompatActivity appCompatActivity) {
        int i = 0;
        spn0 spn0Var = new spn0(0, 0, new g2h0(6));
        spn0 spn0Var2 = new spn0(a, b, new g2h0(6));
        View decorView = appCompatActivity.getWindow().getDecorView();
        nyo nyoVar = c;
        if (nyoVar == null) {
            int i2 = Build.VERSION.SDK_INT;
            nyoVar = i2 >= 35 ? new qyo() : i2 >= 30 ? new pyo() : i2 >= 29 ? new oyo() : new nyo();
            c = nyoVar;
        }
        nyo nyoVar2 = nyoVar;
        jyo jyoVar = new jyo(nyoVar2, spn0Var, spn0Var2, appCompatActivity, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (true) {
            if (i >= viewGroup.getChildCount()) {
                kyo kyoVar = new kyo(jyoVar, viewGroup.getContext());
                kyoVar.setTag(nyoVar2);
                kyoVar.setVisibility(8);
                kyoVar.setWillNotDraw(true);
                viewGroup.addView(kyoVar);
                break;
            }
            int i3 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof myo) {
                break;
            } else {
                i = i3;
            }
        }
        jyoVar.run();
        nyoVar2.a(appCompatActivity.getWindow());
    }
}
