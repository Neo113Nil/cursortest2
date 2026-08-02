package defpackage;

import com.yandex.go.rida.mainscreen.router.e;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes13.dex */
public final /* synthetic */ class e5k0 implements sy60, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ e5k0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        int i2 = 9;
        e eVar = this.b;
        switch (i) {
            case 0:
                eVar.r(new qu(i2));
                break;
            default:
                eVar.r(new qu(i2));
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
        return new AdaptedFunctionReference(0, this.b, e.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
