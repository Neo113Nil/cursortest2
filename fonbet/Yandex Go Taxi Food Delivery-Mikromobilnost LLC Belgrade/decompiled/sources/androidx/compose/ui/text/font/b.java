package androidx.compose.ui.text.font;

import androidx.compose.runtime.f;
import defpackage.lse;
import defpackage.m3u0;
import defpackage.mse;
import defpackage.np11;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.qp11;
import defpackage.ssa1;
import defpackage.tls;
import defpackage.yxr;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class b implements m3u0 {
    public final List a;
    public final np11 b;
    public final c c;
    public final tls w;
    public final a x;
    public final oz40 y;
    public boolean z = true;

    public b(List list, Object obj, np11 np11Var, c cVar, tls tlsVar, a aVar) {
        this.a = list;
        this.b = np11Var;
        this.c = cVar;
        this.w = tlsVar;
        this.x = aVar;
        this.y = f.j(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
    
        if (defpackage.bb1.l0(r2) == r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:12:0x003a, B:16:0x0069, B:18:0x0075, B:25:0x0097, B:30:0x00bd, B:36:0x0054, B:39:0x005d), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #0 {all -> 0x003f, blocks: (B:12:0x003a, B:16:0x0069, B:18:0x0075, B:25:0x0097, B:30:0x00bd, B:36:0x0054, B:39:0x005d), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd A[Catch: all -> 0x003f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003f, blocks: (B:12:0x003a, B:16:0x0069, B:18:0x0075, B:25:0x0097, B:30:0x00bd, B:36:0x0054, B:39:0x005d), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:14:0x00d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00cc -> B:13:0x00cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AsyncFontListLoader$load$1 asyncFontListLoader$load$1;
        int i;
        tls tlsVar;
        oz40 oz40Var;
        List list;
        int size;
        int i2;
        qp11 qp11Var;
        List list2;
        yxr yxrVar;
        try {
            if (continuationImpl instanceof AsyncFontListLoader$load$1) {
                asyncFontListLoader$load$1 = (AsyncFontListLoader$load$1) continuationImpl;
                int i3 = asyncFontListLoader$load$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    asyncFontListLoader$load$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = asyncFontListLoader$load$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = asyncFontListLoader$load$1.label;
                    zy11 zy11Var = zy11.a;
                    tlsVar = this.w;
                    int i4 = 2;
                    oz40Var = this.y;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        list = this.a;
                        size = list.size();
                        i2 = 0;
                        if (i2 < size) {
                        }
                    } else if (i == 1) {
                        size = asyncFontListLoader$load$1.I$1;
                        i2 = asyncFontListLoader$load$1.I$0;
                        yxr yxrVar2 = (yxr) asyncFontListLoader$load$1.L$1;
                        List list3 = (List) asyncFontListLoader$load$1.L$0;
                        kotlin.b.b(obj);
                        yxrVar = yxrVar2;
                        list2 = list3;
                        if (obj == null) {
                        }
                    } else {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        size = asyncFontListLoader$load$1.I$1;
                        i2 = asyncFontListLoader$load$1.I$0;
                        list2 = (List) asyncFontListLoader$load$1.L$0;
                        kotlin.b.b(obj);
                        list = list2;
                        i2++;
                        if (i2 < size) {
                            yxr yxrVar3 = (yxr) list.get(i2);
                            if (yxrVar3.a() == i4) {
                                c cVar = this.c;
                                a aVar = this.x;
                                AsyncFontListLoader$load$2$typeface$1 asyncFontListLoader$load$2$typeface$1 = new AsyncFontListLoader$load$2$typeface$1(this, yxrVar3, null);
                                asyncFontListLoader$load$1.L$0 = list;
                                asyncFontListLoader$load$1.L$1 = yxrVar3;
                                asyncFontListLoader$load$1.I$0 = i2;
                                asyncFontListLoader$load$1.I$1 = size;
                                asyncFontListLoader$load$1.label = 1;
                                Object b = cVar.b(yxrVar3, aVar, asyncFontListLoader$load$2$typeface$1, asyncFontListLoader$load$1);
                                if (b == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                list2 = list;
                                obj = b;
                                yxrVar = yxrVar3;
                                if (obj == null) {
                                    np11 np11Var = this.b;
                                    oz40Var.setValue(ssa1.c(np11Var.d, obj, yxrVar, np11Var.b, np11Var.c));
                                    boolean p = kotlinx.coroutines.a.p(asyncFontListLoader$load$1.get_context());
                                    this.z = false;
                                    qp11Var = new qp11(oz40Var.getValue(), p);
                                    tlsVar.invoke(qp11Var);
                                    return zy11Var;
                                }
                                asyncFontListLoader$load$1.L$0 = list2;
                                asyncFontListLoader$load$1.L$1 = null;
                                asyncFontListLoader$load$1.I$0 = i2;
                                asyncFontListLoader$load$1.I$1 = size;
                                i4 = 2;
                                asyncFontListLoader$load$1.label = 2;
                            }
                            i2++;
                            if (i2 < size) {
                                boolean p2 = kotlinx.coroutines.a.p(asyncFontListLoader$load$1.get_context());
                                this.z = false;
                                qp11Var = new qp11(oz40Var.getValue(), p2);
                                tlsVar.invoke(qp11Var);
                                return zy11Var;
                            }
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            boolean p3 = kotlinx.coroutines.a.p(asyncFontListLoader$load$1.get_context());
            this.z = false;
            tlsVar.invoke(new qp11(oz40Var.getValue(), p3));
            throw th;
        }
        asyncFontListLoader$load$1 = new AsyncFontListLoader$load$1(this, continuationImpl);
        Object obj2 = asyncFontListLoader$load$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = asyncFontListLoader$load$1.label;
        zy11 zy11Var2 = zy11.a;
        tlsVar = this.w;
        int i42 = 2;
        oz40Var = this.y;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(yxr yxrVar, ContinuationImpl continuationImpl) {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        int i;
        try {
            if (continuationImpl instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) continuationImpl;
                int i2 = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    asyncFontListLoader$loadWithTimeoutOrNull$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                    AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, yxrVar, null);
                    asyncFontListLoader$loadWithTimeoutOrNull$1.L$0 = yxrVar;
                    asyncFontListLoader$loadWithTimeoutOrNull$1.label = 1;
                    Object w = kotlinx.coroutines.a.w(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
                    return w == coroutineSingletons ? coroutineSingletons : w;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            if (!kotlinx.coroutines.a.p(asyncFontListLoader$loadWithTimeoutOrNull$1.get_context())) {
                throw e;
            }
            return null;
        } catch (Exception e2) {
            mse mseVar = (mse) asyncFontListLoader$loadWithTimeoutOrNull$1.get_context().get(lse.a);
            if (mseVar != null) {
                mseVar.handleException(asyncFontListLoader$loadWithTimeoutOrNull$1.get_context(), new IllegalStateException("Unable to load font " + yxrVar, e2));
            }
            return null;
        }
        asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, continuationImpl);
        Object obj2 = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
    }

    @Override // defpackage.m3u0
    public final Object getValue() {
        return this.y.getValue();
    }
}
