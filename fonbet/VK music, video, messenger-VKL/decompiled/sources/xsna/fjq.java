package xsna;

import androidx.window.core.VerificationMode;
import androidx.window.core.WindowStrictModeException;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SpecificationComputer.kt */
/* loaded from: classes12.dex */
public final class fjq<T> extends b920 {
    public final T c;
    public final aqw d;
    public final VerificationMode e;
    public final WindowStrictModeException f;

    /* compiled from: SpecificationComputer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationMode.values().length];
            try {
                iArr[VerificationMode.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationMode.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationMode.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fjq(T t, String str, String str2, aqw aqwVar, VerificationMode verificationMode) {
        this.c = t;
        this.d = aqwVar;
        this.e = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(str2 + " value: " + t);
        windowStrictModeException.setStackTrace((StackTraceElement[]) rl3.H(2, windowStrictModeException.getStackTrace()).toArray(new StackTraceElement[0]));
        this.f = windowStrictModeException;
    }

    @Override // xsna.b920
    public final T f() {
        int i = a.$EnumSwitchMapping$0[this.e.ordinal()];
        if (i == 1) {
            throw this.f;
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        Objects.toString(this.c);
        this.d.getClass();
        return null;
    }

    @Override // xsna.b920
    public final b920 p(String str, izs<? super T, Boolean> izsVar) {
        return this;
    }
}
