package xsna;

import android.graphics.Typeface;
import android.text.Layout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.stories.model.TextBackgroundInfo;
import java.util.Objects;

/* compiled from: TextStickerInfo.java */
/* loaded from: classes18.dex */
public final class imo0 {
    public Typeface a;
    public Layout.Alignment b;
    public float c;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;

    @Nullable
    public t2l0 i;

    @Nullable
    public Boolean j;
    public final TextBackgroundInfo k;
    public final b5j0 l;
    public String m;

    @Nullable
    public String n;

    /* compiled from: TextStickerInfo.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public imo0() {
        this.k = new TextBackgroundInfo();
        this.l = new b5j0();
    }

    public static String a(Layout.Alignment alignment) {
        int i = a.a[alignment.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "unknown" : TtmlNode.RIGHT : TtmlNode.CENTER : TtmlNode.LEFT;
    }

    public final float b(@NonNull t5s t5sVar) {
        return (this.c - t5sVar.a()) / (t5sVar.d() - t5sVar.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && imo0.class == obj.getClass()) {
            imo0 imo0Var = (imo0) obj;
            if (Float.compare(imo0Var.c, this.c) == 0 && Float.compare(imo0Var.d, this.d) == 0 && Float.compare(imo0Var.e, this.e) == 0 && this.f == imo0Var.f && this.g == imo0Var.g && this.h == imo0Var.h && Objects.equals(this.a, imo0Var.a) && this.b == imo0Var.b && Objects.equals(this.i, imo0Var.i) && Objects.equals(this.j, imo0Var.j) && Objects.equals(this.k, imo0Var.k) && Objects.equals(this.l, imo0Var.l) && Objects.equals(this.m, imo0Var.m) && Objects.equals(this.n, imo0Var.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n);
    }

    public imo0(float f, int i, Layout.Alignment alignment) {
        this.k = new TextBackgroundInfo();
        this.l = new b5j0();
        this.c = f;
        this.g = i;
        this.b = alignment;
    }

    public imo0(t5s t5sVar, int i, Layout.Alignment alignment) {
        this((t5sVar.a() + t5sVar.d()) / 3.0f, i, alignment);
        t5sVar.b(this);
    }
}
