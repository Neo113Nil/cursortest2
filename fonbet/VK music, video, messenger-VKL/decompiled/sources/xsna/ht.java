package xsna;

import android.content.Context;
import android.text.TextUtils;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.file_picker.external.ExternalFilePickerFragment;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import xsna.tlo0;
import xsna.wih0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ht implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ht(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "authorClipsTellAboutYourselfBtn");
                return s3q0.a;
            case 1:
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"Offline:ActionSynchronizerInteractorImpl", "Subscribe to sync events."});
                }
                return s3q0.a;
            case 2:
                qgi0.r((tgi0) obj, "storefront_group_albums_title");
                return s3q0.a;
            case 3:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 4:
                int i = com.vk.profile.questions.impl.a.o1;
                qgi0.r((tgi0) obj, "answer_close_button");
                return s3q0.a;
            case 5:
                return ((tam0) obj).h.a;
            case 6:
                L.j((Throwable) obj, "[Blockstore] save error");
                return s3q0.a;
            case 7:
                ay00 ay00Var = (ay00) obj;
                hy00 hy00Var = ay00Var instanceof hy00 ? (hy00) ay00Var : null;
                Long valueOf = hy00Var != null ? Long.valueOf(hy00Var.a) : null;
                UserId userId = hy00Var != null ? hy00Var.b : null;
                Boolean valueOf2 = hy00Var != null ? Boolean.valueOf(hy00Var.c) : null;
                if (valueOf == null || userId == null || valueOf2 == null) {
                    return null;
                }
                return new k08(valueOf.longValue(), userId, valueOf2.booleanValue());
            case 8:
                ((VkCell) obj).setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, "This is a <u>hightlighted</u> title"), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.h("This is a subtitle"), (gzs) null, 0, (TextUtils.TruncateAt) (0 == true ? 1 : 0), (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
                return s3q0.a;
            case 9:
                ClipsEditorMusicInfo clipsEditorMusicInfo = (ClipsEditorMusicInfo) obj;
                return ClipsEditorMusicInfo.zb(clipsEditorMusicInfo, null, null, 0, 0, 0, ((File) ple.a(clipsEditorMusicInfo.c, clipsEditorMusicInfo.b.Ab()).a()).getAbsolutePath(), 0, 2015);
            case 10:
                return s3q0.a;
            case 11:
                wmi0.a.c("clips_feed_items_cache");
                return s3q0.a;
            case 12:
                qgi0.r((tgi0) obj, "PlaylistsNamingInputField");
                return s3q0.a;
            case 13:
                return s3q0.a;
            case 14:
                return s3q0.a;
            case 15:
                qgi0.r((tgi0) obj, "NameHistoryTopBarBack");
                return s3q0.a;
            case 16:
                return k4g0.a((k4g0) obj, false, false, 3967);
            case 17:
                return s3q0.a;
            case 18:
                x8j x8jVar = (x8j) obj;
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new rbj(x8jVar.c, x8jVar.a, SortOrder.BY_NAME, x8jVar.d, false, x8jVar.e, 256);
            case 19:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 20:
                return s3q0.a;
            case 21:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_voip_call_video, (Context) obj);
            case 22:
                return Boolean.valueOf(((p680) obj).c);
            case 23:
                par0 par0Var = par0.a;
                String str = "EXCHANGE_TOKEN_INFO_HELPER: Error in getExchangeTokensInfo: " + ((Throwable) obj).getMessage();
                par0Var.getClass();
                par0.b(str);
                return s3q0.a;
            case 24:
                int i2 = ExternalFilePickerFragment.R;
                return s3q0.a;
            case 25:
                AvatarAnimatedStack avatarAnimatedStack = new AvatarAnimatedStack((Context) obj, null, 6);
                tlo0.Companion.getClass();
                avatarAnimatedStack.setText(new tlo0.h("Нравится Ивану и ещё 5 людям"));
                avatarAnimatedStack.a("https://vk.ru/reaction/3-reactions-0?c_uniq_tag=c0390bed2f5fe4bef86e18a800618094e818e47ec5210c33d15d298e27829c5e", Collections.singletonList("https://sun9-56.userapi.com/s/v1/ig2/cqW3O-sLWt9GB7fe8QspKJrGQGL_xgqZpw3bGkXTBgIxC8TBMVV7oggz7M4Ui7YnnQKiHTHMuamC3cONaMu_POMV.jpg?quality=95&as=32x24,48x36,72x54,108x81,160x120,240x180,360x270,480x360,540x405,640x480,720x540,800x600&from=bu&u=KCYXtnqDaHJ8JdBSHVrMQK4qMANCAxnpn7IXNr7YYYY&cs=800x0"));
                return avatarAnimatedStack;
            case 26:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new wih0.a(k15.B((VideoFile) it.next()), null));
                }
                return arrayList;
            case 27:
                return ((jis) obj).a;
            case 28:
                return ((JSONObject) obj).getJSONObject("response");
            default:
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                return Boolean.valueOf(((xmt) obj).c.e);
        }
    }
}
