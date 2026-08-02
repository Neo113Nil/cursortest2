package xsna;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.vk.core.exceptions.FileFormatException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import xsna.gbr;
import xsna.z8r;

/* compiled from: FileDocUtils.java */
/* loaded from: classes17.dex */
public final class l8r {

    /* compiled from: FileDocUtils.java */
    public static class a {
        public String a;
        public long b;
        public String c;
        public boolean d;
        public boolean e;
        public int f;
        public int g;
        public String h;
        public int i;
        public int j;

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnalyzeResult{fileName='");
            sb.append(this.a);
            sb.append("', fileSize=");
            sb.append(this.b);
            sb.append(", extension='");
            sb.append(this.c);
            sb.append("', isImage=");
            sb.append(this.d);
            sb.append(", isVideo=");
            sb.append(this.e);
            sb.append(", width=");
            sb.append(this.f);
            sb.append(", height=");
            sb.append(this.g);
            sb.append(", mimeType='");
            return i5s.a(sb, this.h, "'}");
        }
    }

    public static a a(Context context, Uri uri) throws IOException {
        a aVar = new a();
        try {
            File i = com.vk.core.files.a.i(context, uri);
            if (!i.exists() || !i.isFile()) {
                throw new FileNotFoundException("file not found: " + uri);
            }
            aVar.a = i.getName();
            aVar.b = i.length();
            aVar.h = com.vk.core.files.a.l(i);
            String g = com.vk.core.files.a.g(i.getAbsolutePath());
            if (TextUtils.isEmpty(g)) {
                aVar.c = "";
            } else {
                aVar.c = g;
            }
            boolean z = !TextUtils.isEmpty(aVar.h) && aVar.h.startsWith("image");
            boolean z2 = !TextUtils.isEmpty(aVar.h) && aVar.h.startsWith("video");
            if (!z && !z2) {
                aVar.d = false;
                aVar.e = false;
                return aVar;
            }
            if (z) {
                try {
                    z8r.a a2 = z8r.a(context, uri);
                    aVar.d = true;
                    aVar.e = false;
                    aVar.f = a2.a;
                    aVar.g = a2.b;
                    return aVar;
                } catch (IOException unused) {
                    aVar.d = false;
                    return aVar;
                } catch (Exception e) {
                    throw new FileFormatException(e);
                }
            }
            try {
                gbr.a b = gbr.b(context, uri, true);
                aVar.d = false;
                aVar.e = true;
                aVar.f = b.a;
                aVar.g = b.b;
                aVar.i = b.f;
                aVar.j = b.e;
                return aVar;
            } catch (IOException unused2) {
                aVar.e = false;
                return aVar;
            } catch (Exception e2) {
                throw new FileFormatException(e2);
            }
        } catch (FileNotFoundException e3) {
            throw e3;
        } catch (Exception unused3) {
            throw new FileFormatException(i6n0.a(uri, "Unable to convert uri to file: "));
        }
    }
}
