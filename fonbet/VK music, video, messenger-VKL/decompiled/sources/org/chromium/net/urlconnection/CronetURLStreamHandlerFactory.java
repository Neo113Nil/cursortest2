package org.chromium.net.urlconnection;

import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.Objects;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes8.dex */
public class CronetURLStreamHandlerFactory implements URLStreamHandlerFactory {
    private final ExperimentalCronetEngine mCronetEngine;

    public CronetURLStreamHandlerFactory(ExperimentalCronetEngine experimentalCronetEngine) {
        Objects.requireNonNull(experimentalCronetEngine, "CronetEngine is null.");
        this.mCronetEngine = experimentalCronetEngine;
    }

    @Override // java.net.URLStreamHandlerFactory
    public URLStreamHandler createURLStreamHandler(String str) {
        if ("http".equals(str) || HttpRequest.DEFAULT_SCHEME.equals(str)) {
            return new CronetHttpURLStreamHandler(this.mCronetEngine);
        }
        return null;
    }
}
