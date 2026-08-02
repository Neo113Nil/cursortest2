package xsna;

import com.vk.clips.interests.api.ClipsInterestsStatusProvider;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipsInterestsInteractorImpl.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class rge extends FunctionReferenceImpl implements izs<ClipsInterestsStatusProvider.Status, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(ClipsInterestsStatusProvider.Status status) {
        ((eie) this.receiver).b.onNext(status);
        return s3q0.a;
    }
}
