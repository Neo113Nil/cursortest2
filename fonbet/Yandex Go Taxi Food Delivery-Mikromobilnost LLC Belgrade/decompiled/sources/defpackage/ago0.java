package defpackage;

import com.yandex.go.scooters.passes.h;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes13.dex */
public final /* synthetic */ class ago0 implements sy60, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ ago0(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        h hVar = this.b;
        switch (i) {
            case 0:
                hVar.r(new qu(9));
                break;
            case 1:
                hVar.r(new qu(9));
                break;
            default:
                hVar.r(new qu(9));
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
        return new AdaptedFunctionReference(0, this.b, h.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
