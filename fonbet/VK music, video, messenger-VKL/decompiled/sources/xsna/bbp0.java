package xsna;

import com.vk.libvideo.design.compose.video.topshelf.state.TopshelfCardMetaCountState;
import xsna.mno0;

/* compiled from: TopshelfCardMetaInfoState.kt */
/* loaded from: classes2.dex */
public final class bbp0 {
    public final TopshelfCardMetaCountState a;
    public final mno0 b;

    public bbp0(TopshelfCardMetaCountState topshelfCardMetaCountState, mno0.i iVar) {
        this.a = topshelfCardMetaCountState;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbp0)) {
            return false;
        }
        bbp0 bbp0Var = (bbp0) obj;
        return epx.f(this.a, bbp0Var.a) && epx.f(this.b, bbp0Var.b);
    }

    public final int hashCode() {
        TopshelfCardMetaCountState topshelfCardMetaCountState = this.a;
        int hashCode = (topshelfCardMetaCountState == null ? 0 : topshelfCardMetaCountState.hashCode()) * 31;
        mno0 mno0Var = this.b;
        return hashCode + (mno0Var != null ? mno0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TopshelfCardMetaInfoState(metaCount=" + this.a + ", metaInfo=" + this.b + ')';
    }
}
