package xsna;

import com.vk.api.internal.debug.FakeApiErrorTypes;
import com.vk.api.internal.exceptions.TooManyRequestsException;
import com.vk.api.sdk.exceptions.RateLimitReachedException;
import java.util.EnumSet;
import kotlin.random.Random;

/* compiled from: FakeNetworkConditionsChainCall.kt */
/* loaded from: classes15.dex */
public final class rjq<T> extends ara<T> {
    public final String b;
    public final EnumSet<FakeApiErrorTypes> c;
    public final int d;
    public final ara<T> e;

    /* compiled from: FakeNetworkConditionsChainCall.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FakeApiErrorTypes.values().length];
            try {
                iArr[FakeApiErrorTypes.API_ERROR_BACKOFF_API_CODE_6.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FakeApiErrorTypes.API_ERROR_BACKOFF_API_CODE_29.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rjq(wy2 wy2Var, String str, EnumSet enumSet, int i, ara araVar) {
        super(wy2Var);
        this.b = str;
        this.c = enumSet;
        this.d = i;
        this.e = araVar;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        FakeApiErrorTypes fakeApiErrorTypes = (FakeApiErrorTypes) j5g.x0(this.c, Random.b);
        int i = fakeApiErrorTypes == null ? -1 : a.$EnumSwitchMapping$0[fakeApiErrorTypes.ordinal()];
        int i2 = this.d;
        if (i == 1) {
            TooManyRequestsException tooManyRequestsException = new TooManyRequestsException(6, this.b, false, "Too many requests.", null, null, null, null, 0, null, null, null, 4080);
            if (i2 <= 0) {
                throw tooManyRequestsException;
            }
            Thread.sleep(i2);
            throw tooManyRequestsException;
        }
        if (i != 2) {
            return this.e.a(zqaVar);
        }
        RateLimitReachedException rateLimitReachedException = new RateLimitReachedException(this.b);
        if (i2 <= 0) {
            throw rateLimitReachedException;
        }
        Thread.sleep(i2);
        throw rateLimitReachedException;
    }
}
