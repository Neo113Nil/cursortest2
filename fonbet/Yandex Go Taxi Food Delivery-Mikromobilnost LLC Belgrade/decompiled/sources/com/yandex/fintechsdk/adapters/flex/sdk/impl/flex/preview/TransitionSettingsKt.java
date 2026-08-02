package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.preview;

import defpackage.vwl;
import defpackage.wwl;
import flex.core.model.Document$TransitionSettings$Option$Interpolator;
import flex.core.model.Document$TransitionSettings$Option$Transition;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwwl;", "crossFadeTransitionSettings", "()Lwwl;", "", "CROSS_FADE_DURATION", CA20Status.STATUS_REQUEST_D, "impl-18-1-0_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransitionSettingsKt {
    private static final double CROSS_FADE_DURATION = 300.0d;

    public static final wwl crossFadeTransitionSettings() {
        Document$TransitionSettings$Option$Interpolator document$TransitionSettings$Option$Interpolator = Document$TransitionSettings$Option$Interpolator.EaseIn;
        Document$TransitionSettings$Option$Transition document$TransitionSettings$Option$Transition = Document$TransitionSettings$Option$Transition.CrossDissolve;
        return new wwl(new vwl(CROSS_FADE_DURATION, document$TransitionSettings$Option$Interpolator, document$TransitionSettings$Option$Transition), new vwl(CROSS_FADE_DURATION, Document$TransitionSettings$Option$Interpolator.EaseInOut, document$TransitionSettings$Option$Transition));
    }
}
