package xsna;

import android.net.Uri;
import android.util.Base64;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: DataFetchProducer.java */
/* loaded from: classes12.dex */
public final class auk extends luz {
    public auk(b320 b320Var) {
        super(ac9.b, b320Var);
    }

    @Override // xsna.luz
    public final rip d(ImageRequest imageRequest) throws IOException {
        boolean equals;
        byte[] bytes;
        String uri = imageRequest.b.toString();
        if (!uri.substring(0, 5).equals("data:")) {
            throw new IllegalArgumentException();
        }
        int indexOf = uri.indexOf(44);
        String substring = uri.substring(indexOf + 1, uri.length());
        String substring2 = uri.substring(0, indexOf);
        if (substring2.contains(";")) {
            equals = substring2.split(";")[r5.length - 1].equals("base64");
        } else {
            equals = false;
        }
        if (equals) {
            bytes = Base64.decode(substring, 0);
        } else {
            String decode = Uri.decode(substring);
            decode.getClass();
            bytes = decode.getBytes();
        }
        return c(new ByteArrayInputStream(bytes), bytes.length);
    }

    @Override // xsna.luz
    public final String e() {
        return "DataFetchProducer";
    }
}
