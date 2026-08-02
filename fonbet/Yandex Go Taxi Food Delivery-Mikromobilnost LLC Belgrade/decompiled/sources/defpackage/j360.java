package defpackage;

import com.yandex.delivery.utils.dialogmanager.impl.b;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.NeuroPostcardShownStagesRepository;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.a;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.c;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.e;

/* loaded from: classes5.dex */
public final class j360 {
    public final String a;
    public final cjw0 b;
    public final c c;
    public final e d;
    public final a e;
    public final yuj0 f;
    public final b g;
    public final ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e h;
    public final NeuroPostcardShownStagesRepository i;
    public final kcz0 j;
    public final ike k;

    public j360(st2 st2Var, String str, cjw0 cjw0Var, c cVar, e eVar, a aVar, yuj0 yuj0Var, b bVar, ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar2, NeuroPostcardShownStagesRepository neuroPostcardShownStagesRepository, kcz0 kcz0Var) {
        this.a = str;
        this.b = cjw0Var;
        this.c = cVar;
        this.d = eVar;
        this.e = aVar;
        this.f = yuj0Var;
        this.g = bVar;
        this.h = eVar2;
        this.i = neuroPostcardShownStagesRepository;
        this.j = kcz0Var;
        this.k = bvf0.a(st2Var.a);
    }

    public static final void a(j360 j360Var, v360 v360Var) {
        if (!(v360Var instanceof t360)) {
            j360Var.getClass();
            if (v360Var instanceof u360) {
                return;
            }
            w511.b();
            return;
        }
        String str = ((t360) v360Var).a;
        yuj0 yuj0Var = j360Var.f;
        if (str == null) {
            str = yuj0Var.a(rzh0.logistics_unknown_error, new Object[0]);
        }
        j360Var.g.b(new qej(str, null, yuj0Var.a(rzh0.logistics_ok_button, new Object[0]), null, null, false, null, null, 250));
    }
}
