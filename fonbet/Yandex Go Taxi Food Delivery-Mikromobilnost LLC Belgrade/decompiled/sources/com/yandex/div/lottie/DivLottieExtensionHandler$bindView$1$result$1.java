package com.yandex.div.lottie;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.airbnb.lottie.parser.moshi.c;
import com.yandex.div.core.widget.LoadableImageView;
import defpackage.cvu0;
import defpackage.etz;
import defpackage.euz;
import defpackage.evu0;
import defpackage.ftz;
import defpackage.g8e;
import defpackage.gtz;
import defpackage.hzk;
import defpackage.jci0;
import defpackage.mvg;
import defpackage.mzk;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.ssz;
import defpackage.tse;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Leuz;", "Lnsz;", "<anonymous>", "(Ltse;)Leuz;"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.lottie.DivLottieExtensionHandler$bindView$1$result$1", f = "DivLottieExtensionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DivLottieExtensionHandler$bindView$1$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ gtz $lottieData;
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivLottieExtensionHandler$bindView$1$result$1(a aVar, gtz gtzVar, View view, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$lottieData = gtzVar;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivLottieExtensionHandler$bindView$1$result$1(this.this$0, this.$lottieData, this.$view, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivLottieExtensionHandler$bindView$1$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r3.equals(com.adjust.sdk.Constants.SCHEME) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        ((defpackage.kzk) r8.b).getClass();
        r8 = defpackage.ssz.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        r1 = defpackage.osz.b.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        return new defpackage.euz(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        r7 = defpackage.upx.a(r7).b(r7, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        r8 = r7.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        if (r8 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        defpackage.osz.b.a.d(r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r3.equals("http") == false) goto L49;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        nsz nszVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        hzk hzkVar = this.this$0.c;
        gtz gtzVar = this.$lottieData;
        Context context = ((LoadableImageView) this.$view).getContext();
        if (!(gtzVar instanceof ftz)) {
            hzkVar.getClass();
            if (!(gtzVar instanceof etz)) {
                w511.b();
                return null;
            }
            JSONObject a = ((etz) gtzVar).a();
            String hexString = Integer.toHexString(a.hashCode());
            HashMap hashMap = ssz.a;
            jci0 jci0Var = new jci0(vng.H(new ByteArrayInputStream(a.toString().getBytes())));
            String[] strArr = com.airbnb.lottie.parser.moshi.a.x;
            return ssz.e(new c(jci0Var), hexString, true);
        }
        String str = ((ftz) gtzVar).a;
        mzk mzkVar = (mzk) hzkVar.a;
        String scheme = Uri.parse(str).getScheme();
        if (scheme != null) {
            switch (scheme.hashCode()) {
                case -1951681592:
                    if (scheme.equals("divkit-asset")) {
                        String Q = evu0.Q("divkit-asset://", str);
                        if (!cvu0.x(Q, "divkit/", false)) {
                            Q = "divkit/".concat(evu0.Q("/", Q));
                        }
                        HashMap hashMap2 = ssz.a;
                        return ssz.b(context, Q, "asset_".concat(Q));
                    }
                    break;
                case 112800:
                    if (scheme.equals("res")) {
                        mzkVar.getClass();
                        return new euz(new IllegalArgumentException(oyr.p("Failed to map ", str, " to internal resource")));
                    }
                    break;
                case 3213448:
                    break;
                case 93121264:
                    if (scheme.equals("asset")) {
                        mzkVar.getClass();
                        return new euz(new IllegalArgumentException(oyr.p("Failed to map ", str, " to internal resource")));
                    }
                    break;
                case 99617003:
                    break;
            }
        }
        return new euz(new IllegalArgumentException(g8e.o("Failed to retrieve lottie json from ", str)));
    }
}
