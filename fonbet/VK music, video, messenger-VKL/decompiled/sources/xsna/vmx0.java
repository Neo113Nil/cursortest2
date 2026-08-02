package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.horizontal.HorizontalListItem$Size;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.iev;
import xsna.phw;
import xsna.pox0;
import xsna.q630;

/* compiled from: WidgetCoverListView.kt */
/* loaded from: classes17.dex */
public final class vmx0 extends i5i {
    public final wh50 n;

    public vmx0(Context context) {
        super(context, null, 0);
        this.n = androidx.compose.runtime.k.b(new pox0.c(0));
    }

    public static s3q0 B(vmx0 vmx0Var, androidx.compose.runtime.a aVar, int i) {
        ArrayList arrayList;
        if (aVar.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1316153116, i, -1, "com.vk.community.design.compose.widget.views.WidgetCoverListView.ThemedContent.<anonymous> (WidgetCoverListView.kt:52)");
            }
            List<pox0.b> list = vmx0Var.getWidgetCoverListState().b;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof pox0.b.a) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            vmx0Var.D(512, aVar, arrayList, vmx0Var.getOnOpenUrl());
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }

    private final pox0.c getWidgetCoverListState() {
        return (pox0.c) ((zak0) this.n).getValue();
    }

    private final void setWidgetCoverListState(pox0.c cVar) {
        ((zak0) this.n).setValue(cVar);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-2017893301);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2017893301, i2, -1, "com.vk.community.design.compose.widget.views.WidgetCoverListView.ThemedContent (WidgetCoverListView.kt:47)");
            }
            qmx0.a(getWidgetCoverListState().a, null, getOnOpenUrl(), kai.c(1316153116, new com.vk.movika.sdk.android.defaultplayer.control.n(this, 11), M), M, 3072, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m2h(this, i, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x018d, code lost:
    
        if (r10 == r5) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(final pox0.b.a aVar, final q630 q630Var, boolean z, boolean z2, final izs<? super String, s3q0> izsVar, androidx.compose.runtime.a aVar2, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        final boolean z5;
        final boolean z6;
        androidx.compose.runtime.f s;
        q630 q630Var2;
        a.C0011a.C0012a c0012a;
        int i5;
        us2 us2Var;
        int i6;
        float f;
        androidx.compose.runtime.a M = aVar2.M(1250227817);
        if ((i & 6) == 0) {
            i3 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z;
            i3 |= M.l(z3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= M.l(z4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= M.y(izsVar) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    i3 |= (262144 & i) == 0 ? M.J(this) : M.y(this) ? 131072 : 65536;
                }
                if (M.t(i3 & 1, (74899 & i3) != 74898)) {
                    boolean z7 = i7 != 0 ? true : z3;
                    boolean z8 = i4 != 0 ? true : z4;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1250227817, i3, -1, "com.vk.community.design.compose.widget.views.WidgetCoverListView.WidgetCoverListCell (WidgetCoverListView.kt:119)");
                    }
                    Context context = getContext();
                    HashSet hashSet = iah0.a;
                    float f2 = fnj.d(context) ? 4.0f : 3.0f;
                    M.K(-1121897213);
                    String str = aVar.c;
                    boolean z9 = str == null || drm0.N(str);
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (z9) {
                        q630Var2 = q630Var;
                    } else {
                        boolean z10 = ((i3 & 57344) == 16384) | ((i3 & 14) == 4);
                        Object x = M.x();
                        if (z10 || x == c0012a2) {
                            x = new g8v0(1, aVar, izsVar);
                            M.R(x);
                        }
                        q630Var2 = q630Var.g(ojc.c(q630.a.a, false, null, null, (gzs) x, 15));
                    }
                    M.j();
                    HorizontalListItem$Size.WithPlainImage withPlainImage = HorizontalListItem$Size.WithPlainImage.ExtraLarge;
                    boolean z11 = true;
                    t9g0 a = HorizontalListItem$VisualContent.e.a(phw.a.a(fwu0.l(null, aVar.a, null, null, M, 0, 61), null, null, null, null, M, 196616, 30), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, M, 0, 28);
                    String str2 = aVar.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    us2 e = ws2.e(str2);
                    String str3 = aVar.d;
                    boolean z12 = (i3 & 57344) == 16384;
                    if ((i3 & 14) != 4) {
                        z11 = false;
                    }
                    boolean z13 = z12 | z11;
                    Object x2 = M.x();
                    if (z13) {
                        c0012a = c0012a2;
                    } else {
                        c0012a = c0012a2;
                    }
                    x2 = new yq1(25, izsVar, aVar);
                    M.R(x2);
                    final gzs gzsVar = (gzs) x2;
                    int i8 = ((i3 >> 9) & 896) | 512;
                    M.K(649622781);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(649622781, i8, -1, "com.vk.community.design.compose.widget.views.WidgetCoverListView.createSubtitle (WidgetCoverListView.kt:154)");
                    }
                    if (str3 == null || str3.length() == 0) {
                        i5 = 8;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        us2Var = null;
                    } else {
                        M.K(1517240557);
                        s8u0 s8u0Var = new s8u0(0);
                        M.K(1517241756);
                        int i9 = s8u0Var.i(new klv0(VkTypographyToken.SubheadMedium, VkColorToken.TextAccentThemed));
                        try {
                            s8u0Var.e(str3);
                            boolean J = M.J(gzsVar);
                            Object x3 = M.x();
                            if (J || x3 == c0012a) {
                                x3 = new i9z() { // from class: xsna.umx0
                                    @Override // xsna.i9z
                                    public final void a(q8z q8zVar) {
                                        gzs.this.invoke();
                                    }
                                };
                                M.R(x3);
                            }
                            s8u0Var.a(new h2v0(str3, null, (i9z) x3), 0, str3.length());
                            s3q0 s3q0Var = s3q0.a;
                            s8u0Var.f(i9);
                            M.j();
                            M.j();
                            i5 = 8;
                            us2 j = s8u0Var.j(8, M);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                            us2Var = j;
                        } catch (Throwable th) {
                            s8u0Var.f(i9);
                            throw th;
                        }
                    }
                    fsv0 b = iev.b.b(e, null, null, null, null, null, us2Var, null, null, null, null, null, M, 0, 4030);
                    M = M;
                    if (z7) {
                        i6 = 16;
                        f = 16;
                    } else {
                        i6 = 16;
                        f = 6;
                    }
                    azu0.b(withPlainImage, a, b, q630Var2, new gev(null, new u890(f, i6, z8 ? i6 : 6, i5), null, 13), M, 6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    z5 = z7;
                    z6 = z8;
                } else {
                    M.h();
                    z5 = z3;
                    z6 = z4;
                }
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.smx0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            vmx0.this.C(aVar, q630Var, z5, z6, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        z3 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public final void D(int i, androidx.compose.runtime.a aVar, List list, izs izsVar) {
        androidx.compose.runtime.f fVar;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        androidx.compose.runtime.a M = aVar.M(1379286222);
        int i2 = (M.J(list != null ? new wow(list) : null) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1379286222, i2, -1, "com.vk.community.design.compose.widget.views.WidgetCoverListView.WidgetCoverListContent (WidgetCoverListView.kt:71)");
            }
            wow wowVar = list != null ? new wow(list) : null;
            if (wowVar == null || wowVar.b.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                fVar = M.s();
                if (fVar != null) {
                    wzsVar = new lob0(this, list, izsVar, i, 2);
                    fVar.d = wzsVar;
                }
                return;
            }
            if (list.size() > 1) {
                M.K(363978552);
                E((i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 512 | (i2 & 896), M, list, izsVar);
                M.j();
            } else {
                M.K(364050162);
                pox0.b.a aVar2 = (pox0.b.a) j5g.a0(new wow(list));
                if (aVar2 == null) {
                    M.K(364083486);
                    M.j();
                } else {
                    M.K(364083487);
                    int i3 = i2 << 9;
                    C(aVar2, txj0.f(q630.a.a, 1.0f), false, false, izsVar, M, (57344 & i3) | 262192 | (i3 & 458752), 12);
                    M.j();
                    s3q0 s3q0Var = s3q0.a;
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        fVar = M.s();
        if (fVar != null) {
            wzsVar = new qbj0(this, list, izsVar, i, 2);
            fVar.d = wzsVar;
        }
    }

    public final void E(int i, androidx.compose.runtime.a aVar, final List list, final izs izsVar) {
        androidx.compose.runtime.a M = aVar.M(-1441181649);
        int i2 = (M.J(list) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1441181649, i2, -1, "com.vk.community.design.compose.widget.views.WidgetCoverListView.WidgetCoverListRow (WidgetCoverListView.kt:91)");
            }
            ua8.a(null, null, false, kai.c(251173785, new yzs() { // from class: xsna.tmx0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(251173785, intValue, -1, "com.vk.community.design.compose.widget.views.WidgetCoverListView.WidgetCoverListRow.<anonymous> (WidgetCoverListView.kt:93)");
                        }
                        float j = va8Var.j() * 0.91f;
                        jgh0 x = p490.x(aVar2);
                        q630.a aVar3 = q630.a.a;
                        q630 r = p490.r(aVar3, x, 14);
                        a.l lVar = androidx.compose.foundation.layout.a.a;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar2, 0);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, r);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar4);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        cri.a.d dVar = cri.a.d;
                        List list2 = list;
                        Iterator a2 = yu50.a(aVar2, c, dVar, 205652391, list2);
                        int i3 = 0;
                        while (a2.hasNext()) {
                            Object next = a2.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                e43.t();
                                throw null;
                            }
                            pox0.b.a aVar5 = (pox0.b.a) next;
                            boolean z = i3 == 0;
                            boolean z2 = i3 == e43.h(new wow(list2));
                            this.C(aVar5, txj0.v(aVar3, (z || z2) ? j : j - 10), z, z2, izsVar, aVar2, SQLiteDatabase.OPEN_PRIVATECACHE, 0);
                            i3 = i4;
                        }
                        if (gp.d(aVar2)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3072, 7);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new s0(this, list, izsVar, i, 8);
        }
    }

    @Override // xsna.mmx0
    public final void h(pox0 pox0Var) {
        if (pox0Var instanceof pox0.c) {
            setWidgetCoverListState((pox0.c) pox0Var);
        }
    }
}
