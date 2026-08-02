package com.yandex.div.svg;

import android.graphics.drawable.PictureDrawable;
import com.caverock.androidsvg.l;
import com.caverock.androidsvg.q;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import defpackage.dac;
import defpackage.evu0;
import defpackage.kvj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rvj0;
import defpackage.rzo;
import defpackage.tse;
import defpackage.wls;
import defpackage.yci0;
import defpackage.yf7;
import defpackage.zy11;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/PictureDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/PictureDrawable;"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1$1", f = "SvgDivImageLoader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SvgDivImageLoader$loadImage$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yf7 $call;
    final /* synthetic */ String $imageUrl;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SvgDivImageLoader$loadImage$2$1$1(yf7 yf7Var, a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$call = yf7Var;
        this.this$0 = aVar;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SvgDivImageLoader$loadImage$2$1$1(this.$call, this.this$0, this.$imageUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SvgDivImageLoader$loadImage$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r5 == null) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte[] R;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        yf7 yf7Var = this.$call;
        if (yf7Var != null) {
            this.this$0.getClass();
            kvj0 execute = yf7Var.execute();
            if (!execute.J) {
                yci0.s(execute.w, "Server response code ");
                return null;
            }
            rvj0 rvj0Var = execute.z;
            if (rvj0Var == null) {
                ny61.v("No response body received");
                return null;
            }
            R = rvj0Var.bytes();
        }
        a aVar = this.this$0;
        String str = this.$imageUrl;
        aVar.getClass();
        try {
            InputStream open = aVar.a.getAssets().open(evu0.Q(Util.ANDROID_ASSET_URL, str));
            try {
                R = rzo.R(open);
                open.close();
                l f = new q().f(new ByteArrayInputStream(R));
                if (f.c() != null) {
                    return new PictureDrawable(f.g(null));
                }
                float d = f.d();
                float b = f.b();
                if (d > 0.0f && b > 0.0f) {
                    f.i(d, b);
                }
                return new PictureDrawable(f.g(null));
            } finally {
            }
        } catch (IOException e) {
            dac.g("File not found", e);
            return null;
        }
    }
}
