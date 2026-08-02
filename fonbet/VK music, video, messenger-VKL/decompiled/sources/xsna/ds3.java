package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButtonState;
import xsna.dai;

/* compiled from: ArtistMix.kt */
/* loaded from: classes.dex */
public final class ds3 implements r2a {
    public final BlockId b;
    public final String c;
    public final PlayPauseButtonState d;
    public final String e;
    public final String f;
    public final String g;
    public final Object h = dai.a.a();

    public ds3(BlockId blockId, String str, PlayPauseButtonState playPauseButtonState, String str2, String str3, String str4) {
        this.b = blockId;
        this.c = str;
        this.d = playPauseButtonState;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds3)) {
            return false;
        }
        ds3 ds3Var = (ds3) obj;
        return epx.f(this.b, ds3Var.b) && epx.f(this.c, ds3Var.c) && epx.f(this.d, ds3Var.d) && epx.f(this.e, ds3Var.e) && epx.f(this.f, ds3Var.f) && epx.f(this.g, ds3Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistMixViewState(blockId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", playPauseState=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", backgroundUrl=");
        sb.append(this.f);
        sb.append(", artistImageUrl=");
        return ho8.a(sb, this.g, ')');
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
