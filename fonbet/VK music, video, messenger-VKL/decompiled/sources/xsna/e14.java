package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachArtist;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachCurator;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.attaches.AttachEvent;
import com.vk.im.engine.models.attaches.AttachFakeFwd;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.attaches.AttachPodcastEpisode;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AttachWallReply;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniApp;
import com.vk.im.engine.models.content.PodcastEpisode;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.en30;

/* compiled from: AttachContentFormatter.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public final class e14 {
    public static final e14 a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final com.vk.im.ui.formatters.a c;
    public static final en30 d;
    public static final gdp e;
    public static final wqo0 f;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(e14.class, "tmpList", "getTmpList()Ljava/util/List;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
        a = new e14();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        c = new com.vk.im.ui.formatters.a(context);
        Context context2 = e43.a;
        d = new en30(context2 != null ? context2 : null);
        e = new gdp();
        f = new wqo0(new d14(0));
    }

    public static CharSequence a(Attach attach) {
        CharSequence charSequence;
        String str;
        String str2;
        b().clear();
        b().add(attach);
        boolean z = attach instanceof AttachArtist;
        com.vk.im.ui.formatters.a aVar = c;
        if (z) {
            charSequence = ((AttachArtist) attach).c;
        } else if (attach instanceof AttachCurator) {
            charSequence = ((AttachCurator) attach).c;
        } else {
            if (attach instanceof AttachAudio) {
                MusicTrack musicTrack = ((AttachAudio) attach).b;
                List<Artist> list = musicTrack.t;
                if (list == null || (str = j5g.g0(list, null, null, null, 0, new wq3(1), 31)) == null) {
                    str = musicTrack.h;
                }
                List<Artist> list2 = musicTrack.u;
                if (list2 == null || (str2 = j5g.g0(list2, null, null, null, 0, new y40(3), 31)) == null) {
                    str2 = "";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str != null ? str : "");
                sb.append(' ');
                sb.append(str2);
                String obj = drm0.p0(sb.toString()).toString();
                e.getClass();
                charSequence = gdp.a(obj);
            } else {
                if (attach instanceof AttachDoc) {
                    AttachDoc attachDoc = (AttachDoc) attach;
                    return attachDoc.g.length() > 0 ? attachDoc.g : attachDoc.j.toUpperCase(Locale.ROOT);
                }
                if (attach instanceof AttachFakeFwd) {
                    List<NestedMsg> list3 = ((AttachFakeFwd) attach).b;
                    NestedMsg.Type type = ((NestedMsg) j5g.Y(list3)).b;
                    int size = list3.size();
                    en30 en30Var = d;
                    en30Var.getClass();
                    int i = en30.a.$EnumSwitchMapping$0[type.ordinal()];
                    if (i == 1) {
                        charSequence = en30Var.a(size);
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        charSequence = en30Var.c(size);
                    }
                } else {
                    if (!(attach instanceof AttachGift) && !(attach instanceof AttachGraffiti)) {
                        if (!(attach instanceof AttachImage)) {
                            if (attach instanceof AttachLink) {
                                charSequence = ((AttachLink) attach).f.toLowerCase(Locale.ROOT);
                            } else if (attach instanceof AttachMap) {
                                AttachMap attachMap = (AttachMap) attach;
                                charSequence = attachMap.g.length() > 0 ? attachMap.g : aVar.c(b());
                            } else if (attach instanceof AttachMarket) {
                                charSequence = ((AttachMarket) attach).f;
                            } else if (attach instanceof AttachPlaylist) {
                                charSequence = ((AttachPlaylist) attach).getTitle();
                            } else if (attach instanceof AttachPodcastEpisode) {
                                PodcastEpisode podcastEpisode = ((AttachPodcastEpisode) attach).d;
                                String str3 = podcastEpisode.e;
                                charSequence = str3 == null ? podcastEpisode.d : str3;
                            } else if (attach instanceof AttachPoll) {
                                charSequence = ((AttachPoll) attach).d.d;
                            } else if (!(attach instanceof AttachStory) && !(attach instanceof AttachVideo)) {
                                if (!(attach instanceof AttachWall) && !(attach instanceof AttachWallReply)) {
                                    if (attach instanceof AttachEvent) {
                                        charSequence = ((AttachEvent) attach).e;
                                    } else if (attach instanceof AttachMiniApp) {
                                        charSequence = ((AttachMiniApp) attach).c;
                                    } else if (attach instanceof AttachDonutLink) {
                                        charSequence = ((AttachDonutLink) attach).f;
                                    } else if (attach instanceof AttachQuestion) {
                                        charSequence = ((AttachQuestion) attach).d;
                                    }
                                }
                            }
                        }
                        charSequence = "";
                    }
                    charSequence = null;
                }
            }
        }
        return charSequence == null ? aVar.c(b()) : charSequence;
    }

    public static List b() {
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = f;
        wqo0Var.getClass();
        return (List) wqo0Var.get();
    }
}
