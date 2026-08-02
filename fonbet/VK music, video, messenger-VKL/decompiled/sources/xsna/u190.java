package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: OverflowFlowRow.kt */
/* loaded from: classes18.dex */
public final class u190 {
    public final int a;
    public final khk0 b;
    public final t190 c;
    public final LayoutDirection d;

    public u190(int i, khk0 khk0Var, t190 t190Var, LayoutDirection layoutDirection) {
        this.a = i;
        this.b = khk0Var;
        this.c = t190Var;
        this.d = layoutDirection;
        if (i < 1) {
            throw new IllegalArgumentException("maxLines must be at least 1");
        }
    }
}
