package com.yandex.passport.internal.report.diary;

import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.m6;
import com.yandex.passport.internal.report.n9;
import com.yandex.passport.internal.report.yd;

/* loaded from: classes8.dex */
public final class l extends l3 {
    public final void j(Throwable th, MethodDiary methodDiary) {
        f(m6.w, new yd(th), new com.yandex.passport.internal.report.i(methodDiary.getFrom(), 6, false));
    }

    public final void k(int i, String str, String str2, String str3) {
        boolean z = false;
        f(new n9(new n9(str, 22), str2), new com.yandex.passport.internal.report.a(str3, 22, z), new com.yandex.passport.internal.report.a(str, 23, z), new com.yandex.passport.internal.report.a(str2, 24, z), new com.yandex.passport.internal.report.a(i, 21));
    }
}
