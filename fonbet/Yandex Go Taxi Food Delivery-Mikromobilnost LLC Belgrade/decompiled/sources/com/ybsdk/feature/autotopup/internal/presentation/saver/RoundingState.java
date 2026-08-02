package com.ybsdk.feature.autotopup.internal.presentation.saver;

import defpackage.h5a0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.r8j0;
import defpackage.t8j0;
import defpackage.u8j0;
import defpackage.unr0;
import defpackage.xyk0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class RoundingState {
    public final u8j0 a;
    public final List b;
    public final xyk0 c;
    public final ValidationError d;
    public final u8j0 e;
    public final h5a0 f;
    public final h5a0 g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/saver/RoundingState$ValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE_BUTTON_NOT_FILLED", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ValidationError {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ValidationError[] $VALUES;
        public static final ValidationError SOURCE_BUTTON_NOT_FILLED = new ValidationError("SOURCE_BUTTON_NOT_FILLED", 0);

        private static final /* synthetic */ ValidationError[] $values() {
            return new ValidationError[]{SOURCE_BUTTON_NOT_FILLED};
        }

        static {
            ValidationError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ValidationError(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ValidationError valueOf(String str) {
            return (ValidationError) Enum.valueOf(ValidationError.class, str);
        }

        public static ValidationError[] values() {
            return (ValidationError[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RoundingState(int i) {
        this(null, r2, (xyk0) kotlin.collections.a.R(r2), null, new t8j0(), null, null);
        EmptyList emptyList = EmptyList.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v8, types: [u8j0] */
    public static RoundingState a(RoundingState roundingState, r8j0 r8j0Var, List list, xyk0 xyk0Var, ValidationError validationError, u8j0 u8j0Var, h5a0 h5a0Var, h5a0 h5a0Var2, int i) {
        r8j0 r8j0Var2 = r8j0Var;
        if ((i & 1) != 0) {
            r8j0Var2 = roundingState.a;
        }
        r8j0 r8j0Var3 = r8j0Var2;
        if ((i & 2) != 0) {
            list = roundingState.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            xyk0Var = roundingState.c;
        }
        xyk0 xyk0Var2 = xyk0Var;
        if ((i & 8) != 0) {
            validationError = roundingState.d;
        }
        ValidationError validationError2 = validationError;
        if ((i & 16) != 0) {
            u8j0Var = roundingState.e;
        }
        u8j0 u8j0Var2 = u8j0Var;
        if ((i & 32) != 0) {
            h5a0Var = roundingState.f;
        }
        h5a0 h5a0Var3 = h5a0Var;
        if ((i & 64) != 0) {
            h5a0Var2 = roundingState.g;
        }
        roundingState.getClass();
        return new RoundingState(r8j0Var3, list2, xyk0Var2, validationError2, u8j0Var2, h5a0Var3, h5a0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundingState)) {
            return false;
        }
        RoundingState roundingState = (RoundingState) obj;
        return jl40.l(this.a, roundingState.a) && jl40.l(this.b, roundingState.b) && jl40.l(this.c, roundingState.c) && this.d == roundingState.d && jl40.l(this.e, roundingState.e) && jl40.l(this.f, roundingState.f) && jl40.l(this.g, roundingState.g);
    }

    public final int hashCode() {
        u8j0 u8j0Var = this.a;
        int c = unr0.c((u8j0Var == null ? 0 : u8j0Var.hashCode()) * 31, 31, this.b);
        xyk0 xyk0Var = this.c;
        int hashCode = (c + (xyk0Var == null ? 0 : xyk0Var.hashCode())) * 31;
        ValidationError validationError = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (validationError == null ? 0 : validationError.hashCode())) * 31)) * 31;
        h5a0 h5a0Var = this.f;
        int hashCode3 = (hashCode2 + (h5a0Var == null ? 0 : h5a0Var.hashCode())) * 31;
        h5a0 h5a0Var2 = this.g;
        return hashCode3 + (h5a0Var2 != null ? h5a0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "RoundingState(saveStatus=" + this.a + ", availableOptions=" + this.b + ", selectedOption=" + this.c + ", validationError=" + this.d + ", roundingSettingsResponse=" + this.e + ", selectedPaymentMethod=" + this.f + ", newSelectedPaymentMethod=" + this.g + Extension.C_BRAKE;
    }

    public RoundingState(u8j0 u8j0Var, List list, xyk0 xyk0Var, ValidationError validationError, u8j0 u8j0Var2, h5a0 h5a0Var, h5a0 h5a0Var2) {
        this.a = u8j0Var;
        this.b = list;
        this.c = xyk0Var;
        this.d = validationError;
        this.e = u8j0Var2;
        this.f = h5a0Var;
        this.g = h5a0Var2;
    }

    public RoundingState() {
        this(0);
    }
}
