package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class n3h {
    public final Context a;
    public final y72 b;
    public final zh11 c;
    public final v9h d;

    public n3h(Context context, y72 y72Var, zh11 zh11Var, v9h v9hVar) {
        this.a = context;
        this.b = y72Var;
        this.c = zh11Var;
        this.d = v9hVar;
    }

    public final void a(Uri uri, DeeplinkSource deeplinkSource) {
        this.d.getClass();
        Class a = this.b.a(AndroidComponentRepository$Component.MAIN_ACTIVITY);
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) a);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.putExtra("deeplink_source", deeplinkSource);
        intent.setFlags(SelfTester_JCP.IMITA);
        try {
            this.c.a(uri);
            context.startActivity(intent, new Bundle());
        } catch (ActivityNotFoundException e) {
            jst.e.k(e, "failed to open deeplink, activity wasn't found");
        }
    }
}
