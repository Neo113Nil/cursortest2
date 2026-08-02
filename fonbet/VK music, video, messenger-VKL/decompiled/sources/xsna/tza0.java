package xsna;

import androidx.compose.runtime.a;
import com.vungle.ads.internal.protos.Sdk;
import xsna.sza0;

/* compiled from: PlayerBackgroundUtils.kt */
/* loaded from: classes3.dex */
public final class tza0 {

    /* compiled from: PlayerBackgroundUtils.kt */
    public static final class a implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ sza0.a b;

        public a(sza0.a aVar) {
            this.b = aVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    public static final void a(final boolean z, String str, final pfl0 pfl0Var, long j, androidx.compose.runtime.a aVar, final int i) {
        final long j2;
        final String str2 = str;
        androidx.compose.runtime.a M = aVar.M(-632739749);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(pfl0Var) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            long j3 = l5g.j;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-632739749, i2, -1, "com.vk.music.stickyplayer.presentation.components.background.ExtractColorsLaunchedEffect (PlayerBackgroundUtils.kt:41)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                j2 = j3;
                sza0 sza0Var = new sza0(z, pfl0Var, str2, j2, null);
                str2 = str2;
                M.R(sza0Var);
                x = sza0Var;
            } else {
                j2 = j3;
            }
            bap.f(valueOf, str2, (wzs) x, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            j2 = j;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, str2, pfl0Var, j2, i) { // from class: xsna.rza0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ String c;
                public final /* synthetic */ pfl0 d;
                public final /* synthetic */ long e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    tza0.a(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
