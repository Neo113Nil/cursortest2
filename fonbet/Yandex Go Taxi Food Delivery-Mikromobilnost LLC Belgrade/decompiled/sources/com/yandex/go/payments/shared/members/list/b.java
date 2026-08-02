package com.yandex.go.payments.shared.members.list;

import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$CloseReason;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.Member;
import com.yandex.go.payments.shared.data.model.MemberDetails;
import com.yandex.go.payments.shared.data.model.SetCommonLimitRequest;
import com.yandex.go.payments.shared.members.list.d;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.ad5;
import defpackage.ai10;
import defpackage.avj0;
import defpackage.bi10;
import defpackage.bvu0;
import defpackage.ci10;
import defpackage.dzg0;
import defpackage.gwk0;
import defpackage.hst;
import defpackage.hwo0;
import defpackage.ief;
import defpackage.il;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jz21;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.mys;
import defpackage.p500;
import defpackage.ph10;
import defpackage.qf0;
import defpackage.qfy;
import defpackage.qh10;
import defpackage.scc;
import defpackage.th10;
import defpackage.tje;
import defpackage.vnr0;
import defpackage.vor0;
import defpackage.w511;
import defpackage.xdf;
import defpackage.y2h0;
import defpackage.ynr0;
import defpackage.yue;
import defpackage.zh10;
import defpackage.zor0;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ru.yandex.taxi.exception.ValidationException;
import ru.yandex.taxi.gopayments.dto.MemberRole;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes13.dex */
public final class b extends ad5 {
    public final zor0 A;
    public final vnr0 B;
    public final xdf C;
    public final mys D;
    public final mys E;
    public final mys F;
    public final hwo0 G;
    public final qh10 H;
    public final qfy I;
    public boolean J;
    public boolean K;
    public String L;
    public final ai10 x;
    public final v y;
    public final zuj0 z;

    public b(ai10 ai10Var, v vVar, zuj0 zuj0Var, zor0 zor0Var, vnr0 vnr0Var, xdf xdfVar) {
        super(zh10.class);
        this.x = ai10Var;
        this.y = vVar;
        this.z = zuj0Var;
        this.A = zor0Var;
        this.B = vnr0Var;
        this.C = xdfVar;
        this.D = new mys(SharedPaymentAnalytics$CloseReason.ACTION_BUTTON.getAnalyticsName());
        this.E = new mys(SharedPaymentAnalytics$CloseReason.PARTICIPANT_SELECTED.getAnalyticsName());
        this.F = new mys(SharedPaymentAnalytics$CloseReason.ADD_PARTICIPANT.getAnalyticsName());
        this.G = ai10Var.b;
        this.H = ai10Var.c;
        this.I = ai10Var.d;
        this.L = "";
    }

    public final SharedPaymentsOpenReason Kg() {
        return this.x.a == MemberListMode.DETAILS ? SharedPaymentsOpenReason.GROUP_ACCOUNT_SCREEN : SharedPaymentsOpenReason.OLD_ONBOARDING_SCREEN;
    }

    public final SharedPaymentsOpenReason Lg() {
        return this.x.f ? SharedPaymentsOpenReason.SETTINGS : SharedPaymentsOpenReason.PARTICIPANT_CARD;
    }

    public final Account Mg() {
        return this.x.e.b();
    }

    public final boolean Ng(List list) {
        if (list.isEmpty()) {
            return false;
        }
        if (list.size() <= 1 && ((Member) kotlin.collections.a.P(list)).e) {
            return this.x.a.getShowMySelf();
        }
        return true;
    }

    public final void Og() {
        ai10 ai10Var = this.x;
        MemberListMode memberListMode = ai10Var.a;
        MemberListMode memberListMode2 = MemberListMode.LIMITS;
        vnr0 vnr0Var = this.B;
        if (memberListMode == memberListMode2) {
            vnr0Var.t(Lg(), SharedPaymentAnalytics$Button.DONE, Mg().d.size());
        } else {
            vnr0Var.p(Mg().a, Kg(), SharedPaymentAnalytics$Button.ADD_PARTICIPANT, this.J, ai10Var.a, Mg().d.size());
            this.B.o(Mg().a, Kg(), SharedPaymentAnalytics$CloseReason.ADD_PARTICIPANT, this.J, ai10Var.a, Mg().d.size());
            ((zh10) Dg()).S4(this.F);
        }
        SharedPaymentsOpenReason sharedPaymentsOpenReason = ai10Var.a == memberListMode2 ? SharedPaymentsOpenReason.LIMITS_CARD : Mg().d.size() < 2 ? SharedPaymentsOpenReason.GROUP_ACCOUNT_SCREEN : SharedPaymentsOpenReason.PARTICIPANTS_LIST_CARD;
        hwo0 hwo0Var = this.G;
        y yVar = (y) hwo0Var.c;
        il ilVar = (il) hwo0Var.w;
        ynr0 ynr0Var = (ynr0) hwo0Var.x;
        yVar.getClass();
        yVar.c.a().c(new qf0(ilVar, new vor0(yVar, ynr0Var), sharedPaymentsOpenReason, ynr0Var.d));
    }

    public final void Pg() {
        ((zh10) Dg()).closeKeyboard();
        hwo0 hwo0Var = this.x.b;
        bi10 bi10Var = new bi10(this, 0);
        y yVar = (y) hwo0Var.c;
        qfy qfyVar = ((ynr0) hwo0Var.x).h;
        yVar.getClass();
        new AlertDialog(yVar.a).setTitle(qfyVar.k).setMessage(qfyVar.l).setPositiveButton(qfyVar.m, bi10Var).setNegativeButton(qfyVar.n).setDismissListener(new yue(yVar, 5)).show();
    }

    public final void Qg(SetCommonLimitRequest setCommonLimitRequest) {
        this.K = true;
        Tg();
        tje.N(Jg(), null, null, new MembersListPresenter$setCommonLimitRequest$1(this, setCommonLimitRequest, null), 3);
    }

    public final boolean Rg() {
        return this.x.a.getShowLimits() && Mg().m != null && Ng(Mg().d);
    }

    public final void Sg() {
        for (jz21 jz21Var : new ValidationException(Collections.singletonList(new jz21("limit_amount", this.I.s))).getErrors()) {
            String str = jz21Var.a;
            String str2 = jz21Var.b;
            if (str.equals("limit_amount")) {
                this.L = str2;
            } else {
                jst.e.w(new IllegalStateException("Unexpected field: ".concat(jz21Var.a)));
                ((y) this.G.c).n(str2, true);
            }
        }
        Tg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f1  */
    /* JADX WARN: Type inference failed for: r7v28, types: [com.yandex.go.payments.shared.members.list.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Tg() {
        boolean z;
        boolean z2;
        String str;
        String h;
        bi10 bi10Var;
        String analyticsName;
        bi10 bi10Var2;
        int i;
        String str2;
        String str3;
        int i2;
        d.a aVar;
        String str4;
        String str5;
        String str6;
        int i3;
        int i4;
        p500 p500Var;
        Member.Limits limits;
        p500 p500Var2;
        String str7;
        String str8;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button = this.J ? SharedPaymentAnalytics$Button.DONE : SharedPaymentAnalytics$Button.EDIT;
        ai10 ai10Var = this.x;
        MemberListMode memberListMode = ai10Var.a;
        MemberListMode memberListMode2 = ai10Var.a;
        boolean showBackButton = memberListMode.getShowBackButton();
        if (memberListMode2.getCanDeleteUsers()) {
            for (Member member : Mg().d) {
                if (!member.e && member.b != MemberRole.OWNER) {
                    z = showBackButton;
                    z2 = true;
                    break;
                }
            }
        }
        z = showBackButton;
        z2 = false;
        memberListMode2.getClass();
        int i5 = ph10.a[memberListMode2.ordinal()];
        qh10 qh10Var = this.H;
        qfy qfyVar = this.I;
        if (i5 == 1) {
            str = qh10Var.a;
        } else if (i5 == 2) {
            str = qh10Var.a;
        } else if (i5 == 3) {
            str = qfyVar.a;
        } else {
            if (i5 != 4) {
                w511.b();
                return;
            }
            str = qh10Var.a;
        }
        String str9 = this.J ? qh10Var.e : qh10Var.d;
        String analyticsName2 = sharedPaymentAnalytics$Button.getAnalyticsName();
        boolean Rg = Rg();
        String str10 = ai10Var.g;
        if (str10 == null) {
            str10 = "";
        }
        ief iefVar = Mg().m;
        boolean showLimits = memberListMode2.getShowLimits();
        xdf xdfVar = this.C;
        String format = (!showLimits || iefVar == null) ? "" : String.format(qfyVar.b, Arrays.copyOf(new Object[]{xdfVar.d(gwk0.h(iefVar), false, "$SIGN$")}, 1));
        List list = Mg().d;
        boolean z3 = memberListMode2 == MemberListMode.WIZARD_ADD_PARTICIPANTS_STEP;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        for (Object obj : list) {
            int i7 = i6 + 1;
            String str11 = null;
            if (i6 < 0) {
                scc.m();
                throw null;
            }
            boolean z4 = z2;
            final Member member2 = (Member) obj;
            boolean z5 = z;
            boolean z6 = i6 == scc.f(list);
            boolean z7 = member2.e;
            boolean z8 = z6;
            boolean z9 = member2.e;
            MemberRole memberRole = member2.b;
            if (!z7) {
                MemberDetails memberDetails = member2.c;
                str4 = format;
                String str12 = memberDetails.a;
                str5 = memberDetails.b;
                str6 = str12;
            } else if (memberListMode2.getShowMySelf()) {
                str6 = qh10Var.b;
                str4 = format;
                str5 = null;
            } else {
                str4 = format;
                z = z5;
                i6 = i7;
                z2 = z4;
                format = str4;
            }
            String str13 = member2.a;
            if (memberListMode2.getShowLimits() && memberRole != MemberRole.OWNER) {
                i4 = dzg0.chevron_next;
            } else if (!this.J || z9 || memberRole == MemberRole.OWNER) {
                i3 = 0;
                a aVar2 = (this.J || z9 || memberRole == MemberRole.OWNER) ? null : new Runnable() { // from class: com.yandex.go.payments.shared.members.list.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar = b.this;
                        bVar.B.p(bVar.Mg().a, bVar.Kg(), SharedPaymentAnalytics$Button.PARTICIPANT_DELETED, bVar.J, bVar.x.a, bVar.Mg().d.size());
                        ((zh10) bVar.Dg()).B2(d.o);
                        tje.N(bVar.Jg(), null, null, new MembersListPresenter$onDeleteClick$1(bVar, member2, null), 3);
                    }
                };
                p500Var = new p500(17, this, member2);
                boolean z10 = z8 || z3;
                if (memberListMode2.getShowLimits() && memberRole != MemberRole.OWNER) {
                    limits = member2.f;
                    if (limits == null && limits.b) {
                        ief iefVar2 = Mg().m;
                        if (iefVar2 == null || member2.a() == null) {
                            p500Var2 = p500Var;
                            hst hstVar = jst.e;
                            hstVar.n(String.format("currencyRules = %s, member.limitAmount = %s", Arrays.copyOf(new Object[]{iefVar2, member2.a()}, 2)));
                            hstVar.w(new IllegalStateException("Cannot show limits"));
                        } else {
                            p500Var2 = p500Var;
                            str7 = xdfVar.b(gwk0.h(iefVar2), member2.a() != null ? Double.valueOf(r6.longValue()) : null);
                        }
                    } else {
                        p500Var2 = p500Var;
                        str7 = qfyVar.r;
                    }
                    str8 = str7;
                    if (!z9 && memberRole != MemberRole.OWNER) {
                        str11 = memberListMode2 != MemberListMode.LIMITS ? SharedPaymentAnalytics$Button.USER_SELECTED.getAnalyticsName() : this.J ? SharedPaymentAnalytics$Button.PARTICIPANT_DELETED.getAnalyticsName() : SharedPaymentAnalytics$Button.PARTICIPANT_SELECTED.getAnalyticsName();
                    }
                    arrayList.add(new th10(str13, str6, str5, i3, aVar2, p500Var2, z10, str8, str11));
                    z = z5;
                    i6 = i7;
                    z2 = z4;
                    format = str4;
                } else {
                    p500Var2 = p500Var;
                }
                str8 = "";
                if (!z9) {
                    if (memberListMode2 != MemberListMode.LIMITS) {
                    }
                }
                arrayList.add(new th10(str13, str6, str5, i3, aVar2, p500Var2, z10, str8, str11));
                z = z5;
                i6 = i7;
                z2 = z4;
                format = str4;
            } else {
                i4 = dzg0.ic_delete_item;
            }
            i3 = i4;
            if (this.J) {
            }
            p500Var = new p500(17, this, member2);
            if (z8) {
            }
            if (memberListMode2.getShowLimits()) {
                limits = member2.f;
                if (limits == null) {
                }
                p500Var2 = p500Var;
                str7 = qfyVar.r;
                str8 = str7;
                if (!z9) {
                }
                arrayList.add(new th10(str13, str6, str5, i3, aVar2, p500Var2, z10, str8, str11));
                z = z5;
                i6 = i7;
                z2 = z4;
                format = str4;
            }
            p500Var2 = p500Var;
            str8 = "";
            if (!z9) {
            }
            arrayList.add(new th10(str13, str6, str5, i3, aVar2, p500Var2, z10, str8, str11));
            z = z5;
            i6 = i7;
            z2 = z4;
            format = str4;
        }
        boolean z11 = z2;
        boolean z12 = z;
        String str14 = format;
        if (z3) {
            arrayList.add(new th10("", qfyVar.c, null, y2h0.plus, null, new bi10(this, 1), false, "", SharedPaymentAnalytics$Button.ADD_PARTICIPANT.getAnalyticsName()));
        }
        String str15 = this.L;
        boolean z13 = !Ng(Mg().d);
        int i8 = mqg0.component_accent_color;
        avj0 avj0Var = (avj0) this.z;
        int a = avj0Var.a(i8);
        int a2 = avj0Var.a(mqg0.accent_background_text_color);
        int i9 = ci10.a[memberListMode2.ordinal()];
        if (i9 == 1) {
            h = avj0Var.h(kyh0.common_done);
            bi10Var = new bi10(this, 2);
            analyticsName = SharedPaymentAnalytics$Button.ACTION_BUTTON.getAnalyticsName();
        } else if (i9 == 2 || i9 == 3) {
            h = qh10Var.c;
            bi10Var = new bi10(this, 3);
            analyticsName = SharedPaymentAnalytics$Button.ADD_PARTICIPANT.getAnalyticsName();
        } else {
            if (i9 != 4) {
                w511.b();
                return;
            }
            if (Rg() && Ng(Mg().d)) {
                int a3 = avj0Var.a(mqg0.component_accent_color);
                int a4 = avj0Var.a(mqg0.accent_background_text_color);
                int a5 = avj0Var.a(mqg0.component_gray_175);
                int a6 = avj0Var.a(mqg0.component_black);
                int a7 = avj0Var.a(mqg0.component_gray_300);
                if (this.K) {
                    aVar = new d.a(a3, a4, 56, qfyVar.d);
                } else {
                    String str16 = ai10Var.g;
                    if (str16 == null) {
                        str16 = "";
                    }
                    Long m = bvu0.m(10, str16);
                    if (str16.length() <= 0) {
                        i2 = 56;
                    } else if (jl40.l(m, Mg().o)) {
                        i2 = 56;
                    } else {
                        aVar = new d.a(a3, a4, 56, qfyVar.d);
                    }
                    aVar = (str16.length() == 0 && Mg().n) ? new d.a(a5, a6, i2, qfyVar.f) : (str16.length() != 0 || Mg().n) ? new d.a(a5, a6, i2, qfyVar.f) : new d.a(a5, a7, i2, qfyVar.d);
                }
                bi10 bi10Var3 = new bi10(this, 4);
                String analyticsName3 = SharedPaymentAnalytics$Button.DONE.getAnalyticsName();
                String str17 = aVar.c;
                int i10 = aVar.a;
                a2 = aVar.b;
                bi10Var2 = bi10Var3;
                str2 = analyticsName3;
                str3 = str17;
                i = i10;
                ((zh10) Dg()).B2(new d(z12, z11, str, str9, analyticsName2, Rg, str10, str14, arrayList, str15, z13, new d.a(i, a2, str3, this.K, bi10Var2, str2), qfyVar.o, qfyVar.p));
            }
            h = qfyVar.q;
            bi10Var = new bi10(this, 5);
            analyticsName = SharedPaymentAnalytics$Button.DONE.getAnalyticsName();
        }
        bi10Var2 = bi10Var;
        i = a;
        str2 = analyticsName;
        str3 = h;
        ((zh10) Dg()).B2(new d(z12, z11, str, str9, analyticsName2, Rg, str10, str14, arrayList, str15, z13, new d.a(i, a2, str3, this.K, bi10Var2, str2), qfyVar.o, qfyVar.p));
    }

    public final void onBackClick() {
        if (this.J) {
            this.J = false;
            Tg();
            return;
        }
        ai10 ai10Var = this.x;
        MemberListMode memberListMode = ai10Var.a;
        MemberListMode memberListMode2 = MemberListMode.LIMITS;
        vnr0 vnr0Var = this.B;
        if (memberListMode == memberListMode2) {
            vnr0Var.t(Lg(), SharedPaymentAnalytics$Button.BACK, Mg().d.size());
        } else {
            vnr0Var.p(Mg().a, Kg(), SharedPaymentAnalytics$Button.BACK, this.J, ai10Var.a, Mg().d.size());
            this.B.o(Mg().a, Kg(), SharedPaymentAnalytics$CloseReason.BACK, this.J, ai10Var.a, Mg().d.size());
        }
        ai10Var.b.b();
    }
}
