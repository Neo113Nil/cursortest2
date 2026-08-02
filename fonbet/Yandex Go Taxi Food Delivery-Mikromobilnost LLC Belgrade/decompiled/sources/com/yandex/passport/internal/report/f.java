package com.yandex.passport.internal.report;

/* loaded from: classes8.dex */
public final class f implements pd {
    public final String a;
    public final String b;

    public f(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.yandex.passport.internal.report.pd
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getName() {
        return this.a;
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getValue() {
        return this.b;
    }
}
