package com.yandex.go.places.experiments.map.pin_war_v2;

import com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment;
import com.yandex.go.places.map.domain.entities.PlacesPinWarV2Config$LabelRenderingMode;
import com.yandex.go.places.map.domain.entities.PlacesPinWarV2Config$PinStyle;
import com.yandex.go.places.map.domain.entities.PlacesPinWarV2Config$ZoomStep;
import defpackage.an91;
import defpackage.i3y;
import defpackage.iq31;
import defpackage.jdc0;
import defpackage.jl40;
import defpackage.kdc0;
import defpackage.ldc0;
import defpackage.mdc0;
import defpackage.ndc0;
import defpackage.ny61;
import defpackage.odc0;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.t9b0;
import defpackage.w511;
import defpackage.zm91;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class o {
    public final rqo a;
    public final n b;
    public final i3y c = kotlin.a.b(LazyThreadSafetyMode.NONE, new t9b0(24, this));

    public o(rqo rqoVar, n nVar) {
        this.a = rqoVar;
        this.b = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d4, code lost:
    
        if (r4 == null) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PlacesPinWarV2ExperimentRepository$getPinWarV2Config$1 placesPinWarV2ExperimentRepository$getPinWarV2Config$1;
        int i;
        n nVar;
        boolean z;
        PlacesPinWarV2Config$ZoomStep placesPinWarV2Config$ZoomStep;
        an91 ldc0Var;
        PlacesPinWarV2Experiment.TextLinesConfig textLinesConfig;
        int i2;
        int i3;
        PlacesPinWarV2Config$LabelRenderingMode placesPinWarV2Config$LabelRenderingMode;
        PlacesPinWarV2Experiment.LabelRenderingMode labelRenderingMode;
        int i4;
        PlacesPinWarV2Experiment.TextLinesLimit textLinesLimit;
        Integer num;
        PlacesPinWarV2Experiment.TextLinesLimit textLinesLimit2;
        Integer num2;
        List list;
        Object obj;
        if (continuationImpl instanceof PlacesPinWarV2ExperimentRepository$getPinWarV2Config$1) {
            placesPinWarV2ExperimentRepository$getPinWarV2Config$1 = (PlacesPinWarV2ExperimentRepository$getPinWarV2Config$1) continuationImpl;
            int i5 = placesPinWarV2ExperimentRepository$getPinWarV2Config$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                placesPinWarV2ExperimentRepository$getPinWarV2Config$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = placesPinWarV2ExperimentRepository$getPinWarV2Config$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesPinWarV2ExperimentRepository$getPinWarV2Config$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    t1b0 t1b0Var = (t1b0) this.c.getValue();
                    nVar = this.b;
                    placesPinWarV2ExperimentRepository$getPinWarV2Config$1.L$0 = nVar;
                    placesPinWarV2ExperimentRepository$getPinWarV2Config$1.label = 1;
                    obj2 = t1b0Var.b(placesPinWarV2ExperimentRepository$getPinWarV2Config$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = (n) placesPinWarV2ExperimentRepository$getPinWarV2Config$1.L$0;
                    kotlin.b.b(obj2);
                }
                PlacesPinWarV2Experiment placesPinWarV2Experiment = (PlacesPinWarV2Experiment) obj2;
                nVar.getClass();
                z = placesPinWarV2Experiment.b;
                PlacesPinWarV2Experiment.Clustering clustering = placesPinWarV2Experiment.i;
                an91 an91Var = kdc0.a;
                if (z) {
                    return new odc0(0.8f, 8.0f, 19, new iq31(12.5f, 0.5f), new iq31(1.5f, 0.1f), new iq31(3.5f, 0.1f), new ndc0(kotlin.collections.b.f()), an91Var, null, jdc0.g);
                }
                Float f = placesPinWarV2Experiment.c;
                float floatValue = f != null ? f.floatValue() : 0.8f;
                Float f2 = placesPinWarV2Experiment.d;
                float floatValue2 = f2 != null ? f2.floatValue() : 8.0f;
                Integer num3 = placesPinWarV2Experiment.e;
                int intValue = num3 != null ? num3.intValue() : 19;
                iq31 c = n.c(placesPinWarV2Experiment.f, 12.5f, 0.5f);
                iq31 c2 = n.c(placesPinWarV2Experiment.g, 1.5f, 0.1f);
                iq31 c3 = n.c(placesPinWarV2Experiment.h, 3.5f, 0.1f);
                PlacesPinWarV2Experiment.PinStyleVariantConfig pinStyleVariantConfig = placesPinWarV2Experiment.l;
                PlacesPinWarV2Experiment.PinStyleVariantConfig pinStyleVariantConfig2 = clustering.h;
                boolean z2 = clustering.a;
                if (pinStyleVariantConfig2 != null) {
                    if (!z2) {
                        pinStyleVariantConfig2 = null;
                    }
                    if (pinStyleVariantConfig2 != null) {
                        pinStyleVariantConfig = pinStyleVariantConfig2;
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (PlacesPinWarV2Config$PinStyle placesPinWarV2Config$PinStyle : PlacesPinWarV2Config$PinStyle.a()) {
                    if (pinStyleVariantConfig == null || (list = pinStyleVariantConfig.a) == null) {
                        textLinesConfig = null;
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (jl40.l(((PlacesPinWarV2Experiment.TextLinesConfig) obj).a, placesPinWarV2Config$PinStyle.getStyleKey())) {
                                break;
                            }
                        }
                        textLinesConfig = (PlacesPinWarV2Experiment.TextLinesConfig) obj;
                    }
                    if (textLinesConfig != null && (textLinesLimit2 = textLinesConfig.b) != null && (num2 = textLinesLimit2.a) != null) {
                        if (num2.intValue() <= 0) {
                            num2 = null;
                        }
                        if (num2 != null) {
                            i2 = num2.intValue();
                            if (textLinesConfig != null && (textLinesLimit = textLinesConfig.b) != null && (num = textLinesLimit.b) != null) {
                                if (num.intValue() <= 0) {
                                    num = null;
                                }
                                if (num != null) {
                                    i3 = num.intValue();
                                    if (textLinesConfig != null && (labelRenderingMode = textLinesConfig.c) != null) {
                                        i4 = m.a[labelRenderingMode.ordinal()];
                                        if (i4 != 1) {
                                            placesPinWarV2Config$LabelRenderingMode = PlacesPinWarV2Config$LabelRenderingMode.INDEPENDENT_LABEL;
                                        } else {
                                            if (i4 != 2) {
                                                w511.b();
                                                return null;
                                            }
                                            placesPinWarV2Config$LabelRenderingMode = PlacesPinWarV2Config$LabelRenderingMode.EMBEDDED_IN_ICON;
                                        }
                                        if (placesPinWarV2Config$LabelRenderingMode != null) {
                                            linkedHashMap.put(placesPinWarV2Config$PinStyle, new mdc0(i2, i3, placesPinWarV2Config$LabelRenderingMode));
                                        }
                                    }
                                    placesPinWarV2Config$LabelRenderingMode = PlacesPinWarV2Config$LabelRenderingMode.INDEPENDENT_LABEL;
                                    linkedHashMap.put(placesPinWarV2Config$PinStyle, new mdc0(i2, i3, placesPinWarV2Config$LabelRenderingMode));
                                }
                            }
                            i3 = 1;
                            if (textLinesConfig != null) {
                                i4 = m.a[labelRenderingMode.ordinal()];
                                if (i4 != 1) {
                                }
                                if (placesPinWarV2Config$LabelRenderingMode != null) {
                                }
                            }
                            placesPinWarV2Config$LabelRenderingMode = PlacesPinWarV2Config$LabelRenderingMode.INDEPENDENT_LABEL;
                            linkedHashMap.put(placesPinWarV2Config$PinStyle, new mdc0(i2, i3, placesPinWarV2Config$LabelRenderingMode));
                        }
                    }
                    i2 = 2;
                    if (textLinesConfig != null) {
                        if (num.intValue() <= 0) {
                        }
                        if (num != null) {
                        }
                    }
                    i3 = 1;
                    if (textLinesConfig != null) {
                    }
                    placesPinWarV2Config$LabelRenderingMode = PlacesPinWarV2Config$LabelRenderingMode.INDEPENDENT_LABEL;
                    linkedHashMap.put(placesPinWarV2Config$PinStyle, new mdc0(i2, i3, placesPinWarV2Config$LabelRenderingMode));
                }
                ndc0 ndc0Var = new ndc0(linkedHashMap);
                if (z2) {
                    Integer num4 = clustering.b;
                    int intValue2 = num4 != null ? num4.intValue() : 16;
                    Float f3 = clustering.c;
                    float floatValue3 = f3 != null ? f3.floatValue() : 60.0f;
                    zm91 b = n.b(clustering.d);
                    PlacesPinWarV2Experiment.ZoomStep zoomStep = clustering.e;
                    if (zoomStep != null) {
                        int i6 = m.c[zoomStep.ordinal()];
                        if (i6 == 1) {
                            placesPinWarV2Config$ZoomStep = PlacesPinWarV2Config$ZoomStep.FULL;
                        } else if (i6 == 2) {
                            placesPinWarV2Config$ZoomStep = PlacesPinWarV2Config$ZoomStep.HALF;
                        } else if (i6 == 3) {
                            placesPinWarV2Config$ZoomStep = PlacesPinWarV2Config$ZoomStep.QUARTER;
                        } else {
                            if (i6 != 4) {
                                w511.b();
                                return null;
                            }
                            placesPinWarV2Config$ZoomStep = PlacesPinWarV2Config$ZoomStep.EIGHTH;
                        }
                    }
                    placesPinWarV2Config$ZoomStep = PlacesPinWarV2Config$ZoomStep.HALF;
                    ldc0Var = new ldc0(intValue2, floatValue3, b, placesPinWarV2Config$ZoomStep, n.a(clustering.f), clustering.g, nVar.a.b(clustering.i));
                } else {
                    ldc0Var = an91Var;
                }
                return new odc0(floatValue, floatValue2, intValue, c, c2, c3, ndc0Var, ldc0Var, n.a(placesPinWarV2Experiment.j), n.b(placesPinWarV2Experiment.k));
            }
        }
        placesPinWarV2ExperimentRepository$getPinWarV2Config$1 = new PlacesPinWarV2ExperimentRepository$getPinWarV2Config$1(this, continuationImpl);
        Object obj22 = placesPinWarV2ExperimentRepository$getPinWarV2Config$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesPinWarV2ExperimentRepository$getPinWarV2Config$1.label;
        if (i != 0) {
        }
        PlacesPinWarV2Experiment placesPinWarV2Experiment2 = (PlacesPinWarV2Experiment) obj22;
        nVar.getClass();
        z = placesPinWarV2Experiment2.b;
        PlacesPinWarV2Experiment.Clustering clustering2 = placesPinWarV2Experiment2.i;
        an91 an91Var2 = kdc0.a;
        if (z) {
        }
    }
}
