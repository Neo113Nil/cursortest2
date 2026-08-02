package xsna;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.reflect.Field;

/* compiled from: PlaylistBlockTransformer.kt */
/* loaded from: classes16.dex */
public class e7b0 {
    public static final vcp a = new vcp("😂");
    public static final vcp b = new vcp("❤");
    public static final vcp c = new vcp("👍");
    public static final vcp d = new vcp("🔥");
    public static final vcp e = new vcp("💩");
    public static final vcp f = new vcp("😭");
    public static final vcp g = new vcp("😁");

    public static final void a(lpj lpjVar) {
        if (gz80.a(34)) {
            Field declaredField = lpjVar.getClass().getDeclaredField("mTheme");
            declaredField.setAccessible(true);
            declaredField.set(lpjVar, null);
            Field declaredField2 = lpjVar.getClass().getDeclaredField("mThemeResource");
            declaredField2.setAccessible(true);
            declaredField2.set(lpjVar, -1);
        }
        lpjVar.setTheme(dhr0.C().c);
    }

    public static final String b(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-907677715, 0, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        aVar.r(AndroidCompositionLocals_androidKt.a);
        String string = ((Context) aVar.r(AndroidCompositionLocals_androidKt.b)).getResources().getString(i);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return string;
    }

    public static q630 c(q630 q630Var, mb2 mb2Var) {
        return q630Var.g(new slb0(mb2Var));
    }
}
