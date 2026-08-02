package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;

/* compiled from: SubscriptionDelegate.kt */
/* loaded from: classes17.dex */
public final class cym0 extends fhs0<SdkVideoFile> {
    public final /* synthetic */ rzl0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cym0(Context context, rzl0 rzl0Var) {
        super(context);
        this.d = rzl0Var;
    }

    @Override // xsna.fhs0, io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        h03.b(th);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        this.d.invoke((SdkVideoFile) obj);
    }
}
