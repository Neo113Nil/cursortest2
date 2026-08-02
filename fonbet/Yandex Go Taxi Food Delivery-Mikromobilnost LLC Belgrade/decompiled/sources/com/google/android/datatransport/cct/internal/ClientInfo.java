package com.google.android.datatransport.cct.internal;

import defpackage.v72;

/* loaded from: classes.dex */
public abstract class ClientInfo {

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        ClientType(int i) {
            this.value = i;
        }
    }

    public static abstract class a {
    }

    public abstract v72 a();

    public abstract ClientType b();
}
