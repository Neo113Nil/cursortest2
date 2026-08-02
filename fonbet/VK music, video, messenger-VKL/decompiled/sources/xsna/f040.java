package xsna;

import com.vk.api.generated.messages.dto.MessagesAddTemplateResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.messages.MsgTemplate;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MsgTemplateCreateOrUpdate.kt */
/* loaded from: classes3.dex */
public final class f040 extends me6<s3q0> {
    public final Integer b;
    public final String c;
    public final String d;

    /* compiled from: MsgTemplateCreateOrUpdate.kt */
    @b6l(c = "com.vk.messagetemplates.impl.data.MsgTemplateCreateOrUpdate", f = "MsgTemplateCreateOrUpdate.kt", l = {19, 22}, m = "onExecute")
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return f040.this.e(null, this);
        }
    }

    public f040(Integer num, String str, String str2) {
        this.b = num;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r2 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e5, code lost:
    
        if (r2 == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // xsna.me6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(w2w w2wVar, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        w2w w2wVar2 = w2wVar;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                Integer num = this.b;
                String str = this.d;
                String str2 = this.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    UserId userId = new UserId(w2wVar2.Q0().d);
                    if (num != null) {
                        int intValue = num.intValue();
                        aVar.L$0 = w2wVar2;
                        aVar.L$1 = null;
                        aVar.label = 1;
                        tfx tfxVar = new tfx("messages.editTemplate", new w11(24), new at(22));
                        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
                        tfx.l(tfxVar, "template_id", intValue, 0, 0, 8);
                        tfxVar.g(2, 200, "name", str2);
                        tfxVar.g(5, 2000, "text", str);
                        iz2 A = yfb.A(tfxVar);
                        A.n = false;
                        Object p = evj.p(A, aVar);
                        if (p != obj2) {
                            p = s3q0.a;
                        }
                    } else {
                        aVar.L$0 = w2wVar2;
                        aVar.L$1 = null;
                        aVar.label = 2;
                        obj = f(userId, str2, str, aVar);
                    }
                    return obj2;
                }
                if (i == 1) {
                    w2wVar2 = (w2w) aVar.L$0;
                    kotlin.a.a(obj);
                    w2wVar2.I0().o().K(new MsgTemplate(num.intValue(), str2, str));
                    w2wVar2.e1(this, jb20.b);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w2wVar2 = (w2w) aVar.L$0;
                    kotlin.a.a(obj);
                    Integer num2 = (Integer) obj;
                    if (num2 == null) {
                        return s3q0.a;
                    }
                    w2wVar2.I0().o().K(new MsgTemplate(num2.intValue(), str2, str));
                    w2wVar2.e1(this, jb20.b);
                }
                return s3q0.a;
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj3 = aVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        Integer num3 = this.b;
        String str3 = this.d;
        String str22 = this.c;
        if (i != 0) {
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f040)) {
            return false;
        }
        f040 f040Var = (f040) obj;
        return epx.f(this.b, f040Var.b) && epx.f(this.c, f040Var.c) && epx.f(this.d, f040Var.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(UserId userId, String str, String str2, ContinuationImpl continuationImpl) {
        g040 g040Var;
        int i;
        if (continuationImpl instanceof g040) {
            g040Var = (g040) continuationImpl;
            int i2 = g040Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g040Var.label = i2 - Integer.MIN_VALUE;
                Object obj = g040Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = g040Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    tfx tfxVar = new tfx("messages.addTemplate", new bt(19), new ct(16));
                    tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
                    tfxVar.g(2, 200, "name", str);
                    tfxVar.g(5, 2000, "text", str2);
                    iz2 A = yfb.A(tfxVar);
                    A.n = false;
                    g040Var.L$0 = null;
                    g040Var.L$1 = null;
                    g040Var.L$2 = null;
                    g040Var.label = 1;
                    obj = evj.p(A, g040Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((MessagesAddTemplateResponseDto) obj).d();
            }
        }
        g040Var = new g040(this, continuationImpl);
        Object obj2 = g040Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = g040Var.label;
        if (i != 0) {
        }
        return ((MessagesAddTemplateResponseDto) obj2).d();
    }

    @Override // xsna.e1w
    public final int hashCode() {
        Integer num = this.b;
        return Boolean.hashCode(false) + urd0.a(urd0.a((num == null ? 0 : num.hashCode()) * 31, 31, this.c), 31, this.d);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgTemplateCreateOrUpdate(templateId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", text=");
        return i5s.a(sb, this.d, ", awaitNetwork=false)");
    }
}
