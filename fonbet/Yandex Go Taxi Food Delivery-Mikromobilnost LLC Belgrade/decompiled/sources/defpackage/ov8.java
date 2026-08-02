package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.TextHintPopupDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails.AddressDetailsFieldTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowPlacesSuggestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ClientStateAddressObjectPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ContentAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.LeadIconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PartialProgressBarStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ScaleTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.VerticalContentAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.AddressDetailsBubbleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.AddressWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.BubbleToggleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.BubbleToggleWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ButtonSizeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ButtonStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CollapsedStateConfigDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ContactWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CostDigitsInputTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.DividerWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.FieldDisplayWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ScrollableItemBadgeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SlotDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TagDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TextInputStopWordRuleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TrailButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.UploadedImagesPreviewWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.ArBoxesSmartCameraActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.LimitedCountShowPolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.ModalActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.OpenPlacesSuggestActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.OrderActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.SegmentActionDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ov8 {
    public static final /* synthetic */ int[] A;
    public static final /* synthetic */ int[] B;
    public static final /* synthetic */ int[] C;
    public static final /* synthetic */ int[] D;
    public static final /* synthetic */ int[] E;
    public static final /* synthetic */ int[] F;
    public static final /* synthetic */ int[] G;
    public static final /* synthetic */ int[] H;
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;
    public static final /* synthetic */ int[] h;
    public static final /* synthetic */ int[] i;
    public static final /* synthetic */ int[] j;
    public static final /* synthetic */ int[] k;
    public static final /* synthetic */ int[] l;
    public static final /* synthetic */ int[] m;
    public static final /* synthetic */ int[] n;
    public static final /* synthetic */ int[] o;
    public static final /* synthetic */ int[] p;
    public static final /* synthetic */ int[] q;
    public static final /* synthetic */ int[] r;
    public static final /* synthetic */ int[] s;
    public static final /* synthetic */ int[] t;
    public static final /* synthetic */ int[] u;
    public static final /* synthetic */ int[] v;
    public static final /* synthetic */ int[] w;
    public static final /* synthetic */ int[] x;
    public static final /* synthetic */ int[] y;
    public static final /* synthetic */ int[] z;

    static {
        int[] iArr = new int[TextHintPopupDto.ArrowDirectionDto.values().length];
        try {
            iArr[TextHintPopupDto.ArrowDirectionDto.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextHintPopupDto.ArrowDirectionDto.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextHintPopupDto.ArrowDirectionDto.LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TextHintPopupDto.ArrowDirectionDto.RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[AddressDetailsFieldTypeDto.values().length];
        try {
            iArr2[AddressDetailsFieldTypeDto.PORCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AddressDetailsFieldTypeDto.FLOOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AddressDetailsFieldTypeDto.DOORPHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[AddressDetailsFieldTypeDto.COMMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[AddressDetailsFieldTypeDto.APARTMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[AddressDetailsFieldTypeDto.CONTACT.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
        int[] iArr3 = new int[CollapsedStateConfigDto.InitialStateDto.values().length];
        try {
            iArr3[CollapsedStateConfigDto.InitialStateDto.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[CollapsedStateConfigDto.InitialStateDto.EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        c = iArr3;
        int[] iArr4 = new int[BubbleToggleWidgetDto.ViewModeDto.values().length];
        try {
            iArr4[BubbleToggleWidgetDto.ViewModeDto.ROW.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[BubbleToggleWidgetDto.ViewModeDto.BOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
        int[] iArr5 = new int[DividerWidgetDto.StyleDto.values().length];
        try {
            iArr5[DividerWidgetDto.StyleDto.GROUP_TITLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[DividerWidgetDto.StyleDto.LINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr5[DividerWidgetDto.StyleDto.LINE_MARGIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[DividerWidgetDto.StyleDto.LINE_SLOT.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[DividerWidgetDto.StyleDto.LINE_SLOT_MARGIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[DividerWidgetDto.StyleDto.FOCUS.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[DividerWidgetDto.StyleDto.FOCUS_MARGIN.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr5[DividerWidgetDto.StyleDto.SPACER.ordinal()] = 8;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr5[DividerWidgetDto.StyleDto.GROUP_SEPARATE_TITLES.ordinal()] = 9;
        } catch (NoSuchFieldError unused23) {
        }
        e = iArr5;
        int[] iArr6 = new int[ContentAlignmentDto.values().length];
        try {
            iArr6[ContentAlignmentDto.LEADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr6[ContentAlignmentDto.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[ContentAlignmentDto.TRAILING.ordinal()] = 3;
        } catch (NoSuchFieldError unused26) {
        }
        f = iArr6;
        int[] iArr7 = new int[AddressFlowPlacesSuggestDto.CardsOverMapRevealingDto.values().length];
        try {
            iArr7[AddressFlowPlacesSuggestDto.CardsOverMapRevealingDto.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr7[AddressFlowPlacesSuggestDto.CardsOverMapRevealingDto.COMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused28) {
        }
        g = iArr7;
        int[] iArr8 = new int[FieldDisplayWidgetDto.FieldPositionDto.values().length];
        try {
            iArr8[FieldDisplayWidgetDto.FieldPositionDto.TITLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr8[FieldDisplayWidgetDto.FieldPositionDto.SUBTITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused30) {
        }
        h = iArr8;
        int[] iArr9 = new int[ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.AddressDetailsFieldTypeDto.values().length];
        try {
            iArr9[ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.AddressDetailsFieldTypeDto.PORCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr9[ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.AddressDetailsFieldTypeDto.APARTMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr9[ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.AddressDetailsFieldTypeDto.FLOOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr9[ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.AddressDetailsFieldTypeDto.DOORPHONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr9[ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.AddressDetailsFieldTypeDto.COMMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused35) {
        }
        i = iArr9;
        int[] iArr10 = new int[AddressDetailsBubbleDto.AnchorDto.values().length];
        try {
            iArr10[AddressDetailsBubbleDto.AnchorDto.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr10[AddressDetailsBubbleDto.AnchorDto.TOP_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused37) {
        }
        j = iArr10;
        int[] iArr11 = new int[ScrollableItemBadgeDto.AnchorDto.values().length];
        try {
            iArr11[ScrollableItemBadgeDto.AnchorDto.TRAILING.ordinal()] = 1;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr11[ScrollableItemBadgeDto.AnchorDto.LEADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused39) {
        }
        k = iArr11;
        int[] iArr12 = new int[VerticalContentAlignmentDto.values().length];
        try {
            iArr12[VerticalContentAlignmentDto.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr12[VerticalContentAlignmentDto.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr12[VerticalContentAlignmentDto.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused42) {
        }
        l = iArr12;
        int[] iArr13 = new int[ScaleTypeDto.values().length];
        try {
            iArr13[ScaleTypeDto.SCALE_TO_FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr13[ScaleTypeDto.ASPECT_FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr13[ScaleTypeDto.ASPECT_FILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr13[ScaleTypeDto.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused46) {
        }
        m = iArr13;
        int[] iArr14 = new int[TextInputStopWordRuleDto.RuleTypeDto.values().length];
        try {
            iArr14[TextInputStopWordRuleDto.RuleTypeDto.PREFIX.ordinal()] = 1;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr14[TextInputStopWordRuleDto.RuleTypeDto.SUBSTRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr14[TextInputStopWordRuleDto.RuleTypeDto.WORD.ordinal()] = 3;
        } catch (NoSuchFieldError unused49) {
        }
        n = iArr14;
        int[] iArr15 = new int[AddressWidgetDto.AddressPositionDto.values().length];
        try {
            iArr15[AddressWidgetDto.AddressPositionDto.TITLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr15[AddressWidgetDto.AddressPositionDto.SUBTITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused51) {
        }
        o = iArr15;
        int[] iArr16 = new int[ContactWidgetDto.ContactPositionDto.values().length];
        try {
            iArr16[ContactWidgetDto.ContactPositionDto.TRAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr16[ContactWidgetDto.ContactPositionDto.TITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr16[ContactWidgetDto.ContactPositionDto.SUBTITLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused54) {
        }
        p = iArr16;
        int[] iArr17 = new int[LeadIconDto.StyleDto.values().length];
        try {
            iArr17[LeadIconDto.StyleDto.ICON.ordinal()] = 1;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr17[LeadIconDto.StyleDto.PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr17[LeadIconDto.StyleDto.BRAND.ordinal()] = 3;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr17[LeadIconDto.StyleDto.BRANDXS.ordinal()] = 4;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr17[LeadIconDto.StyleDto.USERPIC.ordinal()] = 5;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr17[LeadIconDto.StyleDto.SERVICE.ordinal()] = 6;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr17[LeadIconDto.StyleDto.IMAGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused61) {
        }
        q = iArr17;
        int[] iArr18 = new int[SlotDto.SizeDto.values().length];
        try {
            iArr18[SlotDto.SizeDto.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr18[SlotDto.SizeDto.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr18[SlotDto.SizeDto.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr18[SlotDto.SizeDto.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr18[SlotDto.SizeDto.XL.ordinal()] = 5;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr18[SlotDto.SizeDto.XXL.ordinal()] = 6;
        } catch (NoSuchFieldError unused67) {
        }
        r = iArr18;
        int[] iArr19 = new int[SegmentActionDto.WidthModeDto.values().length];
        try {
            iArr19[SegmentActionDto.WidthModeDto.WRAP_CONTENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr19[SegmentActionDto.WidthModeDto.FILL_MAX_WIDTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr19[SegmentActionDto.WidthModeDto.FILL_MAX_WIDTH_PROPORTIONALLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused70) {
        }
        s = iArr19;
        int[] iArr20 = new int[OrderActionDto.FlowDto.values().length];
        try {
            iArr20[OrderActionDto.FlowDto.ROUTE_POINTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr20[OrderActionDto.FlowDto.PICKUP_POINTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr20[OrderActionDto.FlowDto.STATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused73) {
        }
        t = iArr20;
        int[] iArr21 = new int[ModalActionDto.TopButtonDto.values().length];
        try {
            iArr21[ModalActionDto.TopButtonDto.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr21[ModalActionDto.TopButtonDto.CLOSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr21[ModalActionDto.TopButtonDto.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused76) {
        }
        u = iArr21;
        int[] iArr22 = new int[ModalActionDto.ModalTypeDto.values().length];
        try {
            iArr22[ModalActionDto.ModalTypeDto.OVER_FORM.ordinal()] = 1;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr22[ModalActionDto.ModalTypeDto.OVER_MAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr22[ModalActionDto.ModalTypeDto.OVER_CAMERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused79) {
        }
        v = iArr22;
        int[] iArr23 = new int[OpenPlacesSuggestActionDto.CardsOverMapRevealingDto.values().length];
        try {
            iArr23[OpenPlacesSuggestActionDto.CardsOverMapRevealingDto.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr23[OpenPlacesSuggestActionDto.CardsOverMapRevealingDto.COMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused81) {
        }
        w = iArr23;
        int[] iArr24 = new int[ArBoxesSmartCameraActionDto.IntentDto.values().length];
        try {
            iArr24[ArBoxesSmartCameraActionDto.IntentDto.RESET.ordinal()] = 1;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr24[ArBoxesSmartCameraActionDto.IntentDto.ROTATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused83) {
        }
        x = iArr24;
        int[] iArr25 = new int[LimitedCountShowPolicyDto.PolicyLifetimeDto.values().length];
        try {
            iArr25[LimitedCountShowPolicyDto.PolicyLifetimeDto.PERSISTENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr25[LimitedCountShowPolicyDto.PolicyLifetimeDto.SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused85) {
        }
        y = iArr25;
        int[] iArr26 = new int[ClientStateAddressObjectPositionDto.AddressPointTypeDto.values().length];
        try {
            iArr26[ClientStateAddressObjectPositionDto.AddressPointTypeDto.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr26[ClientStateAddressObjectPositionDto.AddressPointTypeDto.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr26[ClientStateAddressObjectPositionDto.AddressPointTypeDto.TRANSIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused88) {
        }
        z = iArr26;
        int[] iArr27 = new int[TrailButtonDto.ButtonStyleDto.values().length];
        try {
            iArr27[TrailButtonDto.ButtonStyleDto.OUTLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr27[TrailButtonDto.ButtonStyleDto.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr27[TrailButtonDto.ButtonStyleDto.MINOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused91) {
        }
        A = iArr27;
        int[] iArr28 = new int[ButtonStyleDto.StyleDto.values().length];
        try {
            iArr28[ButtonStyleDto.StyleDto.FLOATING.ordinal()] = 1;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr28[ButtonStyleDto.StyleDto.MINOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr28[ButtonStyleDto.StyleDto.OUTLINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr28[ButtonStyleDto.StyleDto.GHOST.ordinal()] = 4;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr28[ButtonStyleDto.StyleDto.MAIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused96) {
        }
        B = iArr28;
        int[] iArr29 = new int[BubbleToggleDto.SizeDto.values().length];
        try {
            iArr29[BubbleToggleDto.SizeDto.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr29[BubbleToggleDto.SizeDto.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr29[BubbleToggleDto.SizeDto.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr29[BubbleToggleDto.SizeDto.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused100) {
        }
        C = iArr29;
        int[] iArr30 = new int[TagDto.IconPositionDto.values().length];
        try {
            iArr30[TagDto.IconPositionDto.LEAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr30[TagDto.IconPositionDto.TRAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused102) {
        }
        D = iArr30;
        int[] iArr31 = new int[ButtonSizeDto.values().length];
        try {
            iArr31[ButtonSizeDto.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr31[ButtonSizeDto.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr31[ButtonSizeDto.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr31[ButtonSizeDto.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused106) {
        }
        E = iArr31;
        int[] iArr32 = new int[PartialProgressBarStyleDto.PartialsSidesStyleDto.values().length];
        try {
            iArr32[PartialProgressBarStyleDto.PartialsSidesStyleDto.ROUNDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            iArr32[PartialProgressBarStyleDto.PartialsSidesStyleDto.SQUARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused108) {
        }
        F = iArr32;
        int[] iArr33 = new int[CostDigitsInputTypeDto.CurrencySymbolAnchorDto.values().length];
        try {
            iArr33[CostDigitsInputTypeDto.CurrencySymbolAnchorDto.TRAILING.ordinal()] = 1;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            iArr33[CostDigitsInputTypeDto.CurrencySymbolAnchorDto.LEADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused110) {
        }
        G = iArr33;
        int[] iArr34 = new int[UploadedImagesPreviewWidgetDto.SizeDto.values().length];
        try {
            iArr34[UploadedImagesPreviewWidgetDto.SizeDto.M.ordinal()] = 1;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            iArr34[UploadedImagesPreviewWidgetDto.SizeDto.L.ordinal()] = 2;
        } catch (NoSuchFieldError unused112) {
        }
        H = iArr34;
    }
}
