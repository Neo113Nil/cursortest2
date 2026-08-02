package com.ybsdk.feature.qr.internal.data;

import android.net.Uri;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.qr.api.data.resolve.ResolveQrResponseDto;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.usj0;
import defpackage.w691;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/qr/api/data/resolve/ResolveQrResponseDto;", Constants.KEY_DATA, "Lusj0;", "<anonymous>", "(Lcom/ybsdk/feature/qr/api/data/resolve/ResolveQrResponseDto;)Lusj0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.internal.data.ResolveQrRepository$resolveQr$3$1", f = "ResolveQrRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ResolveQrRepository$resolveQr$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $qr;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveQrRepository$resolveQr$3$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$qr = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ResolveQrRepository$resolveQr$3$1 resolveQrRepository$resolveQr$3$1 = new ResolveQrRepository$resolveQr$3$1(this.this$0, this.$qr, continuation);
        resolveQrRepository$resolveQr$3$1.L$0 = obj;
        return resolveQrRepository$resolveQr$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ResolveQrRepository$resolveQr$3$1) create((ResolveQrResponseDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ResolveQrResponseDto resolveQrResponseDto = (ResolveQrResponseDto) this.L$0;
        a aVar = this.this$0;
        String str = this.$qr;
        aVar.getClass();
        List<String> deeplinks = resolveQrResponseDto.getDeeplinks();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = deeplinks.iterator();
        while (it.hasNext()) {
            Deeplink e = w691.e(aVar.b, Uri.parse((String) it.next()), true, null, true, 4);
            if (e != null) {
                arrayList.add(e);
            }
        }
        return new usj0(arrayList, resolveQrResponseDto.getQrType(), jl40.l(resolveQrResponseDto.getQrType(), "pay_offline") ? (String) kotlin.collections.a.R(Uri.parse(str).getPathSegments()) : null);
    }
}
