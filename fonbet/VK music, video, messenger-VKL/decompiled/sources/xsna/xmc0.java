package xsna;

import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PublicationState;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PostingStateRulesProxy.kt */
/* loaded from: classes4.dex */
public final class xmc0 {
    public final PostingState.Editing a;
    public final PublicationState b;
    public final PostingSettings c;
    public final UserId d;
    public final int e;
    public final List<PostingAttachment> f;
    public ActionsAvailabilityState g;
    public ActionsAvailabilityState.Attachments h;

    /* compiled from: PostingStateRulesProxy.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RuleAttachment.values().length];
            try {
                iArr[RuleAttachment.Video.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RuleAttachment.Gif.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RuleAttachment.Photo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RuleAttachment.Link.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RuleAttachment.Place.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RuleAttachment.Audio.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RuleAttachment.AudioPlaylist.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RuleAttachment.Poll.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RuleAttachment.Market.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[RuleAttachment.File.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[RuleAttachment.ActionButton.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[RuleAttachment.Text.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[RuleAttachment.Article.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public xmc0(PostingState.Editing editing) {
        this.a = editing;
        this.b = editing.m;
        this.c = editing.d;
        this.d = editing.c.b.b;
        PostEditableData postEditableData = editing.i;
        this.e = postEditableData.b;
        this.f = postEditableData.p;
        Parcelable.Creator<ActionsAvailabilityState> creator = ActionsAvailabilityState.CREATOR;
        this.g = ActionsAvailabilityState.j;
        Parcelable.Creator<ActionsAvailabilityState.Attachments> creator2 = ActionsAvailabilityState.Attachments.CREATOR;
        this.h = ActionsAvailabilityState.Attachments.n;
    }

    public static boolean d(MusicAttachDto musicAttachDto) {
        if (musicAttachDto instanceof MusicAttachDto.MusicSnippetDto) {
            return !e(((MusicAttachDto.MusicSnippetDto) musicAttachDto).b.n);
        }
        if (musicAttachDto instanceof MusicAttachDto.MusicPlaylistDto) {
            return !e(((MusicAttachDto.MusicPlaylistDto) musicAttachDto).b.n);
        }
        if (!(musicAttachDto instanceof MusicAttachDto.MusicTracksDto)) {
            throw new NoWhenBranchMatchedException();
        }
        List<MusicDto> list = ((MusicAttachDto.MusicTracksDto) musicAttachDto).b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!e(((MusicDto) it.next()).n)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(UploadDto.UploadState uploadState) {
        UploadDto.b7.getClass();
        return epx.f(uploadState, UploadDto.a.b) || epx.f(uploadState.b, UploadDto.UploadStep.Uploaded.b);
    }

    public final Set<RuleAttachment> a() {
        zrp<RuleAttachment> i = RuleAttachment.i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : i) {
            if (c((RuleAttachment) obj)) {
                arrayList.add(obj);
            }
        }
        return j5g.S0(arrayList);
    }

    public final int b(RuleAttachment ruleAttachment) {
        Map<Integer, List<PhotoTag>> map;
        int i = a.$EnumSwitchMapping$0[ruleAttachment.ordinal()];
        PostingState.Editing editing = this.a;
        int i2 = 0;
        switch (i) {
            case 1:
                List<PostingAttachment> list = editing.i.p;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return 0;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if ((((PostingAttachment) it.next()) instanceof VideoDto) && (i2 = i2 + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
                return i2;
            case 3:
                List<PostingAttachment> list2 = editing.i.p;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return 0;
                }
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if ((((PostingAttachment) it2.next()) instanceof PhotoDto) && (i2 = i2 + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
                break;
            case 2:
                return i2;
            case 5:
                if (editing.i.f != null) {
                    return 1;
                }
            case 4:
                return 0;
            case 6:
                MusicAttachDto musicAttachDto = editing.i.l;
                return musicAttachDto instanceof MusicAttachDto.MusicTracksDto ? ((MusicAttachDto.MusicTracksDto) musicAttachDto).b.size() : musicAttachDto instanceof MusicAttachDto.MusicSnippetDto ? 1 : 0;
            case 7:
                return editing.i.l instanceof MusicAttachDto.MusicPlaylistDto ? 1 : 0;
            case 8:
                return editing.i.e != null ? 1 : 0;
            case 9:
                PhotoTagsData photoTagsData = editing.i.r;
                if (photoTagsData == null || (map = photoTagsData.b) == null) {
                    return 0;
                }
                return map.size();
            case 10:
                return editing.i.m != null ? 1 : 0;
            case 12:
                if (!drm0.N(editing.i.c)) {
                    return 1;
                }
            case 11:
                return 0;
            case 13:
                return editing.i.g != null ? 1 : 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean c(RuleAttachment ruleAttachment) {
        int i = a.$EnumSwitchMapping$0[ruleAttachment.ordinal()];
        PostingState.Editing editing = this.a;
        switch (i) {
            case 1:
                List<PostingAttachment> list = editing.i.p;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return false;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((PostingAttachment) it.next()) instanceof VideoDto) {
                        return true;
                    }
                }
                return false;
            case 3:
                List<PostingAttachment> list2 = editing.i.p;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return false;
                }
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((PostingAttachment) it2.next()) instanceof PhotoDto) {
                        return true;
                    }
                }
                break;
            case 2:
                return false;
            case 4:
                return editing.i.h != null;
            case 5:
                return editing.i.f != null;
            case 6:
                MusicAttachDto musicAttachDto = editing.i.l;
                return ((musicAttachDto instanceof MusicAttachDto.MusicTracksDto) && !((MusicAttachDto.MusicTracksDto) musicAttachDto).b.isEmpty()) || (editing.i.l instanceof MusicAttachDto.MusicSnippetDto);
            case 7:
                return editing.i.l instanceof MusicAttachDto.MusicPlaylistDto;
            case 8:
                return editing.i.e != null;
            case 9:
                PhotoTagsData photoTagsData = editing.i.r;
                Map<Integer, List<PhotoTag>> map = photoTagsData != null ? photoTagsData.b : null;
                return (map == null || map.isEmpty()) ? false : true;
            case 10:
                return editing.i.m != null;
            case 11:
                return editing.i.t != null;
            case 12:
                return !drm0.N(editing.i.c);
            case 13:
                return editing.i.g != null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void f(RuleAttachment ruleAttachment, PostingUserMessage postingUserMessage) {
        ActionsAvailabilityState.Attachments a2;
        Parcelable.Creator<ActionsAvailabilityState.Attachments> creator = ActionsAvailabilityState.Attachments.CREATOR;
        ActionsAvailabilityState.AttachmentState attachmentState = new ActionsAvailabilityState.AttachmentState(new ActionsAvailabilityState.Availability.NotAvailable(postingUserMessage), null, 2, null);
        switch (f70.$EnumSwitchMapping$0[ruleAttachment.ordinal()]) {
            case 1:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, attachmentState, null, null, null, null, null, null, null, null, null, null, null, 4094);
                break;
            case 2:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, attachmentState, null, null, null, null, null, null, null, null, null, null, 4093);
                break;
            case 3:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, attachmentState, null, null, null, null, null, null, null, null, null, 4091);
                break;
            case 4:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, attachmentState, null, null, null, null, null, null, null, null, 4087);
                break;
            case 5:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, attachmentState, null, null, null, null, null, null, null, 4079);
                break;
            case 6:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, attachmentState, null, null, null, null, null, null, 4063);
                break;
            case 7:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, null, attachmentState, null, null, null, null, null, 4031);
                break;
            case 8:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, null, null, attachmentState, null, null, null, null, 3967);
                break;
            case 9:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, null, null, null, attachmentState, null, null, null, 3839);
                break;
            case 10:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, null, null, null, null, attachmentState, null, null, 3583);
                break;
            case 11:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, null, null, null, null, null, attachmentState, null, 3071);
                break;
            case 12:
                a2 = ActionsAvailabilityState.Attachments.n;
                break;
            case 13:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, null, null, null, null, null, null, attachmentState, 2047);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.h = this.h.b(a2);
    }

    public final void g(PostingUserMessage postingUserMessage) {
        ActionsAvailabilityState.Availability.NotAvailable notAvailable = new ActionsAvailabilityState.Availability.NotAvailable(postingUserMessage);
        ActionsAvailabilityState actionsAvailabilityState = this.g;
        this.g = ActionsAvailabilityState.a(actionsAvailabilityState, actionsAvailabilityState.b.m5(notAvailable), null, null, null, null, 254);
    }

    public final void h(PostingUserMessage.Snackbar snackbar) {
        ActionsAvailabilityState.Availability.NotAvailable notAvailable = new ActionsAvailabilityState.Availability.NotAvailable(snackbar);
        ActionsAvailabilityState actionsAvailabilityState = this.g;
        this.g = ActionsAvailabilityState.a(actionsAvailabilityState, null, null, actionsAvailabilityState.g.m5(notAvailable), null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
    }

    public final void i(RuleAttachment ruleAttachment, PostingUserMessage.AlertDialog alertDialog) {
        ActionsAvailabilityState.Attachments a2;
        Parcelable.Creator<ActionsAvailabilityState.Attachments> creator = ActionsAvailabilityState.Attachments.CREATOR;
        ActionsAvailabilityState.AttachmentState attachmentState = new ActionsAvailabilityState.AttachmentState(null, new ActionsAvailabilityState.Availability.NotAvailable(alertDialog), 1, null);
        switch (f70.$EnumSwitchMapping$0[ruleAttachment.ordinal()]) {
            case 1:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, attachmentState, null, null, null, null, null, null, null, null, null, null, null, 4094);
                break;
            case 2:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, attachmentState, null, null, null, null, null, null, null, null, null, null, 4093);
                break;
            case 3:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, attachmentState, null, null, null, null, null, null, null, null, null, 4091);
                break;
            case 4:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, attachmentState, null, null, null, null, null, null, null, null, 4087);
                break;
            case 5:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, attachmentState, null, null, null, null, null, null, null, 4079);
                break;
            case 6:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, attachmentState, null, null, null, null, null, null, 4063);
                break;
            case 7:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, null, attachmentState, null, null, null, null, null, 4031);
                break;
            case 8:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, null, null, attachmentState, null, null, null, null, 3967);
                break;
            case 9:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, null, null, null, attachmentState, null, null, null, 3839);
                break;
            case 10:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, null, null, null, null, attachmentState, null, null, 3583);
                break;
            case 11:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, null, null, null, null, null, attachmentState, null, 3071);
                break;
            case 12:
                a2 = ActionsAvailabilityState.Attachments.n;
                break;
            case 13:
                a2 = ActionsAvailabilityState.Attachments.a(ActionsAvailabilityState.Attachments.n, null, null, null, null, null, null, null, null, null, null, null, attachmentState, 2047);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.h = this.h.b(a2);
    }
}
