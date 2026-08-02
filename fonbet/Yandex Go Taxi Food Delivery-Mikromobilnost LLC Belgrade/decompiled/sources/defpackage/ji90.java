package defpackage;

import com.ybsdk.feature.partnerselection.internal.network.dto.check.CheckUserPartnerRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderCheckUserPartnerRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderPartnersByCountryRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.partner.GetAllPartnersRequest;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public interface ji90 {
    Object a(String str, GetAllPartnersRequest getAllPartnersRequest, ContinuationImpl continuationImpl);

    Object b(String str, CrossBorderCheckUserPartnerRequest crossBorderCheckUserPartnerRequest, Continuation continuation);

    Object c(String str, CheckUserPartnerRequest checkUserPartnerRequest, int i, ContinuationImpl continuationImpl);

    Object d(String str, CrossBorderPartnersByCountryRequest crossBorderPartnersByCountryRequest, Continuation continuation);
}
