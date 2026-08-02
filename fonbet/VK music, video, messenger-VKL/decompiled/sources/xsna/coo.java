package xsna;

import android.content.Context;
import com.vk.dto.common.ImageSizeKey;
import com.vkontakte.android.R;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: DurationFormatter.kt */
/* loaded from: classes17.dex */
public final class coo {
    public static final /* synthetic */ qcy<Object>[] c;
    public final Context a;
    public final wqo0 b = new wqo0(new tj2(11));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(coo.class, "sb", "getSb()Ljava/lang/StringBuilder;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public coo(Context context) {
        this.a = context;
    }

    public static void b(int i, StringBuilder sb) {
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "Illegal duration value: "));
        }
        int i2 = i / 3600;
        int i3 = (i / 60) % 60;
        int i4 = i % 60;
        if (i2 > 0) {
            sb.append(i2);
            sb.append(':');
            if (i3 < 10) {
                sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
            }
            sb.append(i3);
            sb.append(':');
        } else {
            sb.append(i3);
            sb.append(':');
        }
        if (i4 < 10) {
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        sb.append(i4);
    }

    public final String a(int i) {
        e().setLength(0);
        b(i, e());
        return e().toString();
    }

    public final String c(int i) {
        e().setLength(0);
        d(i, e());
        return e().toString();
    }

    public final void d(int i, StringBuilder sb) {
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "Illegal duration value: "));
        }
        int i2 = i / 3600;
        int i3 = (i / 60) % 60;
        int i4 = i % 60;
        Context context = this.a;
        if (i2 > 0) {
            sb.append(enj.f(R.plurals.duration_accessibility_hours, i2, context));
            sb.append(' ');
        }
        if (i3 > 0) {
            sb.append(enj.f(R.plurals.duration_accessibility_minutes, i3, context));
            sb.append(' ');
        }
        if (i4 > 0) {
            sb.append(enj.f(R.plurals.duration_accessibility_seconds, i4, context));
        }
    }

    public final StringBuilder e() {
        qcy<Object> qcyVar = c[0];
        wqo0 wqo0Var = this.b;
        wqo0Var.getClass();
        return (StringBuilder) wqo0Var.get();
    }
}
