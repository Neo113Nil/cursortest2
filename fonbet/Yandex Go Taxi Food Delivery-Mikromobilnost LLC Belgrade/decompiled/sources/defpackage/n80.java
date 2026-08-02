package defpackage;

import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.ybsdk.feature.card.internal.network.dto.SetCardStatusSuccessData$Deeplink;
import com.ybsdk.feature.card.internal.network.dto.SetCardStatusSuccessData$DivKit;
import com.ybsdk.feature.card.internal.network.dto.SetCardStatusSuccessData$SetResultState;

/* loaded from: classes8.dex */
public abstract class n80 {
    public static final PolymorphicJsonAdapterFactory a = PolymorphicJsonAdapterFactory.of(l2r0.class, "action_type").withSubtype(SetCardStatusSuccessData$DivKit.class, "DIVKIT").withSubtype(SetCardStatusSuccessData$Deeplink.class, "DEEPLINK").withSubtype(SetCardStatusSuccessData$SetResultState.class, "SET_STATE");
}
