package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: BookingEditMultiLineInput.kt */
/* loaded from: classes18.dex */
public final class fp7 {
    public int a;
    public boolean b;
    public boolean c;

    public io.reactivex.rxjava3.internal.operators.observable.j1 a(fsx0 fsx0Var) {
        List<EntryAttachment> N7;
        if (!this.b && this.c && (N7 = fsx0Var.N7()) != null && (fsx0Var instanceof Photos)) {
            Photos photos = (Photos) fsx0Var;
            if (photos.r > N7.size()) {
                ArrayList<EntryAttachment> arrayList = ((Photos) fsx0Var).q;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<EntryAttachment> it = arrayList.iterator();
                while (it.hasNext()) {
                    Attachment attachment = it.next().b;
                    if (attachment instanceof PhotoAttachment) {
                        arrayList2.add(attachment);
                    }
                }
                int i = this.a;
                dx4 dx4Var = new dx4("photos.get", Photo.R);
                dx4Var.C(photos.p, "feed");
                dx4Var.K("feed_type", photos.Db());
                Owner owner = photos.o;
                if (owner != null) {
                    dx4Var.F(owner.b, "owner_id");
                }
                dx4Var.C(1, "extended");
                dx4Var.C(1, "photo_sizes");
                dx4Var.C(i, SignalingProtocol.KEY_OFFSET);
                dx4Var.C(30, SignalingProtocol.KEY_LIMIT);
                this.b = true;
                return new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.y0(dx4Var, null, null, 3), new qw40(new pf40(this, 2), 4), io.reactivex.rxjava3.internal.functions.a.c).G(new g57(this, 7)).U(new ie40(new h57(19, this, arrayList2), 2));
            }
        }
        return null;
    }
}
