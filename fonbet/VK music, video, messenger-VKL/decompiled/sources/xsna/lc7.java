package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.md7;

/* compiled from: BitmapLruCache.kt */
/* loaded from: classes2.dex */
public final class lc7<K, T extends md7> extends m900<K, T> {
    public final a<T> a;
    public final zk3<K, Integer> b;
    public final bpn0 c;

    /* compiled from: BitmapLruCache.kt */
    public interface a<T> {
        boolean a(md7 md7Var);
    }

    public lc7(Integer num, a aVar) {
        super(an10.a(num.doubleValue() * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES));
        this.a = aVar;
        this.b = new zk3<>(100);
        this.c = new bpn0(new com.vk.movika.tools.controls.seekbar.n(7));
    }

    @Override // xsna.m900
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        a<T> aVar;
        md7 md7Var = (md7) obj2;
        if (((md7) obj3) == null && (aVar = this.a) != null && aVar.a(md7Var)) {
            ((CopyOnWriteArrayList) this.c.getValue()).add(md7Var);
        } else {
            this.b.remove(obj);
            md7Var.a();
        }
    }

    @Override // xsna.m900
    public final int sizeOf(Object obj, Object obj2) {
        md7 md7Var = (md7) obj2;
        zk3<K, Integer> zk3Var = this.b;
        Integer num = zk3Var.get(obj);
        if (num == null) {
            num = Integer.valueOf(md7Var.getBitmap().getAllocationByteCount());
            zk3Var.put(obj, num);
        }
        int intValue = num.intValue();
        if (intValue < 1) {
            return 1;
        }
        return intValue;
    }
}
