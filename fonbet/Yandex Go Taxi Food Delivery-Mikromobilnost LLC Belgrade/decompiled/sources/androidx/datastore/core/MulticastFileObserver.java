package androidx.datastore.core;

import android.os.FileObserver;
import com.yandex.div.state.db.StateEntry;
import defpackage.jo40;
import defpackage.tls;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR,\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver;", "Landroid/os/FileObserver;", "", StateEntry.COLUMN_PATH, "<init>", "(Ljava/lang/String;)V", "", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "onEvent", "(ILjava/lang/String;)V", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "Landroidx/datastore/core/FileMoveObserver;", "delegates", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Companion", "jo40", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MulticastFileObserver extends FileObserver {
    public static final jo40 Companion = new jo40();
    private static final Object LOCK = new Object();
    private static final Map<String, MulticastFileObserver> fileObservers = new LinkedHashMap();
    private final CopyOnWriteArrayList<tls> delegates;
    private final String path;

    private MulticastFileObserver(String str) {
        super(str, 128);
        this.path = str;
        this.delegates = new CopyOnWriteArrayList<>();
    }

    public final String getPath() {
        return this.path;
    }

    @Override // android.os.FileObserver
    public void onEvent(int event, String path) {
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(path);
        }
    }

    public /* synthetic */ MulticastFileObserver(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
