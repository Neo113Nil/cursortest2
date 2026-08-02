package xsna;

import com.vk.story.viewer.api.models.PreloadSource;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IdeasStoryState.kt */
/* loaded from: classes6.dex */
public final class juv implements km50 {
    public final List<nsv> b;
    public final int c;
    public final vya0 d;
    public final xqj e;
    public final PreloadSource f;
    public final boolean g;
    public final float h;
    public final boolean i;

    public juv(List<nsv> list, int i, vya0 vya0Var, xqj xqjVar, PreloadSource preloadSource, boolean z, float f, boolean z2) {
        this.b = list;
        this.c = i;
        this.d = vya0Var;
        this.e = xqjVar;
        this.f = preloadSource;
        this.g = z;
        this.h = f;
        this.i = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static juv a(juv juvVar, ArrayList arrayList, int i, vya0 vya0Var, xqj xqjVar, PreloadSource preloadSource, float f, int i2) {
        List list = arrayList;
        if ((i2 & 1) != 0) {
            list = juvVar.b;
        }
        List list2 = list;
        if ((i2 & 2) != 0) {
            i = juvVar.c;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            vya0Var = juvVar.d;
        }
        vya0 vya0Var2 = vya0Var;
        if ((i2 & 8) != 0) {
            xqjVar = juvVar.e;
        }
        xqj xqjVar2 = xqjVar;
        PreloadSource preloadSource2 = (i2 & 16) != 0 ? juvVar.f : preloadSource;
        boolean z = (i2 & 32) != 0 ? juvVar.g : false;
        float f2 = (i2 & 64) != 0 ? juvVar.h : f;
        boolean z2 = (i2 & 128) != 0 ? juvVar.i : true;
        juvVar.getClass();
        return new juv(list2, i3, vya0Var2, xqjVar2, preloadSource2, z, f2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juv)) {
            return false;
        }
        juv juvVar = (juv) obj;
        return epx.f(this.b, juvVar.b) && this.c == juvVar.c && epx.f(this.d, juvVar.d) && epx.f(this.e, juvVar.e) && this.f == juvVar.f && this.g == juvVar.g && Float.compare(this.h, juvVar.h) == 0 && this.i == juvVar.i;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31)) * 31)) * 31;
        PreloadSource preloadSource = this.f;
        return Boolean.hashCode(this.i) + io.reactivex.rxjava3.subjects.b.a(this.h, qoy.b((hashCode + (preloadSource == null ? 0 : preloadSource.hashCode())) * 31, 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdeasStoryState(pages=");
        sb.append(this.b);
        sb.append(", currentIndex=");
        sb.append(this.c);
        sb.append(", playback=");
        sb.append(this.d);
        sb.append(", controls=");
        sb.append(this.e);
        sb.append(", preloadSource=");
        sb.append(this.f);
        sb.append(", isExternalLoaderVisible=");
        sb.append(this.g);
        sb.append(", dragScale=");
        sb.append(this.h);
        sb.append(", isClosing=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
