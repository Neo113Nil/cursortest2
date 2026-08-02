package xsna;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Attachment;
import com.vk.log.L;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vk.posting.data.PickerTechMetricsSession;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTime;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimeRange;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingContext;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingFileType;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingFileUploading;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingFileUploadingError;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingPickerOpening;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingPostPublishingError;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingTimelineEvent;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypePostingTimeline;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DefaultPostingTechMetricsCollector.kt */
/* loaded from: classes4.dex */
public final class bll implements xoc0 {
    public j0u0 b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public boolean h;
    public String j;
    public MobileOfficialAppsFeedStat$PostingContext.PostType g = MobileOfficialAppsFeedStat$PostingContext.PostType.REGULAR;
    public MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint i = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.OTHER;
    public MobileOfficialAppsFeedStat$PickerType k = MobileOfficialAppsFeedStat$PickerType.OTHER;
    public final HashMap<Integer, Pair<MobileOfficialAppsFeedStat$PostingFileType, Long>> l = new HashMap<>();
    public final ArrayList<MobileOfficialAppsFeedStat$PostingTimelineEvent> m = new ArrayList<>();

    /* compiled from: DefaultPostingTechMetricsCollector.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    @Override // xsna.o9q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P6(int i, Throwable th) {
        String str;
        String message;
        Pair<MobileOfficialAppsFeedStat$PostingFileType, Long> remove = this.l.remove(Integer.valueOf(i));
        if (remove == null) {
            return;
        }
        MobileOfficialAppsFeedStat$PostingFileType d = remove.d();
        final long longValue = remove.g().longValue();
        String str2 = null;
        if (th != null) {
            Throwable cause = th.getCause();
            VKApiExecutionException vKApiExecutionException = cause instanceof VKApiExecutionException ? (VKApiExecutionException) cause : null;
            if (vKApiExecutionException == null || (message = vKApiExecutionException.t()) == null) {
                message = th.getMessage();
            }
            if (message != null) {
                if (message.length() > 128) {
                    message = message.substring(0, 128);
                }
                str = message;
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final MobileOfficialAppsFeedStat$FeedTimeRange k = k(Long.valueOf(longValue), Long.valueOf(SystemClock.elapsedRealtime()));
                if (th != null) {
                    Throwable cause2 = th.getCause();
                    VKApiExecutionException vKApiExecutionException2 = cause2 instanceof VKApiExecutionException ? (VKApiExecutionException) cause2 : null;
                    if (vKApiExecutionException2 != null) {
                        str2 = Integer.valueOf(vKApiExecutionException2.s()).toString();
                    }
                }
                i(MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(new MobileOfficialAppsFeedStat$PostingFileUploadingError(k, d, str, str2, null, null, 48, null)));
                final String str3 = str;
                L.d(new gzs() { // from class: xsna.zkl
                    @Override // xsna.gzs
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("Posting picker uploading error: (");
                        MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = MobileOfficialAppsFeedStat$FeedTimeRange.this;
                        sb.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.b() : null);
                        sb.append(" ns, ");
                        sb.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.a() : null);
                        sb.append(" ns), diff: ");
                        sb.append(elapsedRealtime - longValue);
                        sb.append(" ms, message: ");
                        sb.append(str3);
                        return sb.toString();
                    }
                });
            }
        }
        str = null;
        final long elapsedRealtime2 = SystemClock.elapsedRealtime();
        final MobileOfficialAppsFeedStat$FeedTimeRange k2 = k(Long.valueOf(longValue), Long.valueOf(SystemClock.elapsedRealtime()));
        if (th != null) {
        }
        i(MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(new MobileOfficialAppsFeedStat$PostingFileUploadingError(k2, d, str, str2, null, null, 48, null)));
        final String str32 = str;
        L.d(new gzs() { // from class: xsna.zkl
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("Posting picker uploading error: (");
                MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = MobileOfficialAppsFeedStat$FeedTimeRange.this;
                sb.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.b() : null);
                sb.append(" ns, ");
                sb.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.a() : null);
                sb.append(" ns), diff: ");
                sb.append(elapsedRealtime2 - longValue);
                sb.append(" ms, message: ");
                sb.append(str32);
                return sb.toString();
            }
        });
    }

    @Override // xsna.xoc0
    public final void V5(MobileOfficialAppsFeedStat$PostingContext.PostType postType) {
        this.g = postType;
    }

    @Override // xsna.o9q0
    public final void X3(int i, Attachment attachment) {
        Pair<MobileOfficialAppsFeedStat$PostingFileType, Long> remove = this.l.remove(Integer.valueOf(i));
        if (remove == null) {
            return;
        }
        i(MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(new MobileOfficialAppsFeedStat$PostingFileUploading(k(Long.valueOf(remove.g().longValue()), Long.valueOf(SystemClock.elapsedRealtime())), remove.d(), null, null, 12, null)));
    }

    @Override // xsna.o9q0
    public final void a4(ju90<?> ju90Var, int i) {
        MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType = ju90Var instanceof PendingDocumentAttachment ? MobileOfficialAppsFeedStat$PostingFileType.DOCUMENT : ju90Var instanceof PendingPhotoAttachment ? MobileOfficialAppsFeedStat$PostingFileType.PHOTO : ju90Var instanceof PendingVideoAttachment ? MobileOfficialAppsFeedStat$PostingFileType.VIDEO : null;
        if (mobileOfficialAppsFeedStat$PostingFileType == null) {
            return;
        }
        this.l.put(Integer.valueOf(i), new Pair<>(mobileOfficialAppsFeedStat$PostingFileType, Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // xsna.xoc0
    public final void b(Bundle bundle) {
        bundle.putSerializable("techMetricsPostType", this.g);
        bundle.putBoolean("techMetricsIsEditing", this.h);
        bundle.putSerializable("techMetricsCreationEntryPoint", this.i);
        bundle.putString("techMetricsTrackCode", this.j);
        bundle.putSerializable("techMetricsPickerStarted", this.k);
        Long l = this.c;
        if (l != null) {
            bundle.putLong("techMetricsPickerCreateElapsedTime", l.longValue());
        }
        Long l2 = this.d;
        if (l2 != null) {
            bundle.putLong("techMetricsPickerInteractiveElapsedTime", l2.longValue());
        }
        Long l3 = this.e;
        if (l3 != null) {
            bundle.putLong("techMetricsPickerStartPublishingElapsedTime", l3.longValue());
        }
        Long l4 = this.f;
        if (l4 != null) {
            bundle.putLong("techMetricsPickerStartElapsedTime", l4.longValue());
        }
        j0u0 j0u0Var = this.b;
        if (j0u0Var != null) {
            Long l5 = (Long) j0u0Var.b;
            if (l5 != null) {
                bundle.putLong("startScreenTime", l5.longValue());
            }
            Long l6 = (Long) j0u0Var.c;
            if (l6 != null) {
                bundle.putLong("startScreenElapsedTime", l6.longValue());
            }
        }
    }

    @Override // xsna.xoc0
    public final void b6(boolean z) {
        this.h = z;
    }

    @Override // xsna.qha0
    public final void c(Intent intent) {
        PickerTechMetricsSession pickerTechMetricsSession = (PickerTechMetricsSession) intent.getParcelableExtra("PICKER_TECH_METRICS_SESSION");
        if (pickerTechMetricsSession == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final Long l = this.f;
        Long l2 = pickerTechMetricsSession.b;
        final long longValue = l2 != null ? l2.longValue() : SystemClock.elapsedRealtime();
        if (l != null) {
            i(MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(new MobileOfficialAppsFeedStat$PostingPickerOpening(k(l, Long.valueOf(longValue)), this.k)));
            L.d(new gzs() { // from class: xsna.xkl
                @Override // xsna.gzs
                public final Object invoke() {
                    StringBuilder sb = new StringBuilder("Posting picker opening [");
                    sb.append(bll.this.k);
                    sb.append("]: (");
                    Long l3 = l;
                    sb.append(l3);
                    sb.append(", ");
                    long j = longValue;
                    sb.append(j);
                    sb.append("), diff: ");
                    return efz.b(j - l3.longValue(), " ms", sb);
                }
            });
        }
        Long l3 = pickerTechMetricsSession.c;
        if (l3 != null) {
            i(MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(new MobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching(k(l3, Long.valueOf(elapsedRealtime)), this.k)));
            L.d(new ykl(this, l3, elapsedRealtime));
        }
    }

    @Override // xsna.kkc0
    public final void d(Throwable th) {
        String message;
        final String str;
        Throwable cause = th.getCause();
        VKApiExecutionException vKApiExecutionException = cause instanceof VKApiExecutionException ? (VKApiExecutionException) cause : null;
        if (vKApiExecutionException == null || (message = vKApiExecutionException.t()) == null) {
            message = th.getMessage();
        }
        if (message != null) {
            if (message.length() > 128) {
                message = message.substring(0, 128);
            }
            str = message;
        } else {
            str = null;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final MobileOfficialAppsFeedStat$FeedTimeRange k = k(this.e, Long.valueOf(elapsedRealtime));
        Throwable cause2 = th.getCause();
        VKApiExecutionException vKApiExecutionException2 = cause2 instanceof VKApiExecutionException ? (VKApiExecutionException) cause2 : null;
        i(MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(new MobileOfficialAppsFeedStat$PostingPostPublishingError(k, str, vKApiExecutionException2 != null ? Integer.valueOf(vKApiExecutionException2.s()).toString() : null)));
        L.d(new gzs() { // from class: xsna.all
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("Posting picker publishing error: (");
                MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = MobileOfficialAppsFeedStat$FeedTimeRange.this;
                sb.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.b() : null);
                sb.append(" ns, ");
                sb.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.a() : null);
                sb.append(" ns), diff: ");
                Long l = this.e;
                sb.append(elapsedRealtime - (l != null ? l.longValue() : 0L));
                sb.append(" ms, message: ");
                sb.append(str);
                return sb.toString();
            }
        });
    }

    @Override // xsna.kkc0
    public final void e() {
        this.e = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // xsna.kkc0
    public final void f() {
        MobileOfficialAppsFeedStat$FeedTimeRange k = k(this.e, Long.valueOf(SystemClock.elapsedRealtime()));
        if (k != null) {
            i(MobileOfficialAppsFeedStat$PostingTimelineEvent.a.a(k));
        }
    }

    @Override // xsna.xoc0
    public final void g(Bundle bundle) {
        Object obj;
        Object obj2;
        Object obj3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            obj = bundle.getSerializable("techMetricsPostType", MobileOfficialAppsFeedStat$PostingContext.PostType.class);
        } else {
            Object serializable = bundle.getSerializable("techMetricsPostType");
            if (!(serializable instanceof MobileOfficialAppsFeedStat$PostingContext.PostType)) {
                serializable = null;
            }
            obj = (MobileOfficialAppsFeedStat$PostingContext.PostType) serializable;
        }
        MobileOfficialAppsFeedStat$PostingContext.PostType postType = (MobileOfficialAppsFeedStat$PostingContext.PostType) obj;
        if (postType == null) {
            postType = this.g;
        }
        this.g = postType;
        this.h = bundle.getBoolean("techMetricsIsEditing", this.h);
        if (i >= 33) {
            obj2 = bundle.getSerializable("techMetricsCreationEntryPoint", MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.class);
        } else {
            Object serializable2 = bundle.getSerializable("techMetricsCreationEntryPoint");
            if (!(serializable2 instanceof MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint)) {
                serializable2 = null;
            }
            obj2 = (MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint) serializable2;
        }
        MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint creationEntryPoint = (MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint) obj2;
        if (creationEntryPoint == null) {
            creationEntryPoint = this.i;
        }
        this.i = creationEntryPoint;
        String string = bundle.getString("techMetricsTrackCode");
        if (string == null) {
            string = this.j;
        }
        this.j = string;
        if (i >= 33) {
            obj3 = bundle.getSerializable("techMetricsPickerStarted", MobileOfficialAppsFeedStat$PickerType.class);
        } else {
            Object serializable3 = bundle.getSerializable("techMetricsPickerStarted");
            obj3 = (MobileOfficialAppsFeedStat$PickerType) (serializable3 instanceof MobileOfficialAppsFeedStat$PickerType ? serializable3 : null);
        }
        MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType = (MobileOfficialAppsFeedStat$PickerType) obj3;
        if (mobileOfficialAppsFeedStat$PickerType == null) {
            mobileOfficialAppsFeedStat$PickerType = this.k;
        }
        this.k = mobileOfficialAppsFeedStat$PickerType;
        this.c = bo8.e(bundle, "techMetricsPickerCreateElapsedTime");
        this.d = bo8.e(bundle, "techMetricsPickerInteractiveElapsedTime");
        this.e = bo8.e(bundle, "techMetricsPickerStartPublishingElapsedTime");
        this.f = bo8.e(bundle, "techMetricsPickerStartElapsedTime");
        j0u0 j0u0Var = new j0u0(5);
        j0u0Var.g(bundle);
        this.b = j0u0Var;
    }

    @Override // xsna.qha0
    public final void h(MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType) {
        this.k = mobileOfficialAppsFeedStat$PickerType;
        this.f = Long.valueOf(SystemClock.elapsedRealtime());
    }

    public final void i(MobileOfficialAppsFeedStat$PostingTimelineEvent mobileOfficialAppsFeedStat$PostingTimelineEvent) {
        ArrayList<MobileOfficialAppsFeedStat$PostingTimelineEvent> arrayList = this.m;
        if (arrayList.size() >= 50) {
            return;
        }
        arrayList.add(mobileOfficialAppsFeedStat$PostingTimelineEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String j(Long l) {
        Long l2;
        if (l != null && l.longValue() != 0) {
            j0u0 j0u0Var = this.b;
            Long l3 = j0u0Var != null ? (Long) j0u0Var.b : null;
            Long l4 = j0u0Var != null ? (Long) j0u0Var.c : null;
            if (l3 != null && l4 != null) {
                l2 = Long.valueOf(TimeUnit.MILLISECONDS.toMicros((l.longValue() - l4.longValue()) + l3.longValue()));
                if (l2 == null) {
                    return l2.toString();
                }
                return null;
            }
        }
        l2 = null;
        if (l2 == null) {
        }
    }

    public final MobileOfficialAppsFeedStat$FeedTimeRange k(Long l, Long l2) {
        String j = j(l);
        String j2 = j(l2);
        if (j == null || j2 == null) {
            return null;
        }
        return new MobileOfficialAppsFeedStat$FeedTimeRange(j, j2);
    }

    @Override // xsna.xoc0
    public final void onDestroy() {
        String l;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String j = j(this.c);
        String j2 = j(this.d);
        String j3 = j(Long.valueOf(elapsedRealtime));
        j0u0 j0u0Var = this.b;
        Long l2 = j0u0Var != null ? (Long) j0u0Var.b : null;
        MobileOfficialAppsFeedStat$TypePostingTimeline mobileOfficialAppsFeedStat$TypePostingTimeline = new MobileOfficialAppsFeedStat$TypePostingTimeline(new MobileOfficialAppsFeedStat$PostingContext(this.g, Boolean.valueOf(this.h), this.i, this.j), this.m, (l2 == null || (l = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(l2.longValue())).toString()) == null) ? null : new MobileOfficialAppsFeedStat$FeedTime(l), j != null ? new MobileOfficialAppsFeedStat$FeedTime(j) : null, j2 != null ? new MobileOfficialAppsFeedStat$FeedTime(j2) : null, j3 != null ? new MobileOfficialAppsFeedStat$FeedTime(j3) : null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsFeedStat$TypePostingTimeline;
        kx6Var.q();
    }

    @Override // xsna.xoc0
    public final void p3(j0u0 j0u0Var, wsi wsiVar) {
        Long l;
        Long l2 = (Long) j0u0Var.b;
        if (l2 == null || l2.longValue() == 0 || (l = (Long) j0u0Var.c) == null || l.longValue() == 0) {
            return;
        }
        this.b = j0u0Var;
        this.c = Long.valueOf(SystemClock.elapsedRealtime());
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new wkl(this, 0));
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.single.f0 q = vVar.q(asu0.m());
        int i = kwg0.a;
        io.reactivex.rxjava3.disposables.c subscribe = q.subscribe(new iwg0(), new ho1(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 18));
        if (subscribe != null) {
            wsiVar.a(subscribe);
        }
    }

    @Override // xsna.xoc0
    public final void setTrackCode(String str) {
        this.j = str;
    }

    @Override // xsna.xoc0
    public final void t2(MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint creationEntryPoint) {
        this.i = creationEntryPoint;
    }
}
