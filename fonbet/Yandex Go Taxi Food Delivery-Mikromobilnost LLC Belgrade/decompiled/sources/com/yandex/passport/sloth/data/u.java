package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class u extends h {
    public final String a;
    public final PicturePushState b;
    public final String c;
    public final Uid w;
    public final SlothTheme x;
    public final int y;

    public u(String str, PicturePushState picturePushState, String str2, Uid uid, SlothTheme slothTheme, int i) {
        super(SlothMode.WebUrlPush);
        this.a = str;
        this.b = picturePushState;
        this.c = str2;
        this.w = uid;
        this.x = slothTheme;
        this.y = i;
    }

    public static u b(u uVar, PicturePushState picturePushState) {
        String str = uVar.a;
        String str2 = uVar.c;
        Uid uid = uVar.w;
        SlothTheme slothTheme = uVar.x;
        int i = uVar.y;
        uVar.getClass();
        return new u(str, picturePushState, str2, uid, slothTheme, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return jl40.l(this.a, uVar.a) && jl40.l(this.b, uVar.b) && jl40.l(this.c, uVar.c) && jl40.l(this.w, uVar.w) && this.x == uVar.x && this.y == uVar.y;
    }

    @Override // com.yandex.passport.sloth.data.h, com.yandex.passport.sloth.data.e
    public final SlothTheme getTheme() {
        return this.x;
    }

    @Override // com.yandex.passport.sloth.data.f
    public final Uid getUid() {
        return this.w;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + ((this.x.hashCode() + uw51.a(this.w, unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PicturePush(trackId=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", url=");
        uw51.y(sb, this.c, ", uid=");
        sb.append(this.w);
        sb.append(", theme=");
        sb.append(this.x);
        sb.append(", notificationId=");
        return oyr.s(sb, this.y, ')');
    }
}
