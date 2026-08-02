package xsna;

import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import com.vk.dto.common.ClipVideoFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ClipsTemplateEditorPresenterState.kt */
/* loaded from: classes16.dex */
public final class z7f {
    public final String a;
    public final ClipVideoFile b;
    public final dc50 c;
    public final List<n7f> d;
    public final Integer e;
    public final Integer f;
    public final Map<Integer, n7f> g;
    public final String h;
    public final boolean i;

    public z7f(String str, ClipVideoFile clipVideoFile, dc50 dc50Var, List<n7f> list, Integer num, Integer num2, Map<Integer, n7f> map, String str2, boolean z) {
        this.a = str;
        this.b = clipVideoFile;
        this.c = dc50Var;
        this.d = list;
        this.e = num;
        this.f = num2;
        this.g = map;
        this.h = str2;
        this.i = z;
    }

    public static z7f a(z7f z7fVar, List list, Integer num, Integer num2, Map map, int i) {
        String str = z7fVar.a;
        ClipVideoFile clipVideoFile = z7fVar.b;
        dc50 dc50Var = z7fVar.c;
        if ((i & 8) != 0) {
            list = z7fVar.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            num = z7fVar.e;
        }
        Integer num3 = num;
        if ((i & 32) != 0) {
            num2 = z7fVar.f;
        }
        Integer num4 = num2;
        if ((i & 64) != 0) {
            map = z7fVar.g;
        }
        String str2 = z7fVar.h;
        boolean z = z7fVar.i;
        z7fVar.getClass();
        return new z7f(str, clipVideoFile, dc50Var, list2, num3, num4, map, str2, z);
    }

    public final int b() {
        List<n7f> list = this.d;
        int i = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((n7f) it.next()).c != null && (i = i + 1) < 0) {
                e43.s();
                throw null;
            }
        }
        return i;
    }

    public final int c() {
        long j;
        Iterator<T> it = this.d.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = ((n7f) it.next()).c;
            if (clipsTemplateEditorVideoItem != null) {
                long j3 = clipsTemplateEditorVideoItem.g;
                j = j3 != 0 ? j3 - clipsTemplateEditorVideoItem.f : clipsTemplateEditorVideoItem.e;
            } else {
                j = 0;
            }
            j2 += j;
        }
        return (int) j2;
    }

    public final ArrayList d(int i) {
        List<n7f> list = this.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((n7f) obj).a >= i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((n7f) next).c == null) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7f)) {
            return false;
        }
        z7f z7fVar = (z7f) obj;
        return epx.f(this.a, z7fVar.a) && epx.f(this.b, z7fVar.b) && epx.f(this.c, z7fVar.c) && epx.f(this.d, z7fVar.d) && epx.f(this.e, z7fVar.e) && epx.f(this.f, z7fVar.f) && epx.f(this.g, z7fVar.g) && epx.f(this.h, z7fVar.h) && this.i == z7fVar.i;
    }

    public final int hashCode() {
        int a = fw3.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        Integer num = this.e;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int a2 = v11.a((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.g);
        String str = this.h;
        return Boolean.hashCode(this.i) + ((a2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "State(templateItems=" + this.d + ", galleryRequestFragmentIndex=" + this.e;
    }
}
