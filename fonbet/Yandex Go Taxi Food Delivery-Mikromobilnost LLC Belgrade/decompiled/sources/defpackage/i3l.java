package defpackage;

import com.yandex.div2.DivPatch$Mode;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class i3l implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;
    public final exq d;

    static {
        new kvo(DivPatch$Mode.PARTIAL);
    }

    public i3l(exq exqVar, exq exqVar2, exq exqVar3, exq exqVar4) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
        this.d = exqVar4;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((d3l) ft6.b.O5.getValue()).b(ft6.a, this);
    }
}
