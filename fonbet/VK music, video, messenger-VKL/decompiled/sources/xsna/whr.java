package xsna;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.datatransport.Priority;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.log.L;
import java.io.File;
import java.io.UnsupportedEncodingException;
import xsna.oyg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class whr implements io.reactivex.rxjava3.core.d, oyg0.a {
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ whr(long j, eo5 eo5Var) {
        this.b = j;
        this.c = eo5Var;
    }

    @Override // xsna.oyg0.a
    public Object apply(Object obj) {
        eo5 eo5Var = (eo5) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        String str = eo5Var.a;
        Priority priority = eo5Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(acd0.a(priority))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(acd0.a(priority)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(final io.reactivex.rxjava3.core.b bVar) {
        skr a;
        String replace;
        Uri uri = (Uri) this.c;
        vhr d = vhr.d();
        d.a();
        ejr ejrVar = d.c;
        String str = ejrVar.f;
        if (str == null) {
            a = skr.a(d, null);
        } else {
            try {
                StringBuilder sb = new StringBuilder("gs://");
                d.a();
                sb.append(ejrVar.f);
                a = skr.a(d, u2r0.c(sb.toString()));
            } catch (UnsupportedEncodingException e) {
                Log.e("FirebaseStorage", "Unable to parse bucket:".concat(str), e);
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            }
        }
        String path = uri.getPath();
        if (path == null) {
            bVar.onError(new IllegalStateException(io.reactivex.rxjava3.subjects.c.c("File without path = ", uri, '!')));
            return;
        }
        String str2 = "users/" + this.b + '/' + new File(path).getName();
        exc0.a("location must not be null or empty", !TextUtils.isEmpty(str2));
        String lowerCase = str2.toLowerCase();
        if (lowerCase.startsWith("gs://") || lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) {
            throw new IllegalArgumentException("location should not be a full URL.");
        }
        String str3 = a.d;
        if (TextUtils.isEmpty(str3)) {
            throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
        }
        Uri build = new Uri.Builder().scheme("gs").authority(str3).path(DomExceptionUtils.SEPARATOR).build();
        exc0.j(build, "uri must not be null");
        exc0.a("The supplied bucketname does not match the storage bucket of the current instance.", TextUtils.isEmpty(str3) || build.getAuthority().equalsIgnoreCase(str3));
        exc0.a("childName cannot be null or empty", !TextUtils.isEmpty(str2));
        String w = d02.w(str2);
        Uri.Builder buildUpon = build.buildUpon();
        if (TextUtils.isEmpty(w)) {
            replace = "";
        } else {
            String encode = Uri.encode(w);
            exc0.i(encode);
            replace = encode.replace("%2F", DomExceptionUtils.SEPARATOR);
        }
        ycq0 ycq0Var = new ycq0(new mhl0(buildUpon.appendEncodedPath(replace).build(), a), uri);
        if (ycq0Var.f(2)) {
            zhl0.b.execute(new bi5(ycq0Var, 8));
        }
        ycq0Var.d.a(null, null, new OnCompleteListener() { // from class: xsna.xhr
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                boolean isSuccessful = task.isSuccessful();
                io.reactivex.rxjava3.core.b bVar2 = io.reactivex.rxjava3.core.b.this;
                if (isSuccessful) {
                    L.e("Complete sending auto log!");
                    bVar2.onComplete();
                    return;
                }
                L.e("Error sending auto log!");
                Exception exception = task.getException();
                if (exception != null) {
                    L.i(exception);
                }
                if (exception == null) {
                    exception = new Exception();
                }
                bVar2.onError(exception);
            }
        });
        ycq0Var.c.a(null, null, new OnFailureListener() { // from class: xsna.yhr
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                L.e("Failure sending auto log!");
                com.vk.metrics.eventtracking.b.a.a(exc);
                io.reactivex.rxjava3.core.b.this.onError(exc);
            }
        });
    }

    public /* synthetic */ whr(Uri uri, zhr zhrVar, long j) {
        this.c = uri;
        this.b = j;
    }
}
