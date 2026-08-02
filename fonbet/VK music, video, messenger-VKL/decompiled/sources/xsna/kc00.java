package xsna;

import android.graphics.RectF;
import com.vk.editor.timeline.api.YIndexShift;
import com.vk.editor.timeline.entity.Edge;
import com.vk.editor.timeline.state.magnet.MagnetType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ywo0;

/* compiled from: MagnetSearchEngineCrop.kt */
/* loaded from: classes18.dex */
public final class kc00 extends jc00 {

    /* compiled from: MagnetSearchEngineCrop.kt */
    public static final class a {
        public final Float a;
        public final Float b;
        public final MagnetType c;

        public a(Float f, Float f2, MagnetType magnetType) {
            this.a = f;
            this.b = f2;
            this.c = magnetType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            Float f = this.a;
            int hashCode = (f == null ? 0 : f.hashCode()) * 31;
            Float f2 = this.b;
            return this.c.hashCode() + ((hashCode + (f2 != null ? f2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "CropItemMagnet(nearestLeftBound=" + this.a + ", nearestRightBound=" + this.b + ", type=" + this.c + ')';
        }
    }

    /* compiled from: MagnetSearchEngineCrop.kt */
    public static final /* synthetic */ class b {
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

    public kc00() {
        throw null;
    }

    @Override // xsna.jc00
    public final ic00 b(gp6 gp6Var, YIndexShift yIndexShift) {
        return new ic00(gp6Var.m(), this.b, gp6Var.u(), gp6Var.t(), yIndexShift, gp6Var.H());
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x035f  */
    @Override // xsna.jc00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ic00 c(gp6 gp6Var, YIndexShift yIndexShift) {
        Object next;
        Object next2;
        a aVar;
        RectF u;
        RectF u2;
        a aVar2;
        Iterator it;
        Iterator it2;
        Object next3;
        Iterator it3;
        Iterator it4;
        Object next4;
        int i;
        a aVar3;
        RectF rectF;
        RectF rectF2;
        List I;
        Object next5;
        Object next6;
        float floatValue;
        int i2;
        RectF rectF3;
        RectF rectF4;
        RectF u3;
        RectF u4;
        this.b = MagnetType.None;
        this.c = Float.MAX_VALUE;
        this.d = gp6Var.u().left;
        this.e = gp6Var.u().right;
        float f = f(gp6Var);
        ArrayList v = c5g.v(d().g);
        ArrayList arrayList = new ArrayList();
        Iterator it5 = v.iterator();
        while (it5.hasNext()) {
            Object next7 = it5.next();
            if (!epx.f(((gp6) next7).m(), gp6Var.m())) {
                arrayList.add(next7);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            Object next8 = it6.next();
            if (Math.abs(((gp6) next8).u().left - f) <= dn70.b(10)) {
                arrayList2.add(next8);
            }
        }
        Iterator it7 = arrayList2.iterator();
        if (it7.hasNext()) {
            next = it7.next();
            if (it7.hasNext()) {
                float abs = Math.abs(f - ((gp6) next).u().left);
                do {
                    Object next9 = it7.next();
                    float abs2 = Math.abs(f - ((gp6) next9).u().left);
                    if (Float.compare(abs, abs2) > 0) {
                        next = next9;
                        abs = abs2;
                    }
                } while (it7.hasNext());
            }
        } else {
            next = null;
        }
        gp6 gp6Var2 = (gp6) next;
        ArrayList arrayList3 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Object next10 = it8.next();
            if (Math.abs(((gp6) next10).u().right - f) <= dn70.b(10)) {
                arrayList3.add(next10);
            }
        }
        Iterator it9 = arrayList3.iterator();
        if (it9.hasNext()) {
            next2 = it9.next();
            if (it9.hasNext()) {
                float abs3 = Math.abs(((gp6) next2).u().right - f);
                do {
                    Object next11 = it9.next();
                    float abs4 = Math.abs(((gp6) next11).u().right - f);
                    if (Float.compare(abs3, abs4) > 0) {
                        next2 = next11;
                        abs3 = abs4;
                    }
                } while (it9.hasNext());
            }
        } else {
            next2 = null;
        }
        gp6 gp6Var3 = (gp6) next2;
        int i3 = b.$EnumSwitchMapping$0[g().ordinal()];
        if (i3 == 1) {
            aVar = new a((gp6Var2 == null || (u2 = gp6Var2.u()) == null) ? null : Float.valueOf(u2.left), (gp6Var3 == null || (u = gp6Var3.u()) == null) ? null : Float.valueOf(u.right), MagnetType.RightEdgeToNeighbourItem);
        } else {
            if (i3 != 2) {
                aVar2 = null;
                float f2 = f(gp6Var);
                List<ckt0> list = d().f;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : list) {
                    if (!epx.f(((ckt0) obj).a, gp6Var.m())) {
                        arrayList4.add(obj);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                it = arrayList4.iterator();
                while (it.hasNext()) {
                    Object next12 = it.next();
                    if (Math.abs(((ckt0) next12).l.left - f2) <= dn70.b(10)) {
                        arrayList5.add(next12);
                    }
                }
                it2 = arrayList5.iterator();
                if (it2.hasNext()) {
                    next3 = null;
                } else {
                    next3 = it2.next();
                    if (it2.hasNext()) {
                        float f3 = ((ckt0) next3).l.left - f2;
                        do {
                            Object next13 = it2.next();
                            float f4 = ((ckt0) next13).l.left - f2;
                            if (Float.compare(f3, f4) > 0) {
                                next3 = next13;
                                f3 = f4;
                            }
                        } while (it2.hasNext());
                    }
                }
                ckt0 ckt0Var = (ckt0) next3;
                ArrayList arrayList6 = new ArrayList();
                it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    Object next14 = it3.next();
                    if (Math.abs(((ckt0) next14).l.right - f2) <= dn70.b(10)) {
                        arrayList6.add(next14);
                    }
                }
                it4 = arrayList6.iterator();
                if (it4.hasNext()) {
                    next4 = null;
                } else {
                    next4 = it4.next();
                    if (it4.hasNext()) {
                        float f5 = f2 - ((ckt0) next4).l.right;
                        do {
                            Object next15 = it4.next();
                            float f6 = f2 - ((ckt0) next15).l.right;
                            if (Float.compare(f5, f6) > 0) {
                                next4 = next15;
                                f5 = f6;
                            }
                        } while (it4.hasNext());
                    }
                }
                ckt0 ckt0Var2 = (ckt0) next4;
                i = b.$EnumSwitchMapping$0[g().ordinal()];
                if (i != 1) {
                    aVar3 = new a((ckt0Var == null || (rectF2 = ckt0Var.l) == null) ? null : Float.valueOf(rectF2.left), (ckt0Var2 == null || (rectF = ckt0Var2.l) == null) ? null : Float.valueOf(rectF.right), MagnetType.RightEdgeToRightVideoItem);
                } else if (i != 2) {
                    aVar3 = null;
                } else {
                    aVar3 = new a((ckt0Var == null || (rectF4 = ckt0Var.l) == null) ? null : Float.valueOf(rectF4.left), (ckt0Var2 == null || (rectF3 = ckt0Var2.l) == null) ? null : Float.valueOf(rectF3.right), MagnetType.LeftEdgeToLeftVideoItem);
                }
                float centerX = d().o.centerX();
                float f7 = f(gp6Var);
                I = rl3.I(new a[]{aVar2, aVar3, Math.abs(f7 - centerX) >= dn70.b(10) ? new a(Float.valueOf(centerX), Float.valueOf(centerX), f7 >= centerX ? MagnetType.LeftEdgeToCursor : MagnetType.RightEdgeToCursor) : null});
                float f8 = f(gp6Var);
                if (I.isEmpty()) {
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj2 : I) {
                        if (((a) obj2).a != null) {
                            arrayList7.add(obj2);
                        }
                    }
                    Iterator it10 = arrayList7.iterator();
                    if (it10.hasNext()) {
                        next5 = it10.next();
                        if (it10.hasNext()) {
                            float abs5 = Math.abs(((a) next5).a.floatValue() - f8);
                            do {
                                Object next16 = it10.next();
                                float abs6 = Math.abs(((a) next16).a.floatValue() - f8);
                                if (Float.compare(abs5, abs6) > 0) {
                                    next5 = next16;
                                    abs5 = abs6;
                                }
                            } while (it10.hasNext());
                        }
                    } else {
                        next5 = null;
                    }
                    a aVar4 = (a) next5;
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj3 : I) {
                        if (((a) obj3).b != null) {
                            arrayList8.add(obj3);
                        }
                    }
                    Iterator it11 = arrayList8.iterator();
                    if (it11.hasNext()) {
                        next6 = it11.next();
                        if (it11.hasNext()) {
                            float abs7 = Math.abs(((a) next6).b.floatValue() - f8);
                            do {
                                Object next17 = it11.next();
                                float abs8 = Math.abs(((a) next17).b.floatValue() - f8);
                                if (Float.compare(abs7, abs8) > 0) {
                                    next6 = next17;
                                    abs7 = abs8;
                                }
                            } while (it11.hasNext());
                        }
                    } else {
                        next6 = null;
                    }
                    a aVar5 = (a) next6;
                    if (aVar4 != null && aVar5 == null) {
                        Float f9 = aVar4.a;
                        if (f9 != null) {
                            floatValue = f9.floatValue();
                            if (epx.a(floatValue, aVar4 != null ? aVar4.a : null)) {
                            }
                            if (epx.a(floatValue, aVar5 != null ? aVar5.b : null)) {
                            }
                            this.b = (epx.a(floatValue, aVar4 != null ? aVar4.a : null) || floatValue == Float.MAX_VALUE) ? (epx.a(floatValue, aVar5 != null ? aVar5.b : null) || floatValue == Float.MAX_VALUE) ? MagnetType.None : aVar5.c : aVar4.c;
                            this.c = floatValue != Float.MAX_VALUE ? floatValue : Float.MAX_VALUE;
                            i2 = b.$EnumSwitchMapping$0[g().ordinal()];
                            if (i2 == 1) {
                            }
                        }
                        floatValue = Float.MAX_VALUE;
                        if (epx.a(floatValue, aVar4 != null ? aVar4.a : null)) {
                        }
                        if (epx.a(floatValue, aVar5 != null ? aVar5.b : null)) {
                        }
                        this.b = (epx.a(floatValue, aVar4 != null ? aVar4.a : null) || floatValue == Float.MAX_VALUE) ? (epx.a(floatValue, aVar5 != null ? aVar5.b : null) || floatValue == Float.MAX_VALUE) ? MagnetType.None : aVar5.c : aVar4.c;
                        this.c = floatValue != Float.MAX_VALUE ? floatValue : Float.MAX_VALUE;
                        i2 = b.$EnumSwitchMapping$0[g().ordinal()];
                        if (i2 == 1) {
                        }
                    } else if (aVar4 != null || aVar5 == null) {
                        if ((aVar4 != null || aVar5 != null) && aVar4 != null) {
                            Float f10 = aVar4.a;
                            if (aVar5 != null) {
                                Float f11 = aVar5.b;
                                if (Math.abs((f10 != null ? f10.floatValue() : Float.MAX_VALUE) - f8) < Math.abs((f11 != null ? f11.floatValue() : Float.MAX_VALUE) - f8)) {
                                    if (f10 != null) {
                                        floatValue = f10.floatValue();
                                        this.b = (epx.a(floatValue, aVar4 != null ? aVar4.a : null) || floatValue == Float.MAX_VALUE) ? (epx.a(floatValue, aVar5 != null ? aVar5.b : null) || floatValue == Float.MAX_VALUE) ? MagnetType.None : aVar5.c : aVar4.c;
                                        this.c = floatValue != Float.MAX_VALUE ? floatValue : Float.MAX_VALUE;
                                        i2 = b.$EnumSwitchMapping$0[g().ordinal()];
                                        if (i2 == 1) {
                                            if (floatValue == Float.MAX_VALUE) {
                                                floatValue = gp6Var.u().right;
                                            }
                                            this.e = floatValue;
                                        } else if (i2 == 2) {
                                            if (floatValue == Float.MAX_VALUE) {
                                                floatValue = gp6Var.u().left;
                                            }
                                            this.d = floatValue;
                                        }
                                    }
                                } else if (f11 != null) {
                                    floatValue = f11.floatValue();
                                    if (epx.a(floatValue, aVar4 != null ? aVar4.a : null)) {
                                    }
                                    if (epx.a(floatValue, aVar5 != null ? aVar5.b : null)) {
                                    }
                                    this.b = (epx.a(floatValue, aVar4 != null ? aVar4.a : null) || floatValue == Float.MAX_VALUE) ? (epx.a(floatValue, aVar5 != null ? aVar5.b : null) || floatValue == Float.MAX_VALUE) ? MagnetType.None : aVar5.c : aVar4.c;
                                    this.c = floatValue != Float.MAX_VALUE ? floatValue : Float.MAX_VALUE;
                                    i2 = b.$EnumSwitchMapping$0[g().ordinal()];
                                    if (i2 == 1) {
                                    }
                                }
                            }
                        }
                        floatValue = Float.MAX_VALUE;
                        if (epx.a(floatValue, aVar4 != null ? aVar4.a : null)) {
                        }
                        if (epx.a(floatValue, aVar5 != null ? aVar5.b : null)) {
                        }
                        this.b = (epx.a(floatValue, aVar4 != null ? aVar4.a : null) || floatValue == Float.MAX_VALUE) ? (epx.a(floatValue, aVar5 != null ? aVar5.b : null) || floatValue == Float.MAX_VALUE) ? MagnetType.None : aVar5.c : aVar4.c;
                        this.c = floatValue != Float.MAX_VALUE ? floatValue : Float.MAX_VALUE;
                        i2 = b.$EnumSwitchMapping$0[g().ordinal()];
                        if (i2 == 1) {
                        }
                    } else {
                        Float f12 = aVar5.b;
                        if (f12 != null) {
                            floatValue = f12.floatValue();
                            if (epx.a(floatValue, aVar4 != null ? aVar4.a : null)) {
                            }
                            if (epx.a(floatValue, aVar5 != null ? aVar5.b : null)) {
                            }
                            this.b = (epx.a(floatValue, aVar4 != null ? aVar4.a : null) || floatValue == Float.MAX_VALUE) ? (epx.a(floatValue, aVar5 != null ? aVar5.b : null) || floatValue == Float.MAX_VALUE) ? MagnetType.None : aVar5.c : aVar4.c;
                            this.c = floatValue != Float.MAX_VALUE ? floatValue : Float.MAX_VALUE;
                            i2 = b.$EnumSwitchMapping$0[g().ordinal()];
                            if (i2 == 1) {
                            }
                        }
                        floatValue = Float.MAX_VALUE;
                        if (epx.a(floatValue, aVar4 != null ? aVar4.a : null)) {
                        }
                        if (epx.a(floatValue, aVar5 != null ? aVar5.b : null)) {
                        }
                        this.b = (epx.a(floatValue, aVar4 != null ? aVar4.a : null) || floatValue == Float.MAX_VALUE) ? (epx.a(floatValue, aVar5 != null ? aVar5.b : null) || floatValue == Float.MAX_VALUE) ? MagnetType.None : aVar5.c : aVar4.c;
                        this.c = floatValue != Float.MAX_VALUE ? floatValue : Float.MAX_VALUE;
                        i2 = b.$EnumSwitchMapping$0[g().ordinal()];
                        if (i2 == 1) {
                        }
                    }
                } else {
                    this.e = gp6Var.u().right;
                    this.d = gp6Var.u().left;
                    this.b = MagnetType.None;
                }
                RectF rectF5 = new RectF();
                rectF5.left = this.d;
                rectF5.top = gp6Var.u().top;
                rectF5.right = this.e;
                rectF5.bottom = gp6Var.u().bottom;
                return new ic00(gp6Var.m(), this.b, rectF5, gp6Var.t(), yIndexShift, d().r.c(this.d - d().d()));
            }
            aVar = new a((gp6Var2 == null || (u4 = gp6Var2.u()) == null) ? null : Float.valueOf(u4.left), (gp6Var3 == null || (u3 = gp6Var3.u()) == null) ? null : Float.valueOf(u3.right), MagnetType.LeftEdgeToNeighbourItem);
        }
        aVar2 = aVar;
        float f22 = f(gp6Var);
        List<ckt0> list2 = d().f;
        ArrayList arrayList42 = new ArrayList();
        while (r1.hasNext()) {
        }
        ArrayList arrayList52 = new ArrayList();
        it = arrayList42.iterator();
        while (it.hasNext()) {
        }
        it2 = arrayList52.iterator();
        if (it2.hasNext()) {
        }
        ckt0 ckt0Var3 = (ckt0) next3;
        ArrayList arrayList62 = new ArrayList();
        it3 = arrayList42.iterator();
        while (it3.hasNext()) {
        }
        it4 = arrayList62.iterator();
        if (it4.hasNext()) {
        }
        ckt0 ckt0Var22 = (ckt0) next4;
        i = b.$EnumSwitchMapping$0[g().ordinal()];
        if (i != 1) {
        }
        float centerX2 = d().o.centerX();
        float f72 = f(gp6Var);
        if (Math.abs(f72 - centerX2) >= dn70.b(10)) {
        }
        I = rl3.I(new a[]{aVar2, aVar3, Math.abs(f72 - centerX2) >= dn70.b(10) ? new a(Float.valueOf(centerX2), Float.valueOf(centerX2), f72 >= centerX2 ? MagnetType.LeftEdgeToCursor : MagnetType.RightEdgeToCursor) : null});
        float f82 = f(gp6Var);
        if (I.isEmpty()) {
        }
        RectF rectF52 = new RectF();
        rectF52.left = this.d;
        rectF52.top = gp6Var.u().top;
        rectF52.right = this.e;
        rectF52.bottom = gp6Var.u().bottom;
        return new ic00(gp6Var.m(), this.b, rectF52, gp6Var.t(), yIndexShift, d().r.c(this.d - d().d()));
    }

    public final float f(gp6 gp6Var) {
        int i = b.$EnumSwitchMapping$0[g().ordinal()];
        return i != 1 ? i != 2 ? gp6Var.u().centerX() : gp6Var.u().left : gp6Var.u().right;
    }

    public final Edge g() {
        Edge edge;
        ywo0.b bVar = d().n;
        ywo0.b.a aVar = bVar instanceof ywo0.b.a ? (ywo0.b.a) bVar : null;
        return (aVar == null || (edge = aVar.b) == null) ? Edge.None : edge;
    }
}
