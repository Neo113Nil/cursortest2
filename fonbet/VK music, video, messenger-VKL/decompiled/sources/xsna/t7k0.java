package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.SocialButtonType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.ikv0;
import xsna.r7k0;

/* compiled from: SnackbarEventsDelegate.kt */
/* loaded from: classes16.dex */
public final class t7k0 {
    public final MobileOfficialAppsCoreNavStat$EventScreen a;
    public final zvm0 b;
    public final lss<fss> c;
    public final Context d;

    /* compiled from: SnackbarEventsDelegate.kt */
    public interface a {

        /* compiled from: SnackbarEventsDelegate.kt */
        /* renamed from: xsna.t7k0$a$a, reason: collision with other inner class name */
        public static final class C3726a implements a {
            public final int a;

            public C3726a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3726a) && this.a == ((C3726a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("FromRes(messageRes="), this.a, ')');
            }
        }

        /* compiled from: SnackbarEventsDelegate.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("FromTitle(title="), this.a, ')');
            }
        }
    }

    public t7k0(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, zvm0 zvm0Var, lss<fss> lssVar) {
        this.a = mobileOfficialAppsCoreNavStat$EventScreen;
        this.b = zvm0Var;
        this.c = lssVar;
        int i = vps.$EnumSwitchMapping$0[mobileOfficialAppsCoreNavStat$EventScreen.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            int i2 = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        } else if (i == 5) {
            int i3 = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen2 = LegoCustomRedesignedScreen.EXAMPLE;
        }
        this.d = context;
    }

    public final void a(r7k0.a aVar, RequestUserProfile requestUserProfile) {
        if (aVar.equals(r7k0.a.d.a)) {
            zvm0.k(this.b, this.d, null, true, requestUserProfile.z, 2);
            return;
        }
        if (aVar.equals(r7k0.a.e.a)) {
            d(new a.C3726a(R.string.suggest_declined), requestUserProfile, aVar);
            return;
        }
        boolean equals = aVar.equals(r7k0.a.c.a);
        Context context = this.d;
        if (equals) {
            c(requestUserProfile, context.getString(R.string.request_sent));
        } else if (aVar.equals(r7k0.a.b.a)) {
            c(requestUserProfile, context.getString(R.string.request_snackbar_accepted));
        } else {
            if (!aVar.equals(r7k0.a.C3598a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d(new a.C3726a(R.string.request_follower_deleted), requestUserProfile, aVar);
        }
    }

    public final void b(r7k0 r7k0Var, RequestUserProfile requestUserProfile, hss hssVar) {
        if (hssVar.I()) {
            return;
        }
        if (r7k0Var instanceof r7k0.a) {
            a((r7k0.a) r7k0Var, requestUserProfile);
            return;
        }
        if (!(r7k0Var instanceof r7k0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z = requestUserProfile.e0 == SocialButtonType.FOLLOW && !(requestUserProfile.v == 3);
        if (z) {
            zvm0.k(this.b, this.d, null, true, requestUserProfile.z, 2);
        } else if (requestUserProfile.z || requestUserProfile.j) {
            a(z ? r7k0.a.d.a : requestUserProfile.j ? r7k0.a.b.a : r7k0.a.c.a, requestUserProfile);
        } else {
            zvm0.k(this.b, this.d, null, false, false, 10);
        }
    }

    public final void c(RequestUserProfile requestUserProfile, String str) {
        int i = vps.$EnumSwitchMapping$0[this.a.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            int i2 = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        } else if (i == 5) {
            int i3 = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen2 = LegoCustomRedesignedScreen.EXAMPLE;
        }
        d(new a.b(str), requestUserProfile, null);
    }

    public final void d(a aVar, RequestUserProfile requestUserProfile, r7k0.a aVar2) {
        String str;
        boolean z = aVar instanceof a.C3726a;
        Context context = this.d;
        if (z) {
            str = context.getString(((a.C3726a) aVar).a);
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((a.b) aVar).a;
        }
        ikv0.a aVar3 = new ikv0.a(context);
        Integer num = null;
        aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) null, 14);
        aVar3.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        if (epx.f(aVar2, r7k0.a.e.a)) {
            num = Integer.valueOf(R.string.report_send);
        } else if (!epx.f(aVar2, r7k0.a.C3598a.a) && requestUserProfile.d()) {
            num = Integer.valueOf(R.string.request_new_message);
        }
        if (num != null) {
            aVar3.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(num.intValue()), new fv90(new d66(aVar2, this, requestUserProfile, 4), 26));
        }
        aVar3.n();
    }
}
