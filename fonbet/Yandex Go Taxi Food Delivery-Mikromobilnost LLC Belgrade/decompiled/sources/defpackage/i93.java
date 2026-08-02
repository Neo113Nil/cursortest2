package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes10.dex */
public abstract class i93 implements gog {
    public final /* synthetic */ int a;
    public Object b;
    public final Comparable c;
    public final Object w;

    public /* synthetic */ i93(int i, Comparable comparable, Object obj) {
        this.a = i;
        this.w = obj;
        this.c = comparable;
    }

    private final void d() {
    }

    private final void e() {
    }

    @Override // defpackage.gog
    public final void b(Priority priority, fog fogVar) {
        int i = this.a;
        Object obj = this.w;
        Comparable comparable = this.c;
        switch (i) {
            case 0:
                try {
                    Object h = h((AssetManager) obj, (String) comparable);
                    this.b = h;
                    fogVar.d(h);
                    break;
                } catch (IOException e) {
                    Log.isLoggable("AssetPathFetcher", 3);
                    fogVar.e(e);
                    return;
                }
            default:
                try {
                    Object g = g((ContentResolver) obj, (Uri) comparable);
                    this.b = g;
                    fogVar.d(g);
                    break;
                } catch (FileNotFoundException e2) {
                    Log.isLoggable("LocalUriFetcher", 3);
                    fogVar.e(e2);
                }
        }
    }

    @Override // defpackage.gog
    public final DataSource c() {
        switch (this.a) {
        }
        return DataSource.LOCAL;
    }

    @Override // defpackage.gog
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.gog
    public final void cleanup() {
        switch (this.a) {
            case 0:
                Object obj = this.b;
                if (obj != null) {
                    try {
                        f(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                Object obj2 = this.b;
                if (obj2 != null) {
                    try {
                        f(obj2);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    public abstract void f(Object obj);

    public abstract Object g(ContentResolver contentResolver, Uri uri);

    public abstract Object h(AssetManager assetManager, String str);
}
