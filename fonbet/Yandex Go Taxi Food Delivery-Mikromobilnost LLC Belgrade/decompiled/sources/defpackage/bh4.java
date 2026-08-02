package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorStopDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColoredBackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ImageBackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.LinearGradientBackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.LinearGradientDto;
import ru.yandex.taxi.logistics.sdk.ui_models.background.ScaleType;

/* loaded from: classes5.dex */
public final class bh4 {
    public final vdc a;

    public bh4(vdc vdcVar) {
        this.a = vdcVar;
    }

    public static xiy a(LinearGradientDto linearGradientDto) {
        List<ColorStopDto> colorStops = linearGradientDto.getColorStops();
        ArrayList arrayList = new ArrayList(tcc.n(colorStops, 10));
        for (ColorStopDto colorStopDto : colorStops) {
            arrayList.add(new Pair(Float.valueOf((float) colorStopDto.getPosition()), colorStopDto.getColor()));
        }
        return new xiy(((linearGradientDto.getAngleDeg() + 90.0d) * 3.141592653589793d) / 180.0d, arrayList);
    }

    public final u3b1 b(BackgroundDto backgroundDto) {
        ScaleType scaleType;
        qfc qfcVar;
        ScaleType scaleType2;
        boolean z = backgroundDto instanceof BackgroundDto.Background_ColoredBackgroundDto;
        vdc vdcVar = this.a;
        if (z) {
            ColoredBackgroundDto coloredBackgroundDto = ((BackgroundDto.Background_ColoredBackgroundDto) backgroundDto).b;
            ColorDto color = coloredBackgroundDto.getColor();
            vdcVar.getClass();
            qfc a = vdc.a(color);
            ColorDto rippleColor = coloredBackgroundDto.getRippleColor();
            return new whc(a, rippleColor != null ? vdc.a(rippleColor) : null);
        }
        if (!(backgroundDto instanceof BackgroundDto.Background_ImageBackgroundDto)) {
            if (!(backgroundDto instanceof BackgroundDto.Background_LinearGradientBackgroundDto)) {
                if (backgroundDto instanceof BackgroundDto.Unknown_BackgroundDto) {
                    return o121.a;
                }
                w511.b();
                return null;
            }
            LinearGradientBackgroundDto linearGradientBackgroundDto = ((BackgroundDto.Background_LinearGradientBackgroundDto) backgroundDto).b;
            xiy a2 = a(linearGradientBackgroundDto.getGradientDay());
            xiy a3 = a(linearGradientBackgroundDto.getGradientNight());
            ColorDto rippleColor2 = linearGradientBackgroundDto.getRippleColor();
            if (rippleColor2 != null) {
                vdcVar.getClass();
                r1 = vdc.a(rippleColor2);
            }
            return new riy(a2, a3, r1);
        }
        ImageBackgroundDto imageBackgroundDto = ((BackgroundDto.Background_ImageBackgroundDto) backgroundDto).b;
        String imageTag = imageBackgroundDto.getImageTag();
        Double alpha = imageBackgroundDto.getAlpha();
        Float valueOf = alpha != null ? Float.valueOf((float) alpha.doubleValue()) : null;
        Double scale = imageBackgroundDto.getScale();
        Float valueOf2 = scale != null ? Float.valueOf((float) scale.doubleValue()) : null;
        ImageBackgroundDto.ScaleTypeDto scaleType3 = imageBackgroundDto.getScaleType();
        int i = scaleType3 == null ? -1 : ah4.a[scaleType3.ordinal()];
        if (i != -1) {
            if (i == 1) {
                scaleType2 = ScaleType.ASPECT_FILL;
            } else if (i == 2) {
                scaleType2 = ScaleType.SCALE_TO_FILL;
            } else if (i == 3) {
                scaleType2 = ScaleType.ASPECT_FIT;
            } else {
                if (i != 4) {
                    w511.b();
                    return null;
                }
                scaleType2 = ScaleType.NONE;
            }
            scaleType = scaleType2;
        } else {
            scaleType = null;
        }
        Double horizontalOffsetPt = imageBackgroundDto.getHorizontalOffsetPt();
        Float valueOf3 = horizontalOffsetPt != null ? Float.valueOf((float) horizontalOffsetPt.doubleValue()) : null;
        Double verticalOffsetPt = imageBackgroundDto.getVerticalOffsetPt();
        Float valueOf4 = verticalOffsetPt != null ? Float.valueOf((float) verticalOffsetPt.doubleValue()) : null;
        ColorDto baseColor = imageBackgroundDto.getBaseColor();
        if (baseColor != null) {
            vdcVar.getClass();
            qfcVar = vdc.a(baseColor);
        } else {
            qfcVar = null;
        }
        ColorDto rippleColor3 = imageBackgroundDto.getRippleColor();
        if (rippleColor3 != null) {
            vdcVar.getClass();
            r1 = vdc.a(rippleColor3);
        }
        return new j8v(imageTag, valueOf, valueOf2, scaleType, valueOf3, valueOf4, qfcVar, r1);
    }
}
