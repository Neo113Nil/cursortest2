package xsna;

import android.content.Context;
import com.vk.music.view.vkmix.gl.GLShaderId;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: GLShadersCodeRepository.kt */
/* loaded from: classes3.dex */
public final class b2t {
    public final Context a;
    public final ConcurrentHashMap<GLShaderId, xh50<String>> b = new ConcurrentHashMap<>();

    public b2t(Context context) {
        this.a = context;
    }

    public final xh50<String> a(GLShaderId gLShaderId) {
        ConcurrentHashMap<GLShaderId, xh50<String>> concurrentHashMap = this.b;
        xh50<String> xh50Var = concurrentHashMap.get(gLShaderId);
        if (xh50Var != null) {
            return xh50Var;
        }
        InputStream openRawResource = this.a.getResources().openRawResource(gLShaderId.h());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int read = openRawResource.read(); read != -1; read = openRawResource.read()) {
            byteArrayOutputStream.write(read);
        }
        openRawResource.close();
        utk0 a = vtk0.a(byteArrayOutputStream.toString());
        concurrentHashMap.put(gLShaderId, a);
        return a;
    }
}
