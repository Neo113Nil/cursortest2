package ru.ok.android.sdk.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.TypeCastException;
import xsna.emb;
import xsna.epx;

/* compiled from: Utils.kt */
/* loaded from: classes9.dex */
public final class Utils {
    public static final Utils INSTANCE = new Utils();
    private static Handler mainThreadHandler;

    private Utils() {
    }

    public static /* synthetic */ String getAdvertisingId$default(Utils utils, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return utils.getAdvertisingId(context, z);
    }

    public static /* synthetic */ void queueOnMain$default(Utils utils, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 10;
        }
        utils.queueOnMain(runnable, j);
    }

    public final void executeOnMain(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            queueOnMain$default(this, runnable, 0L, 2, null);
        }
    }

    public final String getAdvertisingId(Context context, boolean z) {
        String str = null;
        try {
            Object invoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
            if (invoke != null) {
                Object invoke2 = invoke.getClass().getMethod("getId", null).invoke(invoke, null);
                if (invoke2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                str = (String) invoke2;
            }
        } catch (ClassNotFoundException unused) {
            if (!z) {
                throw new IllegalStateException("A dependency on com.google.android.gms:play-services-ads is required in order to use Utils.getAdvertisingId");
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        if (str == null) {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        return str != null ? str : "";
    }

    public final Handler getMainThreadHandler() {
        if (mainThreadHandler == null) {
            mainThreadHandler = new Handler(Looper.getMainLooper());
        }
        return mainThreadHandler;
    }

    public final boolean isMainThread() {
        return epx.f(Looper.getMainLooper(), Looper.myLooper());
    }

    public final void queueOnMain(Runnable runnable, long j) {
        getMainThreadHandler().postDelayed(runnable, j);
    }

    public final String toMD5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes(emb.b));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            }
            return sb.toString().toLowerCase();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
