package defpackage;

import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.messaging.internal.view.timeline.c;

/* loaded from: classes15.dex */
public final /* synthetic */ class h45 implements h3y {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h45(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.h3y
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((c) obj).e0();
            default:
                return (g) obj;
        }
    }
}
