package xsna;

import com.vk.voip.ui.onboarding.features.FeatureId;
import java.util.List;

/* compiled from: CallOnboardingViewModel.kt */
/* loaded from: classes7.dex */
public final class t69 {
    public final boolean a;
    public final List<a> b;

    /* compiled from: CallOnboardingViewModel.kt */
    public static abstract class a implements hfz {
        public final FeatureId b;
        public final boolean c;

        /* compiled from: CallOnboardingViewModel.kt */
        /* renamed from: xsna.t69$a$a, reason: collision with other inner class name */
        public static final class C3724a extends a {
            public final int d;
            public final int e;
            public final Integer f;
            public final Integer g;
            public final int h;
            public final int i;

            public C3724a(FeatureId featureId, int i, int i2, Integer num, boolean z, Integer num2, int i3, int i4) {
                super(featureId, z);
                this.d = i;
                this.e = i2;
                this.f = num;
                this.g = num2;
                this.h = i3;
                this.i = i4;
            }

            @Override // xsna.t69.a, xsna.hfz
            public final Number getItemId() {
                return Integer.valueOf(this.b.ordinal());
            }
        }

        /* compiled from: CallOnboardingViewModel.kt */
        public static final class b extends a {
            public final List<b69> d;

            public b(List<b69> list, FeatureId featureId, boolean z) {
                super(featureId, z);
                this.d = list;
            }

            @Override // xsna.t69.a, xsna.hfz
            public final Number getItemId() {
                return Integer.valueOf(this.b.ordinal());
            }
        }

        public a(FeatureId featureId, boolean z) {
            this.b = featureId;
            this.c = z;
        }

        @Override // xsna.hfz
        public Number getItemId() {
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t69(boolean z, List<? extends a> list) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t69)) {
            return false;
        }
        t69 t69Var = (t69) obj;
        return this.a == t69Var.a && epx.f(this.b, t69Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallOnboardingViewModel(isVisible=");
        sb.append(this.a);
        sb.append(", items=");
        return ms9.a(')', sb, this.b);
    }
}
