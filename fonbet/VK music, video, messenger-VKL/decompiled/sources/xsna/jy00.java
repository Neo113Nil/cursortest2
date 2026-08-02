package xsna;

import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;

/* compiled from: Events.kt */
/* loaded from: classes18.dex */
public final class jy00 implements ay00 {
    public final Good a;
    public final UserId b;

    public jy00(Good good) {
        this.a = good;
        this.b = good.c;
    }

    @Override // xsna.ay00
    public final UserId q() {
        return this.b;
    }
}
