package xsna;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.eyx;
import xsna.o2d0;

/* compiled from: Clickable.kt */
/* loaded from: classes11.dex */
public abstract class zc extends ytl implements cmb0, ndy, fgi0, npp0, nvi, hr70, puw, dot {
    public static final a M = new a();
    public tkn0 A;
    public oot B;
    public htl C;
    public o2d0.b D;
    public lgv E;
    public final xg50<o2d0.b> F;
    public long G;
    public o2d0.b H;
    public sg50 I;
    public boolean J;
    public yok0 K;
    public final a L;
    public sg50 r;
    public guw s;
    public boolean t;
    public String u;
    public plg0 v;
    public boolean w;
    public gzs<s3q0> x;
    public final nxr y;
    public guw z;

    /* compiled from: Clickable.kt */
    public static final class a {
    }

    /* compiled from: Clickable.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            zc zcVar = (zc) this.receiver;
            xg50<o2d0.b> xg50Var = zcVar.F;
            if (booleanValue) {
                zcVar.t2();
            } else {
                if (zcVar.r != null) {
                    Object[] objArr = xg50Var.c;
                    long[] jArr = xg50Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8;
                                int i4 = 8 - ((~(i2 - length)) >>> 31);
                                int i5 = 0;
                                while (i5 < i4) {
                                    if ((255 & j) < 128) {
                                        i = i3;
                                        myc0.h(zcVar.W1(), null, null, new cd(zcVar, (o2d0.b) objArr[(i2 << 3) + i5], null), 3);
                                    } else {
                                        i = i3;
                                    }
                                    j >>= i;
                                    i5++;
                                    i3 = i;
                                }
                                if (i4 != i3) {
                                    break;
                                }
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                    o2d0.b bVar = zcVar.H;
                    if (bVar != null) {
                        myc0.h(zcVar.W1(), null, null, new dd(zcVar, bVar, null), 3);
                    }
                }
                xg50Var.d();
                zcVar.H = null;
                zcVar.u2();
            }
            return s3q0.a;
        }
    }

    /* compiled from: Clickable.kt */
    @b6l(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionCancel$1$1$1", f = "Clickable.kt", l = {2214}, m = "invokeSuspend", v = 1)
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ o2d0.a $endInteraction;
        final /* synthetic */ ogn $handler;
        final /* synthetic */ sg50 $interactionSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(sg50 sg50Var, o2d0.a aVar, ogn ognVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$interactionSource = sg50Var;
            this.$endInteraction = aVar;
            this.$handler = ognVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$interactionSource, this.$endInteraction, this.$handler, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                sg50 sg50Var = this.$interactionSource;
                o2d0.a aVar = this.$endInteraction;
                this.label = 1;
                if (sg50Var.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            ogn ognVar = this.$handler;
            if (ognVar != null) {
                ognVar.dispose();
            }
            return s3q0.a;
        }
    }

    /* compiled from: Clickable.kt */
    @b6l(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1", f = "Clickable.kt", l = {2157, 2162, 2163}, m = "invokeSuspend", v = 1)
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ sg50 $interactionSource;
        final /* synthetic */ eyx $job;
        final /* synthetic */ long $offset;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(eyx eyxVar, long j, sg50 sg50Var, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$job = eyxVar;
            this.$offset = j;
            this.$interactionSource = sg50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$job, this.$offset, this.$interactionSource, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        
            if (r7.a(r1, r6) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        
            if (r4.a(r7, r6) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
        
            if (r7.y(r6) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            o2d0.c cVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                eyx eyxVar = this.$job;
                this.label = 1;
            } else if (i == 1) {
                kotlin.a.a(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                cVar = (o2d0.c) this.L$0;
                kotlin.a.a(obj);
                sg50 sg50Var = this.$interactionSource;
                this.L$0 = null;
                this.label = 3;
            }
            o2d0.b bVar = new o2d0.b(this.$offset);
            cVar = new o2d0.c(bVar);
            sg50 sg50Var2 = this.$interactionSource;
            this.L$0 = cVar;
            this.label = 2;
        }
    }

    /* compiled from: Clickable.kt */
    @b6l(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$2$1", f = "Clickable.kt", l = {2174}, m = "invokeSuspend", v = 1)
    public static final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ sg50 $interactionSource;
        final /* synthetic */ o2d0.b $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(spj spjVar, sg50 sg50Var, o2d0.b bVar) {
            super(2, spjVar);
            this.$it = bVar;
            this.$interactionSource = sg50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new e(spjVar, this.$interactionSource, this.$it);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                o2d0.c cVar = new o2d0.c(this.$it);
                sg50 sg50Var = this.$interactionSource;
                this.label = 1;
                if (sg50Var.a(cVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: Clickable.kt */
    @b6l(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1", f = "Clickable.kt", l = {2071, 2072}, m = "invokeSuspend", v = 1)
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ sg50 $interactionSource;
        final /* synthetic */ o2d0.b $press;
        int label;
        final /* synthetic */ zc this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(sg50 sg50Var, o2d0.b bVar, zc zcVar, spj<? super f> spjVar) {
            super(2, spjVar);
            this.$interactionSource = sg50Var;
            this.$press = bVar;
            this.this$0 = zcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new f(this.$interactionSource, this.$press, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r7.a(r1, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        
            if (xsna.qsl.b(r4, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                long j = xkc.a;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    this.this$0.H = this.$press;
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            sg50 sg50Var = this.$interactionSource;
            o2d0.b bVar = this.$press;
            this.label = 2;
        }
    }

    /* compiled from: Clickable.kt */
    @b6l(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$2", f = "Clickable.kt", l = {2077}, m = "invokeSuspend", v = 1)
    public static final class g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ sg50 $interactionSource;
        final /* synthetic */ o2d0.b $press;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(spj spjVar, sg50 sg50Var, o2d0.b bVar) {
            super(2, spjVar);
            this.$interactionSource = sg50Var;
            this.$press = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new g(spjVar, this.$interactionSource, this.$press);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                sg50 sg50Var = this.$interactionSource;
                o2d0.b bVar = this.$press;
                this.label = 1;
                if (sg50Var.a(bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: Clickable.kt */
    @b6l(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$2$1", f = "Clickable.kt", l = {2088, 2089}, m = "invokeSuspend", v = 1)
    public static final class h extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ sg50 $interactionSource;
        final /* synthetic */ o2d0.b $press;
        int label;
        final /* synthetic */ zc this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(sg50 sg50Var, o2d0.b bVar, zc zcVar, spj<? super h> spjVar) {
            super(2, spjVar);
            this.$interactionSource = sg50Var;
            this.$press = bVar;
            this.this$0 = zcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new h(this.$interactionSource, this.$press, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((h) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r7.a(r1, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        
            if (xsna.qsl.b(r4, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                long j = xkc.a;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    this.this$0.D = this.$press;
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            sg50 sg50Var = this.$interactionSource;
            o2d0.b bVar = this.$press;
            this.label = 2;
        }
    }

    /* compiled from: Clickable.kt */
    @b6l(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$2$2", f = "Clickable.kt", l = {2094}, m = "invokeSuspend", v = 1)
    public static final class i extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ sg50 $interactionSource;
        final /* synthetic */ o2d0.b $press;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(spj spjVar, sg50 sg50Var, o2d0.b bVar) {
            super(2, spjVar);
            this.$interactionSource = sg50Var;
            this.$press = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new i(spjVar, this.$interactionSource, this.$press);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((i) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                sg50 sg50Var = this.$interactionSource;
                o2d0.b bVar = this.$press;
                this.label = 1;
                if (sg50Var.a(bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: Clickable.kt */
    @b6l(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {1999}, m = "invokeSuspend", v = 1)
    public static final class j extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ o2d0.b $press;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(o2d0.b bVar, spj<? super j> spjVar) {
            super(2, spjVar);
            this.$press = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return zc.this.new j(this.$press, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((j) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                sg50 sg50Var = zc.this.r;
                if (sg50Var != null) {
                    o2d0.b bVar = this.$press;
                    this.label = 1;
                    if (sg50Var.a(bVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: Clickable.kt */
    @b6l(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2", f = "Clickable.kt", l = {2011}, m = "invokeSuspend", v = 1)
    public static final class k extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ o2d0.b $press;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(o2d0.b bVar, spj<? super k> spjVar) {
            super(2, spjVar);
            this.$press = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return zc.this.new k(this.$press, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((k) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                sg50 sg50Var = zc.this.r;
                if (sg50Var != null) {
                    o2d0.c cVar = new o2d0.c(this.$press);
                    this.label = 1;
                    if (sg50Var.a(cVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: Clickable.kt */
    @b6l(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class l extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public l(spj<? super l> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return zc.this.new l(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((l) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            zc zcVar = zc.this;
            if (zcVar.E == null) {
                lgv lgvVar = new lgv();
                sg50 sg50Var = zcVar.r;
                if (sg50Var != null) {
                    myc0.h(zcVar.W1(), null, null, new ad(sg50Var, lgvVar, null), 3);
                }
                zcVar.E = lgvVar;
            }
            return s3q0.a;
        }
    }

    /* compiled from: Clickable.kt */
    @b6l(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class m extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public m(spj<? super m> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return zc.this.new m(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((m) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            zc zcVar = zc.this;
            lgv lgvVar = zcVar.E;
            if (lgvVar != null) {
                mgv mgvVar = new mgv(lgvVar);
                sg50 sg50Var = zcVar.r;
                if (sg50Var != null) {
                    myc0.h(zcVar.W1(), null, null, new bd(sg50Var, mgvVar, null), 3);
                }
                zcVar.E = null;
            }
            return s3q0.a;
        }
    }

    public zc() {
        throw null;
    }

    public zc(sg50 sg50Var, guw guwVar, boolean z, boolean z2, String str, plg0 plg0Var, gzs gzsVar) {
        this.r = sg50Var;
        this.s = guwVar;
        this.t = z;
        this.u = str;
        this.v = plg0Var;
        this.w = z2;
        this.x = gzsVar;
        this.y = new nxr(sg50Var, 0, new b(1, this, zc.class, "onFocusChange", "onFocusChange(Z)V", 0));
        xg50 xg50Var = t300.a;
        this.F = new xg50<>();
        this.G = 0L;
        sg50 sg50Var2 = this.r;
        this.I = sg50Var2;
        this.J = sg50Var2 == null;
        this.L = M;
    }

    @Override // xsna.hr70
    public final void D1() {
        if (this.t) {
            ir70.a(this, new f1(this, 1));
        }
    }

    public void E1(fa2 fa2Var, PointerEventPass pointerEventPass) {
        t2();
        if (this.w && this.B == null) {
            oot ootVar = new oot(this);
            i2(ootVar);
            this.B = ootVar;
        }
    }

    public void H(plb0 plb0Var, PointerEventPass pointerEventPass, long j2) {
        tkn0 m2;
        long n = pli.n(j2);
        this.G = (Float.floatToRawIntBits((int) (n & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (n >> 32)) << 32);
        t2();
        if (this.w) {
            if (this.B == null) {
                oot ootVar = new oot(this);
                i2(ootVar);
                this.B = ootVar;
            }
            if (pointerEventPass == PointerEventPass.Main) {
                int i2 = plb0Var.f;
                if (i2 == 4) {
                    myc0.h(W1(), null, null, new l(null), 3);
                } else if (i2 == 5) {
                    myc0.h(W1(), null, null, new m(null), 3);
                }
            }
        }
        if (this.A == null && (m2 = m2()) != null) {
            i2(m2);
            this.A = m2;
        }
        tkn0 tkn0Var = this.A;
        if (tkn0Var != null) {
            tkn0Var.H(plb0Var, pointerEventPass, j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[RETURN] */
    @Override // xsna.ndy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J1(KeyEvent keyEvent) {
        boolean z;
        t2();
        long u = zq70.u(keyEvent);
        boolean z2 = this.w;
        xg50<o2d0.b> xg50Var = this.F;
        if (!z2 || zq70.w(keyEvent) != 2 || !ojc.f(keyEvent)) {
            if (this.w && zq70.w(keyEvent) == 1 && ojc.f(keyEvent)) {
                o2d0.b h2 = xg50Var.h(u);
                if (h2 != null) {
                    if (this.r != null) {
                        myc0.h(W1(), null, null, new k(h2, null), 3);
                    }
                    w2(keyEvent);
                }
                if (h2 != null) {
                    return true;
                }
            }
            return false;
        }
        if (xg50Var.a(u)) {
            z = false;
        } else {
            o2d0.b bVar = new o2d0.b(this.G);
            xg50Var.i(u, bVar);
            if (this.r != null) {
                myc0.h(W1(), null, null, new j(bVar, null), 3);
            }
            z = true;
        }
        if (!v2(keyEvent) && !z) {
            return false;
        }
    }

    @Override // xsna.ndy
    public final boolean T(KeyEvent keyEvent) {
        return false;
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.q630.c
    public final void a2() {
        D1();
        if (!this.J) {
            t2();
        }
        if (this.w) {
            i2(this.y);
        }
    }

    @Override // xsna.q630.c
    public final void b2() {
        n2();
        if (this.I == null) {
            this.r = null;
        }
        htl htlVar = this.C;
        if (htlVar != null) {
            j2(htlVar);
        }
        this.C = null;
        oot ootVar = this.B;
        if (ootVar != null) {
            j2(ootVar);
        }
        this.B = null;
    }

    @Override // xsna.npp0
    public final Object g0() {
        return this.L;
    }

    public void h1() {
        lgv lgvVar;
        sg50 sg50Var = this.r;
        if (sg50Var != null && (lgvVar = this.E) != null) {
            sg50Var.c(new mgv(lgvVar));
        }
        this.E = null;
        tkn0 tkn0Var = this.A;
        if (tkn0Var != null) {
            tkn0Var.h1();
        }
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        plg0 plg0Var = this.v;
        if (plg0Var != null) {
            qgi0.n(tgi0Var, plg0Var.a);
        }
        qgi0.e(tgi0Var, this.u, new yc(this, 0));
        if (this.w) {
            this.y.l1(tgi0Var);
        } else {
            qgi0.a(tgi0Var);
        }
        l2(tgi0Var);
    }

    public tkn0 m2() {
        return null;
    }

    public final void n2() {
        sg50 sg50Var = this.r;
        xg50<o2d0.b> xg50Var = this.F;
        if (sg50Var != null) {
            o2d0.b bVar = this.D;
            if (bVar != null) {
                sg50Var.c(new o2d0.a(bVar));
            }
            o2d0.b bVar2 = this.H;
            if (bVar2 != null) {
                sg50Var.c(new o2d0.a(bVar2));
            }
            lgv lgvVar = this.E;
            if (lgvVar != null) {
                sg50Var.c(new mgv(lgvVar));
            }
            Object[] objArr = xg50Var.c;
            long[] jArr = xg50Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                sg50Var.c(new o2d0.a((o2d0.b) objArr[(i2 << 3) + i4]));
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.D = null;
        this.H = null;
        this.E = null;
        xg50Var.d();
    }

    public final long o2(long j2) {
        long p1 = itl.f(this).z.p1(((rut0) ovi.a(this, uvi.t)).g());
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (p1 >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (p1 & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final void p2(boolean z) {
        sg50 sg50Var = this.r;
        if (sg50Var != null) {
            yok0 yok0Var = this.K;
            if (yok0Var == null || !yok0Var.isActive()) {
                o2d0.b bVar = z ? this.H : this.D;
                if (bVar != null) {
                    o2d0.a aVar = new o2d0.a(bVar);
                    eyx eyxVar = (eyx) ((hpj) W1()).b.get(eyx.a.b);
                    myc0.h(W1(), null, null, new c(sg50Var, aVar, eyxVar != null ? eyxVar.E(new h1(1, sg50Var, aVar)) : null, null), 3);
                }
            } else {
                yok0 yok0Var2 = this.K;
                if (yok0Var2 != null) {
                    yok0Var2.b(null);
                }
            }
            if (z) {
                this.H = null;
            } else {
                this.D = null;
            }
        }
    }

    @Override // xsna.fgi0
    public final boolean q1() {
        return true;
    }

    public final void q2(long j2, boolean z) {
        sg50 sg50Var = this.r;
        if (sg50Var != null) {
            yok0 yok0Var = this.K;
            if (yok0Var == null || !yok0Var.isActive()) {
                o2d0.b bVar = z ? this.H : this.D;
                if (bVar != null) {
                    myc0.h(W1(), null, null, new e(null, sg50Var, bVar), 3);
                }
            } else {
                yok0Var.b(null);
                myc0.h(W1(), null, null, new d(yok0Var, j2, sg50Var, null), 3);
            }
            if (z) {
                this.H = null;
            } else {
                this.D = null;
            }
        }
    }

    public final void r2(nuw nuwVar) {
        sg50 sg50Var = this.r;
        if (sg50Var != null) {
            o2d0.b bVar = new o2d0.b(nuwVar.c);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            hr80.H(this, oot.q, new nif(new bv1(4, nuwVar, ref$BooleanRef), 2));
            if (ref$BooleanRef.element || xkc.a(this)) {
                this.K = myc0.h(W1(), null, null, new f(sg50Var, bVar, this, null), 3);
            } else {
                this.H = bVar;
                myc0.h(W1(), null, null, new g(null, sg50Var, bVar), 3);
            }
        }
    }

    public final void s2(xlb0 xlb0Var) {
        boolean z;
        sg50 sg50Var = this.r;
        if (sg50Var != null) {
            o2d0.b bVar = new o2d0.b(xlb0Var.c);
            if (xlb0Var == null) {
                z = pot.a(this) != null;
            } else {
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                hr80.H(this, oot.q, new nif(new v53(4, xlb0Var, ref$BooleanRef), 2));
                z = ref$BooleanRef.element;
            }
            if (z || xkc.a(this)) {
                this.K = myc0.h(W1(), null, null, new h(sg50Var, bVar, this, null), 3);
            } else {
                this.D = bVar;
                myc0.h(W1(), null, null, new i(null, sg50Var, bVar), 3);
            }
        }
    }

    public final void t2() {
        if (this.C != null) {
            return;
        }
        guw guwVar = this.t ? this.z : this.s;
        if (guwVar != null) {
            if (this.r == null) {
                this.r = new tg50();
            }
            this.y.n2(this.r);
            htl a2 = guwVar.a(this.r);
            i2(a2);
            this.C = a2;
        }
    }

    public abstract boolean v2(KeyEvent keyEvent);

    public abstract void w2(KeyEvent keyEvent);

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r3.C == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x2(sg50 sg50Var, guw guwVar, boolean z, boolean z2, String str, plg0 plg0Var, gzs<s3q0> gzsVar) {
        boolean z3;
        htl htlVar;
        boolean z4 = true;
        if (epx.f(this.I, sg50Var)) {
            z3 = false;
        } else {
            n2();
            this.I = sg50Var;
            this.r = sg50Var;
            z3 = true;
        }
        if (!epx.f(this.s, guwVar)) {
            this.s = guwVar;
            z3 = true;
        }
        if (this.t != z) {
            this.t = z;
            if (z) {
                D1();
            }
            z3 = true;
        }
        boolean z5 = this.w;
        nxr nxrVar = this.y;
        if (z5 != z2) {
            if (z2) {
                i2(nxrVar);
            } else {
                j2(nxrVar);
                n2();
            }
            itl.f(this).R();
            this.w = z2;
        }
        if (!epx.f(this.u, str)) {
            this.u = str;
            itl.f(this).R();
        }
        if (!epx.f(this.v, plg0Var)) {
            this.v = plg0Var;
            itl.f(this).R();
        }
        this.x = gzsVar;
        boolean z6 = this.J;
        sg50 sg50Var2 = this.I;
        if (z6 != (sg50Var2 == null)) {
            boolean z7 = sg50Var2 == null;
            this.J = z7;
            if (!z7) {
            }
        }
        z4 = z3;
        if (z4 && ((htlVar = this.C) != null || !this.J)) {
            if (htlVar != null) {
                j2(htlVar);
            }
            this.C = null;
            t2();
        }
        nxrVar.n2(this.r);
    }

    public void u2() {
    }

    public void l2(tgi0 tgi0Var) {
    }
}
