package defpackage;

import com.yandex.plus.home.feature.webviews.internal.container.factory.a;
import com.yandex.plus.home.feature.webviews.internal.container.factory.b;
import ru.yandex.taxi.widget.due_timetable.DueTimetableView;

/* loaded from: classes2.dex */
public final /* synthetic */ class j2n implements vhw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j2n(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vhw0
    public final Object get() {
        v1n v1nVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                v1nVar = ((DueTimetableView) obj).slotWidthModifier;
                return v1nVar;
            case 1:
                return ((a) obj).b.a();
            case 2:
                return (String) ((vhw0) obj).get();
            case 3:
                return (String) ((sls) obj).invoke();
            case 4:
                return ((rzs0) obj).c.a();
            default:
                return ((b) obj).b.a();
        }
    }
}
