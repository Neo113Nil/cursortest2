package defpackage;

import com.yandex.go.taxi.order.chat.navigation.b;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes14.dex */
public final /* synthetic */ class p3y0 implements jms {
    public final /* synthetic */ b a;

    public p3y0(b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p3y0) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(0, this.a, b.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
