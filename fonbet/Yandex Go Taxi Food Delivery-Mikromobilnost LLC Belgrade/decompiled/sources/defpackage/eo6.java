package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ViewMode;

/* loaded from: classes5.dex */
public final class eo6 extends n351 {
    public final ArrayList c;
    public final ViewMode d;
    public final long e;
    public final String f;

    public eo6(ArrayList arrayList, ViewMode viewMode, long j, String str) {
        super("bubble-toggles", false, 14);
        this.c = arrayList;
        this.d = viewMode;
        this.e = j;
        this.f = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eo6) {
            eo6 eo6Var = (eo6) obj;
            if (this.c.equals(eo6Var.c) && this.d == eo6Var.d && this.e == eo6Var.e && jl40.l(this.f, eo6Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int c = qv10.c((this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31, this.e);
        String str = this.f;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String c = c8m.c(this.e);
        StringBuilder sb = new StringBuilder("BubbleToggleModel(toggles=");
        sb.append(this.c);
        sb.append(", viewMode=");
        sb.append(this.d);
        sb.append(", spacing=");
        return g8e.r(sb, c, ", id=", this.f, Extension.C_BRAKE);
    }
}
