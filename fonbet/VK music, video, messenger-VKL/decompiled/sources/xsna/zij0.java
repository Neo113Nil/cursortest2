package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import xsna.us2;

/* compiled from: ShowOnMainSwitch.kt */
/* loaded from: classes17.dex */
public final class zij0 {
    public static final void a(final String str, final String str2, final q630 q630Var, final boolean z, final boolean z2, final boolean z3, final boolean z4, final gzs gzsVar, final izs izsVar, final gzs gzsVar2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        int i3;
        Cell$Middle.d a;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar.M(-194235720);
        int i4 = (i & 6) == 0 ? (M.J(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= M.J(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= M.l(z2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= M.l(z3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= M.l(z4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= M.y(gzsVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= M.y(izsVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= M.y(gzsVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (M.t(i4 & 1, (i4 & 306783379) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-194235720, i4, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.main.ShowOnMainSwitch (ShowOnMainSwitch.kt:32)");
            }
            q630 E = ahn.E(q630Var, "ClipPostOnWall");
            if (z3) {
                M.K(-1154815321);
                M.j();
                a = new d6v(str, gzsVar2, izsVar, z4);
                i2 = i4;
                aVar3 = M;
                i3 = 16;
            } else {
                M.K(-1154524851);
                i2 = i4;
                i3 = 16;
                a = Cell$Middle.d.b.a(str, null, null, 0, null, null, M, (i4 & 14) | 12607488, 110);
                aVar3 = M;
                aVar3.j();
            }
            StringBuilder sb = new StringBuilder(i3);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            sb.append(str2);
            s3q0 s3q0Var = s3q0.a;
            String sb2 = sb.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList2.add(((us2.b.a) arrayList.get(i5)).a(sb.length()));
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(a, Cell$Middle.c.b.a(new us2(sb2, arrayList2), null, 3, 2, null, null, null, null, aVar4, 805309824, 498), null, null, aVar4, 196608, 28);
            boolean z5 = (i2 & 29360128) == 8388608;
            Object x = aVar4.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z5 || x == c0012a) {
                x = new taf(2, gzsVar);
                aVar4.R(x);
            }
            gzs gzsVar3 = (gzs) x;
            Object x2 = aVar4.x();
            if (x2 == c0012a) {
                x2 = new ow60(13);
                aVar4.R(x2);
            }
            com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3);
            int i6 = i2 >> 9;
            wiu0.b(E, z2, null, a2, com.vk.core.compose.component.cell.content.n.a(z, gzsVar3, false, a3, aVar4, (i6 & 14) | 24576, 4), null, null, aVar4, i6 & 112, 100);
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
            s.d = new wzs() { // from class: xsna.yij0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zij0.a(str, str2, q630Var, z, z2, z3, z4, gzsVar, izsVar, gzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
