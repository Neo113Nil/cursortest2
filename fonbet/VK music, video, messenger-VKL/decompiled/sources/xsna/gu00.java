package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: Events.kt */
/* loaded from: classes18.dex */
public final class gu00 implements ay00 {
    public final long a;
    public final int b;
    public final UserId c;

    public gu00(UserId userId, long j, int i) {
        this.a = j;
        this.b = i;
        this.c = userId;
    }

    public final long a() {
        return this.a;
    }

    @Override // xsna.ay00
    public final UserId q() {
        return this.c;
    }
}
