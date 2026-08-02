package xsna;

import xsna.c8t;

/* compiled from: GameUserStackItem.kt */
/* loaded from: classes17.dex */
public final class e8t implements wq5<c8t.a> {
    public static final e8t b = new e8t();

    @Override // xsna.wq5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void e(c8t.a aVar, yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(1207253390);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1207253390, i2, -1, "com.vk.games.presentation.components.items.GameUserStackItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (GameUserStackItem.kt:51)");
            }
            if (as.a((i2 & 112) | 8, yzsVar, fwu0.l(aVar.b, null, null, null, M, 0, 62), M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d8t(i, 0, this, aVar, yzsVar);
        }
    }
}
