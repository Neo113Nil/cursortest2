package xsna;

import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xib implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xib(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, 0, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, this.c, false, Integer.MAX_VALUE, 7);
            case 1:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, this.c, false, false, -1, 1919);
            default:
                ((tdu) obj).b(this.c ? 1.0f : 0.64f);
                return s3q0.a;
        }
    }
}
