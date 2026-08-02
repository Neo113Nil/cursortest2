package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.data.AdvertisingOrd;
import com.vk.newsfeed.posting.impl.domain.model.UserType;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AdditionalSettingsContentView.kt */
/* loaded from: classes4.dex */
public final class hr0 extends i6v0<ls0, kq0> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        n((ls0) ao50Var, izsVar, aVar, 512);
    }

    public final void h(final AdvertisingOrd advertisingOrd, final izs<? super kq0, s3q0> izsVar, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        boolean z3;
        long j;
        androidx.compose.runtime.a M = aVar.M(761801749);
        int i2 = (M.J(advertisingOrd) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.l(z2) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i2 |= M.y(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(761801749, i2, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.AdvertiseButton (AdditionalSettingsContentView.kt:265)");
            }
            boolean J = M.J(advertisingOrd.c);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = Boolean.valueOf(epx.f(advertisingOrd.c, Boolean.TRUE));
                M.R(x);
            }
            boolean booleanValue = ((Boolean) x).booleanValue();
            int i3 = booleanValue ? R.string.additional_settings_advertising_ord_on : R.string.additional_settings_advertising_ord_off;
            us2 b = ws2.b(d370.N(R.string.additional_settings_advertising_title, 0, M), M, 0);
            q630 E = ahn.E(q630.a.a, "AdsSetting");
            String N = d370.N(i3, 0, M);
            int i4 = 512 | ((i2 >> 6) & 896);
            if (androidx.compose.runtime.b.d()) {
                z3 = booleanValue;
                androidx.compose.runtime.b.f(-1225408182, i4, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.rememberAdvertiseSubtitle (AdditionalSettingsContentView.kt:305)");
            } else {
                z3 = booleanValue;
            }
            if (z3) {
                M.K(1087040508);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getText().c;
                M.j();
            } else {
                M.K(1087105887);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getText().p;
                M.j();
            }
            boolean J2 = M.J(N) | M.p(j);
            Object x2 = M.x();
            if (J2 || x2 == obj) {
                x2 = zs2.a(N, new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                M.R(x2);
            }
            us2 us2Var = (us2) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z4 = (i2 & 112) == 32;
            Object x3 = M.x();
            if (z4 || x3 == obj) {
                x3 = new tq0(izsVar, 0);
                M.R(x3);
            }
            aVar2 = M;
            qoc0.d(b, E, null, null, us2Var, null, null, null, null, (gzs) x3, null, 0, 0, z || (z2 && z3), aVar2, 48, 0, 7660);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.vq0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    hr0.this.h(advertisingOrd, izsVar, z, z2, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void i(final AdditionalSettingsConfiguration additionalSettingsConfiguration, final izs<? super kq0, s3q0> izsVar, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-1851647931);
        int i2 = (M.J(additionalSettingsConfiguration) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.l(z) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= M.y(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1851647931, i2, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.CommentsPost (AdditionalSettingsContentView.kt:162)");
            }
            boolean z2 = false;
            boolean z3 = !z;
            if ((i2 & 112) == 32) {
                z2 = true;
            }
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new wq0(izsVar, 0);
                M.R(x);
            }
            k(z3, (gzs) x, kai.c(-1186025737, new wzs() { // from class: xsna.xq0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1186025737, intValue, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.CommentsPost.<anonymous> (AdditionalSettingsContentView.kt:167)");
                        }
                        q630 E = ahn.E(q630.a.a, "CommentsSetting");
                        boolean z4 = z;
                        boolean z5 = z4 && additionalSettingsConfiguration.b;
                        String N = d370.N(R.string.additional_settings_comments_title, 0, aVar2);
                        izs izsVar2 = izsVar;
                        boolean J = aVar2.J(izsVar2);
                        Object x2 = aVar2.x();
                        if (J || x2 == a.C0011a.a) {
                            x2 = new uq0(izsVar2, 0);
                            aVar2.R(x2);
                        }
                        zov0.b(z5, N, (izs) x2, E, null, z4, false, aVar2, 3072, 80);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 4480 | (i2 & 7168));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.yq0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hr0.this.i(additionalSettingsConfiguration, izsVar, z, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(is0 is0Var, izs<? super kq0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        is0 is0Var2;
        AdditionalSettingsConfiguration additionalSettingsConfiguration;
        is0 is0Var3;
        AdditionalSettingsConfiguration additionalSettingsConfiguration2;
        hr0 hr0Var;
        izs<? super kq0, s3q0> izsVar2;
        androidx.compose.runtime.a M = aVar.M(1276193858);
        int i2 = i | (M.J(is0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1276193858, i2, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.MainScreen (AdditionalSettingsContentView.kt:100)");
            }
            AdditionalSettingsConfiguration additionalSettingsConfiguration3 = (AdditionalSettingsConfiguration) jk50.c(is0Var.l, M).getValue();
            boolean booleanValue = ((Boolean) jk50.c(is0Var.k, M).getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) jk50.c(is0Var.a, M).getValue()).booleanValue();
            wh50 c = jk50.c(is0Var.b, M);
            wh50 c2 = jk50.c(is0Var.f, M);
            UserType userType = (UserType) jk50.c(is0Var.p, M).getValue();
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c3 = qri.c(M, aVar2);
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
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c3, cri.a.d);
            if ((booleanValue || userType != UserType.WALL_OWNER) && ((booleanValue || userType != UserType.ADMINISTRATOR) && !booleanValue)) {
                M.K(-460521494);
            } else {
                M.K(-455254005);
                i(additionalSettingsConfiguration3, izsVar, booleanValue, M, ((i2 << 3) & 7168) | (i2 & 112) | 4096);
            }
            M.j();
            if (((Boolean) jk50.c(is0Var.c, M).getValue()).booleanValue()) {
                M.K(-455011306);
                int i3 = i2 << 3;
                int i4 = (i2 & 14) | (i3 & 896) | 4096 | (i3 & 7168);
                additionalSettingsConfiguration = additionalSettingsConfiguration3;
                is0Var3 = is0Var;
                l(is0Var3, additionalSettingsConfiguration, izsVar, M, i4);
            } else {
                additionalSettingsConfiguration = additionalSettingsConfiguration3;
                is0Var3 = is0Var;
                M.K(-460521494);
            }
            M.j();
            if (((Boolean) jk50.c(is0Var3.d, M).getValue()).booleanValue()) {
                M.K(-454806892);
                int i5 = i2 << 6;
                AdditionalSettingsConfiguration additionalSettingsConfiguration4 = additionalSettingsConfiguration;
                m(is0Var3, ((Boolean) c2.getValue()).booleanValue(), additionalSettingsConfiguration4, izsVar, M, (i2 & 14) | (i5 & 7168) | 32768 | (i5 & 57344));
                is0Var2 = is0Var3;
                additionalSettingsConfiguration2 = additionalSettingsConfiguration4;
                M = M;
            } else {
                is0Var2 = is0Var3;
                additionalSettingsConfiguration2 = additionalSettingsConfiguration;
                M.K(-460521494);
            }
            M.j();
            if (((Boolean) jk50.c(is0Var2.e, M).getValue()).booleanValue()) {
                M.K(-454573555);
                iec0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, M, s200.E(aVar2, 12, 8));
                izsVar2 = izsVar;
                androidx.compose.runtime.a aVar4 = M;
                hr0Var = this;
                hr0Var.h(additionalSettingsConfiguration2.e, izsVar2, booleanValue2 && !((Boolean) c2.getValue()).booleanValue(), ((Boolean) c.getValue()).booleanValue(), aVar4, (i2 & 112) | 32768 | ((i2 << 6) & 57344));
                M = aVar4;
            } else {
                hr0Var = this;
                izsVar2 = izsVar;
                M.K(-460521494);
            }
            M.j();
            if (((Boolean) jk50.c(is0Var2.o, M).getValue()).booleanValue()) {
                M.K(-453974697);
                int i6 = i2 & 112;
                boolean z = i6 == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new fr0(izsVar2, 0);
                    M.R(x);
                }
                gzs<s3q0> gzsVar = (gzs) x;
                boolean z2 = i6 == 32;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new lq0(izsVar2, 0);
                    M.R(x2);
                }
                hr0Var.o(gzsVar, (gzs) x2, M, (i2 & 896) | 512);
            } else {
                M.K(-460521494);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            is0Var2 = is0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mq0(i, 0, this, is0Var2, izsVar);
        }
    }

    public final void k(boolean z, gzs gzsVar, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-358536818);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-358536818, i2, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.NonClickableOverlay (AdditionalSettingsContentView.kt:318)");
            }
            if (z) {
                M.K(413483548);
                s3q0 s3q0Var = s3q0.a;
                boolean z2 = (i2 & 112) == 32;
                Object x = M.x();
                if (z2 || x == a.C0011a.a) {
                    x = new gr0(gzsVar);
                    M.R(x);
                }
                q630 b = skn0.b(q630.a.a, s3q0Var, (PointerInputEventHandler) x);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, b);
                cri.h7.getClass();
                LayoutNode.a aVar2 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar2);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                jaiVar.invoke(M, Integer.valueOf((i2 >> 6) & 14));
                M.G();
                M.j();
            } else {
                M.K(413944332);
                jaiVar.invoke(M, Integer.valueOf((i2 >> 6) & 14));
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u3(this, z, gzsVar, jaiVar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(is0 is0Var, AdditionalSettingsConfiguration additionalSettingsConfiguration, izs<? super kq0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(888484583);
        int i2 = (M.J(is0Var) ? 4 : 2) | i | (M.J(additionalSettingsConfiguration) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(888484583, i2, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.NotificationsSwitch (AdditionalSettingsContentView.kt:238)");
            }
            boolean booleanValue = ((Boolean) jk50.c(is0Var.j, M).getValue()).booleanValue();
            int i3 = booleanValue ? R.string.additional_settings_notification_community_title : R.string.additional_settings_notification_title;
            int i4 = booleanValue ? R.string.additional_settings_notification_community_subtitle : R.string.additional_settings_notification_subtitle;
            q630 E = ahn.E(q630.a.a, "NotificationSetting");
            boolean z = additionalSettingsConfiguration.d;
            String N = d370.N(i3, 0, M);
            String N2 = d370.N(i4, 0, M);
            boolean z2 = (i2 & 896) == 256;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new rq0(izsVar, 0);
                M.R(x);
            }
            zov0.b(z, N, (izs) x, E, N2, false, false, M, 3072, 96);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sq0(this, is0Var, additionalSettingsConfiguration, izsVar, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(final is0 is0Var, final boolean z, final AdditionalSettingsConfiguration additionalSettingsConfiguration, final izs<? super kq0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        hr0 hr0Var;
        String str;
        androidx.compose.runtime.a M = aVar.M(676175154);
        int i2 = (M.J(is0Var) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.J(additionalSettingsConfiguration) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            hr0Var = this;
            i2 |= M.y(hr0Var) ? 16384 : 8192;
        } else {
            hr0Var = this;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(676175154, i2, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.SignSwitch (AdditionalSettingsContentView.kt:185)");
            }
            boolean booleanValue = ((Boolean) jk50.c(is0Var.g, M).getValue()).booleanValue();
            String str2 = (String) jk50.c(is0Var.h, M).getValue();
            String str3 = (String) jk50.c(is0Var.i, M).getValue();
            if (!additionalSettingsConfiguration.f && z && booleanValue) {
                str = zq.a(M, 1264278701, R.string.additional_settings_no_author_sign, M, 0);
            } else if (drm0.N(str2) || drm0.N(str3)) {
                M.K(538066283);
                M.j();
                str = null;
            } else if (!z || booleanValue) {
                M.K(538492565);
                str = d370.O(R.string.additional_settings_author_sign, new Object[]{d370.O(R.string.additional_settings_author_sign_sign_from, new Object[]{str2, str3}, M)}, M);
                M.j();
            } else {
                M.K(538118829);
                str = d370.O(R.string.additional_settings_author_sign_suggest, new Object[]{d370.O(R.string.additional_settings_author_sign_sign_from, new Object[]{str2, str3}, M)}, M);
                M.j();
            }
            boolean z2 = !additionalSettingsConfiguration.f;
            boolean z3 = (i2 & 7168) == 2048;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new nq0(izsVar, 0);
                M.R(x);
            }
            hr0Var.k(z2, (gzs) x, kai.c(362950976, new oq0(additionalSettingsConfiguration, izsVar, str, 0), M), M, 4480 | ((i2 >> 3) & 7168));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.pq0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hr0.this.m(is0Var, z, additionalSettingsConfiguration, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void n(ls0 ls0Var, izs<? super kq0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2019390771);
        int i2 = i | (M.J(ls0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2019390771, i2, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.ThemedContent (AdditionalSettingsContentView.kt:54)");
            }
            uov0.a(null, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(173109716, new ar0(this, ls0Var, izsVar, 0), M), M, 1572864, 63);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new br0(i, 0, this, ls0Var, izsVar);
        }
    }

    public final void o(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(3341040);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(3341040, i2, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.TurnOnCommentsAlert (AdditionalSettingsContentView.kt:292)");
            }
            String N = d370.N(R.string.additional_settings_turn_on_comments, 0, M);
            String N2 = d370.N(R.string.additional_settings_turn_on_comments_description, 0, M);
            String N3 = d370.N(R.string.additional_settings_turn_on_comments_confirm, 0, M);
            String N4 = d370.N(R.string.additional_settings_turn_on_comments_cancel, 0, M);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new com.vk.im.ui.fragments.b(gzsVar2, 3);
                M.R(x);
            }
            p7u0.e(N, N2, N3, (izs) x, gzsVar, null, N4, null, null, null, null, null, gzsVar2, M, (i2 << 12) & 57344, (i2 << 3) & 896, 4000);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qq0(i, 0, this, gzsVar, gzsVar2);
        }
    }
}
