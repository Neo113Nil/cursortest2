package xsna;

import com.vk.clips.sdk.shared.item.clip.state.OwnerRightState;
import java.util.List;
import one.video.player.model.text.SubtitleRenderItem;

/* compiled from: MainOverlayMappingData.kt */
/* loaded from: classes17.dex */
public final class mf00 {
    public final boolean a;
    public final m0d b;
    public final j4b0 c;
    public final mfj0 d;
    public final fc60 e;
    public final umc f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final ny k;
    public final List<SubtitleRenderItem> l;
    public final OwnerRightState m;
    public final n0x n;
    public final boolean o;
    public final t16 p;
    public final rpp0 q;

    /* JADX WARN: Multi-variable type inference failed */
    public mf00(boolean z, m0d m0dVar, j4b0 j4b0Var, mfj0 mfj0Var, fc60 fc60Var, umc umcVar, boolean z2, boolean z3, boolean z4, boolean z5, ny nyVar, List<? extends SubtitleRenderItem> list, OwnerRightState ownerRightState, n0x n0xVar, boolean z6, t16 t16Var, rpp0 rpp0Var) {
        this.a = z;
        this.b = m0dVar;
        this.c = j4b0Var;
        this.d = mfj0Var;
        this.e = fc60Var;
        this.f = umcVar;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = nyVar;
        this.l = list;
        this.m = ownerRightState;
        this.n = n0xVar;
        this.o = z6;
        this.p = t16Var;
        this.q = rpp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf00)) {
            return false;
        }
        mf00 mf00Var = (mf00) obj;
        return this.a == mf00Var.a && epx.f(this.b, mf00Var.b) && epx.f(this.c, mf00Var.c) && epx.f(this.d, mf00Var.d) && epx.f(this.e, mf00Var.e) && epx.f(this.f, mf00Var.f) && this.g == mf00Var.g && this.h == mf00Var.h && this.i == mf00Var.i && this.j == mf00Var.j && epx.f(this.k, mf00Var.k) && epx.f(this.l, mf00Var.l) && this.m == mf00Var.m && epx.f(this.n, mf00Var.n) && this.o == mf00Var.o && epx.f(this.p, mf00Var.p) && epx.f(this.q, mf00Var.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + ((this.p.hashCode() + qoy.b((this.n.hashCode() + ((this.m.hashCode() + fw3.a((this.k.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((this.f.hashCode() + qoy.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31, 31, this.e.a)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l)) * 31)) * 31, 31, this.o)) * 31);
    }

    public final String toString() {
        return "MainOverlayMappingData(visible=" + this.a + ", clipState=" + this.b + ", playerState=" + this.c + ", shopsMoreState=" + this.d + ", newsMonothemeState=" + this.e + ", clipCarouselAttachesState=" + this.f + ", muteInClipFeed=" + this.g + ", templateBadgeHighlighted=" + this.h + ", subscribeButtonHighlighted=" + this.i + ", descriptionExpanded=" + this.j + ", actionButtonsState=" + this.k + ", subtitleRenderItems=" + this.l + ", ownerRightState=" + this.m + ", inlineNpsState=" + this.n + ", isItemFocused=" + this.o + ", bannerCompanionState=" + this.p + ", trendEngagementGrowthState=" + this.q + ')';
    }
}
