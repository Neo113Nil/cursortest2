package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import com.my.target.common.MyTargetActivity;
import com.vk.clips.sdk.shared.item.static_ads.events.StaticAdsItemViewEvent;
import com.vk.core.tips.Tooltip;
import com.vk.dto.stickers.ShareVmojiStoryParams;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import com.vk.voip.ui.groupcalls.grid.a;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.NewsfeedSettingsFragment;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.anm0;
import xsna.ezi;
import xsna.o360;
import xsna.tiz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class nit implements io.reactivex.rxjava3.functions.l, y990, io.reactivex.rxjava3.functions.c, Tooltip.c, Preference.b, d0n0, io.reactivex.rxjava3.functions.m, yads.ng1, tiz0.d {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nit(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 12:
                NewsfeedSettingsFragment newsfeedSettingsFragment = (NewsfeedSettingsFragment) obj2;
                if (!(obj instanceof Boolean)) {
                    int i2 = NewsfeedSettingsFragment.v0;
                    break;
                } else {
                    bsl0 bsl0Var = newsfeedSettingsFragment.n0;
                    if (bsl0Var == null) {
                        bsl0Var = null;
                    }
                    Boolean bool = (Boolean) obj;
                    itg0.k(bsl0Var.c(bool.booleanValue()), null, null, 3);
                    anm0 anm0Var = newsfeedSettingsFragment.p0;
                    anm0 anm0Var2 = anm0Var != null ? anm0Var : null;
                    boolean booleanValue = bool.booleanValue();
                    String a = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_SETTINGS);
                    anm0.a aVar = anm0.a;
                    anm0Var2.x(booleanValue, a, MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER);
                    break;
                }
            default:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj2;
                int i3 = SettingsGeneralFragment.z0;
                com.vk.metrics.eventtracking.b.a.n("UI.SETTINGS.TEXT_SIZE_CHANGE");
                Context requireContext = settingsGeneralFragment.requireContext();
                String str = (String) obj;
                Object obj3 = ezi.a.a;
                SharedPreferences.Editor edit = com.vk.core.preference.Preference.h(requireContext, 0, "ConfigurationOverridingHelper").edit();
                if (str == null) {
                    str = "system";
                }
                edit.putString("fontScaleName", str).apply();
                Float f = (Float) ezi.a.a.get(ezi.a.a(settingsGeneralFragment.requireContext()));
                if (f != null) {
                    zdw zdwVar = i7o0.b;
                    zdw zdwVar2 = zdwVar != null ? zdwVar : null;
                    float floatValue = f.floatValue();
                    Context context = zdwVar2.t;
                    context.getResources().getConfiguration().fontScale = floatValue;
                    context.getResources().updateConfiguration(context.getResources().getConfiguration(), context.getResources().getDisplayMetrics());
                    zdwVar2.f().b.d.o().clear();
                }
                cvk.u(R.string.sett_app_restart_required, true);
                break;
        }
        return true;
    }

    @Override // xsna.tiz0.d
    public void a() {
        ((MyTargetActivity) this.c).finish();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (hda) ((q250) this.c).invoke(obj, obj2);
    }

    @Override // xsna.d0n0
    public void b(c0n0 c0n0Var) {
        StaticAdsItemViewEvent staticAdsItemViewEvent;
        l340 l340Var = ((com.vk.clips.sdk.shared.item.static_ads.c) this.c).B;
        if (c0n0Var.equals(b0n0.a)) {
            staticAdsItemViewEvent = dxk0.b;
        } else {
            if (!c0n0Var.equals(a0n0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            staticAdsItemViewEvent = cxk0.b;
        }
        l340Var.a(staticAdsItemViewEvent);
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        ((wmd0) this.c).invoke();
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.nf2) obj).a(((yads.df2) this.c).i.d);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 20:
                int i2 = StreamInfoFragment.S;
                return ((Boolean) ((av70) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((m1x0) obj2).invoke(obj)).booleanValue();
        }
    }

    @Override // xsna.y990
    public void a(int i) {
        GroupCallGridContainerView.a aVar;
        a.InterfaceC2053a interfaceC2053a = ((com.vk.voip.ui.groupcalls.grid.a) this.c).y;
        if (interfaceC2053a == null || (aVar = ((GroupCallGridContainerView) ((lp0) interfaceC2053a).c).f) == null) {
            return;
        }
        ((mjw0) ((qca0) aVar).c).l();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (List) ((e89) this.c).invoke(obj);
            case 1:
            case 6:
            case 9:
            case 12:
            case 18:
            case 19:
            case 20:
            default:
                return (ShareVmojiStoryParams) ((jp5) this.c).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((l8k) this.c).invoke(obj);
            case 3:
                return (vqk0) ((jp5) this.c).invoke(obj);
            case 4:
                return (Pair) ((dxh) this.c).invoke(obj);
            case 5:
                return (List) ((mx4) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.b0) ((bl30) this.c).invoke(obj);
            case 8:
                return (o360.c) ((m360) this.c).invoke(obj);
            case 10:
                return (NewsEntry) ((l8k) this.c).invoke(obj);
            case 11:
                return (lu60) ((tu60) this.c).invoke(obj);
            case 13:
                return (List) ((yl0) this.c).invoke(obj);
            case 14:
                return (s3q0) ((yl0) this.c).invoke(obj);
            case 15:
                return (s3q0) ((m360) this.c).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.b0) ((m360) this.c).invoke(obj);
            case 17:
                return (lm50) ((jnb) this.c).invoke(obj);
            case 21:
                return (s3q0) ((oed0) this.c).invoke(obj);
            case 22:
                return (wrw) ((def) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.t) ((zvd) this.c).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((m360) this.c).invoke(obj);
            case 25:
                return (List) ((av70) this.c).invoke(obj);
        }
    }
}
