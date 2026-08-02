package xsna;

import com.vk.photo.editor.domain.EditorRenderException;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: EditorRenderPipeline.kt */
/* loaded from: classes4.dex */
public final class p4p implements q4p {
    public final ArrayList a;
    public final String b;

    /* compiled from: EditorRenderPipeline.kt */
    public static final class a<Params extends g5p> implements q4p {
        public final f5p a;
        public final h5p<Params> b;
        public final Params c;
        public final String d;

        public a(f5p f5pVar, h5p<Params> h5pVar, Params params) {
            this.a = f5pVar;
            this.b = h5pVar;
            this.c = params;
            this.d = "tool-render-".concat(f5pVar.a());
        }

        @Override // xsna.q4p
        public final Object a(i4p i4pVar, ota0 ota0Var, Integer num, zi20 zi20Var, spj<? super ota0> spjVar) {
            Params params = this.c;
            if (zi20Var != null) {
                String str = "render step id=" + this.d + "; params=" + params;
                n4p n4pVar = ((w3p) zi20Var.a.c).u;
                if (n4pVar != null) {
                    n4pVar.d(zi20Var.b + ": " + str);
                }
            }
            return this.b.f(i4pVar, ota0Var, num, params, (b) spjVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        @Override // xsna.q4p
        public final String getId() {
            return this.d;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Step(toolId=" + this.a + ", renderer=" + this.b + ", params=" + this.c + ")";
        }
    }

    /* compiled from: EditorRenderPipeline.kt */
    @b6l(c = "com.vk.photo.editor.domain.EditorRenderPipeline", f = "EditorRenderPipeline.kt", l = {38}, m = "render")
    public static final class b extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return p4p.this.a(null, null, null, null, this);
        }
    }

    public p4p(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #0 {all -> 0x0048, blocks: (B:11:0x0041, B:13:0x0085, B:15:0x008a, B:18:0x0066), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #0 {all -> 0x0048, blocks: (B:11:0x0041, B:13:0x0085, B:15:0x008a, B:18:0x0066), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0082 -> B:13:0x0085). Please report as a decompilation issue!!! */
    @Override // xsna.q4p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(i4p i4pVar, ota0 ota0Var, Integer num, zi20 zi20Var, spj<? super ota0> spjVar) {
        b bVar;
        int i;
        i4p i4pVar2;
        ota0 ota0Var2;
        Integer num2;
        zi20 zi20Var2;
        int size;
        b bVar2;
        int i2;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i3 = bVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.label = i3 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                ArrayList arrayList = this.a;
                if (i != 0) {
                    kotlin.a.a(obj);
                    i4pVar2 = i4pVar;
                    ota0Var2 = ota0Var;
                    num2 = num;
                    zi20Var2 = zi20Var;
                    size = arrayList.size();
                    bVar2 = bVar;
                    i2 = 0;
                    if (i2 < size) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    size = bVar.I$1;
                    i2 = bVar.I$0;
                    zi20 zi20Var3 = (zi20) bVar.L$3;
                    Integer num3 = (Integer) bVar.L$2;
                    i4pVar2 = (i4p) bVar.L$0;
                    try {
                        kotlin.a.a(obj);
                        bVar2 = bVar;
                        zi20Var2 = zi20Var3;
                        num2 = num3;
                        Object obj3 = obj;
                        ota0Var2 = (ota0) obj3;
                        if (zi20Var2 != null) {
                            zi20Var2.a("step #" + i2 + " (id=" + ((q4p) arrayList.get(i2)).getId() + ") in %d ms");
                        }
                        i2++;
                        if (i2 < size) {
                            q4p q4pVar = (q4p) arrayList.get(i2);
                            bVar2.L$0 = i4pVar2;
                            bVar2.L$1 = null;
                            bVar2.L$2 = num2;
                            bVar2.L$3 = zi20Var2;
                            bVar2.L$4 = null;
                            bVar2.I$0 = i2;
                            bVar2.I$1 = size;
                            bVar2.label = 1;
                            Object a2 = q4pVar.a(i4pVar2, ota0Var2, num2, zi20Var2, bVar2);
                            obj3 = a2;
                            if (a2 == obj2) {
                                return obj2;
                            }
                            ota0Var2 = (ota0) obj3;
                            if (zi20Var2 != null) {
                            }
                            i2++;
                            if (i2 < size) {
                                return ota0Var2;
                            }
                        }
                    } catch (Throwable th) {
                        throw new EditorRenderException(i5s.a(odj.a(i2 + 1, arrayList.size(), "Error in ", "st step of ", " ("), j5g.g0(arrayList, ", ", null, null, 0, new udo(this, 2), 30), ")"), th);
                    }
                }
            }
        }
        bVar = new b((ContinuationImpl) spjVar);
        Object obj4 = bVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        ArrayList arrayList2 = this.a;
        if (i != 0) {
        }
    }

    @Override // xsna.q4p
    public final String getId() {
        return this.b;
    }

    public /* synthetic */ p4p(ArrayList arrayList) {
        this("pipeline-default", arrayList);
    }
}
