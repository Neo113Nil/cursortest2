package xsna;

import android.net.Uri;
import android.os.SystemClock;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.metrics.logging.PerfLogger;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$PhotoInfo;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$PreloadStoryInfo;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$SeenMediaInfo;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$StoryTypeOpen;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$VideoInfo;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$VideoSeenItem;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$DeviceInfoItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$NetworkInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$EventTimeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import com.vk.toggle.features.ContentFeatures;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoSourceException;
import one.video.player.error.ResponseInfo;

/* compiled from: StoriesDownloadTechMetricsImpl.kt */
/* loaded from: classes6.dex */
public final class yrl0 implements vrl0 {
    public static int r;
    public final uvl0 a;
    public final p870 b;
    public Long c;
    public gzs<MobileOfficialAppsCoreDeviceStat$NetworkInfo> d;
    public gzs<? extends MobileOfficialAppsConStoriesStat$ViewEntryPoint> e = new wrl0(this, 0);
    public final boolean f;
    public final Set<MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid> g;
    public q7m0 h;
    public Long i;
    public MobileOfficialAppsConStoriesStat$ViewEntryPoint j;
    public mzp0 k;
    public final LinkedHashSet l;
    public final xrl0 m;
    public Boolean n;
    public MobileOfficialAppsConStoriesStat$VideoInfo o;
    public final LinkedHashMap p;
    public Boolean q;

    /* JADX WARN: Type inference failed for: r14v7, types: [xsna.xrl0] */
    public yrl0(uvl0 uvl0Var, p870 p870Var) {
        this.a = uvl0Var;
        this.b = p870Var;
        ContentFeatures contentFeatures = ContentFeatures.STORY_TECH_METRICS_DOWNLOAD;
        contentFeatures.getClass();
        this.f = com.vk.toggle.b.A.a(contentFeatures);
        this.g = rl3.y0(new MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid[]{MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.START_INIT_STORY_VIEW, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.START_LOAD_IMAGE, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.ON_CREATE_DIALOG, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.START_INIT_CONTAINER, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.SETUP_VIDEO, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.LOAD_SUCCESS_PREVIEW, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.FIRST_FRAME_RENDERED, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.SHOW_LOADER, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.DOWNLOAD, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.OPEN_STORY_VIEW, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.LOADING_VIDEO_ERROR, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.QUALITY_DOWNGRADE, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.QUALITY_UPGRADE});
        this.l = new LinkedHashSet();
        this.m = new bd70() { // from class: xsna.xrl0
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                String id;
                StoryEntry storyEntry = ((zjm0) obj).g;
                if (storyEntry == null || (id = storyEntry.getId()) == null) {
                    return;
                }
                yrl0.this.l.add(id);
            }
        };
        this.p = new LinkedHashMap();
        this.q = Boolean.FALSE;
    }

    public static MobileOfficialAppsConStoriesStat$VideoSeenItem v(long j) {
        return new MobileOfficialAppsConStoriesStat$VideoSeenItem(j, null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if (r37.a.m(r3.c) == true) goto L181;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void w(yrl0 yrl0Var, StoryEntry storyEntry, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid, Throwable th, MobileOfficialAppsConStoriesStat$VideoSeenItem mobileOfficialAppsConStoriesStat$VideoSeenItem, Boolean bool, MobileOfficialAppsConStoriesStat$StoryTypeOpen mobileOfficialAppsConStoriesStat$StoryTypeOpen, MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo, MobileOfficialAppsConStoriesStat$PhotoInfo mobileOfficialAppsConStoriesStat$PhotoInfo, MobileOfficialAppsConStoriesStat$PreloadStoryInfo mobileOfficialAppsConStoriesStat$PreloadStoryInfo, MobileOfficialAppsConStoriesStat$SeenMediaInfo mobileOfficialAppsConStoriesStat$SeenMediaInfo, Integer num, Uri uri, int i) {
        Long valueOf;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo invoke;
        String str;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo;
        long j;
        ArrayList arrayList;
        t170 t170Var;
        OneVideoSourceException i2;
        OneVideoSourceException.a g;
        ResponseInfo responseInfo;
        StoryEntry storyEntry2 = (i & 1) != 0 ? null : storyEntry;
        Throwable th2 = (i & 8) != 0 ? null : th;
        MobileOfficialAppsConStoriesStat$VideoSeenItem mobileOfficialAppsConStoriesStat$VideoSeenItem2 = (i & 16) != 0 ? null : mobileOfficialAppsConStoriesStat$VideoSeenItem;
        Boolean bool2 = (i & 32) != 0 ? null : bool;
        MobileOfficialAppsConStoriesStat$StoryTypeOpen mobileOfficialAppsConStoriesStat$StoryTypeOpen2 = (i & 64) != 0 ? null : mobileOfficialAppsConStoriesStat$StoryTypeOpen;
        MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo2 = (i & 128) != 0 ? null : mobileOfficialAppsConStoriesStat$VideoInfo;
        MobileOfficialAppsConStoriesStat$PhotoInfo mobileOfficialAppsConStoriesStat$PhotoInfo2 = (i & 256) != 0 ? null : mobileOfficialAppsConStoriesStat$PhotoInfo;
        MobileOfficialAppsConStoriesStat$PreloadStoryInfo mobileOfficialAppsConStoriesStat$PreloadStoryInfo2 = (i & 512) != 0 ? null : mobileOfficialAppsConStoriesStat$PreloadStoryInfo;
        MobileOfficialAppsConStoriesStat$SeenMediaInfo mobileOfficialAppsConStoriesStat$SeenMediaInfo2 = (i & 1024) != 0 ? null : mobileOfficialAppsConStoriesStat$SeenMediaInfo;
        Integer num2 = (i & 2048) != 0 ? null : num;
        Uri uri2 = (i & 4096) != 0 ? null : uri;
        LinkedHashSet linkedHashSet = yrl0Var.l;
        if (!j5g.P(linkedHashSet, storyEntry2 != null ? storyEntry2.getId() : null)) {
            if (storyEntry2 != null) {
            }
            if (yrl0Var.g.contains(eventTypeAndroid) || yrl0Var.f) {
                q7m0 q7m0Var = yrl0Var.h;
                if (q7m0Var != null && q7m0Var.j && th2 == null) {
                    return;
                }
                if (storyEntry2 == null) {
                    storyEntry2 = q7m0Var != null ? q7m0Var.b() : null;
                    if (storyEntry2 == null) {
                        return;
                    }
                }
                q7m0 q7m0Var2 = yrl0Var.h;
                if ((q7m0Var2 != null ? q7m0Var2.d : null) == null) {
                    valueOf = yrl0Var.c;
                } else {
                    Long l = yrl0Var.i;
                    valueOf = Long.valueOf(l != null ? l.longValue() : 0L);
                }
                SystemClock.elapsedRealtime();
                s0q s0qVar = valueOf != null ? new s0q(valueOf.longValue(), SystemClock.elapsedRealtime(), th2 != null ? SystemClock.elapsedRealtime() : 0L) : null;
                gzs<MobileOfficialAppsCoreDeviceStat$NetworkInfo> gzsVar = yrl0Var.d;
                if (gzsVar == null || (invoke = gzsVar.invoke()) == null) {
                    return;
                }
                if (th2 != null) {
                    boolean z = th2 instanceof OneVideoPlaybackException;
                    OneVideoPlaybackException oneVideoPlaybackException = z ? (OneVideoPlaybackException) th2 : null;
                    OneVideoPlaybackException.ErrorCode d = oneVideoPlaybackException != null ? oneVideoPlaybackException.d() : null;
                    OneVideoPlaybackException oneVideoPlaybackException2 = z ? (OneVideoPlaybackException) th2 : null;
                    String description = (oneVideoPlaybackException2 == null || (i2 = oneVideoPlaybackException2.i()) == null || (g = i2.g()) == null || (responseInfo = g.d) == null) ? null : responseInfo.getDescription();
                    StringBuilder sb = new StringBuilder("Message: ");
                    sb.append(th2.getMessage());
                    sb.append(' ');
                    String name = d != null ? d.name() : null;
                    if (name == null) {
                        name = "";
                    }
                    sb.append(name);
                    sb.append(' ');
                    if (description == null) {
                        description = "";
                    }
                    sb.append(description);
                    sb.append(" uri: ");
                    sb.append(uri2);
                    sb.append(" stackTrace: ");
                    sb.append(sdi.l(th2));
                    str = sb.toString();
                } else {
                    str = null;
                }
                MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentSubtype contentSubtype = (storyEntry2.Sb() || storyEntry2.Qb()) ? MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentSubtype.PHOTO : (storyEntry2.Tb() || storyEntry2.Rb()) ? MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentSubtype.VIDEO : MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentSubtype.VIDEO;
                long j2 = storyEntry2.c;
                long j3 = storyEntry2.d.b;
                MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ErrorType errorType = th2 != null ? MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ErrorType.DOWNLOAD : null;
                if (s0qVar != null) {
                    boolean z2 = th2 != null;
                    ArrayList arrayList2 = new ArrayList();
                    mobileOfficialAppsCoreDeviceStat$NetworkInfo = invoke;
                    j = j2;
                    arrayList2.add(new MobileOfficialAppsCoreEncodingStat$EventTimeItem(MobileOfficialAppsCoreEncodingStat$EventTimeItem.EventType.START, s0qVar.a));
                    arrayList2.add(new MobileOfficialAppsCoreEncodingStat$EventTimeItem(MobileOfficialAppsCoreEncodingStat$EventTimeItem.EventType.FINISH, s0qVar.b));
                    if (z2) {
                        arrayList2.add(new MobileOfficialAppsCoreEncodingStat$EventTimeItem(MobileOfficialAppsCoreEncodingStat$EventTimeItem.EventType.ERROR, s0qVar.c));
                    }
                    arrayList = arrayList2;
                } else {
                    mobileOfficialAppsCoreDeviceStat$NetworkInfo = invoke;
                    j = j2;
                    arrayList = null;
                }
                MobileOfficialAppsCoreDeviceStat$DeviceInfoItem f = vhk0.f();
                MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentType contentType = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentType.STORY;
                boolean z3 = r <= 1;
                q7m0 q7m0Var3 = yrl0Var.h;
                MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.TypeNextStory typeNextStory = (q7m0Var3 == null || (t170Var = q7m0Var3.d) == null) ? null : t170Var.b;
                MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid2 = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.DOWNLOAD;
                MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem = new MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem(j3, contentType, mobileOfficialAppsCoreDeviceStat$NetworkInfo, Long.valueOf(j), contentSubtype, f, arrayList, null, null, null, num2, errorType, str, null, eventTypeAndroid, null, null, mobileOfficialAppsConStoriesStat$VideoSeenItem2, null, mobileOfficialAppsConStoriesStat$SeenMediaInfo2, mobileOfficialAppsConStoriesStat$PhotoInfo2, mobileOfficialAppsConStoriesStat$VideoInfo2, Boolean.valueOf(z3), bool2, mobileOfficialAppsConStoriesStat$StoryTypeOpen2, mobileOfficialAppsConStoriesStat$PreloadStoryInfo2, null, typeNextStory, eventTypeAndroid == eventTypeAndroid2 ? yrl0Var.q : null, q7m0Var3 != null ? Boolean.valueOf(q7m0Var3.h) : null, yrl0Var.e.invoke(), 67412736, null);
                Objects.toString(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.i());
                mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.toString();
                if (eventTypeAndroid == eventTypeAndroid2) {
                    q7m0 q7m0Var4 = yrl0Var.h;
                    if ((q7m0Var4 != null ? q7m0Var4.d : null) == null) {
                        new PerfLogger().a(PerfLogger.Event.STORIES_FINISH_OPEN_STORY_CLICK);
                    } else {
                        new PerfLogger().a(PerfLogger.Event.STORIES_FINISH_OPEN_STORY_NEXT);
                    }
                }
                kx6 kx6Var = new kx6();
                kx6Var.f = mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
                kx6Var.q();
                return;
            }
            return;
        }
        if (storyEntry2 != null) {
            linkedHashSet.add(storyEntry2.getId());
        }
    }

    @Override // xsna.vrl0
    public final void a(StoryEntry storyEntry, boolean z, boolean z2, boolean z3, Long l) {
        StoryEntry b;
        StoryEntry b2;
        q7m0 q7m0Var = this.h;
        if (((q7m0Var == null || (b2 = q7m0Var.b()) == null) ? null : b2.getId()) != null) {
            q7m0 q7m0Var2 = this.h;
            if (epx.f((q7m0Var2 == null || (b = q7m0Var2.b()) == null) ? null : b.getId(), storyEntry.getId())) {
                MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo = this.o;
                this.o = mobileOfficialAppsConStoriesStat$VideoInfo != null ? MobileOfficialAppsConStoriesStat$VideoInfo.a(mobileOfficialAppsConStoriesStat$VideoInfo, Boolean.valueOf(z), Boolean.valueOf(z2), null, null, 12) : new MobileOfficialAppsConStoriesStat$VideoInfo(Boolean.valueOf(z), Boolean.valueOf(z2), null, null, 12, null);
            }
        }
        MobileOfficialAppsConStoriesStat$VideoSeenItem mobileOfficialAppsConStoriesStat$VideoSeenItem = null;
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.SETUP_VIDEO;
        MobileOfficialAppsConStoriesStat$StoryTypeOpen t = t(storyEntry, z3);
        MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo2 = this.o;
        if (l != null) {
            mobileOfficialAppsConStoriesStat$VideoSeenItem = v(l.longValue());
        }
        w(this, storyEntry, eventTypeAndroid, null, mobileOfficialAppsConStoriesStat$VideoSeenItem, Boolean.valueOf(z3), t, mobileOfficialAppsConStoriesStat$VideoInfo2, null, null, null, null, null, 7946);
    }

    @Override // xsna.vrl0
    public final void b(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid, StoryEntry storyEntry, boolean z, Long l) {
        w(this, storyEntry, eventTypeAndroid, null, l != null ? v(l.longValue()) : null, Boolean.valueOf(z), t(storyEntry, z), null, null, null, null, null, null, 8074);
    }

    @Override // xsna.vrl0
    public final void c(StoryEntry storyEntry, boolean z, boolean z2, boolean z3) {
        mzp0 mzp0Var = this.k;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        this.p.putIfAbsent(storyEntry != null ? storyEntry.getId() : null, new MobileOfficialAppsConStoriesStat$PhotoInfo(z3, z2));
        w(this, storyEntry, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.START_LOAD_IMAGE, null, null, Boolean.valueOf(z), t(storyEntry, false), null, new MobileOfficialAppsConStoriesStat$PhotoInfo(z3, z2), null, null, null, null, 7834);
    }

    @Override // xsna.vrl0
    public final void d(StoryEntry storyEntry, boolean z, boolean z2, boolean z3, MobileOfficialAppsConStoriesStat$SeenMediaInfo mobileOfficialAppsConStoriesStat$SeenMediaInfo) {
        mzp0 mzp0Var = this.k;
        if (mzp0Var != null) {
            mzp0Var.c(false);
            mzp0Var.d(null);
        }
        if (z && t(storyEntry, z) == MobileOfficialAppsConStoriesStat$StoryTypeOpen.OPEN_STORY_BY_CLICK) {
            this.q = Boolean.TRUE;
        }
        w(this, storyEntry, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.LOAD_SUCCESS_PREVIEW, null, null, Boolean.valueOf(z), t(storyEntry, z), null, new MobileOfficialAppsConStoriesStat$PhotoInfo(z3, z2), null, mobileOfficialAppsConStoriesStat$SeenMediaInfo, null, null, 6810);
    }

    @Override // xsna.vrl0
    public final void e(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid) {
        w(this, null, eventTypeAndroid, null, null, null, null, null, null, null, null, null, null, 8187);
    }

    @Override // xsna.vrl0
    public final void f(StoryEntry storyEntry, long j, long j2, Long l) {
        StoryEntry b;
        q7m0 q7m0Var = this.h;
        if (epx.f((q7m0Var == null || (b = q7m0Var.b()) == null) ? null : b.getId(), storyEntry != null ? storyEntry.getId() : null)) {
            MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo = this.o;
            if ((mobileOfficialAppsConStoriesStat$VideoInfo != null ? mobileOfficialAppsConStoriesStat$VideoInfo.b() : null) == null) {
                MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo2 = this.o;
                if ((mobileOfficialAppsConStoriesStat$VideoInfo2 != null ? mobileOfficialAppsConStoriesStat$VideoInfo2.c() : null) == null) {
                    MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo3 = this.o;
                    this.o = mobileOfficialAppsConStoriesStat$VideoInfo3 != null ? MobileOfficialAppsConStoriesStat$VideoInfo.a(mobileOfficialAppsConStoriesStat$VideoInfo3, null, null, Long.valueOf(j), Long.valueOf(j2), 3) : new MobileOfficialAppsConStoriesStat$VideoInfo(null, null, Long.valueOf(j), Long.valueOf(j2), 3, null);
                }
            }
        }
        w(this, storyEntry, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.LOADING_VIDEO_COMPLETED, null, l != null ? v(l.longValue()) : null, null, t(storyEntry, false), this.o, null, null, null, null, null, 7978);
    }

    @Override // xsna.vrl0
    public final void g() {
        w(this, null, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.CALL_SHOW_STORY_CONTAINER, null, null, null, null, null, null, null, null, null, null, 8187);
    }

    @Override // xsna.vrl0
    public final void h(StoryEntry storyEntry, StoryEntry storyEntry2, boolean z, Boolean bool) {
        w(this, storyEntry, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.END_PRELOAD_NEXT_STORY, null, null, bool, t(storyEntry, false), null, null, new MobileOfficialAppsConStoriesStat$PreloadStoryInfo(storyEntry2.getId(), Boolean.valueOf(z)), null, null, null, 7578);
    }

    @Override // xsna.vrl0
    public final void i(long j, q7m0 q7m0Var, gzs gzsVar, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        this.b.b(102, this.m);
        this.j = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.c = Long.valueOf(j);
        q7m0Var.e = new rme0(this, 8);
        q7m0Var.f = new wt30(this, 22);
        this.h = q7m0Var;
        this.d = gzsVar;
    }

    @Override // xsna.vrl0
    public final void j(StoryEntry storyEntry, Uri uri, Throwable th, Long l) {
        w(this, storyEntry, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.LOADING_VIDEO_ERROR, th, l != null ? v(l.longValue()) : null, null, t(storyEntry, false), null, null, null, null, null, uri, 4002);
    }

    @Override // xsna.vrl0
    public final void k(StoryEntry storyEntry, boolean z, Long l, MobileOfficialAppsConStoriesStat$SeenMediaInfo mobileOfficialAppsConStoriesStat$SeenMediaInfo, Integer num) {
        mzp0 mzp0Var = this.k;
        if (mzp0Var != null) {
            mzp0Var.c(false);
            mzp0Var.d(null);
        }
        MobileOfficialAppsConStoriesStat$VideoSeenItem mobileOfficialAppsConStoriesStat$VideoSeenItem = null;
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.FIRST_FRAME_RENDERED;
        MobileOfficialAppsConStoriesStat$StoryTypeOpen t = t(storyEntry, z);
        if (l != null) {
            mobileOfficialAppsConStoriesStat$VideoSeenItem = v(l.longValue());
        }
        w(this, storyEntry, eventTypeAndroid, null, mobileOfficialAppsConStoriesStat$VideoSeenItem, Boolean.valueOf(z), t, null, null, null, mobileOfficialAppsConStoriesStat$SeenMediaInfo, num, null, IronSourceConstants.errorCode_isReadyException);
    }

    @Override // xsna.vrl0
    public final void l() {
        w(this, null, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.ON_RESUME_CONTAINER, null, null, null, null, null, null, null, null, null, null, 8187);
    }

    @Override // xsna.vrl0
    public final void m(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid, StoryEntry storyEntry, boolean z, Integer num) {
        w(this, storyEntry, eventTypeAndroid, null, null, Boolean.valueOf(z), t(storyEntry, z), null, null, null, null, num, null, 6026);
    }

    @Override // xsna.vrl0
    public final void n(StoryEntry storyEntry, StoryEntry storyEntry2, boolean z, boolean z2) {
        w(this, storyEntry, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.START_PRELOAD_NEXT_STORY, null, null, Boolean.valueOf(z2), t(storyEntry, false), null, null, new MobileOfficialAppsConStoriesStat$PreloadStoryInfo(storyEntry2.getId(), Boolean.valueOf(z)), null, null, null, 7578);
    }

    @Override // xsna.vrl0
    public final void o(boolean z) {
        if (z) {
            w(this, null, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.START_INIT_CONTAINER, null, null, null, null, null, null, null, null, null, null, 8187);
        } else {
            w(this, null, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.FINISH_INIT_CONTAINER, null, null, null, null, null, null, null, null, null, null, 8187);
        }
    }

    @Override // xsna.vrl0
    public final void onDestroy() {
        this.b.g(this.m);
    }

    @Override // xsna.vrl0
    public final void p(StoryEntry storyEntry, Throwable th, boolean z, Long l, Uri uri) {
        Boolean bool;
        if (th != null) {
            mzp0 mzp0Var = this.k;
            if (mzp0Var != null) {
                mzp0Var.f();
            }
        } else {
            mzp0 mzp0Var2 = this.k;
            if (mzp0Var2 != null) {
                mzp0Var2.h();
                mzp0Var2.j();
            }
        }
        MobileOfficialAppsConStoriesStat$StoryTypeOpen t = t(storyEntry, z);
        if (t == MobileOfficialAppsConStoriesStat$StoryTypeOpen.OPEN_STORY_BY_CLICK) {
            Boolean bool2 = this.n;
            bool = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
        } else {
            bool = null;
        }
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.DOWNLOAD;
        MobileOfficialAppsConStoriesStat$VideoSeenItem v = l != null ? v(l.longValue()) : null;
        MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo = this.o;
        String id = storyEntry != null ? storyEntry.getId() : null;
        LinkedHashMap linkedHashMap = this.p;
        MobileOfficialAppsConStoriesStat$PhotoInfo mobileOfficialAppsConStoriesStat$PhotoInfo = (MobileOfficialAppsConStoriesStat$PhotoInfo) linkedHashMap.get(id);
        if (mobileOfficialAppsConStoriesStat$PhotoInfo == null) {
            mobileOfficialAppsConStoriesStat$PhotoInfo = (MobileOfficialAppsConStoriesStat$PhotoInfo) linkedHashMap.get(null);
        }
        w(this, storyEntry, eventTypeAndroid, th, v, bool, t, mobileOfficialAppsConStoriesStat$VideoInfo, mobileOfficialAppsConStoriesStat$PhotoInfo, null, null, null, uri, 3586);
    }

    @Override // xsna.vrl0
    public final void q(boolean z, StoryEntry storyEntry, boolean z2, Long l) {
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid = z ? MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.START_INIT_STORY_VIEW : MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.END_INIT_STORY_VIEW;
        if (eventTypeAndroid == MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.START_INIT_STORY_VIEW && this.n == null) {
            this.n = Boolean.valueOf(z2);
        }
        w(this, storyEntry, eventTypeAndroid, null, l != null ? v(l.longValue()) : null, Boolean.valueOf(z2), t(storyEntry, z2), null, null, null, null, null, null, 8074);
    }

    @Override // xsna.vrl0
    public final void r(x1e0 x1e0Var) {
        this.e = x1e0Var;
    }

    @Override // xsna.vrl0
    public final void s() {
        r++;
        w(this, null, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.ON_CREATE_DIALOG, null, null, null, null, null, null, null, null, null, null, 8187);
    }

    public final MobileOfficialAppsConStoriesStat$StoryTypeOpen t(StoryEntry storyEntry, boolean z) {
        q7m0 q7m0Var;
        t170 t170Var;
        StoryEntry storyEntry2;
        q7m0 q7m0Var2;
        StoryEntry storyEntry3;
        q7m0 q7m0Var3 = this.h;
        String str = null;
        if ((epx.f((q7m0Var3 == null || (storyEntry3 = q7m0Var3.c) == null) ? null : storyEntry3.getId(), storyEntry != null ? storyEntry.getId() : null) && (q7m0Var2 = this.h) != null && !q7m0Var2.k) || z) {
            return MobileOfficialAppsConStoriesStat$StoryTypeOpen.OPEN_STORY_BY_CLICK;
        }
        String id = storyEntry != null ? storyEntry.getId() : null;
        q7m0 q7m0Var4 = this.h;
        if (q7m0Var4 != null && (t170Var = q7m0Var4.d) != null && (storyEntry2 = t170Var.a) != null) {
            str = storyEntry2.getId();
        }
        return (epx.f(id, str) && (q7m0Var = this.h) != null && q7m0Var.k) ? MobileOfficialAppsConStoriesStat$StoryTypeOpen.NEXT_OPEN_STORY : MobileOfficialAppsConStoriesStat$StoryTypeOpen.UNKNOWN;
    }

    public final void u(mzp0 mzp0Var) {
        this.k = mzp0Var;
    }
}
