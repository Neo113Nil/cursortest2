package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import xsna.rgc0;

/* compiled from: CommunityProfilePostingItemPresenterDelegate.kt */
/* loaded from: classes5.dex */
public final class gsh {
    public final Context a;
    public final Activity b;
    public final ynh c;
    public final wqf d;
    public final trf e;
    public a f;

    /* compiled from: CommunityProfilePostingItemPresenterDelegate.kt */
    public static final class a {
        public final egc0 a;
        public final ExtendedCommunityProfile b;

        public a(egc0 egc0Var, ExtendedCommunityProfile extendedCommunityProfile) {
            this.a = egc0Var;
            this.b = extendedCommunityProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PresenterHolder(presenter=");
            sb.append(this.a);
            sb.append(", profile=");
            return at.a(sb, this.b, ')');
        }
    }

    public gsh(Context context, FragmentActivity fragmentActivity, ynh ynhVar, wqf wqfVar, trf trfVar) {
        this.a = context;
        this.b = fragmentActivity;
        this.c = ynhVar;
        this.d = wqfVar;
        this.e = trfVar;
    }

    public final egc0 a(ExtendedCommunityProfile extendedCommunityProfile) {
        a aVar = this.f;
        if (aVar != null && aVar.b.a0 == extendedCommunityProfile.a0) {
            return aVar.a;
        }
        int i = 3;
        sgc0 a2 = hd60.a().o().a(new obh(this, 1), new rgc0.a(new b(extendedCommunityProfile), CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, (fhc0) this.c.l.getValue(), extendedCommunityProfile.a.c), new i4h(extendedCommunityProfile, i), this.d, this.e, new bc1(i, extendedCommunityProfile, this));
        a2.i = new aq1(6, this, extendedCommunityProfile);
        this.f = new a(a2, extendedCommunityProfile);
        return a2;
    }

    /* compiled from: CommunityProfilePostingItemPresenterDelegate.kt */
    public static final class b implements sjg {
        public final String b;

        public b(ExtendedCommunityProfile extendedCommunityProfile) {
            this.b = "club" + bwd0.i(extendedCommunityProfile).b;
        }

        @Override // xsna.sjg
        public final String getRef() {
            return this.b;
        }

        @Override // xsna.sjg
        public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        }
    }
}
