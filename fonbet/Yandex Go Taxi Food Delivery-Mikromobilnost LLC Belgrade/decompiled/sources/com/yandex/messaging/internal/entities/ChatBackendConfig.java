package com.yandex.messaging.internal.entities;

import defpackage.qv10;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/ChatBackendConfig;", "", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ChatBackendConfig {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ChatBackendConfig(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? true : z4;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatBackendConfig)) {
            return false;
        }
        ChatBackendConfig chatBackendConfig = (ChatBackendConfig) obj;
        return this.a == chatBackendConfig.a && this.b == chatBackendConfig.b && this.c == chatBackendConfig.c && this.d == chatBackendConfig.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return smw0.k(", isPollMessagesEnabled=", ", areThreadsEnabled=false)", qv10.u("ChatBackendConfig(isStarredMessagesEnabled=", ", isInviteLinkHidden=", ", isParticipantsHidden=", this.a, this.b), this.c, this.d);
    }

    public ChatBackendConfig() {
        this(31, false, false, false, false);
    }
}
