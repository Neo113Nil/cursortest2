package xsna;

import com.vk.clips.internal.nps.api.InternalNpsStateHolder$NpsEventType;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestion;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestionTarget;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;
import com.vk.clips.internal.nps.api.model.QuestionType;
import com.vk.clips.internal.nps.impl.view.NpsFeatureModel;
import com.vk.dto.common.Image;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import xsna.a7f0;
import xsna.ijx;
import xsna.sjx;
import xsna.wjx;

/* compiled from: InternalNpsFeature.kt */
/* loaded from: classes16.dex */
public final class ojx extends wk50<bkx, wjx, ijx, sjx> {
    public final NpsFeatureModel f;
    public final pra g;
    public final ujx h;
    public final yjx i;
    public final Set<QuestionType> j;

    /* compiled from: InternalNpsFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuestionType.values().length];
            try {
                iArr[QuestionType.SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuestionType.MULTISELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuestionType.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QuestionType.STARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[QuestionType.MORE_LESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[QuestionType.SELECT_INLINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ojx(tjx tjxVar, NpsFeatureModel npsFeatureModel, pra praVar, ljx ljxVar, yjx yjxVar) {
        super(new ijx.b(npsFeatureModel), tjxVar);
        this.f = npsFeatureModel;
        this.g = praVar;
        this.h = ljxVar;
        this.i = yjxVar;
        this.j = rl3.y0(new QuestionType[]{QuestionType.MORE_LESS, QuestionType.STARS});
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[LOOP:0: B:61:0x014a->B:70:?, LOOP_END, SYNTHETIC] */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(wjx wjxVar, ijx ijxVar) {
        boolean b;
        Pair pair;
        wjx wjxVar2 = wjxVar;
        ijx ijxVar2 = ijxVar;
        boolean z = ijxVar2 instanceof ijx.b;
        Set<QuestionType> set = this.j;
        if (z) {
            ijx.b bVar = (ijx.b) ijxVar2;
            if (epx.f(wjxVar2, wjx.c.b)) {
                NpsFeatureModel npsFeatureModel = bVar.b;
                InternalNpsQuestions internalNpsQuestions = npsFeatureModel.d;
                String str = internalNpsQuestions.c;
                String str2 = npsFeatureModel.b;
                Image image = npsFeatureModel.c;
                InternalNpsQuestion internalNpsQuestion = internalNpsQuestions.d.get(str);
                if (internalNpsQuestion == null) {
                    com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Question with startQuestionCode doesn't exist"));
                    return;
                }
                try {
                    this.g.getClass();
                    T(new sjx.b(str2, image, pra.a(internalNpsQuestions), internalNpsQuestion, set.contains(internalNpsQuestion.b), internalNpsQuestions.d));
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(th);
                }
            }
        } else if (ijxVar2 instanceof ijx.c) {
            String str3 = ((ijx.c) ijxVar2).b;
            if (wjxVar2 instanceof wjx.a) {
                wjx.a aVar = (wjx.a) wjxVar2;
                InternalNpsQuestion internalNpsQuestion2 = aVar.g;
                switch (a.$EnumSwitchMapping$0[internalNpsQuestion2.b.ordinal()]) {
                    case 1:
                        pair = new Pair(Boolean.TRUE, Collections.singleton(str3));
                        break;
                    case 2:
                        Set<String> set2 = aVar.i.get(internalNpsQuestion2.c);
                        Set R0 = set2 != null ? j5g.R0(set2) : new LinkedHashSet();
                        if (!R0.add(str3)) {
                            R0.remove(str3);
                        }
                        pair = new Pair(Boolean.valueOf(!R0.isEmpty()), R0);
                        break;
                    case 3:
                        if (str3.length() != 0) {
                            pair = new Pair(Boolean.TRUE, Collections.singleton(str3));
                            break;
                        } else {
                            pair = new Pair(Boolean.FALSE, EmptySet.b);
                            break;
                        }
                    case 4:
                        pair = new Pair(Boolean.TRUE, Collections.singleton(str3));
                        break;
                    case 5:
                        pair = new Pair(Boolean.TRUE, Collections.singleton(str3));
                        break;
                    case 6:
                        pair = new Pair(Boolean.FALSE, EmptySet.b);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                T(new sjx.a((Set) pair.g(), ((Boolean) pair.d()).booleanValue()));
            }
        } else {
            if (!(ijxVar2 instanceof ijx.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (wjxVar2 instanceof wjx.a) {
                wjx.a aVar2 = (wjx.a) wjxVar2;
                Map<String, Set<String>> map = aVar2.i;
                if (aVar2.f) {
                    InternalNpsQuestion internalNpsQuestion3 = aVar2.g;
                    List<InternalNpsQuestionTarget> list = internalNpsQuestion3.f;
                    InternalNpsQuestion internalNpsQuestion4 = null;
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        Set<String> set3 = map.get(internalNpsQuestion3.c);
                        if (set3 == null) {
                            set3 = EmptySet.b;
                        }
                        Iterator<InternalNpsQuestionTarget> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                InternalNpsQuestionTarget next = it.next();
                                QuestionType questionType = internalNpsQuestion3.b;
                                List<String> list2 = next.c;
                                if (!list2.isEmpty()) {
                                    switch (a.$EnumSwitchMapping$0[questionType.ordinal()]) {
                                        case 1:
                                            b = p4g.b(set3, list2);
                                            break;
                                        case 2:
                                            b = epx.f(set3, j5g.S0(list2));
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            b = p4g.b(set3, list2);
                                            break;
                                        case 5:
                                            b = p4g.b(set3, list2);
                                            break;
                                        case 6:
                                            b = false;
                                            break;
                                        default:
                                            throw new NoWhenBranchMatchedException();
                                    }
                                    if (!b) {
                                        internalNpsQuestion4 = aVar2.j.get(next.b);
                                    }
                                }
                                b = true;
                                if (!b) {
                                }
                            }
                        }
                    }
                    if (internalNpsQuestion4 != null) {
                        T(new sjx.c(set.contains(internalNpsQuestion4.b), aVar2.e + 1, internalNpsQuestion4));
                        return;
                    }
                    T(sjx.d.b);
                    io.reactivex.rxjava3.internal.operators.completable.a0 r = io.reactivex.rxjava3.core.a.r(1300L, TimeUnit.MILLISECONDS);
                    io.reactivex.rxjava3.disposables.c subscribe = r.g(new g57(this, 5)).subscribe();
                    this.e.b(subscribe);
                    a7f0.a.d(this, io.reactivex.rxjava3.core.a.m(e43.l(this.h.a(this.f.b, map).g(new f3a(subscribe, 2)), r)), null, null, new dgm(this, 15), 3);
                }
            }
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.i.a.onNext(new xjx(this.f.d.b, InternalNpsStateHolder$NpsEventType.CLOSED));
    }
}
