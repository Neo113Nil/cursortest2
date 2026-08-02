package defpackage;

import com.google.android.gms.internal.measurement.zzbk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class p791 {
    public final HashMap a = new HashMap();
    public final l991 b = new l991();

    public p791() {
        a(new j791());
        a(new s791());
        v791 v791Var = new v791(0);
        zzbk zzbkVar = zzbk.APPLY;
        ArrayList arrayList = v791Var.a;
        arrayList.add(zzbkVar);
        arrayList.add(zzbk.BLOCK);
        arrayList.add(zzbk.BREAK);
        arrayList.add(zzbk.CASE);
        arrayList.add(zzbk.DEFAULT);
        arrayList.add(zzbk.CONTINUE);
        arrayList.add(zzbk.DEFINE_FUNCTION);
        arrayList.add(zzbk.FN);
        arrayList.add(zzbk.IF);
        arrayList.add(zzbk.QUOTE);
        arrayList.add(zzbk.RETURN);
        arrayList.add(zzbk.SWITCH);
        arrayList.add(zzbk.TERNARY);
        a(v791Var);
        v791 v791Var2 = new v791(1);
        zzbk zzbkVar2 = zzbk.AND;
        ArrayList arrayList2 = v791Var2.a;
        arrayList2.add(zzbkVar2);
        arrayList2.add(zzbk.NOT);
        arrayList2.add(zzbk.OR);
        a(v791Var2);
        v791 v791Var3 = new v791(2);
        zzbk zzbkVar3 = zzbk.FOR_IN;
        ArrayList arrayList3 = v791Var3.a;
        arrayList3.add(zzbkVar3);
        arrayList3.add(zzbk.FOR_IN_CONST);
        arrayList3.add(zzbk.FOR_IN_LET);
        arrayList3.add(zzbk.FOR_LET);
        arrayList3.add(zzbk.FOR_OF);
        arrayList3.add(zzbk.FOR_OF_CONST);
        arrayList3.add(zzbk.FOR_OF_LET);
        arrayList3.add(zzbk.WHILE);
        a(v791Var3);
        v791 v791Var4 = new v791(3);
        zzbk zzbkVar4 = zzbk.ADD;
        ArrayList arrayList4 = v791Var4.a;
        arrayList4.add(zzbkVar4);
        arrayList4.add(zzbk.DIVIDE);
        arrayList4.add(zzbk.MODULUS);
        arrayList4.add(zzbk.MULTIPLY);
        arrayList4.add(zzbk.NEGATE);
        arrayList4.add(zzbk.POST_DECREMENT);
        arrayList4.add(zzbk.POST_INCREMENT);
        arrayList4.add(zzbk.PRE_DECREMENT);
        arrayList4.add(zzbk.PRE_INCREMENT);
        arrayList4.add(zzbk.SUBTRACT);
        a(v791Var4);
        v791 v791Var5 = new v791(4);
        zzbk zzbkVar5 = zzbk.ASSIGN;
        ArrayList arrayList5 = v791Var5.a;
        arrayList5.add(zzbkVar5);
        arrayList5.add(zzbk.CONST);
        arrayList5.add(zzbk.CREATE_ARRAY);
        arrayList5.add(zzbk.CREATE_OBJECT);
        arrayList5.add(zzbk.EXPRESSION_LIST);
        arrayList5.add(zzbk.GET);
        arrayList5.add(zzbk.GET_INDEX);
        arrayList5.add(zzbk.GET_PROPERTY);
        arrayList5.add(zzbk.NULL);
        arrayList5.add(zzbk.SET_PROPERTY);
        arrayList5.add(zzbk.TYPEOF);
        arrayList5.add(zzbk.UNDEFINED);
        arrayList5.add(zzbk.VAR);
        a(v791Var5);
    }

    public final void a(n791 n791Var) {
        Iterator it = n791Var.a.iterator();
        while (it.hasNext()) {
            this.a.put(((zzbk) it.next()).b().toString(), n791Var);
        }
    }

    public final r691 b(cr71 cr71Var, r691 r691Var) {
        cwa1.o(cr71Var);
        if (!(r691Var instanceof s691)) {
            return r691Var;
        }
        s691 s691Var = (s691) r691Var;
        ArrayList arrayList = s691Var.b;
        String str = s691Var.a;
        HashMap hashMap = this.a;
        return (hashMap.containsKey(str) ? (n791) hashMap.get(str) : this.b).a(str, cr71Var, arrayList);
    }
}
