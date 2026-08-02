package xsna;

import androidx.compose.foundation.text.selection.Direction;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectionLayout.kt */
/* loaded from: classes11.dex */
public final class odi0 {
    public final long a;
    public final long b;
    public final tny c;
    public final boolean d;
    public final obi0 e;
    public final wdi0 f;
    public final vg50 g;
    public final ArrayList h;
    public int i;
    public int j;
    public int k;

    /* compiled from: SelectionLayout.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public odi0(long j, long j2, tny tnyVar, boolean z, obi0 obi0Var, wdi0 wdi0Var) {
        this.a = j;
        this.b = j2;
        this.c = tnyVar;
        this.d = z;
        this.e = obi0Var;
        this.f = wdi0Var;
        int i = o300.a;
        this.g = new vg50(6);
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final int a(int i, Direction direction, Direction direction2) {
        if (i == -1) {
            int i2 = a.$EnumSwitchMapping$0[pdi0.a(direction, direction2).ordinal()];
            if (i2 == 1) {
                return this.k - 1;
            }
            if (i2 == 2) {
                return this.k;
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i;
    }
}
