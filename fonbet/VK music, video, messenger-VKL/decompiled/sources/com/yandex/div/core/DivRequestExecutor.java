package com.yandex.div.core;

import android.net.Uri;
import com.yandex.div.core.images.LoadReference;
import java.util.List;

/* compiled from: DivRequestExecutor.kt */
/* loaded from: classes7.dex */
public interface DivRequestExecutor {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final DivRequestExecutor STUB = new DivRequestExecutor$Companion$STUB$1();

    /* compiled from: DivRequestExecutor.kt */
    public interface Callback {
    }

    /* compiled from: DivRequestExecutor.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* compiled from: DivRequestExecutor.kt */
    public static final class Header {
        private final String name;
        private final String value;

        public Header(String str, String str2) {
            this.name = str;
            this.value = str2;
        }
    }

    /* compiled from: DivRequestExecutor.kt */
    public static final class Request {
        private final String body;
        private final List<Header> headers;
        private final String method;
        private final Uri url;

        public Request(Uri uri, String str, List<Header> list, String str2) {
            this.url = uri;
            this.method = str;
            this.headers = list;
            this.body = str2;
        }
    }

    LoadReference execute(Request request, Callback callback);
}
