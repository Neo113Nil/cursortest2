package xsna;

import com.vk.dto.common.data.PrivacySetting;
import java.util.List;

/* compiled from: PrivacySettingView.kt */
/* loaded from: classes5.dex */
public final class ned0 {
    public final a a;
    public final PrivacySetting b;
    public final String c;
    public final int d;

    /* compiled from: PrivacySettingView.kt */
    public static final class a {
        public final List<String> a;
        public final int b;

        public a(List<String> list, int i) {
            this.a = list;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FriendsData(photosUrls=");
            sb.append(this.a);
            sb.append(", totalCount=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public ned0(a aVar, PrivacySetting privacySetting, String str, int i) {
        this.a = aVar;
        this.b = privacySetting;
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ned0)) {
            return false;
        }
        ned0 ned0Var = (ned0) obj;
        return epx.f(this.a, ned0Var.a) && epx.f(this.b, ned0Var.b) && epx.f(this.c, ned0Var.c) && this.d == ned0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacySettingViewData(friendsData=");
        sb.append(this.a);
        sb.append(", ps=");
        sb.append(this.b);
        sb.append(", privacyDisplayString=");
        sb.append(this.c);
        sb.append(", reqCode=");
        return vu5.b(sb, this.d, ')');
    }
}
