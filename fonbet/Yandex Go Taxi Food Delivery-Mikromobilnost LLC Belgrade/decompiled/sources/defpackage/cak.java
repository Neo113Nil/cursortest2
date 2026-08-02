package defpackage;

import com.yandex.div2.DivActionSubmit$Request$Method;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class cak implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;

    static {
        new kvo(DivActionSubmit$Request$Method.POST);
    }

    public cak(exq exqVar, exq exqVar2, exq exqVar3) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((aak) ft6.b.c1.getValue()).b(ft6.a, this);
    }
}
