package defpackage;

import flex.section.divkit.cache.DivWrapperView;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class iul implements jul, jms {
    public static final iul a = new iul();

    @Override // defpackage.jul
    public final hul a(DivWrapperView divWrapperView) {
        return new hul(divWrapperView);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof jul) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, 0, hul.class, "<init>", "<init>(Lflex/section/divkit/cache/DivWrapperView;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
