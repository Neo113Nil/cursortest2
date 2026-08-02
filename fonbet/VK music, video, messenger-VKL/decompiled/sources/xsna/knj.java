package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Result;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: context.kt */
/* loaded from: classes4.dex */
public final class knj {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final xqo0 b;

    static {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(knj.class, "typedValue", "getTypedValue()Landroid/util/TypedValue;");
        fpf0.a.getClass();
        a = new qcy[]{propertyReference0Impl};
        b = new xqo0(new nm0(10));
    }

    public static final Drawable a(int i, Context context) {
        Object failure;
        try {
            failure = m33.a(i, context);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Drawable) failure;
    }
}
