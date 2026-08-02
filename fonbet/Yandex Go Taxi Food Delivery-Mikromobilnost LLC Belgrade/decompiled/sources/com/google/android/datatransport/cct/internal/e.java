package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ClientInfo;
import defpackage.h34;
import defpackage.v72;

/* loaded from: classes.dex */
public final class e extends ClientInfo {
    public final ClientInfo.ClientType a;
    public final h34 b;

    public e(ClientInfo.ClientType clientType, h34 h34Var) {
        this.a = clientType;
        this.b = h34Var;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final v72 a() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final ClientInfo.ClientType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.a;
        if (clientType == null) {
            if (clientInfo.b() != null) {
                return false;
            }
        } else if (!clientType.equals(clientInfo.b())) {
            return false;
        }
        h34 h34Var = this.b;
        return h34Var == null ? clientInfo.a() == null : h34Var.equals(clientInfo.a());
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.a;
        int hashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        h34 h34Var = this.b;
        return hashCode ^ (h34Var != null ? h34Var.hashCode() : 0);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
