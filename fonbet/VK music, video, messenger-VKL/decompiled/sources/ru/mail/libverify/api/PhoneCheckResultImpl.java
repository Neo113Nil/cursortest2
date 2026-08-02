package ru.mail.libverify.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.mail.libverify.InternalApi;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.common.Status;
import ru.mail.libverify.m.j;

@InternalApi
/* loaded from: classes9.dex */
public final class PhoneCheckResultImpl implements VerificationApi.PhoneCheckResult {
    private static PhoneCheckResultImpl f;
    private static PhoneCheckResultImpl g;
    private static PhoneCheckResultImpl h;
    private static PhoneCheckResultImpl i;

    @NonNull
    private final VerificationApi.FailReason a;

    @NonNull
    private final VerificationApi.PhoneCheckResult.State b;
    private final boolean c;
    private final String[] d;
    private final b e;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.UNSUPPORTED_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Status.INCORRECT_PHONE_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Status.PHONE_NUMBER_IN_BLACK_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Status.PHONE_NUMBER_TYPE_NOT_ALLOWED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Status.NOT_ENOUGH_DATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class b implements VerificationApi.PhoneCheckResult.ExtendedInfo {
        private final boolean a;
        private final boolean b;
        private final Integer[] c;
        private final boolean d;
        private final Integer e;

        @Nullable
        private final String f;

        @Nullable
        private final String g;

        @Nullable
        private final String h;

        public /* synthetic */ b(j.b bVar, String str, int i) {
            this(bVar, str);
        }

        @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult.ExtendedInfo
        @Nullable
        public final String getIsoCountryCode() {
            return this.h;
        }

        @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult.ExtendedInfo
        @Nullable
        public final String getModifiedPhoneNumber() {
            return this.f;
        }

        @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult.ExtendedInfo
        @Nullable
        public final String getModifiedPrefix() {
            return this.g;
        }

        @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult.ExtendedInfo
        public final Integer getRemainingLength() {
            return this.e;
        }

        @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult.ExtendedInfo
        public final boolean isFixedLine() {
            return this.b;
        }

        @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult.ExtendedInfo
        public final boolean isMobile() {
            return this.a;
        }

        private b(@NonNull j.b bVar, @Nullable String str) {
            this.a = bVar.e();
            this.b = bVar.d();
            Integer[] c = bVar.c();
            Integer[] numArr = (c == null || c.length == 0) ? null : new Integer[c.length];
            this.c = numArr;
            this.e = a(bVar.c(), numArr, false);
            this.d = bVar.f();
            this.f = bVar.a();
            this.g = bVar.b();
            this.h = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public static VerificationApi.PhoneCheckResult.ExtendedInfo a(@Nullable VerificationApi.PhoneCheckResult.ExtendedInfo extendedInfo) {
            Integer[] numArr = null;
            if (!(extendedInfo instanceof b)) {
                return null;
            }
            b bVar = (b) extendedInfo;
            Integer[] numArr2 = bVar.c;
            if (numArr2 != null && numArr2.length != 0) {
                numArr = new Integer[numArr2.length];
            }
            Integer[] numArr3 = numArr;
            Integer a = a(numArr2, numArr3, true);
            return new b(bVar.a, bVar.b, (a == null || a.intValue() != 0) && bVar.d, a, numArr3, bVar.h);
        }

        @Nullable
        private static Integer a(@Nullable Integer[] numArr, @Nullable Integer[] numArr2, boolean z) {
            Integer num = null;
            if (numArr != null && numArr2 != null && numArr.length != 0 && numArr.length == numArr2.length) {
                int i = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < numArr.length; i2++) {
                    int intValue = z ? numArr[i2].intValue() - 1 : numArr[i2].intValue();
                    numArr2[i2] = Integer.valueOf(intValue);
                    int abs = Math.abs(intValue);
                    if (abs < i) {
                        num = numArr2[i2];
                        i = abs;
                    }
                }
            }
            return num;
        }

        private b(boolean z, boolean z2, boolean z3, Integer num, Integer[] numArr, @Nullable String str) {
            this.a = z;
            this.b = z2;
            this.e = num;
            this.c = numArr;
            this.d = z3;
            this.f = null;
            this.g = null;
            this.h = str;
        }
    }

    private PhoneCheckResultImpl(@NonNull VerificationApi.FailReason failReason, String[] strArr, VerificationApi.PhoneCheckResult.ExtendedInfo extendedInfo, @NonNull VerificationApi.PhoneCheckResult.State state, boolean z) {
        this.a = failReason;
        this.b = state;
        this.c = z;
        this.d = strArr;
        this.e = (b) extendedInfo;
    }

    @NonNull
    public static PhoneCheckResultImpl a(@NonNull ru.mail.libverify.m.j jVar) {
        VerificationApi.PhoneCheckResult.State state;
        String str;
        b bVar;
        switch (a.a[jVar.g().ordinal()]) {
            case 1:
                state = VerificationApi.PhoneCheckResult.State.VALID;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                state = VerificationApi.PhoneCheckResult.State.INVALID;
                break;
            case 6:
                state = VerificationApi.PhoneCheckResult.State.UNKNOWN;
                break;
            default:
                throw new IllegalArgumentException();
        }
        VerificationApi.PhoneCheckResult.State state2 = state;
        if (jVar.h() != null) {
            str = jVar.h().iso_country_code;
            bVar = null;
        } else {
            str = null;
            bVar = null;
        }
        b bVar2 = bVar;
        VerificationApi.FailReason failReason = VerificationApi.FailReason.OK;
        b bVar3 = bVar2;
        String[] i2 = jVar.i();
        j.b j = jVar.j();
        if (j != null) {
            bVar3 = new b(j, str, 0);
        }
        return new PhoneCheckResultImpl(failReason, i2, bVar3, state2, false);
    }

    @NonNull
    public static VerificationApi.PhoneCheckResult b(@NonNull k kVar) {
        if (h == null) {
            h = new PhoneCheckResultImpl(kVar.b(), null, null, VerificationApi.PhoneCheckResult.State.INVALID, false);
        }
        return h;
    }

    @NonNull
    public static VerificationApi.PhoneCheckResult c(@NonNull k kVar) {
        if (g == null) {
            g = new PhoneCheckResultImpl(kVar.a(), null, null, VerificationApi.PhoneCheckResult.State.INVALID, false);
        }
        return g;
    }

    @NonNull
    public static VerificationApi.PhoneCheckResult getIncorrectPhoneResult() {
        if (i == null) {
            i = new PhoneCheckResultImpl(VerificationApi.FailReason.INCORRECT_PHONE_NUMBER, null, null, VerificationApi.PhoneCheckResult.State.INVALID, true);
        }
        return i;
    }

    @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult
    @Nullable
    public VerificationApi.PhoneCheckResult.ExtendedInfo getExtendedInfo() {
        return this.e;
    }

    @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult
    @Nullable
    public String[] getPrintableText() {
        String[] strArr = this.d;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr;
    }

    @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult
    @NonNull
    public VerificationApi.FailReason getReason() {
        return this.a;
    }

    @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult
    @NonNull
    public VerificationApi.PhoneCheckResult.State getState() {
        return this.b;
    }

    @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult
    public boolean isApproximate() {
        return this.c;
    }

    @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult
    public boolean isInvalid() {
        return this.b == VerificationApi.PhoneCheckResult.State.INVALID;
    }

    @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult
    public boolean isUnknown() {
        return this.b == VerificationApi.PhoneCheckResult.State.UNKNOWN;
    }

    @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult
    public boolean isValid() {
        return this.b == VerificationApi.PhoneCheckResult.State.VALID;
    }

    @Override // ru.mail.libverify.api.VerificationApi.PhoneCheckResult
    public boolean isWarning() {
        VerificationApi.FailReason failReason;
        if (this.b != VerificationApi.PhoneCheckResult.State.INVALID) {
            return false;
        }
        b bVar = this.e;
        return bVar == null || bVar.d || (failReason = this.a) == VerificationApi.FailReason.INCORRECT_PHONE_NUMBER || failReason == VerificationApi.FailReason.UNSUPPORTED_NUMBER;
    }

    @NonNull
    public String toString() {
        return "PhoneCheckResult{isApproximate=" + this.c + ", state=" + this.b + ", reason=" + this.a + ", extendedInfo=" + this.e + '}';
    }

    @NonNull
    public static VerificationApi.PhoneCheckResult a(@NonNull k kVar) {
        if (f == null) {
            f = new PhoneCheckResultImpl(kVar.a(), null, null, VerificationApi.PhoneCheckResult.State.INVALID, false);
        }
        return f;
    }

    @Nullable
    public static PhoneCheckResultImpl a(@NonNull VerificationApi.PhoneCheckResult phoneCheckResult) {
        VerificationApi.PhoneCheckResult.ExtendedInfo a2;
        VerificationApi.PhoneCheckResult.ExtendedInfo extendedInfo = phoneCheckResult.getExtendedInfo();
        if (phoneCheckResult.isValid()) {
            return new PhoneCheckResultImpl(VerificationApi.FailReason.OK, null, extendedInfo, phoneCheckResult.getState(), true);
        }
        if (extendedInfo == null || (a2 = b.a(extendedInfo)) == null) {
            return null;
        }
        Integer num = ((b) a2).e;
        return new PhoneCheckResultImpl(VerificationApi.FailReason.OK, null, b.a(extendedInfo), (num != null && num.intValue() == 0 && (extendedInfo.isMobile() || extendedInfo.isFixedLine())) ? VerificationApi.PhoneCheckResult.State.VALID : phoneCheckResult.getState(), true);
    }
}
