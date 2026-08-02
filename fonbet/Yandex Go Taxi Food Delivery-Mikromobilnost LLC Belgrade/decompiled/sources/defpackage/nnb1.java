package defpackage;

import android.graphics.drawable.Drawable;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes7.dex */
public abstract class nnb1 {
    public static final boolean a(Object obj, Object obj2) {
        return obj == null || !obj.getClass().equals(obj2.getClass());
    }

    public static final Drawable b(ShimmeringRobotoTextView shimmeringRobotoTextView) {
        Drawable y = tje.y(dzg0.chevron_next, shimmeringRobotoTextView.getContext());
        y.setBounds(0, 0, (int) tje.x(shimmeringRobotoTextView.getContext(), 5.0f), (int) tje.x(shimmeringRobotoTextView.getContext(), 8.0f));
        return y;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public static final defpackage.b3c c(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
}
