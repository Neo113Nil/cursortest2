package ru.mail.libverify.j0;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public final class i {

    @NonNull
    private final URL a;
    private String b;
    private String c;

    public i(@NonNull String str) throws MalformedURLException {
        this.a = new URL(str);
    }

    @NonNull
    public final String a() {
        if (TextUtils.isEmpty(this.c)) {
            String url = this.a.toString();
            int indexOf = url.indexOf(this.a.getPath());
            if (indexOf == -1) {
                this.c = url;
            } else {
                this.c = url.substring(0, indexOf);
            }
        }
        return this.c;
    }

    @NonNull
    public final String b() {
        return this.a.getPath();
    }

    @NonNull
    public final String c() throws IllegalArgumentException {
        if (TextUtils.isEmpty(this.b)) {
            String path = this.a.getPath();
            if (TextUtils.isEmpty(path)) {
                FileLog.e("CustomUrlHelper", "Can't get method name from provided URL: %s", this.a);
                throw new IllegalArgumentException("Can't get method name from provided URL");
            }
            int lastIndexOf = path.lastIndexOf(47);
            if (lastIndexOf < 0) {
                this.b = path;
            } else {
                if (lastIndexOf == path.length() - 1) {
                    FileLog.e("CustomUrlHelper", "Can't get method name from provided URL: %s", this.a);
                    throw new IllegalArgumentException("Can't get method name from provided URL");
                }
                this.b = path.substring(lastIndexOf + 1);
            }
        }
        return this.b;
    }

    @NonNull
    public final String d() {
        String query = this.a.getQuery();
        Objects.requireNonNull(query, "");
        return query;
    }
}
