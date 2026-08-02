package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;

/* loaded from: classes13.dex */
public final class n300 implements pj41 {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ n300(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.pj41
    public final Boolean a(Uri uri) {
        int i = this.a;
        boolean z = false;
        Context context = this.b;
        switch (i) {
            case 0:
                if (jl40.l(uri.getScheme(), "mailto")) {
                    uri.toString();
                    z = irb1.b(context, new Intent("android.intent.action.SENDTO", uri));
                }
                return Boolean.valueOf(z);
            case 1:
                if (jl40.l(uri.getScheme(), "tel")) {
                    uri.toString();
                    z = irb1.b(context, new Intent("android.intent.action.DIAL", uri));
                }
                return Boolean.valueOf(z);
            default:
                if (jl40.l(uri.getScheme(), "whatsapp")) {
                    uri.toString();
                    if (!irb1.b(context, new Intent("android.intent.action.VIEW", uri))) {
                        try {
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.whatsapp")));
                        } catch (ActivityNotFoundException unused) {
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")));
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.pj41
    public final boolean c(WebResourceRequest webResourceRequest) {
        switch (this.a) {
        }
        return a(webResourceRequest.getUrl()).booleanValue();
    }
}
