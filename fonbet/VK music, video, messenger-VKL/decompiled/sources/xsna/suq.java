package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: FeatureOnboarding.kt */
/* loaded from: classes7.dex */
public final class suq {
    public final FeatureId a;
    public final boolean b;
    public final c c;

    /* compiled from: FeatureOnboarding.kt */
    public static final class a {
        public static void a(FeatureId featureId, UserId userId) {
            pla.e().b().b(featureId.h());
            SharedPreferences e = Preference.e(userId.b, featureId.h());
            Boolean bool = Boolean.TRUE;
            qaj0.c(e, "banner_disposed", bool);
            qaj0.c(Preference.e(userId.b, featureId.h()), "feature_used", bool);
        }
    }

    /* compiled from: FeatureOnboarding.kt */
    public static class b {
        public final FeatureId a;
        public final td8 b;

        public b(FeatureId featureId, td8 td8Var) {
            this.a = featureId;
            this.b = td8Var;
            if (pla.e().b().a(featureId.h())) {
                UserId userId = (UserId) td8Var.invoke();
                SharedPreferences e = Preference.e(userId.b, featureId.h());
                Boolean bool = Boolean.FALSE;
                qaj0.c(e, "banner_disposed", bool);
                UserId userId2 = (UserId) td8Var.invoke();
                qaj0.c(Preference.e(userId2.b, featureId.h()), "feature_used", bool);
            }
        }

        public final boolean a(FeatureId featureId) {
            UserId userId = (UserId) this.b.invoke();
            return Preference.e(userId.b, featureId.h()).getBoolean("banner_disposed", false);
        }
    }

    public suq(FeatureId featureId, boolean z, c cVar) {
        this.a = featureId;
        this.b = z;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suq)) {
            return false;
        }
        suq suqVar = (suq) obj;
        return this.a == suqVar.a && this.b == suqVar.b && epx.f(this.c, suqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "FeatureOnboarding(id=" + this.a + ", isDismissed=" + this.b + ", uiInfo=" + this.c + ')';
    }

    /* compiled from: FeatureOnboarding.kt */
    public interface c {

        /* compiled from: FeatureOnboarding.kt */
        public static final class b implements c {
            public final List<b69> a;

            public b(List<b69> list) {
                this.a = list;
            }
        }

        /* compiled from: FeatureOnboarding.kt */
        public static final class a implements c {
            public final int a;
            public final int b;
            public final Integer c;
            public final Integer d;
            public final int e;
            public final int f;

            public a(int i, int i2, int i3, int i4, Integer num, Integer num2) {
                this.a = i;
                this.b = i2;
                this.c = num;
                this.d = num2;
                this.e = i3;
                this.f = i4;
            }

            public /* synthetic */ a(int i, int i2, int i3, Integer num) {
                this(i, i2, R.color.vk_azure_A400, R.color.vk_azure_A400, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : Integer.valueOf(R.drawable.gradient_violet));
            }
        }
    }
}
