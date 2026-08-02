package xsna;

import android.os.Build;
import android.view.MenuItem;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.Comparator;
import java.util.List;

/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class di1 implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                AlbumEntry albumEntry = (AlbumEntry) obj2;
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) j5g.a0(albumEntry.d);
                long j = 0;
                Long valueOf = Long.valueOf(albumEntry.e ? Long.MAX_VALUE : mediaStoreEntry != null ? Build.VERSION.SDK_INT >= 29 ? mediaStoreEntry.d() : mediaStoreEntry.e() : 0L);
                AlbumEntry albumEntry2 = (AlbumEntry) obj;
                MediaStoreEntry mediaStoreEntry2 = (MediaStoreEntry) j5g.a0(albumEntry2.d);
                if (albumEntry2.e) {
                    j = Long.MAX_VALUE;
                } else if (mediaStoreEntry2 != null) {
                    j = Build.VERSION.SDK_INT >= 29 ? mediaStoreEntry2.d() : mediaStoreEntry2.e();
                }
                return jw5.b(valueOf, Long.valueOf(j));
            case 1:
                return jw5.b(Integer.valueOf(((i5u0) obj).b.a), Integer.valueOf(((i5u0) obj2).b.a));
            case 2:
                List<Integer> list = sem.p;
                int indexOf = list.indexOf(Integer.valueOf(((MenuItem) obj).getItemId()));
                if (indexOf == -1) {
                    indexOf = Integer.MAX_VALUE;
                }
                Integer valueOf2 = Integer.valueOf(indexOf);
                int indexOf2 = list.indexOf(Integer.valueOf(((MenuItem) obj2).getItemId()));
                return jw5.b(valueOf2, Integer.valueOf(indexOf2 != -1 ? indexOf2 : Integer.MAX_VALUE));
            default:
                ems0 ems0Var = (ems0) obj2;
                ems0 ems0Var2 = (ems0) obj;
                return jw5.b(Integer.valueOf(ems0Var.a * ems0Var.b), Integer.valueOf(ems0Var2.a * ems0Var2.b));
        }
    }
}
