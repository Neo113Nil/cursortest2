package defpackage;

import android.os.Handler;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class oy10 {
    public static final /* synthetic */ kgx[] e;
    public final boolean a;
    public final op3 b = new op3();
    public final Handler c;
    public final /* synthetic */ py10 d;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("lightRequest", 0, "getLightRequest()Lcom/yandex/messaging/Cancelable;", oy10.class);
        qoi0.a.getClass();
        e = new kgx[]{mutablePropertyReference1Impl};
    }

    public oy10(py10 py10Var, boolean z) {
        this.d = py10Var;
        this.a = z;
        this.c = new Handler(py10Var.a.getLooper());
    }
}
