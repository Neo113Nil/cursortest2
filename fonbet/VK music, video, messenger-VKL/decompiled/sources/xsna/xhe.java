package xsna;

import com.vk.clips.interests.api.ClipsInterestsStatusProvider;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipsInterestsRepositoryImpl.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class xhe extends FunctionReferenceImpl implements izs<ClipsInterestsStatusProvider.Status, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(ClipsInterestsStatusProvider.Status status) {
        ((io.reactivex.rxjava3.subjects.d) this.receiver).onNext(status);
        return s3q0.a;
    }
}
