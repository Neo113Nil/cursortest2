package xsna;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.AuthActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.sync.api.di.ImSynchronizationHelpersComponent;
import com.vk.lifecycle.ProcessStateProvider;
import com.vk.metrics.performance.appstart.a;
import com.vk.money.MoneyTransferPagerFragment;
import com.vk.money.MoneyWebViewFragment;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.notifications.di.NotificationsComponent;
import com.vk.notifications.settings.CommunitiesManageNotificationsFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.profile.ui.community.CommunityPickerFragment;
import com.vk.pushes.PushOpenActivity;
import com.vk.stat.AppStartReporter;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import com.vk.utils.log.LogUploader;
import com.vk.voip.stereo.api.notifications.di.VoipStereoNotificationsComponent;
import com.vkontakte.android.ConfirmActionActivity;
import com.vkontakte.android.LinkRedirActivity;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.NotificationActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.ValidationActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeoutException;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import org.json.JSONObject;
import xsna.k840;
import xsna.oz50;
import xsna.uzp0;

/* compiled from: CommonNotificationsBridge.kt */
/* loaded from: classes11.dex */
public final class hlg implements ui70 {
    public final ProfileFragmentProviderComponent a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final fv30 f = new fv30(Source.CACHE);
    public final Object g;
    public final Object h;
    public final Object i;
    public final bpn0 j;
    public final Object k;
    public final Object l;

    public hlg(ProfileFragmentProviderComponent profileFragmentProviderComponent, Lazy<? extends NotificationsComponent> lazy, Lazy<? extends VoipStereoNotificationsComponent> lazy2, Lazy<? extends BridgeComponent> lazy3, Lazy<? extends ImSynchronizationHelpersComponent> lazy4) {
        this.a = profileFragmentProviderComponent;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy4;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, new rwe(1));
        this.h = msy.a(lazyThreadSafetyMode, new hb8(1));
        this.i = msy.a(lazyThreadSafetyMode, new zf6(this, 4));
        new bpn0(new ag6(this, 2));
        this.j = new bpn0(new m(2));
        this.k = msy.a(lazyThreadSafetyMode, new xsa(this, 1));
        this.l = msy.a(lazyThreadSafetyMode, new s65(1));
    }

    @Override // xsna.ui70
    public final void A(JSONObject jSONObject) {
        LogUploader.a a = LogUploader.a.C1940a.a(jSONObject);
        if (a == null) {
            return;
        }
        asu0.a.getClass();
        asu0.n().execute(new vk9(a, 2));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ui70
    public final Bitmap B(long j, long j2) {
        if (a().longValue() == j) {
            return ((ri70) this.g.getValue()).a(j2);
        }
        return null;
    }

    @Override // xsna.ui70
    public final void C() {
        UiTracker uiTracker = UiTracker.a;
        UiTracker.e.getClass();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        uzp0Var.b = uzp0.a.PUSH;
    }

    @Override // xsna.ui70
    public final boolean E(Context context, UserId userId, VoipCallSource voipCallSource, com.vk.pushes.receivers.b bVar) {
        return com.vk.common.links.c.e0(context, userId, voipCallSource, false, bVar, 48);
    }

    @Override // xsna.ui70
    public final boolean F(long j) {
        skb skbVar = (skb) this.j.getValue();
        boolean z = false;
        if (skbVar != null && skbVar.a(j)) {
            z = true;
        }
        return !z;
    }

    @Override // xsna.ui70
    public final void G(PushOpenActivity pushOpenActivity, int i) {
        r55 r55Var = r55.a;
        r55.b();
        Intent intent = new Intent(pushOpenActivity, (Class<?>) AuthActivity.class);
        DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
        intent.putExtra("loginConfirmationData", i);
        pushOpenActivity.startActivity(intent);
    }

    @Override // xsna.ui70
    public final File H(long j, String str) {
        y970 y970Var = y970.b;
        Optional optional = (Optional) bug0.a(io.reactivex.rxjava3.core.x.x(new fe60(new piy(j, 1), 1).b(new io.reactivex.rxjava3.internal.operators.single.v(new guv(str, 1)))));
        if (optional != null) {
            return (File) zjq.j(optional);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ui70
    public final Map<Long, Bitmap> I(Collection<Long> collection) {
        return ((ri70) this.g.getValue()).c(collection);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ui70
    public final void J(Context context, Intent intent) {
        ((com.vk.pushes.receivers.c) this.h.getValue()).a(context, intent);
    }

    @Override // xsna.ui70
    public final Intent K(Context context, long j, String str) {
        MoneyTransferPagerFragment.a aVar = new MoneyTransferPagerFragment.a();
        aVar.B(new UserId(j));
        aVar.y(str);
        aVar.z(SchemeStat$TypeNavgo.Subtype.PUSH.name().toLowerCase(Locale.ROOT));
        return aVar.n(context);
    }

    @Override // xsna.ui70
    public final oz50 M() {
        return new CommunityPickerFragment.a();
    }

    @Override // xsna.ui70
    public final Bitmap N(Context context, int i, ArrayList arrayList, float f) {
        int i2 = pba0.a;
        Pair c = pba0.c(gbg0.a(context.getResources(), 2.0f), i, i, arrayList.size());
        return pba0.b(context, ((Number) c.d()).intValue(), ((Number) c.g()).intValue(), gbg0.a(context.getResources(), 2.0f), f, context.getResources().getDisplayMetrics().density * 0.5f, arrayList);
    }

    @Override // xsna.ui70
    public final void O(PushOpenActivity pushOpenActivity, String str, String str2, String str3, String str4) {
        Intent a = NotificationActivity.a(pushOpenActivity, str, str2, str3, str4);
        a.addFlags(268435456);
        pushOpenActivity.startActivity(a);
    }

    @Override // xsna.ui70
    public final void P() {
        jp40 jp40Var = kvf.b;
        if (jp40Var == null) {
            jp40Var = null;
        }
        jp40Var.b(R.string.music_channel_name, "audio_playback_channel");
        jp40Var.b(R.string.music_subscription_push_channel_name, "subscription_push_channel");
    }

    @Override // xsna.ui70
    public final void Q() {
        jp40 jp40Var = kvf.b;
        if (jp40Var == null) {
            jp40Var = null;
        }
        jp40Var.getClass();
        i0q0.f(new m1y(jp40Var, 12));
    }

    @Override // xsna.ui70
    public final void R(PushOpenActivity pushOpenActivity, String str, String str2) {
        ConfirmActionActivity.U1(pushOpenActivity, str, str2);
    }

    @Override // xsna.ui70
    public final int S() {
        BuildInfo.Client client = BuildInfo.a;
        return BuildInfo.e;
    }

    @Override // xsna.ui70
    public final Long a() {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        return Long.valueOf(a1wVar.q().d);
    }

    @Override // xsna.ui70
    public final void b() {
        a201.a().b();
    }

    @Override // xsna.ui70
    public final Pair<String, Long> c() {
        return a201.a().c();
    }

    @Override // xsna.ui70
    public final String d() {
        return a201.a().d();
    }

    @Override // xsna.ui70
    public final boolean e() {
        return a201.a().e();
    }

    @Override // xsna.ui70
    public final void f(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        a201.a().f(str, str2, str3, str4, i, str5, str6);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ui70
    public final void g(Context context, Handler handler) {
        s750 s750Var = k840.a.e;
        if (s750Var == null) {
            s750Var = null;
        }
        s750Var.v0();
        s750 s750Var2 = k840.a.e;
        (s750Var2 != null ? s750Var2 : null).V0();
        a550.b((a550) this.k.getValue(), context, o25.a().c(), 0, null, null, null, null, 252);
        handler.postDelayed(new Runnable() { // from class: xsna.glg
            @Override // java.lang.Runnable
            public final void run() {
                com.vk.music.notifications.restriction.a aVar = k840.a.d;
                if (aVar == null) {
                    aVar = null;
                }
                MusicRestrictionPopupDisplayer.d(aVar, "push", k840.a.g().b().x0(), null, null, 12);
            }
        }, 300L);
        ca70 ca70Var = ca70.a;
        ca70.a(context, "music_subscription", 2);
    }

    @Override // xsna.ui70
    public final oz50 h(long j, String str) {
        CommunityNotificationSettingsFragment.a aVar = new CommunityNotificationSettingsFragment.a(j, str);
        aVar.y();
        return aVar;
    }

    @Override // xsna.ui70
    public final boolean i(Context context, Long l, long j, boolean z) {
        com.vk.common.links.c.t(context, l, j, 0, null, null, null, null, z, null, null, null, null, 7928);
        return true;
    }

    @Override // xsna.ui70
    public final void j(int i, Context context) {
        try {
            vgj0.a(i, context);
        } catch (ShortcutBadgeException unused) {
        }
    }

    @Override // xsna.ui70
    public final void k(String str) {
        asu0.a.getClass();
        asu0.h().submit(new cs2(str, 6));
    }

    @Override // xsna.ui70
    public final void l() {
        t6g0 t6g0Var = t6g0.b;
        t6g0.b().a();
    }

    @Override // xsna.ui70
    public final boolean m(int i, long j, long j2) {
        a1w a1wVar;
        fv30 fv30Var = this.f;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer b = Peer.a.b(j);
        a1w a1wVar2 = null;
        a1wVar2 = null;
        if (!BuildInfo.s() || !b.Ab(Peer.Type.GROUP) ? (a1wVar = q1w.a) != null : (a1wVar = q1w.b) != null) {
            a1wVar2 = a1wVar;
        }
        if (fv30Var.a != Source.CACHE) {
            return fv30.a(j2, fv30Var.c(j2, a1wVar2), fv30Var.d(a1wVar2, i, MsgIdType.CNV_ID, j2));
        }
        try {
            return fv30.a(j2, (ipm) itg0.f(a1wVar2.C(fv30Var, new uqm(new sqm(Peer.a.b(j2), fv30Var.a, true, (Object) fv30Var.b, 16))), 2000L), fv30Var.d(a1wVar2, i, MsgIdType.CNV_ID, j2));
        } catch (RuntimeException | TimeoutException unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ui70
    public final void n(boolean z) {
        ((rj70) this.i.getValue()).a(z);
        f620.c();
    }

    @Override // xsna.ui70
    public final void o(AppCompatActivity appCompatActivity, String str) {
        AppStartReporter.StartMethod startMethod = AppStartReporter.StartMethod.PUSH;
        startMethod.j(str);
        AppStartReporter.c(startMethod, false, appCompatActivity, new l93(), false);
    }

    @Override // xsna.ui70
    public final Intent p(Context context, int i, String str) {
        return MoneyWebViewFragment.vo(context, i, str);
    }

    @Override // xsna.ui70
    public final void q() {
        com.vk.metrics.performance.appstart.a aVar = ow90.g;
        aVar.getClass();
        ProcessStateProvider processStateProvider = ow90.o;
        ProcessStateProvider.ProcessState a = processStateProvider != null ? processStateProvider.a() : null;
        if (aVar.e != a || a != ProcessStateProvider.ProcessState.Foreground) {
            aVar.c = false;
            Iterator<a.InterfaceC1278a> it = aVar.d.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
        sw90.a.getClass();
        sw90.d = false;
    }

    @Override // xsna.ui70
    public final Intent r(Context context, String str) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
        intent.setComponent(new ComponentName(context, (Class<?>) LinkRedirActivity.class));
        intent.putExtra("from_notification", true);
        return intent;
    }

    @Override // xsna.ui70
    public final Class<? extends Activity> s() {
        rsr rsrVar = oz50.k;
        oz50.b.d();
        return MainActivity.class;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ui70
    public final void t(Long l) {
        ((ImSynchronizationHelpersComponent) this.e.getValue()).x3().c(l);
    }

    @Override // xsna.ui70
    public final void u(JSONObject jSONObject) {
        a201.b().a().c("pushservice", jSONObject);
    }

    @Override // xsna.ui70
    public final void v(Context context) {
        new CommunitiesManageNotificationsFragment.b().k(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ui70
    public final boolean w(UserId userId, String str) {
        oaw oawVar = (oaw) this.l.getValue();
        if (str == null) {
            str = "";
        }
        return oawVar.a(userId, str);
    }

    @Override // xsna.ui70
    public final void x(PushOpenActivity pushOpenActivity, String str, String str2) {
        pushOpenActivity.startActivity(ValidationActivity.U1(pushOpenActivity, str, str2));
    }

    @Override // xsna.ui70
    public final void y(long j, Context context) {
        com.vk.common.links.c.F(context, null, null, "push_birthday", false, false, null, 232);
    }

    @Override // xsna.ui70
    public final boolean z() {
        skb skbVar = (skb) this.j.getValue();
        boolean z = false;
        if (skbVar != null && skbVar.b()) {
            z = true;
        }
        return !z;
    }
}
