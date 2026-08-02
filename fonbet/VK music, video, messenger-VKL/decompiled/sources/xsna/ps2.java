package xsna;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.preference.Preference;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.ecomm.checklist.impl.presentation.model.CommunityCheckListSubscribeVkBusinessResult;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.im.ui.views.settings.SwitchSettingsView;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.ui.widget.MenuListView;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandOnSuccessListener;
import ru.ok.android.webrtc.protocol.RtcResponse;
import ru.ok.android.webrtc.protocol.commands.UpdateDisplayLayoutV2Command;
import ru.ok.android.webrtc.protocol.commands.UpdateDisplayLayoutV2Response;
import ru.ok.android.webrtc.topology.server.layout.DiffDisplayLayouts;
import xsna.bzp0;
import xsna.mvg;
import xsna.ngl;
import xsna.pqc;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ps2 implements io.reactivex.rxjava3.functions.l, SwitchSettingsView.b, io.reactivex.rxjava3.functions.m, ClipsStickersView.d, pcs, Preference.c, RtcCommandOnSuccessListener, ngl.a, t4d0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ps2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.t4d0
    public void a(MediaStoreEntry mediaStoreEntry) {
        gmj gmjVar = ((PhotoVideoAttachActivity) this.c).Z;
        if (gmjVar != null) {
            gmjVar.invoke(mediaStoreEntry);
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.movika.sdk.base.observable.i) obj2).invoke(obj);
            case 1:
            case 2:
            case 8:
            case 10:
            case 13:
            case 15:
            case 18:
            case 19:
            default:
                return (Boolean) ((vsq) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.e) ((k82) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.movika.sdk.base.observable.i) obj2).invoke(obj);
            case 5:
                return (hda) ((vl1) obj2).invoke(obj);
            case 6:
                int i2 = ChannelFragment.a1;
                return (Boolean) ((com.vk.movika.sdk.base.observable.i) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.e) ((j37) obj2).invoke(obj);
            case 9:
                return (pqc.a) ((com.vk.movika.sdk.base.observable.i) obj2).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.t) ((com.vk.movika.sdk.base.observable.i) obj2).invoke(obj);
            case 12:
                return (Boolean) ((com.vk.movika.sdk.base.observable.i) obj2).invoke(obj);
            case 14:
                return ((qsh) obj2).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.b0) ((vl1) obj2).invoke(obj);
            case 17:
                return (Map) ((com.vk.movika.sdk.base.observable.i) obj2).invoke(obj);
            case 20:
                kpp kppVar = opp.T;
                return (String) ((com.vk.movika.sdk.base.observable.i) obj2).invoke(obj);
            case 21:
                return (List) ((vsq) obj2).invoke(obj);
            case 22:
                return (Boolean) ((vsq) obj2).invoke(obj);
            case 23:
                return (c.C1008c) ((vsq) obj2).invoke(obj);
            case 24:
                Stream stream = ((List) obj).stream();
                j2r0 j2r0Var = (j2r0) ((MenuListView) obj2).H.getValue();
                Objects.requireNonNull(j2r0Var);
                return (List) stream.map(new kqk(j2r0Var)).collect(Collectors.toList());
            case 25:
                return (io.reactivex.rxjava3.core.e) ((rop) obj2).invoke(obj);
            case 26:
                return (List) ((vsq) obj2).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.t) ((rop) obj2).invoke(obj);
        }
    }

    @Override // com.vk.im.ui.views.settings.SwitchSettingsView.b
    public void c(boolean z, boolean z2) {
        AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment = (AppearanceSettingsWithBackgroundsFragment) this.c;
        if (!z2) {
            int i = AppearanceSettingsWithBackgroundsFragment.b0;
            return;
        }
        boolean z3 = !z;
        appearanceSettingsWithBackgroundsFragment.P.getClass();
        SharedPreferences.Editor edit = cew.h().edit();
        edit.putBoolean("pref_cfg_chat_should_override_theme", z3);
        edit.apply();
        cew.f.onNext(Boolean.valueOf(z3));
    }

    @Override // com.vk.clips.design.view.stikers.ClipsStickersView.d
    public void d(MotionEvent motionEvent) {
        s0e s0eVar = (s0e) this.c;
        s0eVar.d.d().onTouch((View) s0eVar.n.getValue(), motionEvent);
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        cop copVar = (cop) ((vop) this.c).a;
        if (copVar != null) {
            copVar.ud();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        debugDevSettingsFragment.requireContext();
        return true;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandOnSuccessListener
    public void onRtcCommandSuccess(RtcCommand rtcCommand, RtcResponse rtcResponse) {
        ((DiffDisplayLayouts) this.c).b((UpdateDisplayLayoutV2Command) rtcCommand, (UpdateDisplayLayoutV2Response) rtcResponse);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) this.c;
        int i = CommunityCheckListFragment.Y;
        String l = fpf0.a(CommunityCheckListSubscribeVkBusinessResult.class).l();
        if (l == null) {
            l = "";
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable(l, CommunityCheckListSubscribeVkBusinessResult.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable(l);
            if (!(parcelable3 instanceof CommunityCheckListSubscribeVkBusinessResult)) {
                parcelable3 = null;
            }
            parcelable = (CommunityCheckListSubscribeVkBusinessResult) parcelable3;
        }
        CommunityCheckListSubscribeVkBusinessResult communityCheckListSubscribeVkBusinessResult = (CommunityCheckListSubscribeVkBusinessResult) parcelable;
        if (communityCheckListSubscribeVkBusinessResult == null || !communityCheckListSubscribeVkBusinessResult.b) {
            return;
        }
        xn50.a.c(communityCheckListFragment, new mvg.b(communityCheckListSubscribeVkBusinessResult.c, communityCheckListSubscribeVkBusinessResult.d));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 2:
                return ((Boolean) ((dz) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((j5) this.c).invoke(obj)).booleanValue();
        }
    }
}
