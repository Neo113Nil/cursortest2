package xsna;

import android.graphics.Bitmap;
import com.vk.dto.stories.entities.stat.BackgroundInfo;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import java.util.List;

/* compiled from: StoryEditorState.kt */
/* loaded from: classes16.dex */
public final class w1m0 {
    public final a a;
    public final Bitmap b;
    public final BackgroundInfo c;

    public w1m0(a aVar, Bitmap bitmap, BackgroundInfo backgroundInfo) {
        this.a = aVar;
        this.b = bitmap;
        this.c = backgroundInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1m0)) {
            return false;
        }
        w1m0 w1m0Var = (w1m0) obj;
        return epx.f(this.a, w1m0Var.a) && epx.f(this.b, w1m0Var.b) && epx.f(this.c, w1m0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Bitmap bitmap = this.b;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        BackgroundInfo backgroundInfo = this.c;
        return hashCode2 + (backgroundInfo != null ? backgroundInfo.hashCode() : 0);
    }

    public final String toString() {
        return "StoryEditorState(drawingHistory=" + this.a + ", backgroundBitmap=" + this.b + ", backgroundInfo=" + this.c + ')';
    }

    /* compiled from: StoryEditorState.kt */
    public static final class a {
        public float a;
        public int b;
        public int c;
        public final List<vlo> d;
        public BrushesPanel.BrushType e;
        public int f;
        public boolean g;

        public a(float f, int i, int i2, List<vlo> list, BrushesPanel.BrushType brushType, int i3, boolean z) {
            this.a = f;
            this.b = i;
            this.c = i2;
            this.d = list;
            this.e = brushType;
            this.f = i3;
            this.g = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + shy.a(this.f, (this.e.hashCode() + fw3.a(shy.a(this.c, shy.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31, this.d)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DrawHistoryState(size=");
            sb.append(this.a);
            sb.append(", currentIndex=");
            sb.append(this.b);
            sb.append(", savedIndex=");
            sb.append(this.c);
            sb.append(", history=");
            sb.append(this.d);
            sb.append(", brushType=");
            sb.append(this.e);
            sb.append(", color=");
            sb.append(this.f);
            sb.append(", selectedByPipette=");
            return defpackage.q0.a(sb, this.g, ')');
        }

        public /* synthetic */ a() {
            this(0.2f, 0, 0, e43.o(new vlo((kif0) null, 3)), BrushesPanel.BrushType.Pen, -1, false);
        }
    }
}
