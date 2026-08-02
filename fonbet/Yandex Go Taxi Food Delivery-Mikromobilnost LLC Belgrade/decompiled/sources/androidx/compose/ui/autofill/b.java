package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.s;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.g;
import androidx.compose.ui.state.ToggleableState;
import defpackage.aie;
import defpackage.awk0;
import defpackage.b64;
import defpackage.bms;
import defpackage.cnq0;
import defpackage.dnq0;
import defpackage.hz40;
import defpackage.j73;
import defpackage.jl40;
import defpackage.k92;
import defpackage.kk2;
import defpackage.l94;
import defpackage.m9b1;
import defpackage.qv10;
import defpackage.uz40;
import defpackage.w82;
import defpackage.x82;
import defpackage.xy40;
import defpackage.zhe;
import defpackage.zy11;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0365 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x036d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final ViewStructure viewStructure, dnq0 dnq0Var, AutofillId autofillId, String str, androidx.compose.ui.spatial.a aVar) {
        int i;
        char c;
        long j;
        long j2;
        long j3;
        boolean z;
        ToggleableState toggleableState;
        kk2 kk2Var;
        k92 k92Var;
        awk0 awk0Var;
        w82 w82Var;
        boolean z2;
        Object obj;
        Boolean bool;
        boolean z3;
        Integer num;
        int i2;
        List list;
        Integer valueOf;
        boolean z4;
        boolean z5;
        String h;
        String[] strArr;
        String[] strArr2;
        hz40 hz40Var;
        long[] jArr;
        Object[] objArr;
        int i3;
        long[] jArr2;
        Object[] objArr2;
        hz40 hz40Var2;
        ToggleableState toggleableState2;
        kk2 kk2Var2;
        k92 k92Var2;
        awk0 awk0Var2;
        g gVar = d.a;
        g gVar2 = androidx.compose.ui.semantics.a.a;
        LayoutNode layoutNode = (LayoutNode) dnq0Var;
        cnq0 u = layoutNode.u();
        int i4 = 8;
        if (u == null || (hz40Var2 = u.a) == null) {
            i = 2;
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            z = true;
            toggleableState = null;
            kk2Var = null;
            k92Var = null;
            awk0Var = null;
            w82Var = null;
            z2 = false;
            obj = null;
            bool = null;
            z3 = false;
            num = null;
        } else {
            Object[] objArr3 = hz40Var2.b;
            j = 128;
            Object[] objArr4 = hz40Var2.c;
            long[] jArr3 = hz40Var2.a;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                z = true;
                c = 7;
                int i5 = 0;
                w82Var = null;
                j2 = 255;
                z2 = false;
                toggleableState2 = null;
                kk2Var2 = null;
                k92Var2 = null;
                obj = null;
                bool = null;
                awk0Var2 = null;
                z3 = false;
                num = null;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj2 = objArr3[i8];
                                Object obj3 = objArr4[i8];
                                g gVar3 = (g) obj2;
                                if (jl40.l(gVar3, d.s)) {
                                    w82Var = (w82) obj3;
                                } else if (jl40.l(gVar3, d.a)) {
                                    CharSequence charSequence = (String) kotlin.collections.a.R((List) obj3);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (jl40.l(gVar3, d.r)) {
                                    obj = (aie) obj3;
                                } else if (jl40.l(gVar3, d.t)) {
                                    k92Var2 = (k92) obj3;
                                } else if (jl40.l(gVar3, d.G)) {
                                    kk2Var2 = (kk2) obj3;
                                } else if (jl40.l(gVar3, d.l)) {
                                    viewStructure.setFocused(((Boolean) obj3).booleanValue());
                                } else if (jl40.l(gVar3, d.P)) {
                                    num = (Integer) obj3;
                                } else if (jl40.l(gVar3, d.L)) {
                                    z3 = true;
                                } else if (jl40.l(gVar3, d.o)) {
                                    z = ((Boolean) obj3).booleanValue();
                                } else if (jl40.l(gVar3, d.z)) {
                                    awk0Var2 = (awk0) obj3;
                                } else if (jl40.l(gVar3, d.J)) {
                                    bool = (Boolean) obj3;
                                } else if (jl40.l(gVar3, d.K)) {
                                    toggleableState2 = (ToggleableState) obj3;
                                } else if (jl40.l(gVar3, androidx.compose.ui.semantics.a.b)) {
                                    viewStructure.setClickable(true);
                                } else if (jl40.l(gVar3, androidx.compose.ui.semantics.a.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (jl40.l(gVar3, androidx.compose.ui.semantics.a.w)) {
                                    viewStructure.setFocusable(true);
                                } else if (jl40.l(gVar3, androidx.compose.ui.semantics.a.k)) {
                                    z2 = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            } else {
                c = 7;
                j2 = 255;
                j3 = -9187201950435737472L;
                z = true;
                w82Var = null;
                z2 = false;
                toggleableState2 = null;
                kk2Var2 = null;
                k92Var2 = null;
                obj = null;
                bool = null;
                awk0Var2 = null;
                z3 = false;
                num = null;
            }
            toggleableState = toggleableState2;
            kk2Var = kk2Var2;
            k92Var = k92Var2;
            awk0Var = awk0Var2;
        }
        cnq0 u2 = layoutNode.u();
        if (u2 != null && u2.c && !u2.w) {
            u2 = u2.b();
            xy40 xy40Var = new xy40(((uz40) layoutNode.k()).a.c);
            xy40Var.h(layoutNode.k());
            while (xy40Var.e()) {
                LayoutNode layoutNode2 = (LayoutNode) ((dnq0) xy40Var.m(xy40Var.b - 1));
                cnq0 u3 = layoutNode2.u();
                if (u3 != null && !u3.c) {
                    u2.f(u3);
                    if (!u3.w) {
                        xy40Var.h(layoutNode2.k());
                    }
                }
            }
        }
        if (u2 == null || (hz40Var = u2.a) == null) {
            i2 = 1;
        } else {
            Object[] objArr5 = hz40Var.b;
            Object[] objArr6 = hz40Var.c;
            long[] jArr4 = hz40Var.a;
            int length2 = jArr4.length - 2;
            i2 = 1;
            if (length2 >= 0) {
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i9];
                    int i10 = i4;
                    int i11 = i9;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i11 << 3) + i13;
                                Object obj4 = objArr5[i14];
                                Object obj5 = objArr6[i14];
                                jArr2 = jArr4;
                                g gVar4 = (g) obj4;
                                objArr2 = objArr5;
                                if (jl40.l(gVar4, d.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (jl40.l(gVar4, d.C)) {
                                    list = (List) obj5;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j5 >>= i10;
                            i13++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i9 = i11 + 1;
                    i4 = i3;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
                Integer valueOf2 = Integer.valueOf(layoutNode.b);
                if (layoutNode.s() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = w82Var == null ? Integer.valueOf(w82Var.a) : z2 ? Integer.valueOf(i2) : toggleableState != null ? Integer.valueOf(i) : null;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (kk2Var != null) {
                    viewStructure.setAutofillValue(l94.b(kk2Var.b));
                }
                if (k92Var != null) {
                    viewStructure.setAutofillValue(k92Var.a);
                }
                if (obj != null && (strArr2 = (String[]) ((x82) obj).b.toArray(new String[0])) != null) {
                    viewStructure.setAutofillHints(strArr2);
                }
                aVar.b.e(layoutNode.b, new bms() { // from class: androidx.compose.ui.autofill.PopulateViewStructure_androidKt$populate$7
                    final /* synthetic */ l94 $autofillApi = l94.a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.bms
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int intValue2 = ((Number) obj6).intValue();
                        int intValue3 = ((Number) obj7).intValue();
                        int intValue4 = ((Number) obj8).intValue();
                        int intValue5 = ((Number) obj9).intValue();
                        this.$autofillApi.getClass();
                        viewStructure.setDimens(intValue2, intValue3, 0, 0, intValue4 - intValue2, intValue5 - intValue3);
                        return zy11.a;
                    }
                });
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (toggleableState == null) {
                    viewStructure.setCheckable(i2);
                    viewStructure.setChecked(toggleableState == ToggleableState.On);
                } else if (bool != null && (awk0Var == null || awk0Var.a != 4)) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                aie.a.getClass();
                String str2 = (String) j73.C((String[]) zhe.b.b.toArray(new String[0]));
                if (obj != null || (strArr = (String[]) ((x82) obj).b.toArray(new String[0])) == null) {
                    z4 = true;
                } else {
                    boolean y = j73.y(strArr, str2);
                    z4 = true;
                    if (y) {
                        z5 = true;
                        boolean z6 = (!z3 || z5) ? z4 : false;
                        viewStructure.setDataIsSensitive((!z6 || z) ? z4 : false);
                        viewStructure.setVisibility(((s) layoutNode.a0.e).j1() ? 4 : 0);
                        if (list != null) {
                            int size = list.size();
                            String str3 = "";
                            for (int i15 = 0; i15 < size; i15++) {
                                str3 = b64.p(qv10.t(str3), ((kk2) list.get(i15)).b, '\n');
                            }
                            viewStructure.setText(str3);
                            viewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
                        }
                        if (((uz40) layoutNode.k()).isEmpty() && awk0Var != null && (h = m9b1.h(awk0Var.a)) != null) {
                            viewStructure.setClassName(h);
                        }
                        if (z2) {
                            viewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
                            if (num != null) {
                                viewStructure.setMaxTextLength(num.intValue());
                            }
                            if (z6) {
                                viewStructure.setInputType(HProv.PP_SECURITY_LEVEL);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z5 = false;
                if (z3) {
                }
                viewStructure.setDataIsSensitive((!z6 || z) ? z4 : false);
                viewStructure.setVisibility(((s) layoutNode.a0.e).j1() ? 4 : 0);
                if (list != null) {
                }
                if (((uz40) layoutNode.k()).isEmpty()) {
                    viewStructure.setClassName(h);
                }
                if (z2) {
                }
            }
        }
        list = null;
        Integer valueOf22 = Integer.valueOf(layoutNode.b);
        if (layoutNode.s() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (w82Var == null) {
        }
        if (valueOf != null) {
        }
        if (kk2Var != null) {
        }
        if (k92Var != null) {
        }
        if (obj != null) {
            viewStructure.setAutofillHints(strArr2);
        }
        aVar.b.e(layoutNode.b, new bms() { // from class: androidx.compose.ui.autofill.PopulateViewStructure_androidKt$populate$7
            final /* synthetic */ l94 $autofillApi = l94.a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // defpackage.bms
            public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                int intValue2 = ((Number) obj6).intValue();
                int intValue3 = ((Number) obj7).intValue();
                int intValue4 = ((Number) obj8).intValue();
                int intValue5 = ((Number) obj9).intValue();
                this.$autofillApi.getClass();
                viewStructure.setDimens(intValue2, intValue3, 0, 0, intValue4 - intValue2, intValue5 - intValue3);
                return zy11.a;
            }
        });
        if (bool != null) {
        }
        if (toggleableState == null) {
        }
        aie.a.getClass();
        String str22 = (String) j73.C((String[]) zhe.b.b.toArray(new String[0]));
        if (obj != null) {
        }
        z4 = true;
        z5 = false;
        if (z3) {
        }
        viewStructure.setDataIsSensitive((!z6 || z) ? z4 : false);
        viewStructure.setVisibility(((s) layoutNode.a0.e).j1() ? 4 : 0);
        if (list != null) {
        }
        if (((uz40) layoutNode.k()).isEmpty()) {
        }
        if (z2) {
        }
    }
}
