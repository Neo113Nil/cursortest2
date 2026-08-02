package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: Events.kt */
/* loaded from: classes18.dex */
public final class hu00 implements ay00 {
    public final long a;
    public final int b;
    public final int c;
    public final UserId d;

    public hu00(int i, int i2, long j, UserId userId) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = userId;
    }

    @Override // xsna.ay00
    public final UserId q() {
        return this.d;
    }
}
