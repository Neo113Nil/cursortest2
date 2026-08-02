package xsna;

import com.vk.core.compose.component.cell.content.TextType;
import xsna.dt1;
import xsna.ty6;

/* compiled from: MilkshakeRichCellDefaults.kt */
/* loaded from: classes17.dex */
public final class wn20 {
    public static final wn20 a = new wn20();
    public static final float b = 48;
    public static final float c = 0;
    public static final float d;
    public static final float e;
    public static final float f;

    /* compiled from: MilkshakeRichCellDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextType.values().length];
            try {
                iArr[TextType.Title.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextType.Subtitle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextType.ExtraSubtitle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextType.Overtitle.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextType.Description.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f2 = kqu0.a;
        d = kqu0.q;
        e = kqu0.v;
        f = kqu0.t;
    }

    public final dt1.c a(boolean z, androidx.compose.runtime.a aVar, int i) {
        ty6.b bVar;
        aVar.K(1239442632);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1239442632, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeRichCellDefaults.contentAlignment (MilkshakeRichCellDefaults.kt:59)");
        }
        if (z) {
            dt1.a.getClass();
            bVar = dt1.a.k;
        } else {
            dt1.a.getClass();
            bVar = dt1.a.l;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return bVar;
    }
}
