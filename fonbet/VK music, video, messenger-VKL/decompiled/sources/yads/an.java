package yads;

import android.view.ViewTreeObserver;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.fpf0;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class an {
    public static final /* synthetic */ qcy[] d;
    public final ViewTreeObserver.OnPreDrawListener a;
    public zf0 b;
    public final mn2 c = nn2.a(null);

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(an.class, "parentDesignView", "getParentDesignView()Landroid/view/ViewGroup;", 0);
        fpf0.a.getClass();
        d = new qcy[]{mutablePropertyReference1Impl};
    }

    public an(ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.a = onPreDrawListener;
    }
}
