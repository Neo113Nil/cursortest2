package xsna;

import android.os.SystemClock;
import com.vk.api.video.VideoSave;
import com.vk.dto.common.id.UserId;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.media.MediaUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import xsna.tzp0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bp0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bp0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte[] a;
        switch (this.b) {
            case 0:
                hp0 hp0Var = (hp0) this.c;
                UserId userId = hp0Var.b;
                int i = hp0Var.d;
                String str = hp0Var.c;
                VideoSave videoSave = new VideoSave(userId, null, null, VideoSave.Target.VIDEO, false, false, null, null, null, null, Collections.EMPTY_LIST, -1, 0L, false);
                videoSave.K("link", str);
                videoSave.C(i, "album_id");
                VideoSave.a u = videoSave.u(0L);
                String str2 = u.a.a;
                try {
                    o260 o260Var = d260.a;
                    if (o260Var == null) {
                        o260Var = null;
                    }
                    a = o260Var.a(str2);
                } catch (Throwable th) {
                    String str3 = u.a.b;
                    if (str3 == null || epx.f(str2, str3)) {
                        throw th;
                    }
                    o260 o260Var2 = d260.a;
                    if (o260Var2 == null) {
                        o260Var2 = null;
                    }
                    a = o260Var2.a(str3);
                }
                JSONObject jSONObject = new JSONObject(new String(a, emb.b));
                if (jSONObject.optInt("response", 0) == 1) {
                    return u;
                }
                if (jSONObject.optInt("error_code", 0) == 7) {
                    throw new MalformedURLException(jSONObject.optString("error_message"));
                }
                throw new Exception(jSONObject.optString("error_message"));
            case 1:
                String absolutePath = ((File) this.c).getAbsolutePath();
                MediaUtils.f d = MediaUtils.a.d(absolutePath);
                return new mat0(new File(absolutePath), false, 0L, StrictMath.min(d != null ? d.f : 60000L, 60000L), false, d, 224);
            case 2:
                Iterator it = ((LinkedHashSet) this.c).iterator();
                while (it.hasNext()) {
                    vhk0.c((String) it.next());
                }
                return s3q0.a;
            case 3:
                rt40 rt40Var = (rt40) this.c;
                tzp0.c.a aVar = rt40.s1;
                xn50.a.c(rt40Var, new hs40(SystemClock.elapsedRealtime()));
                return s3q0.a;
            case 4:
                com.vk.core.performance.device.a aVar2 = (com.vk.core.performance.device.a) this.c;
                long currentTimeMillis = System.currentTimeMillis() + 100;
                Random random = new Random();
                byte[] bArr = new byte[1000];
                int i2 = 0;
                while (System.currentTimeMillis() < currentTimeMillis) {
                    File file = new File(com.vk.core.files.a.j(), l6g.a(i2, ".tmp"));
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    Charset charset = emb.b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, charset));
                    try {
                        random.nextBytes(bArr);
                        bufferedWriter.append((CharSequence) bArr.toString());
                        bufferedWriter.flush();
                        s3q0 s3q0Var = s3q0.a;
                        bufferedWriter.close();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
                        while (bufferedReader.readLine() != null) {
                            try {
                                aVar2.c++;
                            } finally {
                            }
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                        bufferedReader.close();
                        file.delete();
                        i2++;
                    } finally {
                    }
                }
                return Integer.valueOf(i2);
            case 5:
                return ((y9n0) this.c).g(null);
            default:
                okhttp3.p pVar = (okhttp3.p) this.c;
                o260 o260Var3 = d260.a;
                o260 o260Var4 = o260Var3 != null ? o260Var3 : null;
                o260Var4.getClass();
                return ((f8f0) o260Var4.b(NetworkClient.ClientType.CLIENT_DEFAULT).a(pVar)).execute();
        }
    }
}
