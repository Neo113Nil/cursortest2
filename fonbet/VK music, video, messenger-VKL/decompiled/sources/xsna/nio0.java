package xsna;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;

/* compiled from: TextInputServiceAndroid.android.kt */
@ozl
/* loaded from: classes11.dex */
public final class nio0 implements oua0 {
    public final View a;
    public final i2x b;
    public final qio0 c;
    public boolean d;
    public izs<? super List<? extends pzo>, s3q0> e;
    public izs<? super qnw, s3q0> f;
    public tho0 g;
    public rnw h;
    public final ArrayList i;
    public final Object j;
    public Rect k;
    public final ylk l;
    public final ci50<a> m;
    public js6 n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInputServiceAndroid.android.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a HideKeyboard;
        public static final a ShowKeyboard;
        public static final a StartInput;
        public static final a StopInput;

        static {
            a aVar = new a("StartInput", 0);
            StartInput = aVar;
            a aVar2 = new a("StopInput", 1);
            StopInput = aVar2;
            a aVar3 = new a("ShowKeyboard", 2);
            ShowKeyboard = aVar3;
            a aVar4 = new a("HideKeyboard", 3);
            HideKeyboard = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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

    /* compiled from: TextInputServiceAndroid.android.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    public static final class c extends Lambda implements izs<List<? extends pzo>, s3q0> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final /* bridge */ /* synthetic */ s3q0 invoke(List<? extends pzo> list) {
            return s3q0.a;
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    public static final class d extends Lambda implements izs<qnw, s3q0> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final /* synthetic */ s3q0 invoke(qnw qnwVar) {
            int i2 = qnwVar.a;
            return s3q0.a;
        }
    }

    public nio0(View view, p52 p52Var) {
        i2x i2xVar = new i2x(view);
        qio0 qio0Var = new qio0(Choreographer.getInstance());
        this.a = view;
        this.b = i2xVar;
        this.c = qio0Var;
        this.e = iie0.k;
        this.f = pio0.i;
        this.g = new tho0("", qko0.b, 4);
        this.h = rnw.g;
        this.i = new ArrayList();
        this.j = msy.a(LazyThreadSafetyMode.NONE, new oio0(this));
        this.l = new ylk(p52Var, i2xVar);
        this.m = new ci50<>(new a[16]);
    }

    @Override // xsna.oua0
    public final void a() {
        this.d = false;
        this.e = c.i;
        this.f = d.i;
        this.k = null;
        i(a.StopInput);
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.oua0
    public final void b(tho0 tho0Var, tho0 tho0Var2) {
        boolean z = (qko0.b(this.g.b, tho0Var2.b) && epx.f(this.g.c, tho0Var2.c)) ? false : true;
        this.g = tho0Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            shf0 shf0Var = (shf0) ((WeakReference) this.i.get(i)).get();
            if (shf0Var != null) {
                shf0Var.d = tho0Var2;
            }
        }
        ylk ylkVar = this.l;
        synchronized (ylkVar.c) {
            ylkVar.j = null;
            ylkVar.l = null;
            ylkVar.k = null;
            ylkVar.m = wlk.i;
            ylkVar.n = null;
            ylkVar.o = null;
            s3q0 s3q0Var = s3q0.a;
        }
        if (epx.f(tho0Var, tho0Var2)) {
            if (z) {
                i2x i2xVar = this.b;
                int f = qko0.f(tho0Var2.b);
                int e = qko0.e(tho0Var2.b);
                qko0 qko0Var = this.g.c;
                int f2 = qko0Var != null ? qko0.f(qko0Var.a) : -1;
                qko0 qko0Var2 = this.g.c;
                i2xVar.a(f, e, f2, qko0Var2 != null ? qko0.e(qko0Var2.a) : -1);
                return;
            }
            return;
        }
        if (tho0Var != null && (!epx.f(tho0Var.a.c, tho0Var2.a.c) || (qko0.b(tho0Var.b, tho0Var2.b) && !epx.f(tho0Var.c, tho0Var2.c)))) {
            i2x i2xVar2 = this.b;
            ((InputMethodManager) i2xVar2.b.getValue()).restartInput(i2xVar2.a);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            shf0 shf0Var2 = (shf0) ((WeakReference) this.i.get(i2)).get();
            if (shf0Var2 != null) {
                tho0 tho0Var3 = this.g;
                i2x i2xVar3 = this.b;
                if (shf0Var2.h) {
                    shf0Var2.d = tho0Var3;
                    if (shf0Var2.f) {
                        ((InputMethodManager) i2xVar3.b.getValue()).updateExtractedText(i2xVar3.a, shf0Var2.e, nzo.j(tho0Var3));
                    }
                    qko0 qko0Var3 = tho0Var3.c;
                    long j = tho0Var3.b;
                    int f3 = qko0Var3 != null ? qko0.f(qko0Var3.a) : -1;
                    qko0 qko0Var4 = tho0Var3.c;
                    i2xVar3.a(qko0.f(j), qko0.e(j), f3, qko0Var4 != null ? qko0.e(qko0Var4.a) : -1);
                }
            }
        }
    }

    @Override // xsna.oua0
    public final void c() {
        i(a.StartInput);
    }

    @Override // xsna.oua0
    public final void d() {
        i(a.HideKeyboard);
    }

    @Override // xsna.oua0
    public final void e(tho0 tho0Var, uv70 uv70Var, ljo0 ljo0Var, lk00 lk00Var, zhf0 zhf0Var, zhf0 zhf0Var2) {
        ylk ylkVar = this.l;
        synchronized (ylkVar.c) {
            try {
                ylkVar.j = tho0Var;
                ylkVar.l = uv70Var;
                ylkVar.k = ljo0Var;
                ylkVar.m = lk00Var;
                ylkVar.n = zhf0Var;
                ylkVar.o = zhf0Var2;
                if (!ylkVar.e) {
                    if (ylkVar.d) {
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                ylkVar.a();
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.oua0
    public final void f(tho0 tho0Var, rnw rnwVar, lq5 lq5Var, c2u c2uVar) {
        this.d = true;
        this.g = tho0Var;
        this.h = rnwVar;
        this.e = lq5Var;
        this.f = c2uVar;
        i(a.StartInput);
    }

    @Override // xsna.oua0
    @ozl
    public final void g(zhf0 zhf0Var) {
        Rect rect;
        this.k = new Rect(an10.b(zhf0Var.a), an10.b(zhf0Var.b), an10.b(zhf0Var.c), an10.b(zhf0Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // xsna.oua0
    public final void h() {
        i(a.ShowKeyboard);
    }

    public final void i(a aVar) {
        this.m.b(aVar);
        if (this.n == null) {
            js6 js6Var = new js6(this, 6);
            this.c.execute(js6Var);
            this.n = js6Var;
        }
    }
}
