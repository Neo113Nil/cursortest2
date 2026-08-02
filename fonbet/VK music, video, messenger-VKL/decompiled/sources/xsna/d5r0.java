package xsna;

import com.vk.uxpolls.api.models.UxPollsInteractEvent;
import com.vk.uxpolls.domain.exception.InteractEventError;
import com.vk.uxpolls.domain.exception.ParamsAreRequiredException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: UxPollsInteractUseCase.kt */
/* loaded from: classes6.dex */
public final class d5r0 extends pc6<a, Boolean> {
    public final n5r0 a;

    /* compiled from: UxPollsInteractUseCase.kt */
    public static abstract class a {
        public final UxPollsInteractEvent a;
        public final boolean b;

        /* compiled from: UxPollsInteractUseCase.kt */
        /* renamed from: xsna.d5r0$a$a, reason: collision with other inner class name */
        public static final class C2707a extends a {
            public final blq0 c;
            public final int d;
            public final String e;
            public final String f;
            public final String g;

            public C2707a(blq0 blq0Var, int i, String str, String str2, String str3) {
                super(UxPollsInteractEvent.HIDE, true);
                this.c = blq0Var;
                this.d = i;
                this.e = str;
                this.f = str2;
                this.g = str3;
            }

            @Override // xsna.d5r0.a
            public final String a() {
                return this.g;
            }

            @Override // xsna.d5r0.a
            public final Integer b() {
                return Integer.valueOf(this.d);
            }

            @Override // xsna.d5r0.a
            public final String c() {
                return this.f;
            }

            @Override // xsna.d5r0.a
            public final String d() {
                return this.e;
            }

            @Override // xsna.d5r0.a
            public final blq0 e() {
                return this.c;
            }
        }

        /* compiled from: UxPollsInteractUseCase.kt */
        public static final class b extends a {
            public final blq0 c;
            public final String d;
            public final String e;

            public b(String str, String str2, blq0 blq0Var) {
                super(UxPollsInteractEvent.INVITE_VIEW, false);
                this.c = blq0Var;
                this.d = str;
                this.e = str2;
            }

            @Override // xsna.d5r0.a
            public final String a() {
                return null;
            }

            @Override // xsna.d5r0.a
            public final Integer b() {
                return null;
            }

            @Override // xsna.d5r0.a
            public final String c() {
                return this.e;
            }

            @Override // xsna.d5r0.a
            public final String d() {
                return this.d;
            }

            @Override // xsna.d5r0.a
            public final blq0 e() {
                return this.c;
            }
        }

        /* compiled from: UxPollsInteractUseCase.kt */
        public static final class c extends a {
            public final blq0 c;
            public final int d;
            public final String e;
            public final String f;
            public final String g;

            public c(blq0 blq0Var, int i, String str, String str2, String str3) {
                super(UxPollsInteractEvent.SHOW, true);
                this.c = blq0Var;
                this.d = i;
                this.e = str;
                this.f = str2;
                this.g = str3;
            }

            @Override // xsna.d5r0.a
            public final String a() {
                return this.g;
            }

            @Override // xsna.d5r0.a
            public final Integer b() {
                return Integer.valueOf(this.d);
            }

            @Override // xsna.d5r0.a
            public final String c() {
                return this.f;
            }

            @Override // xsna.d5r0.a
            public final String d() {
                return this.e;
            }

            @Override // xsna.d5r0.a
            public final blq0 e() {
                return this.c;
            }
        }

        public a(UxPollsInteractEvent uxPollsInteractEvent, boolean z) {
            this.a = uxPollsInteractEvent;
            this.b = z;
        }

        public abstract String a();

        public abstract Integer b();

        public abstract String c();

        public abstract String d();

        public abstract blq0 e();
    }

    public d5r0(n5r0 n5r0Var) {
        this.a = n5r0Var;
    }

    @Override // xsna.pc6
    public final Void a(a aVar, Throwable th) {
        String sb;
        Integer b;
        a aVar2 = aVar;
        if (th instanceof ParamsAreRequiredException) {
            throw th;
        }
        if (aVar2 == null || (b = aVar2.b()) == null || (sb = lhg.a(b.intValue(), "poll: ")) == null) {
            StringBuilder sb2 = new StringBuilder("trigger: ");
            sb2.append(aVar2 != null ? aVar2.d() : null);
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("Unable to send interact event ");
        sb3.append(aVar2 != null ? aVar2.a : null);
        sb3.append(" for ");
        sb3.append(sb);
        throw new InteractEventError(sb3.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r3.h(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // xsna.pc6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a aVar, ContinuationImpl continuationImpl) {
        e5r0 e5r0Var;
        int i;
        if (continuationImpl instanceof e5r0) {
            e5r0Var = (e5r0) continuationImpl;
            int i2 = e5r0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e5r0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = e5r0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = e5r0Var.label;
                n5r0 n5r0Var = this.a;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (aVar == null) {
                        throw new ParamsAreRequiredException("Params should be passed");
                    }
                    if (aVar.b) {
                        e5r0Var.L$0 = aVar;
                        e5r0Var.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return obj;
                    }
                    aVar = (a) e5r0Var.L$0;
                    kotlin.a.a(obj);
                }
                UxPollsInteractEvent uxPollsInteractEvent = aVar.a;
                Integer b = aVar.b();
                String d = aVar.d();
                e4e0 e4e0Var = new e4e0(aVar.c(), aVar.a(), aVar.e());
                e5r0Var.L$0 = null;
                e5r0Var.label = 2;
                Boolean g = n5r0Var.g(uxPollsInteractEvent, b, d, e4e0Var);
                return g != coroutineSingletons ? coroutineSingletons : g;
            }
        }
        e5r0Var = new e5r0(this, continuationImpl);
        Object obj2 = e5r0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = e5r0Var.label;
        n5r0 n5r0Var2 = this.a;
        if (i != 0) {
        }
        UxPollsInteractEvent uxPollsInteractEvent2 = aVar.a;
        Integer b2 = aVar.b();
        String d2 = aVar.d();
        e4e0 e4e0Var2 = new e4e0(aVar.c(), aVar.a(), aVar.e());
        e5r0Var.L$0 = null;
        e5r0Var.label = 2;
        Boolean g2 = n5r0Var2.g(uxPollsInteractEvent2, b2, d2, e4e0Var2);
        if (g2 != coroutineSingletons2) {
        }
    }
}
