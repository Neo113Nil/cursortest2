package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.TransfersRequisitesFormPayloadsConfig;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class bw01 {
    public static final dfr a = new dfr("yb_mobile_transfers_requisites_form_payload", Types.newParameterizedType(CommonExperiment.class, TransfersRequisitesFormPayloadsConfig.class), new CommonExperiment(new TransfersRequisitesFormPayloadsConfig(EmptyList.a), ExperimentApplyType.LATEST));
}
