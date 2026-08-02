package defpackage;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.WidgetDto$Group$Line$Orientation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes8.dex */
public final class c251 implements d251 {
    public static final b251 Companion = new b251();
    public static final i3y[] g;
    public final String a;
    public final sfe b;
    public final wv c;
    public final wzj d;
    public final List e;
    public final WidgetDto$Group$Line$Orientation f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new gs21(29)), null, a.b(lazyThreadSafetyMode, new z151(0)), a.b(lazyThreadSafetyMode, new z151(1))};
    }

    public /* synthetic */ c251(int i, String str, sfe sfeVar, wv wvVar, wzj wzjVar, List list, WidgetDto$Group$Line$Orientation widgetDto$Group$Line$Orientation) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, a251.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
        this.e = list;
        this.f = widgetDto$Group$Line$Orientation;
    }

    @Override // defpackage.y251
    public final wzj a() {
        return this.d;
    }

    @Override // defpackage.d251
    public final List b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c251)) {
            return false;
        }
        c251 c251Var = (c251) obj;
        return jl40.l(this.a, c251Var.a) && jl40.l(this.b, c251Var.b) && jl40.l(this.c, c251Var.c) && jl40.l(this.d, c251Var.d) && jl40.l(this.e, c251Var.e) && this.f == c251Var.f;
    }

    @Override // defpackage.y251
    public final sfe getContentDescription() {
        return this.b;
    }

    @Override // defpackage.y251
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sfe sfeVar = this.b;
        int hashCode2 = (hashCode + (sfeVar == null ? 0 : sfeVar.hashCode())) * 31;
        wv wvVar = this.c;
        return this.f.hashCode() + unr0.c((this.d.hashCode() + ((hashCode2 + (wvVar != null ? wvVar.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "Line(id=" + this.a + ", contentDescription=" + this.b + ", action=" + this.c + ", displayRules=" + this.d + ", widgetIds=" + this.e + ", orientation=" + this.f + ')';
    }

    public c251(String str, sfe sfeVar, wv wvVar, wzj wzjVar, List list, WidgetDto$Group$Line$Orientation widgetDto$Group$Line$Orientation) {
        this.a = str;
        this.b = sfeVar;
        this.c = wvVar;
        this.d = wzjVar;
        this.e = list;
        this.f = widgetDto$Group$Line$Orientation;
    }
}
