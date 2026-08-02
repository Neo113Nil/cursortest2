package xsna;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.core.view.components.formitem.VkTextArea;
import com.vk.dto.market.MarketItemType;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.log.L;
import com.vk.profile.community.details.impl.name_history.c;
import com.vkontakte.android.R;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.jd50;
import xsna.jw00;
import xsna.k840;
import xsna.tj50;
import xsna.tls;
import xsna.xxl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr3 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ jr3(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.b) {
            case 0:
                return ((lr3) obj).b;
            case 1:
                File s = com.vk.core.files.a.s();
                if (kd7.m((Bitmap) obj, s)) {
                    return s;
                }
                return null;
            case 2:
                return ((tam0) obj).h.a;
            case 3:
                return ((com.vk.voip.ui.sessionrooms.f) obj).a.getId();
            case 4:
                int i = ChannelFragment.a1;
                int i2 = kwg0.a;
                return s3q0.a;
            case 5:
                return (ClipsDraftPersistentStore.Drafts) ClipsDraftPersistentStore.Drafts.c.a(new JSONObject(((Cursor) obj).getString(0)));
            case 6:
                qgi0.r((tgi0) obj, "AUTHOR_CELL_TEST_TAG");
                return s3q0.a;
            case 7:
                qgi0.r((tgi0) obj, "errorRetryButton");
                return s3q0.a;
            case 8:
                return new c.AbstractC1560c.C1561c((pah) obj);
            case 9:
                ((tdu) obj).Q0(1);
                return s3q0.a;
            case 10:
                L.g("Photos loading error", (Throwable) obj);
                return s3q0.a;
            case 11:
                return new xxl.d(((tj50.a) obj).a(new v7(23), ao8.d));
            case 12:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_folder_dialog_option_add_to_folder);
            case 13:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -2097153, 2097151);
            case 14:
                qgi0.r((tgi0) obj, "drafts_list_toolbar_back");
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((NewsEntry) obj) instanceof DzenNews);
            case 16:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 17:
                ViewGroup viewGroup = (ViewGroup) obj;
                return new cwl(tf3.b(viewGroup, R.layout.vkim_folder_delimiter_vh, viewGroup, false));
            case 18:
                tj50.a aVar = (tj50.a) obj;
                pks pksVar = pks.b;
                ao8 ao8Var = ao8.d;
                return new tls.a(aVar.a(pksVar, ao8Var), aVar.a(qks.b, ao8Var));
            case 19:
                qgi0.r((tgi0) obj, "cover");
                return s3q0.a;
            case 20:
                VkTextArea vkTextArea = new VkTextArea((Context) obj, null, 6);
                vkTextArea.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return vkTextArea;
            case 21:
                Throwable th = (Throwable) obj;
                if (!(th instanceof InterruptedException)) {
                    com.vk.metrics.eventtracking.b.a.a(th);
                }
                return s3q0.a;
            case 22:
                return fl3.J((Cursor) obj);
            case 23:
                return new jw00.a(((Integer) obj).intValue());
            case 24:
                x410 x410Var = (x410) obj;
                if (!x410Var.g && x410Var.p == MarketItemType.VK) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 25:
                return EmptyList.b;
            case 26:
                io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T((Pair) obj);
                return k840.a.i.b() ? fsk.c.b(InAppReviewConditionKey.ADD_MUSIC_ALBUM_WITH_SUBSCRIPTION, jgp.b).d(T) : T;
            case 27:
                nxm0 nxm0Var = new nxm0(R.layout.music_subscription_part_agreement, (ViewGroup) obj);
                nxm0Var.itemView.setOnClickListener(new rg0(nxm0Var, 11));
                return nxm0Var;
            case 28:
                tj50.a aVar2 = (tj50.a) obj;
                i0r i0rVar = new i0r(9);
                ao8 ao8Var2 = ao8.d;
                return new jd50.a(aVar2.a(i0rVar, ao8Var2), aVar2.a(new j5n(16), ao8Var2), aVar2.a(new gz30(2), ao8Var2), aVar2.a(new q8w(7), ao8Var2));
            default:
                return Boolean.valueOf(!yk60.j.get());
        }
    }
}
