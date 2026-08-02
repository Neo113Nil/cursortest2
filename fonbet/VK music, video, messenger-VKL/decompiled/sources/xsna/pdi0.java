package xsna;

import androidx.compose.foundation.text.selection.Direction;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectionLayout.kt */
/* loaded from: classes11.dex */
public final class pdi0 {

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

    public static final Direction a(Direction direction, Direction direction2) {
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[direction2.ordinal()];
        if (i == 1) {
            return Direction.BEFORE;
        }
        if (i != 2) {
            if (i == 3) {
                return Direction.AFTER;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = iArr[direction.ordinal()];
        if (i2 == 1) {
            return Direction.BEFORE;
        }
        if (i2 == 2) {
            return Direction.ON;
        }
        if (i2 == 3) {
            return Direction.AFTER;
        }
        throw new NoWhenBranchMatchedException();
    }
}
