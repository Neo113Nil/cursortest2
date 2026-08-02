package xsna;

import android.content.Context;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignSettingsSectionSettingsIdDto;
import com.vk.api.generated.notifications.dto.NotificationsGetRedesignSettingsResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;
import com.vk.core.preference.Preference;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.nh70;
import xsna.rf70;
import xsna.ug70;
import xsna.vzi0;
import xsna.zqn0;

/* compiled from: NotificationSettingsFeature.kt */
/* loaded from: classes5.dex */
public final class hg70 extends wk50<uh70, oh70, rf70, ug70> {
    public final hlu0 f;
    public final msn g;
    public final boolean h;
    public final bk70 i;
    public final kke0 j;
    public final ig70 k;
    public final hpt0 l;
    public final s101 m;
    public final hpt0 n;
    public final a o;
    public final f4z p;
    public final f4z q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hg70(hlu0 hlu0Var, msn msnVar, boolean z, bk70 bk70Var, kke0 kke0Var, ig70 ig70Var) {
        super(r0, r1);
        rf70.a aVar = new rf70.a(bk70Var != null ? bk70Var.a : null, bk70Var != null ? bk70Var.b : null, bk70Var != null ? bk70Var.c : null);
        kh70 kh70Var = new kh70(new oh70(0));
        new Regex("\\[.*?]|'{3,}");
        this.f = hlu0Var;
        this.g = msnVar;
        this.h = z;
        this.i = bk70Var;
        this.j = kke0Var;
        this.k = ig70Var;
        this.l = new hpt0();
        this.m = new s101();
        this.n = new hpt0();
        a aVar2 = new a();
        this.o = aVar2;
        this.p = new f4z();
        this.q = new f4z();
        zqn0.a.b(aVar2);
    }

    @Override // xsna.wk50
    public final void N(oh70 oh70Var, rf70 rf70Var) {
        String str;
        List<NotificationsNotificationSettingRedesignDto> e;
        List<NotificationsNotificationSettingRedesignDto> e2;
        String str2;
        NotificationsGetRedesignSettingsResponseDto notificationsGetRedesignSettingsResponseDto;
        List<NotificationsNotificationSettingsSectionRedesignDto> d;
        NotificationsGetRedesignSettingsResponseDto notificationsGetRedesignSettingsResponseDto2;
        List<NotificationsNotificationSettingsSectionRedesignDto> d2;
        oh70 oh70Var2 = oh70Var;
        rf70 rf70Var2 = rf70Var;
        boolean z = oh70Var2.i;
        String str3 = oh70Var2.f;
        NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto = oh70Var2.h;
        gg70 gg70Var = oh70Var2.d;
        if (rf70Var2 instanceof rf70.f) {
            if (str3 == null) {
                X();
                return;
            } else {
                W(str3);
                return;
            }
        }
        if (rf70Var2 instanceof of70) {
            T(qg70.b);
            return;
        }
        if (rf70Var2 instanceof pf70) {
            T(pg70.b);
            return;
        }
        boolean z2 = rf70Var2 instanceof qf70;
        hpt0 hpt0Var = this.n;
        f4z f4zVar = this.p;
        if (z2) {
            int i = ((qf70) rf70Var2).b;
            T(new ch70(i));
            f4zVar.b(nh70.c.a);
            hpt0Var.getClass();
            qaj0.c(Preference.j(), "notifyLedColor", Integer.valueOf(i));
            return;
        }
        r10 = null;
        r10 = null;
        r10 = null;
        r10 = null;
        r10 = null;
        if (rf70Var2 instanceof sf70) {
            String str4 = ((sf70) rf70Var2).b;
            if (gg70Var != null && (notificationsGetRedesignSettingsResponseDto2 = gg70Var.b) != null && (d2 = notificationsGetRedesignSettingsResponseDto2.d()) != null) {
                for (NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto2 : d2) {
                    if (epx.f(notificationsNotificationSettingsSectionRedesignDto2.getId(), str4)) {
                        str2 = notificationsNotificationSettingsSectionRedesignDto2.getTitle();
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            str2 = null;
            if (gg70Var != null && (notificationsGetRedesignSettingsResponseDto = gg70Var.b) != null && (d = notificationsGetRedesignSettingsResponseDto.d()) != null) {
                for (NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto3 : d) {
                    if (epx.f(notificationsNotificationSettingsSectionRedesignDto3.getId(), str4)) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            f4zVar.b(new nh70.f(str4, str2, notificationsNotificationSettingsSectionRedesignDto3));
            return;
        }
        if (rf70Var2 instanceof tf70) {
            f4zVar.b(nh70.e.a);
            return;
        }
        if (rf70Var2 instanceof uf70) {
            zqn0.a.i();
            return;
        }
        if (rf70Var2 instanceof ag70) {
            T(new dh70((gg70Var == null || gg70Var.e) ? false : true));
            boolean z3 = (gg70Var == null || gg70Var.e) ? false : true;
            hpt0Var.getClass();
            qaj0.c(Preference.j(), "notifyLED", Boolean.valueOf(z3));
            return;
        }
        boolean z4 = rf70Var2 instanceof bg70;
        kke0 kke0Var = this.j;
        if (z4) {
            if (gg70Var != null) {
                boolean z5 = !gg70Var.d;
                T(new eh70(z5));
                Preference.f("multi_push_settings_prefs").edit().putBoolean("is_multi_push_disabled", z5).apply();
                if (o25.a().g().size() > 1) {
                    kke0Var.a(true, Boolean.valueOf(z5));
                    return;
                }
                return;
            }
            return;
        }
        if (rf70Var2 instanceof yf70) {
            if (gg70Var == null || ((yf70) rf70Var2).b != gg70Var.a) {
                T(new fh70(((yf70) rf70Var2).b));
                kke0Var.a((r2 & 1) == 0, null);
                return;
            }
            return;
        }
        if (rf70Var2 instanceof zf70) {
            if ((gg70Var != null ? gg70Var.g : null) == null) {
                return;
            }
            if (this.g.b()) {
                f4zVar.b(nh70.b.a);
                return;
            } else {
                f4zVar.b(nh70.d.a);
                return;
            }
        }
        if (rf70Var2 instanceof vf70) {
            T(new bh70(Integer.valueOf(((vf70) rf70Var2).b)));
            return;
        }
        if (rf70Var2 instanceof wf70) {
            T(new gh70(((wf70) rf70Var2).b));
            return;
        }
        if (rf70Var2 instanceof xf70) {
            T(new xg70(((xf70) rf70Var2).b));
            return;
        }
        if (rf70Var2 instanceof rf70.a) {
            rf70.a aVar = (rf70.a) rf70Var2;
            String str5 = aVar.b;
            if (this.i == null) {
                X();
                return;
            }
            NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto4 = aVar.d;
            if (str5 == null) {
                T(sg70.b);
                return;
            }
            T(new ug70.a(str5, aVar.c, notificationsNotificationSettingsSectionRedesignDto4));
            if (notificationsNotificationSettingsSectionRedesignDto4 != null) {
                W(str5);
                return;
            }
            return;
        }
        if (rf70Var2 instanceof rf70.e) {
            String str6 = ((rf70.e) rf70Var2).b;
            if (notificationsNotificationSettingsSectionRedesignDto != null && (e2 = notificationsNotificationSettingsSectionRedesignDto.e()) != null) {
                for (NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto : e2) {
                    if (epx.f(notificationsNotificationSettingRedesignDto.getId(), str6)) {
                        str = notificationsNotificationSettingRedesignDto.getTitle();
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            str = null;
            if (notificationsNotificationSettingsSectionRedesignDto != null && (e = notificationsNotificationSettingsSectionRedesignDto.e()) != null) {
                for (NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto2 : e) {
                    if (epx.f(notificationsNotificationSettingRedesignDto2.getId(), str6)) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            f4zVar.b(new nh70.g(str6, str, notificationsNotificationSettingRedesignDto2));
            return;
        }
        if (rf70Var2 instanceof rf70.i) {
            if (str3 == null || notificationsNotificationSettingsSectionRedesignDto == null) {
                return;
            }
            boolean f = notificationsNotificationSettingsSectionRedesignDto.f();
            boolean z6 = !f;
            this.q.b(vzi0.d.a);
            Context context = e43.a;
            String d3 = b6m.d(context != null ? context : null);
            NotificationsEditRedesignSettingsSectionSettingsIdDto notificationsEditRedesignSettingsSectionSettingsIdDto = !f ? NotificationsEditRedesignSettingsSectionSettingsIdDto.ALL : NotificationsEditRedesignSettingsSectionSettingsIdDto.NONE;
            this.m.getClass();
            tfx tfxVar = new tfx("notifications.editRedesignSettingsSection", new wr(29), new xr(25));
            tfx.o(tfxVar, "device_id", d3, 0, 0, 12);
            tfx.o(tfxVar, "category_id", str3, 0, 0, 12);
            tfx.o(tfxVar, "settings_id", notificationsEditRedesignSettingsSectionSettingsIdDto.i(), 0, 0, 12);
            this.e.b(rsg0.T(yfb.x(tfxVar)).subscribe(new p350(new uxu(this, z6, 1), 3), new be50(new o010(this, 20), 5)));
            return;
        }
        if (rf70Var2 instanceof rf70.h) {
            boolean z7 = !z;
            this.l.getClass();
            qaj0.c(Preference.j(), "showMusicSuggestNotification", Boolean.valueOf(z7));
            T(new ah70(z7));
            return;
        }
        if (rf70Var2 instanceof rf70.g) {
            rf70.g gVar = (rf70.g) rf70Var2;
            T(new zg70(gVar.c, gVar.b));
            return;
        }
        if (rf70Var2 instanceof rf70.b) {
            T(new yg70(((rf70.b) rf70Var2).b));
            return;
        }
        boolean z8 = rf70Var2 instanceof rf70.c;
        ig70 ig70Var = this.k;
        if (z8) {
            ig70Var.b(((rf70.c) rf70Var2).b).subscribe();
        } else {
            if (!(rf70Var2 instanceof rf70.d)) {
                throw new NoWhenBranchMatchedException();
            }
            rf70.d dVar = (rf70.d) rf70Var2;
            dVar.getClass();
            ig70Var.a(dVar.b).subscribe();
        }
    }

    public final f4z U() {
        return this.q;
    }

    public final wj50<nh70> V() {
        return this.p;
    }

    public final void W(String str) {
        T(tg70.b);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String d = b6m.d(context);
        this.m.getClass();
        tfx tfxVar = new tfx("notifications.getRedesignSettings", new ao(25), new bo(28));
        if (d != null) {
            tfx.o(tfxVar, "device_id", d, 0, 0, 12);
        }
        this.e.b(rsg0.T(yfb.x(tfxVar)).subscribe(new lz(new lfa(11, this, str), 27), new d120(new d410(this, 14), 9)));
    }

    public final void X() {
        T(tg70.b);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String d = b6m.d(context);
        tfx tfxVar = new tfx("notifications.getRedesignSettings", new ao(25), new bo(28));
        if (d != null) {
            tfx.o(tfxVar, "device_id", d, 0, 0, 12);
        }
        this.e.b(rsg0.T(yfb.x(tfxVar)).subscribe(new oz(new bgy(this, 18), 26), new t520(new c230(this, 8), 11)));
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        zqn0.a.j(this.o);
    }

    /* compiled from: NotificationSettingsFeature.kt */
    public static final class a implements zqn0.c {
        public a() {
        }

        @Override // xsna.zqn0.c
        public final void a() {
            hg70.this.p.b(new nh70.h(zqn0.a.f()));
        }

        @Override // xsna.zqn0.c
        public final void b() {
        }
    }
}
