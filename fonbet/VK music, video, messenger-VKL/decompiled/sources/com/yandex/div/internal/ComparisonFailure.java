package com.yandex.div.internal;

import com.ironsource.X3;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.i5s;
import xsna.zcl;

/* compiled from: ComparisonFailure.kt */
/* loaded from: classes7.dex */
public final class ComparisonFailure extends AssertionError {
    private static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final String actual;
    private final String expected;

    /* compiled from: ComparisonFailure.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: ComparisonFailure.kt */
    public static final class ComparisonCompactor {
        public static final Companion Companion = new Companion(null);
        private final String actual;
        private final int contextLength;
        private final String expected;
        private int prefix;
        private int suffix;

        /* compiled from: ComparisonFailure.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            private Companion() {
            }
        }

        public ComparisonCompactor(int i, String str, String str2) {
            this.contextLength = i;
            this.expected = str;
            this.actual = str2;
        }

        private final boolean areStringsEqual() {
            return epx.f(this.expected, this.actual);
        }

        private final String compactString(String str) {
            String a = ho8.a(new StringBuilder(X3.j.d), str.substring(this.prefix, (str.length() - this.suffix) + 1), ']');
            if (this.prefix > 0) {
                a = i5s.a(new StringBuilder(), computeCommonPrefix(), a);
            }
            if (this.suffix <= 0) {
                return a;
            }
            StringBuilder e = fw3.e(a);
            e.append(computeCommonSuffix());
            return e.toString();
        }

        private final String computeCommonPrefix() {
            int i = this.prefix;
            int i2 = this.contextLength;
            return (i > i2 ? "..." : "").concat(this.expected.substring(Math.max(0, i - i2), this.prefix));
        }

        private final String computeCommonSuffix() {
            int min = Math.min((this.expected.length() - this.suffix) + 1 + this.contextLength, this.expected.length());
            String str = (this.expected.length() - this.suffix) + 1 < this.expected.length() - this.contextLength ? "..." : "";
            String str2 = this.expected;
            return str2.substring((str2.length() - this.suffix) + 1, min).concat(str);
        }

        private final void findCommonPrefix() {
            this.prefix = 0;
            int min = Math.min(this.expected.length(), this.actual.length());
            while (true) {
                int i = this.prefix;
                if (i >= min || this.expected.charAt(i) != this.actual.charAt(this.prefix)) {
                    return;
                } else {
                    this.prefix++;
                }
            }
        }

        private final void findCommonSuffix() {
            int length = this.expected.length() - 1;
            int length2 = this.actual.length() - 1;
            while (true) {
                int i = this.prefix;
                if (length2 < i || length < i || this.expected.charAt(length) != this.actual.charAt(length2)) {
                    break;
                }
                length2--;
                length--;
            }
            this.suffix = this.expected.length() - length;
        }

        public final String compact(String str) {
            if (this.expected == null || this.actual == null || areStringsEqual()) {
                return Assert.format(str, this.expected, this.actual);
            }
            findCommonPrefix();
            findCommonSuffix();
            return Assert.format(str, compactString(this.expected), compactString(this.actual));
        }
    }

    public ComparisonFailure(String str, String str2, String str3) {
        super(str);
        this.expected = str2;
        this.actual = str3;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new ComparisonCompactor(20, this.expected, this.actual).compact(super.getMessage());
    }
}
