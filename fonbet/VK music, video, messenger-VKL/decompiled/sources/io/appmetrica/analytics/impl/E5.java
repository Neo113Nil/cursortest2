package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class E5 {
    public static final List a = CollectionUtils.createSortedListWithoutRepetitions("id", "session_id", "session_type", "number_in_session", "type", "global_number", "time", "event_description");
}
