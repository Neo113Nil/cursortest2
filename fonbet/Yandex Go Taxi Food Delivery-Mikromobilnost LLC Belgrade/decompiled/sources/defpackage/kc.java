package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class kc implements xyw0, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xyw0
    public final void a(boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ButtonComponent) obj).setEnabled(z);
                break;
            case 1:
                ((xz3) obj).invoke(Boolean.valueOf(z));
                break;
            case 2:
                ((tls) obj).invoke(Boolean.valueOf(z));
                break;
            default:
                ((th40) obj).invoke(Boolean.valueOf(z));
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof xyw0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof xyw0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof xyw0) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof xyw0) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new FunctionReferenceImpl(1, (ButtonComponent) obj, ButtonComponent.class, "setEnabled", "setEnabled(Z)V", 0);
            case 1:
                return (xz3) obj;
            case 2:
                return (tls) obj;
            default:
                return (th40) obj;
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
