package com.yandex.go.flex.main_screen.data.network;

import com.yandex.go.flex.main_screen.experiments.SuperAppMainScreenDocumentLoaderExperiment;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[MainScreenDocumentLoader$Companion$State.values().length];
        try {
            iArr[MainScreenDocumentLoader$Companion$State.AFTER_FIRST_HEAD_RESPONSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MainScreenDocumentLoader$Companion$State.BEFORE_FIRST_HEAD_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MainScreenDocumentLoader$Companion$State.BEFORE_FIRST_HEAD_RESPONSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SuperAppMainScreenDocumentLoaderExperiment.Type.values().length];
        try {
            iArr2[SuperAppMainScreenDocumentLoaderExperiment.Type.LINKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SuperAppMainScreenDocumentLoaderExperiment.Type.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
