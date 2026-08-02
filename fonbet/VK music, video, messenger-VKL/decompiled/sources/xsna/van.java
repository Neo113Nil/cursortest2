package xsna;

import android.util.Log;
import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.a;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import one.video.exo.diskcache.core.CachedVideoInfo;

/* compiled from: DiskCache.kt */
/* loaded from: classes8.dex */
public final class van {
    public final bhs0 a;
    public final hdl b;
    public final dzy c;
    public androidx.media3.datasource.cache.c d;
    public final androidx.media3.exoplayer.offline.a e;
    public final pn f;
    public final Object g;

    public van(bhs0 bhs0Var, hdl hdlVar, dzy dzyVar) {
        this.a = bhs0Var;
        this.b = hdlVar;
        this.c = dzyVar;
        ConcurrentHashMap<File, androidx.media3.datasource.cache.c> concurrentHashMap = opj0.a;
        this.d = opj0.a(bhs0Var.a, dzyVar, hdlVar);
        this.e = null;
        this.f = new pn(this);
        this.g = new Object();
    }

    public final CachedVideoInfo a(String str) {
        androidx.media3.exoplayer.offline.a aVar = this.e;
        if (aVar != null) {
            try {
                o7o b = aVar.b(str);
                if (b != null) {
                    return new CachedVideoInfo(b);
                }
            } catch (Exception e) {
                Log.e("DiskCache", "Failed to read download index.", e);
                return null;
            }
        }
        return null;
    }

    public final a.b b(a.InterfaceC0045a interfaceC0045a, boolean z, dbn dbnVar) {
        CacheDataSink.a aVar;
        a.b bVar = new a.b();
        androidx.media3.datasource.cache.c cVar = this.d;
        bVar.a = cVar;
        bVar.c = this.f;
        bVar.e = interfaceC0045a;
        bVar.h = 2;
        if (z) {
            aVar = null;
        } else {
            aVar = new CacheDataSink.a();
            aVar.a = cVar;
        }
        bVar.d(aVar);
        return bVar;
    }
}
