package com.yandex.go.payments.shared.business;

import com.yandex.go.payments.api.shared.model.EntryPoints;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.r66;
import defpackage.xn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment;", "Lxn11;", "Lc6z;", "Companion", "MemberDetailsScreen", "MemberListScreen", "SettingsScreen", "LimitSettingsScreen", "CreateBusinessAccountFullscreen", "BusinessAccountLinkItem", "ViewBusinessAccount", "CreateEnterpriseAccount", "ActionButton", "Menu", "FallbackFullscreen", "YandexProtectionScreen", "ReportSettingsScreen", "EmailInputField", "AddMemberScreen", "SelectCurrencyScreen", "ReportSettingsScreenActionButton", "com/yandex/go/payments/shared/business/m", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BusinessAccountFlowExperiment implements xn11, c6z {
    public static final m Companion = new m();
    public static final i3y[] o = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(4)), null, null, null, null, null, null, null, null, null, null, null, null};
    public static final BusinessAccountFlowExperiment p = new BusinessAccountFlowExperiment(0);
    public final Map b;
    public final CreateBusinessAccountFullscreen c;
    public final Menu d;
    public final ViewBusinessAccount e;
    public final EntryPoints f;
    public final ReportSettingsScreen g;
    public final YandexProtectionScreen h;
    public final AddMemberScreen i;
    public final SettingsScreen j;
    public final MemberListScreen k;
    public final LimitSettingsScreen l;
    public final MemberDetailsScreen m;
    public final SelectCurrencyScreen n;

    public BusinessAccountFlowExperiment(int i, Map map, CreateBusinessAccountFullscreen createBusinessAccountFullscreen, Menu menu, ViewBusinessAccount viewBusinessAccount, EntryPoints entryPoints, ReportSettingsScreen reportSettingsScreen, YandexProtectionScreen yandexProtectionScreen, AddMemberScreen addMemberScreen, SettingsScreen settingsScreen, MemberListScreen memberListScreen, LimitSettingsScreen limitSettingsScreen, MemberDetailsScreen memberDetailsScreen, SelectCurrencyScreen selectCurrencyScreen) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            CreateBusinessAccountFullscreen.Companion.getClass();
            this.c = CreateBusinessAccountFullscreen.d;
        } else {
            this.c = createBusinessAccountFullscreen;
        }
        if ((i & 4) == 0) {
            this.d = new Menu(0);
        } else {
            this.d = menu;
        }
        if ((i & 8) == 0) {
            this.e = new ViewBusinessAccount(0);
        } else {
            this.e = viewBusinessAccount;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = entryPoints;
        }
        if ((i & 32) == 0) {
            this.g = new ReportSettingsScreen(0);
        } else {
            this.g = reportSettingsScreen;
        }
        if ((i & 64) == 0) {
            this.h = new YandexProtectionScreen(0);
        } else {
            this.h = yandexProtectionScreen;
        }
        if ((i & 128) == 0) {
            this.i = new AddMemberScreen(0);
        } else {
            this.i = addMemberScreen;
        }
        if ((i & 256) == 0) {
            this.j = new SettingsScreen(0);
        } else {
            this.j = settingsScreen;
        }
        if ((i & 512) == 0) {
            this.k = new MemberListScreen(0);
        } else {
            this.k = memberListScreen;
        }
        if ((i & 1024) == 0) {
            this.l = new LimitSettingsScreen(0);
        } else {
            this.l = limitSettingsScreen;
        }
        if ((i & 2048) == 0) {
            this.m = new MemberDetailsScreen(0);
        } else {
            this.m = memberDetailsScreen;
        }
        if ((i & 4096) == 0) {
            this.n = new SelectCurrencyScreen(0);
        } else {
            this.n = selectCurrencyScreen;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$AddMemberScreen;", "", "Companion", "NameInputField", "PhoneInputField", "PickFromContactsItem", "InviteButton", "UnregisteredErrorAlert", "ValidationErrorAlert", "$serializer", "com/yandex/go/payments/shared/business/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AddMemberScreen {
        public static final e Companion = new e();
        public final String a;
        public final String b;
        public final NameInputField c;
        public final PhoneInputField d;
        public final PickFromContactsItem e;
        public final InviteButton f;
        public final UnregisteredErrorAlert g;

        public /* synthetic */ AddMemberScreen(int i, String str, String str2, NameInputField nameInputField, PhoneInputField phoneInputField, PickFromContactsItem pickFromContactsItem, InviteButton inviteButton, UnregisteredErrorAlert unregisteredErrorAlert) {
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
                this.c = new NameInputField(0);
            } else {
                this.c = nameInputField;
            }
            if ((i & 8) == 0) {
                this.d = new PhoneInputField(0);
            } else {
                this.d = phoneInputField;
            }
            if ((i & 16) == 0) {
                this.e = new PickFromContactsItem(0);
            } else {
                this.e = pickFromContactsItem;
            }
            if ((i & 32) == 0) {
                this.f = new InviteButton(0);
            } else {
                this.f = inviteButton;
            }
            if ((i & 64) == 0) {
                this.g = new UnregisteredErrorAlert(0);
            } else {
                this.g = unregisteredErrorAlert;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$AddMemberScreen$InviteButton;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class InviteButton {
            public static final f Companion = new f();
            public final String a;

            public /* synthetic */ InviteButton(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
            }

            public InviteButton(int i) {
                this.a = "";
            }

            public InviteButton() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$AddMemberScreen$NameInputField;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class NameInputField {
            public static final g Companion = new g();
            public final String a;

            public /* synthetic */ NameInputField(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
            }

            public NameInputField(int i) {
                this.a = "";
            }

            public NameInputField() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$AddMemberScreen$PhoneInputField;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PhoneInputField {
            public static final h Companion = new h();
            public final String a;

            public /* synthetic */ PhoneInputField(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
            }

            public PhoneInputField(int i) {
                this.a = "";
            }

            public PhoneInputField() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$AddMemberScreen$PickFromContactsItem;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PickFromContactsItem {
            public static final i Companion = new i();
            public final String a;

            public /* synthetic */ PickFromContactsItem(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
            }

            public PickFromContactsItem(int i) {
                this.a = "";
            }

            public PickFromContactsItem() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$AddMemberScreen$ValidationErrorAlert;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes13.dex */
        public static final class ValidationErrorAlert {
            public static final k Companion = new k();
            public final String a;

            public /* synthetic */ ValidationErrorAlert(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
            }

            public ValidationErrorAlert() {
                this.a = "";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$AddMemberScreen$UnregisteredErrorAlert;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class UnregisteredErrorAlert {
            public static final j Companion = new j();
            public final String a;
            public final String b;

            public /* synthetic */ UnregisteredErrorAlert(int i, String str, String str2) {
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

            public UnregisteredErrorAlert(int i) {
                this.a = "";
                this.b = "";
            }

            public UnregisteredErrorAlert() {
                this(0);
            }
        }

        public AddMemberScreen() {
            this(0);
        }

        public AddMemberScreen(int i) {
            NameInputField nameInputField = new NameInputField(0);
            PhoneInputField phoneInputField = new PhoneInputField(0);
            PickFromContactsItem pickFromContactsItem = new PickFromContactsItem(0);
            InviteButton inviteButton = new InviteButton(0);
            UnregisteredErrorAlert unregisteredErrorAlert = new UnregisteredErrorAlert(0);
            this.a = "";
            this.b = "";
            this.c = nameInputField;
            this.d = phoneInputField;
            this.e = pickFromContactsItem;
            this.f = inviteButton;
            this.g = unregisteredErrorAlert;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$LimitSettingsScreen;", "", "Companion", "EmptyView", "ActionButton", "SetLimitAlert", "ResetLimitAlert", "InviteMemberItem", "AllMembersLimitInputField", "$serializer", "com/yandex/go/payments/shared/business/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class LimitSettingsScreen {
        public static final t Companion = new t();
        public final String a;
        public final String b;
        public final EmptyView c;
        public final ActionButton d;
        public final SetLimitAlert e;
        public final ResetLimitAlert f;
        public final InviteMemberItem g;
        public final AllMembersLimitInputField h;

        public /* synthetic */ LimitSettingsScreen(int i, String str, String str2, EmptyView emptyView, ActionButton actionButton, SetLimitAlert setLimitAlert, ResetLimitAlert resetLimitAlert, InviteMemberItem inviteMemberItem, AllMembersLimitInputField allMembersLimitInputField) {
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
                this.c = new EmptyView(0);
            } else {
                this.c = emptyView;
            }
            if ((i & 8) == 0) {
                this.d = new ActionButton(0);
            } else {
                this.d = actionButton;
            }
            if ((i & 16) == 0) {
                this.e = new SetLimitAlert(0);
            } else {
                this.e = setLimitAlert;
            }
            if ((i & 32) == 0) {
                this.f = new ResetLimitAlert(0);
            } else {
                this.f = resetLimitAlert;
            }
            if ((i & 64) == 0) {
                this.g = new InviteMemberItem(0);
            } else {
                this.g = inviteMemberItem;
            }
            if ((i & 128) == 0) {
                this.h = new AllMembersLimitInputField(0);
            } else {
                this.h = allMembersLimitInputField;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$LimitSettingsScreen$InviteMemberItem;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class InviteMemberItem {
            public static final v Companion = new v();
            public final String a;

            public /* synthetic */ InviteMemberItem(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
            }

            public InviteMemberItem(int i) {
                this.a = "";
            }

            public InviteMemberItem() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$LimitSettingsScreen$AllMembersLimitInputField;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class AllMembersLimitInputField {
            public static final s Companion = new s();
            public final String a;
            public final String b;

            public /* synthetic */ AllMembersLimitInputField(int i, String str, String str2) {
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

            public AllMembersLimitInputField(int i) {
                this.a = "";
                this.b = "";
            }

            public AllMembersLimitInputField() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$LimitSettingsScreen$ActionButton;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ActionButton {
            public static final r Companion = new r();
            public final String a;
            public final String b;
            public final String c;

            public /* synthetic */ ActionButton(int i, String str, String str2, String str3) {
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

            public ActionButton(int i) {
                this.a = "";
                this.b = "";
                this.c = "";
            }

            public ActionButton() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$LimitSettingsScreen$EmptyView;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class EmptyView {
            public static final u Companion = new u();
            public final String a;
            public final String b;
            public final String c;

            public /* synthetic */ EmptyView(int i, String str, String str2, String str3) {
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

            public EmptyView(int i) {
                this.a = "";
                this.b = "";
                this.c = "";
            }

            public EmptyView() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$LimitSettingsScreen$ResetLimitAlert;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ResetLimitAlert {
            public static final w Companion = new w();
            public final String a;
            public final String b;
            public final String c;
            public final String d;

            public /* synthetic */ ResetLimitAlert(int i, String str, String str2, String str3, String str4) {
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

            public ResetLimitAlert(int i) {
                this.a = "";
                this.b = "";
                this.c = "";
                this.d = "";
            }

            public ResetLimitAlert() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$LimitSettingsScreen$SetLimitAlert;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class SetLimitAlert {
            public static final x Companion = new x();
            public final String a;
            public final String b;
            public final String c;
            public final String d;

            public /* synthetic */ SetLimitAlert(int i, String str, String str2, String str3, String str4) {
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

            public SetLimitAlert(int i) {
                this.a = "";
                this.b = "";
                this.c = "";
                this.d = "";
            }

            public SetLimitAlert() {
                this(0);
            }
        }

        public LimitSettingsScreen() {
            this(0);
        }

        public LimitSettingsScreen(int i) {
            EmptyView emptyView = new EmptyView(0);
            ActionButton actionButton = new ActionButton(0);
            SetLimitAlert setLimitAlert = new SetLimitAlert(0);
            ResetLimitAlert resetLimitAlert = new ResetLimitAlert(0);
            InviteMemberItem inviteMemberItem = new InviteMemberItem(0);
            AllMembersLimitInputField allMembersLimitInputField = new AllMembersLimitInputField(0);
            this.a = "";
            this.b = "";
            this.c = emptyView;
            this.d = actionButton;
            this.e = setLimitAlert;
            this.f = resetLimitAlert;
            this.g = inviteMemberItem;
            this.h = allMembersLimitInputField;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberDetailsScreen;", "", "Companion", "ActionButton", "NameInputField", "EnableLimitItem", "PhoneInputField", "DeleteMemberAlert", "AmountLimitInputField", "PickFromContactsButton", "$serializer", "com/yandex/go/payments/shared/business/a0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class MemberDetailsScreen {
        public static final a0 Companion = new a0();
        public final String a;
        public final ActionButton b;
        public final NameInputField c;
        public final EnableLimitItem d;
        public final PhoneInputField e;
        public final DeleteMemberAlert f;
        public final AmountLimitInputField g;
        public final PickFromContactsButton h;

        public /* synthetic */ MemberDetailsScreen(int i, String str, ActionButton actionButton, NameInputField nameInputField, EnableLimitItem enableLimitItem, PhoneInputField phoneInputField, DeleteMemberAlert deleteMemberAlert, AmountLimitInputField amountLimitInputField, PickFromContactsButton pickFromContactsButton) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = new ActionButton(0);
            } else {
                this.b = actionButton;
            }
            if ((i & 4) == 0) {
                this.c = new NameInputField(0);
            } else {
                this.c = nameInputField;
            }
            if ((i & 8) == 0) {
                this.d = new EnableLimitItem(0);
            } else {
                this.d = enableLimitItem;
            }
            if ((i & 16) == 0) {
                this.e = new PhoneInputField(0);
            } else {
                this.e = phoneInputField;
            }
            if ((i & 32) == 0) {
                this.f = new DeleteMemberAlert(0);
            } else {
                this.f = deleteMemberAlert;
            }
            if ((i & 64) == 0) {
                this.g = new AmountLimitInputField(0);
            } else {
                this.g = amountLimitInputField;
            }
            if ((i & 128) == 0) {
                this.h = new PickFromContactsButton(0);
            } else {
                this.h = pickFromContactsButton;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberDetailsScreen$PickFromContactsButton;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/f0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PickFromContactsButton {
            public static final f0 Companion = new f0();
            public final String a;

            public /* synthetic */ PickFromContactsButton(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
            }

            public PickFromContactsButton(int i) {
                this.a = "";
            }

            public PickFromContactsButton() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberDetailsScreen$AmountLimitInputField;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class AmountLimitInputField {
            public static final z Companion = new z();
            public final String a;
            public final String b;

            public /* synthetic */ AmountLimitInputField(int i, String str, String str2) {
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

            public AmountLimitInputField(int i) {
                this.a = "";
                this.b = "";
            }

            public AmountLimitInputField() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberDetailsScreen$EnableLimitItem;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/c0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class EnableLimitItem {
            public static final c0 Companion = new c0();
            public final String a;
            public final String b;

            public /* synthetic */ EnableLimitItem(int i, String str, String str2) {
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

            public EnableLimitItem(int i) {
                this.a = "";
                this.b = "";
            }

            public EnableLimitItem() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberDetailsScreen$NameInputField;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/d0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class NameInputField {
            public static final d0 Companion = new d0();
            public final String a;
            public final String b;

            public /* synthetic */ NameInputField(int i, String str, String str2) {
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

            public NameInputField(int i) {
                this.a = "";
                this.b = "";
            }

            public NameInputField() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberDetailsScreen$PhoneInputField;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/e0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PhoneInputField {
            public static final e0 Companion = new e0();
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberDetailsScreen$ActionButton;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ActionButton {
            public static final y Companion = new y();
            public final String a;
            public final String b;
            public final String c;
            public final String d;

            public /* synthetic */ ActionButton(int i, String str, String str2, String str3, String str4) {
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

            public ActionButton(int i) {
                this.a = "";
                this.b = "";
                this.c = "";
                this.d = "";
            }

            public ActionButton() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberDetailsScreen$DeleteMemberAlert;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class DeleteMemberAlert {
            public static final b0 Companion = new b0();
            public final String a;
            public final String b;
            public final String c;
            public final String d;

            public /* synthetic */ DeleteMemberAlert(int i, String str, String str2, String str3, String str4) {
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

            public DeleteMemberAlert(int i) {
                this.a = "";
                this.b = "";
                this.c = "";
                this.d = "";
            }

            public DeleteMemberAlert() {
                this(0);
            }
        }

        public MemberDetailsScreen() {
            this(0);
        }

        public MemberDetailsScreen(int i) {
            ActionButton actionButton = new ActionButton(0);
            NameInputField nameInputField = new NameInputField(0);
            EnableLimitItem enableLimitItem = new EnableLimitItem(0);
            PhoneInputField phoneInputField = new PhoneInputField(0);
            DeleteMemberAlert deleteMemberAlert = new DeleteMemberAlert(0);
            AmountLimitInputField amountLimitInputField = new AmountLimitInputField(0);
            PickFromContactsButton pickFromContactsButton = new PickFromContactsButton(0);
            this.a = "";
            this.b = actionButton;
            this.c = nameInputField;
            this.d = enableLimitItem;
            this.e = phoneInputField;
            this.f = deleteMemberAlert;
            this.g = amountLimitInputField;
            this.h = pickFromContactsButton;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberListScreen;", "", "Companion", "MyselfItem", "NavbarButton", "InviteMemberItem", "DeleteMemberProcessView", "$serializer", "com/yandex/go/payments/shared/business/g0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class MemberListScreen {
        public static final g0 Companion = new g0();
        public final String a;
        public final MyselfItem b;
        public final NavbarButton c;
        public final InviteMemberItem d;
        public final DeleteMemberProcessView e;

        public /* synthetic */ MemberListScreen(int i, String str, MyselfItem myselfItem, NavbarButton navbarButton, InviteMemberItem inviteMemberItem, DeleteMemberProcessView deleteMemberProcessView) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = new MyselfItem(0);
            } else {
                this.b = myselfItem;
            }
            if ((i & 4) == 0) {
                this.c = new NavbarButton(0);
            } else {
                this.c = navbarButton;
            }
            if ((i & 8) == 0) {
                this.d = new InviteMemberItem(0);
            } else {
                this.d = inviteMemberItem;
            }
            if ((i & 16) == 0) {
                this.e = new DeleteMemberProcessView(0);
            } else {
                this.e = deleteMemberProcessView;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberListScreen$InviteMemberItem;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/i0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class InviteMemberItem {
            public static final i0 Companion = new i0();
            public final String a;

            public /* synthetic */ InviteMemberItem(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
            }

            public InviteMemberItem(int i) {
                this.a = "";
            }

            public InviteMemberItem() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberListScreen$MyselfItem;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/j0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class MyselfItem {
            public static final j0 Companion = new j0();
            public final String a;

            public /* synthetic */ MyselfItem(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
            }

            public MyselfItem(int i) {
                this.a = "";
            }

            public MyselfItem() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberListScreen$DeleteMemberProcessView;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/h0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class DeleteMemberProcessView {
            public static final h0 Companion = new h0();
            public final String a;
            public final String b;

            public /* synthetic */ DeleteMemberProcessView(int i, String str, String str2) {
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

            public DeleteMemberProcessView(int i) {
                this.a = "";
                this.b = "";
            }

            public DeleteMemberProcessView() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberListScreen$NavbarButton;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/k0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class NavbarButton {
            public static final k0 Companion = new k0();
            public final String a;
            public final String b;

            public /* synthetic */ NavbarButton(int i, String str, String str2) {
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

            public NavbarButton(int i) {
                this.a = "";
                this.b = "";
            }

            public NavbarButton() {
                this(0);
            }
        }

        public MemberListScreen() {
            this(0);
        }

        public MemberListScreen(int i) {
            MyselfItem myselfItem = new MyselfItem(0);
            NavbarButton navbarButton = new NavbarButton(0);
            InviteMemberItem inviteMemberItem = new InviteMemberItem(0);
            DeleteMemberProcessView deleteMemberProcessView = new DeleteMemberProcessView(0);
            this.a = "";
            this.b = myselfItem;
            this.c = navbarButton;
            this.d = inviteMemberItem;
            this.e = deleteMemberProcessView;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$SettingsScreen;", "", "Companion", "AccountNameInputField", "GenericLimitsItem", "ReportItem", "ActionButton", "DeleteAccountAlert", "DeleteAccountProcessView", "$serializer", "com/yandex/go/payments/shared/business/s0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SettingsScreen {
        public static final s0 Companion = new s0();
        public final String a;
        public final AccountNameInputField b;
        public final GenericLimitsItem c;
        public final ReportItem d;
        public final ActionButton e;
        public final DeleteAccountAlert f;
        public final DeleteAccountProcessView g;

        public /* synthetic */ SettingsScreen(int i, String str, AccountNameInputField accountNameInputField, GenericLimitsItem genericLimitsItem, ReportItem reportItem, ActionButton actionButton, DeleteAccountAlert deleteAccountAlert, DeleteAccountProcessView deleteAccountProcessView) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = new AccountNameInputField(0);
            } else {
                this.b = accountNameInputField;
            }
            if ((i & 4) == 0) {
                this.c = new GenericLimitsItem(0);
            } else {
                this.c = genericLimitsItem;
            }
            if ((i & 8) == 0) {
                this.d = new ReportItem(0);
            } else {
                this.d = reportItem;
            }
            if ((i & 16) == 0) {
                this.e = new ActionButton(0);
            } else {
                this.e = actionButton;
            }
            if ((i & 32) == 0) {
                this.f = new DeleteAccountAlert(0);
            } else {
                this.f = deleteAccountAlert;
            }
            if ((i & 64) == 0) {
                this.g = new DeleteAccountProcessView(0);
            } else {
                this.g = deleteAccountProcessView;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$SettingsScreen$ReportItem;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/w0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ReportItem {
            public static final w0 Companion = new w0();
            public final String a;

            public /* synthetic */ ReportItem(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
            }

            public ReportItem(int i) {
                this.a = "";
            }

            public ReportItem() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$SettingsScreen$AccountNameInputField;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/q0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class AccountNameInputField {
            public static final q0 Companion = new q0();
            public final String a;
            public final String b;

            public /* synthetic */ AccountNameInputField(int i, String str, String str2) {
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

            public AccountNameInputField(int i) {
                this.a = "";
                this.b = "";
            }

            public AccountNameInputField() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$SettingsScreen$DeleteAccountProcessView;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/u0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class DeleteAccountProcessView {
            public static final u0 Companion = new u0();
            public final String a;
            public final String b;

            public /* synthetic */ DeleteAccountProcessView(int i, String str, String str2) {
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

            public DeleteAccountProcessView(int i) {
                this.a = "";
                this.b = "";
            }

            public DeleteAccountProcessView() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$SettingsScreen$GenericLimitsItem;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/v0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class GenericLimitsItem {
            public static final v0 Companion = new v0();
            public final String a;
            public final String b;

            public /* synthetic */ GenericLimitsItem(int i, String str, String str2) {
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

            public GenericLimitsItem(int i) {
                this.a = "";
                this.b = "";
            }

            public GenericLimitsItem() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$SettingsScreen$ActionButton;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/r0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ActionButton {
            public static final r0 Companion = new r0();
            public final String a;
            public final String b;
            public final String c;

            public /* synthetic */ ActionButton(int i, String str, String str2, String str3) {
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

            public ActionButton(int i) {
                this.a = "";
                this.b = "";
                this.c = "";
            }

            public ActionButton() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$SettingsScreen$DeleteAccountAlert;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/t0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class DeleteAccountAlert {
            public static final t0 Companion = new t0();
            public final String a;
            public final String b;
            public final String c;
            public final String d;

            public /* synthetic */ DeleteAccountAlert(int i, String str, String str2, String str3, String str4) {
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

            public DeleteAccountAlert(int i) {
                this.a = "";
                this.b = "";
                this.c = "";
                this.d = "";
            }

            public DeleteAccountAlert() {
                this(0);
            }
        }

        public SettingsScreen() {
            this(0);
        }

        public SettingsScreen(int i) {
            AccountNameInputField accountNameInputField = new AccountNameInputField(0);
            GenericLimitsItem genericLimitsItem = new GenericLimitsItem(0);
            ReportItem reportItem = new ReportItem(0);
            ActionButton actionButton = new ActionButton(0);
            DeleteAccountAlert deleteAccountAlert = new DeleteAccountAlert(0);
            DeleteAccountProcessView deleteAccountProcessView = new DeleteAccountProcessView(0);
            this.a = "";
            this.b = accountNameInputField;
            this.c = genericLimitsItem;
            this.d = reportItem;
            this.e = actionButton;
            this.f = deleteAccountAlert;
            this.g = deleteAccountProcessView;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$ViewBusinessAccount;", "", "Companion", "SettingsItem", "DoneButton", "$serializer", "com/yandex/go/payments/shared/business/x0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ViewBusinessAccount {
        public static final x0 Companion = new x0();
        public final String a;
        public final String b;
        public final String c;
        public final ActionButton d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final CreateEnterpriseAccount k;
        public final BusinessAccountLinkItem l;
        public final SettingsItem m;
        public final DoneButton n;

        public /* synthetic */ ViewBusinessAccount(int i, String str, String str2, String str3, ActionButton actionButton, String str4, String str5, String str6, String str7, String str8, String str9, CreateEnterpriseAccount createEnterpriseAccount, BusinessAccountLinkItem businessAccountLinkItem, SettingsItem settingsItem, DoneButton doneButton) {
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
                this.d = new ActionButton(0);
            } else {
                this.d = actionButton;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str4;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str5;
            }
            if ((i & 64) == 0) {
                this.g = "";
            } else {
                this.g = str6;
            }
            if ((i & 128) == 0) {
                this.h = "";
            } else {
                this.h = str7;
            }
            if ((i & 256) == 0) {
                this.i = "";
            } else {
                this.i = str8;
            }
            if ((i & 512) == 0) {
                this.j = "";
            } else {
                this.j = str9;
            }
            if ((i & 1024) == 0) {
                this.k = new CreateEnterpriseAccount(0);
            } else {
                this.k = createEnterpriseAccount;
            }
            if ((i & 2048) == 0) {
                this.l = new BusinessAccountLinkItem(0);
            } else {
                this.l = businessAccountLinkItem;
            }
            this.m = (i & 4096) == 0 ? new SettingsItem(0) : settingsItem;
            this.n = (i & 8192) == 0 ? new DoneButton(0) : doneButton;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$ViewBusinessAccount$DoneButton;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/y0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class DoneButton {
            public static final y0 Companion = new y0();
            public final String a;

            public /* synthetic */ DoneButton(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
            }

            public DoneButton(int i) {
                this.a = "";
            }

            public DoneButton() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$ViewBusinessAccount$SettingsItem;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/z0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class SettingsItem {
            public static final z0 Companion = new z0();
            public final String a;

            public /* synthetic */ SettingsItem(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
            }

            public SettingsItem(int i) {
                this.a = "";
            }

            public SettingsItem() {
                this(0);
            }
        }

        public ViewBusinessAccount() {
            this(0);
        }

        public ViewBusinessAccount(int i) {
            ActionButton actionButton = new ActionButton(0);
            CreateEnterpriseAccount createEnterpriseAccount = new CreateEnterpriseAccount(0);
            BusinessAccountLinkItem businessAccountLinkItem = new BusinessAccountLinkItem(0);
            SettingsItem settingsItem = new SettingsItem(0);
            DoneButton doneButton = new DoneButton(0);
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = actionButton;
            this.e = "";
            this.f = "";
            this.g = "";
            this.h = "";
            this.i = "";
            this.j = "";
            this.k = createEnterpriseAccount;
            this.l = businessAccountLinkItem;
            this.m = settingsItem;
            this.n = doneButton;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$SelectCurrencyScreen;", "", "Companion", "ActionButton", "$serializer", "com/yandex/go/payments/shared/business/p0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SelectCurrencyScreen {
        public static final p0 Companion = new p0();
        public final String a;
        public final String b;
        public final ActionButton c;

        public /* synthetic */ SelectCurrencyScreen(int i, String str, String str2, ActionButton actionButton) {
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
                this.c = new ActionButton(0);
            } else {
                this.c = actionButton;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$SelectCurrencyScreen$ActionButton;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/o0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ActionButton {
            public static final o0 Companion = new o0();
            public final String a;
            public final String b;

            public /* synthetic */ ActionButton(int i, String str, String str2) {
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

            public ActionButton(int i) {
                this.a = "";
                this.b = "";
            }

            public ActionButton() {
                this(0);
            }
        }

        public SelectCurrencyScreen() {
            this(0);
        }

        public SelectCurrencyScreen(int i) {
            ActionButton actionButton = new ActionButton(0);
            this.a = "";
            this.b = "";
            this.c = actionButton;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$ActionButton;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ActionButton {
        public static final d Companion = new d();
        public final String a;
        public final String b;

        public /* synthetic */ ActionButton(int i, String str, String str2) {
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

        public ActionButton(int i) {
            this.a = "";
            this.b = "";
        }

        public ActionButton() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$BusinessAccountLinkItem;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class BusinessAccountLinkItem {
        public static final l Companion = new l();
        public final String a;
        public final String b;

        public /* synthetic */ BusinessAccountLinkItem(int i, String str, String str2) {
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

        public BusinessAccountLinkItem(int i) {
            this.a = "";
            this.b = "";
        }

        public BusinessAccountLinkItem() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$EmailInputField;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class EmailInputField {
        public static final p Companion = new p();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$CreateEnterpriseAccount;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CreateEnterpriseAccount {
        public static final o Companion = new o();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ CreateEnterpriseAccount(int i, String str, String str2, String str3) {
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

        public CreateEnterpriseAccount(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public CreateEnterpriseAccount() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$ReportSettingsScreenActionButton;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/n0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ReportSettingsScreenActionButton {
        public static final n0 Companion = new n0();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ ReportSettingsScreenActionButton(int i, String str, String str2, String str3) {
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

        public ReportSettingsScreenActionButton(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public ReportSettingsScreenActionButton() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$CreateBusinessAccountFullscreen;", "", "Companion", "com/yandex/go/payments/shared/business/n", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CreateBusinessAccountFullscreen {
        public static final n Companion = new n();
        public static final CreateBusinessAccountFullscreen d = new CreateBusinessAccountFullscreen(0);
        public final String a;
        public final long b;
        public final FallbackFullscreen c;

        public /* synthetic */ CreateBusinessAccountFullscreen(int i, String str, long j, FallbackFullscreen fallbackFullscreen) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = 3L;
            } else {
                this.b = j;
            }
            if ((i & 4) == 0) {
                this.c = new FallbackFullscreen(0);
            } else {
                this.c = fallbackFullscreen;
            }
        }

        public CreateBusinessAccountFullscreen() {
            this(0);
        }

        public CreateBusinessAccountFullscreen(int i) {
            FallbackFullscreen fallbackFullscreen = new FallbackFullscreen(0);
            this.a = "";
            this.b = 3L;
            this.c = fallbackFullscreen;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$FallbackFullscreen;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FallbackFullscreen {
        public static final q Companion = new q();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ FallbackFullscreen(int i, String str, String str2, String str3, String str4) {
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

        public FallbackFullscreen(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public FallbackFullscreen() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$YandexProtectionScreen;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/a1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class YandexProtectionScreen {
        public static final a1 Companion = new a1();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ YandexProtectionScreen(int i, String str, String str2, String str3, String str4) {
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

        public YandexProtectionScreen(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public YandexProtectionScreen() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$ReportSettingsScreen;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ReportSettingsScreen {
        public static final m0 Companion = new m0();
        public final String a;
        public final ReportSettingsScreenActionButton b;
        public final String c;
        public final String d;
        public final EmailInputField e;

        public /* synthetic */ ReportSettingsScreen(int i, String str, ReportSettingsScreenActionButton reportSettingsScreenActionButton, String str2, String str3, EmailInputField emailInputField) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = new ReportSettingsScreenActionButton(0);
            } else {
                this.b = reportSettingsScreenActionButton;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = new EmailInputField(0);
            } else {
                this.e = emailInputField;
            }
        }

        public ReportSettingsScreen() {
            this(0);
        }

        public ReportSettingsScreen(int i) {
            ReportSettingsScreenActionButton reportSettingsScreenActionButton = new ReportSettingsScreenActionButton(0);
            EmailInputField emailInputField = new EmailInputField(0);
            this.a = "";
            this.b = reportSettingsScreenActionButton;
            this.c = "";
            this.d = "";
            this.e = emailInputField;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$Menu;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/l0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Menu {
        public static final l0 Companion = new l0();
        public static final i3y[] h = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(5)), null, null, null};
        public final String a;
        public final String b;
        public final boolean c;
        public final List d;
        public final String e;
        public final String f;
        public final boolean g;

        public /* synthetic */ Menu(int i, String str, String str2, String str3, String str4, List list, boolean z, boolean z2) {
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
                this.c = false;
            } else {
                this.c = z;
            }
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str3;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str4;
            }
            if ((i & 64) == 0) {
                this.g = false;
            } else {
                this.g = z2;
            }
        }

        public Menu(int i) {
            this.a = "";
            this.b = "";
            this.c = false;
            this.d = EmptyList.a;
            this.e = "";
            this.f = "";
            this.g = false;
        }

        public Menu() {
            this(0);
        }
    }

    public BusinessAccountFlowExperiment() {
        this(0);
    }

    public BusinessAccountFlowExperiment(int i) {
        Map f = kotlin.collections.b.f();
        CreateBusinessAccountFullscreen.Companion.getClass();
        CreateBusinessAccountFullscreen createBusinessAccountFullscreen = CreateBusinessAccountFullscreen.d;
        Menu menu = new Menu(0);
        ViewBusinessAccount viewBusinessAccount = new ViewBusinessAccount(0);
        ReportSettingsScreen reportSettingsScreen = new ReportSettingsScreen(0);
        YandexProtectionScreen yandexProtectionScreen = new YandexProtectionScreen(0);
        AddMemberScreen addMemberScreen = new AddMemberScreen(0);
        SettingsScreen settingsScreen = new SettingsScreen(0);
        MemberListScreen memberListScreen = new MemberListScreen(0);
        LimitSettingsScreen limitSettingsScreen = new LimitSettingsScreen(0);
        MemberDetailsScreen memberDetailsScreen = new MemberDetailsScreen(0);
        SelectCurrencyScreen selectCurrencyScreen = new SelectCurrencyScreen(0);
        this.b = f;
        this.c = createBusinessAccountFullscreen;
        this.d = menu;
        this.e = viewBusinessAccount;
        this.f = null;
        this.g = reportSettingsScreen;
        this.h = yandexProtectionScreen;
        this.i = addMemberScreen;
        this.j = settingsScreen;
        this.k = memberListScreen;
        this.l = limitSettingsScreen;
        this.m = memberDetailsScreen;
        this.n = selectCurrencyScreen;
    }
}
