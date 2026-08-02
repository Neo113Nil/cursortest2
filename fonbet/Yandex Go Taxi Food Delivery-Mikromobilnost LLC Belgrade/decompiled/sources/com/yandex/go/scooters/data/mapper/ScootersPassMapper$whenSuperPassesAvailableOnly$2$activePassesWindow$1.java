package com.yandex.go.scooters.data.mapper;

import defpackage.fef;
import defpackage.i8w0;
import defpackage.mvg;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lkvm0;", "<anonymous>", "(Ltse;)Lkvm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$whenSuperPassesAvailableOnly$2$activePassesWindow$1", f = "ScootersPassMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersPassMapper$whenSuperPassesAvailableOnly$2$activePassesWindow$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ i8w0 $superPasses;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$whenSuperPassesAvailableOnly$2$activePassesWindow$1(fef fefVar, i8w0 i8w0Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$superPasses = i8w0Var;
        this.$currencyRules = fefVar;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassMapper$whenSuperPassesAvailableOnly$2$activePassesWindow$1(this.$currencyRules, this.$superPasses, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$whenSuperPassesAvailableOnly$2$activePassesWindow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r45v0 ??
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
