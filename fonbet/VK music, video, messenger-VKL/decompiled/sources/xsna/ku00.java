package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: Events.kt */
/* loaded from: classes18.dex */
public final class ku00 implements ay00 {
    public final UserId a;
    public final long b;

    public ku00(long j, UserId userId) {
        this.a = userId;
        this.b = j;
    }

    @Override // xsna.ay00
    public final UserId q() {
        return this.a;
    }
}
