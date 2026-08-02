package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.epx;

/* compiled from: MembersScreen.kt */
@b6l(c = "com.vk.profile.community.members.impl.ui.MembersScreenKt$TrackingEffect$1$1", f = "MembersScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class i220 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ xvy $listState;
    final /* synthetic */ izs<List<String>, s3q0> $onTrackedChange;
    final /* synthetic */ List $trackingKeys;
    final /* synthetic */ float $visibilityPercent;
    final /* synthetic */ mtk0<List<xuy>> $visibleTrackableItems$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: MembersScreen.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<List<? extends String>, spj<? super s3q0>, Object> {
        @Override // xsna.wzs
        public final Object invoke(List<? extends String> list, spj<? super s3q0> spjVar) {
            ((izs) this.receiver).invoke(list);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i220(izs izsVar, List list, mtk0 mtk0Var, xvy xvyVar, float f, spj spjVar) {
        super(2, spjVar);
        this.$onTrackedChange = izsVar;
        this.$trackingKeys = list;
        this.$visibleTrackableItems$delegate = mtk0Var;
        this.$listState = xvyVar;
        this.$visibilityPercent = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        i220 i220Var = new i220(this.$onTrackedChange, this.$trackingKeys, this.$visibleTrackableItems$delegate, this.$listState, this.$visibilityPercent, spjVar);
        i220Var.L$0 = obj;
        return i220Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((i220) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        final List list = this.$trackingKeys;
        final mtk0<List<xuy>> mtk0Var = this.$visibleTrackableItems$delegate;
        final xvy xvyVar = this.$listState;
        final float f = this.$visibilityPercent;
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(rsr.l(nr2.M(new gzs() { // from class: xsna.h220
            @Override // xsna.gzs
            public final Object invoke() {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    String str = (String) obj2;
                    List list2 = (List) mtk0Var.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        xuy xuyVar = (xuy) obj3;
                        xvy xvyVar2 = xvyVar;
                        float max = 100.0f - (((Math.max(0, (xuyVar.getSize() + xuyVar.getOffset()) - xvyVar2.j().h()) + Math.max(0, xvyVar2.j().g() - xuyVar.getOffset())) * 100.0f) / xuyVar.getSize());
                        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT >= max) {
                            max = 0.0f;
                        }
                        if (max > f) {
                            arrayList2.add(obj3);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (epx.f(((xuy) it.next()).getKey(), str)) {
                                arrayList.add(obj2);
                                break;
                            }
                        }
                    }
                }
                return arrayList;
            }
        })), new a(2, this.$onTrackedChange, epx.a.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)), yvjVar);
        return s3q0.a;
    }
}
