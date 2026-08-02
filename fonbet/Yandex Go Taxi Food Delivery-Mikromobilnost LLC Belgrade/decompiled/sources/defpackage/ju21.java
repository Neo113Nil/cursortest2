package defpackage;

import com.apollographql.apollo3.api.c;

/* loaded from: classes2.dex */
public final class ju21 implements ejg0 {
    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(ku21.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "query UserSyncStatus { userSyncStatus { status } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == ju21.class;
    }

    public final int hashCode() {
        return qoi0.a(ju21.class).hashCode();
    }

    @Override // defpackage.fc70
    public final String id() {
        return "6fd2b53cdf170ecaf338a6b098d4cb683561c6af9edb7c4e8e15fc4897cb4780";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "UserSyncStatus";
    }
}
