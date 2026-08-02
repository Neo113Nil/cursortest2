package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.compose.upload.ClipsUploadButtonType;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.music.playlist.display.domain.i;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ehf implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ehf(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        gzs gzsVar;
        q630.a aVar;
        gzs gzsVar2;
        cri.a.e eVar;
        cri.a.d dVar;
        cri.a.b bVar;
        q630.a aVar2;
        LayoutNode.a aVar3;
        float f;
        zzs<q630, gzs<s3q0>, androidx.compose.runtime.a, Integer, s3q0> zzsVar;
        float f2;
        ?? r3;
        int i;
        switch (this.b) {
            case 0:
                gze gzeVar = (gze) this.c;
                gzs<s3q0> gzsVar3 = (gzs) this.d;
                gzs gzsVar4 = (gzs) this.e;
                gzs gzsVar5 = (gzs) this.f;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-372715560, intValue, -1, "com.vk.clips.upload.ui.impl.compose.views.content.ButtonsBar.<anonymous> (ClipsUploadScreenContent.kt:162)");
                    }
                    dt1.a.getClass();
                    ty6.a aVar5 = dt1.a.o;
                    float f3 = 16;
                    float f4 = 4;
                    q630.a aVar6 = q630.a.a;
                    q630 H = s200.H(aVar6, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f4, 2);
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar5, aVar4, 48);
                    int hashCode = Long.hashCode(n34.n(aVar4));
                    sy90 D = aVar4.D();
                    q630 c = qri.c(aVar4, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar7 = cri.a.b;
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar7);
                    } else {
                        aVar4.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar4, a, cVar);
                    cri.a.e eVar2 = cri.a.e;
                    k9q0.w(aVar4, D, eVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar2 = cri.a.g;
                    k9q0.w(aVar4, valueOf, bVar2);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar4, c2678a);
                    cri.a.d dVar2 = cri.a.d;
                    k9q0.w(aVar4, c, dVar2);
                    yzs<q630, androidx.compose.runtime.a, Integer, s3q0> yzsVar = gzeVar.c;
                    zzs<q630, gzs<s3q0>, androidx.compose.runtime.a, Integer, s3q0> zzsVar2 = gzeVar.d;
                    if (yzsVar != null) {
                        aVar4.K(-1685204409);
                        q630 H2 = s200.H(aVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        aVar = aVar6;
                        gzsVar2 = gzsVar5;
                        gzsVar = gzsVar4;
                        androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, aVar4, 0);
                        int hashCode2 = Long.hashCode(n34.n(aVar4));
                        sy90 D2 = aVar4.D();
                        q630 c2 = qri.c(aVar4, H2);
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar7);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, a2, cVar);
                        k9q0.w(aVar4, D2, eVar2);
                        ur.d(hashCode2, aVar4, bVar2, aVar4, c2678a);
                        k9q0.w(aVar4, c2, dVar2);
                        gzeVar.c.invoke(aVar, aVar4, 6);
                        aVar4.G();
                    } else {
                        gzsVar = gzsVar4;
                        aVar = aVar6;
                        gzsVar2 = gzsVar5;
                        aVar4.K(-1692304556);
                    }
                    aVar4.j();
                    a.j g = androidx.compose.foundation.layout.a.g(8);
                    q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 1, txj0.f(aVar, 1.0f));
                    androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, aVar4, 6);
                    int hashCode3 = Long.hashCode(n34.n(aVar4));
                    sy90 D3 = aVar4.D();
                    q630 c3 = qri.c(aVar4, F);
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar7);
                    } else {
                        aVar4.f();
                    }
                    k9q0.w(aVar4, a3, cVar);
                    k9q0.w(aVar4, D3, eVar2);
                    ur.d(hashCode3, aVar4, bVar2, aVar4, c2678a);
                    k9q0.w(aVar4, c3, dVar2);
                    if (gzeVar.a) {
                        aVar4.K(-1091206994);
                        String N = d370.N(R.string.clip_draft, 0, aVar4);
                        ClipsUploadButtonType clipsUploadButtonType = ClipsUploadButtonType.Draft;
                        boolean z = gzeVar.b;
                        f2 = Float.MAX_VALUE;
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        gzs gzsVar6 = gzsVar;
                        aVar3 = aVar7;
                        eVar = eVar2;
                        dVar = dVar2;
                        r3 = 1;
                        aVar2 = aVar;
                        bVar = bVar2;
                        zzsVar = zzsVar2;
                        f = f4;
                        i = 0;
                        odf.a(N, gzsVar6, clipsUploadButtonType, z, ahn.E(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "ClipSaveDraftButton"), aVar4, 384);
                    } else {
                        eVar = eVar2;
                        dVar = dVar2;
                        bVar = bVar2;
                        aVar2 = aVar;
                        aVar3 = aVar7;
                        f = f4;
                        zzsVar = zzsVar2;
                        f2 = Float.MAX_VALUE;
                        r3 = 1;
                        i = 0;
                        aVar4.K(-1098797840);
                    }
                    aVar4.j();
                    String N2 = d370.N(R.string.clips_upload_button_text, i, aVar4);
                    ClipsUploadButtonType clipsUploadButtonType2 = ClipsUploadButtonType.Upload;
                    boolean z2 = gzeVar.b;
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    odf.a(N2, gzsVar2, clipsUploadButtonType2, z2, ahn.E(new xpy(1.0f > f2 ? f2 : 1.0f, r3), "ClipPublishButton"), aVar4, 384);
                    androidx.compose.runtime.a aVar8 = aVar4;
                    aVar8.G();
                    aVar8.K(-1683699514);
                    if (zzsVar != null) {
                        aVar8.K(-1683661694);
                        zzsVar.invoke(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, r3, aVar2), gzsVar3, aVar8, 6);
                        aVar8.j();
                    } else {
                        aVar8.K(-1683421258);
                        q630 F2 = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, r3, aVar2);
                        Object x = aVar8.x();
                        if (x == a.C0011a.a) {
                            x = ir.h(aVar8);
                        }
                        cri.a.e eVar3 = eVar;
                        LayoutNode.a aVar9 = aVar3;
                        q630 b = ojc.b(F2, (sg50) x, null, false, null, gzsVar3, 28);
                        androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar8, 48);
                        int hashCode4 = Long.hashCode(n34.n(aVar8));
                        sy90 D4 = aVar8.D();
                        q630 c4 = qri.c(aVar8, b);
                        if (aVar8.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar8.H();
                        if (aVar8.L()) {
                            aVar8.I(aVar9);
                        } else {
                            aVar8.f();
                        }
                        k9q0.w(aVar8, a4, cVar);
                        k9q0.w(aVar8, D4, eVar3);
                        ur.d(hashCode4, aVar8, bVar, aVar8, c2678a);
                        k9q0.w(aVar8, c4, dVar);
                        yqv0.c(d370.N(R.string.posting_rules_title, 0, aVar8), null, wlb0.h(aVar8).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar8).C0, aVar8, 0, 0, 8186);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(307801724, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronOutline12> (VkSdkIcons.kt:468)");
                        }
                        lg90 a5 = pg90.a(R.drawable.vk_icon_chevron_outline_12, 0, aVar8);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        pzu0.b(a5, null, null, wlb0.h(aVar8).getIcon().f, aVar8, 56, 4);
                        aVar8 = aVar8;
                        aVar8.G();
                        aVar8.j();
                    }
                    if (gp.d(aVar8)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                eyk.b((String) this.c, (DateTimePickerState) this.d, (q630) this.e, (SemanticsConfiguration) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                oz40.a((i.a.C1350a) this.c, (izs) this.d, (izs) this.e, (wh50) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ ehf(gze gzeVar, gzs gzsVar, gzs gzsVar2, gzs gzsVar3) {
        this.b = 0;
        this.c = gzeVar;
        this.d = gzsVar;
        this.e = gzsVar2;
        this.f = gzsVar3;
    }
}
