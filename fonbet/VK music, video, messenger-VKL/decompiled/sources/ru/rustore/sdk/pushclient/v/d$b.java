package ru.rustore.sdk.pushclient.v;

import android.graphics.Bitmap;
import com.vk.push.core.data.imageloader.ImageDownloader;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bpy0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.notification.NotificationController$downloadImage$2", f = "NotificationController.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class d$b extends SuspendLambda implements wzs<yvj, spj<? super Bitmap>, Object> {
    public int a;
    public final /* synthetic */ bpy0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d$b(bpy0 bpy0Var, String str, spj<? super d$b> spjVar) {
        super(2, spjVar);
        this.b = bpy0Var;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new d$b(this.b, this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Bitmap> spjVar) {
        return new d$b(this.b, this.c, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            return obj;
        }
        a.a(obj);
        ImageDownloader imageDownloader = this.b.e;
        String str = this.c;
        this.a = 1;
        Object download = imageDownloader.download(str, this);
        return download == coroutineSingletons ? coroutineSingletons : download;
    }
}
