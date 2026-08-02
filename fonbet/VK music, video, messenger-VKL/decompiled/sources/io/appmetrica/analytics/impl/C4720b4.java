package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import xsna.urd0;

/* renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4720b4 {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final CounterConfigurationReporterType e;

    public C4720b4(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = counterConfigurationReporterType;
    }

    public static C4720b4 a(T3 t3) {
        return new C4720b4(t3.b.getApiKey(), t3.a.a.getAsString("PROCESS_CFG_PACKAGE_NAME"), t3.a.a.getAsInteger("PROCESS_CFG_PROCESS_ID"), t3.a.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), t3.b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4720b4.class == obj.getClass()) {
            C4720b4 c4720b4 = (C4720b4) obj;
            String str = this.a;
            if (str == null ? c4720b4.a != null : !str.equals(c4720b4.a)) {
                return false;
            }
            if (!this.b.equals(c4720b4.b)) {
                return false;
            }
            Integer num = this.c;
            if (num == null ? c4720b4.c != null : !num.equals(c4720b4.c)) {
                return false;
            }
            String str2 = this.d;
            if (str2 == null ? c4720b4.d != null : !str2.equals(c4720b4.d)) {
                return false;
            }
            if (this.e == c4720b4.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int a = urd0.a((str != null ? str.hashCode() : 0) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (a + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.a + "', mPackageName='" + this.b + "', mProcessID=" + this.c + ", mProcessSessionID='" + this.d + "', mReporterType=" + this.e + '}';
    }
}
