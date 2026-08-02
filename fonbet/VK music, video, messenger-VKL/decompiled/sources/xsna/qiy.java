package xsna;

import com.vk.log.L;
import com.vk.stickers.keyboard.page.StickersRecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qiy implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ qiy(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        long j = this.c;
        switch (i) {
            case 0:
                return ((kw8) obj).c(new piy(j, 0));
            default:
                int i2 = StickersRecyclerView.w;
                t6g0 t6g0Var = t6g0.b;
                t6g0.d().o0(j + 1);
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }
}
