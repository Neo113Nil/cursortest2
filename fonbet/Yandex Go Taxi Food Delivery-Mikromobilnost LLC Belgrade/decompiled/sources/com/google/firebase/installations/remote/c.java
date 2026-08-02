package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;
import defpackage.ny61;

/* loaded from: classes.dex */
public final class c extends TokenResult.a {
    public String a;
    public long b;
    public TokenResult.ResponseCode c;
    public byte d;

    public final d a() {
        if (this.d == 1) {
            return new d(this.a, this.b, this.c);
        }
        ny61.r("Missing required properties: tokenExpirationTimestamp");
        return null;
    }
}
