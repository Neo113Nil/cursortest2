package xsna;

import android.content.Context;
import com.vk.dto.common.VideoFile;
import com.vk.log.L;

/* compiled from: VideoApiHelper.kt */
/* loaded from: classes17.dex */
public final class u1s0 extends fhs0<VideoFile> {
    public final /* synthetic */ izs<VideoFile, s3q0> d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u1s0(Context context, izs<? super VideoFile, s3q0> izsVar, boolean z) {
        super(context);
        this.d = izsVar;
        this.e = z;
    }

    @Override // xsna.fhs0, io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        if (this.e) {
            super.onError(th);
        } else {
            L.i(th);
        }
        this.d.invoke(null);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        w1s0 w1s0Var = w1s0.b;
        w1s0.a((VideoFile) obj, this.d);
    }
}
