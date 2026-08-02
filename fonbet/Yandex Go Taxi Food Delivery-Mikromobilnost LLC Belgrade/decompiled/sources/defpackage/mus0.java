package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.mapper.model.state.Align;
import com.yandex.delivery.mapper.model.state.IconStyleState;
import com.yandex.delivery.mapper.model.state.SlotState$Size;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.IconSpotDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.LeadIconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.SlotBodyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.SlotDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.SlotLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.SlotStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slottrail.SlotTrailDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slottrail.TrailSwitchControlDto;

/* loaded from: classes5.dex */
public final class mus0 {
    public final ow a;
    public final gd3 b;
    public final iv90 c;

    public mus0(ow owVar, gd3 gd3Var, iv90 iv90Var) {
        this.a = owVar;
        this.b = gd3Var;
        this.c = iv90Var;
    }

    public static kus0 a(mus0 mus0Var, SlotDto slotDto) {
        pts0 pts0Var;
        SlotState$Size slotState$Size;
        gws0 gws0Var;
        IconStyleState iconStyleState;
        SlotTrailDto trail1 = slotDto.getTrail1();
        mus0Var.getClass();
        iqs0 b = mus0Var.b(slotDto.getBody1());
        SlotLeadDto lead = slotDto.getLead();
        if (lead == null) {
            pts0Var = null;
        } else if (lead instanceof SlotLeadDto.SlotLead_IconDto) {
            LeadIconDto leadIconDto = ((SlotLeadDto.SlotLead_IconDto) lead).b;
            ImageDto icon = leadIconDto.getIcon();
            j7v j7vVar = new j7v(icon.getImageTag(), icon.getUrl(), icon.getTintColor());
            switch (lus0.b[leadIconDto.getStyle().ordinal()]) {
                case 1:
                    iconStyleState = IconStyleState.ICON;
                    break;
                case 2:
                    iconStyleState = IconStyleState.IMAGE;
                    break;
                case 3:
                    iconStyleState = IconStyleState.BRAND;
                    break;
                case 4:
                    iconStyleState = IconStyleState.PAYMENT;
                    break;
                case 5:
                    iconStyleState = IconStyleState.BRANDXS;
                    break;
                case 6:
                    iconStyleState = IconStyleState.USERPIC;
                    break;
                case 7:
                    iconStyleState = IconStyleState.SERVICE;
                    break;
                default:
                    w511.b();
                    return null;
            }
            pts0Var = new mts0(j7vVar, iconStyleState);
        } else if (lead instanceof SlotLeadDto.SlotLead_IconSpotDto) {
            IconSpotDto iconSpot = ((SlotLeadDto.SlotLead_IconSpotDto) lead).b.getIconSpot();
            ImageDto icon2 = iconSpot.getIcon();
            pts0Var = new nts0(new g5v(new j7v(icon2.getImageTag(), icon2.getUrl(), icon2.getTintColor()), iconSpot.getBackgroundColor()));
        } else {
            if (!(lead instanceof SlotLeadDto.Unknown_SlotLeadDto)) {
                w511.b();
                return null;
            }
            pts0Var = ots0.a;
        }
        SlotBodyDto body2 = slotDto.getBody2();
        iqs0 b2 = body2 != null ? mus0Var.b(body2) : null;
        SlotBodyDto body3 = slotDto.getBody3();
        iqs0 b3 = body3 != null ? mus0Var.b(body3) : null;
        ActionDto action = slotDto.getAction();
        nr h = action != null ? mus0Var.a.h(action) : null;
        SlotStyleDto style = slotDto.getStyle();
        rus0 rus0Var = style != null ? new rus0(style.getHorizontalInset(), style.getBackgroundColor(), style.getBackgroundCornerRadius()) : rus0.d;
        switch (lus0.a[slotDto.getSize().ordinal()]) {
            case 1:
                slotState$Size = SlotState$Size.XS;
                break;
            case 2:
                slotState$Size = SlotState$Size.S;
                break;
            case 3:
                slotState$Size = SlotState$Size.M;
                break;
            case 4:
                slotState$Size = SlotState$Size.L;
                break;
            case 5:
                slotState$Size = SlotState$Size.XL;
                break;
            case 6:
                slotState$Size = SlotState$Size.XXL;
                break;
            default:
                w511.b();
                return null;
        }
        SlotState$Size slotState$Size2 = slotState$Size;
        iv90 iv90Var = mus0Var.c;
        if (trail1 instanceof SlotTrailDto.SlotTrail_SwitchDto) {
            TrailSwitchControlDto trailSwitchControlDto = ((SlotTrailDto.SlotTrail_SwitchDto) trail1).b;
            mu90 mu90Var = new mu90(iv90Var.a.h(trailSwitchControlDto.getAction()), true);
            ActionDto actionOnUnselect = trailSwitchControlDto.getActionOnUnselect();
            gws0Var = new gws0(mu90Var, actionOnUnselect != null ? new mu90(iv90Var.a.h(actionOnUnselect), true) : null, trailSwitchControlDto.getSelected(), trailSwitchControlDto.getMetricaLabel(), trailSwitchControlDto.getEnabled());
        } else {
            if (!(trail1 instanceof SlotTrailDto.SlotTrail_NavDto) && !(trail1 instanceof SlotTrailDto.Unknown_SlotTrailDto) && trail1 != null) {
                w511.b();
                return null;
            }
            gws0Var = null;
        }
        return new kus0(b, pts0Var, b2, b3, h, rus0Var, gws0Var, slotState$Size2);
    }

    public final iqs0 b(SlotBodyDto slotBodyDto) {
        Align align;
        int i = lus0.c[slotBodyDto.getAlign().ordinal()];
        if (i == 1) {
            align = Align.CENTER;
        } else if (i == 2) {
            align = Align.LEADING;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            align = Align.TRAILING;
        }
        AttributedTextDto title = slotBodyDto.getTitle();
        this.b.getClass();
        FormattedText b = gd3.b(title);
        AttributedTextDto subtitle = slotBodyDto.getSubtitle();
        return new iqs0(align, b, subtitle != null ? gd3.b(subtitle) : null);
    }
}
