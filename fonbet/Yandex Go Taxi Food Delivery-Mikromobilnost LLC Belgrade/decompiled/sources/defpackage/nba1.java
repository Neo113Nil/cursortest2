package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.net.UnknownHostException;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes7.dex */
public abstract class nba1 {
    public static final Object a = new Object();

    public static final int a(int i) {
        return i >= 0 ? m810.b(i / Resources.getSystem().getDisplayMetrics().density) : i;
    }

    public static String b(String str, Throwable th) {
        String replace;
        synchronized (a) {
            try {
                if (th != null) {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 == null) {
                            replace = Log.getStackTraceString(th).trim().replace("\t", Extension.TAB_CHAR);
                            break;
                        }
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    }
                } else {
                    replace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder v = oyr.v(str, "\n  ");
        v.append(replace.replace("\n", "\n  "));
        v.append('\n');
        return v.toString();
    }

    public static void c(String str, String str2) {
        synchronized (a) {
            Log.e(str, str2);
        }
    }

    public static void d(String str, String str2) {
        synchronized (a) {
            Log.i(str, str2);
        }
    }

    public static void e() {
        synchronized (a) {
        }
    }

    public static final void f(z22 z22Var) {
        ((a) z22Var).a(new keo("yb_adapter_open_card_screen", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Открытие экрана банк сдк - открыть новую катру")));
    }

    public static final void g(z22 z22Var, int i, boolean z) {
        ((a) z22Var).a(new keo("yb_adapter_poll_card", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Проверка наличия карты пэй у пользователя"), new Pair("attempt", String.valueOf(i)), new Pair("has_card", String.valueOf(z)))));
    }

    public static final void h(z22 z22Var, String str) {
        ((a) z22Var).a(new keo("yb_adapter_error", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка"), new Pair(Constants.KEY_MESSAGE, str))));
    }
}
