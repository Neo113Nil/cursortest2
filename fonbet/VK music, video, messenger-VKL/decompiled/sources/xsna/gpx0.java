package xsna;

import androidx.viewpager.widget.ViewPager;
import com.vk.log.L;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: WidthFactorUpdater.kt */
/* loaded from: classes.dex */
public final class gpx0 {
    public final qmg0 a;
    public final List<?> b;
    public final Method c;
    public Field d;
    public Field e;
    public Field f;
    public boolean g;

    public gpx0(qmg0 qmg0Var) {
        this.a = qmg0Var;
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mItems");
            declaredField.setAccessible(true);
            this.b = (List) declaredField.get(qmg0Var);
            Method declaredMethod = ViewPager.class.getDeclaredMethod("populate", null);
            this.c = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
        } catch (Exception e) {
            L.l("error=" + e);
            this.g = true;
        }
    }
}
