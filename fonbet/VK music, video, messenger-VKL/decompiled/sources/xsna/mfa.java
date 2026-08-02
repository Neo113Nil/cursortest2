package xsna;

import com.vk.catalog.mvi.section.api.CatalogSectionParams;
import com.vk.catalog.mvi.section.screen.impl.ui.entity.CatalogSectionScreenState;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import io.requery.android.database.sqlite.SQLiteStatementType;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.el50;

/* compiled from: CatalogSectionScreenInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.section.screen.impl.ui.store.CatalogSectionScreenInlineActor$loadSectionInfo$1", f = "CatalogSectionScreenInlineActor.kt", l = {SQLiteStatementType.STATEMENT_OTHER}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class mfa extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ kfa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfa(kfa kfaVar, spj<? super mfa> spjVar) {
        super(2, spjVar);
        this.this$0 = kfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        mfa mfaVar = new mfa(this.this$0, spjVar);
        mfaVar.L$0 = obj;
        return mfaVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mfa) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            kfa kfaVar = this.this$0;
            k60 k60Var = new k60(9);
            kfaVar.getClass();
            el50.a.b(kfaVar, k60Var);
            CatalogSectionState catalogSectionState = ((CatalogSectionScreenState) this.this$0.b.getCurrentState()).b;
            if (catalogSectionState != null) {
                kfa kfaVar2 = this.this$0;
                mm50<CatalogSectionState, yda, bea> b = kfaVar2.d.b(new CatalogSectionParams(kfaVar2.c.c, false, false, false, false, null, 60, null), null, new z4(catalogSectionState, 17));
                kfa kfaVar3 = this.this$0;
                iz izVar = new iz(b, 10);
                kfaVar3.getClass();
                el50.a.b(kfaVar3, izVar);
                kfa.m(this.this$0, b, yvjVar);
                return s3q0.a;
            }
            kfa kfaVar4 = this.this$0;
            qfa qfaVar = kfaVar4.e;
            String str = kfaVar4.c.c;
            this.L$0 = yvjVar;
            this.L$1 = null;
            this.label = 1;
            a = qfaVar.a(str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
        }
        kfa kfaVar5 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            cfa cfaVar = (cfa) a;
            mm50<CatalogSectionState, yda, bea> b2 = kfaVar5.d.b(new CatalogSectionParams(cfaVar.a.b, false, false, false, false, null, 60, null), null, new defpackage.e(cfaVar, 14));
            el50.a.b(kfaVar5, new lfa(0, cfaVar, b2));
            kfa.m(kfaVar5, b2, yvjVar);
        }
        kfa kfaVar6 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            com.vk.movika.sdk.base.observable.q qVar = new com.vk.movika.sdk.base.observable.q(a2, 14);
            kfaVar6.getClass();
            el50.a.b(kfaVar6, qVar);
        }
        return s3q0.a;
    }
}
