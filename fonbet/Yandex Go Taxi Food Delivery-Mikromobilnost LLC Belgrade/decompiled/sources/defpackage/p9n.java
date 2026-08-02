package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.a;
import ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class p9n implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ v4v w;

    public /* synthetic */ p9n(long j, v4v v4vVar, boolean z, int i) {
        this.c = j;
        this.w = v4vVar;
        this.b = z;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.e(vng.O(1), this.c, (fid) obj, this.w, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                b.d(vng.O(1), this.c, (fid) obj, this.w, this.b);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ p9n(boolean z, long j, v4v v4vVar, int i) {
        this.b = z;
        this.c = j;
        this.w = v4vVar;
    }
}
