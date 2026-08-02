package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireAnswerDto;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestion;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestionTarget;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.internal.api.GsonHolder;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a7f0;
import xsna.n0x;
import xsna.q4r;
import xsna.qvq;
import xsna.wk50;

/* compiled from: FeedInternalNpsActionDelegate.kt */
/* loaded from: classes17.dex */
public final class x0r implements oj50<q4r, qvq, c2r> {
    public static final /* synthetic */ qcy<Object>[] e = {new MutablePropertyReference1Impl(x0r.class, "sendResultDisposable", "getSendResultDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0), p5j.a(0, x0r.class, "sendResultLoadingSubjectDisposable", "getSendResultLoadingSubjectDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", fpf0.a)};
    public final vjx a;
    public final m0x b;
    public final d80 c = new d80();
    public final d80 d = new d80();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FeedInternalNpsActionDelegate.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Error;
        public static final a Loading;
        public static final a Success;

        static {
            a aVar = new a("Loading", 0);
            Loading = aVar;
            a aVar2 = new a("Success", 1);
            Success = aVar2;
            a aVar3 = new a("Error", 2);
            Error = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: FeedInternalNpsActionDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Success.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.Error.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public x0r(vjx vjxVar, m0x m0xVar) {
        this.a = vjxVar;
        this.b = m0xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        Object obj;
        Object obj2;
        ?? r27;
        Object obj3;
        io.reactivex.rxjava3.core.a aVar2;
        q4r q4rVar = (q4r) km50Var;
        qvq qvqVar = (qvq) kj50Var;
        if ((qvqVar instanceof qvq.g) && (q4rVar instanceof q4r.a)) {
            qvq.g gVar = (qvq.g) qvqVar;
            boolean z = gVar instanceof qvq.g.b;
            d80 d80Var = this.d;
            boolean z2 = false;
            qcy<Object>[] qcyVarArr = e;
            d80 d80Var2 = this.c;
            if (!z) {
                if (!(gVar instanceof qvq.g.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                qcy<Object> qcyVar = qcyVarArr[0];
                d80Var2.g(null);
                qcy<Object> qcyVar2 = qcyVarArr[1];
                d80Var.g(null);
                aVar.a(qvq.j.c.b);
                return;
            }
            q4r.a aVar3 = (q4r.a) q4rVar;
            qvq.g.b bVar = (qvq.g.b) qvqVar;
            if (!(bVar instanceof qvq.g.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            qvq.g.b.a aVar4 = (qvq.g.b.a) bVar;
            String str = aVar4.b;
            qcy<Object> qcyVar3 = qcyVarArr[0];
            io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) d80Var2.b;
            if (cVar == null || cVar.h()) {
                m0x m0xVar = this.b;
                if (m0xVar != null) {
                    Object obj4 = (n0x) m0xVar.b.get(str);
                    obj = obj4;
                    if (obj4 == null) {
                        obj = n0x.a.a;
                    }
                } else {
                    obj = null;
                }
                n0x.b bVar2 = obj instanceof n0x.b ? (n0x.b) obj : null;
                if (bVar2 == null) {
                    return;
                }
                Iterator it = aVar3.b.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (epx.f(((FeedItem) obj2).F(), str)) {
                            break;
                        }
                    }
                }
                FeedItem.f fVar = obj2 instanceof FeedItem.f ? (FeedItem.f) obj2 : null;
                if (fVar == null) {
                    return;
                }
                InternalNpsQuestions internalNpsQuestions = bVar2.a;
                InternalNpsQuestion internalNpsQuestion = bVar2.b;
                Iterator it2 = internalNpsQuestion.f.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        r27 = z2;
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it2.next();
                        r27 = z2;
                        if (((InternalNpsQuestionTarget) obj3).c.contains(aVar4.c)) {
                            break;
                        } else {
                            z2 = r27 == true ? 1 : 0;
                        }
                    }
                }
                InternalNpsQuestionTarget internalNpsQuestionTarget = (InternalNpsQuestionTarget) obj3;
                InternalNpsQuestion internalNpsQuestion2 = internalNpsQuestions.d.get(internalNpsQuestionTarget != null ? internalNpsQuestionTarget.b : null);
                io.reactivex.rxjava3.subjects.f fVar2 = new io.reactivex.rxjava3.subjects.f();
                n0x.b bVar3 = bVar2;
                io.reactivex.rxjava3.disposables.c e2 = a7f0.a.e(aVar, new io.reactivex.rxjava3.internal.operators.observable.q2(new io.reactivex.rxjava3.internal.operators.mixed.o(fVar2, new s41(new md(29), 15)), new vx6(new pl2(28), 13)), null, new j9k(aVar, 12), null, null, 13);
                qcy<Object> qcyVar4 = qcyVarArr[1];
                d80Var.g(e2);
                String str2 = aVar4.c;
                SdkClipVideoFile sdkClipVideoFile = fVar.e;
                vjx vjxVar = this.a;
                if (vjxVar != null) {
                    String str3 = internalNpsQuestions.b;
                    String a1 = sdkClipVideoFile.a1();
                    String r = sdkClipVideoFile.r();
                    vjxVar.getClass();
                    List singletonList = Collections.singletonList(new ShortVideoQuestionnaireAnswerDto(internalNpsQuestion.c, str2, null, 4, null));
                    tfx tfxVar = new tfx("shortVideo.saveQuestionnaireAnswers", new v11(26), new yga0(4));
                    tfx.o(tfxVar, "questionnaire_id_str", str3, 0, 0, 12);
                    tfx.o(tfxVar, "short_video_raw_id", a1, 0, 0, 12);
                    tfx.o(tfxVar, "answers", GsonHolder.a().toJson(singletonList), 0, 0, 12);
                    if (r != null) {
                        tfx.o(tfxVar, "track_code", r, 0, 0, 12);
                    }
                    aVar2 = rsg0.Z(yfb.x(tfxVar));
                } else {
                    aVar2 = io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                io.reactivex.rxjava3.core.a aVar5 = aVar2;
                y00 y00Var = new y00(new k9e(fVar2, 1), 19);
                aVar5.getClass();
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                io.reactivex.rxjava3.disposables.c d = a7f0.a.d(aVar, new io.reactivex.rxjava3.internal.operators.completable.w(aVar5, y00Var, lVar, kVar, kVar, kVar, kVar), null, new hxl(fVar2, 3), new w0r(internalNpsQuestion2, bVar3, this, aVar4, fVar2, 0), 1);
                qcy<Object> qcyVar5 = qcyVarArr[r27];
                d80Var2.g(d);
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
