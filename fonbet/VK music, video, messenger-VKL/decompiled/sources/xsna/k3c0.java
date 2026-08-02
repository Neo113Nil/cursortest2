package xsna;

import android.net.Uri;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.author.PostingAuthor;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingAuthorLoadException;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import xsna.ejm0;
import xsna.xcc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3c0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k3c0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) ((ain0) obj).get();
                if (recyclerView != null) {
                    hl60 hl60Var = hl60.a;
                    hl60.j(m3c0.a, recyclerView, null, null, 28);
                }
                return s3q0.a;
            case 1:
                b25 b25Var = ((com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.b) obj).a;
                UserId c = b25Var.c();
                if (epx.f(c, UserId.d)) {
                    c = null;
                }
                if (c == null) {
                    throw new PostingAuthorLoadException(xcc0.b.a, null);
                }
                cn o = b25Var.o();
                UserProfile b = o.b();
                UserId userId = b.c;
                String str = b.d + ' ' + b.f;
                String str2 = o.c;
                if (str2 == null) {
                    str2 = "";
                }
                return new PostingAuthor.User(userId, str, str2, bwd0.j(b));
            case 2:
                com.vk.upload.impl.b<?> bVar = (com.vk.upload.impl.b) obj;
                try {
                    azl0.e0(bVar);
                    return bVar;
                } catch (InterruptedException e) {
                    L.E(e, new Object[0]);
                    throw e;
                } catch (RuntimeException e2) {
                    if (e2.getCause() instanceof InterruptedException) {
                        L.E(e2, new Object[0]);
                        throw new InterruptedException(e2.getMessage());
                    }
                    bVar.h.g(bVar, e2);
                    throw e2;
                } catch (ClosedByInterruptException e3) {
                    L.E(e3, new Object[0]);
                    throw new InterruptedException(e3.getMessage());
                } catch (Exception e4) {
                    bVar.h.g(bVar, e4);
                    throw e4;
                }
            case 3:
                return Base64.encodeToString(new JSONObject(((ejm0.a) obj).a.e).toString().getBytes(emb.b), 0);
            default:
                return Uri.parse((String) obj);
        }
    }

    public /* synthetic */ k3c0(azl0 azl0Var, com.vk.upload.impl.b bVar) {
        this.b = 2;
        this.c = bVar;
    }
}
