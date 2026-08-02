package xsna;

import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class tic0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final PhotoVideoDisplayMode b;

    public tic0(PhotoVideoDisplayMode photoVideoDisplayMode) {
        this.b = photoVideoDisplayMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tic0) && this.b == ((tic0) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SetPhotoVideoDisplayMode(displayMode=" + this.b + ')';
    }
}
