package xsna;

import android.content.Context;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import com.vk.api.generated.actionLinks.dto.ActionLinksSaveLinksResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentServicesDto;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.comments.core.BoardComment;
import com.vk.ecomm.reviews.impl.communities.yclients.i;
import com.vk.fave.fragments.FavesFragment;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.video.ui.upload.impl.publish.presentation.description.feature.entity.DescriptionState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import xsna.bi40;
import xsna.it80;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qt implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ qt(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        boolean z;
        s3q0 addParticipants$lambda$0;
        int i = 3;
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "authorClipsAvatar");
                return s3q0.a;
            case 1:
                ActionButton.Type type = ((ActionButton) obj).f;
                if (type != ActionButton.Type.Action && type != ActionButton.Type.VkTicket) {
                    r3 = false;
                }
                return Boolean.valueOf(r3);
            case 2:
                List<ActionLinksActionDto> d = ((ActionLinksSaveLinksResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(s20.a((ActionLinksActionDto) it.next()));
                }
                return arrayList;
            case 3:
                qcy<Object>[] qcyVarArr = AnimatedCounterView.w;
                ((AnimatedCounterView) obj).b();
                return s3q0.a;
            case 4:
                Throwable th = (Throwable) obj;
                L.i(th);
                h03.b(th);
                return s3q0.a;
            case 5:
                return new si4(((tj50.a) obj).a(new py(i), ao8.d));
            case 6:
                Pair pair = (Pair) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(((Number) pair.i()).intValue());
                sb.append(':');
                sb.append(((Number) pair.j()).intValue());
                return sb.toString();
            case 7:
                Regex regex = (Regex) zp6.c.getValue();
                uk10 uk10Var = (uk10) j5g.h0(((zk10) obj).a());
                if (uk10Var == null || (str = uk10Var.a) == null) {
                    str = "";
                }
                return rli0.A(new ulp0(Regex.d(regex, str), new py(6)));
            case 8:
                ((vgg) obj).c();
                return s3q0.a;
            case 9:
                return new cbg((BoardComment) obj, (iag) null, 0);
            case 10:
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof t480) {
                    Collection<adm> collection = ((t480) sxpVar).b;
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        Iterator<T> it2 = collection.iterator();
                        while (it2.hasNext()) {
                            if (((adm) it2.next()).a == DialogsCounters.Type.BUSINESS_NOTIFY_UNREAD) {
                                z = true;
                                if (((sxpVar instanceof v480) || ((v480) sxpVar).c != DialogsFilter.BUSINESS_NOTIFY) && !z) {
                                    r3 = false;
                                }
                                return Boolean.valueOf(r3);
                            }
                        }
                    }
                }
                z = false;
                if (sxpVar instanceof v480) {
                }
                r3 = false;
                return Boolean.valueOf(r3);
            case 11:
                return (UsersUserFullDto) j5g.Y((List) obj);
            case 12:
                return Boolean.valueOf(((CatalogBlock) obj).i.b == CatalogViewType.SEPARATOR);
            case 13:
                int i2 = ClipsGridCommonClipsListFragment.q0;
                return ((vee) obj).a;
            case 14:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).d);
            case 15:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 16:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 17:
                GroupsTabContentServicesDto B = ((GroupsGetContentForTabsResponseDto) obj).B();
                List<MarketMarketAlbumDto> d2 = B != null ? B.d() : null;
                return d2 == null ? EmptyList.b : d2;
            case 18:
                rry rryVar = (rry) obj;
                rry.j(rryVar, new py(17), hli.a, 5);
                for (int i3 = 0; i3 < 4; i3++) {
                    rry.j(rryVar, null, hli.b, 7);
                }
                rry.j(rryVar, new ol(16), hli.c, 5);
                for (int i4 = 0; i4 < 20; i4++) {
                    rry.j(rryVar, null, hli.d, 7);
                }
                return s3q0.a;
            case 19:
                return i.d.a;
            case 20:
                return mkj.a((mkj) obj, null, null, null, true, null, false, 0, null, 231);
            case 21:
                addParticipants$lambda$0 = Conversation.addParticipants$lambda$0((AddParticipantsResult) obj);
                return addParticipants$lambda$0;
            case 22:
                it80.a aVar = it80.b;
                Object Z = j5g.Z(((wpp) obj).c.values());
                aVar.getClass();
                return new it80(Z);
            case 23:
                return DescriptionState.a((DescriptionState) obj, null, true, 3);
            case 24:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_groups_receive_msg_disable_and_clear_history);
            case 25:
                return io.reactivex.rxjava3.subjects.d.N0();
            case 26:
                bi40 bi40Var = (bi40) obj;
                if (bi40Var.equals(bi40.a.a)) {
                    return Integer.valueOf(R.string.music_talkback_downloaded_track);
                }
                if (bi40Var.equals(bi40.c.a)) {
                    return Integer.valueOf(R.string.music_talkback_download_track);
                }
                if (bi40Var.equals(bi40.d.a)) {
                    return Integer.valueOf(R.string.music_talkback_pending_downloading_track);
                }
                if (bi40Var instanceof bi40.b) {
                    return Integer.valueOf(R.string.music_talkback_downloading_track);
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                qyg0 V0 = ((hyg0) obj).V0("SELECT `excluded_packs_stickers`.`version` AS `version`, `excluded_packs_stickers`.`packIds` AS `packIds` FROM excluded_packs_stickers");
                try {
                    if (V0.step()) {
                        return new i9l0((int) V0.getLong(0), psj.b(V0.l2(1)));
                    }
                    throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.vk.repository.`internal`.repos.stickers.database.entity.StickersConfigEntity>.");
                } finally {
                    V0.close();
                }
            case 28:
                bn40.c((Throwable) obj, "exception during fade execution");
                return s3q0.a;
            default:
                tgi0 tgi0Var = (tgi0) obj;
                int i5 = FavesFragment.j0;
                qgi0.r(tgi0Var, "fave_toolbar_tags_button_test_tag");
                qgi0.h(tgi0Var, y8g0.e(R.string.fave_tag_icon_title));
                return s3q0.a;
        }
    }
}
