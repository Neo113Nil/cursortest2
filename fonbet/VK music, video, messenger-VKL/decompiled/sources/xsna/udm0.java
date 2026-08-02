package xsna;

import android.content.Context;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: StorySharingHelper.kt */
/* loaded from: classes5.dex */
public final class udm0 {
    public static String a(int i, Attachment attachment) {
        if (i == 0) {
            return "attach_link";
        }
        if (i == 1) {
            return "attach_album";
        }
        if (i == 3) {
            return "attach_article";
        }
        if (i == 4) {
            return "attach_artist";
        }
        if (i == 5) {
            return "attach_audio";
        }
        if (i == 8) {
            return "attach_link";
        }
        if (i == 15) {
            return "attach_narrative";
        }
        if (i == 26) {
            return "attach_story";
        }
        if (i == 11) {
            return "attach_link";
        }
        if (i == 12) {
            return "attach_market";
        }
        switch (i) {
            case 18:
                return "attach_photo";
            case 19:
                return "attach_audio_playlist";
            case 20:
                return "attach_podcast";
            case 21:
                return "attach_poll";
            default:
                switch (i) {
                    case 30:
                        return d(attachment) ? "attach_video_live" : "attach_video";
                    case 31:
                    case 32:
                    case 33:
                        return "attach_wall";
                    default:
                        return "attach_link";
                }
        }
    }

    public static String b(int i, Attachment attachment) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        int i2 = R.string.story_sharing_link;
        if (i != 0) {
            if (i == 8) {
                i2 = R.string.story_sharing_document;
            } else if (i == 15) {
                i2 = R.string.attach_narrative;
            } else if (i == 26) {
                i2 = R.string.story_sharing_story;
            } else if (i == 3) {
                i2 = R.string.story_sharing_article;
            } else if (i == 4) {
                i2 = R.string.story_sharing_artist;
            } else if (i == 5) {
                i2 = R.string.story_sharing_audio;
            } else if (i != 11) {
                if (i != 12) {
                    switch (i) {
                        case 18:
                            i2 = R.string.story_sharing_photo;
                            break;
                        case 19:
                            i2 = R.string.story_sharing_playlist;
                            break;
                        case 20:
                            i2 = R.string.story_sharing_podcast;
                            break;
                        case 21:
                            i2 = R.string.story_sharing_poll;
                            break;
                        default:
                            switch (i) {
                                case 30:
                                    if (!d(attachment)) {
                                        i2 = R.string.story_sharing_video;
                                        break;
                                    } else {
                                        i2 = R.string.story_sharing_live;
                                        break;
                                    }
                                case 31:
                                case 32:
                                case 33:
                                    i2 = R.string.story_sharing_wall;
                                    break;
                            }
                    }
                } else {
                    i2 = R.string.story_sharing_market;
                }
            }
        }
        return context.getString(i2);
    }

    public static String c(int i, Attachment attachment, boolean z) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        int i2 = R.string.story_sharing_hint_link;
        if (i != 0) {
            if (i == 8) {
                i2 = R.string.story_sharing_hint_document;
            } else if (i == 15) {
                i2 = R.string.story_sharing_hint_narrative;
            } else if (i == 26) {
                i2 = R.string.story_sharing_hint_story;
            } else if (i == 3) {
                i2 = R.string.story_sharing_hint_article;
            } else if (i == 4) {
                i2 = R.string.story_sharing_hint_artist;
            } else if (i == 5) {
                i2 = R.string.story_sharing_hint_audio;
            } else if (i != 11) {
                if (i != 12) {
                    switch (i) {
                        case 18:
                            i2 = R.string.story_sharing_hint_photo;
                            break;
                        case 19:
                            i2 = R.string.story_sharing_hint_playlist;
                            break;
                        case 20:
                            i2 = R.string.story_sharing_hint_podcast;
                            break;
                        case 21:
                            i2 = R.string.story_sharing_hint_poll;
                            break;
                        default:
                            switch (i) {
                                case 30:
                                    if (!d(attachment)) {
                                        i2 = R.string.story_sharing_hint_video;
                                        break;
                                    } else {
                                        i2 = R.string.story_sharing_hint_live;
                                        break;
                                    }
                                case 31:
                                case 32:
                                case 33:
                                    i2 = R.string.story_sharing_hint_wall;
                                    break;
                            }
                    }
                } else {
                    i2 = R.string.story_sharing_hint_market;
                }
            }
        }
        Context context2 = e43.a;
        return context.getString(i2, (context2 != null ? context2 : null).getString(z ? R.string.story_sharing_hint_to_live : R.string.story_sharing_hint_to_story));
    }

    public static boolean d(Attachment attachment) {
        VideoFile videoFile;
        VideoAttachment videoAttachment = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
        if (videoAttachment == null || (videoFile = videoAttachment.k) == null) {
            return false;
        }
        return videoFile.q0();
    }
}
