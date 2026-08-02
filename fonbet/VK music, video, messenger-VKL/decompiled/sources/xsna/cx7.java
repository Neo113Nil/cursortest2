package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: Events.kt */
/* loaded from: classes18.dex */
public final class cx7 implements ay00 {
    public final String a;
    public final CharSequence b;
    public final Long c;
    public final UserId d;

    public cx7(String str, Long l, UserId userId, String str2) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = userId;
    }

    @Override // xsna.ay00
    public final UserId q() {
        return this.d;
    }
}
