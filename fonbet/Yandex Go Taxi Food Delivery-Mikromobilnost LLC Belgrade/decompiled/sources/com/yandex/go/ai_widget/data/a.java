package com.yandex.go.ai_widget.data;

import android.content.SharedPreferences;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationRequestBody;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationResponse;
import defpackage.ao1;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.jst;
import defpackage.ny61;
import defpackage.po1;
import defpackage.so1;
import defpackage.to1;
import defpackage.uo1;
import defpackage.vo1;
import defpackage.yvf0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final yvf0 a;
    public final b b;
    public final po1 c;

    public a(yvf0 yvf0Var, b bVar, po1 po1Var) {
        this.a = yvf0Var;
        this.b = bVar;
        this.c = po1Var;
    }

    public static vo1 b(fmt fmtVar) {
        int i = fmtVar.b;
        if (i == 200) {
            AiWidgetEvaluationResponse aiWidgetEvaluationResponse = (AiWidgetEvaluationResponse) fmtVar.a;
            if (aiWidgetEvaluationResponse.a != null || aiWidgetEvaluationResponse.b != null) {
                return new uo1(aiWidgetEvaluationResponse);
            }
        } else if (i == 404) {
            return to1.a;
        }
        return so1.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b1, code lost:
    
        if (r11 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Boolean bool, ContinuationImpl continuationImpl) {
        AiWidgetEvaluationRepository$loadEvaluation$1 aiWidgetEvaluationRepository$loadEvaluation$1;
        int i;
        boolean z;
        ao1 ao1Var;
        try {
            if (continuationImpl instanceof AiWidgetEvaluationRepository$loadEvaluation$1) {
                aiWidgetEvaluationRepository$loadEvaluation$1 = (AiWidgetEvaluationRepository$loadEvaluation$1) continuationImpl;
                int i2 = aiWidgetEvaluationRepository$loadEvaluation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aiWidgetEvaluationRepository$loadEvaluation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = aiWidgetEvaluationRepository$loadEvaluation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aiWidgetEvaluationRepository$loadEvaluation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ao1 ao1Var2 = (ao1) this.a.get();
                        boolean booleanValue = bool != null ? bool.booleanValue() : !((SharedPreferences) this.c.b.getValue()).getBoolean("onboarding_completed", false);
                        aiWidgetEvaluationRepository$loadEvaluation$1.L$0 = null;
                        aiWidgetEvaluationRepository$loadEvaluation$1.L$1 = null;
                        aiWidgetEvaluationRepository$loadEvaluation$1.L$2 = ao1Var2;
                        aiWidgetEvaluationRepository$loadEvaluation$1.L$3 = str;
                        aiWidgetEvaluationRepository$loadEvaluation$1.Z$0 = booleanValue;
                        aiWidgetEvaluationRepository$loadEvaluation$1.label = 1;
                        Object a = this.b.a(aiWidgetEvaluationRepository$loadEvaluation$1);
                        if (a != coroutineSingletons) {
                            obj = a;
                            z = booleanValue;
                            ao1Var = ao1Var2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return b((fmt) obj);
                    }
                    z = aiWidgetEvaluationRepository$loadEvaluation$1.Z$0;
                    str = (String) aiWidgetEvaluationRepository$loadEvaluation$1.L$3;
                    ao1Var = (ao1) aiWidgetEvaluationRepository$loadEvaluation$1.L$2;
                    kotlin.b.b(obj);
                    cmt<AiWidgetEvaluationResponse> a2 = ((AiWidgetEvaluationInternalApi) ao1Var.a.getValue()).a(str, Boolean.valueOf(z), (AiWidgetEvaluationRequestBody) obj);
                    aiWidgetEvaluationRepository$loadEvaluation$1.L$0 = null;
                    aiWidgetEvaluationRepository$loadEvaluation$1.L$1 = null;
                    aiWidgetEvaluationRepository$loadEvaluation$1.L$2 = null;
                    aiWidgetEvaluationRepository$loadEvaluation$1.L$3 = null;
                    aiWidgetEvaluationRepository$loadEvaluation$1.label = 2;
                    obj = a2.a(aiWidgetEvaluationRepository$loadEvaluation$1);
                }
            }
            if (i != 0) {
            }
            cmt<AiWidgetEvaluationResponse> a22 = ((AiWidgetEvaluationInternalApi) ao1Var.a.getValue()).a(str, Boolean.valueOf(z), (AiWidgetEvaluationRequestBody) obj);
            aiWidgetEvaluationRepository$loadEvaluation$1.L$0 = null;
            aiWidgetEvaluationRepository$loadEvaluation$1.L$1 = null;
            aiWidgetEvaluationRepository$loadEvaluation$1.L$2 = null;
            aiWidgetEvaluationRepository$loadEvaluation$1.L$3 = null;
            aiWidgetEvaluationRepository$loadEvaluation$1.label = 2;
            obj = a22.a(aiWidgetEvaluationRepository$loadEvaluation$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            jst.e.h("AI_WIDGET_EVALUATION", "Failed to load AI widget evaluation cards", th);
            return so1.a;
        }
        aiWidgetEvaluationRepository$loadEvaluation$1 = new AiWidgetEvaluationRepository$loadEvaluation$1(this, continuationImpl);
        Object obj2 = aiWidgetEvaluationRepository$loadEvaluation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aiWidgetEvaluationRepository$loadEvaluation$1.label;
    }
}
