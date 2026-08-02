package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.superapp.provider.SakPrivateSubdir;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Result;

/* compiled from: SecurityFileUtils.kt */
/* loaded from: classes11.dex */
public final class z2i0 {
    public final Object a;
    public final Object b;
    public Serializable c;

    public z2i0(fr6 fr6Var) {
        this.a = fr6Var;
        this.b = e43.l(new g1w0(), new nt50());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.Result$Failure] */
    public static File d(File file, SakPrivateSubdir sakPrivateSubdir) {
        File failure;
        File t = nbr.t(file, sakPrivateSubdir.h());
        t.mkdirs();
        try {
            failure = t.getCanonicalFile();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) == null) {
            t = failure;
        }
        return t;
    }

    public Collection a() {
        List list;
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList != null) {
            return arrayList;
        }
        List list2 = (List) this.b;
        List list3 = (List) ((fr6) this.a).invoke();
        if (list3 == null) {
            tv4.b("Trying to track event before calls initialized", com.vk.metrics.eventtracking.b.a);
            list = list2;
        } else {
            ArrayList u0 = j5g.u0(list3, list2);
            this.c = u0;
            list = u0;
        }
        return list;
    }

    @SuppressLint({"SdCardPath"})
    public boolean b(Uri uri) {
        if (uri == null) {
            par0.a.getClass();
            par0.f("can't share empty uri!");
            return false;
        }
        if (epx.f(uri.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
            return true;
        }
        try {
            String str = (String) ((bpn0) this.c).getValue();
            String path = uri.getPath();
            if (str != null && path != null && brm0.B(path, str, false)) {
                par0.a.getClass();
                par0.f("can't share from private files data=" + uri);
                return false;
            }
        } catch (Throwable unused) {
        }
        try {
            File cacheDir = ((Context) this.a).getCacheDir();
            s3q0 s3q0Var = null;
            File parentFile = cacheDir != null ? cacheDir.getParentFile() : null;
            String path2 = uri.getPath();
            Uri fromFile = path2 != null ? Uri.fromFile(new File(path2).getCanonicalFile()) : null;
            String path3 = fromFile != null ? fromFile.getPath() : null;
            if (parentFile != null && path3 != null) {
                String canonicalPath = parentFile.getCanonicalPath();
                if (!c(path3) && brm0.B(path3, canonicalPath, false)) {
                    par0.a.getClass();
                    par0.f("can't share from private files data=" + uri);
                    return false;
                }
                s3q0Var = s3q0.a;
            }
            if (s3q0Var != null) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            par0.a.getClass();
            par0.d(th);
            return false;
        }
    }

    public boolean c(String str) {
        Context context = (Context) this.a;
        return brm0.B(str, d(context.getFilesDir(), SakPrivateSubdir.STORIES_UPLOADS).getCanonicalPath(), false) || brm0.B(str, d(context.getCacheDir(), SakPrivateSubdir.TEMP_UPLOADS).getCanonicalPath(), false) || brm0.B(str, d(context.getCacheDir(), SakPrivateSubdir.CLIPS_UPLOADS).getCanonicalPath(), false);
    }

    public z2i0(Context context) {
        this.a = context;
        this.b = new bpn0(new y56(7));
        this.c = new bpn0(new z56(this, 10));
    }
}
