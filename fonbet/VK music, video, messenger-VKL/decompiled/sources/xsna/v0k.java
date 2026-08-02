package xsna;

import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseArguments;

/* compiled from: CoverChooseFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class v0k extends uaj0 {
    public final CoverChooseArguments a;

    public v0k(CoverChooseArguments coverChooseArguments) {
        this.a = coverChooseArguments;
    }

    @Override // xsna.pwj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0k) && epx.f(this.a, ((v0k) obj).a);
    }

    @Override // xsna.pwj0
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CoverChooseFragmentScopeKey(arguments=" + this.a + ')';
    }
}
