package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.feed.design.view.newsfeed.digest.header.FeedDigestHeader;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.ui.components.msg_search.domain.model.a;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h;
import com.vk.voip.ui.VoipViewModelState;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.fve;
import xsna.ij20;
import xsna.j7u;
import xsna.ken;
import xsna.sv00;
import xsna.tj50;
import xsna.ujm;
import xsna.vre;
import xsna.w3s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class z13 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ z13(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0195, code lost:
    
        if (r2 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019c, code lost:
    
        return java.lang.Integer.valueOf(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return null;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = 0;
        switch (this.b) {
            case 0:
                int i2 = AppChannelFragment.l1;
                return ((Group) obj).B;
            case 1:
                return (wd4) obj;
            case 2:
                return Boolean.valueOf(((VoipViewModelState) obj).h());
            case 3:
                return s3q0.a;
            case 4:
                qgi0.r((tgi0) obj, "checkout_form_field_subhead");
                return s3q0.a;
            case 5:
                int i3 = com.vk.clips.favorites.impl.ui.folders.content.recycler.b.s;
                f4m.z(i3, i3, (VKImageView) obj);
                return s3q0.a;
            case 6:
                vre.b bVar = (vre.b) obj;
                Iterator<T> it = bVar.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else {
                        Object next = it.next();
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (epx.f(((VideoFile) next).a1(), bVar.n)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            case 7:
                return Boolean.valueOf(((fve.b) obj).f);
            case 8:
                return Integer.valueOf(an10.b(sa30.E(((Float) obj).floatValue(), new k9x(-1, 1, 1), new k9x(-50, 50, 1))));
            case 9:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                return s3q0.a;
            case 10:
                qgi0.r((tgi0) obj, "test_tag_title");
                return s3q0.a;
            case 11:
                List list = (List) obj;
                return new yjl(((Float) list.get(1)).floatValue(), ((Integer) list.get(0)).intValue(), new enh(list, 6));
            case 12:
                return s3q0.a;
            case 13:
                return ((x960) obj).a();
            case 14:
                return new ken.a.b(((tj50.a) obj).a(new pe1(20), ao8.d));
            case 15:
                return new tfu(n34.a(((ery) obj).a()));
            case 16:
                return Boolean.valueOf(((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h) obj).b instanceof h.a.C1897a);
            case 17:
                return io.reactivex.rxjava3.core.q.T(UserId.d);
            case 18:
                int i4 = FeedDigestHeader.n;
                ((am) obj).u(true);
                return s3q0.a;
            case 19:
                return new ahk0(new View(((ViewGroup) obj).getContext()));
            case 20:
                return w3s.e.a;
            case 21:
                RequestUserProfile requestUserProfile = (RequestUserProfile) obj;
                int i5 = FriendRequestsFragment.d0;
                return requestUserProfile;
            case 22:
                cvk.u(R.string.error, false);
                L.g("Can't handle sticker local result", (Throwable) obj);
                return s3q0.a;
            case 23:
                return new j7u.c(((tj50.a) obj).a(a7u.b, ao8.d));
            case 24:
                int i6 = ujm.n;
                return ujm.a.a((ViewGroup) obj);
            case 25:
                cvk.u(R.string.default_network_error, false);
                return s3q0.a;
            case 26:
                return new sv00.a(((tj50.a) obj).a(pv00.b, ao8.d));
            case 27:
                ((ij20.a) obj).l(true);
                return s3q0.a;
            case 28:
                return Boolean.valueOf(!rl3.y0(new Integer[]{Integer.valueOf(ClipsBottomSheetOptions.EDIT.ordinal()), Integer.valueOf(ClipsBottomSheetOptions.EDIT_PRIVACY_CLIP.ordinal())}).contains(Integer.valueOf(((ckd) obj).a)));
            default:
                return ((a.b.C1154b) obj).a.a;
        }
    }
}
