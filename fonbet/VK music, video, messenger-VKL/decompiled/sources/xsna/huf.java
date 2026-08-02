package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.presentation.event.ClipsWrapperHintButtonPosition;
import com.vk.dto.hints.Hint;

/* compiled from: ClipsWrapperToolbarHintEvent.kt */
/* loaded from: classes17.dex */
public final class huf {
    public final Hint a;
    public final ClipsWrapperHintButtonPosition b;

    public huf(Hint hint, ClipsWrapperHintButtonPosition clipsWrapperHintButtonPosition) {
        this.a = hint;
        this.b = clipsWrapperHintButtonPosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huf)) {
            return false;
        }
        huf hufVar = (huf) obj;
        return epx.f(this.a, hufVar.a) && this.b == hufVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.b.hashCode() * 31);
    }

    public final String toString() {
        return "ClipsWrapperToolbarHintEvent(hint=" + this.a + ", hintButtonPosition=" + this.b + ')';
    }
}
