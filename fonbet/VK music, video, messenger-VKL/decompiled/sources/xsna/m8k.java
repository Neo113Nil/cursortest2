package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class m8k implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m8k(int i, String str, String str2, gzs gzsVar, q630 q630Var) {
        this.e = str;
        this.f = str2;
        this.d = q630Var;
        this.c = gzsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        y190 y190Var;
        zo10 zo10Var;
        int i;
        int i2;
        int i3;
        int i4;
        khk0 khk0Var;
        u190 u190Var;
        int i5;
        int i6;
        LayoutDirection layoutDirection;
        int i7;
        int i8;
        int i9;
        int i10;
        switch (this.b) {
            case 0:
                String str = (String) this.e;
                String str2 = (String) this.f;
                q630 q630Var = (q630) this.d;
                gzs gzsVar = (gzs) this.c;
                ((Integer) obj2).getClass();
                n8k.a(ne7.I(1), (androidx.compose.runtime.a) obj, str, str2, gzsVar, q630Var);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                px00.a((gzs) this.c, (gzs) this.e, (gzs) this.f, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(439));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                t110.a((s110) this.e, (izs) this.f, (wzs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                jai jaiVar = (jai) this.e;
                u190 u190Var2 = (u190) this.f;
                final jai jaiVar2 = (jai) this.d;
                y190 y190Var2 = (y190) this.c;
                ztm0 ztm0Var = (ztm0) obj;
                o6j o6jVar = (o6j) obj2;
                List<zo10> t1 = ztm0Var.t1(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, jaiVar);
                final int size = t1.size();
                List<zo10> list = t1;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((zo10) it.next()).N(o6j.b(0, o6jVar.a, Integer.MAX_VALUE, 0, 0, 8)));
                }
                long j = o6jVar.a;
                khk0 khk0Var2 = u190Var2.b;
                int i11 = khk0Var2.a;
                LayoutDirection layoutDirection2 = u190Var2.d;
                int i12 = layoutDirection2 == LayoutDirection.Rtl ? o6j.i(j) : 0;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                final int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean z = false;
                while (true) {
                    int i17 = i11;
                    if (it2.hasNext()) {
                        tra0 tra0Var = (tra0) it2.next();
                        arrayList = arrayList2;
                        int i18 = tra0Var.b;
                        int i19 = tra0Var.c;
                        y190Var = y190Var2;
                        int i20 = u190Var2.a;
                        if (i14 < i20) {
                            if (i14 == i20 - 1) {
                                int i21 = layoutDirection2 == LayoutDirection.Rtl ? i12 : o6j.i(j) - i12;
                                if (i13 > 0) {
                                    i = i12;
                                    i10 = i21 - i17;
                                } else {
                                    i = i12;
                                    i10 = i21;
                                }
                                i2 = i14;
                                if (!u190Var2.c.a(i10, i18)) {
                                    if (i21 < i18) {
                                        i5 = i15;
                                        i4 = i;
                                        i3 = i2;
                                        z = true;
                                        khk0Var = khk0Var2;
                                        u190Var = u190Var2;
                                        i6 = i16;
                                        layoutDirection = LayoutDirection.Rtl;
                                        if (layoutDirection2 == layoutDirection) {
                                            i7 = i18;
                                            i8 = i4 - i18;
                                            i9 = i4;
                                        } else {
                                            i7 = i18;
                                            i8 = i4;
                                            i9 = i8;
                                        }
                                        int i22 = i3;
                                        arrayList3.add(new h9x((i8 << 32) | (i5 & 4294967295L)));
                                        i13++;
                                        i12 = i9 + (layoutDirection2 == layoutDirection ? -(i7 + i17) : i7 + i17);
                                        int max = Math.max(i19, i6);
                                        i15 = i5;
                                        i14 = i22;
                                        arrayList2 = arrayList;
                                        i11 = i17;
                                        y190Var2 = y190Var;
                                        u190Var2 = u190Var;
                                        i16 = max;
                                        khk0Var2 = khk0Var;
                                    }
                                }
                            } else {
                                i = i12;
                                i2 = i14;
                                LayoutDirection layoutDirection3 = LayoutDirection.Rtl;
                                if (layoutDirection2 != layoutDirection3 ? !(i <= 0 || i + i18 <= o6j.i(j)) : i - i18 < 0) {
                                    i3 = i2 + 1;
                                    int i23 = i16 + khk0Var2.b + i15;
                                    i4 = layoutDirection2 == layoutDirection3 ? o6j.i(j) : 0;
                                    khk0Var = khk0Var2;
                                    u190Var = u190Var2;
                                    i5 = i23;
                                    i6 = 0;
                                    layoutDirection = LayoutDirection.Rtl;
                                    if (layoutDirection2 == layoutDirection) {
                                    }
                                    int i222 = i3;
                                    arrayList3.add(new h9x((i8 << 32) | (i5 & 4294967295L)));
                                    i13++;
                                    i12 = i9 + (layoutDirection2 == layoutDirection ? -(i7 + i17) : i7 + i17);
                                    int max2 = Math.max(i19, i6);
                                    i15 = i5;
                                    i14 = i222;
                                    arrayList2 = arrayList;
                                    i11 = i17;
                                    y190Var2 = y190Var;
                                    u190Var2 = u190Var;
                                    i16 = max2;
                                    khk0Var2 = khk0Var;
                                }
                            }
                            i5 = i15;
                            i4 = i;
                            i3 = i2;
                            khk0Var = khk0Var2;
                            u190Var = u190Var2;
                            i6 = i16;
                            layoutDirection = LayoutDirection.Rtl;
                            if (layoutDirection2 == layoutDirection) {
                            }
                            int i2222 = i3;
                            arrayList3.add(new h9x((i8 << 32) | (i5 & 4294967295L)));
                            i13++;
                            i12 = i9 + (layoutDirection2 == layoutDirection ? -(i7 + i17) : i7 + i17);
                            int max22 = Math.max(i19, i6);
                            i15 = i5;
                            i14 = i2222;
                            arrayList2 = arrayList;
                            i11 = i17;
                            y190Var2 = y190Var;
                            u190Var2 = u190Var;
                            i16 = max22;
                            khk0Var2 = khk0Var;
                        }
                    } else {
                        arrayList = arrayList2;
                        y190Var = y190Var2;
                    }
                }
                int i24 = i13 > 0 ? i15 + i16 : 0;
                tra0 tra0Var2 = null;
                if ((z || i13 < size) && (zo10Var = (zo10) j5g.a0(ztm0Var.t1("indicator", new jai(-299066373, new wzs() { // from class: xsna.w190
                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-299066373, intValue, -1, "com.vk.donut.design.compose.banner.utils.OverflowFlowRowWithIndicator.<anonymous>.<anonymous>.<anonymous> (OverflowFlowRow.kt:72)");
                            }
                            int i25 = size;
                            jai.this.invoke(Integer.valueOf(i25 - i13), Integer.valueOf(i25), aVar, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar.h();
                        }
                        return s3q0.a;
                    }
                }, true)))) != null) {
                    tra0Var2 = zo10Var.N(o6j.b(0, o6jVar.a, 0, 0, 0, 10));
                }
                return ztm0Var.Q(o6j.i(o6jVar.a), i24, jgp.b, new ok(arrayList3, tra0Var2, arrayList, y190Var, o6jVar, i24, ztm0Var));
        }
    }

    public /* synthetic */ m8k(jai jaiVar, u190 u190Var, jai jaiVar2, y190 y190Var) {
        this.e = jaiVar;
        this.f = u190Var;
        this.d = jaiVar2;
        this.c = y190Var;
    }

    public /* synthetic */ m8k(gzs gzsVar, gzs gzsVar2, gzs gzsVar3, q630 q630Var, int i) {
        this.c = gzsVar;
        this.e = gzsVar2;
        this.f = gzsVar3;
        this.d = q630Var;
    }

    public /* synthetic */ m8k(s110 s110Var, izs izsVar, wzs wzsVar, q630 q630Var, int i) {
        this.e = s110Var;
        this.f = izsVar;
        this.c = wzsVar;
        this.d = q630Var;
    }
}
