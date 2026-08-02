package defpackage;

import androidx.compose.animation.tooling.ComposeAnimation;

/* loaded from: classes10.dex */
public final class e521 implements eup0 {
    public final String a;
    public final Object b;

    public e521(Object obj, String str) {
        this.a = str;
        this.b = obj;
    }

    @Override // defpackage.eup0
    public final ComposeAnimation I() {
        boolean z = i421.a;
        return i421.a ? new i421() : null;
    }

    @Override // defpackage.eup0
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.eup0
    public final rfd b(ComposeAnimation composeAnimation, v5c0 v5c0Var) {
        return new we60();
    }

    @Override // defpackage.eup0
    public final String getLabel() {
        return this.a;
    }
}
