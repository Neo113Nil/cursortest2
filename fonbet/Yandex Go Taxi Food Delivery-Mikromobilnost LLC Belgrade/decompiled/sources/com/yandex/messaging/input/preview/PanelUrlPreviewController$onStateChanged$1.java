package com.yandex.messaging.input.preview;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.messaging.core.net.entities.GetUrlPreviewResponse;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.yandex.payment.sdk.ui.view.ChallengerInputView;
import defpackage.bu0;
import defpackage.dnh;
import defpackage.er31;
import defpackage.ewh0;
import defpackage.gvg0;
import defpackage.i3y;
import defpackage.jh21;
import defpackage.kb90;
import defpackage.lb90;
import defpackage.lh21;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.nh21;
import defpackage.ny61;
import defpackage.oh21;
import defpackage.oyh0;
import defpackage.qh21;
import defpackage.sjh;
import defpackage.th21;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.xav;
import defpackage.xn50;
import defpackage.ye0;
import defpackage.yn50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.preview.PanelUrlPreviewController$onStateChanged$1", f = "PanelUrlPreviewController.kt", l = {65, 67}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PanelUrlPreviewController$onStateChanged$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelUrlPreviewController$onStateChanged$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PanelUrlPreviewController$onStateChanged$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PanelUrlPreviewController$onStateChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e5, code lost:
    
        if (r9 != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0031, code lost:
    
        if (r9 == r0) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lb90 lb90Var;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        lb90 lb90Var2 = null;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            com.yandex.messaging.internal.urlpreview.a aVar2 = aVar.b;
            th21 th21Var = new th21(aVar.f, false, null);
            this.label = 1;
            obj = aVar2.a(th21Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                lb90Var2 = (lb90) obj;
                if (lb90Var2 != null || (str = lb90Var2.a) == null) {
                    ((View) this.this$0.d.d).setVisibility(8);
                } else {
                    bu0 bu0Var = this.this$0.d;
                    bu0Var.getClass();
                    String str2 = lb90Var2.b;
                    ((TextView) bu0Var.e).setText(str);
                    ((TextView) bu0Var.f).setText(str2);
                    String str3 = lb90Var2.c;
                    ImageView imageView = (ImageView) bu0Var.i;
                    if (str3 == null) {
                        ((View) bu0Var.h).setVisibility(8);
                    } else {
                        int dimensionPixelSize = ((View) bu0Var.d).getResources().getDimensionPixelSize(gvg0.chat_input_panel_preview_size);
                        imageView.setVisibility(0);
                        yn50 yn50Var = (yn50) ((xav) ((i3y) bu0Var.c).getValue()).load(str3);
                        xn50 xn50Var = yn50Var.b;
                        xn50Var.i = dimensionPixelSize;
                        xn50Var.j = dimensionPixelSize;
                        yn50Var.b(imageView, new dnh(4, bu0Var));
                    }
                    ((View) this.this$0.d.d).setVisibility(0);
                }
                return zy11.a;
            }
            b.b(obj);
        }
        ye0 a = er31.a((GetUrlPreviewResponse) obj);
        if (a != null) {
            kb90 kb90Var = this.this$0.c;
            this.label = 2;
            kb90Var.getClass();
            if (a instanceof lh21) {
                lh21 lh21Var = (lh21) a;
                lb90Var = new lb90(lh21Var.b, lh21Var.c, lh21Var.z);
            } else if (a instanceof qh21) {
                qh21 qh21Var = (qh21) a;
                lb90Var = new lb90(qh21Var.b, qh21Var.c, qh21Var.y);
            } else if (a instanceof jh21) {
                jh21 jh21Var = (jh21) a;
                boolean b = ChatNamespaces.b(jh21Var.b);
                Resources resources = kb90Var.e;
                StringBuilder sb = new StringBuilder(resources.getString(b ? oyh0.messaging_url_preview_channel_type : oyh0.messaging_url_preview_chat_type));
                sb.append(ChallengerInputView.DEFAULT_SMS_HINT);
                Integer num = jh21Var.z;
                int intValue = num != null ? num.intValue() : 0;
                if (intValue > 0) {
                    sb.append(resources.getQuantityString(b ? ewh0.channel_subscribers_plural : ewh0.chat_members_plural, intValue, Integer.valueOf(intValue)));
                }
                obj = new lb90(sb.toString(), jh21Var.w, null);
            } else if (a instanceof nh21) {
                sjh sjhVar = uyj.a;
                obj = tje.k0(mdh.b, new PanelUrlPreviewModel$Factory$create$3((nh21) a, kb90Var, null), this);
            } else {
                if (!(a instanceof oh21)) {
                    w511.b();
                    return null;
                }
                sjh sjhVar2 = uyj.a;
                obj = tje.k0(mdh.b, new PanelUrlPreviewModel$Factory$create$5(kb90Var, (oh21) a, null), this);
            }
            obj = lb90Var;
        }
        if (lb90Var2 != null) {
        }
        ((View) this.this$0.d.d).setVisibility(8);
        return zy11.a;
    }
}
