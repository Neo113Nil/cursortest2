package com.yandex.go.taxi.summary.mobilityhub.mapper;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.go.coroutines.h;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinIconStateDto$PinEtaDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinIconStateDto$PinIconDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.n1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.o1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.repository.HubContentState;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.a0c0;
import defpackage.atj0;
import defpackage.b0c0;
import defpackage.bdc;
import defpackage.bl00;
import defpackage.c0c0;
import defpackage.e1v;
import defpackage.exu;
import defpackage.f0c0;
import defpackage.f1h0;
import defpackage.gk00;
import defpackage.gtq0;
import defpackage.gw20;
import defpackage.hdu;
import defpackage.hgr0;
import defpackage.hw20;
import defpackage.i1c0;
import defpackage.iw20;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jw20;
import defpackage.k1v;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.l1v;
import defpackage.lw20;
import defpackage.m1v;
import defpackage.n1v;
import defpackage.ny61;
import defpackage.om30;
import defpackage.oyr;
import defpackage.p4h0;
import defpackage.pdc;
import defpackage.qje;
import defpackage.rcc;
import defpackage.s8o;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u8b1;
import defpackage.ufu;
import defpackage.vsj0;
import defpackage.w511;
import defpackage.wsj0;
import defpackage.xng0;
import defpackage.xsj0;
import defpackage.xw31;
import defpackage.xzb0;
import defpackage.ysj0;
import defpackage.z6l0;
import defpackage.zsj0;
import defpackage.zzb0;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.points.MapPointWithDrawableFrameLayout;
import ru.yandex.taxi.widget.map.PinSlot;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes14.dex */
public final class b {
    public final Context a;
    public final com.yandex.go.pin.api.widget.b b;
    public final ru.yandex.taxi.design.utils.b c;
    public final ru.yandex.taxi.widget.utils.e d;
    public final pdc e;
    public final hdu f;
    public final ru.yandex.taxi.design.utils.a g;
    public final h h = new h(new MobilityHubV2OverlayUiStateMapper$pinComponent$1(this, null));
    public final bdc i = new bdc(xng0.controlMain);

    public b(Context context, com.yandex.go.pin.api.widget.b bVar, ru.yandex.taxi.design.utils.b bVar2, ru.yandex.taxi.widget.utils.e eVar, pdc pdcVar, hdu hduVar, ru.yandex.taxi.design.utils.a aVar) {
        this.a = context;
        this.b = bVar;
        this.c = bVar2;
        this.d = eVar;
        this.e = pdcVar;
        this.f = hduVar;
        this.g = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f0c0 f0c0Var, String str, String str2, boolean z, boolean z2, Integer num, float f, ContinuationImpl continuationImpl) {
        MobilityHubV2OverlayUiStateMapper$createV2Pin$1 mobilityHubV2OverlayUiStateMapper$createV2Pin$1;
        int i;
        Integer num2;
        float f2;
        Object a;
        String str3;
        String str4;
        boolean z3;
        boolean z4;
        if (continuationImpl instanceof MobilityHubV2OverlayUiStateMapper$createV2Pin$1) {
            mobilityHubV2OverlayUiStateMapper$createV2Pin$1 = (MobilityHubV2OverlayUiStateMapper$createV2Pin$1) continuationImpl;
            int i2 = mobilityHubV2OverlayUiStateMapper$createV2Pin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubV2OverlayUiStateMapper$createV2Pin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilityHubV2OverlayUiStateMapper$createV2Pin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubV2OverlayUiStateMapper$createV2Pin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobilityHubV2OverlayUiStateMapper$createV2Pin$1.L$0 = f0c0Var;
                    mobilityHubV2OverlayUiStateMapper$createV2Pin$1.L$1 = str;
                    mobilityHubV2OverlayUiStateMapper$createV2Pin$1.L$2 = str2;
                    num2 = num;
                    mobilityHubV2OverlayUiStateMapper$createV2Pin$1.L$3 = num2;
                    mobilityHubV2OverlayUiStateMapper$createV2Pin$1.Z$0 = z;
                    mobilityHubV2OverlayUiStateMapper$createV2Pin$1.Z$1 = z2;
                    f2 = f;
                    mobilityHubV2OverlayUiStateMapper$createV2Pin$1.F$0 = f2;
                    mobilityHubV2OverlayUiStateMapper$createV2Pin$1.label = 1;
                    a = this.h.a(mobilityHubV2OverlayUiStateMapper$createV2Pin$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = str;
                    str4 = str2;
                    z3 = z;
                    z4 = z2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f3 = mobilityHubV2OverlayUiStateMapper$createV2Pin$1.F$0;
                    boolean z5 = mobilityHubV2OverlayUiStateMapper$createV2Pin$1.Z$1;
                    boolean z6 = mobilityHubV2OverlayUiStateMapper$createV2Pin$1.Z$0;
                    Integer num3 = (Integer) mobilityHubV2OverlayUiStateMapper$createV2Pin$1.L$3;
                    str4 = (String) mobilityHubV2OverlayUiStateMapper$createV2Pin$1.L$2;
                    ?? r4 = (CharSequence) mobilityHubV2OverlayUiStateMapper$createV2Pin$1.L$1;
                    f0c0 f0c0Var2 = (f0c0) mobilityHubV2OverlayUiStateMapper$createV2Pin$1.L$0;
                    kotlin.b.b(obj);
                    f2 = f3;
                    z4 = z5;
                    f0c0Var = f0c0Var2;
                    a = obj;
                    num2 = num3;
                    str3 = r4;
                    z3 = z6;
                }
                PinV2Component pinV2Component = (PinV2Component) a;
                PinSlot.Companion.getClass();
                i1c0 a2 = i1c0.a(xzb0.a(this.a), 0, 0, num2, f2, 3);
                if (f0c0Var == null) {
                    f0c0Var = zzb0.a;
                }
                bl00 a3 = com.yandex.go.pin.api.v2.d.a(pinV2Component, a2, PinV2Component.Position.ANCHORED, new SourceOnMapControl.a(f0c0Var, str3, str4, z3, z4, null, null, 1968));
                a3.b.setAnchor(new PointF(0.5f, 0.5f));
                return a3;
            }
        }
        mobilityHubV2OverlayUiStateMapper$createV2Pin$1 = new MobilityHubV2OverlayUiStateMapper$createV2Pin$1(this, continuationImpl);
        Object obj2 = mobilityHubV2OverlayUiStateMapper$createV2Pin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubV2OverlayUiStateMapper$createV2Pin$1.label;
        if (i != 0) {
        }
        PinV2Component pinV2Component2 = (PinV2Component) a;
        PinSlot.Companion.getClass();
        i1c0 a22 = i1c0.a(xzb0.a(this.a), 0, 0, num2, f2, 3);
        if (f0c0Var == null) {
        }
        bl00 a32 = com.yandex.go.pin.api.v2.d.a(pinV2Component2, a22, PinV2Component.Position.ANCHORED, new SourceOnMapControl.a(f0c0Var, str3, str4, z3, z4, null, null, 1968));
        a32.b.setAnchor(new PointF(0.5f, 0.5f));
        return a32;
    }

    public final String b(int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        int i4 = kyh0.common_hour_sign;
        Context context = this.a;
        String string = context.getString(i4);
        String string2 = context.getString(kyh0.common_minutes_sign);
        if (i2 > 0 && i3 > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append(" ");
            sb.append(string);
            sb.append(" ");
            sb.append(i3);
            return oyr.t(sb, " ", string2);
        }
        if (i2 > 0) {
            return i2 + " " + string;
        }
        return i3 + " " + string2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(zzs zzsVar, zzs zzsVar2, ContinuationImpl continuationImpl) {
        MobilityHubV2OverlayUiStateMapper$mapErrorIcons$1 mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1;
        int i;
        zzs zzsVar3;
        List list;
        List list2;
        zzs zzsVar4;
        List list3;
        if (continuationImpl instanceof MobilityHubV2OverlayUiStateMapper$mapErrorIcons$1) {
            mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1 = (MobilityHubV2OverlayUiStateMapper$mapErrorIcons$1) continuationImpl;
            int i2 = mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ListBuilder a = rcc.a();
                    mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.L$0 = null;
                    mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.L$1 = zzsVar2;
                    mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.L$2 = a;
                    mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.L$3 = a;
                    mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.L$4 = zzsVar;
                    mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.L$5 = a;
                    mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.label = 1;
                    Object h = h(mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1);
                    if (h == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    zzsVar3 = zzsVar2;
                    list = a;
                    list2 = list;
                    zzsVar4 = zzsVar;
                    list3 = list2;
                    obj = h;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list3 = (List) mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.L$5;
                    zzsVar4 = (zzs) mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.L$4;
                    list = (List) mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.L$3;
                    list2 = (List) mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.L$2;
                    zzsVar3 = (zzs) mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.L$1;
                    kotlin.b.b(obj);
                }
                int i3 = f1h0.route_start_point;
                Context context = this.a;
                list3.add(new e1v(zzsVar4, (bl00) obj, new bl00(ImageProvider.fromBitmap(u8b1.g(tje.y(i3, context))), new IconStyle())));
                if (zzsVar3 != null) {
                    MapPointWithDrawableFrameLayout mapPointWithDrawableFrameLayout = new MapPointWithDrawableFrameLayout(context, gtq0.v(this.g, context, tje.u(10, context), new hgr0(0.0f, tje.w(8, context), tje.w(20, context), qje.u(context.getTheme(), xng0.effectShadowBottom)), 0, 24));
                    mapPointWithDrawableFrameLayout.render(tje.y(f1h0.ic_destination_pin_two_flag_24, context), new bdc(xng0.textOnControlMinor), new bdc(xng0.controlMinor));
                    xw31.r(mapPointWithDrawableFrameLayout);
                    list.add(new e1v(zzsVar3, new bl00(ImageProvider.fromBitmap(xw31.t(mapPointWithDrawableFrameLayout)), new IconStyle()), null));
                }
                return ((ListBuilder) list2).j();
            }
        }
        mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1 = new MobilityHubV2OverlayUiStateMapper$mapErrorIcons$1(this, continuationImpl);
        Object obj2 = mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubV2OverlayUiStateMapper$mapErrorIcons$1.label;
        if (i != 0) {
        }
        int i32 = f1h0.route_start_point;
        Context context2 = this.a;
        list3.add(new e1v(zzsVar4, (bl00) obj2, new bl00(ImageProvider.fromBitmap(u8b1.g(tje.y(i32, context2))), new IconStyle())));
        if (zzsVar3 != null) {
        }
        return ((ListBuilder) list2).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(o1 o1Var, ContinuationImpl continuationImpl) {
        MobilityHubV2OverlayUiStateMapper$mapIconState$1 mobilityHubV2OverlayUiStateMapper$mapIconState$1;
        int i;
        BitmapDrawable bitmapDrawable;
        Drawable current;
        Integer num;
        if (continuationImpl instanceof MobilityHubV2OverlayUiStateMapper$mapIconState$1) {
            mobilityHubV2OverlayUiStateMapper$mapIconState$1 = (MobilityHubV2OverlayUiStateMapper$mapIconState$1) continuationImpl;
            int i2 = mobilityHubV2OverlayUiStateMapper$mapIconState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubV2OverlayUiStateMapper$mapIconState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilityHubV2OverlayUiStateMapper$mapIconState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubV2OverlayUiStateMapper$mapIconState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (o1Var instanceof PinIconStateDto$PinEtaDto) {
                        PinIconStateDto$PinEtaDto pinIconStateDto$PinEtaDto = (PinIconStateDto$PinEtaDto) o1Var;
                        return new a0c0(pinIconStateDto$PinEtaDto.c, new Integer(pinIconStateDto$PinEtaDto.b));
                    }
                    if (!(o1Var instanceof PinIconStateDto$PinIconDto)) {
                        if (!jl40.l(o1Var, n1.INSTANCE) && o1Var != null) {
                            w511.b();
                        }
                        return null;
                    }
                    String str = ((PinIconStateDto$PinIconDto) o1Var).b;
                    mobilityHubV2OverlayUiStateMapper$mapIconState$1.L$0 = o1Var;
                    mobilityHubV2OverlayUiStateMapper$mapIconState$1.label = 1;
                    obj = ru.yandex.taxi.widget.utils.e.f(this.d, str, null, mobilityHubV2OverlayUiStateMapper$mapIconState$1, 6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o1Var = (o1) mobilityHubV2OverlayUiStateMapper$mapIconState$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null && (current = bitmapDrawable.getCurrent()) != null) {
                    PinIconStateDto$PinIconDto pinIconStateDto$PinIconDto = (PinIconStateDto$PinIconDto) o1Var;
                    String str2 = pinIconStateDto$PinIconDto.c;
                    ufu ufuVar = (ufu) this.e;
                    kdc g = ufuVar.g(str2);
                    Context context = this.a;
                    Integer num2 = g == null ? new Integer(s8o.m(g, context)) : null;
                    kdc g2 = ufuVar.g(pinIconStateDto$PinIconDto.d);
                    num = g2 != null ? new Integer(s8o.m(g2, context)) : null;
                    Drawable mutate = current.mutate();
                    if (num != null) {
                        mutate.setTint(num.intValue());
                    }
                    return num2 == null ? new b0c0(mutate, num2.intValue()) : new c0c0(mutate);
                }
                return null;
            }
        }
        mobilityHubV2OverlayUiStateMapper$mapIconState$1 = new MobilityHubV2OverlayUiStateMapper$mapIconState$1(this, continuationImpl);
        Object obj2 = mobilityHubV2OverlayUiStateMapper$mapIconState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubV2OverlayUiStateMapper$mapIconState$1.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable != null) {
            PinIconStateDto$PinIconDto pinIconStateDto$PinIconDto2 = (PinIconStateDto$PinIconDto) o1Var;
            String str22 = pinIconStateDto$PinIconDto2.c;
            ufu ufuVar2 = (ufu) this.e;
            kdc g3 = ufuVar2.g(str22);
            Context context2 = this.a;
            if (g3 == null) {
            }
            kdc g22 = ufuVar2.g(pinIconStateDto$PinIconDto2.d);
            if (g22 != null) {
            }
            Drawable mutate2 = current.mutate();
            if (num != null) {
            }
            if (num2 == null) {
            }
        }
        return null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x03c7 -> B:12:0x03d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x0557 -> B:50:0x0566). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:173:0x014d -> B:58:0x0159). Please report as a decompilation issue!!! */
    public final java.lang.Object e(java.util.List r39, java.util.List r40, kotlin.coroutines.jvm.internal.ContinuationImpl r41) {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.go.taxi.summary.mobilityhub.mapper.b.e(java.util.List, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final List f(atj0 atj0Var, List list, zzs zzsVar, zzs zzsVar2, String str) {
        n1v n1vVar;
        hdu hduVar = this.f;
        hduVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atj0 b = ((z6l0) it.next()).b();
            if (b instanceof vsj0) {
                n1vVar = new k1v(((vsj0) b).a);
            } else if (b instanceof zsj0) {
                n1vVar = new m1v(((zsj0) b).a, str);
            } else if (b instanceof ysj0) {
                n1vVar = new l1v(((ysj0) b).a);
            } else {
                if (!(b instanceof wsj0) && !(b instanceof xsj0) && b != null) {
                    w511.b();
                    return null;
                }
                n1vVar = null;
            }
            if (n1vVar != null) {
                arrayList.add(n1vVar);
            }
        }
        return !arrayList.isEmpty() ? arrayList : scc.h(hduVar.o(atj0Var, zzsVar, zzsVar2, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(zzs zzsVar, ContinuationImpl continuationImpl) {
        MobilityHubV2OverlayUiStateMapper$mapSourceLoading$1 mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1;
        int i;
        if (continuationImpl instanceof MobilityHubV2OverlayUiStateMapper$mapSourceLoading$1) {
            mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1 = (MobilityHubV2OverlayUiStateMapper$mapSourceLoading$1) continuationImpl;
            int i2 = mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1.L$0 = null;
                    mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1.L$1 = zzsVar;
                    mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1.label = 1;
                    obj = this.b.f(null, mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzsVar = (zzs) mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1.L$1;
                    kotlin.b.b(obj);
                }
                return new exu(zzsVar, (gk00) obj, new bl00(ImageProvider.fromBitmap(u8b1.g(tje.y(f1h0.route_start_point, this.a))), new IconStyle()));
            }
        }
        mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1 = new MobilityHubV2OverlayUiStateMapper$mapSourceLoading$1(this, continuationImpl);
        Object obj2 = mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubV2OverlayUiStateMapper$mapSourceLoading$1.label;
        if (i != 0) {
        }
        return new exu(zzsVar, (gk00) obj2, new bl00(ImageProvider.fromBitmap(u8b1.g(tje.y(f1h0.route_start_point, this.a))), new IconStyle()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        MobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1 mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1;
        int i;
        i1c0 i1c0Var;
        SourceOnMapControl.a aVar;
        if (continuationImpl instanceof MobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1) {
            mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1 = (MobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1) continuationImpl;
            int i2 = mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = p4h0.ic_mobility_source_icon;
                    Context context = this.a;
                    Drawable y = tje.y(i3, context);
                    i1c0 i1c0Var2 = new i1c0(s8o.m(new bdc(xng0.textOnControl), context), s8o.m(this.i, context));
                    SourceOnMapControl.a aVar2 = new SourceOnMapControl.a(new c0c0(y), null, null, false, false, null, null, 2046);
                    mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.L$0 = null;
                    mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.L$1 = null;
                    mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.L$2 = i1c0Var2;
                    mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.L$3 = null;
                    mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.L$4 = aVar2;
                    mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.label = 1;
                    obj = this.h.a(mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i1c0Var = i1c0Var2;
                    aVar = aVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (SourceOnMapControl.a) mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.L$4;
                    i1c0Var = (i1c0) mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.L$2;
                    kotlin.b.b(obj);
                }
                return com.yandex.go.pin.api.v2.d.a((PinV2Component) obj, i1c0Var, PinV2Component.Position.ANCHORED, aVar);
            }
        }
        mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1 = new MobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1(this, continuationImpl);
        Object obj2 = mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubV2OverlayUiStateMapper$mapSourcePinImage$1.label;
        if (i != 0) {
        }
        return com.yandex.go.pin.api.v2.d.a((PinV2Component) obj2, i1c0Var, PinV2Component.Position.ANCHORED, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a A[LOOP:0: B:11:0x0074->B:13:0x007a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable i(zzs zzsVar, zzs zzsVar2, List list, ContinuationImpl continuationImpl) {
        MobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1 mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1;
        int i;
        if (continuationImpl instanceof MobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1) {
            mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1 = (MobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1) continuationImpl;
            int i2 = mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (list.isEmpty()) {
                        return EmptyList.a;
                    }
                    List A = j73.A(new zzs[]{zzsVar, zzsVar2});
                    mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1.L$0 = null;
                    mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1.L$1 = null;
                    mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1.L$2 = null;
                    mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1.L$3 = null;
                    mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1.label = 1;
                    obj = e(A, list, mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Iterable<e1v> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
                for (e1v e1vVar : iterable) {
                    zzs zzsVar3 = e1vVar.a;
                    arrayList.add(new om30(zzsVar3.a, zzsVar3.b, e1vVar.b, e1vVar.c));
                }
                return arrayList;
            }
        }
        mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1 = new MobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1(this, continuationImpl);
        Object obj2 = mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubV2OverlayUiStateMapper$mapToMtHubRoutePins$1.label;
        if (i != 0) {
        }
        Iterable<e1v> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(tcc.n(iterable2, 10));
        while (r8.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0188, code lost:
    
        if (r1 == r7) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(zzs zzsVar, zzs zzsVar2, HubContentState hubContentState, List list, atj0 atj0Var, List list2, Integer num, List list3, ContinuationImpl continuationImpl) {
        MobilityHubV2OverlayUiStateMapper$mapUiState$1 mobilityHubV2OverlayUiStateMapper$mapUiState$1;
        int i;
        List list4;
        String str;
        atj0 atj0Var2;
        List list5;
        List list6;
        List list7;
        if (continuationImpl instanceof MobilityHubV2OverlayUiStateMapper$mapUiState$1) {
            mobilityHubV2OverlayUiStateMapper$mapUiState$1 = (MobilityHubV2OverlayUiStateMapper$mapUiState$1) continuationImpl;
            int i2 = mobilityHubV2OverlayUiStateMapper$mapUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubV2OverlayUiStateMapper$mapUiState$1.label = i2 - Integer.MIN_VALUE;
                MobilityHubV2OverlayUiStateMapper$mapUiState$1 mobilityHubV2OverlayUiStateMapper$mapUiState$12 = mobilityHubV2OverlayUiStateMapper$mapUiState$1;
                Object obj = mobilityHubV2OverlayUiStateMapper$mapUiState$12.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubV2OverlayUiStateMapper$mapUiState$12.label;
                if (i == 0) {
                    if (i == 1) {
                        list4 = (List) mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$10;
                        kotlin.b.b(obj);
                        return new iw20(list4, (List) obj);
                    }
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return new jw20((exu) obj);
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list6 = (List) mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$10;
                    list7 = (List) mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$9;
                    kotlin.b.b(obj);
                    return new gw20(list6, list7, (List) obj);
                }
                kotlin.b.b(obj);
                if (zzsVar == null) {
                    return hw20.a;
                }
                List A = j73.A(new zzs[]{zzsVar, zzsVar2});
                ArrayList arrayList = new ArrayList();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    atj0 atj0Var3 = (atj0) pair.getFirst();
                    Integer num2 = (Integer) pair.getSecond();
                    n1v o = this.f.o(atj0Var3, zzsVar, zzsVar2, num2 != null ? b(num2.intValue()) : null);
                    if (o != null) {
                        arrayList.add(o);
                    }
                }
                int i3 = lw20.a[hubContentState.ordinal()];
                if (i3 == 1) {
                    List f = f(atj0Var, list2, zzsVar, zzsVar2, null);
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$0 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$1 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$2 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$3 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$4 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$5 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$6 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$7 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$8 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$9 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$10 = f;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.label = 1;
                    Serializable c = c(zzsVar, zzsVar2, mobilityHubV2OverlayUiStateMapper$mapUiState$12);
                    if (c != serializable) {
                        obj = c;
                        list4 = f;
                        return new iw20(list4, (List) obj);
                    }
                } else if (i3 == 2) {
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$0 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$1 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$2 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$3 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$4 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$5 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$6 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$7 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$8 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$9 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.label = 2;
                    obj = g(zzsVar, mobilityHubV2OverlayUiStateMapper$mapUiState$12);
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    if (num != null) {
                        str = b(num.intValue());
                        list5 = list2;
                        atj0Var2 = atj0Var;
                    } else {
                        str = null;
                        atj0Var2 = atj0Var;
                        list5 = list2;
                    }
                    List f2 = f(atj0Var2, list5, zzsVar, zzsVar2, str);
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$0 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$1 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$2 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$3 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$4 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$5 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$6 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$7 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$8 = null;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$9 = arrayList;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.L$10 = f2;
                    mobilityHubV2OverlayUiStateMapper$mapUiState$12.label = 3;
                    Object e = e(A, list, mobilityHubV2OverlayUiStateMapper$mapUiState$12);
                    if (e != serializable) {
                        obj = e;
                        list6 = f2;
                        list7 = arrayList;
                        return new gw20(list6, list7, (List) obj);
                    }
                }
                return serializable;
            }
        }
        mobilityHubV2OverlayUiStateMapper$mapUiState$1 = new MobilityHubV2OverlayUiStateMapper$mapUiState$1(this, continuationImpl);
        MobilityHubV2OverlayUiStateMapper$mapUiState$1 mobilityHubV2OverlayUiStateMapper$mapUiState$122 = mobilityHubV2OverlayUiStateMapper$mapUiState$1;
        Object obj2 = mobilityHubV2OverlayUiStateMapper$mapUiState$122.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubV2OverlayUiStateMapper$mapUiState$122.label;
        if (i == 0) {
        }
    }
}
