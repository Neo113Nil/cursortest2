package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;

/* compiled from: AuthorHeaderInfoContent.kt */
/* loaded from: classes5.dex */
public final class k95 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v21, types: [xsna.x3] */
    /* JADX WARN: Type inference failed for: r7v39, types: [xsna.rq3] */
    /* JADX WARN: Type inference failed for: r7v48, types: [xsna.ryp] */
    /* JADX WARN: Type inference failed for: r7v57, types: [xsna.mfp] */
    /* JADX WARN: Type inference failed for: r7v66, types: [xsna.yog] */
    /* JADX WARN: Type inference failed for: r7v75, types: [xsna.esp0] */
    /* JADX WARN: Type inference failed for: r7v85, types: [xsna.paz] */
    public static final void a(final AuthorHeaderConfig.Info info, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        ArrayList arrayList;
        dq0 dq0Var;
        dlk dlkVar;
        androidx.compose.runtime.a M = aVar.M(-1964657084);
        int i2 = (i & 6) == 0 ? (M.J(r9g.a) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= M.J(info) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1964657084, i2, -1, "com.vk.profile.design.compose.header.content.BuildDynamicSlots (AuthorHeaderInfoContent.kt:104)");
            }
            List<AuthorHeaderConfig.Info.InfoSlotData> u0 = rl3.u0(new AuthorHeaderConfig.Info.InfoSlotData[]{info.c, info.d, info.e, info.f});
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2) {
                M.K(-1579515460);
                arrayList = new ArrayList();
                for (AuthorHeaderConfig.Info.InfoSlotData infoSlotData : u0) {
                    int i3 = (i2 >> 3) & 112;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1439229722, i3, -1, "com.vk.profile.design.compose.header.content.resolveSlotForCommunity (AuthorHeaderInfoContent.kt:151)");
                    }
                    if (infoSlotData instanceof AuthorHeaderConfig.Info.InfoSlotData.h) {
                        M.K(-565632636);
                        AuthorHeaderConfig.Info.InfoSlotData.h hVar = (AuthorHeaderConfig.Info.InfoSlotData.h) infoSlotData;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(656855144, 48, -1, "com.vk.profile.design.compose.header.info.AuthorHeaderInfoSlot.Info.LinkSlot.Companion.invoke (AuthorHeaderInfoSlot.kt:90)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1023489881, 0, -1, "com.vk.profile.design.compose.header.info.rememberLinkSlot (LinkSlotImpl.kt:54)");
                        }
                        Object x = M.x();
                        if (x == c0012a) {
                            x = new paz(hVar);
                            M.R(x);
                        }
                        ?? r7 = (paz) x;
                        ((zak0) r7.a).setValue(hVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        dlkVar = r7;
                    } else if (infoSlotData instanceof AuthorHeaderConfig.Info.InfoSlotData.TrustTag) {
                        M.K(-565503552);
                        AuthorHeaderConfig.Info.InfoSlotData.TrustTag trustTag = (AuthorHeaderConfig.Info.InfoSlotData.TrustTag) infoSlotData;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-689999296, 48, -1, "com.vk.profile.design.compose.header.info.AuthorHeaderInfoSlot.Info.TrustTagSlot.Companion.invoke (AuthorHeaderInfoSlot.kt:98)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1398551383, 0, -1, "com.vk.profile.design.compose.header.info.rememberTrustTagSlot (TrustTagSlotImpl.kt:114)");
                        }
                        Object x2 = M.x();
                        if (x2 == c0012a) {
                            x2 = new esp0(trustTag);
                            M.R(x2);
                        }
                        ?? r72 = (esp0) x2;
                        ((zak0) r72.a).setValue(trustTag);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        dlkVar = r72;
                    } else if (infoSlotData instanceof AuthorHeaderConfig.Info.InfoSlotData.a) {
                        M.K(-565364362);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1848735102, 6, -1, "com.vk.profile.design.compose.header.info.AuthorHeaderInfoSlot.Info.AboutProfileInfoSlot.Community.Companion.invoke (AuthorHeaderInfoSlot.kt:74)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1546064057, 0, -1, "com.vk.profile.design.compose.header.info.rememberAboutCommunitySlot (CommunityAboutProfileInfoSlotImpl.kt:46)");
                        }
                        Object x3 = M.x();
                        if (x3 == c0012a) {
                            x3 = new yog();
                            M.R(x3);
                        }
                        ?? r73 = (yog) x3;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        dlkVar = r73;
                    } else if (infoSlotData instanceof AuthorHeaderConfig.Info.InfoSlotData.f) {
                        M.K(-565216957);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1385686078, 6, -1, "com.vk.profile.design.compose.header.info.AuthorHeaderInfoSlot.Info.EmptyContactsSlot.Companion.invoke (AuthorHeaderInfoSlot.kt:105)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1200796967, 0, -1, "com.vk.profile.design.compose.header.info.rememberEmptyContactsSlot (EmptyContactsSlotImpl.kt:43)");
                        }
                        Object x4 = M.x();
                        if (x4 == c0012a) {
                            x4 = new mfp();
                            M.R(x4);
                        }
                        ?? r74 = (mfp) x4;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        dlkVar = r74;
                    } else if (infoSlotData instanceof AuthorHeaderConfig.Info.InfoSlotData.g) {
                        M.K(-565085889);
                        AuthorHeaderConfig.Info.InfoSlotData.g gVar = (AuthorHeaderConfig.Info.InfoSlotData.g) infoSlotData;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-468928598, 48, -1, "com.vk.profile.design.compose.header.info.AuthorHeaderInfoSlot.Info.EventDateSlot.Companion.invoke (AuthorHeaderInfoSlot.kt:113)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(745194847, 0, -1, "com.vk.profile.design.compose.header.info.rememberEventDateSlot (EventDateSlotImpl.kt:51)");
                        }
                        Object x5 = M.x();
                        if (x5 == c0012a) {
                            x5 = new ryp(gVar);
                            M.R(x5);
                        }
                        ?? r75 = (ryp) x5;
                        ((zak0) r75.a).setValue(gVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        dlkVar = r75;
                    } else if (infoSlotData instanceof AuthorHeaderConfig.Info.InfoSlotData.d) {
                        M.K(-564949954);
                        AuthorHeaderConfig.Info.InfoSlotData.d dVar = (AuthorHeaderConfig.Info.InfoSlotData.d) infoSlotData;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-240354709, 48, -1, "com.vk.profile.design.compose.header.info.AuthorHeaderInfoSlot.Info.ArtistCardSlot.Companion.invoke (AuthorHeaderInfoSlot.kt:120)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1934984333, 0, -1, "com.vk.profile.design.compose.header.info.rememberArtistCardSlot (ArtistCardSlotImpl.kt:53)");
                        }
                        Object x6 = M.x();
                        if (x6 == c0012a) {
                            x6 = new rq3(dVar);
                            M.R(x6);
                        }
                        ?? r76 = (rq3) x6;
                        ((zak0) r76.a).setValue(dVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        dlkVar = r76;
                    } else if (infoSlotData instanceof AuthorHeaderConfig.Info.InfoSlotData.e) {
                        M.K(-564812035);
                        AuthorHeaderConfig.Info.InfoSlotData.e eVar = (AuthorHeaderConfig.Info.InfoSlotData.e) infoSlotData;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-345628336, 48, -1, "com.vk.profile.design.compose.header.info.AuthorHeaderInfoSlot.Info.CuratorCardSlot.Companion.invoke (AuthorHeaderInfoSlot.kt:127)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1808409819, 0, -1, "com.vk.profile.design.compose.header.info.rememberCuratorCardSlot (CuratorCardSlotImpl.kt:53)");
                        }
                        Object x7 = M.x();
                        if (x7 == c0012a) {
                            x7 = new dlk(eVar);
                            M.R(x7);
                        }
                        dlk dlkVar2 = (dlk) x7;
                        ((zak0) dlkVar2.a).setValue(eVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        dlkVar = dlkVar2;
                    } else {
                        M.K(-564721981);
                        M.j();
                        dlkVar = null;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (dlkVar != null) {
                        arrayList.add(dlkVar);
                    }
                }
                M.j();
            } else {
                M.K(-1579412633);
                arrayList = new ArrayList();
                for (AuthorHeaderConfig.Info.InfoSlotData infoSlotData2 : u0) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1353723980, 0, -1, "com.vk.profile.design.compose.header.content.resolveSlotForProfile (AuthorHeaderInfoContent.kt:133)");
                    }
                    if (infoSlotData2 instanceof AuthorHeaderConfig.Info.InfoSlotData.b) {
                        M.K(952047655);
                        AuthorHeaderConfig.Info.InfoSlotData.b bVar = (AuthorHeaderConfig.Info.InfoSlotData.b) infoSlotData2;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-766487829, 48, -1, "com.vk.profile.design.compose.header.info.AuthorHeaderInfoSlot.Info.AboutProfileInfoSlot.Profile.Companion.invoke (AuthorHeaderInfoSlot.kt:67)");
                        }
                        uog0 uog0Var = y3.a;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(957721593, 0, -1, "com.vk.profile.design.compose.header.info.rememberAboutProfileInfoSlot (AboutProfileInfoSlotImpl.kt:205)");
                        }
                        Object x8 = M.x();
                        if (x8 == c0012a) {
                            x8 = new x3(bVar);
                            M.R(x8);
                        }
                        ?? r13 = (x3) x8;
                        ((zak0) r13.a).setValue(bVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        dq0Var = r13;
                    } else if (infoSlotData2 instanceof AuthorHeaderConfig.Info.InfoSlotData.c) {
                        M.K(952218062);
                        AuthorHeaderConfig.Info.InfoSlotData.c cVar = (AuthorHeaderConfig.Info.InfoSlotData.c) infoSlotData2;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1660287392, 48, -1, "com.vk.profile.design.compose.header.info.AuthorHeaderInfoSlot.Info.AdditionalInfoSlot.Companion.invoke (AuthorHeaderInfoSlot.kt:83)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-20247090, 0, -1, "com.vk.profile.design.compose.header.info.rememberAdditionalInfoSlot (AdditionalInfoSlotImpl.kt:50)");
                        }
                        Object x9 = M.x();
                        if (x9 == c0012a) {
                            x9 = new dq0(cVar);
                            M.R(x9);
                        }
                        dq0 dq0Var2 = (dq0) x9;
                        ((zak0) dq0Var2.a).setValue(cVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        dq0Var = dq0Var2;
                    } else {
                        M.K(952328297);
                        M.j();
                        dq0Var = null;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (dq0Var != null) {
                        arrayList.add(dq0Var);
                    }
                }
                M.j();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d((l95) it.next(), M, i2 & 14);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.g95
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    k95.a(AuthorHeaderConfig.Info.this, z, z2, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final boolean z, final AuthorHeaderConfig.Info.a aVar, androidx.compose.runtime.a aVar2, final int i) {
        rfp rfpVar;
        androidx.compose.runtime.a M = aVar2.M(-2043763832);
        int i2 = (M.l(z) ? 32 : 16) | i | (M.J(aVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2043763832, i2, -1, "com.vk.profile.design.compose.header.content.DescriptionSlot (AuthorHeaderInfoContent.kt:76)");
            }
            boolean z2 = aVar instanceof AuthorHeaderConfig.Info.a.b;
            Object obj = a.C0011a.a;
            if (z2) {
                M.K(-311675140);
                CharSequence charSequence = ((AuthorHeaderConfig.Info.a.b) aVar).a;
                int i3 = (i2 & 112) | 384;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1761547069, i3, -1, "com.vk.profile.design.compose.header.info.AuthorHeaderInfoSlot.DescriptionSlot.FilledDescription.Companion.invoke (AuthorHeaderInfoSlot.kt:44)");
                }
                int i4 = i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1620157712, i4, -1, "com.vk.profile.design.compose.header.info.rememberDescriptionSlot (FilledDescriptionSlotImpl.kt:152)");
                }
                Object x = M.x();
                if (x == obj) {
                    x = new acr(charSequence, z);
                    M.R(x);
                }
                acr acrVar = (acr) x;
                ((zak0) acrVar.a).setValue(charSequence);
                ((zak0) acrVar.b).setValue(Boolean.valueOf(z));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                rfpVar = acrVar;
            } else if (aVar instanceof AuthorHeaderConfig.Info.a.C1658a) {
                M.K(-311419948);
                int i5 = ((i2 >> 3) & 14) | 48;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1625472586, i5, -1, "com.vk.profile.design.compose.header.info.AuthorHeaderInfoSlot.DescriptionSlot.EmptyDescription.Companion.invoke (AuthorHeaderInfoSlot.kt:53)");
                }
                int i6 = i5 & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1265885738, i6, -1, "com.vk.profile.design.compose.header.info.rememberEmptyDescriptionSlot (EmptyDescriptionSlotImpl.kt:59)");
                }
                Object x2 = M.x();
                Object obj2 = x2;
                if (x2 == obj) {
                    rfp rfpVar2 = new rfp(z);
                    ((zak0) rfpVar2.a).setValue(Boolean.valueOf(z));
                    M.R(rfpVar2);
                    obj2 = rfpVar2;
                }
                rfp rfpVar3 = (rfp) obj2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                rfpVar = rfpVar3;
            } else {
                M.K(-311273195);
                M.j();
                rfpVar = null;
            }
            if (rfpVar == null) {
                M.K(-311239219);
            } else {
                M.K(-311239218);
                d(rfpVar, M, 6);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, aVar, i) { // from class: xsna.h95
                public final /* synthetic */ boolean b;
                public final /* synthetic */ AuthorHeaderConfig.Info.a c;

                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int I = ne7.I(7);
                    k95.b(this.b, this.c, (androidx.compose.runtime.a) obj3, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(AuthorHeaderConfig.Info info, AuthorHeaderConfig.Author author, AuthorHeaderConfig.Viewer viewer, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(378229663);
        int i2 = (M.J(info) ? 4 : 2) | i | (M.J(author) ? 32 : 16) | (M.J(viewer) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(378229663, i2, -1, "com.vk.profile.design.compose.header.content.InfoContent (AuthorHeaderInfoContent.kt:16)");
            }
            boolean h = viewer.a.h();
            boolean z = author.a == AuthorHeaderConfig.Author.AuthorType.Community;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            e(author, viewer, info.a, M, (i2 & 112) | 6 | (i2 & 896));
            b(z, info.b, M, 6);
            a(info, h, z, M, ((i2 << 3) & 112) | 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new f95(i, 0, info, author, viewer, q630Var);
        }
    }

    public static final void d(l95 l95Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-676394026);
        if ((i & 6) == 0) {
            i2 = (M.J(r9g.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(l95Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-676394026, i2, -1, "com.vk.profile.design.compose.header.content.RenderSlot (AuthorHeaderInfoContent.kt:186)");
            }
            l95Var.a((i2 & 14) | 48, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j95(l95Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(AuthorHeaderConfig.Author author, AuthorHeaderConfig.Viewer viewer, AuthorHeaderConfig.Info.b bVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        fxm0 fxm0Var;
        androidx.compose.runtime.a M = aVar.M(-1542595983);
        if ((i & 6) == 0) {
            i2 = (M.J(r9g.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(author) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(viewer) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(bVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1542595983, i2, -1, "com.vk.profile.design.compose.header.content.SubscribersSlot (AuthorHeaderInfoContent.kt:46)");
            }
            boolean z = bVar instanceof AuthorHeaderConfig.Info.b.C1659b;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z) {
                M.K(673434536);
                AuthorHeaderConfig.Info.b.C1659b c1659b = (AuthorHeaderConfig.Info.b.C1659b) bVar;
                int i3 = ((i2 >> 3) & 112) | 3072 | ((i2 << 3) & 896);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1251653053, i3, -1, "com.vk.profile.design.compose.header.info.AuthorHeaderInfoSlot.SubscribersSlot.EmptySubscribers.Companion.invoke (AuthorHeaderInfoSlot.kt:21)");
                }
                int i4 = i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1556634981, i4, -1, "com.vk.profile.design.compose.header.info.rememberEmptySubscribersSlotImpl (EmptySubscribersSlotImpl.kt:41)");
                }
                Object x = M.x();
                if (x == c0012a) {
                    x = new rhp(c1659b, viewer, author);
                    M.R(x);
                }
                rhp rhpVar = (rhp) x;
                ((zak0) rhpVar.a).setValue(c1659b);
                ((zak0) rhpVar.b).setValue(viewer);
                ((zak0) rhpVar.c).setValue(author);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                fxm0Var = rhpVar;
            } else if (bVar instanceof AuthorHeaderConfig.Info.b.a) {
                M.K(673704422);
                AuthorHeaderConfig.Info.b.a aVar2 = (AuthorHeaderConfig.Info.b.a) bVar;
                int i5 = ((i2 >> 3) & 112) | 3072 | ((i2 << 3) & 896);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(504906731, i5, -1, "com.vk.profile.design.compose.header.info.AuthorHeaderInfoSlot.SubscribersSlot.DefaultSubscribers.Companion.invoke (AuthorHeaderInfoSlot.kt:32)");
                }
                int i6 = i5 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1969322116, i6, -1, "com.vk.profile.design.compose.header.info.rememberDefaultSubscribersSlotImpl (SubscribersSlotImpl.kt:59)");
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new fxm0(aVar2, viewer, author);
                    M.R(x2);
                }
                fxm0 fxm0Var2 = (fxm0) x2;
                ((zak0) fxm0Var2.a).setValue(aVar2);
                ((zak0) fxm0Var2.b).setValue(viewer);
                ((zak0) fxm0Var2.c).setValue(author);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                fxm0Var = fxm0Var2;
            } else {
                M.K(673917484);
                M.j();
                fxm0Var = null;
            }
            if (fxm0Var == null) {
                M.K(673951460);
            } else {
                M.K(673951461);
                d(fxm0Var, M, i2 & 14);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i95(i, 0, author, viewer, bVar);
        }
    }
}
