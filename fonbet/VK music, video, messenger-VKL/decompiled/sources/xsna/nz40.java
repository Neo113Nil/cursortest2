package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Build;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Thumb;
import com.vk.music.view.ThumbsImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.q630;
import xsna.wkj;
import xsna.xzj;

/* compiled from: MusicPlaylistCell.kt */
/* loaded from: classes4.dex */
public final class nz40 {
    public static final float a = 6;
    public static final float b = 64;

    public static final void a(xzj.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        float f;
        Uri uri;
        androidx.compose.runtime.a M = aVar2.M(-1838357797);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(null) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1838357797, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.ComplexCoverImage (MusicPlaylistCell.kt:193)");
            }
            M.K(-1430277643);
            List H0 = j5g.H0(aVar.a, 4);
            ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
            Iterator it = H0.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                f = b;
                if (!hasNext) {
                    break;
                }
                Thumb thumb = (Thumb) it.next();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-581214527, 48, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.getForSizeUriOrEmpty (MusicPlaylistCell.kt:276)");
                }
                azl azlVar = (azl) M.r(uvi.h);
                if (thumb != null) {
                    int I0 = (int) azlVar.I0(f);
                    Serializer.c<Thumb> cVar = Thumb.CREATOR;
                    uri = thumb.Cb(I0, false);
                } else {
                    uri = null;
                }
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                arrayList.add(uri);
            }
            M.j();
            int I02 = (int) ((azl) M.r(uvi.h)).I0(f);
            boolean J = M.J(arrayList);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new qow(new ThumbsImageView.a(arrayList, I02, null));
                M.R(x);
            }
            fwu0.b(((qow) x).a, q630Var, null, null, kai.c(-1129568080, new zai(2), M), M, (i2 & 112) | 24576, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sag(aVar, q630Var, i, 4);
        }
    }

    public static final void b(xzj xzjVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(670242286);
        int i2 = (M.J(xzjVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(670242286, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.CoverImage (MusicPlaylistCell.kt:144)");
            }
            if (xzjVar instanceof xzj.a) {
                M.K(-114827466);
                a((xzj.a) xzjVar, q630Var, M, i2 & 1008);
                M.j();
            } else if (xzjVar instanceof xzj.b.a) {
                M.K(-114580365);
                q630 q = txj0.q(q630Var, b);
                long j = wlb0.h(M).getBackground().x;
                float f = a;
                q630 m = hr80.m(q, j, vog0.b(f));
                y18 a2 = aqw.a(0.5f, wlb0.h(M).getImage().a);
                q630 E = ahn.E(r18.b(a2.a, a2.b, m, vog0.b(f)), "MusicPickerPlaylistCover");
                qzu0.a.getClass();
                lg90 f1 = qzu0.f1(M);
                long j2 = wlb0.h(M).getIcon().l;
                if (Build.VERSION.SDK_INT >= 29) {
                    se7.b();
                    porterDuffColorFilter = re7.b(f870.H(j2), z42.a(5));
                } else {
                    porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j2), z42.b(5));
                }
                vjw.a(f1, null, E, null, wkj.a.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j2, 5, porterDuffColorFilter), M, 24632, 40);
                M.j();
            } else {
                if (!(xzjVar instanceof xzj.b)) {
                    throw alb0.c(-142251557, M);
                }
                M.K(-113622217);
                d((xzj.b) xzjVar, q630Var, M, i2 & 1008);
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
            s.d = new ne4(xzjVar, q630Var, i, 3);
        }
    }

    public static final void c(final c250 c250Var, final int i, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        com.vk.core.compose.component.cell.content.h1 h1Var2;
        androidx.compose.runtime.a M = aVar.M(-346586605);
        if ((i2 & 6) == 0) {
            i3 = (M.J(c250Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(gzsVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-346586605, i3, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPlaylistCell (MusicPlaylistCell.kt:51)");
            }
            xzj xzjVar = c250Var.f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1428263987, 384, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicCover.Companion.invoke (MusicPlaylistCell.kt:130)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new uf40(xzjVar);
                M.R(x);
            }
            uf40 uf40Var = (uf40) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.i0 a2 = Cell$Left.a.a(uf40Var, null, M, 2);
            int i4 = i3;
            String str = c250Var.a;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new ept(12);
                M.R(x2);
            }
            androidx.compose.runtime.a aVar3 = M;
            com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(str, null, null, 1, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, aVar3, 12610560, 70);
            if (c250Var.c) {
                aVar3.K(1937744347);
                String str2 = c250Var.b;
                Object x3 = aVar3.x();
                if (x3 == c0012a) {
                    x3 = new c4r(18);
                    aVar3.R(x3);
                }
                com.vk.core.compose.component.cell.content.h1 b2 = Cell$Middle.c.b.b(str2, 1, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), aVar3, 12583344, 88);
                aVar3 = aVar3;
                aVar3.j();
                h1Var = b2;
            } else {
                aVar3.K(-59126262);
                aVar3.j();
                h1Var = null;
            }
            if (c250Var.e) {
                aVar3.K(1937758874);
                com.vk.core.compose.component.cell.content.h1 a4 = Cell$Middle.b.a.a(c250Var.d, 1, null, aVar3, 25008, 8);
                aVar3.j();
                h1Var2 = a4;
            } else {
                aVar3.K(-58830646);
                aVar3.j();
                h1Var2 = null;
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            com.vk.core.compose.component.cell.content.k0 a5 = Cell$Middle.a.a(a3, h1Var, h1Var2, null, aVar4, 196608, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().n;
            Object x4 = aVar4.x();
            if (x4 == c0012a) {
                x4 = new c220(7);
                aVar4.R(x4);
            }
            com.vk.core.compose.component.cell.content.u0 a6 = o.b.a.a(null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), j, false, aVar4, 221184, 3);
            boolean z = (i4 & 112) == 32;
            Object x5 = aVar4.x();
            if (z || x5 == c0012a) {
                x5 = new umg(i, 1);
                aVar4.R(x5);
            }
            q630 b3 = egi0.b(q630.a.a, false, (izs) x5);
            boolean z2 = (i4 & 896) == 256;
            Object x6 = aVar4.x();
            if (z2 || x6 == c0012a) {
                x6 = new vt30(gzsVar, 4);
                aVar4.R(x6);
            }
            wiu0.b(ojc.c(b3, false, null, null, (gzs) x6, 15), false, a2, a5, a6, null, null, aVar4, 0, 98);
            aVar2 = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mz40
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    nz40.c(c250.this, i, gzsVar, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(xzj.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1291922755);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(null) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1291922755, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.SimpleCoverImage (MusicPlaylistCell.kt:288)");
            }
            q630Var2 = q630Var;
            fwu0.c(q630Var2, null, qa50.b(bVar.getImage(), b, M, 48), null, null, null, null, kai.c(-810323756, new cbi(1), M), M, ((i2 >> 3) & 14) | 100663296, 250);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yc2(bVar, q630Var2, i, 2);
        }
    }
}
