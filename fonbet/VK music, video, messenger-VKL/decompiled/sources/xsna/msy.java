package xsna;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UnsafeLazyImpl;

/* compiled from: LazyJVM.kt */
/* loaded from: classes11.dex */
public class msy {

    /* compiled from: LazyJVM.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static <T> Lazy<T> a(LazyThreadSafetyMode lazyThreadSafetyMode, gzs<? extends T> gzsVar) {
        int i = a.$EnumSwitchMapping$0[lazyThreadSafetyMode.ordinal()];
        if (i == 1) {
            return new bpn0(gzsVar);
        }
        if (i == 2) {
            return new qzg0(gzsVar);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(gzsVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static bpn0 b(gzs gzsVar) {
        return new bpn0(gzsVar);
    }
}
