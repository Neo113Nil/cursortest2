package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: ClipEditOrdCell.kt */
/* loaded from: classes17.dex */
public final class bsc {
    public static final void a(boolean z, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        gzs<s3q0> gzsVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1131005974);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1131005974, i2, -1, "com.vk.clips.viewer.edit.presentation.compose.ord.ClipEditOrdCell (ClipEditOrdCell.kt:16)");
            }
            gzsVar2 = gzsVar;
            wiu0.b(ahn.E(txj0.f(q630.a.a, 1.0f), "clip_edit_ord"), false, null, Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.clips_edit_ord_title, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b(d370.N(z ? R.string.clips_edit_ord_added : R.string.clips_edit_ord_not_added, 0, M), 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 196608, 28), null, gzsVar2, null, M, ((i2 << 12) & 458752) | 6, 86);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new asc(i, gzsVar2, z);
        }
    }
}
