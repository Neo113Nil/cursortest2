package xsna;

import android.util.SparseIntArray;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: EntryAttachmentUtils.kt */
/* loaded from: classes4.dex */
public final class lrp {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(18);
        a = sparseIntArray;
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
        sparseIntArray.put(17, R.plurals.num_attach_geo_short);
        sparseIntArray.put(19, R.plurals.num_attach_stereo_room_short);
    }

    public static boolean a(List list) {
        int size = list.size();
        int Ab = ((EntryAttachment) list.get(0)).b.Ab();
        if (Ab != -1) {
            for (int i = 1; i < size; i++) {
                if (Ab == ((EntryAttachment) list.get(i)).b.Ab()) {
                }
            }
            return true;
        }
        return false;
    }
}
