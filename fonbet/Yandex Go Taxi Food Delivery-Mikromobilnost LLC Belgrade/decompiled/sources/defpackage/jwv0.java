package defpackage;

import com.yandex.go.superapp.discovery.map.impl.navigation.c;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes14.dex */
public final /* synthetic */ class jwv0 implements sy60, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ jwv0(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                this.b.r(new qu(9));
                break;
            case 1:
                this.b.r(new qu(9));
                break;
            default:
                this.b.r(new qu(9));
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof sy60) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof sy60) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof sy60) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
        }
        return new AdaptedFunctionReference(0, this.b, c.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
