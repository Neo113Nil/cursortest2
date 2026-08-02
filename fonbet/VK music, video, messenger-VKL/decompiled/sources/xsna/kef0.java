package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButtonState;
import java.util.ArrayList;
import xsna.dai;

/* compiled from: RecommendedPlaylistViewState.kt */
/* loaded from: classes.dex */
public final class kef0 implements r2a {
    public final BlockId b;
    public final String c;
    public final String d;
    public final String e;
    public final PlayPauseButtonState f;
    public final ArrayList g;
    public final String h;
    public final String i;
    public final String j;
    public final Object k = dai.a.a();
    public final Object l = dai.a.b();
    public final Object m = dai.a.b();

    /* compiled from: RecommendedPlaylistViewState.kt */
    @vby
    /* loaded from: classes16.dex */
    public static final class a {
        public final String a;

        public /* synthetic */ a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return epx.f(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return air.b(')', "TrackMid(value=", this.a);
        }
    }

    public kef0(BlockId blockId, String str, String str2, String str3, PlayPauseButtonState playPauseButtonState, ArrayList arrayList, String str4, String str5, String str6) {
        this.b = blockId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = playPauseButtonState;
        this.g = arrayList;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kef0)) {
            return false;
        }
        kef0 kef0Var = (kef0) obj;
        return this.b.equals(kef0Var.b) && epx.f(this.c, kef0Var.c) && this.d.equals(kef0Var.d) && this.e.equals(kef0Var.e) && this.f.equals(kef0Var.f) && wow.a(this.g, kef0Var.g) && epx.f(this.h, kef0Var.h) && epx.f(this.i, kef0Var.i) && epx.f(this.j, kef0Var.j);
    }

    public final int hashCode() {
        int b = (wow.b(this.g) + ((this.f.hashCode() + urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31;
        String str = this.h;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedPlaylistViewState(blockId=");
        sb.append(this.b);
        sb.append(", matchPercent=");
        sb.append(this.c);
        sb.append(", matchTitle=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", playPauseButtonState=");
        sb.append(this.f);
        sb.append(", tracks=");
        kr.d(this.g, sb, ", ownerName=");
        sb.append(this.h);
        sb.append(", ownerImageUrl=");
        sb.append(this.i);
        sb.append(", backgroundImageUrl=");
        return ho8.a(sb, this.j, ')');
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
