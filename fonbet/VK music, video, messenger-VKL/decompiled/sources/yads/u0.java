package yads;

import android.view.View;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.spj;

/* loaded from: classes10.dex */
public final class u0 extends ContinuationImpl {
    public v0 b;
    public View c;
    public Ref$ObjectRef d;
    public Iterator e;
    public /* synthetic */ Object f;
    public final /* synthetic */ v0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, spj spjVar) {
        super(spjVar);
        this.g = v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, this);
    }
}
