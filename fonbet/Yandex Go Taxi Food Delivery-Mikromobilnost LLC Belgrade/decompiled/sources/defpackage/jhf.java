package defpackage;

import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes8.dex */
public final class jhf {
    public final Screen a;
    public final Screen b;

    public jhf(Screen screen, Screen screen2) {
        this.a = screen;
        this.b = screen2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhf)) {
            return false;
        }
        jhf jhfVar = (jhf) obj;
        return this.a == jhfVar.a && this.b == jhfVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
