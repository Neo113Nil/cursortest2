package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

/* loaded from: classes.dex */
public final class d extends TokenResult {
    public final String a;
    public final long b;
    public final TokenResult.ResponseCode c;

    public d(String str, long j, TokenResult.ResponseCode responseCode) {
        this.a = str;
        this.b = j;
        this.c = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final TokenResult.ResponseCode a() {
        return this.c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final String b() {
        return this.a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.a;
        if (str == null) {
            if (tokenResult.b() != null) {
                return false;
            }
        } else if (!str.equals(tokenResult.b())) {
            return false;
        }
        if (this.b != tokenResult.c()) {
            return false;
        }
        TokenResult.ResponseCode responseCode = this.c;
        return responseCode == null ? tokenResult.a() == null : responseCode.equals(tokenResult.a());
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        TokenResult.ResponseCode responseCode = this.c;
        return i ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
