package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.exceptions.ImEngineException;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.im.engine.models.upload.ResumableAttachUploadInfo;
import com.vk.im.engine.reporters.VideoConversionReporter;
import com.vk.im.log.LogLevel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import kotlin.text.Regex;
import xsna.eeg0;
import xsna.l8r;
import xsna.qr6;

/* compiled from: BaseVideoUploader.kt */
/* loaded from: classes2.dex */
public abstract class qr6 extends yjt<AttachWithVideo, iot0, iot0, aet0> {
    public static final /* synthetic */ int q = 0;
    public final f9w k;
    public final Context l;
    public final tcq0 m;
    public final gzs<f8r> n;
    public final int o;
    public ResumableAttachUploadInfo p;

    /* compiled from: BaseVideoUploader.kt */
    public final class a implements m7r0 {
        public final long b;
        public final long c;

        public a(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        @Override // xsna.m7r0
        public final void onProgress(int i, int i2) {
            double d = this.b;
            long j = this.c;
            qr6.this.onProgress((int) ((i / j) + ((d / j) * i2)), i2);
        }
    }

    /* compiled from: BaseVideoUploader.kt */
    public static final class b {
        public final Uri a;
        public final String b;
        public final long c;
        public final String d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;

        public b(Uri uri, String str, long j, String str2, int i, int i2, int i3, int i4) {
            this.a = uri;
            this.b = str;
            this.c = j;
            this.d = str2;
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = i4;
        }
    }

    public qr6(w2w w2wVar, AttachWithVideo attachWithVideo) {
        super(w2wVar, attachWithVideo);
        this.k = e9w.a(qr6.class);
        this.l = w2wVar.getContext();
        this.m = w2wVar.I0().upload();
        this.n = w2wVar.getConfig().a.l;
        this.o = attachWithVideo.xb();
    }

    @Override // xsna.yjt, xsna.odq0
    public final g2z a(Attach attach, dh30 dh30Var) {
        tcq0 tcq0Var = this.m;
        int i = this.o;
        ResumableAttachUploadInfo g = tcq0Var.g(i);
        f9w f9wVar = this.k;
        if (g != null) {
            f9wVar.e(new oe5(2, this, g));
            this.p = g;
        } else {
            f9wVar.getClass();
            if (!f9wVar.d(LogLevel.VERBOSE)) {
                String str = f9wVar.a;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.v, new Object[]{str, tgw.b(i, "UPLOAD_TRACE upload: no existing upload info found for attach ", ", creating new session")});
                }
            }
            this.p = new ResumableAttachUploadInfo(this.b.N0(), this.o, "", false, false, "", "", 0L, -1L, "");
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.d;
            StringBuilder sb = new StringBuilder("UPLOAD_TRACE Uploading attach ");
            sb.append(attach.xb());
            sb.append(", uploadInfo ");
            ResumableAttachUploadInfo resumableAttachUploadInfo = this.p;
            if (resumableAttachUploadInfo == null) {
                resumableAttachUploadInfo = null;
            }
            sb.append(resumableAttachUploadInfo);
            L.u(l2, logType, new Object[]{"BaseVideoUploader", sb.toString()});
        }
        return super.a(attach, dh30Var);
    }

    @Override // xsna.yjt
    public final void b() {
        super.b();
        this.m.e(this.o);
        ResumableAttachUploadInfo resumableAttachUploadInfo = this.p;
        if (resumableAttachUploadInfo == null) {
            resumableAttachUploadInfo = null;
        }
        if (resumableAttachUploadInfo.m()) {
            ResumableAttachUploadInfo resumableAttachUploadInfo2 = this.p;
            String l = (resumableAttachUploadInfo2 != null ? resumableAttachUploadInfo2 : null).l();
            Regex regex = com.vk.core.files.a.a;
            vhk0.c(l);
        }
    }

    @Override // xsna.odq0
    public final boolean c(Attach attach) {
        return attach instanceof AttachVideo;
    }

    @Override // xsna.yjt
    public final Uri d() {
        Uri p;
        ResumableAttachUploadInfo resumableAttachUploadInfo = this.p;
        if (resumableAttachUploadInfo == null) {
            resumableAttachUploadInfo = null;
        }
        if (resumableAttachUploadInfo.o()) {
            this.k.debug(new ah(this, 7));
            ResumableAttachUploadInfo resumableAttachUploadInfo2 = this.p;
            return Uri.parse((resumableAttachUploadInfo2 != null ? resumableAttachUploadInfo2 : null).l());
        }
        f9w f9wVar = this.k;
        f9wVar.getClass();
        if (!f9wVar.d(LogLevel.VERBOSE)) {
            String str = f9wVar.a;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.v, new Object[]{str, "UPLOAD_TRACE convert: starting conversion for attach " + this.o});
            }
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.d;
            StringBuilder sb = new StringBuilder("UPLOAD_TRACE converting file ");
            ResumableAttachUploadInfo resumableAttachUploadInfo3 = this.p;
            if (resumableAttachUploadInfo3 == null) {
                resumableAttachUploadInfo3 = null;
            }
            sb.append(resumableAttachUploadInfo3);
            L.u(l2, logType, new Object[]{"BaseVideoUploader", sb.toString()});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = r().c;
        try {
            if (((AttachWithVideo) this.c).V6() != null) {
                this.k.debug(new jb(3));
                bb3 bb3Var = this.b.getConfig().a.m;
                p = new tdw().a(((AttachWithVideo) this.c).V6(), this);
            } else {
                this.k.debug(new pr6(0));
                p = p();
            }
            b s = s(this.l, p);
            ResumableAttachUploadInfo resumableAttachUploadInfo4 = this.p;
            ResumableAttachUploadInfo a2 = ResumableAttachUploadInfo.a(resumableAttachUploadInfo4 == null ? null : resumableAttachUploadInfo4, s.a.toString(), s.b, s.d, s.c);
            this.p = a2;
            this.m.b(a2);
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            int i = this.o;
            VideoConversionReporter.CallContext callContext = VideoConversionReporter.CallContext.MESSAGES;
            long j2 = s.c;
            SparseArray<VideoConversionReporter.a> sparseArray = VideoConversionReporter.a;
            synchronized (VideoConversionReporter.class) {
                VideoConversionReporter.a.put(i, new VideoConversionReporter.a.C1126a(callContext, j2, j, uptimeMillis2));
            }
            return p;
        } catch (Exception e) {
            f9w f9wVar2 = this.k;
            f9wVar2.getClass();
            if (f9wVar2.d(LogLevel.ERROR)) {
                throw e;
            }
            String str2 = f9wVar2.a;
            L l3 = L.a;
            l3.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                throw e;
            }
            L.w(l3, L.LogType.e, e, new Object[]{str2, "UPLOAD_TRACE convert: Conversion failed for attach " + this.o}, null, null, 24);
            throw e;
        }
    }

    @Override // xsna.yjt
    public final Uri f() {
        this.k.debug(new com.vk.movika.sdk.base.logic.processor.h(this, 6));
        return Uri.parse(((AttachWithVideo) this.c).b5());
    }

    @Override // xsna.yjt
    public final aet0 j(iot0 iot0Var) {
        iot0 iot0Var2 = iot0Var;
        return new aet0(iot0Var2.a, iot0Var2.b, iot0Var2.f, iot0Var2.g);
    }

    @Override // xsna.yjt
    public boolean l() {
        return ((AttachWithVideo) this.c).V6() != null || this.n.invoke().b(this.b.getContext(), f());
    }

    @Override // xsna.yjt
    public final Attach n(aet0 aet0Var) {
        Bitmap createVideoThumbnail;
        aet0 aet0Var2 = aet0Var;
        AttachWithVideo attachWithVideo = (AttachWithVideo) this.c;
        AttachWithVideo copy = attachWithVideo.copy();
        copy.setId(aet0Var2.a);
        copy.c(aet0Var2.b);
        copy.E(aet0Var2.c);
        ResumableAttachUploadInfo resumableAttachUploadInfo = this.p;
        ResumableAttachUploadInfo resumableAttachUploadInfo2 = null;
        if (resumableAttachUploadInfo == null) {
            resumableAttachUploadInfo = null;
        }
        String l = resumableAttachUploadInfo.l();
        if (l == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        copy.i8(l);
        VideoFile A = copy.A();
        HashMap hashMap = new HashMap(copy.A().w9().b);
        VideoUrl videoUrl = VideoUrl.URL_240;
        String str = aet0Var2.d;
        if (str != null) {
            if (!myc0.f(str)) {
                str = null;
            }
            if (str != null) {
                VideoUrlStorage.b bVar = VideoUrlStorage.c;
                VideoUrlStorage.d.b(hashMap, videoUrl, str);
            }
        }
        A.ua(new VideoUrlStorage(hashMap));
        if (attachWithVideo.V6() != null) {
            try {
                ResumableAttachUploadInfo resumableAttachUploadInfo3 = this.p;
                if (resumableAttachUploadInfo3 != null) {
                    resumableAttachUploadInfo2 = resumableAttachUploadInfo3;
                }
                String path = Uri.parse(resumableAttachUploadInfo2.l()).getPath();
                if (path != null && (createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(path, 1)) != null) {
                    File c = this.b.a1().c("jpg");
                    if (c.createNewFile()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(c);
                        try {
                            createVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                            createVideoThumbnail.recycle();
                            s3q0 s3q0Var = s3q0.a;
                            fileOutputStream.close();
                            Serializer.c<ImageList> cVar = ImageList.CREATOR;
                            copy.n3(new ImageList(new Image(copy.getWidth(), copy.getHeight(), Uri.fromFile(c).toString(), false)));
                            return copy;
                        } finally {
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return copy;
    }

    @Override // xsna.yjt
    public final Object o(Uri uri, Object obj) {
        String q2;
        iot0 iot0Var = (iot0) obj;
        ocq0 ocq0Var = iot0Var.e;
        String str = ocq0Var.a;
        String str2 = ocq0Var.b;
        f9w f9wVar = this.k;
        f9wVar.getClass();
        String str3 = f9wVar.a;
        boolean d = f9wVar.d(LogLevel.VERBOSE);
        int i = this.o;
        if (!d) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.v, new Object[]{str3, com.vk.movika.sdk.base.model.history.b.b(i, "UPLOAD_TRACE upload: starting upload with primary URL for attach ", ", uploadUrl=", str)});
            }
        }
        if (str2 != null && !str2.equals(str)) {
            f9wVar.debug(new q(str2, 7));
        }
        try {
            if (!f9wVar.d(LogLevel.VERBOSE)) {
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.v, new Object[]{str3, "UPLOAD_TRACE upload: attempting primary upload URL for attach " + i});
                }
            }
            q2 = q(uri, str);
        } catch (Exception e) {
            f9wVar.b(e, new j4(2, this, e));
            if (str2 == null || str2.equals(str)) {
                if (f9wVar.d(LogLevel.ERROR)) {
                    throw e;
                }
                L l3 = L.a;
                l3.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    throw e;
                }
                L.w(l3, L.LogType.e, e, new Object[]{str3, tgw.b(i, "UPLOAD_TRACE upload: no fallback URL available for attach ", ", rethrowing exception")}, null, null, 24);
                throw e;
            }
            if (!f9wVar.d(LogLevel.VERBOSE)) {
                L l4 = L.a;
                l4.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l4, L.LogType.v, new Object[]{str3, com.vk.movika.sdk.base.model.history.b.b(i, "UPLOAD_TRACE upload: trying fallback URL for attach ", ", fallbackUrl=", str2)});
                }
            }
            try {
                q2 = q(uri, str2);
            } catch (Exception e2) {
                f9wVar.b(e2, new s(3, this, e2));
                throw e2;
            }
        }
        String str4 = q2;
        if (str4 == null) {
            f9wVar.c(new zg(this, 8));
        } else if (!f9wVar.d(LogLevel.VERBOSE)) {
            L l5 = L.a;
            l5.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l5, L.LogType.v, new Object[]{str3, lhg.a(i, "UPLOAD_TRACE upload: successfully uploaded attach ")});
            }
        }
        return new iot0(iot0Var.a, iot0Var.b, iot0Var.c, iot0Var.d, iot0Var.e, iot0Var.f, str4);
    }

    public final Uri p() {
        int i = this.o;
        b r = r();
        ra raVar = new ra(r, 10);
        f9w f9wVar = this.k;
        f9wVar.debug(raVar);
        File c = this.b.a1().c("mp4");
        Uri uri = r.a;
        f9wVar.debug(new uk(4, c, uri));
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"BaseVideoUploader", "UPLOAD_TRACE converting file " + r + " into target " + c});
        }
        try {
            Uri g = rte0.c.g(this.b, uri, c, this.n.invoke(), this);
            f9wVar.getClass();
            if (!f9wVar.d(LogLevel.VERBOSE)) {
                String str = f9wVar.a;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.v, new Object[]{str, "UPLOAD_TRACE convertSimple: successfully converted file for attach " + i});
                }
            }
            return g;
        } catch (Exception e) {
            f9wVar.getClass();
            if (f9wVar.d(LogLevel.ERROR)) {
                throw e;
            }
            String str2 = f9wVar.a;
            L l3 = L.a;
            l3.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                throw e;
            }
            L.w(l3, L.LogType.e, e, new Object[]{str2, "UPLOAD_TRACE convertSimple: conversion failed for attach " + i}, null, null, 24);
            throw e;
        }
    }

    public final String q(Uri uri, String str) {
        final b bVar;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        String str3;
        final qr6 qr6Var = this;
        qr6Var.k.e(new j3(4, qr6Var, str));
        ResumableAttachUploadInfo resumableAttachUploadInfo = qr6Var.p;
        if (resumableAttachUploadInfo == null) {
            resumableAttachUploadInfo = null;
        }
        int i5 = 3;
        if (epx.f(str, resumableAttachUploadInfo.n())) {
            qr6Var.k.debug(new com.vk.movika.tools.controls.seekbar.f(2, str, qr6Var));
        } else {
            qr6Var.k.debug(new dy0(i5, qr6Var, str));
            ResumableAttachUploadInfo resumableAttachUploadInfo2 = qr6Var.p;
            if (resumableAttachUploadInfo2 == null) {
                resumableAttachUploadInfo2 = null;
            }
            resumableAttachUploadInfo2.u(str);
            ResumableAttachUploadInfo resumableAttachUploadInfo3 = qr6Var.p;
            if (resumableAttachUploadInfo3 == null) {
                resumableAttachUploadInfo3 = null;
            }
            resumableAttachUploadInfo3.q(0L);
        }
        ResumableAttachUploadInfo resumableAttachUploadInfo4 = qr6Var.p;
        if (resumableAttachUploadInfo4 == null) {
            resumableAttachUploadInfo4 = null;
        }
        if (resumableAttachUploadInfo4.o()) {
            qr6Var.k.debug(new ey0(qr6Var, i5));
        } else {
            qr6Var.k.debug(new kr6(0));
            b s = qr6Var.s(qr6Var.l, uri);
            ResumableAttachUploadInfo resumableAttachUploadInfo5 = qr6Var.p;
            if (resumableAttachUploadInfo5 == null) {
                resumableAttachUploadInfo5 = null;
            }
            resumableAttachUploadInfo5.t(s.a.toString());
            resumableAttachUploadInfo5.r(s.b);
            resumableAttachUploadInfo5.s(s.d);
            resumableAttachUploadInfo5.q(0L);
            resumableAttachUploadInfo5.p(s.c);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        b s2 = qr6Var.s(qr6Var.l, uri);
        qr6Var.k.debug(new eb(s2, 5));
        ResumableAttachUploadInfo resumableAttachUploadInfo6 = qr6Var.p;
        if (resumableAttachUploadInfo6 == null) {
            resumableAttachUploadInfo6 = null;
        }
        long h = resumableAttachUploadInfo6.h();
        ResumableAttachUploadInfo resumableAttachUploadInfo7 = qr6Var.p;
        if (resumableAttachUploadInfo7 == null) {
            resumableAttachUploadInfo7 = null;
        }
        final long g = resumableAttachUploadInfo7.g();
        long j = 2097152;
        final long j2 = (g / j) + (g % j != 0 ? 1 : 0);
        long j3 = j2 - 1;
        f9w f9wVar = qr6Var.k;
        final long j4 = h / j;
        gzs<String> gzsVar = new gzs() { // from class: xsna.lr6
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("UPLOAD_TRACE doUpload: starting chunk upload for attach ");
                sb.append(qr6.this.o);
                sb.append(", chunksCount=");
                sb.append(j2);
                tj0.d(sb, ", chunkStart=", j4, ", totalBytes=");
                sb.append(g);
                return sb.toString();
            }
        };
        long j5 = j2;
        long j6 = g;
        f9wVar.e(gzsVar);
        if (j4 <= j3) {
            str2 = null;
            while (true) {
                final long j7 = j4 * j;
                long j8 = j4 + 1;
                long min = Math.min(j8 * j, j6);
                final long j9 = j4;
                final long j10 = min - 1;
                final qr6 qr6Var2 = qr6Var;
                long j11 = j;
                final long j12 = j3;
                long j13 = j6;
                final long j14 = j9;
                final qr6 qr6Var3 = qr6Var2;
                qr6Var.k.debug(new gzs() { // from class: xsna.mr6
                    @Override // xsna.gzs
                    public final Object invoke() {
                        StringBuilder b2 = fp.b(j9, "UPLOAD_TRACE doUpload: uploading chunk ", " of ");
                        b2.append(j12);
                        b2.append(" (range: ");
                        b2.append(j7);
                        b2.append('-');
                        b2.append(j10);
                        b2.append(") for attach ");
                        b2.append(qr6Var2.o);
                        return b2.toString();
                    }
                });
                try {
                    bVar = s2;
                    qr6Var3.k.debug(new gzs() { // from class: xsna.nr6
                        @Override // xsna.gzs
                        public final Object invoke() {
                            StringBuilder sb = new StringBuilder("UPLOAD_TRACE doUpload: building ResumableUploadCall for attach ");
                            sb.append(qr6.this.o);
                            sb.append(", chunk=");
                            sb.append(j14);
                            sb.append(", range=");
                            sb.append(j7);
                            sb.append('-');
                            sb.append(j10);
                            sb.append(", fileName=");
                            qr6.b bVar2 = bVar;
                            sb.append(bVar2.b);
                            sb.append(", mimeType=");
                            sb.append(bVar2.d);
                            sb.append(", fileSize=");
                            sb.append(bVar2.c);
                            return sb.toString();
                        }
                    });
                    eeg0.a aVar = new eeg0.a();
                    aVar.a = "";
                    aVar.b = Integer.MAX_VALUE;
                    aVar.c = "";
                    aVar.d = "";
                    aVar.e = "";
                    aVar.a = str;
                    aVar.c = bVar.b;
                    aVar.d = bVar.d;
                    ResumableAttachUploadInfo resumableAttachUploadInfo8 = qr6Var3.p;
                    if (resumableAttachUploadInfo8 == null) {
                        resumableAttachUploadInfo8 = null;
                    }
                    aVar.e = resumableAttachUploadInfo8.k();
                    aVar.f = bVar.a;
                    try {
                        aVar.g = bVar.c;
                        aVar.h = j7;
                        aVar.i = j10;
                        aVar.j = true;
                        aVar.b = 5;
                        qr6Var = this;
                        long j15 = j5;
                        j5 = j15;
                        ieg0 g2 = bz2.g(new eeg0(aVar), qr6Var.new a(j14, j15));
                        int i6 = 7;
                        if (j14 == j12 && !g2.a) {
                            qr6Var.k.c(new com.vk.movika.sdk.base.logic.processor.actions.g(qr6Var, i6));
                            throw new ImEngineException("We sent last chunk to server, but did receive info about not all chunks were uploaded");
                        }
                        if (g2.a) {
                            String str4 = g2.b;
                            f9w f9wVar2 = qr6Var.k;
                            f9wVar2.getClass();
                            if (!f9wVar2.d(LogLevel.VERBOSE)) {
                                String str5 = f9wVar2.a;
                                L l = L.a;
                                l.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l, L.LogType.v, new Object[]{str5, h5s.c(qr6Var.o, ", directLink received", new StringBuilder("UPLOAD_TRACE doUpload: upload completed for attach "))});
                                }
                            }
                            str2 = str4;
                        }
                        ResumableAttachUploadInfo resumableAttachUploadInfo9 = qr6Var.p;
                        if (resumableAttachUploadInfo9 == null) {
                            resumableAttachUploadInfo9 = null;
                        }
                        resumableAttachUploadInfo9.q(min);
                        tcq0 tcq0Var = qr6Var.m;
                        ResumableAttachUploadInfo resumableAttachUploadInfo10 = qr6Var.p;
                        if (resumableAttachUploadInfo10 == null) {
                            resumableAttachUploadInfo10 = null;
                        }
                        tcq0Var.b(resumableAttachUploadInfo10);
                        qr6Var.k.debug(new com.vk.movika.sdk.base.logic.processor.actions.h(qr6Var, i6));
                        if (j14 == j12) {
                            break;
                        }
                        s2 = bVar;
                        j6 = j13;
                        j4 = j8;
                        j = j11;
                        j3 = j12;
                    } catch (Exception e) {
                        e = e;
                        qr6Var3 = this;
                        j14 = j14;
                        qr6Var3.k.b(e, new or6(qr6Var3, j14, e));
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        } else {
            bVar = s2;
            str2 = null;
        }
        if (str2 == null) {
            qr6Var.k.c(new com.vk.movika.sdk.base.logic.processor.actions.i(qr6Var, 4));
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        qr6Var.k.e(new jr6(qr6Var, uptimeMillis2, bVar));
        int i7 = qr6Var.o;
        VideoConversionReporter.CallContext callContext = VideoConversionReporter.CallContext.MESSAGES;
        long j16 = bVar.c;
        int i8 = bVar.e;
        int i9 = bVar.f;
        int i10 = bVar.g;
        int i11 = bVar.h;
        SparseArray<VideoConversionReporter.a> sparseArray = VideoConversionReporter.a;
        synchronized (VideoConversionReporter.class) {
            try {
                r6m.a.getClass();
                String f = r6m.f();
                String d = r6m.d();
                String str6 = f + (!drm0.N(d) ? ": ".concat(d) : "");
                SparseArray<VideoConversionReporter.a> sparseArray2 = VideoConversionReporter.a;
                VideoConversionReporter.a aVar2 = sparseArray2.get(i7);
                if (aVar2 == null) {
                    VideoConversionReporter.a.b bVar2 = new VideoConversionReporter.a.b(callContext, str6, uptimeMillis2, j16, i8, i11, i9, i10, i9 * i10);
                    str3 = str6;
                    uptimeMillis2 = uptimeMillis2;
                    i = i8;
                    i3 = i11;
                    i2 = i9;
                    i4 = i10;
                    aVar2 = bVar2;
                } else {
                    i = i8;
                    i2 = i9;
                    i3 = i11;
                    i4 = i10;
                    str3 = str6;
                }
                VideoConversionReporter.a.C1126a c1126a = aVar2 instanceof VideoConversionReporter.a.C1126a ? (VideoConversionReporter.a.C1126a) aVar2 : null;
                if (c1126a != null) {
                    c1126a.d = uptimeMillis2;
                    c1126a.b = str3;
                    c1126a.f = i3;
                    c1126a.g = i2;
                    c1126a.h = i4;
                    c1126a.i = i2 * i4;
                    c1126a.e = i;
                }
                com.vk.metrics.eventtracking.b.a.k(aVar2.a());
                sparseArray2.remove(i7);
            } catch (Throwable th) {
                throw th;
            }
        }
        qr6Var.k.debug(new com.vk.movika.sdk.base.model.b(qr6Var, 8));
        return str2;
    }

    public final b r() {
        Object obj = this.c;
        String b5 = ((AttachWithVideo) obj).b5();
        u14 u14Var = new u14(1, b5, this);
        f9w f9wVar = this.k;
        f9wVar.debug(u14Var);
        if (b5.length() != 0) {
            return s(this.l, Uri.parse(b5));
        }
        f9wVar.c(new hg(this, 7));
        throw new IllegalStateException("Attach's localFile is empty. Attach: " + obj);
    }

    public final b s(Context context, Uri uri) {
        Uri uri2;
        f9w f9wVar = this.k;
        try {
            f9wVar.debug(new hh1(uri, 6));
            l8r.a a2 = l8r.a(context, uri);
            uri2 = uri;
            try {
                b bVar = new b(uri2, a2.a, a2.b, a2.h, a2.i, a2.f, a2.g, a2.j);
                f9wVar.debug(new sk(4, uri2, a2));
                return bVar;
            } catch (FileNotFoundException e) {
                e = e;
                FileNotFoundException fileNotFoundException = e;
                f9wVar.getClass();
                if (!f9wVar.d(LogLevel.ERROR)) {
                    String str = f9wVar.a;
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.w(l, L.LogType.e, fileNotFoundException, new Object[]{str, i6n0.a(uri2, "UPLOAD_TRACE getVideoFileInfo: FileNotFoundException for ")}, null, null, 24);
                    }
                }
                throw new IllegalStateException(i6n0.a(uri2, "Video file doesn't exist: "), fileNotFoundException);
            } catch (IOException e2) {
                e = e2;
                IOException iOException = e;
                f9wVar.getClass();
                if (!f9wVar.d(LogLevel.ERROR)) {
                    String str2 = f9wVar.a;
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.w(l2, L.LogType.e, iOException, new Object[]{str2, i6n0.a(uri2, "UPLOAD_TRACE getVideoFileInfo: IOException for ")}, null, null, 24);
                    }
                }
                throw new IllegalStateException(i6n0.a(uri2, "Video file cannot be read: "), iOException);
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            uri2 = uri;
        } catch (IOException e4) {
            e = e4;
            uri2 = uri;
        }
    }
}
