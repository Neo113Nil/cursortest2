package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class ai2 extends Lambda implements izs<Object, Boolean> {
    final /* synthetic */ Object $stateForContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai2(Object obj) {
        super(1);
        this.$stateForContent = obj;
    }

    @Override // xsna.izs
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(epx.f(obj, this.$stateForContent));
    }
}
