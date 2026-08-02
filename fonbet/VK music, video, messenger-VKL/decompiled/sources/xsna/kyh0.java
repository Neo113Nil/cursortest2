package xsna;

import android.net.Uri;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.search.history.SearchHistoryModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import xsna.jyh0;

/* compiled from: SearchResultsScreenItemClickHandler.kt */
/* loaded from: classes16.dex */
public final class kyh0 extends zd40 {
    public final /* synthetic */ jyh0 e;
    public final /* synthetic */ FunctionReferenceImpl f;
    public final /* synthetic */ gzs<Boolean> g;
    public final /* synthetic */ gzs<String> h;

    /* compiled from: SearchResultsScreenItemClickHandler.kt */
    @b6l(c = "com.vk.catalog2.feature.music.search.history.handlers.SearchResultsScreenItemClickHandler$wrapCatalogUIClickTracker$1$track$1", f = "SearchResultsScreenItemClickHandler.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Object $additionalData;
        final /* synthetic */ UIBlock $block;
        final /* synthetic */ gzs<Boolean> $isSectionAllowedToBeHandled;
        final /* synthetic */ gzs<String> $query;
        final /* synthetic */ gzs<Boolean> $useObjectSearchHistory;
        int label;
        final /* synthetic */ jyh0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gzs<Boolean> gzsVar, gzs<Boolean> gzsVar2, UIBlock uIBlock, jyh0 jyh0Var, Object obj, gzs<String> gzsVar3, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$useObjectSearchHistory = gzsVar;
            this.$isSectionAllowedToBeHandled = gzsVar2;
            this.$block = uIBlock;
            this.this$0 = jyh0Var;
            this.$additionalData = obj;
            this.$query = gzsVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$useObjectSearchHistory, this.$isSectionAllowedToBeHandled, this.$block, this.this$0, this.$additionalData, this.$query, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x0189  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vp70 vp70Var;
            String group;
            UserId userId;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (this.$useObjectSearchHistory.invoke().booleanValue() && this.$isSectionAllowedToBeHandled.invoke().booleanValue()) {
                UIBlock uIBlock = this.$block;
                UserId userId2 = this.this$0.a;
                List<Class<? extends UIBlock>> list = swp0.a;
                Class<?> cls = uIBlock.getClass();
                List<Class<? extends UIBlock>> list2 = swp0.a;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (cls.equals((Class) it.next())) {
                            jyh0 jyh0Var = this.this$0;
                            UIBlock uIBlock2 = this.$block;
                            Object obj2 = this.$additionalData;
                            String invoke = this.$query.invoke();
                            jyh0Var.getClass();
                            MusicAnalyticsInfo musicAnalyticsInfo = obj2 instanceof MusicAnalyticsInfo ? (MusicAnalyticsInfo) obj2 : null;
                            MusicAnalyticsInfo.ClickTarget clickTarget = musicAnalyticsInfo != null ? musicAnalyticsInfo.a : null;
                            ContentType contentType = obj2 instanceof ContentType ? (ContentType) obj2 : null;
                            if (uIBlock2 instanceof UIBlockLink) {
                                int i = contentType == null ? -1 : jyh0.a.$EnumSwitchMapping$0[contentType.ordinal()];
                                SearchHistoryModel.Type type = i != 1 ? i != 2 ? i != 3 ? null : SearchHistoryModel.Type.AudioBook : SearchHistoryModel.Type.Podcast : SearchHistoryModel.Type.Artist;
                                if (type != null) {
                                    CatalogLink catalogLink = ((UIBlockLink) uIBlock2).y;
                                    Meta meta = catalogLink.g;
                                    String str = catalogLink.e;
                                    ContentType contentType2 = meta != null ? meta.c : null;
                                    int i2 = contentType2 != null ? cvh0.$EnumSwitchMapping$0[contentType2.ordinal()] : -1;
                                    if (i2 == 1) {
                                        Regex regex = rm40.a;
                                        peq0 peq0Var = new peq0(Uri.parse(str));
                                        if (peq0.p(peq0Var, rm40.a, null, null, 14)) {
                                            group = peq0Var.c.group(1);
                                        } else {
                                            if (peq0.p(peq0Var, rm40.b, null, null, 14)) {
                                                group = peq0Var.c.group(1);
                                            }
                                            group = null;
                                        }
                                        if (group != null) {
                                        }
                                    } else if (i2 == 2) {
                                        Regex regex2 = tm40.a;
                                        peq0 peq0Var2 = new peq0(Uri.parse(str));
                                        if (peq0.p(peq0Var2, tm40.a, null, null, 14)) {
                                            group = peq0Var2.c.group(1);
                                        } else if (peq0.p(peq0Var2, tm40.b, null, null, 14)) {
                                            group = peq0Var2.c.group(1);
                                        } else if (peq0.p(peq0Var2, tm40.c, null, null, 14)) {
                                            group = peq0Var2.c.group(1);
                                        } else {
                                            if (peq0.p(peq0Var2, tm40.d, null, null, 14)) {
                                                group = peq0Var2.c.group(1);
                                            }
                                            group = null;
                                        }
                                        if (group != null) {
                                        }
                                    } else if (i2 != 3) {
                                        if (i2 == 4) {
                                            Regex regex3 = sm40.a;
                                            peq0 peq0Var3 = new peq0(Uri.parse(str));
                                            if (peq0.p(peq0Var3, sm40.a, null, null, 14)) {
                                                group = peq0Var3.c.group(1);
                                                if (group != null) {
                                                    if (type == SearchHistoryModel.Type.Podcast) {
                                                        Long n = arm0.n(group);
                                                        if (n != null) {
                                                            userId = new UserId(n.longValue());
                                                            group = "-100";
                                                        }
                                                    } else {
                                                        userId = UserId.d;
                                                    }
                                                    vp70Var = new vp70(type, userId, group, null, invoke);
                                                }
                                            }
                                        }
                                        group = null;
                                        if (group != null) {
                                        }
                                    } else {
                                        Regex regex4 = um40.a;
                                        peq0 peq0Var4 = new peq0(Uri.parse(str));
                                        if (peq0.p(peq0Var4, um40.a, null, null, 14)) {
                                            group = peq0Var4.c.group(1);
                                        } else {
                                            if (peq0.p(peq0Var4, um40.b, null, null, 14)) {
                                                group = peq0Var4.c.group(1);
                                            }
                                            group = null;
                                        }
                                        if (group != null) {
                                        }
                                    }
                                }
                                vp70Var = null;
                            } else if (uIBlock2 instanceof UIBlockMusicTrack) {
                                if (clickTarget == MusicAnalyticsInfo.ClickTarget.Play) {
                                    UIBlockMusicTrack uIBlockMusicTrack = (UIBlockMusicTrack) uIBlock2;
                                    String str2 = uIBlockMusicTrack.B;
                                    MusicTrack musicTrack = uIBlockMusicTrack.z;
                                    vp70Var = str2.length() > 0 ? new vp70(SearchHistoryModel.Type.TrackLyrics, musicTrack.c, String.valueOf(musicTrack.b), musicTrack.r, invoke) : new vp70(SearchHistoryModel.Type.Track, musicTrack.c, String.valueOf(musicTrack.b), musicTrack.r, invoke);
                                }
                                vp70Var = null;
                            } else if (uIBlock2 instanceof UIBlockMusicPlaylist) {
                                if (clickTarget == MusicAnalyticsInfo.ClickTarget.Open) {
                                    UIBlockMusicPlaylist uIBlockMusicPlaylist = (UIBlockMusicPlaylist) uIBlock2;
                                    if (uIBlockMusicPlaylist.z.Gb()) {
                                        Playlist playlist = uIBlockMusicPlaylist.z;
                                        vp70Var = new vp70(SearchHistoryModel.Type.Playlist, playlist.c, String.valueOf(playlist.b), playlist.x, invoke);
                                    } else {
                                        Playlist playlist2 = uIBlockMusicPlaylist.z;
                                        vp70Var = new vp70(SearchHistoryModel.Type.Album, playlist2.c, String.valueOf(playlist2.b), playlist2.x, invoke);
                                    }
                                }
                                vp70Var = null;
                            } else if (uIBlock2 instanceof UIBlockRadioStation) {
                                if (clickTarget == MusicAnalyticsInfo.ClickTarget.Play) {
                                    vp70Var = new vp70(SearchHistoryModel.Type.RadioStation, UserId.d, String.valueOf(((UIBlockRadioStation) uIBlock2).y.b), null, invoke);
                                }
                                vp70Var = null;
                            } else {
                                if (uIBlock2 instanceof UIBlockVideo) {
                                    VideoFile videoFile = ((UIBlockVideo) uIBlock2).B;
                                    vp70Var = new vp70(SearchHistoryModel.Type.Video, videoFile.I0(), String.valueOf(videoFile.o0()), videoFile.C1(), invoke);
                                }
                                vp70Var = null;
                            }
                            if (vp70Var != null) {
                                yp70 yp70Var = jyh0Var.b;
                                myc0.h(yp70Var.h, yp70Var.b, null, new wp70(yp70Var, vp70Var, null), 2);
                            }
                            return s3q0.a;
                        }
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kyh0(b5a b5aVar, w950 w950Var, s1v s1vVar, gzs<String> gzsVar, jyh0 jyh0Var, gzs<Boolean> gzsVar2, gzs<Boolean> gzsVar3, gzs<String> gzsVar4) {
        super(b5aVar, w950Var, s1vVar, gzsVar);
        this.e = jyh0Var;
        this.f = (FunctionReferenceImpl) gzsVar2;
        this.g = gzsVar3;
        this.h = gzsVar4;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.zd40, xsna.uha
    public final void c(UIBlock uIBlock, Object obj) {
        super.c(uIBlock, obj);
        jyh0 jyh0Var = this.e;
        myc0.h(jyh0Var.d, jyh0Var.c, null, new a(this.f, this.g, uIBlock, jyh0Var, obj, this.h, null), 2);
    }
}
