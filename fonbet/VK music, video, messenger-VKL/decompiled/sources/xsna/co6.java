package xsna;

import android.os.Parcelable;
import com.vk.api.generated.stickers.dto.StickersStickerPopupDto;
import com.vk.api.generated.stickers.dto.StickersStickerPopupLayerDto;
import com.vk.dto.stickers.popup.PopupLayerFitType;
import com.vk.dto.stickers.popup.PopupLayerGradientPositionType;
import com.vk.dto.stickers.popup.PopupLayerPositionXType;
import com.vk.dto.stickers.popup.PopupLayerPositionYType;
import com.vk.dto.stickers.popup.PopupLayerRepeatType;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.dto.stickers.popup.PopupStickerAnimationLayer;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BaseStickerDtoToStickerItemMapper.kt */
/* loaded from: classes3.dex */
public final class co6 {
    public static final PopupStickerAnimation a(StickersStickerPopupDto stickersStickerPopupDto) {
        Parcelable popupStickerGradientLayer;
        String i;
        String str;
        boolean d = stickersStickerPopupDto.d();
        List<StickersStickerPopupLayerDto> e = stickersStickerPopupDto.e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        for (StickersStickerPopupLayerDto stickersStickerPopupLayerDto : e) {
            if (stickersStickerPopupLayerDto instanceof StickersStickerPopupLayerDto.StickersStickerPopupFullscreenAnimationDto) {
                StickersStickerPopupLayerDto.StickersStickerPopupFullscreenAnimationDto stickersStickerPopupFullscreenAnimationDto = (StickersStickerPopupLayerDto.StickersStickerPopupFullscreenAnimationDto) stickersStickerPopupLayerDto;
                PopupLayerPositionXType.a aVar = PopupLayerPositionXType.Companion;
                StickersStickerPopupLayerDto.StickersStickerPopupFullscreenAnimationDto.PositionXDto f = stickersStickerPopupFullscreenAnimationDto.f();
                String i2 = f != null ? f.i() : null;
                if (i2 == null) {
                    i2 = "";
                }
                aVar.getClass();
                PopupLayerPositionXType a = PopupLayerPositionXType.a.a(i2);
                PopupLayerPositionYType.a aVar2 = PopupLayerPositionYType.Companion;
                StickersStickerPopupLayerDto.StickersStickerPopupFullscreenAnimationDto.PositionYDto g = stickersStickerPopupFullscreenAnimationDto.g();
                String i3 = g != null ? g.i() : null;
                if (i3 == null) {
                    i3 = "";
                }
                aVar2.getClass();
                PopupLayerPositionYType a2 = PopupLayerPositionYType.a.a(i3);
                String url = stickersStickerPopupFullscreenAnimationDto.getUrl();
                Integer e2 = stickersStickerPopupFullscreenAnimationDto.e();
                int intValue = e2 != null ? e2.intValue() : 0;
                PopupLayerRepeatType.a aVar3 = PopupLayerRepeatType.Companion;
                StickersStickerPopupLayerDto.StickersStickerPopupFullscreenAnimationDto.RepeatDto i4 = stickersStickerPopupFullscreenAnimationDto.i();
                String i5 = i4 != null ? i4.i() : null;
                if (i5 == null) {
                    i5 = "";
                }
                aVar3.getClass();
                PopupLayerRepeatType a3 = PopupLayerRepeatType.a.a(i5);
                PopupLayerFitType.a aVar4 = PopupLayerFitType.Companion;
                StickersStickerPopupLayerDto.StickersStickerPopupFullscreenAnimationDto.FitDto d2 = stickersStickerPopupFullscreenAnimationDto.d();
                i = d2 != null ? d2.i() : null;
                str = i != null ? i : "";
                aVar4.getClass();
                popupStickerGradientLayer = new PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer(a, a2, url, intValue, a3, PopupLayerFitType.a.a(str), 1.0f);
            } else if (stickersStickerPopupLayerDto instanceof StickersStickerPopupLayerDto.StickersStickerPopupFixedAnimationDto) {
                PopupLayerPositionXType.a aVar5 = PopupLayerPositionXType.Companion;
                StickersStickerPopupLayerDto.StickersStickerPopupFixedAnimationDto stickersStickerPopupFixedAnimationDto = (StickersStickerPopupLayerDto.StickersStickerPopupFixedAnimationDto) stickersStickerPopupLayerDto;
                StickersStickerPopupLayerDto.StickersStickerPopupFixedAnimationDto.PositionXDto e3 = stickersStickerPopupFixedAnimationDto.e();
                String i6 = e3 != null ? e3.i() : null;
                if (i6 == null) {
                    i6 = "";
                }
                aVar5.getClass();
                PopupLayerPositionXType a4 = PopupLayerPositionXType.a.a(i6);
                PopupLayerPositionYType.a aVar6 = PopupLayerPositionYType.Companion;
                StickersStickerPopupLayerDto.StickersStickerPopupFixedAnimationDto.PositionYDto f2 = stickersStickerPopupFixedAnimationDto.f();
                i = f2 != null ? f2.i() : null;
                str = i != null ? i : "";
                aVar6.getClass();
                PopupLayerPositionYType a5 = PopupLayerPositionYType.a.a(str);
                String url2 = stickersStickerPopupFixedAnimationDto.getUrl();
                Integer d3 = stickersStickerPopupFixedAnimationDto.d();
                int intValue2 = d3 != null ? d3.intValue() : 0;
                Float g2 = stickersStickerPopupFixedAnimationDto.g();
                popupStickerGradientLayer = new PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer(a4, a5, url2, intValue2, g2 != null ? g2.floatValue() : 1.0f);
            } else {
                if (!(stickersStickerPopupLayerDto instanceof StickersStickerPopupLayerDto.StickersStickerPopupGradientDto)) {
                    throw new NoWhenBranchMatchedException();
                }
                PopupLayerGradientPositionType.a aVar7 = PopupLayerGradientPositionType.Companion;
                String i7 = ((StickersStickerPopupLayerDto.StickersStickerPopupGradientDto) stickersStickerPopupLayerDto).d().i();
                aVar7.getClass();
                popupStickerGradientLayer = new PopupStickerAnimationLayer.PopupStickerGradientLayer(PopupLayerGradientPositionType.a.a(i7), 1.0f);
            }
            arrayList.add(popupStickerGradientLayer);
        }
        return new PopupStickerAnimation(d, arrayList);
    }
}
