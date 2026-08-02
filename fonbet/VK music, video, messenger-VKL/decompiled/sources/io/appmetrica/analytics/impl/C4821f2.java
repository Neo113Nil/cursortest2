package io.appmetrica.analytics.impl;

import java.util.List;
import xsna.ms9;

/* renamed from: io.appmetrica.analytics.impl.f2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4821f2 {
    public final List a;
    public final J2 b;
    public final List c;

    public C4821f2(List list, J2 j2, List list2) {
        this.a = list;
        this.b = j2;
        this.c = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppPermissionsState{mPermissionStateList=");
        sb.append(this.a);
        sb.append(", mBackgroundRestrictionsState=");
        sb.append(this.b);
        sb.append(", mAvailableProviders=");
        return ms9.a('}', sb, this.c);
    }
}
