package xsna;

import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickerItem;
import com.vk.log.L;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingAuthorLoadException;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.permission.PermissionHelper;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.voip.ui.VoipStatManager;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.adt0;
import xsna.bjw0;
import xsna.gcw;
import xsna.ija0;
import xsna.tj50;
import xsna.xcc0;
import xsna.z0o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wx30 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ wx30(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        r2 = false;
        boolean z = false;
        switch (this.b) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    arrayList.add((gcw) obj2);
                }
                return new gcw.g(arrayList);
            case 1:
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    Iterator<T> it = Sb.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((UIBlock) it.next()).Cb().i()) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                adt0.a aVar = (adt0.a) obj;
                aVar.a = null;
                aVar.c = null;
                return aVar.a();
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                L.p("OKVoipAudioManager", zhy0.a("silentRinging: shouldPlay=", booleanValue));
                if (booleanValue) {
                    com.vk.voip.ui.a.a.getClass();
                    z99 d = com.vk.voip.ui.a.d();
                    z99.a(d, d.b.a(), null, 10);
                }
                return s3q0.a;
            case 4:
                PermissionHelper.a.getClass();
                return Boolean.valueOf(rl3.G(PermissionHelper.h, (String) obj));
            case 5:
                return ija0.a.C3056a.a;
            case 6:
                qgi0.r((tgi0) obj, "error_button");
                return s3q0.a;
            case 7:
                Throwable th = (Throwable) obj;
                return io.reactivex.rxjava3.core.x.i(th instanceof PostingAuthorLoadException ? (PostingAuthorLoadException) th : new PostingAuthorLoadException(sv1.u(th) ? xcc0.a.a : new xcc0.c(th), th));
            case 8:
                return Boolean.valueOf(((PostingState.Loading) obj).j);
            case 9:
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                qgi0.r((tgi0) obj, "toolbar_back_tag");
                return s3q0.a;
            case 10:
                return new ydp(((Integer) obj).intValue());
            case 11:
                return s3q0.a;
            case 12:
                return Integer.valueOf(((StickerItem) obj).b);
            case 13:
                int i = StickersDrawingViewGroup.j0;
                ((grt0) obj).r();
                return s3q0.a;
            case 14:
                qgi0.r((tgi0) obj, "storefront_top_bar_settings_icon");
                return s3q0.a;
            case 15:
                return z0o0.c.a;
            case 16:
                throw null;
            case 17:
                return s3q0.a;
            case 18:
                return b1s0.a((VideoVideoAlbumFullDto) obj);
            case 19:
                cvk.u(h03.a((Throwable) obj) ? R.string.video_common_network_error : R.string.err_internal, false);
                return s3q0.a;
            case 20:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 21:
                return Integer.valueOf(((Serializer) obj).u());
            case 22:
                L.i((Throwable) obj);
                return s3q0.a;
            case 23:
                return new bjw0.b(((tj50.a) obj).a(new fyi0(14), ao8.d));
            default:
                if (VoipStatManager.c) {
                    VoipStatManager.b.a(VoipStatManager.a.h.a);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ wx30(Object obj, int i) {
        this.b = i;
    }
}
