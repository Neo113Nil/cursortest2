package xsna;

import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;

/* compiled from: CellMusicRightViewControllerFactory.kt */
/* loaded from: classes3.dex */
public final class lna implements VkCell.f {
    public final MusicTrack a;
    public final DownloadingState b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final String g;
    public final CharSequence h;

    public lna(MusicTrack musicTrack, DownloadingState downloadingState, boolean z, boolean z2, boolean z3, int i, String str, CharSequence charSequence) {
        this.a = musicTrack;
        this.b = downloadingState;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i;
        this.g = str;
        this.h = charSequence;
    }

    public static lna a(lna lnaVar, boolean z, int i, String str, int i2) {
        return new lna(lnaVar.a, lnaVar.b, lnaVar.c, (i2 & 8) != 0 ? lnaVar.d : false, z, i, str, lnaVar.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lna)) {
            return false;
        }
        lna lnaVar = (lna) obj;
        return epx.f(this.a, lnaVar.a) && epx.f(this.b, lnaVar.b) && this.c == lnaVar.c && this.d == lnaVar.d && this.e == lnaVar.e && this.f == lnaVar.f && epx.f(this.g, lnaVar.g) && epx.f(this.h, lnaVar.h);
    }

    public final int hashCode() {
        int a = shy.a(this.f, qoy.b(qoy.b(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31);
        String str = this.g;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.h;
        return hashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CellMusicRightViewParams(item=");
        sb.append(this.a);
        sb.append(", downloadingState=");
        sb.append(this.b);
        sb.append(", isDownloadingVisible=");
        sb.append(this.c);
        sb.append(", isMagicWandVisible=");
        sb.append(this.d);
        sb.append(", isPreActionVisible=");
        sb.append(this.e);
        sb.append(", preActionIconDrawable=");
        sb.append(this.f);
        sb.append(", preActionContentDescription=");
        sb.append(this.g);
        sb.append(", durationText=");
        return thl0.a(sb, this.h, ')');
    }
}
