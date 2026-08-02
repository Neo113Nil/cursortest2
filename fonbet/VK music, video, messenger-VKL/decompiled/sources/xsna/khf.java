package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.upload.ui.impl.compose.views.island.IslandPart;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.q630;
import xsna.tne;

/* compiled from: ClipsUploadScreenContent.kt */
/* loaded from: classes17.dex */
public final class khf {
    public static final void a(gzs gzsVar, gzs gzsVar2, gzs gzsVar3, gze gzeVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-853385857);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16) | (M.y(gzsVar3) ? 256 : 128) | (M.J(gzeVar) ? 2048 : 1024) | 24576;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-853385857, i2, -1, "com.vk.clips.upload.ui.impl.compose.views.content.ButtonsBar (ClipsUploadScreenContent.kt:157)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            uov0.a(f, null, ylu0Var.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-372715560, new ehf(gzeVar, gzsVar3, gzsVar2, gzsVar), M), M, 1572864, 58);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new va5(gzsVar, gzsVar2, gzsVar3, gzeVar, q630Var2, i);
        }
    }

    public static final void b(final t1m t1mVar, final adk adkVar, final zbj0 zbj0Var, final tne tneVar, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        Object jhfVar;
        long j;
        wh50 wh50Var;
        xvy xvyVar;
        Integer num;
        final rg50 rg50Var;
        androidx.compose.runtime.a M = aVar.M(-287207468);
        int i2 = i | (M.J(t1mVar) ? 4 : 2) | (M.J(adkVar) ? 32 : 16) | (M.J(zbj0Var) ? 256 : 128) | (M.J(tneVar) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192) | (M.J(ofe.a) ? 131072 : 65536) | (M.J(q630Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-287207468, i2, -1, "com.vk.clips.upload.ui.impl.compose.views.content.ClipsUploadScreenContent (ClipsUploadScreenContent.kt:70)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var.getBackground().g;
            boolean booleanValue = ((Boolean) M.r(c5x.a)).booleanValue();
            xvy a = zvy.a(0, 3, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1813379946, 0, -1, "com.vk.clips.upload.ui.impl.compose.views.content.isLazyColumnScrollable (ClipsUploadScreenContent.kt:238)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bbk0.b(new hg(a, 24));
                M.R(x);
            }
            final boolean booleanValue2 = ((Boolean) ((mtk0) x).getValue()).booleanValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.i.a(!booleanValue ? 0 : 10);
                M.R(x2);
            }
            rg50 rg50Var2 = (rg50) x2;
            s3q0 s3q0Var = s3q0.a;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new ihf(rg50Var2, null);
                M.R(x3);
            }
            bap.g(s3q0Var, (wzs) x3, M, 6);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x4);
            }
            wh50 wh50Var2 = (wh50) x4;
            Integer valueOf = Integer.valueOf(rg50Var2.getIntValue());
            boolean J = ((i2 & 896) == 256) | M.J(a);
            Object x5 = M.x();
            if (J || x5 == c0012a) {
                j = j2;
                wh50Var = wh50Var2;
                xvyVar = a;
                num = valueOf;
                rg50Var = rg50Var2;
                jhfVar = new jhf(wh50Var, zbj0Var, rg50Var, xvyVar, null);
                M.R(jhfVar);
            } else {
                wh50Var = wh50Var2;
                jhfVar = x5;
                num = valueOf;
                j = j2;
                xvyVar = a;
                rg50Var = rg50Var2;
            }
            bap.f(wh50Var, num, (wzs) jhfVar, M, 6);
            final long j3 = j;
            final xvy xvyVar2 = xvyVar;
            rvi.a(q6p0.a.b(Boolean.valueOf(xvyVar.j.a())), kai.c(1932862228, new wzs() { // from class: xsna.fhf
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    izs izsVar2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1932862228, intValue, -1, "com.vk.clips.upload.ui.impl.compose.views.content.ClipsUploadScreenContent.<anonymous> (ClipsUploadScreenContent.kt:94)");
                        }
                        q630 E = ahn.E(q630.this, "ClipUploadRootList");
                        final t1m t1mVar2 = t1mVar;
                        boolean J2 = aVar2.J(t1mVar2);
                        final long j4 = j3;
                        boolean p = J2 | aVar2.p(j4);
                        final izs izsVar3 = izsVar;
                        boolean J3 = p | aVar2.J(izsVar3) | aVar2.J(ofe.a);
                        final adk adkVar2 = adkVar;
                        boolean J4 = J3 | aVar2.J(adkVar2);
                        final zbj0 zbj0Var2 = zbj0Var;
                        boolean J5 = J4 | aVar2.J(zbj0Var2);
                        final boolean z = booleanValue2;
                        boolean l = J5 | aVar2.l(z);
                        Object x6 = aVar2.x();
                        if (l || x6 == a.C0011a.a) {
                            final rg50 rg50Var3 = rg50Var;
                            izs izsVar4 = new izs() { // from class: xsna.hhf
                                /* JADX WARN: Removed duplicated region for block: B:16:0x014a  */
                                @Override // xsna.izs
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invoke(Object obj3) {
                                    final izs izsVar5;
                                    boolean z2;
                                    final long j5;
                                    final zbj0 zbj0Var3 = zbj0Var2;
                                    ArrayList arrayList = zbj0Var3.b;
                                    nvy nvyVar = (nvy) obj3;
                                    final t1m t1mVar3 = t1m.this;
                                    ArrayList arrayList2 = t1mVar3.a;
                                    wow wowVar = new wow(arrayList2);
                                    yh3 yh3Var = new yh3(3);
                                    int size = arrayList2.size();
                                    zpd zpdVar = new zpd(yh3Var, wowVar);
                                    db5 db5Var = new db5(wowVar, 1);
                                    final long j6 = j4;
                                    final izs izsVar6 = izsVar3;
                                    nvyVar.e(size, zpdVar, db5Var, new jai(2039820996, new aqd(wowVar, t1mVar3, j6, izsVar6), true));
                                    if (t1mVar3.b.e) {
                                        nvyVar.h("open_editor_button", "open_editor", new jai(1119918954, new yzs() { // from class: xsna.upd
                                            @Override // xsna.yzs
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                                                int intValue2 = ((Integer) obj6).intValue();
                                                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(1119918954, intValue2, -1, "com.vk.clips.upload.ui.impl.compose.views.description.clipsDescriptionBlock.<anonymous> (ClipsDescriptionBlock.kt:55)");
                                                    }
                                                    dqd.a(j6, izsVar6, aVar3, 0);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar3.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, true));
                                    }
                                    nvyVar.h("description_block", "description", new jai(-1322394843, new yzs() { // from class: xsna.wpd
                                        @Override // xsna.yzs
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            ief iefVar = t1m.this.b;
                                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                                            int intValue2 = ((Integer) obj6).intValue();
                                            if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-1322394843, intValue2, -1, "com.vk.clips.upload.ui.impl.compose.views.description.clipsDescriptionBlock.<anonymous> (ClipsDescriptionBlock.kt:62)");
                                                }
                                                q630 a2 = dtx.a(q630.a.a, IslandPart.Bottom, j6);
                                                izs izsVar7 = izsVar6;
                                                boolean J6 = aVar3.J(izsVar7);
                                                Object x7 = aVar3.x();
                                                Object obj7 = a.C0011a.a;
                                                if (J6 || x7 == obj7) {
                                                    x7 = new m87(izsVar7, 1);
                                                    aVar3.R(x7);
                                                }
                                                gzs gzsVar = (gzs) x7;
                                                jai jaiVar = new jai(2007920388, new tpd(0, iefVar.d, izsVar7), true);
                                                boolean J7 = aVar3.J(izsVar7);
                                                Object x8 = aVar3.x();
                                                if (J7 || x8 == obj7) {
                                                    x8 = new f3(izsVar7, 2);
                                                    aVar3.R(x8);
                                                }
                                                gzs gzsVar2 = (gzs) x8;
                                                boolean J8 = aVar3.J(izsVar7);
                                                Object x9 = aVar3.x();
                                                if (J8 || x9 == obj7) {
                                                    x9 = new th2(izsVar7, 2);
                                                    aVar3.R(x9);
                                                }
                                                gzs gzsVar3 = (gzs) x9;
                                                boolean J9 = aVar3.J(izsVar7);
                                                Object x10 = aVar3.x();
                                                if (J9 || x10 == obj7) {
                                                    x10 = new ypd(izsVar7, 0);
                                                    aVar3.R(x10);
                                                }
                                                izs izsVar8 = (izs) x10;
                                                boolean J10 = aVar3.J(izsVar7);
                                                Object x11 = aVar3.x();
                                                if (J10 || x11 == obj7) {
                                                    x11 = new o87(izsVar7, 3);
                                                    aVar3.R(x11);
                                                }
                                                tqd.d(iefVar, gzsVar, gzsVar2, gzsVar3, izsVar8, jaiVar, (gzs) x11, a2, aVar3, 0, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar3.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, true));
                                    ArrayList arrayList3 = t1mVar3.c;
                                    wow wowVar2 = new wow(arrayList3);
                                    nvyVar.e(arrayList3.size(), new t6c(new xpd((byte) 0, 0), wowVar2, 1), new bqd(wowVar2, 0), new jai(2039820996, new cqd(wowVar2, t1mVar3, j6, izsVar6), true));
                                    final adk adkVar3 = adkVar2;
                                    ldf ldfVar = adkVar3.a;
                                    rg50 rg50Var4 = rg50Var3;
                                    int intValue2 = rg50Var4.getIntValue();
                                    if ((ldfVar.a.size() > 1 && intValue2 > 1) || ldfVar.g) {
                                        nvyVar.h("author_title", "title", new jai(-314329118, new yzs() { // from class: xsna.xcf
                                            @Override // xsna.yzs
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                                                int intValue3 = ((Integer) obj6).intValue();
                                                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-314329118, intValue3, -1, "com.vk.clips.upload.ui.impl.compose.views.author.clipsAuthorsBlock.<anonymous> (ClipsUploadAuthorsBlock.kt:33)");
                                                    }
                                                    red.a(d370.N(R.string.author_title, 0, aVar3), dtx.a(q630.a.a, IslandPart.Top, j6), aVar3, 0);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar3.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, true));
                                        nvyVar.h("authors", "author_picker", new jai(-156024245, new yzs() { // from class: xsna.ycf
                                            @Override // xsna.yzs
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                                                int intValue3 = ((Integer) obj6).intValue();
                                                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-156024245, intValue3, -1, "com.vk.clips.upload.ui.impl.compose.views.author.clipsAuthorsBlock.<anonymous> (ClipsUploadAuthorsBlock.kt:42)");
                                                    }
                                                    adk adkVar4 = adk.this;
                                                    ldf ldfVar2 = adkVar4.a;
                                                    q630 E2 = ahn.E(dtx.a(q630.a.a, adkVar4.b.isEmpty() ? IslandPart.Bottom : IslandPart.Middle, j6), "upload_cell_authors");
                                                    izs izsVar7 = izsVar6;
                                                    boolean J6 = aVar3.J(izsVar7);
                                                    Object x7 = aVar3.x();
                                                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                                                    if (J6 || x7 == c0012a2) {
                                                        x7 = new uy7(izsVar7, 1);
                                                        aVar3.R(x7);
                                                    }
                                                    izs izsVar8 = (izs) x7;
                                                    boolean J7 = aVar3.J(izsVar7);
                                                    Object x8 = aVar3.x();
                                                    if (J7 || x8 == c0012a2) {
                                                        x8 = new ega(izsVar7, 1);
                                                        aVar3.R(x8);
                                                    }
                                                    gzs gzsVar = (gzs) x8;
                                                    boolean J8 = aVar3.J(izsVar7);
                                                    Object x9 = aVar3.x();
                                                    if (J8 || x9 == c0012a2) {
                                                        x9 = new yd1(izsVar7, 3);
                                                        aVar3.R(x9);
                                                    }
                                                    fid.c(ldfVar2, izsVar8, gzsVar, (gzs) x9, E2, aVar3, 0);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar3.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, true));
                                        ArrayList arrayList4 = adkVar3.b;
                                        if (!arrayList4.isEmpty()) {
                                            nvy.g(nvyVar, null, null, new jai(-467459673, new yzs() { // from class: xsna.zcf
                                                @Override // xsna.yzs
                                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                                                    int intValue3 = ((Integer) obj6).intValue();
                                                    if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(-467459673, intValue3, -1, "com.vk.clips.upload.ui.impl.compose.views.author.clipsAuthorsBlock.<anonymous> (ClipsUploadAuthorsBlock.kt:60)");
                                                        }
                                                        q630 E2 = s200.E(dtx.a(txj0.f(q630.a.a, 1.0f), IslandPart.Middle, j6), 16, 8);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                                        }
                                                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                        jqu0.a(E2, ylu0Var2.p().c, (float) 0.33d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar3, 384, 8);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                    } else {
                                                        aVar3.h();
                                                    }
                                                    return s3q0.a;
                                                }
                                            }, true), 3);
                                            wow wowVar3 = new wow(arrayList4);
                                            adf adfVar = new adf((byte) 0, 0);
                                            int size2 = arrayList4.size();
                                            idf idfVar = new idf(adfVar, wowVar3);
                                            jdf jdfVar = new jdf(wowVar3, 0);
                                            z2 = true;
                                            kdf kdfVar = new kdf(wowVar3, adkVar3, j6, izsVar6);
                                            j5 = j6;
                                            izsVar5 = izsVar6;
                                            nvyVar.e(size2, idfVar, jdfVar, new jai(2039820996, kdfVar, true));
                                            if (!arrayList.isEmpty() && rg50Var4.getIntValue() > 2) {
                                                boolean z3 = z ^ z2;
                                                nvyVar.h("settings_title", "title", new jai(-123643715, new yzs() { // from class: xsna.v3f
                                                    @Override // xsna.yzs
                                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                                                        int intValue3 = ((Integer) obj6).intValue();
                                                        if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.f(-123643715, intValue3, -1, "com.vk.clips.upload.ui.impl.compose.views.sharing.sharingOptions.<anonymous> (ClipsSharingSettingsBlock.kt:30)");
                                                            }
                                                            red.a(d370.N(R.string.clips_settings_title, 0, aVar3), ahn.E(dtx.a(q630.a.a, IslandPart.Top, j5), "ClipUploadSettingsBlockTitle"), aVar3, 0);
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.e();
                                                            }
                                                        } else {
                                                            aVar3.h();
                                                        }
                                                        return s3q0.a;
                                                    }
                                                }, z2));
                                                if (zbj0Var3.a != null) {
                                                    nvyVar.h("settings_banner", "banner", new jai(-249394088, new yzs() { // from class: xsna.w3f
                                                        @Override // xsna.yzs
                                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                                                            int intValue3 = ((Integer) obj6).intValue();
                                                            if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.f(-249394088, intValue3, -1, "com.vk.clips.upload.ui.impl.compose.views.sharing.sharingOptions.<anonymous> (ClipsSharingSettingsBlock.kt:43)");
                                                                }
                                                                fze fzeVar = zbj0.this.a;
                                                                izs izsVar7 = izsVar5;
                                                                boolean J6 = aVar3.J(izsVar7);
                                                                Object x7 = aVar3.x();
                                                                if (J6 || x7 == a.C0011a.a) {
                                                                    x7 = new m9a(izsVar7, 1);
                                                                    aVar3.R(x7);
                                                                }
                                                                z9q0.a(fzeVar, (izs) x7, dtx.a(q630.a.a, IslandPart.Middle, j5), aVar3, 0);
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.e();
                                                                }
                                                            } else {
                                                                aVar3.h();
                                                            }
                                                            return s3q0.a;
                                                        }
                                                    }, z2));
                                                }
                                                boolean z4 = z2;
                                                wow wowVar4 = new wow(arrayList);
                                                nvyVar.e(arrayList.size(), new e4f(new rc9((byte) 0, 1), wowVar4), new n8c(wowVar4, 1), new jai(2039820996, new f4f(wowVar4, j5, zbj0Var3, z3, izsVar5), z4));
                                            }
                                            return s3q0.a;
                                        }
                                    }
                                    izsVar5 = izsVar6;
                                    z2 = true;
                                    j5 = j6;
                                    if (!arrayList.isEmpty()) {
                                        boolean z32 = z ^ z2;
                                        nvyVar.h("settings_title", "title", new jai(-123643715, new yzs() { // from class: xsna.v3f
                                            @Override // xsna.yzs
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                                                int intValue3 = ((Integer) obj6).intValue();
                                                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-123643715, intValue3, -1, "com.vk.clips.upload.ui.impl.compose.views.sharing.sharingOptions.<anonymous> (ClipsSharingSettingsBlock.kt:30)");
                                                    }
                                                    red.a(d370.N(R.string.clips_settings_title, 0, aVar3), ahn.E(dtx.a(q630.a.a, IslandPart.Top, j5), "ClipUploadSettingsBlockTitle"), aVar3, 0);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar3.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, z2));
                                        if (zbj0Var3.a != null) {
                                        }
                                        boolean z42 = z2;
                                        wow wowVar42 = new wow(arrayList);
                                        nvyVar.e(arrayList.size(), new e4f(new rc9((byte) 0, 1), wowVar42), new n8c(wowVar42, 1), new jai(2039820996, new f4f(wowVar42, j5, zbj0Var3, z32, izsVar5), z42));
                                    }
                                    return s3q0.a;
                                }
                            };
                            izsVar2 = izsVar3;
                            aVar2.R(izsVar4);
                            x6 = izsVar4;
                        } else {
                            izsVar2 = izsVar3;
                        }
                        lqy.a(E, xvyVar2, null, null, null, null, false, null, (izs) x6, aVar2, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
                        tne tneVar2 = tneVar;
                        if (tneVar2 instanceof tne.a) {
                            aVar2.K(-726952414);
                            cyk.a(((tne.a) tneVar2).a, izsVar2, null, aVar2, 0);
                        } else {
                            aVar2.K(-732485170);
                        }
                        aVar2.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(adkVar, zbj0Var, tneVar, izsVar, q630Var, i) { // from class: xsna.ghf
                public final /* synthetic */ adk c;
                public final /* synthetic */ zbj0 d;
                public final /* synthetic */ tne e;
                public final /* synthetic */ izs f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    khf.b(t1m.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1236098946);
        int i2 = i | (M.y(gzsVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1236098946, i2, -1, "com.vk.clips.upload.ui.impl.compose.views.content.UploadTopBar (ClipsUploadScreenContent.kt:131)");
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.clips_upload_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().b;
            String N = d370.N(R.string.clips_publish_back_button_a11y, 0, M);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new wh6(12);
                M.R(x);
            }
            aVar2 = M;
            muv0.h(a, q630Var, null, null, e.a.a(gzsVar, N, null, new l5g(j), com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, (i2 & 14) | 196608, 4), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 48, 0, 8172);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new jn7(gzsVar, q630Var, i, 3);
        }
    }
}
