package xsna;

import android.graphics.Rect;
import com.vk.im.ui.views.msg.bubble.MsgBubblePart;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BubblePaddingProvider.kt */
/* loaded from: classes2.dex */
public final class yws implements ll8 {

    /* compiled from: BubblePaddingProvider.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgBubblePart.values().length];
            try {
                iArr[MsgBubblePart.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgBubblePart.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MsgBubblePart.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MsgBubblePart.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.ll8
    public final Rect e(MsgBubblePart msgBubblePart) {
        int i = a.$EnumSwitchMapping$0[msgBubblePart.ordinal()];
        if (i == 1) {
            return ml8.u;
        }
        if (i == 2) {
            return ml8.v;
        }
        if (i == 3) {
            return ml8.w;
        }
        if (i == 4) {
            return ml8.x;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return yws.class.equals(obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return yws.class.hashCode();
    }

    @Override // xsna.ll8
    public final Rect i(MsgBubblePart msgBubblePart) {
        return ml8.y;
    }

    @Override // xsna.ll8
    public final Rect j(MsgBubblePart msgBubblePart) {
        int i = a.$EnumSwitchMapping$0[msgBubblePart.ordinal()];
        if (i == 1) {
            return ml8.i;
        }
        if (i == 2) {
            return ml8.j;
        }
        if (i == 3) {
            return ml8.k;
        }
        if (i == 4) {
            return ml8.l;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return "FullWidthPaddingProvider";
    }
}
