package xsna;

import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseArguments;

/* compiled from: AlbumChooseFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class pd1 extends uaj0 {
    public final AlbumChooseArguments a;

    public pd1(AlbumChooseArguments albumChooseArguments) {
        this.a = albumChooseArguments;
    }

    @Override // xsna.pwj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd1) && epx.f(this.a, ((pd1) obj).a);
    }

    @Override // xsna.pwj0
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AlbumChooseFragmentScopeKey(arguments=" + this.a + ')';
    }
}
