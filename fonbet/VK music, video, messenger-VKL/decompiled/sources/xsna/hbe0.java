package xsna;

import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseResult;
import xsna.dbe0;

/* compiled from: PublishAction.kt */
/* loaded from: classes7.dex */
public final class hbe0 implements dbe0.f {
    public final CoverChooseResult b;

    public hbe0(CoverChooseResult coverChooseResult) {
        this.b = coverChooseResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbe0) && epx.f(this.b, ((hbe0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Edit(result=" + this.b + ')';
    }
}
