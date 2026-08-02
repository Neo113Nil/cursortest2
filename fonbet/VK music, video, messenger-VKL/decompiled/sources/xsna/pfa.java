package xsna;

import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.api.generated.catalog.dto.CatalogSectionDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.catalog.mvi.section.domain.CatalogSectionDo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: CatalogSectionScreenRepository.kt */
@b6l(c = "com.vk.catalog.mvi.section.screen.impl.data.CatalogSectionScreenRepositoryImpl$getSection$2", f = "CatalogSectionScreenRepository.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class pfa extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends cfa>>, Object> {
    final /* synthetic */ String $sectionId;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ qfa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfa(String str, qfa qfaVar, spj<? super pfa> spjVar) {
        super(2, spjVar);
        this.$sectionId = str;
        this.this$0 = qfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pfa(this.$sectionId, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends cfa>> spjVar) {
        return ((pfa) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        if (r2 == 0) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        qfa qfaVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                String str = this.$sectionId;
                qfa qfaVar2 = this.this$0;
                iz2 A = yfb.A(wga.d(new xga(), str, null, null, null, null, null, 32766));
                this.L$0 = qfaVar2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                Object p = evj.p(A, this);
                if (p == coroutineSingletons) {
                    return coroutineSingletons;
                }
                qfaVar = qfaVar2;
                obj = p;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qfaVar = (qfa) this.L$0;
                kotlin.a.a(obj);
            }
            CatalogSectionResponseObjectDto catalogSectionResponseObjectDto = (CatalogSectionResponseObjectDto) obj;
            CatalogSectionDo b = qfaVar.a.b(catalogSectionResponseObjectDto);
            CatalogSectionDto E2 = catalogSectionResponseObjectDto.E2();
            ?? r2 = 0;
            String title = E2 != null ? E2.getTitle() : null;
            if (title == null) {
                title = "";
            }
            CatalogSectionDto E22 = catalogSectionResponseObjectDto.E2();
            if (E22 != null) {
                List<CatalogButtonDto> d = E22.d();
                if (d != null) {
                    List<CatalogButtonDto> list = d;
                    r2 = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r2.add(p4a.d((CatalogButtonDto) it.next(), E22));
                    }
                }
            }
            r2 = EmptyList.b;
            obj2 = new cfa(b, title, r2);
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            return new Result(obj2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            return new Result(obj2);
        }
        return new Result(obj2);
    }
}
