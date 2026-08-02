package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* renamed from: io.appmetrica.analytics.impl.c5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C4747c5 {
    public final String a;
    public final String b;

    public C4747c5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @NonNull
    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.b);
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.a + BundleUtil.UNDERLINE_TAG + ApiKeyUtils.createPartialApiKey(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C4747c5 c4747c5 = (C4747c5) obj;
            String str = this.a;
            if (str == null ? c4747c5.a != null : !str.equals(c4747c5.a)) {
                return false;
            }
            String str2 = this.b;
            String str3 = c4747c5.b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.a + BundleUtil.UNDERLINE_TAG + this.b;
    }
}
