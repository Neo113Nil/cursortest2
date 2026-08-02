package defpackage;

import java.util.Arrays;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public abstract class c85 implements xsd0 {
    @Override // defpackage.xsd0
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        return wsd0Var instanceof pm00 ? c((pm00) wsd0Var, continuation) : wsd0Var instanceof qo0 ? b((qo0) wsd0Var, continuation) : d(wsd0Var, continuation);
    }

    public Object b(qo0 qo0Var, Continuation continuation) {
        return d(qo0Var, continuation);
    }

    public Object c(pm00 pm00Var, Continuation continuation) {
        return d(pm00Var, continuation);
    }

    public Object d(wsd0 wsd0Var, Continuation continuation) {
        jst.e.x(new IllegalStateException(), String.format("No visitor to handle action %s with info %s", Arrays.copyOf(new Object[]{wsd0Var.getAction().a(), wsd0Var.getClass().getCanonicalName()}, 2)));
        return zy11.a;
    }
}
