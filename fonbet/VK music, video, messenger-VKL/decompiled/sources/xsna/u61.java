package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.compose.material3.SheetValue;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.draftslist.impl.ui.DraftsListFragment;
import com.vk.im.edu.ui.compose.item.ThreeButtonsItemView;
import com.vk.libvideo.autoplay.b;
import com.vk.lists.DefaultErrorView;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.profile.user.impl.ui.edit.UserEditProfileModalBottomSheet;
import com.vk.sharing.api.dto.Target;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cku;
import xsna.hff;
import xsna.pox0;
import xsna.sx20;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class u61 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u61(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0177, code lost:
    
        if (r11.containsKey(r12) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0190, code lost:
    
        if (r11.containsKey(r12) != false) goto L59;
     */
    /* JADX WARN: Type inference failed for: r11v49, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        SheetValue sheetValue;
        int i = this.b;
        int i2 = 2;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((v61) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                isi isiVar = (isi) obj;
                sj50 sj50Var = (sj50) obj2;
                hff.a aVar = ((hff) obj3).c;
                isiVar.c = new an7(isiVar.a(new ggf(sj50Var, aVar.a, aVar.g, aVar.h)), isiVar.a(new tgf(sj50Var)), isiVar.a(new jlf(sj50Var, aVar.k, aVar.n, aVar.m)), i2);
                return s3q0.a;
            case 2:
                vpi vpiVar = (vpi) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = vpi.f1;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(110373066, intValue, -1, "com.vk.core.compose.modal.ComposeModalBottomSheet.prepareBottomContent.<anonymous> (ComposeModalBottomSheet.kt:45)");
                    }
                    vpiVar.Yn(0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj3;
                String[] strArr = DebugDevSettingsFragment.t0;
                String charSequence = ((CharSequence) obj2).toString();
                int parseInt = charSequence.isEmpty() ? 0 : Integer.parseInt(charSequence);
                o2l.a.getClass();
                o2l.i(parseInt, "__dbg_video_ad_slot_id");
                debugDevSettingsFragment.findPreference("__dbg_video_ad_slot_id").I(parseInt == 0 ? "Slot id" : lhg.a(parseInt, ""));
                return null;
            case 4:
                ((Integer) obj2).getClass();
                qcy<Object>[] qcyVarArr = DraftsListFragment.Q;
                ((DraftsListFragment) obj3).eo(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((cku.a.C2666a) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                ((tlu) obj3).c.getPresenter().e((Target) obj, ((Integer) obj2).intValue());
                return s3q0.a;
            case 7:
                gdj0 gdj0Var = (gdj0) obj3;
                q9x q9xVar = (q9x) obj;
                float h = o6j.h(((o6j) obj2).a);
                dqz0 dqz0Var = new dqz0(2);
                SheetValue sheetValue2 = SheetValue.Hidden;
                dqz0Var.a(sheetValue2, h);
                if (((int) (q9xVar.a & 4294967295L)) > h / 2 && !gdj0Var.a) {
                    dqz0Var.a(SheetValue.PartiallyExpanded, h / 2.0f);
                }
                int i4 = (int) (q9xVar.a & 4294967295L);
                if (i4 != 0) {
                    dqz0Var.a(SheetValue.Expanded, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, h - i4));
                }
                s3q0 s3q0Var = s3q0.a;
                LinkedHashMap linkedHashMap = (LinkedHashMap) dqz0Var.b;
                xk00 xk00Var = new xk00(linkedHashMap);
                int i5 = sx20.b.$EnumSwitchMapping$0[((SheetValue) gdj0Var.d.h.getValue()).ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        sheetValue = SheetValue.PartiallyExpanded;
                        if (!linkedHashMap.containsKey(sheetValue)) {
                            sheetValue = SheetValue.Expanded;
                            break;
                        }
                        sheetValue2 = sheetValue;
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        sheetValue = SheetValue.Expanded;
                        break;
                    }
                }
                return new Pair(xk00Var, sheetValue2);
            case 8:
                ListLoadingState listLoadingState = (ListLoadingState) obj2;
                SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = ((NewsfeedCustomFragment2) obj3).a0;
                if (swipeDrawableRefreshLayout != null) {
                    swipeDrawableRefreshLayout.setRefreshing(listLoadingState == ListLoadingState.REFRESHING);
                }
                return s3q0.a;
            case 9:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                DefaultErrorView defaultErrorView = ((NewsfeedSearchFragment) obj3).g0;
                if (defaultErrorView != null) {
                    defaultErrorView.setVisibility(booleanValue ? 0 : 8);
                }
                return s3q0.a;
            case 10:
                j15 j15Var = (j15) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(427246164, intValue2, -1, "com.vk.profile.core.tabs.ui.music.ProfileContentAudioViewHolder.setupShimmers.<anonymous>.<anonymous> (ProfileContentAudioViewHolder.kt:271)");
                    }
                    tth.a(null, kai.c(1622928879, new nrv(j15Var, 4), aVar3), aVar3, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                int i6 = ThreeButtonsItemView.m;
                ((ThreeButtonsItemView) obj3).o(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 12:
                ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr2 = UserEditProfileModalBottomSheet.s1;
                ((UserEditProfileModalBottomSheet) obj3).kn().startActivity((Intent) obj);
                return s3q0.a;
            case 13:
                ((Integer) obj2).getClass();
                ((uoq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 14:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj3;
                int i7 = VideoMinimizableDiscoveryFragment.p1;
                hit0 N8 = ((VideoGrowthComponent) videoMinimizableDiscoveryFragment.ko().f.getValue()).N8();
                Context requireContext = videoMinimizableDiscoveryFragment.requireContext();
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                N8.b(requireContext, (String) obj, (VideoGrowthAppStore) obj2, s490.f(b.C1208b.a()), null);
                xn50.a.c(videoMinimizableDiscoveryFragment, c.d1.b);
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                mnx0.d((pox0.e.a.C3525a) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
        }
    }

    public /* synthetic */ u61(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
