package xsna;

import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.qn60;

/* compiled from: StatusChangedEditorAction.kt */
/* loaded from: classes4.dex */
public final class fzk0 implements qn60.b {
    public final UserId a;
    public final int b;
    public final pn60 c;

    /* compiled from: StatusChangedEditorAction.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Object, Boolean> {
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (xsna.epx.f(r8 != null ? r8.k.I0() : null, r1) != false) goto L38;
         */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(Object obj) {
            fzk0 fzk0Var = (fzk0) this.receiver;
            UserId userId = fzk0Var.a;
            boolean z = true;
            if (!(obj instanceof Post)) {
                if (obj instanceof Videos) {
                    z = epx.f(sni.l((NewsEntry) obj), userId);
                } else {
                    boolean z2 = false;
                    if (obj instanceof ShitAttachment) {
                        ShitAttachment shitAttachment = (ShitAttachment) obj;
                        if (shitAttachment.Gb()) {
                            VideoAttachment videoAttachment = shitAttachment.I;
                        }
                        z = z2;
                    } else {
                        if (obj instanceof GroupsSuggestions) {
                            Iterator<GroupSuggestion> it = ((GroupsSuggestions) obj).l.iterator();
                            while (it.hasNext()) {
                                Group group = it.next().b;
                                if (epx.f(group.c, fkq0.e(userId)) && group.C != fzk0Var.b) {
                                    break;
                                }
                            }
                        } else if (obj instanceof Digest) {
                            Iterator<DigestItem> it2 = ((Digest) obj).m.iterator();
                            while (it2.hasNext()) {
                                if (epx.f(it2.next().g.m, userId)) {
                                    z2 = true;
                                }
                            }
                        }
                        z = z2;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public fzk0(UserId userId, int i, pn60 pn60Var) {
        this.a = userId;
        this.b = i;
        this.c = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        aVar.m(new a(1, this, fzk0.class, "shouldInvalidate", "shouldInvalidate(Ljava/lang/Object;)Z", 0), new v95(this, 15));
    }
}
