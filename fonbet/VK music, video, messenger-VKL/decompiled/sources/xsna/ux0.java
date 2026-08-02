package xsna;

import androidx.preference.Preference;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.webrtc.LocalMediaStreamAdapter;
import ru.ok.android.webrtc.di.CallModuleImpl;
import xsna.bzp0;
import xsna.e6a;
import xsna.eeu0;
import xsna.epe;
import xsna.h7u0;
import xsna.jm1;
import xsna.ngl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ux0 implements jm1.a, io.reactivex.rxjava3.functions.l, SimpleVideoView.i, io.reactivex.rxjava3.functions.m, LocalMediaStreamAdapter.OutOfBandScreenshareChecker, io.reactivex.rxjava3.functions.c, Preference.c, ngl.a, io.reactivex.rxjava3.functions.i {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ux0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a(AdsItemViewEvent adsItemViewEvent) {
        com.vk.clips.sdk.shared.item.ads.c.r((com.vk.clips.sdk.shared.item.ads.c) this.c, adsItemViewEvent);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 19:
                return (Pair) ((bkh) this.c).invoke(obj, obj2);
            default:
                return (io.reactivex.rxjava3.core.q) ((cv4) this.c).invoke(obj, obj2);
        }
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.i
    public void b() {
        u440 u440Var = (u440) this.c;
        boolean z = u440Var.I;
        p1m0 p1m0Var = u440Var.B;
        if (!z || u440Var.A) {
            return;
        }
        p1m0Var.b(false);
        q850 q850Var = p1m0Var.a;
        int i = p1m0Var.c;
        if (i >= 0) {
            int max = Math.max(i, (i - p1m0Var.d) + ((int) 0));
            new PlaybackActionMeta(17, 0L, 2, null);
            q850Var.d.f(max);
        }
        p1m0Var.b(true);
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        xmp xmpVar = (xmp) this.c;
        xmpVar.z.getClass();
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.USED_EXISTING_EMAIL, null, null, null, null, null, null, 254);
        vmp vmpVar = (vmp) xmpVar.a;
        if (vmpVar != null) {
            vmpVar.Pm(cVar.a);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        o2l.a.getClass();
        String c = o2l.c("__dbg_test_xowner_allowed_methods", "");
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(debugDevSettingsFragment.mo2getContext()));
        c2801a.b = "Установить методы для тестирования long id";
        c2801a.d = "Для установки методов можно перечислить их названия через запятую, так и группу методов целиком - методы определяются по содержанию подстроки";
        c2801a.g = c;
        c2801a.c(R.string.ok, new tji(3), true);
        c2801a.g();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.i
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (List) ((wai) this.c).invoke(obj, obj2, obj3, obj4, obj5);
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamAdapter.OutOfBandScreenshareChecker
    public boolean isScreenshareHandled() {
        return CallModuleImpl.d((CallModuleImpl) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        y90 y90Var = (y90) this.c;
        switch (i) {
            case 5:
                int i2 = BroadcastConfigFragment.U;
                break;
        }
        return ((Boolean) y90Var.invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 2:
                return (List) ((y90) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
            case 4:
            case 5:
            case 6:
            case 13:
            case 19:
            case 20:
            case 24:
            case 25:
            case 26:
            default:
                return (List) ((d4r) this.c).invoke(obj);
            case 7:
                return (hda) ((e6a.b) this.c).invoke(obj);
            case 8:
                return (Pair) ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
            case 9:
                return (hda) ((rh4) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((l14) this.c).invoke(obj);
            case 11:
                return (Dialog) ((zib) this.c).invoke(obj);
            case 12:
                return (List) ((y90) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.b0) ((y90) this.c).invoke(obj);
            case 15:
                return (u2e) ((p5e) this.c).invoke(obj);
            case 16:
                return (qih0) ((td5) this.c).invoke(obj);
            case 17:
                return (epe.a.C2831a) ((y90) this.c).invoke(obj);
            case 18:
                return (List) ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.t) ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.t) ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
            case 23:
                return (zla0) ((pl2) this.c).invoke(obj);
            case 27:
                return (Boolean) ((x90) this.c).invoke(obj);
            case 28:
                return (List) ((udo) this.c).invoke(obj);
        }
    }
}
