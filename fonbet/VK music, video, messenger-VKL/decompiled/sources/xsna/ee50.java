package xsna;

import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MusicTrack.kt */
/* loaded from: classes16.dex */
public final class ee50 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final PlayingState h;
    public final bi40 i;
    public final long j;
    public final boolean k;
    public final Object l;
    public final Object m;

    public ee50(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, PlayingState playingState, bi40 bi40Var, long j, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = playingState;
        this.i = bi40Var;
        this.j = j;
        this.k = z3;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = at.c(lazyThreadSafetyMode);
        this.m = at.c(lazyThreadSafetyMode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee50)) {
            return false;
        }
        ee50 ee50Var = (ee50) obj;
        return epx.f(this.a, ee50Var.a) && epx.f(this.b, ee50Var.b) && epx.f(this.c, ee50Var.c) && epx.f(this.d, ee50Var.d) && epx.f(this.e, ee50Var.e) && this.f == ee50Var.f && this.g == ee50Var.g && this.h == ee50Var.h && epx.f(this.i, ee50Var.i) && this.j == ee50Var.j && this.k == ee50Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + bh10.a((this.i.hashCode() + ((this.h.hashCode() + qoy.b(qoy.b(urd0.a(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicTrackViewState(mid=");
        sb.append(this.a);
        sb.append(", imageUrl=");
        sb.append(this.b);
        sb.append(", artist=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", isExplicit=");
        sb.append(this.f);
        sb.append(", isEnabled=");
        sb.append(this.g);
        sb.append(", playState=");
        sb.append(this.h);
        sb.append(", downloadingState=");
        sb.append(this.i);
        sb.append(", duration=");
        sb.append(this.j);
        sb.append(", isFocusTrack=");
        return defpackage.q0.a(sb, this.k, ')');
    }
}
