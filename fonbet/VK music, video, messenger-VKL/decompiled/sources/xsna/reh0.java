package xsna;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ScrollBarHelper.kt */
/* loaded from: classes17.dex */
public final class reh0 {
    public static final bpn0 a = new bpn0(new daz(14));

    public static void a(ViewGroup viewGroup) {
        Object obj;
        Drawable horizontalScrollbarThumbDrawable;
        Drawable verticalScrollbarThumbDrawable;
        int i = Build.VERSION.SDK_INT;
        bpn0 bpn0Var = a;
        Drawable drawable = null;
        if (i >= 29) {
            if (viewGroup.isVerticalScrollBarEnabled()) {
                verticalScrollbarThumbDrawable = viewGroup.getVerticalScrollbarThumbDrawable();
                if (verticalScrollbarThumbDrawable != null) {
                    sjo.b(verticalScrollbarThumbDrawable, ((Number) bpn0Var.getValue()).intValue(), PorterDuff.Mode.SRC_IN);
                } else {
                    verticalScrollbarThumbDrawable = null;
                }
                viewGroup.setVerticalScrollbarThumbDrawable(verticalScrollbarThumbDrawable);
            }
            if (viewGroup.isHorizontalScrollBarEnabled()) {
                horizontalScrollbarThumbDrawable = viewGroup.getHorizontalScrollbarThumbDrawable();
                if (horizontalScrollbarThumbDrawable != null) {
                    sjo.b(horizontalScrollbarThumbDrawable, ((Number) bpn0Var.getValue()).intValue(), PorterDuff.Mode.SRC_IN);
                    drawable = horizontalScrollbarThumbDrawable;
                }
                viewGroup.setHorizontalScrollbarThumbDrawable(drawable);
                return;
            }
            return;
        }
        if (viewGroup.isVerticalScrollBarEnabled()) {
            try {
                Class<?> cls = viewGroup.getClass();
                while (!epx.f(cls, View.class)) {
                    cls = cls != null ? cls.getSuperclass() : null;
                }
                Field declaredField = cls.getDeclaredField("mScrollCache");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(viewGroup);
                Field declaredField2 = declaredField.getType().getDeclaredField("scrollBar");
                declaredField2.setAccessible(true);
                Method declaredMethod = declaredField2.getType().getDeclaredMethod("setVerticalThumbDrawable", Drawable.class);
                Field declaredField3 = declaredField2.getType().getDeclaredField("mVerticalThumb");
                declaredField3.setAccessible(true);
                if (obj2 == null || (obj = declaredField2.get(obj2)) == null) {
                    return;
                }
                Drawable drawable2 = (Drawable) declaredField3.get(obj);
                sjo.b(drawable2, ((Number) bpn0Var.getValue()).intValue(), PorterDuff.Mode.SRC_IN);
                declaredMethod.invoke(declaredField2.get(obj2), drawable2);
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.q(e);
            }
        }
    }
}
