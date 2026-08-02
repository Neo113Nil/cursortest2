package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: MusicPickerAction.kt */
/* loaded from: classes4.dex */
public final class gs40 implements lr40 {
    public final MusicTrack b;
    public final boolean c;

    public gs40(MusicTrack musicTrack, boolean z) {
        this.b = musicTrack;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs40)) {
            return false;
        }
        gs40 gs40Var = (gs40) obj;
        return epx.f(this.b, gs40Var.b) && this.c == gs40Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToggleSelectionTrack(track=");
        sb.append(this.b);
        sb.append(", canShowDialog=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
