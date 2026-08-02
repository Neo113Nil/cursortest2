package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR,\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\rR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\rR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\rR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\rR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\rR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\rR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\rR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\rR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\rR\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\rR\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/BackendConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "listOfIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "", "", "mapOfStringListOfIntAdapter", "Lcom/yandex/messaging/core/net/entities/BackendConfig$VoiceMessagesConfig;", "voiceMessagesConfigAdapter", "Lcom/yandex/messaging/core/net/entities/BackendConfig$StarredMessagesConfig;", "starredMessagesConfigAdapter", "Lcom/yandex/messaging/core/net/entities/BackendConfig$PollMessagesConfig;", "pollMessagesConfigAdapter", "Lcom/yandex/messaging/core/net/entities/BackendConfig$ThreadsConfig;", "threadsConfigAdapter", "Lcom/yandex/messaging/core/net/entities/BackendConfig$MeetingsConfig;", "meetingsConfigAdapter", "Lcom/yandex/messaging/core/net/entities/BackendConfig$TranslationsConfig;", "translationsConfigAdapter", "Lcom/yandex/messaging/core/net/entities/BackendConfig$PublicReactionsConfig;", "publicReactionsConfigAdapter", "Lcom/yandex/messaging/core/net/entities/BackendConfig$TextSuggestConfig;", "textSuggestConfigAdapter", "Lcom/yandex/messaging/core/net/entities/FoldersConfig;", "foldersConfigAdapter", "Lcom/yandex/messaging/core/net/entities/BackendConfig$FilePreviewsConfig;", "filePreviewsConfigAdapter", "Lcom/yandex/messaging/core/net/entities/BackendConfig$DocViewerConfig;", "docViewerConfigAdapter", "Lcom/yandex/messaging/core/net/entities/BackendConfig$VideoPlayerConfig;", "videoPlayerConfigAdapter", "Ljava/lang/Object;", "nullableObjectAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BackendConfigJsonAdapter extends JsonAdapter<BackendConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<BackendConfig> constructorRef;
    private final JsonAdapter<BackendConfig.DocViewerConfig> docViewerConfigAdapter;
    private final JsonAdapter<BackendConfig.FilePreviewsConfig> filePreviewsConfigAdapter;
    private final JsonAdapter<FoldersConfig> foldersConfigAdapter;
    private final JsonAdapter<List<Integer>> listOfIntAdapter;
    private final JsonAdapter<Map<String, List<Integer>>> mapOfStringListOfIntAdapter;
    private final JsonAdapter<BackendConfig.MeetingsConfig> meetingsConfigAdapter;
    private final JsonAdapter<Object> nullableObjectAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("hidden_namespaces", "hidden_invite_link_namespaces", "hidden_chat_participants_namespaces", "namespaces_without_phone_requirement", "reactions_enabled", "reactions_by_namespace", "extended_reactions_by_namespace", "voice_messages", "important_messages", "polls_messages", "threads", "meetings", "translations", "public_reactions", "typing_enhanced", "folders", "file_previews", "docviewer", "videoplayer", "custom_config");
    private final JsonAdapter<BackendConfig.PollMessagesConfig> pollMessagesConfigAdapter;
    private final JsonAdapter<BackendConfig.PublicReactionsConfig> publicReactionsConfigAdapter;
    private final JsonAdapter<BackendConfig.StarredMessagesConfig> starredMessagesConfigAdapter;
    private final JsonAdapter<BackendConfig.TextSuggestConfig> textSuggestConfigAdapter;
    private final JsonAdapter<BackendConfig.ThreadsConfig> threadsConfigAdapter;
    private final JsonAdapter<BackendConfig.TranslationsConfig> translationsConfigAdapter;
    private final JsonAdapter<BackendConfig.VideoPlayerConfig> videoPlayerConfigAdapter;
    private final JsonAdapter<BackendConfig.VoiceMessagesConfig> voiceMessagesConfigAdapter;

    public BackendConfigJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, Integer.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfIntAdapter = moshi.adapter(newParameterizedType, emptySet, "hiddenNamespaces");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "reactionsEnabled");
        this.mapOfStringListOfIntAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Types.newParameterizedType(List.class, Integer.class)), emptySet, "reactionsConfig");
        this.voiceMessagesConfigAdapter = moshi.adapter(BackendConfig.VoiceMessagesConfig.class, emptySet, "voiceMessagesConfig");
        this.starredMessagesConfigAdapter = moshi.adapter(BackendConfig.StarredMessagesConfig.class, emptySet, "starredMessagesConfig");
        this.pollMessagesConfigAdapter = moshi.adapter(BackendConfig.PollMessagesConfig.class, emptySet, "pollMessagesConfig");
        this.threadsConfigAdapter = moshi.adapter(BackendConfig.ThreadsConfig.class, emptySet, "threadsConfig");
        this.meetingsConfigAdapter = moshi.adapter(BackendConfig.MeetingsConfig.class, emptySet, "meetingsConfig");
        this.translationsConfigAdapter = moshi.adapter(BackendConfig.TranslationsConfig.class, emptySet, "translationsConfig");
        this.publicReactionsConfigAdapter = moshi.adapter(BackendConfig.PublicReactionsConfig.class, emptySet, "publicReactions");
        this.textSuggestConfigAdapter = moshi.adapter(BackendConfig.TextSuggestConfig.class, emptySet, "textSuggest");
        this.foldersConfigAdapter = moshi.adapter(FoldersConfig.class, emptySet, "folders");
        this.filePreviewsConfigAdapter = moshi.adapter(BackendConfig.FilePreviewsConfig.class, emptySet, "filePreviews");
        this.docViewerConfigAdapter = moshi.adapter(BackendConfig.DocViewerConfig.class, emptySet, "docViewer");
        this.videoPlayerConfigAdapter = moshi.adapter(BackendConfig.VideoPlayerConfig.class, emptySet, "videoPlayer");
        this.nullableObjectAdapter = moshi.adapter(Object.class, emptySet, "customConfig");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BackendConfig fromJson(JsonReader jsonReader) {
        int i;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i2 = -1;
        Boolean bool2 = bool;
        List<Integer> list = null;
        List<Integer> list2 = null;
        List<Integer> list3 = null;
        List<Integer> list4 = null;
        BackendConfig.ThreadsConfig threadsConfig = null;
        Map<String, List<Integer>> map = null;
        Map<String, List<Integer>> map2 = null;
        BackendConfig.VoiceMessagesConfig voiceMessagesConfig = null;
        BackendConfig.StarredMessagesConfig starredMessagesConfig = null;
        BackendConfig.PollMessagesConfig pollMessagesConfig = null;
        BackendConfig.FilePreviewsConfig filePreviewsConfig = null;
        BackendConfig.MeetingsConfig meetingsConfig = null;
        BackendConfig.TranslationsConfig translationsConfig = null;
        BackendConfig.PublicReactionsConfig publicReactionsConfig = null;
        BackendConfig.TextSuggestConfig textSuggestConfig = null;
        FoldersConfig foldersConfig = null;
        BackendConfig.DocViewerConfig docViewerConfig = null;
        BackendConfig.VideoPlayerConfig videoPlayerConfig = null;
        Object obj = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    list = this.listOfIntAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("hiddenNamespaces", "hidden_namespaces", jsonReader);
                    }
                    i2 &= -2;
                    continue;
                case 1:
                    list2 = this.listOfIntAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        throw Util.unexpectedNull("hiddenInviteLinkNamespaces", "hidden_invite_link_namespaces", jsonReader);
                    }
                    i2 &= -3;
                    continue;
                case 2:
                    list3 = this.listOfIntAdapter.fromJson(jsonReader);
                    if (list3 == null) {
                        throw Util.unexpectedNull("hiddenParticipantsNamespaces", "hidden_chat_participants_namespaces", jsonReader);
                    }
                    i2 &= -5;
                    continue;
                case 3:
                    list4 = this.listOfIntAdapter.fromJson(jsonReader);
                    if (list4 == null) {
                        throw Util.unexpectedNull("noPhoneNamespaces", "namespaces_without_phone_requirement", jsonReader);
                    }
                    i2 &= -9;
                    continue;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("reactionsEnabled", "reactions_enabled", jsonReader);
                    }
                    i2 &= -17;
                    continue;
                case 5:
                    map = this.mapOfStringListOfIntAdapter.fromJson(jsonReader);
                    if (map == null) {
                        throw Util.unexpectedNull("reactionsConfig", "reactions_by_namespace", jsonReader);
                    }
                    i2 &= -33;
                    continue;
                case 6:
                    map2 = this.mapOfStringListOfIntAdapter.fromJson(jsonReader);
                    if (map2 == null) {
                        throw Util.unexpectedNull("extendedReactionsConfig", "extended_reactions_by_namespace", jsonReader);
                    }
                    i2 &= -65;
                    continue;
                case 7:
                    voiceMessagesConfig = this.voiceMessagesConfigAdapter.fromJson(jsonReader);
                    if (voiceMessagesConfig == null) {
                        throw Util.unexpectedNull("voiceMessagesConfig", "voice_messages", jsonReader);
                    }
                    i2 &= -129;
                    continue;
                case 8:
                    starredMessagesConfig = this.starredMessagesConfigAdapter.fromJson(jsonReader);
                    if (starredMessagesConfig == null) {
                        throw Util.unexpectedNull("starredMessagesConfig", "important_messages", jsonReader);
                    }
                    i2 &= -257;
                    continue;
                case 9:
                    pollMessagesConfig = this.pollMessagesConfigAdapter.fromJson(jsonReader);
                    if (pollMessagesConfig == null) {
                        throw Util.unexpectedNull("pollMessagesConfig", "polls_messages", jsonReader);
                    }
                    i2 &= -513;
                    continue;
                case 10:
                    threadsConfig = this.threadsConfigAdapter.fromJson(jsonReader);
                    if (threadsConfig == null) {
                        throw Util.unexpectedNull("threadsConfig", "threads", jsonReader);
                    }
                    i2 &= -1025;
                    continue;
                case 11:
                    meetingsConfig = this.meetingsConfigAdapter.fromJson(jsonReader);
                    if (meetingsConfig == null) {
                        throw Util.unexpectedNull("meetingsConfig", "meetings", jsonReader);
                    }
                    i2 &= -2049;
                    continue;
                case 12:
                    translationsConfig = this.translationsConfigAdapter.fromJson(jsonReader);
                    if (translationsConfig == null) {
                        throw Util.unexpectedNull("translationsConfig", "translations", jsonReader);
                    }
                    i2 &= -4097;
                    continue;
                case 13:
                    publicReactionsConfig = this.publicReactionsConfigAdapter.fromJson(jsonReader);
                    if (publicReactionsConfig == null) {
                        throw Util.unexpectedNull("publicReactions", "public_reactions", jsonReader);
                    }
                    i2 &= -8193;
                    continue;
                case 14:
                    textSuggestConfig = this.textSuggestConfigAdapter.fromJson(jsonReader);
                    if (textSuggestConfig == null) {
                        throw Util.unexpectedNull("textSuggest", "typing_enhanced", jsonReader);
                    }
                    i2 &= -16385;
                    continue;
                case 15:
                    foldersConfig = this.foldersConfigAdapter.fromJson(jsonReader);
                    if (foldersConfig == null) {
                        throw Util.unexpectedNull("folders", "folders", jsonReader);
                    }
                    i = -32769;
                    break;
                case 16:
                    filePreviewsConfig = this.filePreviewsConfigAdapter.fromJson(jsonReader);
                    if (filePreviewsConfig == null) {
                        throw Util.unexpectedNull("filePreviews", "file_previews", jsonReader);
                    }
                    i = -65537;
                    break;
                case 17:
                    docViewerConfig = this.docViewerConfigAdapter.fromJson(jsonReader);
                    if (docViewerConfig == null) {
                        throw Util.unexpectedNull("docViewer", "docviewer", jsonReader);
                    }
                    i = -131073;
                    break;
                case 18:
                    videoPlayerConfig = this.videoPlayerConfigAdapter.fromJson(jsonReader);
                    if (videoPlayerConfig == null) {
                        throw Util.unexpectedNull("videoPlayer", "videoplayer", jsonReader);
                    }
                    i = -262145;
                    break;
                case 19:
                    obj = this.nullableObjectAdapter.fromJson(jsonReader);
                    i = -524289;
                    break;
            }
            i2 &= i;
        }
        jsonReader.endObject();
        if (i2 == -1048576) {
            return new BackendConfig(list, list2, list3, list4, bool2.booleanValue(), map, map2, voiceMessagesConfig, starredMessagesConfig, pollMessagesConfig, threadsConfig, meetingsConfig, translationsConfig, publicReactionsConfig, textSuggestConfig, foldersConfig, filePreviewsConfig, docViewerConfig, videoPlayerConfig, obj);
        }
        BackendConfig.FilePreviewsConfig filePreviewsConfig2 = filePreviewsConfig;
        BackendConfig.ThreadsConfig threadsConfig2 = threadsConfig;
        Constructor<BackendConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BackendConfig.class.getDeclaredConstructor(List.class, List.class, List.class, List.class, Boolean.TYPE, Map.class, Map.class, BackendConfig.VoiceMessagesConfig.class, BackendConfig.StarredMessagesConfig.class, BackendConfig.PollMessagesConfig.class, BackendConfig.ThreadsConfig.class, BackendConfig.MeetingsConfig.class, BackendConfig.TranslationsConfig.class, BackendConfig.PublicReactionsConfig.class, BackendConfig.TextSuggestConfig.class, FoldersConfig.class, BackendConfig.FilePreviewsConfig.class, BackendConfig.DocViewerConfig.class, BackendConfig.VideoPlayerConfig.class, Object.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(list, list2, list3, list4, bool2, map, map2, voiceMessagesConfig, starredMessagesConfig, pollMessagesConfig, threadsConfig2, meetingsConfig, translationsConfig, publicReactionsConfig, textSuggestConfig, foldersConfig, filePreviewsConfig2, docViewerConfig, videoPlayerConfig, obj, Integer.valueOf(i2), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BackendConfig backendConfig) {
        BackendConfig backendConfig2 = backendConfig;
        if (backendConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("hidden_namespaces");
        this.listOfIntAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.hiddenNamespaces);
        jsonWriter.name("hidden_invite_link_namespaces");
        this.listOfIntAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.hiddenInviteLinkNamespaces);
        jsonWriter.name("hidden_chat_participants_namespaces");
        this.listOfIntAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.hiddenParticipantsNamespaces);
        jsonWriter.name("namespaces_without_phone_requirement");
        this.listOfIntAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.noPhoneNamespaces);
        jsonWriter.name("reactions_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(backendConfig2.reactionsEnabled));
        jsonWriter.name("reactions_by_namespace");
        this.mapOfStringListOfIntAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getReactionsConfig());
        jsonWriter.name("extended_reactions_by_namespace");
        this.mapOfStringListOfIntAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getExtendedReactionsConfig());
        jsonWriter.name("voice_messages");
        this.voiceMessagesConfigAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getVoiceMessagesConfig());
        jsonWriter.name("important_messages");
        this.starredMessagesConfigAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getStarredMessagesConfig());
        jsonWriter.name("polls_messages");
        this.pollMessagesConfigAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getPollMessagesConfig());
        jsonWriter.name("threads");
        this.threadsConfigAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getThreadsConfig());
        jsonWriter.name("meetings");
        this.meetingsConfigAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getMeetingsConfig());
        jsonWriter.name("translations");
        this.translationsConfigAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getTranslationsConfig());
        jsonWriter.name("public_reactions");
        this.publicReactionsConfigAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getPublicReactions());
        jsonWriter.name("typing_enhanced");
        this.textSuggestConfigAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getTextSuggest());
        jsonWriter.name("folders");
        this.foldersConfigAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getFolders());
        jsonWriter.name("file_previews");
        this.filePreviewsConfigAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getFilePreviews());
        jsonWriter.name("docviewer");
        this.docViewerConfigAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getDocViewer());
        jsonWriter.name("videoplayer");
        this.videoPlayerConfigAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getVideoPlayer());
        jsonWriter.name("custom_config");
        this.nullableObjectAdapter.toJson(jsonWriter, (JsonWriter) backendConfig2.getCustomConfig());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(BackendConfig)");
    }
}
