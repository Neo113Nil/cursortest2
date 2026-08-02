package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: DataMigrationInitializer.kt */
/* loaded from: classes.dex */
public final class juk<T> {
    public static final a a = new a();

    /* compiled from: DataMigrationInitializer.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008a -> B:13:0x006d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008d -> B:13:0x006d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object a(a aVar, List list, mzw mzwVar, ContinuationImpl continuationImpl) {
            huk hukVar;
            int i;
            List list2;
            Iterator<T> it;
            Ref$ObjectRef ref$ObjectRef;
            Throwable th;
            aVar.getClass();
            if (continuationImpl instanceof huk) {
                hukVar = (huk) continuationImpl;
                int i2 = hukVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hukVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = hukVar.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = hukVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ArrayList arrayList = new ArrayList();
                        iuk iukVar = new iuk(list, arrayList, null);
                        hukVar.L$0 = arrayList;
                        hukVar.label = 1;
                        if (mzwVar.a(iukVar, hukVar) == obj2) {
                            return obj2;
                        }
                        list2 = arrayList;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            it = (Iterator) hukVar.L$1;
                            ref$ObjectRef = (Ref$ObjectRef) hukVar.L$0;
                            try {
                                kotlin.a.a(obj);
                            } catch (Throwable 
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                                	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:369)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:332)
                                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
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
                                r5.getClass()
                                boolean r0 = r8 instanceof xsna.huk
                                if (r0 == 0) goto L16
                                r0 = r8
                                xsna.huk r0 = (xsna.huk) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L16
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L1b
                            L16:
                                xsna.huk r0 = new xsna.huk
                                r0.<init>(r5, r8)
                            L1b:
                                java.lang.Object r5 = r0.result
                                kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                                int r1 = r0.label
                                r2 = 2
                                r3 = 1
                                if (r1 == 0) goto L47
                                if (r1 == r3) goto L3f
                                if (r1 != r2) goto L37
                                java.lang.Object r6 = r0.L$1
                                java.util.Iterator r6 = (java.util.Iterator) r6
                                java.lang.Object r7 = r0.L$0
                                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
                                kotlin.a.a(r5)     // Catch: java.lang.Throwable -> L35
                                goto L6d
                            L35:
                                r5 = move-exception
                                goto L86
                            L37:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L3f:
                                java.lang.Object r6 = r0.L$0
                                java.util.List r6 = (java.util.List) r6
                                kotlin.a.a(r5)
                                goto L61
                            L47:
                                kotlin.a.a(r5)
                                java.util.ArrayList r5 = new java.util.ArrayList
                                r5.<init>()
                                xsna.iuk r1 = new xsna.iuk
                                r4 = 0
                                r1.<init>(r6, r5, r4)
                                r0.L$0 = r5
                                r0.label = r3
                                java.lang.Object r6 = r7.a(r1, r0)
                                if (r6 != r8) goto L60
                                goto L9b
                            L60:
                                r6 = r5
                            L61:
                                kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
                                r5.<init>()
                                java.lang.Iterable r6 = (java.lang.Iterable) r6
                                java.util.Iterator r6 = r6.iterator()
                                r7 = r5
                            L6d:
                                boolean r5 = r6.hasNext()
                                if (r5 == 0) goto L93
                                java.lang.Object r5 = r6.next()
                                xsna.izs r5 = (xsna.izs) r5
                                r0.L$0 = r7     // Catch: java.lang.Throwable -> L35
                                r0.L$1 = r6     // Catch: java.lang.Throwable -> L35
                                r0.label = r2     // Catch: java.lang.Throwable -> L35
                                java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L35
                                if (r5 != r8) goto L6d
                                goto L9b
                            L86:
                                T r1 = r7.element
                                if (r1 != 0) goto L8d
                                r7.element = r5
                                goto L6d
                            L8d:
                                java.lang.Throwable r1 = (java.lang.Throwable) r1
                                xsna.mnh0.d(r1, r5)
                                goto L6d
                            L93:
                                T r5 = r7.element
                                java.lang.Throwable r5 = (java.lang.Throwable) r5
                                if (r5 != 0) goto L9c
                                xsna.s3q0 r8 = xsna.s3q0.a
                            L9b:
                                return r8
                            L9c:
                                throw r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: xsna.juk.a.a(xsna.juk$a, java.util.List, xsna.mzw, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
                        }
                    }
                }
