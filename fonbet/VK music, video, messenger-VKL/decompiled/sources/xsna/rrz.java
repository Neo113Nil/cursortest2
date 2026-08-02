package xsna;

import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rrz implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rrz(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return "state: " + ((zrz.a) this.d) + " missed network load of " + this.c + " items";
            default:
                ((com.vk.im.ui.components.msg_list.c) this.d).o.e = this.c;
                return s3q0.a;
        }
    }
}
