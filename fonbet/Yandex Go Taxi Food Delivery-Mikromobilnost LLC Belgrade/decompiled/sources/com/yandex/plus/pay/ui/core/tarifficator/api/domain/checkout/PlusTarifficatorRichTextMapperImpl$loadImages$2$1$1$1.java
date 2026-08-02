package com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout;

import com.yandex.plus.log.api.LogPriority;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Pair;", "", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.PlusTarifficatorRichTextMapperImpl$loadImages$2$1$1$1", f = "PlusTarifficatorRichTextMapperImpl.kt", l = {209}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusTarifficatorRichTextMapperImpl$loadImages$2$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusTarifficatorRichTextMapperImpl$loadImages$2$1$1$1(String str, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$url = str;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlusTarifficatorRichTextMapperImpl$loadImages$2$1$1$1 plusTarifficatorRichTextMapperImpl$loadImages$2$1$1$1 = new PlusTarifficatorRichTextMapperImpl$loadImages$2$1$1$1(this.$url, this.this$0, continuation);
        plusTarifficatorRichTextMapperImpl$loadImages$2$1$1$1.L$0 = obj;
        return plusTarifficatorRichTextMapperImpl$loadImages$2$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusTarifficatorRichTextMapperImpl$loadImages$2$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Throwable th;
        TimeoutCancellationException e;
        Object c;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$4;
                try {
                    b.b(obj);
                } catch (TimeoutCancellationException e2) {
                    e = e2;
                    c = new Result.Failure(e);
                    obj = c;
                    a aVar = this.this$0;
                    String str2 = this.$url;
                    a = Result.a(obj);
                    if (a != null) {
                    }
                    return new Pair(str, obj instanceof Result.Failure ? null : obj);
                } catch (Throwable th2) {
                    th = th2;
                    c = new Result.Failure(th);
                    obj = c;
                    a aVar2 = this.this$0;
                    String str22 = this.$url;
                    a = Result.a(obj);
                    if (a != null) {
                    }
                    return new Pair(str, obj instanceof Result.Failure ? null : obj);
                }
                a aVar22 = this.this$0;
                String str222 = this.$url;
                a = Result.a(obj);
                if (a != null) {
                    pgz pgzVar = aVar22.d;
                    LogPriority logPriority = LogPriority.ERROR;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.b(logPriority, "RichTextMapperImpl", g8e.o("Failed to load image: ", str222), a);
                    }
                }
                return new Pair(str, obj instanceof Result.Failure ? null : obj);
            }
            b.b(obj);
            String str3 = this.$url;
            try {
                com.yandex.plus.glide.a b = ((com.yandex.plus.glide.b) this.this$0.c).b(str3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = str3;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                c = b.c(this);
            } catch (TimeoutCancellationException e3) {
                str = str3;
                e = e3;
                c = new Result.Failure(e);
                obj = c;
                a aVar222 = this.this$0;
                String str2222 = this.$url;
                a = Result.a(obj);
                if (a != null) {
                }
                return new Pair(str, obj instanceof Result.Failure ? null : obj);
            } catch (Throwable th3) {
                str = str3;
                th = th3;
                c = new Result.Failure(th);
                obj = c;
                a aVar2222 = this.this$0;
                String str22222 = this.$url;
                a = Result.a(obj);
                if (a != null) {
                }
                return new Pair(str, obj instanceof Result.Failure ? null : obj);
            }
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str3;
            obj = c;
            a aVar22222 = this.this$0;
            String str222222 = this.$url;
            a = Result.a(obj);
            if (a != null) {
            }
            return new Pair(str, obj instanceof Result.Failure ? null : obj);
        } catch (CancellationException e4) {
            throw e4;
        }
    }
}
