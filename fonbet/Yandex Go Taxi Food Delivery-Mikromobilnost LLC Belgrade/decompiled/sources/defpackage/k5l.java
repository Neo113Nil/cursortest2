package defpackage;

import com.yandex.div2.DivRadialGradientRelativeRadius$Value;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class k5l implements c4x {
    public static final m5l g;
    public static final m5l h;
    public static final g6l i;
    public final n5l a;
    public final n5l b;
    public final List c;
    public final pvo d;
    public final h6l e;
    public Integer f;

    static {
        Double valueOf = Double.valueOf(0.5d);
        g = new m5l(new o6l(ngd0.m(valueOf)));
        h = new m5l(new o6l(ngd0.m(valueOf)));
        i = new g6l(new u6l(ngd0.m(DivRadialGradientRelativeRadius$Value.FARTHEST_CORNER)));
    }

    public k5l(n5l n5lVar, n5l n5lVar2, List list, pvo pvoVar, h6l h6lVar) {
        this.a = n5lVar;
        this.b = n5lVar2;
        this.c = list;
        this.d = pvoVar;
        this.e = h6lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x00e0, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0091, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(k5l k5lVar, rvo rvoVar, rvo rvoVar2) {
        c4x c4xVar;
        boolean z;
        c4x c4xVar2;
        List a;
        List a2;
        if (k5lVar != null) {
            pvo pvoVar = k5lVar.d;
            if (this.a.a(k5lVar.a, rvoVar, rvoVar2) && this.b.a(k5lVar.b, rvoVar, rvoVar2)) {
                List list = k5lVar.c;
                List list2 = this.c;
                if (list2 != null) {
                    if (list != null && list2.size() == list.size()) {
                        int i2 = 0;
                        for (Object obj : list2) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                scc.m();
                                throw null;
                            }
                            j5l j5lVar = (j5l) list.get(i2);
                            j5l j5lVar2 = (j5l) obj;
                            if (j5lVar == null) {
                                j5lVar2.getClass();
                                return false;
                            }
                            if (((Number) j5lVar2.a.a(rvoVar)).intValue() != ((Number) j5lVar.a.a(rvoVar2)).intValue() || ((Number) j5lVar2.b.a(rvoVar)).doubleValue() != ((Number) j5lVar.b.a(rvoVar2)).doubleValue()) {
                                break;
                            }
                            i2 = i3;
                        }
                        pvo pvoVar2 = this.d;
                        if (pvoVar2 != null && (a = pvoVar2.a(rvoVar)) != null) {
                            if (pvoVar != null && (a2 = pvoVar.a(rvoVar2)) != null && a.size() == a2.size()) {
                                int i4 = 0;
                                for (Object obj2 : a) {
                                    int i5 = i4 + 1;
                                    if (i4 < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    if (((Number) obj2).intValue() != ((Number) a2.get(i4)).intValue()) {
                                        break;
                                    }
                                    i4 = i5;
                                }
                                h6l h6lVar = k5lVar.e;
                                h6l h6lVar2 = this.e;
                                h6lVar2.getClass();
                                if (h6lVar != null) {
                                    if (h6lVar2 instanceof f6l) {
                                        sqk sqkVar = ((f6l) h6lVar2).b;
                                        if (h6lVar instanceof f6l) {
                                            c4xVar2 = ((f6l) h6lVar).b;
                                        } else {
                                            if (!(h6lVar instanceof g6l)) {
                                                w511.b();
                                                return false;
                                            }
                                            c4xVar2 = ((g6l) h6lVar).b;
                                        }
                                        z = sqkVar.a(c4xVar2 instanceof sqk ? (sqk) c4xVar2 : null, rvoVar, rvoVar2);
                                    } else if (h6lVar2 instanceof g6l) {
                                        u6l u6lVar = ((g6l) h6lVar2).b;
                                        if (h6lVar instanceof f6l) {
                                            c4xVar = ((f6l) h6lVar).b;
                                        } else {
                                            if (!(h6lVar instanceof g6l)) {
                                                w511.b();
                                                return false;
                                            }
                                            c4xVar = ((g6l) h6lVar).b;
                                        }
                                        u6l u6lVar2 = c4xVar instanceof u6l ? (u6l) c4xVar : null;
                                        if (u6lVar2 != null && u6lVar.a.a(rvoVar) == u6lVar2.a.a(rvoVar2)) {
                                            z = true;
                                        }
                                    } else {
                                        w511.b();
                                    }
                                    if (!z) {
                                        return true;
                                    }
                                }
                                z = false;
                                if (!z) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i2;
        int i3;
        int i4;
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int b = this.b.b() + this.a.b() + qoi0.a(k5l.class).hashCode();
        int i5 = 0;
        List<j5l> list = this.c;
        if (list != null) {
            i2 = 0;
            for (j5l j5lVar : list) {
                Integer num2 = j5lVar.c;
                if (num2 != null) {
                    i4 = num2.intValue();
                } else {
                    int hashCode = j5lVar.b.hashCode() + j5lVar.a.hashCode() + qoi0.a(j5l.class).hashCode();
                    j5lVar.c = Integer.valueOf(hashCode);
                    i4 = hashCode;
                }
                i2 += i4;
            }
        } else {
            i2 = 0;
        }
        int i6 = b + i2;
        pvo pvoVar = this.d;
        int hashCode2 = i6 + (pvoVar != null ? pvoVar.hashCode() : 0);
        h6l h6lVar = this.e;
        Integer num3 = h6lVar.a;
        if (num3 != null) {
            i5 = num3.intValue();
        } else {
            int hashCode3 = qoi0.a(h6lVar.getClass()).hashCode();
            if (h6lVar instanceof f6l) {
                i3 = ((f6l) h6lVar).b.b();
            } else if (h6lVar instanceof g6l) {
                u6l u6lVar = ((g6l) h6lVar).b;
                Integer num4 = u6lVar.b;
                if (num4 != null) {
                    i3 = num4.intValue();
                } else {
                    int hashCode4 = u6lVar.a.hashCode() + qoi0.a(u6l.class).hashCode();
                    u6lVar.b = Integer.valueOf(hashCode4);
                    i3 = hashCode4;
                }
            } else {
                w511.b();
            }
            i5 = i3 + hashCode3;
            h6lVar.a = Integer.valueOf(i5);
        }
        int i7 = i5 + hashCode2;
        this.f = Integer.valueOf(i7);
        return i7;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((b6l) ft6.b.B6.getValue()).b(ft6.a, this);
    }

    public k5l() {
        this(g, h, null, null, i);
    }
}
