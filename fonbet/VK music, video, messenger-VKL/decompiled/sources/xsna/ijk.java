package xsna;

import android.R;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ListIterator;
import kotlin.jvm.internal.Lambda;
import xsna.cri;
import xsna.dak0;
import xsna.dt1;
import xsna.q630;
import xsna.wlp0;

/* compiled from: Crossfade.kt */
/* loaded from: classes11.dex */
public final class ijk {

    /* compiled from: Crossfade.kt */
    public static final class a extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ phr<Float> $animationSpec;
        final /* synthetic */ yzs<T, androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ String $label;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ T $targetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(T t, q630 q630Var, phr<Float> phrVar, String str, yzs<? super T, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, int i, int i2) {
            super(2);
            this.$targetState = t;
            this.$modifier = q630Var;
            this.$animationSpec = phrVar;
            this.$label = str;
            this.$content = yzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            ijk.a(this.$targetState, this.$modifier, this.$animationSpec, this.$label, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Crossfade.kt */
    public static final class c<T> extends Lambda implements izs<T, Boolean> {
        final /* synthetic */ wlp0<T> $this_Crossfade;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wlp0<T> wlp0Var) {
            super(1);
            this.$this_Crossfade = wlp0Var;
        }

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(!epx.f(obj, ((zak0) this.$this_Crossfade.d).getValue()));
        }
    }

    /* compiled from: Crossfade.kt */
    public static final class d extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ phr<Float> $animationSpec;
        final /* synthetic */ yzs<T, androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ T $stateForContent;
        final /* synthetic */ wlp0<T> $this_Crossfade;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(wlp0<T> wlp0Var, phr<Float> phrVar, T t, yzs<? super T, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar) {
            super(2);
            this.$this_Crossfade = wlp0Var;
            this.$animationSpec = phrVar;
            this.$stateForContent = t;
            this.$content = yzsVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            Object B;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-934471669, intValue, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:125)");
                }
                wlp0<T> wlp0Var = this.$this_Crossfade;
                kjk kjkVar = new kjk(this.$animationSpec);
                T t = this.$stateForContent;
                jtp0 jtp0Var = rte0.e;
                boolean g = wlp0Var.g();
                z46 z46Var = wlp0Var.a;
                Object obj = a.C0011a.a;
                if (g) {
                    aVar2.K(1666827533);
                    aVar2.j();
                    B = z46Var.B();
                } else {
                    aVar2.K(1666573488);
                    boolean J = aVar2.J(wlp0Var);
                    B = aVar2.x();
                    if (J || B == obj) {
                        dak0 a = dak0.a.a();
                        izs<Object, s3q0> e = a != null ? a.e() : null;
                        dak0 b = dak0.a.b(a);
                        try {
                            Object B2 = z46Var.B();
                            dak0.a.d(a, b, e);
                            aVar2.R(B2);
                            B = B2;
                        } catch (Throwable th) {
                            dak0.a.d(a, b, e);
                            throw th;
                        }
                    }
                    aVar2.j();
                }
                aVar2.K(1378811975);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1378811975, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
                }
                boolean f = epx.f(B, t);
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f3 = f ? 1.0f : 0.0f;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                Float valueOf = Float.valueOf(f3);
                boolean J2 = aVar2.J(wlp0Var);
                Object x = aVar2.x();
                if (J2 || x == obj) {
                    x = bbk0.b(new ljk(wlp0Var));
                    aVar2.R(x);
                }
                Object value = ((mtk0) x).getValue();
                aVar2.K(1378811975);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1378811975, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
                }
                if (epx.f(value, t)) {
                    f2 = 1.0f;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                Float valueOf2 = Float.valueOf(f2);
                boolean J3 = aVar2.J(wlp0Var);
                Object x2 = aVar2.x();
                if (J3 || x2 == obj) {
                    x2 = bbk0.b(new mjk(wlp0Var));
                    aVar2.R(x2);
                }
                wlp0.d c = ump0.c(wlp0Var, valueOf, valueOf2, kjkVar.invoke(((mtk0) x2).getValue(), aVar2, 0), jtp0Var, aVar2, 0);
                boolean J4 = aVar2.J(c);
                Object x3 = aVar2.x();
                if (J4 || x3 == obj) {
                    x3 = new jjk(c);
                    aVar2.R(x3);
                }
                q630 a2 = rdu.a(q630.a.a, (izs) x3);
                yzs<T, androidx.compose.runtime.a, Integer, s3q0> yzsVar = this.$content;
                T t2 = this.$stateForContent;
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(aVar2));
                sy90 D = aVar2.D();
                q630 c2 = qri.c(aVar2, a2);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar3);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d, cri.a.f);
                k9q0.w(aVar2, D, cri.a.e);
                Integer valueOf3 = Integer.valueOf(hashCode);
                cri.a.b bVar = cri.a.g;
                if (aVar2.L()) {
                    aVar2.b(valueOf3, bVar);
                }
                k9q0.t(aVar2, cri.a.h);
                k9q0.w(aVar2, c2, cri.a.d);
                yzsVar.invoke(t2, aVar2, 0);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: Crossfade.kt */
    public static final class e extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ phr<Float> $animationSpec;
        final /* synthetic */ yzs<T, androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ izs<T, Object> $contentKey;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ wlp0<T> $this_Crossfade;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(wlp0<T> wlp0Var, q630 q630Var, phr<Float> phrVar, izs<? super T, ? extends Object> izsVar, yzs<? super T, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, int i, int i2) {
            super(2);
            this.$this_Crossfade = wlp0Var;
            this.$modifier = q630Var;
            this.$animationSpec = phrVar;
            this.$contentKey = izsVar;
            this.$content = yzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            ijk.b(this.$this_Crossfade, this.$modifier, this.$animationSpec, this.$contentKey, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void a(T t, q630 q630Var, phr<Float> phrVar, String str, yzs<? super T, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        phr<Float> phrVar2;
        int i5;
        q630 q630Var3;
        phr<Float> phrVar3;
        String str2;
        androidx.compose.runtime.f s;
        int i6;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(-513216493);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? M.J(t) : M.y(t) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                phrVar2 = phrVar;
                i3 |= M.y(phrVar2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= M.J(str) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        i3 |= M.y(yzsVar) ? 16384 : 8192;
                    }
                    if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                        M.h();
                        q630Var3 = q630Var2;
                        phrVar3 = phrVar2;
                        str2 = str;
                    } else {
                        if (i7 != 0) {
                            q630Var4 = q630.a.a;
                            i6 = i5;
                        } else {
                            i6 = i5;
                            q630Var4 = q630Var2;
                        }
                        phr<Float> d2 = i4 != 0 ? jq2.d(0, 0, null, 7) : phrVar2;
                        String str3 = i6 != 0 ? "Crossfade" : str;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-513216493, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                        }
                        b(ump0.e(t, str3, M, (i3 & 14) | ((i3 >> 6) & 112), 0), q630Var4, d2, null, yzsVar, M, i3 & 58352, 4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        str2 = str3;
                        q630Var3 = q630Var4;
                        phrVar3 = d2;
                    }
                    s = M.s();
                    if (s == null) {
                        s.d = new a(t, q630Var3, phrVar3, str2, yzsVar, i, i2);
                        return;
                    }
                    return;
                }
                if ((i & 24576) == 0) {
                }
                if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                }
                s = M.s();
                if (s == null) {
                }
            }
            phrVar2 = phrVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((i & 24576) == 0) {
            }
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
            }
            s = M.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        phrVar2 = phrVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void b(wlp0<T> wlp0Var, q630 q630Var, phr<Float> phrVar, izs<? super T, ? extends Object> izsVar, yzs<? super T, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        int i3;
        phr<Float> phrVar2;
        int i4;
        izs<? super T, ? extends Object> izsVar2;
        phr<Float> phrVar3;
        izs<? super T, ? extends Object> izsVar3;
        androidx.compose.runtime.f s;
        izs<? super T, ? extends Object> izsVar4;
        androidx.compose.runtime.a M = aVar.M(-1877370462);
        int i5 = (i & 6) == 0 ? (M.J(wlp0Var) ? 4 : 2) | i : i;
        int i6 = i2 & 1;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i5 |= M.J(q630Var2) ? 32 : 16;
            i3 = i2 & 2;
            if (i3 == 0) {
                i5 |= 384;
            } else if ((i & 384) == 0) {
                phrVar2 = phrVar;
                i5 |= M.y(phrVar2) ? 256 : 128;
                i4 = i2 & 4;
                if (i4 != 0) {
                    i5 |= 3072;
                } else if ((i & 3072) == 0) {
                    izsVar2 = izsVar;
                    i5 |= M.y(izsVar2) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        i5 |= M.y(yzsVar) ? 16384 : 8192;
                    }
                    if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
                        M.h();
                        phrVar3 = phrVar2;
                        izsVar3 = izsVar2;
                    } else {
                        if (i6 != 0) {
                            q630Var2 = q630.a.a;
                        }
                        phr<Float> d2 = i3 != 0 ? jq2.d(0, 0, null, 7) : phrVar2;
                        Object obj = a.C0011a.a;
                        if (i4 != 0) {
                            Object x = M.x();
                            if (x == obj) {
                                x = b.i;
                                M.R(x);
                            }
                            izsVar4 = (izs) x;
                        } else {
                            izsVar4 = izsVar2;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1877370462, i5, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                        }
                        Object x2 = M.x();
                        Object obj2 = x2;
                        if (x2 == obj) {
                            SnapshotStateList snapshotStateList = new SnapshotStateList();
                            snapshotStateList.add(wlp0Var.a.B());
                            M.R(snapshotStateList);
                            obj2 = snapshotStateList;
                        }
                        SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj2;
                        Object x3 = M.x();
                        if (x3 == obj) {
                            x3 = h5h0.b();
                            M.R(x3);
                        }
                        ph50 ph50Var = (ph50) x3;
                        z46 z46Var = wlp0Var.a;
                        zak0 zak0Var = (zak0) wlp0Var.d;
                        if (epx.f(z46Var.B(), zak0Var.getValue())) {
                            M.K(321145192);
                            if (snapshotStateList2.size() == 1 && epx.f(snapshotStateList2.get(0), zak0Var.getValue())) {
                                M.K(321469824);
                                M.j();
                            } else {
                                M.K(321279546);
                                boolean z = (i5 & 14) == 4;
                                Object x4 = M.x();
                                if (z || x4 == obj) {
                                    x4 = new c(wlp0Var);
                                    M.R(x4);
                                }
                                g5g.D(snapshotStateList2, true, (izs) x4);
                                ph50Var.h();
                                M.j();
                            }
                            M.j();
                        } else {
                            M.K(321475776);
                            M.j();
                        }
                        if (ph50Var.a(zak0Var.getValue())) {
                            M.K(322279296);
                            M.j();
                        } else {
                            M.K(321536443);
                            ListIterator listIterator = snapshotStateList2.listIterator();
                            int i7 = 0;
                            while (true) {
                                duk0 duk0Var = (duk0) listIterator;
                                if (!duk0Var.hasNext()) {
                                    i7 = -1;
                                    break;
                                } else if (epx.f(izsVar4.invoke((Object) duk0Var.next()), izsVar4.invoke((Object) zak0Var.getValue()))) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            if (i7 == -1) {
                                snapshotStateList2.add(zak0Var.getValue());
                            } else {
                                snapshotStateList2.set(i7, zak0Var.getValue());
                            }
                            ph50Var.h();
                            int size = snapshotStateList2.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                Object obj3 = snapshotStateList2.get(i8);
                                ph50Var.p(obj3, kai.c(-934471669, new d(wlp0Var, d2, obj3, yzsVar), M));
                            }
                            M.j();
                        }
                        dt1.a.getClass();
                        cp10 d3 = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(M));
                        sy90 D = M.D();
                        q630 c2 = qri.c(M, q630Var2);
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
                        k9q0.w(M, d3, cri.a.f);
                        k9q0.w(M, D, cri.a.e);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        if (M.L()) {
                            M.b(valueOf, bVar);
                        }
                        k9q0.t(M, cri.a.h);
                        k9q0.w(M, c2, cri.a.d);
                        M.K(-1312707512);
                        int size2 = snapshotStateList2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            R r = (Object) snapshotStateList2.get(i9);
                            M.W(1171574969, izsVar4.invoke(r));
                            wzs wzsVar = (wzs) ph50Var.d(r);
                            if (wzsVar == null) {
                                M.K(1959122128);
                            } else {
                                M.K(1171576145);
                                wzsVar.invoke(M, 0);
                            }
                            M.j();
                            M.a0();
                        }
                        if (gp.d(M)) {
                            androidx.compose.runtime.b.e();
                        }
                        phrVar3 = d2;
                        izsVar3 = izsVar4;
                    }
                    s = M.s();
                    if (s == null) {
                        s.d = new e(wlp0Var, q630Var2, phrVar3, izsVar3, yzsVar, i, i2);
                        return;
                    }
                    return;
                }
                izsVar2 = izsVar;
                if ((i & 24576) == 0) {
                }
                if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
                }
                s = M.s();
                if (s == null) {
                }
            }
            phrVar2 = phrVar;
            i4 = i2 & 4;
            if (i4 != 0) {
            }
            izsVar2 = izsVar;
            if ((i & 24576) == 0) {
            }
            if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
            }
            s = M.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i3 = i2 & 2;
        if (i3 == 0) {
        }
        phrVar2 = phrVar;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        izsVar2 = izsVar;
        if ((i & 24576) == 0) {
        }
        if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Crossfade.kt */
    public static final class b<T> extends Lambda implements izs<T, T> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final T invoke(T t) {
            return t;
        }
    }
}
