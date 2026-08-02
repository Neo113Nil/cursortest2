package defpackage;

import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.AiChatWidgetDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.AiWidgetsConfigDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.DeliveryAiToolsDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.LinearGradientDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.PopupHintDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.SmartCameraWidgetDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.ThemedLinearGradientDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.TypedConfigsDto;

/* loaded from: classes5.dex */
public final class bq1 {
    public final o3s a;
    public final dq1 b;
    public final String c;
    public final Moshi d;

    public bq1(o3s o3sVar, dq1 dq1Var, String str, Moshi moshi) {
        this.a = o3sVar;
        this.b = dq1Var;
        this.c = str;
        this.d = moshi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public final aq1 a(TypedConfigsDto.ItemsDto itemsDto) {
        Object obj;
        ?? r4;
        Object obj2;
        pn1 pn1Var;
        zys0 zys0Var;
        kxy0 kxy0Var;
        if (itemsDto == null) {
            return null;
        }
        Moshi moshi = this.d;
        try {
            obj = moshi.adapter(DeliveryAiToolsDto.class).fromJson(moshi.adapter(Object.class).toJson(itemsDto.getValue()));
        } catch (Exception unused) {
            obj = null;
        }
        DeliveryAiToolsDto deliveryAiToolsDto = (DeliveryAiToolsDto) obj;
        if (deliveryAiToolsDto == null) {
            return null;
        }
        this.b.getClass();
        List<DeliveryAiToolsDto.MatchesDto> matches = deliveryAiToolsDto.getMatches();
        if (matches != null) {
            List<DeliveryAiToolsDto.MatchesDto> list = matches;
            r4 = new ArrayList(tcc.n(list, 10));
            for (DeliveryAiToolsDto.MatchesDto matchesDto : list) {
                List<String> modes = matchesDto.getModes();
                AiWidgetsConfigDto config = matchesDto.getConfig();
                AiChatWidgetDto aiChatWidget = config.getAiChatWidget();
                if (aiChatWidget != null) {
                    String iconTag = aiChatWidget.getIconTag();
                    String deeplink = aiChatWidget.getDeeplink();
                    PopupHintDto popupHint = aiChatWidget.getPopupHint();
                    pn1Var = new pn1(iconTag, deeplink, popupHint != null ? new s8e0(popupHint.getId(), dq1.b(popupHint.getTitle(), deliveryAiToolsDto), popupHint.getBackgroundColor(), popupHint.getMaxShownCount()) : null);
                } else {
                    pn1Var = null;
                }
                SmartCameraWidgetDto smartCameraWidget = config.getSmartCameraWidget();
                if (smartCameraWidget != null) {
                    ayu0 b = dq1.b(smartCameraWidget.getTitle(), deliveryAiToolsDto);
                    String iconTag2 = smartCameraWidget.getIconTag();
                    String iconColor = smartCameraWidget.getIconColor();
                    String backgroundColor = smartCameraWidget.getBackgroundColor();
                    String initialBackgroundColor = smartCameraWidget.getInitialBackgroundColor();
                    ThemedLinearGradientDto initialBackgroundGradient = smartCameraWidget.getInitialBackgroundGradient();
                    if (initialBackgroundGradient != null) {
                        piy a = dq1.a(initialBackgroundGradient.getDefault());
                        LinearGradientDto dark = initialBackgroundGradient.getDark();
                        kxy0Var = new kxy0(a, dark != null ? dq1.a(dark) : null);
                    } else {
                        kxy0Var = null;
                    }
                    zys0Var = new zys0(b, iconTag2, iconColor, backgroundColor, initialBackgroundColor, kxy0Var);
                } else {
                    zys0Var = null;
                }
                r4.add(new o610(modes, new aq1(pn1Var, zys0Var)));
            }
        } else {
            r4 = EmptyList.a;
        }
        Iterator it = ((Iterable) r4).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((o610) obj2).a.contains(this.c)) {
                break;
            }
        }
        o610 o610Var = (o610) obj2;
        if (o610Var != null) {
            return o610Var.b;
        }
        return null;
    }
}
