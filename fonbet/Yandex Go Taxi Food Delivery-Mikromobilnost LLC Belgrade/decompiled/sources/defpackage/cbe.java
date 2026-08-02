package defpackage;

import android.content.Context;
import com.yandex.delivery.utils.dialogmanager.impl.b;
import ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.a;
import ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class cbe implements zni {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cbe(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.zni
    public final xni create() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                p1b p1bVar = (p1b) obj;
                j4n j4nVar = (j4n) ((dbe) obj2).d.a;
                j4nVar.getClass();
                q5z.h((qcp0) j4nVar.b);
                y30 y30Var = (y30) j4nVar.x;
                q5z.h(y30Var);
                hwy0 hwy0Var = (hwy0) j4nVar.a;
                q5z.h(hwy0Var);
                qae qaeVar = (qae) p1bVar.a;
                rae raeVar = (rae) p1bVar.b;
                Context context = (Context) j4nVar.y;
                q5z.h(context);
                abe abeVar = new abe(context, false, false);
                fza0 fza0Var = (fza0) j4nVar.w;
                q5z.h(fza0Var);
                a aVar = new a(abeVar, fza0Var);
                b bVar = (b) j4nVar.z;
                q5z.h(bVar);
                yuj0 yuj0Var = (yuj0) j4nVar.c;
                q5z.h(yuj0Var);
                return new aoi(new sk7(23, y30Var, hwy0Var, new d(qaeVar, raeVar, aVar, bVar, new sae(1, yuj0Var))), qaeVar, raeVar);
            default:
                bc bcVar = (bc) ((s1f) obj2).b.b;
                bcVar.getClass();
                q5z.h((qcp0) bcVar.c);
                y30 y30Var2 = (y30) bcVar.w;
                q5z.h(y30Var2);
                hwy0 hwy0Var2 = (hwy0) bcVar.b;
                q5z.h(hwy0Var2);
                r1f r1fVar = (r1f) ((gyc) obj).a;
                yuj0 yuj0Var2 = (yuj0) bcVar.x;
                q5z.h(yuj0Var2);
                gyc gycVar = new gyc(yuj0Var2);
                Context context2 = (Context) bcVar.a;
                q5z.h(context2);
                return new aoi(new sk7(27, y30Var2, hwy0Var2, new ru.yandex.logistics.sdk.cargo_form.impl.screen_coupon.impl.ui.b(r1fVar, gycVar, new ru.yandex.logistics.sdk.cargo_form.impl.screen_coupon.impl.b(context2))), new lvn(), r1fVar);
        }
    }
}
