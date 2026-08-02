package xsna;

import android.net.Uri;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.uploader.api.model.ClipUploadStatus;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.clips.uploader.api.model.ClipUploaderParams;
import com.vk.clips.uploader.api.task.ClipVideoFileUploadTask;
import com.vk.clips.uploader.impl.model.ClipUploadJobInternal;
import com.vk.clips.uploader.impl.model.DraftRef;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.common.id.UserId;
import com.vk.stat.model.builders.clips.ClipsUploadErrorsEventBuilder;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$CancelPublish;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPublishItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.ded;
import xsna.klf;
import xsna.led;
import xsna.lgj0;
import xsna.rlf;

/* compiled from: ClipsUploadControllerImpl.kt */
/* loaded from: classes17.dex */
public final class fef implements eef {
    public final nlf a;
    public final u2f b;
    public final Object c = new Object();
    public final io.reactivex.rxjava3.subjects.f<List<Pair<ClipUploadJob, ded>>> d = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.subjects.f<Pair<ClipUploadJob, ded>> e = new io.reactivex.rxjava3.subjects.f<>();
    public final ConcurrentHashMap<Integer, ClipVideoFileUploadTask> f = new ConcurrentHashMap<>();
    public final oed g;
    public final bpn0 h;

    /* compiled from: ClipsUploadControllerImpl.kt */
    public static final class a {
        public static ded a(ClipUploadStatus clipUploadStatus) {
            if (clipUploadStatus instanceof ClipUploadStatus.Canceled) {
                return ded.b.a;
            }
            if (clipUploadStatus instanceof ClipUploadStatus.ClientProcessingDone) {
                return new ded.f(30);
            }
            if (clipUploadStatus instanceof ClipUploadStatus.ClientProcessingProgress) {
                return new ded.f((int) (((ClipUploadStatus.ClientProcessingProgress) clipUploadStatus).c * 0.3f));
            }
            if (clipUploadStatus instanceof ClipUploadStatus.Done) {
                return ded.c.a;
            }
            if (clipUploadStatus instanceof ClipUploadStatus.Error) {
                return new ded.e(((ClipUploadStatus.Error) clipUploadStatus).c);
            }
            if (clipUploadStatus instanceof ClipUploadStatus.ShortVideoCreateExecuted) {
                return new ded.f(30);
            }
            if (clipUploadStatus instanceof ClipUploadStatus.Started) {
                return ded.i.a;
            }
            if (clipUploadStatus instanceof ClipUploadStatus.UploadingProgress) {
                return new ded.f((int) ((((ClipUploadStatus.UploadingProgress) clipUploadStatus).c * 0.7f) + 30.000002f));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: ClipsUploadControllerImpl.kt */
    public final class b {
        public b() {
        }

        public final void a(ClipUploadJobInternal clipUploadJobInternal) {
            UserId e;
            String str;
            fef fefVar = fef.this;
            oed oedVar = fefVar.g;
            ClipUploadJob clipUploadJob = clipUploadJobInternal.b;
            DraftRef draftRef = clipUploadJobInternal.g;
            oedVar.c(clipUploadJob.b);
            ConcurrentHashMap<Integer, ClipVideoFileUploadTask> concurrentHashMap = fefVar.f;
            int i = clipUploadJob.b;
            int i2 = clipUploadJob.b;
            Integer num = clipUploadJob.d;
            concurrentHashMap.remove(Integer.valueOf(i));
            nlf nlfVar = fefVar.a;
            ClipsEncoderParameters clipsEncoderParameters = clipUploadJobInternal.c;
            File file = clipsEncoderParameters.f;
            ClipUploaderData.Author author = clipUploadJob.c;
            UserId e2 = author != null ? author.e() : null;
            if (file != null && file.exists() && e2 != null && num != null) {
                l9f a = nlfVar.f().a().a(file, author, num.intValue(), new gef(fefVar, file, clipUploadJobInternal));
                nlfVar.f().c().getClass();
                com.vk.upload.impl.a.i(a);
                xke logger = nlfVar.getLogger();
                StringBuilder b = ji.b(i2, "cover upload task for ", " started, preview=");
                b.append(file.getAbsolutePath());
                logger.d("ClipsUploadControllerImpl", b.toString());
            }
            if (nlfVar.getConfig().a()) {
                ClipUploaderParams clipUploaderParams = clipUploadJobInternal.d;
                if (!(clipUploaderParams != null ? epx.f(clipUploaderParams.h, Boolean.TRUE) : false)) {
                    vhk0.b(clipUploadJob.j);
                }
                ArrayList e3 = yiz.e(clipsEncoderParameters.b);
                ArrayList arrayList = new ArrayList(c5g.u(e3, 10));
                Iterator it = e3.iterator();
                while (it.hasNext()) {
                    arrayList.add(Boolean.valueOf(vhk0.c(((Uri) it.next()).getPath())));
                }
                DraftRef.Full full = draftRef instanceof DraftRef.Full ? (DraftRef.Full) draftRef : null;
                if (full != null) {
                    ClipsDraft clipsDraft = full.b;
                    for (ClipsEditorInputVideoItem clipsEditorInputVideoItem : clipsDraft.b.d) {
                        vhk0.b(clipsEditorInputVideoItem.b);
                        vhk0.b(clipsEditorInputVideoItem.g);
                    }
                    List<? extends List<ClipsDraftMusicInfo>> list = clipsDraft.b.l;
                    if (list != null) {
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((List) it2.next()).iterator();
                            while (it3.hasNext()) {
                                vhk0.c(((ClipsDraftMusicInfo) it3.next()).b.g);
                            }
                        }
                    }
                }
            }
            if (draftRef != null) {
                if (draftRef instanceof DraftRef.Full) {
                    str = ((DraftRef.Full) draftRef).b.b.b;
                } else {
                    if (!(draftRef instanceof DraftRef.IdOnly)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = ((DraftRef.IdOnly) draftRef).b;
                }
                if (str != null) {
                    u2f u2fVar = fefVar.b;
                    if (u2fVar != null) {
                        u2fVar.a(str);
                    }
                    rlf d = nlfVar.d();
                    if (d != null) {
                        d.b(new led.a(str));
                    }
                }
            }
            if (author == null || (e = author.e()) == null || num == null) {
                return;
            }
            int intValue = num.intValue();
            nlfVar.f().getClass();
            qlf qlfVar = new qlf(nlfVar);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            nlfVar.getLogger().d("ClipsUploadControllerImpl", tgw.b(i2, "server processing listener for ", " started"));
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append('_');
            sb.append(intValue);
            io.reactivex.rxjava3.core.q c = nlfVar.c(lgj0.a.c(Collections.singletonList(sb.toString()), null));
            q40 q40Var = new q40(new pe1(13), 9);
            c.getClass();
            io.reactivex.rxjava3.internal.operators.observable.q2 q2Var = new io.reactivex.rxjava3.internal.operators.observable.q2(new io.reactivex.rxjava3.internal.operators.observable.z1(c, q40Var), new com.vk.movika.sdk.base.hooks.k(new yve(qlfVar, 2), 13));
            sh6 sh6Var = new sh6(new vh9(atomicBoolean, fefVar, clipUploadJobInternal, 3), 12);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            new io.reactivex.rxjava3.internal.operators.observable.i1(q2Var.E(sh6Var, lVar, kVar, kVar)).subscribe(new sf(new ut6(6, clipUploadJobInternal, fefVar), 16), new tf(new ay0(fefVar, 26), 13));
        }

        public final Pair<ClipUploadJobInternal, Boolean> b(ClipUploadStatus clipUploadStatus, ClipUploadJobInternal clipUploadJobInternal) {
            boolean z;
            ClipUploadJobInternal zb;
            ClipsUploadErrorsEventBuilder.ErrorType errorType;
            ClipUploadJob clipUploadJob = clipUploadJobInternal.b;
            ClipUploadStatus clipUploadStatus2 = clipUploadJobInternal.f;
            fef fefVar = fef.this;
            nlf nlfVar = fefVar.a;
            klf klfVar = (klf) fefVar.h.getValue();
            boolean z2 = true;
            if (klfVar != null) {
                irk0 irk0Var = klfVar.a;
                String str = clipUploadJobInternal.h;
                MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem = clipUploadJobInternal.e;
                if (mobileOfficialAppsClipsStat$TypeClipUploadItem != null) {
                    if (clipUploadStatus instanceof ClipUploadStatus.Canceled) {
                        ded a = a.a(clipUploadStatus2);
                        int i = ((a instanceof ded.c) || (a instanceof ded.h)) ? 100 : a instanceof ded.f ? ((ded.f) a).a : 0;
                        UiTracker uiTracker = UiTracker.a;
                        new kze(UiTracker.c(), new MobileOfficialAppsClipsStat$TypeClipPublishItem(MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.CANCEL_PUBLISH, new MobileOfficialAppsClipsStat$ClipsCreateContext(mobileOfficialAppsClipsStat$TypeClipUploadItem.b().b(), mobileOfficialAppsClipsStat$TypeClipUploadItem.b().a()), null, new MobileOfficialAppsClipsStat$CancelPublish((int) (mobileOfficialAppsClipsStat$TypeClipUploadItem.c() * ((i * 1.0f) / 100)), mobileOfficialAppsClipsStat$TypeClipUploadItem.c()), null, null, null, null, null, null, null, 2036, null), irk0Var).q();
                    } else if (clipUploadStatus instanceof ClipUploadStatus.Done) {
                        new ClipsUploadErrorsEventBuilder(new ClipsUploadErrorsEventBuilder.a.c(null, str, true), ClipsUploadErrorsEventBuilder.b.C1786b.a, Integer.valueOf(mobileOfficialAppsClipsStat$TypeClipUploadItem.b().b()), irk0Var).q();
                    } else if (clipUploadStatus instanceof ClipUploadStatus.Error) {
                        Throwable th = ((ClipUploadStatus.Error) clipUploadStatus).c;
                        if (th == null) {
                            th = new klf.a("error happened for upload with id=" + clipUploadJob.b);
                        }
                        Throwable th2 = th;
                        while (true) {
                            if (th2 == null) {
                                errorType = ClipsUploadErrorsEventBuilder.ErrorType.OTHER;
                                break;
                            }
                            if (th2 instanceof ClipVideoFileUploadTask.Exception) {
                                int i2 = sed.$EnumSwitchMapping$0[((ClipVideoFileUploadTask.Exception) th2).d().ordinal()];
                                if (i2 == 1) {
                                    errorType = ClipsUploadErrorsEventBuilder.ErrorType.UPLOAD_LIBRARY;
                                } else if (i2 == 2) {
                                    errorType = ClipsUploadErrorsEventBuilder.ErrorType.TRANSCODER;
                                } else if (i2 == 3) {
                                    errorType = ClipsUploadErrorsEventBuilder.ErrorType.MISSING_FILE;
                                } else {
                                    if (i2 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    errorType = ClipsUploadErrorsEventBuilder.ErrorType.SHORT_VIDEO_API;
                                }
                            } else {
                                if (th2.equals(th2.getCause())) {
                                    errorType = ClipsUploadErrorsEventBuilder.ErrorType.OTHER;
                                    break;
                                }
                                th2 = th2.getCause();
                            }
                        }
                        new ClipsUploadErrorsEventBuilder(new ClipsUploadErrorsEventBuilder.a.c(errorType, str, true), new ClipsUploadErrorsEventBuilder.b.a(th), Integer.valueOf(mobileOfficialAppsClipsStat$TypeClipUploadItem.b().b()), irk0Var).q();
                    }
                }
            }
            if (clipUploadStatus instanceof ClipUploadStatus.Canceled) {
                zb = ClipUploadJobInternal.zb(clipUploadJobInternal, null, null, null, null, clipUploadStatus, null, null, 495);
            } else if (clipUploadStatus instanceof ClipUploadStatus.ClientProcessingDone) {
                ClipUploadStatus.ClientProcessingDone clientProcessingDone = (ClipUploadStatus.ClientProcessingDone) clipUploadStatus;
                zb = ClipUploadJobInternal.zb(clipUploadJobInternal, ClipUploadJob.a(clipUploadJobInternal.b, null, null, null, false, null, null, clientProcessingDone.c, null, 767), null, null, null, clientProcessingDone, null, null, 494);
            } else if (clipUploadStatus instanceof ClipUploadStatus.ClientProcessingProgress) {
                int i3 = clipUploadStatus2 instanceof ClipUploadStatus.ClientProcessingProgress ? ((ClipUploadStatus.ClientProcessingProgress) clipUploadStatus2).c : clipUploadStatus2 instanceof ClipUploadStatus.UploadingProgress ? ((ClipUploadStatus.UploadingProgress) clipUploadStatus2).c : 0;
                int i4 = ((ClipUploadStatus.ClientProcessingProgress) clipUploadStatus).c;
                z = (i3 == 0 && i4 != 0) || i4 - i3 > 3;
                if (z) {
                    zb = ClipUploadJobInternal.zb(clipUploadJobInternal, null, null, null, null, clipUploadStatus, null, null, 495);
                    z2 = z;
                }
                zb = clipUploadJobInternal;
                z2 = z;
            } else if (clipUploadStatus instanceof ClipUploadStatus.Done) {
                zb = ClipUploadJobInternal.zb(clipUploadJobInternal, null, null, null, null, clipUploadStatus, null, null, 495);
            } else if (clipUploadStatus instanceof ClipUploadStatus.Error) {
                ClipUploadStatus.Error error = (ClipUploadStatus.Error) clipUploadStatus;
                Throwable th3 = error.c;
                if (th3 != null) {
                    nlfVar.getLogger().b(th3);
                }
                DraftRef draftRef = clipUploadJobInternal.g;
                DraftRef.Full full = draftRef instanceof DraftRef.Full ? (DraftRef.Full) draftRef : null;
                if (full != null) {
                    ClipsDraft clipsDraft = full.b;
                    u2f u2fVar = fefVar.b;
                    if (u2fVar != null) {
                        u2fVar.b(clipsDraft);
                    }
                    rlf d = nlfVar.d();
                    if (d != null) {
                        d.b(new led.c(clipsDraft.b.b));
                    }
                    nlfVar.getLogger().d("ClipsUploadControllerImpl", i5s.a(new StringBuilder("draft "), clipsDraft.b.b, " added back to storage"));
                }
                fefVar.f.remove(Integer.valueOf(clipUploadJob.b));
                zb = ClipUploadJobInternal.zb(clipUploadJobInternal, null, null, null, null, error, null, null, 495);
            } else if (clipUploadStatus instanceof ClipUploadStatus.ShortVideoCreateExecuted) {
                ClipUploadStatus.ShortVideoCreateExecuted shortVideoCreateExecuted = (ClipUploadStatus.ShortVideoCreateExecuted) clipUploadStatus;
                zb = ClipUploadJobInternal.zb(clipUploadJobInternal, ClipUploadJob.a(clipUploadJobInternal.b, null, Integer.valueOf(shortVideoCreateExecuted.c), null, false, null, null, null, null, 1019), null, null, null, shortVideoCreateExecuted, null, shortVideoCreateExecuted.d, 430);
            } else if (clipUploadStatus instanceof ClipUploadStatus.Started) {
                zb = ClipUploadJobInternal.zb(clipUploadJobInternal, null, null, null, null, clipUploadStatus, null, null, 495);
            } else {
                if (!(clipUploadStatus instanceof ClipUploadStatus.UploadingProgress)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = clipUploadStatus2 instanceof ClipUploadStatus.ClientProcessingProgress ? ((ClipUploadStatus.ClientProcessingProgress) clipUploadStatus2).c : clipUploadStatus2 instanceof ClipUploadStatus.UploadingProgress ? ((ClipUploadStatus.UploadingProgress) clipUploadStatus2).c : 0;
                int i6 = clipUploadStatus instanceof ClipUploadStatus.ClientProcessingProgress ? ((ClipUploadStatus.ClientProcessingProgress) clipUploadStatus).c : ((ClipUploadStatus.UploadingProgress) clipUploadStatus).c;
                z = (i5 == 0 && i6 != 0) || i6 - i5 > 3;
                if (z) {
                    zb = ClipUploadJobInternal.zb(clipUploadJobInternal, null, null, null, null, clipUploadStatus, null, null, 495);
                    z2 = z;
                }
                zb = clipUploadJobInternal;
                z2 = z;
            }
            return new Pair<>(zb, Boolean.valueOf(z2));
        }
    }

    public fef(nlf nlfVar, u2f u2fVar, defpackage.h hVar) {
        this.a = nlfVar;
        this.b = u2fVar;
        oed oedVar = new oed(nlfVar);
        this.g = oedVar;
        this.h = new bpn0(new im0(hVar, 22));
        ra raVar = new ra(this, 24);
        if (oedVar.b) {
            wmi0.a.f("clips.uploads", nlfVar.e()).subscribe(new eu0(new du0(7, oedVar, raVar), 12), new fu0(new fb(oedVar, 25), 10));
        } else {
            new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        }
    }

    public static com.vk.clips.uploader.api.model.b o(ClipUploadJobInternal clipUploadJobInternal) {
        ClipUploadJob clipUploadJob = clipUploadJobInternal.b;
        int i = clipUploadJob.b;
        ClipUploaderData.Author author = clipUploadJob.c;
        return new com.vk.clips.uploader.api.model.b(i, author, clipUploadJobInternal.c, clipUploadJobInternal.d, clipUploadJobInternal.e, author != null, clipUploadJob.j, clipUploadJobInternal.i, clipUploadJobInternal.j);
    }

    public static Pair p(ClipUploadJobInternal clipUploadJobInternal, ClipUploaderData clipUploaderData) {
        DraftRef draftRef;
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint a2;
        String str = clipUploaderData.e;
        MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem = clipUploaderData.c;
        ClipUploaderParams clipUploaderParams = clipUploaderData.b;
        if (str != null) {
            DraftRef draftRef2 = clipUploadJobInternal.g;
            if (draftRef2 instanceof DraftRef.Full) {
                boolean f = epx.f(((DraftRef.Full) draftRef2).b.b.b, str);
                draftRef = draftRef2;
                if (!f) {
                    draftRef = new DraftRef.IdOnly(str);
                }
            } else if (draftRef2 instanceof DraftRef.IdOnly) {
                DraftRef.IdOnly idOnly = (DraftRef.IdOnly) draftRef2;
                boolean f2 = epx.f(idOnly.b, str);
                draftRef = idOnly;
                if (!f2) {
                    draftRef = new DraftRef.IdOnly(str);
                }
            } else {
                if (draftRef2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                draftRef = new DraftRef.IdOnly(str);
            }
        } else {
            draftRef = clipUploadJobInternal.g;
        }
        DraftRef draftRef3 = draftRef;
        ClipUploadJob clipUploadJob = clipUploadJobInternal.b;
        ClipUploaderData.Author author = clipUploaderData.d;
        Integer num = clipUploaderParams.t;
        Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
        boolean z = clipUploaderParams.d != null;
        MobileOfficialAppsClipsStat$ClipsCreateContext b2 = mobileOfficialAppsClipsStat$TypeClipUploadItem.b();
        ClipUploadJobInternal zb = ClipUploadJobInternal.zb(clipUploadJobInternal, ClipUploadJob.a(clipUploadJob, author, null, valueOf, z, (b2 == null || (a2 = b2.a()) == null) ? null : wrp.b(a2), clipUploaderParams.u, null, clipUploaderParams.g, 269), clipUploaderData.a, clipUploaderParams, mobileOfficialAppsClipsStat$TypeClipUploadItem, null, draftRef3, null, 80);
        return new Pair(o(zb), zb);
    }

    @Override // xsna.eef
    public final void a(int i) {
        synchronized (this.c) {
            ClipUploadJobInternal clipUploadJobInternal = this.g.c.get(Integer.valueOf(i));
            if (clipUploadJobInternal == null) {
                this.a.getLogger().h("ClipsUploadControllerImpl", "retry failed, upload task with id=" + i + " doesn't exist or was deleted");
                return;
            }
            ClipUploadStatus clipUploadStatus = clipUploadJobInternal.f;
            if ((clipUploadStatus instanceof ClipUploadStatus.Canceled) || (clipUploadStatus instanceof ClipUploadStatus.Error)) {
                ClipUploadJobInternal zb = ClipUploadJobInternal.zb(clipUploadJobInternal, null, null, null, null, new ClipUploadStatus.Started(i), null, null, 495);
                this.g.b(zb);
                n(o(zb), zb);
                return;
            }
            this.a.getLogger().h("ClipsUploadControllerImpl", "retry failed, upload task with (id=" + i + ", lastStatus=" + clipUploadJobInternal.f + " is not in correct state to retry");
        }
    }

    @Override // xsna.eef
    public final io.reactivex.rxjava3.core.q<List<Pair<ClipUploadJob, ded>>> b() {
        return this.d;
    }

    @Override // xsna.eef
    public final void c(int i) {
        synchronized (this.c) {
            ClipVideoFileUploadTask clipVideoFileUploadTask = this.f.get(Integer.valueOf(i));
            if (clipVideoFileUploadTask == null) {
                this.a.getLogger().h("ClipsUploadControllerImpl", "cancel failed, upload task with id=" + i + " doesn't exist or was deleted");
                return;
            }
            this.a.f().c().getClass();
            com.vk.upload.impl.a.b(clipVideoFileUploadTask.getId(), null);
            this.f.remove(Integer.valueOf(i));
            this.a.getLogger().d("ClipsUploadControllerImpl", "cancel executed for task with id=" + i);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.eef
    public final void clear() {
        synchronized (this.c) {
            try {
                this.a.getLogger().d("ClipsUploadControllerImpl", "clear clips upload cache");
                for (ClipVideoFileUploadTask clipVideoFileUploadTask : this.f.values()) {
                    this.a.f().c().getClass();
                    com.vk.upload.impl.a.b(clipVideoFileUploadTask.getId(), null);
                }
                this.f.clear();
                oed oedVar = this.g;
                oedVar.d.await();
                oedVar.c.clear();
                if (oedVar.b) {
                    wmi0.a.c("clips.uploads");
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.eef
    public final void d(int i) {
        ClipUploadJobInternal clipUploadJobInternal;
        ClipUploadJob clipUploadJob;
        File file;
        synchronized (this.c) {
            try {
                ClipVideoFileUploadTask clipVideoFileUploadTask = this.f.get(Integer.valueOf(i));
                Object obj = null;
                if (clipVideoFileUploadTask != null) {
                    this.a.f().c().getClass();
                    com.vk.upload.impl.a.b(clipVideoFileUploadTask.getId(), null);
                    this.f.remove(Integer.valueOf(i));
                }
                Set<ClipUploadJobInternal> a2 = this.g.a();
                ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
                for (ClipUploadJobInternal clipUploadJobInternal2 : a2) {
                    arrayList.add(clipUploadJobInternal2.b.b == i ? new Pair(clipUploadJobInternal2, ded.g.a) : new Pair(clipUploadJobInternal2, a.a(clipUploadJobInternal2.f)));
                }
                k(arrayList);
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((ClipUploadJobInternal) ((Pair) next).i()).b.b == i) {
                        obj = next;
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                if (pair != null) {
                    m((ClipUploadJobInternal) pair.i(), (ded) pair.j());
                }
                if (this.a.getConfig().a() && (clipUploadJobInternal = this.g.c.get(Integer.valueOf(i))) != null && (clipUploadJob = clipUploadJobInternal.b) != null && (file = clipUploadJob.j) != null) {
                    this.a.a().submit(new x52(file, 2));
                }
                this.g.c(i);
                this.a.getLogger().d("ClipsUploadControllerImpl", "remove executed for task with id=" + i);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.eef
    public final List<Pair<ClipUploadJob, ded>> e() {
        Set<ClipUploadJobInternal> a2 = this.g.a();
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        for (ClipUploadJobInternal clipUploadJobInternal : a2) {
            arrayList.add(new Pair(clipUploadJobInternal.b, a.a(clipUploadJobInternal.f)));
        }
        return arrayList;
    }

    @Override // xsna.eef
    public final io.reactivex.rxjava3.core.q<List<fif>> f() {
        return this.d.U(new c7(new wh6(this), 17));
    }

    @Override // xsna.eef
    public final ClipUploadJob g(Integer num, ClipUploaderData clipUploaderData) {
        synchronized (this.c) {
            ClipUploadJobInternal clipUploadJobInternal = this.g.c.get(num);
            if (clipUploadJobInternal == null) {
                this.a.getLogger().h("ClipsUploadControllerImpl", "updateUploadJob failed, upload task with id=" + num + " doesn't exist or was deleted");
                return null;
            }
            Pair p = p(clipUploadJobInternal, clipUploaderData);
            com.vk.clips.uploader.api.model.b bVar = (com.vk.clips.uploader.api.model.b) p.d();
            ClipUploadJobInternal clipUploadJobInternal2 = (ClipUploadJobInternal) p.g();
            ClipVideoFileUploadTask clipVideoFileUploadTask = this.f.get(num);
            if (clipVideoFileUploadTask == null) {
                this.a.getLogger().d("ClipsUploadControllerImpl", "uploadTask doesn't exist, create new one for id=" + num);
                clipVideoFileUploadTask = n(bVar, clipUploadJobInternal2);
            }
            this.g.b(clipUploadJobInternal2);
            clipVideoFileUploadTask.a(bVar);
            ClipUploadJob clipUploadJob = clipUploadJobInternal2.b;
            myc0.h(zvj.a(edi.m(this.a.b())), null, null, new hef(clipUploaderData, this, clipUploadJob, null), 3);
            return clipUploadJob;
        }
    }

    @Override // xsna.eef
    public final ClipUploadJob h(ClipsEncoderParameters clipsEncoderParameters) {
        ClipUploadJob clipUploadJob;
        synchronized (this.c) {
            int leastSignificantBits = (int) UUID.randomUUID().getLeastSignificantBits();
            ClipUploadJobInternal clipUploadJobInternal = new ClipUploadJobInternal(new ClipUploadJob(leastSignificantBits, null, null, clipsEncoderParameters.f, null, false, null, null, null, null, VideoRecord.DEFAULT_MAX_DIMENSION, null), clipsEncoderParameters, null, null, new ClipUploadStatus.Started(leastSignificantBits), null, null, null, null);
            Pair pair = new Pair(o(clipUploadJobInternal), clipUploadJobInternal);
            com.vk.clips.uploader.api.model.b bVar = (com.vk.clips.uploader.api.model.b) pair.d();
            ClipUploadJobInternal clipUploadJobInternal2 = (ClipUploadJobInternal) pair.g();
            this.g.b(clipUploadJobInternal2);
            n(bVar, clipUploadJobInternal2);
            clipUploadJob = clipUploadJobInternal2.b;
        }
        return clipUploadJob;
    }

    @Override // xsna.eef
    public final io.reactivex.rxjava3.core.q<Pair<ClipUploadJob, ded>> i() {
        return this.e;
    }

    public final void j() {
        Set<ClipUploadJobInternal> a2 = this.g.a();
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        for (ClipUploadJobInternal clipUploadJobInternal : a2) {
            arrayList.add(new Pair(clipUploadJobInternal, a.a(clipUploadJobInternal.f)));
        }
        k(arrayList);
    }

    public final void k(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList2.add(new Pair(((ClipUploadJobInternal) pair.i()).b, pair.j()));
        }
        this.d.onNext(arrayList2);
    }

    public final void l(Pair<ClipUploadJobInternal, ? extends ded> pair) {
        Set<ClipUploadJobInternal> a2 = this.g.a();
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        for (ClipUploadJobInternal clipUploadJobInternal : a2) {
            arrayList.add(new Pair(clipUploadJobInternal, a.a(clipUploadJobInternal.f)));
        }
        k(j5g.v0(pair, arrayList));
        m(pair.i(), pair.j());
    }

    public final void m(ClipUploadJobInternal clipUploadJobInternal, ded dedVar) {
        ClipUploaderParams clipUploaderParams = clipUploadJobInternal.d;
        ClipUploadJob clipUploadJob = clipUploadJobInternal.b;
        rlf.a aVar = new rlf.a(clipUploaderParams, clipUploadJob.c, clipUploadJob, dedVar);
        rlf d = this.a.d();
        if (d != null) {
            d.a(aVar);
        }
        this.e.onNext(new Pair<>(clipUploadJob, dedVar));
    }

    public final ClipVideoFileUploadTask n(com.vk.clips.uploader.api.model.b bVar, ClipUploadJobInternal clipUploadJobInternal) {
        nlf nlfVar = this.a;
        ped a2 = nlfVar.f().a();
        j();
        m(clipUploadJobInternal, a.a(clipUploadJobInternal.f));
        b bVar2 = new b();
        a2.getClass();
        mkf mkfVar = new mkf(bVar, bVar2);
        this.f.put(Integer.valueOf(bVar.a), mkfVar);
        nlfVar.f().c().getClass();
        com.vk.upload.impl.a.i(mkfVar);
        return mkfVar;
    }

    @Override // xsna.eef
    public final Set<File> s0() {
        Set<ClipUploadJobInternal> a2 = this.g.a();
        HashSet hashSet = new HashSet();
        for (ClipUploadJobInternal clipUploadJobInternal : a2) {
            ArrayList e = yiz.e(clipUploadJobInternal.c.b);
            ArrayList arrayList = new ArrayList(c5g.u(e, 10));
            Iterator it = e.iterator();
            while (true) {
                File file = null;
                if (!it.hasNext()) {
                    break;
                }
                String path = ((Uri) it.next()).getPath();
                if (path != null) {
                    file = new File(path);
                }
                arrayList.add(file);
            }
            hashSet.addAll(arrayList);
            DraftRef draftRef = clipUploadJobInternal.g;
            DraftRef.Full full = draftRef instanceof DraftRef.Full ? (DraftRef.Full) draftRef : null;
            if (full != null) {
                ClipsDraftCommonData clipsDraftCommonData = full.b.b;
                List<ClipsEditorInputVideoItem> list = clipsDraftCommonData.d;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ClipsEditorInputVideoItem) it2.next()).b);
                }
                hashSet.addAll(arrayList2);
                List<ClipsEditorInputVideoItem> list2 = clipsDraftCommonData.d;
                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((ClipsEditorInputVideoItem) it3.next()).g);
                }
                hashSet.addAll(arrayList3);
                List<? extends List<ClipsDraftMusicInfo>> list3 = clipsDraftCommonData.l;
                if (list3 != null) {
                    Iterator it4 = c5g.v(list3).iterator();
                    while (it4.hasNext()) {
                        String str = ((ClipsDraftMusicInfo) it4.next()).b.g;
                        hashSet.add(str != null ? new File(str) : null);
                    }
                }
            }
            hashSet.add(clipUploadJobInternal.c.f);
        }
        HashSet hashSet2 = new HashSet();
        j5g.W(hashSet, hashSet2);
        return hashSet2;
    }
}
