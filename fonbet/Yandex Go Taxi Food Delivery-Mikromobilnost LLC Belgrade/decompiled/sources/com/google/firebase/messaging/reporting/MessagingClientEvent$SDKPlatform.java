package com.google.firebase.messaging.reporting;

import defpackage.wuf0;

/* loaded from: classes11.dex */
public enum MessagingClientEvent$SDKPlatform implements wuf0 {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int number_;

    MessagingClientEvent$SDKPlatform(int i) {
        this.number_ = i;
    }

    @Override // defpackage.wuf0
    public final int getNumber() {
        return this.number_;
    }
}
