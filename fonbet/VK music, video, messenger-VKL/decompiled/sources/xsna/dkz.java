package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class dkz implements wzs {
    public final /* synthetic */ VideoFile b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ izs d;
    public final /* synthetic */ izs e;

    public /* synthetic */ dkz(VideoFile videoFile, boolean z, izs izsVar, izs izsVar2) {
        this.b = videoFile;
        this.c = z;
        this.d = izsVar;
        this.e = izsVar2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj2;
        if (th == null) {
            boolean z = this.c;
            this.b.p5(Boolean.valueOf(z));
            this.d.invoke(Boolean.valueOf(z));
        } else {
            this.e.invoke(th);
        }
        return s3q0.a;
    }
}
