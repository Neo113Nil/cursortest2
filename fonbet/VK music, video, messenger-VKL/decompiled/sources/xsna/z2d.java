package xsna;

import com.vk.clips.sdk.shared.item.clip.state.OwnerRightState;
import java.util.List;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.gvp;

/* compiled from: ClipItemState.kt */
/* loaded from: classes17.dex */
public interface z2d extends km50 {

    /* compiled from: ClipItemState.kt */
    public static final class a implements z2d {
        public final rpp0 A;
        public final wp50 B;
        public final ioa0 C;
        public final m0d b;
        public final nlh0 c;
        public final kih0 d;
        public final y0r e;
        public final int f;
        public final mfj0 g;
        public final fc60 h;
        public final umc i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final j4b0 n;
        public final ny o;
        public final boolean p;
        public final ixp0 q;
        public final gvp r;
        public final List<SubtitleRenderItem> s;
        public final OwnerRightState t;
        public final wws u;
        public final n0x v;
        public final boolean w;
        public final boolean x;
        public final qzb0 y;
        public final t16 z;

        public a(m0d m0dVar, nlh0 nlh0Var, kih0 kih0Var, y0r y0rVar, int i, mfj0 mfj0Var, fc60 fc60Var, umc umcVar, boolean z, boolean z2, boolean z3, boolean z4, j4b0 j4b0Var, ny nyVar, boolean z5, ixp0 ixp0Var, gvp gvpVar, List list, OwnerRightState ownerRightState, wws wwsVar, n0x n0xVar, boolean z6, boolean z7, qzb0 qzb0Var, t16 t16Var, rpp0 rpp0Var, wp50 wp50Var, ioa0 ioa0Var) {
            this.b = m0dVar;
            this.c = nlh0Var;
            this.d = kih0Var;
            this.e = y0rVar;
            this.f = i;
            this.g = mfj0Var;
            this.h = fc60Var;
            this.i = umcVar;
            this.j = z;
            this.k = z2;
            this.l = z3;
            this.m = z4;
            this.n = j4b0Var;
            this.o = nyVar;
            this.p = z5;
            this.q = ixp0Var;
            this.r = gvpVar;
            this.s = list;
            this.t = ownerRightState;
            this.u = wwsVar;
            this.v = n0xVar;
            this.w = z6;
            this.x = z7;
            this.y = qzb0Var;
            this.z = t16Var;
            this.A = rpp0Var;
            this.B = wp50Var;
            this.C = ioa0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v20, types: [xsna.gvp] */
        public static a a(a aVar, m0d m0dVar, mfj0 mfj0Var, fc60 fc60Var, umc umcVar, boolean z, boolean z2, boolean z3, boolean z4, j4b0 j4b0Var, ny nyVar, boolean z5, ixp0 ixp0Var, gvp.a aVar2, List list, wws wwsVar, n0x n0xVar, boolean z6, boolean z7, qzb0 qzb0Var, t16 t16Var, rpp0 rpp0Var, ioa0 ioa0Var, int i) {
            m0d m0dVar2 = (i & 1) != 0 ? aVar.b : m0dVar;
            nlh0 nlh0Var = aVar.c;
            kih0 kih0Var = aVar.d;
            y0r y0rVar = aVar.e;
            int i2 = aVar.f;
            aVar.getClass();
            mfj0 mfj0Var2 = (i & 64) != 0 ? aVar.g : mfj0Var;
            fc60 fc60Var2 = (i & 128) != 0 ? aVar.h : fc60Var;
            umc umcVar2 = (i & 256) != 0 ? aVar.i : umcVar;
            boolean z8 = (i & 512) != 0 ? aVar.j : z;
            boolean z9 = (i & 1024) != 0 ? aVar.k : z2;
            boolean z10 = (i & 2048) != 0 ? aVar.l : z3;
            boolean z11 = (i & 4096) != 0 ? aVar.m : z4;
            j4b0 j4b0Var2 = (i & 8192) != 0 ? aVar.n : j4b0Var;
            ny nyVar2 = (i & 16384) != 0 ? aVar.o : nyVar;
            boolean z12 = (32768 & i) != 0 ? aVar.p : z5;
            ixp0 ixp0Var2 = (65536 & i) != 0 ? aVar.q : ixp0Var;
            gvp.a aVar3 = (131072 & i) != 0 ? aVar.r : aVar2;
            List list2 = (262144 & i) != 0 ? aVar.s : list;
            OwnerRightState ownerRightState = aVar.t;
            wws wwsVar2 = (1048576 & i) != 0 ? aVar.u : wwsVar;
            n0x n0xVar2 = (2097152 & i) != 0 ? aVar.v : n0xVar;
            boolean z13 = (4194304 & i) != 0 ? aVar.w : z6;
            boolean z14 = (8388608 & i) != 0 ? aVar.x : z7;
            qzb0 qzb0Var2 = (16777216 & i) != 0 ? aVar.y : qzb0Var;
            t16 t16Var2 = (33554432 & i) != 0 ? aVar.z : t16Var;
            rpp0 rpp0Var2 = (67108864 & i) != 0 ? aVar.A : rpp0Var;
            wp50 wp50Var = aVar.B;
            ioa0 ioa0Var2 = (i & 268435456) != 0 ? aVar.C : ioa0Var;
            aVar.getClass();
            return new a(m0dVar2, nlh0Var, kih0Var, y0rVar, i2, mfj0Var2, fc60Var2, umcVar2, z8, z9, z10, z11, j4b0Var2, nyVar2, z12, ixp0Var2, aVar3, list2, ownerRightState, wwsVar2, n0xVar2, z13, z14, qzb0Var2, t16Var2, rpp0Var2, wp50Var, ioa0Var2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && epx.f(this.n, aVar.n) && epx.f(this.o, aVar.o) && this.p == aVar.p && epx.f(this.q, aVar.q) && epx.f(this.r, aVar.r) && epx.f(this.s, aVar.s) && this.t == aVar.t && epx.f(this.u, aVar.u) && epx.f(this.v, aVar.v) && this.w == aVar.w && this.x == aVar.x && epx.f(this.y, aVar.y) && epx.f(this.z, aVar.z) && epx.f(this.A, aVar.A) && epx.f(this.B, aVar.B) && epx.f(this.C, aVar.C);
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31;
            y0r y0rVar = this.e;
            int hashCode2 = (this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + qoy.b(qoy.b((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + fw3.a((this.r.hashCode() + ((this.q.hashCode() + qoy.b((this.o.hashCode() + ((this.n.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((this.i.hashCode() + qoy.b((this.g.hashCode() + qoy.b(shy.a(this.f, (hashCode + (y0rVar == null ? 0 : y0rVar.hashCode())) * 31, 31), 31, true)) * 31, 31, this.h.a)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31)) * 31, 31, this.p)) * 31)) * 31, 31, this.s)) * 31)) * 31)) * 31, 31, this.w), 31, this.x)) * 31)) * 31)) * 31;
            wp50 wp50Var = this.B;
            return this.C.hashCode() + ((hashCode2 + (wp50Var != null ? wp50Var.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Bound(clipState=" + this.b + ", videoFileController=" + this.c + ", autoPlay=" + this.d + ", cacheInfo=" + this.e + ", adapterPosition=" + this.f + ", productsClosed=true, shopsMoreState=" + this.g + ", newsMonothemeState=" + this.h + ", clipCarouselAttachesState=" + this.i + ", muteInClipFeed=" + this.j + ", templateBadgeHighlighted=" + this.k + ", subscribeButtonHighlighted=" + this.l + ", descriptionExpanded=" + this.m + ", playerState=" + this.n + ", actionButtonsState=" + this.o + ", seeking=" + this.p + ", uiVisibilityConfig=" + this.q + ", errorData=" + this.r + ", subtitleRenderItems=" + this.s + ", ownerRightState=" + this.t + ", fullVideoState=" + this.u + ", inlineNpsState=" + this.v + ", snapFocused=" + this.w + ", itemViewFocused=" + this.x + ", positionPointsState=" + this.y + ", bannerCompanionState=" + this.z + ", trendEngagementGrowthState=" + this.A + ", myTargetFacade=" + this.B + ", pinnedChangeSpinnerState=" + this.C + ')';
        }
    }

    /* compiled from: ClipItemState.kt */
    public static final class b implements z2d {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1848520137;
        }

        public final String toString() {
            return "NotBound";
        }
    }
}
