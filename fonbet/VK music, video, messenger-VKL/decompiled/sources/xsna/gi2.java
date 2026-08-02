package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.mi2;
import xsna.tra0;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class gi2 implements cp10 {
    public final mi2<?> a;

    /* compiled from: AnimatedContent.kt */
    public static final class a extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ int $maxHeight;
        final /* synthetic */ int $maxWidth;
        final /* synthetic */ tra0[] $placeables;
        final /* synthetic */ gi2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tra0[] tra0VarArr, gi2 gi2Var, int i, int i2) {
            super(1);
            this.$placeables = tra0VarArr;
            this.this$0 = gi2Var;
            this.$maxWidth = i;
            this.$maxHeight = i2;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            tra0.a aVar2 = aVar;
            tra0[] tra0VarArr = this.$placeables;
            gi2 gi2Var = this.this$0;
            int i = this.$maxWidth;
            int i2 = this.$maxHeight;
            for (tra0 tra0Var : tra0VarArr) {
                if (tra0Var != null) {
                    long a = gi2Var.a.b.a((tra0Var.b << 32) | (tra0Var.c & 4294967295L), (i << 32) | (i2 & 4294967295L), LayoutDirection.Ltr);
                    aVar2.q(tra0Var, (int) (a >> 32), (int) (a & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            return s3q0.a;
        }
    }

    public gi2(mi2<?> mi2Var) {
        this.a = mi2Var;
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        tra0 tra0Var;
        int i;
        tra0 tra0Var2;
        int i2;
        int i3;
        int size = list.size();
        tra0[] tra0VarArr = new tra0[size];
        List<? extends zo10> list2 = list;
        int size2 = list2.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            tra0Var = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            zo10 zo10Var = list.get(i4);
            Object c = zo10Var.c();
            mi2.a aVar = c instanceof mi2.a ? (mi2.a) c : null;
            if (aVar != null && ((Boolean) ((zak0) aVar.a).getValue()).booleanValue()) {
                tra0 N = zo10Var.N(j);
                s3q0 s3q0Var = s3q0.a;
                tra0VarArr[i4] = N;
                j2 = (N.c & 4294967295L) | (N.b << 32);
            }
            i4++;
        }
        int size3 = list2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            zo10 zo10Var2 = list.get(i5);
            if (tra0VarArr[i5] == null) {
                tra0VarArr[i5] = zo10Var2.N(j);
            }
        }
        if (ep10Var.z1()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                tra0Var2 = null;
            } else {
                tra0Var2 = tra0VarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = tra0Var2 != null ? tra0Var2.b : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            tra0 tra0Var3 = tra0VarArr[i8];
                            int i9 = tra0Var3 != null ? tra0Var3.b : 0;
                            if (i7 < i9) {
                                tra0Var2 = tra0Var3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
            i2 = tra0Var2 != null ? tra0Var2.b : 0;
        }
        if (ep10Var.z1()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                tra0Var = tra0VarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = tra0Var != null ? tra0Var.c : 0;
                    if (1 <= i10) {
                        while (true) {
                            tra0 tra0Var4 = tra0VarArr[i];
                            int i12 = tra0Var4 != null ? tra0Var4.c : 0;
                            if (i11 < i12) {
                                tra0Var = tra0Var4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = tra0Var != null ? tra0Var.c : 0;
        }
        if (!ep10Var.z1()) {
            ((zak0) this.a.d).setValue(new q9x((i2 << 32) | (i3 & 4294967295L)));
        }
        return ep10Var.Q(i2, i3, jgp.b, new a(tra0VarArr, this, i2, i3));
    }

    @Override // xsna.cp10
    public final int c(apx apxVar, List<? extends zox> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).Z(i));
            int h = e43.h(list);
            int i2 = 1;
            if (1 <= h) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).Z(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == h) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // xsna.cp10
    public final int e(apx apxVar, List<? extends zox> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).l0(i));
            int h = e43.h(list);
            int i2 = 1;
            if (1 <= h) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).l0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == h) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // xsna.cp10
    public final int f(apx apxVar, List<? extends zox> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).j0(i));
            int h = e43.h(list);
            int i2 = 1;
            if (1 <= h) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).j0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == h) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // xsna.cp10
    public final int g(apx apxVar, List<? extends zox> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).M(i));
            int h = e43.h(list);
            int i2 = 1;
            if (1 <= h) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).M(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == h) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
