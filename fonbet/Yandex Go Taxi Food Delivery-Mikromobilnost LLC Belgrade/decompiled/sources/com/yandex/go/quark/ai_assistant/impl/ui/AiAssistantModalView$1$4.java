package com.yandex.go.quark.ai_assistant.impl.ui;

import com.yandex.go.quark.ai_assistant.impl.analytics.AiAssistantAnalytics$NavigationButton;
import com.yandex.quark.webchat.navigation.internal.a;
import defpackage.o8g0;
import defpackage.se41;
import defpackage.sls;
import defpackage.wl1;
import defpackage.xd41;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class AiAssistantModalView$1$4 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        wl1 wl1Var = (wl1) this.receiver;
        wl1Var.getClass();
        wl1Var.Kg(AiAssistantAnalytics$NavigationButton.NewChat);
        o8g0 o8g0Var = wl1Var.D;
        if (o8g0Var != null) {
            a aVar = ((se41) o8g0Var.b).o;
            aVar.a(new xd41(aVar, 0));
        }
        return zy11.a;
    }
}
