package xsna;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AsyncImagePrefetcher.kt */
/* loaded from: classes4.dex */
public final class ly3 {
    public final io.reactivex.rxjava3.disposables.b a = new io.reactivex.rxjava3.disposables.b();
    public final ConcurrentHashMap<Integer, WeakReference<io.reactivex.rxjava3.disposables.b>> b = new ConcurrentHashMap<>();
    public int c;
}
