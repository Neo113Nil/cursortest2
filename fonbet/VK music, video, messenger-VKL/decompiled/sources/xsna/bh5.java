package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.core.compose.component.modal.SheetValue;
import com.vk.core.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.video.ui.discovery.minimizable.doc2doc.onboarding.D2DOnboardingView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.ky6;
import xsna.nix;
import xsna.zol0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bh5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bh5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0227, code lost:
    
        if (r12.containsKey(r13) != false) goto L93;
     */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        UIBlockBadge uIBlockBadge;
        int i = this.b;
        int i2 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((fh5) obj3).K();
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                qcy<Object>[] qcyVarArr = nzg.k1;
                ((nzg) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                sst0 sst0Var = (sst0) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1064675442, intValue, -1, "com.vk.profile.core.tabs.ui.videos.CommunityProfileContentVideoViewHolder.setupShimmers.<anonymous>.<anonymous> (CommunityProfileContentVideoViewHolder.kt:301)");
                    }
                    tth.a(null, kai.c(-488642313, new slh(sst0Var, i2), aVar), aVar, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                D2DOnboardingView d2DOnboardingView = (D2DOnboardingView) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = D2DOnboardingView.n;
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1751028383, intValue2, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.onboarding.D2DOnboardingView.Content.<anonymous> (D2DOnboardingView.kt:71)");
                    }
                    srk.b(d2DOnboardingView.getAnimationTime(), d2DOnboardingView.getOnTooltipClick(), aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj3;
                String[] strArr = DebugDevSettingsFragment.t0;
                String charSequence = ((CharSequence) obj2).toString();
                long parseLong = charSequence.isEmpty() ? 0L : Long.parseLong(charSequence);
                o2l.a.getClass();
                ky6.a aVar3 = (ky6.a) Preference.j().edit();
                aVar3.putLong("__dbg_apply_spaces_chat", parseLong);
                aVar3.apply();
                debugDevSettingsFragment.findPreference("__dbg_apply_spaces_chat").I(parseLong == 0 ? "Peer id" : String.valueOf(parseLong));
                return null;
            case 5:
                ((Integer) obj2).getClass();
                ((m9t) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                fw20 fw20Var = (fw20) obj3;
                fdj0 fdj0Var = fw20Var.e;
                long j = ((q9x) obj).a;
                long j2 = ((o6j) obj2).a;
                float f = fw20Var.h;
                float h = o6j.h(j2);
                float f2 = h * f;
                float f3 = (1.0f - f) * h;
                os9 os9Var = new os9(8);
                SheetValue sheetValue = SheetValue.Hidden;
                os9Var.b(sheetValue, h);
                int i4 = (int) (j & 4294967295L);
                float f4 = i4;
                if (f4 > f3 && !fdj0Var.a) {
                    os9Var.b(SheetValue.PartiallyExpanded, f2);
                }
                if (i4 != 0) {
                    os9Var.b(SheetValue.Expanded, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, h - f4));
                }
                s3q0 s3q0Var = s3q0.a;
                LinkedHashMap linkedHashMap = (LinkedHashMap) os9Var.c;
                yk00 yk00Var = new yk00(linkedHashMap);
                int i5 = nix.b.$EnumSwitchMapping$0[((SheetValue) fdj0Var.b.g.getValue()).ordinal()];
                if (i5 != 1) {
                    if (i5 != 2 && i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SheetValue sheetValue2 = SheetValue.PartiallyExpanded;
                    if (!linkedHashMap.containsKey(sheetValue2)) {
                        sheetValue2 = SheetValue.Expanded;
                        break;
                    }
                    sheetValue = sheetValue2;
                }
                return new Pair(yk00Var, sheetValue);
            case 7:
                uiy uiyVar = (uiy) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2129089270, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.podcast.KidsPodcastBigPlayerControls.Content.<anonymous> (KidsPodcastBigPlayerControls.kt:36)");
                    }
                    uiyVar.d(0, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 8:
                lb40 lb40Var = (lb40) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(533512475, intValue4, -1, "com.vk.music.stickyplayer.presentation.components.MusicBigPlayerControls.Content.<anonymous> (MusicBigPlayerControls.kt:43)");
                    }
                    lb40Var.c(0, aVar5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((sja0) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((mze0) obj3).Zn(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 11:
                hqh0 hqh0Var = (hqh0) obj3;
                String str = (String) obj;
                SearchInputMethod searchInputMethod = (SearchInputMethod) obj2;
                SwitchCatalogVh switchCatalogVh = hqh0Var.j;
                if (((switchCatalogVh != null ? switchCatalogVh.r : null) instanceof vyh0) && !epx.f(hqh0Var.r, str)) {
                    hqh0Var.r = str;
                    hqh0Var.a().O(str, searchInputMethod);
                }
                return s3q0.a;
            case 12:
                String str2 = (String) obj3;
                UIBlockList uIBlockList = (UIBlockList) ((UIBlock) obj).zb();
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                Iterator it = j5g.s0(e43.g(arrayList), 1).iterator();
                while (it.hasNext()) {
                    int intValue5 = ((Number) it.next()).intValue();
                    if ((arrayList.get(intValue5) instanceof UIBlockHeader) && epx.f(arrayList.get(intValue5).Fb(), str2)) {
                        UIBlockBadge uIBlockBadge2 = ((UIBlockHeader) arrayList.get(intValue5)).C;
                        CatalogBadge catalogBadge = uIBlockBadge2 != null ? uIBlockBadge2.y : null;
                        if (catalogBadge != null && (uIBlockBadge = ((UIBlockHeader) arrayList.get(intValue5)).C) != null) {
                            uIBlockBadge.y = CatalogBadge.zb(catalogBadge, "", 2);
                        }
                    }
                }
                return uIBlockList;
            case 13:
                ((Integer) obj2).getClass();
                mml0.b((zol0.a.c) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 14:
                Integer num = (Integer) obj2;
                num.intValue();
                ((LinkedHashMap) obj3).put((z8n0) obj, num);
                return s3q0.a;
            case 15:
                ((Integer) obj2).getClass();
                xun0.a((gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 16:
                ((Integer) obj2).getClass();
                kuo0.e((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 17:
                ((Integer) obj2).getClass();
                ((arq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                int i6 = jmu0.g1;
                ((jmu0) obj3).Zn(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ bh5(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
