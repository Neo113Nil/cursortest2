package xsna;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InsertPushTokenByProjectIdInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.domain.interactor.InsertPushTokenByProjectIdInteractor", f = "InsertPushTokenByProjectIdInteractor.kt", l = {ModuleDescriptor.MODULE_VERSION, 97}, m = "registerForPushes")
/* loaded from: classes5.dex */
public final class s3x extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t3x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3x(t3x t3xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = t3xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return t3x.b(this.this$0, 0L, null, null, this);
    }
}
