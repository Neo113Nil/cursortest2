package xsna;

import com.vk.newsfeed.posting.crop_editor.domain.model.LocalImageLink;

/* compiled from: CropImageState.kt */
/* loaded from: classes4.dex */
public final class mhk {
    public final LocalImageLink a;

    public mhk(LocalImageLink localImageLink) {
        this.a = localImageLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mhk) && this.a.equals(((mhk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CropImageState(currentLink=" + this.a + ')';
    }
}
