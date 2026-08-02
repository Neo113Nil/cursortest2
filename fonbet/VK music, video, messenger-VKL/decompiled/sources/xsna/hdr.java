package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FilterPreviewRepository.kt */
/* loaded from: classes4.dex */
public final class hdr {
    public final yce a;
    public final kbe b;
    public final HashMap c = new HashMap();
    public final wi50 d = bay.a();
    public ld7 e;
    public e4p f;

    public hdr(yce yceVar, kbe kbeVar) {
        this.a = yceVar;
        this.b = kbeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093 A[Catch: all -> 0x004d, TRY_ENTER, TryCatch #1 {all -> 0x004d, blocks: (B:18:0x0049, B:19:0x008b, B:23:0x0093, B:25:0x009b, B:26:0x00b7, B:28:0x00bd, B:33:0x00d0, B:34:0x00d7), top: B:17:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r3v8, types: [xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(aa00 aa00Var, ContinuationImpl continuationImpl) {
        fdr fdrVar;
        CoroutineSingletons coroutineSingletons;
        int i;
        wi50 wi50Var;
        int i2;
        Throwable th;
        ui50 ui50Var;
        ota0 b;
        aa00 aa00Var2;
        ota0 ota0Var;
        HashMap hashMap = this.c;
        try {
            if (continuationImpl instanceof fdr) {
                fdrVar = (fdr) continuationImpl;
                int i3 = fdrVar.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fdrVar.label = i3 - Integer.MIN_VALUE;
                    Object obj = fdrVar.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fdrVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        fdrVar.L$0 = aa00Var;
                        wi50Var = this.d;
                        fdrVar.L$1 = wi50Var;
                        fdrVar.I$0 = 0;
                        fdrVar.label = 1;
                        if (wi50Var.b(fdrVar) != coroutineSingletons) {
                            i2 = 0;
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            return obj;
                        }
                        ui50Var = (ui50) fdrVar.L$1;
                        aa00Var2 = (aa00) fdrVar.L$0;
                        try {
                            kotlin.a.a(obj);
                            ota0Var = (ota0) obj;
                            if (ota0Var != null) {
                                ui50Var.c(null);
                                return null;
                            }
                            String str = aa00Var2.a;
                            if (hashMap.get(str) == null) {
                                hashMap.put(str, myc0.b(zvj.a(fdrVar.getContext().plus(iyx.a())), null, null, new gdr(this, aa00Var2, ota0Var, null), 3));
                            }
                            Object obj2 = hashMap.get(str);
                            if (obj2 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            zrl zrlVar = (zrl) obj2;
                            ui50Var.c(null);
                            fdrVar.L$0 = null;
                            fdrVar.L$1 = null;
                            fdrVar.label = 3;
                            Object H = zrlVar.H(fdrVar);
                            return H == coroutineSingletons ? coroutineSingletons : H;
                        } catch (Throwable th2) {
                            th = th2;
                            ui50Var.c(null);
                            throw th;
                        }
                    }
                    int i4 = fdrVar.I$0;
                    ?? r3 = (ui50) fdrVar.L$1;
                    aa00 aa00Var3 = (aa00) fdrVar.L$0;
                    kotlin.a.a(obj);
                    wi50Var = r3;
                    i2 = i4;
                    aa00Var = aa00Var3;
                    fdrVar.L$0 = aa00Var;
                    fdrVar.L$1 = wi50Var;
                    fdrVar.I$0 = i2;
                    fdrVar.I$1 = 0;
                    fdrVar.label = 2;
                    b = b();
                    if (b != coroutineSingletons) {
                        aa00Var2 = aa00Var;
                        ui50Var = wi50Var;
                        obj = b;
                        ota0Var = (ota0) obj;
                        if (ota0Var != null) {
                        }
                    }
                }
            }
            fdrVar.L$0 = aa00Var;
            fdrVar.L$1 = wi50Var;
            fdrVar.I$0 = i2;
            fdrVar.I$1 = 0;
            fdrVar.label = 2;
            b = b();
            if (b != coroutineSingletons) {
            }
        } catch (Throwable th3) {
            wi50 wi50Var2 = wi50Var;
            th = th3;
            ui50Var = wi50Var2;
            ui50Var.c(null);
            throw th;
        }
        fdrVar = new fdr(this, continuationImpl);
        Object obj3 = fdrVar.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fdrVar.label;
        if (i != 0) {
        }
    }

    public final ota0 b() {
        ld7 ld7Var;
        e4p e4pVar = (e4p) this.b.invoke();
        if (e4pVar != null) {
            if (e4pVar.equals(this.f) && (ld7Var = this.e) != null) {
                return ld7Var;
            }
            o3p c = ((v3p) this.a.c).u().c(e4pVar, f4p.a(e4pVar, false));
            if (c == null) {
                c = null;
            }
            if (c != null) {
                Bitmap bitmap = c.c.a;
                Matrix matrix = zb7.a;
                float min = 256 / Math.min(bitmap.getWidth(), bitmap.getHeight());
                Matrix matrix2 = zb7.a;
                matrix2.reset();
                matrix2.setScale(min, min);
                Bitmap b = n3p.b(256, 256);
                new Canvas(b).drawBitmap(bitmap, matrix2, null);
                ld7 ld7Var2 = new ld7(b);
                this.e = ld7Var2;
                this.f = e4pVar;
                return ld7Var2;
            }
        }
        return null;
    }
}
