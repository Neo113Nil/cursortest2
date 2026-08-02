package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class c1r implements b1r {
    public final String a;
    public final HashMap b = new HashMap();

    public c1r(String str) {
        this.a = str;
    }

    public final void a(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            ny61.g("Name must not be empty");
            return;
        }
        try {
            this.b.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            yci0.p(g8e.n(file, "Failed to resolve canonical path for "), e);
        }
    }

    public final File b(Uri uri) {
        String removeTrailingSlash;
        String removeTrailingSlash2;
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        if (indexOf == -1) {
            ny61.g(unr0.n(uri, "Unable to find path from root: "));
            return null;
        }
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.b.get(decode);
        if (file == null) {
            ny61.g(unr0.n(uri, "Unable to find configured root for "));
            return null;
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            String path = canonicalFile.getPath();
            String path2 = file.getPath();
            removeTrailingSlash = FileProvider.removeTrailingSlash(path);
            removeTrailingSlash2 = FileProvider.removeTrailingSlash(path2);
            if (removeTrailingSlash.startsWith(removeTrailingSlash2 + '/')) {
                return canonicalFile;
            }
            ny61.z("Resolved path jumped beyond configured root");
            return null;
        } catch (IOException unused) {
            ny61.g(g8e.n(file2, "Failed to resolve canonical path for "));
            return null;
        }
    }

    public final Uri c(File file) {
        String removeTrailingSlash;
        String removeTrailingSlash2;
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : this.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                removeTrailingSlash = FileProvider.removeTrailingSlash(canonicalPath);
                removeTrailingSlash2 = FileProvider.removeTrailingSlash(path);
                if (removeTrailingSlash.startsWith(removeTrailingSlash2 + '/') && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                ny61.g(g8e.o("Failed to find configured root that contains ", canonicalPath));
                return null;
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            ny61.g(g8e.n(file, "Failed to resolve canonical path for "));
            return null;
        }
    }
}
