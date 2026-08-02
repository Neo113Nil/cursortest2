package defpackage;

import com.yandex.go.due.data.api.dto.AsapTimeAppearance;
import com.yandex.go.due.data.api.dto.AsapTimeBanner$$serializer;
import com.yandex.go.due.data.api.dto.b;
import com.yandex.go.overdraft.data.model.d;
import com.yandex.go.payments.data.model.response.Availability;
import com.yandex.go.payments.data.model.response.BankListSection;
import com.yandex.go.payments.data.model.response.BankListSection$BankItem$$serializer;
import com.yandex.go.routestats.BackendFormat;
import com.yandex.go.routestats.a;
import com.yandex.go.shortcuts.dto.response.BackgroundAnimation$PulseCirclesAnimation;
import com.yandex.go.shortcuts.dto.response.BackgroundFraming;
import com.yandex.go.shortcuts.dto.response.BackgroundFraming$Frame$$serializer;
import com.yandex.go.shortcuts.dto.response.Shape;
import com.yandex.go.shortcuts.dto.response.i;
import com.yandex.go.shortcuts.dto.response.m;
import com.yandex.go.slot.dto.e;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.BadFeedback;
import com.yandex.go.taxi.order.models.api.response.ArrowButton;
import com.yandex.go.taxi.order.models.api.response.AttributedContent;
import com.yandex.go.taxi.order.models.api.response.AttributedItem$AttributedImageItem;
import com.yandex.go.taxi.order.models.api.response.AttributedItem$AttributedTextItem;
import com.yandex.go.taxi.order.models.api.response.g;
import com.yandex.go.taxi.order.models.api.response.h;
import com.yandex.go.taxi.order.models.api.response.j;
import com.yandex.go.taxi.order.models.api.response.k;
import com.yandex.go.taxi.order.models.api.response.n;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.communications.model.widgets.ArrowActionType;

/* loaded from: classes14.dex */
public final /* synthetic */ class p73 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ p73(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = 0;
        switch (this.a) {
            case 0:
                return vez0.g("ru.yandex.taxi.communications.model.widgets.ArrowActionType", ArrowActionType.values(), new String[]{null, "select_alt_offer", "persgoal_selector", "share_route_button", "show_requirement_info", null}, new Annotation[][]{null, null, null, null, null, null});
            case 1:
                g gVar = ArrowButton.Companion;
                return new p53(yx.e, 0);
            case 2:
                b bVar = AsapTimeAppearance.Companion;
                return new p53(AsapTimeBanner$$serializer.INSTANCE, 0);
            case 3:
                throw new IllegalStateException("No DeliveryImageLoader provided");
            case 4:
                a7u0 a7u0Var = ua3.a;
                return zy11.a;
            case 5:
                return new ab3();
            case 6:
                h hVar = AttributedContent.Companion;
                return new p53(ed3.e, 0);
            case 7:
                j jVar = AttributedItem$AttributedImageItem.Companion;
                return AttributedItem$AttributedImageItem.AlignmentType.Companion.serializer();
            case 8:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.AttributedItem.AttributedImageItem.AlignmentType", AttributedItem$AttributedImageItem.AlignmentType.values(), new String[]{null, "BASELINE", "CENTER"}, new Annotation[][]{null, null, null});
            case 9:
                k kVar = AttributedItem$AttributedTextItem.Companion;
                return AttributedItem$AttributedTextItem.FontWeight.Companion.serializer();
            case 10:
                k kVar2 = AttributedItem$AttributedTextItem.Companion;
                return AttributedItem$AttributedTextItem.FontStyle.Companion.serializer();
            case 11:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.AttributedItem.AttributedTextItem.FontStyle", AttributedItem$AttributedTextItem.FontStyle.values(), new String[]{null, "NORMAL", "ITALIC"}, new Annotation[][]{null, null, null});
            case 12:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.AttributedItem.AttributedTextItem.FontWeight", AttributedItem$AttributedTextItem.FontWeight.values(), new String[]{null, "REGULAR", "LIGHT", "MEDIUM", "BOLD", "DISPLAY_HEAVY"}, new Annotation[][]{null, null, null, null, null, null});
            case 13:
                return new o4o("com.yandex.go.taxi.order.models.api.response.AttributedItem.Unsupported", n.INSTANCE, new Annotation[0]);
            case 14:
                return new o4o("com.yandex.go.overdraft.data.model.AutoAction.Unknown", d.INSTANCE, new Annotation[0]);
            case 15:
                return new t8j0();
            case 16:
                return new qx3(0);
            case 17:
                return new u04(i);
            case 18:
                return new a6t0(rzo.d(1308617531));
            case 19:
                com.yandex.go.payments.data.model.response.j jVar2 = Availability.Action.Companion;
                return Availability.Action.Type.Companion.serializer();
            case 20:
                return vez0.g("com.yandex.go.payments.data.model.response.Availability.Action.Type", Availability.Action.Type.values(), new String[]{"buy_plus", null}, new Annotation[][]{null, null});
            case 21:
                a aVar = BackendFormat.Companion;
                return new p53(auu0.a, 0);
            case 22:
                i iVar = BackgroundAnimation$PulseCirclesAnimation.SourceAnchor.Companion;
                return Shape.Companion.serializer();
            case 23:
                return new o4o("com.yandex.go.shortcuts.dto.response.BackgroundAnimation.Unknown", com.yandex.go.shortcuts.dto.response.k.INSTANCE, new Annotation[0]);
            case 24:
                m mVar = BackgroundFraming.Companion;
                return new p53(BackgroundFraming$Frame$$serializer.INSTANCE, 0);
            case 25:
                com.yandex.go.shortcuts.dto.response.n nVar = BackgroundFraming.Frame.Companion;
                return new p53(nor.a, 0);
            case 26:
                com.yandex.go.taxi.order.chat.call_feedback.experiments.a aVar2 = BadFeedback.Companion;
                return new p53(auu0.a, 0);
            case 27:
                return new o4o("com.yandex.go.slot.dto.BadgeItemDto.Unknown", e.INSTANCE, new Annotation[0]);
            case 28:
                com.yandex.go.payments.data.model.response.n nVar2 = BankListSection.Companion;
                return new p53(BankListSection$BankItem$$serializer.INSTANCE, 0);
            default:
                com.yandex.go.payments.data.model.response.m mVar2 = BankListSection.BankItem.Companion;
                return new p53(auu0.a, 0);
        }
    }
}
