package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.tags.dto.TagsGetListResponseDto;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.music.CatalogConcertItem;
import com.vk.channels.api.Channel;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.userstack.VkDiagonalUserStack;
import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.c;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.friends.recommendations.impl.presentation.Item;
import com.vk.music.playlist.display.domain.i;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.dcr;
import xsna.e9k0;
import xsna.g9k;
import xsna.i9b;
import xsna.irp;
import xsna.pqc;
import xsna.tj50;
import xsna.tlo0;
import xsna.zc5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class rd1 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ rd1(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = -1;
        switch (this.b) {
            case 0:
                return AlbumChooseState.a((AlbumChooseState) obj, null, null, 0, false, false, false, 95);
            case 1:
                return AttachedClipsState.a((AttachedClipsState) obj, null, null, null, null, null, false, false, false, false, e9k0.e.a, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 2:
                return zc5.b.a;
            case 3:
                return (lm50) obj;
            case 4:
                Serializer.c<CatalogExtendedData> cVar = CatalogExtendedData.CREATOR;
                return ((CatalogConcertItem) obj).b.b;
            case 5:
                return new i9b.a((Channel) obj, null);
            case 6:
                return s3q0.a;
            case 7:
                pqc.f.onNext(pqc.c.RESTORE);
                return s3q0.a;
            case 8:
                ClipsCoauthorsSelectorMviState.d dVar = (ClipsCoauthorsSelectorMviState.d) obj;
                return new d8p0(dVar.b, fnd.e(dVar.c), false);
            case 9:
                return Integer.valueOf(((fzg) obj).j.size());
            case 10:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 11:
                return Boolean.valueOf(((nlq0) obj).n);
            case 12:
                tj50.a aVar = (tj50.a) obj;
                mo1 mo1Var = new mo1(24);
                ao8 ao8Var = ao8.d;
                return new g9k.b(aVar.a(mo1Var, ao8Var), aVar.a(new qb(20), ao8Var));
            case 13:
                return Boolean.valueOf(((dcr.a) obj).b);
            case 14:
                l8n l8nVar = (l8n) obj;
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                ur60 ur60Var = l8nVar.e;
                String str = l8nVar.i;
                if (str != null && str.length() != 0) {
                    i = odq.a(str, ur60Var.b.a);
                }
                return new g9n(l8nVar.b, ur60Var.b, i, ur60Var.e, ur60Var.f, ur60Var.g);
            case 15:
                return i.a.c.a;
            case 16:
                qgi0.r((tgi0) obj, "dzen_screen_toolbar_subtitle");
                return s3q0.a;
            case 17:
                return Long.valueOf(-((irp.a) obj).e);
            case 18:
                return af10.a((TagsGetListResponseDto) obj);
            case 19:
                nuu0 nuu0Var = new nuu0((Context) obj);
                nuu0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                tlo0.Companion.getClass();
                nuu0Var.setText(new tlo0.h("Ваш комментарий..."));
                return nuu0Var;
            case 20:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 21:
                VkDiagonalUserStack vkDiagonalUserStack = new VkDiagonalUserStack((Context) obj, null, 6);
                vkDiagonalUserStack.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                vkDiagonalUserStack.setSize(VkDiagonalUserStack.Size.ExtraLarge);
                return vkDiagonalUserStack;
            case 22:
                int i2 = FriendsRecommendationsFragment.b0;
                return ((Item) obj).c;
            case 23:
                return ((JSONObject) obj).getJSONObject("response");
            case 24:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.q);
            case 25:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 26:
                qgi0.r((tgi0) obj, "ItemTags.AVATAR");
                return s3q0.a;
            case 27:
                int i3 = kwg0.a;
                return s3q0.a;
            case 28:
                return ((ef00) obj).a;
            default:
                com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.c cVar2 = (com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.c) obj;
                qcy<Object>[] qcyVarArr2 = com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b.n1;
                if (!(cVar2 instanceof c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h03.b(((c.a) cVar2).a);
                return s3q0.a;
        }
    }

    public /* synthetic */ rd1(fnd fndVar) {
        this.b = 8;
    }
}
