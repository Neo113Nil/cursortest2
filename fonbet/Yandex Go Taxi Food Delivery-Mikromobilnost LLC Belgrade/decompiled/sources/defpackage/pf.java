package defpackage;

import com.yandex.go.agreement.api.AcceptanceChangeSource;
import com.yandex.go.taxi.order.y;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* loaded from: classes.dex */
public final class pf implements yl {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ pf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yl
    public final void a(long j, long j2) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                of ofVar = (of) obj;
                EmptyList emptyList = EmptyList.a;
                EmptySet emptySet = EmptySet.a;
                if (j2 != 0) {
                    if (j != 0) {
                        ofVar.a.t("ru.yandex.taxi.gdpr.NEED_SEND_TYPES", emptySet);
                        ofVar.b(emptyList, AcceptanceChangeSource.USER_ACTION);
                    }
                    ofVar.d.clear();
                    break;
                } else {
                    ofVar.a.t("ru.yandex.taxi.gdpr.NEED_SEND_TYPES", emptySet);
                    ofVar.b(emptyList, AcceptanceChangeSource.USER_ACTION);
                    break;
                }
            case 1:
                ((y) ((h3y) obj).get()).b();
                break;
            default:
                if (j2 == 0 || j != 0) {
                    ((ijb0) obj).a.a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yl
    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                of ofVar = (of) obj;
                ofVar.a.t("ru.yandex.taxi.gdpr.NEED_SEND_TYPES", EmptySet.a);
                ofVar.b(EmptyList.a, AcceptanceChangeSource.USER_ACTION);
                break;
            case 1:
                ((y) ((h3y) obj).get()).b();
                break;
            default:
                ((ijb0) obj).a.a();
                break;
        }
    }
}
