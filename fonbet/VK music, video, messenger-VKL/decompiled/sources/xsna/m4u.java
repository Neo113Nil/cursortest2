package xsna;

import android.content.Context;
import android.text.SpannedString;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.toggle.features.SoccomFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.q8z;
import xsna.us2;

/* compiled from: GoodDescriptionContent.kt */
/* loaded from: classes18.dex */
public final class m4u {
    public static final void a(final Object obj, final n4u n4uVar, final boolean z, final gzs gzsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        boolean z2;
        int i2;
        q630.a aVar2;
        String str;
        int i3;
        int i4;
        q630.a aVar3;
        int i5;
        int i6 = n4uVar.d;
        CharSequence charSequence = n4uVar.a;
        androidx.compose.runtime.a M = aVar.M(-380578149);
        int i7 = i | (M.J(obj) ? 4 : 2) | (M.J(n4uVar) ? 32 : 16) | (M.l(z) ? 256 : 128);
        if (M.t(i7 & 1, (i7 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-380578149, i7, -1, "com.vk.ecomm.market.good.ui.holder.description.ui.GoodDescriptionContent (GoodDescriptionContent.kt:32)");
            }
            SoccomFeatures soccomFeatures = SoccomFeatures.PRODUCT_CARD_RATING;
            soccomFeatures.getClass();
            boolean a = com.vk.toggle.b.A.a(soccomFeatures);
            q630 E = s200.E(txj0.f(q630Var, 1.0f), kqu0.b, kqu0.v);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar5 = q630.a.a;
            if (charSequence == null || drm0.N(charSequence)) {
                z2 = a;
                i2 = i7;
                aVar2 = aVar5;
                str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                i3 = -473561179;
                i4 = -1592329443;
                M.K(-1592329443);
            } else {
                M.K(-1590678507);
                String O = d370.O(R.string.good_ext_info_sku_template, new Object[]{charSequence.toString()}, M);
                q630 H = s200.H(txj0.f(aVar5, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 7);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().p;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = aVar5;
                z2 = a;
                i3 = -473561179;
                str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                i2 = i7;
                i4 = -1592329443;
                yqv0.c(O, H, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.s0, M, 0, 0, 8184);
                M = M;
            }
            M.j();
            if (z2) {
                M.K(-1590267075);
                String str2 = n4uVar.e;
                String str3 = n4uVar.f;
                q630.a aVar6 = aVar2;
                q630 H2 = s200.H(aVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 7);
                aVar3 = aVar6;
                if (androidx.compose.runtime.b.d()) {
                    i5 = -1;
                    androidx.compose.runtime.b.f(i3, 0, -1, str);
                } else {
                    i5 = -1;
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                db10.a(str2, str3, wuv0Var2.J, H2, M, 0);
            } else {
                aVar3 = aVar2;
                i5 = -1;
                M.K(i4);
            }
            M.j();
            sdz sdzVar = (sdz) obj;
            CharSequence charSequence2 = n4uVar.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(254736786, 0, i5, "com.vk.ecomm.market.good.ui.holder.description.ui.parseLinksAndEmojiToAnnotated (linkParserExt.kt:21)");
            }
            final Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            final View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            boolean J = M.J(context) | M.J(view) | M.J(charSequence2);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                ucp ucpVar = ucp.a;
                SpannedString valueOf = SpannedString.valueOf(ucp.i(sdzVar.m(charSequence2)));
                qjc[] qjcVarArr = (qjc[]) valueOf.getSpans(0, drm0.H(valueOf), qjc.class);
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb.append(valueOf.toString());
                int length = qjcVarArr.length;
                int i8 = 0;
                while (i8 < length) {
                    final qjc qjcVar = qjcVarArr[i8];
                    arrayList.add(new us2.b.a(valueOf.getSpanStart(qjcVar), valueOf.getSpanEnd(qjcVar), 8, new q8z.a(qjg.a(qjcVar), new tjo0(new hik0(f870.c(qjcVar.getColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), (hik0) null, (hik0) null, 14), new i9z() { // from class: xsna.caz
                        @Override // xsna.i9z
                        public final void a(q8z q8zVar) {
                            qjc.this.f(context, view);
                        }
                    })));
                    i8++;
                    qjcVarArr = qjcVarArr;
                    sb = sb;
                    length = length;
                    valueOf = valueOf;
                }
                StringBuilder sb2 = sb;
                String sb3 = sb2.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    arrayList2.add(((us2.b.a) arrayList.get(i9)).a(sb2.length()));
                }
                x = new us2(sb3, arrayList2);
                M.R(x);
            }
            us2 us2Var = (us2) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            androidx.compose.runtime.a aVar7 = M;
            q630.a aVar8 = aVar3;
            psu0.e(us2Var, z, gzsVar, txj0.f(ahn.E(aVar3, "product_card_description_text"), 1.0f), 0L, null, wlb0.l(M).e0, wlb0.h(M).getText().m, 3, 0, null, null, 0L, null, false, null, aVar7, ((i2 >> 3) & 112) | 100666752, 0, 65072);
            M = aVar7;
            M.K(-1159649955);
            StringBuilder sb4 = new StringBuilder();
            int i10 = n4uVar.c;
            if (i10 >= 0) {
                sb4.append(pvo0.i(true, i10, false, false));
            }
            if (i6 >= 0) {
                M.K(376884615);
                if (sb4.length() > 0) {
                    sb4.append(" · ");
                }
                sb4.append(d370.F(R.plurals.video_views, i6, new Object[]{Integer.valueOf(i6)}, M, 0));
            } else {
                M.K(-1204597607);
            }
            M.j();
            String sb5 = sb4.toString();
            M.j();
            if (sb5.length() > 0) {
                M.K(-1588883328);
                yqv0.c(sb5, s200.H(aVar8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).s0, M, 0, 0, 8184);
                M = M;
            } else {
                M.K(-1592329443);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(obj, n4uVar, z, gzsVar, q630Var, i) { // from class: xsna.l4u
                public final /* synthetic */ Object b;
                public final /* synthetic */ n4u c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(27649);
                    m4u.a(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }
}
