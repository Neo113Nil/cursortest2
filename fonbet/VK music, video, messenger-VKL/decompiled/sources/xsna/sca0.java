package xsna;

import com.vk.dto.common.id.UserId;
import xsna.tca0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sca0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ tca0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ UserId f;

    public /* synthetic */ sca0(int i, int i2, tca0 tca0Var, boolean z, UserId userId) {
        this.b = i;
        this.c = i2;
        this.d = tca0Var;
        this.e = z;
        this.f = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        this.d.b.onNext(new tca0.a.b(swe0.g(this.b, 0, 100), swe0.g(this.c, 0, 100), this.f, this.e));
        return s3q0.a;
    }
}
