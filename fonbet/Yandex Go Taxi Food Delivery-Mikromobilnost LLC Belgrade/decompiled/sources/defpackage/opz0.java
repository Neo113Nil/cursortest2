package defpackage;

import defpackage.soz0;
import kotlin.a;
import kotlin.text.Regex;
import ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperimentProvider$PaymentMode;
import ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperimentProvider$RoadMode;

/* loaded from: classes9.dex */
public final class opz0 {
    public final i3y a;

    public opz0(rqo rqoVar) {
        this.a = a.a(new zf2(rqoVar, 17));
    }

    public static String f(String str, String... strArr) {
        for (String str2 : strArr) {
            str = new Regex("%@").k(str, str2);
        }
        return str;
    }

    public final String a(TollRoadDialogExperimentProvider$RoadMode tollRoadDialogExperimentProvider$RoadMode, TollRoadDialogExperimentProvider$PaymentMode tollRoadDialogExperimentProvider$PaymentMode) {
        int i = npz0.a[tollRoadDialogExperimentProvider$RoadMode.ordinal()];
        if (i == 1) {
            return c(d().e.a.a, tollRoadDialogExperimentProvider$PaymentMode);
        }
        if (i == 2) {
            return c(d().e.b.a, tollRoadDialogExperimentProvider$PaymentMode);
        }
        w511.b();
        return null;
    }

    public final String b(String str) {
        return d6z.Y(d(), str);
    }

    public final String c(soz0.i iVar, TollRoadDialogExperimentProvider$PaymentMode tollRoadDialogExperimentProvider$PaymentMode) {
        switch (npz0.b[tollRoadDialogExperimentProvider$PaymentMode.ordinal()]) {
            case 1:
                return b(iVar.c);
            case 2:
                return b(iVar.d);
            case 3:
                return b(iVar.e);
            case 4:
                return b(iVar.f);
            case 5:
                return b(iVar.g);
            case 6:
                return b(iVar.b);
            default:
                w511.b();
                return null;
        }
    }

    public final soz0 d() {
        return (soz0) ((en11) this.a.getValue()).b();
    }

    public final boolean e() {
        return ((en11) this.a.getValue()).isEnabled() && d().f;
    }
}
