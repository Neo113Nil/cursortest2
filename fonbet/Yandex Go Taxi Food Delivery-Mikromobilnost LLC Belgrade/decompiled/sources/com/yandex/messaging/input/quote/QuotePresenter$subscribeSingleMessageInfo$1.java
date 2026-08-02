package com.yandex.messaging.input.quote;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.PollMessageData;
import defpackage.act;
import defpackage.gvg0;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.nlg0;
import defpackage.ny61;
import defpackage.olg0;
import defpackage.q0k;
import defpackage.qlg0;
import defpackage.qp3;
import defpackage.r100;
import defpackage.rlg0;
import defpackage.smt0;
import defpackage.tmt0;
import defpackage.v3k0;
import defpackage.vfc0;
import defpackage.wlg0;
import defpackage.xv10;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zyj;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "lang", "Lact;", "quoteData", "Lzy11;", "<anonymous>", "(Ljava/lang/String;Lact;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.quote.QuotePresenter$subscribeSingleMessageInfo$1", f = "QuotePresenter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class QuotePresenter$subscribeSingleMessageInfo$1 extends SuspendLambda implements zls {
    final /* synthetic */ boolean $needInputFocusRequest;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuotePresenter$subscribeSingleMessageInfo$1(a aVar, boolean z, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$needInputFocusRequest = z;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        QuotePresenter$subscribeSingleMessageInfo$1 quotePresenter$subscribeSingleMessageInfo$1 = new QuotePresenter$subscribeSingleMessageInfo$1(this.this$0, this.$needInputFocusRequest, (Continuation) obj3);
        quotePresenter$subscribeSingleMessageInfo$1.L$0 = (String) obj;
        quotePresenter$subscribeSingleMessageInfo$1.L$1 = (act) obj2;
        zy11 zy11Var = zy11.a;
        quotePresenter$subscribeSingleMessageInfo$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x010c, code lost:
    
        if (r16 == null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        QuotePresenter$QuoteType quotePresenter$QuoteType;
        String str;
        String str2;
        String str3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        String str4 = (String) this.L$0;
        act actVar = (act) this.L$1;
        a aVar = this.this$0;
        boolean z = str4 != null;
        boolean z2 = this.$needInputFocusRequest;
        wlg0 wlg0Var = aVar.b;
        qp3 qp3Var = aVar.F;
        tmt0 tmt0Var = aVar.y;
        if (actVar == null) {
            aVar.D = null;
            aVar.g(null, true);
            aVar.b();
        } else {
            MessageData messageData = actVar.a;
            String str5 = actVar.b;
            olg0 olg0Var = new olg0(aVar.a.getResources(), str5);
            boolean z3 = messageData instanceof MediaMessageData;
            r100 r100Var = tmt0.e;
            if (z3) {
                xv10 xv10Var = aVar.D;
                boolean z4 = (xv10Var != null ? (QuotePresenter$QuoteType) xv10Var.c : null) == QuotePresenter$QuoteType.QUOTE;
                String str6 = xv10Var != null ? (String) xv10Var.w : null;
                rlg0 rlg0Var = (rlg0) ((MediaMessageData) messageData).a(olg0Var);
                if (z4 && str6 != null && (rlg0Var instanceof nlg0)) {
                    String str7 = rlg0Var.a;
                    nlg0 nlg0Var = (nlg0) rlg0Var;
                    nlg0 nlg0Var2 = new nlg0(str7, str6, nlg0Var.d, true, nlg0Var.e);
                    str3 = str6;
                    rlg0Var = nlg0Var2;
                } else {
                    str3 = str6;
                }
                aVar.g(rlg0Var, z2);
                if (z4 && str3 != null && (messageData instanceof GalleryMessageData)) {
                    wlg0Var.h.setText(((v3k0) wlg0Var.e).b(2, new SpannableStringBuilder(str3)), TextView.BufferType.EDITABLE);
                }
                if (messageData instanceof GalleryMessageData) {
                    if (aVar.d() != null) {
                        aVar.d().close();
                    }
                    smt0 a = tmt0.a(tmt0Var, wlg0Var.h.getEditableText(), r100Var, aVar);
                    kgx kgxVar = a.I[1];
                    qp3Var.b(a);
                }
            } else if (messageData instanceof PollMessageData) {
                aVar.g(new qlg0(str5, ((PollMessageData) messageData).title, false), z2);
            } else {
                xv10 xv10Var2 = aVar.D;
                if (xv10Var2 != null) {
                    quotePresenter$QuoteType = (QuotePresenter$QuoteType) xv10Var2.c;
                    str = null;
                } else {
                    quotePresenter$QuoteType = null;
                    str = null;
                }
                boolean z5 = quotePresenter$QuoteType == QuotePresenter$QuoteType.QUOTE;
                if (!z5) {
                    String str8 = actVar.c;
                    if (str8 != null) {
                        if (z) {
                            str = str8;
                        }
                    }
                    str = messageData.text;
                } else if (xv10Var2 != null) {
                    str2 = (String) xv10Var2.w;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                    aVar.g(new rlg0(str5, str2, z5), z2);
                    if (z5) {
                        wlg0Var.b(spannableStringBuilder);
                    } else {
                        wlg0Var.h.setText(((v3k0) wlg0Var.e).b(2, spannableStringBuilder), TextView.BufferType.EDITABLE);
                    }
                    if (aVar.d() != null) {
                        aVar.d().close();
                    }
                    smt0 a2 = tmt0.a(tmt0Var, wlg0Var.h.getEditableText(), r100Var, aVar);
                    kgx kgxVar2 = a.I[1];
                    qp3Var.b(a2);
                }
                str2 = str;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
                aVar.g(new rlg0(str5, str2, z5), z2);
                if (z5) {
                }
                if (aVar.d() != null) {
                }
                smt0 a22 = tmt0.a(tmt0Var, wlg0Var.h.getEditableText(), r100Var, aVar);
                kgx kgxVar22 = a.I[1];
                qp3Var.b(a22);
            }
            zyj b = ((q0k) aVar.w.get()).b(str5, gvg0.avatar_size_24, new vfc0(12, aVar));
            qp3 qp3Var2 = aVar.E;
            kgx kgxVar3 = a.I[0];
            qp3Var2.b(b);
        }
        return zy11.a;
    }
}
