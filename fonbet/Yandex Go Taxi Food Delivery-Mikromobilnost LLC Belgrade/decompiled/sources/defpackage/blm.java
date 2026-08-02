package defpackage;

import com.yandex.go.navigator.driving.w;
import com.yandex.mapkit.directions.driving.Event;

/* loaded from: classes12.dex */
public final /* synthetic */ class blm implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ blm(w wVar, int i) {
        this.a = i;
        this.b = wVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        w wVar = this.b;
        int i2 = 1;
        Event event = (Event) obj;
        switch (i) {
            case 0:
                wVar.h.l(null);
                yov yovVar = wVar.c;
                yovVar.a.b(new vov(event.getEventId(), yovVar, 0), true);
                break;
            default:
                wVar.h.l(null);
                yov yovVar2 = wVar.c;
                yovVar2.a.b(new vov(event.getEventId(), yovVar2, i2), true);
                break;
        }
        return zy11Var;
    }
}
