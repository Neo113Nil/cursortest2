package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;

/* loaded from: classes9.dex */
public final class kiz0 {
    public final Context a;
    public final String b;

    public kiz0(Context context) {
        this.a = context;
        this.b = context.getPackageName();
    }

    public static final void a(Context context, izs izsVar, ServiceConnection serviceConnection) {
        if (!inj.a(context, "ru.vk.store.qa") && !inj.a(context, "ru.vk.store")) {
            izsVar.invoke(new RuStoreNotInstalledException());
            return;
        }
        Intent intent = new Intent("ru.vk.store.provider.review.RemoteReviewFlowProvider");
        ComponentName k = atv0.k(context.getPackageManager().queryIntentServices(intent, 0));
        if (k == null) {
            izsVar.invoke(new RuStoreOutdatedException());
        } else {
            intent.setComponent(k);
            context.bindService(intent, serviceConnection, 1);
        }
    }
}
