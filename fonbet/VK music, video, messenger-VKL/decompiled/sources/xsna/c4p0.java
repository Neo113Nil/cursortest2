package xsna;

import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: ToolbarViewState.kt */
/* loaded from: classes7.dex */
public final class c4p0 {
    public static final c4p0 d = new c4p0(tq.h(tlo0.Companion, R.string.cover_toolbar_title), new tlo0.f(R.string.cover_toolbar_button_back_talkback), new tlo0.f(R.string.cover_toolbar_button_done_talkback));
    public static final c4p0 e = new c4p0(new tlo0.f(R.string.video_album_cover_toolbar_title), new tlo0.f(R.string.general_cover_toolbar_button_back_talkback), new tlo0.f(R.string.general_cover_toolbar_button_done_talkback));
    public final tlo0.f a;
    public final tlo0.f b;
    public final tlo0.f c;

    public c4p0(tlo0.f fVar, tlo0.f fVar2, tlo0.f fVar3) {
        this.a = fVar;
        this.b = fVar2;
        this.c = fVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4p0)) {
            return false;
        }
        c4p0 c4p0Var = (c4p0) obj;
        return this.a.equals(c4p0Var.a) && this.b.equals(c4p0Var.b) && this.c.equals(c4p0Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + shy.a(this.b.a, Integer.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarViewState(title=");
        sb.append(this.a);
        sb.append(", backButtonDescription=");
        sb.append(this.b);
        sb.append(", doneButtonDescription=");
        return pr.b(sb, this.c, ')');
    }
}
