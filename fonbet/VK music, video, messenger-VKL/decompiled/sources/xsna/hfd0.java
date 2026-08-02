package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ffd0;
import xsna.jfd0;

/* compiled from: PrivacySettingsReducer.kt */
/* loaded from: classes4.dex */
public final class hfd0 extends dm50<lfd0, ffd0, kfd0> {
    public final f4z d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hfd0(PostPrivacyData postPrivacyData, UUID uuid, f4z f4zVar) {
        super(new kfd0(postPrivacyData, new lcd0(0, r3, r3), uuid));
        EmptyList emptyList = EmptyList.b;
        this.d = f4zVar;
    }

    @Override // xsna.dm50
    public final kfd0 c(kfd0 kfd0Var, ffd0 ffd0Var) {
        kfd0 kfd0Var2 = kfd0Var;
        ffd0 ffd0Var2 = ffd0Var;
        lcd0 lcd0Var = kfd0Var2.c;
        if (ffd0Var2 instanceof ffd0.b) {
            return kfd0.a(kfd0Var2, PostPrivacyData.a(kfd0Var2.b, null, null, null, null, ((ffd0.b) ffd0Var2).b, 127), null, 6);
        }
        boolean z = ffd0Var2 instanceof ffd0.e;
        f4z f4zVar = this.d;
        if (!z) {
            if (ffd0Var2 instanceof ffd0.c) {
                return kfd0.a(kfd0Var2, null, ((ffd0.c) ffd0Var2).b, 5);
            }
            if (ffd0Var2 instanceof ffd0.a) {
                PostPrivacyData a = PostPrivacyData.a(kfd0Var2.b, null, null, ((ffd0.a) ffd0Var2).b, null, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                f4zVar.b(new jfd0.f(a, false, lcd0Var.a));
                return kfd0.a(kfd0Var2, a, null, 6);
            }
            if (!(ffd0Var2 instanceof ffd0.d)) {
                throw new NoWhenBranchMatchedException();
            }
            PostPrivacyData a2 = PostPrivacyData.a(kfd0Var2.b, null, null, null, ((ffd0.d) ffd0Var2).b, false, 191);
            f4zVar.b(new jfd0.f(a2, false, lcd0Var.a));
            return kfd0.a(kfd0Var2, a2, null, 6);
        }
        List<PrivacyPostType> list = kfd0Var2.b.e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (PrivacyPostType privacyPostType : list) {
            if (privacyPostType instanceof PrivacyPostType.SingleDonutLevel) {
                PrivacyPostType privacyPostType2 = ((ffd0.e) ffd0Var2).b;
                if (privacyPostType2 instanceof PrivacyPostType.SingleDonutLevel) {
                    privacyPostType = privacyPostType2;
                }
            }
            arrayList.add(privacyPostType);
        }
        ffd0.e eVar = (ffd0.e) ffd0Var2;
        PostPrivacyData a3 = PostPrivacyData.a(kfd0Var2.b, eVar.b, arrayList, null, null, false, 243);
        f4zVar.b(new jfd0.f(a3, eVar.c, lcd0Var.a));
        return kfd0.a(kfd0Var2, a3, null, 6);
    }

    @Override // xsna.dm50
    public final lfd0 d() {
        return new lfd0(e(new dam(24)));
    }

    @Override // xsna.dm50
    public final void h(kfd0 kfd0Var, lfd0 lfd0Var) {
        f(lfd0Var.a, kfd0Var);
    }
}
