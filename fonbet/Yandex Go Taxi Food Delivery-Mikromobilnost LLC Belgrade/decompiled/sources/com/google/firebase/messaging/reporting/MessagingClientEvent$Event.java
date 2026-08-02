package com.google.firebase.messaging.reporting;

import defpackage.wuf0;

/* loaded from: classes11.dex */
public enum MessagingClientEvent$Event implements wuf0 {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int number_;

    MessagingClientEvent$Event(int i) {
        this.number_ = i;
    }

    @Override // defpackage.wuf0
    public final int getNumber() {
        return this.number_;
    }
}
