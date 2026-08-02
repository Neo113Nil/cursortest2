package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.internal.entities.Filter;
import defpackage.oo31;
import defpackage.xfo;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class y0 extends x2 {
    public final q b;
    public final List c;
    public final e3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Bundle bundle) {
        super(MethodRef.GetAvailableAccounts);
        Parcelable e = oo31.e(bundle, com.yandex.passport.internal.util.p.class, "passport-filter");
        if (e == null) {
            xfo.g("can't get required parcelable passport-filter");
            throw null;
        }
        q qVar = new q((Filter) e);
        this.b = qVar;
        this.c = Collections.singletonList(qVar);
        this.d = e3.b;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.d;
    }
}
