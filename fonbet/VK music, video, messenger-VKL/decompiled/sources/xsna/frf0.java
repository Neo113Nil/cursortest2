package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.apps.BuildInfo;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.env.RegistrationEnvironmentType;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vkontakte.android.VKApplication;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: RegistrationFunnelsTracker.kt */
/* loaded from: classes.dex */
public final class frf0 {
    public static Context b;
    public static String c;
    public static String d;
    public static String e;
    public static Integer f;
    public static RegistrationFunnelScreenStack a = new RegistrationFunnelScreenStack();
    public static final jrf0 g = new jrf0();
    public static final bpn0 h = new bpn0(new e53(8));
    public static final bpn0 i = new bpn0(new rq6(9));
    public static final dm10 j = new dm10();

    /* compiled from: RegistrationFunnelsTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SchemeStatSak$EventScreen.values().length];
            try {
                iArr[SchemeStatSak$EventScreen.START_WITH_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SchemeStatSak$EventScreen.AUTH_PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(final SchemeStatSak$TypeRegistrationItem.EventType eventType, ArrayList arrayList, Long l, SchemeStatSak$EventScreen schemeStatSak$EventScreen, SchemeStatSak$TypeRegistrationItem.Error error, SchemeStatSak$EventScreen schemeStatSak$EventScreen2, String str, int i2) {
        if ((i2 & 2) != 0) {
            arrayList = null;
        }
        if ((i2 & 4) != 0) {
            l = null;
        }
        if ((i2 & 8) != 0 && (schemeStatSak$EventScreen = a.zb()) == null) {
            schemeStatSak$EventScreen = SchemeStatSak$EventScreen.NOWHERE;
        }
        if ((i2 & 16) != 0) {
            error = null;
        }
        if ((i2 & 32) != 0) {
            schemeStatSak$EventScreen2 = null;
        }
        if ((i2 & 64) != 0) {
            str = RegistrationStatParamsFactory.b;
        }
        final String str2 = str;
        if (schemeStatSak$EventScreen == null && (schemeStatSak$EventScreen = a.zb()) == null) {
            schemeStatSak$EventScreen = SchemeStatSak$EventScreen.NOWHERE;
        }
        final ArrayList arrayList2 = arrayList;
        final SchemeStatSak$TypeRegistrationItem.Error error2 = error;
        final Long l2 = l;
        final SchemeStatSak$EventScreen schemeStatSak$EventScreen3 = schemeStatSak$EventScreen2;
        final SchemeStatSak$EventScreen schemeStatSak$EventScreen4 = schemeStatSak$EventScreen;
        qro0.c(new gzs() { // from class: xsna.erf0
            @Override // xsna.gzs
            public final Object invoke() {
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.i(SchemeStatSak$TypeRegistrationItem.EventType.this, schemeStatSak$EventScreen3, arrayList2, l2, schemeStatSak$EventScreen4, error2, str2);
                return s3q0.a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SchemeStatSak$EventScreen b(Fragment fragment) {
        arf0 arf0Var = fragment instanceof arf0 ? (arf0) fragment : null;
        if (arf0Var != null) {
            return arf0Var.u5();
        }
        return null;
    }

    public static void c(FragmentActivity fragmentActivity, Bundle bundle) {
        if (b == null) {
            b = fragmentActivity.getApplicationContext();
            if (bundle != null) {
                Parcelable parcelable = bundle.getParcelable("registration_screens");
                a = parcelable instanceof RegistrationFunnelScreenStack ? (RegistrationFunnelScreenStack) parcelable : null;
                c = bundle.getString("registration_sid");
            }
        }
    }

    public static void d(SchemeStatSak$EventScreen schemeStatSak$EventScreen, SchemeStatSak$EventScreen schemeStatSak$EventScreen2, ArrayList arrayList, int i2) {
        if ((i2 & 4) != 0) {
            arrayList = null;
        }
        qro0.c(new drf0(schemeStatSak$EventScreen2, schemeStatSak$EventScreen, SchemeStatSak$TypeRegistrationItem.EventType.SCREEN_PROCEED, arrayList, null));
    }

    public static void e(SchemeStatSak$EventScreen schemeStatSak$EventScreen, ArrayList arrayList, int i2) {
        if ((i2 & 2) != 0) {
            arrayList = null;
        }
        m(schemeStatSak$EventScreen, false);
        j(SchemeStatSak$TypeRegistrationItem.EventType.SCREEN_FOCUS, null, arrayList, null, null, 248);
    }

    public static SchemeStatSak$EventScreen f(SchemeStatSak$EventScreen schemeStatSak$EventScreen, SchemeStatSak$EventScreen schemeStatSak$EventScreen2, ArrayList arrayList, boolean z, SchemeStatSak$TypeRegistrationItem.Error error, Long l, int i2) {
        if ((i2 & 1) != 0) {
            schemeStatSak$EventScreen = a.zb();
        }
        if ((i2 & 4) != 0) {
            arrayList = null;
        }
        boolean z2 = (i2 & 8) != 0 ? false : z;
        if ((i2 & 16) != 0) {
            error = null;
        }
        if ((i2 & 32) != 0) {
            l = null;
        }
        if (schemeStatSak$EventScreen == null) {
            schemeStatSak$EventScreen = a.zb();
        }
        m(schemeStatSak$EventScreen, false);
        if (a.zb() == null && schemeStatSak$EventScreen2 == null) {
            return schemeStatSak$EventScreen;
        }
        j(SchemeStatSak$TypeRegistrationItem.EventType.SCREEN_PROCEED, schemeStatSak$EventScreen2, arrayList, l, error, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
        m(schemeStatSak$EventScreen2, z2);
        RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
        RegistrationElementsTracker.b.clear();
        return schemeStatSak$EventScreen;
    }

    public static void g(SchemeStatSak$EventScreen schemeStatSak$EventScreen, SchemeStatSak$EventScreen schemeStatSak$EventScreen2, ArrayList arrayList, Long l, int i2) {
        qro0.c(new drf0((i2 & 2) != 0 ? null : schemeStatSak$EventScreen2, (i2 & 1) != 0 ? null : schemeStatSak$EventScreen, SchemeStatSak$TypeRegistrationItem.EventType.SCREEN_RETURN, (i2 & 4) != 0 ? null : arrayList, (i2 & 8) != 0 ? null : l));
    }

    public static void h() {
        qro0.c(new sq6(12));
    }

    public static void i(SchemeStatSak$TypeRegistrationItem.EventType eventType, SchemeStatSak$EventScreen schemeStatSak$EventScreen, ArrayList arrayList, Long l, SchemeStatSak$EventScreen schemeStatSak$EventScreen2, SchemeStatSak$TypeRegistrationItem.Error error, String str) {
        Integer num;
        String str2;
        h240 a2;
        String str3;
        if (b != null) {
            bpn0 bpn0Var = crf0.a;
            num = (bpn0Var != null ? (brf0) bpn0Var.getValue() : crf0.b).a();
        } else {
            num = null;
        }
        ArrayList<SchemeStatSak$RegistrationFieldItem> a3 = g.a(schemeStatSak$EventScreen2, schemeStatSak$EventScreen, arrayList);
        j.getClass();
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        a3.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.ENV, "", "", (BuildInfo.h() ? RegistrationEnvironmentType.DEV : BuildInfo.m() ? RegistrationEnvironmentType.RELEASE : RegistrationEnvironmentType.DEV).h()));
        par0.a.getClass();
        par0.a("<" + eventType + "> " + schemeStatSak$EventScreen2 + " -> " + schemeStatSak$EventScreen);
        com.vk.superapp.multiaccount.api.c cVar = (com.vk.superapp.multiaccount.api.c) h.getValue();
        if (cVar == null || (a2 = bbq.a(cVar)) == null || (str3 = a2.a) == null) {
            str2 = null;
        } else {
            if (drm0.N(str3)) {
                str3 = null;
            }
            str2 = str3;
        }
        new pqf0(schemeStatSak$EventScreen2, new SchemeStatSak$TypeRegistrationItem(eventType, c, num, d, e, str2, l, a3, schemeStatSak$EventScreen, f, str, null, error, null, null, null, 49152, null)).q();
        f = null;
    }

    public static void j(SchemeStatSak$TypeRegistrationItem.EventType eventType, SchemeStatSak$EventScreen schemeStatSak$EventScreen, ArrayList arrayList, Long l, SchemeStatSak$TypeRegistrationItem.Error error, int i2) {
        Long l2 = (i2 & 8) != 0 ? null : l;
        SchemeStatSak$EventScreen zb = a.zb();
        if (zb == null) {
            zb = SchemeStatSak$EventScreen.NOWHERE;
        }
        i(eventType, schemeStatSak$EventScreen, arrayList, l2, zb, (i2 & 32) != 0 ? null : error, RegistrationStatParamsFactory.b);
    }

    public static void k(ArrayList arrayList) {
        Set<SchemeStatSak$RegistrationFieldItem> set = g.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SchemeStatSak$RegistrationFieldItem schemeStatSak$RegistrationFieldItem = (SchemeStatSak$RegistrationFieldItem) it.next();
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                if (((SchemeStatSak$RegistrationFieldItem) it2.next()).a() == schemeStatSak$RegistrationFieldItem.a()) {
                    it2.remove();
                }
            }
        }
        set.addAll(arrayList);
    }

    public static void l(SchemeStatSak$EventScreen schemeStatSak$EventScreen, ArrayList arrayList) {
        g.a.put(schemeStatSak$EventScreen, arrayList);
    }

    public static void m(SchemeStatSak$EventScreen schemeStatSak$EventScreen, boolean z) {
        if (schemeStatSak$EventScreen != null && a.zb() != schemeStatSak$EventScreen) {
            int i2 = a.$EnumSwitchMapping$0[schemeStatSak$EventScreen.ordinal()];
            bpn0 bpn0Var = i;
            if (i2 == 1) {
                fdh0 fdh0Var = (fdh0) bpn0Var.getValue();
                if (fdh0Var != null) {
                    fdh0Var.b();
                }
            } else if (i2 != 2) {
                fdh0 fdh0Var2 = (fdh0) bpn0Var.getValue();
                if (fdh0Var2 != null) {
                    fdh0Var2.c();
                }
            } else {
                fdh0 fdh0Var3 = (fdh0) bpn0Var.getValue();
                if (fdh0Var3 != null) {
                    fdh0Var3.a();
                }
            }
        }
        a.Bb(schemeStatSak$EventScreen, z);
    }
}
