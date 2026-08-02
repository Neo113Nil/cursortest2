package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.nfd0;
import xsna.tzp0;

/* compiled from: LivesPrivacyBottomSheet.kt */
/* loaded from: classes17.dex */
public final class doz extends tij {
    public final int A;
    public final int B;
    public final int C;
    public final nfd0 D;
    public final FriendsListPrivacyType E;
    public final String u;
    public final PrivacySetting v;
    public final String w;
    public final int x;
    public final int y;
    public final int z;

    public doz(l7s l7sVar, String str, PrivacySetting privacySetting, ito0 ito0Var, ew3 ew3Var, tzp0.c.a aVar) {
        super(l7sVar, ito0Var, ew3Var, aVar);
        this.u = str;
        this.v = privacySetting;
        this.w = "LivesPrivacyBottomSheet";
        boolean f = epx.f(str, "lives");
        this.x = R.string.privacy_bottomsheet_title;
        this.y = f ? R.string.privacy_lives_allowed_group_title : R.string.privacy_comments_lives_allowed_group_title;
        this.z = f ? R.string.privacy_lives_forbidden_group_title : R.string.privacy_comments_lives_forbidden_group_title;
        this.A = R.string.privacy_lives_closed_account_card_description;
        this.B = R.string.privacy_lives_closed_account_dialog_title;
        this.C = R.string.privacy_lives_closed_account_dialog_message;
        this.D = new nfd0();
        this.E = FriendsListPrivacyType.LIVE;
    }

    @Override // xsna.tij
    public final int U0() {
        return this.A;
    }

    @Override // xsna.tij
    public final int V0() {
        return this.C;
    }

    @Override // xsna.tij
    public final int W0() {
        return this.B;
    }

    @Override // xsna.tij
    public final int X0() {
        return this.y;
    }

    @Override // xsna.tij
    public final FriendsListPrivacyType Y0() {
        return this.E;
    }

    @Override // xsna.tij
    public final nfd0 Z0() {
        return this.D;
    }

    @Override // xsna.tij
    public final int a1() {
        return this.z;
    }

    @Override // xsna.tij
    public final String b1() {
        return this.w;
    }

    @Override // xsna.tij
    public final int c1() {
        return this.x;
    }

    @Override // xsna.tij
    public final void e1() {
        dw20 dw20Var;
        d9j d9jVar = new d9j(this, 22);
        PrivacySetting privacySetting = this.v;
        io.reactivex.rxjava3.disposables.c subscribe = (privacySetting != null ? io.reactivex.rxjava3.core.q.T(privacySetting) : rsg0.y0(new io(false), null, null, 3).U(new v34(new ayo(this, 15), 9))).subscribe(new xz(new s53(22, d9jVar, this), 29), new k41(new cvh(this, 17), 26));
        WeakReference<dw20> weakReference = this.j;
        if (weakReference == null || (dw20Var = weakReference.get()) == null) {
            return;
        }
        hg1.a(subscribe, dw20Var);
    }

    @Override // xsna.tij
    public final void i1() {
        PrivacySetting c = this.D.c();
        String str = this.u;
        c.b = str;
        hs hsVar = new hs(str, c.zb(), 0);
        hsVar.k = true;
        hsVar.p();
        this.f.invoke(c);
        d1();
    }

    @Override // xsna.tij
    public final void n1() {
        nfd0 nfd0Var = this.D;
        nfd0.b bVar = nfd0Var.e;
        PrivacySetting.PrivacyRule privacyRule = bVar != null ? bVar.c : null;
        PrivacyRules.PredefinedSet predefinedSet = PrivacyRules.a;
        boolean f = epx.f(privacyRule, PrivacyRules.b);
        View view = this.n;
        if (view != null) {
            view.setAlpha(f ? 0.4f : 1.0f);
        }
        ViewGroup viewGroup = this.m;
        if (viewGroup != null) {
            viewGroup.setAlpha(f ? 0.4f : 1.0f);
        }
        ViewGroup viewGroup2 = this.m;
        if (viewGroup2 != null) {
            for (int i = 0; i < viewGroup2.getChildCount(); i++) {
                viewGroup2.getChildAt(i).setClickable(!f);
            }
        }
        if (f) {
            nfd0Var.f = null;
        }
        super.n1();
    }
}
