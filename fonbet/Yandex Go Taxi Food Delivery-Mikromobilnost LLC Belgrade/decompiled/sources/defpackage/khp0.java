package defpackage;

import androidx.compose.ui.node.s;
import androidx.compose.ui.semantics.c;

/* loaded from: classes10.dex */
public final class khp0 {
    public final c a;
    public final int b;
    public final f6w c;
    public final s d;

    public khp0(c cVar, int i, f6w f6wVar, s sVar) {
        this.a = cVar;
        this.b = i;
        this.c = f6wVar;
        this.d = sVar;
    }

    public final rzx a() {
        return this.d;
    }

    public final c b() {
        return this.a;
    }

    public final f6w c() {
        return this.c;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.a + ", depth=" + this.b + ", viewportBoundsInWindow=" + this.c + ", coordinates=" + this.d + ')';
    }
}
