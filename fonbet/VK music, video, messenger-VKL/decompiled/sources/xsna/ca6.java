package xsna;

import android.graphics.Bitmap;
import android.os.IInterface;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.ironsource.X3;
import com.vk.auth.api.models.AuthResult;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.item.common.description.c;
import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.VideoUrl;
import com.vk.im.ui.fragments.ImChatSettingsFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.webrtc.LocalMediaStreamAdapter;
import ru.ok.android.webrtc.LocalMediaStreamSource;
import xsna.dpt0;
import xsna.fit;
import xsna.ozo;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ca6 implements io.reactivex.rxjava3.functions.l, ub9.c, io.reactivex.rxjava3.functions.m, ivf0, Preference.c, io.reactivex.rxjava3.functions.c, Toolbar.h, LocalMediaStreamSource.OnScreenSizeChangedListener, r2m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ca6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.ivf0
    public void a(IInterface iInterface, lzi0 lzi0Var) {
        ((up) this.c).getClass();
        lzi0Var.k(Integer.valueOf(((gnv) iInterface).d()));
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 13:
                return (Pair) ((twa) this.c).invoke(obj, obj2);
            default:
                return (Boolean) ((lk1) this.c).invoke(obj, obj2);
        }
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        we9 we9Var = (we9) this.c;
        obr.f("Camera can only be released once, so release completer should be null on creation.", we9Var.p == null);
        we9Var.p = aVar;
        return "Release[camera=" + we9Var + X3.j.e;
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        final List list;
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        o2l.a.getClass();
        String c = o2l.c("__dbg_video_choose_urls", "");
        if (c.isEmpty()) {
            list = new ArrayList();
        } else {
            final Set set = (Set) Arrays.stream(VideoUrl.values()).map(new uqk(1)).collect(Collectors.toSet());
            Stream stream = Arrays.stream(c.split(StringUtils.COMMA));
            Objects.requireNonNull(set);
            list = (List) stream.filter(new Predicate() { // from class: xsna.j3l
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return set.contains((String) obj);
                }
            }).map(new k3l(0)).collect(Collectors.toList());
        }
        new dpt0.a(debugDevSettingsFragment.requireContext(), new iz0(debugDevSettingsFragment, 21), (List) Arrays.stream(VideoUrl.values()).filter(new Predicate() { // from class: xsna.l3l
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                String[] strArr2 = DebugDevSettingsFragment.t0;
                return !list.contains((VideoUrl) obj);
            }
        }).collect(Collectors.toList())).I0(null);
        return true;
    }

    @Override // xsna.r2m
    public void g(com.vk.clips.sdk.shared.item.common.description.c cVar) {
        MarketAdsItemViewEvent marketAdsItemViewEvent;
        dg1 dg1Var = (dg1) this.c;
        if (cVar instanceof c.b) {
            marketAdsItemViewEvent = xq00.b;
        } else if (cVar instanceof c.a) {
            marketAdsItemViewEvent = wq00.b;
        } else if (cVar instanceof c.C0669c) {
            marketAdsItemViewEvent = new yq00(((c.C0669c) cVar).a);
        } else {
            if (!(cVar instanceof c.e) && !(cVar instanceof c.d)) {
                throw new NoWhenBranchMatchedException();
            }
            marketAdsItemViewEvent = null;
        }
        if (marketAdsItemViewEvent != null) {
            dg1Var.a(marketAdsItemViewEvent);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        ImChatSettingsFragment imChatSettingsFragment = (ImChatSettingsFragment) this.c;
        xyb xybVar = imChatSettingsFragment.Q;
        if (xybVar == null) {
            xybVar = null;
        }
        xybVar.z.b(imChatSettingsFragment.S);
        return true;
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.OnScreenSizeChangedListener
    public void onScreenSizeChanged(int i, int i2) {
        ((LocalMediaStreamAdapter) this.c).a(i, i2);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 4:
                return ((Boolean) ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.a) this.c).invoke(obj)).booleanValue();
            case 5:
            default:
                return ((Boolean) ((j5n) this.c).invoke(obj)).booleanValue();
            case 6:
                return ((Boolean) ((db) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (Optional) ((ba6) obj2).invoke(obj);
            case 1:
                int i2 = CallParticipantsFragment.W;
                return (VoipViewModelState) ((db) obj2).invoke(obj);
            case 2:
            case 4:
            case 5:
            case 6:
            case 11:
            case 13:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            default:
                return (Boolean) ((ba6) obj2).invoke(obj);
            case 3:
                return (com.vk.ecomm.cart.impl.cart.feature.state.a) ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.a) obj2).invoke(obj);
            case 7:
                return (List) ((db) obj2).invoke(obj);
            case 8:
                return (ClipsPlaylist) ((db) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.a) obj2).invoke(obj);
            case 10:
                int i3 = CommunityAddressesFragment.E0;
                return (Bitmap) ((db) obj2).invoke(obj);
            case 12:
                return (sr5) ((b5h) obj2).invoke(obj);
            case 14:
                return (ozo.a) ((j5n) obj2).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.e) ((b5h) obj2).invoke(obj);
            case 16:
                return (bpd) ((f4r) obj2).invoke(obj);
            case 17:
                return (utk) ((ezr) obj2).invoke(obj);
            case 18:
                return (List) ((j5n) obj2).invoke(obj);
            case 19:
                return ((fit.t) obj2).invoke(obj);
            case 25:
                return (AuthResult) ((j5n) obj2).invoke(obj);
            case 27:
                return (List) ((j5n) obj2).invoke(obj);
            case 28:
                return (vx60) ((p010) obj2).invoke(obj);
        }
    }
}
