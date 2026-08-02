package com.yandex.go.feedback_common.services;

import com.squareup.tape.Task;
import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.feedback_common.services.FeedbackTask;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.quq;
import defpackage.s8o;
import defpackage.sls;
import defpackage.ztq;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.network.api.models.GoApiHttpException;

@gsq0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/feedback_common/services/FeedbackTask;", "Lcom/squareup/tape/Task;", "Lquq;", "Lcom/yandex/go/feedback_common/data/model/FeedbackParam;", "feedbackParam", "Lcom/yandex/go/feedback_common/data/model/FeedbackParam;", "getFeedbackParam$annotations", "()V", "La3y0;", "logger", "La3y0;", "getLogger$annotations", "Companion", "$serializer", "com/yandex/go/feedback_common/services/a", "feedback_common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FeedbackTask implements Task<quq> {
    public static final a Companion = new a();
    private final FeedbackParam feedbackParam;
    private final a3y0 logger;

    public FeedbackTask(int i, FeedbackParam feedbackParam) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, FeedbackTask$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.feedbackParam = feedbackParam;
        this.logger = new a3y0(TaxiOrderLogGroup.FEEDBACK.getTag(), "FeedbackTask");
    }

    public static final void c(final FeedbackTask feedbackTask, GoApiHttpException goApiHttpException, quq quqVar) {
        feedbackTask.getClass();
        final int code = goApiHttpException.getCode();
        if (s8o.t(goApiHttpException) || s8o.w(goApiHttpException) || s8o.E(goApiHttpException)) {
            final int i = 0;
            feedbackTask.logger.b("handleHttpException", goApiHttpException, new sls() { // from class: jvq
                @Override // defpackage.sls
                public final Object invoke() {
                    int i2 = i;
                    FeedbackTask feedbackTask2 = feedbackTask;
                    int i3 = code;
                    switch (i2) {
                        case 0:
                            return "Got " + i3 + " code while sending feedback. Delay processing queue. Task: " + feedbackTask2;
                        default:
                            return "Got " + i3 + " code while sending feedback. Drop this task. Task: " + feedbackTask2;
                    }
                }
            });
            ((ztq) quqVar).a();
        } else {
            final int i2 = 1;
            feedbackTask.logger.b("handleHttpException", goApiHttpException, new sls() { // from class: jvq
                @Override // defpackage.sls
                public final Object invoke() {
                    int i22 = i2;
                    FeedbackTask feedbackTask2 = feedbackTask;
                    int i3 = code;
                    switch (i22) {
                        case 0:
                            return "Got " + i3 + " code while sending feedback. Delay processing queue. Task: " + feedbackTask2;
                        default:
                            return "Got " + i3 + " code while sending feedback. Drop this task. Task: " + feedbackTask2;
                    }
                }
            });
            ((ztq) quqVar).b();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedbackTask) && jl40.l(this.feedbackParam, ((FeedbackTask) obj).feedbackParam);
    }

    public final String f() {
        return this.feedbackParam.d;
    }

    public final int hashCode() {
        return this.feedbackParam.hashCode();
    }

    public final String toString() {
        return "FeedbackTask(feedbackParam=" + this.feedbackParam + Extension.C_BRAKE;
    }

    public FeedbackTask(FeedbackParam feedbackParam) {
        this.feedbackParam = feedbackParam;
        this.logger = new a3y0(TaxiOrderLogGroup.FEEDBACK.getTag(), "FeedbackTask");
    }
}
