package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "none";
        }
        if (i == 2) {
            return "success";
        }
        if (i == 3) {
            return "incompatible_precondition";
        }
        if (i == 4) {
            return "failure";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "FAILURE" : "INCOMPATIBLE_PRECONDITION" : "SUCCESS" : "NONE";
    }
}
