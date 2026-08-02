package org.chromium.net.impl.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* loaded from: classes11.dex */
public interface ProxyOptionsOrBuilder extends MessageLiteOrBuilder {
    Proxy getProxies(int i);

    int getProxiesCount();

    List<Proxy> getProxiesList();
}
