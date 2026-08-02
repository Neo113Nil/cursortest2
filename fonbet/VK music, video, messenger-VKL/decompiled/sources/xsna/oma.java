package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import xsna.fma;
import xsna.ima;
import xsna.q630;

/* compiled from: VkCellButtonGroup.kt */
/* loaded from: classes17.dex */
public final class oma extends mma {
    public static final oma a = new oma();

    @Override // xsna.mma
    public final void b(ima.a aVar, gzs gzsVar, hma hmaVar, kma kmaVar, fma.a aVar2, androidx.compose.runtime.a aVar3, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar3.M(-2008540307);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630.a.a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(hmaVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(kmaVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.l(true) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2008540307, i2, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupScopeInstance.InternalGroupItem (VkCellButtonGroup.kt:145)");
            }
            jiu0.a(aVar, gzsVar, hmaVar, kmaVar, aVar2, M, i2 & 4194302);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nma(this, aVar, gzsVar, hmaVar, kmaVar, aVar2, i);
        }
    }
}
