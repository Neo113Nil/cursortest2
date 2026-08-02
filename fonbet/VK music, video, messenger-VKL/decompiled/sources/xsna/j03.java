package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vkontakte.android.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ApiUtils.kt */
/* loaded from: classes15.dex */
public final class j03 {
    public static final j03 a = new j03();

    public static boolean a(int i, Throwable th) {
        return (th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == i;
    }

    public static int b(VKApiExecutionException vKApiExecutionException, int i) {
        switch (vKApiExecutionException.s()) {
            case -3:
            case 10:
                return R.string.internal_server_error;
            case -1:
                return R.string.default_network_error;
            case 15:
            case 200:
            case 201:
            case 203:
            case 211:
            case PLACEMENT_SLEEP_VALUE:
                return R.string.access_error;
            case 103:
                return R.string.rate_limit_error;
            case 129:
                return R.string.invalid_photo_format_error;
            case 300:
                return R.string.album_full_error;
            case 800:
                return R.string.video_already_added_error;
            case 953:
                return R.string.invalid_name_error;
            case 5800:
                return R.string.self_money_transfer_error;
            default:
                return i;
        }
    }

    public static int c(Throwable th) {
        return th instanceof VKApiExecutionException ? b((VKApiExecutionException) th, R.string.error) : R.string.error;
    }

    public static final String d(Context context, VKApiExecutionException vKApiExecutionException) {
        a.getClass();
        return e(context, vKApiExecutionException, R.string.error);
    }

    public static String e(Context context, VKApiExecutionException vKApiExecutionException, int i) {
        L.i(vKApiExecutionException);
        if (vKApiExecutionException.s() <= 0 || !vKApiExecutionException.x()) {
            return context.getString(b(vKApiExecutionException, i));
        }
        String message = vKApiExecutionException.getMessage();
        return message == null ? context.getString(b(vKApiExecutionException, i)) : message;
    }

    public static final String f(Context context, Throwable th) {
        return g(context, th, R.string.error);
    }

    public static final String g(Context context, Throwable th, int i) {
        if (th instanceof VKApiExecutionException) {
            a.getClass();
            return e(context, (VKApiExecutionException) th, i);
        }
        if (th != null) {
            L.i(th);
        }
        return context.getString(i);
    }

    public static tlo0 h(Throwable th) {
        if (!(th instanceof VKApiExecutionException)) {
            if (th != null) {
                L.i(th);
            }
            return tq.h(tlo0.Companion, R.string.error);
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        L.i(vKApiExecutionException);
        if (vKApiExecutionException.s() <= 0 || !vKApiExecutionException.x()) {
            return tq.h(tlo0.Companion, b(vKApiExecutionException, R.string.error));
        }
        String message = vKApiExecutionException.getMessage();
        return message != null ? oq.d(tlo0.Companion, message) : tq.h(tlo0.Companion, b(vKApiExecutionException, R.string.error));
    }

    public static final void i(Context context, VKApiExecutionException vKApiExecutionException) {
        if (context != null) {
            int s = vKApiExecutionException.s();
            if (s == -2 || s == 14 || s == 17 || s == 24) {
                L.i(vKApiExecutionException);
            } else {
                L.i(vKApiExecutionException);
                enj.r(context, d(context, vKApiExecutionException), 0);
            }
        }
    }

    public static final void j(Context context, Throwable th) {
        enj.r(context, g(context, th, R.string.error), 0);
    }

    public static void k(VKApiExecutionException vKApiExecutionException) {
        i(vx2.d.getContext(), vKApiExecutionException);
    }

    public static final void l(Throwable th) {
        j(vx2.d.getContext(), th);
    }

    public static final nkv m(String str, JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(str) || jSONObject.optJSONObject(str) == null) {
            return null;
        }
        nkv nkvVar = new nkv();
        JSONArray optJSONArray = jSONObject.getJSONObject(str).optJSONArray("items");
        nkvVar.c = optJSONArray;
        if (optJSONArray == null) {
            return null;
        }
        nkvVar.b = jSONObject.getJSONObject(str).getInt("count");
        return nkvVar;
    }
}
