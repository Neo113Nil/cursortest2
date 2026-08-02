package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: BundledExtractorsAdapter.java */
/* loaded from: classes12.dex */
public final class do8 implements androidx.media3.exoplayer.source.l {
    public final tgq a;

    @Nullable
    public pgq b;

    @Nullable
    public tel c;

    public do8(tgq tgqVar) {
        this.a = tgqVar;
    }

    public final long a() {
        tel telVar = this.c;
        if (telVar != null) {
            return telVar.d;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(androidx.media3.datasource.a aVar, Uri uri, Map map, long j, long j2, androidx.media3.exoplayer.source.m mVar) throws IOException {
        tel telVar = new tel(aVar, j, j2);
        this.c = telVar;
        if (this.b != null) {
            return;
        }
        pgq[] createExtractors = this.a.createExtractors(uri, map);
        int length = createExtractors.length;
        ImmutableList.b bVar = ImmutableList.c;
        k15.h(length, "expectedSize");
        ImmutableList.a aVar2 = new ImmutableList.a(length);
        boolean z = true;
        if (createExtractors.length == 1) {
            this.b = createExtractors[0];
        } else {
            int length2 = createExtractors.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                pgq pgqVar = createExtractors[i];
                try {
                } catch (EOFException unused) {
                    if (this.b == null) {
                    }
                } catch (Throwable th) {
                    if (this.b == null && telVar.d != j) {
                        z = false;
                    }
                    fxc0.z(z);
                    telVar.f = 0;
                    throw th;
                }
                if (pgqVar.d(telVar)) {
                    this.b = pgqVar;
                    telVar.f = 0;
                    break;
                }
                aVar2.e(pgqVar.a());
                if (this.b == null) {
                }
                boolean z2 = true;
                fxc0.z(z2);
                telVar.f = 0;
                i++;
            }
            if (this.b == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                op5 op5Var = new op5(", ");
                Iterator it = qhz.e(ImmutableList.n(createExtractors), new tf3(3)).iterator();
                StringBuilder sb2 = new StringBuilder();
                op5Var.a(sb2, it);
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String sb3 = sb.toString();
                uri.getClass();
                throw new UnrecognizedInputFormatException(sb3, uri, aVar2.g());
            }
        }
        this.b.e(mVar);
    }
}
