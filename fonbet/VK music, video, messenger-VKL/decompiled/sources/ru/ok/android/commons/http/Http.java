package ru.ok.android.commons.http;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public interface Http {

    public interface ContentEncoding {
        public static final String GZIP = "gzip";
    }

    public interface ContentType {
        public static final String APPLICATION_JSON = "application/json";
        public static final String APPLICATION_OCTET_STREAM = "application/octet-stream";
        public static final String APPLICATION_X_WWW_FORM_URLENCODED = "application/x-www-form-urlencoded";
    }

    public interface Header {
        public static final String ACCEPT = "Accept";
        public static final String AUTHORIZATION = "Authorization";
        public static final String CONTENT_DISPOSITION = "Content-Disposition";
        public static final String CONTENT_ENCODING = "Content-Encoding";
        public static final String CONTENT_LENGTH = "Content-Length";
        public static final String CONTENT_RANGE = "Content-Range";
        public static final String CONTENT_TYPE = "Content-Type";
        public static final String COOKIE = "Cookie";
        public static final String GEO_POSITION = "Geo-Position";
        public static final String INVOCATION_ERROR = "Invocation-Error";
        public static final String SET_COOKIE = "Set-Cookie";
        public static final String USER_AGENT = "User-Agent";
        public static final String WMF_INVOCATION_ERROR = "WMF-Invocation-Error";
        public static final String X_CHALLENGE = "X-Challenge";
        public static final String X_CHALLENGE_SOLUTION = "X-Challenge-Solution";
        public static final String X_CHALLENGE_URL = "X-Challenge-Url";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Method {
        public static final String GET = "GET";
        public static final String POST = "POST";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
        public static final int DEFAULT = 16;
        public static final int HIGH = 64;
        public static final int HIGHER = 128;
        public static final int LOW = 4;
        public static final int LOWER = 2;
        public static final int MAX = 256;
        public static final int MIN = 1;
        public static final int RATHER_HIGH = 32;
        public static final int RATHER_LOW = 8;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StatusCode {
        public static final int CREATED = 201;
        public static final int FORBIDDEN = 403;
        public static final int FOUND = 302;
        public static final int GONE = 410;
        public static final int MOVED_PERMANENTLY = 301;
        public static final int NOT_FOUND = 404;
        public static final int OK = 200;
        public static final int RANGE_NOT_SATISFIABLE = 416;
        public static final int SEE_OTHER = 303;
        public static final int TEMPORARY_REDIRECT = 307;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StatusCodeClass {
        public static final int CLIENT_ERROR = 400;
        public static final int INFORMATIONAL = 100;
        public static final int REDIRECTION = 300;
        public static final int SERVER_ERROR = 500;
        public static final int SUCCESSFUL = 200;
    }
}
