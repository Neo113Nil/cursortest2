package ru.mail.libverify.requests;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.download.Command;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.SocketTimeoutException;
import java.util.Locale;
import ru.mail.libverify.u.w;
import ru.mail.verify.core.utils.ClientException;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.ServerException;
import ru.mail.verify.core.utils.json.JsonParseException;
import ru.ok.android.commons.http.Http;
import xsna.bqy;

/* loaded from: classes9.dex */
public final class d extends e<ru.mail.libverify.m.d, d> {

    @NonNull
    private final bqy<ru.mail.libverify.w.b> i;
    private int j;

    @NonNull
    private String k;

    public d(@NonNull w wVar, @NonNull bqy bqyVar, @NonNull String str, @NonNull String str2) {
        super(wVar.getContext(), wVar.D(), new ru.mail.libverify.j0.h(str, str2));
        this.k = "";
        this.i = bqyVar;
        this.j = 10000;
    }

    @Override // ru.mail.libverify.j0.k
    @Nullable
    public final /* bridge */ /* synthetic */ ru.mail.libverify.k0.a a(@NonNull String str) throws JsonParseException {
        return null;
    }

    @Override // ru.mail.libverify.j0.k
    @Nullable
    public final ru.mail.libverify.k0.a e(@NonNull ru.mail.verify.core.utils.b bVar) throws ClientException, ServerException, IOException {
        ru.mail.verify.core.utils.c cVar = (ru.mail.verify.core.utils.c) bVar;
        String a = cVar.a(Http.Header.CONTENT_LENGTH, false);
        if (TextUtils.isEmpty(a)) {
            throw new ClientException("Empty content length", ClientException.a.DEFAULT);
        }
        try {
            long parseLong = Long.parseLong(a);
            FileLog.v("ContentApiRequest", "Expected content length for id: %s is %d", this.h.a(), Long.valueOf(parseLong));
            if (parseLong > 5000000) {
                Locale locale = Locale.US;
                FileLog.e("ContentApiRequest", "Too big content length " + parseLong + " (max: 5000000)");
                throw new ClientException("Too big content length", ClientException.a.DEFAULT);
            }
            ru.mail.libverify.w.d b = this.i.get().b(this.h.a());
            if (b == null) {
                FileLog.e("ContentApiRequest", "Failed to get an editor for id: %s", this.h.a());
                FileLog.d("ContentApiRequest", "Download content to memory for id: %s", this.h.a());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                cVar.a(byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                String a2 = cVar.a(Command.HTTP_HEADER_ETAG, false);
                ru.mail.libverify.m.d dVar = new ru.mail.libverify.m.d();
                dVar.a(new ByteArrayInputStream(byteArray));
                dVar.a(a2 != null ? a2 : "");
                return dVar;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ru.mail.verify.core.utils.c cVar2 = (ru.mail.verify.core.utils.c) bVar;
                cVar2.a(byteArrayOutputStream2);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream3);
                String a3 = cVar2.a(Command.HTTP_HEADER_ETAG, false);
                if (a3 == null) {
                    throw new FileNotFoundException("Header ETag not found");
                }
                objectOutputStream.writeObject(new ru.mail.libverify.w.a(a3, byteArrayOutputStream2.toByteArray()));
                if (b.c() != null) {
                    b.c().write(byteArrayOutputStream3.toByteArray());
                    b.b();
                }
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                String a4 = cVar2.a(Command.HTTP_HEADER_ETAG, false);
                ru.mail.libverify.m.d dVar2 = new ru.mail.libverify.m.d();
                dVar2.a(new ByteArrayInputStream(byteArray2));
                dVar2.a(a4 != null ? a4 : "");
                return dVar2;
            } catch (Throwable th) {
                b.a();
                throw th;
            }
        } catch (NumberFormatException unused) {
            throw new ClientException("Wrong content length format", ClientException.a.DEFAULT);
        }
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final Integer f() {
        return Integer.valueOf(this.j);
    }

    @Override // ru.mail.libverify.j0.k
    @Nullable
    public final String k() {
        if (TextUtils.isEmpty(this.k)) {
            return null;
        }
        return this.k;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final Integer q() {
        return Integer.valueOf(this.j);
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.j0.m t() throws JsonParseException {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    @Override // ru.mail.libverify.j0.k
    @NonNull
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ru.mail.libverify.m.d b() throws ClientException, ServerException, IOException {
        Throwable e;
        ru.mail.libverify.w.a aVar;
        InputStream a = this.i.get().a(this.h.a());
        if (a == null) {
            FileLog.d("ContentApiRequest", "Cache not found for key: %s", this.h.a());
            return (ru.mail.libverify.m.d) super.b();
        }
        try {
            try {
                aVar = (ru.mail.libverify.w.a) new ObjectInputStream(a).readObject();
            } catch (Throwable th) {
                th.printStackTrace();
                return (ru.mail.libverify.m.d) super.b();
            }
        } catch (SocketTimeoutException | ServerException e2) {
            e = e2;
            aVar = null;
        }
        try {
            this.k = aVar.b();
            this.j = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
            return (ru.mail.libverify.m.d) super.b();
        } catch (SocketTimeoutException e3) {
            e = e3;
            if (aVar != null) {
                throw e;
            }
            boolean z = e instanceof SocketTimeoutException;
            if (!z && ((ServerException) e).a() != 304) {
                throw e;
            }
            FileLog.d("ContentApiRequest", z ? "Timeout expired. Use content from cache." : "Server returned 304. Use content from cache.");
            ru.mail.libverify.m.d dVar = new ru.mail.libverify.m.d();
            dVar.a(new ByteArrayInputStream(aVar.a()));
            dVar.a(aVar.b());
            dVar.a((ru.mail.libverify.m.d) this);
            dVar.e();
            return dVar;
        } catch (ServerException e4) {
            e = e4;
            if (aVar != null) {
            }
        }
    }
}
