package defpackage;

import com.yandex.go.shortcuts.dto.response.PromoMode;
import java.util.Iterator;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes.dex */
public final class kb00 extends fnr0 {
    public final String a;
    public final String b;

    public kb00() {
        super(0);
        this.a = "properties";
        this.b = "MainScreenPropertiesParser";
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        return this.a;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        return this.b;
    }

    @Override // defpackage.fnr0
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        Object obj = null;
        if (bVar instanceof c) {
            b bVar2 = (b) ((c) bVar).get("promo_mode");
            if (bVar2 instanceof d) {
                d dVar = (d) bVar2;
                if (dVar.b()) {
                    String a = dVar.a();
                    Iterator<E> it = PromoMode.c().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (jl40.l(((PromoMode) next).getValue(), a)) {
                            obj = next;
                            break;
                        }
                    }
                    return new jb00((PromoMode) obj);
                }
            }
        }
        return null;
    }
}
