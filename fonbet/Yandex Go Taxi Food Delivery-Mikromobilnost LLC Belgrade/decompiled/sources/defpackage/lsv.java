package defpackage;

import com.yandex.mapkit.indoor.IndoorPlan;
import com.yandex.mapkit.indoor.IndoorStateListener;
import java.util.Map;
import kotlin.Pair;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes7.dex */
public final class lsv implements IndoorStateListener {
    public final /* synthetic */ msv a;

    public lsv(msv msvVar) {
        this.a = msvVar;
    }

    @Override // com.yandex.mapkit.indoor.IndoorStateListener
    public final void onActiveLevelChanged(String str) {
        this.a.c(new xc8(str, 14));
    }

    @Override // com.yandex.mapkit.indoor.IndoorStateListener
    public final void onActivePlanFocused(IndoorPlan indoorPlan) {
        msv msvVar = this.a;
        msvVar.c(new mqu(7, indoorPlan, msvVar.d.a(ReferenceType.INDOOR_PLAN, indoorPlan)));
    }

    @Override // com.yandex.mapkit.indoor.IndoorStateListener
    public final void onActivePlanLeft() {
        yeo yeoVar;
        msv msvVar = this.a;
        try {
            Map e = gw00.e(new Pair(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onActivePlanLeft"));
            if ((e instanceof zy11) || (yeoVar = msvVar.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = msvVar.b;
            if (yeoVar2 != null) {
                yeoVar2.error(msv.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }
}
