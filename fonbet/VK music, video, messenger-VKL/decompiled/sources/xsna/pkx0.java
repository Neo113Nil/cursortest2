package xsna;

import android.content.Context;
import android.widget.Scroller;
import com.vk.clips.design.view.seek.WheelSeekView;

/* compiled from: WheelScroller.kt */
/* loaded from: classes16.dex */
public final class pkx0 {
    public final WheelSeekView a;
    public final Scroller b;
    public a c = a.IDLE;
    public int d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WheelScroller.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FLING;
        public static final a IDLE;
        public static final a TOUCH_SCROLL;

        static {
            a aVar = new a("IDLE", 0);
            IDLE = aVar;
            a aVar2 = new a("TOUCH_SCROLL", 1);
            TOUCH_SCROLL = aVar2;
            a aVar3 = new a("FLING", 2);
            FLING = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: WheelScroller.kt */
    public interface b {
        int getMaxOffset();

        int getMinOffset();

        int getOffset();

        int getScrollLimit();

        void invalidate();

        void setOffset(int i);
    }

    public pkx0(Context context, WheelSeekView wheelSeekView) {
        this.a = wheelSeekView;
        this.b = new Scroller(context, null);
    }

    public final void a(int i) {
        WheelSeekView wheelSeekView = this.a;
        wheelSeekView.setOffset(swe0.g(wheelSeekView.getOffset() + i, wheelSeekView.getMinOffset(), wheelSeekView.getScrollLimit()));
        wheelSeekView.invalidate();
    }

    public final void b(a aVar) {
        gzs<s3q0> gzsVar;
        a aVar2 = this.c;
        a aVar3 = a.IDLE;
        WheelSeekView wheelSeekView = this.a;
        if (aVar2 == aVar3 && aVar != aVar3 && (gzsVar = wheelSeekView.p) != null) {
            gzsVar.invoke();
        }
        if (this.c != aVar3 && aVar == aVar3) {
            gzs<s3q0> gzsVar2 = wheelSeekView.q;
            if (gzsVar2 != null) {
                gzsVar2.invoke();
            }
            wheelSeekView.t = false;
            wheelSeekView.a();
        }
        if (this.c != aVar) {
            this.c = aVar;
            wheelSeekView.invalidate();
        }
    }
}
