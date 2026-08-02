package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vkontakte.android.R;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a2b implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        View view;
        Activity b;
        String obj;
        switch (this.b) {
            case 0:
                ((b2b) this.c).e.b(R.drawable.vk_icon_pin_24, R.string.vkim_channel_msg_action_success_pin);
                return;
            case 1:
                ((pcl) this.c).j = false;
                return;
            case 2:
                vtm f = ((com.vk.im.ui.components.dialogs_list.c) this.c).f();
                if (f != null) {
                    f.G.a();
                    return;
                }
                return;
            case 3:
                ((m990) this.c).h.set(false);
                return;
            case 4:
                ((gzs) this.c).invoke();
                return;
            case 5:
                l9m0 l9m0Var = (l9m0) this.c;
                kam0 kam0Var = l9m0Var.d;
                if (kam0Var == null || (view = kam0Var.a) == null || (b = enj.b(view)) == null || (obj = b.toString()) == null) {
                    return;
                }
                Preference.H("STORY_PRIVACY", "TEMP_PRIVACY_KEY", obj);
                Preference.H("STORY_PRIVACY", "TEMP_PRIVACY_VALUE", l9m0Var.e.j());
                return;
            case 6:
                ((com.vk.auth.ui.password.askpassword.a) this.c).b.r();
                return;
            default:
                gtw0 gtw0Var = (gtw0) this.c;
                synchronized (gtw0Var) {
                    if (gtw0Var.b) {
                        Throwable th = gtw0Var.c;
                        if (th != null) {
                            throw new RuntimeException("voip on first call initialization exception", th);
                        }
                        return;
                    }
                    if (BuildInfo.h()) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        try {
                            mqw0 mqw0Var = mqw0.a;
                            Context context = gtw0Var.a;
                            xkg xkgVar = xkg.a;
                            mqw0Var.a(context);
                            gtw0Var.b = true;
                            s3q0 s3q0Var = s3q0.a;
                            L.e("[initializeIfNeededInternal]: completed in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + UcumUtils.UCUM_MILLISECODS);
                        } finally {
                        }
                    } else {
                        try {
                            mqw0 mqw0Var2 = mqw0.a;
                            Context context2 = gtw0Var.a;
                            xkg xkgVar2 = xkg.a;
                            mqw0Var2.a(context2);
                        } finally {
                        }
                    }
                    return;
                }
        }
    }
}
