package com.yandex.go.slot.mapper;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.slot.api.ui.SlotItemButtonUiState$Properties$Form;
import com.yandex.go.slot.api.ui.SlotItemButtonUiState$Properties$Style;
import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Alignment;
import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Ellipsize;
import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import com.yandex.go.slot.api.ui.SlotItemUiState$Trail$AccordionChevron$ChevronState;
import com.yandex.go.slot.dto.SlotButtonDto;
import com.yandex.go.slot.dto.SlotItemBodyDto;
import com.yandex.go.slot.dto.SlotItemBodyPropertiesDto;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.SlotItemLeadDto$Icon;
import com.yandex.go.slot.dto.SlotItemLeadDto$Image;
import com.yandex.go.slot.dto.SlotItemLeadDto$Payment;
import com.yandex.go.slot.dto.SlotItemLeadDto$Type;
import com.yandex.go.slot.dto.SlotItemLineDto;
import com.yandex.go.slot.dto.SlotItemSizeDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$AccordionTrailDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$ButtonDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$IconDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$IconSpotDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$NavTrailDto;
import com.yandex.go.slot.dto.i2;
import com.yandex.go.slot.dto.k2;
import com.yandex.go.slot.dto.v2;
import com.yandex.go.slot.dto.w2;
import com.yandex.go.slot.dto.x2;
import defpackage.ass0;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.bss0;
import defpackage.css0;
import defpackage.d9s;
import defpackage.ess0;
import defpackage.fef;
import defpackage.fss0;
import defpackage.g8e;
import defpackage.g92;
import defpackage.gss0;
import defpackage.hss0;
import defpackage.ih21;
import defpackage.irs0;
import defpackage.iss0;
import defpackage.jgv;
import defpackage.jrs0;
import defpackage.jss0;
import defpackage.jst;
import defpackage.kdc;
import defpackage.krs0;
import defpackage.kss0;
import defpackage.lss0;
import defpackage.mss0;
import defpackage.n7v;
import defpackage.nss0;
import defpackage.ny61;
import defpackage.ofv;
import defpackage.oss0;
import defpackage.oyr;
import defpackage.pkf;
import defpackage.pss0;
import defpackage.pwy0;
import defpackage.qss0;
import defpackage.rss0;
import defpackage.sqs0;
import defpackage.sss0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tss0;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.wqs0;
import defpackage.xby;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.xrs0;
import defpackage.xss0;
import defpackage.yrs0;
import defpackage.z3h0;
import defpackage.zrs0;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.common_models.net.z;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a implements irs0 {
    public final e a;
    public final jgv b;
    public final xdf c;
    public final pwy0 d;
    public final zuj0 e;

    public a(e eVar, jgv jgvVar, xdf xdfVar, pwy0 pwy0Var, zuj0 zuj0Var) {
        this.a = eVar;
        this.b = jgvVar;
        this.c = xdfVar;
        this.d = pwy0Var;
        this.e = zuj0Var;
    }

    public static int h(o oVar) {
        Integer num = 0;
        if (oVar instanceof FormattedText.h) {
            num = ((FormattedText.h) oVar).d;
        } else if (oVar instanceof FormattedText.g) {
            num = ((FormattedText.g) oVar).b.d;
        } else if (oVar instanceof FormattedText.a) {
            Iterator it = ((FormattedText.a) oVar).b.iterator();
            if (it.hasNext()) {
                num = Integer.valueOf(h((o) it.next()));
                while (it.hasNext()) {
                    Integer valueOf = Integer.valueOf(h((o) it.next()));
                    if (num.compareTo(valueOf) < 0) {
                        num = valueOf;
                    }
                }
            } else {
                num = null;
            }
        } else if (!(oVar instanceof ru.yandex.taxi.common_models.net.a) && !(oVar instanceof z)) {
            xby.t(jst.e, "SlotItemMapper", null, "Unexpected item type received during height resolution in FormattedText.Item", 6);
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static xrs0 l(Pair pair, Pair pair2) {
        return new xrs0(r((List) pair.f(), (SlotItemBodyPropertiesDto) pair.c()), r((List) pair2.f(), (SlotItemBodyPropertiesDto) pair2.c()));
    }

    public static SlotItemUiState$Body$Ellipsize m(jrs0 jrs0Var) {
        SlotItemLineDto.Ellipsis ellipsis = jrs0Var != null ? jrs0Var.e : null;
        int i = ellipsis == null ? -1 : krs0.g[ellipsis.ordinal()];
        if (i == -1) {
            return SlotItemUiState$Body$Ellipsize.NONE;
        }
        if (i == 1) {
            return SlotItemUiState$Body$Ellipsize.MIDDLE;
        }
        if (i == 2) {
            return SlotItemUiState$Body$Ellipsize.END;
        }
        w511.b();
        return null;
    }

    public static bss0 r(List list, SlotItemBodyPropertiesDto slotItemBodyPropertiesDto) {
        Pair pair;
        SlotItemUiState$Body$Alignment slotItemUiState$Body$Alignment;
        jrs0 jrs0Var = (jrs0) kotlin.collections.a.P(list);
        CharSequence charSequence = jrs0Var.a;
        kdc kdcVar = jrs0Var.b;
        SlotItemUiState$Body$Ellipsize m = m(jrs0Var);
        jrs0 jrs0Var2 = (jrs0) kotlin.collections.a.S(1, list);
        CharSequence charSequence2 = jrs0Var2 != null ? jrs0Var2.a : null;
        kdc kdcVar2 = jrs0Var2 != null ? jrs0Var2.b : null;
        SlotItemUiState$Body$Ellipsize m2 = m(jrs0Var2);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((jrs0) it.next()).d;
        }
        if (i > 3) {
            pair = new Pair(1, 2);
        } else {
            int i2 = jrs0Var.d;
            pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i - i2));
        }
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        int i3 = krs0.f[slotItemBodyPropertiesDto.a.ordinal()];
        if (i3 == 1) {
            slotItemUiState$Body$Alignment = SlotItemUiState$Body$Alignment.START;
        } else if (i3 == 2) {
            slotItemUiState$Body$Alignment = SlotItemUiState$Body$Alignment.CENTER;
        } else {
            if (i3 != 3) {
                w511.b();
                return null;
            }
            slotItemUiState$Body$Alignment = SlotItemUiState$Body$Alignment.END;
        }
        return new bss0(charSequence, kdcVar, jrs0Var.c, charSequence2, kdcVar2, jrs0Var2 != null ? jrs0Var2.c : null, new ass0(slotItemUiState$Body$Alignment, intValue, intValue2, m, m2));
    }

    public static String w(n7v n7vVar, SlotItemLeadDto$Type slotItemLeadDto$Type) {
        String str = n7vVar.c;
        if (str == null && (str = n7vVar.b) == null) {
            ih21 ih21Var = n7vVar.e;
            str = ih21Var != null ? ih21Var.b : null;
            if (str == null && (str = n7vVar.a) == null) {
                str = "";
            }
        }
        return g8e.p(slotItemLeadDto$Type.name(), "_", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(k2 k2Var, ContinuationImpl continuationImpl) {
        SlotItemMapperImpl$awaitLead$1 slotItemMapperImpl$awaitLead$1;
        int i;
        n7v a;
        String a2;
        k2 k2Var2;
        n7v n7vVar;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof SlotItemMapperImpl$awaitLead$1) {
            slotItemMapperImpl$awaitLead$1 = (SlotItemMapperImpl$awaitLead$1) continuationImpl;
            int i2 = slotItemMapperImpl$awaitLead$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slotItemMapperImpl$awaitLead$1.label = i2 - Integer.MIN_VALUE;
                SlotItemMapperImpl$awaitLead$1 slotItemMapperImpl$awaitLead$12 = slotItemMapperImpl$awaitLead$1;
                Object obj = slotItemMapperImpl$awaitLead$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slotItemMapperImpl$awaitLead$12.label;
                if (i != 0) {
                    b.b(obj);
                    if (k2Var != null && (a = k2Var.getA()) != null && (a2 = this.b.a(a)) != null) {
                        Pair g = g(k2Var);
                        int intValue = ((Number) g.getFirst()).intValue();
                        int intValue2 = ((Number) g.getSecond()).intValue();
                        slotItemMapperImpl$awaitLead$12.L$0 = k2Var;
                        slotItemMapperImpl$awaitLead$12.L$1 = a;
                        slotItemMapperImpl$awaitLead$12.L$2 = null;
                        slotItemMapperImpl$awaitLead$12.I$0 = intValue;
                        slotItemMapperImpl$awaitLead$12.I$1 = intValue2;
                        slotItemMapperImpl$awaitLead$12.label = 1;
                        Object j = this.a.j(a2, intValue, intValue2, ofv.a, slotItemMapperImpl$awaitLead$12);
                        if (j == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        k2Var2 = k2Var;
                        n7vVar = a;
                        obj = j;
                    }
                    return ess0.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n7vVar = (n7v) slotItemMapperImpl$awaitLead$12.L$1;
                k2Var2 = (k2) slotItemMapperImpl$awaitLead$12.L$0;
                b.b(obj);
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                    return new fss0(pkf.g(bitmapDrawable, w(n7vVar, k2Var2.b()), this.d.getThemeType()), true);
                }
                return ess0.a;
            }
        }
        slotItemMapperImpl$awaitLead$1 = new SlotItemMapperImpl$awaitLead$1(this, continuationImpl);
        SlotItemMapperImpl$awaitLead$1 slotItemMapperImpl$awaitLead$122 = slotItemMapperImpl$awaitLead$1;
        Object obj2 = slotItemMapperImpl$awaitLead$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slotItemMapperImpl$awaitLead$122.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable != null) {
        }
        return ess0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(SlotItemDto slotItemDto, sqs0 sqs0Var, boolean z, boolean z2, fef fefVar, ContinuationImpl continuationImpl) {
        SlotItemMapperImpl$awaitMapping$1 slotItemMapperImpl$awaitMapping$1;
        Object obj;
        int i;
        boolean z3;
        fef fefVar2;
        sqs0 sqs0Var2;
        boolean z4;
        SlotItemDto slotItemDto2;
        Object k;
        gss0 gss0Var;
        sqs0 sqs0Var3;
        SlotItemDto slotItemDto3;
        boolean z5;
        css0 css0Var;
        Object p;
        sqs0 sqs0Var4;
        gss0 gss0Var2;
        SlotItemDto slotItemDto4;
        if (continuationImpl instanceof SlotItemMapperImpl$awaitMapping$1) {
            slotItemMapperImpl$awaitMapping$1 = (SlotItemMapperImpl$awaitMapping$1) continuationImpl;
            int i2 = slotItemMapperImpl$awaitMapping$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slotItemMapperImpl$awaitMapping$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = slotItemMapperImpl$awaitMapping$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slotItemMapperImpl$awaitMapping$1.label;
                if (i != 0) {
                    b.b(obj2);
                    k2 k2Var = slotItemDto.c;
                    slotItemMapperImpl$awaitMapping$1.L$0 = slotItemDto;
                    slotItemMapperImpl$awaitMapping$1.L$1 = sqs0Var;
                    slotItemMapperImpl$awaitMapping$1.L$2 = fefVar;
                    slotItemMapperImpl$awaitMapping$1.Z$0 = z;
                    z3 = z2;
                    slotItemMapperImpl$awaitMapping$1.Z$1 = z3;
                    slotItemMapperImpl$awaitMapping$1.label = 1;
                    obj2 = d(k2Var, slotItemMapperImpl$awaitMapping$1);
                    if (obj2 != obj) {
                        fefVar2 = fefVar;
                        sqs0Var2 = sqs0Var;
                        z4 = z;
                        slotItemDto2 = slotItemDto;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        css0 css0Var2 = (css0) slotItemMapperImpl$awaitMapping$1.L$4;
                        gss0Var2 = (gss0) slotItemMapperImpl$awaitMapping$1.L$3;
                        sqs0Var4 = (sqs0) slotItemMapperImpl$awaitMapping$1.L$1;
                        slotItemDto4 = (SlotItemDto) slotItemMapperImpl$awaitMapping$1.L$0;
                        b.b(obj2);
                        p = obj2;
                        css0Var = css0Var2;
                        return new xss0(gss0Var2, css0Var, (tss0) p, sqs0Var4.a(slotItemDto4.a), o(slotItemDto4.b));
                    }
                    z5 = slotItemMapperImpl$awaitMapping$1.Z$1;
                    z4 = slotItemMapperImpl$awaitMapping$1.Z$0;
                    gss0Var = (gss0) slotItemMapperImpl$awaitMapping$1.L$3;
                    sqs0Var3 = (sqs0) slotItemMapperImpl$awaitMapping$1.L$1;
                    slotItemDto3 = (SlotItemDto) slotItemMapperImpl$awaitMapping$1.L$0;
                    b.b(obj2);
                    css0Var = (css0) obj2;
                    List list = slotItemDto3.e;
                    slotItemMapperImpl$awaitMapping$1.L$0 = slotItemDto3;
                    slotItemMapperImpl$awaitMapping$1.L$1 = sqs0Var3;
                    slotItemMapperImpl$awaitMapping$1.L$2 = null;
                    slotItemMapperImpl$awaitMapping$1.L$3 = gss0Var;
                    slotItemMapperImpl$awaitMapping$1.L$4 = css0Var;
                    slotItemMapperImpl$awaitMapping$1.Z$0 = z4;
                    slotItemMapperImpl$awaitMapping$1.Z$1 = z5;
                    slotItemMapperImpl$awaitMapping$1.label = 3;
                    sqs0 sqs0Var5 = sqs0Var3;
                    p = p(list, sqs0Var5, z4, z5, slotItemMapperImpl$awaitMapping$1);
                    sqs0Var4 = sqs0Var5;
                    if (p != obj) {
                        gss0Var2 = gss0Var;
                        slotItemDto4 = slotItemDto3;
                        return new xss0(gss0Var2, css0Var, (tss0) p, sqs0Var4.a(slotItemDto4.a), o(slotItemDto4.b));
                    }
                    return obj;
                }
                boolean z6 = slotItemMapperImpl$awaitMapping$1.Z$1;
                z4 = slotItemMapperImpl$awaitMapping$1.Z$0;
                fefVar2 = (fef) slotItemMapperImpl$awaitMapping$1.L$2;
                sqs0Var2 = (sqs0) slotItemMapperImpl$awaitMapping$1.L$1;
                slotItemDto2 = (SlotItemDto) slotItemMapperImpl$awaitMapping$1.L$0;
                b.b(obj2);
                z3 = z6;
                gss0 gss0Var3 = (gss0) obj2;
                List list2 = slotItemDto2.d;
                slotItemMapperImpl$awaitMapping$1.L$0 = slotItemDto2;
                slotItemMapperImpl$awaitMapping$1.L$1 = sqs0Var2;
                slotItemMapperImpl$awaitMapping$1.L$2 = null;
                slotItemMapperImpl$awaitMapping$1.L$3 = gss0Var3;
                slotItemMapperImpl$awaitMapping$1.Z$0 = z4;
                slotItemMapperImpl$awaitMapping$1.Z$1 = z3;
                slotItemMapperImpl$awaitMapping$1.label = 2;
                k = k(list2, fefVar2, slotItemMapperImpl$awaitMapping$1);
                if (k != obj) {
                    gss0Var = gss0Var3;
                    sqs0Var3 = sqs0Var2;
                    slotItemDto3 = slotItemDto2;
                    obj2 = k;
                    z5 = z3;
                    css0Var = (css0) obj2;
                    List list3 = slotItemDto3.e;
                    slotItemMapperImpl$awaitMapping$1.L$0 = slotItemDto3;
                    slotItemMapperImpl$awaitMapping$1.L$1 = sqs0Var3;
                    slotItemMapperImpl$awaitMapping$1.L$2 = null;
                    slotItemMapperImpl$awaitMapping$1.L$3 = gss0Var;
                    slotItemMapperImpl$awaitMapping$1.L$4 = css0Var;
                    slotItemMapperImpl$awaitMapping$1.Z$0 = z4;
                    slotItemMapperImpl$awaitMapping$1.Z$1 = z5;
                    slotItemMapperImpl$awaitMapping$1.label = 3;
                    sqs0 sqs0Var52 = sqs0Var3;
                    p = p(list3, sqs0Var52, z4, z5, slotItemMapperImpl$awaitMapping$1);
                    sqs0Var4 = sqs0Var52;
                    if (p != obj) {
                    }
                }
                return obj;
            }
        }
        slotItemMapperImpl$awaitMapping$1 = new SlotItemMapperImpl$awaitMapping$1(this, continuationImpl);
        Object obj22 = slotItemMapperImpl$awaitMapping$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slotItemMapperImpl$awaitMapping$1.label;
        if (i != 0) {
        }
        gss0 gss0Var32 = (gss0) obj22;
        List list22 = slotItemDto2.d;
        slotItemMapperImpl$awaitMapping$1.L$0 = slotItemDto2;
        slotItemMapperImpl$awaitMapping$1.L$1 = sqs0Var2;
        slotItemMapperImpl$awaitMapping$1.L$2 = null;
        slotItemMapperImpl$awaitMapping$1.L$3 = gss0Var32;
        slotItemMapperImpl$awaitMapping$1.Z$0 = z4;
        slotItemMapperImpl$awaitMapping$1.Z$1 = z3;
        slotItemMapperImpl$awaitMapping$1.label = 2;
        k = k(list22, fefVar2, slotItemMapperImpl$awaitMapping$1);
        if (k != obj) {
        }
        return obj;
    }

    public final UiStateDrawableWrapper f() {
        return pkf.g(vng.t(z3h0.ic_slot_lead_loading_rounded, ((avj0) this.e).a), "ic_loading_rounded", this.d.getThemeType());
    }

    public final Pair g(k2 k2Var) {
        Pair pair;
        if (k2Var instanceof SlotItemLeadDto$Icon) {
            pair = new Pair(24, 24);
        } else if (k2Var instanceof SlotItemLeadDto$Image) {
            pair = new Pair(40, 40);
        } else if (k2Var instanceof SlotItemLeadDto$Payment) {
            pair = new Pair(36, 24);
        } else {
            if (!(k2Var instanceof i2)) {
                w511.b();
                return null;
            }
            pair = new Pair(0, 0);
        }
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        zuj0 zuj0Var = this.e;
        return new Pair(Integer.valueOf(tje.u(intValue, ((avj0) zuj0Var).a)), Integer.valueOf(tje.u(intValue2, ((avj0) zuj0Var).a)));
    }

    public final tpr i(k2 k2Var) {
        n7v a;
        int i = 2;
        ess0 ess0Var = ess0.a;
        if (k2Var == null || (a = k2Var.getA()) == null) {
            return new g92(i, ess0Var);
        }
        String a2 = this.b.a(a);
        if (a2 == null || a2.length() == 0) {
            return new g92(i, ess0Var);
        }
        Pair g = g(k2Var);
        return kotlinx.coroutines.flow.e.I(this.a.l(a2, ((Number) g.getFirst()).intValue(), ((Number) g.getSecond()).intValue(), ofv.a), new SlotItemMapperImpl$leadFlow$1(this, a, k2Var, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(k2 k2Var, ContinuationImpl continuationImpl) {
        SlotItemMapperImpl$leadFromCacheOrEmpty$1 slotItemMapperImpl$leadFromCacheOrEmpty$1;
        int i;
        n7v a;
        String a2;
        k2 k2Var2;
        n7v n7vVar;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof SlotItemMapperImpl$leadFromCacheOrEmpty$1) {
            slotItemMapperImpl$leadFromCacheOrEmpty$1 = (SlotItemMapperImpl$leadFromCacheOrEmpty$1) continuationImpl;
            int i2 = slotItemMapperImpl$leadFromCacheOrEmpty$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slotItemMapperImpl$leadFromCacheOrEmpty$1.label = i2 - Integer.MIN_VALUE;
                SlotItemMapperImpl$leadFromCacheOrEmpty$1 slotItemMapperImpl$leadFromCacheOrEmpty$12 = slotItemMapperImpl$leadFromCacheOrEmpty$1;
                Object obj = slotItemMapperImpl$leadFromCacheOrEmpty$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slotItemMapperImpl$leadFromCacheOrEmpty$12.label;
                if (i != 0) {
                    b.b(obj);
                    if (k2Var != null && (a = k2Var.getA()) != null && (a2 = this.b.a(a)) != null) {
                        Pair g = g(k2Var);
                        int intValue = ((Number) g.getFirst()).intValue();
                        int intValue2 = ((Number) g.getSecond()).intValue();
                        slotItemMapperImpl$leadFromCacheOrEmpty$12.L$0 = k2Var;
                        slotItemMapperImpl$leadFromCacheOrEmpty$12.L$1 = a;
                        slotItemMapperImpl$leadFromCacheOrEmpty$12.L$2 = null;
                        slotItemMapperImpl$leadFromCacheOrEmpty$12.I$0 = intValue;
                        slotItemMapperImpl$leadFromCacheOrEmpty$12.I$1 = intValue2;
                        slotItemMapperImpl$leadFromCacheOrEmpty$12.label = 1;
                        Object n = this.a.n(a2, intValue, intValue2, ofv.a, slotItemMapperImpl$leadFromCacheOrEmpty$12);
                        if (n == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        k2Var2 = k2Var;
                        n7vVar = a;
                        obj = n;
                    }
                    return ess0.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n7vVar = (n7v) slotItemMapperImpl$leadFromCacheOrEmpty$12.L$1;
                k2Var2 = (k2) slotItemMapperImpl$leadFromCacheOrEmpty$12.L$0;
                b.b(obj);
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                    return new fss0(pkf.g(bitmapDrawable, w(n7vVar, k2Var2.b()), this.d.getThemeType()), false);
                }
                return ess0.a;
            }
        }
        slotItemMapperImpl$leadFromCacheOrEmpty$1 = new SlotItemMapperImpl$leadFromCacheOrEmpty$1(this, continuationImpl);
        SlotItemMapperImpl$leadFromCacheOrEmpty$1 slotItemMapperImpl$leadFromCacheOrEmpty$122 = slotItemMapperImpl$leadFromCacheOrEmpty$1;
        Object obj2 = slotItemMapperImpl$leadFromCacheOrEmpty$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slotItemMapperImpl$leadFromCacheOrEmpty$122.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable != null) {
        }
        return ess0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r16v0, types: [jrs0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ed -> B:14:0x01ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x017a -> B:10:0x0180). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c3 -> B:17:0x00dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(List list, fef fefVar, ContinuationImpl continuationImpl) {
        SlotItemMapperImpl$mapBody$1 slotItemMapperImpl$mapBody$1;
        int i;
        Integer num;
        Iterator it;
        SlotItemMapperImpl$mapBody$1 slotItemMapperImpl$mapBody$12;
        ArrayList arrayList;
        fef fefVar2;
        Integer num2;
        Integer num3;
        if (continuationImpl instanceof SlotItemMapperImpl$mapBody$1) {
            slotItemMapperImpl$mapBody$1 = (SlotItemMapperImpl$mapBody$1) continuationImpl;
            int i2 = slotItemMapperImpl$mapBody$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slotItemMapperImpl$mapBody$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slotItemMapperImpl$mapBody$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slotItemMapperImpl$mapBody$1.label;
                e eVar = this.a;
                if (i != 0) {
                    num = null;
                    b.b(obj);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (!((SlotItemBodyDto) obj2).a.isEmpty()) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    it = arrayList2.iterator();
                    slotItemMapperImpl$mapBody$12 = slotItemMapperImpl$mapBody$1;
                    arrayList = arrayList3;
                    fefVar2 = fefVar;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection = (Collection) slotItemMapperImpl$mapBody$1.L$19;
                    Integer num4 = (Integer) slotItemMapperImpl$mapBody$1.L$18;
                    FormattedText c = (FormattedText) slotItemMapperImpl$mapBody$1.L$16;
                    SlotItemLineDto slotItemLineDto = (SlotItemLineDto) slotItemMapperImpl$mapBody$1.L$15;
                    Iterator it2 = (Iterator) slotItemMapperImpl$mapBody$1.L$12;
                    Collection collection2 = (Collection) slotItemMapperImpl$mapBody$1.L$10;
                    SlotItemBodyDto slotItemBodyDto = (SlotItemBodyDto) slotItemMapperImpl$mapBody$1.L$7;
                    Iterator it3 = (Iterator) slotItemMapperImpl$mapBody$1.L$5;
                    ?? r15 = (Collection) slotItemMapperImpl$mapBody$1.L$4;
                    fef fefVar3 = (fef) slotItemMapperImpl$mapBody$1.L$1;
                    b.b(obj);
                    ArrayList arrayList4 = r15;
                    SlotItemMapperImpl$mapBody$1 slotItemMapperImpl$mapBody$13 = slotItemMapperImpl$mapBody$1;
                    fefVar2 = fefVar3;
                    Iterator it4 = it3;
                    arrayList = arrayList4;
                    Integer num5 = new jrs0((CharSequence) obj, eVar.v(c.b()), num4 == null ? new Integer((int) tje.w(num4.intValue(), ((avj0) this.e).a)) : null, slotItemLineDto.b, slotItemLineDto.a);
                    if (num5 != null) {
                        collection2.add(num5);
                    }
                    num = null;
                    if (it2.hasNext()) {
                        collection.add(new Pair(slotItemBodyDto.b, (List) collection2));
                        slotItemMapperImpl$mapBody$12 = slotItemMapperImpl$mapBody$13;
                        it = it4;
                        num = null;
                        if (it.hasNext()) {
                            ArrayList arrayList5 = arrayList;
                            int size = arrayList5.size();
                            if (size == 0) {
                                return yrs0.a;
                            }
                            if (size == 1) {
                                Pair pair = (Pair) kotlin.collections.a.P(arrayList5);
                                return new zrs0(r((List) pair.getSecond(), (SlotItemBodyPropertiesDto) pair.getFirst()));
                            }
                            if (size == 2) {
                                Pair pair2 = (Pair) arrayList5.get(0);
                                SlotItemBodyPropertiesDto slotItemBodyPropertiesDto = (SlotItemBodyPropertiesDto) pair2.getFirst();
                                List list2 = (List) pair2.getSecond();
                                Pair pair3 = (Pair) arrayList5.get(1);
                                return l(new Pair(slotItemBodyPropertiesDto, list2), new Pair((SlotItemBodyPropertiesDto) pair3.getFirst(), (List) pair3.getSecond()));
                            }
                            xby.t(jst.e, "SlotItemMapper", null, oyr.j(arrayList5.size(), "Unexpected body size received, got ", ", max: 2"), 6);
                            Pair pair4 = (Pair) arrayList5.get(0);
                            SlotItemBodyPropertiesDto slotItemBodyPropertiesDto2 = (SlotItemBodyPropertiesDto) pair4.getFirst();
                            List list3 = (List) pair4.getSecond();
                            Pair pair5 = (Pair) arrayList5.get(1);
                            return l(new Pair(slotItemBodyPropertiesDto2, list3), new Pair((SlotItemBodyPropertiesDto) pair5.getFirst(), (List) pair5.getSecond()));
                        }
                        SlotItemBodyDto slotItemBodyDto2 = (SlotItemBodyDto) it.next();
                        List list4 = slotItemBodyDto2.a;
                        ArrayList arrayList6 = new ArrayList();
                        slotItemBodyDto = slotItemBodyDto2;
                        it2 = list4.iterator();
                        collection2 = arrayList6;
                        it4 = it;
                        slotItemMapperImpl$mapBody$13 = slotItemMapperImpl$mapBody$12;
                        collection = arrayList;
                        if (it2.hasNext()) {
                            slotItemLineDto = (SlotItemLineDto) it2.next();
                            FormattedText formattedText = slotItemLineDto.c;
                            if (formattedText == null) {
                                num5 = num;
                                if (num5 != null) {
                                }
                                num = null;
                                if (it2.hasNext()) {
                                }
                            } else {
                                c = d9s.c(formattedText, this.c, fefVar2, true);
                                Iterator it5 = c.a.iterator();
                                if (it5.hasNext()) {
                                    num2 = new Integer(h((o) it5.next()));
                                    while (it5.hasNext()) {
                                        Iterator it6 = it5;
                                        Integer num6 = new Integer(h((o) it5.next()));
                                        if (num2.compareTo(num6) < 0) {
                                            num2 = num6;
                                        }
                                        it5 = it6;
                                    }
                                } else {
                                    num2 = num;
                                }
                                if (num2 == null || num2.intValue() <= 0) {
                                    num4 = num;
                                    num3 = num4;
                                } else {
                                    num3 = num;
                                    num4 = num2;
                                }
                                slotItemMapperImpl$mapBody$13.L$0 = num3;
                                slotItemMapperImpl$mapBody$13.L$1 = fefVar2;
                                slotItemMapperImpl$mapBody$13.L$2 = num3;
                                slotItemMapperImpl$mapBody$13.L$3 = num3;
                                slotItemMapperImpl$mapBody$13.L$4 = arrayList;
                                slotItemMapperImpl$mapBody$13.L$5 = it4;
                                slotItemMapperImpl$mapBody$13.L$6 = num3;
                                slotItemMapperImpl$mapBody$13.L$7 = slotItemBodyDto;
                                slotItemMapperImpl$mapBody$13.L$8 = num3;
                                slotItemMapperImpl$mapBody$13.L$9 = num3;
                                slotItemMapperImpl$mapBody$13.L$10 = collection2;
                                slotItemMapperImpl$mapBody$13.L$11 = num3;
                                slotItemMapperImpl$mapBody$13.L$12 = it2;
                                slotItemMapperImpl$mapBody$13.L$13 = num3;
                                slotItemMapperImpl$mapBody$13.L$14 = num3;
                                slotItemMapperImpl$mapBody$13.L$15 = slotItemLineDto;
                                slotItemMapperImpl$mapBody$13.L$16 = c;
                                slotItemMapperImpl$mapBody$13.L$17 = num3;
                                slotItemMapperImpl$mapBody$13.L$18 = num4;
                                slotItemMapperImpl$mapBody$13.L$19 = collection;
                                slotItemMapperImpl$mapBody$13.label = 1;
                                Object t = eVar.t(c, slotItemMapperImpl$mapBody$13);
                                if (t == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                Iterator it7 = it4;
                                fefVar3 = fefVar2;
                                obj = t;
                                it3 = it7;
                                arrayList4 = arrayList;
                                slotItemMapperImpl$mapBody$1 = slotItemMapperImpl$mapBody$13;
                                SlotItemMapperImpl$mapBody$1 slotItemMapperImpl$mapBody$132 = slotItemMapperImpl$mapBody$1;
                                fefVar2 = fefVar3;
                                Iterator it42 = it3;
                                arrayList = arrayList4;
                                Integer num52 = new jrs0((CharSequence) obj, eVar.v(c.b()), num4 == null ? new Integer((int) tje.w(num4.intValue(), ((avj0) this.e).a)) : null, slotItemLineDto.b, slotItemLineDto.a);
                                if (num52 != null) {
                                }
                                num = null;
                                if (it2.hasNext()) {
                                }
                            }
                        }
                    }
                }
            }
        }
        slotItemMapperImpl$mapBody$1 = new SlotItemMapperImpl$mapBody$1(this, continuationImpl);
        Object obj3 = slotItemMapperImpl$mapBody$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slotItemMapperImpl$mapBody$1.label;
        e eVar2 = this.a;
        if (i != 0) {
        }
    }

    public final wqs0 n(SlotButtonDto.Properties properties) {
        SlotItemButtonUiState$Properties$Form slotItemButtonUiState$Properties$Form;
        if (properties == null) {
            return new wqs0(SlotItemButtonUiState$Properties$Form.SQUIRCLE, SlotItemButtonUiState$Properties$Style.MINOR);
        }
        int i = krs0.c[properties.c.ordinal()];
        if (i == 1) {
            slotItemButtonUiState$Properties$Form = SlotItemButtonUiState$Properties$Form.SQUIRCLE;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            slotItemButtonUiState$Properties$Form = SlotItemButtonUiState$Properties$Form.CIRCLE;
        }
        if (krs0.d[properties.b.ordinal()] == 1) {
            return new wqs0(slotItemButtonUiState$Properties$Form, SlotItemButtonUiState$Properties$Style.MINOR);
        }
        w511.b();
        return null;
    }

    public final SlotItemUiState$Size o(SlotItemSizeDto slotItemSizeDto) {
        int i = slotItemSizeDto == null ? -1 : krs0.a[slotItemSizeDto.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? SlotItemUiState$Size.L : SlotItemUiState$Size.L : SlotItemUiState$Size.M : SlotItemUiState$Size.S : SlotItemUiState$Size.XS;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(List list, sqs0 sqs0Var, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        SlotItemMapperImpl$mapTrail$1 slotItemMapperImpl$mapTrail$1;
        int i;
        lss0 lss0Var;
        sqs0 sqs0Var2;
        lss0 lss0Var2;
        x2 x2Var;
        if (continuationImpl instanceof SlotItemMapperImpl$mapTrail$1) {
            slotItemMapperImpl$mapTrail$1 = (SlotItemMapperImpl$mapTrail$1) continuationImpl;
            int i2 = slotItemMapperImpl$mapTrail$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slotItemMapperImpl$mapTrail$1.label = i2 - Integer.MIN_VALUE;
                SlotItemMapperImpl$mapTrail$1 slotItemMapperImpl$mapTrail$12 = slotItemMapperImpl$mapTrail$1;
                Object obj = slotItemMapperImpl$mapTrail$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slotItemMapperImpl$mapTrail$12.label;
                if (i != 0) {
                    b.b(obj);
                    boolean isEmpty = list.isEmpty();
                    tss0 tss0Var = rss0.a;
                    if (!isEmpty) {
                        x2 x2Var2 = (x2) kotlin.collections.a.P(list);
                        if (!(x2Var2 instanceof w2)) {
                            boolean z3 = x2Var2 instanceof SlotItemTrailDto$NavTrailDto;
                            e eVar = this.a;
                            if (z3) {
                                kdc v = eVar.v(((SlotItemTrailDto$NavTrailDto) x2Var2).a);
                                if (v == null) {
                                    v = new bdc(xng0.textMain);
                                }
                                return new qss0(v);
                            }
                            if (x2Var2 instanceof SlotItemTrailDto$AccordionTrailDto) {
                                kdc v2 = eVar.v(((SlotItemTrailDto$AccordionTrailDto) x2Var2).a);
                                if (v2 == null) {
                                    v2 = new bdc(xng0.textMain);
                                }
                                return new hss0(v2, SlotItemUiState$Trail$AccordionChevron$ChevronState.DOWN);
                            }
                            if (x2Var2 instanceof SlotItemTrailDto$ButtonDto) {
                                SlotItemTrailDto$ButtonDto slotItemTrailDto$ButtonDto = (SlotItemTrailDto$ButtonDto) x2Var2;
                                int i3 = krs0.e[slotItemTrailDto$ButtonDto.b.ordinal()];
                                if (i3 == 1) {
                                    lss0Var = jss0.a;
                                } else if (i3 == 2) {
                                    lss0Var = kss0.a;
                                } else {
                                    if (i3 != 3) {
                                        w511.b();
                                        return null;
                                    }
                                    lss0Var = iss0.a;
                                }
                                FormattedText formattedText = slotItemTrailDto$ButtonDto.a;
                                slotItemMapperImpl$mapTrail$12.L$0 = null;
                                sqs0Var2 = sqs0Var;
                                slotItemMapperImpl$mapTrail$12.L$1 = sqs0Var2;
                                slotItemMapperImpl$mapTrail$12.L$2 = x2Var2;
                                slotItemMapperImpl$mapTrail$12.L$3 = lss0Var;
                                slotItemMapperImpl$mapTrail$12.Z$0 = z;
                                slotItemMapperImpl$mapTrail$12.Z$1 = z2;
                                slotItemMapperImpl$mapTrail$12.label = 1;
                                Object t = eVar.t(formattedText, slotItemMapperImpl$mapTrail$12);
                                if (t != obj2) {
                                    lss0 lss0Var3 = lss0Var;
                                    obj = t;
                                    lss0Var2 = lss0Var3;
                                    x2Var = x2Var2;
                                }
                            } else {
                                if (x2Var2 instanceof v2) {
                                    return new sss0(z, z2);
                                }
                                if (x2Var2 instanceof SlotItemTrailDto$IconSpotDto) {
                                    slotItemMapperImpl$mapTrail$12.L$0 = null;
                                    slotItemMapperImpl$mapTrail$12.L$1 = null;
                                    slotItemMapperImpl$mapTrail$12.L$2 = null;
                                    slotItemMapperImpl$mapTrail$12.Z$0 = z;
                                    slotItemMapperImpl$mapTrail$12.Z$1 = z2;
                                    slotItemMapperImpl$mapTrail$12.label = 2;
                                    Object v3 = v((SlotItemTrailDto$IconSpotDto) x2Var2, true, tss0Var, new SlotItemMapperImpl$trailIconSpotFromServerOrEmpty$2(2, this.a, e.class, "iconByUrl", "iconByUrl(Ljava/lang/String;IILcom/yandex/go/image/api/domain/models/ImageTransform;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), slotItemMapperImpl$mapTrail$12);
                                    if (v3 != obj2) {
                                        return v3;
                                    }
                                } else {
                                    if (!(x2Var2 instanceof SlotItemTrailDto$IconDto)) {
                                        w511.b();
                                        return null;
                                    }
                                    slotItemMapperImpl$mapTrail$12.L$0 = null;
                                    slotItemMapperImpl$mapTrail$12.L$1 = null;
                                    slotItemMapperImpl$mapTrail$12.L$2 = null;
                                    slotItemMapperImpl$mapTrail$12.Z$0 = z;
                                    slotItemMapperImpl$mapTrail$12.Z$1 = z2;
                                    slotItemMapperImpl$mapTrail$12.label = 3;
                                    Object t2 = t((SlotItemTrailDto$IconDto) x2Var2, sqs0Var, tss0Var, new SlotItemMapperImpl$trailIconFromServerOrEmpty$2(2, this.a, e.class, "iconByUrl", "iconByUrl(Ljava/lang/String;IILcom/yandex/go/image/api/domain/models/ImageTransform;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), slotItemMapperImpl$mapTrail$12);
                                    if (t2 != obj2) {
                                        return t2;
                                    }
                                }
                            }
                            return obj2;
                        }
                    }
                    return tss0Var;
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                lss0Var2 = (lss0) slotItemMapperImpl$mapTrail$12.L$3;
                x2Var = (x2) slotItemMapperImpl$mapTrail$12.L$2;
                sqs0 sqs0Var3 = (sqs0) slotItemMapperImpl$mapTrail$12.L$1;
                b.b(obj);
                sqs0Var2 = sqs0Var3;
                return new mss0((CharSequence) obj, lss0Var2, sqs0Var2.a(((SlotItemTrailDto$ButtonDto) x2Var).c));
            }
        }
        slotItemMapperImpl$mapTrail$1 = new SlotItemMapperImpl$mapTrail$1(this, continuationImpl);
        SlotItemMapperImpl$mapTrail$1 slotItemMapperImpl$mapTrail$122 = slotItemMapperImpl$mapTrail$1;
        Object obj3 = slotItemMapperImpl$mapTrail$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slotItemMapperImpl$mapTrail$122.label;
        if (i != 0) {
        }
        return new mss0((CharSequence) obj3, lss0Var2, sqs0Var2.a(((SlotItemTrailDto$ButtonDto) x2Var).c));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(SlotItemDto slotItemDto, sqs0 sqs0Var, ContinuationImpl continuationImpl) {
        SlotItemMapperImpl$mapWithLoadableImage$1 slotItemMapperImpl$mapWithLoadableImage$1;
        Object obj;
        int i;
        gss0 gss0Var;
        sqs0 sqs0Var2;
        SlotItemDto slotItemDto2;
        Object obj2;
        boolean z;
        Object b;
        sqs0 sqs0Var3;
        gss0 gss0Var2;
        SlotItemDto slotItemDto3;
        css0 css0Var;
        if (continuationImpl instanceof SlotItemMapperImpl$mapWithLoadableImage$1) {
            slotItemMapperImpl$mapWithLoadableImage$1 = (SlotItemMapperImpl$mapWithLoadableImage$1) continuationImpl;
            int i2 = slotItemMapperImpl$mapWithLoadableImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slotItemMapperImpl$mapWithLoadableImage$1.label = i2 - Integer.MIN_VALUE;
                SlotItemMapperImpl$mapWithLoadableImage$1 slotItemMapperImpl$mapWithLoadableImage$12 = slotItemMapperImpl$mapWithLoadableImage$1;
                Object obj3 = slotItemMapperImpl$mapWithLoadableImage$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slotItemMapperImpl$mapWithLoadableImage$12.label;
                if (i != 0) {
                    b.b(obj3);
                    gss0 a = irs0.a(this, slotItemDto.c, f(), 2);
                    List list = slotItemDto.d;
                    slotItemMapperImpl$mapWithLoadableImage$12.L$0 = slotItemDto;
                    slotItemMapperImpl$mapWithLoadableImage$12.L$1 = sqs0Var;
                    slotItemMapperImpl$mapWithLoadableImage$12.L$2 = null;
                    slotItemMapperImpl$mapWithLoadableImage$12.L$3 = a;
                    slotItemMapperImpl$mapWithLoadableImage$12.Z$0 = false;
                    slotItemMapperImpl$mapWithLoadableImage$12.label = 1;
                    Object k = k(list, null, slotItemMapperImpl$mapWithLoadableImage$12);
                    if (k != obj) {
                        gss0Var = a;
                        sqs0Var2 = sqs0Var;
                        slotItemDto2 = slotItemDto;
                        obj2 = k;
                        z = false;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    css0 css0Var2 = (css0) slotItemMapperImpl$mapWithLoadableImage$12.L$4;
                    gss0 gss0Var3 = (gss0) slotItemMapperImpl$mapWithLoadableImage$12.L$3;
                    sqs0Var3 = (sqs0) slotItemMapperImpl$mapWithLoadableImage$12.L$1;
                    slotItemDto3 = (SlotItemDto) slotItemMapperImpl$mapWithLoadableImage$12.L$0;
                    b.b(obj3);
                    css0Var = css0Var2;
                    gss0Var2 = gss0Var3;
                    return new xss0(gss0Var2, css0Var, (tss0) obj3, sqs0Var3.a(slotItemDto3.a), o(slotItemDto3.b));
                }
                boolean z2 = slotItemMapperImpl$mapWithLoadableImage$12.Z$0;
                gss0 gss0Var4 = (gss0) slotItemMapperImpl$mapWithLoadableImage$12.L$3;
                sqs0 sqs0Var4 = (sqs0) slotItemMapperImpl$mapWithLoadableImage$12.L$1;
                slotItemDto2 = (SlotItemDto) slotItemMapperImpl$mapWithLoadableImage$12.L$0;
                b.b(obj3);
                z = z2;
                obj2 = obj3;
                sqs0Var2 = sqs0Var4;
                gss0Var = gss0Var4;
                css0 css0Var3 = (css0) obj2;
                List list2 = slotItemDto2.e;
                slotItemMapperImpl$mapWithLoadableImage$12.L$0 = slotItemDto2;
                slotItemMapperImpl$mapWithLoadableImage$12.L$1 = sqs0Var2;
                slotItemMapperImpl$mapWithLoadableImage$12.L$2 = null;
                slotItemMapperImpl$mapWithLoadableImage$12.L$3 = gss0Var;
                slotItemMapperImpl$mapWithLoadableImage$12.L$4 = css0Var3;
                slotItemMapperImpl$mapWithLoadableImage$12.Z$0 = z;
                slotItemMapperImpl$mapWithLoadableImage$12.label = 2;
                b = irs0.b(this, list2, sqs0Var2, z, slotItemMapperImpl$mapWithLoadableImage$12, 8);
                if (b != obj) {
                    sqs0Var3 = sqs0Var2;
                    gss0Var2 = gss0Var;
                    slotItemDto3 = slotItemDto2;
                    css0Var = css0Var3;
                    obj3 = b;
                    return new xss0(gss0Var2, css0Var, (tss0) obj3, sqs0Var3.a(slotItemDto3.a), o(slotItemDto3.b));
                }
                return obj;
            }
        }
        slotItemMapperImpl$mapWithLoadableImage$1 = new SlotItemMapperImpl$mapWithLoadableImage$1(this, continuationImpl);
        SlotItemMapperImpl$mapWithLoadableImage$1 slotItemMapperImpl$mapWithLoadableImage$122 = slotItemMapperImpl$mapWithLoadableImage$1;
        Object obj32 = slotItemMapperImpl$mapWithLoadableImage$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slotItemMapperImpl$mapWithLoadableImage$122.label;
        if (i != 0) {
        }
        css0 css0Var32 = (css0) obj2;
        List list22 = slotItemDto2.e;
        slotItemMapperImpl$mapWithLoadableImage$122.L$0 = slotItemDto2;
        slotItemMapperImpl$mapWithLoadableImage$122.L$1 = sqs0Var2;
        slotItemMapperImpl$mapWithLoadableImage$122.L$2 = null;
        slotItemMapperImpl$mapWithLoadableImage$122.L$3 = gss0Var;
        slotItemMapperImpl$mapWithLoadableImage$122.L$4 = css0Var32;
        slotItemMapperImpl$mapWithLoadableImage$122.Z$0 = z;
        slotItemMapperImpl$mapWithLoadableImage$122.label = 2;
        b = irs0.b(this, list22, sqs0Var2, z, slotItemMapperImpl$mapWithLoadableImage$122, 8);
        if (b != obj) {
        }
        return obj;
    }

    public final Object s(SlotItemTrailDto$IconDto slotItemTrailDto$IconDto, sqs0 sqs0Var, Continuation continuation) {
        return t(slotItemTrailDto$IconDto, sqs0Var, pss0.a, new SlotItemMapperImpl$trailIconFromCacheOrLoading$2(2, this.a, e.class, "iconByUrlFromCache", "iconByUrlFromCache(Ljava/lang/String;IILcom/yandex/go/image/api/domain/models/ImageTransform;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(SlotItemTrailDto$IconDto slotItemTrailDto$IconDto, sqs0 sqs0Var, tss0 tss0Var, wls wlsVar, ContinuationImpl continuationImpl) {
        SlotItemMapperImpl$trailIconOrFallback$1 slotItemMapperImpl$trailIconOrFallback$1;
        int i;
        n7v n7vVar;
        String a;
        sqs0 sqs0Var2;
        n7v n7vVar2;
        SlotItemTrailDto$IconDto slotItemTrailDto$IconDto2;
        String str;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof SlotItemMapperImpl$trailIconOrFallback$1) {
            slotItemMapperImpl$trailIconOrFallback$1 = (SlotItemMapperImpl$trailIconOrFallback$1) continuationImpl;
            int i2 = slotItemMapperImpl$trailIconOrFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slotItemMapperImpl$trailIconOrFallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slotItemMapperImpl$trailIconOrFallback$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slotItemMapperImpl$trailIconOrFallback$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (slotItemTrailDto$IconDto == null || (n7vVar = slotItemTrailDto$IconDto.a) == null || (a = this.b.a(n7vVar)) == null) {
                        return rss0.a;
                    }
                    slotItemMapperImpl$trailIconOrFallback$1.L$0 = slotItemTrailDto$IconDto;
                    slotItemMapperImpl$trailIconOrFallback$1.L$1 = sqs0Var;
                    slotItemMapperImpl$trailIconOrFallback$1.L$2 = tss0Var;
                    slotItemMapperImpl$trailIconOrFallback$1.L$3 = null;
                    slotItemMapperImpl$trailIconOrFallback$1.L$4 = n7vVar;
                    slotItemMapperImpl$trailIconOrFallback$1.L$5 = a;
                    slotItemMapperImpl$trailIconOrFallback$1.label = 1;
                    Object invoke = wlsVar.invoke(a, slotItemMapperImpl$trailIconOrFallback$1);
                    if (invoke == obj2) {
                        return obj2;
                    }
                    sqs0Var2 = sqs0Var;
                    n7vVar2 = n7vVar;
                    obj = invoke;
                    slotItemTrailDto$IconDto2 = slotItemTrailDto$IconDto;
                    str = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) slotItemMapperImpl$trailIconOrFallback$1.L$5;
                    n7vVar2 = (n7v) slotItemMapperImpl$trailIconOrFallback$1.L$4;
                    tss0Var = (tss0) slotItemMapperImpl$trailIconOrFallback$1.L$2;
                    sqs0Var2 = (sqs0) slotItemMapperImpl$trailIconOrFallback$1.L$1;
                    slotItemTrailDto$IconDto2 = (SlotItemTrailDto$IconDto) slotItemMapperImpl$trailIconOrFallback$1.L$0;
                    b.b(obj);
                }
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                    return tss0Var;
                }
                String str2 = n7vVar2.c;
                if (str2 == null && (str2 = n7vVar2.b) == null) {
                    ih21 ih21Var = n7vVar2.e;
                    String str3 = ih21Var != null ? ih21Var.b : null;
                    if (str3 != null) {
                        str = str3;
                    }
                } else {
                    str = str2;
                }
                return new nss0(pkf.g(bitmapDrawable, str, this.d.getThemeType()), slotItemTrailDto$IconDto2.b, sqs0Var2.a(slotItemTrailDto$IconDto2.c));
            }
        }
        slotItemMapperImpl$trailIconOrFallback$1 = new SlotItemMapperImpl$trailIconOrFallback$1(this, continuationImpl);
        Object obj3 = slotItemMapperImpl$trailIconOrFallback$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slotItemMapperImpl$trailIconOrFallback$1.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj3;
        if (bitmapDrawable != null) {
        }
    }

    public final Object u(SlotItemTrailDto$IconSpotDto slotItemTrailDto$IconSpotDto, ContinuationImpl continuationImpl) {
        return v(slotItemTrailDto$IconSpotDto, false, pss0.a, new SlotItemMapperImpl$trailIconSpotFromCacheOrLoading$2(2, this.a, e.class, "iconByUrlFromCache", "iconByUrlFromCache(Ljava/lang/String;IILcom/yandex/go/image/api/domain/models/ImageTransform;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(SlotItemTrailDto$IconSpotDto slotItemTrailDto$IconSpotDto, boolean z, tss0 tss0Var, wls wlsVar, ContinuationImpl continuationImpl) {
        SlotItemMapperImpl$trailIconSpotOrFallback$1 slotItemMapperImpl$trailIconSpotOrFallback$1;
        int i;
        n7v n7vVar;
        Object a;
        SlotItemTrailDto$IconSpotDto slotItemTrailDto$IconSpotDto2;
        boolean z2;
        tss0 tss0Var2;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof SlotItemMapperImpl$trailIconSpotOrFallback$1) {
            slotItemMapperImpl$trailIconSpotOrFallback$1 = (SlotItemMapperImpl$trailIconSpotOrFallback$1) continuationImpl;
            int i2 = slotItemMapperImpl$trailIconSpotOrFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slotItemMapperImpl$trailIconSpotOrFallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slotItemMapperImpl$trailIconSpotOrFallback$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slotItemMapperImpl$trailIconSpotOrFallback$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (slotItemTrailDto$IconSpotDto == null || (n7vVar = slotItemTrailDto$IconSpotDto.a) == null || (a = this.b.a(n7vVar)) == null) {
                        return rss0.a;
                    }
                    slotItemMapperImpl$trailIconSpotOrFallback$1.L$0 = slotItemTrailDto$IconSpotDto;
                    slotItemMapperImpl$trailIconSpotOrFallback$1.L$1 = tss0Var;
                    slotItemMapperImpl$trailIconSpotOrFallback$1.L$2 = null;
                    slotItemMapperImpl$trailIconSpotOrFallback$1.L$3 = null;
                    slotItemMapperImpl$trailIconSpotOrFallback$1.L$4 = null;
                    slotItemMapperImpl$trailIconSpotOrFallback$1.Z$0 = z;
                    slotItemMapperImpl$trailIconSpotOrFallback$1.label = 1;
                    obj = wlsVar.invoke(a, slotItemMapperImpl$trailIconSpotOrFallback$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    slotItemTrailDto$IconSpotDto2 = slotItemTrailDto$IconSpotDto;
                    z2 = z;
                    tss0Var2 = tss0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = slotItemMapperImpl$trailIconSpotOrFallback$1.Z$0;
                    tss0Var2 = (tss0) slotItemMapperImpl$trailIconSpotOrFallback$1.L$1;
                    SlotItemTrailDto$IconSpotDto slotItemTrailDto$IconSpotDto3 = (SlotItemTrailDto$IconSpotDto) slotItemMapperImpl$trailIconSpotOrFallback$1.L$0;
                    b.b(obj);
                    z2 = z3;
                    slotItemTrailDto$IconSpotDto2 = slotItemTrailDto$IconSpotDto3;
                }
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                    return tss0Var2;
                }
                if (krs0.h[slotItemTrailDto$IconSpotDto2.c.ordinal()] != 1) {
                    w511.b();
                    return null;
                }
                Pair pair = new Pair(40, 40);
                int intValue = ((Number) pair.getFirst()).intValue();
                int intValue2 = ((Number) pair.getSecond()).intValue();
                avj0 avj0Var = (avj0) this.e;
                Pair pair2 = new Pair(Integer.valueOf(tje.u(intValue, avj0Var.a)), Integer.valueOf(tje.u(intValue2, avj0Var.a)));
                int intValue3 = ((Number) pair2.getFirst()).intValue();
                int intValue4 = ((Number) pair2.getSecond()).intValue();
                kdc v = this.a.v(slotItemTrailDto$IconSpotDto2.d);
                if (v == null) {
                    v = new bdc(xng0.textInvert);
                }
                return new oss0(bitmapDrawable, intValue3, intValue4, v, z2);
            }
        }
        slotItemMapperImpl$trailIconSpotOrFallback$1 = new SlotItemMapperImpl$trailIconSpotOrFallback$1(this, continuationImpl);
        Object obj3 = slotItemMapperImpl$trailIconSpotOrFallback$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slotItemMapperImpl$trailIconSpotOrFallback$1.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj3;
        if (bitmapDrawable != null) {
        }
    }
}
