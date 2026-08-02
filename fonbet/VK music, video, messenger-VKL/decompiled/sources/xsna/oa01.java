package xsna;

import android.widget.EditText;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public /* synthetic */ class oa01 implements b9i, jp70 {
    public static final /* synthetic */ oa01 b = new oa01();
    public static ExecutorService c;

    public static final z3m a(EditText editText, izs izsVar) {
        z3m z3mVar = new z3m(izsVar);
        editText.addTextChangedListener(z3mVar);
        return z3mVar;
    }

    public static TreeSet b(Object... objArr) {
        TreeSet treeSet = new TreeSet();
        rl3.p0(objArr, treeSet);
        return treeSet;
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        return new kvf();
    }

    @Override // xsna.jp70
    public Object h() {
        return new ArrayList();
    }
}
