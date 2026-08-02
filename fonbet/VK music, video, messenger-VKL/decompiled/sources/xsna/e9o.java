package xsna;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: DownloadManagerUtils.kt */
/* loaded from: classes3.dex */
public final class e9o {
    public static final e9o a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final f18 c;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(e9o.class, "isEnabled", "isEnabled()Z", 0);
        fpf0.a.getClass();
        b = new qcy[]{mutablePropertyReference1Impl};
        a = new e9o();
        c = new f18("dm_prefs", "is_enabled", true);
    }

    public final boolean a() {
        qcy<Object> qcyVar = b[0];
        return c.a().booleanValue();
    }
}
