package xsna;

import com.vk.geo.api.data.GeoStaticPreviewInput;
import java.util.Comparator;
import kotlin.Pair;
import xsna.yj20;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class lnt implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ lnt(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Double.valueOf(((GeoStaticPreviewInput.Item) ((Pair) obj).d()).f), Double.valueOf(((GeoStaticPreviewInput.Item) ((Pair) obj2).d()).f));
            default:
                return jw5.b(Integer.valueOf(((yj20.c) obj).a()), Integer.valueOf(((yj20.c) obj2).a()));
        }
    }
}
