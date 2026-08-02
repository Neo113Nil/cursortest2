package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.yandex.go.permission.b;
import java.util.function.Consumer;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class aj7 implements yi7 {
    public final Activity a;
    public final v7j0 b;
    public pzt0 c;

    public aj7(Activity activity, v7j0 v7j0Var, ney neyVar) {
        this.a = activity;
        this.b = v7j0Var;
        iey pc5Var = new pc5(1, this);
        neyVar.b(pc5Var, pc5Var);
    }

    public final void b(final String str, final boolean z) {
        pzt0 pzt0Var = this.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c = ((b) this.b).c(2, new Consumer() { // from class: zi7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Activity activity = aj7.this.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str2 = str;
                if (booleanValue) {
                    Pattern pattern = bgb0.a;
                    bgb0.h(activity, new Intent("android.intent.action.CALL", Uri.parse("tel:" + str2)));
                    return;
                }
                jst.e.c("! Still do not have phone call permissions");
                if (z) {
                    bgb0.j(activity, str2);
                }
            }
        });
    }
}
