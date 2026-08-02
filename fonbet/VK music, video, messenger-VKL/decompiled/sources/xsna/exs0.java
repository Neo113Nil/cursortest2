package xsna;

import com.vk.api.generated.messages.dto.MessagesGetVideoMessageShapesByIdsResponseDto;
import com.vk.api.generated.messages.dto.MessagesVideoMessageShapeResponseItemDto;
import com.vk.dto.common.Source;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VideoMsgStencilPrefetchIfMissCmd.kt */
/* loaded from: classes2.dex */
public final class exs0 extends yl6<s3q0> {
    public final Collection<Integer> b;

    /* compiled from: VideoMsgStencilPrefetchIfMissCmd.kt */
    @b6l(c = "com.vk.im.engine.commands.videomsg.VideoMsgStencilPrefetchIfMissCmd", f = "VideoMsgStencilPrefetchIfMissCmd.kt", l = {24}, m = "onExecute")
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return exs0.this.e(null, this);
        }
    }

    public exs0(Collection<Integer> collection) {
        this.b = collection;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-video-stencil-prefetch";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9 A[LOOP:0: B:11:0x00b1->B:13:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // xsna.me6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(w2w w2wVar, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        List<MessagesVideoMessageShapeResponseItemDto> list;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    its0 x = w2wVar.I0().x();
                    Collection<Integer> collection = this.b;
                    List<j0l0> a2 = x.a(collection);
                    ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
                    Iterator<T> it = a2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((j0l0) it.next()).a));
                    }
                    ArrayList arrayList2 = new ArrayList(collection);
                    arrayList2.removeAll(arrayList);
                    if (arrayList2.isEmpty()) {
                        return s3q0.a;
                    }
                    aVar.L$0 = w2wVar;
                    aVar.L$1 = null;
                    aVar.L$2 = null;
                    aVar.label = 1;
                    obj = f(arrayList2, aVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w2wVar = (w2w) aVar.L$0;
                    kotlin.a.a(obj);
                }
                its0 x2 = w2wVar.I0().x();
                list = (List) obj;
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                for (MessagesVideoMessageShapeResponseItemDto messagesVideoMessageShapeResponseItemDto : list) {
                    arrayList3.add(new j0l0(messagesVideoMessageShapeResponseItemDto.f() * 1000, messagesVideoMessageShapeResponseItemDto.d() * 1000, messagesVideoMessageShapeResponseItemDto.getId(), messagesVideoMessageShapeResponseItemDto.e()));
                }
                x2.e(arrayList3);
                w2wVar.S0().h(w2wVar.I0().x().getAll());
                if ((list instanceof Collection) || !list.isEmpty()) {
                    for (MessagesVideoMessageShapeResponseItemDto messagesVideoMessageShapeResponseItemDto2 : list) {
                        long f1 = w2wVar.f1();
                        if (f1 >= messagesVideoMessageShapeResponseItemDto2.f() * 1000 && (f1 <= messagesVideoMessageShapeResponseItemDto2.d() * 1000 || messagesVideoMessageShapeResponseItemDto2.d() * 1000 == 0)) {
                            w2wVar.J0(this, new bxs0(Source.NETWORK));
                            break;
                        }
                    }
                }
                return s3q0.a;
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj3 = aVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        its0 x22 = w2wVar.I0().x();
        list = (List) obj3;
        ArrayList arrayList32 = new ArrayList(c5g.u(list, 10));
        while (r2.hasNext()) {
        }
        x22.e(arrayList32);
        w2wVar.S0().h(w2wVar.I0().x().getAll());
        if (list instanceof Collection) {
        }
        while (r15.hasNext()) {
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exs0) && epx.f(this.b, ((exs0) obj).b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ArrayList arrayList, ContinuationImpl continuationImpl) {
        fxs0 fxs0Var;
        int i;
        if (continuationImpl instanceof fxs0) {
            fxs0Var = (fxs0) continuationImpl;
            int i2 = fxs0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fxs0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = fxs0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fxs0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    fxs0Var.L$0 = null;
                    fxs0Var.label = 1;
                    List O0 = j5g.O0(arrayList);
                    tfx tfxVar = new tfx("messages.getVideoMessageShapesByIds", new nr(20), new defpackage.j0(25));
                    tfxVar.i("ids", O0);
                    iz2 A = yfb.A(tfxVar);
                    A.n = false;
                    obj = evj.p(A, fxs0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((MessagesGetVideoMessageShapesByIdsResponseDto) obj).d();
            }
        }
        fxs0Var = new fxs0(this, continuationImpl);
        Object obj2 = fxs0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fxs0Var.label;
        if (i != 0) {
        }
        return ((MessagesGetVideoMessageShapesByIdsResponseDto) obj2).d();
    }

    @Override // xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return l4.h(new StringBuilder("VideoMsgStencilPrefetchIfMissCmd(stencilShapeIds="), this.b, ')');
    }
}
