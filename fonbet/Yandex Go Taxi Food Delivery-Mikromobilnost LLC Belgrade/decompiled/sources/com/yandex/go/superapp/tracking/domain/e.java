package com.yandex.go.superapp.tracking.domain;

import com.yandex.go.superapp.tracking.api.domain.models.TrackingCardStatus$Image$Clipping;
import com.yandex.go.superapp.tracking.api.domain.models.TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner;
import com.yandex.go.superapp.tracking.models.dto.ImageDto$Tag;
import com.yandex.go.superapp.tracking.models.dto.ImageDto$Url;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardButtonDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardButtonDto$Action$Deeplink;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardPlateNumberImageLayeredDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardPlateNumberImagePlainDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardPlateNumberObjectLayeredImageDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusLeadImageWithOverlayImageDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusSquareImageDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTextDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTrailButtonDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTrailImageWithPlateDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTrailTimelineDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTrailTimerDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardTimerDto;
import com.yandex.go.timer.api.TimerType;
import com.yandex.go.timer.k;
import defpackage.b501;
import defpackage.bdc;
import defpackage.c501;
import defpackage.crg;
import defpackage.d401;
import defpackage.d501;
import defpackage.fef;
import defpackage.g92;
import defpackage.h301;
import defpackage.ha2;
import defpackage.i301;
import defpackage.i401;
import defpackage.j301;
import defpackage.j401;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k301;
import defpackage.k401;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.ksq0;
import defpackage.l301;
import defpackage.l401;
import defpackage.m401;
import defpackage.m7x0;
import defpackage.n401;
import defpackage.ny61;
import defpackage.o401;
import defpackage.p401;
import defpackage.pdc;
import defpackage.r301;
import defpackage.r9v;
import defpackage.rol0;
import defpackage.s301;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.ufu;
import defpackage.w511;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.y401;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.z;

/* loaded from: classes8.dex */
public final class e implements r301 {
    public final crg a;
    public final pdc b;
    public final k c;
    public final k7x0 d;
    public final xdf e;
    public final d501 f;

    public e(crg crgVar, pdc pdcVar, k kVar, k7x0 k7x0Var, xdf xdfVar, d501 d501Var) {
        this.a = crgVar;
        this.b = pdcVar;
        this.c = kVar;
        this.d = k7x0Var;
        this.e = xdfVar;
        this.f = d501Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, TrackingCardButtonDto trackingCardButtonDto, ContinuationImpl continuationImpl) {
        TrackingCardDtoInteractorImpl$toDomainModel$1 trackingCardDtoInteractorImpl$toDomainModel$1;
        int i;
        FormattedText b;
        FormattedText formattedText;
        c501 c501Var;
        TrackingCardButtonDto trackingCardButtonDto2;
        FormattedText formattedText2;
        FormattedText formattedText3;
        l301 d;
        eVar.getClass();
        if (continuationImpl instanceof TrackingCardDtoInteractorImpl$toDomainModel$1) {
            trackingCardDtoInteractorImpl$toDomainModel$1 = (TrackingCardDtoInteractorImpl$toDomainModel$1) continuationImpl;
            int i2 = trackingCardDtoInteractorImpl$toDomainModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingCardDtoInteractorImpl$toDomainModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackingCardDtoInteractorImpl$toDomainModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingCardDtoInteractorImpl$toDomainModel$1.label;
                j301 j301Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText a = trackingCardButtonDto.getA();
                    b = trackingCardButtonDto.getB();
                    String c = trackingCardButtonDto.getC();
                    if (c == null) {
                        formattedText = a;
                        c501Var = null;
                        d = trackingCardButtonDto.getD();
                        if (d instanceof TrackingCardButtonDto$Action$Deeplink) {
                            String a2 = ((TrackingCardButtonDto$Action$Deeplink) d).getA();
                            if (a2 != null) {
                                j301Var = new i301(a2);
                            }
                        } else if (jl40.l(d, com.yandex.go.superapp.tracking.models.dto.c.INSTANCE)) {
                            j301Var = h301.a;
                        } else if (d != null) {
                            w511.b();
                            return null;
                        }
                        return new k301(formattedText, b, c501Var, j301Var);
                    }
                    d501 d501Var = eVar.f;
                    trackingCardDtoInteractorImpl$toDomainModel$1.L$0 = trackingCardButtonDto;
                    trackingCardDtoInteractorImpl$toDomainModel$1.L$1 = null;
                    trackingCardDtoInteractorImpl$toDomainModel$1.L$2 = a;
                    trackingCardDtoInteractorImpl$toDomainModel$1.L$3 = b;
                    trackingCardDtoInteractorImpl$toDomainModel$1.label = 1;
                    Object b2 = ((f) d501Var).b(c, trackingCardDtoInteractorImpl$toDomainModel$1);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    trackingCardButtonDto2 = trackingCardButtonDto;
                    formattedText2 = a;
                    obj = b2;
                    formattedText3 = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    formattedText3 = (FormattedText) trackingCardDtoInteractorImpl$toDomainModel$1.L$3;
                    formattedText2 = (FormattedText) trackingCardDtoInteractorImpl$toDomainModel$1.L$2;
                    trackingCardButtonDto2 = (TrackingCardButtonDto) trackingCardDtoInteractorImpl$toDomainModel$1.L$0;
                    kotlin.b.b(obj);
                }
                c501Var = (c501) obj;
                b = formattedText3;
                formattedText = formattedText2;
                trackingCardButtonDto = trackingCardButtonDto2;
                d = trackingCardButtonDto.getD();
                if (d instanceof TrackingCardButtonDto$Action$Deeplink) {
                }
                return new k301(formattedText, b, c501Var, j301Var);
            }
        }
        trackingCardDtoInteractorImpl$toDomainModel$1 = new TrackingCardDtoInteractorImpl$toDomainModel$1(eVar, continuationImpl);
        Object obj2 = trackingCardDtoInteractorImpl$toDomainModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingCardDtoInteractorImpl$toDomainModel$1.label;
        j301 j301Var2 = null;
        if (i != 0) {
        }
        c501Var = (c501) obj2;
        b = formattedText3;
        formattedText = formattedText2;
        trackingCardButtonDto = trackingCardButtonDto2;
        d = trackingCardButtonDto.getD();
        if (d instanceof TrackingCardButtonDto$Action$Deeplink) {
        }
        return new k301(formattedText, b, c501Var, j301Var2);
    }

    public static g92 d() {
        return new g92(2, null);
    }

    public static ArrayList g(List list) {
        List<Object> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (Object obj : list2) {
            if (obj instanceof FormattedText.h) {
                FormattedText.FontStyle fontStyle = FormattedText.FontStyle.NORMAL;
                jsq0 jsq0Var = ksq0.a;
                obj = FormattedText.h.e((FormattedText.h) obj, null, fontStyle, null, 193);
            } else if (obj instanceof FormattedText.g) {
                FormattedText.g gVar = (FormattedText.g) obj;
                FormattedText.h hVar = gVar.b;
                FormattedText.FontStyle fontStyle2 = FormattedText.FontStyle.NORMAL;
                jsq0 jsq0Var2 = ksq0.a;
                obj = FormattedText.g.e(gVar, FormattedText.h.e(hVar, null, fontStyle2, null, 193));
            } else if (obj instanceof FormattedText.a) {
                FormattedText.a aVar = (FormattedText.a) obj;
                obj = FormattedText.a.e(aVar, g(aVar.b));
            } else if (!(obj instanceof FormattedText.d) && !(obj instanceof FormattedText.e) && !jl40.l(obj, z.INSTANCE)) {
                w511.b();
                return null;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final tpr b(TrackingCardStatusTextDto trackingCardStatusTextDto, fef fefVar) {
        FormattedText a;
        tpr d;
        TimerType timerType;
        if (trackingCardStatusTextDto == null || (a = trackingCardStatusTextDto.getA()) == null) {
            return d();
        }
        TrackingCardTimerDto c = trackingCardStatusTextDto.getC();
        if (c != null) {
            TrackingCardTimerDto.TimerType a2 = c.getA();
            if (a2 != null) {
                int i = s301.b[a2.ordinal()];
                if (i == 1) {
                    timerType = TimerType.Until;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    timerType = TimerType.From;
                }
                if (timerType != null) {
                    Date c2 = this.a.c(c.getB());
                    d = c2 != null ? this.c.c(timerType, c2.getTime()) : d();
                }
            }
            d = d();
        } else {
            d = d();
        }
        return new b(d, this, a, fefVar, trackingCardStatusTextDto);
    }

    public final String c(r9v r9vVar) {
        if (r9vVar instanceof ImageDto$Tag) {
            return ((m7x0) this.d).a(((ImageDto$Tag) r9vVar).getA());
        }
        if (r9vVar instanceof ImageDto$Url) {
            return ((ImageDto$Url) r9vVar).getA();
        }
        if (r9vVar == null) {
            return null;
        }
        w511.b();
        return null;
    }

    public final i401 e(TrackingCardStatusSquareImageDto trackingCardStatusSquareImageDto) {
        String c = c(trackingCardStatusSquareImageDto.getA());
        TrackingCardStatus$Image$Clipping trackingCardStatus$Image$Clipping = null;
        if (c == null) {
            return null;
        }
        TrackingCardStatusSquareImageDto.Clipping b = trackingCardStatusSquareImageDto.getB();
        int i = b == null ? -1 : s301.c[b.ordinal()];
        if (i != -1) {
            if (i == 1) {
                trackingCardStatus$Image$Clipping = TrackingCardStatus$Image$Clipping.RoundedSquare;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                trackingCardStatus$Image$Clipping = TrackingCardStatus$Image$Clipping.Circle;
            }
        }
        return new i401(c, trackingCardStatus$Image$Clipping);
    }

    public final ha2 f(TrackingCardDto trackingCardDto, fef fefVar) {
        p401 p401Var;
        String c;
        TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner;
        tpr d;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        n401 l401Var;
        TimerType timerType;
        y401 a = trackingCardDto.getA().getA();
        int i = 2;
        if (a instanceof TrackingCardStatusSquareImageDto) {
            p401Var = e((TrackingCardStatusSquareImageDto) a);
        } else {
            if (a instanceof TrackingCardStatusLeadImageWithOverlayImageDto) {
                TrackingCardStatusLeadImageWithOverlayImageDto trackingCardStatusLeadImageWithOverlayImageDto = (TrackingCardStatusLeadImageWithOverlayImageDto) a;
                String c2 = c(trackingCardStatusLeadImageWithOverlayImageDto.getA());
                if (c2 != null && (c = c(trackingCardStatusLeadImageWithOverlayImageDto.getB())) != null) {
                    int i2 = s301.a[trackingCardStatusLeadImageWithOverlayImageDto.getC().ordinal()];
                    if (i2 == 1) {
                        trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner = TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner.TopStart;
                    } else if (i2 == 2) {
                        trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner = TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner.TopEnd;
                    } else if (i2 == 3) {
                        trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner = TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner.BottomStart;
                    } else {
                        if (i2 != 4) {
                            w511.b();
                            return null;
                        }
                        trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner = TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner.BottomEnd;
                    }
                    p401Var = new j401(c2, c, trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner);
                }
            } else if (a != null) {
                w511.b();
                return null;
            }
            p401Var = null;
        }
        tpr b = b(trackingCardDto.getA().getB(), fefVar);
        tpr b2 = b(trackingCardDto.getA().getC(), fefVar);
        b501 d2 = trackingCardDto.getA().getD();
        if (d2 instanceof TrackingCardStatusSquareImageDto) {
            d = new g92(i, e((TrackingCardStatusSquareImageDto) d2));
        } else if (d2 instanceof TrackingCardStatusTrailTimerDto) {
            TrackingCardTimerDto a2 = ((TrackingCardStatusTrailTimerDto) d2).getA();
            if (a2 == null) {
                d = d();
            } else {
                TrackingCardTimerDto.TimerType a3 = a2.getA();
                if (a3 != null) {
                    int i3 = s301.b[a3.ordinal()];
                    if (i3 == 1) {
                        timerType = TimerType.Until;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        timerType = TimerType.From;
                    }
                    if (timerType != null) {
                        Date c3 = this.a.c(a2.getB());
                        d = c3 != null ? new d(this.c.c(timerType, c3.getTime())) : d();
                    }
                }
                d = d();
            }
        } else if (d2 instanceof TrackingCardStatusTrailImageWithPlateDto) {
            TrackingCardStatusTrailImageWithPlateDto trackingCardStatusTrailImageWithPlateDto = (TrackingCardStatusTrailImageWithPlateDto) d2;
            d401 a4 = trackingCardStatusTrailImageWithPlateDto.getA();
            if (a4 instanceof TrackingCardPlateNumberImagePlainDto) {
                String c4 = c(((TrackingCardPlateNumberImagePlainDto) a4).getA());
                if (c4 != null) {
                    l401Var = new m401(c4);
                    d = new g92(i, new o401(l401Var, trackingCardStatusTrailImageWithPlateDto.getB()));
                } else {
                    d = d();
                }
            } else if (a4 instanceof TrackingCardPlateNumberImageLayeredDto) {
                TrackingCardPlateNumberObjectLayeredImageDto a5 = ((TrackingCardPlateNumberImageLayeredDto) a4).getA();
                if (a5 != null) {
                    String a6 = a5.getA();
                    if (a6 == null) {
                        d = d();
                    } else {
                        kdc d3 = ((ufu) this.b).d(new bdc(xng0.controlMain), a6);
                        TrackingCardPlateNumberObjectLayeredImageDto.Layers b3 = a5.getB();
                        String a7 = b3 != null ? b3.getA() : null;
                        if (a7 == null) {
                            a7 = "";
                        }
                        TrackingCardPlateNumberObjectLayeredImageDto.Layers b4 = a5.getB();
                        String b5 = b4 != null ? b4.getB() : null;
                        if (b5 == null) {
                            b5 = "";
                        }
                        TrackingCardPlateNumberObjectLayeredImageDto.Layers b6 = a5.getB();
                        String c5 = b6 != null ? b6.getC() : null;
                        if (c5 == null) {
                            c5 = "";
                        }
                        TrackingCardPlateNumberObjectLayeredImageDto.Layers b7 = a5.getB();
                        String d4 = b7 != null ? b7.getD() : null;
                        if (d4 == null) {
                            d4 = "";
                        }
                        TrackingCardPlateNumberObjectLayeredImageDto.Layers b8 = a5.getB();
                        String e = b8 != null ? b8.getE() : null;
                        if (e == null) {
                            e = "";
                        }
                        TrackingCardPlateNumberObjectLayeredImageDto.Layers b9 = a5.getB();
                        String f = b9 != null ? b9.getF() : null;
                        if (f == null) {
                            f = "";
                        }
                        TrackingCardPlateNumberObjectLayeredImageDto.Layers b10 = a5.getB();
                        String g = b10 != null ? b10.getG() : null;
                        if (g == null) {
                            String str7 = f;
                            str6 = "";
                            str = b5;
                            str2 = c5;
                            str3 = d4;
                            str4 = e;
                            str5 = str7;
                        } else {
                            str = b5;
                            str2 = c5;
                            str3 = d4;
                            str4 = e;
                            str5 = f;
                            str6 = g;
                        }
                        l401Var = new l401(d3, new k401(a7, str, str2, str3, str4, str5, str6));
                        d = new g92(i, new o401(l401Var, trackingCardStatusTrailImageWithPlateDto.getB()));
                    }
                } else {
                    d = d();
                }
            } else {
                if (a4 != null) {
                    w511.b();
                    return null;
                }
                d = d();
            }
        } else if (d2 instanceof TrackingCardStatusTrailTimelineDto) {
            TrackingCardStatusTrailTimelineDto.CurrentStatus a8 = ((TrackingCardStatusTrailTimelineDto) d2).getA();
            String c6 = c(a8 != null ? a8.getA() : null);
            d = c6 == null ? d() : new rol0(new TrackingCardDtoInteractorImpl$getStatusTrailFlow$2(c6, d2, this, null));
        } else if (d2 instanceof TrackingCardStatusTrailButtonDto) {
            d = new rol0(new TrackingCardDtoInteractorImpl$getStatusTrailFlow$3(d2, this, null));
        } else {
            if (d2 != null) {
                w511.b();
                return null;
            }
            d = d();
        }
        return kotlinx.coroutines.flow.e.n(b, b2, d, new TrackingCardDtoInteractorImpl$trackingCardFlow$1(p401Var, trackingCardDto, this, null));
    }
}
