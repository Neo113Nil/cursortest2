package com.yandex.go.shortcuts.impl.view.adapter;

import defpackage.da5;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.ListItemShortcutViewHolder$loadTitleAndSubtitle$1", f = "ListItemShortcutViewHolder.kt", l = {223, 230}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ListItemShortcutViewHolder$loadTitleAndSubtitle$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $onComplete;
    final /* synthetic */ da5 $subtitle;
    final /* synthetic */ da5 $title;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemShortcutViewHolder$loadTitleAndSubtitle$1(da5 da5Var, h hVar, da5 da5Var2, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$title = da5Var;
        this.this$0 = hVar;
        this.$subtitle = da5Var2;
        this.$onComplete = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ListItemShortcutViewHolder$loadTitleAndSubtitle$1(this.$title, this.this$0, this.$subtitle, this.$onComplete, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ListItemShortcutViewHolder$loadTitleAndSubtitle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|2|(4:(1:(13:6|7|8|9|10|11|(1:13)|14|(1:16)|17|18|19|20)(2:30|31))(4:32|33|34|35)|26|19|20)(4:57|58|59|(3:61|(1:63)|47)(4:64|65|43|(3:45|(10:48|10|11|(0)|14|(0)|17|18|19|20)|47)(5:49|50|18|19|20)))|36|37|(1:39)(1:51)|40|(1:42)|43|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        r15 = r0;
        r2 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0102 A[Catch: all -> 0x0106, CancellationException -> 0x0121, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0121, blocks: (B:8:0x0025, B:11:0x00f4, B:14:0x00fe, B:16:0x0102, B:18:0x010c, B:34:0x0054, B:37:0x00a2, B:40:0x00ad, B:42:0x00b1, B:43:0x00c6, B:45:0x00d0, B:49:0x0109, B:59:0x0071, B:61:0x007b, B:64:0x00bf), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0 A[Catch: all -> 0x00b4, CancellationException -> 0x0121, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0121, blocks: (B:8:0x0025, B:11:0x00f4, B:14:0x00fe, B:16:0x0102, B:18:0x010c, B:34:0x0054, B:37:0x00a2, B:40:0x00ad, B:42:0x00b1, B:43:0x00c6, B:45:0x00d0, B:49:0x0109, B:59:0x0071, B:61:0x007b, B:64:0x00bf), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109 A[Catch: all -> 0x00b4, CancellationException -> 0x0121, TRY_ENTER, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0121, blocks: (B:8:0x0025, B:11:0x00f4, B:14:0x00fe, B:16:0x0102, B:18:0x010c, B:34:0x0054, B:37:0x00a2, B:40:0x00ad, B:42:0x00b1, B:43:0x00c6, B:45:0x00d0, B:49:0x0109, B:59:0x0071, B:61:0x007b, B:64:0x00bf), top: B:2:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wls wlsVar;
        Throwable th;
        da5 da5Var;
        da5 da5Var2;
        CharSequence charSequence;
        wls wlsVar2;
        h hVar;
        da5 da5Var3;
        da5 da5Var4;
        Object e;
        da5 da5Var5;
        CharSequence charSequence2;
        Object obj2;
        wls wlsVar3;
        da5 da5Var6;
        wls wlsVar4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CharSequence charSequence3 = (CharSequence) this.L$5;
                    da5Var2 = (da5) this.L$4;
                    da5Var = (da5) this.L$3;
                    wlsVar4 = (wls) this.L$2;
                    wlsVar3 = (wls) this.L$1;
                    da5Var6 = (da5) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        wlsVar = wlsVar4;
                        charSequence = charSequence3;
                        obj2 = obj;
                        try {
                            charSequence2 = (CharSequence) (((CharSequence) obj2).length() > 0 ? obj2 : null);
                            if (charSequence2 == null) {
                                charSequence2 = da5Var6.a;
                            }
                            wlsVar2 = wlsVar3;
                            wlsVar2.invoke(charSequence, charSequence2);
                        } catch (Throwable th2) {
                            th = th2;
                            wlsVar4 = wlsVar;
                            wlsVar4.invoke(da5Var.a, da5Var2.a);
                            jst.e.k(th, "List item shortcut text fail loading");
                            return zy11.a;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    return zy11.a;
                }
                da5Var2 = (da5) this.L$6;
                da5 da5Var7 = (da5) this.L$5;
                wls wlsVar5 = (wls) this.L$4;
                wls wlsVar6 = (wls) this.L$3;
                da5 da5Var8 = (da5) this.L$2;
                h hVar2 = (h) this.L$1;
                da5 da5Var9 = (da5) this.L$0;
                try {
                    kotlin.b.b(obj);
                    da5Var5 = da5Var9;
                    hVar = hVar2;
                    da5Var3 = da5Var8;
                    wlsVar2 = wlsVar6;
                    wlsVar = wlsVar5;
                    da5Var4 = da5Var7;
                    e = obj;
                } catch (Throwable th4) {
                    th = th4;
                    da5Var = da5Var7;
                    wlsVar4 = wlsVar5;
                }
                wlsVar4.invoke(da5Var.a, da5Var2.a);
                jst.e.k(th, "List item shortcut text fail loading");
                return zy11.a;
            }
            kotlin.b.b(obj);
            da5 da5Var10 = this.$title;
            h hVar3 = this.this$0;
            da5 da5Var11 = this.$subtitle;
            wlsVar = this.$onComplete;
            try {
            } catch (Throwable th5) {
                th = th5;
                da5Var = da5Var10;
                da5Var2 = da5Var11;
                wlsVar4 = wlsVar;
                wlsVar4.invoke(da5Var.a, da5Var2.a);
                jst.e.k(th, "List item shortcut text fail loading");
                return zy11.a;
            }
            if (!jl40.l(da5Var10.b, FormattedText.c)) {
                ru.yandex.taxi.widget.c cVar = hVar3.T;
                FormattedText formattedText = da5Var10.b;
                this.L$0 = da5Var10;
                this.L$1 = hVar3;
                this.L$2 = da5Var11;
                this.L$3 = wlsVar;
                this.L$4 = wlsVar;
                this.L$5 = da5Var10;
                this.L$6 = da5Var11;
                this.label = 1;
                e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
                if (e != coroutineSingletons) {
                    da5Var5 = da5Var10;
                    wlsVar2 = wlsVar;
                    hVar = hVar3;
                    da5Var2 = da5Var11;
                    da5Var3 = da5Var2;
                    da5Var4 = da5Var5;
                }
                return coroutineSingletons;
            }
            charSequence = da5Var10.a;
            wlsVar2 = wlsVar;
            hVar = hVar3;
            da5Var3 = da5Var11;
            da5Var4 = da5Var10;
            da5Var2 = da5Var3;
            if (!jl40.l(da5Var3.b, FormattedText.c)) {
                charSequence2 = da5Var3.a;
                da5Var = da5Var4;
                wlsVar2.invoke(charSequence, charSequence2);
                return zy11.a;
            }
            ru.yandex.taxi.widget.c cVar2 = hVar.T;
            FormattedText formattedText2 = da5Var3.b;
            this.L$0 = da5Var3;
            this.L$1 = wlsVar2;
            this.L$2 = wlsVar;
            this.L$3 = da5Var4;
            this.L$4 = da5Var2;
            this.L$5 = charSequence;
            this.L$6 = null;
            this.label = 2;
            Object e2 = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, this, 30);
            if (e2 != coroutineSingletons) {
                obj2 = e2;
                da5Var = da5Var4;
                wlsVar3 = wlsVar2;
                da5Var6 = da5Var3;
                charSequence2 = (CharSequence) (((CharSequence) obj2).length() > 0 ? obj2 : null);
                if (charSequence2 == null) {
                }
                wlsVar2 = wlsVar3;
                wlsVar2.invoke(charSequence, charSequence2);
                return zy11.a;
            }
            return coroutineSingletons;
            if (((CharSequence) e).length() <= 0) {
                e = null;
            }
            charSequence = (CharSequence) e;
            if (charSequence == null) {
                charSequence = da5Var5.a;
            }
            if (!jl40.l(da5Var3.b, FormattedText.c)) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
