package defpackage;

import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import yads.ve3;

/* loaded from: classes7.dex */
public final class js81 {
    public static final /* synthetic */ kgx[] c;
    public final Set a = u4r0.d(ve3.b);
    public final oji b = new oji(this);

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ACSPConstants.STATUS, 0, "getStatus()Lcom/monetization/ads/video/status/VideoAdStatus;", js81.class);
        qoi0.a.getClass();
        c = new kgx[]{mutablePropertyReference1Impl};
    }

    public final void a(ve3 ve3Var) {
        this.b.setValue(this, c[0], ve3Var);
    }
}
