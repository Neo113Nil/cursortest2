package org.chromium.net.impl.proto;

import com.google.protobuf.Internal;

/* loaded from: classes8.dex */
public enum ProxyScheme implements Internal.EnumLite {
    DIRECT(0),
    HTTP(1),
    HTTPS(2);

    public static final int DIRECT_VALUE = 0;
    public static final int HTTPS_VALUE = 2;
    public static final int HTTP_VALUE = 1;
    private static final Internal.EnumLiteMap<ProxyScheme> internalValueMap = new Internal.EnumLiteMap<ProxyScheme>() { // from class: org.chromium.net.impl.proto.ProxyScheme.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ProxyScheme findValueByNumber(int i) {
            return ProxyScheme.forNumber(i);
        }
    };
    private final int value;

    public static final class ProxySchemeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ProxySchemeVerifier();

        private ProxySchemeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ProxyScheme.forNumber(i) != null;
        }
    }

    ProxyScheme(int i) {
        this.value = i;
    }

    public static ProxyScheme forNumber(int i) {
        if (i == 0) {
            return DIRECT;
        }
        if (i == 1) {
            return HTTP;
        }
        if (i != 2) {
            return null;
        }
        return HTTPS;
    }

    public static Internal.EnumLiteMap<ProxyScheme> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ProxySchemeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static ProxyScheme valueOf(int i) {
        return forNumber(i);
    }
}
