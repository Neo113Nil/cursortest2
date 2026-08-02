package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: InteractiveComponentSize.kt */
/* loaded from: classes11.dex */
public final class zax {
    public static final icv a = new icv(b.b);
    public static final ior0 b = new ior0(a.b);
    public static final iyk0 c;

    /* compiled from: InteractiveComponentSize.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements wzs<Integer, Integer, Integer> {
        public static final a b = new a(2, an10.class, UcumUtils.UCUM_MINUTES, "min(II)I", 1);

        @Override // xsna.wzs
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    /* compiled from: InteractiveComponentSize.kt */
    public /* synthetic */ class b extends FunctionReferenceImpl implements wzs<Integer, Integer, Integer> {
        public static final b b = new b(2, an10.class, UcumUtils.UCUM_MINUTES, "min(II)I", 1);

        @Override // xsna.wzs
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    static {
        rvi.d(new lk(20));
        c = new iyk0(new com.vk.movika.sdk.base.logic.interactor.m(17));
    }
}
