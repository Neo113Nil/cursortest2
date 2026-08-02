package com.yandex.go.taxi.order.feedback.after.ui;

import com.yandex.go.taxi.order.feedback.after.ui.AfterFeedbackInfoModalView;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AfterFeedbackInfoModalView.MessageType.values().length];
        try {
            iArr[AfterFeedbackInfoModalView.MessageType.MESSAGE_DRIVE_DISABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AfterFeedbackInfoModalView.MessageType.MESSAGE_DONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
