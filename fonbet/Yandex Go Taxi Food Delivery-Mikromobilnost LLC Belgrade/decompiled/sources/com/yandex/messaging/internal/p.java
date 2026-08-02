package com.yandex.messaging.internal;

import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.TechMeetingStartedMessage;
import com.yandex.messaging.telemost.domain.entities.PersonalMeetingResolution;
import com.yandex.messaging.telemost.domain.entities.TechPersonalMeetingEndedMessage;
import defpackage.b9t;
import defpackage.c9t;
import defpackage.g5b0;
import defpackage.hi91;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wwg0;
import defpackage.x8t;
import defpackage.zy11;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ TechBaseMessage c;
    public final /* synthetic */ Date w;
    public final /* synthetic */ boolean x;

    public p(vpr vprVar, String str, c9t c9tVar, TechBaseMessage techBaseMessage, Date date, boolean z) {
        this.a = vprVar;
        this.b = str;
        this.c = techBaseMessage;
        this.w = date;
        this.x = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1 getMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1;
        int i;
        Integer num;
        int i2;
        if (continuation instanceof GetMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1) {
            getMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1 = (GetMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1) continuation;
            int i3 = getMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = getMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    CharSequence charSequence = (CharSequence) obj;
                    TechBaseMessage techBaseMessage = this.c;
                    if (techBaseMessage instanceof TechMeetingStartedMessage) {
                        charSequence = "📞 " + ((Object) charSequence);
                    }
                    CharSequence charSequence2 = charSequence;
                    MessageStatus messageStatus = MessageStatus.OTHER;
                    boolean z = techBaseMessage instanceof TechPersonalMeetingEndedMessage;
                    boolean z2 = this.x;
                    if (z) {
                        TechPersonalMeetingEndedMessage techPersonalMeetingEndedMessage = (TechPersonalMeetingEndedMessage) techBaseMessage;
                        PersonalMeetingResolution e = hi91.e(techPersonalMeetingEndedMessage);
                        boolean z3 = techPersonalMeetingEndedMessage.callType == 1;
                        int i4 = g5b0.a[e.ordinal()];
                        if (i4 == 1 || i4 == 2) {
                            i2 = (z2 && z3) ? wwg0.msg_ic_successful_outgoing : z2 ? wwg0.msg_ic_successful_outgoing_video : z3 ? wwg0.msg_ic_successful_incoming : wwg0.msg_ic_successful_incoming_video;
                        } else if (i4 == 3) {
                            i2 = (z2 && z3) ? wwg0.msg_ic_failed_call : z2 ? wwg0.msg_ic_failed_call_video : z3 ? wwg0.msg_ic_successful_incoming : wwg0.msg_ic_successful_incoming_video;
                        } else if (i4 == 4) {
                            i2 = z3 ? wwg0.msg_ic_failed_call : wwg0.msg_ic_failed_call_video;
                        } else {
                            if (i4 != 5) {
                                w511.b();
                                return null;
                            }
                            i2 = (z2 && z3) ? wwg0.msg_ic_successful_outgoing : z2 ? wwg0.msg_ic_successful_outgoing_video : z3 ? wwg0.msg_ic_failed_call : wwg0.msg_ic_failed_call_video;
                        }
                        num = Integer.valueOf(i2);
                    } else {
                        num = null;
                    }
                    TechPersonalMeetingEndedMessage techPersonalMeetingEndedMessage2 = z ? (TechPersonalMeetingEndedMessage) techBaseMessage : null;
                    PersonalMeetingResolution e2 = techPersonalMeetingEndedMessage2 != null ? hi91.e(techPersonalMeetingEndedMessage2) : null;
                    int i5 = e2 == null ? -1 : b9t.a[e2.ordinal()];
                    x8t x8tVar = new x8t(this.b, charSequence2, this.w, messageStatus, false, true, num, (i5 == 1 || i5 == 2) && !z2);
                    getMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(x8tVar, getMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        getMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1 = new GetMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getMessageInfoFlowUseCase$MessageInfoHandler$onTechnicalMessage$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
