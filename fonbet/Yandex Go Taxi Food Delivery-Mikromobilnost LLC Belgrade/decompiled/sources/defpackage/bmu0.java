package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.feed_video.actions.models.StreamTypeDto;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto;
import com.ybsdk.feature.stories.internal.screens.stories.c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.regex.Pattern;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.BubbleOrientation;
import ru.yandex.taxi.common_models.net.map_object.BubbleStructure;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.communications.api.dto.StoryWidgets;
import ru.yandex.taxi.communications.api.dto.b0;
import ru.yandex.taxi.communications.api.dto.d0;
import ru.yandex.taxi.communications.api.dto.i0;

/* loaded from: classes5.dex */
public final /* synthetic */ class bmu0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ bmu0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_$03;
        int i = 0;
        switch (this.a) {
            case 0:
                dmu0 dmu0Var = emu0.Companion;
                return new p53(auu0.a, 0);
            case 1:
                return new c(i);
            case 2:
                b0 b0Var = Story.b.Companion;
                return new p53(ru.yandex.taxi.promotions.model.c.a, 0);
            case 3:
                b0 b0Var2 = Story.b.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 4:
                d0 d0Var = Story.c.Companion;
                return Story.PageMediaType.Companion.serializer();
            case 5:
                return vez0.g("ru.yandex.taxi.communications.api.dto.Story.PageMediaType", Story.PageMediaType.values(), new String[]{"image", "animation"}, new Annotation[][]{null, null});
            case 6:
                i0 i0Var = Story.e.Companion;
                return new p53(ru.yandex.taxi.promotions.model.c.a, 0);
            case 7:
                xby.d.k(new IOException(), "Error loading animation");
                return zy11.a;
            case 8:
                zy11Var = zy11.a;
                return zy11Var;
            case 9:
                return Pattern.compile("^<(\\w+)\\s+style=\"[^\"]*font-size:\\s*(\\d+)px;[^\"]*\">.*</(\\w+)>$");
            case 10:
                hqu0 hqu0Var = StoryWidgets.Companion;
                return new p53(equ0.a, 0);
            case 11:
                return StoryWidgets.ActionType.Companion.serializer();
            case 12:
                return new k8u(auu0.a, cm2.a, 1);
            case 13:
                return new p53(vt4.Companion.serializer(), 0);
            case 14:
                return vez0.g("ru.yandex.taxi.communications.api.dto.StoryWidgets.ActionType", StoryWidgets.ActionType.values(), new String[]{Constants.DEEPLINK, "web_view", "share", "screenshare", "move", "clipboard_copy", "save_benefit"}, new Annotation[][]{null, null, null, null, null, null, null});
            case 15:
                return vez0.g("com.yandex.go.feed_video.actions.models.StreamTypeDto", StreamTypeDto.values(), new String[]{"dash", "dash_mb", "hls"}, new Annotation[][]{null, null, null});
            case 16:
                axu0 axu0Var = dxu0.Companion;
                return new p53(nor.a, 0);
            case 17:
                axu0 axu0Var2 = dxu0.Companion;
                return BubbleStructure.Companion.serializer();
            case 18:
                axu0 axu0Var3 = dxu0.Companion;
                return BubbleOrientation.Companion.serializer();
            case 19:
                gxu0 gxu0Var = hxu0.Companion;
                return new eni0(qoi0.a(Float.class), nor.a);
            case 20:
                _childSerializers$_anonymous_ = SubscriptionConfiguration.PayButton._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 21:
                _childSerializers$_anonymous_$0 = SubscriptionConfiguration.PayButton._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 22:
                _childSerializers$_anonymous_2 = SubscriptionConfiguration.PayInfo._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 23:
                _childSerializers$_anonymous_3 = SubscriptionConfiguration.Subscription._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 24:
                _childSerializers$_anonymous_$02 = SubscriptionConfiguration.Subscription._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 25:
                _childSerializers$_anonymous_$1 = SubscriptionConfiguration.Subscription._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 26:
                _childSerializers$_anonymous_$2 = SubscriptionConfiguration.Subscription._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 27:
                _childSerializers$_anonymous_4 = SubscriptionConfiguration.Subscription.AcquisitionParams._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 28:
                _childSerializers$_anonymous_$03 = SubscriptionConfiguration.Subscription.AcquisitionParams._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            default:
                v0v0 v0v0Var = SubscriptionInfoDto.Companion;
                return SubscriptionInfoDto.SubscriptionStatusDto.Companion.serializer();
        }
    }
}
