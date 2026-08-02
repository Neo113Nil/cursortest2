package xsna;

import android.content.Context;
import com.vk.photo.editor.gl.GlShaderId;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: GlShadersCodeRepository.kt */
/* loaded from: classes4.dex */
public final class p0u {
    public final Context a;
    public final ConcurrentHashMap<GlShaderId, xh50<String>> b = new ConcurrentHashMap<>();

    public p0u(Context context) {
        this.a = context;
    }

    public final xh50<String> a(GlShaderId glShaderId) {
        ConcurrentHashMap<GlShaderId, xh50<String>> concurrentHashMap = this.b;
        xh50<String> xh50Var = concurrentHashMap.get(glShaderId);
        if (xh50Var != null) {
            return xh50Var;
        }
        InputStream openRawResource = this.a.getResources().openRawResource(glShaderId.h());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int read = openRawResource.read(); read != -1; read = openRawResource.read()) {
            byteArrayOutputStream.write(read);
        }
        openRawResource.close();
        utk0 a = vtk0.a(byteArrayOutputStream.toString());
        concurrentHashMap.put(glShaderId, a);
        return a;
    }
}
