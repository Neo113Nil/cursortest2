package com.yandex.plus.plaquesdk.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.style.UpdateAppearance;
import android.util.TypedValue;
import androidx.appcompat.view.ContextThemeWrapper;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.plus.home.common.utils.spantext.CustomImageSpan;
import com.yandex.plus.home.plaque.repository.graphql.formatter.CashbackSpan;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$TextDecoration;
import com.yandex.plus.plaquesdk.utils.StyledTypefaceSpan;
import defpackage.b5d0;
import defpackage.b64;
import defpackage.coc0;
import defpackage.d8s;
import defpackage.e8s;
import defpackage.evu0;
import defpackage.h8s;
import defpackage.i3f;
import defpackage.j73;
import defpackage.k8s;
import defpackage.l8s;
import defpackage.m8s;
import defpackage.n8s;
import defpackage.ny61;
import defpackage.p8s;
import defpackage.pgz;
import defpackage.r8s;
import defpackage.vit;
import defpackage.w511;
import defpackage.x7s;
import defpackage.y7s;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes8.dex */
public final class a {
    public final b5d0 a;
    public final coc0 b;
    public final r8s c;
    public final vit d;
    public final i3f e;
    public final n8s f;
    public final pgz g;
    public final ContextThemeWrapper h;

    public a(b5d0 b5d0Var, Context context, coc0 coc0Var, r8s r8sVar, vit vitVar, i3f i3fVar, n8s n8sVar, pgz pgzVar) {
        this.a = b5d0Var;
        this.b = coc0Var;
        this.c = r8sVar;
        this.d = vitVar;
        this.e = i3fVar;
        this.f = n8sVar;
        this.g = pgzVar;
        this.h = new ContextThemeWrapper(context, i3fVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SpannableStringBuilder spannableStringBuilder, h8s h8sVar, ContinuationImpl continuationImpl) {
        FormattedTextConverter$appendAllSpans$1 formattedTextConverter$appendAllSpans$1;
        int i;
        Iterator it;
        FormattedTextConverter$appendAllSpans$1 formattedTextConverter$appendAllSpans$12;
        int i2;
        h8s h8sVar2;
        int i3;
        if (continuationImpl instanceof FormattedTextConverter$appendAllSpans$1) {
            formattedTextConverter$appendAllSpans$1 = (FormattedTextConverter$appendAllSpans$1) continuationImpl;
            int i4 = formattedTextConverter$appendAllSpans$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                formattedTextConverter$appendAllSpans$1.label = i4 - Integer.MIN_VALUE;
                Object obj = formattedTextConverter$appendAllSpans$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formattedTextConverter$appendAllSpans$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    if (h8sVar instanceof l8s) {
                        c(spannableStringBuilder, (l8s) h8sVar, null);
                        return zy11Var;
                    }
                    if (h8sVar instanceof d8s) {
                        formattedTextConverter$appendAllSpans$1.L$0 = null;
                        formattedTextConverter$appendAllSpans$1.L$1 = null;
                        formattedTextConverter$appendAllSpans$1.label = 1;
                        return b(spannableStringBuilder, ((d8s) h8sVar).d(), (x7s) h8sVar, formattedTextConverter$appendAllSpans$1) == obj2 ? obj2 : zy11Var;
                    }
                    if (h8sVar instanceof e8s) {
                        formattedTextConverter$appendAllSpans$1.L$0 = null;
                        formattedTextConverter$appendAllSpans$1.L$1 = null;
                        formattedTextConverter$appendAllSpans$1.label = 2;
                        if (b(spannableStringBuilder, ((e8s) h8sVar).d(), (x7s) h8sVar, formattedTextConverter$appendAllSpans$1) == obj2) {
                        }
                    } else {
                        if (h8sVar instanceof k8s) {
                            k8s k8sVar = (k8s) h8sVar;
                            c(spannableStringBuilder, k8sVar.b(), new URLSpan(k8sVar.a()));
                            return zy11Var;
                        }
                        if (!(h8sVar instanceof y7s)) {
                            w511.b();
                            return null;
                        }
                        int length = spannableStringBuilder.length();
                        it = ((y7s) h8sVar).a().iterator();
                        formattedTextConverter$appendAllSpans$12 = formattedTextConverter$appendAllSpans$1;
                        i2 = length;
                        h8sVar2 = h8sVar;
                        i3 = 0;
                    }
                } else {
                    if (i == 1) {
                        b.b(obj);
                        return zy11Var;
                    }
                    if (i == 2) {
                        b.b(obj);
                        return zy11Var;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = formattedTextConverter$appendAllSpans$1.I$1;
                    int i6 = formattedTextConverter$appendAllSpans$1.I$0;
                    Iterator it2 = (Iterator) formattedTextConverter$appendAllSpans$1.L$3;
                    h8s h8sVar3 = (h8s) formattedTextConverter$appendAllSpans$1.L$1;
                    SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) formattedTextConverter$appendAllSpans$1.L$0;
                    b.b(obj);
                    h8sVar2 = h8sVar3;
                    it = it2;
                    formattedTextConverter$appendAllSpans$12 = formattedTextConverter$appendAllSpans$1;
                    i2 = i6;
                    i3 = i5;
                    spannableStringBuilder = spannableStringBuilder2;
                }
                while (it.hasNext()) {
                    h8s h8sVar4 = (h8s) it.next();
                    formattedTextConverter$appendAllSpans$12.L$0 = spannableStringBuilder;
                    formattedTextConverter$appendAllSpans$12.L$1 = h8sVar2;
                    formattedTextConverter$appendAllSpans$12.L$2 = null;
                    formattedTextConverter$appendAllSpans$12.L$3 = it;
                    formattedTextConverter$appendAllSpans$12.L$4 = null;
                    formattedTextConverter$appendAllSpans$12.L$5 = null;
                    formattedTextConverter$appendAllSpans$12.I$0 = i2;
                    formattedTextConverter$appendAllSpans$12.I$1 = i3;
                    formattedTextConverter$appendAllSpans$12.I$2 = 0;
                    formattedTextConverter$appendAllSpans$12.label = 3;
                    if (a(spannableStringBuilder, h8sVar4, formattedTextConverter$appendAllSpans$12) == obj2) {
                    }
                }
                ((y7s) h8sVar2).getClass();
                this.c.getClass();
                return zy11Var;
            }
        }
        formattedTextConverter$appendAllSpans$1 = new FormattedTextConverter$appendAllSpans$1(this, continuationImpl);
        Object obj3 = formattedTextConverter$appendAllSpans$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formattedTextConverter$appendAllSpans$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        ((y7s) h8sVar2).getClass();
        this.c.getClass();
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(SpannableStringBuilder spannableStringBuilder, String str, x7s x7sVar, ContinuationImpl continuationImpl) {
        FormattedTextConverter$appendImage$1 formattedTextConverter$appendImage$1;
        Object obj;
        int i;
        x7s x7sVar2;
        SpannableStringBuilder spannableStringBuilder2;
        SpannableStringBuilder spannableStringBuilder3;
        Result.Failure failure;
        Throwable a;
        int i2;
        int i3;
        int i4;
        try {
            if (continuationImpl instanceof FormattedTextConverter$appendImage$1) {
                formattedTextConverter$appendImage$1 = (FormattedTextConverter$appendImage$1) continuationImpl;
                int i5 = formattedTextConverter$appendImage$1.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    formattedTextConverter$appendImage$1.label = i5 - Integer.MIN_VALUE;
                    obj = formattedTextConverter$appendImage$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = formattedTextConverter$appendImage$1.label;
                    int i6 = 1;
                    if (i != 0) {
                        b.b(obj);
                        try {
                            com.yandex.plus.glide.a b = ((com.yandex.plus.glide.b) this.a).b(str);
                            formattedTextConverter$appendImage$1.L$0 = null;
                            formattedTextConverter$appendImage$1.L$1 = null;
                            x7sVar2 = x7sVar;
                            try {
                                formattedTextConverter$appendImage$1.L$2 = x7sVar2;
                                formattedTextConverter$appendImage$1.L$3 = spannableStringBuilder;
                                formattedTextConverter$appendImage$1.L$4 = null;
                                formattedTextConverter$appendImage$1.L$5 = null;
                                formattedTextConverter$appendImage$1.L$6 = null;
                                formattedTextConverter$appendImage$1.I$0 = 0;
                                formattedTextConverter$appendImage$1.I$1 = 0;
                                formattedTextConverter$appendImage$1.label = 1;
                                obj = b.c(formattedTextConverter$appendImage$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                spannableStringBuilder3 = spannableStringBuilder;
                            } catch (TimeoutCancellationException e) {
                                e = e;
                                spannableStringBuilder2 = spannableStringBuilder;
                                failure = new Result.Failure(e);
                                obj = failure;
                                spannableStringBuilder3 = spannableStringBuilder2;
                                if (!(obj instanceof Result.Failure)) {
                                }
                                a = Result.a(obj);
                                if (a != null) {
                                }
                                return zy11.a;
                            } catch (Throwable th) {
                                th = th;
                                spannableStringBuilder2 = spannableStringBuilder;
                                failure = new Result.Failure(th);
                                obj = failure;
                                spannableStringBuilder3 = spannableStringBuilder2;
                                if (!(obj instanceof Result.Failure)) {
                                }
                                a = Result.a(obj);
                                if (a != null) {
                                }
                                return zy11.a;
                            }
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            x7sVar2 = x7sVar;
                        } catch (Throwable th2) {
                            th = th2;
                            x7sVar2 = x7sVar;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        spannableStringBuilder3 = (SpannableStringBuilder) formattedTextConverter$appendImage$1.L$3;
                        x7sVar2 = (x7s) formattedTextConverter$appendImage$1.L$2;
                        try {
                            b.b(obj);
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                            spannableStringBuilder2 = spannableStringBuilder3;
                            failure = new Result.Failure(e);
                            obj = failure;
                            spannableStringBuilder3 = spannableStringBuilder2;
                            if (!(obj instanceof Result.Failure)) {
                            }
                            a = Result.a(obj);
                            if (a != null) {
                            }
                            return zy11.a;
                        } catch (Throwable th3) {
                            th = th3;
                            spannableStringBuilder2 = spannableStringBuilder3;
                            failure = new Result.Failure(th);
                            obj = failure;
                            spannableStringBuilder3 = spannableStringBuilder2;
                            if (!(obj instanceof Result.Failure)) {
                            }
                            a = Result.a(obj);
                            if (a != null) {
                            }
                            return zy11.a;
                        }
                    }
                    if (!(obj instanceof Result.Failure)) {
                        Drawable drawable = (Drawable) obj;
                        Integer width = x7sVar2.getWidth();
                        i3f i3fVar = this.e;
                        ContextThemeWrapper contextThemeWrapper = this.h;
                        if (width != null) {
                            contextThemeWrapper.setTheme(i3fVar.a());
                            i2 = new Integer(Float.valueOf(TypedValue.applyDimension(1, width.floatValue(), contextThemeWrapper.getResources().getDisplayMetrics())).intValue()).intValue();
                        } else {
                            i2 = 0;
                        }
                        Integer height = x7sVar2.getHeight();
                        if (height != null) {
                            contextThemeWrapper.setTheme(i3fVar.a());
                            i3 = new Integer(Float.valueOf(TypedValue.applyDimension(1, height.floatValue(), contextThemeWrapper.getResources().getDisplayMetrics())).intValue()).intValue();
                        } else {
                            i3 = 0;
                        }
                        if (i2 > 0 && i3 > 0) {
                            drawable.setBounds(0, 0, i2, i3);
                        } else if (i2 > 0) {
                            drawable.setBounds(0, 0, i2, (drawable.getIntrinsicHeight() * i2) / drawable.getIntrinsicWidth());
                        } else if (i3 > 0) {
                            drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * i3) / drawable.getIntrinsicHeight(), i3);
                        } else {
                            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        }
                        String a2 = x7sVar2.a();
                        Integer h = this.d.h(a2 != null ? evu0.Q(ShimmerDivHandler.NUMBER_SING, a2) : null);
                        if (h != null) {
                            drawable.setTint(h.intValue());
                        }
                        int i7 = p8s.a[x7sVar2.c().ordinal()];
                        if (i7 != 1) {
                            i6 = 2;
                            if (i7 != 2) {
                                if (i7 != 3) {
                                    w511.b();
                                    return null;
                                }
                                i4 = 0;
                                spannableStringBuilder3.append(" ", new CustomImageSpan(drawable, i4, x7sVar2.b(), false, 8, null), 33);
                            }
                        }
                        i4 = i6;
                        spannableStringBuilder3.append(" ", new CustomImageSpan(drawable, i4, x7sVar2.b(), false, 8, null), 33);
                    }
                    a = Result.a(obj);
                    if (a != null) {
                        LogPriority logPriority = LogPriority.ERROR;
                        pgz pgzVar = this.g;
                        if (pgzVar.e(logPriority)) {
                            pgzVar.b(logPriority, "FormattedTextConverter", "appendImage error", a);
                        }
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            if (!(obj instanceof Result.Failure)) {
            }
            a = Result.a(obj);
            if (a != null) {
            }
            return zy11.a;
        } catch (CancellationException e4) {
            throw e4;
        }
        formattedTextConverter$appendImage$1 = new FormattedTextConverter$appendImage$1(this, continuationImpl);
        obj = formattedTextConverter$appendImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formattedTextConverter$appendImage$1.label;
        int i62 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc A[LOOP:2: B:31:0x00f6->B:33:0x00fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(SpannableStringBuilder spannableStringBuilder, l8s l8sVar, URLSpan uRLSpan) {
        UnderlineSpan underlineSpan;
        StrikethroughSpan strikethroughSpan;
        String f;
        URLSpan uRLSpan2;
        UpdateAppearance foregroundColorSpan;
        Iterator it;
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) l8sVar.g());
        String a = l8sVar.a();
        Integer h = this.d.h(a != null ? evu0.Q(ShimmerDivHandler.NUMBER_SING, a) : null);
        Integer c = l8sVar.c();
        AbsoluteSizeSpan absoluteSizeSpan = c != null ? new AbsoluteSizeSpan(c.intValue(), true) : null;
        int a2 = this.e.a();
        ContextThemeWrapper contextThemeWrapper = this.h;
        contextThemeWrapper.setTheme(a2);
        StyledTypefaceSpan h2 = this.f.h(contextThemeWrapper, l8sVar.e(), l8sVar.d());
        if (!l8sVar.b().isEmpty()) {
            Iterator it2 = l8sVar.b().iterator();
            while (it2.hasNext()) {
                b64.D(it2.next());
            }
        } else if (l8sVar.h().contains(FormattedText$TextDecoration.UNDERLINE)) {
            underlineSpan = new UnderlineSpan();
            if (l8sVar.b().isEmpty()) {
                Iterator it3 = l8sVar.b().iterator();
                while (it3.hasNext()) {
                    b64.D(it3.next());
                }
            } else if (l8sVar.h().contains(FormattedText$TextDecoration.LINE_THROUGH)) {
                strikethroughSpan = new StrikethroughSpan();
                f = l8sVar.f();
                if (f != null) {
                    this.b.getClass();
                    UpdateAppearance cashbackSpan = f.equals("plus") ? new CashbackSpan() : null;
                    if (cashbackSpan != null) {
                        foregroundColorSpan = cashbackSpan;
                        uRLSpan2 = uRLSpan;
                        it = ((ArrayList) j73.A(new Object[]{uRLSpan2, absoluteSizeSpan, h2, underlineSpan, strikethroughSpan, foregroundColorSpan})).iterator();
                        while (it.hasNext()) {
                            spannableStringBuilder.setSpan(it.next(), length, spannableStringBuilder.length(), 33);
                        }
                    }
                }
                uRLSpan2 = uRLSpan;
                foregroundColorSpan = h != null ? new ForegroundColorSpan(h.intValue()) : null;
                it = ((ArrayList) j73.A(new Object[]{uRLSpan2, absoluteSizeSpan, h2, underlineSpan, strikethroughSpan, foregroundColorSpan})).iterator();
                while (it.hasNext()) {
                }
            }
            strikethroughSpan = null;
            f = l8sVar.f();
            if (f != null) {
            }
            uRLSpan2 = uRLSpan;
            foregroundColorSpan = h != null ? new ForegroundColorSpan(h.intValue()) : null;
            it = ((ArrayList) j73.A(new Object[]{uRLSpan2, absoluteSizeSpan, h2, underlineSpan, strikethroughSpan, foregroundColorSpan})).iterator();
            while (it.hasNext()) {
            }
        }
        underlineSpan = null;
        if (l8sVar.b().isEmpty()) {
        }
        strikethroughSpan = null;
        f = l8sVar.f();
        if (f != null) {
        }
        uRLSpan2 = uRLSpan;
        foregroundColorSpan = h != null ? new ForegroundColorSpan(h.intValue()) : null;
        it = ((ArrayList) j73.A(new Object[]{uRLSpan2, absoluteSizeSpan, h2, underlineSpan, strikethroughSpan, foregroundColorSpan})).iterator();
        while (it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(m8s m8sVar, ContinuationImpl continuationImpl) {
        FormattedTextConverter$convert$1 formattedTextConverter$convert$1;
        int i;
        Iterator it;
        SpannableStringBuilder spannableStringBuilder;
        if (continuationImpl instanceof FormattedTextConverter$convert$1) {
            formattedTextConverter$convert$1 = (FormattedTextConverter$convert$1) continuationImpl;
            int i2 = formattedTextConverter$convert$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formattedTextConverter$convert$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formattedTextConverter$convert$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formattedTextConverter$convert$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (m8sVar.b()) {
                        return "";
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    it = ((ArrayList) m8sVar.a()).iterator();
                    spannableStringBuilder = spannableStringBuilder2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) formattedTextConverter$convert$1.L$2;
                    spannableStringBuilder = (SpannableStringBuilder) formattedTextConverter$convert$1.L$1;
                    b.b(obj);
                }
                while (it.hasNext()) {
                    h8s h8sVar = (h8s) it.next();
                    formattedTextConverter$convert$1.L$0 = null;
                    formattedTextConverter$convert$1.L$1 = spannableStringBuilder;
                    formattedTextConverter$convert$1.L$2 = it;
                    formattedTextConverter$convert$1.L$3 = null;
                    formattedTextConverter$convert$1.label = 1;
                    if (a(spannableStringBuilder, h8sVar, formattedTextConverter$convert$1) == obj2) {
                        return obj2;
                    }
                }
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
        formattedTextConverter$convert$1 = new FormattedTextConverter$convert$1(this, continuationImpl);
        Object obj3 = formattedTextConverter$convert$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formattedTextConverter$convert$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return SpannedString.valueOf(spannableStringBuilder);
    }
}
