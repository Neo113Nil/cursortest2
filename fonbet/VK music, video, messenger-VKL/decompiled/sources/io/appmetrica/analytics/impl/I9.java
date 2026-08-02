package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public abstract class I9 {
    public static final Set a;
    public static final EnumSet b;
    public static final EnumSet c;
    public static final EnumSet d;
    public static final EnumSet e;
    public static final EnumSet f;
    public static final EnumSet g;
    public static final EnumSet h;
    public static final List i;
    public static final List j;

    static {
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC5037nb enumC5037nb2 = EnumC5037nb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC5037nb enumC5037nb3 = EnumC5037nb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC5037nb enumC5037nb4 = EnumC5037nb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC5037nb enumC5037nb5 = EnumC5037nb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC5037nb enumC5037nb6 = EnumC5037nb.EVENT_TYPE_ANR;
        a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC5037nb enumC5037nb7 = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        EnumC5037nb enumC5037nb8 = EnumC5037nb.EVENT_TYPE_PURGE_BUFFER;
        EnumC5037nb enumC5037nb9 = EnumC5037nb.EVENT_TYPE_SEND_REFERRER;
        EnumC5037nb enumC5037nb10 = EnumC5037nb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC5037nb enumC5037nb11 = EnumC5037nb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC5037nb enumC5037nb12 = EnumC5037nb.EVENT_TYPE_ACTIVATION;
        EnumC5037nb enumC5037nb13 = EnumC5037nb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC5037nb enumC5037nb14 = EnumC5037nb.EVENT_TYPE_SET_SESSION_EXTRA;
        b = EnumSet.of(enumC5037nb7, enumC5037nb8, enumC5037nb9, enumC5037nb10, enumC5037nb11, enumC5037nb12, enumC5037nb13, enumC5037nb5, enumC5037nb14);
        EnumC5037nb enumC5037nb15 = EnumC5037nb.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC5037nb enumC5037nb16 = EnumC5037nb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        c = EnumSet.of(enumC5037nb15, enumC5037nb4, enumC5037nb5, enumC5037nb13, enumC5037nb16);
        EnumC5037nb enumC5037nb17 = EnumC5037nb.EVENT_TYPE_REGULAR;
        d = EnumSet.of(enumC5037nb4, enumC5037nb5, enumC5037nb3, enumC5037nb, enumC5037nb2, enumC5037nb16, enumC5037nb13, enumC5037nb17, EnumC5037nb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC5037nb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC5037nb.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC5037nb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC5037nb8, EnumC5037nb.EVENT_TYPE_INIT, EnumC5037nb.EVENT_TYPE_SEND_USER_PROFILE, EnumC5037nb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC5037nb9, enumC5037nb10, enumC5037nb11, EnumC5037nb.EVENT_TYPE_FIRST_ACTIVATION, EnumC5037nb.EVENT_TYPE_START, EnumC5037nb.EVENT_TYPE_APP_OPEN, EnumC5037nb.EVENT_TYPE_APP_UPDATE, enumC5037nb6);
        e = EnumSet.of(enumC5037nb17);
        f = EnumSet.of(enumC5037nb17);
        g = EnumSet.of(enumC5037nb13);
        h = EnumSet.of(EnumC5037nb.EVENT_TYPE_ALIVE, enumC5037nb8, enumC5037nb14, enumC5037nb5, enumC5037nb13);
        i = Arrays.asList(0, 6145, 4097, 8224);
        j = Arrays.asList(12290);
    }
}
