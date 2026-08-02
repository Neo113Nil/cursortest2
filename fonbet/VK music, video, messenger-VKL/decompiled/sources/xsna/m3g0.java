package xsna;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.X3;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.common.util.CommentDraft;
import com.vk.sharing.api.dto.Target;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;

/* compiled from: ReplyBarPresenter.kt */
/* loaded from: classes4.dex */
public final class m3g0 implements cc6, l420, lk5, w8i {
    public static final Regex r = new Regex("^\\s*" + hd60.a().l() + ",\\s?");
    public final b3g0 b;
    public final u3g0 c;
    public final g420 d;
    public final Object e;
    public final Object f;
    public NewsComment g;
    public int h;
    public String i;
    public String j;
    public UserId k;
    public n3g0 l;
    public final CommentDraft m;
    public boolean n;
    public final oo6 o;
    public io.reactivex.rxjava3.disposables.c p;
    public String q;

    /* JADX WARN: Multi-variable type inference failed */
    public m3g0(b3g0 b3g0Var, u3g0 u3g0Var, g420 g420Var) {
        this.b = b3g0Var;
        this.c = u3g0Var;
        this.d = g420Var;
        fyd0 fyd0Var = new fyd0(this, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, fyd0Var);
        this.f = msy.a(lazyThreadSafetyMode, new yqd0(this, 2));
        this.h = -1;
        this.k = UserId.d;
        this.m = new CommentDraft(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.o = new oo6(this, 7);
    }

    public static String z(UserId userId, String str) {
        StringBuilder sb = new StringBuilder(X3.j.d);
        sb.append(fkq0.b(userId) ? "club" : "id");
        sb.append(fkq0.a(userId).b);
        sb.append('|');
        sb.append(str);
        sb.append("], ");
        return sb.toString();
    }

    public final void D0(Attachment attachment, boolean z) {
        h1("", Collections.singletonList(attachment), z, false);
    }

    public final void I1() {
        t6g0 t6g0Var = t6g0.b;
        gxh b = t6g0.b();
        b3g0 b3g0Var = this.b;
        Group C0 = b.C0(fkq0.e(b3g0Var.p()));
        if (C0 != null) {
            UserId userId = C0.c;
            if (!fkq0.b(userId)) {
                userId = null;
            }
            if (userId == null) {
                userId = fkq0.e(C0.c);
            }
            this.k = userId;
            n3g0 n3g0Var = this.l;
            if (n3g0Var != null) {
                Group C02 = t6g0.b().C0(fkq0.a(this.k));
                n3g0Var.e(C02 != null ? C02.d : null);
            }
            b3g0Var.b(C0.e);
            S1();
        }
    }

    @Override // xsna.l420
    public final void N3(UserId userId) {
        io.reactivex.rxjava3.core.q L = wmi0.a.e("mentionProfiles").L(new ai3(new com.vk.newsfeed.impl.util.a(userId), 27), false);
        m1r m1rVar = new m1r(this, 22);
        int i = kwg0.a;
        L.subscribe(m1rVar, new iwg0());
    }

    public final void S1() {
        if (this.n) {
            pro0.d(this.o);
            if (d0()) {
                x();
                ce60.b.getClass();
                p870.f().e(123, Z());
                return;
            }
            wmi0 wmi0Var = wmi0.a;
            String Z = Z();
            CommentDraft commentDraft = this.m;
            NewsComment newsComment = commentDraft.b;
            u3g0 u3g0Var = this.c;
            newsComment.b = u3g0Var.getText().toString();
            NewsComment newsComment2 = commentDraft.b;
            newsComment2.J = new ArrayList<>(u3g0Var.f());
            newsComment2.k = this.h;
            Bundle bundle = new Bundle();
            h0(bundle);
            commentDraft.c = bundle;
            s3q0 s3q0Var = s3q0.a;
            wmi0Var.a(Z, commentDraft);
            ce60.b.getClass();
            p870.f().e(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Z());
        }
    }

    @Override // xsna.l420
    public final void Y0() {
        g420 g420Var = this.d;
        if (g420Var != null) {
            g420Var.hide();
        }
    }

    public final String Z() {
        return "comments:draft:" + this.b.Y0();
    }

    @Override // xsna.lk5
    public final String b() {
        CharSequence text = this.c.getText();
        String str = this.j;
        if (str != null && str.length() != 0) {
            Regex regex = r;
            if (regex.a(text)) {
                return drm0.p0(regex.g(text, "")).toString();
            }
        }
        return text.toString();
    }

    public final boolean d0() {
        u3g0 u3g0Var = this.c;
        if (!drm0.N(u3g0Var.i())) {
            return false;
        }
        List<Attachment> f = u3g0Var.f();
        return f == null || f.isEmpty();
    }

    public final boolean e0() {
        return this.h != -1;
    }

    public final void f0(Target target) {
        String str = target.f;
        WriteBar writeBar = this.c.e;
        if (writeBar != null) {
            writeBar.D.c(null);
        }
        boolean z = target.k;
        b3g0 b3g0Var = this.b;
        if (z) {
            this.k = UserId.d;
            n3g0 n3g0Var = this.l;
            if (n3g0Var != null) {
                n3g0Var.c();
            }
            b3g0Var.b(str);
        } else {
            this.k = target.c;
            n3g0 n3g0Var2 = this.l;
            if (n3g0Var2 != null) {
                n3g0Var2.e(target.d);
            }
            b3g0Var.b(str);
        }
        S1();
    }

    public final boolean g() {
        WriteBar writeBar = this.c.e;
        boolean z = false;
        if (writeBar != null && writeBar.D.k != null) {
            z = true;
        }
        return !z;
    }

    public final void g0(Bundle bundle) {
        this.g = (NewsComment) bundle.getParcelable("state_reply_parent");
        this.h = bundle.getInt("state_reply_to_comment_id", -1);
        this.i = bundle.getString("state_reply_to_rname");
        this.j = bundle.getString("state_reply_to_name");
        n3g0 n3g0Var = this.l;
        if (n3g0Var != null) {
            n3g0Var.l(this.i);
        }
        UserId userId = (UserId) bundle.getParcelable("state_reply_from_group_id");
        if (userId == null || !fkq0.c(userId)) {
            return;
        }
        b3g0 b3g0Var = this.b;
        if (!b3g0Var.f0() || userId.equals(b3g0Var.p())) {
            t6g0 t6g0Var = t6g0.b;
            Group C0 = t6g0.b().C0(fkq0.a(userId));
            String str = C0 != null ? C0.d : null;
            if (str != null) {
                this.k = userId;
                n3g0 n3g0Var2 = this.l;
                if (n3g0Var2 != null) {
                    n3g0Var2.e(str);
                }
            }
            b3g0Var.b(C0 != null ? C0.e : null);
        }
    }

    public final void h0(Bundle bundle) {
        bundle.putParcelable("state_reply_parent", this.g);
        bundle.putInt("state_reply_to_comment_id", this.h);
        bundle.putString("state_reply_to_rname", this.i);
        bundle.putString("state_reply_to_name", this.j);
        bundle.putParcelable("state_reply_from_group_id", this.k);
    }

    public final void h1(String str, List<? extends Attachment> list, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str) && list.isEmpty()) {
            return;
        }
        if (str.length() > 16384) {
            cvk.u(R.string.newsfeed_newpost_long_text, false);
            return;
        }
        this.b.u0(str, this.h, list, this.k, z, z2);
    }

    public final void i0(NewsComment newsComment) {
        p0(newsComment, false, true);
    }

    public final void i1(boolean z, boolean z2) {
        u3g0 u3g0Var = this.c;
        String obj = u3g0Var.getText().toString();
        int length = obj.length() - 1;
        int i = 0;
        boolean z3 = false;
        while (i <= length) {
            boolean z4 = epx.g(obj.charAt(!z3 ? i : length), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                } else {
                    length--;
                }
            } else if (z4) {
                i++;
            } else {
                z3 = true;
            }
        }
        h1(obj.subSequence(i, length + 1).toString(), u3g0Var.f(), z, z2);
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    public final void p0(NewsComment newsComment, boolean z, boolean z2) {
        String str;
        String obj;
        z0y0 z0y0Var;
        u3g0 u3g0Var = this.c;
        WriteBar writeBar = u3g0Var.e;
        if (writeBar != null) {
            y0y0 y0y0Var = writeBar.D;
            if (y0y0Var.c(null) && (z0y0Var = y0y0Var.d) != null) {
                y0y0Var.c.getInputState();
                z0y0Var.a(false, true);
            }
        }
        u0();
        this.g = newsComment;
        this.h = newsComment.i;
        this.i = newsComment.d;
        if (newsComment.s) {
            str = "";
        } else if (fkq0.b(newsComment.j)) {
            str = newsComment.c;
        } else {
            String str2 = newsComment.c;
            str = (str2 == null || (obj = drm0.p0(str2).toString()) == null) ? null : (String) j5g.a0(new Regex("\\s+").j(0, obj));
        }
        this.j = str;
        if (z) {
            I1();
        }
        if (z2) {
            n3g0 n3g0Var = this.l;
            if (n3g0Var != null) {
                n3g0Var.l(this.i);
            }
            CharSequence text = u3g0Var.getText();
            String str3 = this.j;
            if (str3 != null && str3.length() != 0) {
                Regex regex = r;
                if (regex.a(text)) {
                    u3g0Var.y(regex.g(text, z(newsComment.j, this.j)));
                } else if (((String) text).length() == 0) {
                    String z3 = z(newsComment.j, this.j);
                    if (this.n) {
                        u3g0Var.y(z3);
                    } else {
                        this.q = z3;
                    }
                }
            }
        }
        if (this.b.Z()) {
            c3g0.gg(u3g0Var, null, 1);
        }
        S1();
    }

    public final void r1() {
        if (this.b.g0()) {
            I1();
            return;
        }
        n3g0 n3g0Var = this.l;
        if (n3g0Var != null) {
            n3g0Var.c();
        }
    }

    public final void u0() {
        if (this.j != null) {
            u3g0 u3g0Var = this.c;
            if (u3g0Var.i().equals(this.j + ", ")) {
                u3g0Var.y("");
            }
        }
        n3g0 n3g0Var = this.l;
        if (n3g0Var != null) {
            n3g0Var.h();
        }
        this.g = null;
        this.h = -1;
        this.i = null;
        this.j = null;
        this.b.s2();
        S1();
    }

    public final void x() {
        wmi0.a.c(Z());
    }

    @Override // xsna.l420
    public final void x0(String str) {
        g420 g420Var = this.d;
        if (g420Var != null) {
            g420Var.j(str);
        }
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }
}
