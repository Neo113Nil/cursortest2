package xsna;

import com.vkontakte.android.data.PostInteract;
import xsna.r8q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class q8q implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ r8q c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ r8q.a e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ q8q(int i, r8q r8qVar, boolean z, r8q.a aVar, boolean z2) {
        this.b = i;
        this.c = r8qVar;
        this.d = z;
        this.e = aVar;
        this.f = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        if (((Integer) obj).intValue() > this.b) {
            r8q r8qVar = this.c;
            r8qVar.d.x2(this.d);
            PostInteract postInteract = r8qVar.h;
            if (postInteract != null) {
                postInteract.zb(PostInteract.Type.expand);
            }
        } else {
            this.e.a(this.f);
        }
        return s3q0.a;
    }
}
