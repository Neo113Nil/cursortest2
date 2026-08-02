package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.attrbutedtext.api.TruncationMode;
import com.yandex.delivery.mapper.model.CardsRevealing;
import com.yandex.delivery.mapper.model.PartialProgressBarStyleSidesModel;
import com.yandex.delivery.mapper.model.policies.ShowPolicy$LimitedCount$Lifetime;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.ScaleType;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.SlotLeadModel$LeadIcon$IconStyle;
import ru.yandex.logistics.sdk.cargo_form.impl.model.address.AddressPositionModel;
import ru.yandex.logistics.sdk.cargo_form.impl.model.address.PointType;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.Align;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.IconPosition;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.SlotModel$Size;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$ArBoxesSmartCameraAction$Intent;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$ModalAction$ModalType;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$OrderAction$Flow;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.BubblePosition;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.BubbleToggleModel$Size;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ButtonSize;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ContactSelectorRemoteCoreWidget$ContactPositionModel;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.CurrencySymbolAnchor;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.DividerStyle;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.FieldPosition;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ScenarioSelectorState;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ScrollableItemBadge$Anchor;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.SeparateTitle$Align;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.Style;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.TextAlignment;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.UploadedImagesPreviewSize;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.VerticalContentAlignment;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ViewMode;
import ru.yandex.sdk.common.StopWordRule$RuleType;
import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.OpeningSource;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointCommentImageDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointContactDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails.AddressDetailsBubbleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails.AddressDetailsFieldTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails.AddressDetailsHeaderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails.AddressDetailsLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails.RoutePointDescriptionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails.VerticalBarDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AccessibilityInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressCoordinateSourceDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowIntercityDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowPickupPointDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowPlacesSuggestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowSuggestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressRouteTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.BackgroundContentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.BackgroundContentWrapperDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.CityDiscoveryScreenDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ClientStateAddressObjectPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ContentAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.CoordinateSourceDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.FormBadgeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.GradientBackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.GradientColorStopDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.GraphicShapeGeometryDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.HorizontalPaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.IconSpotDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageBackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.LayoutDistributionPolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.LeadIconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.LeadIconSpotDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.LinearGradientDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.MapPinDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PartialProgressBarStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ProgressBarDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ProgressBarStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.RectangleGeometryDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.RoutePointPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.RoutePointsIntervalDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ScaleTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ShapeBackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SlotLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SolidBackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.UploadImagesConstrainsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.VerticalContentAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.VideoBackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ActionButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ActionButtonWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.AddressDetailsInputFieldWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.AddressWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.AttributedImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.BannerCarouselDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.BorderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.BubbleToggleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.BubbleToggleWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ButtonSizeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ButtonStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ButtonsRowButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ButtonsRowButtonWidthDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ButtonsRowWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CarouselIndicatorsStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CarouselItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CarouselItemsWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CartWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CartWidgetLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CartWidgetLeadImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CollapsedStateConfigDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ContactPrefillDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ContactWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CostDetailWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CostDigitsInputTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CounterWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CustomButtonStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.DigitsInputTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.DigitsInputWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.DiscountWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.DividerWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.EditableRouteWidgetsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.FieldDisplayWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.FormStateTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.GridItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.GridLayoutPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.GridLayoutSizeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.GridLayoutWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.HeaderWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.HorizontalStackWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.HorizontalStackWidgetItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ImageWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.InputCircleIconMatchDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.InputCircleIconMatchesDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.InputCircleInputValueDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.InputCircleValueStepDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.InputCircleWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.InputTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.LoadingSpinnerWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.LottieAnimationDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.MiniMapWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.MultiAddressWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.NotificationWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.NumberInputTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.NumericInputWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.PaymentButtonWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.PaymentMethodWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.PickerColumnDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.PickerColumnLayoutPolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.PickerOptionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.PickerWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.PickerWidgetStateDependencyItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ProgressWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.RoutePointWidgetConfigurationDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.RoutePointWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ScalableSelectorOptionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ScalableSelectorStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ScalableSelectorWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ScenarioSelectorOptionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ScenarioSelectorWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ScrollableItemBadgeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ScrollableItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ScrollableItemsWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SectionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SectionPromoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SegmentWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SelectorOptionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SelectorWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ShortcutContentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ShortcutLayerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ShortcutWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SliderButtonContentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SliderButtonWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SliderHandlerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SlotBodyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SlotDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SlotStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SlotTrailDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SlotWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.StaticImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TabOptionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TabsWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TagDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TagLineWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TextInputStopWordRuleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TextInputStopWordsConfigDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TextInputStopWordsItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TextInputStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TextInputWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TextParametersDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TextWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TrailNavDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TrailTwoButtonsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.UploadedImagesPreviewWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.VerticalStackWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ViewModeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.WidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.b;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.c;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.d;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.e;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.f;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.g;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.h;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.i;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.AddDestinationActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.AddPhotocommentsActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.AiChatActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.AiChatMessageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.AsyncActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.CardModeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.ChangePointsOrderActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.ClientStateTransformerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.ClosePolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.CopyClientStateTransformerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.CounterActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.CounterOptionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.DueButtonPropertiesDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.DueButtonsConfigDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.FullsizePopupDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.LimitedCountShowPolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.ModalActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.OpenMapActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.OpenPlacesSuggestActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.OpenWebViewActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.OrderActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.RoutePointDetailsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.SegmentActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.SegmentHintDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.SegmentOptionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.SegmentTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.SelectAddressActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.SelectContactActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.SelectDueActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.ShowPolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TimeIntervalDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TimePickerSlotsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.WrapContentHeightDto;

/* loaded from: classes5.dex */
public final class pv8 implements o4s {
    public static final Pair c = new Pair(2, 2);
    public final gd3 a;
    public final jwh b;

    public pv8(gd3 gd3Var, jwh jwhVar) {
        this.a = gd3Var;
        this.b = jwhVar;
    }

    public static qg4 A(BackgroundContentDto backgroundContentDto) {
        i0u i0uVar;
        if (backgroundContentDto instanceof BackgroundContentDto.BackgroundContent_SolidDto) {
            SolidBackgroundDto solidBackgroundDto = ((BackgroundContentDto.BackgroundContent_SolidDto) backgroundContentDto).b;
            String color = solidBackgroundDto.getColor();
            Double alpha = solidBackgroundDto.getAlpha();
            return new og4(color, alpha != null ? Float.valueOf((float) alpha.doubleValue()) : null);
        }
        if (backgroundContentDto instanceof BackgroundContentDto.BackgroundContent_GradientDto) {
            GradientBackgroundDto gradientBackgroundDto = ((BackgroundContentDto.BackgroundContent_GradientDto) backgroundContentDto).b;
            yiy K = K(gradientBackgroundDto.getLightGradient());
            LinearGradientDto darkGradient = gradientBackgroundDto.getDarkGradient();
            return new lg4(K, darkGradient != null ? K(darkGradient) : null);
        }
        if (backgroundContentDto instanceof BackgroundContentDto.BackgroundContent_ImageDto) {
            ImageBackgroundDto imageBackgroundDto = ((BackgroundContentDto.BackgroundContent_ImageDto) backgroundContentDto).b;
            sbv J = J(imageBackgroundDto.getImage());
            Double alpha2 = imageBackgroundDto.getAlpha();
            Float valueOf = alpha2 != null ? Float.valueOf((float) alpha2.doubleValue()) : null;
            ScaleTypeDto scaleType = imageBackgroundDto.getScaleType();
            return new mg4(J, valueOf, scaleType != null ? O(scaleType) : null);
        }
        if (backgroundContentDto instanceof BackgroundContentDto.BackgroundContent_ShapeDto) {
            ShapeBackgroundDto shapeBackgroundDto = ((BackgroundContentDto.BackgroundContent_ShapeDto) backgroundContentDto).b;
            GraphicShapeGeometryDto geometry = shapeBackgroundDto.getShape().getGeometry();
            if (geometry instanceof GraphicShapeGeometryDto.GraphicShapeGeometry_RectDto) {
                RectangleGeometryDto rectangleGeometryDto = ((GraphicShapeGeometryDto.GraphicShapeGeometry_RectDto) geometry).b;
                i0uVar = new i0u(rectangleGeometryDto.getOriginX(), rectangleGeometryDto.getOriginY(), rectangleGeometryDto.getWidth(), rectangleGeometryDto.getHeight(), Integer.valueOf(rectangleGeometryDto.getCornerRadius()));
            } else {
                if (!(geometry instanceof GraphicShapeGeometryDto.Unknown_GraphicShapeGeometryDto)) {
                    w511.b();
                    return null;
                }
                i0uVar = null;
            }
            if (i0uVar == null) {
                return null;
            }
            return new ng4(new h0u(i0uVar, shapeBackgroundDto.getShape().getColor(), Double.valueOf(shapeBackgroundDto.getShape().getBorderWidth()), shapeBackgroundDto.getShape().getBorderColor()));
        }
        if (!(backgroundContentDto instanceof BackgroundContentDto.BackgroundContent_VideoDto)) {
            if (backgroundContentDto instanceof BackgroundContentDto.Unknown_BackgroundContentDto) {
                return null;
            }
            w511.b();
            return null;
        }
        VideoBackgroundDto videoBackgroundDto = ((BackgroundContentDto.BackgroundContent_VideoDto) backgroundContentDto).b;
        String videoUrl = videoBackgroundDto.getVideoUrl();
        Double alpha3 = videoBackgroundDto.getAlpha();
        Float valueOf2 = alpha3 != null ? Float.valueOf((float) alpha3.doubleValue()) : null;
        ScaleTypeDto scaleType2 = videoBackgroundDto.getScaleType();
        ScaleType O = scaleType2 != null ? O(scaleType2) : null;
        boolean loop = videoBackgroundDto.getLoop();
        boolean muted = videoBackgroundDto.getMuted();
        BackgroundContentWrapperDto previewContent = videoBackgroundDto.getPreviewContent();
        return new pg4(videoUrl, valueOf2, O, loop, muted, previewContent != null ? A(previewContent.getContent()) : null);
    }

    public static ul4 B(FormBadgeDto formBadgeDto) {
        return new ul4(formBadgeDto.getText(), formBadgeDto.getTextColor(), formBadgeDto.getBackgroundColor());
    }

    public static ButtonSize C(ButtonSizeDto buttonSizeDto) {
        int i = ov8.E[buttonSizeDto.ordinal()];
        if (i == 1) {
            return ButtonSize.XS;
        }
        if (i == 2) {
            return ButtonSize.S;
        }
        if (i == 3) {
            return ButtonSize.M;
        }
        if (i == 4) {
            return ButtonSize.L;
        }
        w511.b();
        return null;
    }

    public static t1y E(ButtonsRowButtonWidthDto buttonsRowButtonWidthDto) {
        if (buttonsRowButtonWidthDto instanceof ButtonsRowButtonWidthDto.ButtonsRowButtonWidth_ConstDto) {
            return new q1y(((ButtonsRowButtonWidthDto.ButtonsRowButtonWidth_ConstDto) buttonsRowButtonWidthDto).b.getWidth());
        }
        if (buttonsRowButtonWidthDto instanceof ButtonsRowButtonWidthDto.ButtonsRowButtonWidth_PercentDto) {
            return new s1y(((ButtonsRowButtonWidthDto.ButtonsRowButtonWidth_PercentDto) buttonsRowButtonWidthDto).b.getPercent());
        }
        boolean z = buttonsRowButtonWidthDto instanceof ButtonsRowButtonWidthDto.ButtonsRowButtonWidth_WrapDto;
        r1y r1yVar = r1y.a;
        if (z || (buttonsRowButtonWidthDto instanceof ButtonsRowButtonWidthDto.ButtonsRowButtonWidth_FillDto) || (buttonsRowButtonWidthDto instanceof ButtonsRowButtonWidthDto.Unknown_ButtonsRowButtonWidthDto)) {
            return r1yVar;
        }
        w511.b();
        return null;
    }

    public static ContentAlignment F(ContentAlignmentDto contentAlignmentDto) {
        int i = contentAlignmentDto == null ? -1 : ov8.f[contentAlignmentDto.ordinal()];
        return i != 2 ? i != 3 ? ContentAlignment.LEADING : ContentAlignment.TRAILING : ContentAlignment.CENTER;
    }

    public static o690 I(HorizontalPaddingsDto horizontalPaddingsDto) {
        Integer lead = horizontalPaddingsDto.getLead();
        int intValue = lead != null ? lead.intValue() : 0;
        Integer trail = horizontalPaddingsDto.getTrail();
        return new o690(intValue, trail != null ? trail.intValue() : 0, 0, 0);
    }

    public static sbv J(ImageDto imageDto) {
        return new sbv(imageDto.getImageTag(), imageDto.getUrl(), imageDto.getTintColor());
    }

    public static yiy K(LinearGradientDto linearGradientDto) {
        List<GradientColorStopDto> colorStops = linearGradientDto.getColorStops();
        ArrayList arrayList = new ArrayList(tcc.n(colorStops, 10));
        for (GradientColorStopDto gradientColorStopDto : colorStops) {
            double position = gradientColorStopDto.getPosition();
            String color = gradientColorStopDto.getColor();
            Double alpha = gradientColorStopDto.getAlpha();
            arrayList.add(new jxt(position, color, alpha != null ? Float.valueOf((float) alpha.doubleValue()) : null));
        }
        return new yiy(((linearGradientDto.getAngle() + 90.0d) * 3.141592653589793d) / 180.0d, arrayList);
    }

    public static o690 L(PaddingsDto paddingsDto) {
        Integer lead = paddingsDto.getLead();
        int intValue = lead != null ? lead.intValue() : 0;
        Integer trail = paddingsDto.getTrail();
        int intValue2 = trail != null ? trail.intValue() : 0;
        Integer top = paddingsDto.getTop();
        int intValue3 = top != null ? top.intValue() : 0;
        Integer bottom = paddingsDto.getBottom();
        return new o690(intValue, intValue2, intValue3, bottom != null ? bottom.intValue() : 0);
    }

    public static c0k0 N(ResultPositionDto resultPositionDto) {
        PointType pointType;
        if (resultPositionDto instanceof ResultPositionDto.ResultPosition_RoutePointDto) {
            RoutePointPositionDto routePointPositionDto = ((ResultPositionDto.ResultPosition_RoutePointDto) resultPositionDto).b;
            return new yzj0(routePointPositionDto.getAddressPointIndex().getRoutePointIndex(), y(routePointPositionDto.getAddressPointIndex().getRouteType(), null));
        }
        if (resultPositionDto instanceof ResultPositionDto.ResultPosition_ClientStateDto) {
            return new zzj0(((ResultPositionDto.ResultPosition_ClientStateDto) resultPositionDto).b.getFormStateKey());
        }
        if (!(resultPositionDto instanceof ResultPositionDto.ResultPosition_ClientStateAddressDto)) {
            if (resultPositionDto instanceof ResultPositionDto.Unknown_ResultPositionDto) {
                return null;
            }
            w511.b();
            return null;
        }
        ClientStateAddressObjectPositionDto clientStateAddressObjectPositionDto = ((ResultPositionDto.ResultPosition_ClientStateAddressDto) resultPositionDto).b;
        String formStateKey = clientStateAddressObjectPositionDto.getFormStateKey();
        int i = ov8.z[clientStateAddressObjectPositionDto.getAddressPointType().ordinal()];
        if (i == 1) {
            pointType = PointType.SOURCE;
        } else if (i == 2) {
            pointType = PointType.DESTINATION;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            pointType = PointType.TRANSIT;
        }
        return new a0k0(formStateKey, pointType);
    }

    public static ScaleType O(ScaleTypeDto scaleTypeDto) {
        int i = ov8.m[scaleTypeDto.ordinal()];
        if (i == 1) {
            return ScaleType.SCALE_TO_FILL;
        }
        if (i == 2) {
            return ScaleType.ASPECT_FIT;
        }
        if (i == 3) {
            return ScaleType.ASPECT_FILL;
        }
        if (i == 4) {
            return ScaleType.NONE;
        }
        w511.b();
        return null;
    }

    public static l8s0 Q(ShowPolicyDto showPolicyDto) {
        ShowPolicy$LimitedCount$Lifetime showPolicy$LimitedCount$Lifetime;
        if (!(showPolicyDto instanceof ShowPolicyDto.ShowPolicy_LimitedDto)) {
            if (showPolicyDto instanceof ShowPolicyDto.Unknown_ShowPolicyDto) {
                return null;
            }
            w511.b();
            return null;
        }
        LimitedCountShowPolicyDto limitedCountShowPolicyDto = ((ShowPolicyDto.ShowPolicy_LimitedDto) showPolicyDto).b;
        String cacheKey = limitedCountShowPolicyDto.getCacheKey();
        int maxShowCount = limitedCountShowPolicyDto.getMaxShowCount();
        int i = ov8.y[limitedCountShowPolicyDto.getPolicyLifetime().ordinal()];
        if (i == 1) {
            showPolicy$LimitedCount$Lifetime = ShowPolicy$LimitedCount$Lifetime.PERSISTENT;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            showPolicy$LimitedCount$Lifetime = ShowPolicy$LimitedCount$Lifetime.SESSION;
        }
        return new l8s0(cacheKey, maxShowCount, showPolicy$LimitedCount$Lifetime);
    }

    public static lts0 U(SlotLeadDto slotLeadDto) {
        SlotLeadModel$LeadIcon$IconStyle slotLeadModel$LeadIcon$IconStyle;
        if (slotLeadDto instanceof SlotLeadDto.SlotLead_IconSpotDto) {
            IconSpotDto iconSpot = ((SlotLeadDto.SlotLead_IconSpotDto) slotLeadDto).b.getIconSpot();
            return new jts0(new f5v(J(iconSpot.getIcon()), iconSpot.getBackgroundColor(), iconSpot.getCornerRadius()));
        }
        if (!(slotLeadDto instanceof SlotLeadDto.SlotLead_IconDto)) {
            if (slotLeadDto instanceof SlotLeadDto.Unknown_SlotLeadDto) {
                return kts0.a;
            }
            w511.b();
            return null;
        }
        LeadIconDto leadIconDto = ((SlotLeadDto.SlotLead_IconDto) slotLeadDto).b;
        sbv J = J(leadIconDto.getIcon());
        switch (ov8.q[leadIconDto.getStyle().ordinal()]) {
            case 1:
                slotLeadModel$LeadIcon$IconStyle = SlotLeadModel$LeadIcon$IconStyle.ICON;
                break;
            case 2:
                slotLeadModel$LeadIcon$IconStyle = SlotLeadModel$LeadIcon$IconStyle.PAYMENT;
                break;
            case 3:
                slotLeadModel$LeadIcon$IconStyle = SlotLeadModel$LeadIcon$IconStyle.BRAND;
                break;
            case 4:
                slotLeadModel$LeadIcon$IconStyle = SlotLeadModel$LeadIcon$IconStyle.BRANDXS;
                break;
            case 5:
                slotLeadModel$LeadIcon$IconStyle = SlotLeadModel$LeadIcon$IconStyle.USERPIC;
                break;
            case 6:
                slotLeadModel$LeadIcon$IconStyle = SlotLeadModel$LeadIcon$IconStyle.SERVICE;
                break;
            case 7:
                slotLeadModel$LeadIcon$IconStyle = SlotLeadModel$LeadIcon$IconStyle.IMAGE;
                break;
            default:
                w511.b();
                return null;
        }
        return new its0(J, slotLeadModel$LeadIcon$IconStyle);
    }

    public static qus0 V(SlotStyleDto slotStyleDto) {
        if (slotStyleDto == null) {
            return qus0.e;
        }
        String backgroundColor = slotStyleDto.getBackgroundColor();
        int backgroundCornerRadius = slotStyleDto.getBackgroundCornerRadius();
        int horizontalInset = slotStyleDto.getHorizontalInset();
        BorderDto border = slotStyleDto.getBorder();
        return new qus0(backgroundColor, backgroundCornerRadius, horizontalInset, border != null ? new qa6(border.getColor(), border.getWidth()) : null);
    }

    public static hty0 X(TextParametersDto textParametersDto) {
        return new hty0(textParametersDto.getSize(), textParametersDto.getWeight(), textParametersDto.getColor());
    }

    public static tjj j(WidgetDto.Widget_DigitsInputDto widget_DigitsInputDto) {
        hkj hkjVar;
        CurrencySymbolAnchor currencySymbolAnchor;
        DigitsInputWidgetDto digitsInputWidgetDto = widget_DigitsInputDto.b;
        String widgetId = digitsInputWidgetDto.getWidgetId();
        String formStateKey = digitsInputWidgetDto.getFormStateKey();
        DigitsInputTypeDto inputType = digitsInputWidgetDto.getInputType();
        if (inputType instanceof DigitsInputTypeDto.DigitsInputType_CostDto) {
            CostDigitsInputTypeDto costDigitsInputTypeDto = ((DigitsInputTypeDto.DigitsInputType_CostDto) inputType).b;
            String currencySymbol = costDigitsInputTypeDto.getCurrencySymbol();
            int i = ov8.G[costDigitsInputTypeDto.getCurrencySymbolAnchor().ordinal()];
            if (i == 1) {
                currencySymbolAnchor = CurrencySymbolAnchor.TRAILING;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                currencySymbolAnchor = CurrencySymbolAnchor.LEADING;
            }
            hkjVar = new fkj(currencySymbol, currencySymbolAnchor);
        } else {
            if (!(inputType instanceof DigitsInputTypeDto.Unknown_DigitsInputTypeDto)) {
                w511.b();
                return null;
            }
            hkjVar = gkj.a;
        }
        return new tjj(widgetId, formStateKey, hkjVar, digitsInputWidgetDto.getForceOpenKeyboard(), digitsInputWidgetDto.getMetricaLabel());
    }

    public static iyq k(AddressDetailsFieldTypeDto addressDetailsFieldTypeDto) {
        switch (ov8.b[addressDetailsFieldTypeDto.ordinal()]) {
            case 1:
                return gyq.a;
            case 2:
                return fyq.a;
            case 3:
                return eyq.a;
            case 4:
                return dyq.a;
            case 5:
                return cyq.a;
            case 6:
                return byq.a;
            default:
                w511.b();
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    public static fy41 v(WidgetDto.Widget_PickerDto widget_PickerDto) {
        t1y t1yVar;
        ?? r11;
        String widgetId = widget_PickerDto.b.getWidgetId();
        PickerWidgetDto pickerWidgetDto = widget_PickerDto.b;
        String metricaLabel = pickerWidgetDto.getMetricaLabel();
        List<PickerColumnDto> columns = pickerWidgetDto.getColumns();
        ArrayList arrayList = new ArrayList();
        for (PickerColumnDto pickerColumnDto : columns) {
            String formStateKey = pickerColumnDto.getFormStateKey();
            List<PickerOptionDto> options = pickerColumnDto.getOptions();
            ArrayList arrayList2 = new ArrayList(tcc.n(options, 10));
            for (PickerOptionDto pickerOptionDto : options) {
                Object value = pickerOptionDto.getValue();
                String label = pickerOptionDto.getLabel();
                List<PickerWidgetStateDependencyItemDto> stateDependentVisibility = pickerOptionDto.getStateDependentVisibility();
                if (stateDependentVisibility != null) {
                    List<PickerWidgetStateDependencyItemDto> list = stateDependentVisibility;
                    r11 = new ArrayList(tcc.n(list, 10));
                    for (PickerWidgetStateDependencyItemDto pickerWidgetStateDependencyItemDto : list) {
                        r11.add(new ey41(pickerWidgetStateDependencyItemDto.getFormStateKey(), pickerWidgetStateDependencyItemDto.getFormStateValue()));
                    }
                } else {
                    r11 = EmptyList.a;
                }
                arrayList2.add(new dy41(value, label, r11));
            }
            PickerColumnLayoutPolicyDto layoutPolicy = pickerColumnDto.getLayoutPolicy();
            if (layoutPolicy instanceof PickerColumnLayoutPolicyDto.PickerColumnLayoutPolicy_PercentDto) {
                t1yVar = new s1y(((PickerColumnLayoutPolicyDto.PickerColumnLayoutPolicy_PercentDto) layoutPolicy).b.getPercent());
            } else if (layoutPolicy instanceof PickerColumnLayoutPolicyDto.PickerColumnLayoutPolicy_ConstDto) {
                t1yVar = new q1y(((PickerColumnLayoutPolicyDto.PickerColumnLayoutPolicy_ConstDto) layoutPolicy).b.getWidth());
            } else if (layoutPolicy instanceof PickerColumnLayoutPolicyDto.PickerColumnLayoutPolicy_FillDto) {
                t1yVar = r1y.a;
            } else {
                if (!(layoutPolicy instanceof PickerColumnLayoutPolicyDto.Unknown_PickerColumnLayoutPolicyDto)) {
                    w511.b();
                    return null;
                }
                t1yVar = null;
            }
            wx41 wx41Var = t1yVar != null ? new wx41(formStateKey, arrayList2, t1yVar) : null;
            if (wx41Var != null) {
                arrayList.add(wx41Var);
            }
        }
        return new fy41(widgetId, metricaLabel, arrayList);
    }

    public static yg w(AccessibilityInfoDto accessibilityInfoDto) {
        if (accessibilityInfoDto != null) {
            return new yg(accessibilityInfoDto.isHeader(), accessibilityInfoDto.getContentDescription());
        }
        return null;
    }

    public static d51 y(AddressRouteTypeDto addressRouteTypeDto, AddressFlowDto addressFlowDto) {
        d51 d51Var;
        boolean z = addressRouteTypeDto instanceof AddressRouteTypeDto.AddressRouteType_PickupPointsDto;
        d51 d51Var2 = c51.a;
        d51 d51Var3 = b51.a;
        if (z) {
            d51Var = d51Var3;
        } else if (addressRouteTypeDto instanceof AddressRouteTypeDto.AddressRouteType_DefaultDto) {
            d51Var = d51Var2;
        } else {
            d51Var = null;
            if (addressRouteTypeDto != null && !(addressRouteTypeDto instanceof AddressRouteTypeDto.Unknown_AddressRouteTypeDto)) {
                w511.b();
                return null;
            }
        }
        return d51Var == null ? addressFlowDto instanceof AddressFlowDto.AddressFlow_PickupPointDto ? d51Var3 : d51Var2 : d51Var;
    }

    public static rh4 z(BackgroundDto backgroundDto) {
        List<BackgroundContentDto> content = backgroundDto.getContent();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = content.iterator();
        while (it.hasNext()) {
            qg4 A = A((BackgroundContentDto) it.next());
            if (A != null) {
                arrayList.add(A);
            }
        }
        PaddingsDto paddings = backgroundDto.getPaddings();
        return new rh4(arrayList, paddings != null ? L(paddings) : null);
    }

    public final n37 D(ButtonStyleDto buttonStyleDto, boolean z) {
        Style style;
        hqs0 T = T(buttonStyleDto.getSlot(), null);
        int i = ov8.B[buttonStyleDto.getStyle().ordinal()];
        if (i == 1) {
            style = Style.FLOATING;
        } else if (i == 2) {
            style = Style.MINOR;
        } else if (i == 3) {
            style = Style.OUTLINE;
        } else {
            if (i != 4 && i != 5) {
                w511.b();
                return null;
            }
            style = Style.MAIN;
        }
        Style style2 = style;
        CustomButtonStyleDto customStyle = buttonStyleDto.getCustomStyle();
        return new n37(T, style2, customStyle != null ? new ajf(customStyle.getBackgroundColor(), customStyle.getCornerRadius()) : null, buttonStyleDto.getEnabled(), z);
    }

    public final yye G(CounterActionDto counterActionDto) {
        Iterator<CounterOptionDto> it = counterActionDto.getOptions().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Boolean bool = it.next().getDefault();
            if (bool != null ? bool.booleanValue() : false) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        String formStateKey = counterActionDto.getFormStateKey();
        List<CounterOptionDto> options = counterActionDto.getOptions();
        ArrayList arrayList = new ArrayList(tcc.n(options, 10));
        for (CounterOptionDto counterOptionDto : options) {
            arrayList.add(new n0f(counterOptionDto.getTitle(), counterOptionDto.getValue()));
        }
        String metricaLabel = counterActionDto.getMetricaLabel();
        TapActionDto actionOnIncrease = counterActionDto.getActionOnIncrease();
        r9x0 x = actionOnIncrease != null ? x(actionOnIncrease) : null;
        TapActionDto actionOnDecrease = counterActionDto.getActionOnDecrease();
        return new yye(formStateKey, arrayList, intValue, metricaLabel, x, actionOnDecrease != null ? x(actionOnDecrease) : null);
    }

    public final ZonedDateTime H(String str) {
        try {
            return ZonedDateTime.parse(str, DateTimeFormatter.ISO_DATE_TIME);
        } catch (DateTimeParseException unused) {
            this.b.a.o("Delivery.OrderForm.Failed.DateTimeParseError", null, new LinkedHashMap());
            return null;
        }
    }

    public final ex90 M(PaymentButtonWidgetDto paymentButtonWidgetDto) {
        ButtonSize buttonSize;
        FormattedText formattedText;
        String widgetId = paymentButtonWidgetDto.getWidgetId();
        ButtonSizeDto buttonSize2 = paymentButtonWidgetDto.getButtonSize();
        if (buttonSize2 == null || (buttonSize = C(buttonSize2)) == null) {
            buttonSize = ButtonSize.L;
        }
        ButtonSize buttonSize3 = buttonSize;
        hty0 X = X(paymentButtonWidgetDto.getSubtitleStyle());
        AttributedTextDto title = paymentButtonWidgetDto.getTitle();
        if (title != null) {
            this.a.getClass();
            formattedText = gd3.b(title);
        } else {
            formattedText = null;
        }
        return new ex90(widgetId, formattedText, X, paymentButtonWidgetDto.getUnselectedPaymentText(), buttonSize3, paymentButtonWidgetDto.getBackgroundColor(), paymentButtonWidgetDto.getAvailablePaymentTypes(), paymentButtonWidgetDto.getMetricaLabel());
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v7q0 P(SegmentActionDto segmentActionDto, o9q0 o9q0Var) {
        o9q0 o9q0Var2;
        o9q0 o9q0Var3;
        m8q0 m8q0Var;
        FormattedText formattedText;
        if (segmentActionDto.getOptions().isEmpty()) {
            return null;
        }
        Iterator<SegmentOptionDto> it = segmentActionDto.getOptions().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Boolean bool = it.next().getDefault();
            if (bool != null ? bool.booleanValue() : false) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        String formStateKey = segmentActionDto.getFormStateKey();
        List<SegmentOptionDto> options = segmentActionDto.getOptions();
        ArrayList arrayList = new ArrayList(tcc.n(options, 10));
        Iterator<T> it2 = options.iterator();
        while (true) {
            if (!it2.hasNext()) {
                String metricaLabel = segmentActionDto.getMetricaLabel();
                SegmentActionDto.WidthModeDto widthMode = segmentActionDto.getWidthMode();
                int i2 = widthMode == null ? -1 : ov8.s[widthMode.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        o9q0Var3 = n9q0.a;
                    } else if (i2 == 2) {
                        o9q0Var3 = l9q0.a;
                    } else {
                        if (i2 != 3) {
                            w511.b();
                            return null;
                        }
                        o9q0Var3 = m9q0.a;
                    }
                    o9q0Var2 = o9q0Var3;
                } else {
                    o9q0Var2 = o9q0Var;
                }
                return new v7q0(formStateKey, arrayList, intValue, metricaLabel, o9q0Var2);
            }
            SegmentOptionDto segmentOptionDto = (SegmentOptionDto) it2.next();
            SegmentTextDto selectedText = segmentOptionDto.getSelectedText();
            AttributedTextDto title = selectedText.getTitle();
            gd3 gd3Var = this.a;
            gd3Var.getClass();
            FormattedText b = gd3.b(title);
            AttributedTextDto subtitle = selectedText.getSubtitle();
            r8q0 r8q0Var = new r8q0(b, subtitle != null ? gd3.b(subtitle) : null);
            SegmentTextDto unselectedText = segmentOptionDto.getUnselectedText();
            AttributedTextDto title2 = unselectedText.getTitle();
            gd3Var.getClass();
            FormattedText b2 = gd3.b(title2);
            AttributedTextDto subtitle2 = unselectedText.getSubtitle();
            r8q0 r8q0Var2 = new r8q0(b2, subtitle2 != null ? gd3.b(subtitle2) : null);
            Object value = segmentOptionDto.getValue();
            Boolean isAvailable = segmentOptionDto.isAvailable();
            boolean booleanValue = isAvailable != null ? isAvailable.booleanValue() : true;
            yg w = w(segmentOptionDto.getAccessibilityInfo());
            FormBadgeDto badge = segmentOptionDto.getBadge();
            ul4 B = badge != null ? B(badge) : null;
            SegmentHintDto hint = segmentOptionDto.getHint();
            if (hint != null) {
                if (hint instanceof SegmentHintDto.SegmentHint_FullsizePopupDto) {
                    FullsizePopupDto fullsizePopupDto = ((SegmentHintDto.SegmentHint_FullsizePopupDto) hint).b;
                    String id = fullsizePopupDto.getId();
                    ImageDto leadIcon = fullsizePopupDto.getLeadIcon();
                    sbv J = leadIcon != null ? J(leadIcon) : null;
                    AttributedTextDto title3 = fullsizePopupDto.getTitle();
                    if (title3 != null) {
                        gd3Var.getClass();
                        formattedText = gd3.b(title3);
                    } else {
                        formattedText = null;
                    }
                    AttributedTextDto subtitle3 = fullsizePopupDto.getSubtitle();
                    gd3Var.getClass();
                    FormattedText b3 = gd3.b(subtitle3);
                    TapActionDto action = fullsizePopupDto.getAction();
                    r9x0 x = action != null ? x(action) : null;
                    String backgroundColor = fullsizePopupDto.getBackgroundColor();
                    ImageDto closeIcon = fullsizePopupDto.getCloseIcon();
                    m8q0Var = new m8q0(id, J, formattedText, b3, x, backgroundColor, closeIcon != null ? J(closeIcon) : null);
                    TapActionDto selectionAction = segmentOptionDto.getSelectionAction();
                    r9x0 x2 = selectionAction == null ? x(selectionAction) : null;
                    TapActionDto unselectionAction = segmentOptionDto.getUnselectionAction();
                    arrayList.add(new o8q0(r8q0Var, r8q0Var2, value, booleanValue, w, B, m8q0Var, x2, unselectionAction == null ? x(unselectionAction) : null));
                } else if (!(hint instanceof SegmentHintDto.Unknown_SegmentHintDto)) {
                    w511.b();
                    return null;
                }
            }
            m8q0Var = null;
            TapActionDto selectionAction2 = segmentOptionDto.getSelectionAction();
            if (selectionAction2 == null) {
            }
            TapActionDto unselectionAction2 = segmentOptionDto.getUnselectionAction();
            arrayList.add(new o8q0(r8q0Var, r8q0Var2, value, booleanValue, w, B, m8q0Var, x2, unselectionAction2 == null ? x(unselectionAction2) : null));
        }
    }

    public final vos0 R(SliderButtonContentDto sliderButtonContentDto) {
        ips0 ips0Var;
        AttributedTextDto title = sliderButtonContentDto.getTitle();
        this.a.getClass();
        FormattedText b = gd3.b(title);
        AttributedTextDto subtitle = sliderButtonContentDto.getSubtitle();
        FormattedText b2 = subtitle != null ? gd3.b(subtitle) : null;
        String backgroundColor = sliderButtonContentDto.getBackgroundColor();
        SliderHandlerDto handler = sliderButtonContentDto.getHandler();
        if (handler != null) {
            ImageDto activeImage = handler.getActiveImage();
            sbv J = activeImage != null ? J(activeImage) : null;
            ImageDto completeImage = handler.getCompleteImage();
            ips0Var = new ips0(J, completeImage != null ? J(completeImage) : null, handler.getBackgroundColor());
        } else {
            ips0Var = null;
        }
        return new vos0(b, b2, backgroundColor, ips0Var, sliderButtonContentDto.isShimmering());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public final xts0 S(SlotDto slotDto, Pair pair) {
        ?? r1;
        SlotModel$Size slotModel$Size;
        SlotLeadDto lead = slotDto.getLead();
        lts0 U = lead != null ? U(lead) : null;
        hqs0 T = T(slotDto.getBody1(), pair);
        SlotBodyDto body2 = slotDto.getBody2();
        hqs0 T2 = body2 != null ? T(body2, pair) : null;
        SlotBodyDto body3 = slotDto.getBody3();
        hqs0 T3 = body3 != null ? T(body3, pair) : null;
        SlotTrailDto trail1 = slotDto.getTrail1();
        fws0 W = trail1 != null ? W(trail1) : null;
        SlotTrailDto trail2 = slotDto.getTrail2();
        fws0 W2 = trail2 != null ? W(trail2) : null;
        TapActionDto action = slotDto.getAction();
        r9x0 x = action != null ? x(action) : null;
        boolean enabled = slotDto.getEnabled();
        qus0 V = V(slotDto.getStyle());
        List<SlotDto.StateDependedStylesDto> stateDependedStyles = slotDto.getStateDependedStyles();
        if (stateDependedStyles != null) {
            List<SlotDto.StateDependedStylesDto> list = stateDependedStyles;
            r1 = new ArrayList(tcc.n(list, 10));
            for (SlotDto.StateDependedStylesDto stateDependedStylesDto : list) {
                r1.add(new h4u0(stateDependedStylesDto.getFormStateKey(), stateDependedStylesDto.getFormStateValue(), V(stateDependedStylesDto.getStyle())));
            }
        } else {
            r1 = 0;
        }
        if (r1 == 0) {
            r1 = EmptyList.a;
        }
        List list2 = r1;
        switch (ov8.r[slotDto.getSize().ordinal()]) {
            case 1:
                slotModel$Size = SlotModel$Size.XS;
                break;
            case 2:
                slotModel$Size = SlotModel$Size.S;
                break;
            case 3:
                slotModel$Size = SlotModel$Size.M;
                break;
            case 4:
                slotModel$Size = SlotModel$Size.L;
                break;
            case 5:
                slotModel$Size = SlotModel$Size.XL;
                break;
            case 6:
                slotModel$Size = SlotModel$Size.XXL;
                break;
            default:
                w511.b();
                return null;
        }
        return new xts0(U, T, T2, T3, W, W2, x, enabled, V, list2, slotModel$Size);
    }

    public final hqs0 T(SlotBodyDto slotBodyDto, Pair pair) {
        Align align;
        AttributedTextDto title = slotBodyDto.getTitle();
        this.a.getClass();
        FormattedText b = gd3.b(title);
        AttributedTextDto subtitle = slotBodyDto.getSubtitle();
        FormattedText b2 = subtitle != null ? gd3.b(subtitle) : null;
        int i = ov8.f[slotBodyDto.getAlign().ordinal()];
        if (i == 1) {
            align = Align.LEADING;
        } else if (i == 2) {
            align = Align.CENTER;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            align = Align.TRAILING;
        }
        Align align2 = align;
        FormBadgeDto titleBadge = slotBodyDto.getTitleBadge();
        return new hqs0(b, b2, align2, titleBadge != null ? B(titleBadge) : null, pair != null ? (Integer) pair.c() : null, pair != null ? (Integer) pair.f() : null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v9 c0k0, still in use, count: 2, list:
          (r14v9 c0k0) from 0x0286: IF  (r14v9 c0k0) == (null c0k0)  -> B:20:0x0288 A[HIDDEN]
          (r14v9 c0k0) from 0x0289: PHI (r14v5 c0k0) = (r14v4 c0k0), (r14v9 c0k0) binds: [B:111:0x028b, B:107:0x0286] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final defpackage.fws0 W(ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SlotTrailDto r14) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv8.W(ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SlotTrailDto):fws0");
    }

    public final bws0 Y(TrailTwoButtonsDto trailTwoButtonsDto, int i) {
        AttributedTextDto attributedTextDto = (AttributedTextDto) a.S(i, trailTwoButtonsDto.getButtonTitles());
        if (attributedTextDto != null) {
            List<String> accessibilityLabels = trailTwoButtonsDto.getAccessibilityLabels();
            String str = accessibilityLabels != null ? (String) a.S(i, accessibilityLabels) : null;
            TapActionDto tapActionDto = (TapActionDto) a.S(i, trailTwoButtonsDto.getButtonActions());
            if (tapActionDto != null) {
                List<String> metricaLabels = trailTwoButtonsDto.getMetricaLabels();
                String str2 = metricaLabels != null ? (String) a.S(i, metricaLabels) : null;
                this.a.getClass();
                return new bws0(gd3.b(attributedTextDto), str, new x2s(str2, null), x(tapActionDto));
            }
        }
        return null;
    }

    public final et a(ActionButtonWidgetDto actionButtonWidgetDto) {
        String widgetId = actionButtonWidgetDto.getWidgetId();
        ButtonSize C = C(actionButtonWidgetDto.getButtonSize());
        n37 D = D(actionButtonWidgetDto.getNormalStyle(), false);
        ButtonStyleDto loadingStyle = actionButtonWidgetDto.getLoadingStyle();
        return new et(widgetId, C, D, loadingStyle != null ? D(loadingStyle, true) : null, x(actionButtonWidgetDto.getAction()), new x2s(actionButtonWidgetDto.getMetricaLabel(), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    public final at0 b(AddressDetailsLayoutDto addressDetailsLayoutDto) {
        ArrayList arrayList;
        us0 us0Var;
        jts0 jts0Var;
        ArrayList arrayList2;
        int i;
        ?? r6;
        SectionDto topSection = addressDetailsLayoutDto.getTopSection();
        lqe h = topSection != null ? h(topSection) : null;
        SectionDto bottomSection = addressDetailsLayoutDto.getBottomSection();
        lqe h2 = bottomSection != null ? h(bottomSection) : null;
        List<RoutePointDescriptionDto> routePoints = addressDetailsLayoutDto.getRoutePoints();
        if (routePoints != null) {
            List<RoutePointDescriptionDto> list = routePoints;
            int i2 = 10;
            ArrayList arrayList3 = new ArrayList(tcc.n(list, 10));
            for (RoutePointDescriptionDto routePointDescriptionDto : list) {
                sbv J = J(routePointDescriptionDto.getIcon());
                SlotLeadDto selectedLead = routePointDescriptionDto.getSelectedLead();
                lts0 U = selectedLead != null ? U(selectedLead) : null;
                SlotLeadDto unselectedLead = routePointDescriptionDto.getUnselectedLead();
                lts0 U2 = unselectedLead != null ? U(unselectedLead) : null;
                LeadIconSpotDto mapPin = routePointDescriptionDto.getMapPin();
                if (mapPin != null) {
                    IconSpotDto iconSpot = mapPin.getIconSpot();
                    jts0Var = new jts0(new f5v(J(iconSpot.getIcon()), iconSpot.getBackgroundColor(), iconSpot.getCornerRadius()));
                } else {
                    jts0Var = null;
                }
                String additionalTitleInfo = routePointDescriptionDto.getAdditionalTitleInfo();
                List<AddressDetailsBubbleDto> bubbles = routePointDescriptionDto.getBubbles();
                if (bubbles != null) {
                    List<AddressDetailsBubbleDto> list2 = bubbles;
                    ArrayList arrayList4 = new ArrayList(tcc.n(list2, i2));
                    for (AddressDetailsBubbleDto addressDetailsBubbleDto : list2) {
                        arrayList4.add(new fs0(addressDetailsBubbleDto.getText(), k(addressDetailsBubbleDto.getField())));
                    }
                    arrayList2 = arrayList4;
                } else {
                    arrayList2 = null;
                }
                List<AddressDetailsFieldTypeDto> hiddenFields = routePointDescriptionDto.getHiddenFields();
                if (hiddenFields != null) {
                    List<AddressDetailsFieldTypeDto> list3 = hiddenFields;
                    i = 10;
                    r6 = new ArrayList(tcc.n(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        r6.add(k((AddressDetailsFieldTypeDto) it.next()));
                    }
                } else {
                    i = 10;
                    r6 = EmptyList.a;
                }
                List list4 = r6;
                SectionDto section = routePointDescriptionDto.getSection();
                lqe h3 = section != null ? h(section) : null;
                AddressFlowDto addressFlow = routePointDescriptionDto.getAddressFlow();
                arrayList3.add(new j7l0(J, U, U2, jts0Var, additionalTitleInfo, arrayList2, list4, h3, addressFlow != null ? c(addressFlow, null) : null, routePointDescriptionDto.getShowDeleteButton(), routePointDescriptionDto.getCloseDetailsAfterAddressSelection(), routePointDescriptionDto.getShowMiniMap()));
                i2 = i;
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        SectionDto stickyBottomSection = addressDetailsLayoutDto.getStickyBottomSection();
        lqe h4 = stickyBottomSection != null ? h(stickyBottomSection) : null;
        String metricaLabel = addressDetailsLayoutDto.getMetricaLabel();
        vu0 c2 = c(addressDetailsLayoutDto.getAddressFlow(), null);
        String openEventStateKey = addressDetailsLayoutDto.getOpenEventStateKey();
        boolean showDefaultFinishButton = addressDetailsLayoutDto.getShowDefaultFinishButton();
        int spacingHeight = addressDetailsLayoutDto.getSpacingHeight();
        String spacingColor = addressDetailsLayoutDto.getSpacingColor();
        AddressDetailsHeaderDto header = addressDetailsLayoutDto.getHeader();
        if (header != null) {
            AttributedTextDto title = header.getTitle();
            this.a.getClass();
            FormattedText b = gd3.b(title);
            AttributedTextDto subtitle = header.getSubtitle();
            us0Var = new us0(b, subtitle != null ? gd3.b(subtitle) : null, header.getBackgroundColor());
        } else {
            us0Var = null;
        }
        VerticalBarDto verticalBar = addressDetailsLayoutDto.getVerticalBar();
        return new at0(h, h2, arrayList, h4, metricaLabel, c2, openEventStateKey, showDefaultFinishButton, spacingHeight, spacingColor, us0Var, verticalBar != null ? new va31(verticalBar.getColor(), verticalBar.getWidth()) : null);
    }

    public final vu0 c(AddressFlowDto addressFlowDto, String str) {
        CardsRevealing cardsRevealing;
        bwb bwbVar;
        if (addressFlowDto instanceof AddressFlowDto.AddressFlow_PickupPointDto) {
            AddressFlowPickupPointDto addressFlowPickupPointDto = ((AddressFlowDto.AddressFlow_PickupPointDto) addressFlowDto).b;
            String tariffClass = addressFlowPickupPointDto.getTariffClass();
            String currentMode = addressFlowPickupPointDto.getCurrentMode();
            Boolean enabledCourierFlow = addressFlowPickupPointDto.getEnabledCourierFlow();
            return new su0(tariffClass, currentMode, enabledCourierFlow != null ? enabledCourierFlow.booleanValue() : false);
        }
        if (addressFlowDto instanceof AddressFlowDto.AddressFlow_IntercityDto) {
            AddressFlowIntercityDto addressFlowIntercityDto = ((AddressFlowDto.AddressFlow_IntercityDto) addressFlowDto).b;
            String currentMode2 = addressFlowIntercityDto.getCurrentMode();
            String selectedClass = addressFlowIntercityDto.getSelectedClass();
            CityDiscoveryScreenDto selectionOnMapConfiguration = addressFlowIntercityDto.getSelectionOnMapConfiguration();
            String screenName = selectionOnMapConfiguration != null ? selectionOnMapConfiguration.getScreenName() : null;
            String initialSearchText = addressFlowIntercityDto.getInitialSearchText();
            String str2 = initialSearchText == null ? str : initialSearchText;
            CityDiscoveryScreenDto selectionOnMapConfiguration2 = addressFlowIntercityDto.getSelectionOnMapConfiguration();
            if (selectionOnMapConfiguration2 != null) {
                AttributedTextDto headerTitle = selectionOnMapConfiguration2.getHeaderTitle();
                this.a.getClass();
                FormattedText b = gd3.b(headerTitle);
                ImageDto headerLeadImage = selectionOnMapConfiguration2.getHeaderLeadImage();
                nsj nsjVar = headerLeadImage != null ? new nsj(headerLeadImage.getImageTag(), headerLeadImage.getUrl(), headerLeadImage.getTintColor()) : null;
                FormattedText b2 = gd3.b(selectionOnMapConfiguration2.getSearchButtonTitle());
                ImageDto searchButtonLeadImage = selectionOnMapConfiguration2.getSearchButtonLeadImage();
                bwbVar = new bwb(b, nsjVar, b2, searchButtonLeadImage != null ? new nsj(searchButtonLeadImage.getImageTag(), searchButtonLeadImage.getUrl(), searchButtonLeadImage.getTintColor()) : null);
            } else {
                bwbVar = null;
            }
            return new ru0(currentMode2, selectedClass, screenName, bwbVar, str2);
        }
        if (addressFlowDto instanceof AddressFlowDto.AddressFlow_SuggestDto) {
            AddressFlowSuggestDto addressFlowSuggestDto = ((AddressFlowDto.AddressFlow_SuggestDto) addressFlowDto).b;
            return new uu0(addressFlowSuggestDto.getCurrentMode(), addressFlowSuggestDto.getSelectedClass(), addressFlowSuggestDto.getSuggestHint(), addressFlowSuggestDto.getEnableMapSelection());
        }
        if (!(addressFlowDto instanceof AddressFlowDto.AddressFlow_PlacesSuggestDto)) {
            if ((addressFlowDto instanceof AddressFlowDto.Unknown_AddressFlowDto) || addressFlowDto == null) {
                return null;
            }
            w511.b();
            return null;
        }
        AddressFlowPlacesSuggestDto addressFlowPlacesSuggestDto = ((AddressFlowDto.AddressFlow_PlacesSuggestDto) addressFlowDto).b;
        String mode = addressFlowPlacesSuggestDto.getMode();
        int i = ov8.g[addressFlowPlacesSuggestDto.getCardsOverMapRevealing().ordinal()];
        if (i == 1) {
            cardsRevealing = CardsRevealing.EXPANDED;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            cardsRevealing = CardsRevealing.COMPACT;
        }
        return new tu0(mode, cardsRevealing);
    }

    public final iw0 d(AddressDetailsInputFieldWidgetDto addressDetailsInputFieldWidgetDto) {
        hyq hyqVar;
        sv0 sv0Var;
        BubblePosition bubblePosition;
        String widgetId = addressDetailsInputFieldWidgetDto.getWidgetId();
        c0k0 N = N(addressDetailsInputFieldWidgetDto.getResultPosition());
        if (N == null) {
            return null;
        }
        int i = ov8.i[addressDetailsInputFieldWidgetDto.getField().ordinal()];
        if (i == 1) {
            hyqVar = gyq.a;
        } else if (i == 2) {
            hyqVar = cyq.a;
        } else if (i == 3) {
            hyqVar = fyq.a;
        } else if (i == 4) {
            hyqVar = eyq.a;
        } else {
            if (i != 5) {
                w511.b();
                return null;
            }
            hyqVar = dyq.a;
        }
        String placeholder = addressDetailsInputFieldWidgetDto.getPlaceholder();
        ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.AddressDetailsBubbleDto bubble = addressDetailsInputFieldWidgetDto.getBubble();
        if (bubble != null) {
            String text = bubble.getText();
            int i2 = ov8.j[bubble.getAnchor().ordinal()];
            if (i2 == 1) {
                bubblePosition = BubblePosition.TOP_LEFT;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                bubblePosition = BubblePosition.TOP_RIGHT;
            }
            sv0Var = new sv0(text, bubblePosition);
        } else {
            sv0Var = null;
        }
        SlotTrailDto trail1 = addressDetailsInputFieldWidgetDto.getTrail1();
        fws0 W = trail1 != null ? W(trail1) : null;
        HorizontalPaddingsDto horizontalPaddings = addressDetailsInputFieldWidgetDto.getHorizontalPaddings();
        return new iw0(widgetId, N, hyqVar, placeholder, sv0Var, W, horizontalPaddings != null ? I(horizontalPaddings) : null);
    }

    public final c71 e(AddressWidgetDto addressWidgetDto) {
        c0k0 yzj0Var;
        AddressPositionModel addressPositionModel;
        String widgetId = addressWidgetDto.getWidgetId();
        ResultPositionDto resultPosition = addressWidgetDto.getResultPosition();
        if (resultPosition == null || (yzj0Var = N(resultPosition)) == null) {
            yzj0Var = new yzj0(addressWidgetDto.getRoutePointIndex(), addressWidgetDto.getFlow() instanceof AddressFlowDto.AddressFlow_PickupPointDto ? b51.a : c51.a);
        }
        c0k0 c0k0Var = yzj0Var;
        AttributedTextDto selectedDescription = addressWidgetDto.getSelectedDescription();
        this.a.getClass();
        FormattedText b = gd3.b(selectedDescription);
        FormattedText b2 = gd3.b(addressWidgetDto.getUnselectedDescription());
        TextParametersDto addressStyle = addressWidgetDto.getAddressStyle();
        hty0 X = addressStyle != null ? X(addressStyle) : null;
        SlotLeadDto selectedLead = addressWidgetDto.getSelectedLead();
        lts0 U = selectedLead != null ? U(selectedLead) : null;
        SlotLeadDto unselectedLead = addressWidgetDto.getUnselectedLead();
        lts0 U2 = unselectedLead != null ? U(unselectedLead) : null;
        SlotTrailDto trail = addressWidgetDto.getTrail();
        fws0 W = trail != null ? W(trail) : null;
        int i = ov8.o[addressWidgetDto.getAddressPosition().ordinal()];
        if (i == 1) {
            addressPositionModel = AddressPositionModel.TITLE;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            addressPositionModel = AddressPositionModel.SUBTITLE;
        }
        TapActionDto action = addressWidgetDto.getAction();
        r9x0 x = action != null ? x(action) : null;
        String metricaLabel = addressWidgetDto.getMetricaLabel();
        vu0 c2 = c(addressWidgetDto.getFlow(), null);
        Object meta = addressWidgetDto.getMeta();
        Map map = meta instanceof Map ? (Map) meta : null;
        PaddingsDto paddings = addressWidgetDto.getPaddings();
        return new c71(widgetId, c0k0Var, addressPositionModel, b, b2, X, U, U2, W, x, metricaLabel, c2, map, paddings != null ? L(paddings) : null);
    }

    public final sy8 f(WidgetDto.Widget_CarouselItemsDto widget_CarouselItemsDto) {
        CarouselItemsWidgetDto carouselItemsWidgetDto = widget_CarouselItemsDto.b;
        String widgetId = carouselItemsWidgetDto.getWidgetId();
        List<CarouselItemDto> items = carouselItemsWidgetDto.getItems();
        ArrayList arrayList = new ArrayList(tcc.n(items, 10));
        Iterator<T> it = items.iterator();
        while (true) {
            r9x0 r9x0Var = null;
            if (!it.hasNext()) {
                break;
            }
            CarouselItemDto carouselItemDto = (CarouselItemDto) it.next();
            AttributedTextDto title = carouselItemDto.getTitle();
            this.a.getClass();
            FormattedText b = gd3.b(title);
            AttributedTextDto subtitle = carouselItemDto.getSubtitle();
            FormattedText b2 = subtitle != null ? gd3.b(subtitle) : null;
            ContentAlignment F = F(carouselItemDto.getTextAlignment());
            PaddingsDto contentPaddings = carouselItemDto.getContentPaddings();
            o690 L = contentPaddings != null ? L(contentPaddings) : null;
            BackgroundDto background = carouselItemDto.getBackground();
            rh4 z = background != null ? z(background) : null;
            TapActionDto action = carouselItemDto.getAction();
            if (action != null) {
                r9x0Var = x(action);
            }
            arrayList.add(new vx8(b, b2, F, L, z, r9x0Var, new x2s(carouselItemDto.getMetricaLabel(), carouselItemDto.getMeta())));
        }
        int itemHeight = carouselItemsWidgetDto.getItemHeight();
        HorizontalPaddingsDto horizontalPaddings = carouselItemsWidgetDto.getHorizontalPaddings();
        o690 I = horizontalPaddings != null ? I(horizontalPaddings) : null;
        CarouselIndicatorsStyleDto indicatorsStyle = carouselItemsWidgetDto.getIndicatorsStyle();
        return new sy8(widgetId, arrayList, itemHeight, I, indicatorsStyle != null ? new mx8(indicatorsStyle.getSelectedColor(), indicatorsStyle.getUnselectedColor()) : null, carouselItemsWidgetDto.getAutoscrollIntervalSeconds(), new x2s(carouselItemsWidgetDto.getMetricaLabel(), null));
    }

    public final v09 g(WidgetDto.Widget_CartDto widget_CartDto) {
        u09 u09Var;
        u09 u09Var2;
        String widgetId = widget_CartDto.b.getWidgetId();
        CartWidgetDto cartWidgetDto = widget_CartDto.b;
        CartWidgetLeadDto lead = cartWidgetDto.getLead();
        if (lead != null) {
            if (lead instanceof CartWidgetLeadDto.CartWidgetLead_ImageDto) {
                CartWidgetLeadImageDto cartWidgetLeadImageDto = ((CartWidgetLeadDto.CartWidgetLead_ImageDto) lead).b;
                sbv J = J(cartWidgetLeadImageDto.getImage());
                String backgroundColor = cartWidgetLeadImageDto.getBackgroundColor();
                Integer cornerRadius = cartWidgetLeadImageDto.getCornerRadius();
                FormBadgeDto badge = cartWidgetLeadImageDto.getBadge();
                u09Var2 = new u09(J, backgroundColor, cornerRadius, badge != null ? B(badge) : null);
            } else {
                if (!(lead instanceof CartWidgetLeadDto.Unknown_CartWidgetLeadDto)) {
                    w511.b();
                    return null;
                }
                u09Var2 = null;
            }
            u09Var = u09Var2;
        } else {
            u09Var = null;
        }
        AttributedTextDto title = cartWidgetDto.getTitle();
        this.a.getClass();
        FormattedText b = gd3.b(title);
        AttributedTextDto subtitle = cartWidgetDto.getSubtitle();
        FormattedText b2 = subtitle != null ? gd3.b(subtitle) : null;
        AttributedTextDto description = cartWidgetDto.getDescription();
        FormattedText b3 = description != null ? gd3.b(description) : null;
        SlotTrailDto trail = cartWidgetDto.getTrail();
        fws0 W = trail != null ? W(trail) : null;
        TapActionDto action = cartWidgetDto.getAction();
        return new v09(widgetId, u09Var, b, b2, b3, W, action != null ? x(action) : null);
    }

    public final lqe h(SectionDto sectionDto) {
        List<WidgetDto> widgets = sectionDto.getWidgets();
        ArrayList arrayList = new ArrayList(tcc.n(widgets, 10));
        Iterator<T> it = widgets.iterator();
        while (it.hasNext()) {
            arrayList.add(i((WidgetDto) it.next()));
        }
        BackgroundDto background = sectionDto.getBackground();
        rh4 z = background != null ? z(background) : null;
        SectionPromoDto promo = sectionDto.getPromo();
        return new lqe(arrayList, z, promo != null ? new i3q0(S(promo.getSlot(), null), promo.getBackgroundColor(), promo.getMetricaLabel()) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0c36  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0c3b  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v71, types: [pre] */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pre i(WidgetDto widgetDto) {
        FormattedText formattedText;
        InputCircleWidgetDto inputCircleWidgetDto;
        s6b1 s6b1Var;
        s6b1 s6b1Var2;
        dbc dbcVar;
        ScenarioSelectorState scenarioSelectorState;
        cd3 cd3Var;
        cd3 bd3Var;
        c0k0 zzj0Var;
        UploadedImagesPreviewSize uploadedImagesPreviewSize;
        ViewMode viewMode;
        BubbleToggleModel$Size bubbleToggleModel$Size;
        Iterator it;
        xjp0 xjp0Var;
        ScrollableItemBadge$Anchor scrollableItemBadge$Anchor;
        hon honVar;
        FieldPosition fieldPosition;
        FormattedText formattedText2;
        FormattedText formattedText3;
        z0w x0wVar;
        z0w z0wVar;
        FormattedText formattedText4;
        dqy0 dqy0Var;
        dqy0 dqy0Var2;
        EmptyList emptyList;
        zpy0 zpy0Var;
        FormattedText formattedText5;
        StopWordRule$RuleType stopWordRule$RuleType;
        FormattedText formattedText6;
        FormattedText formattedText7;
        c0k0 yzj0Var;
        ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel;
        ContactPrefillDto prefill;
        sbe sbeVar;
        sbe sbeVar2;
        FormattedText formattedText8;
        DividerStyle dividerStyle;
        ArrayList arrayList;
        SeparateTitle$Align separateTitle$Align;
        IconPosition iconPosition;
        FormattedText formattedText9;
        if (widgetDto instanceof WidgetDto.Widget_SlotDto) {
            SlotWidgetDto slotWidgetDto = ((WidgetDto.Widget_SlotDto) widgetDto).b;
            return new eus0(slotWidgetDto.getWidgetId(), S(slotWidgetDto.getSlot(), c), slotWidgetDto.getMetricaLabel(), w(slotWidgetDto.getAccessibilityInfo()));
        }
        boolean z = widgetDto instanceof WidgetDto.Widget_PaymentMethodDto;
        gd3 gd3Var = this.a;
        pre preVar = 0;
        if (z) {
            PaymentMethodWidgetDto paymentMethodWidgetDto = ((WidgetDto.Widget_PaymentMethodDto) widgetDto).b;
            String widgetId = paymentMethodWidgetDto.getWidgetId();
            hty0 X = X(paymentMethodWidgetDto.getTitleStyle());
            AttributedTextDto subtitle = paymentMethodWidgetDto.getSubtitle();
            if (subtitle != null) {
                gd3Var.getClass();
                formattedText9 = gd3.b(subtitle);
            } else {
                formattedText9 = null;
            }
            SlotBodyDto additionalBody = paymentMethodWidgetDto.getAdditionalBody();
            hqs0 T = additionalBody != null ? T(additionalBody, null) : null;
            SlotTrailDto trail = paymentMethodWidgetDto.getTrail();
            return new q6a0(widgetId, X, formattedText9, T, trail != null ? W(trail) : null, paymentMethodWidgetDto.getAvailablePaymentTypes(), paymentMethodWidgetDto.getMetricaLabel());
        }
        if (widgetDto instanceof WidgetDto.Widget_ActionButtonDto) {
            return a(((WidgetDto.Widget_ActionButtonDto) widgetDto).b);
        }
        int i = 10;
        int i2 = 2;
        if (widgetDto instanceof WidgetDto.Widget_TagLineDto) {
            TagLineWidgetDto tagLineWidgetDto = ((WidgetDto.Widget_TagLineDto) widgetDto).b;
            String widgetId2 = tagLineWidgetDto.getWidgetId();
            List<TagDto> tags = tagLineWidgetDto.getTags();
            ArrayList arrayList2 = new ArrayList(tcc.n(tags, 10));
            for (TagDto tagDto : tags) {
                String text = tagDto.getText();
                String backgroundColor = tagDto.getBackgroundColor();
                String textColor = tagDto.getTextColor();
                ImageDto icon = tagDto.getIcon();
                sbv J = icon != null ? J(icon) : preVar;
                int i3 = ov8.D[tagDto.getIconPosition().ordinal()];
                if (i3 == 1) {
                    iconPosition = IconPosition.LEAD;
                } else {
                    if (i3 != i2) {
                        w511.b();
                        return preVar;
                    }
                    iconPosition = IconPosition.TRAIL;
                }
                IconPosition iconPosition2 = iconPosition;
                FormBadgeDto badge = tagDto.getBadge();
                ul4 B = badge != null ? B(badge) : preVar;
                TapActionDto action = tagDto.getAction();
                arrayList2.add(new f7x0(text, backgroundColor, textColor, J, iconPosition2, B, action != null ? x(action) : preVar, new x2s(tagDto.getMetricaLabel(), tagDto.getMeta()), w(tagDto.getAccessibilityInfo())));
                preVar = preVar;
                i2 = 2;
            }
            pre preVar2 = preVar;
            ViewModeDto viewMode2 = tagLineWidgetDto.getViewMode();
            boolean z2 = viewMode2 instanceof ViewModeDto.ViewMode_RowDto;
            c7x0 c7x0Var = b7x0.a;
            if (!z2) {
                if (viewMode2 instanceof ViewModeDto.ViewMode_BoxDto) {
                    c7x0Var = new a7x0(F(((ViewModeDto.ViewMode_BoxDto) viewMode2).b.getAlignment()));
                } else if (viewMode2 != null && !(viewMode2 instanceof ViewModeDto.Unknown_ViewModeDto)) {
                    w511.b();
                    return preVar2;
                }
            }
            return new y6x0(widgetId2, arrayList2, c7x0Var);
        }
        if (widgetDto instanceof WidgetDto.Widget_DividerDto) {
            DividerWidgetDto dividerWidgetDto = ((WidgetDto.Widget_DividerDto) widgetDto).b;
            String widgetId3 = dividerWidgetDto.getWidgetId();
            String groupTitleText = dividerWidgetDto.getGroupTitleText();
            Integer spacerHeight = dividerWidgetDto.getSpacerHeight();
            switch (ov8.e[dividerWidgetDto.getStyle().ordinal()]) {
                case 1:
                    dividerStyle = DividerStyle.GROUP_TITLE;
                    break;
                case 2:
                    dividerStyle = DividerStyle.LINE;
                    break;
                case 3:
                    dividerStyle = DividerStyle.LINE_MARGIN;
                    break;
                case 4:
                    dividerStyle = DividerStyle.LINE_SLOT;
                    break;
                case 5:
                    dividerStyle = DividerStyle.LINE_SLOT_MARGIN;
                    break;
                case 6:
                    dividerStyle = DividerStyle.FOCUS;
                    break;
                case 7:
                    dividerStyle = DividerStyle.FOCUS_MARGIN;
                    break;
                case 8:
                    dividerStyle = DividerStyle.SPACER;
                    break;
                case 9:
                    dividerStyle = DividerStyle.GROUP_SEPARATE_TITLES;
                    break;
                default:
                    w511.b();
                    return null;
            }
            DividerStyle dividerStyle2 = dividerStyle;
            List<DividerWidgetDto.GroupSeparateTitlesDto> groupSeparateTitles = dividerWidgetDto.getGroupSeparateTitles();
            if (groupSeparateTitles != null) {
                List<DividerWidgetDto.GroupSeparateTitlesDto> list = groupSeparateTitles;
                ArrayList arrayList3 = new ArrayList(tcc.n(list, 10));
                for (DividerWidgetDto.GroupSeparateTitlesDto groupSeparateTitlesDto : list) {
                    AttributedTextDto text2 = groupSeparateTitlesDto.getText();
                    gd3Var.getClass();
                    FormattedText b = gd3.b(text2);
                    int i4 = ov8.f[groupSeparateTitlesDto.getAlign().ordinal()];
                    if (i4 == 1) {
                        separateTitle$Align = SeparateTitle$Align.START;
                    } else if (i4 == 2) {
                        separateTitle$Align = SeparateTitle$Align.CENTER;
                    } else {
                        if (i4 != 3) {
                            w511.b();
                            return null;
                        }
                        separateTitle$Align = SeparateTitle$Align.END;
                    }
                    arrayList3.add(new irq0(b, separateTitle$Align));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            Boolean isFlexible = dividerWidgetDto.isFlexible();
            boolean booleanValue = isFlexible != null ? isFlexible.booleanValue() : false;
            HorizontalPaddingsDto horizontalPaddings = dividerWidgetDto.getHorizontalPaddings();
            return new frl(widgetId3, groupTitleText, spacerHeight, dividerStyle2, arrayList, booleanValue, horizontalPaddings != null ? I(horizontalPaddings) : null);
        }
        if (widgetDto instanceof WidgetDto.Widget_AddressDto) {
            return e(((WidgetDto.Widget_AddressDto) widgetDto).b);
        }
        if (widgetDto instanceof WidgetDto.Widget_ImageDto) {
            return o(((WidgetDto.Widget_ImageDto) widgetDto).b);
        }
        if (widgetDto instanceof WidgetDto.Widget_HeaderDto) {
            HeaderWidgetDto headerWidgetDto = ((WidgetDto.Widget_HeaderDto) widgetDto).b;
            String widgetId4 = headerWidgetDto.getWidgetId();
            ImageDto image = headerWidgetDto.getImage();
            sbv J2 = image != null ? J(image) : null;
            HeaderWidgetDto.TitleDto title = headerWidgetDto.getTitle();
            if (title instanceof b) {
                AttributedTextDto attributedTextDto = ((b) title).a;
                gd3Var.getClass();
                formattedText8 = gd3.b(attributedTextDto);
            } else {
                if (!(title instanceof ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.a) && !(title instanceof c)) {
                    w511.b();
                    return null;
                }
                formattedText8 = FormattedText.b;
            }
            FormattedText formattedText10 = formattedText8;
            TextParametersDto subtitleStyle = headerWidgetDto.getSubtitleStyle();
            hty0 X2 = subtitleStyle != null ? X(subtitleStyle) : null;
            fws0 W = W(headerWidgetDto.getTrail());
            SlotTrailDto trail2 = headerWidgetDto.getTrail2();
            return new obu(widgetId4, J2, formattedText10, X2, headerWidgetDto.getShowSubtitle(), W, trail2 != null ? W(trail2) : null, c(headerWidgetDto.getAddressFlow(), null));
        }
        if (widgetDto instanceof WidgetDto.Widget_SegmentDto) {
            SegmentWidgetDto segmentWidgetDto = ((WidgetDto.Widget_SegmentDto) widgetDto).b;
            return new q8q0(P(segmentWidgetDto.getAction(), l9q0.a), segmentWidgetDto.getWidgetId());
        }
        if (widgetDto instanceof WidgetDto.Widget_BannerCarouselDto) {
            BannerCarouselDto bannerCarouselDto = ((WidgetDto.Widget_BannerCarouselDto) widgetDto).b;
            return new qr4(bannerCarouselDto.getWidgetId(), bannerCarouselDto.getDisplayIds(), bannerCarouselDto.getMetricaLabel(), bannerCarouselDto.getTopPadding(), bannerCarouselDto.getBottomPadding());
        }
        if (widgetDto instanceof WidgetDto.Widget_ContactDto) {
            ContactWidgetDto contactWidgetDto = ((WidgetDto.Widget_ContactDto) widgetDto).b;
            String widgetId5 = contactWidgetDto.getWidgetId();
            ResultPositionDto resultPosition = contactWidgetDto.getResultPosition();
            if (resultPosition == null || (yzj0Var = N(resultPosition)) == null) {
                Integer routePointIndex = contactWidgetDto.getRoutePointIndex();
                yzj0Var = new yzj0(routePointIndex != null ? routePointIndex.intValue() : 0, b51.a);
            }
            c0k0 c0k0Var = yzj0Var;
            AttributedTextDto selectedDescription = contactWidgetDto.getSelectedDescription();
            gd3Var.getClass();
            FormattedText b2 = gd3.b(selectedDescription);
            FormattedText b3 = gd3.b(contactWidgetDto.getUnselectedDescription());
            TextParametersDto contactStyle = contactWidgetDto.getContactStyle();
            hty0 X3 = contactStyle != null ? X(contactStyle) : null;
            SlotLeadDto selectedLead = contactWidgetDto.getSelectedLead();
            lts0 U = selectedLead != null ? U(selectedLead) : null;
            SlotLeadDto unselectedLead = contactWidgetDto.getUnselectedLead();
            lts0 U2 = unselectedLead != null ? U(unselectedLead) : null;
            SlotTrailDto trail3 = contactWidgetDto.getTrail();
            fws0 W2 = trail3 != null ? W(trail3) : null;
            SlotTrailDto unselectedTrail = contactWidgetDto.getUnselectedTrail();
            fws0 W3 = unselectedTrail != null ? W(unselectedTrail) : null;
            ContactWidgetDto.ContactPositionDto contactPosition = contactWidgetDto.getContactPosition();
            int i5 = contactPosition == null ? -1 : ov8.p[contactPosition.ordinal()];
            if (i5 != -1) {
                if (i5 == 1) {
                    contactSelectorRemoteCoreWidget$ContactPositionModel = ContactSelectorRemoteCoreWidget$ContactPositionModel.TRAIL;
                } else if (i5 == 2) {
                    contactSelectorRemoteCoreWidget$ContactPositionModel = ContactSelectorRemoteCoreWidget$ContactPositionModel.TITLE;
                } else if (i5 != 3) {
                    w511.b();
                    return null;
                }
                ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel2 = contactSelectorRemoteCoreWidget$ContactPositionModel;
                prefill = contactWidgetDto.getPrefill();
                if (prefill == null) {
                    if (prefill instanceof ContactPrefillDto.ContactPrefill_OwnerNumberDto) {
                        sbeVar2 = qbe.a;
                    } else {
                        if (!(prefill instanceof ContactPrefillDto.Unknown_ContactPrefillDto)) {
                            w511.b();
                            return null;
                        }
                        sbeVar2 = rbe.a;
                    }
                    sbeVar = sbeVar2;
                } else {
                    sbeVar = null;
                }
                String metricaLabel = contactWidgetDto.getMetricaLabel();
                Object meta = contactWidgetDto.getMeta();
                Map map = !(meta instanceof Map) ? (Map) meta : null;
                HorizontalPaddingsDto horizontalPaddings2 = contactWidgetDto.getHorizontalPaddings();
                return new tbe(widgetId5, c0k0Var, contactSelectorRemoteCoreWidget$ContactPositionModel2, b2, b3, X3, U, U2, W2, W3, horizontalPaddings2 == null ? I(horizontalPaddings2) : null, sbeVar, metricaLabel, map);
            }
            contactSelectorRemoteCoreWidget$ContactPositionModel = ContactSelectorRemoteCoreWidget$ContactPositionModel.SUBTITLE;
            ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel22 = contactSelectorRemoteCoreWidget$ContactPositionModel;
            prefill = contactWidgetDto.getPrefill();
            if (prefill == null) {
            }
            String metricaLabel2 = contactWidgetDto.getMetricaLabel();
            Object meta2 = contactWidgetDto.getMeta();
            if (!(meta2 instanceof Map)) {
            }
            HorizontalPaddingsDto horizontalPaddings22 = contactWidgetDto.getHorizontalPaddings();
            return new tbe(widgetId5, c0k0Var, contactSelectorRemoteCoreWidget$ContactPositionModel22, b2, b3, X3, U, U2, W2, W3, horizontalPaddings22 == null ? I(horizontalPaddings22) : null, sbeVar, metricaLabel2, map);
        }
        boolean z3 = widgetDto instanceof WidgetDto.Widget_NotificationDto;
        EmptyList emptyList2 = EmptyList.a;
        if (z3) {
            NotificationWidgetDto notificationWidgetDto = ((WidgetDto.Widget_NotificationDto) widgetDto).b;
            String widgetId6 = notificationWidgetDto.getWidgetId();
            its0 its0Var = new its0(J(notificationWidgetDto.getLeadIcon()), null);
            AttributedTextDto title2 = notificationWidgetDto.getTitle();
            if (title2 != null) {
                gd3Var.getClass();
                formattedText7 = gd3.b(title2);
            } else {
                formattedText7 = null;
            }
            AttributedTextDto subtitle2 = notificationWidgetDto.getSubtitle();
            gd3Var.getClass();
            hqs0 hqs0Var = new hqs0(formattedText7, gd3.b(subtitle2), Align.LEADING, null, null, null);
            TrailNavDto trailNav = notificationWidgetDto.getTrailNav();
            wvs0 wvs0Var = trailNav != null ? new wvs0(trailNav.getTintColor(), trailNav.getMetricaLabel(), trailNav.getPresentationId()) : null;
            TapActionDto action2 = notificationWidgetDto.getAction();
            return new cj60(widgetId6, new xts0(its0Var, hqs0Var, null, null, wvs0Var, null, action2 != null ? x(action2) : null, true, qus0.e, emptyList2, SlotModel$Size.L), notificationWidgetDto.getBackgroundColor(), notificationWidgetDto.getMetricaLabel());
        }
        if (widgetDto instanceof WidgetDto.Widget_DiscountDto) {
            DiscountWidgetDto discountWidgetDto = ((WidgetDto.Widget_DiscountDto) widgetDto).b;
            String widgetId7 = discountWidgetDto.getWidgetId();
            ImageDto leadImage = discountWidgetDto.getLeadImage();
            sbv J3 = leadImage != null ? J(leadImage) : null;
            String backgroundColor2 = discountWidgetDto.getBackgroundColor();
            AttributedTextDto text3 = discountWidgetDto.getText();
            gd3Var.getClass();
            FormattedText b4 = gd3.b(text3);
            ImageDto trailImage = discountWidgetDto.getTrailImage();
            sbv J4 = trailImage != null ? J(trailImage) : null;
            TapActionDto action3 = discountWidgetDto.getAction();
            return new roj(widgetId7, J3, backgroundColor2, b4, J4, action3 != null ? x(action3) : null, new x2s(discountWidgetDto.getMetricaLabel(), discountWidgetDto.getMeta()));
        }
        if (widgetDto instanceof WidgetDto.Widget_CostDetailDto) {
            CostDetailWidgetDto costDetailWidgetDto = ((WidgetDto.Widget_CostDetailDto) widgetDto).b;
            String widgetId8 = costDetailWidgetDto.getWidgetId();
            AttributedTextDto leadText = costDetailWidgetDto.getLeadText();
            gd3Var.getClass();
            FormattedText b5 = gd3.b(leadText);
            FormattedText b6 = gd3.b(costDetailWidgetDto.getTrailText());
            hty0 X4 = X(costDetailWidgetDto.getDotStyle());
            PaddingsDto paddings = costDetailWidgetDto.getPaddings();
            return new yxe(widgetId8, b5, b6, X4, paddings != null ? L(paddings) : null);
        }
        if (widgetDto instanceof WidgetDto.Widget_SelectorDto) {
            SelectorWidgetDto selectorWidgetDto = ((WidgetDto.Widget_SelectorDto) widgetDto).b;
            String widgetId9 = selectorWidgetDto.getWidgetId();
            String formStateKey = selectorWidgetDto.getFormStateKey();
            List<SelectorOptionDto> options = selectorWidgetDto.getOptions();
            ArrayList arrayList4 = new ArrayList(tcc.n(options, 10));
            for (SelectorOptionDto selectorOptionDto : options) {
                Object value = selectorOptionDto.getValue();
                boolean isAvailable = selectorOptionDto.isAvailable();
                AttributedTextDto title3 = selectorOptionDto.getTitle();
                gd3Var.getClass();
                FormattedText b7 = gd3.b(title3);
                AttributedTextDto subtitle3 = selectorOptionDto.getSubtitle();
                FormattedText b8 = subtitle3 != null ? gd3.b(subtitle3) : null;
                String imageTag = selectorOptionDto.getImageTag();
                AttributedTextDto bottomText = selectorOptionDto.getBottomText();
                FormattedText b9 = bottomText != null ? gd3.b(bottomText) : null;
                AttributedTextDto bottomSubtitle = selectorOptionDto.getBottomSubtitle();
                FormattedText b10 = bottomSubtitle != null ? gd3.b(bottomSubtitle) : null;
                TapActionDto action4 = selectorOptionDto.getAction();
                arrayList4.add(new xlq0(value, isAvailable, b7, b8, imageTag, b9, b10, action4 != null ? x(action4) : null));
            }
            boolean disabledUnselect = selectorWidgetDto.getDisabledUnselect();
            AttributedTextDto bottomText2 = selectorWidgetDto.getBottomText();
            if (bottomText2 != null) {
                gd3Var.getClass();
                formattedText6 = gd3.b(bottomText2);
            } else {
                formattedText6 = null;
            }
            return new ylq0(widgetId9, formStateKey, arrayList4, disabledUnselect, formattedText6, selectorWidgetDto.getMetricaLabel());
        }
        if (widgetDto instanceof WidgetDto.Widget_TabsDto) {
            TabsWidgetDto tabsWidgetDto = ((WidgetDto.Widget_TabsDto) widgetDto).b;
            Iterator<TabOptionDto> it2 = tabsWidgetDto.getOptions().iterator();
            int i6 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i6 = -1;
                    break;
                }
                Boolean bool = it2.next().getDefault();
                if (bool != null ? bool.booleanValue() : false) {
                    break;
                }
                i6++;
            }
            Integer valueOf = Integer.valueOf(i6);
            if (i6 == -1) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            String widgetId10 = tabsWidgetDto.getWidgetId();
            String formStateKey2 = tabsWidgetDto.getFormStateKey();
            List<TabOptionDto> options2 = tabsWidgetDto.getOptions();
            ArrayList arrayList5 = new ArrayList(tcc.n(options2, 10));
            for (TabOptionDto tabOptionDto : options2) {
                AttributedTextDto selectedText = tabOptionDto.getSelectedText();
                gd3Var.getClass();
                FormattedText b11 = gd3.b(selectedText);
                FormattedText b12 = gd3.b(tabOptionDto.getUnselectedText());
                Object value2 = tabOptionDto.getValue();
                TapActionDto selectionAction = tabOptionDto.getSelectionAction();
                arrayList5.add(new y4x0(b11, b12, value2, selectionAction != null ? x(selectionAction) : null));
            }
            return new f6x0(widgetId10, formStateKey2, arrayList5, intValue, tabsWidgetDto.getMetricaLabel());
        }
        if (widgetDto instanceof WidgetDto.Widget_TextDto) {
            return u(((WidgetDto.Widget_TextDto) widgetDto).b);
        }
        if (widgetDto instanceof WidgetDto.Widget_TextInputDto) {
            TextInputWidgetDto textInputWidgetDto = ((WidgetDto.Widget_TextInputDto) widgetDto).b;
            String widgetId11 = textInputWidgetDto.getWidgetId();
            int height = textInputWidgetDto.getHeight();
            String placeholder = textInputWidgetDto.getPlaceholder();
            TextInputStyleDto focusedStyle = textInputWidgetDto.getFocusedStyle();
            if (focusedStyle != null) {
                String backgroundColor3 = focusedStyle.getBackgroundColor();
                BorderDto border = focusedStyle.getBorder();
                dqy0Var = new dqy0(backgroundColor3, border != null ? new qa6(border.getColor(), border.getWidth()) : null);
            } else {
                dqy0Var = null;
            }
            TextInputStyleDto unfocusedStyle = textInputWidgetDto.getUnfocusedStyle();
            if (unfocusedStyle != null) {
                String backgroundColor4 = unfocusedStyle.getBackgroundColor();
                BorderDto border2 = unfocusedStyle.getBorder();
                dqy0Var2 = new dqy0(backgroundColor4, border2 != null ? new qa6(border2.getColor(), border2.getWidth()) : null);
            } else {
                dqy0Var2 = null;
            }
            String formStateKey3 = textInputWidgetDto.getFormStateKey();
            List<SlotTrailDto> trails = textInputWidgetDto.getTrails();
            if (trails != null) {
                ?? arrayList6 = new ArrayList();
                Iterator it3 = trails.iterator();
                while (it3.hasNext()) {
                    fws0 W4 = W((SlotTrailDto) it3.next());
                    if (W4 != null) {
                        arrayList6.add(W4);
                    }
                }
                emptyList = arrayList6;
            } else {
                emptyList = emptyList2;
            }
            TextInputStopWordsConfigDto stopWordsConfig = textInputWidgetDto.getStopWordsConfig();
            if (stopWordsConfig != null) {
                List<TextInputStopWordsItemDto> items = stopWordsConfig.getItems();
                ArrayList arrayList7 = new ArrayList(tcc.n(items, 10));
                for (TextInputStopWordsItemDto textInputStopWordsItemDto : items) {
                    List<TextInputStopWordRuleDto> stopWords = textInputStopWordsItemDto.getStopWords();
                    ArrayList arrayList8 = new ArrayList(tcc.n(stopWords, 10));
                    for (TextInputStopWordRuleDto textInputStopWordRuleDto : stopWords) {
                        int i7 = ov8.n[textInputStopWordRuleDto.getRuleType().ordinal()];
                        if (i7 == 1) {
                            stopWordRule$RuleType = StopWordRule$RuleType.PREFIX;
                        } else if (i7 == 2) {
                            stopWordRule$RuleType = StopWordRule$RuleType.SUBSTRING;
                        } else {
                            if (i7 != 3) {
                                w511.b();
                                return null;
                            }
                            stopWordRule$RuleType = StopWordRule$RuleType.WORD;
                        }
                        arrayList8.add(new xhu0(stopWordRule$RuleType, textInputStopWordRuleDto.getValue()));
                    }
                    AttributedTextDto errorText = textInputStopWordsItemDto.getErrorText();
                    if (errorText != null) {
                        gd3Var.getClass();
                        formattedText5 = gd3.b(errorText);
                    } else {
                        formattedText5 = null;
                    }
                    arrayList7.add(new bqy0(arrayList8, formattedText5, textInputStopWordsItemDto.getStateValue(), textInputStopWordsItemDto.getMetricaLabel()));
                }
                zpy0Var = new zpy0(arrayList7, stopWordsConfig.getFormStateKey());
            } else {
                zpy0Var = null;
            }
            return new kpy0(widgetId11, height, placeholder, dqy0Var, dqy0Var2, formStateKey3, emptyList, zpy0Var, textInputWidgetDto.getMaxSymbols(), jl40.l(textInputWidgetDto.getForceOpenKeyboard(), Boolean.TRUE), textInputWidgetDto.getHorizontalInset(), textInputWidgetDto.getMetricaLabel());
        }
        if (widgetDto instanceof WidgetDto.Widget_NumericInputDto) {
            NumericInputWidgetDto numericInputWidgetDto = ((WidgetDto.Widget_NumericInputDto) widgetDto).b;
            String widgetId12 = numericInputWidgetDto.getWidgetId();
            String placeholder2 = numericInputWidgetDto.getPlaceholder();
            String caption = numericInputWidgetDto.getCaption();
            String formStateKey4 = numericInputWidgetDto.getFormStateKey();
            boolean l = jl40.l(numericInputWidgetDto.getForceOpenKeyboard(), Boolean.TRUE);
            ImageDto leadIcon = numericInputWidgetDto.getLeadIcon();
            sbv J5 = leadIcon != null ? J(leadIcon) : null;
            String metricaLabel3 = numericInputWidgetDto.getMetricaLabel();
            InputTypeDto inputType = numericInputWidgetDto.getInputType();
            if (inputType instanceof InputTypeDto.InputType_NumberDto) {
                NumberInputTypeDto numberInputTypeDto = ((InputTypeDto.InputType_NumberDto) inputType).b;
                Integer minValue = numberInputTypeDto.getMinValue();
                if (minValue == null) {
                    minValue = numericInputWidgetDto.getMinValue();
                }
                BigDecimal valueOf2 = minValue != null ? BigDecimal.valueOf(minValue.intValue()) : null;
                Integer maxValue = numberInputTypeDto.getMaxValue();
                if (maxValue == null) {
                    maxValue = numericInputWidgetDto.getMaxValue();
                }
                BigDecimal valueOf3 = maxValue != null ? BigDecimal.valueOf(maxValue.intValue()) : null;
                AttributedTextDto invalidInputMessage = numberInputTypeDto.getInvalidInputMessage();
                if (invalidInputMessage == null) {
                    invalidInputMessage = numericInputWidgetDto.getInvalidInputMessage();
                }
                if (invalidInputMessage != null) {
                    gd3Var.getClass();
                    formattedText4 = gd3.b(invalidInputMessage);
                } else {
                    formattedText4 = null;
                }
                z0wVar = new x0w(valueOf2, valueOf3, formattedText4);
            } else {
                if (!(inputType instanceof InputTypeDto.InputType_PhoneDto)) {
                    if (inputType != null && !(inputType instanceof InputTypeDto.Unknown_InputTypeDto)) {
                        w511.b();
                        return null;
                    }
                    BigDecimal valueOf4 = numericInputWidgetDto.getMinValue() != null ? BigDecimal.valueOf(r1.intValue()) : null;
                    BigDecimal valueOf5 = numericInputWidgetDto.getMaxValue() != null ? BigDecimal.valueOf(r2.intValue()) : null;
                    AttributedTextDto invalidInputMessage2 = numericInputWidgetDto.getInvalidInputMessage();
                    if (invalidInputMessage2 != null) {
                        gd3Var.getClass();
                        formattedText3 = gd3.b(invalidInputMessage2);
                    } else {
                        formattedText3 = null;
                    }
                    x0wVar = new x0w(valueOf4, valueOf5, formattedText3);
                    return new do60(widgetId12, placeholder2, caption, formStateKey4, J5, l, metricaLabel3, x0wVar);
                }
                z0wVar = y0w.a;
            }
            x0wVar = z0wVar;
            return new do60(widgetId12, placeholder2, caption, formStateKey4, J5, l, metricaLabel3, x0wVar);
        }
        if (widgetDto instanceof WidgetDto.Widget_MultiAddressDto) {
            return q(((WidgetDto.Widget_MultiAddressDto) widgetDto).b);
        }
        if (widgetDto instanceof WidgetDto.Widget_FieldDisplayDto) {
            FieldDisplayWidgetDto fieldDisplayWidgetDto = ((WidgetDto.Widget_FieldDisplayDto) widgetDto).b;
            String widgetId13 = fieldDisplayWidgetDto.getWidgetId();
            int i8 = ov8.h[fieldDisplayWidgetDto.getFieldPosition().ordinal()];
            if (i8 == 1) {
                fieldPosition = FieldPosition.TITLE;
            } else {
                if (i8 != 2) {
                    w511.b();
                    return null;
                }
                fieldPosition = FieldPosition.SUBTITLE;
            }
            FieldPosition fieldPosition2 = fieldPosition;
            String formStateKey5 = fieldDisplayWidgetDto.getFormStateKey();
            hty0 X5 = X(fieldDisplayWidgetDto.getFieldStyle());
            AttributedTextDto filledDescription = fieldDisplayWidgetDto.getFilledDescription();
            if (filledDescription != null) {
                gd3Var.getClass();
                formattedText2 = gd3.b(filledDescription);
            } else {
                formattedText2 = null;
            }
            SlotLeadDto filledLead = fieldDisplayWidgetDto.getFilledLead();
            lts0 U3 = filledLead != null ? U(filledLead) : null;
            AttributedTextDto emptyDescription = fieldDisplayWidgetDto.getEmptyDescription();
            gd3Var.getClass();
            FormattedText b13 = gd3.b(emptyDescription);
            SlotLeadDto emptyLead = fieldDisplayWidgetDto.getEmptyLead();
            lts0 U4 = emptyLead != null ? U(emptyLead) : null;
            SlotTrailDto trail4 = fieldDisplayWidgetDto.getTrail();
            fws0 W5 = trail4 != null ? W(trail4) : null;
            TapActionDto action5 = fieldDisplayWidgetDto.getAction();
            return new nxq(widgetId13, fieldPosition2, formStateKey5, X5, formattedText2, U3, b13, U4, W5, action5 != null ? x(action5) : null, fieldDisplayWidgetDto.getMetricaLabel(), V(fieldDisplayWidgetDto.getStyle()));
        }
        if (widgetDto instanceof WidgetDto.Widget_EditableRouteWidgetsDto) {
            EditableRouteWidgetsDto editableRouteWidgetsDto = ((WidgetDto.Widget_EditableRouteWidgetsDto) widgetDto).b;
            String widgetId14 = editableRouteWidgetsDto.getWidgetId();
            List<RoutePointWidgetConfigurationDto> routePointWidgets = editableRouteWidgetsDto.getRoutePointWidgets();
            ArrayList arrayList9 = new ArrayList(tcc.n(routePointWidgets, 10));
            for (RoutePointWidgetConfigurationDto routePointWidgetConfigurationDto : routePointWidgets) {
                RoutePointWidgetDto widget = routePointWidgetConfigurationDto.getWidget();
                if (widget instanceof RoutePointWidgetDto.RoutePointWidget_AddressDto) {
                    honVar = e(((RoutePointWidgetDto.RoutePointWidget_AddressDto) widget).b);
                } else if (widget instanceof RoutePointWidgetDto.RoutePointWidget_MultiAddressDto) {
                    honVar = q(((RoutePointWidgetDto.RoutePointWidget_MultiAddressDto) widget).b);
                } else {
                    if (!(widget instanceof RoutePointWidgetDto.Unknown_RoutePointWidgetDto)) {
                        w511.b();
                        return null;
                    }
                    honVar = v121.a;
                }
                arrayList9.add(new e8l0(honVar, routePointWidgetConfigurationDto.getPositionChangingAvailable(), routePointWidgetConfigurationDto.getRemovalAvailable()));
            }
            return new wnn(widgetId14, arrayList9, c(editableRouteWidgetsDto.getAddressFlow(), null), editableRouteWidgetsDto.getMetricaLabel());
        }
        if (widgetDto instanceof WidgetDto.Widget_ScrollableItemsDto) {
            ScrollableItemsWidgetDto scrollableItemsWidgetDto = ((WidgetDto.Widget_ScrollableItemsDto) widgetDto).b;
            String widgetId15 = scrollableItemsWidgetDto.getWidgetId();
            x2s x2sVar = new x2s(scrollableItemsWidgetDto.getMetricaLabel(), null);
            List<ScrollableItemDto> items2 = scrollableItemsWidgetDto.getItems();
            ArrayList arrayList10 = new ArrayList(tcc.n(items2, 10));
            Iterator it4 = items2.iterator();
            while (it4.hasNext()) {
                ScrollableItemDto scrollableItemDto = (ScrollableItemDto) it4.next();
                AttributedTextDto title4 = scrollableItemDto.getTitle();
                gd3Var.getClass();
                FormattedText b14 = gd3.b(title4);
                AttributedTextDto subtitle4 = scrollableItemDto.getSubtitle();
                FormattedText b15 = subtitle4 != null ? gd3.b(subtitle4) : null;
                String backgroundColor5 = scrollableItemDto.getBackgroundColor();
                sbv J6 = J(scrollableItemDto.getImage());
                TapActionDto action6 = scrollableItemDto.getAction();
                r9x0 x = action6 != null ? x(action6) : null;
                ScrollableItemBadgeDto badge2 = scrollableItemDto.getBadge();
                if (badge2 != null) {
                    FormattedText b16 = gd3.b(badge2.getText());
                    String backgroundColor6 = badge2.getBackgroundColor();
                    ScrollableItemBadgeDto.AnchorDto anchor = badge2.getAnchor();
                    int i9 = anchor == null ? -1 : ov8.k[anchor.ordinal()];
                    it = it4;
                    if (i9 == -1) {
                        scrollableItemBadge$Anchor = null;
                    } else if (i9 == 1) {
                        scrollableItemBadge$Anchor = ScrollableItemBadge$Anchor.TRAILING;
                    } else {
                        if (i9 != 2) {
                            w511.b();
                            return null;
                        }
                        scrollableItemBadge$Anchor = ScrollableItemBadge$Anchor.LEADING;
                    }
                    xjp0Var = new xjp0(b16, backgroundColor6, scrollableItemBadge$Anchor);
                } else {
                    it = it4;
                    xjp0Var = null;
                }
                arrayList10.add(new wjp0(b14, b15, backgroundColor5, J6, x, xjp0Var, new x2s(scrollableItemDto.getMetricaLabel(), scrollableItemDto.getMeta())));
                it4 = it;
            }
            return new dkp0(x2sVar, widgetId15, arrayList10);
        }
        if (widgetDto instanceof WidgetDto.Widget_BubbleTogglesDto) {
            BubbleToggleWidgetDto bubbleToggleWidgetDto = ((WidgetDto.Widget_BubbleTogglesDto) widgetDto).b;
            String widgetId16 = bubbleToggleWidgetDto.getWidgetId();
            List<BubbleToggleDto> toggles = bubbleToggleWidgetDto.getToggles();
            ArrayList arrayList11 = new ArrayList(tcc.n(toggles, 10));
            for (BubbleToggleDto bubbleToggleDto : toggles) {
                String id = bubbleToggleDto.getId();
                int i10 = ov8.C[bubbleToggleDto.getSize().ordinal()];
                if (i10 == 1) {
                    bubbleToggleModel$Size = BubbleToggleModel$Size.XS;
                } else if (i10 == 2) {
                    bubbleToggleModel$Size = BubbleToggleModel$Size.S;
                } else if (i10 == 3) {
                    bubbleToggleModel$Size = BubbleToggleModel$Size.M;
                } else {
                    if (i10 != 4) {
                        w511.b();
                        return null;
                    }
                    bubbleToggleModel$Size = BubbleToggleModel$Size.L;
                }
                BubbleToggleModel$Size bubbleToggleModel$Size2 = bubbleToggleModel$Size;
                String text4 = bubbleToggleDto.getText();
                TextParametersDto textStyle = bubbleToggleDto.getTextStyle();
                hty0 X6 = textStyle != null ? X(textStyle) : null;
                ImageDto icon2 = bubbleToggleDto.getIcon();
                arrayList11.add(new fo6(id, bubbleToggleModel$Size2, text4, X6, icon2 != null ? J(icon2) : null, new x2s(bubbleToggleDto.getMetricaLabel(), bubbleToggleDto.getMeta())));
            }
            String formStateKey6 = bubbleToggleWidgetDto.getFormStateKey();
            Boolean isMultichoice = bubbleToggleWidgetDto.isMultichoice();
            boolean booleanValue2 = isMultichoice != null ? isMultichoice.booleanValue() : false;
            int i11 = ov8.d[bubbleToggleWidgetDto.getViewMode().ordinal()];
            if (i11 == 1) {
                viewMode = ViewMode.ROW;
            } else {
                if (i11 != 2) {
                    w511.b();
                    return null;
                }
                viewMode = ViewMode.BOX;
            }
            return new go6(widgetId16, arrayList11, formStateKey6, booleanValue2, viewMode);
        }
        if (widgetDto instanceof WidgetDto.Widget_UploadedImagesPreviewDto) {
            UploadedImagesPreviewWidgetDto uploadedImagesPreviewWidgetDto = ((WidgetDto.Widget_UploadedImagesPreviewDto) widgetDto).b;
            String widgetId17 = uploadedImagesPreviewWidgetDto.getWidgetId();
            ResultPositionDto resultPosition2 = uploadedImagesPreviewWidgetDto.getResultPosition();
            if (resultPosition2 == null || (zzj0Var = N(resultPosition2)) == null) {
                zzj0Var = new zzj0(uploadedImagesPreviewWidgetDto.getFormStateKey());
            }
            c0k0 c0k0Var2 = zzj0Var;
            int i12 = ov8.H[uploadedImagesPreviewWidgetDto.getSize().ordinal()];
            if (i12 == 1) {
                uploadedImagesPreviewSize = UploadedImagesPreviewSize.M;
            } else {
                if (i12 != 2) {
                    w511.b();
                    return null;
                }
                uploadedImagesPreviewSize = UploadedImagesPreviewSize.L;
            }
            UploadedImagesPreviewSize uploadedImagesPreviewSize2 = uploadedImagesPreviewSize;
            PaddingsDto contentPaddings = uploadedImagesPreviewWidgetDto.getContentPaddings();
            return new pd21(widgetId17, c0k0Var2, uploadedImagesPreviewSize2, contentPaddings != null ? L(contentPaddings) : pd21.f, uploadedImagesPreviewWidgetDto.getMetricaLabel());
        }
        if (widgetDto instanceof WidgetDto.Widget_ScenarioSelectorDto) {
            ScenarioSelectorWidgetDto scenarioSelectorWidgetDto = ((WidgetDto.Widget_ScenarioSelectorDto) widgetDto).b;
            String widgetId18 = scenarioSelectorWidgetDto.getWidgetId();
            String formStateKey7 = scenarioSelectorWidgetDto.getFormStateKey();
            List<ScenarioSelectorOptionDto> options3 = scenarioSelectorWidgetDto.getOptions();
            ArrayList arrayList12 = new ArrayList(tcc.n(options3, 10));
            for (ScenarioSelectorOptionDto scenarioSelectorOptionDto : options3) {
                Object value3 = scenarioSelectorOptionDto.getValue();
                xts0 S = S(scenarioSelectorOptionDto.getSlot(), new Pair(1, 2));
                AttributedImageDto selectedImage = scenarioSelectorOptionDto.getSelectedImage();
                if (selectedImage instanceof AttributedImageDto.AttributedImage_LottieAnimationDto) {
                    LottieAnimationDto lottieAnimationDto = ((AttributedImageDto.AttributedImage_LottieAnimationDto) selectedImage).b;
                    bd3Var = new ad3(lottieAnimationDto.getUrl(), lottieAnimationDto.getWidth(), lottieAnimationDto.getHeight());
                } else if (selectedImage instanceof AttributedImageDto.AttributedImage_StaticImageDto) {
                    StaticImageDto staticImageDto = ((AttributedImageDto.AttributedImage_StaticImageDto) selectedImage).b;
                    bd3Var = new bd3(J(staticImageDto.getImage()), staticImageDto.getWidth(), staticImageDto.getHeight());
                } else {
                    if (!(selectedImage instanceof AttributedImageDto.Unknown_AttributedImageDto)) {
                        w511.b();
                        return null;
                    }
                    cd3Var = null;
                    String backgroundColor7 = scenarioSelectorOptionDto.getBackgroundColor();
                    Boolean bool2 = scenarioSelectorOptionDto.getDefault();
                    arrayList12.add(new xmm0(value3, S, cd3Var, backgroundColor7, bool2 == null ? bool2.booleanValue() : false, scenarioSelectorOptionDto.getEnabled(), scenarioSelectorOptionDto.getMetricaLabel()));
                }
                cd3Var = bd3Var;
                String backgroundColor72 = scenarioSelectorOptionDto.getBackgroundColor();
                Boolean bool22 = scenarioSelectorOptionDto.getDefault();
                arrayList12.add(new xmm0(value3, S, cd3Var, backgroundColor72, bool22 == null ? bool22.booleanValue() : false, scenarioSelectorOptionDto.getEnabled(), scenarioSelectorOptionDto.getMetricaLabel()));
            }
            CollapsedStateConfigDto collapsedStateConfig = scenarioSelectorWidgetDto.getCollapsedStateConfig();
            if (collapsedStateConfig != null) {
                int i13 = ov8.c[collapsedStateConfig.getInitialState().ordinal()];
                if (i13 == 1) {
                    scenarioSelectorState = ScenarioSelectorState.COLLAPSED;
                } else {
                    if (i13 != 2) {
                        w511.b();
                        return null;
                    }
                    scenarioSelectorState = ScenarioSelectorState.EXPANDED;
                }
                AttributedTextDto text5 = collapsedStateConfig.getCollapseButton().getText();
                gd3Var.getClass();
                dbcVar = new dbc(scenarioSelectorState, new rmm0(gd3.b(text5), collapsedStateConfig.getCollapseButton().getBackgroundColor(), collapsedStateConfig.getCollapseButton().getMetricaLabel()), new rmm0(gd3.b(collapsedStateConfig.getExpandButton().getText()), collapsedStateConfig.getExpandButton().getBackgroundColor(), collapsedStateConfig.getExpandButton().getMetricaLabel()));
            } else {
                dbcVar = null;
            }
            return new ymm0(widgetId18, formStateKey7, arrayList12, dbcVar);
        }
        if (widgetDto instanceof WidgetDto.Widget_InputCircleDto) {
            InputCircleWidgetDto inputCircleWidgetDto2 = ((WidgetDto.Widget_InputCircleDto) widgetDto).b;
            String widgetId19 = inputCircleWidgetDto2.getWidgetId();
            InputCircleInputValueDto inputValue = inputCircleWidgetDto2.getInputValue();
            int minInputValue = inputValue.getMinInputValue();
            List<InputCircleValueStepDto> inputValueSteps = inputValue.getInputValueSteps();
            ArrayList arrayList13 = new ArrayList(tcc.n(inputValueSteps, 10));
            for (InputCircleValueStepDto inputCircleValueStepDto : inputValueSteps) {
                arrayList13.add(new n131(inputCircleValueStepDto.getValue(), inputCircleValueStepDto.getStep()));
            }
            a1w a1wVar = new a1w(minInputValue, arrayList13);
            String minValueTitle = inputCircleWidgetDto2.getMinValueTitle();
            String text6 = inputCircleWidgetDto2.getValueText().getText();
            TextParametersDto textStyle2 = inputCircleWidgetDto2.getValueText().getTextStyle();
            hty0 X7 = textStyle2 != null ? X(textStyle2) : null;
            String formatMask = inputCircleWidgetDto2.getValueText().getFormatMask();
            List<String> gradientColors = inputCircleWidgetDto2.getGradientColors();
            String formStateKey8 = inputCircleWidgetDto2.getFormStateKey();
            AttributedTextDto subtitle5 = inputCircleWidgetDto2.getSubtitle();
            if (subtitle5 != null) {
                gd3Var.getClass();
                formattedText = gd3.b(subtitle5);
            } else {
                formattedText = null;
            }
            InputCircleWidgetDto.IconDto icon3 = inputCircleWidgetDto2.getIcon();
            if (icon3 != null) {
                if (icon3 instanceof d) {
                    List<InputCircleIconMatchesDto> icons = ((d) icon3).a.getIcons();
                    ArrayList arrayList14 = new ArrayList(tcc.n(icons, 10));
                    Iterator it5 = icons.iterator();
                    while (it5.hasNext()) {
                        InputCircleIconMatchesDto inputCircleIconMatchesDto = (InputCircleIconMatchesDto) it5.next();
                        String iconTag = inputCircleIconMatchesDto.getIconTag();
                        List<InputCircleIconMatchDto> matches = inputCircleIconMatchesDto.getMatches();
                        InputCircleWidgetDto inputCircleWidgetDto3 = inputCircleWidgetDto2;
                        Iterator it6 = it5;
                        ArrayList arrayList15 = new ArrayList(tcc.n(matches, i));
                        for (Iterator it7 = matches.iterator(); it7.hasNext(); it7 = it7) {
                            InputCircleIconMatchDto inputCircleIconMatchDto = (InputCircleIconMatchDto) it7.next();
                            arrayList15.add(new t4v(inputCircleIconMatchDto.getKey(), inputCircleIconMatchDto.getValue()));
                        }
                        arrayList14.add(new u4v(iconTag, arrayList15));
                        it5 = it6;
                        inputCircleWidgetDto2 = inputCircleWidgetDto3;
                        i = 10;
                    }
                    inputCircleWidgetDto = inputCircleWidgetDto2;
                    s6b1Var2 = new zxv(arrayList14);
                } else {
                    inputCircleWidgetDto = inputCircleWidgetDto2;
                    if (icon3 instanceof e) {
                        ImageDto imageDto = ((e) icon3).a;
                        s6b1Var2 = new ayv(imageDto.getImageTag(), imageDto.getUrl(), imageDto.getTintColor());
                    } else {
                        if (!(icon3 instanceof f)) {
                            w511.b();
                            return null;
                        }
                        s6b1Var2 = byv.a;
                    }
                }
                s6b1Var = s6b1Var2;
            } else {
                inputCircleWidgetDto = inputCircleWidgetDto2;
                s6b1Var = null;
            }
            TapActionDto action7 = inputCircleWidgetDto.getAction();
            return new sub(widgetId19, a1wVar, text6, X7, formatMask, minValueTitle, gradientColors, formStateKey8, formattedText, s6b1Var, action7 != null ? x(action7) : null, inputCircleWidgetDto.getMetricaLabel());
        }
        if (widgetDto instanceof WidgetDto.Widget_ButtonsRowDto) {
            return m((WidgetDto.Widget_ButtonsRowDto) widgetDto);
        }
        if (widgetDto instanceof WidgetDto.Widget_PickerDto) {
            return v((WidgetDto.Widget_PickerDto) widgetDto);
        }
        if (widgetDto instanceof WidgetDto.Widget_LoadingSpinnerDto) {
            LoadingSpinnerWidgetDto loadingSpinnerWidgetDto = ((WidgetDto.Widget_LoadingSpinnerDto) widgetDto).b;
            return new w0z(loadingSpinnerWidgetDto.getWidgetId(), loadingSpinnerWidgetDto.getColor());
        }
        if (widgetDto instanceof WidgetDto.Widget_ScalableSelectorDto) {
            return s((WidgetDto.Widget_ScalableSelectorDto) widgetDto);
        }
        if (widgetDto instanceof WidgetDto.Widget_MiniMapDto) {
            return p(((WidgetDto.Widget_MiniMapDto) widgetDto).b);
        }
        if (widgetDto instanceof WidgetDto.Widget_ProgressDto) {
            return r(((WidgetDto.Widget_ProgressDto) widgetDto).b);
        }
        if (widgetDto instanceof WidgetDto.Widget_VerticalStackDto) {
            VerticalStackWidgetDto verticalStackWidgetDto = ((WidgetDto.Widget_VerticalStackDto) widgetDto).b;
            String widgetId20 = verticalStackWidgetDto.getWidgetId();
            List<WidgetDto> widgets = verticalStackWidgetDto.getWidgets();
            ArrayList arrayList16 = new ArrayList(tcc.n(widgets, 10));
            Iterator it8 = widgets.iterator();
            while (it8.hasNext()) {
                arrayList16.add(i((WidgetDto) it8.next()));
            }
            BackgroundDto background = verticalStackWidgetDto.getBackground();
            rh4 z4 = background != null ? z(background) : null;
            int cornerRadius = verticalStackWidgetDto.getCornerRadius();
            PaddingsDto paddings2 = verticalStackWidgetDto.getPaddings();
            o690 L = paddings2 != null ? L(paddings2) : null;
            PaddingsDto contentPaddings2 = verticalStackWidgetDto.getContentPaddings();
            return new kg31(widgetId20, arrayList16, z4, cornerRadius, L, contentPaddings2 != null ? L(contentPaddings2) : null, verticalStackWidgetDto.getMetricaLabel());
        }
        if (widgetDto instanceof WidgetDto.Widget_AddressDetailsInputFieldDto) {
            iw0 d = d(((WidgetDto.Widget_AddressDetailsInputFieldDto) widgetDto).b);
            if (d != null) {
                return d;
            }
        } else {
            if (widgetDto instanceof WidgetDto.Widget_DigitsInputDto) {
                return j((WidgetDto.Widget_DigitsInputDto) widgetDto);
            }
            if (widgetDto instanceof WidgetDto.Widget_HorizontalStackDto) {
                return n((WidgetDto.Widget_HorizontalStackDto) widgetDto);
            }
            if (widgetDto instanceof WidgetDto.Widget_SliderButtonDto) {
                SliderButtonWidgetDto sliderButtonWidgetDto = ((WidgetDto.Widget_SliderButtonDto) widgetDto).b;
                String widgetId21 = sliderButtonWidgetDto.getWidgetId();
                boolean isEnabled = sliderButtonWidgetDto.isEnabled();
                vos0 R = R(sliderButtonWidgetDto.getNormalContent());
                SliderButtonContentDto loadingFormContent = sliderButtonWidgetDto.getLoadingFormContent();
                return new zos0(widgetId21, isEnabled, R, loadingFormContent != null ? R(loadingFormContent) : null, x(sliderButtonWidgetDto.getAction()));
            }
            if (widgetDto instanceof WidgetDto.Widget_CarouselItemsDto) {
                return f((WidgetDto.Widget_CarouselItemsDto) widgetDto);
            }
            if (widgetDto instanceof WidgetDto.Widget_CounterDto) {
                CounterWidgetDto counterWidgetDto = ((WidgetDto.Widget_CounterDto) widgetDto).b;
                String widgetId22 = counterWidgetDto.getWidgetId();
                yye G = G(counterWidgetDto.getAction());
                HorizontalPaddingsDto horizontalPaddings3 = counterWidgetDto.getHorizontalPaddings();
                return new q0f(widgetId22, G, horizontalPaddings3 != null ? I(horizontalPaddings3) : null);
            }
            if (widgetDto instanceof WidgetDto.Widget_CartDto) {
                return g((WidgetDto.Widget_CartDto) widgetDto);
            }
            if (widgetDto instanceof WidgetDto.Widget_ShortcutDto) {
                return t(((WidgetDto.Widget_ShortcutDto) widgetDto).b);
            }
            if (widgetDto instanceof WidgetDto.Widget_GridLayoutDto) {
                return l((WidgetDto.Widget_GridLayoutDto) widgetDto);
            }
            boolean z5 = widgetDto instanceof WidgetDto.Widget_FlatHeaderDto;
            if (!z5 && !(widgetDto instanceof WidgetDto.Widget_TemplateDto) && !z5 && !(widgetDto instanceof WidgetDto.Unknown_WidgetDto)) {
                w511.b();
                return null;
            }
        }
        return f221.a;
    }

    public final m1u l(WidgetDto.Widget_GridLayoutDto widget_GridLayoutDto) {
        y0s0 y0s0Var;
        String widgetId = widget_GridLayoutDto.b.getWidgetId();
        GridLayoutWidgetDto gridLayoutWidgetDto = widget_GridLayoutDto.b;
        GridLayoutSizeDto size = gridLayoutWidgetDto.getSize();
        o1u o1uVar = new o1u(size.getRows(), size.getColumns());
        List<GridItemDto> items = gridLayoutWidgetDto.getItems();
        ArrayList arrayList = new ArrayList();
        for (GridItemDto gridItemDto : items) {
            GridLayoutPositionDto position = gridItemDto.getPosition();
            l1u l1uVar = new l1u(position.getRow(), position.getColumn());
            GridLayoutSizeDto size2 = gridItemDto.getSize();
            o1u o1uVar2 = size2 != null ? new o1u(size2.getRows(), size2.getColumns()) : null;
            GridItemDto.ContentDto content = gridItemDto.getContent();
            if (content instanceof GridItemDto.ContentDto.Content_ShortcutDto) {
                y0s0Var = t(((GridItemDto.ContentDto.Content_ShortcutDto) content).b);
            } else {
                if (!(content instanceof GridItemDto.ContentDto.Unknown_ContentDto)) {
                    w511.b();
                    return null;
                }
                y0s0Var = null;
            }
            z0u z0uVar = y0s0Var != null ? new z0u(l1uVar, o1uVar2, y0s0Var) : null;
            if (z0uVar != null) {
                arrayList.add(z0uVar);
            }
        }
        return new m1u(widgetId, o1uVar, arrayList, gridLayoutWidgetDto.getLineSpacing(), gridLayoutWidgetDto.getColumnSpacing(), L(gridLayoutWidgetDto.getPaddings()), gridLayoutWidgetDto.getMetricaLabel());
    }

    public final mru m(WidgetDto.Widget_ButtonsRowDto widget_ButtonsRowDto) {
        String widgetId = widget_ButtonsRowDto.b.getWidgetId();
        ButtonsRowWidgetDto buttonsRowWidgetDto = widget_ButtonsRowDto.b;
        List<ButtonsRowButtonDto> buttons = buttonsRowWidgetDto.getButtons();
        ArrayList arrayList = new ArrayList();
        for (ButtonsRowButtonDto buttonsRowButtonDto : buttons) {
            ButtonSizeDto buttonsSize = buttonsRowWidgetDto.getButtonsSize();
            ButtonsRowButtonDto.PayloadDto payload = buttonsRowButtonDto.getPayload();
            kru kruVar = null;
            if (payload instanceof ButtonsRowButtonDto.PayloadDto.Payload_ActionButtonDto) {
                t1y E = E(buttonsRowButtonDto.getWidth());
                ButtonSize C = C(buttonsSize);
                ActionButtonDto actionButtonDto = ((ButtonsRowButtonDto.PayloadDto.Payload_ActionButtonDto) payload).b;
                n37 D = D(actionButtonDto.getNormalStyle(), false);
                ButtonStyleDto loadingStyle = actionButtonDto.getLoadingStyle();
                n37 D2 = loadingStyle != null ? D(loadingStyle, false) : null;
                kruVar = new kru(E, new et(UUID.randomUUID().toString(), C, D, D2, x(actionButtonDto.getAction()), new x2s(actionButtonDto.getMetricaLabel(), actionButtonDto.getMeta())));
            } else if (payload instanceof ButtonsRowButtonDto.PayloadDto.Payload_PaymentButtonDto) {
                kruVar = new kru(E(buttonsRowButtonDto.getWidth()), M(((ButtonsRowButtonDto.PayloadDto.Payload_PaymentButtonDto) payload).b));
            } else if (!(payload instanceof ButtonsRowButtonDto.PayloadDto.Unknown_PayloadDto)) {
                w511.b();
                return null;
            }
            if (kruVar != null) {
                arrayList.add(kruVar);
            }
        }
        return new mru(widgetId, arrayList, new o690(8, 8, 0, 0), 4, buttonsRowWidgetDto.getMetricaLabel(), null);
    }

    public final mru n(WidgetDto.Widget_HorizontalStackDto widget_HorizontalStackDto) {
        pru pruVar;
        t1y t1yVar;
        String widgetId = widget_HorizontalStackDto.b.getWidgetId();
        HorizontalStackWidgetDto horizontalStackWidgetDto = widget_HorizontalStackDto.b;
        List<HorizontalStackWidgetItemDto> arrangedItems = horizontalStackWidgetDto.getArrangedItems();
        ArrayList arrayList = new ArrayList();
        for (HorizontalStackWidgetItemDto horizontalStackWidgetItemDto : arrangedItems) {
            HorizontalStackWidgetItemDto.WidgetDto widget = horizontalStackWidgetItemDto.getWidget();
            kru kruVar = null;
            if (widget instanceof HorizontalStackWidgetItemDto.WidgetDto.Widget_PaymentButtonDto) {
                pruVar = M(((HorizontalStackWidgetItemDto.WidgetDto.Widget_PaymentButtonDto) widget).b);
            } else if (widget instanceof HorizontalStackWidgetItemDto.WidgetDto.Widget_ActionButtonDto) {
                pruVar = a(((HorizontalStackWidgetItemDto.WidgetDto.Widget_ActionButtonDto) widget).b);
            } else if (widget instanceof HorizontalStackWidgetItemDto.WidgetDto.Widget_TextDto) {
                pruVar = u(((HorizontalStackWidgetItemDto.WidgetDto.Widget_TextDto) widget).b);
            } else if (widget instanceof HorizontalStackWidgetItemDto.WidgetDto.Widget_AddressDetailsInputFieldDto) {
                pruVar = d(((HorizontalStackWidgetItemDto.WidgetDto.Widget_AddressDetailsInputFieldDto) widget).b);
            } else if (widget instanceof HorizontalStackWidgetItemDto.WidgetDto.Widget_CounterDto) {
                CounterWidgetDto counterWidgetDto = ((HorizontalStackWidgetItemDto.WidgetDto.Widget_CounterDto) widget).b;
                String widgetId2 = counterWidgetDto.getWidgetId();
                yye G = G(counterWidgetDto.getAction());
                HorizontalPaddingsDto horizontalPaddings = counterWidgetDto.getHorizontalPaddings();
                pruVar = new q0f(widgetId2, G, horizontalPaddings != null ? I(horizontalPaddings) : null);
            } else {
                if (!(widget instanceof HorizontalStackWidgetItemDto.WidgetDto.Unknown_WidgetDto)) {
                    w511.b();
                    return null;
                }
                pruVar = null;
            }
            if (pruVar != null) {
                LayoutDistributionPolicyDto distributionPolicy = horizontalStackWidgetItemDto.getDistributionPolicy();
                if (distributionPolicy instanceof LayoutDistributionPolicyDto.LayoutDistributionPolicy_PercentDto) {
                    t1yVar = new s1y(((LayoutDistributionPolicyDto.LayoutDistributionPolicy_PercentDto) distributionPolicy).b.getPercent());
                } else if (distributionPolicy instanceof LayoutDistributionPolicyDto.LayoutDistributionPolicy_ConstDto) {
                    t1yVar = new q1y(((LayoutDistributionPolicyDto.LayoutDistributionPolicy_ConstDto) distributionPolicy).b.getWidth());
                } else if (distributionPolicy instanceof LayoutDistributionPolicyDto.LayoutDistributionPolicy_FillDto) {
                    t1yVar = r1y.a;
                } else {
                    if (!(distributionPolicy instanceof LayoutDistributionPolicyDto.Unknown_LayoutDistributionPolicyDto)) {
                        w511.b();
                        return null;
                    }
                    t1yVar = null;
                }
                if (t1yVar != null) {
                    kruVar = new kru(t1yVar, pruVar);
                }
            }
            if (kruVar != null) {
                arrayList.add(kruVar);
            }
        }
        HorizontalPaddingsDto horizontalPaddings2 = horizontalStackWidgetDto.getHorizontalPaddings();
        return new mru(widgetId, arrayList, horizontalPaddings2 != null ? I(horizontalPaddings2) : o690.e, horizontalStackWidgetDto.getSpacingWidth(), horizontalStackWidgetDto.getMetricaLabel(), horizontalStackWidgetDto.getMeta());
    }

    public final tdv o(ImageWidgetDto imageWidgetDto) {
        String widgetId = imageWidgetDto.getWidgetId();
        String backgroundColor = imageWidgetDto.getBackgroundColor();
        int height = imageWidgetDto.getHeight();
        AttributedTextDto text = imageWidgetDto.getText();
        this.a.getClass();
        FormattedText b = gd3.b(text);
        ContentAlignment F = F(imageWidgetDto.getTextAlign());
        sbv J = J(imageWidgetDto.getImage());
        ContentAlignment F2 = F(imageWidgetDto.getImageAlign());
        PaddingsDto paddings = imageWidgetDto.getPaddings();
        return new tdv(widgetId, backgroundColor, height, b, F, J, F2, paddings != null ? L(paddings) : null);
    }

    public final zh20 p(MiniMapWidgetDto miniMapWidgetDto) {
        trb1 boeVar;
        String widgetId = miniMapWidgetDto.getWidgetId();
        Integer zoom = miniMapWidgetDto.getZoom();
        CoordinateSourceDto coordinateSource = miniMapWidgetDto.getCoordinateSource();
        if (coordinateSource instanceof CoordinateSourceDto.CoordinateSource_AddressDto) {
            AddressCoordinateSourceDto addressCoordinateSourceDto = ((CoordinateSourceDto.CoordinateSource_AddressDto) coordinateSource).b;
            c0k0 N = N(addressCoordinateSourceDto.getResultPosition());
            if (N != null) {
                AddressFlowDto addressFlow = addressCoordinateSourceDto.getAddressFlow();
                boeVar = new aoe(N, addressFlow != null ? c(addressFlow, null) : null);
            }
            boeVar = null;
        } else if (coordinateSource instanceof CoordinateSourceDto.CoordinateSource_CoordinateDto) {
            List<Double> coordinate = ((CoordinateSourceDto.CoordinateSource_CoordinateDto) coordinateSource).b.getCoordinate();
            boeVar = new boe(coordinate.size() == 2 ? new doe(coordinate.get(1).doubleValue(), coordinate.get(0).doubleValue()) : null);
        } else {
            if (!(coordinateSource instanceof CoordinateSourceDto.Unknown_CoordinateSourceDto)) {
                w511.b();
                return null;
            }
            boeVar = null;
        }
        MapPinDto pin = miniMapWidgetDto.getPin();
        tq00 tq00Var = pin != null ? new tq00(new f5v(J(pin.getIconSpot().getIcon()), pin.getIconSpot().getBackgroundColor(), pin.getIconSpot().getCornerRadius()), pin.getHasBubbleArrow(), J(pin.getRoutePointIcon())) : null;
        PaddingsDto paddings = miniMapWidgetDto.getPaddings();
        return new zh20(widgetId, zoom, boeVar, tq00Var, paddings != null ? L(paddings) : o690.e, miniMapWidgetDto.getEnabled(), miniMapWidgetDto.getMetricaLabel(), (Map) miniMapWidgetDto.getMeta());
    }

    public final yk40 q(MultiAddressWidgetDto multiAddressWidgetDto) {
        String widgetId = multiAddressWidgetDto.getWidgetId();
        RoutePointsIntervalDto routePointsInterval = multiAddressWidgetDto.getRoutePointsInterval();
        g8l0 g8l0Var = new g8l0(routePointsInterval.getFirstIndex(), routePointsInterval.getLastIndex());
        AttributedTextDto description = multiAddressWidgetDto.getDescription();
        this.a.getClass();
        FormattedText b = gd3.b(description);
        FormattedText b2 = gd3.b(multiAddressWidgetDto.getTitle());
        SlotLeadDto lead = multiAddressWidgetDto.getLead();
        lts0 U = lead != null ? U(lead) : null;
        SlotTrailDto trail = multiAddressWidgetDto.getTrail();
        fws0 W = trail != null ? W(trail) : null;
        TapActionDto action = multiAddressWidgetDto.getAction();
        return new yk40(widgetId, g8l0Var, b, b2, U, action != null ? x(action) : null, W, new x2s(multiAddressWidgetDto.getMetricaLabel(), multiAddressWidgetDto.getMeta()));
    }

    public final hjf0 r(ProgressWidgetDto progressWidgetDto) {
        FormattedText formattedText;
        g8a1 g8a1Var;
        PartialProgressBarStyleSidesModel partialProgressBarStyleSidesModel;
        String widgetId = progressWidgetDto.getWidgetId();
        ProgressBarDto progressBar = progressWidgetDto.getProgressBar();
        bif0 bif0Var = null;
        if (progressBar != null) {
            AttributedTextDto progressText = progressBar.getProgressText();
            if (progressText != null) {
                this.a.getClass();
                formattedText = gd3.b(progressText);
            } else {
                formattedText = null;
            }
            double progress = progressBar.getProgress();
            String accessibilityLabel = progressBar.getAccessibilityLabel();
            ProgressBarStyleDto progressBarStyle = progressBar.getProgressBarStyle();
            if (progressBarStyle instanceof ProgressBarStyleDto.ProgressBarStyle_PartialDto) {
                PartialProgressBarStyleDto partialProgressBarStyleDto = ((ProgressBarStyleDto.ProgressBarStyle_PartialDto) progressBarStyle).b;
                String progressBarColor = partialProgressBarStyleDto.getProgressBarColor();
                String progressBarFillColor = partialProgressBarStyleDto.getProgressBarFillColor();
                int partialsCount = partialProgressBarStyleDto.getPartialsCount();
                PartialProgressBarStyleDto.PartialsSidesStyleDto partialsSidesStyle = partialProgressBarStyleDto.getPartialsSidesStyle();
                int i = partialsSidesStyle == null ? -1 : ov8.F[partialsSidesStyle.ordinal()];
                if (i == -1 || i == 1) {
                    partialProgressBarStyleSidesModel = PartialProgressBarStyleSidesModel.ROUNDED;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    partialProgressBarStyleSidesModel = PartialProgressBarStyleSidesModel.SQUARE;
                }
                g8a1Var = new eif0(progressBarColor, progressBarFillColor, partialsCount, partialProgressBarStyleSidesModel, partialProgressBarStyleDto.getSpaceBetweenPartials());
            } else {
                if (!(progressBarStyle instanceof ProgressBarStyleDto.Unknown_ProgressBarStyleDto)) {
                    w511.b();
                    return null;
                }
                g8a1Var = fif0.b;
            }
            PaddingsDto paddings = progressBar.getPaddings();
            bif0Var = new bif0(formattedText, progress, accessibilityLabel, g8a1Var, paddings != null ? L(paddings) : null);
        }
        return new hjf0(widgetId, bif0Var, new x2s(progressWidgetDto.getMetricaLabel(), progressWidgetDto.getMeta()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    public final pkm0 s(WidgetDto.Widget_ScalableSelectorDto widget_ScalableSelectorDto) {
        rkm0 rkm0Var;
        ContentAlignment contentAlignment;
        ContentAlignment contentAlignment2;
        ScalableSelectorWidgetDto scalableSelectorWidgetDto = widget_ScalableSelectorDto.b;
        List<ScalableSelectorOptionDto> options = scalableSelectorWidgetDto.getOptions();
        ArrayList arrayList = new ArrayList(tcc.n(options, 10));
        Iterator it = options.iterator();
        while (true) {
            ul4 ul4Var = null;
            if (!it.hasNext()) {
                break;
            }
            ScalableSelectorOptionDto scalableSelectorOptionDto = (ScalableSelectorOptionDto) it.next();
            AttributedTextDto text1 = scalableSelectorOptionDto.getText1();
            this.a.getClass();
            FormattedText b = gd3.b(text1);
            AttributedTextDto text2 = scalableSelectorOptionDto.getText2();
            FormattedText b2 = text2 != null ? gd3.b(text2) : null;
            FormBadgeDto badge = scalableSelectorOptionDto.getBadge();
            if (badge != null) {
                ul4Var = B(badge);
            }
            arrayList.add(new nkm0(b, b2, ul4Var, scalableSelectorOptionDto.getValue(), scalableSelectorOptionDto.isEnabled(), scalableSelectorOptionDto.getMetricaLabel()));
        }
        String widgetId = scalableSelectorWidgetDto.getWidgetId();
        String formStateKey = scalableSelectorWidgetDto.getFormStateKey();
        ArrayList arrayList2 = arrayList;
        if (!scalableSelectorWidgetDto.getScrollable()) {
            arrayList2 = a.A0(arrayList, 3);
        }
        ArrayList arrayList3 = arrayList2;
        ScalableSelectorStyleDto style = scalableSelectorWidgetDto.getStyle();
        if (style != null) {
            String selectedOptionBackgroundColor = style.getSelectedOptionBackgroundColor();
            String unselectedOptionBackgroundColor = style.getUnselectedOptionBackgroundColor();
            String disabledOptionBackgroundColor = style.getDisabledOptionBackgroundColor();
            BorderDto selectedOptionBorder = style.getSelectedOptionBorder();
            qa6 qa6Var = selectedOptionBorder != null ? new qa6(selectedOptionBorder.getColor(), selectedOptionBorder.getWidth()) : null;
            PaddingsDto contentPaddings = style.getContentPaddings();
            o690 L = contentPaddings != null ? L(contentPaddings) : null;
            ContentAlignmentDto textHorizontalAlignment = style.getTextHorizontalAlignment();
            if (textHorizontalAlignment == null || (contentAlignment = F(textHorizontalAlignment)) == null) {
                contentAlignment = ContentAlignment.LEADING;
            }
            ContentAlignment contentAlignment3 = contentAlignment;
            ContentAlignmentDto badgeHorizontalAlignment = style.getBadgeHorizontalAlignment();
            if (badgeHorizontalAlignment == null || (contentAlignment2 = F(badgeHorizontalAlignment)) == null) {
                contentAlignment2 = ContentAlignment.LEADING;
            }
            rkm0Var = new rkm0(selectedOptionBackgroundColor, unselectedOptionBackgroundColor, disabledOptionBackgroundColor, qa6Var, L, contentAlignment3, contentAlignment2);
        } else {
            rkm0Var = null;
        }
        return new pkm0(widgetId, arrayList3, rkm0Var, formStateKey, scalableSelectorWidgetDto.getScrollable());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y0s0 t(ShortcutWidgetDto shortcutWidgetDto) {
        h0s0 r;
        VerticalContentAlignment verticalContentAlignment;
        String widgetId = shortcutWidgetDto.getWidgetId();
        ShortcutContentDto content = shortcutWidgetDto.getContent();
        List<ShortcutLayerDto> layers = content.getLayers();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = layers.iterator();
        while (true) {
            VerticalContentAlignment verticalContentAlignment2 = null;
            f0s0 f0s0Var = null;
            if (!it.hasNext()) {
                BackgroundDto background = content.getBackground();
                azr0 azr0Var = new azr0(arrayList, background != null ? z(background) : null, content.getCornerRadius());
                TapActionDto action = shortcutWidgetDto.getAction();
                r9x0 x = action != null ? x(action) : null;
                FormBadgeDto badge = shortcutWidgetDto.getBadge();
                return new y0s0(widgetId, azr0Var, x, badge != null ? B(badge) : null, shortcutWidgetDto.getMetricaLabel());
            }
            ShortcutLayerDto shortcutLayerDto = (ShortcutLayerDto) it.next();
            ShortcutLayerDto.WidgetDto widget = shortcutLayerDto.getWidget();
            if (widget instanceof ShortcutLayerDto.WidgetDto.Widget_TextDto) {
                r = u(((ShortcutLayerDto.WidgetDto.Widget_TextDto) widget).b);
            } else if (widget instanceof ShortcutLayerDto.WidgetDto.Widget_ImageDto) {
                r = o(((ShortcutLayerDto.WidgetDto.Widget_ImageDto) widget).b);
            } else if (widget instanceof ShortcutLayerDto.WidgetDto.Widget_ProgressDto) {
                r = r(((ShortcutLayerDto.WidgetDto.Widget_ProgressDto) widget).b);
            } else {
                if (!(widget instanceof ShortcutLayerDto.WidgetDto.Unknown_WidgetDto)) {
                    w511.b();
                    return null;
                }
                if (f0s0Var == null) {
                    arrayList.add(f0s0Var);
                }
            }
            VerticalContentAlignmentDto verticalAlignment = shortcutLayerDto.getVerticalAlignment();
            if (verticalAlignment != null) {
                int i = ov8.l[verticalAlignment.ordinal()];
                if (i == 1) {
                    verticalContentAlignment = VerticalContentAlignment.TOP;
                } else if (i == 2) {
                    verticalContentAlignment = VerticalContentAlignment.CENTER;
                } else {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    verticalContentAlignment = VerticalContentAlignment.BOTTOM;
                }
                verticalContentAlignment2 = verticalContentAlignment;
            }
            f0s0Var = new f0s0(r, verticalContentAlignment2);
            if (f0s0Var == null) {
            }
        }
    }

    public final ksy0 u(TextWidgetDto textWidgetDto) {
        jsy0 isy0Var;
        TruncationMode truncationMode;
        String widgetId = textWidgetDto.getWidgetId();
        TextWidgetDto.TextDto text = textWidgetDto.getText();
        if (text instanceof g) {
            FormStateTextDto formStateTextDto = ((g) text).a;
            isy0Var = new hsy0(formStateTextDto.getFormStateKey(), X(formStateTextDto.getTextParameters()));
        } else if (text instanceof h) {
            AttributedTextDto attributedTextDto = ((h) text).a;
            this.a.getClass();
            FormattedText b = gd3.b(attributedTextDto);
            AttributedTextDto.TruncationModeDto truncationMode2 = attributedTextDto.getTruncationMode();
            int i = truncationMode2 == null ? -1 : fd3.a[truncationMode2.ordinal()];
            if (i == -1) {
                truncationMode = null;
            } else if (i == 1) {
                truncationMode = TruncationMode.HEAD;
            } else if (i == 2) {
                truncationMode = TruncationMode.TAIL;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                truncationMode = TruncationMode.MIDDLE;
            }
            isy0Var = new isy0(b, truncationMode);
        } else {
            if (!(text instanceof i)) {
                w511.b();
                return null;
            }
            isy0Var = new isy0(FormattedText.b, null);
        }
        Integer height = textWidgetDto.getHeight();
        PaddingsDto paddings = textWidgetDto.getPaddings();
        Integer lead = paddings.getLead();
        int intValue = lead != null ? lead.intValue() : 0;
        Integer trail = paddings.getTrail();
        int intValue2 = trail != null ? trail.intValue() : 0;
        Integer top = paddings.getTop();
        int intValue3 = top != null ? top.intValue() : 4;
        Integer bottom = paddings.getBottom();
        o690 o690Var = new o690(intValue, intValue2, intValue3, bottom != null ? bottom.intValue() : 4);
        ContentAlignmentDto textAlignment = textWidgetDto.getTextAlignment();
        int i2 = textAlignment != null ? ov8.f[textAlignment.ordinal()] : -1;
        TextAlignment textAlignment2 = i2 != 2 ? i2 != 3 ? TextAlignment.LEADING : TextAlignment.TRAILING : TextAlignment.CENTER;
        TapActionDto action = textWidgetDto.getAction();
        return new ksy0(widgetId, isy0Var, height, o690Var, textAlignment2, action != null ? x(action) : null, w(textWidgetDto.getAccessibilityInfo()), textWidgetDto.getMetricaLabel());
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d5, code lost:
    
        if (((defpackage.jg70) r4).a.isEmpty() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e9, code lost:
    
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01eb, code lost:
    
        if (r5 == null) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ed, code lost:
    
        r14.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f0, code lost:
    
        r2 = r21;
        r1 = r16;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e6, code lost:
    
        if (((defpackage.kg70) r4).a.isEmpty() == false) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ea  */
    /* JADX WARN: Type inference failed for: r11v13, types: [h6z0] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [hvm] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r1v138 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r1v97, types: [gvm] */
    /* JADX WARN: Type inference failed for: r5v9, types: [iym] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r9x0 x(TapActionDto tapActionDto) {
        TapAction$ArBoxesSmartCameraAction$Intent tapAction$ArBoxesSmartCameraAction$Intent;
        CardsRevealing cardsRevealing;
        s9e s9eVar;
        ArrayList arrayList;
        zi8 yi8Var;
        ButtonType buttonType;
        TapAction$ModalAction$ModalType tapAction$ModalAction$ModalType;
        TapAction$ModalAction$ModalType tapAction$ModalAction$ModalType2;
        ?? r18;
        ?? r1;
        SelectDueActionDto selectDueActionDto;
        Iterator it;
        o9x0 o9x0Var;
        og70 kg70Var;
        o9x0 o9x0Var2;
        TapAction$OrderAction$Flow tapAction$OrderAction$Flow;
        if (tapActionDto instanceof TapActionDto.TapAction_DeeplinkDto) {
            return new z8x0(((TapActionDto.TapAction_DeeplinkDto) tapActionDto).b.getDeeplink());
        }
        if (tapActionDto instanceof TapActionDto.TapAction_CloseDto) {
            return u8x0.a;
        }
        o9x0 o9x0Var3 = null;
        r3 = null;
        v8x0 v8x0Var = null;
        if (tapActionDto instanceof TapActionDto.TapAction_CloseModalDto) {
            ClosePolicyDto closePolicy = ((TapActionDto.TapAction_CloseModalDto) tapActionDto).b.getClosePolicy();
            if (closePolicy instanceof ClosePolicyDto.ClosePolicy_NumberDto) {
                v8x0Var = new v8x0(((ClosePolicyDto.ClosePolicy_NumberDto) closePolicy).b.getNumber());
            } else if (closePolicy != null && !(closePolicy instanceof ClosePolicyDto.Unknown_ClosePolicyDto)) {
                w511.b();
                return null;
            }
            return new w8x0(v8x0Var);
        }
        if (tapActionDto instanceof TapActionDto.TapAction_BannerDto) {
            return new o8x0(((TapActionDto.TapAction_BannerDto) tapActionDto).b.getPromotionId());
        }
        if (tapActionDto instanceof TapActionDto.TapAction_OrderDto) {
            OrderActionDto orderActionDto = ((TapActionDto.TapAction_OrderDto) tapActionDto).b;
            int i = ov8.t[orderActionDto.getFlow().ordinal()];
            if (i == 1) {
                tapAction$OrderAction$Flow = TapAction$OrderAction$Flow.ROUTE_POINTS;
            } else if (i == 2) {
                tapAction$OrderAction$Flow = TapAction$OrderAction$Flow.PICKUP_POINTS;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                tapAction$OrderAction$Flow = TapAction$OrderAction$Flow.STATE;
            }
            Boolean formValidation = orderActionDto.getFormValidation();
            return new k9x0(tapAction$OrderAction$Flow, formValidation != null ? formValidation.booleanValue() : false);
        }
        if (tapActionDto instanceof TapActionDto.TapAction_AddDestinationDto) {
            AddDestinationActionDto addDestinationActionDto = ((TapActionDto.TapAction_AddDestinationDto) tapActionDto).b;
            return new i8x0(c(addDestinationActionDto.getAddressFlow(), addDestinationActionDto.getSearchText()), y(addDestinationActionDto.getRouteType(), addDestinationActionDto.getAddressFlow()), addDestinationActionDto.getPointIndex());
        }
        boolean z = tapActionDto instanceof TapActionDto.TapAction_SelectDueDto;
        q9x0 q9x0Var = q9x0.a;
        if (z) {
            SelectDueActionDto selectDueActionDto2 = ((TapActionDto.TapAction_SelectDueDto) tapActionDto).b;
            String title = selectDueActionDto2.getTitle();
            String subtitle = selectDueActionDto2.getSubtitle();
            String subtitle2 = selectDueActionDto2.getDescription().getSubtitle();
            sbv J = J(selectDueActionDto2.getDescription().getIcon());
            List<SelectDueActionDto.SlotsDto> slots = selectDueActionDto2.getSlots();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = slots.iterator();
            while (it2.hasNext()) {
                SelectDueActionDto.SlotsDto slotsDto = (SelectDueActionDto.SlotsDto) it2.next();
                String title2 = slotsDto.getTitle();
                String descriptionTemplate = slotsDto.getDescriptionTemplate();
                SelectDueActionDto.SlotsDto.OptionsDto options = slotsDto.getOptions();
                boolean z2 = options instanceof SelectDueActionDto.SlotsDto.OptionsDto.Options_TimePickerDto;
                EmptyList emptyList = EmptyList.a;
                if (z2) {
                    TimePickerSlotsDto timePickerSlotsDto = ((SelectDueActionDto.SlotsDto.OptionsDto.Options_TimePickerDto) options).b;
                    ZonedDateTime H = H(timePickerSlotsDto.getFrom());
                    if (H == null) {
                        kg70Var = new kg70(emptyList);
                        selectDueActionDto = selectDueActionDto2;
                        it = it2;
                        o9x0Var = o9x0Var3;
                    } else {
                        o9x0Var = o9x0Var3;
                        ZonedDateTime H2 = H(timePickerSlotsDto.getTo());
                        if (H2 == null) {
                            kg70Var = new kg70(emptyList);
                            selectDueActionDto = selectDueActionDto2;
                            it = it2;
                        } else {
                            selectDueActionDto = selectDueActionDto2;
                            it = it2;
                            long stepMinutes = timePickerSlotsDto.getStepMinutes();
                            ArrayList arrayList3 = new ArrayList();
                            while (H.compareTo((ChronoZonedDateTime<?>) H2) <= 0) {
                                arrayList3.add(H);
                                H = H.plusMinutes(stepMinutes);
                            }
                            kg70Var = new kg70(arrayList3);
                        }
                    }
                } else {
                    selectDueActionDto = selectDueActionDto2;
                    it = it2;
                    o9x0Var = o9x0Var3;
                    if (options instanceof SelectDueActionDto.SlotsDto.OptionsDto.Options_TimeIntervalsDto) {
                        List<TimeIntervalDto> intervals = ((SelectDueActionDto.SlotsDto.OptionsDto.Options_TimeIntervalsDto) options).b.getIntervals();
                        ArrayList arrayList4 = new ArrayList();
                        for (TimeIntervalDto timeIntervalDto : intervals) {
                            ZonedDateTime H3 = H(timeIntervalDto.getDatetime());
                            o9x0 h6z0Var = H3 != null ? new h6z0(timeIntervalDto.getTitle(), H3, timeIntervalDto.getPrice()) : o9x0Var;
                            if (h6z0Var != null) {
                                arrayList4.add(h6z0Var);
                            }
                        }
                        kg70Var = new jg70(arrayList4);
                    } else {
                        if (!(options instanceof SelectDueActionDto.SlotsDto.OptionsDto.Unknown_OptionsDto)) {
                            w511.b();
                            return o9x0Var;
                        }
                        kg70Var = new kg70(emptyList);
                    }
                }
                ?? iymVar = new iym(title2, descriptionTemplate, kg70Var);
                if (kg70Var instanceof jg70) {
                    o9x0Var2 = iymVar;
                } else {
                    if (!(kg70Var instanceof kg70)) {
                        w511.b();
                        return o9x0Var;
                    }
                    o9x0Var2 = iymVar;
                }
            }
            SelectDueActionDto selectDueActionDto3 = selectDueActionDto2;
            o9x0 o9x0Var4 = o9x0Var3;
            String metricaLabel = selectDueActionDto3.getMetricaLabel();
            DueButtonsConfigDto buttonsConfig = selectDueActionDto3.getButtonsConfig();
            if (buttonsConfig != null) {
                DueButtonPropertiesDto dueButtonPropertiesDto = buttonsConfig.getContinue();
                String title3 = dueButtonPropertiesDto.getTitle();
                String subtitle3 = dueButtonPropertiesDto.getSubtitle();
                TapActionDto action = dueButtonPropertiesDto.getAction();
                gvm gvmVar = new gvm(title3, subtitle3, action != null ? x(action) : o9x0Var4);
                DueButtonPropertiesDto delete = buttonsConfig.getDelete();
                if (delete != null) {
                    String title4 = delete.getTitle();
                    String subtitle4 = delete.getSubtitle();
                    TapActionDto action2 = delete.getAction();
                    r1 = new gvm(title4, subtitle4, action2 != null ? x(action2) : o9x0Var4);
                } else {
                    r1 = o9x0Var4;
                }
                r18 = new hvm(gvmVar, r1);
            } else {
                r18 = o9x0Var4;
            }
            o9x0 o9x0Var5 = !arrayList2.isEmpty() ? new o9x0(title, subtitle, selectDueActionDto3.getFormStateKey(), subtitle2, J, arrayList2, new bgc(12), new bgc(12), metricaLabel, r18) : o9x0Var4;
            if (o9x0Var5 != null) {
                return o9x0Var5;
            }
        } else {
            if (tapActionDto instanceof TapActionDto.TapAction_ResetDueDto) {
                return new p8x0(gw00.e(new Pair("due", null)));
            }
            if (tapActionDto instanceof TapActionDto.TapAction_ChangePointsOrderDto) {
                ChangePointsOrderActionDto changePointsOrderActionDto = ((TapActionDto.TapAction_ChangePointsOrderDto) tapActionDto).b;
                return new q8x0(changePointsOrderActionDto.getMetricaLabel(), c(changePointsOrderActionDto.getAddressFlow(), null), y(changePointsOrderActionDto.getRouteType(), changePointsOrderActionDto.getAddressFlow()));
            }
            if (tapActionDto instanceof TapActionDto.TapAction_OpenMapDto) {
                OpenMapActionDto openMapActionDto = ((TapActionDto.TapAction_OpenMapDto) tapActionDto).b;
                return new e9x0(openMapActionDto.getMetricaLabel(), c(openMapActionDto.getAddressFlow(), null), y(openMapActionDto.getRouteType(), openMapActionDto.getAddressFlow()));
            }
            if (tapActionDto instanceof TapActionDto.TapAction_AiChatDto) {
                AiChatActionDto aiChatActionDto = ((TapActionDto.TapAction_AiChatDto) tapActionDto).b;
                String appId = aiChatActionDto.getAppId();
                String platform = aiChatActionDto.getPlatform();
                AiChatMessageDto initialMessage = aiChatActionDto.getInitialMessage();
                return new l8x0(appId, platform, initialMessage != null ? new k8x0(initialMessage.getTemplate(), initialMessage.getFormStateKeys()) : null, aiChatActionDto.getHeaderTitle());
            }
            if (tapActionDto instanceof TapActionDto.TapAction_OpenCostCentersDto) {
                return d9x0.a;
            }
            if (tapActionDto instanceof TapActionDto.TapAction_ChangeClientStateDto) {
                Object stateDiff = ((TapActionDto.TapAction_ChangeClientStateDto) tapActionDto).b.getStateDiff();
                Map map = stateDiff instanceof Map ? (Map) stateDiff : null;
                if (map != null) {
                    return new p8x0(map);
                }
            } else {
                if (tapActionDto instanceof TapActionDto.TapAction_OpenRouteDetailsDto) {
                    return new i9x0(((TapActionDto.TapAction_OpenRouteDetailsDto) tapActionDto).b.getPointIndex());
                }
                if (tapActionDto instanceof TapActionDto.TapAction_ModalDto) {
                    ModalActionDto modalActionDto = ((TapActionDto.TapAction_ModalDto) tapActionDto).b;
                    String modalId = modalActionDto.getModalId();
                    CardModeDto cardMode = modalActionDto.getCardMode();
                    if (cardMode instanceof CardModeDto.CardMode_FullscreenDto) {
                        yi8Var = new xi8(((CardModeDto.CardMode_FullscreenDto) cardMode).b.isSlideable());
                    } else if (cardMode instanceof CardModeDto.CardMode_WrapContentHeightDto) {
                        WrapContentHeightDto wrapContentHeightDto = ((CardModeDto.CardMode_WrapContentHeightDto) cardMode).b;
                        yi8Var = new yi8(wrapContentHeightDto.isSlideable(), wrapContentHeightDto.getSkeletonHeight());
                    } else {
                        if (cardMode != null && !(cardMode instanceof CardModeDto.Unknown_CardModeDto)) {
                            w511.b();
                            return null;
                        }
                        yi8Var = new yi8(true, null);
                    }
                    zi8 zi8Var = yi8Var;
                    int i2 = ov8.u[modalActionDto.getTopButton().ordinal()];
                    if (i2 == 1) {
                        buttonType = ButtonType.BACK;
                    } else if (i2 == 2) {
                        buttonType = ButtonType.CLOSE;
                    } else {
                        if (i2 != 3) {
                            w511.b();
                            return null;
                        }
                        buttonType = ButtonType.NONE;
                    }
                    ButtonType buttonType2 = buttonType;
                    ModalActionDto.ModalTypeDto modalType = modalActionDto.getModalType();
                    int i3 = modalType == null ? -1 : ov8.v[modalType.ordinal()];
                    if (i3 == 1) {
                        tapAction$ModalAction$ModalType = TapAction$ModalAction$ModalType.OVER_FORM;
                    } else if (i3 == 2) {
                        tapAction$ModalAction$ModalType = TapAction$ModalAction$ModalType.OVER_MAP;
                    } else {
                        if (i3 != 3) {
                            tapAction$ModalAction$ModalType2 = null;
                            ShowPolicyDto showPolicy = modalActionDto.getShowPolicy();
                            return new c9x0(modalId, zi8Var, buttonType2, tapAction$ModalAction$ModalType2, showPolicy == null ? Q(showPolicy) : null, modalActionDto.getCloseByHardwareBack(), OpeningSource.COMMON, null);
                        }
                        tapAction$ModalAction$ModalType = TapAction$ModalAction$ModalType.OVER_CAMERA;
                    }
                    tapAction$ModalAction$ModalType2 = tapAction$ModalAction$ModalType;
                    ShowPolicyDto showPolicy2 = modalActionDto.getShowPolicy();
                    return new c9x0(modalId, zi8Var, buttonType2, tapAction$ModalAction$ModalType2, showPolicy2 == null ? Q(showPolicy2) : null, modalActionDto.getCloseByHardwareBack(), OpeningSource.COMMON, null);
                }
                if (tapActionDto instanceof TapActionDto.TapAction_AsyncDto) {
                    AsyncActionDto asyncActionDto = ((TapActionDto.TapAction_AsyncDto) tapActionDto).b;
                    return new n8x0(asyncActionDto.getTaskId(), asyncActionDto.getFormStateValue(), asyncActionDto.getTaskParams());
                }
                if (tapActionDto instanceof TapActionDto.TapAction_CompositeDto) {
                    List<TapActionDto> actions = ((TapActionDto.TapAction_CompositeDto) tapActionDto).b.getActions();
                    ArrayList arrayList5 = new ArrayList(tcc.n(actions, 10));
                    Iterator it3 = actions.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(x((TapActionDto) it3.next()));
                    }
                    return new y8x0(arrayList5);
                }
                if (tapActionDto instanceof TapActionDto.TapAction_ChangeRouteDetailsDto) {
                    List<RoutePointDetailsDto> routePoints = ((TapActionDto.TapAction_ChangeRouteDetailsDto) tapActionDto).b.getRoutePoints();
                    ArrayList arrayList6 = new ArrayList(tcc.n(routePoints, 10));
                    for (RoutePointDetailsDto routePointDetailsDto : routePoints) {
                        int routePointIndex = routePointDetailsDto.getRoutePointIndex();
                        String entrance = routePointDetailsDto.getEntrance();
                        String code = routePointDetailsDto.getCode();
                        String floor = routePointDetailsDto.getFloor();
                        String room = routePointDetailsDto.getRoom();
                        RoutePointContactDto contact = routePointDetailsDto.getContact();
                        if (contact != null) {
                            String name = contact.getName();
                            if (name == null) {
                                name = "";
                            }
                            s9eVar = new s9e(name, contact.getPhone());
                        } else {
                            s9eVar = null;
                        }
                        String comment = routePointDetailsDto.getComment();
                        List<RoutePointCommentImageDto> commentImages = routePointDetailsDto.getCommentImages();
                        if (commentImages != null) {
                            List<RoutePointCommentImageDto> list = commentImages;
                            ArrayList arrayList7 = new ArrayList(tcc.n(list, 10));
                            for (RoutePointCommentImageDto routePointCommentImageDto : list) {
                                arrayList7.add(new nkb0(routePointCommentImageDto.getPath(), routePointCommentImageDto.getDownloadUrl()));
                            }
                            arrayList = arrayList7;
                        } else {
                            arrayList = null;
                        }
                        arrayList6.add(new k7l0(routePointIndex, entrance, code, floor, room, comment, s9eVar, arrayList));
                    }
                    return new r8x0(arrayList6);
                }
                if (tapActionDto instanceof TapActionDto.TapAction_OpenWebViewDto) {
                    OpenWebViewActionDto openWebViewActionDto = ((TapActionDto.TapAction_OpenWebViewDto) tapActionDto).b;
                    return new j9x0(openWebViewActionDto.getUrl(), openWebViewActionDto.getShouldAuthorize());
                }
                if (tapActionDto instanceof TapActionDto.TapAction_OpenPlacesSuggestDto) {
                    OpenPlacesSuggestActionDto openPlacesSuggestActionDto = ((TapActionDto.TapAction_OpenPlacesSuggestDto) tapActionDto).b;
                    String mode = openPlacesSuggestActionDto.getMode();
                    Integer pointIndex = openPlacesSuggestActionDto.getPointIndex();
                    int intValue = pointIndex != null ? pointIndex.intValue() : 1;
                    int i4 = ov8.w[openPlacesSuggestActionDto.getCardsOverMapRevealing().ordinal()];
                    if (i4 == 1) {
                        cardsRevealing = CardsRevealing.EXPANDED;
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        cardsRevealing = CardsRevealing.COMPACT;
                    }
                    return new g9x0(mode, intValue, cardsRevealing);
                }
                if (tapActionDto instanceof TapActionDto.TapAction_SelectContactDto) {
                    SelectContactActionDto selectContactActionDto = ((TapActionDto.TapAction_SelectContactDto) tapActionDto).b;
                    c0k0 N = N(selectContactActionDto.getPosition());
                    if (N != null) {
                        TapActionDto actionOnContactSelected = selectContactActionDto.getActionOnContactSelected();
                        return new n9x0(N, actionOnContactSelected != null ? x(actionOnContactSelected) : null);
                    }
                } else {
                    if (tapActionDto instanceof TapActionDto.TapAction_PaymentMethodsActionDto) {
                        return new f9x0(((TapActionDto.TapAction_PaymentMethodsActionDto) tapActionDto).b.getAvailablePaymentTypes());
                    }
                    if (tapActionDto instanceof TapActionDto.TapAction_ArBoxesSmartCameraDto) {
                        int i5 = ov8.x[((TapActionDto.TapAction_ArBoxesSmartCameraDto) tapActionDto).b.getIntent().ordinal()];
                        if (i5 == 1) {
                            tapAction$ArBoxesSmartCameraAction$Intent = TapAction$ArBoxesSmartCameraAction$Intent.RESET;
                        } else {
                            if (i5 != 2) {
                                w511.b();
                                return null;
                            }
                            tapAction$ArBoxesSmartCameraAction$Intent = TapAction$ArBoxesSmartCameraAction$Intent.ROTATE;
                        }
                        return new m8x0(tapAction$ArBoxesSmartCameraAction$Intent);
                    }
                    if (tapActionDto instanceof TapActionDto.TapAction_ClientStateTransformDto) {
                        ClientStateTransformerDto transformer = ((TapActionDto.TapAction_ClientStateTransformDto) tapActionDto).b.getTransformer();
                        if (!(transformer instanceof ClientStateTransformerDto.Unknown_ClientStateTransformerDto)) {
                            if (transformer instanceof ClientStateTransformerDto.ClientStateTransformer_CopyDto) {
                                CopyClientStateTransformerDto copyClientStateTransformerDto = ((ClientStateTransformerDto.ClientStateTransformer_CopyDto) transformer).b;
                                return new t8x0(new s8x0(copyClientStateTransformerDto.getSourceField(), copyClientStateTransformerDto.getTargetField()));
                            }
                            w511.b();
                            return null;
                        }
                    } else {
                        if (tapActionDto instanceof TapActionDto.TapAction_ShareDto) {
                            return new p9x0(((TapActionDto.TapAction_ShareDto) tapActionDto).b.getShareText());
                        }
                        if (tapActionDto instanceof TapActionDto.TapAction_ScrollToWidgetDto) {
                            return new l9x0(((TapActionDto.TapAction_ScrollToWidgetDto) tapActionDto).b.getWidgetId());
                        }
                        if (tapActionDto instanceof TapActionDto.TapAction_AddPhotocommentsDto) {
                            AddPhotocommentsActionDto addPhotocommentsActionDto = ((TapActionDto.TapAction_AddPhotocommentsDto) tapActionDto).b;
                            c0k0 N2 = N(addPhotocommentsActionDto.getPosition());
                            if (N2 != null) {
                                UploadImagesConstrainsDto constrains = addPhotocommentsActionDto.getConstrains();
                                return new j8x0(N2, new oc21(constrains.getMaxWidth(), constrains.getMaxHeight(), constrains.getMaxCount()), new x2s(addPhotocommentsActionDto.getMetricaLabel(), addPhotocommentsActionDto.getMeta()));
                            }
                        } else {
                            if (tapActionDto instanceof TapActionDto.TapAction_DisableCurrentPromocodeActionDto) {
                                return b9x0.a;
                            }
                            if (tapActionDto instanceof TapActionDto.TapAction_OpenPromocodeWindowActionDto) {
                                return h9x0.a;
                            }
                            if (tapActionDto instanceof TapActionDto.TapAction_SelectAddressDto) {
                                SelectAddressActionDto selectAddressActionDto = ((TapActionDto.TapAction_SelectAddressDto) tapActionDto).b;
                                c0k0 N3 = N(selectAddressActionDto.getPosition());
                                if (N3 != null) {
                                    vu0 c2 = c(selectAddressActionDto.getFlow(), null);
                                    TapActionDto actionOnAddressSelected = selectAddressActionDto.getActionOnAddressSelected();
                                    return new m9x0(N3, c2, actionOnAddressSelected != null ? x(actionOnAddressSelected) : null);
                                }
                            } else {
                                if (!(tapActionDto instanceof TapActionDto.TapAction_DeleteAddressDto)) {
                                    if ((tapActionDto instanceof TapActionDto.TapAction_ShareFormDto) || (tapActionDto instanceof TapActionDto.Unknown_TapActionDto)) {
                                        return q9x0Var;
                                    }
                                    w511.b();
                                    return null;
                                }
                                c0k0 N4 = N(((TapActionDto.TapAction_DeleteAddressDto) tapActionDto).b.getPosition());
                                if (N4 != null) {
                                    return new a9x0(N4);
                                }
                            }
                        }
                    }
                }
            }
        }
        return q9x0Var;
    }
}
