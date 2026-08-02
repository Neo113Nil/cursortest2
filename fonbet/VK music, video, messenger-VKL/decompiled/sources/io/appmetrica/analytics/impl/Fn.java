package io.appmetrica.analytics.impl;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class Fn {
    public static final List a = CollectionUtils.createSortedListWithoutRepetitions("id", CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, "data", "timestamp");
}
