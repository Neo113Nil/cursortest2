package xsna;

import com.vk.music.bottomsheets.artistlist.domain.LoadingState;
import java.util.List;

/* compiled from: ArtistListBottomSheetState.kt */
/* loaded from: classes3.dex */
public final class lr3 implements km50 {
    public final List<yq3> b;
    public final LoadingState c;

    public lr3(List<yq3> list, LoadingState loadingState) {
        this.b = list;
        this.c = loadingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr3)) {
            return false;
        }
        lr3 lr3Var = (lr3) obj;
        return epx.f(this.b, lr3Var.b) && this.c == lr3Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistListBottomSheetState(artistList=" + this.b + ", loadingState=" + this.c + ')';
    }
}
