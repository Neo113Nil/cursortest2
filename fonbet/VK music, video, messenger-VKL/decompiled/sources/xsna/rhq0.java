package xsna;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.vk.common.links.LinksParserData;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RelativeProfile;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import xsna.if6;

/* compiled from: UserDetailsItemsFactory.kt */
/* loaded from: classes5.dex */
public final class rhq0 extends if6<ExtendedUserProfile> {
    public final b25 c;
    public final qdz d;
    public final jhq0 e;
    public final m5o0 f;
    public final if6<ExtendedUserProfile>.f g;
    public final if6<ExtendedUserProfile>.f h;
    public final if6<ExtendedUserProfile>.f i;
    public final if6<ExtendedUserProfile>.f j;
    public final if6<ExtendedUserProfile>.f k;
    public final if6<ExtendedUserProfile>.f l;
    public final if6<ExtendedUserProfile>.f m;
    public final if6<ExtendedUserProfile>.f n;
    public final if6<ExtendedUserProfile>.f o;
    public final if6<ExtendedUserProfile>.f p;

    public rhq0(FragmentActivity fragmentActivity, b25 b25Var, qdz qdzVar, jhq0 jhq0Var, m5o0 m5o0Var) {
        super(fragmentActivity);
        this.c = b25Var;
        this.d = qdzVar;
        this.e = jhq0Var;
        this.f = m5o0Var;
        this.g = new if6.f(new u5p0(this, 2));
        this.h = new if6.f(new lfa(22, fragmentActivity, this));
        this.i = new if6.f(new ohq0(0, this, fragmentActivity));
        this.j = new if6.f(new dnh0(8, this, fragmentActivity));
        this.k = new if6.f(new yyl0(this, 7));
        this.l = new if6.f(new defpackage.v(27, this, fragmentActivity));
        this.m = new if6.f(new nm1(29, this, fragmentActivity));
        this.n = new if6.f(new quz(this, 25));
        this.o = new if6.f(new fyi0(this));
        this.p = new if6.f(new s1f0(4, fragmentActivity, this));
    }

    public static final boolean c(rhq0 rhq0Var) {
        rhq0Var.getClass();
        return "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER);
    }

    @Override // xsna.if6
    public final if6<ExtendedUserProfile>.c[] a(ExtendedUserProfile extendedUserProfile) {
        return (if6.c[]) rl3.I(new if6.c[]{new if6.c(this.g), new if6.c(this.h), new if6.c(this.i), new if6.c(this.j), new if6.c(this.k), new if6.c(this.l), new if6.c(this.m), new if6.c(this.n), new if6.c(this.o), new if6.c(this.p)}).toArray(new if6.c[0]);
    }

    public final x4m d(RelativeProfile[] relativeProfileArr, int i, int i2, int i3) {
        RelativeProfile relativeProfile = (RelativeProfile) rl3.O(relativeProfileArr);
        UserProfile userProfile = relativeProfile != null ? relativeProfile.d : null;
        if ((relativeProfileArr.length > 1 || userProfile == null) || userProfile == null) {
            i = i3;
        } else if (!userProfile.K().booleanValue()) {
            i = i2;
        }
        ArrayList arrayList = new ArrayList();
        for (RelativeProfile relativeProfile2 : relativeProfileArr) {
            UserProfile userProfile2 = relativeProfile2.d;
            UserId userId = relativeProfile2.b;
            String str = userProfile2 != null ? userProfile2.e : null;
            String str2 = relativeProfile2.c;
            if (fkq0.d(userId) && str != null && str.length() != 0) {
                arrayList.add("[id" + userId.b + '|' + str + ']');
            } else if (str != null && str.length() != 0) {
                arrayList.add(str);
            } else if (str2 != null && str2.length() != 0) {
                arrayList.add(str2);
            }
        }
        return new x4m(i, this.d.a().m(arrayList.size() == 2 ? ((String) arrayList.get(0)) + ' ' + this.b.getString(R.string.ntf_two_users_c) + ' ' + ((String) arrayList.get(1)) : TextUtils.join(", ", arrayList)));
    }

    public final CharSequence e(String str) {
        return this.d.a().d(str, new LinksParserData(2939, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382));
    }
}
