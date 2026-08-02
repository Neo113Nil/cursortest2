package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.autoplay.b;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;

/* compiled from: CommunityLiveVideosHolder.kt */
/* loaded from: classes5.dex */
public final class g9h {
    public final List<VideoFile> a;
    public final xqh b;
    public final hbt0 c;
    public final oht0 d;
    public final RecyclerView e;

    /* compiled from: CommunityLiveVideosHolder.kt */
    public final class a implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnWindowFocusChangeListener, View.OnAttachStateChangeListener {
        public final RecyclerView b;
        public final LinearLayoutManager c;
        public boolean d;
        public final Object e;
        public final Object f;

        public a(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
            this.b = recyclerView;
            this.c = linearLayoutManager;
            y6 y6Var = new y6(this, 28);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.e = msy.a(lazyThreadSafetyMode, y6Var);
            this.f = msy.a(lazyThreadSafetyMode, new rj1(this, 26));
        }

        public final void a() {
            RecyclerView recyclerView = this.b;
            if (recyclerView.hasWindowFocus()) {
                com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                if (com.vk.libvideo.autoplay.e.g()) {
                    float D = bwt0.D(recyclerView);
                    g9h g9hVar = g9h.this;
                    if (D <= 0.75f) {
                        if (D <= 0.75f) {
                            g9hVar.c.i(null);
                        }
                    } else {
                        int s = this.c.s();
                        Integer valueOf = s >= 0 ? Integer.valueOf(s) : null;
                        if (valueOf != null) {
                            g9hVar.c.x(valueOf.intValue());
                        }
                    }
                }
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            if (this.d) {
                return;
            }
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            if (com.vk.libvideo.autoplay.e.g()) {
                this.d = true;
                bwt0.i(g9h.this.e, 1000L, (izs) this.e.getValue(), (gzs) this.f.getValue());
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            RecyclerView recyclerView = this.b;
            recyclerView.getViewTreeObserver().removeOnScrollChangedListener(this);
            recyclerView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            recyclerView.getViewTreeObserver().addOnScrollChangedListener(this);
            recyclerView.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            g9h.this.c.i(null);
            RecyclerView recyclerView = this.b;
            recyclerView.getViewTreeObserver().removeOnScrollChangedListener(this);
            recyclerView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            if (z) {
                a();
            }
        }
    }

    /* compiled from: CommunityLiveVideosHolder.kt */
    public final class b extends RecyclerView.t {
        public int b;

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            RecyclerView.o layoutManager;
            Object failure;
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 || (layoutManager = recyclerView.getLayoutManager()) == null) {
                return;
            }
            g9h g9hVar = g9h.this;
            View findSnapView = g9hVar.d.findSnapView(layoutManager);
            if (findSnapView == null) {
                return;
            }
            int position = layoutManager.getPosition(findSnapView);
            if (this.b != position) {
                try {
                    failure = (VideoFile) g9hVar.a.get(position);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                VideoFile videoFile = (VideoFile) failure;
                if (videoFile != null) {
                    UiTracker uiTracker = UiTracker.a;
                    new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, null, null, 56, null), "0", "0", null, new MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow(position > this.b ? MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow.EventType.VIDEO_GROUP_LIVE_BLOCK_NEXT_CARD_SHOW : MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow.EventType.VIDEO_GROUP_LIVE_BLOCK_PREV_CARD_SHOW, MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow.EventSubtype.MANUAL, position, videoFile.o0(), videoFile.I0().b), 8)).q();
                }
            }
            this.b = position;
        }
    }

    /* compiled from: CommunityLiveVideosHolder.kt */
    public final class c implements ai5 {
        public c() {
        }

        @Override // xsna.ai5
        public final y9t0 Eh(int i) {
            VideoFile videoFile = (VideoFile) g9h.this.b.c.c(i);
            if (videoFile == null) {
                return null;
            }
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            return new y9t0(b.C1208b.a().e(videoFile, null), new ni5(null, null, videoFile.r(), 11));
        }

        @Override // xsna.dkf0
        public final int getAdapterOffset() {
            return 0;
        }

        @Override // xsna.dkf0
        public final int getItemCount() {
            return g9h.this.b.getItemCount();
        }

        @Override // xsna.dkf0
        public final RecyclerView getRecyclerView() {
            return g9h.this.e;
        }

        @Override // xsna.ai5
        public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g9h(Context context, Lifecycle lifecycle, List<? extends VideoFile> list) {
        this.a = list;
        c cVar = new c();
        xqh xqhVar = new xqh();
        this.b = xqhVar;
        tev tevVar = tev.a;
        hbt0 hbt0Var = new hbt0(context, cVar, lifecycle, new ddh0(2), null, 130032);
        this.c = hbt0Var;
        oht0 oht0Var = new oht0(null, new f9h(this, 0), null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        this.d = oht0Var;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setOverScrollMode(2);
        recyclerView.addOnScrollListener(hbt0Var);
        this.e = recyclerView;
        a aVar = new a(recyclerView, linearLayoutManager);
        b bVar = new b();
        xqhVar.setItems(list);
        recyclerView.setAdapter(xqhVar);
        recyclerView.addOnAttachStateChangeListener(aVar);
        recyclerView.addOnScrollListener(bVar);
        oht0Var.attachToRecyclerView(recyclerView);
    }
}
