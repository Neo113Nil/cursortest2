package xsna;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.clips.uploader.api.model.ClipUploadStatus;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.clips.uploader.api.task.ClipVideoFileUploadTask;
import com.vk.clips.uploader.impl.model.ClipUploadJobInternal;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.common.ClipVideoFile;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import com.vkontakte.android.R;
import java.io.File;
import java.io.RandomAccessFile;
import kotlin.Pair;
import kotlin.random.Random;
import kotlin.text.Regex;
import xsna.fef;

/* compiled from: ClipsUploadTaskVkImpl.kt */
/* loaded from: classes17.dex */
public final class mkf extends rsu<ClipVideoFile> implements ClipVideoFileUploadTask, w8i {
    public final Object A;
    public final Object B;
    public boolean C;
    public File D;
    public volatile ied E;
    public volatile Throwable F;
    public volatile boolean G;
    public com.vk.clips.uploader.api.model.b u;
    public final fef.b v;
    public final String w;
    public final bpn0 x;
    public final bpn0 y;
    public ClipUploadStatus z;

    /* compiled from: ClipsUploadTaskVkImpl.kt */
    public static final class b implements mdq0 {
        public b() {
        }

        @Override // xsna.mdq0
        public final void a(long j, long j2) {
            int i = (int) ((j / j2) * 100);
            mkf mkfVar = mkf.this;
            mkfVar.c0(i, 200, false);
            mkfVar.o0(new ClipUploadStatus.UploadingProgress(mkfVar.d, i));
        }
    }

    public mkf(com.vk.clips.uploader.api.model.b bVar, fef.b bVar2) {
        super(String.valueOf(bVar.a));
        this.u = bVar;
        this.v = bVar2;
        String str = "ClipsUploadTaskVkImpl$" + this.u.a;
        this.w = str;
        this.x = new bpn0(new zy(this, 28));
        this.y = new bpn0(new yg(this, 28));
        this.z = new ClipUploadStatus.Started(this.u.a);
        this.A = new Object();
        this.B = new Object();
        com.vk.clips.uploader.api.model.b bVar3 = this.u;
        this.d = bVar3.a;
        this.C = bVar3.f;
        this.D = bVar3.g;
        L.p(str, "task created, id=" + this.d + ", uploadUnlocked=" + this.C + ", processedFile=" + this.D);
    }

    public static final void n0(mkf mkfVar) {
        synchronized (mkfVar.B) {
            mkfVar.B.notifyAll();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.sp6
    public final void M() {
        int j;
        MobileOfficialAppsClipsStat$ClipsCreateContext b2;
        L.p(this.w, "prepare clip upload");
        File file = this.D;
        this.F = null;
        this.E = null;
        if (file != null && file.exists() && file.length() != 0) {
            L.p(this.w, "processedFile=" + file.getAbsolutePath() + " already exists in beforeUpload");
            o0(new ClipUploadStatus.ClientProcessingDone(this.d, file));
            return;
        }
        this.D = null;
        L.p(this.w, "start encoding task in beforeUpload");
        o0(new ClipUploadStatus.ClientProcessingProgress(this.d, 0));
        ClipsEncoderParameters.LicensedMusicInfo licensedMusicInfo = this.u.c.g;
        if (licensedMusicInfo != null) {
            File file2 = licensedMusicInfo.b;
            Regex regex = com.vk.core.files.a.a;
            if (!vhk0.g(file2)) {
                io.reactivex.rxjava3.internal.operators.observable.g.subscribe(ple.a(licensedMusicInfo.d, licensedMusicInfo.c));
            }
        }
        File u = com.vk.core.files.a.u();
        com.vk.clips.upload.vk.impl.uploader.a b3 = ((nlf) this.x.getValue()).f().b();
        com.vk.clips.uploader.api.model.b bVar = this.u;
        ClipsEncoderParameters clipsEncoderParameters = bVar.c;
        MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem = bVar.e;
        if (mobileOfficialAppsClipsStat$TypeClipUploadItem == null || (b2 = mobileOfficialAppsClipsStat$TypeClipUploadItem.b()) == null) {
            Random.b.getClass();
            j = Random.c.j();
        } else {
            j = b2.b();
        }
        this.E = new com.vk.clips.upload.vk.impl.uploader.f(b3.a, u, clipsEncoderParameters, new a(), j, b3.b.getLogger()).a();
        while (this.E != null) {
            synchronized (this.B) {
                this.B.wait(1000L);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        Throwable th = this.F;
        if (th != null) {
            this.F = null;
            throw new ClipVideoFileUploadTask.Exception(ClipVideoFileUploadTask.Exception.Type.TRANSCODER, th);
        }
        L.p(this.w, "encoding task finished in beforeUpload");
        o0(new ClipUploadStatus.ClientProcessingDone(this.d, u));
    }

    @Override // com.vk.upload.impl.b, xsna.sp6
    public final void R(Parcelable parcelable) {
        o0(new ClipUploadStatus.Done(this.d));
        super.R(parcelable);
    }

    @Override // com.vk.upload.impl.b, xsna.sp6
    public final void S(Exception exc) {
        o0(new ClipUploadStatus.Error(this.d, exc));
        super.S(exc);
    }

    @Override // xsna.sp6
    public final void U(Exception exc) {
        ied iedVar = this.E;
        if (iedVar != null) {
            iedVar.cancel();
        }
        this.E = null;
        o0(new ClipUploadStatus.Canceled(this.d));
    }

    @Override // xsna.sp6
    public final /* bridge */ /* synthetic */ Parcelable Y() {
        return null;
    }

    @Override // xsna.rsu, xsna.sp6
    public final void Z(String str) {
        String path;
        while (!this.C) {
            synchronized (this.A) {
                this.A.wait(1000L);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        L.p(this.w, "starting upload to server");
        File file = this.D;
        if (file == null) {
            throw new ClipVideoFileUploadTask.Exception(ClipVideoFileUploadTask.Exception.Type.MISSING_FILE, "trying upload with processedFile=null", null);
        }
        Uri parse = Uri.parse(file.getAbsolutePath());
        if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(parse.getScheme())) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            Cursor query = context.getContentResolver().query(parse, new String[]{"_data"}, null, null, null);
            if (query != null) {
                try {
                    path = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                    s3q0 s3q0Var2 = s3q0.a;
                    query.close();
                } finally {
                }
            } else {
                path = null;
            }
        } else {
            path = parse.getPath();
        }
        if (path == null) {
            throw new ClipVideoFileUploadTask.Exception(ClipVideoFileUploadTask.Exception.Type.MISSING_FILE, i6n0.a(parse, "failed to parse "), null);
        }
        File file2 = new File(path);
        if (!file2.exists() || file2.length() <= 0) {
            throw new ClipVideoFileUploadTask.Exception(ClipVideoFileUploadTask.Exception.Type.MISSING_FILE, "fail " + parse + " does not exists, length = " + file2.length(), null);
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
        try {
            ldq0.a(Uri.parse(str), randomAccessFile, 4, new b(), null);
            randomAccessFile.close();
        } finally {
        }
    }

    @Override // com.vk.clips.uploader.api.task.ClipVideoFileUploadTask
    public final void a(com.vk.clips.uploader.api.model.b bVar) {
        this.u = bVar;
        if (bVar.f) {
            this.C = true;
        }
        File file = bVar.g;
        if (file != null) {
            this.D = file;
        }
    }

    @Override // com.vk.upload.impl.b
    public final String a0() {
        ClipUploadStatus clipUploadStatus = this.z;
        return ((clipUploadStatus instanceof ClipUploadStatus.Started) || (clipUploadStatus instanceof ClipUploadStatus.ClientProcessingProgress)) ? y8g0.e(R.string.clips_processing) : y8g0.e(R.string.clips_sending);
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        io.reactivex.rxjava3.core.q U;
        while (!this.C) {
            synchronized (this.A) {
                this.A.wait(1000L);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        File file = this.D;
        if (file == null) {
            return io.reactivex.rxjava3.core.q.H(new ClipVideoFileUploadTask.Exception(ClipVideoFileUploadTask.Exception.Type.MISSING_FILE, "trying to get upload server with uploadFile=null", null));
        }
        long f = z4g.f(file);
        if (f != 0) {
            com.vk.clips.uploader.api.model.b bVar = this.u;
            ClipUploaderData.Author author = bVar.b;
            if (author == null) {
                U = io.reactivex.rxjava3.core.q.H(new IllegalStateException("author is not set"));
            } else {
                U = ((pbf) this.y.getValue()).a(new com.vk.clips.uploader.api.model.a(author, bVar.d, bVar.e), !this.G, f).U(new yi2(new zt4(this, 20), 11));
            }
            return new io.reactivex.rxjava3.internal.operators.observable.o1(U, new nu0(new la2(14), 13));
        }
        try {
            L.p(this.w, "upload file exists: " + file.exists());
            L.p(this.w, "upload file can read: " + file.canRead());
            L.p(this.w, "upload file size: " + com.vk.core.files.a.I(file));
        } catch (Throwable unused) {
        }
        return io.reactivex.rxjava3.core.q.H(new ClipVideoFileUploadTask.Exception(ClipVideoFileUploadTask.Exception.Type.MISSING_FILE, "trying to get upload server with uploadFile not exists", null));
    }

    @Override // com.vk.upload.impl.b
    public final void c0(int i, int i2, boolean z) {
        this.h.d(this, i, i2, false);
    }

    @Override // xsna.rsu
    public final void e0(String str) {
        L.e(this.w, "response: ".concat(str));
    }

    @Override // xsna.rsu
    public final long m0() {
        return PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public final void o0(ClipUploadStatus clipUploadStatus) {
        this.z = clipUploadStatus;
        fef.b bVar = this.v;
        fef fefVar = fef.this;
        synchronized (fefVar.c) {
            ClipUploadJobInternal clipUploadJobInternal = fefVar.g.c.get(Integer.valueOf(clipUploadStatus.S()));
            if (clipUploadJobInternal == null) {
                fefVar.a.getLogger().d("ClipsUploadControllerImpl", "trying apply new status " + clipUploadStatus + " to non-existing upload");
                return;
            }
            fefVar.a.getLogger().d("ClipsUploadControllerImpl", "upload status changed:\n " + clipUploadJobInternal.f + " -> " + clipUploadStatus);
            if (epx.f(clipUploadJobInternal.f, clipUploadStatus)) {
                return;
            }
            ClipUploadStatus clipUploadStatus2 = clipUploadJobInternal.f;
            if (!(clipUploadStatus2 instanceof ClipUploadStatus.Error) && !(clipUploadStatus2 instanceof ClipUploadStatus.Canceled)) {
                Pair<ClipUploadJobInternal, Boolean> b2 = bVar.b(clipUploadStatus, clipUploadJobInternal);
                ClipUploadJobInternal d = b2.d();
                boolean booleanValue = b2.g().booleanValue();
                fefVar.g.b(d);
                if (booleanValue) {
                    fefVar.j();
                    fefVar.m(d, fef.a.a(d.f));
                }
                if (clipUploadStatus instanceof ClipUploadStatus.Done) {
                    bVar.a(d);
                }
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    @Override // com.vk.upload.impl.b, xsna.sp6, com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return this.C ? InstantJob.NotificationShowCondition.WHEN_STARTED : InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return "clip-upload-queue";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return this.w;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean t() {
        return true;
    }

    /* compiled from: ClipsUploadTaskVkImpl.kt */
    public final class a implements hed {
        public a() {
        }

        @Override // xsna.hed
        public final void c(boolean z) {
            L.p(mkf.this.w, "encoding task success");
            mkf mkfVar = mkf.this;
            ied iedVar = mkfVar.E;
            mkfVar.D = iedVar != null ? iedVar.a() : null;
            mkf.this.E = null;
            mkf.this.G = z;
            mkf.n0(mkf.this);
        }

        @Override // xsna.hed
        public final void onCancel() {
            L.p(mkf.this.w, "encoding task canceled");
            mkf.this.E = null;
            mkf mkfVar = mkf.this;
            mkfVar.D = null;
            mkf.n0(mkfVar);
        }

        @Override // xsna.hed
        public final void onError(Throwable th) {
            L.f(mkf.this.w, "encoding task failed", th);
            mkf.this.E = null;
            mkf mkfVar = mkf.this;
            mkfVar.D = null;
            mkfVar.F = th;
            mkf.n0(mkf.this);
        }

        @Override // xsna.hed
        public final void r(int i) {
            mkf mkfVar = mkf.this;
            mkfVar.c0(i, 200, false);
            mkfVar.o0(new ClipUploadStatus.ClientProcessingProgress(mkfVar.d, i));
        }

        @Override // xsna.hed
        public final void s(int i) {
        }
    }
}
