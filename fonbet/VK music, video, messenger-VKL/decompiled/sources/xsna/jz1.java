package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$FloatRef;
import one.video.player.BaseVideoPlayer;
import xsna.dv70;
import xsna.ln50;
import xsna.nn20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class jz1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jz1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        List<MusicTrack> list;
        List<MusicTrack> list2;
        switch (this.b) {
            case 0:
                fz1 fz1Var = (fz1) this.c;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.d;
                float floatValue = ((Float) obj).floatValue();
                fz1Var.a(floatValue, ((Float) obj2).floatValue());
                ref$FloatRef.element = floatValue;
                return s3q0.a;
            case 1:
                w44 w44Var = (w44) this.c;
                jai jaiVar = (jai) this.d;
                ((Integer) obj2).getClass();
                w44Var.a(ne7.I(7), (androidx.compose.runtime.a) obj, jaiVar);
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((nn20) this.c).a((nn20.a) this.d, (androidx.compose.runtime.a) obj, ne7.I(439));
                return s3q0.a;
            case 3:
                UserId userId = (UserId) this.c;
                wu70 wu70Var = (wu70) this.d;
                el50 el50Var = (el50) obj;
                com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a aVar = (com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a) obj2;
                if (epx.f(aVar, a.d.b)) {
                    el50Var.W().c(dv70.b.a);
                } else if (epx.f(aVar, a.b.b)) {
                    el50Var.f(el50Var, new in50(fpf0.a(a.b.class)), ln50.a.a, new yf7(wu70Var, userId, el50Var, 8));
                } else {
                    Object obj3 = null;
                    if (aVar instanceof a.c) {
                        lm50 currentState = el50Var.W().getCurrentState();
                        OfflinePodcastEpisodesMviState.Content content = currentState instanceof OfflinePodcastEpisodesMviState.Content ? (OfflinePodcastEpisodesMviState.Content) currentState : null;
                        if (content != null && (list2 = content.c) != null) {
                            Iterator<T> it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (epx.f(((MusicTrack) next).Fb(), ((a.c) aVar).b)) {
                                        obj3 = next;
                                    }
                                }
                            }
                            MusicTrack musicTrack = (MusicTrack) obj3;
                            if (musicTrack != null) {
                                el50Var.W().c(new dv70.c(musicTrack, MusicBottomSheetLaunchPoint.Delete.b));
                            }
                        }
                    } else if (aVar instanceof a.C1352a) {
                        el50Var.f(el50Var, new rn50("load_episodes"), ln50.a.c, new swe(wu70Var, userId, ((a.C1352a) aVar).b, el50Var, 4));
                    } else {
                        if (!(aVar instanceof a.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lm50 currentState2 = el50Var.W().getCurrentState();
                        OfflinePodcastEpisodesMviState.Content content2 = currentState2 instanceof OfflinePodcastEpisodesMviState.Content ? (OfflinePodcastEpisodesMviState.Content) currentState2 : null;
                        if (content2 != null && (list = content2.c) != null) {
                            String str = ((a.e) aVar).b;
                            Iterator<T> it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    if (epx.f(((MusicTrack) next2).Fb(), str)) {
                                        obj3 = next2;
                                    }
                                }
                            }
                            MusicTrack musicTrack2 = (MusicTrack) obj3;
                            if (musicTrack2 != null) {
                                wu70Var.c.N0(new lqk0((StartPlaySource) null, musicTrack2, list, wu70Var.b, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1009));
                            }
                        }
                    }
                }
                return s3q0.a;
            default:
                ks80 ks80Var = (ks80) this.c;
                BaseVideoPlayer baseVideoPlayer = (BaseVideoPlayer) this.d;
                ohk0 ohk0Var = (ohk0) obj;
                String str2 = (String) obj2;
                int hashCode = baseVideoPlayer.hashCode();
                if (ks80Var.d.getLooper().isCurrentThread()) {
                    HashMap<Integer, Set<String>> hashMap = ks80Var.c;
                    Integer valueOf = Integer.valueOf(hashCode);
                    final nx7 nx7Var = new nx7(ks80Var, 9);
                    hashMap.computeIfPresent(valueOf, new BiFunction() { // from class: xsna.cs80
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj4, Object obj5) {
                            return (Set) nx7.this.invoke(obj4, obj5);
                        }
                    });
                }
                ohk0Var.c("onPlayerInit");
                ohk0Var.m(((Number) ks80Var.a.invoke()).longValue(), "user.id");
                ks80.g(ks80Var, baseVideoPlayer, "STATE:INIT", str2);
                return s3q0.a;
        }
    }

    public /* synthetic */ jz1(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
