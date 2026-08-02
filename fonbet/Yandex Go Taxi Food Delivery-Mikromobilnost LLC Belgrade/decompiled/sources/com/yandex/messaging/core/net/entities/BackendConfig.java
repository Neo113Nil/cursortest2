package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.j73;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.scc;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

@DefaultIfNull
@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bG\b\u0087\b\u0018\u0000 m2\u00020\u0001:\u000e`abcdefghijklmB\u008d\u0002\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\u001a\b\u0003\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b\u0012\u001a\b\u0003\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0003\u0010 \u001a\u00020!\u0012\b\b\u0003\u0010\"\u001a\u00020#\u0012\b\b\u0003\u0010$\u001a\u00020%\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010K\u001a\u00020\tHÆ\u0003J\u001b\u0010L\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000bHÆ\u0003J\u001b\u0010M\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000bHÆ\u0003J\t\u0010N\u001a\u00020\u000fHÆ\u0003J\t\u0010O\u001a\u00020\u0011HÆ\u0003J\t\u0010P\u001a\u00020\u0013HÆ\u0003J\t\u0010Q\u001a\u00020\u0015HÆ\u0003J\t\u0010R\u001a\u00020\u0017HÆ\u0003J\t\u0010S\u001a\u00020\u0019HÆ\u0003J\t\u0010T\u001a\u00020\u001bHÆ\u0003J\t\u0010U\u001a\u00020\u001dHÆ\u0003J\t\u0010V\u001a\u00020\u001fHÆ\u0003J\t\u0010W\u001a\u00020!HÆ\u0003J\t\u0010X\u001a\u00020#HÆ\u0003J\t\u0010Y\u001a\u00020%HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010'HÆ\u0003J\u008f\u0002\u0010[\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\b\u001a\u00020\t2\u001a\b\u0003\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b2\u001a\b\u0003\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00132\b\b\u0003\u0010\u0014\u001a\u00020\u00152\b\b\u0003\u0010\u0016\u001a\u00020\u00172\b\b\u0003\u0010\u0018\u001a\u00020\u00192\b\b\u0003\u0010\u001a\u001a\u00020\u001b2\b\b\u0003\u0010\u001c\u001a\u00020\u001d2\b\b\u0003\u0010\u001e\u001a\u00020\u001f2\b\b\u0003\u0010 \u001a\u00020!2\b\b\u0003\u0010\"\u001a\u00020#2\b\b\u0003\u0010$\u001a\u00020%2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010'HÆ\u0001J\u0013\u0010\\\u001a\u00020\t2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\u0004HÖ\u0001J\t\u0010_\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R#\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bE\u0010F¨\u0006n"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig;", "", "hiddenNamespaces", "", "", "hiddenInviteLinkNamespaces", "hiddenParticipantsNamespaces", "noPhoneNamespaces", "reactionsEnabled", "", "reactionsConfig", "", "", "extendedReactionsConfig", "voiceMessagesConfig", "Lcom/yandex/messaging/core/net/entities/BackendConfig$VoiceMessagesConfig;", "starredMessagesConfig", "Lcom/yandex/messaging/core/net/entities/BackendConfig$StarredMessagesConfig;", "pollMessagesConfig", "Lcom/yandex/messaging/core/net/entities/BackendConfig$PollMessagesConfig;", "threadsConfig", "Lcom/yandex/messaging/core/net/entities/BackendConfig$ThreadsConfig;", "meetingsConfig", "Lcom/yandex/messaging/core/net/entities/BackendConfig$MeetingsConfig;", "translationsConfig", "Lcom/yandex/messaging/core/net/entities/BackendConfig$TranslationsConfig;", "publicReactions", "Lcom/yandex/messaging/core/net/entities/BackendConfig$PublicReactionsConfig;", "textSuggest", "Lcom/yandex/messaging/core/net/entities/BackendConfig$TextSuggestConfig;", "folders", "Lcom/yandex/messaging/core/net/entities/FoldersConfig;", "filePreviews", "Lcom/yandex/messaging/core/net/entities/BackendConfig$FilePreviewsConfig;", "docViewer", "Lcom/yandex/messaging/core/net/entities/BackendConfig$DocViewerConfig;", "videoPlayer", "Lcom/yandex/messaging/core/net/entities/BackendConfig$VideoPlayerConfig;", "customConfig", "Ljava/lang/Object;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;Lcom/yandex/messaging/core/net/entities/BackendConfig$VoiceMessagesConfig;Lcom/yandex/messaging/core/net/entities/BackendConfig$StarredMessagesConfig;Lcom/yandex/messaging/core/net/entities/BackendConfig$PollMessagesConfig;Lcom/yandex/messaging/core/net/entities/BackendConfig$ThreadsConfig;Lcom/yandex/messaging/core/net/entities/BackendConfig$MeetingsConfig;Lcom/yandex/messaging/core/net/entities/BackendConfig$TranslationsConfig;Lcom/yandex/messaging/core/net/entities/BackendConfig$PublicReactionsConfig;Lcom/yandex/messaging/core/net/entities/BackendConfig$TextSuggestConfig;Lcom/yandex/messaging/core/net/entities/FoldersConfig;Lcom/yandex/messaging/core/net/entities/BackendConfig$FilePreviewsConfig;Lcom/yandex/messaging/core/net/entities/BackendConfig$DocViewerConfig;Lcom/yandex/messaging/core/net/entities/BackendConfig$VideoPlayerConfig;Ljava/lang/Object;)V", "getReactionsConfig", "()Ljava/util/Map;", "getExtendedReactionsConfig", "getVoiceMessagesConfig", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$VoiceMessagesConfig;", "getStarredMessagesConfig", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$StarredMessagesConfig;", "getPollMessagesConfig", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$PollMessagesConfig;", "getThreadsConfig", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$ThreadsConfig;", "getMeetingsConfig", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$MeetingsConfig;", "getTranslationsConfig", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$TranslationsConfig;", "getPublicReactions", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$PublicReactionsConfig;", "getTextSuggest", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$TextSuggestConfig;", "getFolders", "()Lcom/yandex/messaging/core/net/entities/FoldersConfig;", "getFilePreviews", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$FilePreviewsConfig;", "getDocViewer", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$DocViewerConfig;", "getVideoPlayer", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$VideoPlayerConfig;", "getCustomConfig", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "toString", "VoiceMessagesConfig", "StarredMessagesConfig", "PollMessagesConfig", "ThreadsConfig", "MeetingsConfig", "TranslationsConfig", "PublicReactionsConfig", "TextSuggestConfig", "DocViewerConfig", "FilePreviewsConfig", "VideoPlayerConfig", "SourceExtensions", "Restrictions", "Companion", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BackendConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Set<Integer> DEFAULT_NO_PHONE_NAMESPACES = j73.f0(new Integer[]{3, 4, 5, 7, 9, 13, 14, 15, 17});
    private final Object customConfig;
    private final DocViewerConfig docViewer;
    private final Map<String, List<Integer>> extendedReactionsConfig;
    private final FilePreviewsConfig filePreviews;
    private final FoldersConfig folders;
    public final List<Integer> hiddenInviteLinkNamespaces;
    public final List<Integer> hiddenNamespaces;
    public final List<Integer> hiddenParticipantsNamespaces;
    private final MeetingsConfig meetingsConfig;
    public final List<Integer> noPhoneNamespaces;
    private final PollMessagesConfig pollMessagesConfig;
    private final PublicReactionsConfig publicReactions;
    private final Map<String, List<Integer>> reactionsConfig;
    public final boolean reactionsEnabled;
    private final StarredMessagesConfig starredMessagesConfig;
    private final TextSuggestConfig textSuggest;
    private final ThreadsConfig threadsConfig;
    private final TranslationsConfig translationsConfig;
    private final VideoPlayerConfig videoPlayer;
    private final VoiceMessagesConfig voiceMessagesConfig;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$Companion;", "", "", "", "DEFAULT_NO_PHONE_NAMESPACES", "Ljava/util/Set;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static BackendConfig a() {
            return new BackendConfig(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BackendConfig(List list, List list2, List list3, List list4, boolean z, Map map, Map map2, VoiceMessagesConfig voiceMessagesConfig, StarredMessagesConfig starredMessagesConfig, PollMessagesConfig pollMessagesConfig, ThreadsConfig threadsConfig, MeetingsConfig meetingsConfig, TranslationsConfig translationsConfig, PublicReactionsConfig publicReactionsConfig, TextSuggestConfig textSuggestConfig, FoldersConfig foldersConfig, FilePreviewsConfig filePreviewsConfig, DocViewerConfig docViewerConfig, VideoPlayerConfig videoPlayerConfig, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r32, r20, r21, r22, r23, r2, (i & 64) != 0 ? b.f() : map2, (i & 128) != 0 ? new VoiceMessagesConfig(0, null, 3, null) : voiceMessagesConfig, (i & 256) != 0 ? new StarredMessagesConfig(null, r1, null == true ? 1 : 0) : starredMessagesConfig, (i & 512) != 0 ? new PollMessagesConfig(null == true ? 1 : 0, r1, null == true ? 1 : 0) : pollMessagesConfig, (i & 1024) != 0 ? new ThreadsConfig(null == true ? 1 : 0, r1, null == true ? 1 : 0) : threadsConfig, (i & 2048) != 0 ? new MeetingsConfig(null == true ? 1 : 0, 0, r6, null == true ? 1 : 0) : meetingsConfig, (i & 4096) != 0 ? new TranslationsConfig(null == true ? 1 : 0, r1, null == true ? 1 : 0) : translationsConfig, (i & 8192) != 0 ? new PublicReactionsConfig(null == true ? 1 : 0, r1, null == true ? 1 : 0) : publicReactionsConfig, (i & 16384) != 0 ? new TextSuggestConfig(0, 0, 0, 7, null) : textSuggestConfig, (32768 & i) != 0 ? new FoldersConfig(0, 0, null, null, 15, null) : foldersConfig, (65536 & i) != 0 ? new FilePreviewsConfig(null == true ? 1 : 0, null == true ? 1 : 0, r6, null == true ? 1 : 0) : filePreviewsConfig, (131072 & i) != 0 ? new DocViewerConfig(null == true ? 1 : 0, null == true ? 1 : 0, r6, null == true ? 1 : 0) : docViewerConfig, (i & 262144) != 0 ? new VideoPlayerConfig(null == true ? 1 : 0, null == true ? 1 : 0, r6, null == true ? 1 : 0) : videoPlayerConfig, (i & 524288) != 0 ? null : obj);
        List list5;
        int i2;
        Map map3;
        List g = (i & 1) != 0 ? scc.g(5, 15) : list;
        int i3 = i & 2;
        EmptyList emptyList = EmptyList.a;
        List list6 = i3 != 0 ? emptyList : list2;
        List list7 = (i & 4) != 0 ? emptyList : list3;
        List J0 = (i & 8) != 0 ? a.J0(DEFAULT_NO_PHONE_NAMESPACES) : list4;
        boolean z2 = (i & 16) != 0 ? true : z;
        if ((i & 32) != 0) {
            list5 = g;
            i2 = 1;
            map3 = b.i(new Pair("default", scc.g(128077, 128078, 128518, 128567, 128562, 128293, 10084, 128557)), new Pair("default_team", scc.g(128077, 128078, 128518, 128567, 129442, 128562, 128293, 10084, 128557)), new Pair("private", scc.g(128077, 128078, 128518, 128567, 128562, 128293, 10084, 128557)), new Pair("0_team", scc.g(128077, 128078, 128518, 128567, 129442, 128562, 128293, 10084, 128557)), new Pair("3", scc.g(128077, 128525, 128518, 128562, 128557, 128545)), new Pair("12", scc.g(128077, 128078, 128518, 128567, 129442, 128562, 128293, 10084, 128557, 128077, 128078, 128518, 128567, 129442, 128562, 128293, 10084, 128557)), new Pair("17", scc.g(128077, 128078)));
        } else {
            list5 = g;
            i2 = 1;
            map3 = map;
        }
        int i4 = 3;
    }

    public static /* synthetic */ BackendConfig copy$default(BackendConfig backendConfig, List list, List list2, List list3, List list4, boolean z, Map map, Map map2, VoiceMessagesConfig voiceMessagesConfig, StarredMessagesConfig starredMessagesConfig, PollMessagesConfig pollMessagesConfig, ThreadsConfig threadsConfig, MeetingsConfig meetingsConfig, TranslationsConfig translationsConfig, PublicReactionsConfig publicReactionsConfig, TextSuggestConfig textSuggestConfig, FoldersConfig foldersConfig, FilePreviewsConfig filePreviewsConfig, DocViewerConfig docViewerConfig, VideoPlayerConfig videoPlayerConfig, Object obj, int i, Object obj2) {
        Object obj3;
        VideoPlayerConfig videoPlayerConfig2;
        List list5 = (i & 1) != 0 ? backendConfig.hiddenNamespaces : list;
        List list6 = (i & 2) != 0 ? backendConfig.hiddenInviteLinkNamespaces : list2;
        List list7 = (i & 4) != 0 ? backendConfig.hiddenParticipantsNamespaces : list3;
        List list8 = (i & 8) != 0 ? backendConfig.noPhoneNamespaces : list4;
        boolean z2 = (i & 16) != 0 ? backendConfig.reactionsEnabled : z;
        Map map3 = (i & 32) != 0 ? backendConfig.reactionsConfig : map;
        Map map4 = (i & 64) != 0 ? backendConfig.extendedReactionsConfig : map2;
        VoiceMessagesConfig voiceMessagesConfig2 = (i & 128) != 0 ? backendConfig.voiceMessagesConfig : voiceMessagesConfig;
        StarredMessagesConfig starredMessagesConfig2 = (i & 256) != 0 ? backendConfig.starredMessagesConfig : starredMessagesConfig;
        PollMessagesConfig pollMessagesConfig2 = (i & 512) != 0 ? backendConfig.pollMessagesConfig : pollMessagesConfig;
        ThreadsConfig threadsConfig2 = (i & 1024) != 0 ? backendConfig.threadsConfig : threadsConfig;
        MeetingsConfig meetingsConfig2 = (i & 2048) != 0 ? backendConfig.meetingsConfig : meetingsConfig;
        TranslationsConfig translationsConfig2 = (i & 4096) != 0 ? backendConfig.translationsConfig : translationsConfig;
        PublicReactionsConfig publicReactionsConfig2 = (i & 8192) != 0 ? backendConfig.publicReactions : publicReactionsConfig;
        List list9 = list5;
        TextSuggestConfig textSuggestConfig2 = (i & 16384) != 0 ? backendConfig.textSuggest : textSuggestConfig;
        FoldersConfig foldersConfig2 = (i & 32768) != 0 ? backendConfig.folders : foldersConfig;
        FilePreviewsConfig filePreviewsConfig2 = (i & 65536) != 0 ? backendConfig.filePreviews : filePreviewsConfig;
        DocViewerConfig docViewerConfig2 = (i & 131072) != 0 ? backendConfig.docViewer : docViewerConfig;
        VideoPlayerConfig videoPlayerConfig3 = (i & 262144) != 0 ? backendConfig.videoPlayer : videoPlayerConfig;
        if ((i & 524288) != 0) {
            videoPlayerConfig2 = videoPlayerConfig3;
            obj3 = backendConfig.customConfig;
        } else {
            obj3 = obj;
            videoPlayerConfig2 = videoPlayerConfig3;
        }
        return backendConfig.copy(list9, list6, list7, list8, z2, map3, map4, voiceMessagesConfig2, starredMessagesConfig2, pollMessagesConfig2, threadsConfig2, meetingsConfig2, translationsConfig2, publicReactionsConfig2, textSuggestConfig2, foldersConfig2, filePreviewsConfig2, docViewerConfig2, videoPlayerConfig2, obj3);
    }

    public static final BackendConfig getDefault() {
        INSTANCE.getClass();
        return Companion.a();
    }

    public final List<Integer> component1() {
        return this.hiddenNamespaces;
    }

    /* renamed from: component10, reason: from getter */
    public final PollMessagesConfig getPollMessagesConfig() {
        return this.pollMessagesConfig;
    }

    /* renamed from: component11, reason: from getter */
    public final ThreadsConfig getThreadsConfig() {
        return this.threadsConfig;
    }

    /* renamed from: component12, reason: from getter */
    public final MeetingsConfig getMeetingsConfig() {
        return this.meetingsConfig;
    }

    /* renamed from: component13, reason: from getter */
    public final TranslationsConfig getTranslationsConfig() {
        return this.translationsConfig;
    }

    /* renamed from: component14, reason: from getter */
    public final PublicReactionsConfig getPublicReactions() {
        return this.publicReactions;
    }

    /* renamed from: component15, reason: from getter */
    public final TextSuggestConfig getTextSuggest() {
        return this.textSuggest;
    }

    /* renamed from: component16, reason: from getter */
    public final FoldersConfig getFolders() {
        return this.folders;
    }

    /* renamed from: component17, reason: from getter */
    public final FilePreviewsConfig getFilePreviews() {
        return this.filePreviews;
    }

    /* renamed from: component18, reason: from getter */
    public final DocViewerConfig getDocViewer() {
        return this.docViewer;
    }

    /* renamed from: component19, reason: from getter */
    public final VideoPlayerConfig getVideoPlayer() {
        return this.videoPlayer;
    }

    public final List<Integer> component2() {
        return this.hiddenInviteLinkNamespaces;
    }

    /* renamed from: component20, reason: from getter */
    public final Object getCustomConfig() {
        return this.customConfig;
    }

    public final List<Integer> component3() {
        return this.hiddenParticipantsNamespaces;
    }

    public final List<Integer> component4() {
        return this.noPhoneNamespaces;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getReactionsEnabled() {
        return this.reactionsEnabled;
    }

    public final Map<String, List<Integer>> component6() {
        return this.reactionsConfig;
    }

    public final Map<String, List<Integer>> component7() {
        return this.extendedReactionsConfig;
    }

    /* renamed from: component8, reason: from getter */
    public final VoiceMessagesConfig getVoiceMessagesConfig() {
        return this.voiceMessagesConfig;
    }

    /* renamed from: component9, reason: from getter */
    public final StarredMessagesConfig getStarredMessagesConfig() {
        return this.starredMessagesConfig;
    }

    public final BackendConfig copy(@Json(name = "hidden_namespaces") List<Integer> hiddenNamespaces, @Json(name = "hidden_invite_link_namespaces") List<Integer> hiddenInviteLinkNamespaces, @Json(name = "hidden_chat_participants_namespaces") List<Integer> hiddenParticipantsNamespaces, @Json(name = "namespaces_without_phone_requirement") List<Integer> noPhoneNamespaces, @Json(name = "reactions_enabled") boolean reactionsEnabled, @Json(name = "reactions_by_namespace") Map<String, ? extends List<Integer>> reactionsConfig, @Json(name = "extended_reactions_by_namespace") Map<String, ? extends List<Integer>> extendedReactionsConfig, @Json(name = "voice_messages") VoiceMessagesConfig voiceMessagesConfig, @Json(name = "important_messages") StarredMessagesConfig starredMessagesConfig, @Json(name = "polls_messages") PollMessagesConfig pollMessagesConfig, @Json(name = "threads") ThreadsConfig threadsConfig, @Json(name = "meetings") MeetingsConfig meetingsConfig, @Json(name = "translations") TranslationsConfig translationsConfig, @Json(name = "public_reactions") PublicReactionsConfig publicReactions, @Json(name = "typing_enhanced") TextSuggestConfig textSuggest, @Json(name = "folders") FoldersConfig folders, @Json(name = "file_previews") FilePreviewsConfig filePreviews, @Json(name = "docviewer") DocViewerConfig docViewer, @Json(name = "videoplayer") VideoPlayerConfig videoPlayer, @Json(name = "custom_config") Object customConfig) {
        return new BackendConfig(hiddenNamespaces, hiddenInviteLinkNamespaces, hiddenParticipantsNamespaces, noPhoneNamespaces, reactionsEnabled, reactionsConfig, extendedReactionsConfig, voiceMessagesConfig, starredMessagesConfig, pollMessagesConfig, threadsConfig, meetingsConfig, translationsConfig, publicReactions, textSuggest, folders, filePreviews, docViewer, videoPlayer, customConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackendConfig)) {
            return false;
        }
        BackendConfig backendConfig = (BackendConfig) other;
        return jl40.l(this.hiddenNamespaces, backendConfig.hiddenNamespaces) && jl40.l(this.hiddenInviteLinkNamespaces, backendConfig.hiddenInviteLinkNamespaces) && jl40.l(this.hiddenParticipantsNamespaces, backendConfig.hiddenParticipantsNamespaces) && jl40.l(this.noPhoneNamespaces, backendConfig.noPhoneNamespaces) && this.reactionsEnabled == backendConfig.reactionsEnabled && jl40.l(this.reactionsConfig, backendConfig.reactionsConfig) && jl40.l(this.extendedReactionsConfig, backendConfig.extendedReactionsConfig) && jl40.l(this.voiceMessagesConfig, backendConfig.voiceMessagesConfig) && jl40.l(this.starredMessagesConfig, backendConfig.starredMessagesConfig) && jl40.l(this.pollMessagesConfig, backendConfig.pollMessagesConfig) && jl40.l(this.threadsConfig, backendConfig.threadsConfig) && jl40.l(this.meetingsConfig, backendConfig.meetingsConfig) && jl40.l(this.translationsConfig, backendConfig.translationsConfig) && jl40.l(this.publicReactions, backendConfig.publicReactions) && jl40.l(this.textSuggest, backendConfig.textSuggest) && jl40.l(this.folders, backendConfig.folders) && jl40.l(this.filePreviews, backendConfig.filePreviews) && jl40.l(this.docViewer, backendConfig.docViewer) && jl40.l(this.videoPlayer, backendConfig.videoPlayer) && jl40.l(this.customConfig, backendConfig.customConfig);
    }

    public final Object getCustomConfig() {
        return this.customConfig;
    }

    public final DocViewerConfig getDocViewer() {
        return this.docViewer;
    }

    public final Map<String, List<Integer>> getExtendedReactionsConfig() {
        return this.extendedReactionsConfig;
    }

    public final FilePreviewsConfig getFilePreviews() {
        return this.filePreviews;
    }

    public final FoldersConfig getFolders() {
        return this.folders;
    }

    public final MeetingsConfig getMeetingsConfig() {
        return this.meetingsConfig;
    }

    public final PollMessagesConfig getPollMessagesConfig() {
        return this.pollMessagesConfig;
    }

    public final PublicReactionsConfig getPublicReactions() {
        return this.publicReactions;
    }

    public final Map<String, List<Integer>> getReactionsConfig() {
        return this.reactionsConfig;
    }

    public final StarredMessagesConfig getStarredMessagesConfig() {
        return this.starredMessagesConfig;
    }

    public final TextSuggestConfig getTextSuggest() {
        return this.textSuggest;
    }

    public final ThreadsConfig getThreadsConfig() {
        return this.threadsConfig;
    }

    public final TranslationsConfig getTranslationsConfig() {
        return this.translationsConfig;
    }

    public final VideoPlayerConfig getVideoPlayer() {
        return this.videoPlayer;
    }

    public final VoiceMessagesConfig getVoiceMessagesConfig() {
        return this.voiceMessagesConfig;
    }

    public int hashCode() {
        int hashCode = (this.videoPlayer.hashCode() + ((this.docViewer.hashCode() + ((this.filePreviews.hashCode() + ((this.folders.hashCode() + ((this.textSuggest.hashCode() + ((this.publicReactions.hashCode() + ((this.translationsConfig.hashCode() + ((this.meetingsConfig.hashCode() + ((this.threadsConfig.hashCode() + ((this.pollMessagesConfig.hashCode() + ((this.starredMessagesConfig.hashCode() + ((this.voiceMessagesConfig.hashCode() + unr0.d(unr0.d(unr0.e(unr0.c(unr0.c(unr0.c(this.hiddenNamespaces.hashCode() * 31, 31, this.hiddenInviteLinkNamespaces), 31, this.hiddenParticipantsNamespaces), 31, this.noPhoneNamespaces), 31, this.reactionsEnabled), 31, this.reactionsConfig), 31, this.extendedReactionsConfig)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Object obj = this.customConfig;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        List<Integer> list = this.hiddenNamespaces;
        List<Integer> list2 = this.hiddenInviteLinkNamespaces;
        List<Integer> list3 = this.hiddenParticipantsNamespaces;
        List<Integer> list4 = this.noPhoneNamespaces;
        boolean z = this.reactionsEnabled;
        Map<String, List<Integer>> map = this.reactionsConfig;
        Map<String, List<Integer>> map2 = this.extendedReactionsConfig;
        VoiceMessagesConfig voiceMessagesConfig = this.voiceMessagesConfig;
        StarredMessagesConfig starredMessagesConfig = this.starredMessagesConfig;
        PollMessagesConfig pollMessagesConfig = this.pollMessagesConfig;
        ThreadsConfig threadsConfig = this.threadsConfig;
        MeetingsConfig meetingsConfig = this.meetingsConfig;
        TranslationsConfig translationsConfig = this.translationsConfig;
        PublicReactionsConfig publicReactionsConfig = this.publicReactions;
        TextSuggestConfig textSuggestConfig = this.textSuggest;
        FoldersConfig foldersConfig = this.folders;
        FilePreviewsConfig filePreviewsConfig = this.filePreviews;
        DocViewerConfig docViewerConfig = this.docViewer;
        VideoPlayerConfig videoPlayerConfig = this.videoPlayer;
        Object obj = this.customConfig;
        StringBuilder v = qv10.v("BackendConfig(hiddenNamespaces=", list, ", hiddenInviteLinkNamespaces=", list2, ", hiddenParticipantsNamespaces=");
        nnm.w(v, list3, ", noPhoneNamespaces=", list4, ", reactionsEnabled=");
        v.append(z);
        v.append(", reactionsConfig=");
        v.append(map);
        v.append(", extendedReactionsConfig=");
        v.append(map2);
        v.append(", voiceMessagesConfig=");
        v.append(voiceMessagesConfig);
        v.append(", starredMessagesConfig=");
        v.append(starredMessagesConfig);
        v.append(", pollMessagesConfig=");
        v.append(pollMessagesConfig);
        v.append(", threadsConfig=");
        v.append(threadsConfig);
        v.append(", meetingsConfig=");
        v.append(meetingsConfig);
        v.append(", translationsConfig=");
        v.append(translationsConfig);
        v.append(", publicReactions=");
        v.append(publicReactionsConfig);
        v.append(", textSuggest=");
        v.append(textSuggestConfig);
        v.append(", folders=");
        v.append(foldersConfig);
        v.append(", filePreviews=");
        v.append(filePreviewsConfig);
        v.append(", docViewer=");
        v.append(docViewerConfig);
        v.append(", videoPlayer=");
        v.append(videoPlayerConfig);
        v.append(", customConfig=");
        v.append(obj);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$SourceExtensions;", "", "extensions", "", "", "<init>", "(Ljava/util/Set;)V", "getExtensions", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultIfNull
    public static final /* data */ class SourceExtensions {
        private final Set<String> extensions;

        public /* synthetic */ SourceExtensions(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptySet.a : set);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SourceExtensions copy$default(SourceExtensions sourceExtensions, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = sourceExtensions.extensions;
            }
            return sourceExtensions.copy(set);
        }

        public final Set<String> component1() {
            return this.extensions;
        }

        public final SourceExtensions copy(@Json(name = "extensions") Set<String> extensions) {
            return new SourceExtensions(extensions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SourceExtensions) && jl40.l(this.extensions, ((SourceExtensions) other).extensions);
        }

        public final Set<String> getExtensions() {
            return this.extensions;
        }

        public int hashCode() {
            return this.extensions.hashCode();
        }

        public String toString() {
            return "SourceExtensions(extensions=" + this.extensions + Extension.C_BRAKE;
        }

        public SourceExtensions(@Json(name = "extensions") Set<String> set) {
            this.extensions = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SourceExtensions() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0003)*+Bg\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006,"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "", "chatsWithBot", "", "privateChats", "channels", "groups", "enabledChats", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions$NamespacesDescriptor;", "disabledChats", "managedByClient", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions$ManagedByClient;", "defaultValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions$NamespacesDescriptor;Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions$NamespacesDescriptor;Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions$ManagedByClient;Ljava/lang/String;)V", "getChatsWithBot", "()Ljava/lang/String;", "getPrivateChats", "getChannels", "getGroups", "getEnabledChats", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions$NamespacesDescriptor;", "getDisabledChats", "getManagedByClient", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions$ManagedByClient;", "getDefaultValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "NamespacesDescriptor", "ManagedByClient", "Companion", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Restrictions {
        public static final String DISABLED = "disabled";
        public static final String ENABLED = "enabled";
        private final String channels;
        private final String chatsWithBot;
        private final String defaultValue;
        private final NamespacesDescriptor disabledChats;
        private final NamespacesDescriptor enabledChats;
        private final String groups;
        private final ManagedByClient managedByClient;
        private final String privateChats;

        public /* synthetic */ Restrictions(String str, String str2, String str3, String str4, NamespacesDescriptor namespacesDescriptor, NamespacesDescriptor namespacesDescriptor2, ManagedByClient managedByClient, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : namespacesDescriptor, (i & 32) != 0 ? null : namespacesDescriptor2, (i & 64) != 0 ? null : managedByClient, (i & 128) != 0 ? null : str5);
        }

        public static /* synthetic */ Restrictions copy$default(Restrictions restrictions, String str, String str2, String str3, String str4, NamespacesDescriptor namespacesDescriptor, NamespacesDescriptor namespacesDescriptor2, ManagedByClient managedByClient, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = restrictions.chatsWithBot;
            }
            if ((i & 2) != 0) {
                str2 = restrictions.privateChats;
            }
            if ((i & 4) != 0) {
                str3 = restrictions.channels;
            }
            if ((i & 8) != 0) {
                str4 = restrictions.groups;
            }
            if ((i & 16) != 0) {
                namespacesDescriptor = restrictions.enabledChats;
            }
            if ((i & 32) != 0) {
                namespacesDescriptor2 = restrictions.disabledChats;
            }
            if ((i & 64) != 0) {
                managedByClient = restrictions.managedByClient;
            }
            if ((i & 128) != 0) {
                str5 = restrictions.defaultValue;
            }
            ManagedByClient managedByClient2 = managedByClient;
            String str6 = str5;
            NamespacesDescriptor namespacesDescriptor3 = namespacesDescriptor;
            NamespacesDescriptor namespacesDescriptor4 = namespacesDescriptor2;
            return restrictions.copy(str, str2, str3, str4, namespacesDescriptor3, namespacesDescriptor4, managedByClient2, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChatsWithBot() {
            return this.chatsWithBot;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPrivateChats() {
            return this.privateChats;
        }

        /* renamed from: component3, reason: from getter */
        public final String getChannels() {
            return this.channels;
        }

        /* renamed from: component4, reason: from getter */
        public final String getGroups() {
            return this.groups;
        }

        /* renamed from: component5, reason: from getter */
        public final NamespacesDescriptor getEnabledChats() {
            return this.enabledChats;
        }

        /* renamed from: component6, reason: from getter */
        public final NamespacesDescriptor getDisabledChats() {
            return this.disabledChats;
        }

        /* renamed from: component7, reason: from getter */
        public final ManagedByClient getManagedByClient() {
            return this.managedByClient;
        }

        /* renamed from: component8, reason: from getter */
        public final String getDefaultValue() {
            return this.defaultValue;
        }

        public final Restrictions copy(@Json(name = "robots") String chatsWithBot, @Json(name = "private") String privateChats, @Json(name = "channels") String channels, @Json(name = "groups") String groups, @Json(name = "enabled") NamespacesDescriptor enabledChats, @Json(name = "disabled") NamespacesDescriptor disabledChats, @Json(name = "managed_by_client") ManagedByClient managedByClient, @Json(name = "default") String defaultValue) {
            return new Restrictions(chatsWithBot, privateChats, channels, groups, enabledChats, disabledChats, managedByClient, defaultValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Restrictions)) {
                return false;
            }
            Restrictions restrictions = (Restrictions) other;
            return jl40.l(this.chatsWithBot, restrictions.chatsWithBot) && jl40.l(this.privateChats, restrictions.privateChats) && jl40.l(this.channels, restrictions.channels) && jl40.l(this.groups, restrictions.groups) && jl40.l(this.enabledChats, restrictions.enabledChats) && jl40.l(this.disabledChats, restrictions.disabledChats) && jl40.l(this.managedByClient, restrictions.managedByClient) && jl40.l(this.defaultValue, restrictions.defaultValue);
        }

        public final String getChannels() {
            return this.channels;
        }

        public final String getChatsWithBot() {
            return this.chatsWithBot;
        }

        public final String getDefaultValue() {
            return this.defaultValue;
        }

        public final NamespacesDescriptor getDisabledChats() {
            return this.disabledChats;
        }

        public final NamespacesDescriptor getEnabledChats() {
            return this.enabledChats;
        }

        public final String getGroups() {
            return this.groups;
        }

        public final ManagedByClient getManagedByClient() {
            return this.managedByClient;
        }

        public final String getPrivateChats() {
            return this.privateChats;
        }

        public int hashCode() {
            String str = this.chatsWithBot;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.privateChats;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.channels;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.groups;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            NamespacesDescriptor namespacesDescriptor = this.enabledChats;
            int hashCode5 = (hashCode4 + (namespacesDescriptor == null ? 0 : namespacesDescriptor.hashCode())) * 31;
            NamespacesDescriptor namespacesDescriptor2 = this.disabledChats;
            int hashCode6 = (hashCode5 + (namespacesDescriptor2 == null ? 0 : namespacesDescriptor2.hashCode())) * 31;
            ManagedByClient managedByClient = this.managedByClient;
            int hashCode7 = (hashCode6 + (managedByClient == null ? 0 : managedByClient.hashCode())) * 31;
            String str5 = this.defaultValue;
            return hashCode7 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            String str = this.chatsWithBot;
            String str2 = this.privateChats;
            String str3 = this.channels;
            String str4 = this.groups;
            NamespacesDescriptor namespacesDescriptor = this.enabledChats;
            NamespacesDescriptor namespacesDescriptor2 = this.disabledChats;
            ManagedByClient managedByClient = this.managedByClient;
            String str5 = this.defaultValue;
            StringBuilder v = b64.v("Restrictions(chatsWithBot=", str, ", privateChats=", str2, ", channels=");
            g8e.D(v, str3, ", groups=", str4, ", enabledChats=");
            v.append(namespacesDescriptor);
            v.append(", disabledChats=");
            v.append(namespacesDescriptor2);
            v.append(", managedByClient=");
            v.append(managedByClient);
            v.append(", defaultValue=");
            v.append(str5);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @JsonClass(generateAdapter = true)
        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions$ManagedByClient;", "", "chatWithBot", "", "groupsNamespaces", "", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getChatWithBot", "()Ljava/lang/String;", "getGroupsNamespaces", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ManagedByClient {
            private final String chatWithBot;
            private final List<Integer> groupsNamespaces;

            public /* synthetic */ ManagedByClient(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ManagedByClient copy$default(ManagedByClient managedByClient, String str, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = managedByClient.chatWithBot;
                }
                if ((i & 2) != 0) {
                    list = managedByClient.groupsNamespaces;
                }
                return managedByClient.copy(str, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getChatWithBot() {
                return this.chatWithBot;
            }

            public final List<Integer> component2() {
                return this.groupsNamespaces;
            }

            public final ManagedByClient copy(@Json(name = "robots") String chatWithBot, @Json(name = "groupsNS") List<Integer> groupsNamespaces) {
                return new ManagedByClient(chatWithBot, groupsNamespaces);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ManagedByClient)) {
                    return false;
                }
                ManagedByClient managedByClient = (ManagedByClient) other;
                return jl40.l(this.chatWithBot, managedByClient.chatWithBot) && jl40.l(this.groupsNamespaces, managedByClient.groupsNamespaces);
            }

            public final String getChatWithBot() {
                return this.chatWithBot;
            }

            public final List<Integer> getGroupsNamespaces() {
                return this.groupsNamespaces;
            }

            public int hashCode() {
                String str = this.chatWithBot;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                List<Integer> list = this.groupsNamespaces;
                return hashCode + (list != null ? list.hashCode() : 0);
            }

            public String toString() {
                return nnm.h("ManagedByClient(chatWithBot=", this.chatWithBot, ", groupsNamespaces=", Extension.C_BRAKE, this.groupsNamespaces);
            }

            public ManagedByClient(@Json(name = "robots") String str, @Json(name = "groupsNS") List<Integer> list) {
                this.chatWithBot = str;
                this.groupsNamespaces = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ManagedByClient() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
        }

        @JsonClass(generateAdapter = true)
        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions$NamespacesDescriptor;", "", "channelNamespaces", "", "", "groupsNamespaces", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getChannelNamespaces", "()Ljava/util/List;", "getGroupsNamespaces", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NamespacesDescriptor {
            private final List<Integer> channelNamespaces;
            private final List<Integer> groupsNamespaces;

            public /* synthetic */ NamespacesDescriptor(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ NamespacesDescriptor copy$default(NamespacesDescriptor namespacesDescriptor, List list, List list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = namespacesDescriptor.channelNamespaces;
                }
                if ((i & 2) != 0) {
                    list2 = namespacesDescriptor.groupsNamespaces;
                }
                return namespacesDescriptor.copy(list, list2);
            }

            public final List<Integer> component1() {
                return this.channelNamespaces;
            }

            public final List<Integer> component2() {
                return this.groupsNamespaces;
            }

            public final NamespacesDescriptor copy(@Json(name = "channelsNS") List<Integer> channelNamespaces, @Json(name = "groupsNS") List<Integer> groupsNamespaces) {
                return new NamespacesDescriptor(channelNamespaces, groupsNamespaces);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NamespacesDescriptor)) {
                    return false;
                }
                NamespacesDescriptor namespacesDescriptor = (NamespacesDescriptor) other;
                return jl40.l(this.channelNamespaces, namespacesDescriptor.channelNamespaces) && jl40.l(this.groupsNamespaces, namespacesDescriptor.groupsNamespaces);
            }

            public final List<Integer> getChannelNamespaces() {
                return this.channelNamespaces;
            }

            public final List<Integer> getGroupsNamespaces() {
                return this.groupsNamespaces;
            }

            public int hashCode() {
                List<Integer> list = this.channelNamespaces;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                List<Integer> list2 = this.groupsNamespaces;
                return hashCode + (list2 != null ? list2.hashCode() : 0);
            }

            public String toString() {
                return xvz.l("NamespacesDescriptor(channelNamespaces=", this.channelNamespaces, ", groupsNamespaces=", this.groupsNamespaces, Extension.C_BRAKE);
            }

            public NamespacesDescriptor(@Json(name = "channelsNS") List<Integer> list, @Json(name = "groupsNS") List<Integer> list2) {
                this.channelNamespaces = list;
                this.groupsNamespaces = list2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public NamespacesDescriptor() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
        }

        public Restrictions(@Json(name = "robots") String str, @Json(name = "private") String str2, @Json(name = "channels") String str3, @Json(name = "groups") String str4, @Json(name = "enabled") NamespacesDescriptor namespacesDescriptor, @Json(name = "disabled") NamespacesDescriptor namespacesDescriptor2, @Json(name = "managed_by_client") ManagedByClient managedByClient, @Json(name = "default") String str5) {
            this.chatsWithBot = str;
            this.privateChats = str2;
            this.channels = str3;
            this.groups = str4;
            this.enabledChats = namespacesDescriptor;
            this.disabledChats = namespacesDescriptor2;
            this.managedByClient = managedByClient;
            this.defaultValue = str5;
        }

        public Restrictions() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$TextSuggestConfig;", "", "throttle", "", "min", CspBioProgressConstants.MAX, "<init>", "(III)V", "getThrottle", "()I", "getMin", "getMax", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultIfNull
    public static final /* data */ class TextSuggestConfig {
        private final int max;
        private final int min;
        private final int throttle;

        public /* synthetic */ TextSuggestConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 500 : i, (i4 & 2) != 0 ? 3 : i2, (i4 & 4) != 0 ? 100 : i3);
        }

        public static /* synthetic */ TextSuggestConfig copy$default(TextSuggestConfig textSuggestConfig, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = textSuggestConfig.throttle;
            }
            if ((i4 & 2) != 0) {
                i2 = textSuggestConfig.min;
            }
            if ((i4 & 4) != 0) {
                i3 = textSuggestConfig.max;
            }
            return textSuggestConfig.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getThrottle() {
            return this.throttle;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMin() {
            return this.min;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMax() {
            return this.max;
        }

        public final TextSuggestConfig copy(@Json(name = "throttling_ms") int throttle, @Json(name = "symbols_min") int min, @Json(name = "symbols_max") int max) {
            return new TextSuggestConfig(throttle, min, max);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSuggestConfig)) {
                return false;
            }
            TextSuggestConfig textSuggestConfig = (TextSuggestConfig) other;
            return this.throttle == textSuggestConfig.throttle && this.min == textSuggestConfig.min && this.max == textSuggestConfig.max;
        }

        public final int getMax() {
            return this.max;
        }

        public final int getMin() {
            return this.min;
        }

        public final int getThrottle() {
            return this.throttle;
        }

        public int hashCode() {
            return Integer.hashCode(this.max) + oyr.b(this.min, Integer.hashCode(this.throttle) * 31, 31);
        }

        public String toString() {
            return oyr.m(this.max, Extension.C_BRAKE, b64.s(this.throttle, this.min, "TextSuggestConfig(throttle=", ", min=", ", max="));
        }

        public TextSuggestConfig(@Json(name = "throttling_ms") int i, @Json(name = "symbols_min") int i2, @Json(name = "symbols_max") int i3) {
            this.throttle = i;
            this.min = i2;
            this.max = i3;
        }

        public TextSuggestConfig() {
            this(0, 0, 0, 7, null);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$TranslationsConfig;", "", "restrictions", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "<init>", "(Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;)V", "getRestrictions", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultIfNull
    public static final /* data */ class TranslationsConfig {
        private final Restrictions restrictions;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ TranslationsConfig(Restrictions restrictions, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(restrictions);
            if ((i & 1) != 0) {
                restrictions = new Restrictions(null, null, null, null, null, null, null, Restrictions.DISABLED, HProv.PP_VERSION_TIMESTAMP, null);
            }
        }

        public static /* synthetic */ TranslationsConfig copy$default(TranslationsConfig translationsConfig, Restrictions restrictions, int i, Object obj) {
            if ((i & 1) != 0) {
                restrictions = translationsConfig.restrictions;
            }
            return translationsConfig.copy(restrictions);
        }

        /* renamed from: component1, reason: from getter */
        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public final TranslationsConfig copy(@Json(name = "restrictions") Restrictions restrictions) {
            return new TranslationsConfig(restrictions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TranslationsConfig) && jl40.l(this.restrictions, ((TranslationsConfig) other).restrictions);
        }

        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public int hashCode() {
            return this.restrictions.hashCode();
        }

        public String toString() {
            return "TranslationsConfig(restrictions=" + this.restrictions + Extension.C_BRAKE;
        }

        public TranslationsConfig(@Json(name = "restrictions") Restrictions restrictions) {
            this.restrictions = restrictions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TranslationsConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$PublicReactionsConfig;", "", "restrictions", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "<init>", "(Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;)V", "getRestrictions", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultIfNull
    public static final /* data */ class PublicReactionsConfig {
        private final Restrictions restrictions;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ PublicReactionsConfig(Restrictions restrictions, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(restrictions);
            if ((i & 1) != 0) {
                restrictions = new Restrictions(null, null, Restrictions.DISABLED, null, null, null, null, Restrictions.ENABLED, HProv.PP_PASSWD_TERM, null);
            }
        }

        public static /* synthetic */ PublicReactionsConfig copy$default(PublicReactionsConfig publicReactionsConfig, Restrictions restrictions, int i, Object obj) {
            if ((i & 1) != 0) {
                restrictions = publicReactionsConfig.restrictions;
            }
            return publicReactionsConfig.copy(restrictions);
        }

        /* renamed from: component1, reason: from getter */
        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public final PublicReactionsConfig copy(@Json(name = "restrictions") Restrictions restrictions) {
            return new PublicReactionsConfig(restrictions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PublicReactionsConfig) && jl40.l(this.restrictions, ((PublicReactionsConfig) other).restrictions);
        }

        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public int hashCode() {
            return this.restrictions.hashCode();
        }

        public String toString() {
            return "PublicReactionsConfig(restrictions=" + this.restrictions + Extension.C_BRAKE;
        }

        public PublicReactionsConfig(@Json(name = "restrictions") Restrictions restrictions) {
            this.restrictions = restrictions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PublicReactionsConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$ThreadsConfig;", "", "restrictions", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "<init>", "(Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;)V", "getRestrictions", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultIfNull
    public static final /* data */ class ThreadsConfig {
        private final Restrictions restrictions;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ThreadsConfig(Restrictions restrictions, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(restrictions);
            if ((i & 1) != 0) {
                restrictions = new Restrictions(Restrictions.DISABLED, null, null, null, null, null, null, Restrictions.ENABLED, HProv.PP_DELETE_SAVED_PASSWD, null);
            }
        }

        public static /* synthetic */ ThreadsConfig copy$default(ThreadsConfig threadsConfig, Restrictions restrictions, int i, Object obj) {
            if ((i & 1) != 0) {
                restrictions = threadsConfig.restrictions;
            }
            return threadsConfig.copy(restrictions);
        }

        /* renamed from: component1, reason: from getter */
        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public final ThreadsConfig copy(@Json(name = "restrictions") Restrictions restrictions) {
            return new ThreadsConfig(restrictions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ThreadsConfig) && jl40.l(this.restrictions, ((ThreadsConfig) other).restrictions);
        }

        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public int hashCode() {
            return this.restrictions.hashCode();
        }

        public String toString() {
            return "ThreadsConfig(restrictions=" + this.restrictions + Extension.C_BRAKE;
        }

        public ThreadsConfig(@Json(name = "restrictions") Restrictions restrictions) {
            this.restrictions = restrictions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ThreadsConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$StarredMessagesConfig;", "", "restrictions", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "<init>", "(Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;)V", "getRestrictions", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultIfNull
    public static final /* data */ class StarredMessagesConfig {
        private final Restrictions restrictions;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ StarredMessagesConfig(Restrictions restrictions, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(restrictions);
            if ((i & 1) != 0) {
                restrictions = new Restrictions(Restrictions.DISABLED, null, Restrictions.DISABLED, null, null, null, null, Restrictions.ENABLED, 122, null);
            }
        }

        public static /* synthetic */ StarredMessagesConfig copy$default(StarredMessagesConfig starredMessagesConfig, Restrictions restrictions, int i, Object obj) {
            if ((i & 1) != 0) {
                restrictions = starredMessagesConfig.restrictions;
            }
            return starredMessagesConfig.copy(restrictions);
        }

        /* renamed from: component1, reason: from getter */
        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public final StarredMessagesConfig copy(@Json(name = "restrictions") Restrictions restrictions) {
            return new StarredMessagesConfig(restrictions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StarredMessagesConfig) && jl40.l(this.restrictions, ((StarredMessagesConfig) other).restrictions);
        }

        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public int hashCode() {
            return this.restrictions.hashCode();
        }

        public String toString() {
            return "StarredMessagesConfig(restrictions=" + this.restrictions + Extension.C_BRAKE;
        }

        public StarredMessagesConfig(@Json(name = "restrictions") Restrictions restrictions) {
            this.restrictions = restrictions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StarredMessagesConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$MeetingsConfig;", "", "restrictions", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "maxParticipantsCount", "", "<init>", "(Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;I)V", "getRestrictions", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "getMaxParticipantsCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultIfNull
    public static final /* data */ class MeetingsConfig {
        private final int maxParticipantsCount;
        private final Restrictions restrictions;

        public /* synthetic */ MeetingsConfig(Restrictions restrictions, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new Restrictions(null, null, null, null, null, null, null, Restrictions.DISABLED, HProv.PP_VERSION_TIMESTAMP, null) : restrictions, (i2 & 2) != 0 ? 40 : i);
        }

        public static /* synthetic */ MeetingsConfig copy$default(MeetingsConfig meetingsConfig, Restrictions restrictions, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                restrictions = meetingsConfig.restrictions;
            }
            if ((i2 & 2) != 0) {
                i = meetingsConfig.maxParticipantsCount;
            }
            return meetingsConfig.copy(restrictions, i);
        }

        /* renamed from: component1, reason: from getter */
        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxParticipantsCount() {
            return this.maxParticipantsCount;
        }

        public final MeetingsConfig copy(@Json(name = "restrictions") Restrictions restrictions, @Json(name = "max_participants_count") int maxParticipantsCount) {
            return new MeetingsConfig(restrictions, maxParticipantsCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MeetingsConfig)) {
                return false;
            }
            MeetingsConfig meetingsConfig = (MeetingsConfig) other;
            return jl40.l(this.restrictions, meetingsConfig.restrictions) && this.maxParticipantsCount == meetingsConfig.maxParticipantsCount;
        }

        public final int getMaxParticipantsCount() {
            return this.maxParticipantsCount;
        }

        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public int hashCode() {
            return Integer.hashCode(this.maxParticipantsCount) + (this.restrictions.hashCode() * 31);
        }

        public String toString() {
            return "MeetingsConfig(restrictions=" + this.restrictions + ", maxParticipantsCount=" + this.maxParticipantsCount + Extension.C_BRAKE;
        }

        public MeetingsConfig(@Json(name = "restrictions") Restrictions restrictions, @Json(name = "max_participants_count") int i) {
            this.restrictions = restrictions;
            this.maxParticipantsCount = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MeetingsConfig() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$DocViewerConfig;", "", "supportedFilesBySource", "", "", "Lcom/yandex/messaging/core/net/entities/BackendConfig$SourceExtensions;", "restrictions", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "<init>", "(Ljava/util/Map;Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;)V", "getSupportedFilesBySource", "()Ljava/util/Map;", "getRestrictions", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultIfNull
    public static final /* data */ class DocViewerConfig {
        private final Restrictions restrictions;
        private final Map<String, SourceExtensions> supportedFilesBySource;

        public /* synthetic */ DocViewerConfig(Map map, Restrictions restrictions, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? b.f() : map, (i & 2) != 0 ? new Restrictions(null, null, null, null, null, null, null, Restrictions.DISABLED, HProv.PP_VERSION_TIMESTAMP, null) : restrictions);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DocViewerConfig copy$default(DocViewerConfig docViewerConfig, Map map, Restrictions restrictions, int i, Object obj) {
            if ((i & 1) != 0) {
                map = docViewerConfig.supportedFilesBySource;
            }
            if ((i & 2) != 0) {
                restrictions = docViewerConfig.restrictions;
            }
            return docViewerConfig.copy(map, restrictions);
        }

        public final Map<String, SourceExtensions> component1() {
            return this.supportedFilesBySource;
        }

        /* renamed from: component2, reason: from getter */
        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public final DocViewerConfig copy(@Json(name = "supported_files_by_source") Map<String, SourceExtensions> supportedFilesBySource, @Json(name = "restrictions") Restrictions restrictions) {
            return new DocViewerConfig(supportedFilesBySource, restrictions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocViewerConfig)) {
                return false;
            }
            DocViewerConfig docViewerConfig = (DocViewerConfig) other;
            return jl40.l(this.supportedFilesBySource, docViewerConfig.supportedFilesBySource) && jl40.l(this.restrictions, docViewerConfig.restrictions);
        }

        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public final Map<String, SourceExtensions> getSupportedFilesBySource() {
            return this.supportedFilesBySource;
        }

        public int hashCode() {
            return this.restrictions.hashCode() + (this.supportedFilesBySource.hashCode() * 31);
        }

        public String toString() {
            return "DocViewerConfig(supportedFilesBySource=" + this.supportedFilesBySource + ", restrictions=" + this.restrictions + Extension.C_BRAKE;
        }

        public DocViewerConfig(@Json(name = "supported_files_by_source") Map<String, SourceExtensions> map, @Json(name = "restrictions") Restrictions restrictions) {
            this.supportedFilesBySource = map;
            this.restrictions = restrictions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DocViewerConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$FilePreviewsConfig;", "", "supportedFilesBySource", "", "", "Lcom/yandex/messaging/core/net/entities/BackendConfig$SourceExtensions;", "restrictions", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "<init>", "(Ljava/util/Map;Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;)V", "getSupportedFilesBySource", "()Ljava/util/Map;", "getRestrictions", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultIfNull
    public static final /* data */ class FilePreviewsConfig {
        private final Restrictions restrictions;
        private final Map<String, SourceExtensions> supportedFilesBySource;

        public /* synthetic */ FilePreviewsConfig(Map map, Restrictions restrictions, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? b.f() : map, (i & 2) != 0 ? new Restrictions(null, null, null, null, null, null, null, Restrictions.DISABLED, HProv.PP_VERSION_TIMESTAMP, null) : restrictions);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FilePreviewsConfig copy$default(FilePreviewsConfig filePreviewsConfig, Map map, Restrictions restrictions, int i, Object obj) {
            if ((i & 1) != 0) {
                map = filePreviewsConfig.supportedFilesBySource;
            }
            if ((i & 2) != 0) {
                restrictions = filePreviewsConfig.restrictions;
            }
            return filePreviewsConfig.copy(map, restrictions);
        }

        public final Map<String, SourceExtensions> component1() {
            return this.supportedFilesBySource;
        }

        /* renamed from: component2, reason: from getter */
        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public final FilePreviewsConfig copy(@Json(name = "supported_files_by_source") Map<String, SourceExtensions> supportedFilesBySource, @Json(name = "restrictions") Restrictions restrictions) {
            return new FilePreviewsConfig(supportedFilesBySource, restrictions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilePreviewsConfig)) {
                return false;
            }
            FilePreviewsConfig filePreviewsConfig = (FilePreviewsConfig) other;
            return jl40.l(this.supportedFilesBySource, filePreviewsConfig.supportedFilesBySource) && jl40.l(this.restrictions, filePreviewsConfig.restrictions);
        }

        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public final Map<String, SourceExtensions> getSupportedFilesBySource() {
            return this.supportedFilesBySource;
        }

        public int hashCode() {
            return this.restrictions.hashCode() + (this.supportedFilesBySource.hashCode() * 31);
        }

        public String toString() {
            return "FilePreviewsConfig(supportedFilesBySource=" + this.supportedFilesBySource + ", restrictions=" + this.restrictions + Extension.C_BRAKE;
        }

        public FilePreviewsConfig(@Json(name = "supported_files_by_source") Map<String, SourceExtensions> map, @Json(name = "restrictions") Restrictions restrictions) {
            this.supportedFilesBySource = map;
            this.restrictions = restrictions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FilePreviewsConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$VideoPlayerConfig;", "", "supportedFilesBySource", "", "", "Lcom/yandex/messaging/core/net/entities/BackendConfig$SourceExtensions;", "restrictions", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "<init>", "(Ljava/util/Map;Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;)V", "getSupportedFilesBySource", "()Ljava/util/Map;", "getRestrictions", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultIfNull
    public static final /* data */ class VideoPlayerConfig {
        private final Restrictions restrictions;
        private final Map<String, SourceExtensions> supportedFilesBySource;

        public /* synthetic */ VideoPlayerConfig(Map map, Restrictions restrictions, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? b.f() : map, (i & 2) != 0 ? new Restrictions(null, null, null, null, null, null, null, Restrictions.DISABLED, HProv.PP_VERSION_TIMESTAMP, null) : restrictions);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VideoPlayerConfig copy$default(VideoPlayerConfig videoPlayerConfig, Map map, Restrictions restrictions, int i, Object obj) {
            if ((i & 1) != 0) {
                map = videoPlayerConfig.supportedFilesBySource;
            }
            if ((i & 2) != 0) {
                restrictions = videoPlayerConfig.restrictions;
            }
            return videoPlayerConfig.copy(map, restrictions);
        }

        public final Map<String, SourceExtensions> component1() {
            return this.supportedFilesBySource;
        }

        /* renamed from: component2, reason: from getter */
        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public final VideoPlayerConfig copy(@Json(name = "supported_files_by_source") Map<String, SourceExtensions> supportedFilesBySource, @Json(name = "restrictions") Restrictions restrictions) {
            return new VideoPlayerConfig(supportedFilesBySource, restrictions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoPlayerConfig)) {
                return false;
            }
            VideoPlayerConfig videoPlayerConfig = (VideoPlayerConfig) other;
            return jl40.l(this.supportedFilesBySource, videoPlayerConfig.supportedFilesBySource) && jl40.l(this.restrictions, videoPlayerConfig.restrictions);
        }

        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public final Map<String, SourceExtensions> getSupportedFilesBySource() {
            return this.supportedFilesBySource;
        }

        public int hashCode() {
            return this.restrictions.hashCode() + (this.supportedFilesBySource.hashCode() * 31);
        }

        public String toString() {
            return "VideoPlayerConfig(supportedFilesBySource=" + this.supportedFilesBySource + ", restrictions=" + this.restrictions + Extension.C_BRAKE;
        }

        public VideoPlayerConfig(@Json(name = "supported_files_by_source") Map<String, SourceExtensions> map, @Json(name = "restrictions") Restrictions restrictions) {
            this.supportedFilesBySource = map;
            this.restrictions = restrictions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public VideoPlayerConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$PollMessagesConfig;", "", "restrictions", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "<init>", "(Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;)V", "getRestrictions", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultIfNull
    public static final /* data */ class PollMessagesConfig {
        private final Restrictions restrictions;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ PollMessagesConfig(Restrictions restrictions, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(restrictions);
            int i2 = 1;
            if ((i & 1) != 0) {
                String str = Restrictions.DISABLED;
                String str2 = Restrictions.DISABLED;
                String str3 = null;
                String str4 = null;
                Restrictions.NamespacesDescriptor namespacesDescriptor = null;
                Restrictions.ManagedByClient managedByClient = null;
                String str5 = Restrictions.ENABLED;
                restrictions = new Restrictions(str, str2, str3, str4, namespacesDescriptor, new Restrictions.NamespacesDescriptor(null, scc.g(13, 7, 24, 29), i2, null == true ? 1 : 0), managedByClient, str5, 92, null);
            }
        }

        public static /* synthetic */ PollMessagesConfig copy$default(PollMessagesConfig pollMessagesConfig, Restrictions restrictions, int i, Object obj) {
            if ((i & 1) != 0) {
                restrictions = pollMessagesConfig.restrictions;
            }
            return pollMessagesConfig.copy(restrictions);
        }

        /* renamed from: component1, reason: from getter */
        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public final PollMessagesConfig copy(@Json(name = "restrictions") Restrictions restrictions) {
            return new PollMessagesConfig(restrictions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PollMessagesConfig) && jl40.l(this.restrictions, ((PollMessagesConfig) other).restrictions);
        }

        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public int hashCode() {
            return this.restrictions.hashCode();
        }

        public String toString() {
            return "PollMessagesConfig(restrictions=" + this.restrictions + Extension.C_BRAKE;
        }

        public PollMessagesConfig(@Json(name = "restrictions") Restrictions restrictions) {
            this.restrictions = restrictions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PollMessagesConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$VoiceMessagesConfig;", "", "maxDuration", "", "restrictions", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "<init>", "(ILcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;)V", "getMaxDuration", "()I", "getRestrictions", "()Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultIfNull
    public static final /* data */ class VoiceMessagesConfig {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        private final int maxDuration;
        private final Restrictions restrictions;

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig$VoiceMessagesConfig$Companion;", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public VoiceMessagesConfig(int i, Restrictions restrictions, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, r1);
            Restrictions restrictions2;
            i = (i2 & 1) != 0 ? 600 : i;
            if ((i2 & 2) != 0) {
                INSTANCE.getClass();
                restrictions2 = new Restrictions(null, Restrictions.ENABLED, null, null, new Restrictions.NamespacesDescriptor(null, scc.g(0, 17, 39, 44, 46, 48), 1, null == true ? 1 : 0), null, new Restrictions.ManagedByClient(Restrictions.ENABLED, EmptyList.a), Restrictions.DISABLED, 44, null);
            } else {
                restrictions2 = restrictions;
            }
        }

        public static /* synthetic */ VoiceMessagesConfig copy$default(VoiceMessagesConfig voiceMessagesConfig, int i, Restrictions restrictions, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = voiceMessagesConfig.maxDuration;
            }
            if ((i2 & 2) != 0) {
                restrictions = voiceMessagesConfig.restrictions;
            }
            return voiceMessagesConfig.copy(i, restrictions);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMaxDuration() {
            return this.maxDuration;
        }

        /* renamed from: component2, reason: from getter */
        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public final VoiceMessagesConfig copy(@Json(name = "max_duration_s") int maxDuration, @Json(name = "restrictions") Restrictions restrictions) {
            return new VoiceMessagesConfig(maxDuration, restrictions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VoiceMessagesConfig)) {
                return false;
            }
            VoiceMessagesConfig voiceMessagesConfig = (VoiceMessagesConfig) other;
            return this.maxDuration == voiceMessagesConfig.maxDuration && jl40.l(this.restrictions, voiceMessagesConfig.restrictions);
        }

        public final int getMaxDuration() {
            return this.maxDuration;
        }

        public final Restrictions getRestrictions() {
            return this.restrictions;
        }

        public int hashCode() {
            return this.restrictions.hashCode() + (Integer.hashCode(this.maxDuration) * 31);
        }

        public String toString() {
            return "VoiceMessagesConfig(maxDuration=" + this.maxDuration + ", restrictions=" + this.restrictions + Extension.C_BRAKE;
        }

        public VoiceMessagesConfig(@Json(name = "max_duration_s") int i, @Json(name = "restrictions") Restrictions restrictions) {
            this.maxDuration = i;
            this.restrictions = restrictions;
        }

        public VoiceMessagesConfig() {
            this(0, null, 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BackendConfig(@Json(name = "hidden_namespaces") List<Integer> list, @Json(name = "hidden_invite_link_namespaces") List<Integer> list2, @Json(name = "hidden_chat_participants_namespaces") List<Integer> list3, @Json(name = "namespaces_without_phone_requirement") List<Integer> list4, @Json(name = "reactions_enabled") boolean z, @Json(name = "reactions_by_namespace") Map<String, ? extends List<Integer>> map, @Json(name = "extended_reactions_by_namespace") Map<String, ? extends List<Integer>> map2, @Json(name = "voice_messages") VoiceMessagesConfig voiceMessagesConfig, @Json(name = "important_messages") StarredMessagesConfig starredMessagesConfig, @Json(name = "polls_messages") PollMessagesConfig pollMessagesConfig, @Json(name = "threads") ThreadsConfig threadsConfig, @Json(name = "meetings") MeetingsConfig meetingsConfig, @Json(name = "translations") TranslationsConfig translationsConfig, @Json(name = "public_reactions") PublicReactionsConfig publicReactionsConfig, @Json(name = "typing_enhanced") TextSuggestConfig textSuggestConfig, @Json(name = "folders") FoldersConfig foldersConfig, @Json(name = "file_previews") FilePreviewsConfig filePreviewsConfig, @Json(name = "docviewer") DocViewerConfig docViewerConfig, @Json(name = "videoplayer") VideoPlayerConfig videoPlayerConfig, @Json(name = "custom_config") Object obj) {
        this.hiddenNamespaces = list;
        this.hiddenInviteLinkNamespaces = list2;
        this.hiddenParticipantsNamespaces = list3;
        this.noPhoneNamespaces = list4;
        this.reactionsEnabled = z;
        this.reactionsConfig = map;
        this.extendedReactionsConfig = map2;
        this.voiceMessagesConfig = voiceMessagesConfig;
        this.starredMessagesConfig = starredMessagesConfig;
        this.pollMessagesConfig = pollMessagesConfig;
        this.threadsConfig = threadsConfig;
        this.meetingsConfig = meetingsConfig;
        this.translationsConfig = translationsConfig;
        this.publicReactions = publicReactionsConfig;
        this.textSuggest = textSuggestConfig;
        this.folders = foldersConfig;
        this.filePreviews = filePreviewsConfig;
        this.docViewer = docViewerConfig;
        this.videoPlayer = videoPlayerConfig;
        this.customConfig = obj;
    }

    public BackendConfig() {
        this(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }
}
