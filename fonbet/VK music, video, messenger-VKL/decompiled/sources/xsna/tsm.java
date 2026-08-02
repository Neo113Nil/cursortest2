package xsna;

import android.content.Context;
import com.vk.dto.common.Peer;
import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: DialogsListInfoBarGetCmd.kt */
/* loaded from: classes2.dex */
public final class tsm extends le6<it80<InfoBar>> {
    public static final LinkedHashSet b = new LinkedHashSet();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r1.i().S != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InfoBar f(w2w w2wVar) {
        if (w2wVar.getConfig().l().H0()) {
            avz.f(w2wVar, "dialogs_list_info_bar_sync_contacts_disabled");
            return null;
        }
        if (avz.a(w2wVar, "dialogs_list_info_bar_sync_contacts_disabled")) {
            b25 a = o25.a();
            Peer a2 = mq9.a(w2wVar);
            com.vk.im.engine.models.c experiments = w2wVar.getExperiments();
            a2.getClass();
            if (!a2.Ab(Peer.Type.GROUP)) {
                if (o25.b(a)) {
                    experiments.getClass();
                }
                Context context = w2wVar.getContext();
                String string = context.getString(R.string.im_engine_info_bar_sync_contacts_redesign_title);
                String string2 = context.getString(R.string.im_engine_info_bar_sync_contacts_redesign_desc);
                InfoBar.ButtonType buttonType = InfoBar.ButtonType.SYNC_CONTACTS;
                return new InfoBar("dialogs_list_info_bar_sync_contacts_disabled", string, string2, "res:/2131237394", "res:/2131238153", null, null, false, Collections.singletonList(new InfoBar.Button(context.getString(R.string.im_engine_info_bar_sync_contacts_redesign_btn), InfoBar.ButtonLayout.PRIMARY, buttonType, null, null, null, false, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED, null)), true, null, null, null, 7392, null);
            }
        }
        return null;
    }

    public static InfoBar g(InfoBar infoBar) {
        if (infoBar != null && epx.f(infoBar.b, "max_ad")) {
            a1w a1wVar = q1w.a;
            if (a1wVar == null) {
                a1wVar = null;
            }
            if (a1wVar.r().h.b().a) {
                return infoBar;
            }
        }
        return null;
    }

    public static InfoBar h(w2w w2wVar) {
        if (o25.b(o25.a())) {
            mbw.a.getClass();
            if (mbw.c().getBoolean("is_ejd_banner_enabled", false) && avz.a(w2wVar, "dialogs_list_info_bar_connect_edu_chats")) {
                w2wVar.getExperiments().getClass();
                String string = w2wVar.getContext().getString(R.string.im_engine_info_bar_connect_edu_chats_title);
                String string2 = w2wVar.getContext().getString(R.string.im_engine_info_bar_connect_edu_chats_desc);
                int dimensionPixelSize = w2wVar.getContext().getResources().getDimensionPixelSize(R.dimen.vk_enable_only_messenger_notifications_banner_icon_size);
                InfoBar.ButtonType buttonType = InfoBar.ButtonType.OPEN_CONNECT_EDU_CHATS;
                return new InfoBar("dialogs_list_info_bar_connect_edu_chats", string, string2, "res:/2131238557", null, Integer.valueOf(dimensionPixelSize), null, true, Collections.singletonList(new InfoBar.Button(w2wVar.getContext().getString(R.string.im_engine_info_bar_connect_edu_chats_btn), InfoBar.ButtonLayout.PRIMARY, buttonType, null, null, null, false, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED, null)), true, null, null, null, 7184, null);
            }
        }
        return null;
    }

    public static InfoBar i(w2w w2wVar) {
        p9w p9wVar = w2wVar.getConfig().f;
        ImMsgPushSettingsProvider.Type type = ImMsgPushSettingsProvider.Type.PRIVATE_MESSAGES;
        boolean f = p9wVar.f(type);
        w2wVar.getConfig().getClass();
        boolean z = p9wVar.c.f() && !(p9wVar.h(type) && p9wVar.g(type));
        if (f || z) {
            avz.f(w2wVar, "dialogs_list_info_bar_msg_push_disabled");
            return null;
        }
        if (!avz.a(w2wVar, "dialogs_list_info_bar_msg_push_disabled")) {
            return null;
        }
        return new InfoBar("dialogs_list_info_bar_msg_push_disabled", w2wVar.getContext().getString(R.string.im_engine_info_bar_msg_push_disabled_redesign_title), w2wVar.getContext().getString(R.string.im_engine_info_bar_msg_push_disabled_redesign_desc), "res:/2131237391", "res:/2131237530", null, null, false, Collections.singletonList(new InfoBar.Button(w2wVar.getContext().getString(R.string.im_engine_info_bar_msg_push_disabled_redesign_btn), InfoBar.ButtonLayout.PRIMARY, InfoBar.ButtonType.OPEN_MSG_PUSH_SETTINGS, null, null, null, false, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED, null)), true, null, null, null, 7392, null);
    }

    public static InfoBar j(w2w w2wVar) {
        Integer num;
        InfoBar infoBar = (InfoBar) w2wVar.I0().c(new x8m(1));
        if (infoBar == null || (num = infoBar.n) == null) {
            return infoBar;
        }
        if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > num.intValue()) {
            return null;
        }
        return infoBar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0077, code lost:
    
        if (r5 != null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0059  */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final it80<InfoBar> e(w2w w2wVar) {
        InfoBar f;
        String str;
        Boolean valueOf;
        String str2;
        InfoBar j = j(w2wVar);
        if (j == null || !epx.f(j.b, "feature_disabled_banner")) {
            if (k9q0.p(w2wVar)) {
                j = null;
            } else if (w2wVar.getExperiments().f()) {
                if (j == null || (str = j.b) == null) {
                    f = f(w2wVar);
                } else {
                    if (str.equals("gifts_birthdays")) {
                        InfoBar.Payload payload = j.m;
                        InfoBar.Payload.GiftsBirthdays giftsBirthdays = payload instanceof InfoBar.Payload.GiftsBirthdays ? (InfoBar.Payload.GiftsBirthdays) payload : null;
                        if (giftsBirthdays != null) {
                            valueOf = Boolean.valueOf(giftsBirthdays.d);
                            if (!epx.f(valueOf, Boolean.TRUE)) {
                                if (!((Boolean) w2wVar.L0(this, new lo())).booleanValue()) {
                                    Long h = w2wVar.V0().a().h("dialogs_list_sync_contacts_info_bar_views_cnt");
                                    if ((h != null ? h.longValue() : 0L) >= 6) {
                                    }
                                } else if (!str.equals("memories")) {
                                    f = f(w2wVar);
                                }
                            }
                            f = j;
                        }
                    }
                    valueOf = null;
                    if (!epx.f(valueOf, Boolean.TRUE)) {
                    }
                    f = j;
                }
                if (f == null) {
                    j = g(j);
                    if (j == null) {
                        j = j(w2wVar);
                        if (j == null || epx.f(j.b, "max_ad")) {
                            j = null;
                        }
                        if (j == null && (j = h(w2wVar)) == null) {
                            j = i(w2wVar);
                        }
                    }
                } else {
                    j = f;
                }
            } else {
                j = g(j);
                if (j == null) {
                    j = j(w2wVar);
                    if (j == null || epx.f(j.b, "max_ad")) {
                        j = null;
                    }
                    if (j == null && (j = h(w2wVar)) == null && (j = i(w2wVar)) == null) {
                        j = f(w2wVar);
                    }
                }
            }
        }
        if (w2wVar.getExperiments().f() && j != null && (str2 = j.b) != null) {
            UserCredentials W0 = w2wVar.W0();
            String concat = str2.concat(String.valueOf(W0 != null ? Long.valueOf(W0.g()) : null));
            LinkedHashSet linkedHashSet = b;
            if (!linkedHashSet.contains(concat)) {
                Long h2 = w2wVar.V0().a().h(str2.equals("dialogs_list_info_bar_sync_contacts_disabled") ? "dialogs_list_sync_contacts_info_bar_views_cnt" : "");
                w2wVar.V0().a().j(str2.equals("dialogs_list_info_bar_sync_contacts_disabled") ? "dialogs_list_sync_contacts_info_bar_views_cnt" : "", (h2 != null ? h2.longValue() : 0L) + 1);
                linkedHashSet.add(concat);
            }
        }
        it80.b.getClass();
        return new it80<>(j);
    }

    public final boolean equals(Object obj) {
        return obj instanceof tsm;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogsListInfoBarGetCmd";
    }
}
