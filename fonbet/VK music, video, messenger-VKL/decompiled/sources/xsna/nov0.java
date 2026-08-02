package xsna;

import com.vk.superapp.core.errors.VkAppsErrors;
import xsna.w2j;

/* compiled from: VkSubscriptionViewDelegate.kt */
/* loaded from: classes6.dex */
public final class nov0 implements w2j.a {
    public final /* synthetic */ mov0 a;
    public final /* synthetic */ io.reactivex.rxjava3.subjects.d<s3q0> b;

    public nov0(mov0 mov0Var, io.reactivex.rxjava3.subjects.d<s3q0> dVar) {
        this.a = mov0Var;
        this.b = dVar;
    }

    @Override // xsna.w2j.a
    public final void a() {
        this.b.onNext(s3q0.a);
    }

    @Override // xsna.w2j.a
    public final void onDismiss() {
        this.a.h(VkAppsErrors.Client.USER_DENIED);
        this.b.onComplete();
    }
}
