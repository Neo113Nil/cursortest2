package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BookingServiceScreenStore.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class bx7 implements omf0, g0t {
    public static final bx7 b = new bx7();

    public final boolean equals(Object obj) {
        if ((obj instanceof omf0) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, com.vk.ecomm.onlinebooking.impl.services.presentation.f.class, "<init>", "<init>()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new com.vk.ecomm.onlinebooking.impl.services.presentation.f();
    }
}
