package ru.ok.android.webrtc;

import defpackage.q0;
import java.util.List;

/* loaded from: classes9.dex */
public final class k {
    public final boolean a;
    public final List b;
    public final boolean c;

    public k(boolean z, List list, boolean z2) {
        this.a = z;
        this.b = list;
        this.c = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleConversationParticipantsResult{isMeRestricted=");
        sb.append(this.a);
        sb.append(", responders=");
        sb.append(this.b);
        sb.append(", callToGroup=");
        return q0.a(sb, this.c, '}');
    }
}
