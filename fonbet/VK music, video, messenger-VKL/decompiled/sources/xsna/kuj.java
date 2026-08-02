package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import xsna.a5x;
import xsna.cri;
import xsna.dak0;
import xsna.dt1;
import xsna.g1z;
import xsna.q630;
import xsna.us2;
import xsna.v4s;
import xsna.vgo0;

/* compiled from: CoreTextField.kt */
/* loaded from: classes11.dex */
public final class kuj {

    /* compiled from: CoreTextField.kt */
    public static final class a implements wv70 {
        public final /* synthetic */ long b;

        public a(long j) {
            this.b = j;
        }

        @Override // xsna.wv70
        public final long a() {
            return this.b;
        }
    }

    /* compiled from: CoreTextField.kt */
    public static final class b implements PointerInputEventHandler {
        public final /* synthetic */ zdo0 a;
        public final /* synthetic */ gho0 b;

        /* compiled from: CoreTextField.kt */
        @b6l(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ gho0 $manager;
            final /* synthetic */ zdo0 $observer;
            final /* synthetic */ dmb0 $this_pointerInput;
            private /* synthetic */ Object L$0;
            int label;

            /* compiled from: CoreTextField.kt */
            @b6l(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1074}, m = "invokeSuspend", v = 1)
            /* renamed from: xsna.kuj$b$a$a, reason: collision with other inner class name */
            public static final class C3207a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
                final /* synthetic */ zdo0 $observer;
                final /* synthetic */ dmb0 $this_pointerInput;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3207a(dmb0 dmb0Var, zdo0 zdo0Var, spj<? super C3207a> spjVar) {
                    super(2, spjVar);
                    this.$this_pointerInput = dmb0Var;
                    this.$observer = zdo0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    return new C3207a(this.$this_pointerInput, this.$observer, spjVar);
                }

                @Override // xsna.wzs
                public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                    return ((C3207a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.a.a(obj);
                        dmb0 dmb0Var = this.$this_pointerInput;
                        zdo0 zdo0Var = this.$observer;
                        this.label = 1;
                        if (m500.a(dmb0Var, zdo0Var, this) == coroutineSingletons) {
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

            /* compiled from: CoreTextField.kt */
            @b6l(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1077}, m = "invokeSuspend", v = 1)
            /* renamed from: xsna.kuj$b$a$b, reason: collision with other inner class name */
            public static final class C3208b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
                final /* synthetic */ gho0 $manager;
                final /* synthetic */ dmb0 $this_pointerInput;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3208b(dmb0 dmb0Var, gho0 gho0Var, spj<? super C3208b> spjVar) {
                    super(2, spjVar);
                    this.$this_pointerInput = dmb0Var;
                    this.$manager = gho0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    return new C3208b(this.$this_pointerInput, this.$manager, spjVar);
                }

                @Override // xsna.wzs
                public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                    return ((C3208b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.a.a(obj);
                        dmb0 dmb0Var = this.$this_pointerInput;
                        wpg wpgVar = new wpg(this.$manager, 6);
                        this.label = 1;
                        if (z2o0.e(dmb0Var, null, null, wpgVar, this, 7) == coroutineSingletons) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(dmb0 dmb0Var, zdo0 zdo0Var, gho0 gho0Var, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$this_pointerInput = dmb0Var;
                this.$observer = zdo0Var;
                this.$manager = gho0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(this.$this_pointerInput, this.$observer, this.$manager, spjVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                yvj yvjVar = (yvj) this.L$0;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                myc0.h(yvjVar, null, coroutineStart, new C3207a(this.$this_pointerInput, this.$observer, null), 1);
                myc0.h(yvjVar, null, coroutineStart, new C3208b(this.$this_pointerInput, this.$manager, null), 1);
                return s3q0.a;
            }
        }

        public b(zdo0 zdo0Var, gho0 gho0Var) {
            this.a = zdo0Var;
            this.b = gho0Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            Object d = zvj.d(new a(dmb0Var, this.a, this.b, null), spjVar);
            return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x03ba, code lost:
    
        if (r1.h == r9) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04a5, code lost:
    
        if (r31 > ((r10 != null ? r10.longValue() : 0) + 5000)) goto L245;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x061f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0668 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0766 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x07a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x07f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x082f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0879 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x089a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x08e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0436  */
    /* JADX WARN: Type inference failed for: r0v79, types: [xsna.q630] */
    /* JADX WARN: Type inference failed for: r9v58, types: [xsna.q630] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final tho0 tho0Var, final izs izsVar, final q630 q630Var, final nmo0 nmo0Var, final b6u0 b6u0Var, final izs izsVar2, final sg50 sg50Var, final rek0 rek0Var, final boolean z, final int i, final int i2, final rnw rnwVar, final uey ueyVar, final boolean z2, final boolean z3, final yzs yzsVar, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        int i5;
        int i6;
        androidx.compose.runtime.a aVar2;
        int i7;
        int i8;
        int i9;
        Object obj;
        xgo0 xgo0Var;
        klp0 klp0Var;
        azl azlVar;
        v4s.a aVar3;
        vvr vvrVar;
        spx0 spx0Var;
        androidx.compose.runtime.a aVar4;
        nmo0 nmo0Var2;
        uv70 uv70Var;
        Object j1zVar;
        us2 us2Var;
        boolean z4;
        vvr vvrVar2;
        boolean z5;
        boolean z6;
        boolean z7;
        sio0 sio0Var;
        tho0 b2;
        Object x;
        Object obj2;
        c3q0 c3q0Var;
        Object x2;
        Object x3;
        Object x4;
        int i10;
        int i11;
        rnw rnwVar2;
        boolean z8;
        c3q0 c3q0Var2;
        boolean z9;
        boolean y;
        Object obj3;
        int i12;
        f1z f1zVar;
        vvr vvrVar3;
        final j1z j1zVar2;
        Object obj4;
        rwr rwrVar;
        uv70 uv70Var2;
        yc8 yc8Var;
        tho0 tho0Var2;
        yvj yvjVar;
        boolean z10;
        mio0 mio0Var;
        rnw rnwVar3;
        j1z j1zVar3;
        boolean z11;
        boolean z12;
        Object fujVar;
        gho0 gho0Var;
        yvj yvjVar2;
        q630 q630Var2;
        rwr rwrVar2;
        s3q0 s3q0Var;
        final j1z j1zVar4;
        sg50 sg50Var2;
        wh50 wh50Var;
        final gho0 gho0Var2;
        final uv70 uv70Var3;
        spx0 spx0Var2;
        boolean J;
        Object x5;
        spx0 spx0Var3;
        final j1z j1zVar5;
        uv70 uv70Var4;
        q630.a aVar5;
        boolean y2;
        Object x6;
        boolean y3;
        Object x7;
        int i13;
        rnw rnwVar4;
        boolean z13;
        final boolean z14;
        boolean l;
        Object x8;
        yk8 rek0Var2;
        boolean y4;
        Object x9;
        boolean z15;
        final q630.a aVar6;
        androidx.compose.runtime.a M = aVar.M(31062401);
        if ((i3 & 6) == 0) {
            i5 = i3 | (M.J(tho0Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= M.J(nmo0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= M.J(b6u0Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= M.y(izsVar2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= M.J(sg50Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= M.J(rek0Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= M.l(z) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= M.o(i) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i14 = i5;
        if ((i4 & 6) == 0) {
            i6 = i4 | (M.o(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= M.J(rnwVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= M.J(ueyVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= M.l(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= M.l(z3) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= M.y(yzsVar) ? 131072 : 65536;
        }
        int i15 = i6 | 1572864;
        if (M.t(i14 & 1, ((i14 & 306783379) == 306783378 && (599187 & i15) == 599186) ? false : true)) {
            M.V();
            if ((i3 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(31062401, i14, i15, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
            }
            Object x10 = M.x();
            Object obj5 = a.C0011a.a;
            if (x10 == obj5) {
                x10 = new rwr();
                M.R(x10);
            }
            rwr rwrVar3 = (rwr) x10;
            Object x11 = M.x();
            if (x11 == obj5) {
                g1z.a aVar7 = g1z.a;
                x11 = new na2();
                M.R(x11);
            }
            f1z f1zVar2 = (f1z) x11;
            Object x12 = M.x();
            if (x12 == obj5) {
                x12 = new mio0(f1zVar2);
                M.R(x12);
            }
            final mio0 mio0Var2 = (mio0) x12;
            azl azlVar2 = (azl) M.r(uvi.h);
            v4s.a aVar8 = (v4s.a) M.r(uvi.k);
            long j = ((qlo0) M.r(rlo0.a)).b;
            vvr vvrVar4 = (vvr) M.r(uvi.i);
            spx0 spx0Var4 = (spx0) M.r(uvi.u);
            nek0 nek0Var = (nek0) M.r(uvi.q);
            Orientation orientation = (i == 1 && !z && rnwVar.a) ? Orientation.Horizontal : Orientation.Vertical;
            M.K(-213744626);
            Object[] objArr = {orientation};
            fh9 fh9Var = xgo0.g;
            boolean o = M.o(orientation.ordinal());
            Object x13 = M.x();
            if (o || x13 == obj5) {
                i7 = i14;
                x13 = new g4x0(orientation, 1);
                M.R(x13);
            } else {
                i7 = i14;
            }
            xgo0 xgo0Var2 = (xgo0) crx0.D(objArr, fh9Var, (gzs) x13, M, 0);
            M.j();
            if (((Orientation) ((zak0) xgo0Var2.f).getValue()) != orientation) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(orientation == Orientation.Vertical ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i16 = i7 & 14;
            boolean z16 = ((i7 & 57344) == 16384) | (i16 == 4);
            Object x14 = M.x();
            if (z16 || x14 == obj5) {
                klp0 a2 = yir0.a(b6u0Var, tho0Var.a);
                uv70 uv70Var5 = a2.b;
                qko0 qko0Var = tho0Var.c;
                if (qko0Var != null) {
                    i8 = i15;
                    long j2 = qko0Var.a;
                    int i17 = qko0.c;
                    int b3 = uv70Var5.b((int) (j2 >> 32));
                    int b4 = uv70Var5.b((int) (j2 & 4294967295L));
                    int min = Math.min(b3, b4);
                    int max = Math.max(b3, b4);
                    us2.b bVar = new us2.b(a2.a);
                    bVar.d(new hik0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, pdo0.c, null, 61439), min, max);
                    x14 = new klp0(bVar.n(), uv70Var5);
                } else {
                    i8 = i15;
                    x14 = a2;
                }
                M.R(x14);
            } else {
                i8 = i15;
            }
            klp0 klp0Var2 = (klp0) x14;
            us2 us2Var2 = klp0Var2.a;
            uv70 uv70Var6 = klp0Var2.b;
            vef0 o2 = n34.o(M);
            boolean J2 = M.J(nek0Var);
            Object x15 = M.x();
            if (J2 || x15 == obj5) {
                i9 = i16;
                obj = obj5;
                xgo0Var = xgo0Var2;
                klp0Var = klp0Var2;
                azlVar = azlVar2;
                aVar3 = aVar8;
                vvrVar = vvrVar4;
                spx0Var = spx0Var4;
                aVar4 = M;
                nmo0Var2 = nmo0Var;
                uv70Var = uv70Var6;
                us2Var = us2Var2;
                z4 = z;
                j1zVar = new j1z(new sdo0(us2Var, nmo0Var2, z4, azlVar, aVar3, EmptyList.b), o2, nek0Var);
                aVar4.R(j1zVar);
            } else {
                obj = obj5;
                i9 = i16;
                xgo0Var = xgo0Var2;
                klp0Var = klp0Var2;
                azlVar = azlVar2;
                aVar3 = aVar8;
                vvrVar = vvrVar4;
                spx0Var = spx0Var4;
                nmo0Var2 = nmo0Var;
                aVar4 = M;
                uv70Var = uv70Var6;
                j1zVar = x15;
                us2Var = us2Var2;
                z4 = z;
            }
            j1z j1zVar6 = (j1z) j1zVar;
            us2 us2Var3 = tho0Var.a;
            long j3 = tho0Var.b;
            j1zVar6.u = izsVar;
            j1zVar6.z = j;
            sey seyVar = j1zVar6.r;
            seyVar.b = ueyVar;
            seyVar.c = vvrVar;
            j1zVar6.j = us2Var3;
            sdo0 sdo0Var = j1zVar6.a;
            EmptyList emptyList = EmptyList.b;
            if (epx.f(sdo0Var.a, us2Var) && epx.f(sdo0Var.b, nmo0Var2) && sdo0Var.e == z4) {
                vvrVar2 = vvrVar;
                if (sdo0Var.f == 1) {
                    if (sdo0Var.c == Integer.MAX_VALUE) {
                        if (sdo0Var.d == 1) {
                            if (epx.f(sdo0Var.g, azlVar)) {
                                if (epx.f(sdo0Var.i, emptyList)) {
                                }
                            }
                        }
                    }
                }
            } else {
                vvrVar2 = vvrVar;
            }
            sdo0Var = new sdo0(us2Var, nmo0Var2, z4, azlVar, aVar3, emptyList);
            nmo0 nmo0Var3 = nmo0Var2;
            final xgo0 xgo0Var3 = xgo0Var;
            final azl azlVar3 = azlVar;
            if (j1zVar6.a != sdo0Var) {
                z5 = true;
                j1zVar6.p = true;
            } else {
                z5 = true;
            }
            j1zVar6.a = sdo0Var;
            cwm cwmVar = j1zVar6.d;
            sio0 sio0Var2 = j1zVar6.e;
            cwmVar.getClass();
            qko0 qko0Var2 = tho0Var.c;
            boolean f = epx.f(qko0Var2, ((c2p) cwmVar.c).c());
            String str = ((tho0) cwmVar.b).a.c;
            us2 us2Var4 = tho0Var.a;
            if (!epx.f(str, us2Var4.c)) {
                cwmVar.c = new c2p(us2Var4, j3);
                z6 = z5;
            } else if (qko0.b(((tho0) cwmVar.b).b, j3)) {
                z6 = false;
            } else {
                ((c2p) cwmVar.c).h(qko0.f(j3), qko0.e(j3));
                z7 = z5;
                z6 = false;
                if (qko0Var2 != null) {
                    c2p c2pVar = (c2p) cwmVar.c;
                    c2pVar.d = -1;
                    c2pVar.e = -1;
                    sio0Var = sio0Var2;
                } else {
                    sio0Var = sio0Var2;
                    long j4 = qko0Var2.a;
                    if (!qko0.c(j4)) {
                        ((c2p) cwmVar.c).g(qko0.f(j4), qko0.e(j4));
                    }
                }
                if (z6 && (z7 || f)) {
                    b2 = tho0Var;
                } else {
                    c2p c2pVar2 = (c2p) cwmVar.c;
                    c2pVar2.d = -1;
                    c2pVar2.e = -1;
                    b2 = tho0.b(tho0Var, null, 0L, 3);
                }
                tho0 tho0Var3 = (tho0) cwmVar.b;
                cwmVar.b = b2;
                if (sio0Var != null) {
                    sio0Var.a(tho0Var3, b2);
                }
                x = aVar4.x();
                obj2 = obj;
                if (x != obj2) {
                    x = new c3q0(0);
                    aVar4.R(x);
                }
                c3q0Var = (c3q0) x;
                long currentTimeMillis = System.currentTimeMillis();
                if (!c3q0Var.f) {
                    Long l2 = c3q0Var.e;
                }
                c3q0Var.e = Long.valueOf(currentTimeMillis);
                c3q0Var.a(tho0Var);
                x2 = aVar4.x();
                if (x2 == obj2) {
                    x2 = bap.j(EmptyCoroutineContext.b, aVar4);
                    aVar4.R(x2);
                }
                final yvj yvjVar3 = (yvj) x2;
                x3 = aVar4.x();
                if (x3 == obj2) {
                    x3 = new bd8();
                    aVar4.R(x3);
                }
                final yc8 yc8Var2 = (yc8) x3;
                x4 = aVar4.x();
                if (x4 == obj2) {
                    x4 = new gho0(c3q0Var);
                    aVar4.R(x4);
                }
                final gho0 gho0Var3 = (gho0) x4;
                final uv70 uv70Var7 = uv70Var;
                gho0Var3.b = uv70Var7;
                gho0Var3.f = b6u0Var;
                gho0Var3.c = j1zVar6.v;
                gho0Var3.d = j1zVar6;
                ((zak0) gho0Var3.e).setValue(tho0Var);
                gho0Var3.x = new qko0(j3);
                gho0Var3.h = (wfd) aVar4.r(uvi.f);
                gho0Var3.i = yvjVar3;
                gho0Var3.k = (ymo0) aVar4.r(uvi.r);
                gho0Var3.l = (vtu) aVar4.r(uvi.l);
                gho0Var3.m = rwrVar3;
                final boolean z17 = !z3;
                ((zak0) gho0Var3.n).setValue(Boolean.valueOf(z17));
                ((zak0) gho0Var3.o).setValue(Boolean.valueOf(z2));
                aVar4.K(1966756105);
                gho0Var3.j = gua0.b(SelectedTextType.EditableText, nmo0Var3.a.k, aVar4, 6);
                aVar4.j();
                j1zVar6.b();
                i10 = i8;
                int i18 = i10 & 7168;
                int i19 = i9;
                boolean y5 = (i18 != 2048) | aVar4.y(j1zVar6) | ((i10 & 57344) != 16384) | aVar4.y(mio0Var2) | (i19 != 4);
                i11 = (i10 & 112) ^ 48;
                if (i11 <= 32) {
                    rnwVar2 = rnwVar;
                    if (aVar4.J(rnwVar2)) {
                        z8 = y5;
                        c3q0Var2 = c3q0Var;
                        z9 = true;
                        y = z8 | z9 | aVar4.y(uv70Var7) | aVar4.y(yvjVar3) | aVar4.y(yc8Var2) | aVar4.y(gho0Var3);
                        Object x16 = aVar4.x();
                        if (!y || x16 == obj2) {
                            i12 = i19;
                            f1zVar = f1zVar2;
                            vvrVar3 = vvrVar2;
                            j1zVar2 = j1zVar6;
                            obj4 = obj2;
                            final rnw rnwVar5 = rnwVar2;
                            rwrVar = rwrVar3;
                            obj3 = new izs() { // from class: xsna.ytj
                                @Override // xsna.izs
                                public final Object invoke(Object obj6) {
                                    mjo0 d;
                                    xwr xwrVar = (xwr) obj6;
                                    j1z j1zVar7 = j1z.this;
                                    if (j1zVar7.b() == xwrVar.h()) {
                                        return s3q0.a;
                                    }
                                    ((zak0) j1zVar7.f).setValue(Boolean.valueOf(xwrVar.h()));
                                    boolean b5 = j1zVar7.b();
                                    tho0 tho0Var4 = tho0Var;
                                    uv70 uv70Var8 = uv70Var7;
                                    if (b5 && z2 && !z3) {
                                        kuj.g(mio0Var2, j1zVar7, tho0Var4, rnwVar5, uv70Var8);
                                    } else {
                                        kuj.e(j1zVar7);
                                    }
                                    if (xwrVar.h() && (d = j1zVar7.d()) != null) {
                                        myc0.h(yvjVar3, null, null, new huj(yc8Var2, tho0Var4, j1zVar7, d, uv70Var8, null), 3);
                                    }
                                    if (!xwrVar.h()) {
                                        gho0Var3.i(null);
                                    }
                                    return s3q0.a;
                                }
                            };
                            uv70Var2 = uv70Var7;
                            yc8Var = yc8Var2;
                            tho0Var2 = tho0Var;
                            gho0Var3 = gho0Var3;
                            yvjVar = yvjVar3;
                            z10 = z2;
                            mio0Var = mio0Var2;
                            rnwVar3 = rnwVar5;
                            aVar4.R(obj3);
                        } else {
                            obj3 = x16;
                            mio0Var = mio0Var2;
                            yc8Var = yc8Var2;
                            i12 = i19;
                            f1zVar = f1zVar2;
                            vvrVar3 = vvrVar2;
                            j1zVar2 = j1zVar6;
                            yvjVar = yvjVar3;
                            uv70Var2 = uv70Var7;
                            obj4 = obj2;
                            rnwVar3 = rnwVar2;
                            tho0Var2 = tho0Var;
                            rwrVar = rwrVar3;
                            z10 = z2;
                        }
                        q630.a aVar9 = q630.a.a;
                        q630 a3 = mxr.a(fvr.u(jvi.d(aVar9, rwrVar), (izs) obj3), z10, sg50Var);
                        wh50 c = androidx.compose.runtime.k.c(Boolean.valueOf((z10 || z3) ? false : true), aVar4, 0);
                        s3q0 s3q0Var2 = s3q0.a;
                        boolean J3 = aVar4.J(c) | aVar4.y(j1zVar2) | aVar4.y(mio0Var) | aVar4.y(gho0Var3);
                        if (i11 > 32 || !aVar4.J(rnwVar3)) {
                            j1zVar3 = j1zVar2;
                            if ((i10 & 48) != 32) {
                                z11 = false;
                                z12 = J3 | z11;
                                Object x17 = aVar4.x();
                                if (!z12 || x17 == obj4) {
                                    mio0 mio0Var3 = mio0Var;
                                    gho0 gho0Var4 = gho0Var3;
                                    rnw rnwVar6 = rnwVar3;
                                    gho0Var = gho0Var4;
                                    yvjVar2 = yvjVar;
                                    q630Var2 = a3;
                                    rwrVar2 = rwrVar;
                                    s3q0Var = s3q0Var2;
                                    j1zVar4 = j1zVar3;
                                    sg50Var2 = sg50Var;
                                    fujVar = new fuj(j1zVar4, c, mio0Var3, gho0Var, rnwVar6, null);
                                    wh50Var = c;
                                    mio0Var = mio0Var3;
                                    aVar4.R(fujVar);
                                } else {
                                    yvjVar2 = yvjVar;
                                    q630Var2 = a3;
                                    fujVar = x17;
                                    gho0Var = gho0Var3;
                                    rwrVar2 = rwrVar;
                                    s3q0Var = s3q0Var2;
                                    j1zVar4 = j1zVar3;
                                    sg50Var2 = sg50Var;
                                    wh50Var = c;
                                }
                                bap.g(s3q0Var, (wzs) fujVar, aVar4, 6);
                                int i20 = i10 >> 3;
                                int i21 = (i20 & 896) | 196614 | ((i7 >> 9) & 7168) | ((i10 << 6) & 3670016);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(2147130620, i21, -1, "androidx.compose.foundation.text.textFieldPointer (TextFieldPointerModifier.android.kt:35)");
                                }
                                q630 b5 = skn0.b(aVar9, 8675309, new edi0(new ujm0(j1zVar4, 3)));
                                gho0Var2 = gho0Var;
                                uv70Var3 = uv70Var2;
                                q630 q630Var3 = q630Var2;
                                mio0 mio0Var4 = mio0Var;
                                final rwr rwrVar4 = rwrVar2;
                                q630 g = (z2 ? qri.a(b5, a5x.a, new rgo0(0, new izs() { // from class: xsna.ogo0
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj6) {
                                        nek0 nek0Var2;
                                        ov70 ov70Var = (ov70) obj6;
                                        j1z j1zVar7 = j1z.this;
                                        if (!j1zVar7.b()) {
                                            rwr.b(rwrVar4);
                                        } else if (!z3 && (nek0Var2 = j1zVar7.c) != null) {
                                            nek0Var2.show();
                                        }
                                        if (j1zVar7.b() && z2) {
                                            if (j1zVar7.a() != HandleState.Selection) {
                                                mjo0 d = j1zVar7.d();
                                                if (d != null) {
                                                    long j5 = ov70Var.a;
                                                    cwm cwmVar2 = j1zVar7.d;
                                                    bzw bzwVar = j1zVar7.v;
                                                    int a4 = uv70Var3.a(d.b(j5, true));
                                                    bzwVar.invoke(tho0.b((tho0) cwmVar2.b, null, jgz.c(a4, a4), 5));
                                                    if (j1zVar7.a.a.c.length() > 0) {
                                                        ((zak0) j1zVar7.k).setValue(HandleState.Cursor);
                                                    }
                                                }
                                            } else {
                                                gho0Var2.i(ov70Var);
                                            }
                                        }
                                        return s3q0.a;
                                    }
                                }, sg50Var2)) : b5).g(new okn0(gho0Var2.B, gho0Var2.A, null, new pgo0(gho0Var2), 4));
                                ulb0.a.getClass();
                                q630 c2 = e7b0.c(g, y000.c);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                final q630 c3 = bu00.c(aVar9, new wyg(j1zVar4, tho0Var2, uv70Var3, 1));
                                boolean y6 = aVar4.y(j1zVar4) | (i18 == 2048);
                                spx0Var2 = spx0Var;
                                int i22 = i12;
                                J = y6 | aVar4.J(spx0Var2) | aVar4.y(gho0Var2) | (i22 == 4) | aVar4.y(uv70Var3);
                                x5 = aVar4.x();
                                if (!J || x5 == obj4) {
                                    zm0 zm0Var = new zm0(j1zVar4, z2, spx0Var2, gho0Var2, tho0Var2, uv70Var3);
                                    spx0Var3 = spx0Var2;
                                    aVar4.R(zm0Var);
                                    x5 = zm0Var;
                                } else {
                                    spx0Var3 = spx0Var2;
                                }
                                final q630 o3 = egi.o(aVar9, (izs) x5);
                                j1z j1zVar7 = j1zVar4;
                                muj mujVar = new muj(klp0Var, tho0Var, j1zVar7, z3, z2, uv70Var3, gho0Var2, rnwVar, rwrVar2);
                                j1zVar5 = j1zVar7;
                                if (!z2 && !z3 && spx0Var3.b() && qko0.c(((qko0) ((zak0) j1zVar5.A).getValue()).a) && qko0.c(((qko0) ((zak0) j1zVar5.B).getValue()).a)) {
                                    okl0 okl0Var = new okl0(rek0Var, j1zVar5, tho0Var, uv70Var3, 1);
                                    j1zVar5 = j1zVar5;
                                    uv70Var4 = uv70Var3;
                                    aVar5 = qri.a(aVar9, a5x.a, okl0Var);
                                } else {
                                    uv70Var4 = uv70Var3;
                                    aVar5 = aVar9;
                                }
                                y2 = aVar4.y(gho0Var2);
                                x6 = aVar4.x();
                                if (!y2 || x6 == obj4) {
                                    x6 = new omf(gho0Var2, 8);
                                    aVar4.R(x6);
                                }
                                bap.c(gho0Var2, (izs) x6, aVar4, 0);
                                y3 = aVar4.y(j1zVar5) | aVar4.y(mio0Var4) | (i22 == 4) | ((i11 <= 32 && aVar4.J(rnwVar)) || (i10 & 48) == 32);
                                x7 = aVar4.x();
                                if (!y3 || x7 == obj4) {
                                    i13 = 8;
                                    ztj ztjVar = new ztj(j1zVar5, mio0Var4, tho0Var, rnwVar, 0);
                                    rnwVar4 = rnwVar;
                                    aVar4.R(ztjVar);
                                    x7 = ztjVar;
                                } else {
                                    i13 = 8;
                                    rnwVar4 = rnwVar;
                                }
                                bap.c(rnwVar4, (izs) x7, aVar4, i20 & 14);
                                final bzw bzwVar = j1zVar5.v;
                                final boolean z18 = i == 1;
                                final uv70 uv70Var8 = uv70Var4;
                                final int i23 = rnwVar4.e;
                                z13 = true;
                                final c3q0 c3q0Var3 = c3q0Var2;
                                yzs yzsVar2 = new yzs() { // from class: xsna.hgo0
                                    @Override // xsna.yzs
                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                        androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj7;
                                        int intValue = ((Integer) obj8).intValue();
                                        aVar10.K(851809892);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(851809892, intValue, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:256)");
                                        }
                                        Object x18 = aVar10.x();
                                        a.C0011a.C0012a c0012a = a.C0011a.a;
                                        if (x18 == c0012a) {
                                            x18 = new pko0();
                                            aVar10.R(x18);
                                        }
                                        pko0 pko0Var = (pko0) x18;
                                        Object x19 = aVar10.x();
                                        if (x19 == c0012a) {
                                            x19 = new h2l();
                                            aVar10.R(x19);
                                        }
                                        ggo0 ggo0Var = new ggo0(j1z.this, gho0Var2, tho0Var, z17, z18, pko0Var, uv70Var8, c3q0Var3, (h2l) x19, bzwVar, i23);
                                        boolean y7 = aVar10.y(ggo0Var);
                                        Object x20 = aVar10.x();
                                        if (y7 || x20 == c0012a) {
                                            odg odgVar = new odg(1, ggo0Var, ggo0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 7);
                                            aVar10.R(odgVar);
                                            x20 = odgVar;
                                        }
                                        q630 o4 = sdi.o(q630.a.a, (izs) ((fcy) x20));
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        aVar10.j();
                                        return o4;
                                    }
                                };
                                a5x.a aVar10 = a5x.a;
                                q630 a4 = qri.a(aVar9, aVar10, yzsVar2);
                                int i24 = rnwVar4.d;
                                z14 = (i24 == 7 || i24 == i13) ? false : true;
                                boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                                final f1z f1zVar3 = f1zVar;
                                l = aVar4.l(z14) | aVar4.y(f1zVar3);
                                x8 = aVar4.x();
                                if (!l || x8 == obj4) {
                                    x8 = new gzs() { // from class: xsna.auj
                                        @Override // xsna.gzs
                                        public final Object invoke() {
                                            if (z14) {
                                                f1zVar3.i();
                                            }
                                            return s3q0.a;
                                        }
                                    };
                                    aVar4.R(x8);
                                }
                                q630 a5 = mtm0.a((gzs) x8, booleanValue, z14);
                                yk8 yk8Var = (yk8) aVar4.r(ko5.a);
                                long j5 = ((l5g) aVar4.r(ko5.b)).a;
                                rek0Var2 = l5g.d(j5, f870.c(1308617531)) ? new rek0(j5) : yk8Var;
                                y4 = aVar4.y(j1zVar5) | aVar4.J(rek0Var2);
                                x9 = aVar4.x();
                                if (!y4 || x9 == obj4) {
                                    x9 = new bi0(13, j1zVar5, rek0Var2);
                                    aVar4.R(x9);
                                }
                                q630 f2 = bu00.f(aVar9, (izs) x9);
                                if (androidx.compose.runtime.b.d()) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                    androidx.compose.runtime.b.f(-73012098, 0, -1, "androidx.compose.foundation.text.rememberTextFieldOverscrollEffect (TextFieldScroll.android.kt:37)");
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                q630 k = a020.k(egi.o(qri.a(sdi.p(sdi.p(p490.t(q630Var.g(f2), f1zVar3, j1zVar5, gho0Var2).g(a5).g(q630Var3), new tfo0(vvrVar3, j1zVar5)), new luj(j1zVar5, gho0Var2)).g(a4), aVar10, new yzs() { // from class: xsna.ugo0
                                    @Override // xsna.yzs
                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                        xgo0 xgo0Var4 = xgo0.this;
                                        wh50 wh50Var2 = xgo0Var4.f;
                                        androidx.compose.runtime.a aVar11 = (androidx.compose.runtime.a) obj7;
                                        int intValue = ((Integer) obj8).intValue();
                                        aVar11.K(-2137546592);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-2137546592, intValue, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:76)");
                                        }
                                        boolean z19 = ((Orientation) ((zak0) wh50Var2).getValue()) == Orientation.Vertical || !(aVar11.r(uvi.n) == LayoutDirection.Rtl);
                                        boolean J4 = aVar11.J(xgo0Var4);
                                        Object x18 = aVar11.x();
                                        Object obj9 = a.C0011a.a;
                                        if (J4 || x18 == obj9) {
                                            x18 = new u2k0(xgo0Var4, 11);
                                            aVar11.R(x18);
                                        }
                                        khh0 C = m4s.C((izs) x18, aVar11, 0);
                                        boolean J5 = aVar11.J(C) | aVar11.J(xgo0Var4);
                                        Object x19 = aVar11.x();
                                        if (J5 || x19 == obj9) {
                                            x19 = new wgo0(C, xgo0Var4);
                                            aVar11.R(x19);
                                        }
                                        q630 c4 = ahh0.c(q630.a.a, (wgo0) x19, (Orientation) ((zak0) wh50Var2).getValue(), z2 && ((vak0) xgo0Var4.b).getFloatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z19, sg50Var, 160);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        aVar11.j();
                                        return c4;
                                    }
                                }).g(c2).g(mujVar), new vl1(j1zVar5, 22)), new h08(12, gho0Var2, yvjVar2));
                                if (z2 || !j1zVar5.b() || !((Boolean) ((zak0) j1zVar5.q).getValue()).booleanValue() || !spx0Var3.b()) {
                                    z13 = z15;
                                }
                                if (z13) {
                                    aVar6 = aVar9;
                                } else {
                                    sgi0<gzs<ov70>> sgi0Var = oc00.a;
                                    aVar6 = qri.a(aVar9, aVar10, new ze4(gho0Var2, 6));
                                }
                                final boolean z19 = z13;
                                final yc8 yc8Var3 = yc8Var;
                                final q630.a aVar11 = aVar5;
                                final j1z j1zVar8 = j1zVar5;
                                aVar2 = aVar4;
                                b(k, gho0Var2, kai.c(-814563849, new wzs() { // from class: xsna.wtj
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj6, Object obj7) {
                                        androidx.compose.runtime.a aVar12 = (androidx.compose.runtime.a) obj6;
                                        int intValue = ((Integer) obj7).intValue();
                                        if (aVar12.t(intValue & 1, (intValue & 3) != 2)) {
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(-814563849, intValue, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:548)");
                                            }
                                            final j1z j1zVar9 = j1zVar8;
                                            final nmo0 nmo0Var4 = nmo0Var;
                                            final int i25 = i2;
                                            final int i26 = i;
                                            final xgo0 xgo0Var4 = xgo0Var3;
                                            final tho0 tho0Var4 = tho0Var;
                                            final b6u0 b6u0Var2 = b6u0Var;
                                            final q630 q630Var4 = aVar11;
                                            final q630 q630Var5 = c3;
                                            final q630 q630Var6 = o3;
                                            final q630 q630Var7 = aVar6;
                                            final yc8 yc8Var4 = yc8Var3;
                                            final gho0 gho0Var5 = gho0Var2;
                                            final boolean z20 = z19;
                                            final boolean z21 = z3;
                                            final izs izsVar3 = izsVar2;
                                            final uv70 uv70Var9 = uv70Var8;
                                            final azl azlVar4 = azlVar3;
                                            yzs.this.invoke(kai.c(-44346382, new wzs() { // from class: xsna.buj
                                                @Override // xsna.wzs
                                                public final Object invoke(Object obj8, Object obj9) {
                                                    q630 apr0Var;
                                                    androidx.compose.runtime.a aVar13 = (androidx.compose.runtime.a) obj8;
                                                    int intValue2 = ((Integer) obj9).intValue();
                                                    if (aVar13.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(-44346382, intValue2, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:551)");
                                                        }
                                                        final j1z j1zVar10 = j1z.this;
                                                        q630 j6 = txj0.j(((pco) ((zak0) j1zVar10.g).getValue()).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
                                                        int i27 = i25;
                                                        final int i28 = i26;
                                                        u1v.a(i27, i28);
                                                        nmo0 nmo0Var5 = nmo0Var4;
                                                        if (i27 != 1 || i28 != Integer.MAX_VALUE) {
                                                            j6 = j6.g(new t1v(nmo0Var5, i27, i28));
                                                        }
                                                        boolean y7 = aVar13.y(j1zVar10);
                                                        Object x18 = aVar13.x();
                                                        if (y7 || x18 == a.C0011a.a) {
                                                            x18 = new trf(j1zVar10, 12);
                                                            aVar13.R(x18);
                                                        }
                                                        gzs gzsVar = (gzs) x18;
                                                        xgo0 xgo0Var5 = xgo0Var4;
                                                        Orientation orientation2 = (Orientation) ((zak0) xgo0Var5.f).getValue();
                                                        final tho0 tho0Var5 = tho0Var4;
                                                        long j7 = tho0Var5.b;
                                                        int i29 = qko0.c;
                                                        int i30 = (int) (j7 >> 32);
                                                        long j8 = xgo0Var5.e;
                                                        if (i30 == ((int) (j8 >> 32)) && (i30 = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                                                            i30 = qko0.f(j7);
                                                        }
                                                        xgo0Var5.e = tho0Var5.b;
                                                        klp0 a6 = yir0.a(b6u0Var2, tho0Var5.a);
                                                        int i31 = vgo0.a.$EnumSwitchMapping$0[orientation2.ordinal()];
                                                        if (i31 == 1) {
                                                            apr0Var = new apr0(xgo0Var5, i30, a6, gzsVar);
                                                        } else {
                                                            if (i31 != 2) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            apr0Var = new pfv(xgo0Var5, i30, a6, gzsVar);
                                                        }
                                                        q630 s = fo50.s(rte0.e(j6).g(apr0Var).g(q630Var4).g(q630Var5).g(new rho0(nmo0Var5)).g(q630Var6).g(q630Var7), yc8Var4);
                                                        final gho0 gho0Var6 = gho0Var5;
                                                        final boolean z22 = z20;
                                                        final boolean z23 = z21;
                                                        final izs izsVar4 = izsVar3;
                                                        final uv70 uv70Var10 = uv70Var9;
                                                        final azl azlVar5 = azlVar4;
                                                        frj0.a(s, kai.c(1412697320, new wzs() { // from class: xsna.cuj
                                                            @Override // xsna.wzs
                                                            public final Object invoke(Object obj10, Object obj11) {
                                                                androidx.compose.runtime.a aVar14 = (androidx.compose.runtime.a) obj10;
                                                                int intValue3 = ((Integer) obj11).intValue();
                                                                if (aVar14.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.f(1412697320, intValue3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:572)");
                                                                    }
                                                                    j1z j1zVar11 = j1zVar10;
                                                                    guj gujVar = new guj(j1zVar11, izsVar4, tho0Var5, uv70Var10, azlVar5, i28);
                                                                    int hashCode = Long.hashCode(n34.n(aVar14));
                                                                    sy90 D = aVar14.D();
                                                                    q630 c4 = qri.c(aVar14, q630.a.a);
                                                                    cri.h7.getClass();
                                                                    LayoutNode.a aVar15 = cri.a.b;
                                                                    if (aVar14.N() == null) {
                                                                        n34.r();
                                                                        throw null;
                                                                    }
                                                                    aVar14.H();
                                                                    if (aVar14.L()) {
                                                                        aVar14.I(aVar15);
                                                                    } else {
                                                                        aVar14.f();
                                                                    }
                                                                    k9q0.w(aVar14, gujVar, cri.a.f);
                                                                    k9q0.w(aVar14, D, cri.a.e);
                                                                    k9q0.w(aVar14, Integer.valueOf(hashCode), cri.a.g);
                                                                    k9q0.t(aVar14, cri.a.h);
                                                                    k9q0.w(aVar14, c4, cri.a.d);
                                                                    aVar14.G();
                                                                    HandleState a7 = j1zVar11.a();
                                                                    HandleState handleState = HandleState.None;
                                                                    boolean z24 = z22;
                                                                    boolean z25 = a7 != handleState && j1zVar11.c() != null && j1zVar11.c().e() && z24;
                                                                    gho0 gho0Var7 = gho0.this;
                                                                    kuj.c(gho0Var7, z25, aVar14, 0);
                                                                    if (j1zVar11.a() == HandleState.Cursor && !z23 && z24) {
                                                                        aVar14.K(-714666198);
                                                                        kuj.d(gho0Var7, aVar14, 0);
                                                                        aVar14.j();
                                                                    } else {
                                                                        aVar14.K(-714589318);
                                                                        aVar14.j();
                                                                    }
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.e();
                                                                    }
                                                                } else {
                                                                    aVar14.h();
                                                                }
                                                                return s3q0.a;
                                                            }
                                                        }, aVar13), aVar13, 48);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                    } else {
                                                        aVar13.h();
                                                    }
                                                    return s3q0.a;
                                                }
                                            }, aVar12), aVar12, 6);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                        } else {
                                            aVar12.h();
                                        }
                                        return s3q0.a;
                                    }
                                }, aVar2), aVar2, 384);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            }
                        } else {
                            j1zVar3 = j1zVar2;
                        }
                        z11 = true;
                        z12 = J3 | z11;
                        Object x172 = aVar4.x();
                        if (z12) {
                        }
                        mio0 mio0Var32 = mio0Var;
                        gho0 gho0Var42 = gho0Var3;
                        rnw rnwVar62 = rnwVar3;
                        gho0Var = gho0Var42;
                        yvjVar2 = yvjVar;
                        q630Var2 = a3;
                        rwrVar2 = rwrVar;
                        s3q0Var = s3q0Var2;
                        j1zVar4 = j1zVar3;
                        sg50Var2 = sg50Var;
                        fujVar = new fuj(j1zVar4, c, mio0Var32, gho0Var, rnwVar62, null);
                        wh50Var = c;
                        mio0Var = mio0Var32;
                        aVar4.R(fujVar);
                        bap.g(s3q0Var, (wzs) fujVar, aVar4, 6);
                        int i202 = i10 >> 3;
                        int i212 = (i202 & 896) | 196614 | ((i7 >> 9) & 7168) | ((i10 << 6) & 3670016);
                        if (androidx.compose.runtime.b.d()) {
                        }
                        q630 b52 = skn0.b(aVar9, 8675309, new edi0(new ujm0(j1zVar4, 3)));
                        gho0Var2 = gho0Var;
                        uv70Var3 = uv70Var2;
                        q630 q630Var32 = q630Var2;
                        mio0 mio0Var42 = mio0Var;
                        final rwr rwrVar42 = rwrVar2;
                        q630 g2 = (z2 ? qri.a(b52, a5x.a, new rgo0(0, new izs() { // from class: xsna.ogo0
                            @Override // xsna.izs
                            public final Object invoke(Object obj6) {
                                nek0 nek0Var2;
                                ov70 ov70Var = (ov70) obj6;
                                j1z j1zVar72 = j1z.this;
                                if (!j1zVar72.b()) {
                                    rwr.b(rwrVar42);
                                } else if (!z3 && (nek0Var2 = j1zVar72.c) != null) {
                                    nek0Var2.show();
                                }
                                if (j1zVar72.b() && z2) {
                                    if (j1zVar72.a() != HandleState.Selection) {
                                        mjo0 d = j1zVar72.d();
                                        if (d != null) {
                                            long j52 = ov70Var.a;
                                            cwm cwmVar2 = j1zVar72.d;
                                            bzw bzwVar2 = j1zVar72.v;
                                            int a42 = uv70Var3.a(d.b(j52, true));
                                            bzwVar2.invoke(tho0.b((tho0) cwmVar2.b, null, jgz.c(a42, a42), 5));
                                            if (j1zVar72.a.a.c.length() > 0) {
                                                ((zak0) j1zVar72.k).setValue(HandleState.Cursor);
                                            }
                                        }
                                    } else {
                                        gho0Var2.i(ov70Var);
                                    }
                                }
                                return s3q0.a;
                            }
                        }, sg50Var2)) : b52).g(new okn0(gho0Var2.B, gho0Var2.A, null, new pgo0(gho0Var2), 4));
                        ulb0.a.getClass();
                        q630 c22 = e7b0.c(g2, y000.c);
                        if (androidx.compose.runtime.b.d()) {
                        }
                        final q630 c32 = bu00.c(aVar9, new wyg(j1zVar4, tho0Var2, uv70Var3, 1));
                        boolean y62 = aVar4.y(j1zVar4) | (i18 == 2048);
                        spx0Var2 = spx0Var;
                        int i222 = i12;
                        J = y62 | aVar4.J(spx0Var2) | aVar4.y(gho0Var2) | (i222 == 4) | aVar4.y(uv70Var3);
                        x5 = aVar4.x();
                        if (J) {
                        }
                        zm0 zm0Var2 = new zm0(j1zVar4, z2, spx0Var2, gho0Var2, tho0Var2, uv70Var3);
                        spx0Var3 = spx0Var2;
                        aVar4.R(zm0Var2);
                        x5 = zm0Var2;
                        final q630 o32 = egi.o(aVar9, (izs) x5);
                        j1z j1zVar72 = j1zVar4;
                        muj mujVar2 = new muj(klp0Var, tho0Var, j1zVar72, z3, z2, uv70Var3, gho0Var2, rnwVar, rwrVar2);
                        j1zVar5 = j1zVar72;
                        if (!z2 && !z3 && spx0Var3.b() && qko0.c(((qko0) ((zak0) j1zVar5.A).getValue()).a) && qko0.c(((qko0) ((zak0) j1zVar5.B).getValue()).a)) {
                        }
                        y2 = aVar4.y(gho0Var2);
                        x6 = aVar4.x();
                        if (!y2) {
                        }
                        x6 = new omf(gho0Var2, 8);
                        aVar4.R(x6);
                        bap.c(gho0Var2, (izs) x6, aVar4, 0);
                        y3 = aVar4.y(j1zVar5) | aVar4.y(mio0Var42) | (i222 == 4) | ((i11 <= 32 && aVar4.J(rnwVar)) || (i10 & 48) == 32);
                        x7 = aVar4.x();
                        if (y3) {
                        }
                        i13 = 8;
                        ztj ztjVar2 = new ztj(j1zVar5, mio0Var42, tho0Var, rnwVar, 0);
                        rnwVar4 = rnwVar;
                        aVar4.R(ztjVar2);
                        x7 = ztjVar2;
                        bap.c(rnwVar4, (izs) x7, aVar4, i202 & 14);
                        final izs bzwVar2 = j1zVar5.v;
                        if (i == 1) {
                        }
                        final uv70 uv70Var82 = uv70Var4;
                        final int i232 = rnwVar4.e;
                        z13 = true;
                        final c3q0 c3q0Var32 = c3q0Var2;
                        yzs yzsVar22 = new yzs() { // from class: xsna.hgo0
                            @Override // xsna.yzs
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                androidx.compose.runtime.a aVar102 = (androidx.compose.runtime.a) obj7;
                                int intValue = ((Integer) obj8).intValue();
                                aVar102.K(851809892);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(851809892, intValue, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:256)");
                                }
                                Object x18 = aVar102.x();
                                a.C0011a.C0012a c0012a = a.C0011a.a;
                                if (x18 == c0012a) {
                                    x18 = new pko0();
                                    aVar102.R(x18);
                                }
                                pko0 pko0Var = (pko0) x18;
                                Object x19 = aVar102.x();
                                if (x19 == c0012a) {
                                    x19 = new h2l();
                                    aVar102.R(x19);
                                }
                                ggo0 ggo0Var = new ggo0(j1z.this, gho0Var2, tho0Var, z17, z18, pko0Var, uv70Var82, c3q0Var32, (h2l) x19, bzwVar2, i232);
                                boolean y7 = aVar102.y(ggo0Var);
                                Object x20 = aVar102.x();
                                if (y7 || x20 == c0012a) {
                                    odg odgVar = new odg(1, ggo0Var, ggo0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 7);
                                    aVar102.R(odgVar);
                                    x20 = odgVar;
                                }
                                q630 o4 = sdi.o(q630.a.a, (izs) ((fcy) x20));
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                aVar102.j();
                                return o4;
                            }
                        };
                        a5x.a aVar102 = a5x.a;
                        q630 a42 = qri.a(aVar9, aVar102, yzsVar22);
                        int i242 = rnwVar4.d;
                        if (i242 == 7) {
                            boolean booleanValue2 = ((Boolean) wh50Var.getValue()).booleanValue();
                            final f1z f1zVar32 = f1zVar;
                            l = aVar4.l(z14) | aVar4.y(f1zVar32);
                            x8 = aVar4.x();
                            if (!l) {
                            }
                            x8 = new gzs() { // from class: xsna.auj
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    if (z14) {
                                        f1zVar32.i();
                                    }
                                    return s3q0.a;
                                }
                            };
                            aVar4.R(x8);
                            q630 a52 = mtm0.a((gzs) x8, booleanValue2, z14);
                            yk8 yk8Var2 = (yk8) aVar4.r(ko5.a);
                            long j52 = ((l5g) aVar4.r(ko5.b)).a;
                            if (l5g.d(j52, f870.c(1308617531))) {
                            }
                            y4 = aVar4.y(j1zVar5) | aVar4.J(rek0Var2);
                            x9 = aVar4.x();
                            if (!y4) {
                            }
                            x9 = new bi0(13, j1zVar5, rek0Var2);
                            aVar4.R(x9);
                            q630 f22 = bu00.f(aVar9, (izs) x9);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            q630 k2 = a020.k(egi.o(qri.a(sdi.p(sdi.p(p490.t(q630Var.g(f22), f1zVar32, j1zVar5, gho0Var2).g(a52).g(q630Var32), new tfo0(vvrVar3, j1zVar5)), new luj(j1zVar5, gho0Var2)).g(a42), aVar102, new yzs() { // from class: xsna.ugo0
                                @Override // xsna.yzs
                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                    xgo0 xgo0Var4 = xgo0.this;
                                    wh50 wh50Var2 = xgo0Var4.f;
                                    androidx.compose.runtime.a aVar112 = (androidx.compose.runtime.a) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    aVar112.K(-2137546592);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-2137546592, intValue, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:76)");
                                    }
                                    boolean z192 = ((Orientation) ((zak0) wh50Var2).getValue()) == Orientation.Vertical || !(aVar112.r(uvi.n) == LayoutDirection.Rtl);
                                    boolean J4 = aVar112.J(xgo0Var4);
                                    Object x18 = aVar112.x();
                                    Object obj9 = a.C0011a.a;
                                    if (J4 || x18 == obj9) {
                                        x18 = new u2k0(xgo0Var4, 11);
                                        aVar112.R(x18);
                                    }
                                    khh0 C = m4s.C((izs) x18, aVar112, 0);
                                    boolean J5 = aVar112.J(C) | aVar112.J(xgo0Var4);
                                    Object x19 = aVar112.x();
                                    if (J5 || x19 == obj9) {
                                        x19 = new wgo0(C, xgo0Var4);
                                        aVar112.R(x19);
                                    }
                                    q630 c4 = ahh0.c(q630.a.a, (wgo0) x19, (Orientation) ((zak0) wh50Var2).getValue(), z2 && ((vak0) xgo0Var4.b).getFloatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z192, sg50Var, 160);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    aVar112.j();
                                    return c4;
                                }
                            }).g(c22).g(mujVar2), new vl1(j1zVar5, 22)), new h08(12, gho0Var2, yvjVar2));
                            if (z2) {
                            }
                            z13 = z15;
                            if (z13) {
                            }
                            final boolean z192 = z13;
                            final yc8 yc8Var32 = yc8Var;
                            final q630 aVar112 = aVar5;
                            final j1z j1zVar82 = j1zVar5;
                            aVar2 = aVar4;
                            b(k2, gho0Var2, kai.c(-814563849, new wzs() { // from class: xsna.wtj
                                @Override // xsna.wzs
                                public final Object invoke(Object obj6, Object obj7) {
                                    androidx.compose.runtime.a aVar12 = (androidx.compose.runtime.a) obj6;
                                    int intValue = ((Integer) obj7).intValue();
                                    if (aVar12.t(intValue & 1, (intValue & 3) != 2)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-814563849, intValue, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:548)");
                                        }
                                        final j1z j1zVar9 = j1zVar82;
                                        final nmo0 nmo0Var4 = nmo0Var;
                                        final int i25 = i2;
                                        final int i26 = i;
                                        final xgo0 xgo0Var4 = xgo0Var3;
                                        final tho0 tho0Var4 = tho0Var;
                                        final b6u0 b6u0Var2 = b6u0Var;
                                        final q630 q630Var4 = aVar112;
                                        final q630 q630Var5 = c32;
                                        final q630 q630Var6 = o32;
                                        final q630 q630Var7 = aVar6;
                                        final yc8 yc8Var4 = yc8Var32;
                                        final gho0 gho0Var5 = gho0Var2;
                                        final boolean z20 = z192;
                                        final boolean z21 = z3;
                                        final izs izsVar3 = izsVar2;
                                        final uv70 uv70Var9 = uv70Var82;
                                        final azl azlVar4 = azlVar3;
                                        yzs.this.invoke(kai.c(-44346382, new wzs() { // from class: xsna.buj
                                            @Override // xsna.wzs
                                            public final Object invoke(Object obj8, Object obj9) {
                                                q630 apr0Var;
                                                androidx.compose.runtime.a aVar13 = (androidx.compose.runtime.a) obj8;
                                                int intValue2 = ((Integer) obj9).intValue();
                                                if (aVar13.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-44346382, intValue2, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:551)");
                                                    }
                                                    final j1z j1zVar10 = j1z.this;
                                                    q630 j6 = txj0.j(((pco) ((zak0) j1zVar10.g).getValue()).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
                                                    int i27 = i25;
                                                    final int i28 = i26;
                                                    u1v.a(i27, i28);
                                                    nmo0 nmo0Var5 = nmo0Var4;
                                                    if (i27 != 1 || i28 != Integer.MAX_VALUE) {
                                                        j6 = j6.g(new t1v(nmo0Var5, i27, i28));
                                                    }
                                                    boolean y7 = aVar13.y(j1zVar10);
                                                    Object x18 = aVar13.x();
                                                    if (y7 || x18 == a.C0011a.a) {
                                                        x18 = new trf(j1zVar10, 12);
                                                        aVar13.R(x18);
                                                    }
                                                    gzs gzsVar = (gzs) x18;
                                                    xgo0 xgo0Var5 = xgo0Var4;
                                                    Orientation orientation2 = (Orientation) ((zak0) xgo0Var5.f).getValue();
                                                    final tho0 tho0Var5 = tho0Var4;
                                                    long j7 = tho0Var5.b;
                                                    int i29 = qko0.c;
                                                    int i30 = (int) (j7 >> 32);
                                                    long j8 = xgo0Var5.e;
                                                    if (i30 == ((int) (j8 >> 32)) && (i30 = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                                                        i30 = qko0.f(j7);
                                                    }
                                                    xgo0Var5.e = tho0Var5.b;
                                                    klp0 a6 = yir0.a(b6u0Var2, tho0Var5.a);
                                                    int i31 = vgo0.a.$EnumSwitchMapping$0[orientation2.ordinal()];
                                                    if (i31 == 1) {
                                                        apr0Var = new apr0(xgo0Var5, i30, a6, gzsVar);
                                                    } else {
                                                        if (i31 != 2) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        apr0Var = new pfv(xgo0Var5, i30, a6, gzsVar);
                                                    }
                                                    q630 s = fo50.s(rte0.e(j6).g(apr0Var).g(q630Var4).g(q630Var5).g(new rho0(nmo0Var5)).g(q630Var6).g(q630Var7), yc8Var4);
                                                    final gho0 gho0Var6 = gho0Var5;
                                                    final boolean z22 = z20;
                                                    final boolean z23 = z21;
                                                    final izs izsVar4 = izsVar3;
                                                    final uv70 uv70Var10 = uv70Var9;
                                                    final azl azlVar5 = azlVar4;
                                                    frj0.a(s, kai.c(1412697320, new wzs() { // from class: xsna.cuj
                                                        @Override // xsna.wzs
                                                        public final Object invoke(Object obj10, Object obj11) {
                                                            androidx.compose.runtime.a aVar14 = (androidx.compose.runtime.a) obj10;
                                                            int intValue3 = ((Integer) obj11).intValue();
                                                            if (aVar14.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.f(1412697320, intValue3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:572)");
                                                                }
                                                                j1z j1zVar11 = j1zVar10;
                                                                guj gujVar = new guj(j1zVar11, izsVar4, tho0Var5, uv70Var10, azlVar5, i28);
                                                                int hashCode = Long.hashCode(n34.n(aVar14));
                                                                sy90 D = aVar14.D();
                                                                q630 c4 = qri.c(aVar14, q630.a.a);
                                                                cri.h7.getClass();
                                                                LayoutNode.a aVar15 = cri.a.b;
                                                                if (aVar14.N() == null) {
                                                                    n34.r();
                                                                    throw null;
                                                                }
                                                                aVar14.H();
                                                                if (aVar14.L()) {
                                                                    aVar14.I(aVar15);
                                                                } else {
                                                                    aVar14.f();
                                                                }
                                                                k9q0.w(aVar14, gujVar, cri.a.f);
                                                                k9q0.w(aVar14, D, cri.a.e);
                                                                k9q0.w(aVar14, Integer.valueOf(hashCode), cri.a.g);
                                                                k9q0.t(aVar14, cri.a.h);
                                                                k9q0.w(aVar14, c4, cri.a.d);
                                                                aVar14.G();
                                                                HandleState a7 = j1zVar11.a();
                                                                HandleState handleState = HandleState.None;
                                                                boolean z24 = z22;
                                                                boolean z25 = a7 != handleState && j1zVar11.c() != null && j1zVar11.c().e() && z24;
                                                                gho0 gho0Var7 = gho0.this;
                                                                kuj.c(gho0Var7, z25, aVar14, 0);
                                                                if (j1zVar11.a() == HandleState.Cursor && !z23 && z24) {
                                                                    aVar14.K(-714666198);
                                                                    kuj.d(gho0Var7, aVar14, 0);
                                                                    aVar14.j();
                                                                } else {
                                                                    aVar14.K(-714589318);
                                                                    aVar14.j();
                                                                }
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.e();
                                                                }
                                                            } else {
                                                                aVar14.h();
                                                            }
                                                            return s3q0.a;
                                                        }
                                                    }, aVar13), aVar13, 48);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar13.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, aVar12), aVar12, 6);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar12.h();
                                    }
                                    return s3q0.a;
                                }
                            }, aVar2), aVar2, 384);
                            if (androidx.compose.runtime.b.d()) {
                            }
                        }
                        boolean booleanValue22 = ((Boolean) wh50Var.getValue()).booleanValue();
                        final f1z f1zVar322 = f1zVar;
                        l = aVar4.l(z14) | aVar4.y(f1zVar322);
                        x8 = aVar4.x();
                        if (!l) {
                        }
                        x8 = new gzs() { // from class: xsna.auj
                            @Override // xsna.gzs
                            public final Object invoke() {
                                if (z14) {
                                    f1zVar322.i();
                                }
                                return s3q0.a;
                            }
                        };
                        aVar4.R(x8);
                        q630 a522 = mtm0.a((gzs) x8, booleanValue22, z14);
                        yk8 yk8Var22 = (yk8) aVar4.r(ko5.a);
                        long j522 = ((l5g) aVar4.r(ko5.b)).a;
                        if (l5g.d(j522, f870.c(1308617531))) {
                        }
                        y4 = aVar4.y(j1zVar5) | aVar4.J(rek0Var2);
                        x9 = aVar4.x();
                        if (!y4) {
                        }
                        x9 = new bi0(13, j1zVar5, rek0Var2);
                        aVar4.R(x9);
                        q630 f222 = bu00.f(aVar9, (izs) x9);
                        if (androidx.compose.runtime.b.d()) {
                        }
                        if (androidx.compose.runtime.b.d()) {
                        }
                        q630 k22 = a020.k(egi.o(qri.a(sdi.p(sdi.p(p490.t(q630Var.g(f222), f1zVar322, j1zVar5, gho0Var2).g(a522).g(q630Var32), new tfo0(vvrVar3, j1zVar5)), new luj(j1zVar5, gho0Var2)).g(a42), aVar102, new yzs() { // from class: xsna.ugo0
                            @Override // xsna.yzs
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                xgo0 xgo0Var4 = xgo0.this;
                                wh50 wh50Var2 = xgo0Var4.f;
                                androidx.compose.runtime.a aVar1122 = (androidx.compose.runtime.a) obj7;
                                int intValue = ((Integer) obj8).intValue();
                                aVar1122.K(-2137546592);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-2137546592, intValue, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:76)");
                                }
                                boolean z1922 = ((Orientation) ((zak0) wh50Var2).getValue()) == Orientation.Vertical || !(aVar1122.r(uvi.n) == LayoutDirection.Rtl);
                                boolean J4 = aVar1122.J(xgo0Var4);
                                Object x18 = aVar1122.x();
                                Object obj9 = a.C0011a.a;
                                if (J4 || x18 == obj9) {
                                    x18 = new u2k0(xgo0Var4, 11);
                                    aVar1122.R(x18);
                                }
                                khh0 C = m4s.C((izs) x18, aVar1122, 0);
                                boolean J5 = aVar1122.J(C) | aVar1122.J(xgo0Var4);
                                Object x19 = aVar1122.x();
                                if (J5 || x19 == obj9) {
                                    x19 = new wgo0(C, xgo0Var4);
                                    aVar1122.R(x19);
                                }
                                q630 c4 = ahh0.c(q630.a.a, (wgo0) x19, (Orientation) ((zak0) wh50Var2).getValue(), z2 && ((vak0) xgo0Var4.b).getFloatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z1922, sg50Var, 160);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                aVar1122.j();
                                return c4;
                            }
                        }).g(c22).g(mujVar2), new vl1(j1zVar5, 22)), new h08(12, gho0Var2, yvjVar2));
                        if (z2) {
                        }
                        z13 = z15;
                        if (z13) {
                        }
                        final boolean z1922 = z13;
                        final yc8 yc8Var322 = yc8Var;
                        final q630 aVar1122 = aVar5;
                        final j1z j1zVar822 = j1zVar5;
                        aVar2 = aVar4;
                        b(k22, gho0Var2, kai.c(-814563849, new wzs() { // from class: xsna.wtj
                            @Override // xsna.wzs
                            public final Object invoke(Object obj6, Object obj7) {
                                androidx.compose.runtime.a aVar12 = (androidx.compose.runtime.a) obj6;
                                int intValue = ((Integer) obj7).intValue();
                                if (aVar12.t(intValue & 1, (intValue & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-814563849, intValue, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:548)");
                                    }
                                    final j1z j1zVar9 = j1zVar822;
                                    final nmo0 nmo0Var4 = nmo0Var;
                                    final int i25 = i2;
                                    final int i26 = i;
                                    final xgo0 xgo0Var4 = xgo0Var3;
                                    final tho0 tho0Var4 = tho0Var;
                                    final b6u0 b6u0Var2 = b6u0Var;
                                    final q630 q630Var4 = aVar1122;
                                    final q630 q630Var5 = c32;
                                    final q630 q630Var6 = o32;
                                    final q630 q630Var7 = aVar6;
                                    final yc8 yc8Var4 = yc8Var322;
                                    final gho0 gho0Var5 = gho0Var2;
                                    final boolean z20 = z1922;
                                    final boolean z21 = z3;
                                    final izs izsVar3 = izsVar2;
                                    final uv70 uv70Var9 = uv70Var82;
                                    final azl azlVar4 = azlVar3;
                                    yzs.this.invoke(kai.c(-44346382, new wzs() { // from class: xsna.buj
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj8, Object obj9) {
                                            q630 apr0Var;
                                            androidx.compose.runtime.a aVar13 = (androidx.compose.runtime.a) obj8;
                                            int intValue2 = ((Integer) obj9).intValue();
                                            if (aVar13.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-44346382, intValue2, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:551)");
                                                }
                                                final j1z j1zVar10 = j1z.this;
                                                q630 j6 = txj0.j(((pco) ((zak0) j1zVar10.g).getValue()).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
                                                int i27 = i25;
                                                final int i28 = i26;
                                                u1v.a(i27, i28);
                                                nmo0 nmo0Var5 = nmo0Var4;
                                                if (i27 != 1 || i28 != Integer.MAX_VALUE) {
                                                    j6 = j6.g(new t1v(nmo0Var5, i27, i28));
                                                }
                                                boolean y7 = aVar13.y(j1zVar10);
                                                Object x18 = aVar13.x();
                                                if (y7 || x18 == a.C0011a.a) {
                                                    x18 = new trf(j1zVar10, 12);
                                                    aVar13.R(x18);
                                                }
                                                gzs gzsVar = (gzs) x18;
                                                xgo0 xgo0Var5 = xgo0Var4;
                                                Orientation orientation2 = (Orientation) ((zak0) xgo0Var5.f).getValue();
                                                final tho0 tho0Var5 = tho0Var4;
                                                long j7 = tho0Var5.b;
                                                int i29 = qko0.c;
                                                int i30 = (int) (j7 >> 32);
                                                long j8 = xgo0Var5.e;
                                                if (i30 == ((int) (j8 >> 32)) && (i30 = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                                                    i30 = qko0.f(j7);
                                                }
                                                xgo0Var5.e = tho0Var5.b;
                                                klp0 a6 = yir0.a(b6u0Var2, tho0Var5.a);
                                                int i31 = vgo0.a.$EnumSwitchMapping$0[orientation2.ordinal()];
                                                if (i31 == 1) {
                                                    apr0Var = new apr0(xgo0Var5, i30, a6, gzsVar);
                                                } else {
                                                    if (i31 != 2) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    apr0Var = new pfv(xgo0Var5, i30, a6, gzsVar);
                                                }
                                                q630 s = fo50.s(rte0.e(j6).g(apr0Var).g(q630Var4).g(q630Var5).g(new rho0(nmo0Var5)).g(q630Var6).g(q630Var7), yc8Var4);
                                                final gho0 gho0Var6 = gho0Var5;
                                                final boolean z22 = z20;
                                                final boolean z23 = z21;
                                                final izs izsVar4 = izsVar3;
                                                final uv70 uv70Var10 = uv70Var9;
                                                final azl azlVar5 = azlVar4;
                                                frj0.a(s, kai.c(1412697320, new wzs() { // from class: xsna.cuj
                                                    @Override // xsna.wzs
                                                    public final Object invoke(Object obj10, Object obj11) {
                                                        androidx.compose.runtime.a aVar14 = (androidx.compose.runtime.a) obj10;
                                                        int intValue3 = ((Integer) obj11).intValue();
                                                        if (aVar14.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.f(1412697320, intValue3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:572)");
                                                            }
                                                            j1z j1zVar11 = j1zVar10;
                                                            guj gujVar = new guj(j1zVar11, izsVar4, tho0Var5, uv70Var10, azlVar5, i28);
                                                            int hashCode = Long.hashCode(n34.n(aVar14));
                                                            sy90 D = aVar14.D();
                                                            q630 c4 = qri.c(aVar14, q630.a.a);
                                                            cri.h7.getClass();
                                                            LayoutNode.a aVar15 = cri.a.b;
                                                            if (aVar14.N() == null) {
                                                                n34.r();
                                                                throw null;
                                                            }
                                                            aVar14.H();
                                                            if (aVar14.L()) {
                                                                aVar14.I(aVar15);
                                                            } else {
                                                                aVar14.f();
                                                            }
                                                            k9q0.w(aVar14, gujVar, cri.a.f);
                                                            k9q0.w(aVar14, D, cri.a.e);
                                                            k9q0.w(aVar14, Integer.valueOf(hashCode), cri.a.g);
                                                            k9q0.t(aVar14, cri.a.h);
                                                            k9q0.w(aVar14, c4, cri.a.d);
                                                            aVar14.G();
                                                            HandleState a7 = j1zVar11.a();
                                                            HandleState handleState = HandleState.None;
                                                            boolean z24 = z22;
                                                            boolean z25 = a7 != handleState && j1zVar11.c() != null && j1zVar11.c().e() && z24;
                                                            gho0 gho0Var7 = gho0.this;
                                                            kuj.c(gho0Var7, z25, aVar14, 0);
                                                            if (j1zVar11.a() == HandleState.Cursor && !z23 && z24) {
                                                                aVar14.K(-714666198);
                                                                kuj.d(gho0Var7, aVar14, 0);
                                                                aVar14.j();
                                                            } else {
                                                                aVar14.K(-714589318);
                                                                aVar14.j();
                                                            }
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.e();
                                                            }
                                                        } else {
                                                            aVar14.h();
                                                        }
                                                        return s3q0.a;
                                                    }
                                                }, aVar13), aVar13, 48);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar13.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar12), aVar12, 6);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar12.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar2), aVar2, 384);
                        if (androidx.compose.runtime.b.d()) {
                        }
                    }
                } else {
                    rnwVar2 = rnwVar;
                }
                z8 = y5;
                c3q0Var2 = c3q0Var;
                if ((i10 & 48) != 32) {
                    z9 = false;
                    y = z8 | z9 | aVar4.y(uv70Var7) | aVar4.y(yvjVar3) | aVar4.y(yc8Var2) | aVar4.y(gho0Var3);
                    Object x162 = aVar4.x();
                    if (y) {
                    }
                    i12 = i19;
                    f1zVar = f1zVar2;
                    vvrVar3 = vvrVar2;
                    j1zVar2 = j1zVar6;
                    obj4 = obj2;
                    final rnw rnwVar52 = rnwVar2;
                    rwrVar = rwrVar3;
                    obj3 = new izs() { // from class: xsna.ytj
                        @Override // xsna.izs
                        public final Object invoke(Object obj6) {
                            mjo0 d;
                            xwr xwrVar = (xwr) obj6;
                            j1z j1zVar73 = j1z.this;
                            if (j1zVar73.b() == xwrVar.h()) {
                                return s3q0.a;
                            }
                            ((zak0) j1zVar73.f).setValue(Boolean.valueOf(xwrVar.h()));
                            boolean b53 = j1zVar73.b();
                            tho0 tho0Var4 = tho0Var;
                            uv70 uv70Var83 = uv70Var7;
                            if (b53 && z2 && !z3) {
                                kuj.g(mio0Var2, j1zVar73, tho0Var4, rnwVar52, uv70Var83);
                            } else {
                                kuj.e(j1zVar73);
                            }
                            if (xwrVar.h() && (d = j1zVar73.d()) != null) {
                                myc0.h(yvjVar3, null, null, new huj(yc8Var2, tho0Var4, j1zVar73, d, uv70Var83, null), 3);
                            }
                            if (!xwrVar.h()) {
                                gho0Var3.i(null);
                            }
                            return s3q0.a;
                        }
                    };
                    uv70Var2 = uv70Var7;
                    yc8Var = yc8Var2;
                    tho0Var2 = tho0Var;
                    gho0Var3 = gho0Var3;
                    yvjVar = yvjVar3;
                    z10 = z2;
                    mio0Var = mio0Var2;
                    rnwVar3 = rnwVar52;
                    aVar4.R(obj3);
                    q630.a aVar92 = q630.a.a;
                    q630 a32 = mxr.a(fvr.u(jvi.d(aVar92, rwrVar), (izs) obj3), z10, sg50Var);
                    wh50 c4 = androidx.compose.runtime.k.c(Boolean.valueOf((z10 || z3) ? false : true), aVar4, 0);
                    s3q0 s3q0Var22 = s3q0.a;
                    boolean J32 = aVar4.J(c4) | aVar4.y(j1zVar2) | aVar4.y(mio0Var) | aVar4.y(gho0Var3);
                    if (i11 > 32) {
                    }
                    j1zVar3 = j1zVar2;
                    if ((i10 & 48) != 32) {
                    }
                    z11 = true;
                    z12 = J32 | z11;
                    Object x1722 = aVar4.x();
                    if (z12) {
                    }
                    mio0 mio0Var322 = mio0Var;
                    gho0 gho0Var422 = gho0Var3;
                    rnw rnwVar622 = rnwVar3;
                    gho0Var = gho0Var422;
                    yvjVar2 = yvjVar;
                    q630Var2 = a32;
                    rwrVar2 = rwrVar;
                    s3q0Var = s3q0Var22;
                    j1zVar4 = j1zVar3;
                    sg50Var2 = sg50Var;
                    fujVar = new fuj(j1zVar4, c4, mio0Var322, gho0Var, rnwVar622, null);
                    wh50Var = c4;
                    mio0Var = mio0Var322;
                    aVar4.R(fujVar);
                    bap.g(s3q0Var, (wzs) fujVar, aVar4, 6);
                    int i2022 = i10 >> 3;
                    int i2122 = (i2022 & 896) | 196614 | ((i7 >> 9) & 7168) | ((i10 << 6) & 3670016);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630 b522 = skn0.b(aVar92, 8675309, new edi0(new ujm0(j1zVar4, 3)));
                    gho0Var2 = gho0Var;
                    uv70Var3 = uv70Var2;
                    q630 q630Var322 = q630Var2;
                    mio0 mio0Var422 = mio0Var;
                    final rwr rwrVar422 = rwrVar2;
                    q630 g22 = (z2 ? qri.a(b522, a5x.a, new rgo0(0, new izs() { // from class: xsna.ogo0
                        @Override // xsna.izs
                        public final Object invoke(Object obj6) {
                            nek0 nek0Var2;
                            ov70 ov70Var = (ov70) obj6;
                            j1z j1zVar722 = j1z.this;
                            if (!j1zVar722.b()) {
                                rwr.b(rwrVar422);
                            } else if (!z3 && (nek0Var2 = j1zVar722.c) != null) {
                                nek0Var2.show();
                            }
                            if (j1zVar722.b() && z2) {
                                if (j1zVar722.a() != HandleState.Selection) {
                                    mjo0 d = j1zVar722.d();
                                    if (d != null) {
                                        long j523 = ov70Var.a;
                                        cwm cwmVar2 = j1zVar722.d;
                                        bzw bzwVar22 = j1zVar722.v;
                                        int a422 = uv70Var3.a(d.b(j523, true));
                                        bzwVar22.invoke(tho0.b((tho0) cwmVar2.b, null, jgz.c(a422, a422), 5));
                                        if (j1zVar722.a.a.c.length() > 0) {
                                            ((zak0) j1zVar722.k).setValue(HandleState.Cursor);
                                        }
                                    }
                                } else {
                                    gho0Var2.i(ov70Var);
                                }
                            }
                            return s3q0.a;
                        }
                    }, sg50Var2)) : b522).g(new okn0(gho0Var2.B, gho0Var2.A, null, new pgo0(gho0Var2), 4));
                    ulb0.a.getClass();
                    q630 c222 = e7b0.c(g22, y000.c);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    final q630 c322 = bu00.c(aVar92, new wyg(j1zVar4, tho0Var2, uv70Var3, 1));
                    boolean y622 = aVar4.y(j1zVar4) | (i18 == 2048);
                    spx0Var2 = spx0Var;
                    int i2222 = i12;
                    J = y622 | aVar4.J(spx0Var2) | aVar4.y(gho0Var2) | (i2222 == 4) | aVar4.y(uv70Var3);
                    x5 = aVar4.x();
                    if (J) {
                    }
                    zm0 zm0Var22 = new zm0(j1zVar4, z2, spx0Var2, gho0Var2, tho0Var2, uv70Var3);
                    spx0Var3 = spx0Var2;
                    aVar4.R(zm0Var22);
                    x5 = zm0Var22;
                    final q630 o322 = egi.o(aVar92, (izs) x5);
                    j1z j1zVar722 = j1zVar4;
                    muj mujVar22 = new muj(klp0Var, tho0Var, j1zVar722, z3, z2, uv70Var3, gho0Var2, rnwVar, rwrVar2);
                    j1zVar5 = j1zVar722;
                    if (!z2 && !z3 && spx0Var3.b() && qko0.c(((qko0) ((zak0) j1zVar5.A).getValue()).a) && qko0.c(((qko0) ((zak0) j1zVar5.B).getValue()).a)) {
                    }
                    y2 = aVar4.y(gho0Var2);
                    x6 = aVar4.x();
                    if (!y2) {
                    }
                    x6 = new omf(gho0Var2, 8);
                    aVar4.R(x6);
                    bap.c(gho0Var2, (izs) x6, aVar4, 0);
                    y3 = aVar4.y(j1zVar5) | aVar4.y(mio0Var422) | (i2222 == 4) | ((i11 <= 32 && aVar4.J(rnwVar)) || (i10 & 48) == 32);
                    x7 = aVar4.x();
                    if (y3) {
                    }
                    i13 = 8;
                    ztj ztjVar22 = new ztj(j1zVar5, mio0Var422, tho0Var, rnwVar, 0);
                    rnwVar4 = rnwVar;
                    aVar4.R(ztjVar22);
                    x7 = ztjVar22;
                    bap.c(rnwVar4, (izs) x7, aVar4, i2022 & 14);
                    final izs bzwVar22 = j1zVar5.v;
                    if (i == 1) {
                    }
                    final uv70 uv70Var822 = uv70Var4;
                    final int i2322 = rnwVar4.e;
                    z13 = true;
                    final c3q0 c3q0Var322 = c3q0Var2;
                    yzs yzsVar222 = new yzs() { // from class: xsna.hgo0
                        @Override // xsna.yzs
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            androidx.compose.runtime.a aVar1022 = (androidx.compose.runtime.a) obj7;
                            int intValue = ((Integer) obj8).intValue();
                            aVar1022.K(851809892);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(851809892, intValue, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:256)");
                            }
                            Object x18 = aVar1022.x();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (x18 == c0012a) {
                                x18 = new pko0();
                                aVar1022.R(x18);
                            }
                            pko0 pko0Var = (pko0) x18;
                            Object x19 = aVar1022.x();
                            if (x19 == c0012a) {
                                x19 = new h2l();
                                aVar1022.R(x19);
                            }
                            ggo0 ggo0Var = new ggo0(j1z.this, gho0Var2, tho0Var, z17, z18, pko0Var, uv70Var822, c3q0Var322, (h2l) x19, bzwVar22, i2322);
                            boolean y7 = aVar1022.y(ggo0Var);
                            Object x20 = aVar1022.x();
                            if (y7 || x20 == c0012a) {
                                odg odgVar = new odg(1, ggo0Var, ggo0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 7);
                                aVar1022.R(odgVar);
                                x20 = odgVar;
                            }
                            q630 o4 = sdi.o(q630.a.a, (izs) ((fcy) x20));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar1022.j();
                            return o4;
                        }
                    };
                    a5x.a aVar1022 = a5x.a;
                    q630 a422 = qri.a(aVar92, aVar1022, yzsVar222);
                    int i2422 = rnwVar4.d;
                    if (i2422 == 7) {
                    }
                    boolean booleanValue222 = ((Boolean) wh50Var.getValue()).booleanValue();
                    final f1z f1zVar3222 = f1zVar;
                    l = aVar4.l(z14) | aVar4.y(f1zVar3222);
                    x8 = aVar4.x();
                    if (!l) {
                    }
                    x8 = new gzs() { // from class: xsna.auj
                        @Override // xsna.gzs
                        public final Object invoke() {
                            if (z14) {
                                f1zVar3222.i();
                            }
                            return s3q0.a;
                        }
                    };
                    aVar4.R(x8);
                    q630 a5222 = mtm0.a((gzs) x8, booleanValue222, z14);
                    yk8 yk8Var222 = (yk8) aVar4.r(ko5.a);
                    long j5222 = ((l5g) aVar4.r(ko5.b)).a;
                    if (l5g.d(j5222, f870.c(1308617531))) {
                    }
                    y4 = aVar4.y(j1zVar5) | aVar4.J(rek0Var2);
                    x9 = aVar4.x();
                    if (!y4) {
                    }
                    x9 = new bi0(13, j1zVar5, rek0Var2);
                    aVar4.R(x9);
                    q630 f2222 = bu00.f(aVar92, (izs) x9);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630 k222 = a020.k(egi.o(qri.a(sdi.p(sdi.p(p490.t(q630Var.g(f2222), f1zVar3222, j1zVar5, gho0Var2).g(a5222).g(q630Var322), new tfo0(vvrVar3, j1zVar5)), new luj(j1zVar5, gho0Var2)).g(a422), aVar1022, new yzs() { // from class: xsna.ugo0
                        @Override // xsna.yzs
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            xgo0 xgo0Var4 = xgo0.this;
                            wh50 wh50Var2 = xgo0Var4.f;
                            androidx.compose.runtime.a aVar11222 = (androidx.compose.runtime.a) obj7;
                            int intValue = ((Integer) obj8).intValue();
                            aVar11222.K(-2137546592);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-2137546592, intValue, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:76)");
                            }
                            boolean z19222 = ((Orientation) ((zak0) wh50Var2).getValue()) == Orientation.Vertical || !(aVar11222.r(uvi.n) == LayoutDirection.Rtl);
                            boolean J4 = aVar11222.J(xgo0Var4);
                            Object x18 = aVar11222.x();
                            Object obj9 = a.C0011a.a;
                            if (J4 || x18 == obj9) {
                                x18 = new u2k0(xgo0Var4, 11);
                                aVar11222.R(x18);
                            }
                            khh0 C = m4s.C((izs) x18, aVar11222, 0);
                            boolean J5 = aVar11222.J(C) | aVar11222.J(xgo0Var4);
                            Object x19 = aVar11222.x();
                            if (J5 || x19 == obj9) {
                                x19 = new wgo0(C, xgo0Var4);
                                aVar11222.R(x19);
                            }
                            q630 c42 = ahh0.c(q630.a.a, (wgo0) x19, (Orientation) ((zak0) wh50Var2).getValue(), z2 && ((vak0) xgo0Var4.b).getFloatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z19222, sg50Var, 160);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar11222.j();
                            return c42;
                        }
                    }).g(c222).g(mujVar22), new vl1(j1zVar5, 22)), new h08(12, gho0Var2, yvjVar2));
                    if (z2) {
                    }
                    z13 = z15;
                    if (z13) {
                    }
                    final boolean z19222 = z13;
                    final yc8 yc8Var3222 = yc8Var;
                    final q630 aVar11222 = aVar5;
                    final j1z j1zVar8222 = j1zVar5;
                    aVar2 = aVar4;
                    b(k222, gho0Var2, kai.c(-814563849, new wzs() { // from class: xsna.wtj
                        @Override // xsna.wzs
                        public final Object invoke(Object obj6, Object obj7) {
                            androidx.compose.runtime.a aVar12 = (androidx.compose.runtime.a) obj6;
                            int intValue = ((Integer) obj7).intValue();
                            if (aVar12.t(intValue & 1, (intValue & 3) != 2)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-814563849, intValue, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:548)");
                                }
                                final j1z j1zVar9 = j1zVar8222;
                                final nmo0 nmo0Var4 = nmo0Var;
                                final int i25 = i2;
                                final int i26 = i;
                                final xgo0 xgo0Var4 = xgo0Var3;
                                final tho0 tho0Var4 = tho0Var;
                                final b6u0 b6u0Var2 = b6u0Var;
                                final q630 q630Var4 = aVar11222;
                                final q630 q630Var5 = c322;
                                final q630 q630Var6 = o322;
                                final q630 q630Var7 = aVar6;
                                final yc8 yc8Var4 = yc8Var3222;
                                final gho0 gho0Var5 = gho0Var2;
                                final boolean z20 = z19222;
                                final boolean z21 = z3;
                                final izs izsVar3 = izsVar2;
                                final uv70 uv70Var9 = uv70Var822;
                                final azl azlVar4 = azlVar3;
                                yzs.this.invoke(kai.c(-44346382, new wzs() { // from class: xsna.buj
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj8, Object obj9) {
                                        q630 apr0Var;
                                        androidx.compose.runtime.a aVar13 = (androidx.compose.runtime.a) obj8;
                                        int intValue2 = ((Integer) obj9).intValue();
                                        if (aVar13.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(-44346382, intValue2, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:551)");
                                            }
                                            final j1z j1zVar10 = j1z.this;
                                            q630 j6 = txj0.j(((pco) ((zak0) j1zVar10.g).getValue()).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
                                            int i27 = i25;
                                            final int i28 = i26;
                                            u1v.a(i27, i28);
                                            nmo0 nmo0Var5 = nmo0Var4;
                                            if (i27 != 1 || i28 != Integer.MAX_VALUE) {
                                                j6 = j6.g(new t1v(nmo0Var5, i27, i28));
                                            }
                                            boolean y7 = aVar13.y(j1zVar10);
                                            Object x18 = aVar13.x();
                                            if (y7 || x18 == a.C0011a.a) {
                                                x18 = new trf(j1zVar10, 12);
                                                aVar13.R(x18);
                                            }
                                            gzs gzsVar = (gzs) x18;
                                            xgo0 xgo0Var5 = xgo0Var4;
                                            Orientation orientation2 = (Orientation) ((zak0) xgo0Var5.f).getValue();
                                            final tho0 tho0Var5 = tho0Var4;
                                            long j7 = tho0Var5.b;
                                            int i29 = qko0.c;
                                            int i30 = (int) (j7 >> 32);
                                            long j8 = xgo0Var5.e;
                                            if (i30 == ((int) (j8 >> 32)) && (i30 = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                                                i30 = qko0.f(j7);
                                            }
                                            xgo0Var5.e = tho0Var5.b;
                                            klp0 a6 = yir0.a(b6u0Var2, tho0Var5.a);
                                            int i31 = vgo0.a.$EnumSwitchMapping$0[orientation2.ordinal()];
                                            if (i31 == 1) {
                                                apr0Var = new apr0(xgo0Var5, i30, a6, gzsVar);
                                            } else {
                                                if (i31 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                apr0Var = new pfv(xgo0Var5, i30, a6, gzsVar);
                                            }
                                            q630 s = fo50.s(rte0.e(j6).g(apr0Var).g(q630Var4).g(q630Var5).g(new rho0(nmo0Var5)).g(q630Var6).g(q630Var7), yc8Var4);
                                            final gho0 gho0Var6 = gho0Var5;
                                            final boolean z22 = z20;
                                            final boolean z23 = z21;
                                            final izs izsVar4 = izsVar3;
                                            final uv70 uv70Var10 = uv70Var9;
                                            final azl azlVar5 = azlVar4;
                                            frj0.a(s, kai.c(1412697320, new wzs() { // from class: xsna.cuj
                                                @Override // xsna.wzs
                                                public final Object invoke(Object obj10, Object obj11) {
                                                    androidx.compose.runtime.a aVar14 = (androidx.compose.runtime.a) obj10;
                                                    int intValue3 = ((Integer) obj11).intValue();
                                                    if (aVar14.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(1412697320, intValue3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:572)");
                                                        }
                                                        j1z j1zVar11 = j1zVar10;
                                                        guj gujVar = new guj(j1zVar11, izsVar4, tho0Var5, uv70Var10, azlVar5, i28);
                                                        int hashCode = Long.hashCode(n34.n(aVar14));
                                                        sy90 D = aVar14.D();
                                                        q630 c42 = qri.c(aVar14, q630.a.a);
                                                        cri.h7.getClass();
                                                        LayoutNode.a aVar15 = cri.a.b;
                                                        if (aVar14.N() == null) {
                                                            n34.r();
                                                            throw null;
                                                        }
                                                        aVar14.H();
                                                        if (aVar14.L()) {
                                                            aVar14.I(aVar15);
                                                        } else {
                                                            aVar14.f();
                                                        }
                                                        k9q0.w(aVar14, gujVar, cri.a.f);
                                                        k9q0.w(aVar14, D, cri.a.e);
                                                        k9q0.w(aVar14, Integer.valueOf(hashCode), cri.a.g);
                                                        k9q0.t(aVar14, cri.a.h);
                                                        k9q0.w(aVar14, c42, cri.a.d);
                                                        aVar14.G();
                                                        HandleState a7 = j1zVar11.a();
                                                        HandleState handleState = HandleState.None;
                                                        boolean z24 = z22;
                                                        boolean z25 = a7 != handleState && j1zVar11.c() != null && j1zVar11.c().e() && z24;
                                                        gho0 gho0Var7 = gho0.this;
                                                        kuj.c(gho0Var7, z25, aVar14, 0);
                                                        if (j1zVar11.a() == HandleState.Cursor && !z23 && z24) {
                                                            aVar14.K(-714666198);
                                                            kuj.d(gho0Var7, aVar14, 0);
                                                            aVar14.j();
                                                        } else {
                                                            aVar14.K(-714589318);
                                                            aVar14.j();
                                                        }
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                    } else {
                                                        aVar14.h();
                                                    }
                                                    return s3q0.a;
                                                }
                                            }, aVar13), aVar13, 48);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                        } else {
                                            aVar13.h();
                                        }
                                        return s3q0.a;
                                    }
                                }, aVar12), aVar12, 6);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar12.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar2), aVar2, 384);
                    if (androidx.compose.runtime.b.d()) {
                    }
                }
                z9 = true;
                y = z8 | z9 | aVar4.y(uv70Var7) | aVar4.y(yvjVar3) | aVar4.y(yc8Var2) | aVar4.y(gho0Var3);
                Object x1622 = aVar4.x();
                if (y) {
                }
                i12 = i19;
                f1zVar = f1zVar2;
                vvrVar3 = vvrVar2;
                j1zVar2 = j1zVar6;
                obj4 = obj2;
                final rnw rnwVar522 = rnwVar2;
                rwrVar = rwrVar3;
                obj3 = new izs() { // from class: xsna.ytj
                    @Override // xsna.izs
                    public final Object invoke(Object obj6) {
                        mjo0 d;
                        xwr xwrVar = (xwr) obj6;
                        j1z j1zVar73 = j1z.this;
                        if (j1zVar73.b() == xwrVar.h()) {
                            return s3q0.a;
                        }
                        ((zak0) j1zVar73.f).setValue(Boolean.valueOf(xwrVar.h()));
                        boolean b53 = j1zVar73.b();
                        tho0 tho0Var4 = tho0Var;
                        uv70 uv70Var83 = uv70Var7;
                        if (b53 && z2 && !z3) {
                            kuj.g(mio0Var2, j1zVar73, tho0Var4, rnwVar522, uv70Var83);
                        } else {
                            kuj.e(j1zVar73);
                        }
                        if (xwrVar.h() && (d = j1zVar73.d()) != null) {
                            myc0.h(yvjVar3, null, null, new huj(yc8Var2, tho0Var4, j1zVar73, d, uv70Var83, null), 3);
                        }
                        if (!xwrVar.h()) {
                            gho0Var3.i(null);
                        }
                        return s3q0.a;
                    }
                };
                uv70Var2 = uv70Var7;
                yc8Var = yc8Var2;
                tho0Var2 = tho0Var;
                gho0Var3 = gho0Var3;
                yvjVar = yvjVar3;
                z10 = z2;
                mio0Var = mio0Var2;
                rnwVar3 = rnwVar522;
                aVar4.R(obj3);
                q630.a aVar922 = q630.a.a;
                q630 a322 = mxr.a(fvr.u(jvi.d(aVar922, rwrVar), (izs) obj3), z10, sg50Var);
                wh50 c42 = androidx.compose.runtime.k.c(Boolean.valueOf((z10 || z3) ? false : true), aVar4, 0);
                s3q0 s3q0Var222 = s3q0.a;
                boolean J322 = aVar4.J(c42) | aVar4.y(j1zVar2) | aVar4.y(mio0Var) | aVar4.y(gho0Var3);
                if (i11 > 32) {
                }
                j1zVar3 = j1zVar2;
                if ((i10 & 48) != 32) {
                }
                z11 = true;
                z12 = J322 | z11;
                Object x17222 = aVar4.x();
                if (z12) {
                }
                mio0 mio0Var3222 = mio0Var;
                gho0 gho0Var4222 = gho0Var3;
                rnw rnwVar6222 = rnwVar3;
                gho0Var = gho0Var4222;
                yvjVar2 = yvjVar;
                q630Var2 = a322;
                rwrVar2 = rwrVar;
                s3q0Var = s3q0Var222;
                j1zVar4 = j1zVar3;
                sg50Var2 = sg50Var;
                fujVar = new fuj(j1zVar4, c42, mio0Var3222, gho0Var, rnwVar6222, null);
                wh50Var = c42;
                mio0Var = mio0Var3222;
                aVar4.R(fujVar);
                bap.g(s3q0Var, (wzs) fujVar, aVar4, 6);
                int i20222 = i10 >> 3;
                int i21222 = (i20222 & 896) | 196614 | ((i7 >> 9) & 7168) | ((i10 << 6) & 3670016);
                if (androidx.compose.runtime.b.d()) {
                }
                q630 b5222 = skn0.b(aVar922, 8675309, new edi0(new ujm0(j1zVar4, 3)));
                gho0Var2 = gho0Var;
                uv70Var3 = uv70Var2;
                q630 q630Var3222 = q630Var2;
                mio0 mio0Var4222 = mio0Var;
                final rwr rwrVar4222 = rwrVar2;
                q630 g222 = (z2 ? qri.a(b5222, a5x.a, new rgo0(0, new izs() { // from class: xsna.ogo0
                    @Override // xsna.izs
                    public final Object invoke(Object obj6) {
                        nek0 nek0Var2;
                        ov70 ov70Var = (ov70) obj6;
                        j1z j1zVar7222 = j1z.this;
                        if (!j1zVar7222.b()) {
                            rwr.b(rwrVar4222);
                        } else if (!z3 && (nek0Var2 = j1zVar7222.c) != null) {
                            nek0Var2.show();
                        }
                        if (j1zVar7222.b() && z2) {
                            if (j1zVar7222.a() != HandleState.Selection) {
                                mjo0 d = j1zVar7222.d();
                                if (d != null) {
                                    long j523 = ov70Var.a;
                                    cwm cwmVar2 = j1zVar7222.d;
                                    bzw bzwVar222 = j1zVar7222.v;
                                    int a4222 = uv70Var3.a(d.b(j523, true));
                                    bzwVar222.invoke(tho0.b((tho0) cwmVar2.b, null, jgz.c(a4222, a4222), 5));
                                    if (j1zVar7222.a.a.c.length() > 0) {
                                        ((zak0) j1zVar7222.k).setValue(HandleState.Cursor);
                                    }
                                }
                            } else {
                                gho0Var2.i(ov70Var);
                            }
                        }
                        return s3q0.a;
                    }
                }, sg50Var2)) : b5222).g(new okn0(gho0Var2.B, gho0Var2.A, null, new pgo0(gho0Var2), 4));
                ulb0.a.getClass();
                q630 c2222 = e7b0.c(g222, y000.c);
                if (androidx.compose.runtime.b.d()) {
                }
                final q630 c3222 = bu00.c(aVar922, new wyg(j1zVar4, tho0Var2, uv70Var3, 1));
                boolean y6222 = aVar4.y(j1zVar4) | (i18 == 2048);
                spx0Var2 = spx0Var;
                int i22222 = i12;
                J = y6222 | aVar4.J(spx0Var2) | aVar4.y(gho0Var2) | (i22222 == 4) | aVar4.y(uv70Var3);
                x5 = aVar4.x();
                if (J) {
                }
                zm0 zm0Var222 = new zm0(j1zVar4, z2, spx0Var2, gho0Var2, tho0Var2, uv70Var3);
                spx0Var3 = spx0Var2;
                aVar4.R(zm0Var222);
                x5 = zm0Var222;
                final q630 o3222 = egi.o(aVar922, (izs) x5);
                j1z j1zVar7222 = j1zVar4;
                muj mujVar222 = new muj(klp0Var, tho0Var, j1zVar7222, z3, z2, uv70Var3, gho0Var2, rnwVar, rwrVar2);
                j1zVar5 = j1zVar7222;
                if (!z2 && !z3 && spx0Var3.b() && qko0.c(((qko0) ((zak0) j1zVar5.A).getValue()).a) && qko0.c(((qko0) ((zak0) j1zVar5.B).getValue()).a)) {
                }
                y2 = aVar4.y(gho0Var2);
                x6 = aVar4.x();
                if (!y2) {
                }
                x6 = new omf(gho0Var2, 8);
                aVar4.R(x6);
                bap.c(gho0Var2, (izs) x6, aVar4, 0);
                y3 = aVar4.y(j1zVar5) | aVar4.y(mio0Var4222) | (i22222 == 4) | ((i11 <= 32 && aVar4.J(rnwVar)) || (i10 & 48) == 32);
                x7 = aVar4.x();
                if (y3) {
                }
                i13 = 8;
                ztj ztjVar222 = new ztj(j1zVar5, mio0Var4222, tho0Var, rnwVar, 0);
                rnwVar4 = rnwVar;
                aVar4.R(ztjVar222);
                x7 = ztjVar222;
                bap.c(rnwVar4, (izs) x7, aVar4, i20222 & 14);
                final izs bzwVar222 = j1zVar5.v;
                if (i == 1) {
                }
                final uv70 uv70Var8222 = uv70Var4;
                final int i23222 = rnwVar4.e;
                z13 = true;
                final c3q0 c3q0Var3222 = c3q0Var2;
                yzs yzsVar2222 = new yzs() { // from class: xsna.hgo0
                    @Override // xsna.yzs
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        androidx.compose.runtime.a aVar10222 = (androidx.compose.runtime.a) obj7;
                        int intValue = ((Integer) obj8).intValue();
                        aVar10222.K(851809892);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(851809892, intValue, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:256)");
                        }
                        Object x18 = aVar10222.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x18 == c0012a) {
                            x18 = new pko0();
                            aVar10222.R(x18);
                        }
                        pko0 pko0Var = (pko0) x18;
                        Object x19 = aVar10222.x();
                        if (x19 == c0012a) {
                            x19 = new h2l();
                            aVar10222.R(x19);
                        }
                        ggo0 ggo0Var = new ggo0(j1z.this, gho0Var2, tho0Var, z17, z18, pko0Var, uv70Var8222, c3q0Var3222, (h2l) x19, bzwVar222, i23222);
                        boolean y7 = aVar10222.y(ggo0Var);
                        Object x20 = aVar10222.x();
                        if (y7 || x20 == c0012a) {
                            odg odgVar = new odg(1, ggo0Var, ggo0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 7);
                            aVar10222.R(odgVar);
                            x20 = odgVar;
                        }
                        q630 o4 = sdi.o(q630.a.a, (izs) ((fcy) x20));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar10222.j();
                        return o4;
                    }
                };
                a5x.a aVar10222 = a5x.a;
                q630 a4222 = qri.a(aVar922, aVar10222, yzsVar2222);
                int i24222 = rnwVar4.d;
                if (i24222 == 7) {
                }
                boolean booleanValue2222 = ((Boolean) wh50Var.getValue()).booleanValue();
                final f1z f1zVar32222 = f1zVar;
                l = aVar4.l(z14) | aVar4.y(f1zVar32222);
                x8 = aVar4.x();
                if (!l) {
                }
                x8 = new gzs() { // from class: xsna.auj
                    @Override // xsna.gzs
                    public final Object invoke() {
                        if (z14) {
                            f1zVar32222.i();
                        }
                        return s3q0.a;
                    }
                };
                aVar4.R(x8);
                q630 a52222 = mtm0.a((gzs) x8, booleanValue2222, z14);
                yk8 yk8Var2222 = (yk8) aVar4.r(ko5.a);
                long j52222 = ((l5g) aVar4.r(ko5.b)).a;
                if (l5g.d(j52222, f870.c(1308617531))) {
                }
                y4 = aVar4.y(j1zVar5) | aVar4.J(rek0Var2);
                x9 = aVar4.x();
                if (!y4) {
                }
                x9 = new bi0(13, j1zVar5, rek0Var2);
                aVar4.R(x9);
                q630 f22222 = bu00.f(aVar922, (izs) x9);
                if (androidx.compose.runtime.b.d()) {
                }
                if (androidx.compose.runtime.b.d()) {
                }
                q630 k2222 = a020.k(egi.o(qri.a(sdi.p(sdi.p(p490.t(q630Var.g(f22222), f1zVar32222, j1zVar5, gho0Var2).g(a52222).g(q630Var3222), new tfo0(vvrVar3, j1zVar5)), new luj(j1zVar5, gho0Var2)).g(a4222), aVar10222, new yzs() { // from class: xsna.ugo0
                    @Override // xsna.yzs
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        xgo0 xgo0Var4 = xgo0.this;
                        wh50 wh50Var2 = xgo0Var4.f;
                        androidx.compose.runtime.a aVar112222 = (androidx.compose.runtime.a) obj7;
                        int intValue = ((Integer) obj8).intValue();
                        aVar112222.K(-2137546592);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2137546592, intValue, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:76)");
                        }
                        boolean z192222 = ((Orientation) ((zak0) wh50Var2).getValue()) == Orientation.Vertical || !(aVar112222.r(uvi.n) == LayoutDirection.Rtl);
                        boolean J4 = aVar112222.J(xgo0Var4);
                        Object x18 = aVar112222.x();
                        Object obj9 = a.C0011a.a;
                        if (J4 || x18 == obj9) {
                            x18 = new u2k0(xgo0Var4, 11);
                            aVar112222.R(x18);
                        }
                        khh0 C = m4s.C((izs) x18, aVar112222, 0);
                        boolean J5 = aVar112222.J(C) | aVar112222.J(xgo0Var4);
                        Object x19 = aVar112222.x();
                        if (J5 || x19 == obj9) {
                            x19 = new wgo0(C, xgo0Var4);
                            aVar112222.R(x19);
                        }
                        q630 c422 = ahh0.c(q630.a.a, (wgo0) x19, (Orientation) ((zak0) wh50Var2).getValue(), z2 && ((vak0) xgo0Var4.b).getFloatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z192222, sg50Var, 160);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar112222.j();
                        return c422;
                    }
                }).g(c2222).g(mujVar222), new vl1(j1zVar5, 22)), new h08(12, gho0Var2, yvjVar2));
                if (z2) {
                }
                z13 = z15;
                if (z13) {
                }
                final boolean z192222 = z13;
                final yc8 yc8Var32222 = yc8Var;
                final q630 aVar112222 = aVar5;
                final j1z j1zVar82222 = j1zVar5;
                aVar2 = aVar4;
                b(k2222, gho0Var2, kai.c(-814563849, new wzs() { // from class: xsna.wtj
                    @Override // xsna.wzs
                    public final Object invoke(Object obj6, Object obj7) {
                        androidx.compose.runtime.a aVar12 = (androidx.compose.runtime.a) obj6;
                        int intValue = ((Integer) obj7).intValue();
                        if (aVar12.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-814563849, intValue, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:548)");
                            }
                            final j1z j1zVar9 = j1zVar82222;
                            final nmo0 nmo0Var4 = nmo0Var;
                            final int i25 = i2;
                            final int i26 = i;
                            final xgo0 xgo0Var4 = xgo0Var3;
                            final tho0 tho0Var4 = tho0Var;
                            final b6u0 b6u0Var2 = b6u0Var;
                            final q630 q630Var4 = aVar112222;
                            final q630 q630Var5 = c3222;
                            final q630 q630Var6 = o3222;
                            final q630 q630Var7 = aVar6;
                            final yc8 yc8Var4 = yc8Var32222;
                            final gho0 gho0Var5 = gho0Var2;
                            final boolean z20 = z192222;
                            final boolean z21 = z3;
                            final izs izsVar3 = izsVar2;
                            final uv70 uv70Var9 = uv70Var8222;
                            final azl azlVar4 = azlVar3;
                            yzs.this.invoke(kai.c(-44346382, new wzs() { // from class: xsna.buj
                                @Override // xsna.wzs
                                public final Object invoke(Object obj8, Object obj9) {
                                    q630 apr0Var;
                                    androidx.compose.runtime.a aVar13 = (androidx.compose.runtime.a) obj8;
                                    int intValue2 = ((Integer) obj9).intValue();
                                    if (aVar13.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-44346382, intValue2, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:551)");
                                        }
                                        final j1z j1zVar10 = j1z.this;
                                        q630 j6 = txj0.j(((pco) ((zak0) j1zVar10.g).getValue()).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
                                        int i27 = i25;
                                        final int i28 = i26;
                                        u1v.a(i27, i28);
                                        nmo0 nmo0Var5 = nmo0Var4;
                                        if (i27 != 1 || i28 != Integer.MAX_VALUE) {
                                            j6 = j6.g(new t1v(nmo0Var5, i27, i28));
                                        }
                                        boolean y7 = aVar13.y(j1zVar10);
                                        Object x18 = aVar13.x();
                                        if (y7 || x18 == a.C0011a.a) {
                                            x18 = new trf(j1zVar10, 12);
                                            aVar13.R(x18);
                                        }
                                        gzs gzsVar = (gzs) x18;
                                        xgo0 xgo0Var5 = xgo0Var4;
                                        Orientation orientation2 = (Orientation) ((zak0) xgo0Var5.f).getValue();
                                        final tho0 tho0Var5 = tho0Var4;
                                        long j7 = tho0Var5.b;
                                        int i29 = qko0.c;
                                        int i30 = (int) (j7 >> 32);
                                        long j8 = xgo0Var5.e;
                                        if (i30 == ((int) (j8 >> 32)) && (i30 = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                                            i30 = qko0.f(j7);
                                        }
                                        xgo0Var5.e = tho0Var5.b;
                                        klp0 a6 = yir0.a(b6u0Var2, tho0Var5.a);
                                        int i31 = vgo0.a.$EnumSwitchMapping$0[orientation2.ordinal()];
                                        if (i31 == 1) {
                                            apr0Var = new apr0(xgo0Var5, i30, a6, gzsVar);
                                        } else {
                                            if (i31 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            apr0Var = new pfv(xgo0Var5, i30, a6, gzsVar);
                                        }
                                        q630 s = fo50.s(rte0.e(j6).g(apr0Var).g(q630Var4).g(q630Var5).g(new rho0(nmo0Var5)).g(q630Var6).g(q630Var7), yc8Var4);
                                        final gho0 gho0Var6 = gho0Var5;
                                        final boolean z22 = z20;
                                        final boolean z23 = z21;
                                        final izs izsVar4 = izsVar3;
                                        final uv70 uv70Var10 = uv70Var9;
                                        final azl azlVar5 = azlVar4;
                                        frj0.a(s, kai.c(1412697320, new wzs() { // from class: xsna.cuj
                                            @Override // xsna.wzs
                                            public final Object invoke(Object obj10, Object obj11) {
                                                androidx.compose.runtime.a aVar14 = (androidx.compose.runtime.a) obj10;
                                                int intValue3 = ((Integer) obj11).intValue();
                                                if (aVar14.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(1412697320, intValue3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:572)");
                                                    }
                                                    j1z j1zVar11 = j1zVar10;
                                                    guj gujVar = new guj(j1zVar11, izsVar4, tho0Var5, uv70Var10, azlVar5, i28);
                                                    int hashCode = Long.hashCode(n34.n(aVar14));
                                                    sy90 D = aVar14.D();
                                                    q630 c422 = qri.c(aVar14, q630.a.a);
                                                    cri.h7.getClass();
                                                    LayoutNode.a aVar15 = cri.a.b;
                                                    if (aVar14.N() == null) {
                                                        n34.r();
                                                        throw null;
                                                    }
                                                    aVar14.H();
                                                    if (aVar14.L()) {
                                                        aVar14.I(aVar15);
                                                    } else {
                                                        aVar14.f();
                                                    }
                                                    k9q0.w(aVar14, gujVar, cri.a.f);
                                                    k9q0.w(aVar14, D, cri.a.e);
                                                    k9q0.w(aVar14, Integer.valueOf(hashCode), cri.a.g);
                                                    k9q0.t(aVar14, cri.a.h);
                                                    k9q0.w(aVar14, c422, cri.a.d);
                                                    aVar14.G();
                                                    HandleState a7 = j1zVar11.a();
                                                    HandleState handleState = HandleState.None;
                                                    boolean z24 = z22;
                                                    boolean z25 = a7 != handleState && j1zVar11.c() != null && j1zVar11.c().e() && z24;
                                                    gho0 gho0Var7 = gho0.this;
                                                    kuj.c(gho0Var7, z25, aVar14, 0);
                                                    if (j1zVar11.a() == HandleState.Cursor && !z23 && z24) {
                                                        aVar14.K(-714666198);
                                                        kuj.d(gho0Var7, aVar14, 0);
                                                        aVar14.j();
                                                    } else {
                                                        aVar14.K(-714589318);
                                                        aVar14.j();
                                                    }
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar14.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, aVar13), aVar13, 48);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar13.h();
                                    }
                                    return s3q0.a;
                                }
                            }, aVar12), aVar12, 6);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar12.h();
                        }
                        return s3q0.a;
                    }
                }, aVar2), aVar2, 384);
                if (androidx.compose.runtime.b.d()) {
                }
            }
            z7 = false;
            if (qko0Var2 != null) {
            }
            if (z6) {
            }
            c2p c2pVar22 = (c2p) cwmVar.c;
            c2pVar22.d = -1;
            c2pVar22.e = -1;
            b2 = tho0.b(tho0Var, null, 0L, 3);
            tho0 tho0Var32 = (tho0) cwmVar.b;
            cwmVar.b = b2;
            if (sio0Var != null) {
            }
            x = aVar4.x();
            obj2 = obj;
            if (x != obj2) {
            }
            c3q0Var = (c3q0) x;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!c3q0Var.f) {
            }
            c3q0Var.e = Long.valueOf(currentTimeMillis2);
            c3q0Var.a(tho0Var);
            x2 = aVar4.x();
            if (x2 == obj2) {
            }
            final yvj yvjVar32 = (yvj) x2;
            x3 = aVar4.x();
            if (x3 == obj2) {
            }
            final yc8 yc8Var22 = (yc8) x3;
            x4 = aVar4.x();
            if (x4 == obj2) {
            }
            final gho0 gho0Var32 = (gho0) x4;
            final uv70 uv70Var72 = uv70Var;
            gho0Var32.b = uv70Var72;
            gho0Var32.f = b6u0Var;
            gho0Var32.c = j1zVar6.v;
            gho0Var32.d = j1zVar6;
            ((zak0) gho0Var32.e).setValue(tho0Var);
            gho0Var32.x = new qko0(j3);
            gho0Var32.h = (wfd) aVar4.r(uvi.f);
            gho0Var32.i = yvjVar32;
            gho0Var32.k = (ymo0) aVar4.r(uvi.r);
            gho0Var32.l = (vtu) aVar4.r(uvi.l);
            gho0Var32.m = rwrVar3;
            final boolean z172 = !z3;
            ((zak0) gho0Var32.n).setValue(Boolean.valueOf(z172));
            ((zak0) gho0Var32.o).setValue(Boolean.valueOf(z2));
            aVar4.K(1966756105);
            gho0Var32.j = gua0.b(SelectedTextType.EditableText, nmo0Var3.a.k, aVar4, 6);
            aVar4.j();
            j1zVar6.b();
            i10 = i8;
            int i182 = i10 & 7168;
            int i192 = i9;
            boolean y52 = (i182 != 2048) | aVar4.y(j1zVar6) | ((i10 & 57344) != 16384) | aVar4.y(mio0Var2) | (i192 != 4);
            i11 = (i10 & 112) ^ 48;
            if (i11 <= 32) {
            }
            z8 = y52;
            c3q0Var2 = c3q0Var;
            if ((i10 & 48) != 32) {
            }
            z9 = true;
            y = z8 | z9 | aVar4.y(uv70Var72) | aVar4.y(yvjVar32) | aVar4.y(yc8Var22) | aVar4.y(gho0Var32);
            Object x16222 = aVar4.x();
            if (y) {
            }
            i12 = i192;
            f1zVar = f1zVar2;
            vvrVar3 = vvrVar2;
            j1zVar2 = j1zVar6;
            obj4 = obj2;
            final rnw rnwVar5222 = rnwVar2;
            rwrVar = rwrVar3;
            obj3 = new izs() { // from class: xsna.ytj
                @Override // xsna.izs
                public final Object invoke(Object obj6) {
                    mjo0 d;
                    xwr xwrVar = (xwr) obj6;
                    j1z j1zVar73 = j1z.this;
                    if (j1zVar73.b() == xwrVar.h()) {
                        return s3q0.a;
                    }
                    ((zak0) j1zVar73.f).setValue(Boolean.valueOf(xwrVar.h()));
                    boolean b53 = j1zVar73.b();
                    tho0 tho0Var4 = tho0Var;
                    uv70 uv70Var83 = uv70Var72;
                    if (b53 && z2 && !z3) {
                        kuj.g(mio0Var2, j1zVar73, tho0Var4, rnwVar5222, uv70Var83);
                    } else {
                        kuj.e(j1zVar73);
                    }
                    if (xwrVar.h() && (d = j1zVar73.d()) != null) {
                        myc0.h(yvjVar32, null, null, new huj(yc8Var22, tho0Var4, j1zVar73, d, uv70Var83, null), 3);
                    }
                    if (!xwrVar.h()) {
                        gho0Var32.i(null);
                    }
                    return s3q0.a;
                }
            };
            uv70Var2 = uv70Var72;
            yc8Var = yc8Var22;
            tho0Var2 = tho0Var;
            gho0Var32 = gho0Var32;
            yvjVar = yvjVar32;
            z10 = z2;
            mio0Var = mio0Var2;
            rnwVar3 = rnwVar5222;
            aVar4.R(obj3);
            q630.a aVar9222 = q630.a.a;
            q630 a3222 = mxr.a(fvr.u(jvi.d(aVar9222, rwrVar), (izs) obj3), z10, sg50Var);
            wh50 c422 = androidx.compose.runtime.k.c(Boolean.valueOf((z10 || z3) ? false : true), aVar4, 0);
            s3q0 s3q0Var2222 = s3q0.a;
            boolean J3222 = aVar4.J(c422) | aVar4.y(j1zVar2) | aVar4.y(mio0Var) | aVar4.y(gho0Var32);
            if (i11 > 32) {
            }
            j1zVar3 = j1zVar2;
            if ((i10 & 48) != 32) {
            }
            z11 = true;
            z12 = J3222 | z11;
            Object x172222 = aVar4.x();
            if (z12) {
            }
            mio0 mio0Var32222 = mio0Var;
            gho0 gho0Var42222 = gho0Var32;
            rnw rnwVar62222 = rnwVar3;
            gho0Var = gho0Var42222;
            yvjVar2 = yvjVar;
            q630Var2 = a3222;
            rwrVar2 = rwrVar;
            s3q0Var = s3q0Var2222;
            j1zVar4 = j1zVar3;
            sg50Var2 = sg50Var;
            fujVar = new fuj(j1zVar4, c422, mio0Var32222, gho0Var, rnwVar62222, null);
            wh50Var = c422;
            mio0Var = mio0Var32222;
            aVar4.R(fujVar);
            bap.g(s3q0Var, (wzs) fujVar, aVar4, 6);
            int i202222 = i10 >> 3;
            int i212222 = (i202222 & 896) | 196614 | ((i7 >> 9) & 7168) | ((i10 << 6) & 3670016);
            if (androidx.compose.runtime.b.d()) {
            }
            q630 b52222 = skn0.b(aVar9222, 8675309, new edi0(new ujm0(j1zVar4, 3)));
            gho0Var2 = gho0Var;
            uv70Var3 = uv70Var2;
            q630 q630Var32222 = q630Var2;
            mio0 mio0Var42222 = mio0Var;
            final rwr rwrVar42222 = rwrVar2;
            q630 g2222 = (z2 ? qri.a(b52222, a5x.a, new rgo0(0, new izs() { // from class: xsna.ogo0
                @Override // xsna.izs
                public final Object invoke(Object obj6) {
                    nek0 nek0Var2;
                    ov70 ov70Var = (ov70) obj6;
                    j1z j1zVar72222 = j1z.this;
                    if (!j1zVar72222.b()) {
                        rwr.b(rwrVar42222);
                    } else if (!z3 && (nek0Var2 = j1zVar72222.c) != null) {
                        nek0Var2.show();
                    }
                    if (j1zVar72222.b() && z2) {
                        if (j1zVar72222.a() != HandleState.Selection) {
                            mjo0 d = j1zVar72222.d();
                            if (d != null) {
                                long j523 = ov70Var.a;
                                cwm cwmVar2 = j1zVar72222.d;
                                bzw bzwVar2222 = j1zVar72222.v;
                                int a42222 = uv70Var3.a(d.b(j523, true));
                                bzwVar2222.invoke(tho0.b((tho0) cwmVar2.b, null, jgz.c(a42222, a42222), 5));
                                if (j1zVar72222.a.a.c.length() > 0) {
                                    ((zak0) j1zVar72222.k).setValue(HandleState.Cursor);
                                }
                            }
                        } else {
                            gho0Var2.i(ov70Var);
                        }
                    }
                    return s3q0.a;
                }
            }, sg50Var2)) : b52222).g(new okn0(gho0Var2.B, gho0Var2.A, null, new pgo0(gho0Var2), 4));
            ulb0.a.getClass();
            q630 c22222 = e7b0.c(g2222, y000.c);
            if (androidx.compose.runtime.b.d()) {
            }
            final q630 c32222 = bu00.c(aVar9222, new wyg(j1zVar4, tho0Var2, uv70Var3, 1));
            boolean y62222 = aVar4.y(j1zVar4) | (i182 == 2048);
            spx0Var2 = spx0Var;
            int i222222 = i12;
            J = y62222 | aVar4.J(spx0Var2) | aVar4.y(gho0Var2) | (i222222 == 4) | aVar4.y(uv70Var3);
            x5 = aVar4.x();
            if (J) {
            }
            zm0 zm0Var2222 = new zm0(j1zVar4, z2, spx0Var2, gho0Var2, tho0Var2, uv70Var3);
            spx0Var3 = spx0Var2;
            aVar4.R(zm0Var2222);
            x5 = zm0Var2222;
            final q630 o32222 = egi.o(aVar9222, (izs) x5);
            j1z j1zVar72222 = j1zVar4;
            muj mujVar2222 = new muj(klp0Var, tho0Var, j1zVar72222, z3, z2, uv70Var3, gho0Var2, rnwVar, rwrVar2);
            j1zVar5 = j1zVar72222;
            if (!z2 && !z3 && spx0Var3.b() && qko0.c(((qko0) ((zak0) j1zVar5.A).getValue()).a) && qko0.c(((qko0) ((zak0) j1zVar5.B).getValue()).a)) {
            }
            y2 = aVar4.y(gho0Var2);
            x6 = aVar4.x();
            if (!y2) {
            }
            x6 = new omf(gho0Var2, 8);
            aVar4.R(x6);
            bap.c(gho0Var2, (izs) x6, aVar4, 0);
            y3 = aVar4.y(j1zVar5) | aVar4.y(mio0Var42222) | (i222222 == 4) | ((i11 <= 32 && aVar4.J(rnwVar)) || (i10 & 48) == 32);
            x7 = aVar4.x();
            if (y3) {
            }
            i13 = 8;
            ztj ztjVar2222 = new ztj(j1zVar5, mio0Var42222, tho0Var, rnwVar, 0);
            rnwVar4 = rnwVar;
            aVar4.R(ztjVar2222);
            x7 = ztjVar2222;
            bap.c(rnwVar4, (izs) x7, aVar4, i202222 & 14);
            final izs bzwVar2222 = j1zVar5.v;
            if (i == 1) {
            }
            final uv70 uv70Var82222 = uv70Var4;
            final int i232222 = rnwVar4.e;
            z13 = true;
            final c3q0 c3q0Var32222 = c3q0Var2;
            yzs yzsVar22222 = new yzs() { // from class: xsna.hgo0
                @Override // xsna.yzs
                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                    androidx.compose.runtime.a aVar102222 = (androidx.compose.runtime.a) obj7;
                    int intValue = ((Integer) obj8).intValue();
                    aVar102222.K(851809892);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(851809892, intValue, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:256)");
                    }
                    Object x18 = aVar102222.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x18 == c0012a) {
                        x18 = new pko0();
                        aVar102222.R(x18);
                    }
                    pko0 pko0Var = (pko0) x18;
                    Object x19 = aVar102222.x();
                    if (x19 == c0012a) {
                        x19 = new h2l();
                        aVar102222.R(x19);
                    }
                    ggo0 ggo0Var = new ggo0(j1z.this, gho0Var2, tho0Var, z172, z18, pko0Var, uv70Var82222, c3q0Var32222, (h2l) x19, bzwVar2222, i232222);
                    boolean y7 = aVar102222.y(ggo0Var);
                    Object x20 = aVar102222.x();
                    if (y7 || x20 == c0012a) {
                        odg odgVar = new odg(1, ggo0Var, ggo0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 7);
                        aVar102222.R(odgVar);
                        x20 = odgVar;
                    }
                    q630 o4 = sdi.o(q630.a.a, (izs) ((fcy) x20));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar102222.j();
                    return o4;
                }
            };
            a5x.a aVar102222 = a5x.a;
            q630 a42222 = qri.a(aVar9222, aVar102222, yzsVar22222);
            int i242222 = rnwVar4.d;
            if (i242222 == 7) {
            }
            boolean booleanValue22222 = ((Boolean) wh50Var.getValue()).booleanValue();
            final f1z f1zVar322222 = f1zVar;
            l = aVar4.l(z14) | aVar4.y(f1zVar322222);
            x8 = aVar4.x();
            if (!l) {
            }
            x8 = new gzs() { // from class: xsna.auj
                @Override // xsna.gzs
                public final Object invoke() {
                    if (z14) {
                        f1zVar322222.i();
                    }
                    return s3q0.a;
                }
            };
            aVar4.R(x8);
            q630 a522222 = mtm0.a((gzs) x8, booleanValue22222, z14);
            yk8 yk8Var22222 = (yk8) aVar4.r(ko5.a);
            long j522222 = ((l5g) aVar4.r(ko5.b)).a;
            if (l5g.d(j522222, f870.c(1308617531))) {
            }
            y4 = aVar4.y(j1zVar5) | aVar4.J(rek0Var2);
            x9 = aVar4.x();
            if (!y4) {
            }
            x9 = new bi0(13, j1zVar5, rek0Var2);
            aVar4.R(x9);
            q630 f222222 = bu00.f(aVar9222, (izs) x9);
            if (androidx.compose.runtime.b.d()) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            q630 k22222 = a020.k(egi.o(qri.a(sdi.p(sdi.p(p490.t(q630Var.g(f222222), f1zVar322222, j1zVar5, gho0Var2).g(a522222).g(q630Var32222), new tfo0(vvrVar3, j1zVar5)), new luj(j1zVar5, gho0Var2)).g(a42222), aVar102222, new yzs() { // from class: xsna.ugo0
                @Override // xsna.yzs
                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                    xgo0 xgo0Var4 = xgo0.this;
                    wh50 wh50Var2 = xgo0Var4.f;
                    androidx.compose.runtime.a aVar1122222 = (androidx.compose.runtime.a) obj7;
                    int intValue = ((Integer) obj8).intValue();
                    aVar1122222.K(-2137546592);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2137546592, intValue, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:76)");
                    }
                    boolean z1922222 = ((Orientation) ((zak0) wh50Var2).getValue()) == Orientation.Vertical || !(aVar1122222.r(uvi.n) == LayoutDirection.Rtl);
                    boolean J4 = aVar1122222.J(xgo0Var4);
                    Object x18 = aVar1122222.x();
                    Object obj9 = a.C0011a.a;
                    if (J4 || x18 == obj9) {
                        x18 = new u2k0(xgo0Var4, 11);
                        aVar1122222.R(x18);
                    }
                    khh0 C = m4s.C((izs) x18, aVar1122222, 0);
                    boolean J5 = aVar1122222.J(C) | aVar1122222.J(xgo0Var4);
                    Object x19 = aVar1122222.x();
                    if (J5 || x19 == obj9) {
                        x19 = new wgo0(C, xgo0Var4);
                        aVar1122222.R(x19);
                    }
                    q630 c4222 = ahh0.c(q630.a.a, (wgo0) x19, (Orientation) ((zak0) wh50Var2).getValue(), z2 && ((vak0) xgo0Var4.b).getFloatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z1922222, sg50Var, 160);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar1122222.j();
                    return c4222;
                }
            }).g(c22222).g(mujVar2222), new vl1(j1zVar5, 22)), new h08(12, gho0Var2, yvjVar2));
            if (z2) {
            }
            z13 = z15;
            if (z13) {
            }
            final boolean z1922222 = z13;
            final yc8 yc8Var322222 = yc8Var;
            final q630 aVar1122222 = aVar5;
            final j1z j1zVar822222 = j1zVar5;
            aVar2 = aVar4;
            b(k22222, gho0Var2, kai.c(-814563849, new wzs() { // from class: xsna.wtj
                @Override // xsna.wzs
                public final Object invoke(Object obj6, Object obj7) {
                    androidx.compose.runtime.a aVar12 = (androidx.compose.runtime.a) obj6;
                    int intValue = ((Integer) obj7).intValue();
                    if (aVar12.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-814563849, intValue, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:548)");
                        }
                        final j1z j1zVar9 = j1zVar822222;
                        final nmo0 nmo0Var4 = nmo0Var;
                        final int i25 = i2;
                        final int i26 = i;
                        final xgo0 xgo0Var4 = xgo0Var3;
                        final tho0 tho0Var4 = tho0Var;
                        final b6u0 b6u0Var2 = b6u0Var;
                        final q630 q630Var4 = aVar1122222;
                        final q630 q630Var5 = c32222;
                        final q630 q630Var6 = o32222;
                        final q630 q630Var7 = aVar6;
                        final yc8 yc8Var4 = yc8Var322222;
                        final gho0 gho0Var5 = gho0Var2;
                        final boolean z20 = z1922222;
                        final boolean z21 = z3;
                        final izs izsVar3 = izsVar2;
                        final uv70 uv70Var9 = uv70Var82222;
                        final azl azlVar4 = azlVar3;
                        yzs.this.invoke(kai.c(-44346382, new wzs() { // from class: xsna.buj
                            @Override // xsna.wzs
                            public final Object invoke(Object obj8, Object obj9) {
                                q630 apr0Var;
                                androidx.compose.runtime.a aVar13 = (androidx.compose.runtime.a) obj8;
                                int intValue2 = ((Integer) obj9).intValue();
                                if (aVar13.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-44346382, intValue2, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:551)");
                                    }
                                    final j1z j1zVar10 = j1z.this;
                                    q630 j6 = txj0.j(((pco) ((zak0) j1zVar10.g).getValue()).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
                                    int i27 = i25;
                                    final int i28 = i26;
                                    u1v.a(i27, i28);
                                    nmo0 nmo0Var5 = nmo0Var4;
                                    if (i27 != 1 || i28 != Integer.MAX_VALUE) {
                                        j6 = j6.g(new t1v(nmo0Var5, i27, i28));
                                    }
                                    boolean y7 = aVar13.y(j1zVar10);
                                    Object x18 = aVar13.x();
                                    if (y7 || x18 == a.C0011a.a) {
                                        x18 = new trf(j1zVar10, 12);
                                        aVar13.R(x18);
                                    }
                                    gzs gzsVar = (gzs) x18;
                                    xgo0 xgo0Var5 = xgo0Var4;
                                    Orientation orientation2 = (Orientation) ((zak0) xgo0Var5.f).getValue();
                                    final tho0 tho0Var5 = tho0Var4;
                                    long j7 = tho0Var5.b;
                                    int i29 = qko0.c;
                                    int i30 = (int) (j7 >> 32);
                                    long j8 = xgo0Var5.e;
                                    if (i30 == ((int) (j8 >> 32)) && (i30 = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                                        i30 = qko0.f(j7);
                                    }
                                    xgo0Var5.e = tho0Var5.b;
                                    klp0 a6 = yir0.a(b6u0Var2, tho0Var5.a);
                                    int i31 = vgo0.a.$EnumSwitchMapping$0[orientation2.ordinal()];
                                    if (i31 == 1) {
                                        apr0Var = new apr0(xgo0Var5, i30, a6, gzsVar);
                                    } else {
                                        if (i31 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        apr0Var = new pfv(xgo0Var5, i30, a6, gzsVar);
                                    }
                                    q630 s = fo50.s(rte0.e(j6).g(apr0Var).g(q630Var4).g(q630Var5).g(new rho0(nmo0Var5)).g(q630Var6).g(q630Var7), yc8Var4);
                                    final gho0 gho0Var6 = gho0Var5;
                                    final boolean z22 = z20;
                                    final boolean z23 = z21;
                                    final izs izsVar4 = izsVar3;
                                    final uv70 uv70Var10 = uv70Var9;
                                    final azl azlVar5 = azlVar4;
                                    frj0.a(s, kai.c(1412697320, new wzs() { // from class: xsna.cuj
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj10, Object obj11) {
                                            androidx.compose.runtime.a aVar14 = (androidx.compose.runtime.a) obj10;
                                            int intValue3 = ((Integer) obj11).intValue();
                                            if (aVar14.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1412697320, intValue3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:572)");
                                                }
                                                j1z j1zVar11 = j1zVar10;
                                                guj gujVar = new guj(j1zVar11, izsVar4, tho0Var5, uv70Var10, azlVar5, i28);
                                                int hashCode = Long.hashCode(n34.n(aVar14));
                                                sy90 D = aVar14.D();
                                                q630 c4222 = qri.c(aVar14, q630.a.a);
                                                cri.h7.getClass();
                                                LayoutNode.a aVar15 = cri.a.b;
                                                if (aVar14.N() == null) {
                                                    n34.r();
                                                    throw null;
                                                }
                                                aVar14.H();
                                                if (aVar14.L()) {
                                                    aVar14.I(aVar15);
                                                } else {
                                                    aVar14.f();
                                                }
                                                k9q0.w(aVar14, gujVar, cri.a.f);
                                                k9q0.w(aVar14, D, cri.a.e);
                                                k9q0.w(aVar14, Integer.valueOf(hashCode), cri.a.g);
                                                k9q0.t(aVar14, cri.a.h);
                                                k9q0.w(aVar14, c4222, cri.a.d);
                                                aVar14.G();
                                                HandleState a7 = j1zVar11.a();
                                                HandleState handleState = HandleState.None;
                                                boolean z24 = z22;
                                                boolean z25 = a7 != handleState && j1zVar11.c() != null && j1zVar11.c().e() && z24;
                                                gho0 gho0Var7 = gho0.this;
                                                kuj.c(gho0Var7, z25, aVar14, 0);
                                                if (j1zVar11.a() == HandleState.Cursor && !z23 && z24) {
                                                    aVar14.K(-714666198);
                                                    kuj.d(gho0Var7, aVar14, 0);
                                                    aVar14.j();
                                                } else {
                                                    aVar14.K(-714589318);
                                                    aVar14.j();
                                                }
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar14.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar13), aVar13, 48);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar13.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar12), aVar12, 6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar12.h();
                    }
                    return s3q0.a;
                }
            }, aVar2), aVar2, 384);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xtj
                @Override // xsna.wzs
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int I = ne7.I(i3 | 1);
                    int I2 = ne7.I(i4);
                    kuj.a(tho0.this, izsVar, q630Var, nmo0Var, b6u0Var, izsVar2, sg50Var, rek0Var, z, i, i2, rnwVar, ueyVar, z2, z3, yzsVar, (androidx.compose.runtime.a) obj6, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(q630 q630Var, gho0 gho0Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2036174316);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.y(gho0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2036174316, i2, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:661)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, true);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            egi.c(gho0Var, jaiVar, M, (i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mt(i, 3, q630Var, gho0Var, jaiVar);
        }
    }

    public static final void c(final gho0 gho0Var, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        mjo0 d;
        ljo0 ljo0Var;
        androidx.compose.runtime.a M = aVar.M(626339208);
        int i2 = (M.y(gho0Var) ? 4 : 2) | i | (M.l(z) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(626339208, i2, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1014)");
            }
            if (z) {
                M.K(1530097388);
                j1z j1zVar = gho0Var.d;
                ljo0 ljo0Var2 = null;
                if (j1zVar != null && (d = j1zVar.d()) != null && (ljo0Var = d.a) != null) {
                    j1z j1zVar2 = gho0Var.d;
                    if (!(j1zVar2 != null ? j1zVar2.p : true)) {
                        ljo0Var2 = ljo0Var;
                    }
                }
                if (ljo0Var2 == null) {
                    M.K(1530097387);
                    M.j();
                } else {
                    M.K(1530097388);
                    if (qko0.c(gho0Var.p().b)) {
                        M.K(2110860558);
                        M.j();
                    } else {
                        M.K(2109807302);
                        int b2 = gho0Var.b.b((int) (gho0Var.p().b >> 32));
                        int b3 = gho0Var.b.b((int) (gho0Var.p().b & 4294967295L));
                        ResolvedTextDirection a2 = ljo0Var2.a(b2);
                        ResolvedTextDirection a3 = ljo0Var2.a(Math.max(b3 - 1, 0));
                        j1z j1zVar3 = gho0Var.d;
                        if (j1zVar3 == null || !((Boolean) ((zak0) j1zVar3.m).getValue()).booleanValue()) {
                            M.K(2110490542);
                            M.j();
                        } else {
                            M.K(2110225306);
                            jho0.a(true, a2, gho0Var, M, ((i2 << 6) & 896) | 6);
                            M.j();
                        }
                        j1z j1zVar4 = gho0Var.d;
                        if (j1zVar4 == null || !((Boolean) ((zak0) j1zVar4.n).getValue()).booleanValue()) {
                            M.K(2110838734);
                            M.j();
                        } else {
                            M.K(2110574459);
                            jho0.a(false, a3, gho0Var, M, ((i2 << 6) & 896) | 6);
                            M.j();
                        }
                        M.j();
                    }
                    j1z j1zVar5 = gho0Var.d;
                    if (j1zVar5 != null) {
                        wh50 wh50Var = j1zVar5.l;
                        if (!epx.f(gho0Var.v.a.c, gho0Var.p().a.c)) {
                            ((zak0) wh50Var).setValue(Boolean.FALSE);
                        }
                        if (j1zVar5.b()) {
                            if (((Boolean) ((zak0) wh50Var).getValue()).booleanValue()) {
                                gho0Var.t();
                            } else {
                                gho0Var.q();
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                    M.j();
                }
                M.j();
            } else {
                M.K(1989076778);
                M.j();
                gho0Var.q();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, i) { // from class: xsna.euj
                public final /* synthetic */ boolean c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    kuj.c(gho0.this, this.c, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(gho0 gho0Var, androidx.compose.runtime.a aVar, int i) {
        us2 o;
        androidx.compose.runtime.a M = aVar.M(-1436003720);
        int i2 = (M.y(gho0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1436003720, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1061)");
            }
            j1z j1zVar = gho0Var.d;
            if (j1zVar == null || !((Boolean) ((zak0) j1zVar.o).getValue()).booleanValue() || (o = gho0Var.o()) == null || o.c.length() <= 0) {
                M.K(-2111042550);
                M.j();
            } else {
                M.K(-2112351432);
                boolean J = M.J(gho0Var);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (J || x == c0012a) {
                    x = new cho0(gho0Var);
                    M.R(x);
                }
                zdo0 zdo0Var = (zdo0) x;
                azl azlVar = (azl) M.r(uvi.h);
                uv70 uv70Var = gho0Var.b;
                long j = gho0Var.p().b;
                int i3 = qko0.c;
                int b2 = uv70Var.b((int) (j >> 32));
                j1z j1zVar2 = gho0Var.d;
                ljo0 ljo0Var = (j1zVar2 != null ? j1zVar2.d() : null).a;
                zhf0 c = ljo0Var.c(swe0.g(b2, 0, ljo0Var.a.a.c.length()));
                final long floatToRawIntBits = (Float.floatToRawIntBits((azlVar.I0(pfo0.a) / 2) + c.a) << 32) | (Float.floatToRawIntBits(c.d) & 4294967295L);
                boolean p = M.p(floatToRawIntBits);
                Object x2 = M.x();
                if (p || x2 == c0012a) {
                    x2 = new a(floatToRawIntBits);
                    M.R(x2);
                }
                wv70 wv70Var = (wv70) x2;
                boolean y = M.y(zdo0Var) | M.y(gho0Var);
                Object x3 = M.x();
                if (y || x3 == c0012a) {
                    x3 = new b(zdo0Var, gho0Var);
                    M.R(x3);
                }
                q630 b3 = skn0.b(q630.a.a, zdo0Var, (PointerInputEventHandler) x3);
                boolean p2 = M.p(floatToRawIntBits);
                Object x4 = M.x();
                if (p2 || x4 == c0012a) {
                    x4 = new izs() { // from class: xsna.duj
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            ((tgi0) obj).a(kdi0.c, new jdi0(Handle.Cursor, floatToRawIntBits, SelectionHandleAnchor.Middle, true));
                            return s3q0.a;
                        }
                    };
                    M.R(x4);
                }
                s72.a(wv70Var, egi0.b(b3, false, (izs) x4), 0L, M, 0);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.s(gho0Var, i, 5);
        }
    }

    public static final void e(j1z j1zVar) {
        sio0 sio0Var = j1zVar.e;
        if (sio0Var != null) {
            j1zVar.v.invoke(tho0.b((tho0) j1zVar.d.b, null, 0L, 3));
            mio0 mio0Var = sio0Var.a;
            AtomicReference<sio0> atomicReference = mio0Var.b;
            while (true) {
                if (atomicReference.compareAndSet(sio0Var, null)) {
                    mio0Var.a.a();
                    break;
                } else if (atomicReference.get() != sio0Var) {
                    break;
                }
            }
        }
        j1zVar.e = null;
    }

    public static final void f(j1z j1zVar, tho0 tho0Var, uv70 uv70Var) {
        dak0 a2 = dak0.a.a();
        izs<Object, s3q0> e = a2 != null ? a2.e() : null;
        dak0 b2 = dak0.a.b(a2);
        try {
            mjo0 d = j1zVar.d();
            if (d == null) {
                return;
            }
            sio0 sio0Var = j1zVar.e;
            if (sio0Var == null) {
                return;
            }
            tny c = j1zVar.c();
            if (c == null) {
                return;
            }
            rfo0.a(tho0Var, j1zVar.a, d.a, c, sio0Var, j1zVar.b(), uv70Var);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            dak0.a.d(a2, b2, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.Object, xsna.sio0] */
    public static final void g(mio0 mio0Var, j1z j1zVar, tho0 tho0Var, rnw rnwVar, uv70 uv70Var) {
        cwm cwmVar = j1zVar.d;
        bzw bzwVar = j1zVar.v;
        c2u c2uVar = j1zVar.w;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        lq5 lq5Var = new lq5(cwmVar, bzwVar, ref$ObjectRef, 2);
        oua0 oua0Var = mio0Var.a;
        oua0Var.f(tho0Var, rnwVar, lq5Var, c2uVar);
        ?? sio0Var = new sio0(mio0Var, oua0Var);
        mio0Var.b.set(sio0Var);
        ref$ObjectRef.element = sio0Var;
        j1zVar.e = sio0Var;
        f(j1zVar, tho0Var, uv70Var);
    }
}
