package com.yandex.go.tariffcard.ui.recyclerview.animationmanager;

import com.yandex.go.tariffcard.ui.recyclerview.animationmanager.RecyclerViewItemAnimationManager;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RecyclerViewItemAnimationManager.AnimationPhase.values().length];
        try {
            iArr[RecyclerViewItemAnimationManager.AnimationPhase.PHASE_1_ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RecyclerViewItemAnimationManager.AnimationPhase.PHASE_2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RecyclerViewItemAnimationManager.AnimationPhase.PHASE_1_COMPLETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RecyclerViewItemAnimationManager.AnimationPhase.IDLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RecyclerViewItemAnimationManager.AnimationPhase.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
