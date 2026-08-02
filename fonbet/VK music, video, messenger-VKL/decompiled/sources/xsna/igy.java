package xsna;

import com.vk.stickers.keyboard.navigation.KeyboardNavigationButton;

/* compiled from: KeyboardNavigationItems.kt */
/* loaded from: classes6.dex */
public final class igy extends jgy {
    public final KeyboardNavigationButton b;
    public final boolean c;

    public igy(KeyboardNavigationButton keyboardNavigationButton, boolean z) {
        this.b = keyboardNavigationButton;
        this.c = z;
    }

    @Override // xsna.jgy
    public final jgy a(boolean z) {
        return new igy(this.b, z);
    }

    @Override // xsna.jgy
    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igy)) {
            return false;
        }
        igy igyVar = (igy) obj;
        return this.b == igyVar.b && this.c == igyVar.c;
    }

    @Override // xsna.jgy
    public final int getId() {
        return this.b.h();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardNavigationButtonItem(button=");
        sb.append(this.b);
        sb.append(", selected=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
