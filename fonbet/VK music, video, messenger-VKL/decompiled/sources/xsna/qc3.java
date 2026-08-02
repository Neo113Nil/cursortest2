package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.channelrestrictions.WarningNotification;
import com.vk.channelrestrictions.WarningReason;
import com.vk.core.preference.Preference;
import com.vk.core.ui.themes.VKTheme;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.im.ui.views.settings.CheckableLabelSettingsView;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.SchemeStat$TypeClickItem;
import com.vk.video.profile.analytics.ContentWarningModalClick;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import java.lang.ref.WeakReference;
import xsna.r1q0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qc3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qc3(UIBlock uIBlock, Good good, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, cw00 cw00Var, i910 i910Var) {
        this.b = 2;
        this.c = good;
        this.d = cw00Var;
        this.e = i910Var;
        this.f = commonMarketStat$TypeRefSource;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                final FragmentActivity fragmentActivity = (FragmentActivity) obj3;
                final float[] fArr = (float[]) obj2;
                final AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment = (AppearanceSettingsWithBackgroundsFragment) obj;
                int i2 = AppearanceSettingsWithBackgroundsFragment.b0;
                final AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment2 = (AppearanceSettingsWithBackgroundsFragment) ((WeakReference) obj4).get();
                if (appearanceSettingsWithBackgroundsFragment2 != null) {
                    gzs gzsVar = new gzs() { // from class: xsna.mc3
                        @Override // xsna.gzs
                        public final Object invoke() {
                            int i3 = AppearanceSettingsWithBackgroundsFragment.b0;
                            r1q0.a.a(SchemeStat$TypeClickItem.Subtype.THEME_AUTO);
                            VKTheme C = dhr0.C();
                            Preference.I("vk_theme_helper", "auto_change_theme", true);
                            Preference.C("vk_theme_helper", "current_theme_name");
                            Preference.C("vk_theme_helper", "timetable_change_theme");
                            z6n0 z6n0Var = dhr0.n;
                            FragmentActivity fragmentActivity2 = FragmentActivity.this;
                            itg0.a(fragmentActivity2, z6n0Var.a(fragmentActivity2.getApplicationContext()).subscribe(new kx8(C, fragmentActivity2, fArr, 1)));
                            CheckableLabelSettingsView checkableLabelSettingsView = appearanceSettingsWithBackgroundsFragment.Q;
                            if (checkableLabelSettingsView == null) {
                                checkableLabelSettingsView = null;
                            }
                            AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment3 = appearanceSettingsWithBackgroundsFragment2;
                            appearanceSettingsWithBackgroundsFragment3.Z = checkableLabelSettingsView;
                            appearanceSettingsWithBackgroundsFragment3.fo();
                            appearanceSettingsWithBackgroundsFragment3.eo();
                            return s3q0.a;
                        }
                    };
                    Lifecycle lifecycle = appearanceSettingsWithBackgroundsFragment2.getLifecycle();
                    lifecycle.addObserver(new sc3(lifecycle, gzsVar));
                }
                break;
            case 1:
                ((uw20) obj4).h((gzs) obj3, (xx20) obj2, (LayoutDirection) obj);
                break;
            case 2:
                Good good = (Good) obj4;
                cw00 cw00Var = (cw00) obj3;
                i910 i910Var = (i910) obj2;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = (CommonMarketStat$TypeRefSource) obj;
                if (good.J || (!cw00Var.c && !cw00Var.b)) {
                    ot00 ot00Var = i910Var.g;
                    Integer num = i910Var.k;
                    ot00Var.getClass();
                    MarketFavable s = ao8.s(good);
                    smq.f(ot00Var.f, ot00Var.b, s, new va5(s, ot00Var, commonMarketStat$TypeRefSource, num, good), new k3o(s, ot00Var, good, 2), new q45(s, ot00Var, good, 5), true, null, good.d0, PsExtractor.AUDIO_STREAM);
                }
                break;
            default:
                UserId userId = (UserId) obj3;
                int i3 = VideoProfileFragmentOld.p0;
                m7t0.a((WarningReason) obj4, userId.b, ContentWarningModalClick.Hide);
                xn50.a.c((VideoProfileFragmentOld) obj2, new a.n(new UserId(Math.abs(userId.b)), ((WarningNotification) obj).b));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qc3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ qc3(m7t0 m7t0Var, WarningReason warningReason, UserId userId, VideoProfileFragmentOld videoProfileFragmentOld, WarningNotification warningNotification) {
        this.b = 3;
        this.c = warningReason;
        this.d = userId;
        this.e = videoProfileFragmentOld;
        this.f = warningNotification;
    }
}
