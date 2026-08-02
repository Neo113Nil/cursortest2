package defpackage;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.semantics.f;
import com.yandex.payment.divkit.challenger.DKChallengerFragment;
import com.yandex.payment.sdk.core.data.SbpChallengeResultInfo$SbpChallengeStatus;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import retrofit2.Response;

/* loaded from: classes10.dex */
public final /* synthetic */ class h12 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref$ObjectRef b;

    public /* synthetic */ h12(int i, Ref$ObjectRef ref$ObjectRef) {
        this.a = i;
        this.b = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, k12] */
    /* JADX WARN: Type inference failed for: r13v14, types: [T, wrs0] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onViewCreated$lambda$1;
        T t;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Ref$ObjectRef ref$ObjectRef = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                k12 k12Var = k12.w;
                List<i12> list2 = list;
                int i2 = 0;
                int i3 = 0;
                for (i12 i12Var : list2) {
                    d6w d6wVar = i12Var.a;
                    i3 += ((d6wVar.b - d6wVar.a) + 1) - i12Var.b.size();
                }
                Iterator it = list2.iterator();
                if (!it.hasNext()) {
                    ny61.p();
                    return null;
                }
                int i4 = ((i12) it.next()).a.a;
                while (it.hasNext()) {
                    int i5 = ((i12) it.next()).a.a;
                    if (i4 > i5) {
                        i4 = i5;
                    }
                }
                Iterator it2 = list2.iterator();
                if (!it2.hasNext()) {
                    ny61.p();
                    return null;
                }
                int i6 = ((i12) it2.next()).a.b;
                while (it2.hasNext()) {
                    int i7 = ((i12) it2.next()).a.b;
                    if (i6 < i7) {
                        i6 = i7;
                    }
                }
                d6w d6wVar2 = new d6w(i4, i6, 1);
                if (!(d6wVar2 instanceof Collection) || !((Collection) d6wVar2).isEmpty()) {
                    c6w it3 = d6wVar2.iterator();
                    int i8 = 0;
                    while (it3.c) {
                        int nextInt = it3.nextInt();
                        Iterator it4 = list2.iterator();
                        int i9 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((i12) it4.next()).a.g(nextInt)) {
                                i9++;
                            }
                            if (i9 > 1) {
                                i8++;
                                if (i8 < 0) {
                                    scc.l();
                                    throw null;
                                }
                            }
                        }
                    }
                    i2 = i8;
                }
                ?? k12Var2 = new k12(i3, i2, list);
                k12 k12Var3 = (k12) ref$ObjectRef.element;
                int q = jl40.q(i2, k12Var3.c);
                if (q == 0) {
                    q = jl40.q(i3, k12Var3.b);
                }
                if (q < 0) {
                    ref$ObjectRef.element = k12Var2;
                }
                return zy11Var;
            case 1:
                onViewCreated$lambda$1 = DKChallengerFragment.onViewCreated$lambda$1(ref$ObjectRef, (SbpChallengeResultInfo$SbpChallengeStatus) obj);
                return onViewCreated$lambda$1;
            case 2:
                f.l((mnq0) obj, (String) ref$ObjectRef.element);
                return zy11Var;
            case 3:
                Response response = (Response) obj;
                ref$ObjectRef.element = response != null ? response.a.y.a(yu50.d) : 0;
                return zy11Var;
            case 4:
                c6y c6yVar = ((fd11) ((dd11) obj)).a;
                List list3 = (List) ref$ObjectRef.element;
                if (list3 != null) {
                    list3.add(c6yVar);
                    t = list3;
                } else {
                    t = scc.i(c6yVar);
                }
                ref$ObjectRef.element = t;
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            default:
                ref$ObjectRef.element = (wrs0) obj;
                return zy11Var;
        }
    }
}
