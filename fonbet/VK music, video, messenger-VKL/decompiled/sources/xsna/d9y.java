package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: JsonElementMarker.kt */
/* loaded from: classes8.dex */
public final class d9y {
    public final xap a;
    public boolean b;

    /* compiled from: JsonElementMarker.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements wzs<SerialDescriptor, Integer, Boolean> {
        @Override // xsna.wzs
        public final Boolean invoke(SerialDescriptor serialDescriptor, Integer num) {
            SerialDescriptor serialDescriptor2 = serialDescriptor;
            int intValue = num.intValue();
            d9y d9yVar = (d9y) this.receiver;
            d9yVar.getClass();
            boolean z = !serialDescriptor2.i(intValue) && serialDescriptor2.h(intValue).b();
            d9yVar.b = z;
            return Boolean.valueOf(z);
        }
    }

    public d9y(SerialDescriptor serialDescriptor) {
        this.a = new xap(serialDescriptor, new a(2, this, d9y.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
