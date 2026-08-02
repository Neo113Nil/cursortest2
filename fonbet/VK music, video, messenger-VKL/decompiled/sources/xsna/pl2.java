package xsna;

import android.content.Context;
import android.util.Log;
import com.vk.clips.favorites.impl.ui.folders.list.e;
import com.vk.clips.playlists.playlist_ui.model.PlaylistHeaderIconState;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.newsfeed.common.util.NewsfeedViewPostCache;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.search.params.api.City;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.d;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import xsna.ea9;
import xsna.fwo;
import xsna.gfc;
import xsna.q2j;
import xsna.sl2;
import xsna.tj50;
import xsna.tre;
import xsna.vre;
import xsna.x0r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class pl2 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ pl2(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r7.Cb().f != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (com.vk.newsfeed.common.util.NewsfeedViewPostCache.a(r1.Ab()) == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        switch (this.b) {
            case 0:
                Log.e(sl2.s, "Failed to warmup cache", (Throwable) obj);
                sl2.q.set(sl2.b.IDLE);
                return s3q0.a;
            case 1:
                return o25.a().c();
            case 2:
                ((vgg) obj).c();
                return s3q0.a;
            case 3:
                L.f("DebugMenuFeature", "call state error", (Throwable) obj);
                return s3q0.a;
            case 4:
                L.e("CallPrimaryActions", "Error on state processing: " + ((Throwable) obj) + ", current thread is " + Thread.currentThread().getName());
                return s3q0.a;
            case 5:
                if (((dhw0) ((it80) obj).a) == null) {
                    return ea9.a.b.a;
                }
                com.vk.voip.ui.c.b.getClass();
                return new ea9.a.C2789a(com.vk.voip.ui.c.T0.b);
            case 6:
                VkCellButton vkCellButton = new VkCellButton((Context) obj, null, 6);
                vkCellButton.setOnClickListener(new o44(0));
                return vkCellButton;
            case 7:
                return s3q0.a;
            case 8:
                return s3q0.a;
            case 9:
                return gfc.c.a;
            case 10:
                qdd.d.compareAndSet(true, false);
                return s3q0.a;
            case 11:
                return e.c.a;
            case 12:
                vre.b bVar = (vre.b) obj;
                return bVar.r instanceof tre.a ? PlaylistHeaderIconState.None : bVar.p ? PlaylistHeaderIconState.More : PlaylistHeaderIconState.Share;
            case 13:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 14:
                return Float.valueOf(((Float) obj).floatValue() * 100);
            case 15:
                return Boolean.valueOf(((cbg) obj).c == 441);
            case 16:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 17:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((CommunityProfileState) obj).g);
            case 19:
                return Boolean.FALSE;
            case 20:
                return s3q0.a;
            case 21:
                ((uzh0) obj).c();
                return s3q0.a;
            case 22:
                q2j.c cVar = (q2j.c) obj;
                int i2 = cVar.c;
                if (1 <= i2 && i2 < 51 && (!cVar.f || (1 <= (i = cVar.g) && i < 1000))) {
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 23:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_voip_call_audio, (Context) obj);
            case 24:
                bma0 bma0Var = (bma0) obj;
                return new zla0(bma0Var.a, bma0Var.b);
            case 25:
                qgi0.r((tgi0) obj, "PrivacySettingsForDonutLevelsSelectedLevel");
                return s3q0.a;
            case 26:
                tj50.a aVar = (tj50.a) obj;
                awo awoVar = awo.b;
                ao8 ao8Var = ao8.d;
                return new fwo.b(aVar.a(awoVar, ao8Var), aVar.a(bwo.b, ao8Var), aVar.a(cwo.b, ao8Var), aVar.a(dwo.b, ao8Var));
            case 27:
                City city = ((EducationState) obj).d;
                return new d.a(city != null ? city.c : null, true);
            case 28:
                return Boolean.valueOf(((x0r.a) obj) != x0r.a.Loading);
            default:
                NewsEntry newsEntry = (NewsEntry) obj;
                boolean z = newsEntry instanceof Post;
                if (z) {
                    Post post = (Post) newsEntry;
                    if (!post.L.e) {
                        NewsfeedViewPostCache.SetWrapper setWrapper = NewsfeedViewPostCache.a;
                        break;
                    }
                    r2 = true;
                    return Boolean.valueOf(r2);
                }
                if (!z) {
                    break;
                }
                return Boolean.valueOf(r2);
        }
    }
}
