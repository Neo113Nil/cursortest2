package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.mut0;
import xsna.q630;
import xsna.v5v;

/* compiled from: PrivacySettingsContentView.kt */
/* loaded from: classes4.dex */
public final class yed0 extends i6v0<lfd0, wed0> {
    public final ComposeView f;
    public final gec0 g;

    static {
        int i = ComposeView.n;
    }

    public yed0(cfd0 cfd0Var, Context context) {
        super(context, cfd0Var);
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f = composeView;
        this.g = new gec0();
    }

    public static void h(String str, boolean z, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        String O;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1571788736, i, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsContentView.PostTeaserCell (PrivacySettingsContentView.kt:309)");
        }
        if (str == null) {
            aVar.K(-1424584393);
            aVar.j();
            O = null;
        } else {
            aVar.K(-1424584392);
            O = d370.O(R.string.post_teaser_custom_text_prefix, new Object[]{str}, aVar);
            aVar.j();
        }
        String N = d370.N(R.string.post_teaser, 0, aVar);
        a.C0011a.C0012a c0012a = a.C0011a.a;
        boolean z2 = true;
        if (z) {
            aVar.K(-1424398640);
            s8u0 s8u0Var = new s8u0(0);
            s8u0Var.e(N);
            s8u0Var.d(new klv0(VkTypographyToken.Text, VkColorToken.TextPrimaryInvariably), 0, N.length());
            us2 j = s8u0Var.j(8, aVar);
            if ((((i & 896) ^ 384) <= 256 || !aVar.J(izsVar)) && (i & 384) != 256) {
                z2 = false;
            }
            Object x = aVar.x();
            if (z2 || x == c0012a) {
                x = new mse(izsVar, 9);
                aVar.R(x);
            }
            gzs gzsVar = (gzs) x;
            if (O == null) {
                O = zq.a(aVar, 1339542740, R.string.post_teaser_by_default, aVar, 0);
            } else {
                aVar.K(1339542244);
                aVar.j();
            }
            qed0.b(gzsVar, j, O, "PrivacySettingsDonutTeaserCell", aVar, 3072);
            aVar.j();
        } else {
            aVar.K(-1423688337);
            if ((((i & 896) ^ 384) <= 256 || !aVar.J(izsVar)) && (i & 384) != 256) {
                z2 = false;
            }
            Object x2 = aVar.x();
            if (z2 || x2 == c0012a) {
                x2 = new nhf(izsVar, 6);
                aVar.R(x2);
            }
            gzs gzsVar2 = (gzs) x2;
            if (O == null) {
                O = zq.a(aVar, 1339553780, R.string.post_teaser_by_default, aVar, 0);
            } else {
                aVar.K(1339553284);
                aVar.j();
            }
            qed0.a(gzsVar2, N, O, "PrivacySettingsDonutTeaserCell", aVar, 3072, 0);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        m((lfd0) ao50Var, izsVar, aVar, 512);
    }

    @Override // xsna.kk50, xsna.jj50
    public final ComposeView c() {
        return this.f;
    }

    @Override // xsna.kk50
    /* renamed from: e */
    public final ComposeView c() {
        return this.f;
    }

    public final void i(final PrivacyPostType privacyPostType, final boolean z, final boolean z2, final boolean z3, final lcd0 lcd0Var, final izs<? super wed0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        int i3;
        String str;
        androidx.compose.runtime.a M = aVar.M(81460927);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(privacyPostType) : M.y(privacyPostType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(lcd0Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= M.y(izsVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(81460927, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsContentView.PrivacyCell (PrivacySettingsContentView.kt:197)");
            }
            boolean f = epx.f(privacyPostType, PrivacyPostType.BestFriends.b);
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (f) {
                M.K(974552468);
                int i4 = i2 & 458752;
                boolean z4 = i4 == 131072;
                Object x = M.x();
                if (z4 || x == c0012a) {
                    x = new nse(izsVar, 10);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                r14 = i4 == 131072;
                Object x2 = M.x();
                if (r14 || x2 == c0012a) {
                    x2 = new ln7(izsVar, 8);
                    M.R(x2);
                }
                ved0.a(gzsVar, (gzs) x2, z, d370.N(R.string.privacy_settings_visible_best_friends, 0, M), lcd0Var, "PrivacySettingsBestFriendsSelector", M, ((i2 << 3) & 896) | 196608 | (i2 & 57344));
                M = M;
                M.j();
            } else {
                String str2 = null;
                if (privacyPostType instanceof PrivacyPostType.SingleDonutLevel) {
                    M.K(146853081);
                    String N = d370.N(z3 ? R.string.privacy_settings_community_donut_level : R.string.privacy_settings_donut_level, 0, M);
                    DonutLevel donutLevel = ((PrivacyPostType.SingleDonutLevel) privacyPostType).b;
                    if (donutLevel == null) {
                        M.K(147121447);
                    } else {
                        M.K(147121448);
                        str2 = d370.O(R.string.privacy_settings_donut_level_and_higher, new Object[]{donutLevel.c}, M);
                    }
                    M.j();
                    boolean z5 = (458752 & i2) == 131072;
                    if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !M.y(privacyPostType))) {
                        r14 = false;
                    }
                    boolean z6 = z5 | r14;
                    Object x3 = M.x();
                    if (z6 || x3 == c0012a) {
                        x3 = new kg(22, izsVar, privacyPostType);
                        M.R(x3);
                    }
                    qed0.c((i2 & 112) | 24576, M, N, str2, "PrivacySettingsSingleDonutLevelButton", (gzs) x3, z);
                    M.j();
                } else {
                    M.K(147703411);
                    PrivacyPostType.AllUsers allUsers = PrivacyPostType.AllUsers.b;
                    String str3 = "";
                    if (epx.f(privacyPostType, allUsers)) {
                        M.K(974597520);
                        if (z2) {
                            i3 = 458752;
                            str = zq.a(M, 147764915, R.string.privacy_settings_visible_all_users, M, 0);
                        } else {
                            i3 = 458752;
                            str = zq.a(M, 147881785, R.string.privacy_settings_visible_all, M, 0);
                        }
                        M.j();
                    } else {
                        i3 = 458752;
                        if (epx.f(privacyPostType, PrivacyPostType.FriendsOnly.b)) {
                            str = zq.a(M, 974606749, R.string.privacy_settings_visible_friends, M, 0);
                        } else if (epx.f(privacyPostType, PrivacyPostType.AllDonuts.b)) {
                            str = zq.a(M, 974610328, R.string.privacy_settings_all_donuts, M, 0);
                        } else {
                            M.K(148232703);
                            M.j();
                            str = "";
                        }
                    }
                    if (!(privacyPostType instanceof PrivacyPostType.AllUsers) || z2) {
                        M.K(148473079);
                        M.j();
                    } else {
                        str2 = zq.a(M, 148352365, R.string.privacy_settings_visible_all_content_description, M, 0);
                    }
                    if (epx.f(privacyPostType, allUsers)) {
                        str3 = "PrivacySettingsAllSelector";
                    } else if (epx.f(privacyPostType, PrivacyPostType.FriendsOnly.b)) {
                        str3 = "PrivacySettingsFriendsSelector";
                    } else if (epx.f(privacyPostType, PrivacyPostType.AllDonuts.b)) {
                        str3 = "PrivacySettingsAllDonutsSelector";
                    }
                    boolean z7 = (i2 & i3) == 131072;
                    if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !M.y(privacyPostType))) {
                        r14 = false;
                    }
                    boolean z8 = z7 | r14;
                    Object x4 = M.x();
                    if (z8 || x4 == c0012a) {
                        x4 = new yk(11, izsVar, privacyPostType);
                        M.R(x4);
                    }
                    sed0.a(i2 & 112, M, str, str3, str2, (gzs) x4, z);
                    M.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xed0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yed0.this.i(privacyPostType, z, z2, z3, lcd0Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void j(ifd0 ifd0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        yed0 yed0Var;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-54745441);
        int i2 = i | (M.J(ifd0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384 | (M.y(this) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-54745441, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsContentView.PrivacyContent (PrivacySettingsContentView.kt:128)");
            }
            q630Var2 = q630.a.a;
            q630 D = p490.D(txj0.B(q630Var2, null, 3), p490.x(M), 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            com.vk.core.compose.component.group.header.g.b(f.a.a(d370.N(R.string.privacy_settings_menu_description, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510), txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 46, 1, txj0.f(q630Var2, 1.0f)), b.d.a, null, null, null, true, M, 1573296, 56);
            aVar2 = M;
            int i3 = i2 << 3;
            int i4 = ComposeView.n;
            int i5 = (i2 & 7168) | (i3 & 896) | (i3 & 112) | 6 | 4096;
            yed0Var = this;
            yed0Var.k(ifd0Var, izsVar, aVar2, i5);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            yed0Var = this;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new vmo(yed0Var, ifd0Var, izsVar, q630Var2, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(ifd0 ifd0Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        izs izsVar2;
        int i2;
        boolean z;
        int i3;
        a.C0011a.C0012a c0012a;
        int i4;
        boolean z2;
        boolean z3;
        izs izsVar3 = izsVar;
        androidx.compose.runtime.a M = aVar.M(-1670802934);
        int i5 = (i & 48) == 0 ? (M.J(ifd0Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i5 |= M.y(izsVar3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= M.y(this) ? 2048 : 1024;
        }
        int i6 = i5;
        if (M.t(i6 & 1, (i6 & 1169) != 1168)) {
            char c = 65535;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1670802934, i6, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsContentView.PrivacySelectorList (PrivacySettingsContentView.kt:154)");
            }
            wh50 c2 = jk50.c(ifd0Var.a, M);
            wh50 c3 = jk50.c(ifd0Var.b, M);
            M.K(676164887);
            List<PrivacyPostType> list = ((PostPrivacyData) c2.getValue()).e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                PrivacyPostType.AllDonuts allDonuts = PrivacyPostType.AllDonuts.b;
                if (!epx.f((PrivacyPostType) obj, allDonuts) || ((PostPrivacyData) c2.getValue()).c || ((PostPrivacyData) c2.getValue()).d.equals(allDonuts)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                PrivacyPostType privacyPostType = (PrivacyPostType) it.next();
                boolean f = epx.f(privacyPostType, ((PostPrivacyData) c2.getValue()).d);
                boolean z4 = ((PostPrivacyData) c2.getValue()).b;
                if (((PostPrivacyData) c2.getValue()).c || ((PostPrivacyData) c2.getValue()).d.equals(PrivacyPostType.AllDonuts.b)) {
                    z2 = z4;
                    z3 = false;
                } else {
                    z2 = z4;
                    z3 = true;
                }
                lcd0 lcd0Var = (lcd0) c3.getValue();
                int i7 = i6 << 9;
                int i8 = ComposeView.n;
                androidx.compose.runtime.a aVar2 = M;
                izs izsVar4 = izsVar3;
                i(privacyPostType, f, z2, z3, lcd0Var, izsVar4, aVar2, (i7 & 458752) | 2097152 | (i7 & 3670016));
                izsVar3 = izsVar4;
                M = aVar2;
                c = 65535;
            }
            izsVar2 = izsVar3;
            M.j();
            if (x19.G(((PostPrivacyData) c2.getValue()).d)) {
                M.K(-513241970);
                float f2 = 16;
                q630.a aVar3 = q630.a.a;
                iec0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, M, s200.G(aVar3, f2, 5, f2, 6));
                androidx.compose.runtime.a aVar4 = M;
                M = aVar4;
                com.vk.core.compose.component.group.header.g.b(f.a.a(d370.N(R.string.privacy_settings_subtitle_without_access, 0, M), null, null, null, null, null, null, null, false, aVar4, 805306368, 510), txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 46, 1, txj0.f(aVar3, 1.0f)), b.d.a, null, null, null, false, M, Tensorflow.FRAME_WIDTH, 120);
                String str = ((PostPrivacyData) c2.getValue()).h;
                boolean z5 = ((PostPrivacyData) c2.getValue()).i;
                int i9 = i6 & 896;
                int i10 = ComposeView.n;
                int i11 = i9 | 4096 | (i6 & 7168);
                if (androidx.compose.runtime.b.d()) {
                    i2 = -1;
                    androidx.compose.runtime.b.f(1433904781, i11, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsContentView.PostTeaserCellWithHint (PrivacySettingsContentView.kt:281)");
                } else {
                    i2 = -1;
                }
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                String str2 = null;
                if (z5) {
                    M.K(-287131433);
                    String N = d370.N(R.string.post_teaser, 0, M);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c4 = qri.c(M, aVar3);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c4, cri.a.d);
                    Object x = M.x();
                    if (x == c0012a2) {
                        bpn0 bpn0Var = v5v.c;
                        x = v5v.a.a("<u>" + N + "</u>");
                        M.R(x);
                    }
                    v5v v5vVar = (v5v) x;
                    q630 H = s200.H(aVar3, 17, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                    c0012a = c0012a2;
                    i4 = -1;
                    i3 = 8;
                    d8v0.a(v5vVar.b, H, null, VkOnboarding$TintColor.Lime, false, false, true, null, kai.c(457662544, new sbh(v5vVar, 1), M), M, 806882352, 436);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    z = true;
                    h(str, !ylu0Var.s(), izsVar2, M, (i11 & 7168) | (i11 & 910) | 4096);
                    M.G();
                    M.j();
                } else {
                    z = true;
                    i3 = 8;
                    c0012a = c0012a2;
                    i4 = i2;
                    M.K(-286171208);
                    h(str, false, izsVar2, M, (i11 & 7168) | (i11 & 896) | 4144);
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Date date = ((PostPrivacyData) c2.getValue()).g;
                int i12 = i6 >> 3;
                int i13 = (i12 & 896) | (i12 & 112) | 512;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-428945748, i13, i4, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsContentView.OpenForAllTimePickerCell (PrivacySettingsContentView.kt:265)");
                }
                boolean z6 = ((((i13 & 112) ^ 48) <= 32 || !M.J(izsVar2)) && (i13 & 48) != 32) ? false : z;
                Object x2 = M.x();
                if (z6 || x2 == c0012a) {
                    x2 = new z8c(izsVar2, i3);
                    M.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                String N2 = d370.N(R.string.open_post_for_all, 0, M);
                if (date == null) {
                    M.K(-1194715017);
                } else {
                    M.K(-1194715016);
                    Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                    this.g.getClass();
                    str2 = gec0.a(context, date);
                }
                M.j();
                if (str2 == null) {
                    str2 = zq.a(M, 100011220, R.string.never_open, M, 0);
                } else {
                    M.K(100007779);
                    M.j();
                }
                qed0.a(gzsVar, N2, str2, null, M, 0, 8);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.K(-520080136);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar3;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uhg(i, 2, this, ifd0Var, izsVar2);
        }
    }

    public final void l(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1824101256);
        int i2 = i | (M.y(izsVar) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1824101256, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsContentView.PrivacyTopBar (PrivacySettingsContentView.kt:98)");
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.privacy_settings_toolbar_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-218864772, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel28> (VkSdkIcons.kt:236)");
            }
            lg90 b = or.b(M, -439898899, R.drawable.vk_icon_cancel_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.previous_step_talkback_title, 0, M);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new nq0(izsVar, 5);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new gz30(10);
                M.R(x2);
            }
            aVar2 = M;
            TopBar$Before.e a2 = TopBar$Before.e.a.a(b, N, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2), aVar2, 1572872, 24);
            q630.a aVar3 = q630.a.a;
            muv0.h(a, ahn.E(aVar3, "PrivacySettingsToolbar"), null, null, null, a2, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 1572864, 0, 8092);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new fc0(this, izsVar, q630Var2, i, 4);
        }
    }

    public final void m(lfd0 lfd0Var, izs<? super wed0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-363764900);
        int i2 = i | (M.J(lfd0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-363764900, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsContentView.ThemedContent (PrivacySettingsContentView.kt:75)");
            }
            uov0.a(null, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1381117795, new mt(this, lfd0Var, izsVar, 7), M), M, 1572864, 63);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jqc(i, 2, this, lfd0Var, izsVar);
        }
    }
}
