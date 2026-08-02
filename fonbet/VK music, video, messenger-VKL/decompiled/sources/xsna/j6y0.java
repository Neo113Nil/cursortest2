package xsna;

import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: ZipFiles.kt */
/* loaded from: classes8.dex */
public final class j6y0 extends Lambda implements wzs<Integer, Long, s3q0> {
    final /* synthetic */ Ref$LongRef $compressedSize;
    final /* synthetic */ Ref$BooleanRef $hasZip64Extra;
    final /* synthetic */ Ref$LongRef $offset;
    final /* synthetic */ long $requiredZip64ExtraSize;
    final /* synthetic */ Ref$LongRef $size;
    final /* synthetic */ bn8 $this_readEntry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6y0(Ref$BooleanRef ref$BooleanRef, long j, Ref$LongRef ref$LongRef, e8f0 e8f0Var, Ref$LongRef ref$LongRef2, Ref$LongRef ref$LongRef3) {
        super(2);
        this.$hasZip64Extra = ref$BooleanRef;
        this.$requiredZip64ExtraSize = j;
        this.$size = ref$LongRef;
        this.$this_readEntry = e8f0Var;
        this.$compressedSize = ref$LongRef2;
        this.$offset = ref$LongRef3;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(Integer num, Long l) {
        int intValue = num.intValue();
        long longValue = l.longValue();
        if (intValue == 1) {
            Ref$BooleanRef ref$BooleanRef = this.$hasZip64Extra;
            if (ref$BooleanRef.element) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            ref$BooleanRef.element = true;
            if (longValue < this.$requiredZip64ExtraSize) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            Ref$LongRef ref$LongRef = this.$size;
            long j = ref$LongRef.element;
            if (j == 4294967295L) {
                j = this.$this_readEntry.l0();
            }
            ref$LongRef.element = j;
            Ref$LongRef ref$LongRef2 = this.$compressedSize;
            ref$LongRef2.element = ref$LongRef2.element == 4294967295L ? this.$this_readEntry.l0() : 0L;
            Ref$LongRef ref$LongRef3 = this.$offset;
            ref$LongRef3.element = ref$LongRef3.element == 4294967295L ? this.$this_readEntry.l0() : 0L;
        }
        return s3q0.a;
    }
}
