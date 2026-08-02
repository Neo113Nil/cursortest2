package com.vkontakte.android.attachments;

import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.Ad;
import com.ironsource.C4583ua;
import com.ironsource.Y3;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.base.Document;
import com.vk.clips.sdk.shared.api.domain.HashtagParseMode;
import com.vk.clips.sdk.shared.api.domain.MentionsParseMode;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.attachments.StereoRoomAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.c;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.geo.GeoPlace;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Curator;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.nft.Nft;
import com.vk.dto.nft.NftAttachmentPresentationMode;
import com.vk.dto.nft.NftCollection;
import com.vk.dto.nft.NftOrigin;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerItem;
import com.vk.log.L;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MiniAppAttachment;
import com.vkontakte.android.data.ParseFrom;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dlv;
import xsna.epx;
import xsna.f370;
import xsna.ibr0;
import xsna.j6i;
import xsna.m7m;
import xsna.o25;
import xsna.ou;
import xsna.pht0;
import xsna.vj90;
import xsna.w8i;
import xsna.y64;

/* compiled from: AttachmentUtils.java */
/* loaded from: classes7.dex */
public final class a {
    public static final /* synthetic */ int a = 0;

    /* compiled from: AttachmentUtils.java */
    /* renamed from: com.vkontakte.android.attachments.a$a, reason: collision with other inner class name */
    public class C2100a implements w8i {
    }

    /* compiled from: AttachmentUtils.java */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AttachmentType.values().length];
            a = iArr;
            try {
                iArr[AttachmentType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AttachmentType.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AttachmentType.GRAFFITI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AttachmentType.POSTED_PHOTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AttachmentType.ALBUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[AttachmentType.APP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[AttachmentType.AUDIO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[AttachmentType.MARKET_ALBUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[AttachmentType.VIDEO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[AttachmentType.CLIP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[AttachmentType.DOCUMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[AttachmentType.LINK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[AttachmentType.ARTICLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[AttachmentType.STEREO_ROOM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[AttachmentType.POLL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[AttachmentType.NOTE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[AttachmentType.PAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[AttachmentType.STICKER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[AttachmentType.CHRONICLE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[AttachmentType.PLAYLIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[AttachmentType.ARTIST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[AttachmentType.CURATOR.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[AttachmentType.PRETTY_CARDS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[AttachmentType.PODCAST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[AttachmentType.NARRATIVE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[AttachmentType.EVENT.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[AttachmentType.MINI_APP.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[AttachmentType.DONUT_LINK.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                a[AttachmentType.SITUATIONAL_THEME.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                a[AttachmentType.GEO.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                a[AttachmentType.BOOKING.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                a[AttachmentType.MARKET_LINK.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                a[AttachmentType.MESSAGE_TO_BC.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                a[AttachmentType.ACTION_BUTTON.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(16);
        sparseIntArray.put(0, R.plurals.num_attach_photo_short);
        sparseIntArray.put(1, R.plurals.num_attach_video_short);
        sparseIntArray.put(2, R.plurals.num_attach_audio_short);
        sparseIntArray.put(3, R.plurals.num_attach_doc_short);
        sparseIntArray.put(4, R.plurals.num_attach_article_short);
        sparseIntArray.put(5, R.plurals.num_attach_link_short);
        sparseIntArray.put(6, R.plurals.num_attach_link_short);
        sparseIntArray.put(7, R.plurals.num_attach_photo_album_short);
        sparseIntArray.put(8, R.plurals.num_attach_poll_short);
        sparseIntArray.put(9, R.plurals.num_attach_podcast_short);
        sparseIntArray.put(10, R.plurals.num_attach_narrative_short);
        sparseIntArray.put(11, R.plurals.num_attach_playlist_short);
        sparseIntArray.put(12, R.plurals.num_attach_artist_short);
        sparseIntArray.put(13, R.plurals.num_attach_market_short);
        sparseIntArray.put(14, R.plurals.num_attach_graffiti_short);
        sparseIntArray.put(15, R.plurals.num_attach_event_short);
        sparseIntArray.put(19, R.plurals.num_attach_stereo_room_short);
    }

    public static boolean a(@NonNull Attachment attachment, @NonNull Attachment attachment2) {
        return attachment.Bb() != Integer.MAX_VALUE && attachment.Bb() == attachment2.Bb();
    }

    public static int b(@NonNull Attachment attachment, @NonNull ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i != arrayList.size(); i++) {
            if (attachment.Bb() < ((Attachment) arrayList.get(i)).Bb()) {
                return i;
            }
        }
        return size;
    }

    public static Attachment c(JSONObject jSONObject, @Nullable Map<UserId, Owner> map, @Nullable ParseFrom parseFrom) {
        AttachmentType attachmentType;
        MiniAppAttachment.Button button;
        String str;
        C2100a c2100a = new C2100a();
        try {
            String string = jSONObject.getString("type");
            JSONObject optJSONObject = jSONObject.optJSONObject(string);
            AttachmentType.Companion.getClass();
            AttachmentType[] values = AttachmentType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    attachmentType = null;
                    break;
                }
                attachmentType = values[i];
                str = attachmentType.title;
                if (epx.f(str, string)) {
                    break;
                }
                i++;
            }
            if (attachmentType == null) {
                attachmentType = AttachmentType.UNKNOWN;
            }
            switch (b.a[attachmentType.ordinal()]) {
                case 1:
                    return new MarketAttachment(new Good(optJSONObject, map));
                case 2:
                    if (optJSONObject.has("nft")) {
                        return e(optJSONObject, map);
                    }
                    if (optJSONObject.optJSONArray("sizes") != null) {
                        return new PhotoAttachment(new Photo(optJSONObject), map);
                    }
                    ArrayList arrayList = new ArrayList(3);
                    String string2 = optJSONObject.getString("src");
                    Boolean bool = Boolean.FALSE;
                    arrayList.add(new ImageSize(string2, 135, 100, bool, ImageSizeKey.SIZE_M_0130.i()));
                    String string3 = optJSONObject.getString("src_big");
                    ImageSizeKey imageSizeKey = ImageSizeKey.SIZE_Q_0320;
                    arrayList.add(new ImageSize(string3, imageSizeKey.getWidth(), Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, bool, imageSizeKey.i()));
                    String string4 = optJSONObject.getString("src_xbig");
                    ImageSizeKey imageSizeKey2 = ImageSizeKey.SIZE_X_0604;
                    arrayList.add(new ImageSize(string4, imageSizeKey2.getWidth(), 480, bool, imageSizeKey2.i()));
                    Photo photo = new Photo(new Image(arrayList));
                    photo.e = new UserId(optJSONObject.getLong("owner_id"));
                    photo.c = optJSONObject.optInt("id", -optJSONObject.optInt("gid"));
                    photo.d = optJSONObject.optInt(C4583ua.b, -7);
                    photo.u = optJSONObject.optString("text");
                    UserId userId = new UserId(optJSONObject.optLong("user_id", photo.e.d()));
                    photo.f = userId;
                    if (userId.d() == 100) {
                        photo.f = photo.e;
                    }
                    photo.g = optJSONObject.optInt("created");
                    photo.v = optJSONObject.optString("access_key", "");
                    return new PhotoAttachment(photo, map);
                case 3:
                    return new GraffitiAttachment(optJSONObject);
                case 4:
                    ArrayList arrayList2 = new ArrayList(2);
                    String string5 = optJSONObject.getString("photo_130");
                    ImageSizeKey imageSizeKey3 = ImageSizeKey.SIZE_M_0130;
                    int width = imageSizeKey3.getWidth();
                    Boolean bool2 = Boolean.FALSE;
                    arrayList2.add(new ImageSize(string5, width, 98, bool2, imageSizeKey3.i()));
                    String string6 = optJSONObject.getString("photo_604");
                    ImageSizeKey imageSizeKey4 = ImageSizeKey.SIZE_X_0604;
                    arrayList2.add(new ImageSize(string6, imageSizeKey4.getWidth(), 480, bool2, imageSizeKey4.i()));
                    Photo photo2 = new Photo(new Image(arrayList2));
                    photo2.e = new UserId(optJSONObject.getLong("owner_id"));
                    photo2.c = optJSONObject.optInt("id");
                    photo2.d = Integer.MIN_VALUE;
                    UserId userId2 = new UserId(optJSONObject.optLong("user_id", photo2.e.d()));
                    photo2.f = userId2;
                    if (userId2.d() == 100) {
                        photo2.f = photo2.e;
                    }
                    return new PhotoAttachment(photo2, map);
                case 5:
                    JSONObject jSONObject2 = optJSONObject.getJSONObject("thumb");
                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("restrictions");
                    if (jSONObject2.has("sizes")) {
                        Photo photo3 = new Photo(jSONObject2);
                        photo3.e = new UserId(optJSONObject.getLong("owner_id"));
                        photo3.c = optJSONObject.optInt("pid", photo3.c);
                        photo3.d = optJSONObject.optInt("id", -7);
                        photo3.u = optJSONObject.optString("title");
                        UserId userId3 = new UserId(optJSONObject.optLong("user_id", photo3.e.d()));
                        photo3.f = userId3;
                        if (userId3.d() == 100) {
                            photo3.f = photo3.e;
                        }
                        photo3.L = optJSONObject2 != null ? (PhotoRestriction) PhotoRestriction.f.a(optJSONObject2) : null;
                        return new AlbumAttachment(photo3, optJSONObject.getInt("size"), optJSONObject.optString("description"), optJSONObject.optBoolean("can_include_to_feed", true));
                    }
                    ArrayList arrayList3 = new ArrayList(3);
                    String string7 = jSONObject2.getString("src");
                    Boolean bool3 = Boolean.FALSE;
                    arrayList3.add(new ImageSize(string7, 135, 100, bool3, ImageSizeKey.SIZE_M_0130.i()));
                    arrayList3.add(new ImageSize(jSONObject2.getString("src_big"), 320, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, bool3, ImageSizeKey.SIZE_Q_0320.i()));
                    arrayList3.add(new ImageSize(jSONObject2.getString("src_xbig"), 604, 480, bool3, ImageSizeKey.SIZE_X_0604.i()));
                    Photo photo4 = new Photo(new Image(arrayList3));
                    photo4.e = new UserId(optJSONObject.getLong("owner_id"));
                    photo4.c = optJSONObject.optInt("pid", -optJSONObject.optInt("gid"));
                    photo4.d = optJSONObject.optInt(C4583ua.b);
                    photo4.u = optJSONObject.optString("title");
                    UserId userId4 = new UserId(optJSONObject.optLong("user_id", photo4.e.d()));
                    photo4.f = userId4;
                    if (userId4.d() == 100) {
                        photo4.f = photo4.e;
                    }
                    photo4.L = optJSONObject2 != null ? (PhotoRestriction) PhotoRestriction.f.a(optJSONObject2) : null;
                    return new AlbumAttachment(photo4, optJSONObject.getInt("size"), optJSONObject.optString("description"), optJSONObject.optBoolean("can_include_to_feed", true));
                case 6:
                    ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(new ImageSize(optJSONObject.getString("src"), 135, 100, Boolean.FALSE, ImageSizeKey.SIZE_M_0130.i()));
                    return new PhotoAttachment(new Photo(new Image(arrayList4)));
                case 7:
                    return new AudioAttachment(new MusicTrack(optJSONObject));
                case 8:
                    return new MarketAlbumAttachment(new GoodAlbum(optJSONObject));
                case 9:
                case 10:
                    VideoFileOld c = c.c(optJSONObject, null, null, map);
                    if (c.C2()) {
                        ClipVideoFile clipVideoFile = (ClipVideoFile) c;
                        MusicTrack Nb = clipVideoFile.Nb();
                        ibr0 pe = ((ClipsViewerComponent) j6i.b(m7m.f(c2100a), ClipsViewerComponent.class)).pe();
                        clipVideoFile.z5(pe.a(c.j1(), HashtagParseMode.DEFAULT, MentionsParseMode.DEFAULT, true));
                        if (Nb != null) {
                            clipVideoFile.ea(pe.b(Nb.d));
                            clipVideoFile.R4(pe.c(Nb));
                        }
                    }
                    Owner owner = map != null ? map.get(c.I0()) : null;
                    if (owner != null) {
                        c.f1(owner);
                    }
                    return new VideoAttachment(c, parseFrom);
                case 11:
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("preview");
                    return optJSONObject3 != null ? optJSONObject3.optJSONObject("graffiti") != null ? new GraffitiAttachment(new Document(optJSONObject)) : optJSONObject3.has("audio_msg") ? new AudioMessageAttachment(new Document(optJSONObject)) : new DocumentAttachment(new Document(optJSONObject)) : new DocumentAttachment(new Document(optJSONObject));
                case 12:
                    if (optJSONObject.has("video")) {
                        return pht0.a(optJSONObject, map);
                    }
                    if (!optJSONObject.has("photo") && !optJSONObject.has("classified_worki") && !optJSONObject.has("classified_youla") && !optJSONObject.has("vmoji_avatar") && !optJSONObject.has("stickers_pack") && !optJSONObject.has("seller_product")) {
                        JSONObject optJSONObject4 = optJSONObject.optJSONObject("button");
                        JSONObject optJSONObject5 = optJSONObject4 != null ? optJSONObject4.optJSONObject("action") : null;
                        return new LinkAttachment(new AwayLink(optJSONObject.getString("url"), AwayLink.zb(optJSONObject)), optJSONObject.getString("title"), optJSONObject.optString("preview_page", ""), optJSONObject.optString("target"), optJSONObject5 != null ? new ButtonAction(optJSONObject5) : null, null);
                    }
                    return SnippetAttachment.Ib(optJSONObject, map);
                case 13:
                    Serializer.c<ArticleAttachment> cVar = ArticleAttachment.CREATOR;
                    return new ArticleAttachment(vj90.a(optJSONObject, map != null ? map.get(new UserId(f370.y(optJSONObject, "owner_id", 0L))) : null));
                case 14:
                    if (!Features.Type.FEATURE_VOIP_STEREO.h()) {
                        return null;
                    }
                    Serializer.c<StereoRoomAttachment> cVar2 = StereoRoomAttachment.CREATOR;
                    return StereoRoomAttachment.a.a(optJSONObject, map);
                case 15:
                    return new PollAttachment(optJSONObject, map);
                case 16:
                    return new NoteAttachment(optJSONObject.getString("title"), optJSONObject.optLong("owner_id"), optJSONObject.getInt("id"));
                case 17:
                    return new WikiAttachment(optJSONObject.getString("title"), optJSONObject.optString("section"), -optJSONObject.optLong("group_id"), optJSONObject.optInt("page_id"));
                case 18:
                    return new StickerAttachment(StickerItem.Bb(optJSONObject), optJSONObject.optInt("product_id", 0));
                case 19:
                    return new ChronicleAttachment(optJSONObject.getInt("id"), optJSONObject.getInt("owner_id"), optJSONObject.getString("app_name"), optJSONObject.optString("caption"), optJSONObject.getString("package"), optJSONObject.getString("label"), optJSONObject.getString("src_blur"), optJSONObject.optString("src_big"));
                case 20:
                    Playlist playlist = new Playlist(optJSONObject);
                    if (map != null) {
                        dlv.e(o25.a().c(), Collections.singletonList(playlist), map);
                    }
                    return new AudioPlaylistAttachment(playlist);
                case 21:
                    return new AudioArtistAttachment(new Artist(optJSONObject));
                case 22:
                    return new AudioCuratorAttachment((Curator) Curator.j.a(optJSONObject));
                case 23:
                    return new PrettyCardAttachment(optJSONObject);
                case 24:
                    if (optJSONObject == null) {
                        return null;
                    }
                    MusicTrack musicTrack = new MusicTrack(optJSONObject);
                    return new PodcastAttachment(musicTrack, map != null ? map.get(musicTrack.c) : null);
                case 25:
                    return y64.l(optJSONObject, map != null ? map.get(new UserId(optJSONObject.getLong("owner_id"))) : null);
                case 26:
                    if (map != null) {
                        return y64.h(optJSONObject, map);
                    }
                case 27:
                    ApiApplication apiApplication = new ApiApplication(optJSONObject.getJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP));
                    String optString = optJSONObject.optString("title");
                    String optString2 = optJSONObject.optString("description");
                    String optString3 = optJSONObject.optString("button_text");
                    NotificationImage Eb = NotificationImage.Eb(optJSONObject.optJSONArray("images"));
                    JSONObject optJSONObject6 = optJSONObject.optJSONObject("button");
                    if (optJSONObject6 != null) {
                        String optString4 = optJSONObject6.optString("button_text");
                        String optString5 = optJSONObject6.optString("state");
                        if (optJSONObject6.optJSONObject("button_action") != null) {
                            button = new MiniAppAttachment.Button(optString4, optString5, new MiniAppAttachment.Action.OpenApp());
                            return new MiniAppAttachment(apiApplication, optString, optString2, optString3, Eb, button);
                        }
                    }
                    button = null;
                    return new MiniAppAttachment(apiApplication, optString, optString2, optString3, Eb, button);
                case 28:
                    return y64.g(optJSONObject, map);
                case 29:
                    return y64.m(optJSONObject);
                case 30:
                    return d(optJSONObject);
                case 31:
                    JSONObject optJSONObject7 = jSONObject.optJSONObject("compact");
                    JSONObject optJSONObject8 = optJSONObject7 == null ? null : optJSONObject7.optJSONObject("description");
                    UserId userId5 = optJSONObject8 == null ? UserId.d : new UserId(optJSONObject8.optLong("source_id"));
                    String optString6 = optJSONObject.optString("booking_app_url");
                    Owner owner2 = map.get(userId5);
                    return new BookingAttachment(owner2 != null ? owner2.c : null, optString6);
                case 32:
                    JSONObject optJSONObject9 = jSONObject.optJSONObject("compact");
                    JSONObject optJSONObject10 = optJSONObject9 == null ? null : optJSONObject9.optJSONObject("description");
                    return y64.j(optJSONObject, optJSONObject10 == null ? UserId.d : new UserId(optJSONObject10.optLong("source_id")), map);
                case 33:
                    return y64.k(optJSONObject, map);
                case 34:
                    JSONObject optJSONObject11 = jSONObject.optJSONObject("action_button");
                    if (optJSONObject11 != null) {
                        return ou.a(optJSONObject11);
                    }
                default:
                    L.G("vk", "Unknown attachment " + jSONObject);
                    return null;
            }
        } catch (Exception e) {
            L.C("vk", e);
            return null;
        }
    }

    public static GeoAttachment d(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        String[] split = jSONObject.getString(Y3.f).split(" ");
        int i = 0;
        double parseDouble = Double.parseDouble(split[0]);
        double parseDouble2 = Double.parseDouble(split[1]);
        if (!jSONObject.has("place")) {
            return new GeoAttachment(parseDouble, parseDouble2, "title", "subtitle", -1, null, 0);
        }
        GeoPlace geoPlace = new GeoPlace(jSONObject.getJSONObject("place"));
        String string = jSONObject.getString("type");
        string.getClass();
        if (string.equals("place")) {
            i = 2;
        } else if (string.equals("point")) {
            i = jSONObject.optInt("showmap") == 1 ? 3 : 1;
        }
        return new GeoAttachment(parseDouble, parseDouble2, geoPlace.i, geoPlace.k, geoPlace.c, geoPlace.j, i);
    }

    public static NftAttachment e(JSONObject jSONObject, @Nullable Map<UserId, Owner> map) throws JSONException {
        UserId userId = new UserId(jSONObject.getLong("owner_id"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("nft");
        if (!jSONObject.has("user_id")) {
            jSONObject.put("user_id", jSONObject.get("owner_id"));
        }
        Photo photo = new Photo(jSONObject);
        String string = jSONObject2.getString("wallet_public_id");
        String string2 = jSONObject2.getString("nft_public_id");
        String string3 = jSONObject2.getString("title");
        String string4 = jSONObject2.getString("description");
        String optString = jSONObject2.optString("nft_app_logo");
        Serializer.c<NftCollection> cVar = NftCollection.CREATOR;
        JSONObject optJSONObject = jSONObject2.optJSONObject("nft_collection");
        NftCollection nftCollection = optJSONObject != null ? new NftCollection(optJSONObject.optString("name"), optJSONObject.optBoolean("verified")) : null;
        Serializer.c<NftOrigin> cVar2 = NftOrigin.CREATOR;
        ArrayList a2 = NftOrigin.a.a(jSONObject2);
        NftAttachmentPresentationMode.Companion.getClass();
        String optString2 = jSONObject2.optString("attachment_presentation_mode");
        return new NftAttachment(new Nft(userId, string, string2, photo, string3, string4, optString, nftCollection, a2, epx.f(optString2, Ad.d) ? NftAttachmentPresentationMode.SINGLE : epx.f(optString2, "standard") ? NftAttachmentPresentationMode.STANDARD : NftAttachmentPresentationMode.STANDARD, null, null, null, 7168, null), map);
    }
}
