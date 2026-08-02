package yads;

import android.content.Context;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class s82 extends ContinuationImpl {
    public t82 b;
    public Context c;
    public sz1 d;
    public Object e;
    public v5 f;
    public Iterator g;
    public /* synthetic */ Object h;
    public final /* synthetic */ t82 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s82(t82 t82Var, spj spjVar) {
        super(spjVar);
        this.i = t82Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, null, this);
    }
}
