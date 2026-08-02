package com.google.firebase.messaging.reporting;

import defpackage.wuf0;

/* loaded from: classes11.dex */
public enum MessagingClientEvent$MessageType implements wuf0 {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int number_;

    MessagingClientEvent$MessageType(int i) {
        this.number_ = i;
    }

    @Override // defpackage.wuf0
    public final int getNumber() {
        return this.number_;
    }
}
