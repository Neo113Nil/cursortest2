package defpackage;

import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;
import com.yandex.go.superapp.tracking.data.e;

/* loaded from: classes12.dex */
public final class jqe extends p4s0 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public jqe(e eVar, q551 q551Var, gb80 gb80Var, com.yandex.go.taxi.order.multi.shortcuts.e eVar2) {
        this.b = eVar2;
        this.c = new q680(q551Var, this, gb80Var, eVar);
    }

    @Override // defpackage.p4s0
    public final n4s0 a(v9g v9gVar, ShortcutViewSourceType shortcutViewSourceType) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (shortcutViewSourceType != ((ShortcutViewSourceType) obj)) {
                    break;
                } else {
                    break;
                }
            default:
                if (shortcutViewSourceType != ShortcutViewSourceType.ORDER) {
                    if (shortcutViewSourceType != ShortcutViewSourceType.WIDGETS) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return super.a(v9gVar, shortcutViewSourceType);
    }

    public jqe(mep0 mep0Var, ShortcutViewSourceType shortcutViewSourceType) {
        this.b = mep0Var;
        this.c = shortcutViewSourceType;
    }
}
