package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.nm8;
import xsna.p52;

/* compiled from: AndroidContentCaptureManager.android.kt */
/* loaded from: classes11.dex */
public final class b72 implements nhl, View.OnAttachStateChangeListener {
    public final p52 b;
    public final p52.e c;
    public xfj d;
    public final ArrayList e = new ArrayList();
    public final long f = 100;
    public a g = a.SHOW_ORIGINAL;
    public boolean h = true;
    public final nm8 i = w0b.a(1, null, null, 6);
    public final Handler j = new Handler(Looper.getMainLooper());
    public pg50 k;
    public long l;
    public final pg50<jgi0> m;
    public jgi0 n;
    public boolean o;
    public final a72 p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AndroidContentCaptureManager.android.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a SHOW_ORIGINAL;
        public static final a SHOW_TRANSLATED;

        static {
            a aVar = new a("SHOW_ORIGINAL", 0);
            SHOW_ORIGINAL = aVar;
            a aVar2 = new a("SHOW_TRANSLATED", 1);
            SHOW_TRANSLATED = aVar2;
            a[] aVarArr = {aVar, aVar2};
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

    /* compiled from: AndroidContentCaptureManager.android.kt */
    public static final class b {
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        
            r4 = r4.getValue("android:text");
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        
            r4 = r4.getText();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void a(b72 b72Var, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            lgi0 b;
            igi0 igi0Var;
            ck ckVar;
            izs izsVar;
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                long keyAt = longSparseArray.keyAt(i);
                ViewTranslationResponse a = f72.a(longSparseArray.get(keyAt));
                if (a != null && value != null && text != null && (b = b72Var.d().b((int) keyAt)) != null && (igi0Var = b.a) != null && (ckVar = (ck) zfi0.a(igi0Var.d, wfi0.l)) != null && (izsVar = (izs) ckVar.b) != null) {
                }
            }
        }
    }

    /* compiled from: AndroidContentCaptureManager.android.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ufj.values().length];
            try {
                iArr[ufj.VIEW_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ufj.VIEW_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AndroidContentCaptureManager.android.kt */
    public static final class d extends Lambda implements izs<igi0, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(igi0 igi0Var) {
            xfi0 k = igi0Var.k();
            return Boolean.valueOf(k.b.b(ngi0.B));
        }
    }

    /* compiled from: AndroidContentCaptureManager.android.kt */
    public static final class e extends Lambda implements wzs<Integer, igi0, s3q0> {
        final /* synthetic */ jgi0 $oldNode;
        final /* synthetic */ b72 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(jgi0 jgi0Var, b72 b72Var) {
            super(2);
            this.$oldNode = jgi0Var;
            this.this$0 = b72Var;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(Integer num, igi0 igi0Var) {
            int intValue = num.intValue();
            igi0 igi0Var2 = igi0Var;
            if (!this.$oldNode.b.a(igi0Var2.f)) {
                this.this$0.i(intValue, igi0Var2);
                this.this$0.i.f(s3q0.a);
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidContentCaptureManager.android.kt */
    public static final class f extends Lambda implements wzs<Integer, igi0, s3q0> {
        public f() {
            super(2);
        }

        @Override // xsna.wzs
        public final s3q0 invoke(Integer num, igi0 igi0Var) {
            b72.this.i(num.intValue(), igi0Var);
            return s3q0.a;
        }
    }

    public b72(p52 p52Var, p52.e eVar) {
        this.b = p52Var;
        this.c = eVar;
        pg50 pg50Var = g9x.a;
        this.k = pg50Var;
        this.m = g9x.a();
        this.n = new jgi0(p52Var.getSemanticsOwner().a(), pg50Var);
        this.p = new a72(this, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (xsna.qsl.b(r7.f, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0083 -> B:11:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        k72 k72Var;
        int i;
        o0b aVar;
        Handler handler;
        if (continuationImpl instanceof k72) {
            k72Var = (k72) continuationImpl;
            int i2 = k72Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k72Var.label = i2 - Integer.MIN_VALUE;
                Object obj = k72Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = k72Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    nm8 nm8Var = this.i;
                    nm8Var.getClass();
                    aVar = new nm8.a();
                } else if (i == 1) {
                    aVar = (o0b) k72Var.L$0;
                    kotlin.a.a(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return s3q0.a;
                    }
                    aVar.next();
                    if (e()) {
                        f();
                    }
                    if (!this.o && (handler = this.j) != null) {
                        this.o = true;
                        handler.post(this.p);
                    }
                    k72Var.L$0 = aVar;
                    k72Var.label = 2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (o0b) k72Var.L$0;
                    kotlin.a.a(obj);
                }
                k72Var.L$0 = aVar;
                k72Var.label = 1;
                obj = aVar.a(k72Var);
            }
        }
        k72Var = new k72(this, continuationImpl);
        Object obj2 = k72Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = k72Var.label;
        if (i != 0) {
        }
        k72Var.L$0 = aVar;
        k72Var.label = 1;
        obj2 = aVar.a(k72Var);
    }

    public final void b(f9x<lgi0> f9xVar) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c2;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        f9x<lgi0> f9xVar2 = f9xVar;
        int[] iArr3 = f9xVar2.b;
        long[] jArr = f9xVar2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c3 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c2 = c3;
                        jgi0 b2 = this.m.b(i7);
                        lgi0 b3 = f9xVar2.b(i7);
                        igi0 igi0Var = b3 != null ? b3.a : null;
                        if (igi0Var == null) {
                            throw pm0.f("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = igi0Var.f;
                        xfi0 xfi0Var = igi0Var.d;
                        if (b2 == null) {
                            ph50<sgi0<?>, Object> ph50Var = xfi0Var.b;
                            Object[] objArr = ph50Var.b;
                            long[] jArr2 = ph50Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c2) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                sgi0 sgi0Var = (sgi0) objArr[(i10 << 3) + i12];
                                                sgi0<List<String>> sgi0Var2 = ngi0.a;
                                                sgi0<List<us2>> sgi0Var3 = ngi0.C;
                                                if (epx.f(sgi0Var, sgi0Var3)) {
                                                    List list = (List) zfi0.a(xfi0Var, sgi0Var3);
                                                    h(i8, String.valueOf(list != null ? (us2) j5g.a0(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    j5 = j;
                                    i9 = 8;
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            ph50<sgi0<?>, Object> ph50Var2 = xfi0Var.b;
                            Object[] objArr2 = ph50Var2.b;
                            long[] jArr3 = ph50Var2.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c2) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                sgi0 sgi0Var4 = (sgi0) objArr2[(i13 << 3) + i15];
                                                sgi0<List<String>> sgi0Var5 = ngi0.a;
                                                sgi0<List<us2>> sgi0Var6 = ngi0.C;
                                                if (epx.f(sgi0Var4, sgi0Var6)) {
                                                    List list2 = (List) zfi0.a(b2.a, sgi0Var6);
                                                    us2 us2Var = list2 != null ? (us2) j5g.a0(list2) : null;
                                                    List list3 = (List) zfi0.a(xfi0Var, sgi0Var6);
                                                    us2 us2Var2 = list3 != null ? (us2) j5g.a0(list3) : null;
                                                    if (!epx.f(us2Var, us2Var2)) {
                                                        h(i8, String.valueOf(us2Var2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                    }
                                    if (i13 == length3) {
                                        break;
                                    }
                                    i13++;
                                    i6 = i;
                                    jArr4 = jArr5;
                                }
                                i2 = 8;
                            }
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c2 = c3;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c3 = c2;
                    j6 = j2;
                    iArr3 = iArr2;
                    f9xVar2 = f9xVar;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            f9xVar2 = f9xVar;
            iArr3 = iArr;
        }
    }

    public final void c(igi0 igi0Var, wzs<? super Integer, ? super igi0, s3q0> wzsVar) {
        igi0Var.getClass();
        List j = igi0.j(4, igi0Var);
        int size = j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = j.get(i2);
            if (d().a(((igi0) obj).f)) {
                wzsVar.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final f9x<lgi0> d() {
        if (this.h) {
            this.h = false;
            this.k = qxm0.i(this.b.getSemanticsOwner(), d.i);
            this.l = System.currentTimeMillis();
        }
        return this.k;
    }

    public final boolean e() {
        return this.d != null;
    }

    public final void f() {
        xfj xfjVar = this.d;
        if (xfjVar != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.e;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                tfj tfjVar = (tfj) arrayList.get(i);
                int i2 = c.$EnumSwitchMapping$0[tfjVar.c.ordinal()];
                if (i2 == 1) {
                    b1u0 b1u0Var = tfjVar.d;
                    if (b1u0Var != null) {
                        xfjVar.e(b1u0Var.a);
                    }
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AutofillId a2 = xfjVar.a(tfjVar.a);
                    if (a2 != null) {
                        xfjVar.c(a2);
                    }
                }
            }
            xfjVar.flush();
            arrayList.clear();
        }
    }

    public final void g(igi0 igi0Var, jgi0 jgi0Var) {
        c(igi0Var, new e(jgi0Var, this));
        List j = igi0.j(4, igi0Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            igi0 igi0Var2 = (igi0) j.get(i);
            f9x<lgi0> d2 = d();
            int i2 = igi0Var2.f;
            if (d2.a(i2)) {
                pg50<jgi0> pg50Var = this.m;
                if (pg50Var.a(i2)) {
                    jgi0 b2 = pg50Var.b(i2);
                    if (b2 == null) {
                        throw pm0.f("node not present in pruned tree before this change");
                    }
                    g(igi0Var2, b2);
                } else {
                    continue;
                }
            }
        }
    }

    public final void h(int i, String str) {
        xfj xfjVar;
        if (Build.VERSION.SDK_INT >= 29 && (xfjVar = this.d) != null) {
            AutofillId a2 = xfjVar.a(i);
            if (a2 == null) {
                throw pm0.f("Invalid content capture ID");
            }
            xfjVar.d(a2, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i, igi0 igi0Var) {
        ck ckVar;
        izs izsVar;
        b1u0 b2;
        zhf0 zhf0Var;
        b1u0 b1u0Var;
        String d2;
        izs izsVar2;
        if (e()) {
            xfi0 xfi0Var = igi0Var.d;
            Boolean bool = (Boolean) zfi0.a(xfi0Var, ngi0.E);
            if (this.g == a.SHOW_ORIGINAL && epx.f(bool, Boolean.TRUE)) {
                ck ckVar2 = (ck) zfi0.a(xfi0Var, wfi0.m);
                if (ckVar2 != null && (izsVar2 = (izs) ckVar2.b) != null) {
                }
            } else if (this.g == a.SHOW_TRANSLATED && epx.f(bool, Boolean.FALSE) && (ckVar = (ck) zfi0.a(xfi0Var, wfi0.m)) != null && (izsVar = (izs) ckVar.b) != null) {
            }
            int i2 = igi0Var.f;
            xfj xfjVar = this.d;
            if (xfjVar != null && Build.VERSION.SDK_INT >= 29) {
                AutofillId autofillId = this.b.getAutofillId();
                igi0 l = igi0Var.l();
                int i3 = igi0Var.f;
                if ((l == null || (autofillId = xfjVar.a(l.f)) != null) && (b2 = xfjVar.b(autofillId, i3)) != null) {
                    ViewStructure viewStructure = b2.a;
                    xfi0 xfi0Var2 = igi0Var.d;
                    if (!xfi0Var2.b.b(ngi0.L)) {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.l);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        String str = (String) zfi0.a(xfi0Var2, ngi0.A);
                        if (str != null) {
                            viewStructure.setId(i3, null, null, str);
                        }
                        if (((Boolean) zfi0.a(xfi0Var2, ngi0.n)) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        List list = (List) zfi0.a(xfi0Var2, ngi0.C);
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(hgz.b(list, "\n", null, 62));
                        }
                        us2 us2Var = (us2) zfi0.a(xfi0Var2, ngi0.G);
                        if (us2Var != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(us2Var);
                        }
                        List list2 = (List) zfi0.a(xfi0Var2, ngi0.a);
                        if (list2 != null) {
                            viewStructure.setContentDescription(hgz.b(list2, "\n", null, 62));
                        }
                        plg0 plg0Var = (plg0) zfi0.a(xfi0Var2, ngi0.z);
                        if (plg0Var != null && (d2 = ygi0.d(plg0Var.a)) != null) {
                            viewStructure.setClassName(d2);
                        }
                        ljo0 b3 = ygi0.b(xfi0Var2);
                        if (b3 != null) {
                            kjo0 kjo0Var = b3.a;
                            nmo0 nmo0Var = kjo0Var.b;
                            azl azlVar = kjo0Var.g;
                            viewStructure.setTextStyle(azlVar.getFontScale() * azlVar.getDensity() * fno0.d(nmo0Var.a.b), 0, 0, 0);
                        }
                        androidx.compose.ui.node.o d3 = igi0Var.d();
                        if (d3 != null) {
                            androidx.compose.ui.node.o oVar = d3.D1().o ? d3 : null;
                            if (oVar != null) {
                                zhf0Var = igi0Var.a(oVar);
                                float f2 = zhf0Var.a;
                                float f3 = zhf0Var.b;
                                viewStructure.setDimens((int) f2, (int) f3, 0, 0, (int) (zhf0Var.c - f2), (int) (zhf0Var.d - f3));
                                b1u0Var = b2;
                                if (b1u0Var != null) {
                                    this.e.add(new tfj(i2, this.l, ufj.VIEW_APPEAR, b1u0Var));
                                }
                                c(igi0Var, new f());
                            }
                        }
                        zhf0Var = zhf0.e;
                        float f22 = zhf0Var.a;
                        float f32 = zhf0Var.b;
                        viewStructure.setDimens((int) f22, (int) f32, 0, 0, (int) (zhf0Var.c - f22), (int) (zhf0Var.d - f32));
                        b1u0Var = b2;
                        if (b1u0Var != null) {
                        }
                        c(igi0Var, new f());
                    }
                }
            }
            b1u0Var = null;
            if (b1u0Var != null) {
            }
            c(igi0Var, new f());
        }
    }

    public final void j(igi0 igi0Var) {
        if (e()) {
            this.e.add(new tfj(igi0Var.f, this.l, ufj.VIEW_DISAPPEAR, null));
            List j = igi0.j(4, igi0Var);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                j((igi0) j.get(i));
            }
        }
    }

    public final void k() {
        pg50<jgi0> pg50Var = this.m;
        pg50Var.d();
        f9x<lgi0> d2 = d();
        int[] iArr = d2.b;
        Object[] objArr = d2.c;
        long[] jArr = d2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            pg50Var.k(iArr[i4], new jgi0(((lgi0) objArr[i4]).a, d()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.n = new jgi0(this.b.getSemanticsOwner().a(), d());
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
        this.d = (xfj) this.c.invoke();
        i(-1, this.b.getSemanticsOwner().a());
        f();
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
        j(this.b.getSemanticsOwner().a());
        f();
        this.d = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.j.removeCallbacks(this.p);
        this.d = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
