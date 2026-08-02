package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.newtab.NewTabPolicy;
import kotlin.Result;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes12.dex */
public final class f660 {
    public final Context a;
    public final NewTabPolicy b;

    public f660(Context context, NewTabPolicy newTabPolicy) {
        this.a = context;
        this.b = newTabPolicy;
    }

    public final void a(String str) {
        Object failure;
        try {
            failure = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Uri uri = (Uri) failure;
        if (uri == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addCategory("android.intent.category.BROWSABLE");
        Context context = this.a;
        if (!(context instanceof Activity)) {
            intent.addFlags(SelfTester_JCP.IMITA);
        }
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }
}
