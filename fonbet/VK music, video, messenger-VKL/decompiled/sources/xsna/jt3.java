package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButtonState;
import java.util.ArrayList;
import java.util.List;
import xsna.dai;

/* compiled from: ArtistSliderViewState.kt */
/* loaded from: classes.dex */
public final class jt3 implements r2a {
    public final BlockId b;
    public final String c;
    public final PlayPauseButtonState d;
    public final String e;
    public final String f;
    public final ArrayList g;
    public final List h;
    public final Object i = dai.a.a();

    public jt3(BlockId blockId, String str, PlayPauseButtonState playPauseButtonState, String str2, String str3, ArrayList arrayList, List list) {
        this.b = blockId;
        this.c = str;
        this.d = playPauseButtonState;
        this.e = str2;
        this.f = str3;
        this.g = arrayList;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt3)) {
            return false;
        }
        jt3 jt3Var = (jt3) obj;
        return this.b.equals(jt3Var.b) && this.c.equals(jt3Var.c) && this.d.equals(jt3Var.d) && epx.f(this.e, jt3Var.e) && epx.f(this.f, jt3Var.f) && wow.a(this.g, jt3Var.g) && wow.a(this.h, jt3Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return wow.b(this.h) + ((wow.b(this.g) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistSliderViewState(blockId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", playPauseState=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", backgroundUrl=");
        sb.append(this.f);
        sb.append(", artistImageUrls=");
        kr.d(this.g, sb, ", bubbles=");
        return jr.a(')', sb, this.h);
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
