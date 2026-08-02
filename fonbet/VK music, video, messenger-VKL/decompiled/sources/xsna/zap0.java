package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.generated.VkColorToken;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.dt1;
import xsna.q630;

/* compiled from: TopshelfCard.kt */
/* loaded from: classes2.dex */
public final class zap0 {
    public static final void a(final jbp0 jbp0Var, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, q630 q630Var, final boolean z, final boolean z2, final xap0 xap0Var, final yzs yzsVar, final ubp0 ubp0Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        yzs yzsVar2;
        androidx.compose.runtime.a M = aVar.M(1767130936);
        int i2 = i | (M.J(jbp0Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | (M.y(gzsVar3) ? 2048 : 1024) | 24576 | (M.l(z) ? 131072 : 65536) | (M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(xap0Var) ? 8388608 : 4194304) | (M.y(yzsVar) ? 67108864 : 33554432) | (M.J(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i3 = M.J(ubp0Var) ? 4 : 2;
        if (M.t(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1767130936, i2, i3, "com.vk.libvideo.design.compose.video.topshelf.card.TopshelfCard (TopshelfCard.kt:27)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-531401844, 6, -1, "com.vk.libvideo.design.compose.video.topshelf.config.TopshelfCardConfigDefaults.currentConfig (TopshelfCardConfigDefaults.kt:58)");
            }
            M.K(257253645);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1522367110, 6, -1, "com.vk.libvideo.design.compose.video.topshelf.config.TopshelfCardConfigDefaults.milkshakeConfig (TopshelfCardConfigDefaults.kt:67)");
            }
            lap0 lap0Var = new lap0(VkColorToken.ImagePlaceholder);
            map0 map0Var = new map0(kap0.b);
            dt1.a.getClass();
            x9p0 x9p0Var = new x9p0(dt1.a.c, new fbp0(0, null, kap0.a, kap0.o));
            float f = kap0.c;
            float f2 = kap0.d;
            float f3 = kap0.e;
            float f4 = kap0.f;
            float f5 = kap0.g;
            frv0 frv0Var = wlb0.l(M).a;
            frv0 frv0Var2 = wlb0.l(M).T;
            frv0 frv0Var3 = wlb0.l(M).s0;
            VkColorToken vkColorToken = VkColorToken.TextContrast;
            kbp0 kbp0Var = new kbp0(f, f2, f3, f4, f5, null, frv0Var, frv0Var2, frv0Var3, vkColorToken, vkColorToken, false, 0.72f);
            float f6 = kap0.h;
            float f7 = kap0.i;
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            int i4 = i3;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            jap0 jap0Var = new jap0(lap0Var, map0Var, x9p0Var, kbp0Var, new tap0(f6, f7, new dbp0(buttonSize, buttonStyle, buttonAppearance), new hbp0(buttonSize, ButtonStyle.Secondary, buttonAppearance, new hap0(VkColorToken.BackgroundContrast, kap0.j), kap0.k), new tbp0(kap0.m, kap0.n, buttonSize, ButtonStyle.Link, buttonAppearance)), new cbp0(kap0.l, f7));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i5 = ((i2 >> 24) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i4 << 6) & 896);
            M.K(467969779);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(467969779, i5, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.media.resolveTopshelfCardMediaContent (ResolveTopshelfCardMediaContent.kt:12)");
            }
            if (yzsVar != null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                yzsVar2 = yzsVar;
            } else {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                yzsVar2 = null;
            }
            int i6 = i2 & 14;
            int i7 = i2 << 3;
            aVar2 = M;
            rap0.c(jbp0Var, jap0Var, gzsVar, gzsVar2, gzsVar3, z, z2, xap0Var, yzsVar2, aVar2, i6 | (i7 & 896) | (i7 & 7168) | (57344 & i7) | 196608 | (3670016 & i7) | (29360128 & i7) | (i7 & 234881024));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(gzsVar, gzsVar2, gzsVar3, q630Var2, z, z2, xap0Var, yzsVar, ubp0Var, i) { // from class: xsna.yap0
                public final /* synthetic */ gzs c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ xap0 i;
                public final /* synthetic */ yzs j;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    zap0.a(jbp0.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
