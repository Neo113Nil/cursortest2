package com.yandex.go.safety.center;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.safety.center.api.AccidentStatusParam;
import com.yandex.go.safety.center.api.AccidentsResponse;
import com.yandex.go.safety.center.api.BaseTrustedContacts;
import com.yandex.go.safety.center.api.SafetyCenterConfig;
import com.yandex.go.safety.center.api.SendSosInfoParam;
import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.api.ShareResponse;
import com.yandex.go.safety.center.api.TrustedContacts;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.q76;
import defpackage.s490;
import defpackage.t490;
import defpackage.wqs;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0016\u0010\u0007J+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u001cH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/yandex/go/safety/center/SafetyCenterApi;", "", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "Lcmt;", "Lcom/yandex/go/safety/center/api/SafetyCenterConfig;", "c", "(Ljava/lang/String;)Lcmt;", "Lcom/yandex/go/safety/center/api/TrustedContacts;", "f", "()Lcmt;", "Lcom/yandex/go/safety/center/api/BaseTrustedContacts;", ContactsFragment.WEBVIEW_NAME, "Lzy11;", "a", "(Lcom/yandex/go/safety/center/api/BaseTrustedContacts;)Lcmt;", "Lcom/yandex/go/safety/center/api/ShareRequestParam;", "params", "Lcom/yandex/go/safety/center/api/ShareResponse;", "g", "(Lcom/yandex/go/safety/center/api/ShareRequestParam;)Lcmt;", "Lcom/yandex/go/safety/center/api/AccidentsResponse;", "d", "accidentId", "Lcom/yandex/go/safety/center/api/AccidentStatusParam;", "param", "h", "(Ljava/lang/String;Lcom/yandex/go/safety/center/api/AccidentStatusParam;)Lcmt;", "Lkotlinx/serialization/json/b;", "b", "(Lkotlinx/serialization/json/b;)Lcmt;", "Lcom/yandex/go/safety/center/api/SendSosInfoParam;", "e", "(Lcom/yandex/go/safety/center/api/SendSosInfoParam;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SafetyCenterApi {
    @t490("safety_center/v1/contacts")
    cmt<zy11> a(@q76 BaseTrustedContacts contacts);

    @s490("taxi_antifraud/v1/save_safety_button_info")
    cmt<zy11> b(@q76 kotlinx.serialization.json.b param);

    @wqs("safety_center/v1/launch")
    cmt<SafetyCenterConfig> c(@djg0("order_id") String orderId);

    @wqs("safety_center/v1/accidents")
    cmt<AccidentsResponse> d(@djg0("order_id") String orderId);

    @s490("safety_center/v2/send-sos-info")
    cmt<zy11> e(@q76 SendSosInfoParam param);

    @wqs("safety_center/v1/contacts")
    cmt<TrustedContacts> f();

    @t490("safety_center/v1/share")
    cmt<ShareResponse> g(@q76 ShareRequestParam params);

    @t490("safety_center/v1/accidents/status")
    cmt<zy11> h(@djg0("accident_id") String accidentId, @q76 AccidentStatusParam param);
}
