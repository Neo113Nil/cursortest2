package one.video.controls.view.faskseek;

import android.view.View;
import android.view.ViewConfiguration;
import xsna.asp;
import xsna.pb;
import xsna.zrp;

/* compiled from: DownEventProcessor.kt */
/* loaded from: classes8.dex */
public final class DownEventProcessor {
    public static final long h = ViewConfiguration.getDoubleTapTimeout();
    public final View a;
    public final View b;
    public final pb c;
    public long d = -1;
    public boolean e;
    public Side f;
    public int g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DownEventProcessor.kt */
    public static final class Side {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Side[] $VALUES;
        public static final Side LEFT;
        public static final Side RIGHT;

        static {
            Side side = new Side("LEFT", 0);
            LEFT = side;
            Side side2 = new Side("RIGHT", 1);
            RIGHT = side2;
            Side[] sideArr = {side, side2};
            $VALUES = sideArr;
            $ENTRIES = new asp(sideArr);
        }

        public Side() {
            throw null;
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }

    /* compiled from: DownEventProcessor.kt */
    public static final class a {
        public Side a;
    }

    /* compiled from: DownEventProcessor.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Side.values().length];
            try {
                iArr[Side.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Side.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DownEventProcessor(View view, View view2, pb pbVar) {
        this.a = view;
        this.b = view2;
        this.c = pbVar;
    }
}
