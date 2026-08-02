package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.List;
import xsna.h7u0;

/* compiled from: CommunityErrorAlertDialog.kt */
/* loaded from: classes5.dex */
public final class e2h {
    public static final void a(Context context, Throwable th) {
        String g = j03.g(context, th, R.string.error);
        if (th instanceof VKApiExecutionException) {
            List<VKApiExecutionException> v = ((VKApiExecutionException) th).v();
            List<VKApiExecutionException> list = v;
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) ((list == null || list.isEmpty()) ? th : v.get(0));
            int s = vKApiExecutionException.s();
            if (s != 14) {
                if (s == 15) {
                    g = context.getString(R.string.page_blacklist);
                } else if (s != 17 && s != 24) {
                    if (s == 103 && vKApiExecutionException.C() == 1) {
                        g = context.getString(R.string.exceded_max_communtity_count);
                    }
                }
            }
            L.i(th);
            return;
        }
        h7u0.a aVar = new h7u0.a(context);
        aVar.g0(R.string.error);
        aVar.a.f = g;
        aVar.c0(R.string.vk_ok, null);
        aVar.m();
    }
}
