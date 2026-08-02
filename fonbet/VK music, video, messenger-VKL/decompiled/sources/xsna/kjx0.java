package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.webkit.WebView;
import com.vk.core.util.RecreateActivity;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: WebViewRenderProcessHelper.kt */
/* loaded from: classes7.dex */
public final class kjx0 {
    public static final boolean a(WebView webView) {
        final Context context;
        if (webView == null || (context = webView.getContext()) == null) {
            return false;
        }
        int i = h7u0.p;
        h7u0.a a = h7u0.b.a(context);
        a.U(R.string.web_view_crashed_dialog_message);
        a.Z(new lad(context, 2));
        a.a0(new DialogInterface.OnDismissListener() { // from class: xsna.jjx0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                int i2 = RecreateActivity.b;
                RecreateActivity.a.b(0L, context);
            }
        });
        a.m();
        return true;
    }
}
