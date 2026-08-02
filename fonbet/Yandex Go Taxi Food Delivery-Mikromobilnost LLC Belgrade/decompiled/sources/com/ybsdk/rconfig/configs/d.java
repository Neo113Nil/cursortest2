package com.ybsdk.rconfig.configs;

import com.ybsdk.rconfig.configs.TransfersRequisitesFormPayloadsConfig;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransfersRequisitesFormPayloadsConfig.FormPayload.FormType.values().length];
        try {
            iArr[TransfersRequisitesFormPayloadsConfig.FormPayload.FormType.HCS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransfersRequisitesFormPayloadsConfig.FormPayload.FormType.PERSON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransfersRequisitesFormPayloadsConfig.FormPayload.FormType.LEGAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
