package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicOwner;
import com.vk.core.compose.component.cell.content.Cell$Left;

/* compiled from: ComposeMusicOwnerVh.kt */
/* loaded from: classes16.dex */
public final class hr40 implements Cell$Left.Main {
    public final UIBlockMusicOwner a;
    public final float b;
    public final k7a c;
    public final gzs<s3q0> d;

    public hr40(UIBlockMusicOwner uIBlockMusicOwner, float f, k7a k7aVar, gzs gzsVar) {
        this.a = uIBlockMusicOwner;
        this.b = f;
        this.c = k7aVar;
        this.d = gzsVar;
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-335104802);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-335104802, i2, -1, "com.vk.catalog2.feature.music.holders.MusicOwnerImage.Content (ComposeMusicOwnerVh.kt:161)");
            }
            float f = 16;
            q630 q = txj0.q(s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 5), this.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new ye40(1);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z = (i2 & 896) == 256;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new q130(this, 5);
                M.R(x2);
            }
            ae2.a(6, 0, M, izsVar, (izs) x2, q);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mte(i, 2, this, spg0Var, q630Var);
        }
    }
}
