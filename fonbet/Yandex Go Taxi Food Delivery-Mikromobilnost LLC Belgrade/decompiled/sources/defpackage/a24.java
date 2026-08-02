package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.stories.ui.CommunicationFullscreenTitlePaddingMode;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.api.AutoTopupShowOnly;
import com.ybsdk.feature.autotopup.api.AutoTopupSwitchStatus;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoFundInputType;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoTopupInputType;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;
import ru.yandex.video.m3.BuildConfig;

/* loaded from: classes3.dex */
public final class a24 implements ev31 {
    public static final stz0 b;
    public static final stz0 c;
    public final Context a;

    static {
        Text.Empty empty = Text.Empty.INSTANCE;
        b = new stz0(empty, null, new ColorModel.Raw(0), null, null, qtz0.a, false, null, null, null, null, null, 32730);
        c = new stz0(empty, null, new ColorModel.Raw(0), null, null, new ntz0(0), false, null, null, null, null, null, 32730);
    }

    public a24(Context context) {
        this.a = context;
    }

    public static fu3 a(c22 c22Var, String str, ArrayList arrayList, txz0 txz0Var) {
        Text text;
        b bVar;
        int i;
        Object obj;
        String str2 = c22Var.b;
        txz0 txz0Var2 = c22Var.a;
        eu3 eu3Var = null;
        if (str2 != null) {
            text = g8e.i(Text.Companion, str2);
        } else {
            if (txz0Var2 == AutoTopupInputType.AMOUNT) {
                bVar = Text.Companion;
                i = dzh0.ybsdk_deposit_auto_topup_settings_topup_sum_title;
            } else if (txz0Var2 == AutoTopupInputType.THRESHOLD) {
                bVar = Text.Companion;
                i = dzh0.ybsdk_deposit_auto_topup_settings_less_then_title;
            } else {
                if (txz0Var2 != AutoFundInputType.AUTOFUND_MONEY) {
                    w511.b();
                    return null;
                }
                text = Text.Empty.INSTANCE;
            }
            text = unr0.h(bVar, i);
        }
        Text text2 = text;
        String str3 = c22Var.e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((g031) obj).c, txz0Var2)) {
                    break;
                }
            }
            g031 g031Var = (g031) obj;
            if (g031Var != null) {
                eu3Var = new eu3(g031Var.b, g031Var.a);
            }
        }
        return new fu3(text2, str, str3, eu3Var, txz0Var != null && jl40.l(txz0Var2, txz0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010d, code lost:
    
        if (r14 == null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c1  */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        int i;
        Integer num;
        ArrayList arrayList;
        ahq0 ahq0Var;
        cv3 cv3Var;
        cv3 cv3Var2;
        j5x0 j5x0Var;
        jr3 jr3Var;
        boolean z;
        rbv rbvVar;
        Text.Constant constant;
        int i2;
        int i3;
        String b2;
        rbv d;
        rbv rbvVar2;
        rbv nbvVar;
        rbv rbvVar3;
        nsz0 nsz0Var;
        boolean z2;
        Boolean bool;
        j04 j04Var = (j04) obj;
        u8j0 u8j0Var = j04Var.a;
        if (!(u8j0Var instanceof r8j0)) {
            if (u8j0Var instanceof s8j0) {
                return new v14(r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
            }
            if (u8j0Var instanceof t8j0) {
                return x14.a;
            }
            w511.b();
            return null;
        }
        vou0 vou0Var = j04Var.o;
        Context context = this.a;
        if (vou0Var != null) {
            trc trcVar = j04Var.p;
            boolean z3 = j04Var.d() && !j04Var.e();
            vrc b3 = dsc.b(vou0Var, context, z3 ? CommunicationFullscreenTitlePaddingMode.EMPTY_TOOLBAR : CommunicationFullscreenTitlePaddingMode.MULTIPLE, trcVar, 16);
            YbButtonViewGroup.b bVar = b3.l;
            YbButtonView.a aVar = bVar != null ? bVar.b : null;
            return new w14(z3 ? c : b, vrc.a(b3, null, null, bVar != null ? YbButtonViewGroup.b.a(bVar, aVar != null ? YbButtonView.a.a(aVar, null, null, false, j04Var.c, BuildConfig.VERSION_CODE) : null, null, 13) : null, false, false, 0, 0, null, false, -4097));
        }
        qz3 qz3Var = (qz3) ((r8j0) u8j0Var).a;
        h031 h031Var = j04Var.h;
        Boolean bool2 = j04Var.l;
        Boolean bool3 = j04Var.n;
        String str = j04Var.m;
        txz0 txz0Var = j04Var.i;
        Integer num2 = j04Var.k;
        ku3 ku3Var = j04Var.j;
        h5a0 h5a0Var = j04Var.f;
        if (h031Var != null) {
            ty21 ty21Var = h031Var.a;
            AutoTopupSwitchStatus autoTopupSwitchStatus = ty21Var.f;
            int[] iArr = z14.a;
            int i4 = iArr[autoTopupSwitchStatus.ordinal()];
            num = num2;
            if (i4 == 1) {
                z2 = false;
            } else {
                if (i4 != 2) {
                    w511.b();
                    return null;
                }
                z2 = true;
            }
            AutoTopupSwitchStatus autoTopupSwitchStatus2 = ty21Var.g;
            int i5 = autoTopupSwitchStatus2 == null ? -1 : iArr[autoTopupSwitchStatus2.ordinal()];
            boolean z4 = z2;
            if (i5 == -1) {
                bool = null;
            } else if (i5 == 1) {
                bool = Boolean.FALSE;
            } else {
                if (i5 != 2) {
                    w511.b();
                    return null;
                }
                bool = Boolean.TRUE;
            }
            arrayList = a.m0(h031Var.b, h031Var.c);
            i = 1;
            if (!jl40.l(ty21Var.c, j04Var.c()) || !jl40.l(ty21Var.b, j04Var.b()) || !jl40.l(ty21Var.d, h5a0Var) || !ty21Var.h.equals(str) || !Boolean.valueOf(z4).equals(bool3) || !jl40.l(bool, bool2)) {
                arrayList = null;
            }
        } else {
            i = 1;
            num = num2;
        }
        arrayList = null;
        Text text = qz3Var.b;
        mz3 mz3Var = qz3Var.j;
        lz3 lz3Var = qz3Var.k;
        Text text2 = qz3Var.c;
        rbv rbvVar4 = qz3Var.d;
        nz3 nz3Var = qz3Var.h;
        stz0 stz0Var = new stz0(text, text2, null, null, null, ((nz3Var == null || (nsz0Var = nz3Var.c) == null) ? null : nsz0Var.a) == null ? qtz0.a : new ptz0(nz3Var.c.a), false, null, null, null, rbvVar4, null, 30684);
        if (h5a0Var != null) {
            if (h5a0Var instanceof c5a0) {
                rbvVar3 = ((c5a0) h5a0Var).c;
            } else if (h5a0Var instanceof e5a0) {
                ThemedImageUrlEntity themedImageUrlEntity = ((e5a0) h5a0Var).d.a;
                if (themedImageUrlEntity == null || (nbvVar = job1.f(themedImageUrlEntity, new bd90(14))) == null) {
                    nbvVar = new nbv(txg0.ybsdk_ic_yb_placeholder, null);
                }
                rbvVar3 = nbvVar;
            } else {
                if (h5a0Var instanceof g5a0) {
                    d = j5a0.d(((g5a0) h5a0Var).g, 0, 3);
                } else {
                    if (!(h5a0Var instanceof f5a0)) {
                        w511.b();
                        return null;
                    }
                    d = j5a0.d(((f5a0) h5a0Var).d, 0, 3);
                }
                rbvVar2 = d;
                ahq0Var = new ahq0(true, rbvVar2, h5a0Var.getTitle(), !(h5a0Var instanceof f5a0) ? d.f(((f5a0) h5a0Var).i) : null, (Text) unr0.h(Text.Companion, dzh0.ybsdk_deposit_deposit_payment_method_title), (Text.Resource) null, 0, (ColorModel) null, 480);
            }
            rbvVar2 = rbvVar3;
            ahq0Var = new ahq0(true, rbvVar2, h5a0Var.getTitle(), !(h5a0Var instanceof f5a0) ? d.f(((f5a0) h5a0Var).i) : null, (Text) unr0.h(Text.Companion, dzh0.ybsdk_deposit_deposit_payment_method_title), (Text.Resource) null, 0, (ColorModel) null, 480);
        } else {
            ahq0Var = new ahq0(true, (rbv) new nbv(nyg0.ybsdk_ic_add_payment_method, null), (Text) unr0.h(Text.Companion, dzh0.ybsdk_deposit_deposit_payment_method_title), (Text) null, (Text) null, (Text.Resource) null, 0, (ColorModel) null, 504);
        }
        ahq0 ahq0Var2 = ahq0Var;
        YbButtonViewGroup.b bVar2 = new YbButtonViewGroup.b(null, new YbButtonView.a(qz3Var.e, null, null, null, null, null, null, false, j04Var.c, null, 3070), null, new YbButtonViewGroup.a((h5a0Var == null || (b2 = h5a0Var.b()) == null) ? null : d.e(b2), 6), 5);
        boolean z5 = !j04Var.c;
        if (ku3Var instanceof ju3) {
            h5a0 h5a0Var2 = ((ju3) ku3Var).a;
            String id = h5a0Var2 != null ? h5a0Var2.getId() : null;
            String id2 = h5a0Var != null ? h5a0Var.getId() : null;
            qz3 qz3Var2 = (qz3) u8j0Var.a();
            cv3Var2 = new bv3(odq0.c(this.a, id, id2, qz3Var2 != null ? qz3Var2.f : null, null, 48));
        } else if (ku3Var instanceof iu3) {
            qz3 qz3Var3 = (qz3) u8j0Var.a();
            pz3 pz3Var = qz3Var3 != null ? qz3Var3.g : null;
            ArrayList arrayList2 = pz3Var != null ? pz3Var.c : null;
            h5a0 h5a0Var3 = ((iu3) ku3Var).a;
            cv3Var2 = new av3(new pdq0(odq0.a(context, arrayList2, h5a0Var3 != null ? h5a0Var3.getId() : null, h5a0Var != null ? h5a0Var.getId() : null, false), d.f(pz3Var != null ? pz3Var.a : null), null, new nbv(nyg0.ybsdk_ic_arrow_short_back, null), null, 32), d.f(pz3Var != null ? pz3Var.b : null));
        } else if (ku3Var == null) {
            cv3Var2 = null;
        } else {
            if (ku3Var.equals(vvb1.c)) {
                cv3Var = wfz.x;
            } else if (ku3Var.equals(l76.x)) {
                cv3Var = h2b1.w;
            } else {
                if (!ku3Var.equals(hu3.a)) {
                    w511.b();
                    return null;
                }
                cv3Var = bei.x;
            }
            cv3Var2 = cv3Var;
        }
        ArrayList arrayList3 = mz3Var.d;
        if (arrayList3.size() > i) {
            ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
            int i6 = 0;
            for (Object obj2 : arrayList3) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    scc.m();
                    throw null;
                }
                arrayList4.add(new k5x0(g8e.i(Text.Companion, ((cn11) obj2).c), i6));
                i6 = i7;
            }
            if (num != null) {
                i3 = num.intValue();
            } else {
                Iterator it = arrayList3.iterator();
                int i8 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (((cn11) it.next()).a) {
                        i2 = i8;
                        break;
                    }
                    i8++;
                }
                i3 = i2;
            }
            j5x0Var = new j5x0(arrayList4, Integer.valueOf(i3));
        } else {
            j5x0Var = null;
        }
        if (lz3Var != null) {
            boolean booleanValue = bool2 != null ? bool2.booleanValue() : lz3Var.a;
            Text.Constant i9 = g8e.i(Text.Companion, lz3Var.b);
            String str2 = lz3Var.c;
            Text.Constant constant2 = str2 != null ? new Text.Constant(str2) : null;
            fu3 a = a(k2b1.b(lz3Var.d), str, arrayList, txz0Var);
            if (!(h5a0Var instanceof g5a0) && !(h5a0Var instanceof f5a0)) {
                if (!(h5a0Var instanceof c5a0) && !(h5a0Var instanceof e5a0) && h5a0Var != null) {
                    w511.b();
                    return null;
                }
                String str3 = j04Var.q;
                if (str3 != null) {
                    constant = new Text.Constant(str3);
                    iky0 iky0Var = lz3Var.f;
                    jr3Var = new jr3(booleanValue, i9, constant2, constant, iky0Var == null ? j5a0.d(iky0Var.a, 0, 3) : null, a);
                }
            }
            constant = null;
            iky0 iky0Var2 = lz3Var.f;
            jr3Var = new jr3(booleanValue, i9, constant2, constant, iky0Var2 == null ? j5a0.d(iky0Var2.a, 0, 3) : null, a);
        } else {
            jr3Var = null;
        }
        boolean booleanValue2 = bool3 != null ? bool3.booleanValue() : mz3Var.a;
        Text.Constant i10 = g8e.i(Text.Companion, mz3Var.b);
        String str4 = mz3Var.c;
        Text.Constant constant3 = str4 != null ? new Text.Constant(str4) : null;
        fu3 a2 = a(j2b1.b((cn11) mz3Var.d.get(num != null ? num.intValue() : 0), AutoTopupInputType.AMOUNT), j04Var.b(), arrayList, txz0Var);
        fu3 a3 = a(j2b1.b((cn11) mz3Var.d.get(num != null ? num.intValue() : 0), AutoTopupInputType.THRESHOLD), j04Var.c(), arrayList, txz0Var);
        iky0 iky0Var3 = mz3Var.e;
        if (iky0Var3 != null) {
            z = false;
            rbvVar = j5a0.d(iky0Var3.a, 0, 3);
        } else {
            z = false;
            rbvVar = null;
        }
        fv3 fv3Var = new fv3(booleanValue2, i10, constant3, rbvVar, a2, a3);
        AutoTopupShowOnly autoTopupShowOnly = j04Var.b;
        return new u14(stz0Var, ahq0Var2, bVar2, z5, cv3Var2, j5x0Var, jr3Var, fv3Var, (autoTopupShowOnly == null || autoTopupShowOnly == AutoTopupShowOnly.AUTO_TOP_UP) ? true : z, (lz3Var == null || !(autoTopupShowOnly == null || autoTopupShowOnly == AutoTopupShowOnly.AUTO_FUND)) ? z : true);
    }
}
