package com.yandex.div.internal;

import defpackage.a4;
import defpackage.q5z;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/internal/ComparisonFailure;", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "", "expected", "Ljava/lang/String;", "getExpected", "()Ljava/lang/String;", "actual", "getActual", "a4", "assertion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComparisonFailure extends AssertionError {
    private static final long serialVersionUID = 1;
    private final String actual;
    private final String expected;

    public ComparisonFailure(String str, String str2, String str3) {
        super(str);
        this.expected = str2;
        this.actual = str3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.expected;
        String str2 = this.actual;
        a4 a4Var = new a4(str, str2);
        String message = super.getMessage();
        if (str == null || str2 == null || str.equals(str2)) {
            return q5z.q(message, str, str2);
        }
        a4Var.b = 0;
        int min = Math.min(str.length(), str2.length());
        while (true) {
            int i = a4Var.b;
            if (i >= min || str.charAt(i) != str2.charAt(a4Var.b)) {
                break;
            }
            a4Var.b++;
        }
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (true) {
            int i2 = a4Var.b;
            if (length2 < i2 || length < i2 || str.charAt(length) != str2.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        a4Var.c = str.length() - length;
        return q5z.q(message, a4Var.a(str), a4Var.a(str2));
    }
}
