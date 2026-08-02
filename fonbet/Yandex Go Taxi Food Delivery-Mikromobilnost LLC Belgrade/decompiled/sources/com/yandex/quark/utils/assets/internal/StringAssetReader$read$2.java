package com.yandex.quark.utils.assets.internal;

import defpackage.cma1;
import defpackage.g8e;
import defpackage.jyj0;
import defpackage.k93;
import defpackage.lyj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uza;
import defpackage.wls;
import defpackage.zy11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lsyj0;", "", "Lk93;", "<anonymous>", "(Ltse;)Lsyj0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.utils.assets.internal.StringAssetReader$read$2", f = "StringAssetReader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class StringAssetReader$read$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $assetName;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringAssetReader$read$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$assetName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StringAssetReader$read$2(this.this$0, this.$assetName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StringAssetReader$read$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            InputStream open = this.this$0.a.getAssets().open(this.$assetName);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, uza.a), 8192);
                try {
                    String x0 = cma1.x0(bufferedReader);
                    bufferedReader.close();
                    open.close();
                    return new lyj0(x0);
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            return new jyj0(new k93(g8e.o("Failed to read asset: ", this.$assetName), e));
        }
    }
}
