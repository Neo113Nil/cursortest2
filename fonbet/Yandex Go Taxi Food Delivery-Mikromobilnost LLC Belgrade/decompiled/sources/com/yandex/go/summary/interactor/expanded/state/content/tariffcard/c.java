package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.tariffcard.ui.MultiTariffOption$Subtitle$SubtitleType;
import com.yandex.go.taxi.order.cancel.paid.ui.CancelledOrderCostModalView;
import defpackage.avj0;
import defpackage.b1f0;
import defpackage.cvu0;
import defpackage.cx7;
import defpackage.eq2;
import defpackage.evu0;
import defpackage.fn40;
import defpackage.fq2;
import defpackage.g8e;
import defpackage.gn40;
import defpackage.h3y;
import defpackage.hh8;
import defpackage.hn40;
import defpackage.hq40;
import defpackage.in40;
import defpackage.iq40;
import defpackage.jco;
import defpackage.kco;
import defpackage.kq40;
import defpackage.kyh0;
import defpackage.lco;
import defpackage.ln40;
import defpackage.mco;
import defpackage.mi31;
import defpackage.mja1;
import defpackage.mqv0;
import defpackage.nco;
import defpackage.nn40;
import defpackage.ny61;
import defpackage.on40;
import defpackage.pex0;
import defpackage.pn40;
import defpackage.qn40;
import defpackage.sn40;
import defpackage.tcc;
import defpackage.tfe;
import defpackage.un40;
import defpackage.up2;
import defpackage.v49;
import defpackage.vfx0;
import defpackage.w2v0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wp2;
import defpackage.x29;
import defpackage.xfv;
import defpackage.xq80;
import defpackage.ziz0;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;

/* loaded from: classes14.dex */
public final class c {
    public final wiq0 a;
    public final vfx0 b;
    public final com.yandex.go.tariffcard.interactor.g c;
    public final com.yandex.go.taxi.tariffs.repository.g d;
    public final h3y e;
    public final mqv0 f;
    public final h3y g;
    public final h3y h;
    public final com.yandex.go.tariffcard.interactor.f i;
    public final zuj0 j;
    public final x29 k;

    public c(wiq0 wiq0Var, vfx0 vfx0Var, com.yandex.go.tariffcard.interactor.g gVar, com.yandex.go.taxi.tariffs.repository.g gVar2, h3y h3yVar, mqv0 mqv0Var, h3y h3yVar2, h3y h3yVar3, com.yandex.go.tariffcard.interactor.f fVar, zuj0 zuj0Var, x29 x29Var) {
        this.a = wiq0Var;
        this.b = vfx0Var;
        this.c = gVar;
        this.d = gVar2;
        this.e = h3yVar;
        this.f = mqv0Var;
        this.g = h3yVar2;
        this.h = h3yVar3;
        this.i = fVar;
        this.j = zuj0Var;
        this.k = x29Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d7 -> B:10:0x00d9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, mi31 mi31Var, Map map, ContinuationImpl continuationImpl) {
        MultiTariffOptionsUiStateInteractor$getMultiTariffOptions$1 multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1;
        int i;
        Iterator it;
        Map map2;
        Set set;
        MultiTariffOptionsUiStateInteractor$getMultiTariffOptions$1 multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12;
        mi31 mi31Var2;
        Collection collection;
        cVar.getClass();
        if (continuationImpl instanceof MultiTariffOptionsUiStateInteractor$getMultiTariffOptions$1) {
            multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1 = (MultiTariffOptionsUiStateInteractor$getMultiTariffOptions$1) continuationImpl;
            int i2 = multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = mi31Var.a.K0;
                    Collection collection2 = EmptyList.a;
                    if (!z) {
                        return collection2;
                    }
                    Set a = ((com.yandex.go.taxi.tariffs.repository.g) cVar.e.get()).a(mi31Var.b);
                    Collection collection3 = mi31Var.a.U;
                    if (collection3 != null) {
                        collection2 = collection3;
                    }
                    Collection collection4 = collection2;
                    ArrayList arrayList = new ArrayList(tcc.n(collection4, 10));
                    it = collection4.iterator();
                    map2 = map;
                    set = a;
                    multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12 = multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1;
                    mi31Var2 = mi31Var;
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1.L$11;
                    Iterator it2 = (Iterator) multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1.L$7;
                    Collection collection5 = (Collection) multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1.L$6;
                    Set set2 = (Set) multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1.L$2;
                    Map map3 = (Map) multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1.L$1;
                    mi31 mi31Var3 = (mi31) multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1.L$0;
                    kotlin.b.b(obj);
                    multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12 = multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1;
                    set = set2;
                    map2 = map3;
                    c cVar2 = cVar;
                    Iterator it3 = it2;
                    mi31Var2 = mi31Var3;
                    collection.add((sn40) obj);
                    collection = collection5;
                    it = it3;
                    cVar = cVar2;
                    if (it.hasNext()) {
                        pex0 pex0Var = (pex0) it.next();
                        hq40 a2 = ((iq40) cVar.g.get()).a(mi31Var2, pex0Var);
                        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12.L$0 = mi31Var2;
                        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12.L$1 = map2;
                        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12.L$2 = set;
                        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12.L$3 = null;
                        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12.L$4 = null;
                        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12.L$5 = null;
                        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12.L$6 = collection;
                        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12.L$7 = it;
                        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12.L$8 = null;
                        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12.L$9 = null;
                        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12.L$10 = null;
                        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12.L$11 = collection;
                        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12.label = 1;
                        cVar2 = cVar;
                        obj = cVar2.d(pex0Var, a2, map2, set, multiTariffOptionsUiStateInteractor$getMultiTariffOptions$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        it3 = it;
                        collection5 = collection;
                        collection.add((sn40) obj);
                        collection = collection5;
                        it = it3;
                        cVar = cVar2;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1 = new MultiTariffOptionsUiStateInteractor$getMultiTariffOptions$1(cVar, continuationImpl);
        Object obj2 = multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiTariffOptionsUiStateInteractor$getMultiTariffOptions$1.label;
        if (i != 0) {
        }
    }

    public static void b(StringBuilder sb, CharSequence charSequence) {
        if (charSequence == null || evu0.J(charSequence)) {
            return;
        }
        if (sb.length() > 0) {
            sb.append(Extension.FIX_SPACE);
        }
        sb.append(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(pex0 pex0Var, boolean z, ContinuationImpl continuationImpl) {
        MultiTariffOptionsUiStateInteractor$getTrail2UiState$1 multiTariffOptionsUiStateInteractor$getTrail2UiState$1;
        int i;
        CharSequence charSequence;
        gn40 gn40Var;
        xq80 xq80Var;
        fn40 fn40Var;
        if (continuationImpl instanceof MultiTariffOptionsUiStateInteractor$getTrail2UiState$1) {
            multiTariffOptionsUiStateInteractor$getTrail2UiState$1 = (MultiTariffOptionsUiStateInteractor$getTrail2UiState$1) continuationImpl;
            int i2 = multiTariffOptionsUiStateInteractor$getTrail2UiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiTariffOptionsUiStateInteractor$getTrail2UiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multiTariffOptionsUiStateInteractor$getTrail2UiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiTariffOptionsUiStateInteractor$getTrail2UiState$1.label;
                v49 v49Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    multiTariffOptionsUiStateInteractor$getTrail2UiState$1.L$0 = null;
                    multiTariffOptionsUiStateInteractor$getTrail2UiState$1.Z$0 = z;
                    multiTariffOptionsUiStateInteractor$getTrail2UiState$1.label = 1;
                    obj = this.i.c(pex0Var, multiTariffOptionsUiStateInteractor$getTrail2UiState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = multiTariffOptionsUiStateInteractor$getTrail2UiState$1.Z$0;
                    kotlin.b.b(obj);
                }
                hn40 hn40Var = (hn40) obj;
                charSequence = hn40Var.a;
                if (charSequence == null) {
                    charSequence = "";
                }
                b1f0 b1f0Var = new b1f0(charSequence, !z ? AppColor$Palette.TextMinor : AppColor$Palette.Text, hn40Var.d);
                gn40Var = hn40Var.c;
                if (gn40Var != null) {
                    if (evu0.J(gn40Var.a)) {
                        gn40Var = null;
                    }
                    if (gn40Var != null) {
                        xq80Var = new xq80(gn40Var.a, AppColor$Palette.TextMinor, z ? 0.5f : 1.0f);
                        fn40Var = hn40Var.b;
                        if (fn40Var != null) {
                            if (evu0.J(fn40Var.a)) {
                                fn40Var = null;
                            }
                            if (fn40Var != null) {
                                v49Var = new v49(g8e.o("+", fn40Var.a), z ? 0.5f : 1.0f);
                            }
                        }
                        return new on40(b1f0Var, xq80Var, v49Var);
                    }
                }
                xq80Var = null;
                fn40Var = hn40Var.b;
                if (fn40Var != null) {
                }
                return new on40(b1f0Var, xq80Var, v49Var);
            }
        }
        multiTariffOptionsUiStateInteractor$getTrail2UiState$1 = new MultiTariffOptionsUiStateInteractor$getTrail2UiState$1(this, continuationImpl);
        Object obj2 = multiTariffOptionsUiStateInteractor$getTrail2UiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiTariffOptionsUiStateInteractor$getTrail2UiState$1.label;
        v49 v49Var2 = null;
        if (i != 0) {
        }
        hn40 hn40Var2 = (hn40) obj2;
        charSequence = hn40Var2.a;
        if (charSequence == null) {
        }
        b1f0 b1f0Var2 = new b1f0(charSequence, !z ? AppColor$Palette.TextMinor : AppColor$Palette.Text, hn40Var2.d);
        gn40Var = hn40Var2.c;
        if (gn40Var != null) {
        }
        xq80Var = null;
        fn40Var = hn40Var2.b;
        if (fn40Var != null) {
        }
        return new on40(b1f0Var2, xq80Var, v49Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(pex0 pex0Var, hq40 hq40Var, Map map, Set set, ContinuationImpl continuationImpl) {
        MultiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1 multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1;
        int i;
        int i2;
        int i3;
        mco mcoVar;
        String str;
        String str2;
        w2v0 w2v0Var;
        wp2 wp2Var;
        Object c;
        ln40 ln40Var;
        Set set2;
        nn40 nn40Var;
        int i4;
        avj0 avj0Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        StringBuilder sb;
        pex0 pex0Var2 = pex0Var;
        hq40 hq40Var2 = hq40Var;
        if (continuationImpl instanceof MultiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1) {
            multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1 = (MultiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1) continuationImpl;
            int i5 = multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.label = i5 - Integer.MIN_VALUE;
                Object obj = multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    nco ncoVar = (nco) map.get(pex0Var2.b);
                    boolean z = hq40Var2.a;
                    mqv0 mqv0Var = this.f;
                    SummaryUiDelegate$TariffCardStyle c2 = mqv0Var.c();
                    int[] iArr = un40.a;
                    int i6 = iArr[c2.ordinal()];
                    if (i6 == 1) {
                        i2 = 56;
                    } else {
                        if (i6 != 2) {
                            w511.b();
                            return null;
                        }
                        i2 = 88;
                    }
                    int i7 = iArr[mqv0Var.c().ordinal()];
                    if (i7 == 1) {
                        i3 = -18;
                    } else {
                        if (i7 != 2) {
                            w511.b();
                            return null;
                        }
                        i3 = -14;
                    }
                    float f = z ? 0.5f : 1.0f;
                    String str3 = pex0Var2.j;
                    if (str3 == null) {
                        str3 = "";
                    }
                    xfv xfvVar = new xfv(mja1.b(str3, null, 6), f, i2, i3);
                    if (ncoVar != null) {
                        SummaryUiDelegate$TariffCardStyle c3 = mqv0Var.c();
                        if (!evu0.J(ncoVar.getText())) {
                            int i8 = iArr[c3.ordinal()];
                            if (i8 == 1) {
                                i4 = 14;
                            } else {
                                if (i8 != 2) {
                                    w511.b();
                                    return null;
                                }
                                i4 = 8;
                            }
                            if ((ncoVar instanceof jco) || (ncoVar instanceof lco)) {
                                mcoVar = new mco(ncoVar.getText(), z ? AppColor$Palette.TextMinor : AppColor$Palette.Text, AppColor$Palette.Background, i4);
                            } else {
                                if (!(ncoVar instanceof kco)) {
                                    w511.b();
                                    return null;
                                }
                                mcoVar = new mco(((kco) ncoVar).a, AppColor$Palette.EverFront, new up2(eq2.a), i4);
                            }
                            nn40 nn40Var2 = new nn40(xfvVar, mcoVar);
                            str = pex0Var2.l;
                            if (str == null) {
                                str = "";
                            }
                            ziz0 ziz0Var = new ziz0(str, !z ? AppColor$Palette.TextMinor : AppColor$Palette.Text);
                            in40 a = ((kq40) this.h.get()).a(pex0Var2);
                            if (z) {
                                str2 = a != null ? a.a : null;
                                if (str2 == null) {
                                    str2 = "";
                                }
                            } else {
                                str2 = hq40Var2.b;
                            }
                            if (evu0.J(str2)) {
                                if (z) {
                                    wp2Var = new up2(fq2.a);
                                } else {
                                    MultiTariffOption$Subtitle$SubtitleType multiTariffOption$Subtitle$SubtitleType = a != null ? a.b : null;
                                    int i9 = multiTariffOption$Subtitle$SubtitleType == null ? -1 : un40.b[multiTariffOption$Subtitle$SubtitleType.ordinal()];
                                    if (i9 == -1 || i9 == 1) {
                                        wp2Var = AppColor$Palette.TextMinor;
                                    } else {
                                        if (i9 != 2) {
                                            w511.b();
                                            return null;
                                        }
                                        wp2Var = AppColor$Palette.Text;
                                    }
                                }
                                w2v0Var = new w2v0(str2, wp2Var);
                            } else {
                                w2v0Var = null;
                            }
                            ln40 ln40Var2 = new ln40(ziz0Var, w2v0Var);
                            multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$0 = pex0Var2;
                            multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$1 = hq40Var2;
                            multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$2 = null;
                            multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$3 = set;
                            multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$4 = nn40Var2;
                            multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$5 = ln40Var2;
                            multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.label = 1;
                            c = c(pex0Var2, z, multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1);
                            if (c != obj2) {
                                return obj2;
                            }
                            ln40Var = ln40Var2;
                            obj = c;
                            set2 = set;
                            nn40Var = nn40Var2;
                        }
                    }
                    mcoVar = null;
                    nn40 nn40Var22 = new nn40(xfvVar, mcoVar);
                    str = pex0Var2.l;
                    if (str == null) {
                    }
                    ziz0 ziz0Var2 = new ziz0(str, !z ? AppColor$Palette.TextMinor : AppColor$Palette.Text);
                    in40 a2 = ((kq40) this.h.get()).a(pex0Var2);
                    if (z) {
                    }
                    if (evu0.J(str2)) {
                    }
                    ln40 ln40Var22 = new ln40(ziz0Var2, w2v0Var);
                    multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$0 = pex0Var2;
                    multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$1 = hq40Var2;
                    multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$2 = null;
                    multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$3 = set;
                    multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$4 = nn40Var22;
                    multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$5 = ln40Var22;
                    multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.label = 1;
                    c = c(pex0Var2, z, multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1);
                    if (c != obj2) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ln40 ln40Var3 = (ln40) multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$5;
                    nn40 nn40Var3 = (nn40) multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$4;
                    set2 = (Set) multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$3;
                    hq40 hq40Var3 = (hq40) multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$1;
                    pex0 pex0Var3 = (pex0) multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.L$0;
                    kotlin.b.b(obj);
                    ln40Var = ln40Var3;
                    nn40Var = nn40Var3;
                    pex0Var2 = pex0Var3;
                    hq40Var2 = hq40Var3;
                }
                on40 on40Var = (on40) obj;
                boolean contains = set2.contains(pex0Var2.b);
                boolean z2 = hq40Var2.a;
                pn40 pn40Var = new pn40(contains, !z2);
                qn40 qn40Var = !z2 ? null : new qn40(HapticEffect.Tick, pex0Var2.b, contains);
                int i10 = kyh0.pool_tariff_title;
                avj0Var = (avj0) this.j;
                String h = avj0Var.h(i10);
                String str4 = ln40Var.a.a;
                w2v0 w2v0Var2 = ln40Var.b;
                String str5 = w2v0Var2 == null ? w2v0Var2.a : null;
                mco mcoVar2 = nn40Var.b;
                charSequence = mcoVar2 == null ? mcoVar2.a : null;
                b1f0 b1f0Var = on40Var.a;
                charSequence2 = b1f0Var.c;
                if (charSequence2 == null) {
                    charSequence2 = b1f0Var.a;
                }
                sb = new StringBuilder();
                b(sb, cvu0.v(h, CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, str4, false));
                b(sb, str5);
                if (charSequence != null && !evu0.J(charSequence)) {
                    b(sb, avj0Var.i(kyh0.summary_accessibility_tariff_eta, charSequence));
                }
                b(sb, charSequence2);
                v49 v49Var = on40Var.c;
                String str6 = v49Var == null ? v49Var.a : null;
                x29 x29Var = this.k;
                x29Var.getClass();
                b(sb, tfe.a(str6, new hh8(10, x29Var), new cx7(26, x29Var)));
                return new sn40(pex0Var2.b, nn40Var, ln40Var, on40Var, pn40Var, qn40Var, sb.toString());
            }
        }
        multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1 = new MultiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1(this, continuationImpl);
        Object obj3 = multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiTariffOptionsUiStateInteractor$toMultiTariffOptionUiState$1.label;
        if (i != 0) {
        }
        on40 on40Var2 = (on40) obj3;
        boolean contains2 = set2.contains(pex0Var2.b);
        boolean z22 = hq40Var2.a;
        pn40 pn40Var2 = new pn40(contains2, !z22);
        if (!z22) {
        }
        int i102 = kyh0.pool_tariff_title;
        avj0Var = (avj0) this.j;
        String h2 = avj0Var.h(i102);
        String str42 = ln40Var.a.a;
        w2v0 w2v0Var22 = ln40Var.b;
        if (w2v0Var22 == null) {
        }
        mco mcoVar22 = nn40Var.b;
        if (mcoVar22 == null) {
        }
        b1f0 b1f0Var2 = on40Var2.a;
        charSequence2 = b1f0Var2.c;
        if (charSequence2 == null) {
        }
        sb = new StringBuilder();
        b(sb, cvu0.v(h2, CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, str42, false));
        b(sb, str5);
        if (charSequence != null) {
            b(sb, avj0Var.i(kyh0.summary_accessibility_tariff_eta, charSequence));
        }
        b(sb, charSequence2);
        v49 v49Var2 = on40Var2.c;
        if (v49Var2 == null) {
        }
        x29 x29Var2 = this.k;
        x29Var2.getClass();
        b(sb, tfe.a(str6, new hh8(10, x29Var2), new cx7(26, x29Var2)));
        return new sn40(pex0Var2.b, nn40Var, ln40Var, on40Var2, pn40Var2, qn40Var, sb.toString());
    }
}
