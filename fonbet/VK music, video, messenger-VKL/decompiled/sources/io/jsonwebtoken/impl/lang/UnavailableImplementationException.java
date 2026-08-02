package io.jsonwebtoken.impl.lang;

/* loaded from: classes8.dex */
public final class UnavailableImplementationException extends RuntimeException {
    private static final String DEFAULT_NOT_FOUND_MESSAGE = "Unable to find an implementation for %s using java.util.ServiceLoader. Ensure you include a backing implementation .jar in the classpath, for example jjwt-impl.jar, or your own .jar for custom implementations.";

    public UnavailableImplementationException(Class cls) {
        super("Unable to find an implementation for " + cls + " using java.util.ServiceLoader. Ensure you include a backing implementation .jar in the classpath, for example jjwt-impl.jar, or your own .jar for custom implementations.");
    }
}
