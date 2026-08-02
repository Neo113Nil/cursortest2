package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.posting.dto.PostingOrd;
import com.vk.newsfeed.api.posting.dto.PostingPrimaryMode;
import com.vk.sharing.api.dto.Target;
import com.vkontakte.android.attachments.GeoAttachment;
import java.util.Date;
import java.util.List;

/* compiled from: PostingRequestParams.kt */
/* loaded from: classes3.dex */
public final class flc0 {
    public String A;
    public PostingOrd B;
    public kfk C;
    public String a;
    public List<? extends Attachment> b;
    public Target c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public Date i;
    public GeoAttachment j;
    public int k;
    public boolean l;
    public boolean m;
    public aac0 n;
    public UserId o;
    public NewsEntry p;
    public boolean q;
    public Group r;
    public String s;
    public String t;
    public Integer u;
    public boolean v;
    public boolean w;
    public PostingPrimaryMode x;
    public boolean y;
    public String z;

    public flc0() {
        throw null;
    }

    public final UserId a() {
        Target target = this.c;
        UserId userId = this.o;
        if (userId == null) {
            userId = UserId.d;
        }
        return (fkq0.c(userId) || target == null) ? userId : target.k ? target.c : fkq0.e(target.c);
    }
}
