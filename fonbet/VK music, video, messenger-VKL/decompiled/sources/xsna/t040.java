package xsna;

import android.content.Context;
import com.vk.dto.common.ImageSizeKey;
import com.vkontakte.android.R;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: MsgTimeFormatter.kt */
/* loaded from: classes2.dex */
public final class t040 {
    public static final /* synthetic */ qcy<Object>[] b = {new PropertyReference1Impl(t040.class, "timeZone", "getTimeZone()Ljava/util/TimeZone;", 0), b09.a(0, t040.class, "date", "getDate()Ljava/util/Date;", fpf0.a)};
    public static final t040 a = new t040();
    public static final long c = TimeUnit.HOURS.toMillis(1);
    public static final long d = TimeUnit.MINUTES.toMillis(1);
    public static final wqo0 e = new wqo0(new f20(23));
    public static final wqo0 f = new wqo0(new wb1(26));

    public static void a(long j, boolean z, Context context, StringBuilder sb, boolean z2) {
        int rawOffset;
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "localTime must be >= 0. Given: "));
        }
        xuo0.a.getClass();
        long d2 = xuo0.d(j);
        qcy<Object>[] qcyVarArr = b;
        qcy<Object> qcyVar = qcyVarArr[1];
        wqo0 wqo0Var = f;
        wqo0Var.getClass();
        ((Date) wqo0Var.get()).setTime(d2);
        TimeZone b2 = b();
        qcy<Object> qcyVar2 = qcyVarArr[1];
        wqo0Var.getClass();
        if (b2.inDaylightTime((Date) wqo0Var.get())) {
            rawOffset = b().getDSTSavings() + b().getRawOffset();
        } else {
            rawOffset = b().getRawOffset();
        }
        long j2 = d2 + rawOffset;
        int i = (int) ((j2 / c) % 24);
        int i2 = (int) ((j2 / d) % 60);
        sb.setLength(0);
        if (z && z2) {
            sb.append(context.getString(R.string.vkim_msg_edit_mark));
            sb.append(" ");
        }
        if (i < 10) {
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        sb.append(i);
        sb.append(':');
        if (i2 < 10) {
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        sb.append(i2);
    }

    public static TimeZone b() {
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = e;
        wqo0Var.getClass();
        return (TimeZone) wqo0Var.get();
    }
}
