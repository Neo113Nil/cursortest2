package xsna;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: CarouselPhotoGestureProvider.kt */
/* loaded from: classes4.dex */
public final class dv9 {
    public final ror a;
    public final apr b;
    public View d;
    public final int c = ViewConfiguration.getLongPressTimeout();
    public a e = a.NONE;
    public final tw3 f = new tw3(this, 1);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CarouselPhotoGestureProvider.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DRAGGING;
        public static final a NONE;

        static {
            a aVar = new a("DRAGGING", 0);
            DRAGGING = aVar;
            a aVar2 = new a("NONE", 1);
            NONE = aVar2;
            a[] aVarArr = {aVar, aVar2};
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

    public dv9(ror rorVar, apr aprVar) {
        this.a = rorVar;
        this.b = aprVar;
    }
}
