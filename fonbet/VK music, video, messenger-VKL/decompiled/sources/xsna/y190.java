package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;

/* compiled from: OverflowIndicatorPlacementPolicy.kt */
/* loaded from: classes18.dex */
public interface y190 {

    /* compiled from: OverflowIndicatorPlacementPolicy.kt */
    public static final class a implements y190 {
        @Override // xsna.y190
        public final long a(long j, tra0 tra0Var, ArrayList arrayList, ArrayList arrayList2, int i, LayoutDirection layoutDirection) {
            int i2;
            int i3;
            int i4;
            long j2;
            if (arrayList.isEmpty()) {
                i2 = layoutDirection == LayoutDirection.Ltr ? o6j.i(j) - tra0Var.b : 0;
                i3 = tra0Var.c;
            } else {
                int size = arrayList.size() - 1;
                int i5 = ((int) (((h9x) arrayList.get(size)).a >> 32)) + ((tra0) arrayList2.get(size)).b;
                if (o6j.i(j) - i5 >= 0) {
                    int i6 = i5 - tra0Var.b;
                    i4 = i - tra0Var.c;
                    j2 = i6;
                    return (j2 << 32) | (i4 & 4294967295L);
                }
                i2 = layoutDirection == LayoutDirection.Ltr ? o6j.i(j) - tra0Var.b : 0;
                i3 = tra0Var.c;
            }
            i4 = i - i3;
            j2 = i2;
            return (j2 << 32) | (i4 & 4294967295L);
        }
    }

    long a(long j, tra0 tra0Var, ArrayList arrayList, ArrayList arrayList2, int i, LayoutDirection layoutDirection);
}
