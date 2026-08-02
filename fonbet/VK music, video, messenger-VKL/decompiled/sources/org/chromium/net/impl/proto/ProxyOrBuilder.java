package org.chromium.net.impl.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes8.dex */
public interface ProxyOrBuilder extends MessageLiteOrBuilder {
    String getHost();

    ByteString getHostBytes();

    int getPort();

    ProxyScheme getScheme();

    boolean hasHost();

    boolean hasPort();

    boolean hasScheme();
}
