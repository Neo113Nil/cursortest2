package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.Nullable;

/* compiled from: DrawableDecoderCompat.java */
/* loaded from: classes12.dex */
public final class rjo {
    public static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, @Nullable Resources.Theme theme) {
        try {
            if (a) {
                return b(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = dbg0.a;
        return resources.getDrawable(i, theme);
    }

    public static Drawable b(Context context, int i, @Nullable Resources.Theme theme) {
        if (theme != null) {
            lpj lpjVar = new lpj(context, theme);
            lpjVar.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = lpjVar;
        }
        return m33.a(i, context);
    }
}
