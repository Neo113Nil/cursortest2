package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.VideoFile;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.r95;

/* compiled from: AuthorHeaderLiveCoverVideoPlayer.kt */
/* loaded from: classes5.dex */
public final class ha5 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final r95.b bVar, final q630 q630Var, final boolean z, final boolean z2, final int i, final gzs gzsVar, gzs gzsVar2, final gzs gzsVar3, final gzs gzsVar4, final gzs gzsVar5, wzs wzsVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a aVar2;
        gzs gzsVar6;
        wh50 wh50Var;
        wh50 wh50Var2;
        s95 s95Var;
        wh50 wh50Var3;
        s95 s95Var2;
        wh50 wh50Var4;
        wh50 wh50Var5;
        final wzs wzsVar2 = wzsVar;
        androidx.compose.runtime.a M = aVar.M(1621505472);
        int i3 = i2 | (M.J(bVar) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.l(z2) ? 2048 : 1024) | (M.o(i) ? 16384 : 8192) | (M.y(gzsVar) ? 131072 : 65536) | (M.y(gzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(gzsVar3) ? 8388608 : 4194304) | (M.y(gzsVar4) ? 67108864 : 33554432) | (M.y(gzsVar5) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i4 = M.y(wzsVar2) ? 4 : 2;
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1621505472, i3, i4, "com.vk.profile.core.livecover.AuthorHeaderLiveCoverVideoPlayer (AuthorHeaderLiveCoverVideoPlayer.kt:33)");
            }
            VideoFile videoFile = bVar.a.a;
            M.K(771612098);
            M.j();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new com.vk.libvideo.autoplay.a(false, null, null, false, false, false, null, null, null, null, null, null, false, null, 523255);
                M.R(x);
            }
            com.vk.libvideo.autoplay.a aVar3 = (com.vk.libvideo.autoplay.a) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new com.vk.libvideo.autoplay.a(true, null, Float.valueOf(1.0f), false, false, false, null, null, null, null, null, null, false, null, 524278);
                M.R(x2);
            }
            com.vk.libvideo.autoplay.a aVar4 = (com.vk.libvideo.autoplay.a) x2;
            int i5 = i4;
            wh50 c = androidx.compose.runtime.k.c(Boolean.valueOf(z2), M, (i3 >> 9) & 14);
            wh50 c2 = androidx.compose.runtime.k.c(Boolean.valueOf(z), M, (i3 >> 6) & 14);
            wh50 c3 = androidx.compose.runtime.k.c(Integer.valueOf(i), M, (i3 >> 12) & 14);
            boolean J = M.J(videoFile);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(null);
                M.R(x3);
            }
            wh50 wh50Var6 = (wh50) x3;
            boolean J2 = M.J(videoFile);
            Object x4 = M.x();
            if (J2 || x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x4);
            }
            wh50 wh50Var7 = (wh50) x4;
            boolean J3 = M.J(videoFile);
            Object x5 = M.x();
            if (J3 || x5 == c0012a) {
                x5 = androidx.compose.runtime.i.a(0);
                M.R(x5);
            }
            rg50 rg50Var = (rg50) x5;
            Boolean bool = (Boolean) wh50Var7.getValue();
            bool.getClass();
            wh50 c4 = androidx.compose.runtime.k.c(bool, M, 0);
            wh50 c5 = androidx.compose.runtime.k.c(Integer.valueOf(rg50Var.getIntValue()), M, 0);
            boolean J4 = M.J(videoFile) | M.J(aVar3) | M.J(aVar4);
            Object x6 = M.x();
            if (J4 || x6 == c0012a) {
                x6 = new s95(aVar3, aVar4);
                M.R(x6);
            }
            s95 s95Var3 = (s95) x6;
            yg5 yg5Var = (yg5) wh50Var6.getValue();
            boolean J5 = M.J(wh50Var6) | M.J(c2) | M.J(s95Var3) | M.J(c) | M.J(c4) | M.J(wh50Var7);
            Object x7 = M.x();
            if (J5 || x7 == c0012a) {
                x7 = new ga5(wh50Var6, c2, s95Var3, c, c4, wh50Var7, null);
                wh50Var = wh50Var6;
                wh50Var2 = c2;
                s95Var = s95Var3;
                wh50Var3 = c;
                M.R(x7);
            } else {
                wh50Var = wh50Var6;
                s95Var = s95Var3;
                wh50Var2 = c2;
                wh50Var3 = c;
            }
            bap.f(yg5Var, videoFile, (wzs) x7, M, 0);
            Integer valueOf = Integer.valueOf(((Number) c3.getValue()).intValue());
            Boolean bool2 = (Boolean) wh50Var2.getValue();
            bool2.getClass();
            yg5 yg5Var2 = (yg5) wh50Var.getValue();
            boolean J6 = M.J(c3) | M.J(c5) | M.J(rg50Var) | M.J(wh50Var2) | M.J(wh50Var7) | M.J(wh50Var) | M.J(s95Var) | M.J(wh50Var3);
            Object x8 = M.x();
            if (J6 || x8 == c0012a) {
                s95 s95Var4 = s95Var;
                wh50 wh50Var8 = wh50Var;
                x8 = new ca5(s95Var4, c3, c5, rg50Var, wh50Var2, wh50Var7, wh50Var8, wh50Var3, null);
                s95Var2 = s95Var4;
                wh50Var4 = wh50Var8;
                M.R(x8);
            } else {
                s95Var2 = s95Var;
                wh50Var4 = wh50Var;
            }
            bap.e(valueOf, bool2, yg5Var2, (wzs) x8, M, 0);
            yg5 yg5Var3 = (yg5) wh50Var4.getValue();
            Boolean bool3 = (Boolean) wh50Var3.getValue();
            bool3.getClass();
            boolean J7 = M.J(wh50Var4) | M.J(s95Var2) | M.J(wh50Var3);
            Object x9 = M.x();
            if (J7 || x9 == c0012a) {
                x9 = new da5(s95Var2, wh50Var4, wh50Var3, null);
                M.R(x9);
            }
            bap.f(yg5Var3, bool3, (wzs) x9, M, 0);
            boolean booleanValue = ((Boolean) wh50Var2.getValue()).booleanValue();
            boolean J8 = M.J(wh50Var4) | M.J(s95Var2) | M.J(wh50Var3);
            Object x10 = M.x();
            if (J8 || x10 == c0012a) {
                x10 = new ea5(s95Var2, wh50Var4, wh50Var3);
                M.R(x10);
            }
            izs izsVar = (izs) ((fcy) x10);
            boolean z3 = (i3 & 29360128) == 8388608;
            Object x11 = M.x();
            if (z3 || x11 == c0012a) {
                x11 = new z95(0, gzsVar3);
                M.R(x11);
            }
            izs izsVar2 = (izs) x11;
            boolean J9 = M.J(wh50Var4) | M.J(s95Var2) | M.J(wh50Var3) | ((i3 & 234881024) == 67108864);
            Object x12 = M.x();
            if (J9 || x12 == c0012a) {
                wh50Var5 = wh50Var4;
                aa5 aa5Var = new aa5(gzsVar4, s95Var2, wh50Var5, wh50Var3, 0);
                M.R(aa5Var);
                x12 = aa5Var;
            } else {
                wh50Var5 = wh50Var4;
            }
            izs izsVar3 = (izs) x12;
            boolean J10 = M.J(wh50Var5) | M.J(s95Var2) | M.J(wh50Var3);
            Object x13 = M.x();
            if (J10 || x13 == c0012a) {
                x13 = new fa5(s95Var2, wh50Var5, wh50Var3);
                M.R(x13);
            }
            izs izsVar4 = (izs) ((fcy) x13);
            boolean z4 = (i3 & 458752) == 131072;
            Object x14 = M.x();
            if (z4 || x14 == c0012a) {
                x14 = new ba5(0, gzsVar);
                M.R(x14);
            }
            izs izsVar5 = (izs) x14;
            boolean z5 = (i3 & 3670016) == 1048576;
            Object x15 = M.x();
            if (z5 || x15 == c0012a) {
                gzsVar6 = gzsVar2;
                x15 = new v95(gzsVar6, 0);
                M.R(x15);
            } else {
                gzsVar6 = gzsVar2;
            }
            wzs wzsVar3 = (wzs) x15;
            boolean J11 = M.J(s95Var2) | M.J(wh50Var3) | ((i3 & 1879048192) == 536870912);
            Object x16 = M.x();
            if (J11 || x16 == c0012a) {
                x16 = new w95(s95Var2, gzsVar5, wh50Var3, 0);
                M.R(x16);
            }
            izs izsVar6 = (izs) x16;
            boolean z6 = (i5 & 14) == 4;
            Object x17 = M.x();
            if (z6 || x17 == c0012a) {
                wzsVar2 = wzsVar;
                x17 = new x95(wzsVar2, 0);
                M.R(x17);
            } else {
                wzsVar2 = wzsVar;
            }
            com.vk.libvideo.autoplay.a aVar5 = com.vk.libvideo.autoplay.a.t;
            aVar2 = M;
            gdu0.a(videoFile, q630Var, aVar3, false, booleanValue, izsVar, izsVar2, izsVar3, izsVar4, izsVar5, null, null, wzsVar3, izsVar6, null, null, (yzs) x17, aVar2, (i3 & 112) | 3584, 52224);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            gzsVar6 = gzsVar2;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final gzs gzsVar7 = gzsVar6;
            s.d = new wzs(q630Var, z, z2, i, gzsVar, gzsVar7, gzsVar3, gzsVar4, gzsVar5, wzsVar2, i2) { // from class: xsna.y95
                public final /* synthetic */ q630 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ int f;
                public final /* synthetic */ gzs g;
                public final /* synthetic */ gzs h;
                public final /* synthetic */ gzs i;
                public final /* synthetic */ gzs j;
                public final /* synthetic */ gzs k;
                public final /* synthetic */ wzs l;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    ha5.a(r95.b.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final boolean b(mtk0<Boolean> mtk0Var) {
        return mtk0Var.getValue().booleanValue();
    }
}
