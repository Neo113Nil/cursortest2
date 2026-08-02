package xsna;

import androidx.compose.ui.focus.FocusStateImpl;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import xsna.dy6;
import xsna.gwr;
import xsna.q630;

/* compiled from: TwoDimensionalFocusSearch.kt */
/* loaded from: classes11.dex */
public final class gtp0 {

    /* compiled from: TwoDimensionalFocusSearch.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: TwoDimensionalFocusSearch.kt */
    public static final class b extends Lambda implements izs<dy6.a, Boolean> {
        final /* synthetic */ dxr $activeNodeBeforeSearch;
        final /* synthetic */ int $direction;
        final /* synthetic */ zhf0 $focusedItem;
        final /* synthetic */ izs<dxr, Boolean> $onFound;
        final /* synthetic */ dxr $this_generateAndSearchChildren;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(dxr dxrVar, dxr dxrVar2, zhf0 zhf0Var, int i, izs<? super dxr, Boolean> izsVar) {
            super(1);
            this.$activeNodeBeforeSearch = dxrVar;
            this.$this_generateAndSearchChildren = dxrVar2;
            this.$focusedItem = zhf0Var;
            this.$direction = i;
            this.$onFound = izsVar;
        }

        @Override // xsna.izs
        public final Boolean invoke(dy6.a aVar) {
            dy6.a aVar2 = aVar;
            if (this.$activeNodeBeforeSearch != itl.g(this.$this_generateAndSearchChildren).getFocusOwner().b()) {
                return Boolean.TRUE;
            }
            boolean j = gtp0.j(this.$this_generateAndSearchChildren, this.$focusedItem, this.$direction, this.$onFound);
            Boolean valueOf = Boolean.valueOf(j);
            if (j || !aVar2.a()) {
                return valueOf;
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(zhf0 zhf0Var, zhf0 zhf0Var2, zhf0 zhf0Var3, int i) {
        boolean b2 = b(i, zhf0Var3, zhf0Var);
        float f = zhf0Var3.b;
        float f2 = zhf0Var3.d;
        float f3 = zhf0Var3.a;
        float f4 = zhf0Var3.c;
        float f5 = zhf0Var.d;
        float f6 = zhf0Var.b;
        float f7 = zhf0Var.c;
        float f8 = zhf0Var.a;
        if (b2 || !b(i, zhf0Var2, zhf0Var)) {
            return false;
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                }
            }
        }
    }

    public static final boolean b(int i, zhf0 zhf0Var, zhf0 zhf0Var2) {
        if (i == 3 || i == 4) {
            return zhf0Var.d > zhf0Var2.b && zhf0Var.b < zhf0Var2.d;
        }
        if (i == 5 || i == 6) {
            return zhf0Var.c > zhf0Var2.a && zhf0Var.a < zhf0Var2.c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final void c(dxr dxrVar, ci50 ci50Var) {
        if (!dxrVar.b.o) {
            uzw.b("visitChildren called on an unattached node");
        }
        ci50 ci50Var2 = new ci50(new q630.c[16]);
        q630.c cVar = dxrVar.b;
        q630.c cVar2 = cVar.g;
        if (cVar2 == null) {
            itl.a(ci50Var2, cVar);
        } else {
            ci50Var2.b(cVar2);
        }
        while (true) {
            int i = ci50Var2.d;
            if (i == 0) {
                return;
            }
            q630.c cVar3 = (q630.c) ci50Var2.k(i - 1);
            if ((cVar3.e & 1024) == 0) {
                itl.a(ci50Var2, cVar3);
            } else {
                while (true) {
                    if (cVar3 == null) {
                        break;
                    }
                    if ((cVar3.d & 1024) != 0) {
                        ci50 ci50Var3 = null;
                        while (cVar3 != null) {
                            if (cVar3 instanceof dxr) {
                                dxr dxrVar2 = (dxr) cVar3;
                                if (dxrVar2.o && !itl.f(dxrVar2).R) {
                                    if (dxrVar2.k2().a) {
                                        ci50Var.b(dxrVar2);
                                    } else {
                                        c(dxrVar2, ci50Var);
                                    }
                                }
                            } else if ((cVar3.d & 1024) != 0 && (cVar3 instanceof ytl)) {
                                int i2 = 0;
                                for (q630.c cVar4 = ((ytl) cVar3).q; cVar4 != null; cVar4 = cVar4.g) {
                                    if ((cVar4.d & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVar3 = cVar4;
                                        } else {
                                            if (ci50Var3 == null) {
                                                ci50Var3 = new ci50(new q630.c[16]);
                                            }
                                            if (cVar3 != null) {
                                                ci50Var3.b(cVar3);
                                                cVar3 = null;
                                            }
                                            ci50Var3.b(cVar4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cVar3 = itl.b(ci50Var3);
                        }
                    } else {
                        cVar3 = cVar3.g;
                    }
                }
            }
        }
    }

    public static final dxr d(ci50<dxr> ci50Var, zhf0 zhf0Var, int i) {
        zhf0 i2;
        if (i == 3) {
            i2 = zhf0Var.i((zhf0Var.c - zhf0Var.a) + 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (i == 4) {
            i2 = zhf0Var.i(-((zhf0Var.c - zhf0Var.a) + 1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (i == 5) {
            i2 = zhf0Var.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (zhf0Var.d - zhf0Var.b) + 1);
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            i2 = zhf0Var.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -((zhf0Var.d - zhf0Var.b) + 1));
        }
        dxr[] dxrVarArr = ci50Var.b;
        int i3 = ci50Var.d;
        dxr dxrVar = null;
        for (int i4 = 0; i4 < i3; i4++) {
            dxr dxrVar2 = dxrVarArr[i4];
            if (ixr.d(dxrVar2)) {
                zhf0 b2 = ixr.b(dxrVar2);
                if (g(b2, i2, zhf0Var, i)) {
                    dxrVar = dxrVar2;
                    i2 = b2;
                }
            }
        }
        return dxrVar;
    }

    public static final boolean e(dxr dxrVar, int i, izs<? super dxr, Boolean> izsVar) {
        zhf0 zhf0Var;
        ci50 ci50Var = new ci50(new dxr[16]);
        c(dxrVar, ci50Var);
        int i2 = ci50Var.d;
        if (i2 <= 1) {
            dxr dxrVar2 = (dxr) (i2 == 0 ? null : ci50Var.b[0]);
            if (dxrVar2 != null) {
                return izsVar.invoke(dxrVar2).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                zhf0 b2 = ixr.b(dxrVar);
                float f = b2.a;
                float f2 = b2.b;
                zhf0Var = new zhf0(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                zhf0 b3 = ixr.b(dxrVar);
                float f3 = b3.c;
                float f4 = b3.d;
                zhf0Var = new zhf0(f3, f4, f3, f4);
            }
            dxr d = d(ci50Var, zhf0Var, i);
            if (d != null) {
                return izsVar.invoke(d).booleanValue();
            }
        }
        return false;
    }

    public static final boolean f(dxr dxrVar, zhf0 zhf0Var, int i, izs<? super dxr, Boolean> izsVar) {
        if (j(dxrVar, zhf0Var, i, izsVar)) {
            return true;
        }
        Boolean bool = (Boolean) fy6.a(dxrVar, i, new b(itl.g(dxrVar).getFocusOwner().b(), dxrVar, zhf0Var, i, izsVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean g(zhf0 zhf0Var, zhf0 zhf0Var2, zhf0 zhf0Var3, int i) {
        if (!h(i, zhf0Var, zhf0Var3)) {
            return false;
        }
        if (h(i, zhf0Var2, zhf0Var3) && !a(zhf0Var3, zhf0Var, zhf0Var2, i)) {
            return !a(zhf0Var3, zhf0Var2, zhf0Var, i) && i(i, zhf0Var3, zhf0Var) < i(i, zhf0Var3, zhf0Var2);
        }
        return true;
    }

    public static final boolean h(int i, zhf0 zhf0Var, zhf0 zhf0Var2) {
        if (i == 3) {
            float f = zhf0Var2.c;
            float f2 = zhf0Var2.a;
            float f3 = zhf0Var.c;
            return (f > f3 || f2 >= f3) && f2 > zhf0Var.a;
        }
        if (i == 4) {
            float f4 = zhf0Var2.a;
            float f5 = zhf0Var2.c;
            float f6 = zhf0Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < zhf0Var.c;
        }
        if (i == 5) {
            float f7 = zhf0Var2.d;
            float f8 = zhf0Var2.b;
            float f9 = zhf0Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > zhf0Var.b;
        }
        if (i != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f10 = zhf0Var2.b;
        float f11 = zhf0Var2.d;
        float f12 = zhf0Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < zhf0Var.d;
    }

    public static final long i(int i, zhf0 zhf0Var, zhf0 zhf0Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            f = zhf0Var.a;
            f2 = zhf0Var2.c;
        } else if (i == 4) {
            f = zhf0Var2.a;
            f2 = zhf0Var.c;
        } else if (i == 5) {
            f = zhf0Var.b;
            f2 = zhf0Var2.d;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = zhf0Var2.b;
            f2 = zhf0Var.d;
        }
        float f7 = f - f2;
        if (f7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f7 = 0.0f;
        }
        long j = (long) f7;
        if (i == 3 || i == 4) {
            float f8 = zhf0Var.b;
            f3 = 2;
            f4 = ((zhf0Var.d - f8) / f3) + f8;
            f5 = zhf0Var2.b;
            f6 = zhf0Var2.d;
        } else {
            if (i != 5 && i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f9 = zhf0Var.a;
            f3 = 2;
            f4 = ((zhf0Var.c - f9) / f3) + f9;
            f5 = zhf0Var2.a;
            f6 = zhf0Var2.c;
        }
        long j2 = (long) (f4 - (((f6 - f5) / f3) + f5));
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean j(dxr dxrVar, zhf0 zhf0Var, int i, izs<? super dxr, Boolean> izsVar) {
        dxr d;
        ci50 ci50Var = new ci50(new dxr[16]);
        if (!dxrVar.b.o) {
            uzw.b("visitChildren called on an unattached node");
        }
        ci50 ci50Var2 = new ci50(new q630.c[16]);
        q630.c cVar = dxrVar.b;
        q630.c cVar2 = cVar.g;
        if (cVar2 == null) {
            itl.a(ci50Var2, cVar);
        } else {
            ci50Var2.b(cVar2);
        }
        while (true) {
            int i2 = ci50Var2.d;
            if (i2 == 0) {
                break;
            }
            q630.c cVar3 = (q630.c) ci50Var2.k(i2 - 1);
            if ((cVar3.e & 1024) == 0) {
                itl.a(ci50Var2, cVar3);
            } else {
                while (true) {
                    if (cVar3 == null) {
                        break;
                    }
                    if ((cVar3.d & 1024) != 0) {
                        ci50 ci50Var3 = null;
                        while (cVar3 != null) {
                            if (cVar3 instanceof dxr) {
                                dxr dxrVar2 = (dxr) cVar3;
                                if (dxrVar2.o) {
                                    ci50Var.b(dxrVar2);
                                }
                            } else if ((cVar3.d & 1024) != 0 && (cVar3 instanceof ytl)) {
                                int i3 = 0;
                                for (q630.c cVar4 = ((ytl) cVar3).q; cVar4 != null; cVar4 = cVar4.g) {
                                    if ((cVar4.d & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cVar3 = cVar4;
                                        } else {
                                            if (ci50Var3 == null) {
                                                ci50Var3 = new ci50(new q630.c[16]);
                                            }
                                            if (cVar3 != null) {
                                                ci50Var3.b(cVar3);
                                                cVar3 = null;
                                            }
                                            ci50Var3.b(cVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            cVar3 = itl.b(ci50Var3);
                        }
                    } else {
                        cVar3 = cVar3.g;
                    }
                }
            }
        }
        while (ci50Var.d != 0 && (d = d(ci50Var, zhf0Var, i)) != null) {
            if (d.k2().a) {
                return izsVar.invoke(d).booleanValue();
            }
            if (f(d, zhf0Var, i, izsVar)) {
                return true;
            }
            ci50Var.j(d);
        }
        return false;
    }

    public static final Boolean k(dxr dxrVar, int i, zhf0 zhf0Var, gwr.b bVar) {
        FocusStateImpl k0 = dxrVar.k0();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[k0.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(e(dxrVar, i, bVar));
            }
            if (i2 == 4) {
                return dxrVar.k2().a ? (Boolean) bVar.invoke(dxrVar) : zhf0Var == null ? Boolean.valueOf(e(dxrVar, i, bVar)) : Boolean.valueOf(j(dxrVar, zhf0Var, i, bVar));
            }
            throw new NoWhenBranchMatchedException();
        }
        dxr c = ixr.c(dxrVar);
        if (c == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i3 = iArr[c.k0().ordinal()];
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                if (zhf0Var == null) {
                    zhf0Var = ixr.b(c);
                }
                return Boolean.valueOf(f(dxrVar, zhf0Var, i, bVar));
            }
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        Boolean k = k(c, i, zhf0Var, bVar);
        if (!epx.f(k, Boolean.FALSE)) {
            return k;
        }
        if (zhf0Var == null) {
            if (c.k0() != FocusStateImpl.ActiveParent) {
                throw new IllegalStateException("Searching for active node in inactive hierarchy");
            }
            dxr a2 = ixr.a(c);
            if (a2 == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            zhf0Var = ixr.b(a2);
        }
        return Boolean.valueOf(f(dxrVar, zhf0Var, i, bVar));
    }
}
