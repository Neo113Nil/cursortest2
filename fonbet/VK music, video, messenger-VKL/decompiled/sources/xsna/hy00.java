package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: Events.kt */
/* loaded from: classes18.dex */
public final class hy00 implements ay00 {
    public final long a;
    public final UserId b;
    public final boolean c;

    public hy00(long j, UserId userId, boolean z) {
        this.a = j;
        this.b = userId;
        this.c = z;
    }

    public final long a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    @Override // xsna.ay00
    public final UserId q() {
        return this.b;
    }
}
