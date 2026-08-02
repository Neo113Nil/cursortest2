package xsna;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: FileClearer.kt */
/* loaded from: classes.dex */
public final class d8r {
    public static final long b;
    public static final long c;
    public static final List<PrivateSubdir> d;
    public static final List<PrivateSubdir> e;
    public static final List<PrivateSubdir> f;
    public final PrivateFiles a;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        b = timeUnit.toMillis(3L);
        c = timeUnit.toMillis(1L);
        d = e43.l(PrivateSubdir.TEMP_UPLOADS, PrivateSubdir.IM);
        e = e43.l(PrivateSubdir.MUSIC_STICKER, PrivateSubdir.INTERNAL_TEMP_UPLOADS, PrivateSubdir.STORIES, PrivateSubdir.STORIES_TEMP, PrivateSubdir.TEMP_CHAT_SCREENSHOTS, PrivateSubdir.MATCHED_PLAYLIST_SHARE, PrivateSubdir.STORIES_VIEWER_VIDEO);
        f = Collections.singletonList(PrivateSubdir.WEBVIEW);
    }

    public d8r(PrivateFiles privateFiles) {
        this.a = privateFiles;
    }

    public final void a(boolean z) {
        PrivateFiles privateFiles;
        try {
            Iterator<PrivateSubdir> it = e.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                privateFiles = this.a;
                Long l = null;
                if (!hasNext) {
                    break;
                }
                PrivateSubdir next = it.next();
                if (!z) {
                    l = Long.valueOf(c);
                }
                privateFiles.a(next, l);
            }
            Iterator<PrivateSubdir> it2 = d.iterator();
            while (it2.hasNext()) {
                privateFiles.a(it2.next(), z ? null : Long.valueOf(b));
            }
            if (z) {
                Iterator<PrivateSubdir> it3 = f.iterator();
                while (it3.hasNext()) {
                    privateFiles.a(it3.next(), null);
                }
            }
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
    }
}
