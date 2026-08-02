package xsna;

import com.vk.dto.common.VideoFile;
import xsna.qs80;

/* compiled from: VideoScreenResolver.kt */
/* loaded from: classes3.dex */
public final class met0 implements yp80 {
    public final /* synthetic */ izs<qs80, s3q0> b;
    public final /* synthetic */ VideoFile c;

    public met0(VideoFile videoFile, izs izsVar) {
        this.b = izsVar;
        this.c = videoFile;
    }

    @Override // xsna.yp80
    public final void U() {
        izs<qs80, s3q0> izsVar = this.b;
        if (izsVar != null) {
            izsVar.invoke(qs80.b.a);
        }
    }

    @Override // xsna.yp80
    public final void onError(Throwable th) {
        izs<qs80, s3q0> izsVar = this.b;
        if (izsVar != null) {
            izsVar.invoke(new qs80.a(th));
        }
    }

    @Override // xsna.yp80
    public final void onSuccess() {
        izs<qs80, s3q0> izsVar = this.b;
        if (izsVar != null) {
            izsVar.invoke(new qs80.c(this.c));
        }
    }

    @Override // xsna.yp80
    public final void I() {
    }

    @Override // xsna.yp80
    public final void B0(boolean z) {
    }
}
