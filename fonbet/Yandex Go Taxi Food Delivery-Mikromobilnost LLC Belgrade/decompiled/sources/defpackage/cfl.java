package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivText$Image$Accessibility;
import com.yandex.div2.DivText$Image$IndexingDirection;
import com.yandex.div2.DivTextAlignmentVertical;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cfl implements c4x {
    public final DivText$Image$Accessibility a;
    public final Expression b;
    public final sqk c;
    public final Expression d;
    public final Expression e;
    public final Expression f;
    public final Expression g;
    public final Expression h;
    public final Expression i;
    public final sqk j;
    public Integer k;

    static {
        ngd0.m(DivTextAlignmentVertical.CENTER);
        ngd0.m(20L);
        ngd0.m(DivText$Image$IndexingDirection.NORMAL);
        ngd0.m(Boolean.FALSE);
        ngd0.m(DivBlendMode.SOURCE_IN);
        ngd0.m(20L);
    }

    public cfl(DivText$Image$Accessibility divText$Image$Accessibility, Expression expression, sqk sqkVar, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, sqk sqkVar2) {
        this.a = divText$Image$Accessibility;
        this.b = expression;
        this.c = sqkVar;
        this.d = expression2;
        this.e = expression3;
        this.f = expression4;
        this.g = expression5;
        this.h = expression6;
        this.i = expression7;
        this.j = sqkVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r3.b == r1.b) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r7.b.a(r9) != r8.b.a(r10)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r7.c.a(r8.c, r9, r10) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r7.d.a(r9) != r8.d.a(r10)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (((java.lang.Boolean) r7.e.a(r9)).booleanValue() != ((java.lang.Boolean) r8.e.a(r10)).booleanValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (((java.lang.Number) r7.f.a(r9)).longValue() != ((java.lang.Number) r8.f.a(r10)).longValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        r1 = r7.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        r1 = (java.lang.Integer) r1.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        r3 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        r2 = (java.lang.Integer) r3.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        if (defpackage.jl40.l(r1, r2) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        if (r7.h.a(r9) != r8.h.a(r10)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (defpackage.jl40.l(r7.i.a(r9), r8.i.a(r10)) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        if (r7.j.a(r8.j, r9, r10) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0034, code lost:
    
        if (r1 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(cfl cflVar, rvo rvoVar, rvo rvoVar2) {
        if (cflVar == null) {
            return false;
        }
        DivText$Image$Accessibility divText$Image$Accessibility = cflVar.a;
        Integer num = null;
        DivText$Image$Accessibility divText$Image$Accessibility2 = this.a;
        if (divText$Image$Accessibility2 != null) {
            if (divText$Image$Accessibility != null) {
                Expression expression = divText$Image$Accessibility2.a;
                String str = expression != null ? (String) expression.a(rvoVar) : null;
                Expression expression2 = divText$Image$Accessibility.a;
                if (jl40.l(str, expression2 != null ? (String) expression2.a(rvoVar2) : null)) {
                }
            }
            return false;
        }
    }

    public final int b() {
        int i;
        Integer num = this.k;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(cfl.class).hashCode();
        DivText$Image$Accessibility divText$Image$Accessibility = this.a;
        if (divText$Image$Accessibility != null) {
            Integer num2 = divText$Image$Accessibility.c;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode2 = qoi0.a(DivText$Image$Accessibility.class).hashCode();
                Expression expression = divText$Image$Accessibility.a;
                int hashCode3 = hashCode2 + (expression != null ? expression.hashCode() : 0) + divText$Image$Accessibility.b.hashCode();
                divText$Image$Accessibility.c = Integer.valueOf(hashCode3);
                i = hashCode3;
            }
        } else {
            i = 0;
        }
        int hashCode4 = this.f.hashCode() + this.e.hashCode() + this.d.hashCode() + this.c.b() + this.b.hashCode() + hashCode + i;
        Expression expression2 = this.g;
        int b = this.j.b() + this.i.hashCode() + this.h.hashCode() + hashCode4 + (expression2 != null ? expression2.hashCode() : 0);
        this.k = Integer.valueOf(b);
        return b;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((tfl) ft6.b.Q8.getValue()).b(ft6.a, this);
    }
}
