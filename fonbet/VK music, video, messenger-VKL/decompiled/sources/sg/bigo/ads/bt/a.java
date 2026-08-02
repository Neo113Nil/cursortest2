package sg.bigo.ads.bt;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import ru.ok.android.commons.http.Http;
import sg.bigo.ads.common.utils.i;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class a implements c<InputStream> {
    public final int a;
    public final InputStream b;

    @NonNull
    public final i<List<String>> c;
    private final int d;
    private final Closeable e;

    public a(int i, int i2, @Nullable InputStream inputStream, @NonNull i<List<String>> iVar) {
        this(i, i2, inputStream, iVar, null);
    }

    public final long a() {
        String a = a(Http.Header.CONTENT_LENGTH);
        if (!r.b((CharSequence) a)) {
            return -1L;
        }
        try {
            return Long.parseLong(a);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public a(int i, int i2, @Nullable InputStream inputStream, @NonNull i<List<String>> iVar, @Nullable Closeable closeable) {
        this.d = i;
        this.a = i2;
        this.b = inputStream;
        this.c = iVar;
        this.e = closeable;
    }

    @Nullable
    public final String a(String str) {
        List<String> a;
        if (!TextUtils.isEmpty(str) && (a = this.c.a(str)) != null && !a.isEmpty()) {
            for (String str2 : a) {
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
        }
        return "";
    }
}
