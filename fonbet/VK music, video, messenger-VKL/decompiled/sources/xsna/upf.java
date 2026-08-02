package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.presentation.state.ClipsWrapperCreateButton;
import xsna.uuf;

/* compiled from: ClipsWrapperCreateButtonMviState.kt */
/* loaded from: classes17.dex */
public final class upf implements km50, uuf.d.a {
    public final ClipsWrapperCreateButton b;
    public final boolean c;

    public upf() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.vk.clips.viewer.impl.feed.wrapper.presentation.state.ClipsWrapperCreateButton] */
    public static upf a(upf upfVar, ClipsWrapperCreateButton.a aVar, boolean z, int i) {
        ClipsWrapperCreateButton.a aVar2 = aVar;
        if ((i & 1) != 0) {
            aVar2 = upfVar.b;
        }
        if ((i & 2) != 0) {
            z = upfVar.c;
        }
        upfVar.getClass();
        return new upf(aVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upf)) {
            return false;
        }
        upf upfVar = (upf) obj;
        return epx.f(this.b, upfVar.b) && this.c == upfVar.c;
    }

    public final int hashCode() {
        ClipsWrapperCreateButton clipsWrapperCreateButton = this.b;
        return Boolean.hashCode(this.c) + ((clipsWrapperCreateButton == null ? 0 : clipsWrapperCreateButton.hashCode()) * 31);
    }

    @Override // xsna.uuf.d
    public final ppf o() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsWrapperCreateButtonMviState(button=");
        sb.append(this.b);
        sb.append(", isVisible=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public /* synthetic */ upf(int i) {
        this(null, true);
    }

    public upf(ClipsWrapperCreateButton clipsWrapperCreateButton, boolean z) {
        this.b = clipsWrapperCreateButton;
        this.c = z;
    }
}
