package defpackage;

import com.yandex.go.routeselector.analytics.EditPointAnalytics$ButtonName;
import com.yandex.go.routeselector.analytics.EditPointAnalytics$PointType;
import com.yandex.go.routeselector.analytics.EditPointAnalytics$Screen;
import java.util.HashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorAnalytics$Button;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;

/* loaded from: classes12.dex */
public final class eov0 implements t8l0 {
    public final b1 a;
    public final String b;
    public final EditPointAnalytics$Screen c;

    public eov0(b1 b1Var, ModalViewOrigin modalViewOrigin) {
        String str;
        EditPointAnalytics$Screen editPointAnalytics$Screen;
        this.a = b1Var;
        int[] iArr = dov0.a;
        int i = iArr[modalViewOrigin.ordinal()];
        if (i == 1 || i == 2) {
            str = "main";
        } else if (i == 3) {
            str = "summary";
        } else {
            if (i != 4) {
                w511.b();
                throw null;
            }
            str = "order";
        }
        this.b = str;
        int i2 = iArr[modalViewOrigin.ordinal()];
        if (i2 == 1 || i2 == 2) {
            editPointAnalytics$Screen = EditPointAnalytics$Screen.Main;
        } else if (i2 == 3) {
            editPointAnalytics$Screen = EditPointAnalytics$Screen.Summary;
        } else {
            if (i2 != 4) {
                w511.b();
                throw null;
            }
            editPointAnalytics$Screen = EditPointAnalytics$Screen.Order;
        }
        this.c = editPointAnalytics$Screen;
    }

    @Override // defpackage.t8l0
    public final void a(wvb1 wvb1Var) {
        String str = wvb1Var.a ? "source" : "destination";
        String alias = ((RouteSelectorOpenReason) wvb1Var.b).getAlias();
        b1 b1Var = this.a;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        if (alias != null) {
            hashMap.put("open_reason", alias);
        }
        String str2 = this.b;
        if (str2 != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, str2);
        }
        b1Var.a.a("EditPoint.Shown", hashMap, 1, tse0.r("type", hashMap, str));
    }

    @Override // defpackage.t8l0
    public final void b(boolean z, RouteSelectorAnalytics$Button routeSelectorAnalytics$Button) {
        EditPointAnalytics$ButtonName editPointAnalytics$ButtonName;
        EditPointAnalytics$PointType editPointAnalytics$PointType = z ? EditPointAnalytics$PointType.Source : EditPointAnalytics$PointType.Destination;
        int i = dov0.b[routeSelectorAnalytics$Button.ordinal()];
        if (i == 1) {
            editPointAnalytics$ButtonName = EditPointAnalytics$ButtonName.Done;
        } else if (i == 2) {
            editPointAnalytics$ButtonName = EditPointAnalytics$ButtonName.Suggest;
        } else if (i == 3) {
            editPointAnalytics$ButtonName = EditPointAnalytics$ButtonName.Entrance;
        } else if (i == 4) {
            editPointAnalytics$ButtonName = EditPointAnalytics$ButtonName.Back;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            editPointAnalytics$ButtonName = EditPointAnalytics$ButtonName.Geo;
        }
        b1 b1Var = this.a;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("point_type", editPointAnalytics$PointType.getEventValue());
        hashMap.put(MetaDataField.SCREEN_FIELD, this.c.getEventValue());
        hashMap.put("button_name", editPointAnalytics$ButtonName.getEventValue());
        b1Var.a.a("EditPoint.Tapped", hashMap, 3, new HashMap());
    }
}
