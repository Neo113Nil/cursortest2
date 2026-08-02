package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.hints.HintId;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import xsna.ffd0;
import xsna.jfd0;
import xsna.wed0;

/* compiled from: PrivacySettingsFeature.kt */
/* loaded from: classes4.dex */
public final class afd0 extends wk50<lfd0, kfd0, wed0, ffd0> {
    public final PostPrivacyData f;
    public final h7v g;
    public final wj50<jfd0> h;
    public final boolean i;

    public afd0() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public afd0(PostPrivacyData postPrivacyData, h7v h7vVar, boolean z) {
        super(wed0.f.b, new hfd0(postPrivacyData, UUID.randomUUID(), r0));
        f4z f4zVar = new f4z();
        this.f = postPrivacyData;
        this.g = h7vVar;
        this.h = f4zVar;
        this.i = z;
    }

    @Override // xsna.wk50
    public final void N(kfd0 kfd0Var, wed0 wed0Var) {
        DonutLevel donutLevel;
        kfd0 kfd0Var2 = kfd0Var;
        wed0 wed0Var2 = wed0Var;
        PostPrivacyData postPrivacyData = kfd0Var2.b;
        UUID uuid = kfd0Var2.d;
        boolean z = wed0Var2 instanceof wed0.f;
        h7v h7vVar = this.g;
        String str = null;
        if (z) {
            T(new ffd0.b(h7vVar.m(HintId.DONUT_CUSTOM_TEASER_TEXT)));
            io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(jgz.h(new jgz(10), e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.PHOTO_BASE), 11)), null, null, 3);
            cc20 cc20Var = new cc20(new or50(this, 11), 17);
            int i = kwg0.a;
            this.e.b(y0.subscribe(cc20Var, new iwg0()));
            return;
        }
        boolean z2 = wed0Var2 instanceof wed0.b;
        PostPrivacyData postPrivacyData2 = this.f;
        boolean z3 = this.i;
        wj50<jfd0> wj50Var = this.h;
        if (z2) {
            wed0.b bVar = (wed0.b) wed0Var2;
            PrivacyPostType privacyPostType = bVar.b;
            UUID uuid2 = bVar.d;
            if (uuid2 == null || epx.f(uuid, uuid2)) {
                if (z3 && (privacyPostType instanceof PrivacyPostType.SingleDonutLevel)) {
                    PrivacyPostType.SingleDonutLevel singleDonutLevel = (PrivacyPostType.SingleDonutLevel) privacyPostType;
                    if ((postPrivacyData.d instanceof PrivacyPostType.SingleDonutLevel) || singleDonutLevel.b == null) {
                        wj50Var.b(new jfd0.e(singleDonutLevel.b, postPrivacyData2.f, uuid));
                        return;
                    } else {
                        T(new ffd0.e(singleDonutLevel, false));
                        return;
                    }
                }
                boolean z4 = epx.f(privacyPostType, PrivacyPostType.BestFriends.b) && kfd0Var2.c.a == 0;
                T(new ffd0.e(privacyPostType, z4));
                if (z4) {
                    wj50Var.b(jfd0.d.a);
                    return;
                } else {
                    if (bVar.c) {
                        wj50Var.b(jfd0.a.a);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (wed0Var2 instanceof wed0.c) {
            wed0.c cVar = (wed0.c) wed0Var2;
            UUID uuid3 = cVar.c;
            if (uuid3 == null || epx.f(uuid, uuid3)) {
                T(new ffd0.e(cVar.b, false));
                return;
            }
            return;
        }
        if (wed0Var2 instanceof wed0.h) {
            T(new ffd0.e(PrivacyPostType.BestFriends.b, true));
            wj50Var.b(jfd0.d.a);
            return;
        }
        if (wed0Var2 instanceof wed0.e) {
            if (z3) {
                T(new ffd0.e(postPrivacyData.d, false));
            }
            wj50Var.b(jfd0.a.a);
            return;
        }
        if (wed0Var2 instanceof wed0.i) {
            wj50Var.b(new jfd0.e(((wed0.i) wed0Var2).b, postPrivacyData2.f, uuid));
            return;
        }
        if (wed0Var2 instanceof wed0.g) {
            wj50Var.b(new jfd0.c(postPrivacyData.g));
            return;
        }
        if (wed0Var2 instanceof wed0.a) {
            T(new ffd0.a(((wed0.a) wed0Var2).b));
            return;
        }
        if (!(wed0Var2 instanceof wed0.d)) {
            if (!(wed0Var2 instanceof wed0.j)) {
                throw new NoWhenBranchMatchedException();
            }
            T(new ffd0.d(((wed0.j) wed0Var2).b));
            return;
        }
        h7vVar.b(HintId.DONUT_CUSTOM_TEASER_TEXT.getId());
        T(new ffd0.b(false));
        PrivacyPostType privacyPostType2 = postPrivacyData.d;
        PrivacyPostType.SingleDonutLevel singleDonutLevel2 = privacyPostType2 instanceof PrivacyPostType.SingleDonutLevel ? (PrivacyPostType.SingleDonutLevel) privacyPostType2 : null;
        if (singleDonutLevel2 != null && (donutLevel = singleDonutLevel2.b) != null) {
            str = donutLevel.e;
        }
        if (str == null) {
            str = "";
        }
        wj50Var.b(new jfd0.b(postPrivacyData.h, str));
    }
}
