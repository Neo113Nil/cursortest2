package xsna;

import com.vk.api.generated.messages.dto.MessagesGetTemplatesResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetTemplatesSortDto;
import com.vk.api.generated.messages.dto.MessagesTemplateDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.messages.MsgTemplate;
import com.vk.log.L;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MsgTemplatesGetCmd.kt */
/* loaded from: classes3.dex */
public final class j040 extends me6<List<? extends MsgTemplate>> {
    public static final long c = TimeUnit.HOURS.toMillis(2);
    public static final /* synthetic */ int d = 0;
    public final Source b;

    /* compiled from: MsgTemplatesGetCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j040(Source source) {
        this.b = source;
    }

    @Override // xsna.me6
    public final Object e(w2w w2wVar, spj<? super List<? extends MsgTemplate>> spjVar) {
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return w2wVar.I0().o().u0();
        }
        if (i == 2) {
            return f(w2wVar, (ContinuationImpl) spjVar);
        }
        if (i == 3) {
            return g(w2wVar, (ContinuationImpl) spjVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j040) && this.b == ((j040) obj).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(w2w w2wVar, ContinuationImpl continuationImpl) {
        k040 k040Var;
        int i;
        try {
            if (continuationImpl instanceof k040) {
                k040Var = (k040) continuationImpl;
                int i2 = k040Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    k040Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = k040Var.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = k040Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        long g = w2wVar.I0().k().g("templates_request_time");
                        if (w2wVar.f1() - g < c) {
                            return w2wVar.I0().o().u0();
                        }
                        k040Var.L$0 = w2wVar;
                        k040Var.J$0 = g;
                        k040Var.label = 1;
                        obj = g(w2wVar, k040Var);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        w2wVar = (w2w) k040Var.L$0;
                        kotlin.a.a(obj);
                    }
                    return (List) obj;
                }
            }
            if (i != 0) {
            }
            return (List) obj;
        } catch (Throwable th) {
            L.E(th, new Object[0]);
            return w2wVar.I0().o().u0();
        }
        k040Var = new k040(this, continuationImpl);
        Object obj3 = k040Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = k040Var.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3 A[LOOP:0: B:11:0x00ad->B:13:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(w2w w2wVar, ContinuationImpl continuationImpl) {
        l040 l040Var;
        int i;
        if (continuationImpl instanceof l040) {
            l040Var = (l040) continuationImpl;
            int i2 = l040Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l040Var.label = i2 - Integer.MIN_VALUE;
                Object obj = l040Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = l040Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Peer Q0 = w2wVar.Q0();
                    l040Var.L$0 = w2wVar;
                    l040Var.label = 1;
                    UserId userId = new UserId(Q0.d);
                    MessagesGetTemplatesSortDto messagesGetTemplatesSortDto = MessagesGetTemplatesSortDto.CREATE_TIME;
                    tfx tfxVar = new tfx("messages.getTemplates", new io.reactivex.rxjava3.subjects.c(27), new as(21));
                    tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
                    if (messagesGetTemplatesSortDto != null) {
                        tfx.o(tfxVar, "sort", messagesGetTemplatesSortDto.i(), 0, 0, 12);
                    }
                    iz2 A = yfb.A(tfxVar);
                    A.n = false;
                    obj = evj.p(A, l040Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w2wVar = (w2w) l040Var.L$0;
                    kotlin.a.a(obj);
                }
                List<MessagesTemplateDto> d2 = ((MessagesGetTemplatesResponseDto) obj).d();
                w2wVar.I0().k().j("templates_request_time", w2wVar.f1());
                List<MessagesTemplateDto> list = d2;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (MessagesTemplateDto messagesTemplateDto : list) {
                    arrayList.add(new MsgTemplate(messagesTemplateDto.getId(), messagesTemplateDto.d(), messagesTemplateDto.e()));
                }
                w2wVar.I0().o().l0(arrayList);
                w2wVar.e1(this, jb20.b);
                return arrayList;
            }
        }
        l040Var = new l040(this, continuationImpl);
        Object obj2 = l040Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = l040Var.label;
        if (i != 0) {
        }
        List<MessagesTemplateDto> d22 = ((MessagesGetTemplatesResponseDto) obj2).d();
        w2wVar.I0().k().j("templates_request_time", w2wVar.f1());
        List<MessagesTemplateDto> list2 = d22;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        while (r15.hasNext()) {
        }
        w2wVar.I0().o().l0(arrayList2);
        w2wVar.e1(this, jb20.b);
        return arrayList2;
    }

    @Override // xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "MsgTemplatesGetCmd(source=" + this.b + ", awaitNetwork=false)";
    }
}
