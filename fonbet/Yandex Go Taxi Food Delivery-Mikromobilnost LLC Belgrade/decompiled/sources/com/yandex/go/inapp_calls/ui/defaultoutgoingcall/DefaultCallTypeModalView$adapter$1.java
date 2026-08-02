package com.yandex.go.inapp_calls.ui.defaultoutgoingcall;

import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$Option;
import com.yandex.go.inapp_calls.api.defaultoutgoingcall.DefaultOutgoingCallType;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.c8h;
import defpackage.ijv;
import defpackage.mjv;
import defpackage.njv;
import defpackage.pho;
import defpackage.tls;
import defpackage.w511;
import defpackage.x4e;
import defpackage.y7h;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* synthetic */ class DefaultCallTypeModalView$adapter$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        InAppCallsAnalytics$Option inAppCallsAnalytics$Option;
        c8h c8hVar = (c8h) obj;
        y7h y7hVar = (y7h) this.receiver;
        y7hVar.x.a(c8hVar.a);
        njv njvVar = y7hVar.z;
        DefaultOutgoingCallType defaultOutgoingCallType = c8hVar.a;
        mjv mjvVar = njvVar.b;
        int i = ijv.a[defaultOutgoingCallType.ordinal()];
        if (i == 1) {
            inAppCallsAnalytics$Option = InAppCallsAnalytics$Option.InApp;
        } else if (i == 2) {
            inAppCallsAnalytics$Option = InAppCallsAnalytics$Option.Phone;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            inAppCallsAnalytics$Option = InAppCallsAnalytics$Option.Ask;
        }
        mjvVar.getClass();
        pho phoVar = mjvVar.a;
        HashMap hashMap = new HashMap();
        hashMap.put(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, inAppCallsAnalytics$Option.getEventValue());
        phoVar.a("InAppCalls.PreferredOptionSettings.Choosed", hashMap, 1, new HashMap());
        x4e.B(phoVar, "InAppCalls.RememberMyChoice.SettingChanged", x4e.p("type", njv.a(defaultOutgoingCallType)), 1);
        return zy11.a;
    }
}
