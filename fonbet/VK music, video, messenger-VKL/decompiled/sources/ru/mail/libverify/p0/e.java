package ru.mail.libverify.p0;

import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public final class e {
    public static final ru.mail.libverify.p0.a[] a = ru.mail.libverify.p0.a.values();

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.EXTENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        EXTENDED,
        NORMAL,
        NONE
    }

    @NonNull
    public static ru.mail.libverify.p0.a a(@NonNull Message message, @NonNull String str, @NonNull b bVar) {
        int i = message.what;
        ru.mail.libverify.p0.a[] aVarArr = a;
        if (i >= aVarArr.length || i < 0) {
            throw new IllegalArgumentException("msg.what must be a member of BusMessageType");
        }
        ru.mail.libverify.p0.a aVar = aVarArr[i];
        int i2 = a.a[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return aVar;
            }
            FileLog.v(str, "handle msg %s (data = %s)", aVar, message.obj);
            return aVar;
        }
        Object obj = message.obj;
        if (obj == null || !obj.getClass().isArray()) {
            FileLog.v(str, "handle msg %s (data = %s)", aVar, message.obj);
            return aVar;
        }
        FileLog.v(str, "handle msg %s (data = %s)", aVar, Arrays.toString((Object[]) message.obj));
        return aVar;
    }

    @NonNull
    public static Map b(@NonNull Message message) {
        Object obj = message.obj;
        if (obj != null) {
            return (Map) obj;
        }
        FileLog.e("MessageBusUtils", "Argument map must be non null (%s)", a[message.what]);
        throw new IllegalArgumentException("Argument map must be non null");
    }

    @Nullable
    public static <T> T c(@NonNull Message message, int i) {
        Object obj = message.obj;
        if (obj instanceof Object[]) {
            return (T) ((Object[]) obj)[i];
        }
        FileLog.e("MessageBusUtils", "Argument arrays must be non null (%s)", a[message.what]);
        throw new IllegalArgumentException("Argument arrays must be non null");
    }

    @NonNull
    public static <T> T b(@NonNull Message message, int i) {
        Object obj = message.obj;
        if (obj instanceof Object[]) {
            T t = (T) ((Object[]) obj)[i];
            if (t != null) {
                return t;
            }
            FileLog.e("MessageBusUtils", "Argument must be non null");
            throw new IllegalArgumentException("Argument must not be null");
        }
        FileLog.e("MessageBusUtils", "Argument arrays must be non null (%s)", a[message.what]);
        throw new IllegalArgumentException("Argument arrays must be non null");
    }

    @NonNull
    public static Message a(@NonNull ru.mail.libverify.p0.a aVar, @Nullable Object obj) {
        int ordinal = aVar.ordinal();
        Message obtain = Message.obtain();
        obtain.what = ordinal;
        obtain.obj = obj;
        return obtain;
    }

    @NonNull
    public static Message a(@NonNull ru.mail.libverify.p0.a aVar, @NonNull Object... objArr) {
        int ordinal = aVar.ordinal();
        Message obtain = Message.obtain();
        obtain.what = ordinal;
        obtain.obj = objArr;
        return obtain;
    }

    @NonNull
    public static Object a(@NonNull Message message) {
        Object obj = message.obj;
        if (obj != null) {
            return obj;
        }
        FileLog.e("MessageBusUtils", "Argument must be non null (%s)", a[message.what]);
        throw new IllegalArgumentException("Argument must not be null");
    }

    @NonNull
    public static Object[] a(@NonNull Message message, int i) {
        Object obj = message.obj;
        if (obj instanceof Object[]) {
            return (Object[]) ((Object[]) obj)[i];
        }
        FileLog.e("MessageBusUtils", "Arguments array must be non null (%s)", a[message.what]);
        throw new IllegalArgumentException("Arguments array must be non null");
    }
}
