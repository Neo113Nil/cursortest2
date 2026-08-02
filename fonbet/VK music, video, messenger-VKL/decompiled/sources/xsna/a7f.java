package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ClipsTemplateEditorCropperPresenterState.kt */
/* loaded from: classes16.dex */
public final class a7f {
    public final dc50 a;
    public final List<n7f> b;
    public final int c;

    public a7f(dc50 dc50Var, List<n7f> list, int i) {
        this.a = dc50Var;
        this.b = list;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a7f a(a7f a7fVar, ArrayList arrayList, int i, int i2) {
        dc50 dc50Var = a7fVar.a;
        List list = arrayList;
        if ((i2 & 2) != 0) {
            list = a7fVar.b;
        }
        if ((i2 & 4) != 0) {
            i = a7fVar.c;
        }
        a7fVar.getClass();
        return new a7f(dc50Var, list, i);
    }

    public final n7f b() {
        List<n7f> list = this.b;
        int size = list.size();
        int i = this.c;
        if (i >= 0 && i < size) {
            return list.get(i);
        }
        com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("ClipsTemplateEditorCropperPresenterState try to get item out of indexes if cropper items currentCropperItemIndex=" + i + " items=" + list));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7f)) {
            return false;
        }
        a7f a7fVar = (a7f) obj;
        return epx.f(this.a, a7fVar.a) && epx.f(this.b, a7fVar.b) && this.c == a7fVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fw3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsTemplateEditorCropperPresenterState(musicTrackInfo=");
        sb.append(this.a);
        sb.append(", templateItems=");
        sb.append(this.b);
        sb.append(", currentCropperItemIndex=");
        return vu5.b(sb, this.c, ')');
    }
}
