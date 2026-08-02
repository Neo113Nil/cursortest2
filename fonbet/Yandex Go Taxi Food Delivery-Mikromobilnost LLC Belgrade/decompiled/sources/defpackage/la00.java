package defpackage;

import com.yandex.go.taxi.main.ShortcutsMainScreen;
import com.yandex.go.taxi.main.a;
import com.yandex.go.taxi.order.map.overlay.c;
import com.yandex.go.taxi.order.map.overlay.c0;
import java.util.HashMap;
import ru.yandex.taxi.bubbles.models.BubbleModelShownFrom;

/* loaded from: classes6.dex */
public final /* synthetic */ class la00 implements oxf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ la00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                krl0 krl0Var = aVar.m;
                ShortcutsMainScreen shortcutsMainScreen = krl0Var != null ? (ShortcutsMainScreen) krl0Var.a : null;
                if (shortcutsMainScreen != null) {
                    shortcutsMainScreen.onAfterInflate();
                }
                aVar.d.b();
                break;
            case 1:
                c0 c0Var = ((c) obj).C;
                ft00 ft00Var = c0Var.V;
                String d = cta1.d(c0Var.A.c());
                kf00 kf00Var = ft00Var.a;
                kf00Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("mode", d);
                kf00Var.a.a("Map.Locations.Tapped", hashMap, 1, new HashMap());
                break;
            default:
                ygt0 ygt0Var = ((vgt0) obj).C;
                dn6 dn6Var = ygt0Var.H;
                dn6.a.getClass();
                if (dn6Var != cn6.b && ygt0Var.H.e()) {
                    ygt0Var.Lg(ygt0Var.H, BubbleModelShownFrom.TAP);
                    break;
                }
                break;
        }
    }
}
