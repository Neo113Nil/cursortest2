package com.yandex.go.payments.shared.data;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.AccountDetails;
import com.yandex.go.payments.shared.data.model.AddMemberRequest;
import com.yandex.go.payments.shared.data.model.CreateAccountRequest;
import com.yandex.go.payments.shared.data.model.GetCurrenciesResponse;
import com.yandex.go.payments.shared.data.model.PhonishAccountLinkedRequest;
import com.yandex.go.payments.shared.data.model.SaveMemberDetails;
import com.yandex.go.payments.shared.data.model.SaveReportSettingsRequest;
import com.yandex.go.payments.shared.data.model.SetCommonLimitRequest;
import com.yandex.go.payments.shared.data.model.SetCurrencyRequest;
import com.yandex.go.payments.shared.data.model.SetInvitationReadRequest;
import com.yandex.go.payments.shared.data.model.SharedPayment;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.ipf;
import defpackage.q76;
import defpackage.s490;
import defpackage.t490;
import defpackage.wqs;
import defpackage.zy11;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\fJ7\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\fJ#\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\fJ7\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u001bH'¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010 \u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J7\u0010$\u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0006H'¢\u0006\u0004\b'\u0010(J-\u0010*\u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020)H'¢\u0006\u0004\b*\u0010+J7\u0010-\u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020,H'¢\u0006\u0004\b-\u0010.J7\u00100\u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020/H'¢\u0006\u0004\b0\u00101J#\u00103\u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\b\b\u0001\u0010\u0005\u001a\u000202H'¢\u0006\u0004\b3\u00104¨\u00065À\u0006\u0003"}, d2 = {"Lcom/yandex/go/payments/shared/data/CoopAccountApi;", "", "", "revision", "Lcom/yandex/go/payments/shared/data/model/CreateAccountRequest;", "request", "Lcmt;", "Lcom/yandex/go/payments/shared/data/model/Account;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "(Ljava/lang/String;Lcom/yandex/go/payments/shared/data/model/CreateAccountRequest;)Lcmt;", "accountId", "m", "(Ljava/lang/String;)Lcmt;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "h", "accountRevision", "Lcom/yandex/go/payments/shared/data/model/AddMemberRequest;", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/payments/shared/data/model/AddMemberRequest;)Lcmt;", "memberId", "o", "b", "Lcom/yandex/go/payments/shared/data/model/SharedPayment;", "payment", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/payments/shared/data/model/SharedPayment;)Lcmt;", "Lcom/yandex/go/payments/shared/data/model/SetInvitationReadRequest;", "f", "(Ljava/lang/String;Lcom/yandex/go/payments/shared/data/model/SetInvitationReadRequest;)Lcmt;", "Lcom/yandex/go/payments/shared/data/model/SaveMemberDetails;", "saveMemberDetails", "l", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/payments/shared/data/model/SaveMemberDetails;)Lcmt;", "Lcom/yandex/go/payments/shared/data/model/AccountDetails;", "details", "c", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/payments/shared/data/model/AccountDetails;)Lcmt;", "Lcom/yandex/go/payments/shared/data/model/GetCurrenciesResponse;", "n", "()Lcmt;", "Lcom/yandex/go/payments/shared/data/model/SetCurrencyRequest;", "d", "(Ljava/lang/String;Lcom/yandex/go/payments/shared/data/model/SetCurrencyRequest;)Lcmt;", "Lcom/yandex/go/payments/shared/data/model/SaveReportSettingsRequest;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/payments/shared/data/model/SaveReportSettingsRequest;)Lcmt;", "Lcom/yandex/go/payments/shared/data/model/SetCommonLimitRequest;", CoreConstants.PushMessage.SERVICE_TYPE, "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/payments/shared/data/model/SetCommonLimitRequest;)Lcmt;", "Lcom/yandex/go/payments/shared/data/model/PhonishAccountLinkedRequest;", "k", "(Lcom/yandex/go/payments/shared/data/model/PhonishAccountLinkedRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CoopAccountApi {
    @t490("coop_account/reports")
    cmt<zy11> a(@djg0("account_id") String accountId, @djg0("revision") String revision, @q76 SaveReportSettingsRequest request);

    @ipf("coop_account/member/leave_group")
    cmt<zy11> b(@djg0("id") String accountId);

    @t490("coop_account/details")
    cmt<zy11> c(@djg0("account_id") String accountId, @djg0("revision") String accountRevision, @q76 AccountDetails details);

    @t490("coop_account/currency")
    cmt<zy11> d(@djg0("account_id") String accountId, @q76 SetCurrencyRequest request);

    @t490("coop_account/payment")
    cmt<zy11> e(@djg0("account_id") String accountId, @djg0("revision") String accountRevision, @q76 SharedPayment payment);

    @t490("coop_account/member/invitation_sent")
    cmt<zy11> f(@djg0("id") String accountId, @q76 SetInvitationReadRequest request);

    @s490("coop_account/member/create")
    cmt<zy11> g(@djg0("account_id") String accountId, @djg0("revision") String accountRevision, @q76 AddMemberRequest request);

    @ipf("coop_account/delete")
    cmt<zy11> h(@djg0("account_id") String accountId);

    @t490("coop_account/limit")
    cmt<zy11> i(@djg0("account_id") String accountId, @djg0("revision") String accountRevision, @q76 SetCommonLimitRequest request);

    @s490("coop_account/create")
    cmt<Account> j(@djg0("revision") String revision, @q76 CreateAccountRequest request);

    @s490("coop_account/member/zalogined")
    cmt<zy11> k(@q76 PhonishAccountLinkedRequest request);

    @t490("coop_account/v2/member/details")
    cmt<zy11> l(@djg0("id") String memberId, @djg0("revision") String accountRevision, @q76 SaveMemberDetails saveMemberDetails);

    @wqs("coop_account")
    cmt<Account> m(@djg0("account_id") String accountId);

    @wqs("coop_account/currencies")
    cmt<GetCurrenciesResponse> n();

    @ipf("coop_account/member/delete")
    cmt<zy11> o(@djg0("id") String memberId);
}
