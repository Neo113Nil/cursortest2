package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.domain.model.ClipsWrapperHeaderMode;
import xsna.uuf;

/* compiled from: ClipsWrapperTitleMviState.kt */
/* loaded from: classes17.dex */
public final class euf implements km50, uuf.j {
    public final tlo0 b;
    public final CharSequence c;
    public final boolean d;
    public final boolean e;
    public final uuf.f f;
    public final ClipsWrapperHeaderMode g;
    public final float h;
    public final boolean i;
    public final Integer j;
    public final boolean k;

    public euf(tlo0 tlo0Var, CharSequence charSequence, boolean z, boolean z2, uuf.f fVar, ClipsWrapperHeaderMode clipsWrapperHeaderMode, float f, boolean z3, Integer num, boolean z4) {
        this.b = tlo0Var;
        this.c = charSequence;
        this.d = z;
        this.e = z2;
        this.f = fVar;
        this.g = clipsWrapperHeaderMode;
        this.h = f;
        this.i = z3;
        this.j = num;
        this.k = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16, types: [xsna.uuf$f] */
    public static euf o(euf eufVar, tlo0 tlo0Var, CharSequence charSequence, boolean z, boolean z2, zrf zrfVar, ClipsWrapperHeaderMode clipsWrapperHeaderMode, float f, boolean z3, Integer num, boolean z4, int i) {
        if ((i & 1) != 0) {
            tlo0Var = eufVar.b;
        }
        tlo0 tlo0Var2 = tlo0Var;
        if ((i & 2) != 0) {
            charSequence = eufVar.c;
        }
        CharSequence charSequence2 = charSequence;
        if ((i & 4) != 0) {
            z = eufVar.d;
        }
        boolean z5 = z;
        if ((i & 8) != 0) {
            z2 = eufVar.e;
        }
        boolean z6 = z2;
        zrf zrfVar2 = (i & 16) != 0 ? eufVar.f : zrfVar;
        ClipsWrapperHeaderMode clipsWrapperHeaderMode2 = (i & 32) != 0 ? eufVar.g : clipsWrapperHeaderMode;
        float f2 = (i & 64) != 0 ? eufVar.h : f;
        boolean z7 = (i & 128) != 0 ? eufVar.i : z3;
        Integer num2 = (i & 256) != 0 ? eufVar.j : num;
        boolean z8 = (i & 512) != 0 ? eufVar.k : z4;
        eufVar.getClass();
        return new euf(tlo0Var2, charSequence2, z5, z6, zrfVar2, clipsWrapperHeaderMode2, f2, z7, num2, z8);
    }

    @Override // xsna.uuf.j
    public final CharSequence a() {
        return this.c;
    }

    @Override // xsna.uuf.j
    public final boolean b() {
        return this.k;
    }

    @Override // xsna.uuf.j
    public final float c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euf)) {
            return false;
        }
        euf eufVar = (euf) obj;
        return epx.f(this.b, eufVar.b) && epx.f(this.c, eufVar.c) && this.d == eufVar.d && this.e == eufVar.e && epx.f(this.f, eufVar.f) && this.g == eufVar.g && Float.compare(this.h, eufVar.h) == 0 && this.i == eufVar.i && epx.f(this.j, eufVar.j) && this.k == eufVar.k;
    }

    @Override // xsna.uuf.j
    public final uuf.f getItems() {
        return this.f;
    }

    @Override // xsna.uuf.j
    public final tlo0 getTitle() {
        return this.b;
    }

    @Override // xsna.uuf.j
    public final ClipsWrapperHeaderMode h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        CharSequence charSequence = this.c;
        int b = qoy.b(io.reactivex.rxjava3.subjects.b.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + qoy.b(qoy.b((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d), 31, this.e)) * 31)) * 31, 31), 31, this.i);
        Integer num = this.j;
        return Boolean.hashCode(this.k) + ((b + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // xsna.uuf.j
    public final boolean isVisible() {
        return this.d;
    }

    @Override // xsna.uuf.j
    public final boolean m() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsWrapperTitleMviState(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append((Object) this.c);
        sb.append(", isVisible=");
        sb.append(this.d);
        sb.append(", isSelectIconVisible=");
        sb.append(this.e);
        sb.append(", items=");
        sb.append(this.f);
        sb.append(", headerMode=");
        sb.append(this.g);
        sb.append(", headerAlpha=");
        sb.append(this.h);
        sb.append(", headerScrollHidden=");
        sb.append(this.i);
        sb.append(", scrollPrevPosition=");
        sb.append(this.j);
        sb.append(", isSkeleton=");
        return defpackage.q0.a(sb, this.k, ')');
    }
}
