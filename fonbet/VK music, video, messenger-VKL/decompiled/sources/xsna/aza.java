package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.layout.TopTitle;
import com.vk.catalog2.common.ui.mvp.holder.ComposeConfigurableHeaderVh;
import com.vk.channels.impl.channel_screen.footer.i;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.music.player.LoopMode;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.DonutLevelsFragment;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.ty6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class aza implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aza(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        View findViewByPosition;
        Object obj3;
        Pair pair;
        Object obj4;
        Object obj5;
        int i = this.b;
        int i2 = 4;
        Integer num2 = null;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                com.vk.channels.impl.channel_screen.footer.i iVar = (com.vk.channels.impl.channel_screen.footer.i) obj6;
                kkm kkmVar = (kkm) obj2;
                i.a aVar = iVar.l;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.c.setTextColor(kkmVar.f(R.attr.vk_ui_text_accent));
                i.a aVar2 = iVar.l;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.b.setBarColor(kkmVar.f(R.attr.vk_ui_icon_accent));
                i.a aVar3 = iVar.l;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                aVar3.d.setColorFilter(kkmVar.f(R.attr.vk_ui_icon_accent));
                i.a aVar4 = iVar.l;
                (aVar4 != null ? aVar4 : null).f.setTextTint(ColorStateList.valueOf(kkmVar.f(R.attr.vk_ui_text_accent_themed)));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                i9d.a((izs) obj6, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                TopTitle topTitle = (TopTitle) obj6;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = ComposeConfigurableHeaderVh.F;
                if (aVar5.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1375066719, intValue, -1, "com.vk.catalog2.common.ui.mvp.holder.ComposeConfigurableHeaderVh.bindData.<anonymous> (ComposeConfigurableHeaderVh.kt:74)");
                    }
                    dt1.a.getClass();
                    ty6.b bVar = dt1.a.l;
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.t), bVar, aVar5, 48);
                    int hashCode = Long.hashCode(n34.n(aVar5));
                    sy90 D = aVar5.D();
                    q630 c = qri.c(aVar5, q630.a.a);
                    cri.h7.getClass();
                    LayoutNode.a aVar6 = cri.a.b;
                    if (aVar5.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar5.H();
                    if (aVar5.L()) {
                        aVar5.I(aVar6);
                    } else {
                        aVar5.f();
                    }
                    k9q0.w(aVar5, a, cri.a.f);
                    k9q0.w(aVar5, D, cri.a.e);
                    k9q0.w(aVar5, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar5, cri.a.h);
                    k9q0.w(aVar5, c, cri.a.d);
                    if (topTitle.c != null) {
                        aVar5.K(-232857027);
                        gdv0.c(phw.a.a(fwu0.l(null, topTitle.c, null, null, aVar5, 0, 61), null, null, null, null, aVar5, 196616, 30), 20, null, PictureRadius.Small, null, null, null, aVar5, 3120, 116);
                        aVar5 = aVar5;
                    } else {
                        aVar5.K(-235951323);
                    }
                    aVar5.j();
                    String str = topTitle.b;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar5.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().p;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar5.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    androidx.compose.runtime.a aVar7 = aVar5;
                    yqv0.c(str, null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.v0, aVar7, 0, 0, 8186);
                    aVar7.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 3:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj6;
                String[] strArr = DebugDevSettingsFragment.t0;
                String charSequence = ((CharSequence) obj2).toString();
                o2l.a.getClass();
                o2l.j("__dbg_vkid_suspicious_auth_test", charSequence);
                debugDevSettingsFragment.findPreference("__dbg_vkid_suspicious_auth_test").I(charSequence);
                debugDevSettingsFragment.ko();
                return null;
            case 4:
                ((ham) obj6).a((kkm) obj2);
                return s3q0.a;
            case 5:
                DonutLevelsFragment donutLevelsFragment = (DonutLevelsFragment) obj6;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = DonutLevelsFragment.R;
                if (aVar8.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1476228191, intValue2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.DonutLevelsFragment.onCreateView.<anonymous> (DonutLevelsFragment.kt:116)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1747635878, new fne(donutLevelsFragment, i2), aVar8), aVar8, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
            case 6:
                uiy uiyVar = (uiy) obj6;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1642015544, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.podcast.KidsPodcastBigPlayerControls.Content.<anonymous> (KidsPodcastBigPlayerControls.kt:38)");
                    }
                    uiyVar.b(0, aVar9);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 7:
                lb40 lb40Var = (lb40) obj6;
                androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar10.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-834948135, intValue4, -1, "com.vk.music.stickyplayer.presentation.components.MusicBigPlayerControls.Content.<anonymous> (MusicBigPlayerControls.kt:45)");
                    }
                    LoopMode loopMode = (LoopMode) ((zak0) lb40Var.d).getValue();
                    if (loopMode == null) {
                        aVar10.K(-1784266000);
                    } else {
                        aVar10.K(-1784265999);
                        lb40Var.e(loopMode, aVar10, 0);
                    }
                    aVar10.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar10.h();
                }
                return s3q0.a;
            case 8:
                PostponedPostsFragment postponedPostsFragment = (PostponedPostsFragment) obj6;
                int i5 = 0;
                sq60 sq60Var = (sq60) obj2;
                RecyclerView recyclerView = postponedPostsFragment.Z;
                if (recyclerView == null) {
                    return s3q0.a;
                }
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (sq60Var.e) {
                    num = Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.v() : 0);
                } else {
                    num = null;
                }
                if (num != null) {
                    if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition(num.intValue())) != null) {
                        i5 = findViewByPosition.getTop();
                    }
                    num2 = Integer.valueOf(i5);
                }
                postponedPostsFragment.eo().a().H0(recyclerView, new k0(9, postponedPostsFragment, sq60Var), new krc0(num, num2, linearLayoutManager, postponedPostsFragment, sq60Var, 0), sq60Var.a, sq60Var.c);
                return s3q0.a;
            case 9:
                com.vk.newsfeed.common.recycler.holders.i iVar2 = (com.vk.newsfeed.common.recycler.holders.i) obj6;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                float f = (floatValue2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0.0f : floatValue / floatValue2;
                if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = 0.83f;
                }
                iVar2.Q.setRatio(f);
                return s3q0.a;
            case 10:
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue5 = ((Integer) obj2).intValue();
                List list = (List) obj6;
                if (list.size() == 1) {
                    List list2 = list;
                    if (list2 instanceof List) {
                        obj5 = j5g.z0(list2);
                    } else {
                        Iterator it = list2.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            throw new IllegalArgumentException("Collection has more than one element.");
                        }
                        obj5 = next;
                    }
                    String str2 = (String) obj5;
                    int K = drm0.K(intValue5, 4, charSequence2, str2, false);
                    if (K >= 0) {
                        pair = new Pair(Integer.valueOf(K), str2);
                        if (pair == null) {
                            return new Pair(pair.i(), Integer.valueOf(((String) pair.j()).length()));
                        }
                        return null;
                    }
                    pair = null;
                    if (pair == null) {
                    }
                } else {
                    if (intValue5 < 0) {
                        intValue5 = 0;
                    }
                    k9x k9xVar = new k9x(intValue5, charSequence2.length(), 1);
                    boolean z = charSequence2 instanceof String;
                    int i6 = k9xVar.d;
                    int i7 = k9xVar.c;
                    if (z) {
                        if ((i6 > 0 && intValue5 <= i7) || (i6 < 0 && i7 <= intValue5)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj4 = it2.next();
                                        String str3 = (String) obj4;
                                        if (str3.regionMatches(0, (String) charSequence2, intValue5, str3.length())) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str4 = (String) obj4;
                                if (str4 != null) {
                                    pair = new Pair(Integer.valueOf(intValue5), str4);
                                } else if (intValue5 != i7) {
                                    intValue5 += i6;
                                }
                            }
                            if (pair == null) {
                            }
                        }
                        pair = null;
                        if (pair == null) {
                        }
                    } else {
                        if ((i6 > 0 && intValue5 <= i7) || (i6 < 0 && i7 <= intValue5)) {
                            int i8 = intValue5;
                            while (true) {
                                Iterator it3 = list.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj3 = it3.next();
                                        String str5 = (String) obj3;
                                        if (drm0.T(str5, 0, charSequence2, i8, str5.length(), false)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str6 = (String) obj3;
                                if (str6 != null) {
                                    pair = new Pair(Integer.valueOf(i8), str6);
                                } else if (i8 != i7) {
                                    i8 += i6;
                                }
                            }
                            if (pair == null) {
                            }
                        }
                        pair = null;
                        if (pair == null) {
                        }
                    }
                }
            case 11:
                jai jaiVar = (jai) obj6;
                androidx.compose.runtime.a aVar11 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar11.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1877733676, intValue6, -1, "com.vk.core.compose.modal.VkComposeModalBottomSheetBuilder.setContent.<anonymous>.<anonymous> (VkComposeModalBottomSheetBuilder.kt:20)");
                    }
                    if (cq.i(0, aVar11, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar11.h();
                }
                return s3q0.a;
            default:
                return apx0.B((apx0) obj6, (androidx.compose.runtime.a) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ aza(izs izsVar, int i) {
        this.b = 1;
        this.c = izsVar;
    }
}
