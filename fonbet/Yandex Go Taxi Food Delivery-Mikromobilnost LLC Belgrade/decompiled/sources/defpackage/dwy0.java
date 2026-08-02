package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes15.dex */
public final class dwy0 {
    public final Context a;
    public final rz10 b;
    public final int c = w0i0.Messaging_ThemeOverlay_Dark;

    public dwy0(Context context, rz10 rz10Var) {
        this.a = context;
        this.b = rz10Var;
    }

    public final List a() {
        return (List) this.b.m.invoke();
    }

    public final int b() {
        tje.e();
        Context context = this.a;
        String string = context.getSharedPreferences("messenger", 0).getString("selected_theme_v2", null);
        rz10 rz10Var = this.b;
        if (string == null) {
            return rz10Var.l != null ? Integer.valueOf(r0i0.MessengerStyle).intValue() : w0i0.Messaging_ThemeOverlay;
        }
        int identifier = context.getResources().getIdentifier(string, "style", context.getPackageName());
        return identifier == 0 ? rz10Var.l != null ? Integer.valueOf(r0i0.MessengerStyle).intValue() : w0i0.Messaging_ThemeOverlay : identifier;
    }
}
