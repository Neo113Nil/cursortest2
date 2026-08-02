package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.edit.presentation.model.coauthors.CoauthorsBannerVS;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.PlaceholderState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.d16;
import xsna.q630;
import xsna.wrc;
import xsna.xpv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class trc implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ trc(int i, Object obj, izs izsVar) {
        this.b = i;
        this.d = obj;
        this.c = izsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e6  */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        String a;
        int i3;
        int i4;
        int i5;
        boolean J;
        Object x;
        switch (this.b) {
            case 0:
                ksc kscVar = (ksc) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1622824426, intValue, -1, "com.vk.clips.viewer.edit.presentation.compose.coauthos.ClipEditCoauthorsContent.<anonymous>.<anonymous> (ClipEditCoauthosContent.kt:59)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1169978278, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-LockOutline28> (VkSdkIcons.kt:2158)");
                }
                lg90 b = or.b(aVar, -1163098295, R.drawable.vk_icon_lock_outline_28, aVar, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                rw6 f = wp80.f(xpv.a.a(b, ylu0Var.getIcon().n, null, aVar, 24584, 12), 42, null, aVar, 12582960, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                CoauthorsBannerVS b2 = kscVar.b();
                int i6 = b2 == null ? -1 : wrc.a.$EnumSwitchMapping$0[b2.ordinal()];
                String str = "";
                if (i6 == 1) {
                    i = 461160968;
                    i2 = R.string.clips_edit_coauthors_clip_edit_closed_profile_no_coauthors_title;
                } else if (i6 == 2) {
                    i = 461166314;
                    i2 = R.string.clips_edit_coauthors_clip_edit_closed_profile_with_coauthors_title;
                } else if (i6 == 3) {
                    i = 461171750;
                    i2 = R.string.clips_edit_coauthors_clip_edit_closed_group_no_coauthors_title;
                } else if (i6 == 4) {
                    i = 461176968;
                    i2 = R.string.clips_edit_coauthors_clip_edit_closed_group_with_coauthors_title;
                } else if (i6 != 5) {
                    aVar.K(1411841172);
                    aVar.j();
                    a = "";
                    CoauthorsBannerVS b3 = kscVar.b();
                    i3 = b3 != null ? wrc.a.$EnumSwitchMapping$0[b3.ordinal()] : -1;
                    if (i3 != 1 || i3 == 2) {
                        i4 = 461194782;
                        i5 = R.string.clips_edit_coauthors_clip_edit_closed_profile_subtitle;
                    } else if (i3 == 3 || i3 == 4) {
                        i4 = 461202300;
                        i5 = R.string.clips_edit_coauthors_clip_edit_closed_group_subtitle;
                    } else if (i3 != 5) {
                        aVar.K(1412624852);
                        aVar.j();
                        String str2 = str;
                        ButtonStyle buttonStyle = ButtonStyle.Tertiary;
                        ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
                        izs izsVar = this.c;
                        J = aVar.J(izsVar);
                        x = aVar.x();
                        if (!J || x == a.C0011a.a) {
                            x = new vrc(izsVar, 0);
                            aVar.R(x);
                        }
                        beu0.a(d16.b.a(null, a, null, d16.a.C2697a.a(buttonStyle, buttonAppearance, null, str2, null, null, null, null, null, null, null, null, (gzs) x, aVar, 54, 24576, 8180), null, null, null, null, aVar, 100663296, 245), s200.D(q630.a.a, 12), null, null, null, null, null, f, null, null, null, null, aVar, 48, 0, 3964);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        i4 = 461206905;
                        i5 = R.string.clips_edit_coauthors_clip_edit_closed_clip_button;
                    }
                    str = zq.a(aVar, i4, i5, aVar, 0);
                    String str22 = str;
                    ButtonStyle buttonStyle2 = ButtonStyle.Tertiary;
                    ButtonAppearance buttonAppearance2 = ButtonAppearance.Neutral;
                    izs izsVar2 = this.c;
                    J = aVar.J(izsVar2);
                    x = aVar.x();
                    if (!J) {
                    }
                    x = new vrc(izsVar2, 0);
                    aVar.R(x);
                    beu0.a(d16.b.a(null, a, null, d16.a.C2697a.a(buttonStyle2, buttonAppearance2, null, str22, null, null, null, null, null, null, null, null, (gzs) x, aVar, 54, 24576, 8180), null, null, null, null, aVar, 100663296, 245), s200.D(q630.a.a, 12), null, null, null, null, null, f, null, null, null, null, aVar, 48, 0, 3964);
                    if (androidx.compose.runtime.b.d()) {
                    }
                } else {
                    i = 461181784;
                    i2 = R.string.clips_edit_coauthors_clip_edit_closed_clip_title;
                }
                a = zq.a(aVar, i, i2, aVar, 0);
                CoauthorsBannerVS b32 = kscVar.b();
                if (b32 != null) {
                }
                if (i3 != 1) {
                }
                i4 = 461194782;
                i5 = R.string.clips_edit_coauthors_clip_edit_closed_profile_subtitle;
                str = zq.a(aVar, i4, i5, aVar, 0);
                String str222 = str;
                ButtonStyle buttonStyle22 = ButtonStyle.Tertiary;
                ButtonAppearance buttonAppearance22 = ButtonAppearance.Neutral;
                izs izsVar22 = this.c;
                J = aVar.J(izsVar22);
                x = aVar.x();
                if (!J) {
                }
                x = new vrc(izsVar22, 0);
                aVar.R(x);
                beu0.a(d16.b.a(null, a, null, d16.a.C2697a.a(buttonStyle22, buttonAppearance22, null, str222, null, null, null, null, null, null, null, null, (gzs) x, aVar, 54, 24576, 8180), null, null, null, null, aVar, 100663296, 245), s200.D(q630.a.a, 12), null, null, null, null, null, f, null, null, null, null, aVar, 48, 0, 3964);
                if (androidx.compose.runtime.b.d()) {
                }
            default:
                final xvy xvyVar = (xvy) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1598086186, intValue2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.services.<anonymous> (ServicesItem.kt:83)");
                    }
                    final float f2 = 290;
                    q630 a2 = qri.a(q630.a.a, a5x.a, new yzs() { // from class: xsna.uol0
                        @Override // xsna.yzs
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            q630 c;
                            q630 q630Var = (q630) obj4;
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                            int intValue3 = ((Integer) obj6).intValue();
                            aVar3.K(1963076052);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1963076052, intValue3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.fillVisiblePartOfLazyList.<anonymous> (StorefrontServicesUtils.kt:70)");
                            }
                            final azl azlVar = (azl) aVar3.r(uvi.h);
                            final xvy xvyVar2 = xvy.this;
                            boolean J2 = aVar3.J(xvyVar2);
                            Object x2 = aVar3.x();
                            if (J2 || x2 == a.C0011a.a) {
                                final float f3 = f2;
                                x2 = bbk0.b(new gzs() { // from class: xsna.vol0
                                    @Override // xsna.gzs
                                    public final Object invoke() {
                                        xvy xvyVar3 = xvy.this;
                                        if (xvyVar3 == null) {
                                            return null;
                                        }
                                        fvy j = xvyVar3.j();
                                        int a3 = (int) (j.a() & 4294967295L);
                                        List<xuy> f4 = j.f();
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj7 : f4) {
                                            if (!epx.f(((xuy) obj7).getKey(), 52)) {
                                                arrayList.add(obj7);
                                            }
                                        }
                                        Iterator it = arrayList.iterator();
                                        int i7 = 0;
                                        while (it.hasNext()) {
                                            i7 += ((xuy) it.next()).getSize();
                                        }
                                        float j1 = azlVar.j1(a3 - i7);
                                        pco pcoVar = new pco(j1);
                                        if (pco.a(j1, f3) > 0) {
                                            return pcoVar;
                                        }
                                        return null;
                                    }
                                });
                                aVar3.R(x2);
                            }
                            pco pcoVar = (pco) ((mtk0) x2).getValue();
                            if (pcoVar == null || (c = txj0.h(q630Var, pcoVar.b)) == null) {
                                c = txj0.c(q630Var, 1.0f);
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar3.j();
                            return c;
                        }
                    });
                    float f3 = 20;
                    hol0.f(PlaceholderState.Services, a2, null, true, vog0.d(f3, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), this.c, aVar2, 3078, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
