package com.yandex.quark.webchat.feature.delegate;

import android.net.Uri;
import com.yandex.quark.contracts.theme.ThemeMode;
import com.yandex.quark.webchat.e;
import com.yandex.quark.webchat.js.WebDataFormat;
import com.yandex.quark.webchat.params.WebChatParams;
import defpackage.bms;
import defpackage.hd41;
import defpackage.le41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qd41;
import defpackage.uru;
import defpackage.w511;
import defpackage.wc41;
import defpackage.zc41;
import defpackage.zcx;
import defpackage.zoc;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "dynamicParams", "Luru;", "webHost", "Lcom/yandex/quark/contracts/theme/ThemeMode;", "themeMode", "Lle41;", "<anonymous>", "(Ljava/util/List;Luru;Lcom/yandex/quark/contracts/theme/ThemeMode;)Lle41;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.feature.delegate.WebChatFeatureDelegate$authorizationSynchronizer$2", f = "WebChatFeatureDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class WebChatFeatureDelegate$authorizationSynchronizer$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatFeatureDelegate$authorizationSynchronizer$2(b bVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        WebChatFeatureDelegate$authorizationSynchronizer$2 webChatFeatureDelegate$authorizationSynchronizer$2 = new WebChatFeatureDelegate$authorizationSynchronizer$2(this.this$0, (Continuation) obj4);
        webChatFeatureDelegate$authorizationSynchronizer$2.L$0 = (List) obj;
        webChatFeatureDelegate$authorizationSynchronizer$2.L$1 = (uru) obj2;
        webChatFeatureDelegate$authorizationSynchronizer$2.L$2 = (ThemeMode) obj3;
        return webChatFeatureDelegate$authorizationSynchronizer$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = (List) this.L$0;
        uru uruVar = (uru) this.L$1;
        ThemeMode themeMode = (ThemeMode) this.L$2;
        zcx zcxVar = e.a;
        Uri parse = Uri.parse(this.this$0.i);
        if (!uruVar.equals(uru.a)) {
            w511.b();
            return null;
        }
        b bVar = this.this$0;
        zc41 zc41Var = bVar.c;
        WebChatParams webChatParams = bVar.g;
        qd41 qd41Var = zc41Var.c;
        wc41 wc41Var = bVar.a;
        zoc zocVar = wc41Var.a;
        if (zocVar == null || (str = zocVar.a) == null) {
            wc41.a();
            throw null;
        }
        webChatParams.getClass();
        SetBuilder setBuilder = new SetBuilder();
        WebChatParams.DialogSessionMode dialogSessionMode = webChatParams.f;
        int[] iArr = hd41.a;
        int i2 = iArr[dialogSessionMode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
            }
            webChatParams.h.getClass();
            i = iArr[webChatParams.f.ordinal()];
            if (i != 1) {
                setBuilder.add("AliceProCapability");
            } else if (i != 2 && i != 3) {
                w511.b();
                return null;
            }
            setBuilder.addAll(webChatParams.j);
            return new le41(e.a(parse, qd41Var, wc41Var, str, themeMode, list, this.this$0.g.f, setBuilder.b(), WebDataFormat.JSON));
        }
        setBuilder.add("AliceCapability");
        webChatParams.h.getClass();
        i = iArr[webChatParams.f.ordinal()];
        if (i != 1) {
        }
        setBuilder.addAll(webChatParams.j);
        return new le41(e.a(parse, qd41Var, wc41Var, str, themeMode, list, this.this$0.g.f, setBuilder.b(), WebDataFormat.JSON));
    }
}
