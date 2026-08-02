package com.yandex.messaging.internal.view.chat.input.textsuggest;

import androidx.lifecycle.p;
import com.yandex.bricks.Brick;
import defpackage.h3y;
import defpackage.jqr;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oet;
import defpackage.pzt0;
import defpackage.rp3;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loet;", ConfigConstants.CONFIG, "Lzy11;", "<anonymous>", "(Loet;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.input.textsuggest.TextSuggestViewController$init$1", f = "TextSuggestViewController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TextSuggestViewController$init$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.bricks.c $textSuggestSlot;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSuggestViewController$init$1(c cVar, com.yandex.bricks.c cVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$textSuggestSlot = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TextSuggestViewController$init$1 textSuggestViewController$init$1 = new TextSuggestViewController$init$1(this.this$0, this.$textSuggestSlot, continuation);
        textSuggestViewController$init$1.L$0 = obj;
        return textSuggestViewController$init$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TextSuggestViewController$init$1 textSuggestViewController$init$1 = (TextSuggestViewController$init$1) create((oet) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        textSuggestViewController$init$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        oet oetVar = (oet) this.L$0;
        c cVar = this.this$0;
        if (oetVar != null) {
            com.yandex.bricks.c cVar2 = this.$textSuggestSlot;
            p pVar = cVar.i;
            h3y h3yVar = cVar.d;
            if (!cVar.j) {
                cVar2.a((Brick) cVar.b.get());
                cVar.j = true;
            }
            b bVar = (b) h3yVar.get();
            bVar.e = oetVar;
            r0 r0Var = bVar.b;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            pzt0 H = e.H(pVar, new jqr(((b) h3yVar.get()).d, new TextSuggestViewController$enableTextSuggestInChat$1(cVar, null), 3));
            rp3 rp3Var = cVar.k;
            kgx[] kgxVarArr = c.m;
            kgx kgxVar = kgxVarArr[0];
            rp3Var.a(H);
            pzt0 H2 = e.H(pVar, new jqr(((com.yandex.messaging.internal.view.chat.input.a) cVar.f.get()).I, new TextSuggestViewController$enableTextSuggestInChat$2(bVar, null), 3));
            rp3 rp3Var2 = cVar.l;
            kgx kgxVar2 = kgxVarArr[1];
            rp3Var2.a(H2);
        } else if (cVar.j) {
            r0 r0Var2 = ((b) cVar.d.get()).b;
            Boolean bool2 = Boolean.FALSE;
            r0Var2.getClass();
            r0Var2.m(null, bool2);
            rp3 rp3Var3 = cVar.k;
            kgx[] kgxVarArr2 = c.m;
            kgx kgxVar3 = kgxVarArr2[0];
            rp3Var3.a(null);
            rp3 rp3Var4 = cVar.l;
            kgx kgxVar4 = kgxVarArr2[1];
            rp3Var4.a(null);
        }
        return zy11.a;
    }
}
