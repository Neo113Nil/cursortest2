package xsna;

import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;

/* compiled from: KidsMusicActionsPanel.kt */
/* loaded from: classes3.dex */
public final class oiy {
    public final boolean a;
    public final ParentBottomSheetState b;
    public final boolean c;
    public final boolean d;

    public oiy(boolean z, ParentBottomSheetState parentBottomSheetState, boolean z2, boolean z3) {
        this.a = z;
        this.b = parentBottomSheetState;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oiy)) {
            return false;
        }
        oiy oiyVar = (oiy) obj;
        return this.a == oiyVar.a && this.b == oiyVar.b && this.c == oiyVar.c && this.d == oiyVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KidsMusicActionsPanelData(skipAnimation=");
        sb.append(this.a);
        sb.append(", parentCollapseState=");
        sb.append(this.b);
        sb.append(", isLikeAnimationNeedToPlay=");
        sb.append(this.c);
        sb.append(", isSleepTimerTicking=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
