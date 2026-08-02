package xsna;

import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import xsna.mno0;
import xsna.rmw;

/* compiled from: SimilarVideoUiState.kt */
/* loaded from: classes7.dex */
public final class foj0 {
    public final mno0.i a;
    public final rmw b;
    public final mno0.i c;
    public final mno0.i d;
    public final mno0.i e;
    public final doj0 f;
    public final VideoMetaViewState.c g;

    public foj0(mno0.i iVar, rmw.h hVar, mno0.i iVar2, mno0.i iVar3, mno0.i iVar4, doj0 doj0Var, VideoMetaViewState.c cVar) {
        this.a = iVar;
        this.b = hVar;
        this.c = iVar2;
        this.d = iVar3;
        this.e = iVar4;
        this.f = doj0Var;
        this.g = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof foj0)) {
            return false;
        }
        foj0 foj0Var = (foj0) obj;
        return this.a.equals(foj0Var.a) && epx.f(this.b, foj0Var.b) && this.c.equals(foj0Var.c) && this.d.equals(foj0Var.d) && this.e.equals(foj0Var.e) && this.f.equals(foj0Var.f) && epx.f(this.g, foj0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        rmw rmwVar = this.b;
        int hashCode2 = (this.f.hashCode() + urd0.a(urd0.a(urd0.a((hashCode + (rmwVar == null ? 0 : rmwVar.hashCode())) * 31, 31, this.c.a), 31, this.d.a), 31, this.e.a)) * 31;
        VideoMetaViewState.c cVar = this.g;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "SimilarVideoCardState(title=" + this.a + ", previewImage=" + this.b + ", duration=" + this.c + ", viewCount=" + this.d + ", date=" + this.e + ", author=" + this.f + ", donutChip=" + this.g + ')';
    }
}
