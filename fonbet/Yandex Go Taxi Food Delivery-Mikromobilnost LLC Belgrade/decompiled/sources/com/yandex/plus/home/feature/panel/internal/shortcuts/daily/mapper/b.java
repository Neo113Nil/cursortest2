package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.common.utils.spantext.AdjustedImageSpan;
import defpackage.b5d0;
import defpackage.fnb0;
import defpackage.jse;
import defpackage.k7d0;
import defpackage.ny61;
import defpackage.s5r;
import defpackage.skd0;
import defpackage.t5r;
import defpackage.tje;
import defpackage.tld0;
import defpackage.uld0;
import defpackage.vld0;
import defpackage.wld0;
import defpackage.ycc;
import defpackage.yw01;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class b {
    public final jse a;
    public final SpannableStringBuilder b;

    public b(String str, jse jseVar) {
        this.a = jseVar;
        this.b = new SpannableStringBuilder(str);
    }

    public final t5r a(String str) {
        return kotlin.sequences.b.g(new yw01(Regex.c(new Regex(str), this.b), new fnb0(29)), new vld0(0));
    }

    public final void b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uld0 uld0Var = (uld0) it.next();
            ycc.r(kotlin.sequences.b.s(new yw01(a(uld0Var.c), new k7d0(7, uld0Var))), arrayList);
        }
        for (Pair pair : kotlin.collections.a.q0(kotlin.collections.a.x0(arrayList, new wld0()))) {
            uld0 uld0Var2 = (uld0) pair.getFirst();
            int intValue = ((Number) pair.getSecond()).intValue();
            int length = uld0Var2.c.length() + intValue;
            boolean z = uld0Var2.f;
            boolean z2 = uld0Var2.g;
            StyleSpan styleSpan = new StyleSpan((z && z2) ? 3 : z ? 1 : z2 ? 2 : 0);
            SpannableStringBuilder spannableStringBuilder = this.b;
            spannableStringBuilder.setSpan(styleSpan, intValue, length, 34);
            Integer num = uld0Var2.e;
            if (num != null) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), intValue, length, 34);
            }
            spannableStringBuilder.replace(intValue, length, (CharSequence) uld0Var2.d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Iterator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0069 -> B:10:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, b5d0 b5d0Var, ContinuationImpl continuationImpl) {
        PlusShortcutTextBuilder$textWithIconsSpan$1 plusShortcutTextBuilder$textWithIconsSpan$1;
        int i;
        Iterator it;
        int i2;
        if (continuationImpl instanceof PlusShortcutTextBuilder$textWithIconsSpan$1) {
            plusShortcutTextBuilder$textWithIconsSpan$1 = (PlusShortcutTextBuilder$textWithIconsSpan$1) continuationImpl;
            int i3 = plusShortcutTextBuilder$textWithIconsSpan$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                plusShortcutTextBuilder$textWithIconsSpan$1.label = i3 - Integer.MIN_VALUE;
                Object obj = plusShortcutTextBuilder$textWithIconsSpan$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusShortcutTextBuilder$textWithIconsSpan$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = list.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = plusShortcutTextBuilder$textWithIconsSpan$1.I$2;
                    int i5 = plusShortcutTextBuilder$textWithIconsSpan$1.I$1;
                    int i6 = plusShortcutTextBuilder$textWithIconsSpan$1.I$0;
                    ?? r6 = (Iterator) plusShortcutTextBuilder$textWithIconsSpan$1.L$7;
                    tld0 tld0Var = (tld0) plusShortcutTextBuilder$textWithIconsSpan$1.L$5;
                    Iterator it2 = (Iterator) plusShortcutTextBuilder$textWithIconsSpan$1.L$3;
                    b5d0 b5d0Var2 = (b5d0) plusShortcutTextBuilder$textWithIconsSpan$1.L$1;
                    kotlin.b.b(obj);
                    int i7 = i4;
                    it = it2;
                    tld0 tld0Var2 = tld0Var;
                    s5r s5rVar = r6;
                    PlusShortcutTextBuilder$textWithIconsSpan$1 plusShortcutTextBuilder$textWithIconsSpan$12 = plusShortcutTextBuilder$textWithIconsSpan$1;
                    int i8 = i5;
                    b5d0 b5d0Var3 = b5d0Var2;
                    while (s5rVar.hasNext()) {
                        int intValue = ((Number) s5rVar.next()).intValue();
                        plusShortcutTextBuilder$textWithIconsSpan$12.L$0 = null;
                        plusShortcutTextBuilder$textWithIconsSpan$12.L$1 = b5d0Var3;
                        plusShortcutTextBuilder$textWithIconsSpan$12.L$2 = null;
                        plusShortcutTextBuilder$textWithIconsSpan$12.L$3 = it;
                        plusShortcutTextBuilder$textWithIconsSpan$12.L$4 = null;
                        plusShortcutTextBuilder$textWithIconsSpan$12.L$5 = tld0Var2;
                        plusShortcutTextBuilder$textWithIconsSpan$12.L$6 = null;
                        plusShortcutTextBuilder$textWithIconsSpan$12.L$7 = s5rVar;
                        plusShortcutTextBuilder$textWithIconsSpan$12.L$8 = null;
                        plusShortcutTextBuilder$textWithIconsSpan$12.I$0 = i6;
                        plusShortcutTextBuilder$textWithIconsSpan$12.I$1 = i8;
                        plusShortcutTextBuilder$textWithIconsSpan$12.I$2 = i7;
                        plusShortcutTextBuilder$textWithIconsSpan$12.I$3 = intValue;
                        plusShortcutTextBuilder$textWithIconsSpan$12.I$4 = 0;
                        plusShortcutTextBuilder$textWithIconsSpan$12.label = 1;
                        if (d(tld0Var2, b5d0Var3, intValue, plusShortcutTextBuilder$textWithIconsSpan$12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    b5d0Var = b5d0Var3;
                    i2 = i6;
                    plusShortcutTextBuilder$textWithIconsSpan$1 = plusShortcutTextBuilder$textWithIconsSpan$12;
                    if (it.hasNext()) {
                        tld0 tld0Var3 = (tld0) it.next();
                        s5rVar = new s5r(a(tld0Var3.c));
                        plusShortcutTextBuilder$textWithIconsSpan$12 = plusShortcutTextBuilder$textWithIconsSpan$1;
                        tld0Var2 = tld0Var3;
                        i8 = 0;
                        i6 = i2;
                        b5d0Var3 = b5d0Var;
                        i7 = 0;
                        while (s5rVar.hasNext()) {
                        }
                        b5d0Var = b5d0Var3;
                        i2 = i6;
                        plusShortcutTextBuilder$textWithIconsSpan$1 = plusShortcutTextBuilder$textWithIconsSpan$12;
                        if (it.hasNext()) {
                            return this;
                        }
                    }
                }
            }
        }
        plusShortcutTextBuilder$textWithIconsSpan$1 = new PlusShortcutTextBuilder$textWithIconsSpan$1(this, continuationImpl);
        Object obj2 = plusShortcutTextBuilder$textWithIconsSpan$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusShortcutTextBuilder$textWithIconsSpan$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(tld0 tld0Var, b5d0 b5d0Var, int i, ContinuationImpl continuationImpl) {
        PlusShortcutTextBuilder$trySetImageSpan$1 plusShortcutTextBuilder$trySetImageSpan$1;
        int i2;
        int length;
        Object k0;
        Result.Failure failure;
        Throwable a;
        Drawable drawable;
        try {
            if (continuationImpl instanceof PlusShortcutTextBuilder$trySetImageSpan$1) {
                plusShortcutTextBuilder$trySetImageSpan$1 = (PlusShortcutTextBuilder$trySetImageSpan$1) continuationImpl;
                int i3 = plusShortcutTextBuilder$trySetImageSpan$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    plusShortcutTextBuilder$trySetImageSpan$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = plusShortcutTextBuilder$trySetImageSpan$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = plusShortcutTextBuilder$trySetImageSpan$1.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        length = tld0Var.c.length() + i;
                        try {
                            jse jseVar = this.a;
                            PlusShortcutTextBuilder$trySetImageSpan$2$1 plusShortcutTextBuilder$trySetImageSpan$2$1 = new PlusShortcutTextBuilder$trySetImageSpan$2$1(b5d0Var, tld0Var, null);
                            plusShortcutTextBuilder$trySetImageSpan$1.L$0 = tld0Var;
                            plusShortcutTextBuilder$trySetImageSpan$1.L$1 = null;
                            plusShortcutTextBuilder$trySetImageSpan$1.L$2 = null;
                            plusShortcutTextBuilder$trySetImageSpan$1.L$3 = null;
                            plusShortcutTextBuilder$trySetImageSpan$1.L$4 = null;
                            plusShortcutTextBuilder$trySetImageSpan$1.I$0 = i;
                            plusShortcutTextBuilder$trySetImageSpan$1.I$1 = length;
                            plusShortcutTextBuilder$trySetImageSpan$1.I$2 = 0;
                            plusShortcutTextBuilder$trySetImageSpan$1.I$3 = 0;
                            plusShortcutTextBuilder$trySetImageSpan$1.label = 1;
                            k0 = tje.k0(jseVar, plusShortcutTextBuilder$trySetImageSpan$2$1, plusShortcutTextBuilder$trySetImageSpan$1);
                            if (k0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (TimeoutCancellationException e) {
                            e = e;
                            failure = new Result.Failure(e);
                            k0 = failure;
                            a = Result.a(k0);
                            if (a != null) {
                            }
                            if (k0 instanceof Result.Failure) {
                            }
                            drawable = (Drawable) k0;
                            SpannableStringBuilder spannableStringBuilder = this.b;
                            if (drawable == null) {
                            }
                            return zy11.a;
                        } catch (Throwable th) {
                            th = th;
                            failure = new Result.Failure(th);
                            k0 = failure;
                            a = Result.a(k0);
                            if (a != null) {
                            }
                            if (k0 instanceof Result.Failure) {
                            }
                            drawable = (Drawable) k0;
                            SpannableStringBuilder spannableStringBuilder2 = this.b;
                            if (drawable == null) {
                            }
                            return zy11.a;
                        }
                    } else {
                        if (i2 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i4 = plusShortcutTextBuilder$trySetImageSpan$1.I$1;
                        i = plusShortcutTextBuilder$trySetImageSpan$1.I$0;
                        tld0 tld0Var2 = (tld0) plusShortcutTextBuilder$trySetImageSpan$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            length = i4;
                            tld0Var = tld0Var2;
                            k0 = obj;
                        } catch (TimeoutCancellationException e2) {
                            length = i4;
                            tld0Var = tld0Var2;
                            e = e2;
                            failure = new Result.Failure(e);
                            k0 = failure;
                            a = Result.a(k0);
                            if (a != null) {
                            }
                            if (k0 instanceof Result.Failure) {
                            }
                            drawable = (Drawable) k0;
                            SpannableStringBuilder spannableStringBuilder22 = this.b;
                            if (drawable == null) {
                            }
                            return zy11.a;
                        } catch (Throwable th2) {
                            length = i4;
                            tld0Var = tld0Var2;
                            th = th2;
                            failure = new Result.Failure(th);
                            k0 = failure;
                            a = Result.a(k0);
                            if (a != null) {
                            }
                            if (k0 instanceof Result.Failure) {
                            }
                            drawable = (Drawable) k0;
                            SpannableStringBuilder spannableStringBuilder222 = this.b;
                            if (drawable == null) {
                            }
                            return zy11.a;
                        }
                    }
                    a = Result.a(k0);
                    if (a != null) {
                        skd0.c(PlusLogTag.UI, "Failed to load image from " + tld0Var.d, a);
                    }
                    if (k0 instanceof Result.Failure) {
                        k0 = null;
                    }
                    drawable = (Drawable) k0;
                    SpannableStringBuilder spannableStringBuilder2222 = this.b;
                    if (drawable == null) {
                        spannableStringBuilder2222.setSpan(new AdjustedImageSpan(drawable, 0.0f, 2, null), i, length, 34);
                    } else {
                        spannableStringBuilder2222.replace(i, length, (CharSequence) tld0Var.e);
                    }
                    return zy11.a;
                }
            }
            if (i2 != 0) {
            }
            a = Result.a(k0);
            if (a != null) {
            }
            if (k0 instanceof Result.Failure) {
            }
            drawable = (Drawable) k0;
            SpannableStringBuilder spannableStringBuilder22222 = this.b;
            if (drawable == null) {
            }
            return zy11.a;
        } catch (CancellationException e3) {
            throw e3;
        }
        plusShortcutTextBuilder$trySetImageSpan$1 = new PlusShortcutTextBuilder$trySetImageSpan$1(this, continuationImpl);
        Object obj2 = plusShortcutTextBuilder$trySetImageSpan$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = plusShortcutTextBuilder$trySetImageSpan$1.label;
    }
}
