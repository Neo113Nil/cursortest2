package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* loaded from: classes10.dex */
public final class yh2 extends ContinuationImpl {
    public zh2 b;
    public Context c;
    public Iterator d;
    public th2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ zh2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh2(zh2 zh2Var, spj spjVar) {
        super(spjVar);
        this.g = zh2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a((Context) null, (List) null, this);
    }
}
