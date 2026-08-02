package xsna;

import com.vk.editor.timeline.entity.Edge;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.qhk;

/* compiled from: AutoScrollCropItemDelegate.kt */
/* loaded from: classes18.dex */
public final class ij5 {
    public static final /* synthetic */ qcy<Object>[] g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public final mwo0 a;
    public final qhk.b b;
    public int e;
    public final ysg0<shh0> c = new ysg0<>();
    public final x8a d = new x8a();
    public Edge f = Edge.None;

    /* compiled from: AutoScrollCropItemDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Edge.values().length];
            try {
                iArr[Edge.Right.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Edge.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ij5.class, "disposableHorizontalScrolling", "getDisposableHorizontalScrolling()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        g = new qcy[]{mutablePropertyReference1Impl};
        h = dn70.b(50);
        i = dn70.b(3);
        j = dn70.b(2);
        k = dn70.b(10);
    }

    public ij5(mwo0 mwo0Var, qhk.b bVar) {
        this.a = mwo0Var;
        this.b = bVar;
    }
}
