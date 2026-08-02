package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vkontakte.android.VKApplication;
import xsna.ucp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class q7r0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        VKApplication.a aVar = VKApplication.c;
        Preference.j();
        Preference.l();
        Preference.i();
        ucp ucpVar = ucp.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ucp.b bVar = ucp.r;
        if (bVar == null) {
            Preference.h(context, 0, "emoji");
        } else {
            bVar.provide();
        }
    }
}
