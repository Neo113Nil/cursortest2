package xsna;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: AlignmentLine.kt */
/* loaded from: classes11.dex */
public final class ht1 {
    public static final icv a = new icv(a.b);
    public static final icv b = new icv(b.b);

    /* compiled from: AlignmentLine.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<Integer, Integer, Integer> {
        public static final a b = new a(2, an10.class, UcumUtils.UCUM_MINUTES, "min(II)I", 1);

        @Override // xsna.wzs
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    /* compiled from: AlignmentLine.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<Integer, Integer, Integer> {
        public static final b b = new b(2, an10.class, InneractiveMediationNameConsts.MAX, "max(II)I", 1);

        @Override // xsna.wzs
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
        }
    }
}
