package xsna;

import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.donut.DonutLevel;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.libvideo.bottomsheet.about.delegate.e;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;
import com.vkontakte.android.fragments.videos.VideosFragment;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import xsna.aoj0;
import xsna.bdc0;
import xsna.hc5;
import xsna.i6w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class y5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        char c;
        char c2;
        char c3 = 7;
        ohi0<? super s3q0> ohi0Var = null;
        us2 a = null;
        ohi0Var = null;
        ohi0Var = null;
        ohi0Var = null;
        switch (this.b) {
            case 0:
                e.a aVar = (e.a) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-407890849, intValue, -1, "com.vk.libvideo.bottomsheet.about.delegate.AboutVideoCounterVkUiDelegate.ViewHolder.<anonymous> (AboutVideoCounterVkUiDelegate.kt:75)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(1992237762, new z5(aVar, r7), aVar2), aVar2, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                wv7.d((izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                Set set = (Set) obj2;
                set.addAll((Collection) ((Map.Entry) this.c).getValue());
                return set;
            case 3:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
                String[] strArr = DebugDevSettingsFragment.t0;
                String charSequence = ((CharSequence) obj2).toString();
                r7 = charSequence.isEmpty() ? 0 : Integer.parseInt(charSequence);
                o2l.a.getClass();
                o2l.i(r7, "__dbg_music_ad_banner_test_slot_id");
                debugDevSettingsFragment.findPreference("__dbg_music_ad_banner_test_slot_id").I(r7 == 0 ? "Slot id" : lhg.a(r7, ""));
                return null;
            case 4:
                ((p7w) this.c).d.invoke(new i6w.v((DialogExt) obj, (lse0) obj2));
                return s3q0.a;
            case 5:
                bdc0 bdc0Var = (bdc0) this.c;
                vcc0 vcc0Var = (vcc0) obj;
                FragmentActivity fragmentActivity = (FragmentActivity) obj2;
                bdc0Var.e = vcc0Var;
                sk3<bdc0.a> sk3Var = bdc0Var.d;
                bdc0.a g = sk3Var.g();
                if (g != null) {
                    g.a().dismiss();
                }
                hc5 hc5Var = (hc5) new hc5.a(fragmentActivity, vcc0Var.b, vcc0Var.a, new wd3(22, bdc0Var, fragmentActivity), new t440(bdc0Var, 13)).a();
                hc5Var.k1 = new mi10(bdc0Var, 14);
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                sk3Var.addLast(new bdc0.a.C2605a(hc5Var));
                hc5Var.Td(supportFragmentManager, "author_selection_bottom_sheet_mvi");
                return s3q0.a;
            case 6:
                ListLoadingState listLoadingState = (ListLoadingState) obj2;
                SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = ((PostponedPostsFragment) this.c).a0;
                if (swipeDrawableRefreshLayout != null) {
                    swipeDrawableRefreshLayout.setRefreshing(listLoadingState == ListLoadingState.REFRESHING);
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                nud0.h((ut9) this.c, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 8:
                PublishFragment publishFragment = (PublishFragment) this.c;
                qcy<Object>[] qcyVarArr = PublishFragment.Q;
                publishFragment.fo().b(new mbe0((PrivacySetting) obj, (DonutLevel) obj2));
                return s3q0.a;
            case 9:
                aoj0.a aVar3 = (aoj0.a) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1965775684, intValue2, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.SimilarSliderEmptyDelegate.ViewHolder.<anonymous>.<anonymous> (SimilarSliderEmptyDelegate.kt:53)");
                    }
                    boj0.a(aVar3.m, aVar3.n, aVar3.l, aVar4, 3072);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 10:
                hwj0 hwj0Var = (hwj0) this.c;
                Set set2 = (Set) obj;
                synchronized (hwj0Var.a) {
                    try {
                        qh50<Object> qh50Var = hwj0Var.d;
                        if (qh50Var != null) {
                            Object[] objArr = qh50Var.b;
                            long[] jArr = qh50Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i = 0;
                                while (true) {
                                    long j = jArr[i];
                                    if ((((~j) << c3) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i2 = 8 - ((~(i - length)) >>> 31);
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 < i2) {
                                                if ((j & 255) < 128) {
                                                    c2 = c3;
                                                    if (set2.contains(objArr[(i << 3) + i3])) {
                                                        ohi0Var = hwj0Var.f;
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j >>= 8;
                                                i3++;
                                                c3 = c2;
                                            } else {
                                                c = c3;
                                                if (i2 == 8) {
                                                }
                                            }
                                        }
                                    } else {
                                        c = c3;
                                    }
                                    if (i != length) {
                                        i++;
                                        c3 = c;
                                    }
                                }
                            }
                        } else if (j5g.P(set2, hwj0Var.b)) {
                            ohi0Var = hwj0Var.f;
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (ohi0Var != null) {
                    ohi0Var.f(s3q0.a);
                }
                return s3q0.a;
            case 11:
                DonutVideoUiModel.DescriptionChip descriptionChip = (DonutVideoUiModel.DescriptionChip) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                aVar5.K(-584612182);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-584612182, intValue3, -1, "com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletViewStateMapper.map.<anonymous>.<anonymous> (VideoLargeListTabletViewStateMapper.kt:64)");
                }
                DonutPriceTemplate donutPriceTemplate = descriptionChip.c;
                if (donutPriceTemplate == null) {
                    aVar5.K(-89082770);
                } else {
                    aVar5.K(828410355);
                    a = z1o.a(donutPriceTemplate, m4s.B(aVar5), aVar5, 0);
                }
                aVar5.j();
                if (a == null) {
                    aVar5.K(828415077);
                    a = ws2.b(descriptionChip.b, aVar5, 0);
                    aVar5.j();
                } else {
                    aVar5.K(828409776);
                    aVar5.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return a;
            case 12:
                VideosFragment videosFragment = (VideosFragment) this.c;
                EditText editText = (EditText) obj;
                videosFragment.x0 = (TextView) obj2;
                editText.addTextChangedListener(videosFragment.y0);
                editText.setMinLines(1);
                return null;
            default:
                jai jaiVar = (jai) this.c;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-289015202, intValue4, -1, "com.vk.mvi.integration.VkComposeThemeProvider.Theme.<anonymous> (VkComposeThemeProvider.kt:11)");
                    }
                    if (cq.i(0, aVar6, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ y5(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
