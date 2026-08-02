package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.preference.Preference;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.inappreview.InAppReviewConditionKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import xsna.fzu0;
import xsna.rrw;

/* compiled from: VKSuperAppGameFragment.kt */
/* loaded from: classes6.dex */
public final class ggr0 extends hgr0 {
    public static final /* synthetic */ int c0 = 0;
    public boolean a0;
    public String b0;

    @Override // com.vk.superapp.browser.ui.a
    public final void Cn() {
        super.Cn();
        ((fzu0.a) yn()).m(this.b0);
        WebApiApplication v = ((fzu0.a) yn()).v();
        if (v != null) {
            q7n0.a().f().a(v);
        }
    }

    @Override // com.vk.superapp.browser.ui.a
    public final tpn0 Fn(Fragment fragment) {
        if (oen.b(kn())) {
            return new tpn0(fragment);
        }
        return null;
    }

    @Override // com.vk.superapp.browser.ui.a
    public final v1w0 Gn(Context context) {
        return new kwv0(context, this.B, this.A, this.l);
    }

    @Override // xsna.hgr0
    public final void Kn() {
        if (rrw.b) {
            bpn0 bpn0Var = rrw.a;
            ArrayList arrayList = ((rrw.b) bpn0Var.getValue()).a;
            xuo0 xuo0Var = xuo0.a;
            xuo0Var.getClass();
            int i = 0;
            arrayList.add(0, Long.valueOf(xuo0.a()));
            if (arrayList.size() > 3) {
                arrayList.remove(3);
            }
            Preference.J("vk_in_app_review_trigger_controller", "vk_games_3_last_close", (Long[]) arrayList.toArray(new Long[0]));
            rrw.b bVar = (rrw.b) bpn0Var.getValue();
            bVar.getClass();
            xuo0Var.getClass();
            long a = xuo0.a();
            long a2 = xuo0.a() - TimeUnit.DAYS.toMillis(1L);
            Iterator it = bVar.a.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                if (a2 <= longValue && longValue <= a) {
                    i++;
                }
            }
            if (i == 3) {
                io.reactivex.rxjava3.disposables.c cVar = rrw.c;
                if (cVar != null) {
                    cVar.dispose();
                }
                rrw.c = io.reactivex.rxjava3.core.a.s(3L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.a.a()).c(fsk.c.b(InAppReviewConditionKey.LOAD_3_MORE_GAMES, jgp.b)).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new qrw());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Ln(Integer num) {
        int i;
        FragmentActivity activity;
        Context context = this.M;
        if (context == null || isDetached()) {
            return;
        }
        int i2 = context.getResources().getConfiguration().orientation;
        int i3 = -1;
        int i4 = i2 != 1 ? i2 != 2 ? -1 : 0 : 1;
        if (num == null) {
            WebApiApplication m = yn().b.m();
            num = m != null ? Integer.valueOf(m.v) : null;
            if (num == null) {
                i = 0;
                if (i != 1) {
                    i3 = 0;
                } else if (i == 2) {
                    i3 = 1;
                }
                if (i4 != i3 || (activity = getActivity()) == null) {
                }
                try {
                    activity.setRequestedOrientation(i3);
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        i = num.intValue();
        if (i != 1) {
        }
        if (i4 != i3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hgr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Ma(String str) {
        Uri uri;
        boolean z;
        Context context;
        if (!str.equals(vn().d.l()) && !yn().o) {
            try {
                uri = Uri.parse(str);
            } catch (Throwable unused) {
                uri = null;
            }
            if (uri != null) {
                String host = uri.getHost();
                if (host != null) {
                    if (((Regex) laz.n.getValue()).f(host.toLowerCase(Locale.getDefault()))) {
                        z = true;
                        boolean P = ((fzu0.a) yn()).P();
                        Ln(null);
                        ((fzu0.a) yn()).b0(z);
                        Uri parse = Uri.parse(xwk.d().e().h(uri.toString()));
                        if (!z && !P && naz.j(parse)) {
                            context = this.M;
                            if (context != null) {
                                xwk.d().e().a(context, str);
                            }
                            return true;
                        }
                    }
                }
                z = false;
                boolean P2 = ((fzu0.a) yn()).P();
                Ln(null);
                ((fzu0.a) yn()).b0(z);
                Uri parse2 = Uri.parse(xwk.d().e().h(uri.toString()));
                if (!z) {
                    context = this.M;
                    if (context != null) {
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.vk.superapp.browser.ui.a, xsna.cb80
    public final void Sm(int i) {
        Ln(Integer.valueOf(i));
    }

    @Override // com.vk.superapp.browser.ui.a
    public final boolean a0() {
        ggu0 vn = vn();
        if (vn.v() && vn.e.h() && vn.l().a()) {
            return super.a0();
        }
        if (vn().d.C()) {
            return true;
        }
        if (this.a0) {
            return false;
        }
        vn().x(new pwh0(this, 18));
        return true;
    }

    @Override // xsna.hgr0, com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.b0 = arguments != null ? arguments.getString("track_code") : null;
    }
}
