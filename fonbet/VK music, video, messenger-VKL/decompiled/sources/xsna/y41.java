package xsna;

import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiConsumer;
import xsna.wer;

/* compiled from: AdviceAttributesProcessor.java */
/* loaded from: classes8.dex */
public final class y41 extends s770 {
    public final HashSet c;

    public y41(List<i94<?>> list) {
        this.c = new HashSet(list);
    }

    @Override // xsna.s770
    public final q94 r(q94 q94Var) {
        if (!(q94Var instanceof uow)) {
            final lk3 lk3Var = new lk3();
            q94Var.forEach(new BiConsumer() { // from class: xsna.ver
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    lk3.this.f((i94) obj, obj2);
                }
            });
            q94Var = lk3Var.e();
        }
        if (!(q94Var instanceof uow)) {
            throw new IllegalStateException("Expected ImmutableKeyValuePairs based implementation of Attributes. This is a programming error.");
        }
        Object[] objArr = ((uow) q94Var).b;
        BitSet bitSet = q94Var.size() > 32 ? new BitSet(q94Var.size()) : null;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        for (int i4 = 0; i4 < objArr.length; i4 += 2) {
            int i5 = i4 / 2;
            if (this.c.contains(objArr[i4])) {
                i3 = vul0.a(i3 * 31, 31, objArr[i4]) + objArr[i4 + 1].hashCode();
                i++;
            } else if (bitSet != null) {
                bitSet.set(i5);
            } else {
                i2 |= 1 << i5;
            }
        }
        return i == 0 ? jk3.e : bitSet != null ? new wer.a(objArr, i3, i, bitSet) : new wer.b(objArr, i3, i, i2);
    }

    public final String toString() {
        return "AdviceAttributesProcessor{attributeKeys=" + this.c + '}';
    }
}
