package xsna;

import android.graphics.Rect;
import com.vk.im.ui.views.msg.bubble.MsgBubblePart;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BubblePaddingProvider.kt */
/* loaded from: classes2.dex */
public final class u5z implements ll8 {
    public static final Rect b;
    public static final Rect c;
    public static final Rect d;
    public static final Rect e;

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

    static {
        float f = 12;
        float f2 = 24;
        b = new Rect(iah0.a(f), iah0.a(f), iah0.a(f2), iah0.a(f));
        c = new Rect(iah0.a(f), iah0.a(f), iah0.a(f2), 0);
        d = new Rect(iah0.a(f), 0, iah0.a(f2), 0);
        e = new Rect(iah0.a(f), 0, iah0.a(f2), iah0.a(f));
    }

    @Override // xsna.ll8
    public final Rect e(MsgBubblePart msgBubblePart) {
        int i = a.$EnumSwitchMapping$0[msgBubblePart.ordinal()];
        if (i == 1) {
            return ml8.m;
        }
        if (i == 2) {
            return ml8.n;
        }
        if (i == 3) {
            return ml8.o;
        }
        if (i == 4) {
            return ml8.p;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return u5z.class.equals(obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return u5z.class.hashCode();
    }

    @Override // xsna.ll8
    public final Rect i(MsgBubblePart msgBubblePart) {
        return new Rect();
    }

    @Override // xsna.ll8
    public final Rect j(MsgBubblePart msgBubblePart) {
        int i = a.$EnumSwitchMapping$0[msgBubblePart.ordinal()];
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            return c;
        }
        if (i == 3) {
            return d;
        }
        if (i == 4) {
            return e;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return "LightOutgoingPaddingProvider";
    }
}
