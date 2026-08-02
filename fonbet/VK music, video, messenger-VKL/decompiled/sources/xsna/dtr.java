package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Errors.kt */
/* loaded from: classes11.dex */
public final class dtr<T> implements lsr {
    public final /* synthetic */ lsr<T> b;
    public final /* synthetic */ Ref$ObjectRef<Throwable> c;

    /* compiled from: Errors.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
    public static final class a extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ dtr<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(dtr<? super T> dtrVar, spj<? super a> spjVar) {
            super(spjVar);
            this.this$0 = dtrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    public dtr(Ref$ObjectRef ref$ObjectRef, lsr lsrVar) {
        this.b = lsrVar;
        this.c = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.lsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        dtr<T> dtrVar;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    try {
                        lsr<T> lsrVar = this.b;
                        aVar.L$0 = this;
                        aVar.label = 1;
                        if (lsrVar.emit(t, aVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable 
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:369)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:332)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        */
                    /*
                        this = this;
                        boolean r0 = r6 instanceof xsna.dtr.a
                        if (r0 == 0) goto L13
                        r0 = r6
                        xsna.dtr$a r0 = (xsna.dtr.a) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        xsna.dtr$a r0 = new xsna.dtr$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L35
                        if (r2 != r3) goto L2d
                        java.lang.Object r5 = r0.L$0
                        xsna.dtr r5 = (xsna.dtr) r5
                        kotlin.a.a(r6)     // Catch: java.lang.Throwable -> L2b
                        goto L45
                    L2b:
                        r6 = move-exception
                        goto L4a
                    L2d:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L35:
                        kotlin.a.a(r6)
                        xsna.lsr<T> r6 = r4.b     // Catch: java.lang.Throwable -> L48
                        r0.L$0 = r4     // Catch: java.lang.Throwable -> L48
                        r0.label = r3     // Catch: java.lang.Throwable -> L48
                        java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L48
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        xsna.s3q0 r5 = xsna.s3q0.a
                        return r5
                    L48:
                        r6 = move-exception
                        r5 = r4
                    L4a:
                        kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.c
                        r5.element = r6
                        throw r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: xsna.dtr.emit(java.lang.Object, xsna.spj):java.lang.Object");
                }
            }
