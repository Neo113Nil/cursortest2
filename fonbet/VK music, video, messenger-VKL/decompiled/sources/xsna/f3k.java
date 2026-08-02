package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.R;
import java.io.File;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.qsl0;

/* compiled from: CoverPhotoUploadTask.kt */
/* loaded from: classes11.dex */
public final class f3k extends oda0<StoryEntry> {
    public final UserId m;
    public String n;
    public JSONObject o;

    /* compiled from: CoverPhotoUploadTask.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static String a(Uri uri) {
            if (drm0.D(uri.toString(), "com.android.providers.media.documents", false)) {
                Context context = e43.a;
                return com.vk.core.files.a.i(context != null ? context : null, uri).getPath();
            }
            if (drm0.D(uri.toString(), "com.android.providers.media.photopicker", false)) {
                return uri.toString();
            }
            if (!oeq0.e(uri)) {
                return uri.getPath();
            }
            Context context2 = e43.a;
            Context context3 = context2 != null ? context2 : null;
            Regex regex = com.vk.core.files.a.a;
            return com.vk.core.files.a.h(context3, uri, System.currentTimeMillis() + "." + com.vk.core.files.a.E(uri)).getPath();
        }
    }

    /* compiled from: CoverPhotoUploadTask.kt */
    public static final class b extends k.a<f3k> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            f3k f3kVar = new f3k(Uri.parse(ny90Var.f(X3.i.b)), new UserId(ny90Var.e("gid")));
            f3kVar.d = ny90Var.c("task_id");
            return f3kVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            f3k f3kVar = (f3k) instantJob;
            ny90Var.o(X3.i.b, f3kVar.i.toString());
            ny90Var.n("gid", f3kVar.m.b);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(f3k f3kVar, ny90 ny90Var) {
            f3k f3kVar2 = f3kVar;
            ny90Var.o(X3.i.b, f3kVar2.i.toString());
            ny90Var.n("gid", f3kVar2.m.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "CoverPhotoUploadTask";
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f3k(Uri uri, UserId userId) {
        super(r3 == null ? "" : r3, X3.i.b, 2);
        String a2 = a.a(uri);
        this.m = userId;
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        Photo photo;
        StoryEntry storyEntry = (StoryEntry) parcelable;
        baq0 a2 = ozg0.a();
        Integer valueOf = (storyEntry == null || (photo = storyEntry.m) == null) ? null : Integer.valueOf(photo.c);
        String str = this.i;
        a2.p(valueOf, str);
        ozg0.a().v(this.o);
        com.vk.core.files.a.e(new File(str));
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        mul0 mul0Var = new mul0(this.n);
        StoryEntry storyEntry = (StoryEntry) rsg0.a0(mul0Var).a();
        this.o = mul0Var.F0();
        return storyEntry;
    }

    @Override // com.vk.upload.impl.b
    public final String a0() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.live_cover_sending);
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        CommonUploadParams commonUploadParams = new CommonUploadParams(null, false, null, this.m, null, null, null, null, null, null, null, false, null, false, null, null, 65527, null);
        StoryUploadParams storyUploadParams = new StoryUploadParams();
        storyUploadParams.Vb();
        s3q0 s3q0Var = s3q0.a;
        qsl0 a2 = qsl0.a.a(commonUploadParams, storyUploadParams);
        this.g = a2.b;
        return rsg0.a0(a2);
    }

    @Override // xsna.oda0, com.vk.upload.impl.tasks.k
    public final String f0() {
        return null;
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) throws UploadException {
        try {
            this.n = new JSONObject(str).getJSONObject("response").optString("upload_result");
        } catch (Exception e) {
            throw new UploadException("can't parse upload response", str, e);
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "CoverPhotoUploadTask";
    }

    @Override // com.vk.upload.impl.tasks.k, com.vk.upload.impl.b, xsna.sp6, xsna.ye6, com.vk.instantjobs.InstantJob
    public final void u(Object obj) {
        super.u(obj);
        ozg0.a().d();
        com.vk.core.files.a.e(new File(this.i));
    }

    @Override // xsna.ye6, com.vk.instantjobs.InstantJob
    public final void v(Object obj, Throwable th) {
        super.v(obj, th);
        ozg0.a().f(th);
        com.vk.core.files.a.e(new File(this.i));
    }
}
