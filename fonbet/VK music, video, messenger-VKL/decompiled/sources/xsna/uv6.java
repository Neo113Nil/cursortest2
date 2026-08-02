package xsna;

import android.media.metrics.PlaybackStateEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Be;
import com.ironsource.C4623we;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import com.vk.music.ui.bottomsheet.MusicPlayerPersistentBottomSheet;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class uv6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uv6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Be.a((C4623we) this.c, (Be) this.d);
                return;
            case 1:
                VkButton vkButton = (VkButton) this.c;
                ((cys) this.d).getClass();
                r6m.a.getClass();
                d3m.e(vkButton, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : r6m.l() ? 10000L : 1000L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                return;
            case 2:
                ((FrameLayout) this.c).addView((VkImageSimple) this.d);
                return;
            case 3:
                p9w p9wVar = (p9w) this.c;
                ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source source = (ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source) this.d;
                synchronized (p9wVar) {
                    try {
                        for (ImMsgPushSettingsProvider.Type type : ImMsgPushSettingsProvider.Type.values()) {
                            boolean i = p9wVar.i(source, type);
                            if (p9wVar.k[source.ordinal()][type.ordinal()] != i) {
                                p9wVar.k[source.ordinal()][type.ordinal()] = i;
                                Iterator<ImMsgPushSettingsProvider.OnEnabledUpdateListener> it = p9wVar.d.iterator();
                                while (it.hasNext()) {
                                    it.next().a();
                                }
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 4:
                uzz uzzVar = (uzz) this.c;
                Runnable runnable = (Runnable) this.d;
                RecyclerView recyclerView = uzzVar.e;
                if (recyclerView == null || !recyclerView.isComputingLayout()) {
                    runnable.run();
                    return;
                } else {
                    uzzVar.a(runnable);
                    return;
                }
            case 5:
                ((ps10) this.c).e.reportPlaybackStateEvent((PlaybackStateEvent) this.d);
                return;
            case 6:
                izs izsVar = (izs) this.c;
                MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet = (MusicPlayerPersistentBottomSheet) this.d;
                int i2 = MusicPlayerPersistentBottomSheet.u0;
                izsVar.invoke(musicPlayerPersistentBottomSheet);
                return;
            default:
                PostFragment postFragment = (PostFragment) this.c;
                RecyclerView recyclerView2 = (RecyclerView) this.d;
                int i3 = PostFragment.S0;
                PostViewFragmentTimeSpentTracker Co = postFragment.Co();
                if (Co != null) {
                    Co.a(recyclerView2);
                    return;
                }
                return;
        }
    }
}
