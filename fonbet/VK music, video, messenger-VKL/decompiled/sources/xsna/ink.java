package xsna;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.media3.datasource.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import one.video.player.model.VideoContentType;

/* compiled from: CustomHttpDataSource.kt */
/* loaded from: classes8.dex */
public final class ink implements androidx.media3.datasource.a {
    public final androidx.media3.datasource.a a;
    public final b b;
    public final fe60 c;
    public long d = -1;
    public final Handler e = new Handler(Looper.getMainLooper());

    /* compiled from: CustomHttpDataSource.kt */
    public static final class a implements a.InterfaceC0045a {
        public final hc6 a;
        public final InterfaceC3067a b;
        public final fe60 c;
        public boolean d;
        public final jnk e = new jnk(this);

        /* compiled from: CustomHttpDataSource.kt */
        /* renamed from: xsna.ink$a$a, reason: collision with other inner class name */
        public interface InterfaceC3067a {
            void a(String str, String str2);

            void b();
        }

        public a(hc6 hc6Var, InterfaceC3067a interfaceC3067a, fe60 fe60Var) {
            this.a = hc6Var;
            this.b = interfaceC3067a;
            this.c = fe60Var;
        }

        @Override // androidx.media3.datasource.a.InterfaceC0045a
        public final androidx.media3.datasource.a createDataSource() {
            return new ink(this.a.createDataSource(), this.e, this.c);
        }
    }

    /* compiled from: CustomHttpDataSource.kt */
    public interface b {
        void a(String str, String str2);

        void b(int i);
    }

    public ink(androidx.media3.datasource.a aVar, b bVar, fe60 fe60Var) {
        this.a = aVar;
        this.b = bVar;
        this.c = fe60Var;
    }

    @Override // androidx.media3.datasource.a
    public final void addTransferListener(mjp0 mjp0Var) {
        this.a.addTransferListener(new uzx0(this, mjp0Var));
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        this.a.close();
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> getResponseHeaders() {
        return new pyu(this.a.getResponseHeaders());
    }

    @Override // androidx.media3.datasource.a
    public final Uri getUri() {
        return this.a.getUri();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bd, code lost:
    
        if (r3.equals("h2c") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c9, code lost:
    
        r12 = "http2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c6, code lost:
    
        if (r3.equals("h2") == false) goto L54;
     */
    @Override // androidx.media3.datasource.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(evk evkVar) {
        String str;
        androidx.media3.datasource.a aVar = this.a;
        long open = aVar.open(evkVar);
        Map<String, List<String>> responseHeaders = aVar.getResponseHeaders();
        int I = y2r0.I(evkVar.a);
        VideoContentType videoContentType = I != 0 ? I != 2 ? null : VideoContentType.HLS : VideoContentType.DASH;
        Handler handler = this.e;
        if (videoContentType != null) {
            List<String> list = responseHeaders.get("X-Playback-Duration");
            fe60 fe60Var = this.c;
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        long parseLong = Long.parseLong(it.next());
                        if (videoContentType != VideoContentType.HLS) {
                            parseLong *= 1000;
                        }
                        if (parseLong != this.d && fe60Var != null) {
                            this.d = parseLong;
                            handler.post(new hnk(this, parseLong, 0));
                            break;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        Log.e("CustomHttpDataSource", "error parse X-Playback-Duration", e);
                    }
                }
            } else {
                long j = 0;
                if (0 != this.d && fe60Var != null) {
                    this.d = 0L;
                    handler.post(new hnk(this, j, 0));
                }
            }
        }
        List<String> list2 = responseHeaders.get("X-Delivery-Type");
        List<String> list3 = responseHeaders.get("X-Reused");
        String str2 = list2 != null ? (String) j5g.b0(0, list2) : null;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != 3274) {
                if (hashCode != 101593) {
                    if (hashCode == 3482174 && str2.equals("quic")) {
                        str = "http3";
                    }
                }
            }
            if (list3 != null || (r0 = (String) j5g.b0(0, list3)) == null) {
                String str3 = "0";
            }
            handler.post(new vc2(this, str, str3, 1));
            return open;
        }
        str = "http1";
        if (list3 != null) {
        }
        String str32 = "0";
        handler.post(new vc2(this, str, str32, 1));
        return open;
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        this.b.b(read);
        return read;
    }
}
