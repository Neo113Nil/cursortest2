package xsna;

import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.id.UserId;

/* compiled from: Events.kt */
/* loaded from: classes18.dex */
public final class cy00 implements ay00 {
    public final GoodAlbum a;
    public final UserId b;

    public cy00(GoodAlbum goodAlbum) {
        this.a = goodAlbum;
        this.b = goodAlbum.c;
    }

    @Override // xsna.ay00
    public final UserId q() {
        return this.b;
    }
}
