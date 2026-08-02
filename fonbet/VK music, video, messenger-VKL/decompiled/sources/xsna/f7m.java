package xsna;

import com.vk.libvideo.design.view.video.VideoView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: DiComponentProviderImpl.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class f7m extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ f7m(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((List) this.receiver).add((j9i) obj);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hgs0 hgs0Var = (hgs0) this.receiver;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                hgs0Var.G0(booleanValue, false);
                break;
        }
        return s3q0.a;
    }

    public f7m(ArrayList arrayList) {
        super(1, arrayList, List.class, "add", "add(Ljava/lang/Object;)Z", 8);
    }
}
