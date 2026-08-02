package xsna;

import android.database.Cursor;
import android.net.Uri;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz10 implements Callable {
    public final /* synthetic */ yz10 b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ sz10(yz10 yz10Var, Uri uri) {
        this.b = yz10Var;
        this.c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Pair pair;
        cz10 b;
        rq10 rq10Var = this.b.a;
        pro0.b();
        Uri uri = this.c;
        String scheme = uri.getScheme();
        MediaStoreEntry mediaStoreEntry = null;
        if (scheme != null) {
            int hashCode = scheme.hashCode();
            if (hashCode != 3143036) {
                if (hashCode == 951530617 && scheme.equals(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                    pair = new Pair("_id=?", uri.getLastPathSegment());
                }
            } else if (scheme.equals(X3.i.b)) {
                pair = new Pair("_data=?", uri.getPath());
            }
            if (pair != null) {
                Cursor query = rq10Var.a.getContentResolver().query(rq10Var.a(), rq10.f, (String) pair.d(), new String[]{(String) pair.g()}, null);
                try {
                    if (query != null) {
                        try {
                            qq10 qq10Var = new qq10(query);
                            if (query.moveToNext() && (b = rq10Var.b(rq10Var.a(), query, qq10Var)) != null) {
                                mediaStoreEntry = b.a;
                            }
                        } finally {
                            s3q0 s3q0Var = s3q0.a;
                            query.close();
                            return mediaStoreEntry;
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                        query.close();
                        return mediaStoreEntry;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(query, th);
                    }
                }
            }
            return null;
        }
        pair = null;
        if (pair != null) {
        }
        return null;
    }
}
