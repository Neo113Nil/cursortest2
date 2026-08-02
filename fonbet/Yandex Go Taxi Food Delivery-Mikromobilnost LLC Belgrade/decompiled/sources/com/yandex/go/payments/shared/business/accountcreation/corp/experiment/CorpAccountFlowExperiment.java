package com.yandex.go.payments.shared.business.accountcreation.corp.experiment;

import defpackage.bgc;
import defpackage.c6z;
import defpackage.cue;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.xn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0014\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment;", "Lxn11;", "Lc6z;", "Companion", "CitySuggestionScreen", "RegistrationForm", "CreateAccountUtm", "AndroidCreateAccountUtmRecord", "CreateAccountErrorDialog", "AcceptButton", "PrivacyPolicy", "CityInputField", "EmailInputField", "PhoneInputField", "ContactInputField", "CompanyNameInputField", "SuccessRegistrationScreen", "LimitExceededScreen", "BusinessAccountItem", "WebViewPersonalAccount", "UserAgentTag", "CorpCreationNavigatorModalDto", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/f", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CorpAccountFlowExperiment implements xn11, c6z {
    public static final f Companion = new f();
    public static final i3y[] j = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bgc(26)), null, null, null, null, null, null};
    public static final CorpAccountFlowExperiment k = new CorpAccountFlowExperiment(0);
    public final boolean b;
    public final Map c;
    public final RegistrationForm d;
    public final SuccessRegistrationScreen e;
    public final LimitExceededScreen f;
    public final CitySuggestionScreen g;
    public final WebViewPersonalAccount h;
    public final CorpCreationNavigatorModalDto i;

    public CorpAccountFlowExperiment(int i, boolean z, Map map, RegistrationForm registrationForm, SuccessRegistrationScreen successRegistrationScreen, LimitExceededScreen limitExceededScreen, CitySuggestionScreen citySuggestionScreen, WebViewPersonalAccount webViewPersonalAccount, CorpCreationNavigatorModalDto corpCreationNavigatorModalDto) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = new RegistrationForm(0);
        } else {
            this.d = registrationForm;
        }
        if ((i & 8) == 0) {
            SuccessRegistrationScreen.Companion.getClass();
            this.e = SuccessRegistrationScreen.e;
        } else {
            this.e = successRegistrationScreen;
        }
        if ((i & 16) == 0) {
            LimitExceededScreen.Companion.getClass();
            this.f = LimitExceededScreen.d;
        } else {
            this.f = limitExceededScreen;
        }
        if ((i & 32) == 0) {
            this.g = new CitySuggestionScreen(0);
        } else {
            this.g = citySuggestionScreen;
        }
        if ((i & 64) == 0) {
            this.h = new WebViewPersonalAccount(0);
        } else {
            this.h = webViewPersonalAccount;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = corpCreationNavigatorModalDto;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$AcceptButton;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AcceptButton {
        public static final a Companion = new a();
        public final String a;

        public /* synthetic */ AcceptButton(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public AcceptButton(int i) {
            this.a = "";
        }

        public AcceptButton() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$CreateAccountErrorDialog;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CreateAccountErrorDialog {
        public static final s Companion = new s();
        public final String a;

        public /* synthetic */ CreateAccountErrorDialog(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public CreateAccountErrorDialog(int i) {
            this.a = "";
        }

        public CreateAccountErrorDialog() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$CreateAccountUtm;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CreateAccountUtm {
        public static final t Companion = new t();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cue(0))};
        public final List a;

        public /* synthetic */ CreateAccountUtm(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public CreateAccountUtm(int i) {
            this.a = EmptyList.a;
        }

        public CreateAccountUtm() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$UserAgentTag;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/a0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class UserAgentTag {
        public static final a0 Companion = new a0();
        public final String a;

        public /* synthetic */ UserAgentTag(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public UserAgentTag(int i) {
            this.a = "";
        }

        public UserAgentTag() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$AndroidCreateAccountUtmRecord;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AndroidCreateAccountUtmRecord {
        public static final b Companion = new b();
        public final String a;
        public final String b;

        public /* synthetic */ AndroidCreateAccountUtmRecord(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public AndroidCreateAccountUtmRecord() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$CompanyNameInputField;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CompanyNameInputField {
        public static final g Companion = new g();
        public final String a;
        public final String b;

        public /* synthetic */ CompanyNameInputField(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public CompanyNameInputField(int i) {
            this.a = "";
            this.b = "";
        }

        public CompanyNameInputField() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$ContactInputField;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ContactInputField {
        public static final h Companion = new h();
        public final String a;
        public final String b;

        public /* synthetic */ ContactInputField(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public ContactInputField(int i) {
            this.a = "";
            this.b = "";
        }

        public ContactInputField() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$EmailInputField;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class EmailInputField {
        public static final u Companion = new u();
        public final String a;
        public final String b;

        public /* synthetic */ EmailInputField(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public EmailInputField(int i) {
            this.a = "";
            this.b = "";
        }

        public EmailInputField() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$PhoneInputField;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PhoneInputField {
        public static final w Companion = new w();
        public final String a;
        public final String b;

        public /* synthetic */ PhoneInputField(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public PhoneInputField(int i) {
            this.a = "";
            this.b = "";
        }

        public PhoneInputField() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$BusinessAccountItem;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class BusinessAccountItem {
        public static final c Companion = new c();
        public final boolean a;
        public final String b;
        public final String c;

        public /* synthetic */ BusinessAccountItem(String str, int i, String str2, boolean z) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
        }

        public BusinessAccountItem(int i) {
            this.a = false;
            this.b = "";
            this.c = "";
        }

        public BusinessAccountItem() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$CityInputField;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CityInputField {
        public static final d Companion = new d();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ CityInputField(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
        }

        public CityInputField(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public CityInputField() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$LimitExceededScreen;", "", "Companion", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/v", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class LimitExceededScreen {
        public static final v Companion = new v();
        public static final LimitExceededScreen d = new LimitExceededScreen(0);
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ LimitExceededScreen(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
        }

        public LimitExceededScreen(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public LimitExceededScreen() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$PrivacyPolicy;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PrivacyPolicy {
        public static final x Companion = new x();
        public final String a;
        public final String b;
        public final boolean c;

        public /* synthetic */ PrivacyPolicy(String str, int i, String str2, boolean z) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = true;
            } else {
                this.c = z;
            }
        }

        public PrivacyPolicy(int i) {
            this.a = "";
            this.b = "";
            this.c = true;
        }

        public PrivacyPolicy() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$CitySuggestionScreen;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CitySuggestionScreen {
        public static final e Companion = new e();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ CitySuggestionScreen(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
        }

        public CitySuggestionScreen(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public CitySuggestionScreen() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$SuccessRegistrationScreen;", "", "Companion", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/z", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SuccessRegistrationScreen {
        public static final z Companion = new z();
        public static final SuccessRegistrationScreen e = new SuccessRegistrationScreen(0);
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ SuccessRegistrationScreen(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
        }

        public SuccessRegistrationScreen(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public SuccessRegistrationScreen() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$CorpCreationNavigatorModalDto;", "", "Companion", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/p", "EmployeeAccessInfoModalDto", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CorpCreationNavigatorModalDto {
        public static final q Companion = new q();
        public static final i3y[] f = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bgc(27)), null};
        public final String a;
        public final String b;
        public final String c;
        public final List d;
        public final EmployeeAccessInfoModalDto e;

        public /* synthetic */ CorpCreationNavigatorModalDto(int i, String str, String str2, String str3, List list, EmployeeAccessInfoModalDto employeeAccessInfoModalDto) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = employeeAccessInfoModalDto;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$EmployeeAccessInfoModalDto;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class EmployeeAccessInfoModalDto {
            public static final r Companion = new r();
            public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bgc(29)), null, null};
            public final String a;
            public final String b;
            public final List c;
            public final String d;
            public final String e;

            public /* synthetic */ EmployeeAccessInfoModalDto(int i, String str, String str2, String str3, String str4, List list) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str2;
                }
                if ((i & 4) == 0) {
                    this.c = EmptyList.a;
                } else {
                    this.c = list;
                }
                if ((i & 8) == 0) {
                    this.d = "";
                } else {
                    this.d = str3;
                }
                if ((i & 16) == 0) {
                    this.e = "";
                } else {
                    this.e = str4;
                }
            }

            public EmployeeAccessInfoModalDto() {
                this.a = "";
                this.b = "";
                this.c = EmptyList.a;
                this.d = "";
                this.e = "";
            }
        }

        public CorpCreationNavigatorModalDto() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = EmptyList.a;
            this.e = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$WebViewPersonalAccount;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class WebViewPersonalAccount {
        public static final b0 Companion = new b0();
        public static final i3y[] i = {null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cue(1)), null};
        public final String a;
        public final boolean b;
        public final boolean c;
        public final String d;
        public final UserAgentTag e;
        public final boolean f;
        public final List g;
        public final String h;

        public /* synthetic */ WebViewPersonalAccount(int i2, String str, boolean z, boolean z2, String str2, UserAgentTag userAgentTag, boolean z3, List list, String str3) {
            if ((i2 & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i2 & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i2 & 4) == 0) {
                this.c = false;
            } else {
                this.c = z2;
            }
            if ((i2 & 8) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
            if ((i2 & 16) == 0) {
                this.e = new UserAgentTag(0);
            } else {
                this.e = userAgentTag;
            }
            if ((i2 & 32) == 0) {
                this.f = false;
            } else {
                this.f = z3;
            }
            if ((i2 & 64) == 0) {
                this.g = EmptyList.a;
            } else {
                this.g = list;
            }
            if ((i2 & 128) == 0) {
                this.h = "";
            } else {
                this.h = str3;
            }
        }

        public WebViewPersonalAccount() {
            this(0);
        }

        public WebViewPersonalAccount(int i2) {
            UserAgentTag userAgentTag = new UserAgentTag(0);
            this.a = "";
            this.b = false;
            this.c = false;
            this.d = "";
            this.e = userAgentTag;
            this.f = false;
            this.g = EmptyList.a;
            this.h = "";
        }
    }

    public CorpAccountFlowExperiment() {
        this(0);
    }

    public CorpAccountFlowExperiment(int i) {
        Map f = kotlin.collections.b.f();
        RegistrationForm registrationForm = new RegistrationForm(0);
        SuccessRegistrationScreen.Companion.getClass();
        LimitExceededScreen.Companion.getClass();
        CitySuggestionScreen citySuggestionScreen = new CitySuggestionScreen(0);
        WebViewPersonalAccount webViewPersonalAccount = new WebViewPersonalAccount(0);
        this.b = false;
        this.c = f;
        this.d = registrationForm;
        this.e = SuccessRegistrationScreen.e;
        this.f = LimitExceededScreen.d;
        this.g = citySuggestionScreen;
        this.h = webViewPersonalAccount;
        this.i = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$RegistrationForm;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RegistrationForm {
        public static final y Companion = new y();
        public final BusinessAccountItem a;
        public final String b;
        public final String c;
        public final AcceptButton d;
        public final String e;
        public final PrivacyPolicy f;
        public final CityInputField g;
        public final EmailInputField h;
        public final PhoneInputField i;
        public final ContactInputField j;
        public final CompanyNameInputField k;
        public final CreateAccountErrorDialog l;
        public final String m;
        public final String n;
        public final CreateAccountUtm o;

        public /* synthetic */ RegistrationForm(int i, BusinessAccountItem businessAccountItem, String str, String str2, AcceptButton acceptButton, String str3, PrivacyPolicy privacyPolicy, CityInputField cityInputField, EmailInputField emailInputField, PhoneInputField phoneInputField, ContactInputField contactInputField, CompanyNameInputField companyNameInputField, CreateAccountErrorDialog createAccountErrorDialog, String str4, String str5, CreateAccountUtm createAccountUtm) {
            this.a = (i & 1) == 0 ? new BusinessAccountItem(0) : businessAccountItem;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = new AcceptButton(0);
            } else {
                this.d = acceptButton;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str3;
            }
            if ((i & 32) == 0) {
                this.f = new PrivacyPolicy(0);
            } else {
                this.f = privacyPolicy;
            }
            if ((i & 64) == 0) {
                this.g = new CityInputField(0);
            } else {
                this.g = cityInputField;
            }
            if ((i & 128) == 0) {
                this.h = new EmailInputField(0);
            } else {
                this.h = emailInputField;
            }
            if ((i & 256) == 0) {
                this.i = new PhoneInputField(0);
            } else {
                this.i = phoneInputField;
            }
            if ((i & 512) == 0) {
                this.j = new ContactInputField(0);
            } else {
                this.j = contactInputField;
            }
            if ((i & 1024) == 0) {
                this.k = new CompanyNameInputField(0);
            } else {
                this.k = companyNameInputField;
            }
            if ((i & 2048) == 0) {
                this.l = new CreateAccountErrorDialog(0);
            } else {
                this.l = createAccountErrorDialog;
            }
            if ((i & 4096) == 0) {
                this.m = "";
            } else {
                this.m = str4;
            }
            if ((i & 8192) == 0) {
                this.n = "";
            } else {
                this.n = str5;
            }
            this.o = (i & 16384) == 0 ? new CreateAccountUtm(0) : createAccountUtm;
        }

        public RegistrationForm() {
            this(0);
        }

        public RegistrationForm(int i) {
            BusinessAccountItem businessAccountItem = new BusinessAccountItem(0);
            AcceptButton acceptButton = new AcceptButton(0);
            PrivacyPolicy privacyPolicy = new PrivacyPolicy(0);
            CityInputField cityInputField = new CityInputField(0);
            EmailInputField emailInputField = new EmailInputField(0);
            PhoneInputField phoneInputField = new PhoneInputField(0);
            ContactInputField contactInputField = new ContactInputField(0);
            CompanyNameInputField companyNameInputField = new CompanyNameInputField(0);
            CreateAccountErrorDialog createAccountErrorDialog = new CreateAccountErrorDialog(0);
            CreateAccountUtm createAccountUtm = new CreateAccountUtm(0);
            this.a = businessAccountItem;
            this.b = "";
            this.c = "";
            this.d = acceptButton;
            this.e = "";
            this.f = privacyPolicy;
            this.g = cityInputField;
            this.h = emailInputField;
            this.i = phoneInputField;
            this.j = contactInputField;
            this.k = companyNameInputField;
            this.l = createAccountErrorDialog;
            this.m = "";
            this.n = "";
            this.o = createAccountUtm;
        }
    }
}
