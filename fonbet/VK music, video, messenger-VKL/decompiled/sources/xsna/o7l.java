package xsna;

import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoRendererException;

/* compiled from: DecodeErrorResolver.kt */
/* loaded from: classes2.dex */
public final class o7l implements owp {
    public final HashMap<String, Integer> a = new HashMap<>();

    public static String b(Throwable th) {
        OneVideoRendererException h;
        String d;
        OneVideoPlaybackException oneVideoPlaybackException = th instanceof OneVideoPlaybackException ? (OneVideoPlaybackException) th : null;
        if (oneVideoPlaybackException == null || (h = oneVideoPlaybackException.h()) == null || (d = h.d()) == null) {
            return "";
        }
        int length = d.length();
        for (int i = 0; i < length; i++) {
            if (d.charAt(i) == ',') {
                return d.substring(0, i);
            }
        }
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r6.l() != true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r6 <= r5) goto L17;
     */
    @Override // xsna.owp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<avp> a(Throwable th, m7q m7qVar, long j) {
        String b = b(th);
        HashMap<String, Integer> hashMap = this.a;
        int intValue = hashMap.getOrDefault(b, 0).intValue();
        hashMap.put(b, Integer.valueOf(intValue + 1));
        if (intValue < 1) {
            boolean z = th instanceof OneVideoPlaybackException;
            if (z) {
                OneVideoPlaybackException oneVideoPlaybackException = (OneVideoPlaybackException) th;
                if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.RENDERER) {
                    OneVideoRendererException h = oneVideoPlaybackException.h();
                    if (h != null) {
                    }
                    ListBuilder e = e43.e();
                    String a = cqm0.a(b(th));
                    if (a != null) {
                        e.add(new h8l(a));
                    }
                    e.add(l9g0.a);
                    return e.g();
                }
            }
            if (z) {
                int ordinal = OneVideoPlaybackException.ErrorCode.DECODER_INIT_FAILED.ordinal();
                int ordinal2 = OneVideoPlaybackException.ErrorCode.DECODING_RESOURCES_RECLAIMED.ordinal();
                int ordinal3 = ((OneVideoPlaybackException) th).d().ordinal();
                if (ordinal <= ordinal3) {
                }
            }
        }
        return EmptyList.b;
    }

    @Override // xsna.owp
    public final void reset() {
        this.a.clear();
    }
}
