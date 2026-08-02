package xsna;

import android.content.Context;
import android.graphics.Typeface;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class cqi {
    public static Typeface a(Font.a aVar, FontFamily fontFamily, float f, Context context) {
        aVar.getClass();
        return Font.a.a(fontFamily, f).k(context);
    }

    public static String b(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        return sb.toString();
    }

    public static String c(Object obj, String str) {
        return str + obj;
    }
}
