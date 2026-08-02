package xsna;

import android.content.Context;
import android.graphics.Rect;
import com.vk.api.generated.account.dto.AccountGetPhoneResponseDto;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.clips.design.view.filter.FiltersView;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.newsfeed.Owner;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.log.L;
import com.vk.music.playlist.display.data.LoadPlaylistStateValue;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.e9k0;
import xsna.gfp0;
import xsna.k840;
import xsna.l1j;
import xsna.m1j;
import xsna.oap;
import xsna.prp;
import xsna.rzn;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g53 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ g53(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 0;
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                h03.b(th);
                L.i(th);
                return s3q0.a;
            case 1:
                return AttachedClipsState.a((AttachedClipsState) obj, null, null, null, null, null, false, false, false, false, e9k0.c.a, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 2:
                return k840.a.c().b((AudioBook) obj);
            case 3:
                float f = CameraUIView.w1;
                ((etv0) obj).b(false);
                return s3q0.a;
            case 4:
                Serializer.c<CatalogExtendedData> cVar = CatalogExtendedData.CREATOR;
                return ((Owner) obj).b;
            case 5:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (jnj.b(((Playlist) obj2).O)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 6:
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, null, null, null, false, 7);
            case 7:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 8:
                return s3q0.a;
            case 9:
                return fnd.b((ClipsCoauthorsSelectorMviState.a) obj);
            case 10:
                return ((fzg) obj).q;
            case 11:
                l1j.f.b bVar = ((l1j.f) obj).h;
                if (bVar instanceof l1j.f.b.C3226b) {
                    l1j.f.b.C3226b c3226b = (l1j.f.b.C3226b) bVar;
                    return new m1j.e.b.C3318b(c3226b.a, c3226b.b);
                }
                if (!(bVar instanceof l1j.f.b.c)) {
                    return m1j.e.b.a.a;
                }
                l1j.f.b.c cVar2 = (l1j.f.b.c) bVar;
                return new m1j.e.b.c(cVar2.a, cVar2.b);
            case 12:
                return Boolean.valueOf(((nlq0) obj).m != null);
            case 13:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 14:
                c9k c9kVar = (c9k) obj;
                String str = c9kVar.j;
                y9k i2 = x8k.i(c9kVar.k);
                Integer num = c9kVar.l;
                return new x9k(str, (num == null || num.intValue() <= 0) ? 5000 : num.intValue(), i2);
            case 15:
                return String.valueOf(((MsgRequestStatus) obj).j());
            case 16:
                return Boolean.valueOf(((yfn) obj).b == LoadPlaylistStateValue.REFRESHING);
            case 17:
                rzn rznVar = new rzn((Context) obj);
                rznVar.setRightContent(new rzn.a.C3643a("Немного текста"));
                tlo0.Companion.getClass();
                rznVar.setText(new tlo0.h("Тут побольше текста"));
                return rznVar;
            case 18:
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof q380) {
                    synchronized (prp.a) {
                        prp.c.remove(new prp.a(((q380) sxpVar).b, ((q380) sxpVar).c));
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
                return s3q0.a;
            case 19:
                ((Float) obj).floatValue();
                int i3 = FiltersView.x;
                return s3q0.a;
            case 20:
                AccountGetPhoneResponseDto accountGetPhoneResponseDto = (AccountGetPhoneResponseDto) obj;
                String e = accountGetPhoneResponseDto.e();
                if (e == null) {
                    e = "";
                }
                return new ts(e, accountGetPhoneResponseDto.d());
            case 21:
                return new io.reactivex.rxjava3.internal.operators.observable.s0(new lfk(new oap.a((JSONObject) obj), r1 ? 1 : 0)).L(new a0m0(new zzl0(i), i), false);
            case 22:
                a5w a5wVar = (a5w) obj;
                return "(" + a5wVar.t3().b.name() + '_' + a5wVar.t3().a + ' ' + a5wVar.y9().hashCode() + ')';
            case 23:
                return Integer.valueOf(((lqu) obj).a);
            case 24:
                return Boolean.valueOf(((gfp0.b) obj) instanceof gfp0.b.c);
            case 25:
                cvk.u(R.string.saved_to_album, false);
                return s3q0.a;
            case 26:
                return s3q0.a;
            case 27:
                BaseBadgeHolder.a aVar = (BaseBadgeHolder.a) obj;
                if (aVar instanceof BaseBadgeHolder.a.b) {
                    return new Rect(cn70.b(0), cn70.b(0), cn70.b(0), cn70.b(0));
                }
                if (aVar instanceof BaseBadgeHolder.a.C0709a) {
                    return new Rect(cn70.b(0), cn70.b(2), cn70.b(4), cn70.b(2));
                }
                throw new NoWhenBranchMatchedException();
            case 28:
                qgi0.r((tgi0) obj, "musicDynamicGridItemVhVkTileTitle");
                return s3q0.a;
            default:
                int i4 = com.vk.superapp.widget_settings.p004new.a.n1;
                qgi0.r((tgi0) obj, "NewWidgetSettingsHeaderTitle");
                return s3q0.a;
        }
    }

    public /* synthetic */ g53(Object obj, int i) {
        this.b = i;
    }
}
