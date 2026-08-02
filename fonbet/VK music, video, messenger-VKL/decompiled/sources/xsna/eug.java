package xsna;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.compose.components.channel.MediaType;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.kug;
import xsna.q630;

/* compiled from: CommunityChannelComposeView.kt */
/* loaded from: classes5.dex */
public final class eug extends rpo0 {
    public static final float o = Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE;
    public final wh50 m;
    public final wh50 n;

    /* compiled from: CommunityChannelComposeView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public eug(Context context) {
        super(context, null, 0);
        this.m = androidx.compose.runtime.k.b(kug.d);
        this.n = androidx.compose.runtime.k.b(new vd1(8));
    }

    public static s3q0 B(eug eugVar) {
        eugVar.getOnOpenUrl().invoke(new pug(eugVar.getChannelModel().b, null, null));
        return s3q0.a;
    }

    public static s3q0 C(eug eugVar) {
        eugVar.getOnOpenUrl().invoke(new pug(eugVar.getChannelModel().b, null, null));
        return s3q0.a;
    }

    private final kug getChannelModel() {
        return (kug) ((zak0) this.m).getValue();
    }

    private final void setChannelModel(kug kugVar) {
        ((zak0) this.m).setValue(kugVar);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        q630 v;
        q630 q630Var;
        dt10 dt10Var;
        q630.a aVar3;
        String string;
        Resources resources;
        kug.b bVar;
        kug.b bVar2;
        ArrayList arrayList;
        androidx.compose.runtime.a M = aVar.M(-2018420999);
        int i2 = i | (M.y(this) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2018420999, i2, -1, "com.vk.profile.community.impl.ui.item.header.channel.CommunityChannelComposeView.ThemedContent (CommunityChannelComposeView.kt:54)");
            }
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(aVar4, 1.0f);
            boolean z = !drm0.N(getChannelModel().b);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new yh(this, 26);
                M.R(x);
            }
            q630 c = ojc.c(f, z, null, null, (gzs) x, 14);
            float f2 = kqu0.s;
            q630 H = s200.H(c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 7);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, H);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(M, valueOf, bVar3);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            String N = d370.N(R.string.community_profile_channel, 0, M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new b40(10);
                M.R(x2);
            }
            int i4 = 4;
            com.vk.core.compose.component.group.header.f a3 = f.a.a(N, null, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, false, M, 805306368, 446);
            b.c cVar2 = b.c.a;
            boolean z3 = i3 == 4 || M.y(this);
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new dne(this, 5);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            boolean z4 = i3 == 4 || M.y(this);
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new po1(this, 23);
                M.R(x4);
            }
            com.vk.core.compose.component.group.header.g.b(a3, null, cVar2, null, null, GroupHeader$Right.c.a(null, null, GroupHeader$Right.b.a.C0746a.a(3072, 2, M, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), null, gzsVar), null, M, 11), false, M, 384, 90);
            aVar2 = M;
            List<kug.a> list = getChannelModel().c;
            List<kug.a> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                aVar2.K(1651564639);
            } else {
                aVar2.K(1655670310);
                q630 h = txj0.h(p490.r(txj0.f(aVar4, 1.0f), p490.x(aVar2), 14), 110);
                boolean z5 = false;
                androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, aVar2, 0);
                int hashCode2 = Long.hashCode(n34.n(aVar2));
                sy90 D2 = aVar2.D();
                q630 c3 = qri.c(aVar2, h);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar5);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, a4, cVar);
                k9q0.w(aVar2, D2, eVar);
                ur.d(hashCode2, aVar2, bVar3, aVar2, c2678a);
                k9q0.w(aVar2, c3, dVar);
                Resources resources2 = ((Context) aVar2.r(AndroidCompositionLocals_androidKt.b)).getResources();
                q630 H2 = s200.H(aVar4, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                q630.a aVar6 = aVar4;
                if (list.size() <= 2) {
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    v = new xpy(1.0f, true);
                } else {
                    v = txj0.v(aVar6, o);
                }
                q630 g = H2.g(v);
                aVar2.K(676140861);
                final int i5 = 0;
                for (Object obj : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        e43.t();
                        throw null;
                    }
                    final kug.a aVar7 = (kug.a) obj;
                    String str = aVar7.b;
                    yua yuaVar = aVar7.f;
                    List<kug.b> list3 = aVar7.c;
                    if (drm0.N(str)) {
                        q630Var = g;
                        q630.a aVar8 = aVar6;
                        aVar2.K(-616948766);
                        if (list3 == null || (bVar2 = (kug.b) j5g.a0(list3)) == null) {
                            dt10Var = dt10.c;
                        } else {
                            int a5 = gbg0.a(resources2, 72.0f);
                            Image image = bVar2.a;
                            ImageSize Cb = image != null ? image.Cb(a5, z5, z5) : null;
                            Integer valueOf2 = Cb != null ? Integer.valueOf(Cb.z8(a5)) : null;
                            dt10Var = new dt10(valueOf2 != null ? Cb.X7(valueOf2.intValue()) : null, bVar2.b);
                        }
                        aVar3 = aVar8;
                        q630 E = ahn.E(s200.H(aVar8, kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), "CommunityChannelPost");
                        float f3 = (list3 == null || (bVar = (kug.b) j5g.a0(list3)) == null) ? 1.0f : bVar.c;
                        int i7 = aVar7.d;
                        int i8 = a.$EnumSwitchMapping$0[dt10Var.b.ordinal()];
                        if (i8 == 1) {
                            string = getResources().getString(R.string.community_profile_channel_content_descr_img);
                        } else if (i8 == 2) {
                            string = getResources().getString(R.string.community_profile_channel_content_descr_video);
                        } else {
                            if (i8 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            string = getResources().getString(R.string.community_profile_channel_content_descr_default);
                        }
                        boolean y = (i3 == 4 || aVar2.y(this)) | aVar2.y(aVar7) | aVar2.o(i5);
                        Object x5 = aVar2.x();
                        if (y || x5 == c0012a) {
                            x5 = new gzs() { // from class: xsna.dug
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    izs<pug, s3q0> onOpenUrl = eug.this.getOnOpenUrl();
                                    kug.a aVar9 = aVar7;
                                    onOpenUrl.invoke(new pug(aVar9.e, Integer.valueOf(aVar9.a), Integer.valueOf(i5)));
                                    return s3q0.a;
                                }
                            };
                            aVar2.R(x5);
                        }
                        gzs gzsVar2 = (gzs) x5;
                        Resources resources3 = resources2;
                        androidx.compose.runtime.a aVar9 = aVar2;
                        resources = resources3;
                        hug.a(dt10Var, yuaVar, E, null, f3, i7, string, gzsVar2, aVar9, 0);
                        aVar2 = aVar9;
                        aVar2.j();
                    } else {
                        aVar2.K(-618058101);
                        String str2 = aVar7.b;
                        VkColorToken vkColorToken = VkColorToken.TextPrimary;
                        us2 j = aqm0.a(str2, null, vkColorToken, null, vkColorToken, null, 53).j(8, aVar2);
                        String str3 = yuaVar.a;
                        q630.a aVar10 = aVar6;
                        q630 E2 = ahn.E(g, "CommunityChannelPost");
                        if (list3 != null) {
                            arrayList = new ArrayList();
                            for (kug.b bVar4 : list3) {
                                int a6 = gbg0.a(resources2, 18.0f);
                                Image image2 = bVar4.a;
                                ImageSize Cb2 = image2 != null ? image2.Cb(a6, z5, z5) : null;
                                Integer valueOf3 = Cb2 != null ? Integer.valueOf(Cb2.z8(a6)) : null;
                                String X7 = valueOf3 != null ? Cb2.X7(valueOf3.intValue()) : null;
                                if (X7 != null) {
                                    arrayList.add(X7);
                                }
                                i4 = 4;
                            }
                        } else {
                            arrayList = null;
                        }
                        boolean y2 = ((i3 == i4 || aVar2.y(this)) ? true : z5) | aVar2.y(aVar7) | aVar2.o(i5);
                        Object x6 = aVar2.x();
                        if (y2 || x6 == c0012a) {
                            x6 = new o70(this, aVar7, i5, 1);
                            aVar2.R(x6);
                        }
                        q630Var = g;
                        yug.a(j, str3, E2, null, arrayList, (gzs) x6, aVar2, 0);
                        aVar2.j();
                        resources = resources2;
                        aVar3 = aVar10;
                    }
                    g = q630Var;
                    aVar6 = aVar3;
                    resources2 = resources;
                    i5 = i6;
                    i4 = 4;
                    z5 = false;
                }
                aVar2.j();
                f9t.e(txj0.v(txj0.c(aVar6, 1.0f), kqu0.s), aVar2, 0);
                aVar2.G();
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bt3(this, i, 3);
        }
    }

    public final void D(kug kugVar) {
        setChannelModel(kugVar);
    }

    public final izs<pug, s3q0> getOnOpenUrl() {
        return (izs) ((zak0) this.n).getValue();
    }

    public final void setOnOpenUrl(izs<? super pug, s3q0> izsVar) {
        ((zak0) this.n).setValue(izsVar);
    }
}
