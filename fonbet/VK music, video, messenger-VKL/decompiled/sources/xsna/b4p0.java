package xsna;

import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: ToolbarVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class b4p0 extends MutablePropertyReference0Impl {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4p0(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((ToolbarVh) this.receiver).H;
            default:
                return ((h4t0) this.receiver).i;
        }
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        switch (this.b) {
            case 0:
                ((ToolbarVh) this.receiver).H = (srh0) obj;
                break;
            default:
                ((h4t0) this.receiver).i = (yg5) obj;
                break;
        }
    }
}
