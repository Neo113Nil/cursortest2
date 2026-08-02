package xsna;

import com.vk.api.base.Document;
import com.vk.api.generated.wall.dto.WallActionButtonGoalDto;
import com.vk.api.generated.wall.dto.WallActionButtonLevelDto;
import com.vk.api.generated.wall.dto.WallActionButtonTypeDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketSeanceDto;
import com.vk.api.generated.wall.dto.WallAttachmentsActionButtonDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsActionButtonVkTicketDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalVideoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PollAnswerDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;

/* compiled from: PostingAttachmentsConverters.kt */
/* loaded from: classes4.dex */
public final class rcc0 {
    public static JSONObject a(MusicDto musicDto) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", musicDto.b);
        jSONObject.put("owner_id", musicDto.c.b);
        jSONObject.put("title", musicDto.e);
        jSONObject.put("subtitle", musicDto.i);
        jSONObject.put("music_audio_id", musicDto.d);
        jSONObject.put("music_photo_url", musicDto.j);
        jSONObject.put("music_playlist", musicDto.k);
        jSONObject.put("music_snippet", musicDto.l);
        jSONObject.put("has_illegal_notice_type", musicDto.g);
        jSONObject.put("additional_info", musicDto.f);
        jSONObject.put("all_artists_text", musicDto.h);
        MusicTrack musicTrack = musicDto.m;
        if (musicTrack != null) {
            jSONObject.put("track_object", musicTrack.e5());
        }
        return jSONObject;
    }

    public static ActionButton b(String str) {
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto;
        Object obj;
        JSONObject jSONObject;
        WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto;
        JSONObject jSONObject2 = new JSONObject(str);
        String string = jSONObject2.getString("type");
        Iterator<E> it = WallActionButtonTypeDto.i().iterator();
        while (true) {
            wallActionButtonVkTicketDto = null;
            wallActionButtonVkTicketSeanceDto = null;
            wallActionButtonVkTicketDto = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((WallActionButtonTypeDto) obj).j(), string)) {
                break;
            }
        }
        WallActionButtonTypeDto wallActionButtonTypeDto = (WallActionButtonTypeDto) obj;
        if (wallActionButtonTypeDto == null) {
            return null;
        }
        String string2 = jSONObject2.getString("title");
        String string3 = jSONObject2.getString("description");
        Integer x = f370.x(jSONObject2, "donut_goal");
        WallActionButtonGoalDto wallActionButtonGoalDto = x != null ? new WallActionButtonGoalDto(x.intValue()) : null;
        Integer x2 = f370.x(jSONObject2, "donut_level");
        WallActionButtonLevelDto wallActionButtonLevelDto = x2 != null ? new WallActionButtonLevelDto(x2.intValue()) : null;
        String D = f370.D(jSONObject2, "vk_ticket");
        WallPostingSettingsActionButtonVkTicketDto wallPostingSettingsActionButtonVkTicketDto = D != null ? new WallPostingSettingsActionButtonVkTicketDto(D, null, 2, null) : null;
        String D2 = f370.D(jSONObject2, "vk_ticket_data");
        if (D2 != null) {
            try {
                jSONObject = new JSONObject(D2);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                if (jSONObject.has("seance")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("seance");
                    wallActionButtonVkTicketSeanceDto = new WallActionButtonVkTicketSeanceDto(f370.D(jSONObject3, "seance_id"), f370.D(jSONObject3, "city_alias"), f370.D(jSONObject3, "city"), f370.D(jSONObject3, "date"));
                }
                wallActionButtonVkTicketDto = new WallActionButtonVkTicketDto(f370.D(jSONObject, "id"), f370.D(jSONObject, "title"), wallActionButtonVkTicketSeanceDto);
            }
        }
        return new ActionButton(new WallAttachmentsActionButtonDto(wallActionButtonTypeDto, string2, string3, wallActionButtonGoalDto, wallActionButtonLevelDto, wallPostingSettingsActionButtonVkTicketDto), wallActionButtonVkTicketDto);
    }

    public static FileDto c(String str) {
        UploadDto.UploadState uploadState;
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.optBoolean("pending")) {
            uploadState = new UploadDto.UploadState(UploadDto.UploadStep.Idle.b, f370.D(jSONObject, "uri"), com.vk.upload.impl.a.d.getAndIncrement(), 0, 0, AttachmentType.DOCUMENT, null, false, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, null);
        } else {
            UploadDto.b7.getClass();
            uploadState = UploadDto.a.b;
        }
        UploadDto.UploadState uploadState2 = uploadState;
        int i = jSONObject.getInt("id");
        String string = jSONObject.getString("title");
        int optInt = jSONObject.optInt("subtitle");
        Integer valueOf = Integer.valueOf(optInt);
        if (optInt == 0) {
            valueOf = null;
        }
        Integer num = valueOf;
        long j = jSONObject.getLong("file_size");
        UserId userId = new UserId(jSONObject.getLong("owner_id"));
        String D = f370.D(jSONObject, "access_key");
        if (!jSONObject.has("attach_json")) {
            return new FileDto.Doc(i, string, num, j, userId, D, uploadState2, j);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("attach_json");
        Serializer.c<DocumentAttachment> cVar = DocumentAttachment.CREATOR;
        return new FileDto.Gif(i, string, num, j, userId, D, uploadState2, new DocumentAttachment(new Document(jSONObject2.optJSONObject("doc"))), j);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static MusicAttachDto d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.has("attach_type") ? jSONObject.optString("attach_type") : jSONObject.optBoolean("music_playlist") ? "playlist_deprecated" : "track_deprecated";
        if (optString != null) {
            switch (optString.hashCode()) {
                case -2061635299:
                    if (optString.equals("snippet")) {
                        return new MusicAttachDto.MusicSnippetDto(g(jSONObject.getJSONObject("snippet")));
                    }
                    break;
                case 576036135:
                    if (optString.equals("track_deprecated")) {
                        return new MusicAttachDto.MusicTracksDto(Collections.singletonList(g(jSONObject)));
                    }
                    break;
                case 601571904:
                    if (optString.equals("playlist_deprecated")) {
                        return new MusicAttachDto.MusicPlaylistDto(g(jSONObject));
                    }
                    break;
                case 1879474642:
                    if (optString.equals("playlist")) {
                        return new MusicAttachDto.MusicPlaylistDto(g(jSONObject.getJSONObject("playlist")));
                    }
                    break;
            }
        }
        JSONArray jSONArray = jSONObject.getJSONArray("tracks");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(g(optJSONObject));
            }
        }
        return new MusicAttachDto.MusicTracksDto(arrayList);
    }

    public static ArrayList e(String str) {
        Attachment Fb;
        PostingAttachment a;
        Attachment Fb2;
        Attachment Fb3;
        JSONArray i = cqm0.i(str);
        ArrayList arrayList = new ArrayList(i.length());
        int length = i.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = i.getJSONObject(i2);
            String D = f370.D(jSONObject, "dto_type");
            PostingAttachment postingAttachment = null;
            if (epx.f(D, "photo_dto")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(SharedKt.PARAM_ATTACHMENT);
                int optInt = jSONObject2.optInt("type");
                if (optInt == 2) {
                    Fb3 = PhotoAttachment.Fb(jSONObject2);
                } else if (optInt == 5) {
                    Fb3 = VideoAttachment.Gb(jSONObject2);
                } else if (optInt != 17) {
                    if (optInt == 18) {
                        try {
                            Serializer.c<LocalVideoAttachment> cVar = LocalVideoAttachment.CREATOR;
                            Fb3 = LocalVideoAttachment.a.b(jSONObject2);
                        } catch (Exception e) {
                            L.i(e);
                        }
                    }
                    Fb3 = null;
                } else {
                    Serializer.c<LocalPhotoAttachment> cVar2 = LocalPhotoAttachment.CREATOR;
                    Fb3 = LocalPhotoAttachment.a.a(jSONObject2);
                }
                UploadDto.UploadState b = jSONObject.has("upload_state") ? geq0.b(jSONObject.getJSONObject("upload_state")) : null;
                PostingAttachment b2 = com.vk.newsfeed.posting.impl.presentation.model.a.b(Fb3);
                PhotoDto photoDto = b2 instanceof PhotoDto ? (PhotoDto) b2 : null;
                if (photoDto != null) {
                    if (b == null) {
                        b = photoDto.f;
                    }
                    a = PhotoDto.a(photoDto, null, b, 47);
                }
                a = null;
            } else {
                if (epx.f(D, "video_dto")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(SharedKt.PARAM_ATTACHMENT);
                    int optInt2 = jSONObject3.optInt("type");
                    if (optInt2 == 2) {
                        Fb = PhotoAttachment.Fb(jSONObject3);
                    } else if (optInt2 == 5) {
                        Fb = VideoAttachment.Gb(jSONObject3);
                    } else if (optInt2 != 17) {
                        if (optInt2 == 18) {
                            try {
                                Serializer.c<LocalVideoAttachment> cVar3 = LocalVideoAttachment.CREATOR;
                                Fb = LocalVideoAttachment.a.b(jSONObject3);
                            } catch (Exception e2) {
                                L.i(e2);
                            }
                        }
                        Fb = null;
                    } else {
                        Serializer.c<LocalPhotoAttachment> cVar4 = LocalPhotoAttachment.CREATOR;
                        Fb = LocalPhotoAttachment.a.a(jSONObject3);
                    }
                    UploadDto.UploadState b3 = jSONObject.has("upload_state") ? geq0.b(jSONObject.getJSONObject("upload_state")) : null;
                    PostingAttachment b4 = com.vk.newsfeed.posting.impl.presentation.model.a.b(Fb);
                    VideoDto videoDto = b4 instanceof VideoDto ? (VideoDto) b4 : null;
                    if (videoDto != null) {
                        if (b3 == null) {
                            b3 = videoDto.f;
                        }
                        a = VideoDto.a(videoDto, b3);
                    }
                }
                a = null;
            }
            if (a == null) {
                int optInt3 = jSONObject.optInt("type");
                if (optInt3 == 2) {
                    Fb2 = PhotoAttachment.Fb(jSONObject);
                } else if (optInt3 == 5) {
                    Fb2 = VideoAttachment.Gb(jSONObject);
                } else if (optInt3 != 17) {
                    if (optInt3 == 18) {
                        try {
                            Serializer.c<LocalVideoAttachment> cVar5 = LocalVideoAttachment.CREATOR;
                            Fb2 = LocalVideoAttachment.a.b(jSONObject);
                        } catch (Exception e3) {
                            L.i(e3);
                        }
                    }
                    Fb2 = null;
                } else {
                    Serializer.c<LocalPhotoAttachment> cVar6 = LocalPhotoAttachment.CREATOR;
                    Fb2 = LocalPhotoAttachment.a.a(jSONObject);
                }
                if (Fb2 != null) {
                    postingAttachment = com.vk.newsfeed.posting.impl.presentation.model.a.b(Fb2);
                }
            } else {
                postingAttachment = a;
            }
            if (postingAttachment != null) {
                arrayList.add(postingAttachment);
            }
        }
        return arrayList;
    }

    public static PostingPollDto f(String str) {
        List list;
        JSONObject jSONObject = new JSONObject(str);
        int i = jSONObject.getInt("id");
        UserId userId = new UserId(jSONObject.getLong("owner_id"));
        String string = jSONObject.getString("title");
        if (jSONObject.has("poll_answers")) {
            JSONArray jSONArray = jSONObject.getJSONArray("poll_answers");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                arrayList.add(new PollAnswerDto(jSONObject2.getLong("id"), jSONObject2.getString("title")));
            }
            list = arrayList;
        } else {
            list = EmptyList.b;
        }
        return new PostingPollDto(i, userId, string, list, jSONObject.getBoolean("poll_anonym"), jSONObject.getBoolean("poll_multi_votes"), jSONObject.getBoolean("poll_disable_unvote"), jSONObject.getBoolean("poll_has_end_date"), jSONObject.getLong("poll_end_date"), jSONObject.getBoolean("poll_published"), jSONObject.getBoolean("poll_can_delete"));
    }

    public static MusicDto g(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        Long z = f370.z(jSONObject, "owner_id");
        UserId userId = z != null ? new UserId(z.longValue()) : UserId.d;
        Integer x = f370.x(jSONObject, "music_audio_id");
        int intValue = x != null ? x.intValue() : 0;
        String string2 = jSONObject.getString("title");
        String optString = jSONObject.optString("additional_info");
        boolean optBoolean = jSONObject.optBoolean("has_illegal_notice_type", false);
        String string3 = jSONObject.getString("subtitle");
        String D = f370.D(jSONObject, "music_photo_url");
        boolean z2 = jSONObject.getBoolean("music_playlist");
        boolean z3 = jSONObject.getBoolean("music_snippet");
        String optString2 = jSONObject.optString("all_artists_text");
        JSONObject optJSONObject = jSONObject.optJSONObject("track_object");
        return new MusicDto(string, userId, intValue, string2, optString, optBoolean, optString2, string3, D, z2, z3, optJSONObject != null ? new MusicTrack(optJSONObject) : null, null, 0L, 4096, null);
    }
}
