package xsna;

import com.vk.dto.clips.model.ClipsEditorNextButtonState;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: TimelineSettings.kt */
/* loaded from: classes18.dex */
public final class wwo0 {
    public static final wwo0 k = new wwo0(false, false, false, false, false, false, false, Integer.MAX_VALUE, EmptyList.b, ClipsEditorNextButtonState.Next);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final List<iwo0> i;
    public final ClipsEditorNextButtonState j;

    public wwo0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, List<iwo0> list, ClipsEditorNextButtonState clipsEditorNextButtonState) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = i;
        this.i = list;
        this.j = clipsEditorNextButtonState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwo0)) {
            return false;
        }
        wwo0 wwo0Var = (wwo0) obj;
        return this.a == wwo0Var.a && this.b == wwo0Var.b && this.c == wwo0Var.c && this.d == wwo0Var.d && this.e == wwo0Var.e && this.f == wwo0Var.f && this.g == wwo0Var.g && this.h == wwo0Var.h && epx.f(this.i, wwo0Var.i) && this.j == wwo0Var.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + fw3.a(shy.a(this.h, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i);
    }

    public final String toString() {
        return "TimelineSettings(showAddFragmentButton=" + this.a + ", enableApplyButton=" + this.b + ", enableUndo=" + this.c + ", enableRedo=" + this.d + ", showMuteButton=" + this.e + ", isPlaying=" + this.f + ", isMuted=" + this.g + ", scrollablePartMaxHeight=" + this.h + ", bottomActionButtons=" + this.i + ", nextButtonState=" + this.j + ')';
    }
}
