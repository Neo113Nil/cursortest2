package xsna;

import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ZipFiles.kt */
/* loaded from: classes8.dex */
public final class k6y0 extends Lambda implements wzs<Integer, Long, s3q0> {
    final /* synthetic */ Ref$ObjectRef<Long> $createdAtMillis;
    final /* synthetic */ Ref$ObjectRef<Long> $lastAccessedAtMillis;
    final /* synthetic */ Ref$ObjectRef<Long> $lastModifiedAtMillis;
    final /* synthetic */ bn8 $this_readOrSkipLocalHeader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6y0(bn8 bn8Var, Ref$ObjectRef<Long> ref$ObjectRef, Ref$ObjectRef<Long> ref$ObjectRef2, Ref$ObjectRef<Long> ref$ObjectRef3) {
        super(2);
        this.$this_readOrSkipLocalHeader = bn8Var;
        this.$lastModifiedAtMillis = ref$ObjectRef;
        this.$lastAccessedAtMillis = ref$ObjectRef2;
        this.$createdAtMillis = ref$ObjectRef3;
    }

    /* JADX WARN: Type inference failed for: r11v12, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Long] */
    @Override // xsna.wzs
    public final s3q0 invoke(Integer num, Long l) {
        int intValue = num.intValue();
        long longValue = l.longValue();
        if (intValue == 21589) {
            if (longValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte readByte = this.$this_readOrSkipLocalHeader.readByte();
            boolean z = (readByte & 1) == 1;
            boolean z2 = (readByte & 2) == 2;
            boolean z3 = (readByte & 4) == 4;
            bn8 bn8Var = this.$this_readOrSkipLocalHeader;
            long j = z ? 5L : 1L;
            if (z2) {
                j += 4;
            }
            if (z3) {
                j += 4;
            }
            if (longValue < j) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z) {
                this.$lastModifiedAtMillis.element = Long.valueOf(bn8Var.o2() * 1000);
            }
            if (z2) {
                this.$lastAccessedAtMillis.element = Long.valueOf(this.$this_readOrSkipLocalHeader.o2() * 1000);
            }
            if (z3) {
                this.$createdAtMillis.element = Long.valueOf(this.$this_readOrSkipLocalHeader.o2() * 1000);
            }
        }
        return s3q0.a;
    }
}
