package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.search.SearchStatsLoggingInfo;

/* compiled from: LinkRouter.kt */
/* loaded from: classes.dex */
public interface maz {
    static /* synthetic */ boolean c(maz mazVar, Context context, String str, LaunchContext launchContext, Bundle bundle, yp80 yp80Var, int i) {
        yp80 yp80Var2;
        maz mazVar2;
        Context context2;
        String str2;
        if ((i & 4) != 0) {
            LaunchContext launchContext2 = LaunchContext.A;
            launchContext = LaunchContext.b.a();
        }
        LaunchContext launchContext3 = launchContext;
        Bundle bundle2 = (i & 8) != 0 ? null : bundle;
        if ((i & 16) != 0) {
            yp80Var2 = null;
            context2 = context;
            str2 = str;
            mazVar2 = mazVar;
        } else {
            yp80Var2 = yp80Var;
            mazVar2 = mazVar;
            context2 = context;
            str2 = str;
        }
        return mazVar2.l(context2, str2, launchContext3, bundle2, yp80Var2);
    }

    @ozl
    default boolean a(Context context, String str) {
        LaunchContext launchContext = LaunchContext.A;
        return c(this, context, str, LaunchContext.b.a(), null, null, 24);
    }

    boolean d(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var);

    void e(Context context, ActionOpenUrl actionOpenUrl, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, Bundle bundle);

    void f(Context context, String str, q21 q21Var);

    default String h(String str) {
        return "";
    }

    boolean i(Context context, Uri uri);

    boolean l(Context context, String str, LaunchContext launchContext, Bundle bundle, yp80 yp80Var);

    default void k(Context context, String str) {
    }

    default void b(Activity activity, int i, String str) {
    }

    default void g(Context context, String str, eo2 eo2Var) {
    }
}
