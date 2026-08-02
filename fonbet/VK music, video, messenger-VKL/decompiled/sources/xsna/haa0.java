package xsna;

import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.photo.editor.features.markup.draw.model.stat.DrawStatEvent;
import com.vk.photo.editor.features.markup.text.model.stat.TextStatEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PhotoParams.kt */
/* loaded from: classes4.dex */
public final class haa0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Integer d;
    public final Integer e;
    public final boolean f;
    public final Integer g;
    public final boolean h;
    public final String i;
    public final Integer j;
    public final CropStatEvent.Format k;
    public final String l;
    public final CollageStatEvent.Format m;
    public final Integer n;
    public final Integer o;
    public final String p;
    public final List<f5l0> q;
    public final List<TextStatEvent.e> r;
    public final List<DrawStatEvent.b> s;
    public final int t;
    public final int u;
    public final List<String> v;
    public final List<Float> w;
    public final boolean x;

    public haa0() {
        this(false, false, false, (Integer) null, (Integer) null, false, (Integer) null, false, (String) null, (Integer) null, (CropStatEvent.Format) null, (String) null, (Integer) null, (Integer) null, (String) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, 0, 0, (List) null, (List) null, false, 16777215);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haa0)) {
            return false;
        }
        haa0 haa0Var = (haa0) obj;
        return this.a == haa0Var.a && this.b == haa0Var.b && this.c == haa0Var.c && epx.f(this.d, haa0Var.d) && epx.f(this.e, haa0Var.e) && this.f == haa0Var.f && epx.f(this.g, haa0Var.g) && this.h == haa0Var.h && epx.f(this.i, haa0Var.i) && epx.f(this.j, haa0Var.j) && this.k == haa0Var.k && epx.f(this.l, haa0Var.l) && this.m == haa0Var.m && epx.f(this.n, haa0Var.n) && epx.f(this.o, haa0Var.o) && epx.f(this.p, haa0Var.p) && epx.f(this.q, haa0Var.q) && epx.f(this.r, haa0Var.r) && epx.f(this.s, haa0Var.s) && this.t == haa0Var.t && this.u == haa0Var.u && epx.f(this.v, haa0Var.v) && epx.f(this.w, haa0Var.w) && this.x == haa0Var.x;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int b2 = qoy.b((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f);
        Integer num3 = this.g;
        int b3 = qoy.b((b2 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.h);
        String str = this.i;
        int hashCode2 = (b3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.j;
        int hashCode3 = (hashCode2 + (num4 == null ? 0 : num4.hashCode())) * 31;
        CropStatEvent.Format format = this.k;
        int hashCode4 = (hashCode3 + (format == null ? 0 : format.hashCode())) * 31;
        String str2 = this.l;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CollageStatEvent.Format format2 = this.m;
        int hashCode6 = (hashCode5 + (format2 == null ? 0 : format2.hashCode())) * 31;
        Integer num5 = this.n;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.o;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str3 = this.p;
        return Boolean.hashCode(this.x) + fw3.a(fw3.a(shy.a(this.u, shy.a(this.t, fw3.a(fw3.a(fw3.a((hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.q), 31, this.r), 31, this.s), 31), 31), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder c = gp.c("PhotoParams(isCropped=", ", isRotated=", ", isZoomed=", this.a, this.b);
        c.append(this.c);
        c.append(", zoomPercentage=");
        c.append(this.d);
        c.append(", rotationDegrees=");
        c.append(this.e);
        c.append(", isAutocorrected=");
        c.append(this.f);
        c.append(", autocorrectionValue=");
        c.append(this.g);
        c.append(", hasFilter=");
        c.append(this.h);
        c.append(", filterName=");
        kr.b(this.j, this.i, ", filterValue=", ", cropperRatio=", c);
        c.append(this.k);
        c.append(", collageGrid=");
        c.append(this.l);
        c.append(", collageFormat=");
        c.append(this.m);
        c.append(", collageBorderWidth=");
        c.append(this.n);
        c.append(", collageCornerRadius=");
        mq.b(this.o, ", collageBorderColor=", this.p, ", stickers=", c);
        vq.d(c, this.q, ", texts=", this.r, ", draws=");
        c.append(this.s);
        c.append(", height=");
        c.append(this.t);
        c.append(", width=");
        c.append(this.u);
        c.append(", colorGradingParams=");
        c.append(this.v);
        c.append(", colorGradingValues=");
        c.append(this.w);
        c.append(", isUpgraded=");
        c.append(this.x);
        c.append(")");
        return c.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public haa0(boolean z, boolean z2, boolean z3, Integer num, Integer num2, boolean z4, Integer num3, boolean z5, String str, Integer num4, CropStatEvent.Format format, String str2, CollageStatEvent.Format format2, Integer num5, Integer num6, String str3, List<? extends f5l0> list, List<TextStatEvent.e> list2, List<DrawStatEvent.b> list3, int i, int i2, List<String> list4, List<Float> list5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = num;
        this.e = num2;
        this.f = z4;
        this.g = num3;
        this.h = z5;
        this.i = str;
        this.j = num4;
        this.k = format;
        this.l = str2;
        this.m = format2;
        this.n = num5;
        this.o = num6;
        this.p = str3;
        this.q = list;
        this.r = list2;
        this.s = list3;
        this.t = i;
        this.u = i2;
        this.v = list4;
        this.w = list5;
        this.x = z6;
    }

    public haa0(boolean z, boolean z2, boolean z3, Integer num, Integer num2, boolean z4, Integer num3, boolean z5, String str, Integer num4, CropStatEvent.Format format, String str2, Integer num5, Integer num6, String str3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, int i2, List list, List list2, boolean z6, int i3) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : num2, (i3 & 32) != 0 ? false : z4, (i3 & 64) != 0 ? null : num3, (i3 & 128) != 0 ? false : z5, (i3 & 256) != 0 ? null : str, (i3 & 512) != 0 ? null : num4, (i3 & 1024) != 0 ? null : format, (i3 & 2048) != 0 ? null : str2, (CollageStatEvent.Format) null, (i3 & 8192) != 0 ? null : num5, (i3 & 16384) != 0 ? null : num6, (32768 & i3) != 0 ? null : str3, (List<? extends f5l0>) ((65536 & i3) != 0 ? EmptyList.b : arrayList), (List<TextStatEvent.e>) ((131072 & i3) != 0 ? EmptyList.b : arrayList2), (List<DrawStatEvent.b>) ((262144 & i3) != 0 ? EmptyList.b : arrayList3), (524288 & i3) != 0 ? 0 : i, (1048576 & i3) != 0 ? 0 : i2, (List<String>) ((2097152 & i3) != 0 ? EmptyList.b : list), (List<Float>) ((4194304 & i3) != 0 ? EmptyList.b : list2), (i3 & 8388608) != 0 ? false : z6);
    }
}
