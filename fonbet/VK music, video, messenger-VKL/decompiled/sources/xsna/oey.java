package xsna;

import android.database.Cursor;
import android.graphics.Color;
import android.view.ViewGroup;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.money.MoneyTransferLinkFragment;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.api.json.KotlinxSerializationUtilsKt;
import xsna.dz40;
import xsna.go20;
import xsna.goh0;
import xsna.loh0;
import xsna.p1v;
import xsna.rg30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class oey implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ oey(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        s3q0 DefaultJson$lambda$0;
        Object[] objArr;
        String str;
        Image image;
        boolean z = true;
        byte[] bArr = null;
        bArr = null;
        switch (this.b) {
            case 0:
                Cursor cursor = (Cursor) obj;
                try {
                    if (cursor.moveToFirst() && !cursor.isNull(0)) {
                        bArr = cursor.getBlob(0);
                    }
                    return bArr;
                } finally {
                    cursor.close();
                }
            case 1:
                DefaultJson$lambda$0 = KotlinxSerializationUtilsKt.DefaultJson$lambda$0((o8y) obj);
                return DefaultJson$lambda$0;
            case 2:
                float f = ListGroupCallView.o0;
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 3:
                x410 x410Var = (x410) obj;
                return new k7p0(x410Var.d, x410Var.e);
            case 4:
                return (byte[]) obj;
            case 5:
                ((zak0) go20.t).setValue((go20.h) obj);
                return s3q0.a;
            case 6:
                int i = MoneyTransferLinkFragment.u0;
                cvk.u(R.string.qr_saved, false);
                return s3q0.a;
            case 7:
                return new rg30.a(null);
            case 8:
                return "m.".concat((String) obj);
            case 9:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 10:
                ViewGroup viewGroup = (ViewGroup) obj;
                int i2 = uck0.o;
                return new uck0(s3j0.b(viewGroup, R.layout.music_snippet_pack_item_shimmer, viewGroup, false));
            case 11:
                yk60.m.set(true);
                yk60.a(new p1v.c((al60) obj), 1);
                return s3q0.a;
            case 12:
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().a();
                return s3q0.a;
            case 13:
                return new utz(R.layout.vk_view_default_list_loading, (ViewGroup) obj);
            case 14:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 0) {
                    throw new RuntimeException("Delete photos failed");
                }
                return s3q0.a;
            case 15:
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) obj;
                if (vKApiExecutionException.s() == 100) {
                    String message = vKApiExecutionException.getMessage();
                    if (message != null ? drm0.D(message, "end_date should be greater than", false) : false) {
                        objArr = true;
                        if (objArr == true) {
                            z = false;
                        } else {
                            enj.q(R.string.poll_limit_error, 0, vx2.d.getContext());
                        }
                        return Boolean.valueOf(z);
                    }
                }
                objArr = false;
                if (objArr == true) {
                }
                return Boolean.valueOf(z);
            case 16:
                return new k2r0().a((UsersUserFullDto) obj);
            case 17:
                return ((PostingState.Editing) obj).i.h;
            case 18:
                qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                qgi0.r((tgi0) obj, "toolbar_back_tag");
                return s3q0.a;
            case 19:
                qgi0.r((tgi0) obj, "product_card_top_bar_back");
                return s3q0.a;
            case 20:
                qgi0.r((tgi0) obj, "SmartCropTestTags.MODAL_PROGRESS_TITLE");
                return s3q0.a;
            case 21:
                f4m.t(com.vk.qrcode.d.j, ((dw20) obj).Jn());
                return s3q0.a;
            case 22:
                dy40 dy40Var = ((sy40) obj).e;
                return new dz40.c(dy40Var.a, dy40Var.b, false);
            case 23:
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i3 = l5g.l;
                fh9 fh9Var = i2h0.a;
                Boolean bool = Boolean.FALSE;
                epx.f(obj2, bool);
                long j = (obj2 != null ? epx.f(obj2, Boolean.FALSE) ? new l5g(l5g.k) : new l5g(f870.c(((Integer) obj2).intValue())) : null).a;
                Object obj3 = list.get(1);
                j2h0 j2h0Var = i2h0.z;
                epx.f(obj3, bool);
                long j2 = (obj3 != null ? (ov70) j2h0Var.c.invoke(obj3) : null).a;
                Object obj4 = list.get(2);
                return new v4j0(j, j2, (obj4 != null ? (Float) obj4 : null).floatValue());
            case 24:
                ExtendedCommunityProfile extendedCommunityProfile = ((goh0.a) obj).b;
                Photo photo = extendedCommunityProfile.A;
                if (photo == null || (image = photo.y) == null) {
                    str = null;
                } else {
                    Serializer.c<Owner> cVar = Owner.CREATOR;
                    str = Owner.a.a(iah0.f().widthPixels, image);
                }
                String str2 = extendedCommunityProfile.n;
                Integer valueOf = str2 != null ? Integer.valueOf(Color.parseColor(str2)) : null;
                if (str != null) {
                    return new loh0.c.b(str);
                }
                if (valueOf != null) {
                    return new loh0.c.a(valueOf.intValue());
                }
                return null;
            case 25:
                return ((JSONObject) obj).getJSONObject("response");
            case 26:
                ((Boolean) obj).booleanValue();
                int i4 = dbi0.r1;
                return s3q0.a;
            case 27:
                qgi0.r((tgi0) obj, "storefront_top_bar_bookmarks_icon");
                return s3q0.a;
            case 28:
                id3 id3Var = (id3) obj;
                hd3.a(id3Var, btm0.c);
                hd3.b(id3Var, "⚠️");
                return s3q0.a;
            default:
                return PlaylistScreenState.a((PlaylistScreenState) obj, null, null, true, false, null, null, null, 1983);
        }
    }

    public /* synthetic */ oey(eoh0 eoh0Var) {
        this.b = 24;
    }
}
