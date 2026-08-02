package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ViewMode;

/* loaded from: classes5.dex */
public final class go6 implements pre {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final boolean d;
    public final ViewMode e;

    public go6(String str, ArrayList arrayList, String str2, boolean z, ViewMode viewMode) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = z;
        this.e = viewMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go6)) {
            return false;
        }
        go6 go6Var = (go6) obj;
        return jl40.l(this.a, go6Var.a) && this.b.equals(go6Var.b) && jl40.l(this.c, go6Var.c) && this.d == go6Var.d && this.e == go6Var.e;
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "bubble-toggles";
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.b(ly3.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder m = x4e.m("BubbleToggleRemoteCoreWidget(id=", this.a, ", toggles=", ", formStateKey=", this.b);
        tse0.y(this.c, ", isMultichoice=", ", viewMode=", m, this.d);
        m.append(this.e);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
