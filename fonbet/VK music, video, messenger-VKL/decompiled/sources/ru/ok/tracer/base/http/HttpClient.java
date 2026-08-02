package ru.ok.tracer.base.http;

import java.io.IOException;

/* compiled from: HttpClient.kt */
/* loaded from: classes9.dex */
public interface HttpClient {
    HttpResponse execute(HttpRequest httpRequest) throws IOException;
}
