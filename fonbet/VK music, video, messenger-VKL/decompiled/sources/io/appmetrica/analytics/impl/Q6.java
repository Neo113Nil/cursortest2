package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class Q6 implements DataSendingRestrictionController {
    public final O6 a;
    public Boolean b;
    public final HashSet c = new HashSet();
    public final HashSet d = new HashSet();

    public Q6(@NonNull O6 o6) {
        this.a = o6;
        this.b = ((P6) o6).a();
    }

    public final synchronized void a(@Nullable Boolean bool) {
        try {
            if (!vo.a(bool)) {
                if (this.b == null) {
                }
            }
            boolean equals = Boolean.FALSE.equals(bool);
            this.b = Boolean.valueOf(equals);
            ((P6) this.a).a.c(equals).b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(@Nullable Boolean bool) {
        if (this.b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return Boolean.TRUE.equals(this.b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter(@NonNull String str) {
        boolean z;
        if (!this.c.contains(str)) {
            z = Boolean.TRUE.equals(this.b);
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(@NonNull String str, @Nullable Boolean bool) {
        try {
            if (!vo.a(bool)) {
                if (!this.d.contains(str) && !this.c.contains(str)) {
                }
            }
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.d.add(str);
                this.c.remove(str);
            } else {
                this.c.add(str);
                this.d.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
