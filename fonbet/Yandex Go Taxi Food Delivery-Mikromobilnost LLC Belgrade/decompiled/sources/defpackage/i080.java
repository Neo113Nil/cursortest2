package defpackage;

import android.graphics.drawable.Drawable;
import androidx.core.graphics.BlendModeCompat;
import com.yandex.go.taxi.order.map.overlay.c;
import com.yandex.go.taxi.order.map.overlay.c0;
import com.yandex.runtime.image.ImageProvider;
import java.util.HashMap;
import ru.yandex.taxi.altpins.order.e;
import ru.yandex.taxi.design.bubble.BubbleTextComponent;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Direction;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final /* synthetic */ class i080 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ i080(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                return tje.y(f1h0.ic_top_round, cVar.z);
            case 1:
                c0 c0Var = cVar.C;
                ty1 ty1Var = c0Var.c0;
                o2y0 o2y0Var = c0Var.A;
                String str = o2y0Var.b().a;
                DriveState c = o2y0Var.c();
                e02 e02Var = ((e) ty1Var).c;
                e02Var.getClass();
                if (e02Var.b.add(scc.g("OnAlternativeBubbleShown", str, c.toString()))) {
                    t61 t61Var = e02Var.a;
                    String driveState = c.toString();
                    t61Var.getClass();
                    HashMap hashMap = new HashMap();
                    if (driveState != null) {
                        hashMap.put("Status", driveState);
                    }
                    t61Var.a.a("AltpinB.PedestrianRoute.AlternativeBubble.Shown", hashMap, 1, new HashMap());
                }
                return zy11Var;
            case 2:
                c0 c0Var2 = cVar.C;
                ty1 ty1Var2 = c0Var2.c0;
                o2y0 o2y0Var2 = c0Var2.A;
                String str2 = o2y0Var2.b().a;
                DriveState c2 = o2y0Var2.c();
                e02 e02Var2 = ((e) ty1Var2).c;
                e02Var2.getClass();
                if (e02Var2.b.add(scc.g("OnWalkingRouteShown", str2, c2.toString()))) {
                    t61 t61Var2 = e02Var2.a;
                    String driveState2 = c2.toString();
                    t61Var2.getClass();
                    HashMap hashMap2 = new HashMap();
                    if (driveState2 != null) {
                        hashMap2.put("Status", driveState2);
                    }
                    t61Var2.a.a("AltpinB.PedestrianRoute.Shown", hashMap2, 1, new HashMap());
                }
                return zy11Var;
            case 3:
                return ImageProvider.fromBitmap(u8b1.g(tje.y(f1h0.ic_top_round, cVar.z)));
            case 4:
                Drawable drawable = (Drawable) cVar.V.getValue();
                drawable.mutate().setColorFilter(ooc.k(cVar.z.getColor(mqg0.component_accent_color), BlendModeCompat.SRC_IN));
                return ImageProvider.fromBitmap(u8b1.g(drawable));
            case 5:
                BubbleTextComponent bubbleTextComponent = new BubbleTextComponent(cVar.z, null, 0, 6, null);
                g7h g7hVar = new g7h(bubbleTextComponent.getContext());
                g7hVar.o(DefaultBubbleDecorator$Direction.UP);
                bubbleTextComponent.setDecorator(g7hVar);
                bubbleTextComponent.useBgMainStyle();
                bubbleTextComponent.showCloseIcon(false);
                return bubbleTextComponent;
            default:
                BubbleTextComponent bubbleTextComponent2 = new BubbleTextComponent(cVar.z, null, 0, 6, null);
                egr0 egr0Var = new egr0(bubbleTextComponent2.getContext());
                egr0Var.o(DefaultBubbleDecorator$Direction.DOWN);
                bubbleTextComponent2.setDecorator(egr0Var);
                bubbleTextComponent2.useBgMainStyle();
                bubbleTextComponent2.showCloseIcon(false);
                return bubbleTextComponent2;
        }
    }
}
