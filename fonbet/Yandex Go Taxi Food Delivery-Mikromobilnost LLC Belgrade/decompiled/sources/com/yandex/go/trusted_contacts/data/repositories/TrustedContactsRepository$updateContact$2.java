package com.yandex.go.trusted_contacts.data.repositories;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.go.trusted_contacts.data.api.TrustedContactsApi;
import com.yandex.go.trusted_contacts.data.entities.network.ModalContentDto;
import com.yandex.go.trusted_contacts.data.entities.network.NewTrustedContactDto;
import com.yandex.go.trusted_contacts.data.entities.network.NewTrustedContactsPutRequest;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactsPutRequest;
import com.yandex.go.trusted_contacts.data.entities.network.UpdatedTrustedContactsResponse;
import defpackage.cmt;
import defpackage.hst;
import defpackage.jlr0;
import defpackage.jst;
import defpackage.klr0;
import defpackage.llr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.og11;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lmlr0;", "<anonymous>", "(Ltse;)Lmlr0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.data.repositories.TrustedContactsRepository$updateContact$2", f = "TrustedContactsRepository.kt", l = {178, SubsamplingScaleImageView.ORIENTATION_180, 183}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrustedContactsRepository$updateContact$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isNewContact;
    final /* synthetic */ TrustedContactDto $newContact;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactsRepository$updateContact$2(boolean z, a aVar, TrustedContactDto trustedContactDto, Continuation continuation) {
        super(2, continuation);
        this.$isNewContact = z;
        this.this$0 = aVar;
        this.$newContact = trustedContactDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrustedContactsRepository$updateContact$2(this.$isNewContact, this.this$0, this.$newContact, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrustedContactsRepository$updateContact$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c9 A[Catch: all -> 0x001d, CancellationException -> 0x00d2, TryCatch #0 {CancellationException -> 0x00d2, blocks: (B:9:0x0018, B:10:0x00c5, B:12:0x00c9, B:15:0x00cf, B:27:0x0030, B:28:0x00ad, B:29:0x00af, B:35:0x0043, B:36:0x0083, B:51:0x0052, B:52:0x005a, B:54:0x005e, B:55:0x006e, B:40:0x008e, B:41:0x0096), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf A[Catch: all -> 0x001d, CancellationException -> 0x00d2, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00d2, blocks: (B:9:0x0018, B:10:0x00c5, B:12:0x00c9, B:15:0x00cf, B:27:0x0030, B:28:0x00ad, B:29:0x00af, B:35:0x0043, B:36:0x0083, B:51:0x0052, B:52:0x005a, B:54:0x005e, B:55:0x006e, B:40:0x008e, B:41:0x0096), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        a aVar;
        Throwable th2;
        a aVar2;
        String message;
        Throwable th3;
        a aVar3;
        a aVar4;
        UpdatedTrustedContactsResponse updatedTrustedContactsResponse;
        UpdatedTrustedContactsResponse updatedTrustedContactsResponse2;
        a aVar5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    b.b(obj);
                    boolean z = this.$isNewContact;
                    a aVar6 = this.this$0;
                    TrustedContactDto trustedContactDto = this.$newContact;
                    if (z) {
                        try {
                            TrustedContactsApi trustedContactsApi = (TrustedContactsApi) aVar6.h.getValue();
                            try {
                                aVar6.c.getClass();
                                cmt<UpdatedTrustedContactsResponse> d = trustedContactsApi.d(new NewTrustedContactsPutRequest(new NewTrustedContactDto(trustedContactDto.b, trustedContactDto.c, trustedContactDto.d, trustedContactDto.e)));
                                this.L$0 = aVar6;
                                this.L$1 = aVar6;
                                this.label = 1;
                                obj = ru.yandex.taxi.network.api.a.a(d, null, this);
                                if (obj != coroutineSingletons) {
                                    aVar3 = aVar6;
                                    aVar4 = aVar6;
                                    updatedTrustedContactsResponse = (UpdatedTrustedContactsResponse) obj;
                                    r1 = aVar4;
                                }
                            } catch (Throwable th4) {
                                th3 = th4;
                                th = th3;
                                aVar = aVar6;
                                th2 = th;
                                aVar2 = aVar;
                                hst hstVar = jst.e;
                                message = th2.getMessage();
                                if (message == null) {
                                }
                                xby.l(hstVar, "TRUSTED_CONTACTS_ERROR:SHARED_CONTACT_SAVE_ERROR", null, th2, message, 2);
                                return new klr0(aVar2.f.s(th2));
                            }
                        } catch (Throwable th5) {
                            th3 = th5;
                        }
                    } else {
                        try {
                            cmt<UpdatedTrustedContactsResponse> a = ((TrustedContactsApi) aVar6.h.getValue()).a(new TrustedContactsPutRequest(trustedContactDto));
                            this.L$0 = aVar6;
                            this.L$1 = aVar6;
                            this.label = 2;
                            obj = ru.yandex.taxi.network.api.a.a(a, null, this);
                            if (obj != coroutineSingletons) {
                                aVar3 = aVar6;
                                aVar5 = aVar6;
                                updatedTrustedContactsResponse = (UpdatedTrustedContactsResponse) obj;
                                r1 = aVar5;
                            }
                        } catch (Throwable th6) {
                            th3 = th6;
                            th = th3;
                            aVar = aVar6;
                            th2 = th;
                            aVar2 = aVar;
                            hst hstVar2 = jst.e;
                            message = th2.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            xby.l(hstVar2, "TRUSTED_CONTACTS_ERROR:SHARED_CONTACT_SAVE_ERROR", null, th2, message, 2);
                            return new klr0(aVar2.f.s(th2));
                        }
                    }
                    return coroutineSingletons;
                }
                if (r1 == 1) {
                    a aVar7 = (a) this.L$1;
                    aVar3 = (a) this.L$0;
                    b.b(obj);
                    aVar4 = aVar7;
                    updatedTrustedContactsResponse = (UpdatedTrustedContactsResponse) obj;
                    r1 = aVar4;
                } else {
                    if (r1 != 2) {
                        if (r1 != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        updatedTrustedContactsResponse2 = (UpdatedTrustedContactsResponse) this.L$1;
                        aVar2 = (a) this.L$0;
                        try {
                            b.b(obj);
                            ModalContentDto modalContentDto = updatedTrustedContactsResponse2.b;
                            return modalContentDto == null ? new llr0(modalContentDto) : jlr0.a;
                        } catch (Throwable th7) {
                            th2 = th7;
                            hst hstVar22 = jst.e;
                            message = th2.getMessage();
                            if (message == null) {
                            }
                            xby.l(hstVar22, "TRUSTED_CONTACTS_ERROR:SHARED_CONTACT_SAVE_ERROR", null, th2, message, 2);
                            return new klr0(aVar2.f.s(th2));
                        }
                    }
                    a aVar8 = (a) this.L$1;
                    aVar3 = (a) this.L$0;
                    b.b(obj);
                    aVar5 = aVar8;
                    updatedTrustedContactsResponse = (UpdatedTrustedContactsResponse) obj;
                    r1 = aVar5;
                }
                og11 og11Var = aVar3.i;
                TrustedContactsRepository$updateContact$2$1$1 trustedContactsRepository$updateContact$2$1$1 = new TrustedContactsRepository$updateContact$2$1$1(aVar3, updatedTrustedContactsResponse, null);
                this.L$0 = r1;
                this.L$1 = updatedTrustedContactsResponse;
                this.label = 3;
                if (aVar3.h(og11Var, trustedContactsRepository$updateContact$2$1$1, this) != coroutineSingletons) {
                    updatedTrustedContactsResponse2 = updatedTrustedContactsResponse;
                    ModalContentDto modalContentDto2 = updatedTrustedContactsResponse2.b;
                    if (modalContentDto2 == null) {
                    }
                }
                return coroutineSingletons;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th8) {
            th = th8;
            aVar = r1;
        }
    }
}
