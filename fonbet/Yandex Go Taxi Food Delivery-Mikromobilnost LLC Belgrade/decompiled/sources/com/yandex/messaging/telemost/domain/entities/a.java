package com.yandex.messaging.telemost.domain.entities;

import com.yandex.messaging.telemost.domain.entities.CreateMeetingParams;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CreateMeetingParams.Personal.CallType.values().length];
        try {
            iArr[CreateMeetingParams.Personal.CallType.Audio.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreateMeetingParams.Personal.CallType.Video.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
