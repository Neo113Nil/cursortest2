package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: OverrideDomainContext.kt */
/* loaded from: classes17.dex */
public final class w390 {
    public static final w390 a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static volatile gzs<UserId> c;
    public static final nf3 d;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(w390.class, "_app", "get_app()Landroid/app/Application;", 0);
        fpf0.a.getClass();
        b = new qcy[]{mutablePropertyReference1Impl};
        a = new w390();
        c = new pr0(27);
        d = new nf3();
    }

    public static UserId a() {
        return c.invoke();
    }
}
