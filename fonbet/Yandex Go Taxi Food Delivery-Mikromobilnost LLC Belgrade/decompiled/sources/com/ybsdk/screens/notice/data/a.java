package com.ybsdk.screens.notice.data;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.topup.TopupNoticeContentDeprecatedRequest;
import com.ybsdk.network.dto.topup.TopupNoticeContentDeprecatedResponse;
import com.ybsdk.network.dto.topup.TopupValueDto;
import com.ybsdk.screens.notice.domain.entities.TopupValueEntity;
import defpackage.ccv;
import defpackage.dcv;
import defpackage.f0z0;
import defpackage.g8e;
import defpackage.job1;
import defpackage.ny61;
import defpackage.oyz0;
import defpackage.pbv;
import defpackage.qxy0;
import defpackage.rbv;
import defpackage.rev;
import defpackage.vfv;
import defpackage.vxz0;
import defpackage.w511;
import defpackage.xj1;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final Api a;
    public final com.ybsdk.common.repositiories.agreements.a b;

    public a(Api api, com.ybsdk.common.repositiories.agreements.a aVar) {
        this.a = api;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TopupValueEntity topupValueEntity, String str, ContinuationImpl continuationImpl) {
        TopupNoticeRepository$getTopupNotice$1 topupNoticeRepository$getTopupNotice$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof TopupNoticeRepository$getTopupNotice$1) {
            topupNoticeRepository$getTopupNotice$1 = (TopupNoticeRepository$getTopupNotice$1) continuationImpl;
            int i2 = topupNoticeRepository$getTopupNotice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                topupNoticeRepository$getTopupNotice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = topupNoticeRepository$getTopupNotice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = topupNoticeRepository$getTopupNotice$1.label;
                if (i != 0) {
                    b.b(obj);
                    TopupNoticeRepository$getTopupNotice$2 topupNoticeRepository$getTopupNotice$2 = new TopupNoticeRepository$getTopupNotice$2(this, str, topupValueEntity, null);
                    topupNoticeRepository$getTopupNotice$1.label = 1;
                    c = c.c(topupNoticeRepository$getTopupNotice$2, topupNoticeRepository$getTopupNotice$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                TopupNoticeRepository$getTopupNotice$3$1 topupNoticeRepository$getTopupNotice$3$1 = new TopupNoticeRepository$getTopupNotice$3$1(2, null);
                topupNoticeRepository$getTopupNotice$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, topupNoticeRepository$getTopupNotice$3$1, topupNoticeRepository$getTopupNotice$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        topupNoticeRepository$getTopupNotice$1 = new TopupNoticeRepository$getTopupNotice$1(this, continuationImpl);
        Object obj2 = topupNoticeRepository$getTopupNotice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = topupNoticeRepository$getTopupNotice$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(5:11|12|13|14|(4:16|(1:18)(1:22)|19|20)(1:23))(2:25|26))(1:27))(1:40)|28|(4:30|(1:(1:33)(2:38|35))(1:39)|34|35)|14|(0)(0)))|44|6|7|(0)(0)|28|(0)|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (r10 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0052, code lost:
    
        if (r12 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        r12 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059 A[Catch: all -> 0x00a3, TRY_ENTER, TryCatch #0 {all -> 0x00a3, blocks: (B:11:0x0027, B:12:0x009e, B:30:0x0059, B:33:0x0071, B:34:0x007b, B:35:0x008b, B:38:0x0074, B:39:0x0079), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TopupValueEntity topupValueEntity, ContinuationImpl continuationImpl) {
        TopupNoticeRepository$getTopupNoticeDeprecated$1 topupNoticeRepository$getTopupNoticeDeprecated$1;
        int i;
        Object failure;
        TopupValueDto topupValueDto;
        TopupValueDto.Type type;
        Object c;
        if (continuationImpl instanceof TopupNoticeRepository$getTopupNoticeDeprecated$1) {
            topupNoticeRepository$getTopupNoticeDeprecated$1 = (TopupNoticeRepository$getTopupNoticeDeprecated$1) continuationImpl;
            int i2 = topupNoticeRepository$getTopupNoticeDeprecated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                topupNoticeRepository$getTopupNoticeDeprecated$1.label = i2 - Integer.MIN_VALUE;
                Object obj = topupNoticeRepository$getTopupNoticeDeprecated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = topupNoticeRepository$getTopupNoticeDeprecated$1.label;
                if (i != 0) {
                    b.b(obj);
                    topupNoticeRepository$getTopupNoticeDeprecated$1.L$0 = topupValueEntity;
                    topupNoticeRepository$getTopupNoticeDeprecated$1.label = 1;
                    failure = this.b.b(topupNoticeRepository$getTopupNoticeDeprecated$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        c = ((Result) obj).getValue();
                        b.b(c);
                        failure = c;
                        if (failure instanceof Result.Failure) {
                            return failure;
                        }
                        TopupNoticeContentDeprecatedResponse topupNoticeContentDeprecatedResponse = (TopupNoticeContentDeprecatedResponse) failure;
                        Text.Constant i3 = g8e.i(Text.Companion, topupNoticeContentDeprecatedResponse.getTitle());
                        Text.Constant constant = new Text.Constant(topupNoticeContentDeprecatedResponse.getDescription());
                        rbv f = job1.f(qxy0.c(topupNoticeContentDeprecatedResponse.getThemedImage(), topupNoticeContentDeprecatedResponse.getImage()), new f0z0(22));
                        return new vxz0(i3, constant, f == null ? new pbv(topupNoticeContentDeprecatedResponse.getImage(), (ccv) null, rev.f, (dcv) null, (vfv) null, 58) : f, new Text.Constant(topupNoticeContentDeprecatedResponse.getButton().getText()), topupNoticeContentDeprecatedResponse.getButton().getAction());
                    }
                    topupValueEntity = (TopupValueEntity) topupNoticeRepository$getTopupNoticeDeprecated$1.L$0;
                    b.b(obj);
                    failure = ((Result) obj).getValue();
                }
                if (!(failure instanceof Result.Failure)) {
                    String str = ((xj1) failure).a;
                    int i4 = oyz0.a[topupValueEntity.getTopupType().ordinal()];
                    if (i4 == 1) {
                        type = TopupValueDto.Type.EXACT;
                    } else if (i4 == 2) {
                        type = TopupValueDto.Type.EXPECTED;
                    } else {
                        w511.b();
                        topupValueDto = null;
                        TopupNoticeRepository$getTopupNoticeDeprecated$2$1 topupNoticeRepository$getTopupNoticeDeprecated$2$1 = new TopupNoticeRepository$getTopupNoticeDeprecated$2$1(this, new TopupNoticeContentDeprecatedRequest(str, topupValueDto), null);
                        topupNoticeRepository$getTopupNoticeDeprecated$1.L$0 = null;
                        topupNoticeRepository$getTopupNoticeDeprecated$1.label = 2;
                        c = c.c(topupNoticeRepository$getTopupNoticeDeprecated$2$1, topupNoticeRepository$getTopupNoticeDeprecated$1);
                    }
                    topupValueDto = new TopupValueDto(type, new Money(topupValueEntity.getMoney(), topupValueEntity.getCurrency()));
                    TopupNoticeRepository$getTopupNoticeDeprecated$2$1 topupNoticeRepository$getTopupNoticeDeprecated$2$12 = new TopupNoticeRepository$getTopupNoticeDeprecated$2$1(this, new TopupNoticeContentDeprecatedRequest(str, topupValueDto), null);
                    topupNoticeRepository$getTopupNoticeDeprecated$1.L$0 = null;
                    topupNoticeRepository$getTopupNoticeDeprecated$1.label = 2;
                    c = c.c(topupNoticeRepository$getTopupNoticeDeprecated$2$12, topupNoticeRepository$getTopupNoticeDeprecated$1);
                }
                if (failure instanceof Result.Failure) {
                }
            }
        }
        topupNoticeRepository$getTopupNoticeDeprecated$1 = new TopupNoticeRepository$getTopupNoticeDeprecated$1(this, continuationImpl);
        Object obj2 = topupNoticeRepository$getTopupNoticeDeprecated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = topupNoticeRepository$getTopupNoticeDeprecated$1.label;
        if (i != 0) {
        }
        if (!(failure instanceof Result.Failure)) {
        }
        if (failure instanceof Result.Failure) {
        }
    }
}
