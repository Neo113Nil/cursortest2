package org.jsoup.nodes;

import xsna.od50;

/* compiled from: NodeUtils.java */
/* loaded from: classes8.dex */
public final class k {
    public static od50 a(j jVar) {
        od50 od50Var;
        Document x = jVar.x();
        return (x == null || (od50Var = x.l) == null) ? new od50(new org.jsoup.parser.a()) : od50Var;
    }
}
