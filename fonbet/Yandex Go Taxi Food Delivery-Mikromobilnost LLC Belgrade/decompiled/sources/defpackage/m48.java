package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.models.api.car.CopyInfoType;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.fragment.CopiedNotification;
import ru.yandex.taxi.models.CopySource;
import ru.yandex.taxi.superapp.orders.ui.c;

/* loaded from: classes6.dex */
public final class m48 implements k48 {
    public final k3c a;
    public final tj60 b;
    public final jj10 c;
    public final woe d;
    public final g e;
    public final Context f;
    public final oxu0 g;
    public final a h;
    public final i3y i;
    public final e48 j = new e48(1, this);
    public c k;

    public m48(k3c k3cVar, tj60 tj60Var, jj10 jj10Var, woe woeVar, g gVar, Context context, oxu0 oxu0Var, rqo rqoVar, a aVar) {
        this.a = k3cVar;
        this.b = tj60Var;
        this.c = jj10Var;
        this.d = woeVar;
        this.e = gVar;
        this.f = context;
        this.g = oxu0Var;
        this.h = aVar;
        this.i = kotlin.a.b(LazyThreadSafetyMode.NONE, new xn3(rqoVar, 1));
    }

    public final void a(String str, CopyInfoType copyInfoType, CopySource copySource) {
        HapticController$Effect hapticController$Effect = HapticController$Effect.CLICK_MEDIUM;
        Context context = this.f;
        qke.w(context, hapticController$Effect, true, true);
        this.a.a(false, str, "CarInfo");
        String id = copyInfoType.getId();
        tj60 tj60Var = this.b;
        if (tj60Var.a(id) != null) {
            return;
        }
        CopiedNotification copiedNotification = new CopiedNotification(context, copyInfoType.getStringId(), copyInfoType.getStringId(), copyInfoType.getId());
        tj60Var.e(copiedNotification);
        boolean z = this.e.a().j() > 1;
        int i = l48.a[copyInfoType.ordinal()];
        woe woeVar = this.d;
        if (i == 1) {
            String alias = copySource.getAlias();
            woeVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("multi_order", Boolean.valueOf(z));
            hashMap.put("source", alias);
            woeVar.a.a("Copy.LicencePlate.Notification.Shown", hashMap, 1, new HashMap());
        } else if (i == 2) {
            String alias2 = copySource.getAlias();
            woeVar.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("multi_order", Boolean.valueOf(z));
            hashMap2.put("source", alias2);
            woeVar.a.a("Copy.CarDetails.Notification.Shown", hashMap2, 1, new HashMap());
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            String alias3 = copySource.getAlias();
            woeVar.getClass();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("multi_order", Boolean.valueOf(z));
            hashMap3.put("source", alias3);
            woeVar.a.a("Copy.LicenceAndCarDetails.Notification.Shown", hashMap3, 1, new HashMap());
        }
        copiedNotification.startExpiresTimer();
        copiedNotification.setExpiresListener(new qn5(2, this, copyInfoType));
    }

    public final void b(q48 q48Var, View view, int i, int i2, CopySource copySource, int i3) {
        c cVar = new c(new ContextThemeWrapper(this.f, ((ru.yandex.taxi.styling.g) this.g).b().b), this.h);
        cVar.e = this.j;
        this.k = cVar;
        cVar.a(q48Var, view, i, i2, copySource, i3);
    }
}
