package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public final class j0x {
    public final Context a;
    public final c220 b;
    public final x22 c;

    public j0x(Context context, c220 c220Var, x22 x22Var) {
        this.a = context;
        this.b = c220Var;
        this.c = x22Var;
    }

    public final boolean a(Uri uri) {
        x22 x22Var = this.c;
        try {
            if (this.b.a(uri)) {
                x22Var.c("external url", "url", uri.toString());
                return true;
            }
            String scheme = uri.getScheme();
            Context context = this.a;
            if (scheme != null) {
                int hashCode = scheme.hashCode();
                if (hashCode != -1081572750) {
                    if (hashCode == 114715 && scheme.equals("tel")) {
                        Intent intent = new Intent("android.intent.action.DIAL", uri);
                        intent.addFlags(SelfTester_JCP.IMITA);
                        context.startActivity(intent);
                        return true;
                    }
                } else if (scheme.equals("mailto")) {
                    Intent createChooser = Intent.createChooser(new Intent("android.intent.action.SENDTO", uri), context.getString(oyh0.messaging_email_chooser_title));
                    createChooser.addFlags(SelfTester_JCP.IMITA);
                    context.startActivity(createChooser);
                    return true;
                }
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            intent2.addFlags(SelfTester_JCP.IMITA);
            intent2.addCategory("android.intent.category.BROWSABLE");
            context.startActivity(intent2);
            return true;
        } catch (ActivityNotFoundException e) {
            x22Var.reportError("url failed", e);
            return false;
        }
    }
}
