package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import xsna.mat;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class twb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ twb(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                int i2 = kwg0.a;
                new jwg0("uwb").accept(th);
                if (izsVar != null) {
                    izsVar.invoke(th);
                }
                break;
            case 1:
                izsVar.invoke(new mat.a((uet) obj));
                break;
            default:
                SdkVideoFile sdkVideoFile = (SdkVideoFile) obj;
                if (izsVar != null) {
                    izsVar.invoke((SdkClipVideoFile) sdkVideoFile);
                }
                break;
        }
        return s3q0.a;
    }
}
