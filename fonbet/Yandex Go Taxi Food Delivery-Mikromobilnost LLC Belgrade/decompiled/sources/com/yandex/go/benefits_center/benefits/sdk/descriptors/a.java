package com.yandex.go.benefits_center.benefits.sdk.descriptors;

import com.yandex.go.benefits_center.benefits.sdk.actions.ActivateTaxiPromoCodeAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.ClaimBenefitAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.DeactivateTaxiPromoCodeAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.OpenActivatingScreenAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.ScootersUseAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.ShowNotificationAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.ShowTicketBannerAction;
import com.yandex.go.benefits_center.benefits.sdk.actions.b;
import com.yandex.go.benefits_center.benefits.sdk.actions.d;
import com.yandex.go.benefits_center.benefits.sdk.actions.e;
import com.yandex.go.benefits_center.benefits.sdk.actions.f;
import com.yandex.go.benefits_center.benefits.sdk.actions.g;
import com.yandex.go.benefits_center.benefits.sdk.actions.h;
import com.yandex.go.benefits_center.benefits.sdk.actions.i;
import defpackage.csf0;
import defpackage.csz;
import defpackage.d9;
import defpackage.mu;
import defpackage.nu;
import defpackage.qhq0;
import defpackage.qoi0;
import defpackage.sbc;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class a implements nu {
    public final /* synthetic */ int a;
    public final b b;
    public final mu c;

    public a(b bVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = bVar;
                this.c = new mu("ClaimBenefitAction", qoi0.a(ClaimBenefitAction.class), new ClaimBenefitActionDescriptorFactory$actionDescriptor$1(0, ClaimBenefitAction.Companion, d.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new d9(28, this)), EmptyList.a, false);
                break;
            case 2:
                this.b = bVar;
                this.c = new mu("DeactivateTaxiPromoCodeAction", qoi0.a(DeactivateTaxiPromoCodeAction.class), new DeactivateTaxiPromoCodeActionDescriptorFactory$actionDescriptor$1(0, DeactivateTaxiPromoCodeAction.Companion, e.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new sbc(4, this)), EmptyList.a, false);
                break;
            case 3:
                this.b = bVar;
                this.c = new mu("OpenActivatingScreenAction", qoi0.a(OpenActivatingScreenAction.class), new OpenActivatingScreenActionDescriptorFactory$actionDescriptor$1(0, OpenActivatingScreenAction.Companion, f.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new csz(22, this)), EmptyList.a, false);
                break;
            case 4:
                this.b = bVar;
                this.c = new mu("ScootersUseAction", qoi0.a(ScootersUseAction.class), new ScootersUseActionDescriptorFactory$actionDescriptor$1(0, ScootersUseAction.Companion, g.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new csf0(21, this)), EmptyList.a, false);
                break;
            case 5:
                this.b = bVar;
                this.c = new mu("ShowNotificationAction", qoi0.a(ShowNotificationAction.class), new ShowNotificationActionDescriptorFactory$actionDescriptor$1(0, ShowNotificationAction.Companion, h.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new qhq0(9, this)), EmptyList.a, false);
                break;
            case 6:
                this.b = bVar;
                this.c = new mu("ShowTicketBannerAction", qoi0.a(ShowTicketBannerAction.class), new ShowTicketBannerActionDescriptorFactory$actionDescriptor$1(0, ShowTicketBannerAction.Companion, i.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new qhq0(10, this)), EmptyList.a, false);
                break;
            default:
                this.b = bVar;
                this.c = new mu("ActivateTaxiPromoCodeAction", qoi0.a(ActivateTaxiPromoCodeAction.class), new ActivateTaxiPromoCodeActionDescriptorFactory$actionDescriptor$1(0, ActivateTaxiPromoCodeAction.Companion, com.yandex.go.benefits_center.benefits.sdk.actions.a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new d9(4, this)), EmptyList.a, false);
                break;
        }
    }

    @Override // defpackage.nu
    public final mu create() {
        switch (this.a) {
        }
        return this.c;
    }
}
