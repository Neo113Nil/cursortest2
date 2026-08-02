package xsna;

import android.view.View;
import com.vk.voip.ui.ns.NoiseSuppressorFeature$State;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: MenuIntegrationSearchDelegateImpl.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class o620 extends MutablePropertyReference0Impl {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o620(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((n620) this.receiver).j;
            default:
                k570 k570Var = (k570) this.receiver;
                qcy<Object>[] qcyVarArr = k570.h;
                return k570Var.c();
        }
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        switch (this.b) {
            case 0:
                ((n620) this.receiver).j = (View) obj;
                break;
            default:
                qcy<Object>[] qcyVarArr = k570.h;
                ((k570) this.receiver).e((NoiseSuppressorFeature$State) obj);
                break;
        }
    }
}
