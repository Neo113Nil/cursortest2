package xsna;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.foundation.text.selection.SelectedTextType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlatformSelectionBehaviors.android.kt */
/* loaded from: classes11.dex */
public final class fua0 implements aua0 {
    public final kotlin.coroutines.d a;
    public final Context b;
    public final SelectedTextType c;
    public final lwz d;
    public TextClassifier f;
    public final wi50 e = bay.a();
    public final wh50 g = androidx.compose.runtime.k.b(null);
    public final Object h = new Object();

    public fua0(kotlin.coroutines.d dVar, Context context, SelectedTextType selectedTextType, lwz lwzVar) {
        this.a = dVar;
        this.b = context;
        this.c = selectedTextType;
        this.d = lwzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:24:0x007a, B:26:0x0085, B:28:0x008f, B:32:0x009c, B:36:0x00a4), top: B:23:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(fua0 fua0Var, CharSequence charSequence, long j, TextClassifier textClassifier, ContinuationImpl continuationImpl) {
        bua0 bua0Var;
        CoroutineSingletons coroutineSingletons;
        int i;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        ui50 ui50Var;
        hco0 hco0Var;
        TextClassification classifyText;
        long j3;
        CharSequence charSequence3;
        ui50 ui50Var2 = fua0Var.e;
        wh50 wh50Var = fua0Var.g;
        try {
            if (continuationImpl instanceof bua0) {
                bua0Var = (bua0) continuationImpl;
                int i2 = bua0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bua0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = bua0Var.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bua0Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        bua0Var.L$0 = charSequence;
                        bua0Var.L$1 = textClassifier;
                        bua0Var.L$2 = ui50Var2;
                        j2 = j;
                        bua0Var.J$0 = j2;
                        bua0Var.label = 1;
                        if (ui50Var2.b(bua0Var) != coroutineSingletons) {
                            charSequence2 = charSequence;
                            textClassifier2 = textClassifier;
                            ui50Var = ui50Var2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j3 = bua0Var.J$0;
                        ui50Var2 = (ui50) bua0Var.L$2;
                        classifyText = (TextClassification) bua0Var.L$1;
                        charSequence3 = (CharSequence) bua0Var.L$0;
                        kotlin.a.a(obj);
                        try {
                            ((zak0) wh50Var).setValue(new hco0(charSequence3, j3, classifyText));
                            s3q0 s3q0Var = s3q0.a;
                            ui50Var.c(null);
                            return s3q0.a;
                        } finally {
                        }
                    }
                    j2 = bua0Var.J$0;
                    ui50Var = (ui50) bua0Var.L$2;
                    textClassifier2 = (TextClassifier) bua0Var.L$1;
                    charSequence2 = (CharSequence) bua0Var.L$0;
                    kotlin.a.a(obj);
                    hco0Var = (hco0) ((zak0) wh50Var).getValue();
                    if (hco0Var != null) {
                        iyk0 iyk0Var = gua0.a;
                        if (qko0.b(j2, hco0Var.b) && epx.f(charSequence2, hco0Var.a)) {
                            return s3q0.a;
                        }
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    ui50Var.c(null);
                    classifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, qko0.f(j2), qko0.e(j2)).setDefaultLocales(fua0Var.e()).build());
                    bua0Var.L$0 = charSequence2;
                    bua0Var.L$1 = classifyText;
                    bua0Var.L$2 = ui50Var2;
                    bua0Var.J$0 = j2;
                    bua0Var.label = 2;
                    if (ui50Var2.b(bua0Var) != coroutineSingletons) {
                        j3 = j2;
                        charSequence3 = charSequence2;
                        ((zak0) wh50Var).setValue(new hco0(charSequence3, j3, classifyText));
                        s3q0 s3q0Var3 = s3q0.a;
                        ui50Var.c(null);
                        return s3q0.a;
                    }
                    return coroutineSingletons;
                }
            }
            hco0Var = (hco0) ((zak0) wh50Var).getValue();
            if (hco0Var != null) {
            }
            s3q0 s3q0Var22 = s3q0.a;
            ui50Var.c(null);
            classifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, qko0.f(j2), qko0.e(j2)).setDefaultLocales(fua0Var.e()).build());
            bua0Var.L$0 = charSequence2;
            bua0Var.L$1 = classifyText;
            bua0Var.L$2 = ui50Var2;
            bua0Var.J$0 = j2;
            bua0Var.label = 2;
            if (ui50Var2.b(bua0Var) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } finally {
        }
        bua0Var = new bua0(fua0Var, continuationImpl);
        Object obj2 = bua0Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bua0Var.label;
        if (i != 0) {
        }
    }

    @Override // xsna.aua0
    public final Object a(CharSequence charSequence, long j, SuspendLambda suspendLambda) {
        Object k = (charSequence.length() == 0 || qko0.c(j)) ? s3q0.a : myc0.k(this.a, new dua0(this, new cua0(j, charSequence, null, this), null), suspendLambda);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    @Override // xsna.aua0
    public final Object b(CharSequence charSequence, long j, SuspendLambda suspendLambda) {
        Object k = (charSequence.length() == 0 || qko0.c(j)) ? s3q0.a : myc0.k(this.a, new dua0(this, new cua0(j, charSequence, null, this), null), suspendLambda);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    @Override // xsna.aua0
    public final Object c(CharSequence charSequence, long j, SuspendLambda suspendLambda) {
        if (charSequence.length() == 0 || qko0.c(j)) {
            return null;
        }
        return myc0.k(this.a, new dua0(this, new eua0(j, charSequence, null, this), null), suspendLambda);
    }

    public final LocaleList e() {
        lwz lwzVar = this.d;
        if (lwzVar == null) {
            return new LocaleList(sta0.a.b().c().a);
        }
        ArrayList arrayList = new ArrayList(c5g.u(lwzVar, 10));
        Iterator<kwz> it = lwzVar.b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
