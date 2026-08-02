package xsna;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.state.ToggleableState;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.mlj;

/* compiled from: PopulateViewStructure.android.kt */
/* loaded from: classes11.dex */
public final class bwb0 {

    /* compiled from: PopulateViewStructure.android.kt */
    public static final class a extends Lambda implements zzs<Integer, Integer, Integer, Integer, s3q0> {
        final /* synthetic */ io5 $autofillApi = io5.a;
        final /* synthetic */ ViewStructure $this_populate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewStructure viewStructure) {
            super(4);
            this.$this_populate = viewStructure;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            int intValue3 = num3.intValue();
            int intValue4 = num4.intValue();
            this.$autofillApi.getClass();
            this.$this_populate.setDimens(intValue, intValue2, 0, 0, intValue3 - intValue, intValue4 - intValue2);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ViewStructure viewStructure, agi0 agi0Var, AutofillId autofillId, String str, fif0 fif0Var) {
        int i;
        long j;
        long j2;
        long j3;
        char c;
        boolean z;
        ToggleableState toggleableState;
        us2 us2Var;
        r82 r82Var;
        plg0 plg0Var;
        Object obj;
        boolean z2;
        Object obj2;
        Boolean bool;
        boolean z3;
        Integer num;
        int i2;
        List list;
        boolean z4;
        boolean z5;
        String d;
        String[] strArr;
        String[] strArr2;
        ph50<sgi0<?>, Object> ph50Var;
        List list2;
        int i3;
        int i4;
        ph50<sgi0<?>, Object> ph50Var2;
        ToggleableState toggleableState2;
        us2 us2Var2;
        r82 r82Var2;
        plg0 plg0Var2;
        long j4;
        sgi0<List<String>> sgi0Var = ngi0.a;
        sgi0<ck<izs<List<ljo0>, Boolean>>> sgi0Var2 = wfi0.a;
        xfi0 d2 = agi0Var.d();
        int i5 = 2;
        long j5 = -9187201950435737472L;
        int i6 = 8;
        if (d2 == null || (ph50Var2 = d2.b) == null) {
            i = 2;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
            c = 7;
            z = true;
            toggleableState = null;
            us2Var = null;
            r82Var = null;
            plg0Var = null;
            obj = null;
            z2 = false;
            obj2 = null;
            bool = null;
            z3 = false;
            num = null;
        } else {
            Object[] objArr = ph50Var2.b;
            Object[] objArr2 = ph50Var2.c;
            long[] jArr = ph50Var2.a;
            j2 = 128;
            int length = jArr.length - 2;
            if (length >= 0) {
                z = true;
                int i7 = 0;
                obj = null;
                z2 = false;
                toggleableState2 = null;
                us2Var2 = null;
                r82Var2 = null;
                obj2 = null;
                bool = null;
                plg0Var2 = null;
                z3 = false;
                num = null;
                j3 = 255;
                while (true) {
                    long j6 = jArr[i7];
                    i = i5;
                    c = 7;
                    if ((((~j6) << 7) & j6 & j5) != j5) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j6 & 255) < 128) {
                                int i10 = (i7 << 3) + i9;
                                Object obj3 = objArr[i10];
                                Object obj4 = objArr2[i10];
                                j4 = j5;
                                sgi0 sgi0Var3 = (sgi0) obj3;
                                if (epx.f(sgi0Var3, ngi0.s)) {
                                    obj = (cgj) obj4;
                                } else if (epx.f(sgi0Var3, ngi0.a)) {
                                    CharSequence charSequence = (String) j5g.a0((List) obj4);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (epx.f(sgi0Var3, ngi0.r)) {
                                    obj2 = (mlj) obj4;
                                } else if (epx.f(sgi0Var3, ngi0.t)) {
                                    r82Var2 = (r82) obj4;
                                } else if (epx.f(sgi0Var3, ngi0.G)) {
                                    us2Var2 = (us2) obj4;
                                } else if (epx.f(sgi0Var3, ngi0.l)) {
                                    viewStructure.setFocused(((Boolean) obj4).booleanValue());
                                } else if (epx.f(sgi0Var3, ngi0.P)) {
                                    num = (Integer) obj4;
                                } else if (epx.f(sgi0Var3, ngi0.L)) {
                                    z3 = true;
                                } else if (epx.f(sgi0Var3, ngi0.o)) {
                                    z = ((Boolean) obj4).booleanValue();
                                } else if (epx.f(sgi0Var3, ngi0.z)) {
                                    plg0Var2 = (plg0) obj4;
                                } else if (epx.f(sgi0Var3, ngi0.J)) {
                                    bool = (Boolean) obj4;
                                } else if (epx.f(sgi0Var3, ngi0.K)) {
                                    toggleableState2 = (ToggleableState) obj4;
                                } else if (epx.f(sgi0Var3, wfi0.b)) {
                                    viewStructure.setClickable(true);
                                } else if (epx.f(sgi0Var3, wfi0.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (epx.f(sgi0Var3, wfi0.w)) {
                                    viewStructure.setFocusable(true);
                                } else if (epx.f(sgi0Var3, wfi0.k)) {
                                    z2 = true;
                                }
                            } else {
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i9++;
                            j5 = j4;
                        }
                        j = j5;
                        if (i8 != 8) {
                            break;
                        }
                    } else {
                        j = j5;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    i5 = i;
                    j5 = j;
                }
            } else {
                i = 2;
                j = -9187201950435737472L;
                j3 = 255;
                c = 7;
                z = true;
                obj = null;
                z2 = false;
                toggleableState2 = null;
                us2Var2 = null;
                r82Var2 = null;
                obj2 = null;
                bool = null;
                plg0Var2 = null;
                z3 = false;
                num = null;
            }
            toggleableState = toggleableState2;
            us2Var = us2Var2;
            r82Var = r82Var2;
            plg0Var = plg0Var2;
        }
        xfi0 d3 = agi0Var.d();
        if (d3 != null && d3.d && !d3.e) {
            xfi0 xfi0Var = new xfi0();
            xfi0Var.d = d3.d;
            xfi0Var.e = d3.e;
            xfi0Var.b.m(d3.b);
            fh50 fh50Var = new fh50(agi0Var.l().size());
            fh50Var.k(agi0Var.l());
            while (fh50Var.g()) {
                agi0 agi0Var2 = (agi0) fh50Var.o(fh50Var.b - 1);
                xfi0 d4 = agi0Var2.d();
                if (d4 != null && !d4.d) {
                    xfi0Var.e(d4);
                    if (!d4.e) {
                        fh50Var.k(agi0Var2.l());
                    }
                }
            }
            d3 = xfi0Var;
        }
        if (d3 == null || (ph50Var = d3.b) == null) {
            i2 = 1;
            list = null;
        } else {
            Object[] objArr3 = ph50Var.b;
            Object[] objArr4 = ph50Var.c;
            long[] jArr2 = ph50Var.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i11 = 1;
                int i12 = 0;
                list2 = null;
                while (true) {
                    long j7 = jArr2[i12];
                    int i13 = i6;
                    if ((((~j7) << c) & j7 & j) != j) {
                        int i14 = 8 - ((~(i12 - length2)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j7 & j3) < j2) {
                                int i16 = (i12 << 3) + i15;
                                Object obj5 = objArr3[i16];
                                Object obj6 = objArr4[i16];
                                i4 = i11;
                                sgi0 sgi0Var4 = (sgi0) obj5;
                                if (epx.f(sgi0Var4, ngi0.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (epx.f(sgi0Var4, ngi0.C)) {
                                    list2 = (List) obj6;
                                }
                            } else {
                                i4 = i11;
                            }
                            j7 >>= i13;
                            i15++;
                            i11 = i4;
                        }
                        i2 = i11;
                        i3 = i13;
                        if (i14 != i3) {
                            break;
                        }
                    } else {
                        i2 = i11;
                        i3 = i13;
                    }
                    if (i12 == length2) {
                        break;
                    }
                    i12++;
                    i6 = i3;
                    i11 = i2;
                }
            } else {
                i2 = 1;
                list2 = null;
            }
            list = list2;
        }
        Integer valueOf = Integer.valueOf(agi0Var.c());
        if (agi0Var.o() == null) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : -1;
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        Integer valueOf2 = obj != null ? Integer.valueOf(((l72) obj).a) : z2 ? Integer.valueOf(i2) : toggleableState != null ? Integer.valueOf(i) : null;
        if (valueOf2 != null) {
            viewStructure.setAutofillType(valueOf2.intValue());
        }
        if (us2Var != null) {
            String str2 = us2Var.c;
            if (str2.length() >= 5000) {
                str2 = (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) ? erm0.D0(4999, str2) : erm0.D0(5000, str2);
            }
            viewStructure.setAutofillValue(AutofillValue.forText(str2));
        }
        if (r82Var != null) {
            viewStructure.setAutofillValue(r82Var.a);
        }
        if (obj2 != null && (strArr2 = (String[]) ((m72) obj2).b.toArray(new String[0])) != null) {
            viewStructure.setAutofillHints(strArr2);
        }
        fif0Var.b.e(agi0Var.c(), new a(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (toggleableState != null) {
            viewStructure.setCheckable(i2);
            viewStructure.setChecked(toggleableState == ToggleableState.On);
        } else if (bool != null && (plg0Var == null || plg0Var.a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        mlj.a.getClass();
        String str3 = (String) rl3.L((String[]) mlj.a.b.b.toArray(new String[0]));
        if (obj2 == null || (strArr = (String[]) ((m72) obj2).b.toArray(new String[0])) == null) {
            z4 = true;
        } else {
            z4 = true;
            if (rl3.G(strArr, str3)) {
                z5 = true;
                boolean z6 = (!z3 || z5) ? z4 : false;
                viewStructure.setDataIsSensitive((!z6 || z) ? z4 : false);
                viewStructure.setVisibility(agi0Var.m() ? 4 : 0);
                if (list != null) {
                    int size = list.size();
                    String str4 = "";
                    for (int i17 = 0; i17 < size; i17++) {
                        str4 = ho8.a(fw3.e(str4), ((us2) list.get(i17)).c, '\n');
                    }
                    viewStructure.setText(str4);
                    viewStructure.setClassName("android.widget.TextView");
                }
                if (agi0Var.l().isEmpty() && plg0Var != null && (d = ygi0.d(plg0Var.a)) != null) {
                    viewStructure.setClassName(d);
                }
                if (z2) {
                    return;
                }
                viewStructure.setClassName("android.widget.EditText");
                if (num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (z6) {
                    viewStructure.setInputType(129);
                    return;
                }
                return;
            }
        }
        z5 = false;
        if (z3) {
        }
        viewStructure.setDataIsSensitive((!z6 || z) ? z4 : false);
        viewStructure.setVisibility(agi0Var.m() ? 4 : 0);
        if (list != null) {
        }
        if (agi0Var.l().isEmpty()) {
            viewStructure.setClassName(d);
        }
        if (z2) {
        }
    }
}
