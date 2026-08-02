package com.yandex.go.trusted_contacts.share_settings;

import android.content.Context;
import com.yandex.go.trusted_contacts.data.entities.network.ModalContentDto;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.domain.entities.DialogButton;
import com.yandex.go.trusted_contacts.domain.entities.ShareSettingsMode;
import defpackage.a201;
import defpackage.a22;
import defpackage.avj0;
import defpackage.ej1;
import defpackage.elr0;
import defpackage.flr0;
import defpackage.gdj;
import defpackage.glr0;
import defpackage.ilr0;
import defpackage.jl40;
import defpackage.jlr0;
import defpackage.kcz0;
import defpackage.klr0;
import defpackage.kyh0;
import defpackage.llr0;
import defpackage.mlr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.olr0;
import defpackage.pgk0;
import defpackage.plr0;
import defpackage.q5z;
import defpackage.r4h0;
import defpackage.skr0;
import defpackage.tbg;
import defpackage.tls;
import defpackage.tse;
import defpackage.vkr0;
import defpackage.w030;
import defpackage.w511;
import defpackage.wg11;
import defpackage.wlr0;
import defpackage.wls;
import defpackage.xlr0;
import defpackage.xvf0;
import defpackage.yce;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.share_settings.ShareSettingsPresenter$saveContact$1", f = "ShareSettingsPresenter.kt", l = {176}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ShareSettingsPresenter$saveContact$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.trusted_contacts.share_settings.ShareSettingsPresenter$saveContact$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            DialogButton dialogButton = (DialogButton) obj;
            a aVar = (a) this.receiver;
            a201 a201Var = aVar.C;
            int i = dialogButton == null ? -1 : plr0.b[dialogButton.ordinal()];
            if (i == 1) {
                o7r0 o7r0Var = (o7r0) a201Var.c;
                o7r0Var.getClass();
                o7r0Var.a.a("TrustedContacts.ShareApp.CloseButtonTapped", new HashMap(), 1, new HashMap());
            } else if (i == 2) {
                o7r0 o7r0Var2 = (o7r0) a201Var.c;
                o7r0Var2.getClass();
                o7r0Var2.a.a("TrustedContacts.ShareApp.ShareLinkButtonTapped", new HashMap(), 1, new HashMap());
                q5z.b0(aVar.x, aVar.I);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareSettingsPresenter$saveContact$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShareSettingsPresenter$saveContact$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShareSettingsPresenter$saveContact$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xlr0 xlr0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = false;
        if (i == 0) {
            b.b(obj);
            String str = ((skr0) this.this$0.J.getValue()).a;
            if (str == null) {
                str = this.this$0.G.d;
            }
            List list = ((skr0) this.this$0.J.getValue()).b;
            if (list == null) {
                list = this.this$0.G.e;
            }
            a aVar = this.this$0;
            xlr0 xlr0Var2 = aVar.H;
            ilr0 ilr0Var = (ilr0) aVar.Dg();
            wlr0 wlr0Var = wlr0.a;
            ilr0Var.render((xlr0) wlr0Var);
            aVar.H = wlr0Var;
            a aVar2 = this.this$0;
            vkr0 vkr0Var = aVar2.y;
            TrustedContactDto a = TrustedContactDto.a(aVar2.G, null, str, list, 7);
            boolean z2 = this.this$0.B == ShareSettingsMode.ADD;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = xlr0Var2;
            this.label = 1;
            obj = vkr0Var.a.k(a, z2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            xlr0Var = xlr0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xlr0Var = (xlr0) this.L$2;
            b.b(obj);
        }
        mlr0 mlr0Var = (mlr0) obj;
        if (mlr0Var instanceof klr0) {
            a aVar3 = this.this$0;
            ((ilr0) aVar3.Dg()).render(xlr0Var);
            aVar3.H = xlr0Var;
            a aVar4 = this.this$0;
            pgk0 pgk0Var = aVar4.D;
            wg11 wg11Var = ((klr0) mlr0Var).a;
            olr0 olr0Var = new olr0(aVar4, 2);
            glr0 glr0Var = (glr0) pgk0Var.b;
            kcz0 kcz0Var = glr0Var.F.a;
            glr0Var.z(new ej1((Context) ((tbg) kcz0Var.a).get(), (w030) ((xvf0) kcz0Var.b).get(), wg11Var, 21), new elr0(0, olr0Var));
        } else {
            int i2 = 26;
            if (mlr0Var instanceof llr0) {
                o7r0 o7r0Var = (o7r0) this.this$0.C.c;
                o7r0Var.getClass();
                o7r0Var.a.a("TrustedContacts.ShareApp.Shown", new HashMap(), 1, new HashMap());
                a aVar5 = this.this$0;
                ModalContentDto modalContentDto = ((llr0) mlr0Var).a;
                aVar5.I = modalContentDto.c;
                a22 a22Var = aVar5.y.a.e;
                a22Var.getClass();
                String str2 = modalContentDto.a;
                String str3 = modalContentDto.b;
                Integer valueOf = Integer.valueOf(r4h0.ic_modal_content_icon);
                avj0 avj0Var = (avj0) a22Var.a;
                gdj gdjVar = new gdj(str2, valueOf, str3, avj0Var.h(kyh0.common_close), avj0Var.h(kyh0.trusted_contacts_share_link));
                pgk0 pgk0Var2 = this.this$0.D;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(1, this.this$0, a.class, "onDialogButtonClick", "onDialogButtonClick(Lcom/yandex/go/trusted_contacts/domain/entities/DialogButton;)V", 0);
                glr0 glr0Var2 = (glr0) pgk0Var2.b;
                glr0Var2.z(glr0Var2.G.a(gdjVar), new flr0(0, anonymousClass2));
                ((glr0) this.this$0.D.b).r(new yce(z, i2));
            } else {
                if (!jl40.l(mlr0Var, jlr0.a)) {
                    w511.b();
                    return null;
                }
                ((glr0) this.this$0.D.b).r(new yce(z, i2));
            }
        }
        return zy11.a;
    }
}
