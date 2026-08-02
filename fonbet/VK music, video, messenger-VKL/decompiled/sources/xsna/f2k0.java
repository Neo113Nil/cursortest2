package xsna;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: SlidingWindow.kt */
/* loaded from: classes8.dex */
public final class f2k0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SlidingWindow.kt */
    @b6l(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend", v = 2)
    public static final class a<T> extends RestrictedSuspendLambda implements wzs<ali0<? super List<? extends T>>, spj<? super s3q0>, Object> {
        final /* synthetic */ Iterator<T> $iterator;
        final /* synthetic */ boolean $partialWindows;
        final /* synthetic */ boolean $reuseBuffer;
        final /* synthetic */ int $size;
        final /* synthetic */ int $step;
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$size = i;
            this.$step = i2;
            this.$iterator = it;
            this.$reuseBuffer = z;
            this.$partialWindows = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
            return ((a) create((ali0) obj, spjVar)).invokeSuspend(s3q0.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x017e A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.Collection, xsna.qd, xsna.wkg0] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x01a9 -> B:16:0x01ac). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x016d -> B:31:0x0170). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00a9 -> B:61:0x00ad). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 464
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xsna.f2k0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException((i != i2 ? sl9.c(i, i2, "Both size ", " and step ", " must be greater than zero.") : tgw.b(i, "size ", " must be greater than zero.")).toString());
        }
    }

    public static final <T> Iterator<List<T>> b(Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        return !it.hasNext() ? yfp.b : g5z.b(new a(i, i2, it, z2, z, null));
    }

    public static final g2k0 c(uki0 uki0Var, int i, int i2) {
        a(i, i2);
        return new g2k0(uki0Var, i, i2);
    }
}
