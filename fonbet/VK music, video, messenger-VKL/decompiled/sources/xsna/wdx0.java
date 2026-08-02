package xsna;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.main.AuthActivity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.superapp.bridges.LogoutReason;
import kotlin.LazyThreadSafetyMode;
import xsna.egn0;

/* compiled from: WebAppAuthBridge.kt */
/* loaded from: classes11.dex */
public final class wdx0 implements egn0, w8i {
    public static final wdx0 b = new wdx0();
    public static final Object c = msy.a(LazyThreadSafetyMode.NONE, new u35(21));
    public static final bpn0 d = new bpn0(new w0f(19));

    /* compiled from: WebAppAuthBridge.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogoutReason.values().length];
            try {
                iArr[LogoutReason.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogoutReason.USER_BANNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogoutReason.USER_DEACTIVATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogoutReason.VK_UI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogoutReason.PHONE_VALIDATION_DECLINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LogoutReason.MULTIACCOUNT_LOGOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LogoutReason.DROP_ACCOUNT_TAP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: WebAppAuthBridge.kt */
    /* loaded from: classes7.dex */
    public static final class b implements egn0.b {
        public final boolean a;

        public b() {
            wdx0 wdx0Var = wdx0.b;
            this.a = wdx0.d().i().y;
        }

        @Override // xsna.egn0.b
        public final boolean a() {
            return this.a;
        }

        @Override // xsna.egn0.b
        public final String j() {
            wdx0 wdx0Var = wdx0.b;
            return wdx0.d().i().A;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static b25 d() {
        return (b25) c.getValue();
    }

    @Override // xsna.egn0
    public final void a(LogoutReason logoutReason, UserId userId, boolean z) {
        String str;
        switch (a.$EnumSwitchMapping$0[logoutReason.ordinal()]) {
            case 2:
                str = "banned";
                break;
            case 3:
                str = "user_deactivated";
                break;
            case 4:
                str = "vk_ui";
                break;
            case 5:
                str = "phone_validation_declined";
                break;
            case 6:
                str = "multiaccount_logout";
                break;
            case 7:
                str = "drop_account_tap";
                break;
            default:
                str = "user";
                break;
        }
        d().O(new t200(104, userId, str, null, true, z, false));
    }

    public final int b() {
        return UserProfile.e(d().o().b());
    }

    @Override // xsna.egn0
    public final w25 c() {
        String h = d().h();
        UserId c2 = d().c();
        d().getClass();
        return new w25(d().I(), d().r(), d().v(), c2, h, "");
    }

    public final String e() {
        return d().o().c;
    }

    public final String f() {
        return d().o().b;
    }

    public final String g() {
        return d().o().f;
    }

    public final egn0.b h() {
        return (egn0.b) d.getValue();
    }

    public final long i() {
        return d().c().b;
    }

    public final boolean j() {
        return d().o().d == UserSex.FEMALE;
    }

    public final boolean k() {
        return d().b();
    }

    public final void l(FragmentActivity fragmentActivity) {
        r55 r55Var = r55.a;
        r55.b();
        fragmentActivity.startActivity(new Intent(fragmentActivity, (Class<?>) AuthActivity.class));
    }
}
