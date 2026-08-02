package xsna;

import android.content.Context;
import com.vk.voip.ui.groupcalls.grid.type.GridViewType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GroupCallGridViewPagerMeasurer.kt */
/* loaded from: classes7.dex */
public final class qhu {
    public static final int i = cn70.b(20);
    public static final int j = cn70.b(16);
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public final Context a;
    public final mhu b;
    public final nhu c;
    public final dz5 d;
    public final zzz e;
    public qiu f;
    public b g;
    public boolean h;

    /* compiled from: GroupCallGridViewPagerMeasurer.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Margins(top=");
            sb.append(this.a);
            sb.append(", bottom=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: GroupCallGridViewPagerMeasurer.kt */
    public static final class b {
        public final GridViewType a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public /* synthetic */ b(GridViewType gridViewType, int i, boolean z) {
            this(gridViewType, i, z, true, false, false);
        }

        public static b a(b bVar, GridViewType gridViewType, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
            if ((i2 & 1) != 0) {
                gridViewType = bVar.a;
            }
            GridViewType gridViewType2 = gridViewType;
            if ((i2 & 2) != 0) {
                i = bVar.b;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                z = bVar.c;
            }
            boolean z5 = z;
            if ((i2 & 8) != 0) {
                z2 = bVar.d;
            }
            boolean z6 = z2;
            if ((i2 & 16) != 0) {
                z3 = bVar.e;
            }
            boolean z7 = z3;
            if ((i2 & 32) != 0) {
                z4 = bVar.f;
            }
            bVar.getClass();
            return new b(gridViewType2, i3, z5, z6, z7, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(type=");
            sb.append(this.a);
            sb.append(", topMargin=");
            sb.append(this.b);
            sb.append(", hasOnlyOnePage=");
            sb.append(this.c);
            sb.append(", areControlsVisible=");
            sb.append(this.d);
            sb.append(", areSpeakersVisible=");
            sb.append(this.e);
            sb.append(", isAsrOnlineVisible=");
            return defpackage.q0.a(sb, this.f, ')');
        }

        public b(GridViewType gridViewType, int i, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = gridViewType;
            this.b = i;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
        }
    }

    /* compiled from: GroupCallGridViewPagerMeasurer.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GridViewType.values().length];
            try {
                iArr[GridViewType.FULL_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GridViewType.FIT_BETWEEN_CONTROLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int b2 = cn70.b(128);
        k = b2;
        l = cn70.b(38);
        m = cn70.b(47);
        int b3 = cn70.b(50);
        n = b3;
        int b4 = cn70.b(62);
        o = b4;
        p = cn70.b(49) + b2;
        q = cn70.b(19) + b4;
        r = cn70.b(50) + b2;
        s = cn70.b(22) + b3;
        t = cn70.b(12);
        u = cn70.b(8);
    }

    public qhu(Context context, mhu mhuVar, nhu nhuVar, dz5 dz5Var, zzz zzzVar) {
        this.a = context;
        this.b = mhuVar;
        this.c = nhuVar;
        this.d = dz5Var;
        this.e = zzzVar;
    }

    public static final void a(qhu qhuVar) {
        b a2;
        b bVar = qhuVar.g;
        if (bVar == null) {
            GridViewType o2 = dz5.o(qhuVar.a);
            qiu qiuVar = qhuVar.f;
            a2 = new b(o2, qiuVar != null ? qiuVar.a() : 0, true);
        } else {
            qiu qiuVar2 = qhuVar.f;
            a2 = b.a(bVar, null, qiuVar2 != null ? qiuVar2.a() : 0, false, false, false, false, 61);
        }
        qhuVar.b(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(b bVar) {
        a aVar;
        int i2;
        int intValue;
        Integer valueOf;
        int intValue2;
        int i3;
        GridViewType gridViewType = bVar.a;
        int i4 = bVar.b;
        boolean z = bVar.f;
        boolean z2 = bVar.c;
        boolean z3 = bVar.d;
        int i5 = c.$EnumSwitchMapping$0[gridViewType.ordinal()];
        int i6 = t;
        int i7 = u;
        int i8 = j;
        int i9 = k;
        if (i5 == 1) {
            aVar = z2 ? new a(i4, i9) : new a(i4, i + i9);
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (z2) {
                Integer valueOf2 = Integer.valueOf(m);
                if (z3 || z) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    intValue = valueOf2.intValue();
                    if (!this.e.isHorizontal()) {
                        if (z2) {
                            valueOf = z ? Integer.valueOf(o) : null;
                            if (valueOf != null) {
                                intValue2 = valueOf.intValue();
                                int i10 = i4 + i8;
                                if (z3 && z2) {
                                    i3 = intValue + i8 + intValue2;
                                } else if (z3) {
                                    i3 = (i8 * 2) + intValue + i7 + intValue2;
                                } else {
                                    i3 = (z2 ? -i6 : i8) + intValue2 + intValue + i9;
                                }
                                aVar = new a(i10, i3);
                            }
                        } else {
                            valueOf = z ? Integer.valueOf(n) : null;
                            if (valueOf != null) {
                                intValue2 = valueOf.intValue();
                                int i102 = i4 + i8;
                                if (z3) {
                                }
                                if (z3) {
                                }
                                aVar = new a(i102, i3);
                            }
                        }
                    }
                    intValue2 = 0;
                    int i1022 = i4 + i8;
                    if (z3) {
                    }
                    if (z3) {
                    }
                    aVar = new a(i1022, i3);
                }
                intValue = 0;
                if (!this.e.isHorizontal()) {
                }
                intValue2 = 0;
                int i10222 = i4 + i8;
                if (z3) {
                }
                if (z3) {
                }
                aVar = new a(i10222, i3);
            } else {
                Integer valueOf3 = Integer.valueOf(l);
                if (z3 || z) {
                    valueOf3 = null;
                }
                if (valueOf3 != null) {
                    intValue = valueOf3.intValue();
                    if (!this.e.isHorizontal()) {
                    }
                    intValue2 = 0;
                    int i102222 = i4 + i8;
                    if (z3) {
                    }
                    if (z3) {
                    }
                    aVar = new a(i102222, i3);
                }
                intValue = 0;
                if (!this.e.isHorizontal()) {
                }
                intValue2 = 0;
                int i1022222 = i4 + i8;
                if (z3) {
                }
                if (z3) {
                }
                aVar = new a(i1022222, i3);
            }
        }
        if (z) {
            i2 = (z && z3 && z2) ? p : (z && !z3 && z2) ? q : (z && z3 && !z2) ? r : (!z || z3 || z2) ? i9 - i6 : s;
        } else {
            if (!z3 && z2) {
                i7 = i8;
            } else if (z3) {
                i7 = i9 - i6;
            }
            i2 = i7;
        }
        this.c.invoke(new a(0, i2));
        this.b.invoke(aVar);
        this.h = true;
    }
}
