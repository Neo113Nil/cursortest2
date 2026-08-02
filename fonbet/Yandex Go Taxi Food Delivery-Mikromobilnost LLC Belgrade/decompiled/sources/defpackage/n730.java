package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes8.dex */
public final class n730 implements KSerializer {
    public static final n730 a = new n730();
    public static final o2f0 b = d6z.a("MorphlexTypedUnitSerializer", h2f0.o);

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        if (r1.equals("pt") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r1.equals("dp") != false) goto L16;
     */
    @Override // defpackage.myi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deserialize(Decoder decoder) {
        int i;
        String p = decoder.p();
        int hashCode = p.hashCode();
        if (hashCode != 3212) {
            if (hashCode != 3588) {
                i = (hashCode == 3592 && p.equals("px")) ? 0 : 1;
            }
            w511.q();
            return null;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str;
        int intValue = ((Number) obj).intValue();
        if (intValue == 0) {
            str = "px";
        } else {
            if (intValue != 1) {
                w511.q();
                return;
            }
            str = "dp";
        }
        encoder.t(str);
    }
}
