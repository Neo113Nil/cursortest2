package defpackage;

import com.yandex.mapkit.navigation.automotive.layer.RequestPointListener;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes7.dex */
public final class lmj implements RequestPointListener {
    public final /* synthetic */ mmj a;

    public lmj(mmj mmjVar) {
        this.a = mmjVar;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.RequestPointListener
    public final void onRequestPointTap(int i) {
        this.a.c(new gac(i, 1));
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.RequestPointListener
    public final void onRequestPointsChanged() {
        yeo yeoVar;
        mmj mmjVar = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onRequestPointsChanged"));
            if ((e instanceof zy11) || (yeoVar = mmjVar.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = mmjVar.b;
            if (yeoVar2 != null) {
                yeoVar2.error(mmj.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }
}
