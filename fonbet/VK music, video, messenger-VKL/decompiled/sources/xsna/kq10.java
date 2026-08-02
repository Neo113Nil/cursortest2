package xsna;

import android.media.MediaCodecInfo;
import java.util.Comparator;
import xsna.gq10;

/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class kq10<T> implements Comparator {
    public final /* synthetic */ String b;

    public kq10(String str) {
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String str = this.b;
        return jw5.b(Boolean.valueOf(gq10.a.b((MediaCodecInfo) t2, str)), Boolean.valueOf(gq10.a.b((MediaCodecInfo) t, str)));
    }
}
