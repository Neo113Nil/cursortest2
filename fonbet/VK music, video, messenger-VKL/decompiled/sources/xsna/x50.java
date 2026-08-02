package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.dto.music.SuggestMusicNotificationInfo;
import com.vk.im.engine.models.emails.Email;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;
import xsna.dug0;
import xsna.iqt;
import xsna.mj9;
import xsna.ttf;
import xsna.v8v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class x50 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ x50(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        gkx0 gkx0Var;
        gkx0 gkx0Var2;
        gkx0 gkx0Var3;
        gkx0 gkx0Var4;
        boolean z = false;
        switch (this.b) {
            case 0:
                L.j((Throwable) obj, "Offline:ActionSynchronizerInteractorImpl", "Save sync result error.");
                return s3q0.a;
            case 1:
                Throwable th = (Throwable) obj;
                xgx0.a.getClass();
                xgx0.d(th);
                h03.b(th);
                return s3q0.a;
            case 2:
                ej3 ej3Var = (ej3) obj;
                if (ej3Var.e && !ej3Var.c.b.isEmpty()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                Pattern pattern = BoardTopicViewFragment.H0;
                return ((Attachment) obj).toString();
            case 4:
                L.g("Error while processing vmoji state update", (Throwable) obj);
                return s3q0.a;
            case 5:
                return new mj9.a((dug0.c) obj);
            case 6:
                L.i((Throwable) obj);
                return s3q0.a;
            case 7:
                return ((com.vk.im.engine.models.channels.a) obj).a;
            case 8:
                qgi0.r((tgi0) obj, "checkout_form_field_input");
                return s3q0.a;
            case 9:
                return new ttf.j.a(((guf) obj).b);
            case 10:
                return Integer.valueOf(an10.b(sa30.E(((Float) obj).floatValue(), new k9x(-1, 1, 1), new k9x(-50, 50, 1))));
            case 11:
                x8j x8jVar = (x8j) obj;
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new rbj(x8jVar.c, x8jVar.a, SortOrder.BY_NAME, x8jVar.d, true, null, 384);
            case 12:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_dialog_option_open_user_profile);
            case 13:
                return Long.valueOf(((com.vk.im.engine.models.dialogs.b) obj).b);
            case 14:
                return Long.valueOf(((Email) obj).b);
            case 15:
                return s3q0.a;
            case 16:
                return ((JSONObject) obj).getJSONObject("response");
            case 17:
                cvk.u(R.string.friends_catalog_report_sent_error, false);
                return s3q0.a;
            case 18:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 19:
                return Boolean.valueOf(((iqt.a) obj) instanceof iqt.a.C3074a);
            case 20:
                qgi0.r((tgi0) obj, "storefront_url_cell");
                return s3q0.a;
            case 21:
                bzu bzuVar = bzu.b;
                bn40.f("HSNMan", "try to show default notification info");
                bzu.f((SuggestMusicNotificationInfo) bzu.m.getValue());
                return s3q0.a;
            case 22:
                return s3q0.a;
            case 23:
                ((Boolean) obj).getClass();
                return s3q0.a;
            case 24:
                return air.b('\'', "'", (String) obj);
            case 25:
                it80.b.getClass();
                return new it80((ptk) obj);
            case 26:
                return new et00((ViewGroup) obj);
            case 27:
                L.g("MasksWrap", (Throwable) obj);
                return s3q0.a;
            case 28:
                return ((v8v.a) obj).a;
            default:
                List list = (List) obj;
                Msg msg = (Msg) j5g.b0(0, list);
                Msg msg2 = (Msg) j5g.b0(1, list);
                Msg msg3 = (Msg) j5g.b0(2, list);
                gkx0 gkx0Var5 = gkx0.c;
                if (msg != null) {
                    if (msg2 == null || (gkx0Var4 = msg2.p) == null) {
                        gkx0Var4 = gkx0Var5;
                    }
                    msg.t = gkx0Var4;
                }
                if (msg2 != null) {
                    if (msg3 == null || (gkx0Var3 = msg3.p) == null) {
                        gkx0Var3 = gkx0Var5;
                    }
                    msg2.t = gkx0Var3;
                }
                if (msg2 != null) {
                    if (msg == null || (gkx0Var2 = msg.p) == null) {
                        gkx0Var2 = gkx0Var5;
                    }
                    msg2.s = gkx0Var2;
                }
                if (msg3 != null) {
                    if (msg2 != null && (gkx0Var = msg2.p) != null) {
                        gkx0Var5 = gkx0Var;
                    }
                    msg3.s = gkx0Var5;
                }
                return s3q0.a;
        }
    }
}
