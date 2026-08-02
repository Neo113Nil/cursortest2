package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import xsna.e510;
import xsna.kq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ rq0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new kq0.c(((Boolean) obj).booleanValue()));
                break;
            case 1:
                this.c.invoke(new e510.d(((Long) obj).longValue()));
                break;
            default:
                this.c.invoke((SdkVideoFile) obj);
                break;
        }
        return s3q0.a;
    }
}
