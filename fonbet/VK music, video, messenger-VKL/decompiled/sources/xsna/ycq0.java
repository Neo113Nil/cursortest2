package xsna;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.StorageException;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.commons.http.Http;
import xsna.fhl0;

/* compiled from: UploadTask.java */
/* loaded from: classes13.dex */
public final class ycq0 extends xhl0<b> {
    public static final Random B = new Random();
    public static final k15 C = new k15();
    public static final jcl D = jcl.a;
    public final mhl0 k;
    public final Uri l;
    public final fk0 m;

    @Nullable
    public final yfx o;

    @Nullable
    public final wfx p;
    public final maq r;
    public final boolean s;
    public volatile fhl0 t;
    public volatile Uri u;
    public volatile Exception v;
    public volatile String y;
    public volatile long z;
    public final AtomicLong n = new AtomicLong(0);
    public int q = SQLiteDatabase.OPEN_PRIVATECACHE;
    public volatile Exception w = null;
    public volatile int x = 0;
    public int A = 0;

    /* compiled from: UploadTask.java */
    public class a implements Runnable {
        public final /* synthetic */ feg0 b;

        public a(feg0 feg0Var) {
            this.b = feg0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ycq0 ycq0Var = ycq0.this;
            u2r0.b(ycq0Var.o);
            String a = u2r0.a(ycq0Var.p);
            vhr vhrVar = ycq0Var.k.c.a;
            vhrVar.a();
            this.b.l(vhrVar.a, a);
        }
    }

    /* compiled from: UploadTask.java */
    public class b extends xhl0<b>.b {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ycq0(mhl0 mhl0Var, Uri uri) {
        InputStream inputStream;
        InputStream inputStream2;
        ContentResolver contentResolver;
        long j;
        ParcelFileDescriptor openFileDescriptor;
        this.u = null;
        this.v = null;
        skr skrVar = mhl0Var.c;
        this.k = mhl0Var;
        this.t = null;
        f9e0<yfx> f9e0Var = skrVar.b;
        yfx yfxVar = f9e0Var != null ? f9e0Var.get() : null;
        this.o = yfxVar;
        f9e0<wfx> f9e0Var2 = skrVar.c;
        wfx wfxVar = f9e0Var2 != null ? f9e0Var2.get() : null;
        this.p = wfxVar;
        this.l = uri;
        this.z = 60000L;
        vhr vhrVar = mhl0Var.c.a;
        vhrVar.a();
        this.r = new maq(vhrVar.a, yfxVar, wfxVar);
        try {
            vhr vhrVar2 = mhl0Var.c.a;
            vhrVar2.a();
            contentResolver = vhrVar2.a.getContentResolver();
            try {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                } catch (NullPointerException unused) {
                }
            } catch (IOException unused2) {
                j = -1;
            }
        } catch (FileNotFoundException e) {
            e = e;
            inputStream = null;
        }
        if (openFileDescriptor != null) {
            j = openFileDescriptor.getStatSize();
            try {
                openFileDescriptor.close();
            } catch (IOException unused3) {
                this.l.toString();
                inputStream2 = contentResolver.openInputStream(this.l);
                if (inputStream2 != null) {
                }
                this.m = new fk0(inputStream2);
                this.s = true;
                this.u = null;
            }
            inputStream2 = contentResolver.openInputStream(this.l);
            if (inputStream2 != null) {
                if (j == -1) {
                    try {
                        inputStream2.available();
                    } catch (IOException unused4) {
                    }
                }
                try {
                    inputStream = new BufferedInputStream(inputStream2);
                } catch (FileNotFoundException e2) {
                    inputStream = inputStream2;
                    e = e2;
                    Log.e("UploadTask", "could not locate file for uploading:" + this.l.toString());
                    this.v = e;
                    inputStream2 = inputStream;
                    this.m = new fk0(inputStream2);
                    this.s = true;
                    this.u = null;
                }
                inputStream2 = inputStream;
            }
            this.m = new fk0(inputStream2);
            this.s = true;
            this.u = null;
        }
        j = -1;
        inputStream2 = contentResolver.openInputStream(this.l);
        if (inputStream2 != null) {
        }
        this.m = new fk0(inputStream2);
        this.s = true;
        this.u = null;
    }

    @Override // xsna.xhl0
    public final mhl0 c() {
        return this.k;
    }

    @Override // xsna.xhl0
    public final void d() {
        this.r.d = true;
        feg0 feg0Var = this.u != null ? new feg0(this.k.a(), this.k.c.a, this.u) : null;
        if (feg0Var != null) {
            zhl0.a.execute(new a(feg0Var));
        }
        this.v = StorageException.a(Status.j);
    }

    @Override // xsna.xhl0
    @NonNull
    public final b e() {
        StorageException storageException;
        Exception exc = this.v != null ? this.v : this.w;
        int i = this.x;
        int i2 = StorageException.b;
        if (exc instanceof StorageException) {
            storageException = (StorageException) exc;
        } else if ((i == 0 || (i >= 200 && i < 300)) && exc == null) {
            storageException = null;
        } else {
            storageException = new StorageException(i != -2 ? i != 401 ? i != 409 ? i != 403 ? i != 404 ? -13000 : -13010 : -13021 : -13031 : -13020 : -13030, exc, i);
        }
        this.n.get();
        return new b(this, storageException);
    }

    public final boolean g(ceg0 ceg0Var) {
        int i = ceg0Var.e;
        this.r.getClass();
        if ((i >= 500 && i < 600) || i == -2 || i == 429 || i == 408) {
            i = -2;
        }
        this.x = i;
        this.w = ceg0Var.a;
        this.y = ceg0Var.h("X-Goog-Upload-Status");
        int i2 = this.x;
        return (i2 == 308 || (i2 >= 200 && i2 < 300)) && this.w == null;
    }

    public final boolean h(boolean z) {
        heg0 heg0Var = new heg0(this.k.a(), this.k.c.a, this.u);
        if ("final".equals(this.y) || (!z ? j(heg0Var) : k(heg0Var))) {
            return false;
        }
        if ("final".equals(heg0Var.h("X-Goog-Upload-Status"))) {
            this.v = new IOException("The server has terminated the upload session");
            return false;
        }
        String h = heg0Var.h("X-Goog-Upload-Size-Received");
        long parseLong = !TextUtils.isEmpty(h) ? Long.parseLong(h) : 0L;
        long j = this.n.get();
        if (j > parseLong) {
            this.v = new IOException("Unexpected error. The server lost a chunk update.");
            return false;
        }
        if (j >= parseLong) {
            return true;
        }
        try {
            if (this.m.a((int) r7) != parseLong - j) {
                this.v = new IOException("Unexpected end of stream encountered.");
                return false;
            }
            if (this.n.compareAndSet(j, parseLong)) {
                return true;
            }
            Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
            this.v = new IllegalStateException("uploaded bytes changed unexpectedly.");
            return false;
        } catch (IOException e) {
            Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e);
            this.v = e;
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        mhl0 mhl0Var;
        boolean z;
        this.r.d = false;
        if (!f(4)) {
            return;
        }
        mhl0 mhl0Var2 = this.k;
        Uri uri = mhl0Var2.b;
        String path = uri.getPath();
        JSONObject jSONObject = null;
        if (!TextUtils.isEmpty(path)) {
            String str = DomExceptionUtils.SEPARATOR;
            if (!path.equals(DomExceptionUtils.SEPARATOR)) {
                int lastIndexOf = path.lastIndexOf(47);
                if (lastIndexOf != -1) {
                    str = path.substring(0, lastIndexOf);
                }
                mhl0Var = new mhl0(uri.buildUpon().path(str).build(), mhl0Var2.c);
                if (mhl0Var == null) {
                    this.v = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
                }
                if (this.v == null) {
                    return;
                }
                if (this.u == null) {
                    String str2 = this.t != null ? this.t.a.b : null;
                    if (this.l != null && TextUtils.isEmpty(str2)) {
                        vhr vhrVar = this.k.c.a;
                        vhrVar.a();
                        str2 = vhrVar.a.getContentResolver().getType(this.l);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str2 = Http.ContentType.APPLICATION_OCTET_STREAM;
                    }
                    nhl0 a2 = this.k.a();
                    vhr vhrVar2 = this.k.c.a;
                    if (this.t != null) {
                        fhl0 fhl0Var = this.t;
                        fhl0Var.getClass();
                        HashMap hashMap = new HashMap();
                        fhl0.b<String> bVar = fhl0Var.a;
                        if (bVar.a) {
                            hashMap.put("contentType", bVar.b);
                        }
                        if (fhl0Var.f.a) {
                            hashMap.put("metadata", new JSONObject(fhl0Var.f.b));
                        }
                        fhl0.b<String> bVar2 = fhl0Var.b;
                        if (bVar2.a) {
                            hashMap.put("cacheControl", bVar2.b);
                        }
                        fhl0.b<String> bVar3 = fhl0Var.c;
                        if (bVar3.a) {
                            hashMap.put("contentDisposition", bVar3.b);
                        }
                        fhl0.b<String> bVar4 = fhl0Var.d;
                        if (bVar4.a) {
                            hashMap.put("contentEncoding", bVar4.b);
                        }
                        fhl0.b<String> bVar5 = fhl0Var.e;
                        if (bVar5.a) {
                            hashMap.put("contentLanguage", bVar5.b);
                        }
                        jSONObject = new JSONObject(hashMap);
                    }
                    jeg0 jeg0Var = new jeg0(a2, vhrVar2, jSONObject, str2);
                    if (k(jeg0Var)) {
                        String h = jeg0Var.h("X-Goog-Upload-URL");
                        if (!TextUtils.isEmpty(h)) {
                            this.u = Uri.parse(h);
                        }
                    }
                } else {
                    h(false);
                }
                boolean m = m();
                while (m) {
                    try {
                        this.m.b(this.q);
                        int min = Math.min(this.q, this.m.c);
                        deg0 deg0Var = new deg0(this.k.a(), this.k.c.a, this.u, this.m.b, this.n.get(), min, this.m.d);
                        try {
                            int i = this.A;
                            k15 k15Var = C;
                            int nextInt = i + B.nextInt(250);
                            k15Var.getClass();
                            Thread.sleep(nextInt);
                            z = j(deg0Var);
                            if (z) {
                                this.A = 0;
                            }
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            this.w = e;
                            z = false;
                        }
                        if (z) {
                            this.n.getAndAdd(min);
                            fk0 fk0Var = this.m;
                            if (fk0Var.d) {
                                try {
                                    this.t = new fhl0.a(deg0Var.g(), this.k).a();
                                    f(4);
                                    f(128);
                                } catch (JSONException e2) {
                                    Log.e("UploadTask", "Unable to parse resulting metadata from upload:" + deg0Var.f, e2);
                                    this.v = e2;
                                }
                            } else {
                                fk0Var.a(min);
                                int i2 = this.q;
                                if (i2 < 33554432) {
                                    this.q = i2 * 2;
                                }
                            }
                        } else {
                            this.q = SQLiteDatabase.OPEN_PRIVATECACHE;
                        }
                    } catch (IOException e3) {
                        Log.e("UploadTask", "Unable to read bytes for uploading", e3);
                        this.v = e3;
                    }
                    m = m();
                    if (m) {
                        f(4);
                    }
                }
                if (!this.s || this.h == 16) {
                    return;
                }
                try {
                    this.m.a.close();
                    return;
                } catch (IOException e4) {
                    Log.e("UploadTask", "Unable to close stream.", e4);
                    return;
                }
            }
        }
        mhl0Var = null;
        if (mhl0Var == null) {
        }
        if (this.v == null) {
        }
    }

    public final boolean j(ceg0 ceg0Var) {
        u2r0.b(this.o);
        String a2 = u2r0.a(this.p);
        vhr vhrVar = this.k.c.a;
        vhrVar.a();
        ceg0Var.l(vhrVar.a, a2);
        return g(ceg0Var);
    }

    public final boolean k(ceg0 ceg0Var) {
        int i;
        maq maqVar = this.r;
        maqVar.getClass();
        maq.g.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + 600000;
        u2r0.b(maqVar.b);
        ceg0Var.l(maqVar.a, u2r0.a(maqVar.c));
        int i2 = 1000;
        while (true) {
            maq.g.getClass();
            if (SystemClock.elapsedRealtime() + i2 > elapsedRealtime || ceg0Var.j() || (((i = ceg0Var.e) < 500 || i >= 600) && i != -2 && i != 429 && i != 408)) {
                break;
            }
            try {
                k15 k15Var = maq.f;
                int nextInt = maq.e.nextInt(250) + i2;
                k15Var.getClass();
                Thread.sleep(nextInt);
                if (i2 < 30000) {
                    i2 = ceg0Var.e != -2 ? i2 * 2 : 1000;
                }
                if (maqVar.d) {
                    break;
                }
                ceg0Var.a = null;
                ceg0Var.e = 0;
                u2r0.b(maqVar.b);
                ceg0Var.l(maqVar.a, u2r0.a(maqVar.c));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        return g(ceg0Var);
    }

    public final boolean l() {
        if (!"final".equals(this.y)) {
            return true;
        }
        if (this.v == null) {
            this.v = new IOException("The server has terminated the upload session", this.w);
        }
        f(64);
        return false;
    }

    public final boolean m() {
        if (this.h != 128) {
            if (Thread.interrupted()) {
                this.v = new InterruptedException();
                f(64);
                return false;
            }
            if (this.h == 32) {
                f(256);
                return false;
            }
            if (this.h == 8) {
                f(16);
                return false;
            }
            if (l()) {
                if (this.u == null) {
                    if (this.v == null) {
                        this.v = new IllegalStateException("Unable to obtain an upload URL.");
                    }
                    f(64);
                    return false;
                }
                if (this.v != null) {
                    f(64);
                    return false;
                }
                boolean z = this.w != null || this.x < 200 || this.x >= 300;
                jcl jclVar = D;
                jclVar.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() + this.z;
                jclVar.getClass();
                long elapsedRealtime2 = SystemClock.elapsedRealtime() + this.A;
                if (!z) {
                    return true;
                }
                if (elapsedRealtime2 <= elapsedRealtime && h(true)) {
                    this.A = Math.max(this.A * 2, 1000);
                    return true;
                }
                if (l()) {
                    f(64);
                }
            }
        }
        return false;
    }
}
