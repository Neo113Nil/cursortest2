package com.vungle.ads.internal;

/* loaded from: classes7.dex */
public final class c extends h {
    public c() {
        super("IMPRESSION_LOGGED", 4, 0);
    }

    @Override // com.vungle.ads.internal.h
    public final boolean a(h hVar) {
        return hVar == h.f || hVar == h.g || hVar == h.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "impressionLogged";
    }
}
