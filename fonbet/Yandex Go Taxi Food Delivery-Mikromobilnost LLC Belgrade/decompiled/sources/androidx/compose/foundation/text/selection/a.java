package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import defpackage.a7u0;
import defpackage.asy0;
import defpackage.bwc0;
import defpackage.cwc0;
import defpackage.fse;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h5z;
import defpackage.jl40;
import defpackage.k5z;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.qvc0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uky0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes10.dex */
public final class a implements bwc0 {
    public final fse a;
    public final Context b;
    public final SelectedTextType c;
    public final k5z d;
    public TextClassifier f;
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public final oz40 g = androidx.compose.runtime.f.j(null);
    public final Object h = new Object();

    public a(fse fseVar, Context context, SelectedTextType selectedTextType, k5z k5zVar) {
        this.a = fseVar;
        this.b = context;
        this.c = selectedTextType;
        this.d = k5zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:24:0x007a, B:26:0x0082, B:28:0x008c), top: B:23:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, CharSequence charSequence, long j, TextClassifier textClassifier, ContinuationImpl continuationImpl) {
        PlatformSelectionBehaviorsImpl$classifyText$1 platformSelectionBehaviorsImpl$classifyText$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        g050 g050Var;
        uky0 uky0Var;
        TextClassification classifyText;
        long j3;
        CharSequence charSequence3;
        boolean z;
        g050 g050Var2 = aVar.e;
        oz40 oz40Var = aVar.g;
        try {
            if (continuationImpl instanceof PlatformSelectionBehaviorsImpl$classifyText$1) {
                platformSelectionBehaviorsImpl$classifyText$1 = (PlatformSelectionBehaviorsImpl$classifyText$1) continuationImpl;
                int i2 = platformSelectionBehaviorsImpl$classifyText$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    platformSelectionBehaviorsImpl$classifyText$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = platformSelectionBehaviorsImpl$classifyText$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = platformSelectionBehaviorsImpl$classifyText$1.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        platformSelectionBehaviorsImpl$classifyText$1.L$0 = charSequence;
                        platformSelectionBehaviorsImpl$classifyText$1.L$1 = textClassifier;
                        platformSelectionBehaviorsImpl$classifyText$1.L$2 = g050Var2;
                        j2 = j;
                        platformSelectionBehaviorsImpl$classifyText$1.J$0 = j2;
                        platformSelectionBehaviorsImpl$classifyText$1.label = 1;
                        if (g050Var2.a(platformSelectionBehaviorsImpl$classifyText$1) != coroutineSingletons) {
                            charSequence2 = charSequence;
                            textClassifier2 = textClassifier;
                            g050Var = g050Var2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = platformSelectionBehaviorsImpl$classifyText$1.J$0;
                        g050Var2 = (g050) platformSelectionBehaviorsImpl$classifyText$1.L$2;
                        classifyText = (TextClassification) platformSelectionBehaviorsImpl$classifyText$1.L$1;
                        charSequence3 = (CharSequence) platformSelectionBehaviorsImpl$classifyText$1.L$0;
                        kotlin.b.b(obj);
                        try {
                            oz40Var.setValue(new uky0(charSequence3, j3, classifyText));
                            return zy11Var;
                        } finally {
                        }
                    }
                    j2 = platformSelectionBehaviorsImpl$classifyText$1.J$0;
                    g050Var = (g050) platformSelectionBehaviorsImpl$classifyText$1.L$2;
                    textClassifier2 = (TextClassifier) platformSelectionBehaviorsImpl$classifyText$1.L$1;
                    charSequence2 = (CharSequence) platformSelectionBehaviorsImpl$classifyText$1.L$0;
                    kotlin.b.b(obj);
                    uky0Var = (uky0) oz40Var.getValue();
                    if (uky0Var != null) {
                        a7u0 a7u0Var = cwc0.a;
                        if (asy0.b(j2, uky0Var.b)) {
                            if (jl40.l(charSequence2, uky0Var.a)) {
                                z = true;
                                if (z) {
                                    return zy11Var;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                    g050Var2.d(null);
                    classifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, asy0.f(j2), asy0.e(j2)).setDefaultLocales(aVar.b()).build());
                    platformSelectionBehaviorsImpl$classifyText$1.L$0 = charSequence2;
                    platformSelectionBehaviorsImpl$classifyText$1.L$1 = classifyText;
                    platformSelectionBehaviorsImpl$classifyText$1.L$2 = g050Var2;
                    platformSelectionBehaviorsImpl$classifyText$1.J$0 = j2;
                    platformSelectionBehaviorsImpl$classifyText$1.label = 2;
                    if (g050Var2.a(platformSelectionBehaviorsImpl$classifyText$1) != coroutineSingletons) {
                        j3 = j2;
                        charSequence3 = charSequence2;
                        oz40Var.setValue(new uky0(charSequence3, j3, classifyText));
                        return zy11Var;
                    }
                    return coroutineSingletons;
                }
            }
            uky0Var = (uky0) oz40Var.getValue();
            if (uky0Var != null) {
            }
            g050Var2.d(null);
            classifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, asy0.f(j2), asy0.e(j2)).setDefaultLocales(aVar.b()).build());
            platformSelectionBehaviorsImpl$classifyText$1.L$0 = charSequence2;
            platformSelectionBehaviorsImpl$classifyText$1.L$1 = classifyText;
            platformSelectionBehaviorsImpl$classifyText$1.L$2 = g050Var2;
            platformSelectionBehaviorsImpl$classifyText$1.J$0 = j2;
            platformSelectionBehaviorsImpl$classifyText$1.label = 2;
            if (g050Var2.a(platformSelectionBehaviorsImpl$classifyText$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } finally {
        }
        platformSelectionBehaviorsImpl$classifyText$1 = new PlatformSelectionBehaviorsImpl$classifyText$1(aVar, continuationImpl);
        Object obj2 = platformSelectionBehaviorsImpl$classifyText$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = platformSelectionBehaviorsImpl$classifyText$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    public final LocaleList b() {
        k5z k5zVar = this.d;
        if (k5zVar == null) {
            return new LocaleList(((h5z) qvc0.a.a().a.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(tcc.n(k5zVar, 10));
        Iterator it = k5zVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((h5z) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final Object c(CharSequence charSequence, long j, SuspendLambda suspendLambda) {
        if (charSequence.length() == 0 || asy0.c(j)) {
            return zy11.a;
        }
        return tje.k0(this.a, new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this, new PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(j, this, charSequence, null), null), suspendLambda);
    }
}
