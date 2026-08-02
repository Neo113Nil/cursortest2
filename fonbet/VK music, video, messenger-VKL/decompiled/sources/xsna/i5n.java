package xsna;

import com.vk.instantjobs.InstantJob;
import com.vkontakte.android.data.PostInteract;
import xsna.r7x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class i5n implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i5n(r8q r8qVar, boolean z) {
        this.b = 1;
        this.d = r8qVar;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                k5n k5nVar = (k5n) this.d;
                Throwable th = (Throwable) obj;
                if (this.c && !k5nVar.d.isEmpty()) {
                    h03.b(th);
                }
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 1:
                r8q r8qVar = (r8q) this.d;
                Throwable th2 = (Throwable) obj;
                r8qVar.d.x2(this.c);
                PostInteract postInteract = r8qVar.h;
                if (postInteract != null) {
                    postInteract.zb(PostInteract.Type.expand);
                }
                com.vk.metrics.eventtracking.b.a.a(th2);
                return s3q0.a;
            default:
                return r7x.a.a((r7x.a) obj, this.c, (InstantJob.a.e) this.d, 1);
        }
    }

    public /* synthetic */ i5n(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}
