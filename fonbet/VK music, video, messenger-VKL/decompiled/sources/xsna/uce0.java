package xsna;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.media.MediaUtils;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoInfoDo;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PublishInteractor.kt */
/* loaded from: classes7.dex */
public final class uce0 implements ice0 {
    public final vbe0 a;
    public final cde0 b;
    public final hee0 c;
    public final jed0 d;
    public final baq0 e;

    public uce0(vbe0 vbe0Var, cde0 cde0Var, hee0 hee0Var, jed0 jed0Var, baq0 baq0Var) {
        this.a = vbe0Var;
        this.b = cde0Var;
        this.c = hee0Var;
        this.d = jed0Var;
        this.e = baq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.ice0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        jce0 jce0Var;
        int i;
        if (continuationImpl instanceof jce0) {
            jce0Var = (jce0) continuationImpl;
            int i2 = jce0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jce0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = jce0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jce0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                jce0Var.label = 1;
                Object a = this.b.a(jce0Var);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        jce0Var = new jce0(this, continuationImpl);
        Object obj2 = jce0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jce0Var.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.ice0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(VideoFile videoFile, ContinuationImpl continuationImpl) {
        kce0 kce0Var;
        int i;
        if (continuationImpl instanceof kce0) {
            kce0Var = (kce0) continuationImpl;
            int i2 = kce0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kce0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = kce0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kce0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                kce0Var.L$0 = null;
                kce0Var.label = 1;
                Object c = this.b.c(videoFile, kce0Var);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        kce0Var = new kce0(this, continuationImpl);
        Object obj2 = kce0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kce0Var.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.ice0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        nce0 nce0Var;
        int i;
        if (continuationImpl instanceof nce0) {
            nce0Var = (nce0) continuationImpl;
            int i2 = nce0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nce0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = nce0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nce0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                nce0Var.L$0 = null;
                nce0Var.label = 1;
                Object d = this.b.d(str, nce0Var);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        nce0Var = new nce0(this, continuationImpl);
        Object obj2 = nce0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nce0Var.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.ice0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ois0 ois0Var, ContinuationImpl continuationImpl) {
        sce0 sce0Var;
        int i;
        Object e;
        if (continuationImpl instanceof sce0) {
            sce0Var = (sce0) continuationImpl;
            int i2 = sce0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sce0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = sce0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sce0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    sce0Var.L$0 = ois0Var;
                    sce0Var.label = 1;
                    e = this.b.e(ois0Var, sce0Var);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ois0Var = (ois0) sce0Var.L$0;
                    kotlin.a.a(obj);
                    e = ((Result) obj).d();
                }
                if (!(e instanceof Result.Failure)) {
                    VideoFile videoFile = (VideoFile) e;
                    wjs0.a(new fyr0(videoFile));
                    if (ois0Var.j == null) {
                        wjs0.a(new cwr0(videoFile, videoFile.I0() + "_0", 28));
                    }
                }
                return e;
            }
        }
        sce0Var = new sce0(this, continuationImpl);
        Object obj2 = sce0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sce0Var.label;
        if (i != 0) {
        }
        if (!(e instanceof Result.Failure)) {
        }
        return e;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.ice0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(UserId userId, ContinuationImpl continuationImpl) {
        qce0 qce0Var;
        int i;
        if (continuationImpl instanceof qce0) {
            qce0Var = (qce0) continuationImpl;
            int i2 = qce0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qce0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = qce0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qce0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                qce0Var.L$0 = null;
                qce0Var.label = 1;
                Object g = this.b.g(userId, qce0Var);
                return g == coroutineSingletons ? coroutineSingletons : g;
            }
        }
        qce0Var = new qce0(this, continuationImpl);
        Object obj2 = qce0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qce0Var.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.ice0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ois0 ois0Var, ContinuationImpl continuationImpl) {
        tce0 tce0Var;
        int i;
        Object h;
        if (continuationImpl instanceof tce0) {
            tce0Var = (tce0) continuationImpl;
            int i2 = tce0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tce0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = tce0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tce0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    tce0Var.L$0 = ois0Var;
                    tce0Var.label = 1;
                    h = this.b.h(ois0Var, tce0Var);
                    if (h == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ois0Var = (ois0) tce0Var.L$0;
                    kotlin.a.a(obj);
                    h = ((Result) obj).d();
                }
                if (!(h instanceof Result.Failure)) {
                    VideoFile videoFile = (VideoFile) h;
                    if (ois0Var.a.k1() > 0 && videoFile.k1() == 0) {
                        wjs0.a(uxr0.a);
                    }
                    wjs0.a(new fyr0(videoFile));
                }
                return h;
            }
        }
        tce0Var = new tce0(this, continuationImpl);
        Object obj2 = tce0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tce0Var.label;
        if (i != 0) {
        }
        if (!(h instanceof Result.Failure)) {
        }
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.ice0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(List list, ContinuationImpl continuationImpl) {
        lce0 lce0Var;
        int i;
        if (continuationImpl instanceof lce0) {
            lce0Var = (lce0) continuationImpl;
            int i2 = lce0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lce0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = lce0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lce0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    mce0 mce0Var = new mce0(this, list, null);
                    lce0Var.L$0 = null;
                    lce0Var.label = 1;
                    obj = myc0.k(b, mce0Var, lce0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        lce0Var = new lce0(this, continuationImpl);
        Object obj2 = lce0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lce0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.ice0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Uri uri, ContinuationImpl continuationImpl) {
        pce0 pce0Var;
        int i;
        if (continuationImpl instanceof pce0) {
            pce0Var = (pce0) continuationImpl;
            int i2 = pce0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pce0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = pce0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pce0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                MediaUtils.d dVar = new MediaUtils.d(0, 0);
                int screenWidth = this.c.getScreenWidth();
                dVar.a = screenWidth;
                dVar.b = an10.b(screenWidth * 0.5625f);
                pce0Var.L$0 = null;
                pce0Var.L$1 = null;
                pce0Var.label = 1;
                Object b = this.a.b(uri, dVar, pce0Var);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        pce0Var = new pce0(this, continuationImpl);
        Object obj2 = pce0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pce0Var.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: all -> 0x0032, CancellationException -> 0x0034, TimeoutCancellationException -> 0x0036, TryCatch #2 {TimeoutCancellationException -> 0x0036, CancellationException -> 0x0034, all -> 0x0032, blocks: (B:11:0x002e, B:12:0x0054, B:14:0x005f, B:15:0x0066, B:17:0x006e, B:20:0x0078, B:29:0x0043), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // xsna.ice0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Uri uri, ContinuationImpl continuationImpl) {
        oce0 oce0Var;
        int i;
        boolean z;
        String str;
        Uri uri2 = uri;
        try {
            if (continuationImpl instanceof oce0) {
                oce0Var = (oce0) continuationImpl;
                int i2 = oce0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    oce0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = oce0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = oce0Var.label;
                    z = true;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        vbe0 vbe0Var = this.a;
                        oce0Var.L$0 = uri2;
                        oce0Var.I$0 = 0;
                        oce0Var.I$1 = 0;
                        oce0Var.label = 1;
                        obj = vbe0Var.a(uri2, oce0Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uri2 = (Uri) oce0Var.L$0;
                        kotlin.a.a(obj);
                    }
                    MediaUtils.f fVar = (MediaUtils.f) obj;
                    long j = fVar.f;
                    String path = uri2.getPath();
                    boolean a = path == null ? adq0.a(path) : false;
                    int i3 = fVar.b;
                    int i4 = fVar.a;
                    str = fVar.g;
                    if (str != null || !str.equalsIgnoreCase(MimeTypes.VIDEO_MP4)) {
                        z = false;
                    }
                    return new VideoInfoDo(j, a, i3, i4, Boolean.valueOf(z), null, 32, null);
                }
            }
            if (i != 0) {
            }
            MediaUtils.f fVar2 = (MediaUtils.f) obj;
            long j2 = fVar2.f;
            String path2 = uri2.getPath();
            if (path2 == null) {
            }
            int i32 = fVar2.b;
            int i42 = fVar2.a;
            str = fVar2.g;
            if (str != null) {
            }
            z = false;
            return new VideoInfoDo(j2, a, i32, i42, Boolean.valueOf(z), null, 32, null);
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        oce0Var = new oce0(this, continuationImpl);
        Object obj2 = oce0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = oce0Var.label;
        z = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // xsna.ice0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable l(ContinuationImpl continuationImpl) {
        rce0 rce0Var;
        int i;
        try {
            if (continuationImpl instanceof rce0) {
                rce0Var = (rce0) continuationImpl;
                int i2 = rce0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rce0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = rce0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = rce0Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        baq0 baq0Var = this.e;
                        rce0Var.I$0 = 0;
                        rce0Var.I$1 = 0;
                        rce0Var.label = 1;
                        obj = baq0Var.i(rce0Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    return bool;
                }
            }
            if (i != 0) {
            }
            Boolean bool2 = (Boolean) obj;
            bool2.getClass();
            return bool2;
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        rce0Var = new rce0(this, continuationImpl);
        Object obj2 = rce0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rce0Var.label;
    }
}
