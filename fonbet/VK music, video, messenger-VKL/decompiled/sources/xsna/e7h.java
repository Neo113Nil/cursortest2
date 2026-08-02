package xsna;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.ironsource.X3;
import com.vk.api.internal.utils.NetworkBroadcastReceiver;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.util.Date;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class e7h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e7h(defpackage.b0 b0Var, Activity activity, String str, String str2, ifx0 ifx0Var) {
        this.b = 2;
        this.e = str;
        this.c = activity;
        this.d = b0Var;
        this.f = str2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String g;
        File q;
        switch (this.b) {
            case 0:
                ((j7h) this.c).d((oap) this.d, (String) this.e, null, (String) this.f);
                return s3q0.a;
            case 1:
                return new DateTimePickerState((Date) this.c, (k9x) this.d, (com.vk.core.compose.component.datetime.l) this.e, (DateTimePickerState.UpdateValueFromDialogsStrategy) this.f);
            default:
                String str = (String) this.e;
                Activity activity = (Activity) this.c;
                defpackage.b0 b0Var = (defpackage.b0) this.d;
                String str2 = (String) this.f;
                try {
                    Uri parse = Uri.parse(str);
                    g = com.vk.core.files.a.g(str);
                    if (!mcr0.n(str) && !X3.i.b.equals(parse.getScheme())) {
                        u7v0 u7v0Var = new u7v0(activity, 6);
                        Object obj = new Object();
                        Handler handler = owi.a;
                        handler.postAtTime(new w29(u7v0Var, 2), obj, SystemClock.uptimeMillis() + 1000);
                        NetworkBroadcastReceiver.a.getClass();
                        if (!NetworkBroadcastReceiver.b()) {
                            Object obj2 = new Object();
                            NetworkBroadcastReceiver.a(obj2);
                            synchronized (obj2) {
                                obj2.wait();
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                        handler.removeCallbacksAndMessages(obj);
                    }
                    q = mcr0.q(parse);
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(activity.getString(R.string.share_unsupported), e));
                    com.vk.core.utils.newtork.b.a.getClass();
                    if (com.vk.core.utils.newtork.b.d()) {
                        enj.q(R.string.share_unsupported, 0, activity);
                        b0Var.invoke(Boolean.FALSE);
                    } else {
                        enj.q(R.string.vkim_share_no_network, 0, activity);
                        b0Var.invoke(Boolean.FALSE);
                    }
                }
                if (q == null) {
                    enj.q(R.string.share_unsupported, 0, activity);
                    b0Var.invoke(Boolean.FALSE);
                    return s3q0.a;
                }
                File file = new File(activity.getExternalCacheDir(), System.currentTimeMillis() + JwtParser.SEPARATOR_CHAR + g);
                com.vk.core.files.a.a(q, file);
                Uri N = com.vk.core.files.a.N(file);
                if (N == null) {
                    enj.q(R.string.share_unsupported, 0, activity);
                    b0Var.invoke(Boolean.FALSE);
                    return s3q0.a;
                }
                activity.startActivity(Intent.createChooser(ifx0.c(N, str2), activity.getString(R.string.vk_apps_share)));
                b0Var.invoke(Boolean.TRUE);
                return s3q0.a;
        }
    }

    public /* synthetic */ e7h(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
