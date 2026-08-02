package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.dto.common.id.UserId;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeMultiaccountsItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.a;
import com.vk.superapp.multiaccount.api.analytics.VkAnalyticsUserType;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.trustedhash.di.TrustedHashComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: AuthAnalyticsCompletedDelegate.kt */
/* loaded from: classes15.dex */
public final class p15 implements w8i {
    public static final List<SchemeStatSak$TypeRegistrationItem.EventType> j = e43.l(SchemeStatSak$TypeRegistrationItem.EventType.AUTH_SILENT, SchemeStatSak$TypeRegistrationItem.EventType.AUTH_FAST_SILENT);
    public final AuthResult b;
    public final boolean c;
    public final String d;
    public final com.vk.superapp.multiaccount.api.a e = ((MultiAccountComponent) ((k7m) m7m.f(this)).a(fpf0.a(MultiAccountComponent.class))).d();
    public final mui0 f = ((SessionManagementComponent) ((k7m) m7m.f(this)).a(fpf0.a(SessionManagementComponent.class))).J2();
    public final hsp0 g = ((TrustedHashComponent) ((k7m) m7m.f(this)).a(fpf0.a(TrustedHashComponent.class))).c();
    public final SchemeStatSak$TypeRegistrationItem.EventType h;
    public final ArrayList<SchemeStatSak$RegistrationFieldItem> i;

    /* compiled from: AuthAnalyticsCompletedDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SilentAuthSource.values().length];
            try {
                iArr[SilentAuthSource.FAST_LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SilentAuthSource.SILENT_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SilentAuthSource.BY_GRAY_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SilentAuthSource.BY_LOGIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SilentAuthSource.BY_OAUTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SilentAuthSource.ADDITIONAL_OAUTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SilentAuthSource.REGISTRATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SilentAuthSource.BUTTON.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SilentAuthSource.INTERNAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SilentAuthSource.BY_PHONE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SilentAuthSource.BY_EMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SilentAuthSource.BY_ECOSYSTEM_PUSH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SilentAuthSource.BY_PASSKEY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SilentAuthSource.AUTOLOGIN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SilentAuthSource.QR_APP_TO_APP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SilentAuthSource.QR_WEB_TO_APP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SilentAuthSource.BY_MAX_MESSENGER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SilentAuthSource.BY_OFFICIAL_MESSENGER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[SilentAuthSource.BY_WHITE_LINK.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[SilentAuthSource.BY_VKID.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[SilentAuthSource.BY_MAX_CODE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AuthAnalyticsCompletedDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    /* compiled from: AuthAnalyticsCompletedDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(1:3)(1:84)|4|(1:6)(1:83)|7|12|(1:14)(1:62)|(1:16)|17|(4:19|(2:21|(2:23|(2:25|(1:31)))(3:32|(1:34)|35))(5:36|(1:38)(1:43)|39|(1:41)|42)|29|30)|44|45|46|(1:59)(1:50)|51|52|(1:54)|55|(1:57)|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0171, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0172, code lost:
    
        r10 = new kotlin.Result.Failure(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p15(VkAuthMetaInfo vkAuthMetaInfo, AuthResult authResult, boolean z, String str) {
        SchemeStatSak$TypeRegistrationItem.EventType eventType;
        this.b = authResult;
        this.c = z;
        this.d = str;
        ArrayList<SchemeStatSak$RegistrationFieldItem> arrayList = null;
        SilentAuthSource silentAuthSource = vkAuthMetaInfo != null ? vkAuthMetaInfo.e : null;
        switch (silentAuthSource == null ? -1 : a.$EnumSwitchMapping$0[silentAuthSource.ordinal()]) {
            case -1:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_UNKNOWN;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_SILENT;
                break;
            case 2:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_FAST_SILENT;
                break;
            case 3:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_GRAY_LINK;
                break;
            case 4:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_LOGIN;
                break;
            case 5:
            case 6:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_OAUTH;
                break;
            case 7:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.REGISTRATION;
                break;
            case 8:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_BUTTON;
                break;
            case 9:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_UNKNOWN;
                break;
            case 10:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_PHONE;
                break;
            case 11:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_EMAIL;
                break;
            case 12:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_ECOSYSTEM_PUSH;
                break;
            case 13:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_PASSKEY;
                break;
            case 14:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_AUTOLOGIN;
                break;
            case 15:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_UNKNOWN;
                break;
            case 16:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_QR_CODE;
                break;
            case 17:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_MAX;
                break;
            case 18:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_VKME;
                break;
            case 19:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_WHITE_LINK;
                break;
            case 20:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_VKID;
                break;
            case 21:
                eventType = SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_MAX_CODE;
                break;
        }
        this.h = eventType;
        SilentAuthSource silentAuthSource2 = vkAuthMetaInfo != null ? vkAuthMetaInfo.e : null;
        int i = silentAuthSource2 != null ? a.$EnumSwitchMapping$0[silentAuthSource2.ordinal()] : -1;
        boolean z2 = true;
        if (i != 1) {
            if (i == 14) {
                ArrayList<SchemeStatSak$RegistrationFieldItem> arrayList2 = new ArrayList<>();
                q55 q55Var = q55.a;
                Bundle bundle = q55.c().a.K;
                arrayList2.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.EVENT_DURATION, String.valueOf(bundle != null ? Long.valueOf(bundle.getLong("autologin_start_time")) : null), String.valueOf(System.currentTimeMillis()), null, 8, null));
                arrayList2.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.AUTOLOGIN_ID, "", "", bundle != null ? bundle.getString("autologin_id") : null));
                arrayList = arrayList2;
            } else if (i == 16) {
                SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID;
                Bundle bundle2 = authResult.r;
                arrayList = e43.a(new SchemeStatSak$RegistrationFieldItem(name, "", "", bundle2 != null ? bundle2.getString("qr_web_to_app_qr_code_id") : null));
            } else if (i != 4) {
                if (i == 5 || i == 6) {
                    arrayList = e43.a(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.OAUTH_SERVICE, "", "", vkAuthMetaInfo.c));
                }
            }
            this.i = arrayList;
        }
        arrayList = new ArrayList<>();
        q55 q55Var2 = q55.a;
        Bundle bundle3 = q55.c().a.K;
        if (bundle3 == null || !bundle3.getBoolean("backup", false)) {
            z2 = false;
        }
        Object failure = Boolean.valueOf(z2);
        if (((Boolean) (failure instanceof Result.Failure ? Boolean.FALSE : failure)).booleanValue()) {
            arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.BACKUP, "", "", String.valueOf(this.g.getAll().size())));
        }
        this.i = arrayList;
    }

    public static SchemeStatSak$RegistrationFieldItem a(MultiAccountEntryPoint multiAccountEntryPoint) {
        if ((multiAccountEntryPoint instanceof MultiAccountEntryPoint.Logout) || (multiAccountEntryPoint instanceof MultiAccountEntryPoint.Unknown)) {
            return null;
        }
        return new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.TO_SWITCHER_FROM, "", "", multiAccountEntryPoint.b);
    }

    public final void b(UserId userId, UserId userId2) {
        MultiAccountEntryPoint m;
        Pair pair;
        VkAnalyticsUserType vkAnalyticsUserType;
        VkAnalyticsUserType vkAnalyticsUserType2;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        AuthResult authResult = this.b;
        Bundle bundle = authResult.r;
        Bundle bundle2 = authResult.r;
        if (bundle == null || (m = sv1.m(bundle)) == null) {
            return;
        }
        boolean z = m instanceof MultiAccountEntryPoint.Deeplink;
        ArrayList q = p4g.q(rl3.I(new SchemeStatSak$RegistrationFieldItem[]{null, z ? new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.DEEPLINK, "", "", "1") : null, a(m)}));
        boolean z2 = this.c;
        if (!z2) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_ADD_AUTH, null);
        } else if (m instanceof MultiAccountEntryPoint.ProfileMenu) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (m instanceof MultiAccountEntryPoint.LK) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (m instanceof MultiAccountEntryPoint.Miniapp) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (m instanceof MultiAccountEntryPoint.SettingsLogout) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (m instanceof MultiAccountEntryPoint.SuperappMenu) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (m instanceof MultiAccountEntryPoint.Settings) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (m instanceof MultiAccountEntryPoint.LongTap) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (m instanceof MultiAccountEntryPoint.Restore) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (m instanceof MultiAccountEntryPoint.Sharing) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (z) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (m instanceof MultiAccountEntryPoint.Logout) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH, null);
        } else if (m instanceof MultiAccountEntryPoint.QrWebToApp) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_ADD_AUTH, null);
        } else if (m instanceof MultiAccountEntryPoint.Push) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_PUSH, null);
        } else if (m instanceof MultiAccountEntryPoint.QrWithCode) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH, null);
        } else if (m instanceof MultiAccountEntryPoint.Unknown) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH, null);
        } else if (m instanceof MultiAccountEntryPoint.VideoOfflineRelated) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (m instanceof MultiAccountEntryPoint.VkVideoMainKids) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (m instanceof MultiAccountEntryPoint.VkVideoProfile) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (m instanceof MultiAccountEntryPoint.VkVideoSettings) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        } else if (m instanceof MultiAccountEntryPoint.VkVideoOnboardingMainTab) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH, null);
        } else if (m instanceof MultiAccountEntryPoint.VkVideoOnboardingProfile) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH, null);
        } else if (m instanceof MultiAccountEntryPoint.VkVideoOnboardingSettingsBanner) {
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH, null);
        } else {
            if (!(m instanceof MultiAccountEntryPoint.AuthorPage)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, m);
        }
        SchemeStatSak$TypeMultiaccountsItem.EventType eventType = (SchemeStatSak$TypeMultiaccountsItem.EventType) pair.i();
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.NOWHERE;
        mui0 mui0Var = this.f;
        a.d dVar = new a.d(eventType, schemeStatSak$EventScreen, userId2, userId, yxi0.a(mui0Var.e()).size(), mui0Var.e(), true, (MultiAccountEntryPoint) pair.j(), null, 256);
        com.vk.superapp.multiaccount.api.a aVar = this.e;
        aVar.c(dVar);
        SchemeStatSak$TypeRegistrationItem.EventType eventType2 = SchemeStatSak$TypeRegistrationItem.EventType.SWITCH_FROM_ACCOUNT;
        SchemeStatSak$RegistrationFieldItem a2 = a(m);
        if (bundle2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = bundle2.getParcelable("multiaccount_profile_from", VkAnalyticsUserType.class);
                parcelable3 = (Parcelable) parcelable4;
            } else {
                Parcelable parcelable5 = bundle2.getParcelable("multiaccount_profile_from");
                if (!(parcelable5 instanceof VkAnalyticsUserType)) {
                    parcelable5 = null;
                }
                parcelable3 = (VkAnalyticsUserType) parcelable5;
            }
            vkAnalyticsUserType = (VkAnalyticsUserType) parcelable3;
        } else {
            vkAnalyticsUserType = null;
        }
        aVar.e(new a.f(null, eventType2, userId, rl3.I(new SchemeStatSak$RegistrationFieldItem[]{a2, vkAnalyticsUserType != null ? new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.PROFILE_TYPE, "", "", vkAnalyticsUserType.i()) : null}), this.d));
        SchemeStatSak$TypeRegistrationItem.EventType eventType3 = SchemeStatSak$TypeRegistrationItem.EventType.SWITCH_TO_ACCOUNT;
        SchemeStatSak$RegistrationFieldItem a3 = a(m);
        if (bundle2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle2.getParcelable("multiaccount_profile_to", VkAnalyticsUserType.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable6 = bundle2.getParcelable("multiaccount_profile_to");
                if (!(parcelable6 instanceof VkAnalyticsUserType)) {
                    parcelable6 = null;
                }
                parcelable = (VkAnalyticsUserType) parcelable6;
            }
            vkAnalyticsUserType2 = (VkAnalyticsUserType) parcelable;
        } else {
            vkAnalyticsUserType2 = null;
        }
        aVar.e(new a.f(null, eventType3, userId2, rl3.I(new SchemeStatSak$RegistrationFieldItem[]{a3, vkAnalyticsUserType2 != null ? new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.PROFILE_TYPE, "", "", vkAnalyticsUserType2.i()) : null}), this.d));
        if (z2) {
            return;
        }
        aVar.e(new a.f(null, j.contains(this.h) ? SchemeStatSak$TypeRegistrationItem.EventType.MULTI_ACC_ADD_ACCOUNT : SchemeStatSak$TypeRegistrationItem.EventType.ACCOUNT_WAS_ADDED_TO_MULTIACC_WITH_AUTH, userId2, q, this.d));
    }

    public final void c(UserId userId, UserId userId2) {
        boolean z = this.c;
        int i = 0;
        com.vk.superapp.multiaccount.api.a aVar = this.e;
        if (z && this.h == SchemeStatSak$TypeRegistrationItem.EventType.AUTH_BY_UNKNOWN) {
            aVar.d().a(new n15(this, userId, userId2, i), new b(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0));
            return;
        }
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        long j2 = userId2.b;
        bVar.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(this.h, this.i, Long.valueOf(j2), null, null, null, this.d, 184);
        aVar.d().a(new o15(this, userId, userId2, i), new c(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0));
    }
}
