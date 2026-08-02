package xsna;

import android.view.ViewGroup;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.nft.Nft;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.log.L;
import com.vk.music.player.analytics.impl.tracker.mediascope.MusicMediaScopeCommand;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.crop_editor.domain.model.LocalImageLink;
import com.vk.newsfeed.posting.crop_editor.domain.model.RemoteImageLink;
import com.vkontakte.android.attachments.NftAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.bhk;
import xsna.f5h0;
import xsna.hpb;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ rf(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Map map = null;
        Object[] objArr = 0;
        int i = 2;
        switch (this.b) {
            case 0:
                MusicMediaScopeCommand.a aVar = MusicMediaScopeCommand.Companion;
                vf.e((Throwable) obj);
                return s3q0.a;
            case 1:
                it80.b.getClass();
                return it80.a.a();
            case 2:
                return s3q0.a;
            case 3:
                List list = (List) obj;
                List list2 = (List) list.get(0);
                List list3 = (List) list.get(1);
                return new sgz(list3, androidx.recyclerview.widget.m.a(new kxm(list2, list3), true));
            case 4:
                Photo photo = (Photo) obj;
                Nft zb = photo.zb();
                return zb != null ? new NftAttachment(zb, map, i, objArr == true ? 1 : 0) : new PhotoAttachment(photo);
            case 5:
                Object[] objArr2 = (Object[]) obj;
                int e = on00.e(objArr2.length);
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj2 : objArr2) {
                    Pair pair = (Pair) obj2;
                    linkedHashMap.put(pair.i(), pair.j());
                }
                return linkedHashMap;
            case 6:
                L.i((Throwable) obj);
                return s3q0.a;
            case 7:
                return s3q0.a;
            case 8:
                L.g("Error on set state to IDLE", (Throwable) obj);
                return s3q0.a;
            case 9:
                return ((CartItem) obj).b();
            case 10:
                ((ojt) obj).l = f5h0.j.a;
                return s3q0.a;
            case 11:
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, null, null, null, true, 7);
            case 12:
                L.i((Throwable) obj);
                return s3q0.a;
            case 13:
                return Boolean.valueOf(((NestedMsg) obj).b == NestedMsg.Type.FWD);
            case 14:
                return wfb.a((wfb) obj, null, 11);
            case 15:
                return ((hpb.c) obj).b;
            case 16:
                return s3q0.a;
            case 17:
                return new zh80((ViewGroup) obj, 0);
            case 18:
                return ((n4c) obj).a;
            case 19:
                return pvo0.i(true, ((SdkClipVideoFile) obj).b0(), true, false);
            case 20:
                ((Integer) obj).getClass();
                return "placeholder";
            case 21:
                int i2 = ClipsWrapperFragment.Q0;
                ((etv0) obj).b(false);
                return s3q0.a;
            case 22:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).h);
            case 23:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 24:
                qgi0.r((tgi0) obj, "priority_block_content_list");
                return s3q0.a;
            case 25:
                return ((ztg) obj).b;
            case 26:
                return new tfu(n34.a(2));
            case 27:
                return Boolean.valueOf(!epx.f((n730) obj, z7x0.a));
            case 28:
                ImageLink imageLink = ((bhk.a) obj).b;
                return Boolean.valueOf(((imageLink instanceof LocalImageLink) || !(imageLink instanceof RemoteImageLink) || ((RemoteImageLink) imageLink).c) ? false : true);
            default:
                return new y8f0((ViewGroup) obj);
        }
    }
}
