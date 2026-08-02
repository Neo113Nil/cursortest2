package xsna;

import com.vk.dto.common.id.UserId;
import xsna.tlo0;

/* compiled from: ClipsCoauthorSelectorListItemViewState.kt */
/* loaded from: classes16.dex */
public final class gmd {
    public final UserId a;
    public final String b;
    public final String c;
    public final boolean d;
    public final cnd e;
    public final tlo0.f f;

    public gmd(UserId userId, String str, String str2, boolean z, cnd cndVar, tlo0.f fVar) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = cndVar;
        this.f = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmd)) {
            return false;
        }
        gmd gmdVar = (gmd) obj;
        return this.a.equals(gmdVar.a) && epx.f(this.b, gmdVar.b) && this.c.equals(gmdVar.c) && this.d == gmdVar.d && this.e.equals(gmdVar.e) && this.f.equals(gmdVar.f);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f.a) + ((this.e.hashCode() + qoy.b(urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsCoauthorSelectorListItemViewState(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", isChecked=");
        sb.append(this.d);
        sb.append(", details=");
        sb.append(this.e);
        sb.append(", voiceoverState=");
        return pr.b(sb, this.f, ')');
    }
}
