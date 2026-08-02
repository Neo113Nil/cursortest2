package xsna;

import android.view.MotionEvent;
import com.huawei.hms.hihealth.data.DeviceInfo;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: PointerInteropFilter.android.kt */
/* loaded from: classes11.dex */
public final class emb0 implements bmb0 {
    public izs<? super MotionEvent, Boolean> a;
    public o7g0 b;
    public boolean c;
    public final b d = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PointerInteropFilter.android.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Dispatching;
        public static final a NotDispatching;
        public static final a Unknown;

        static {
            a aVar = new a(DeviceInfo.STR_TYPE_UNKNOWN, 0);
            Unknown = aVar;
            a aVar2 = new a("Dispatching", 1);
            Dispatching = aVar2;
            a aVar3 = new a("NotDispatching", 2);
            NotDispatching = aVar3;
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

    /* compiled from: PointerInteropFilter.android.kt */
    public static final class b extends zsi {
        public a b;
        public plb0 c;

        /* compiled from: PointerInteropFilter.android.kt */
        public static final class a extends Lambda implements izs<MotionEvent, s3q0> {
            final /* synthetic */ emb0 this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(emb0 emb0Var) {
                super(1);
                this.this$1 = emb0Var;
            }

            @Override // xsna.izs
            public final s3q0 invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                if (motionEvent2.getActionMasked() == 0) {
                    b bVar = b.this;
                    izs<? super MotionEvent, Boolean> izsVar = this.this$1.a;
                    bVar.b = (izsVar != null ? izsVar : null).invoke(motionEvent2).booleanValue() ? a.Dispatching : a.NotDispatching;
                } else {
                    izs<? super MotionEvent, Boolean> izsVar2 = this.this$1.a;
                    (izsVar2 != null ? izsVar2 : null).invoke(motionEvent2);
                }
                return s3q0.a;
            }
        }

        /* compiled from: PointerInteropFilter.android.kt */
        /* renamed from: xsna.emb0$b$b, reason: collision with other inner class name */
        public static final class C2820b extends Lambda implements izs<MotionEvent, s3q0> {
            final /* synthetic */ emb0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2820b(emb0 emb0Var) {
                super(1);
                this.this$0 = emb0Var;
            }

            @Override // xsna.izs
            public final s3q0 invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                izs<? super MotionEvent, Boolean> izsVar = this.this$0.a;
                if (izsVar == null) {
                    izsVar = null;
                }
                izsVar.invoke(motionEvent2);
                return s3q0.a;
            }
        }

        public b() {
            super(1);
            this.b = a.Unknown;
        }

        public final void g(plb0 plb0Var, boolean z) {
            List<xlb0> list = plb0Var.a;
            List<xlb0> list2 = list;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).c()) {
                    j(plb0Var);
                    return;
                }
            }
            tny tnyVar = (tny) this.a;
            if (tnyVar == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            sv1.F(plb0Var, tnyVar.D(0L), new a(emb0.this), false);
            if (this.b == a.Dispatching) {
                if (z) {
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        list.get(i2).a();
                    }
                }
                rkx rkxVar = plb0Var.b;
                if (rkxVar != null) {
                    rkxVar.c = !r6.c;
                }
            }
        }

        public final void j(plb0 plb0Var) {
            if (this.b == a.Dispatching) {
                tny tnyVar = (tny) this.a;
                if (tnyVar == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                sv1.F(plb0Var, tnyVar.D(0L), new C2820b(emb0.this), true);
            }
            this.b = a.NotDispatching;
        }
    }

    @Override // xsna.bmb0
    public final b p() {
        return this.d;
    }
}
