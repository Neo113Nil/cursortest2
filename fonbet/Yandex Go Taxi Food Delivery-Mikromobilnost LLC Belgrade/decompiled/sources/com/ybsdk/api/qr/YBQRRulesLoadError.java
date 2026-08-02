package com.ybsdk.api.qr;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/api/qr/YBQRRulesLoadError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Network", "Server", "Lcom/ybsdk/api/qr/YBQRRulesLoadError$Network;", "Lcom/ybsdk/api/qr/YBQRRulesLoadError$Server;", "yb-sdk-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class YBQRRulesLoadError extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ybsdk/api/qr/YBQRRulesLoadError$Network;", "Lcom/ybsdk/api/qr/YBQRRulesLoadError;", "yb-sdk-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Network extends YBQRRulesLoadError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ybsdk/api/qr/YBQRRulesLoadError$Server;", "Lcom/ybsdk/api/qr/YBQRRulesLoadError;", "yb-sdk-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Server extends YBQRRulesLoadError {
    }
}
