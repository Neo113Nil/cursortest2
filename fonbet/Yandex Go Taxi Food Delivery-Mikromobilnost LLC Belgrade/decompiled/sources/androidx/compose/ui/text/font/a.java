package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import defpackage.buj0;
import defpackage.cua1;
import defpackage.fp11;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.vl51;
import defpackage.xpb1;
import defpackage.yxr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final Context a;

    public a(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yxr yxrVar, ContinuationImpl continuationImpl) {
        AndroidFontLoader$awaitLoad$1 androidFontLoader$awaitLoad$1;
        int i;
        if (continuationImpl instanceof AndroidFontLoader$awaitLoad$1) {
            androidFontLoader$awaitLoad$1 = (AndroidFontLoader$awaitLoad$1) continuationImpl;
            int i2 = androidFontLoader$awaitLoad$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidFontLoader$awaitLoad$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidFontLoader$awaitLoad$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidFontLoader$awaitLoad$1.label;
                Context context = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (yxrVar instanceof vl51) {
                        androidFontLoader$awaitLoad$1.label = 1;
                        Typeface l = xpb1.l((vl51) yxrVar);
                        if (l != coroutineSingletons) {
                            return l;
                        }
                    } else {
                        if (!(yxrVar instanceof buj0)) {
                            kbs.f(yxrVar, "Unknown font type: ");
                            return null;
                        }
                        androidFontLoader$awaitLoad$1.L$0 = yxrVar;
                        androidFontLoader$awaitLoad$1.label = 2;
                        obj = cua1.b((buj0) yxrVar, context, androidFontLoader$awaitLoad$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yxrVar = (yxr) androidFontLoader$awaitLoad$1.L$0;
                kotlin.b.b(obj);
                return fp11.a((Typeface) obj, ((buj0) yxrVar).d, context);
            }
        }
        androidFontLoader$awaitLoad$1 = new AndroidFontLoader$awaitLoad$1(this, continuationImpl);
        Object obj2 = androidFontLoader$awaitLoad$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidFontLoader$awaitLoad$1.label;
        Context context2 = this.a;
        if (i != 0) {
        }
        return fp11.a((Typeface) obj2, ((buj0) yxrVar).d, context2);
    }

    public final Typeface b(yxr yxrVar) {
        if (yxrVar instanceof vl51) {
            return xpb1.o((vl51) yxrVar);
        }
        if (!(yxrVar instanceof buj0)) {
            return null;
        }
        buj0 buj0Var = (buj0) yxrVar;
        Context context = this.a;
        return fp11.a(cua1.a(buj0Var, context), buj0Var.d, context);
    }
}
