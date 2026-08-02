package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import xsna.k840;
import xsna.ky6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class h93 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean r = fxc0.B().s().r();
        boolean E = fxc0.B().s().E();
        long q = fxc0.B().s().q() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long n = k840.a.d().n(new vd1(1)) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long f = k840.a.d().f(new kz0(1)) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long o = (com.vk.core.files.a.o(1) - (r ? q : 0L)) - f;
        long o2 = (com.vk.core.files.a.o(0) - (E ? q : 0L)) - n;
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putLong("__app_start_external_storage_size__", o);
        aVar.putLong("__app_start_internal_storage_size__", o2);
        aVar.putLong("__app_start_video_downloads_size__", q);
        aVar.putLong("__app_start_offline_music_internal_size__", n);
        aVar.putLong("__app_start_offline_music_external_size__", f);
        aVar.a();
        StringBuilder sb = new StringBuilder("application storage size ext=");
        sb.append(o);
        sb.append(", int=");
        sb.append(o2);
        sb.append(" (time=");
        L.e(efz.b(System.currentTimeMillis() - currentTimeMillis, " ms)", sb));
    }
}
