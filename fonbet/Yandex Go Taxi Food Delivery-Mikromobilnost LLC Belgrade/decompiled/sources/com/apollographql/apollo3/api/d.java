package com.apollographql.apollo3.api;

import defpackage.ovn;
import defpackage.tko;

/* loaded from: classes.dex */
public abstract class d {
    public static tko a(tko tkoVar, tko tkoVar2) {
        return tkoVar2 == ovn.a ? tkoVar : (tko) tkoVar2.fold(tkoVar, ExecutionContext$plus$1.w);
    }
}
