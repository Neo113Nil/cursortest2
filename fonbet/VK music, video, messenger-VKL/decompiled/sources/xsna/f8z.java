package xsna;

import com.vk.im.ui.utils.recyclerview.LinearLayoutManagerScrollHelper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f8z implements gzs {
    public final /* synthetic */ LinearLayoutManagerScrollHelper b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ LinearLayoutManagerScrollHelper.Snap e;
    public final /* synthetic */ LinearLayoutManagerScrollHelper.Speed f;

    public /* synthetic */ f8z(LinearLayoutManagerScrollHelper linearLayoutManagerScrollHelper, int i, int i2, LinearLayoutManagerScrollHelper.Snap snap, LinearLayoutManagerScrollHelper.Speed speed) {
        this.b = linearLayoutManagerScrollHelper;
        this.c = i;
        this.d = i2;
        this.e = snap;
        this.f = speed;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.b.e(this.c, this.d, this.e, this.f);
        return s3q0.a;
    }
}
