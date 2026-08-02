package androidx.media3.common.util;

import android.content.Context;
import android.content.IntentFilter;
import defpackage.c260;
import ru.yandex.yx_platform_api.InternetConnectionStreamHandler;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Context context, int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Context context = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(InternetConnectionStreamHandler.CONNECTIVITY_ACTION);
                context.registerReceiver(new NetworkTypeObserver$Receiver((c260) obj), intentFilter);
                break;
            default:
                ((NetworkTypeObserver$Receiver) obj).lambda$onReceive$0(context);
                break;
        }
    }
}
