package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: BoundsHelper.kt */
/* loaded from: classes12.dex */
public final class da8 implements ba8 {
    public static final da8 b = new da8();

    @Override // xsna.ba8
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect a(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            return new Rect((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            ba8.a.getClass();
            return ca8.b.a(activity);
        }
    }
}
