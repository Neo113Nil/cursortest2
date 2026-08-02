package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import defpackage.c4x;
import defpackage.ft6;
import defpackage.jl40;
import defpackage.kfk;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.rvo;
import defpackage.scc;
import defpackage.v3k;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class DivFocus implements c4x {
    public final List a;
    public final DivBorder b;
    public final a c;
    public final List d;
    public final List e;
    public Integer f;

    public DivFocus(List list, DivBorder divBorder, a aVar, List list2, List list3) {
        this.a = list;
        this.b = divBorder;
        this.c = aVar;
        this.d = list2;
        this.e = list3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0165, code lost:
    
        if (r1 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0173, code lost:
    
        if (((defpackage.v3k) r4).a((defpackage.v3k) r9.get(r1), r10, r11) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0176, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0178, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x017b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x017c, code lost:
    
        if (r9 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x013c, code lost:
    
        if (r1 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00fb, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0045, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
    
        if (defpackage.jl40.l(r4, r1 != null ? (java.lang.String) r1.a(r11) : null) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fd, code lost:
    
        r1 = r9.d;
        r4 = r8.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0101, code lost:
    
        if (r4 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0103, code lost:
    
        if (r1 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0105, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010e, code lost:
    
        if (r4.size() == r1.size()) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0112, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011d, code lost:
    
        if (r4.hasNext() == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011f, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0125, code lost:
    
        if (r5 < 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0133, code lost:
    
        if (((defpackage.v3k) r6).a((defpackage.v3k) r1.get(r5), r10, r11) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0136, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0138, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x013b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013e, code lost:
    
        r9 = r9.e;
        r8 = r8.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0142, code lost:
    
        if (r8 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0144, code lost:
    
        if (r9 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0146, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014f, code lost:
    
        if (r8.size() == r9.size()) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0152, code lost:
    
        r8 = r8.iterator();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x015d, code lost:
    
        if (r8.hasNext() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x015f, code lost:
    
        r4 = r8.next();
        r5 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(DivFocus divFocus, rvo rvoVar, rvo rvoVar2) {
        if (divFocus == null) {
            return false;
        }
        List list = divFocus.a;
        List list2 = this.a;
        if (list2 != null) {
            if (list != null && list2.size() == list.size()) {
                int i = 0;
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    if (!((kfk) obj).a((kfk) list.get(i), rvoVar, rvoVar2)) {
                        break;
                    }
                    i = i2;
                }
                DivBorder divBorder = divFocus.b;
                DivBorder divBorder2 = this.b;
                if (divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) {
                    a aVar = divFocus.c;
                    a aVar2 = this.c;
                    if (aVar2 != null) {
                        if (aVar != null) {
                            Expression expression = aVar2.a;
                            String str = expression != null ? (String) expression.a(rvoVar) : null;
                            Expression expression2 = aVar.a;
                            if (jl40.l(str, expression2 != null ? (String) expression2.a(rvoVar2) : null)) {
                                Expression expression3 = aVar2.b;
                                String str2 = expression3 != null ? (String) expression3.a(rvoVar) : null;
                                Expression expression4 = aVar.b;
                                if (jl40.l(str2, expression4 != null ? (String) expression4.a(rvoVar2) : null)) {
                                    Expression expression5 = aVar2.c;
                                    String str3 = expression5 != null ? (String) expression5.a(rvoVar) : null;
                                    Expression expression6 = aVar.c;
                                    if (jl40.l(str3, expression6 != null ? (String) expression6.a(rvoVar2) : null)) {
                                        Expression expression7 = aVar2.d;
                                        String str4 = expression7 != null ? (String) expression7.a(rvoVar) : null;
                                        Expression expression8 = aVar.d;
                                        if (jl40.l(str4, expression8 != null ? (String) expression8.a(rvoVar2) : null)) {
                                            Expression expression9 = aVar2.e;
                                            String str5 = expression9 != null ? (String) expression9.a(rvoVar) : null;
                                            Expression expression10 = aVar.e;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

    public final int b() {
        int i;
        int i2;
        int i3;
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(DivFocus.class).hashCode();
        int i4 = 0;
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((kfk) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i5 = hashCode + i;
        DivBorder divBorder = this.b;
        int b = i5 + (divBorder != null ? divBorder.b() : 0);
        a aVar = this.c;
        if (aVar != null) {
            Integer num2 = aVar.f;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                int hashCode2 = qoi0.a(a.class).hashCode();
                Expression expression = aVar.a;
                int hashCode3 = hashCode2 + (expression != null ? expression.hashCode() : 0);
                Expression expression2 = aVar.b;
                int hashCode4 = hashCode3 + (expression2 != null ? expression2.hashCode() : 0);
                Expression expression3 = aVar.c;
                int hashCode5 = hashCode4 + (expression3 != null ? expression3.hashCode() : 0);
                Expression expression4 = aVar.d;
                int hashCode6 = hashCode5 + (expression4 != null ? expression4.hashCode() : 0);
                Expression expression5 = aVar.e;
                int hashCode7 = hashCode6 + (expression5 != null ? expression5.hashCode() : 0);
                aVar.f = Integer.valueOf(hashCode7);
                i2 = hashCode7;
            }
        } else {
            i2 = 0;
        }
        int i6 = b + i2;
        List list2 = this.d;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i3 = 0;
            while (it2.hasNext()) {
                i3 += ((v3k) it2.next()).b();
            }
        } else {
            i3 = 0;
        }
        int i7 = i6 + i3;
        List list3 = this.e;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                i4 += ((v3k) it3.next()).b();
            }
        }
        int i8 = i7 + i4;
        this.f = Integer.valueOf(i8);
        return i8;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((f0) ft6.b.K3.getValue()).b(ft6.a, this);
    }

    public static final class a implements c4x {
        public final Expression a;
        public final Expression b;
        public final Expression c;
        public final Expression d;
        public final Expression e;
        public Integer f;

        public a(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5) {
            this.a = expression;
            this.b = expression2;
            this.c = expression3;
            this.d = expression4;
            this.e = expression5;
        }

        @Override // defpackage.c4x
        public final JSONObject r() {
            h0 h0Var = (h0) ft6.b.N3.getValue();
            lb7 lb7Var = ft6.a;
            h0Var.getClass();
            return h0.c(lb7Var, this);
        }

        public a() {
            this(null, null, null, null, null);
        }
    }

    public DivFocus() {
        this(null, null, null, null, null);
    }
}
