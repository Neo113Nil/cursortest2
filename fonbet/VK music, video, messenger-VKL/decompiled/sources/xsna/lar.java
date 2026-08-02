package xsna;

import android.content.Context;
import android.content.res.Resources;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: FileSizeFormatter.kt */
/* loaded from: classes17.dex */
public final class lar {
    public static final lar a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final Resources c;
    public static final Object d;
    public static final Object e;
    public static final Object f;
    public static final Object g;
    public static final char h;
    public static final wqo0 i;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(lar.class, "sb", "getSb()Ljava/lang/StringBuilder;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
        a = new lar();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        c = context.getResources();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        int i2 = 14;
        d = msy.a(lazyThreadSafetyMode, new l63(i2));
        e = msy.a(lazyThreadSafetyMode, new af0(i2));
        f = msy.a(lazyThreadSafetyMode, new w9(13));
        g = msy.a(lazyThreadSafetyMode, new sk4(11));
        h = ' ';
        i = new wqo0(new o6(i2));
    }

    public static String a(long j) {
        c().setLength(0);
        b(j, c());
        return c().toString();
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public static void b(long j, StringBuilder sb) {
        long j2 = j / 1073741824;
        long j3 = j / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        long j4 = j / 1024;
        char c2 = h;
        if (j2 >= 1) {
            sb.append(i35.k(j / 1073741824, 2));
            sb.append(c2);
            sb.append((String) d.getValue());
            return;
        }
        ?? r1 = e;
        if (j3 >= 10) {
            sb.append(j3);
            sb.append(c2);
            sb.append((String) r1.getValue());
        } else if (j3 >= 1) {
            sb.append(i35.k(j / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, 2));
            sb.append(c2);
            sb.append((String) r1.getValue());
        } else if (j4 > 1) {
            sb.append(j4);
            sb.append(c2);
            sb.append((String) f.getValue());
        } else {
            sb.append(j);
            sb.append(c2);
            sb.append((String) g.getValue());
        }
    }

    public static StringBuilder c() {
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = i;
        wqo0Var.getClass();
        return (StringBuilder) wqo0Var.get();
    }
}
