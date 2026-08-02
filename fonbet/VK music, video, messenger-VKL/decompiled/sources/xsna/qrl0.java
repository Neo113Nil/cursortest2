package xsna;

import android.graphics.Color;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.stickers.dto.StickersStickerVmojiDto;
import com.vk.api.generated.stories.dto.StoriesClickableAreaDto;
import com.vk.api.generated.stories.dto.StoriesClickableStickerDto;
import com.vk.api.generated.stories.dto.StoriesSituationalRepliedUsersDto;
import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.actions.ActionPoll;
import com.vk.dto.stories.model.clickable.ClickableApp;
import com.vk.dto.stories.model.clickable.ClickableChannelPost;
import com.vk.dto.stories.model.clickable.ClickableClip;
import com.vk.dto.stories.model.clickable.ClickableGeo;
import com.vk.dto.stories.model.clickable.ClickableHashtag;
import com.vk.dto.stories.model.clickable.ClickableLink;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.dto.stories.model.clickable.ClickableMusicPlaylist;
import com.vk.dto.stories.model.clickable.ClickableOwner;
import com.vk.dto.stories.model.clickable.ClickablePackSticker;
import com.vk.dto.stories.model.clickable.ClickablePhoto;
import com.vk.dto.stories.model.clickable.ClickablePhotoAlbum;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.dto.stories.model.clickable.ClickablePost;
import com.vk.dto.stories.model.clickable.ClickableQuestion;
import com.vk.dto.stories.model.clickable.ClickableReaction;
import com.vk.dto.stories.model.clickable.ClickableReply;
import com.vk.dto.stories.model.clickable.ClickableServiceYcItem;
import com.vk.dto.stories.model.clickable.ClickableSituationalTemplate;
import com.vk.dto.stories.model.clickable.ClickableSituationalTheme;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableVideo;
import com.vk.dto.user.UserProfile;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.actions.WebActionQuestion;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: StoriesClickableStickersMapper.kt */
/* loaded from: classes3.dex */
public final class qrl0 {
    public static final int a = Color.parseColor("#3F8AE0");

    /* compiled from: StoriesClickableStickersMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoriesClickableStickerDto.TypeDto.values().length];
            try {
                iArr[StoriesClickableStickerDto.TypeDto.HASHTAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.MENTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.QUESTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.PLACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.MARKET_ITEM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.SERVICE_YC_ITEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.MUSIC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.STORY_REPLY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.OWNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.POST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.VK_VIDEO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.CHANNEL_POST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.POLL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.STICKER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.APP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.SITUATIONAL_THEME.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.CLIP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.PLAYLIST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.SITUATIONAL_TEMPLATE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.PHOTO.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.ALBUM.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[StoriesClickableStickerDto.TypeDto.REACTION.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ClickableSticker a(StoriesClickableStickerDto storiesClickableStickerDto, Map map, Map map2, Map map3) {
        String name;
        AwayLink awayLink;
        String str;
        AwayLink awayLink2;
        UserProfile userProfile;
        String str2;
        String str3;
        Group group;
        Integer u;
        Playlist playlist;
        String str4;
        Group group2;
        UserProfile userProfile2;
        String str5;
        String str6;
        VerifyInfo verifyInfo;
        VerifyInfo verifyInfo2;
        r7 = null;
        Group group3 = null;
        switch (a.$EnumSwitchMapping$0[storiesClickableStickerDto.V0().ordinal()]) {
            case 1:
                long id = storiesClickableStickerDto.getId();
                ArrayList b = b(storiesClickableStickerDto.p());
                String D = storiesClickableStickerDto.D();
                if (D == null) {
                    D = "";
                }
                StoriesClickableStickerDto.StyleDto S0 = storiesClickableStickerDto.S0();
                String i = S0 != null ? S0.i() : null;
                return new ClickableHashtag(id, b, null, D, i == null ? "" : i);
            case 2:
                String K = storiesClickableStickerDto.K();
                String obj = drm0.p0(K != null ? K : "").toString();
                Serializer.c<ClickableMention> cVar = ClickableMention.CREATOR;
                Pair c = ClickableMention.a.c(obj);
                if (c != null) {
                    UserId userId = (UserId) c.d();
                    String str7 = (String) c.g();
                    StoriesClickableStickerDto.StyleDto S02 = storiesClickableStickerDto.S0();
                    String lowerCase = (S02 == null || (name = S02.name()) == null) ? null : name.toLowerCase(Locale.ROOT);
                    UserProfile userProfile3 = (userId.b <= 0 || map2 == null) ? null : (UserProfile) map2.get(userId);
                    if (userId.b < 0 && map3 != null) {
                        group3 = (Group) map3.get(fkq0.e(userId));
                    }
                    return new ClickableMention(storiesClickableStickerDto.getId(), b(storiesClickableStickerDto.p()), null, userId, str7, lowerCase, userProfile3, group3);
                }
                return null;
            case 3:
                SnippetAttachment j = aqw.j(storiesClickableStickerDto.F(), null);
                long id2 = storiesClickableStickerDto.getId();
                ArrayList b2 = b(storiesClickableStickerDto.p());
                String str8 = (j == null || (awayLink = j.f) == null) ? null : awayLink.b;
                String str9 = str8 == null ? "" : str8;
                String U0 = storiesClickableStickerDto.U0();
                StoriesClickableStickerDto.StyleDto S03 = storiesClickableStickerDto.S0();
                return new ClickableLink(id2, b2, null, str9, null, U0, j, S03 != null ? S03.i() : null, null, 256, null);
            case 4:
                String B = storiesClickableStickerDto.B();
                int parseColor = B != null ? Color.parseColor("#".concat(B)) : a;
                long id3 = storiesClickableStickerDto.getId();
                ArrayList b3 = b(storiesClickableStickerDto.p());
                String v0 = storiesClickableStickerDto.v0();
                if (v0 == null) {
                    v0 = "";
                }
                String w0 = storiesClickableStickerDto.w0();
                String str10 = w0 != null ? w0 : "";
                StoriesClickableStickerDto.StyleDto S04 = storiesClickableStickerDto.S0();
                if (S04 == null || (str = S04.i()) == null) {
                    str = "light";
                }
                return new ClickableQuestion(id3, b3, null, new WebActionQuestion(v0, str10, str, parseColor), true);
            case 5:
                long id4 = storiesClickableStickerDto.getId();
                ArrayList b4 = b(storiesClickableStickerDto.p());
                Integer T = storiesClickableStickerDto.T();
                int intValue = T != null ? T.intValue() : 0;
                StoriesClickableStickerDto.StyleDto S05 = storiesClickableStickerDto.S0();
                String i2 = S05 != null ? S05.i() : null;
                return new ClickableGeo(id4, b4, null, intValue, i2 == null ? "" : i2, null, storiesClickableStickerDto.U0(), null);
            case 6:
                SnippetAttachment j2 = aqw.j(storiesClickableStickerDto.F(), null);
                MarketMarketItemDto G = storiesClickableStickerDto.G();
                Good c2 = G != null ? b210.c(G) : null;
                new ne6();
                Image a2 = ne6.a(G != null ? G.W() : null);
                long id5 = storiesClickableStickerDto.getId();
                ArrayList b5 = b(storiesClickableStickerDto.p());
                Long valueOf = G != null ? Long.valueOf(G.getId()) : null;
                UserId q = G != null ? G.q() : null;
                String str11 = (j2 == null || (awayLink2 = j2.f) == null) ? null : awayLink2.b;
                Photo photo = j2 != null ? j2.p : null;
                StoriesClickableStickerDto.StyleDto S06 = storiesClickableStickerDto.S0();
                return new ClickableMarketItem(id5, b5, null, valueOf, q, str11, a2, photo, c2, j2, storiesClickableStickerDto.d(), S06 != null ? S06.i() : null);
            case 7:
                SnippetAttachment j3 = aqw.j(storiesClickableStickerDto.F(), null);
                long id6 = storiesClickableStickerDto.getId();
                ArrayList b6 = b(storiesClickableStickerDto.p());
                StoriesClickableStickerDto.StyleDto S07 = storiesClickableStickerDto.S0();
                return new ClickableServiceYcItem(id6, b6, null, null, null, S07 != null ? S07.i() : null, j3, 24, null);
            case 8:
                AudioAudioDto i3 = storiesClickableStickerDto.i();
                MusicTrack d = i3 != null ? oc4.d(i3) : null;
                MediaPopupDto j4 = storiesClickableStickerDto.j();
                MusicDynamicRestriction v = j4 != null ? emi.v(j4) : null;
                Integer k = storiesClickableStickerDto.k();
                int intValue2 = k != null ? k.intValue() : 0;
                long id7 = storiesClickableStickerDto.getId();
                ArrayList b7 = b(storiesClickableStickerDto.p());
                StoriesClickableStickerDto.StyleDto S08 = storiesClickableStickerDto.S0();
                return new ClickableMusic(id7, b7, null, d, v, intValue2, S08 != null ? S08.i() : null, false, 128, null);
            case 9:
                UserId q2 = storiesClickableStickerDto.q();
                if (q2 == null) {
                    q2 = UserId.d;
                }
                UserId userId2 = q2;
                Integer P0 = storiesClickableStickerDto.P0();
                int intValue3 = P0 != null ? P0.intValue() : 0;
                long id8 = storiesClickableStickerDto.getId();
                ArrayList b8 = b(storiesClickableStickerDto.p());
                StoriesClickableStickerDto.StyleDto S09 = storiesClickableStickerDto.S0();
                return new ClickableReply(id8, b8, null, userId2, intValue3, S09 != null ? S09.i() : null);
            case 10:
                UserId q3 = storiesClickableStickerDto.q();
                if (q3 == null) {
                    q3 = UserId.d;
                }
                return new ClickableOwner(storiesClickableStickerDto.getId(), b(storiesClickableStickerDto.p()), null, q3);
            case 11:
                Integer a0 = storiesClickableStickerDto.a0();
                int intValue4 = a0 != null ? a0.intValue() : 0;
                UserId l0 = storiesClickableStickerDto.l0();
                if (l0 == null) {
                    l0 = UserId.d;
                }
                UserId userId3 = l0;
                long id9 = storiesClickableStickerDto.getId();
                ArrayList b9 = b(storiesClickableStickerDto.p());
                StoriesClickableStickerDto.StyleDto S010 = storiesClickableStickerDto.S0();
                return new ClickablePost(id9, b9, null, intValue4, userId3, S010 != null ? S010.i() : null);
            case 12:
                UserId q4 = storiesClickableStickerDto.q();
                if (q4 == null) {
                    q4 = UserId.d;
                }
                UserId userId4 = q4;
                Integer b1 = storiesClickableStickerDto.b1();
                int intValue5 = b1 != null ? b1.intValue() : 0;
                long id10 = storiesClickableStickerDto.getId();
                ArrayList b10 = b(storiesClickableStickerDto.p());
                StoriesClickableStickerDto.StyleDto S011 = storiesClickableStickerDto.S0();
                return new ClickableVideo(id10, b10, null, userId4, intValue5, S011 != null ? S011.i() : null);
            case 13:
                UserId o = storiesClickableStickerDto.o();
                if (o == null) {
                    o = UserId.d;
                }
                UserId userId5 = o;
                UserId l = storiesClickableStickerDto.l();
                if (l == null) {
                    l = UserId.d;
                }
                UserId userId6 = l;
                Integer n = storiesClickableStickerDto.n();
                int intValue6 = n != null ? n.intValue() : 0;
                if (fkq0.b(userId6)) {
                    if (map3 != null && (group = (Group) map3.get(fkq0.a(userId6))) != null) {
                        str2 = group.d;
                        str3 = str2;
                    }
                    str3 = null;
                } else {
                    if (map2 != null && (userProfile = (UserProfile) map2.get(userId6)) != null) {
                        str2 = userProfile.e;
                        str3 = str2;
                    }
                    str3 = null;
                }
                long id11 = storiesClickableStickerDto.getId();
                ArrayList b11 = b(storiesClickableStickerDto.p());
                StoriesClickableStickerDto.StyleDto S012 = storiesClickableStickerDto.S0();
                return new ClickableChannelPost(id11, b11, null, userId6, userId5, intValue6, S012 != null ? S012.i() : null, str3);
            case 14:
                PollsPollDto Z = storiesClickableStickerDto.Z();
                return new ClickablePoll(storiesClickableStickerDto.getId(), b(storiesClickableStickerDto.p()), null, Z == null ? new ActionPoll(null) : new ActionPoll(new eub0().a(Z, map)));
            case 15:
                Integer K0 = storiesClickableStickerDto.K0();
                int intValue7 = K0 != null ? K0.intValue() : 0;
                Integer N0 = storiesClickableStickerDto.N0();
                int intValue8 = N0 != null ? N0.intValue() : 0;
                StickersStickerVmojiDto d1 = storiesClickableStickerDto.d1();
                return new ClickablePackSticker(storiesClickableStickerDto.getId(), b(storiesClickableStickerDto.p()), null, intValue7, intValue8, d1 != null ? d1.d() : null);
            case 16:
                AppsAppMinDto g = storiesClickableStickerDto.g();
                return new ClickableApp(storiesClickableStickerDto.getId(), b(storiesClickableStickerDto.p()), null, null, g != null ? e13.b(g) : null, epx.f(storiesClickableStickerDto.C(), Boolean.TRUE), 8, null);
            case 17:
                return new ClickableSituationalTheme(storiesClickableStickerDto.getId(), b(storiesClickableStickerDto.p()), null, storiesClickableStickerDto.H0(), storiesClickableStickerDto.D0());
            case 18:
                long id12 = storiesClickableStickerDto.getId();
                ArrayList b12 = b(storiesClickableStickerDto.p());
                UserId q5 = storiesClickableStickerDto.q();
                if (q5 != null) {
                    UserId userId7 = fkq0.c(q5) ? q5 : null;
                    if (userId7 != null && (u = storiesClickableStickerDto.u()) != null) {
                        int intValue9 = u.intValue();
                        StoriesClickableStickerDto.StyleDto S013 = storiesClickableStickerDto.S0();
                        return new ClickableClip(id12, b12, null, userId7, intValue9, S013 != null ? S013.i() : null);
                    }
                }
                return null;
            case 19:
                long id13 = storiesClickableStickerDto.getId();
                ArrayList b13 = b(storiesClickableStickerDto.p());
                AudioPlaylistDto W = storiesClickableStickerDto.W();
                if (W != null) {
                    jt4.a.getClass();
                    playlist = jt4.a(W);
                } else {
                    playlist = null;
                }
                MediaPopupDto j5 = storiesClickableStickerDto.j();
                return new ClickableMusicPlaylist(id13, b13, null, playlist, j5 != null ? emi.v(j5) : null);
            case 20:
                StoriesSituationalRepliedUsersDto F0 = storiesClickableStickerDto.F0();
                if (F0 != null) {
                    List<UserId> f = F0.f();
                    if (f == null) {
                        f = EmptyList.b;
                    }
                    Integer e = F0.e();
                    long id14 = storiesClickableStickerDto.getId();
                    ArrayList b14 = b(storiesClickableStickerDto.p());
                    Integer H0 = storiesClickableStickerDto.H0();
                    Integer d2 = F0.d();
                    int intValue10 = d2 != null ? d2.intValue() : 0;
                    int intValue11 = e != null ? e.intValue() : 0;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : f) {
                        if (map2 == null || (userProfile2 = (UserProfile) map2.get(obj2)) == null || (str4 = userProfile2.h) == null) {
                            str4 = (map3 == null || (group2 = (Group) map3.get(obj2)) == null) ? null : group2.e;
                        }
                        if (str4 != null) {
                            arrayList.add(str4);
                        }
                    }
                    return new ClickableSituationalTemplate(id14, b14, null, H0, new ClickableSituationalTemplate.RepliedUsersInfo(intValue10, f, arrayList, intValue11));
                }
                return null;
            case 21:
                UserProfile userProfile4 = map2 != null ? (UserProfile) map2.get(storiesClickableStickerDto.R()) : null;
                if (userProfile4 == null) {
                    if (map3 != null) {
                        UserId R = storiesClickableStickerDto.R();
                        Group group4 = (Group) map3.get(R != null ? fkq0.a(R) : null);
                        if (group4 != null) {
                            str6 = group4.d;
                        }
                    }
                    str5 = null;
                    if (userProfile4 != null) {
                        if (map3 != null) {
                            UserId R2 = storiesClickableStickerDto.R();
                            Group group5 = (Group) map3.get(R2 != null ? fkq0.a(R2) : null);
                            if (group5 != null) {
                                verifyInfo2 = group5.y;
                            }
                        }
                        verifyInfo = null;
                        long id15 = storiesClickableStickerDto.getId();
                        ArrayList b15 = b(storiesClickableStickerDto.p());
                        UserId R3 = storiesClickableStickerDto.R();
                        long j6 = R3 != null ? R3.b : 0L;
                        Integer M = storiesClickableStickerDto.M();
                        int intValue12 = M != null ? M.intValue() : 0;
                        StoriesClickableStickerDto.StyleDto S014 = storiesClickableStickerDto.S0();
                        return new ClickablePhoto(id15, b15, null, str5, j6, intValue12, S014 != null ? S014.i() : null, verifyInfo);
                    }
                    verifyInfo2 = userProfile4.B;
                    verifyInfo = verifyInfo2;
                    long id152 = storiesClickableStickerDto.getId();
                    ArrayList b152 = b(storiesClickableStickerDto.p());
                    UserId R32 = storiesClickableStickerDto.R();
                    long j62 = R32 != null ? R32.b : 0L;
                    Integer M2 = storiesClickableStickerDto.M();
                    int intValue122 = M2 != null ? M2.intValue() : 0;
                    StoriesClickableStickerDto.StyleDto S0142 = storiesClickableStickerDto.S0();
                    return new ClickablePhoto(id152, b152, null, str5, j62, intValue122, S0142 != null ? S0142.i() : null, verifyInfo);
                }
                str6 = userProfile4.D();
                if (str6 == null) {
                    str6 = userProfile4.e;
                }
                str5 = str6;
                if (userProfile4 != null) {
                }
                verifyInfo = verifyInfo2;
                long id1522 = storiesClickableStickerDto.getId();
                ArrayList b1522 = b(storiesClickableStickerDto.p());
                UserId R322 = storiesClickableStickerDto.R();
                long j622 = R322 != null ? R322.b : 0L;
                Integer M22 = storiesClickableStickerDto.M();
                int intValue1222 = M22 != null ? M22.intValue() : 0;
                StoriesClickableStickerDto.StyleDto S01422 = storiesClickableStickerDto.S0();
                return new ClickablePhoto(id1522, b1522, null, str5, j622, intValue1222, S01422 != null ? S01422.i() : null, verifyInfo);
            case 22:
                long id16 = storiesClickableStickerDto.getId();
                ArrayList b16 = b(storiesClickableStickerDto.p());
                UserId f2 = storiesClickableStickerDto.f();
                long j7 = f2 != null ? f2.b : 0L;
                Integer e2 = storiesClickableStickerDto.e();
                int intValue13 = e2 != null ? e2.intValue() : 0;
                StoriesClickableStickerDto.StyleDto S015 = storiesClickableStickerDto.S0();
                return new ClickablePhotoAlbum(id16, b16, null, j7, intValue13, S015 != null ? S015.i() : null);
            case 23:
                long id17 = storiesClickableStickerDto.getId();
                ArrayList b17 = b(storiesClickableStickerDto.p());
                Integer y0 = storiesClickableStickerDto.y0();
                return new ClickableReaction(id17, b17, null, y0 != null ? y0.intValue() : 0, storiesClickableStickerDto.S0() == StoriesClickableStickerDto.StyleDto.DARK ? 1 : 0);
            default:
                return null;
        }
    }

    public static ArrayList b(List list) {
        List<StoriesClickableAreaDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (StoriesClickableAreaDto storiesClickableAreaDto : list2) {
            arrayList.add(new WebClickablePoint(storiesClickableAreaDto.d(), storiesClickableAreaDto.e()));
        }
        return arrayList;
    }
}
