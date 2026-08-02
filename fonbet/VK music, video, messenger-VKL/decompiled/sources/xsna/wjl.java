package xsna;

import android.graphics.Rect;
import com.vk.im.ui.views.msg.bubble.MsgBubblePart;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BubblePaddingProvider.kt */
/* loaded from: classes2.dex */
public final class wjl implements ll8 {

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
        return wjl.class.equals(obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return wjl.class.hashCode();
    }

    @Override // xsna.ll8
    public final Rect i(MsgBubblePart msgBubblePart) {
        return new Rect();
    }

    @Override // xsna.ll8
    public final Rect j(MsgBubblePart msgBubblePart) {
        int i = a.$EnumSwitchMapping$0[msgBubblePart.ordinal()];
        if (i == 1) {
            return ml8.e;
        }
        if (i == 2) {
            return ml8.f;
        }
        if (i == 3) {
            return ml8.g;
        }
        if (i == 4) {
            return ml8.h;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return "DefaultOutgoingPaddingProvider";
    }
}
