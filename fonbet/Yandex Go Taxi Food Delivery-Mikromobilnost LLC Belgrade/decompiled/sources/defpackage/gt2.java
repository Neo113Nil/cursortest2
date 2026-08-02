package defpackage;

import androidx.room.RoomDatabase;
import com.yandex.go.explorer.impl.data.database.ExplorerDatabase_Impl;
import com.yandex.go.sql.BaseDatabaseHelper;
import com.yandex.messaging.core.db.AppDatabaseRoom_Impl;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.internal.storage.experiments.ExperimentsDatabaseRoom_Impl;
import com.yandex.quark.actionScheduler.internal.exactTime.storage.database.ExactTimeJobDatabase_Impl;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public final class gt2 extends p2l {
    public final /* synthetic */ int d = 3;
    public final /* synthetic */ RoomDatabase e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt2(AppDatabaseRoom_Impl appDatabaseRoom_Impl) {
        super(104, "1095d3a8cabd2158674592de8dda9e23", "0eab8543e4133eacea35999112376984");
        this.e = appDatabaseRoom_Impl;
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }

    private final void r() {
    }

    private final void s() {
    }

    private final void t() {
    }

    private final void u() {
    }

    private final kne0 v(oll0 oll0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sort_order", new p5x0(1, "sort_order", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap.put("internal_chat_id", new p5x0(0, "internal_chat_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap.put("user_id", new p5x0(0, "user_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet p = smw0.p(linkedHashMap, "flags", new p5x0(0, "flags", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new r5x0("members_chat_id", false, rcc.b("internal_chat_id"), rcc.b("ASC")));
        s5x0 s5x0Var = new s5x0("members", linkedHashMap, p, linkedHashSet);
        s5x0 d = gkb1.d(oll0Var, "members");
        if (!s5x0Var.equals(d)) {
            return new kne0(false, smw0.i("members(com.yandex.messaging.core.db.members.MemberEntity).\n Expected:\n", s5x0Var, "\n Found:\n", d));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("chat_internal_id", new p5x0(1, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("chat_id", new p5x0(0, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap2.put("namespace", new p5x0(0, "namespace", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap2.put("url", new p5x0(0, "url", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap2.put("unseen", new p5x0(0, "unseen", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("addressee_id", new p5x0(0, "addressee_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap2.put("average_response_time", new p5x0(0, "average_response_time", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap2.put("first_unseen_row", new p5x0(0, "first_unseen_row", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap2.put("flags", new p5x0(0, "flags", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("rights", new p5x0(0, "rights", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("mute", new p5x0(0, "mute", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("mute_mentions", new p5x0(0, "mute_mentions", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("is_member", new p5x0(0, "is_member", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("is_blocked", new p5x0(0, "is_blocked", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("is_subscriber", new p5x0(0, "is_subscriber", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("participants_count", new p5x0(0, "participants_count", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("can_call", new p5x0(0, "can_call", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("is_admin", new p5x0(0, "is_admin", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("is_phone_required_for_write", new p5x0(0, "is_phone_required_for_write", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("current_profile_id", new p5x0(0, "current_profile_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap2.put("is_transient", new p5x0(0, "is_transient", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("sort_time", new p5x0(0, "sort_time", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("display_name", new p5x0(0, "display_name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap2.put("is_pinned", new p5x0(0, "is_pinned", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("is_hidden", new p5x0(0, "is_hidden", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("min_message_timestamp", new p5x0(0, "min_message_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("last_seq_no", new p5x0(0, "last_seq_no", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("last_message_timestamp", new p5x0(0, "last_message_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap2.put("events", new p5x0(0, "events", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet p2 = smw0.p(linkedHashMap2, "has_guests", new p5x0(0, "has_guests", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new r5x0("index_chats_view_chat_id", true, rcc.b("chat_id"), rcc.b("ASC")));
        linkedHashSet2.add(new r5x0("index_chats_view_namespace", false, rcc.b("namespace"), rcc.b("ASC")));
        linkedHashSet2.add(new r5x0("index_chats_view_addressee_id", true, rcc.b("addressee_id"), rcc.b("ASC")));
        linkedHashSet2.add(new r5x0("index_chats_view_is_hidden", false, rcc.b("is_hidden"), rcc.b("ASC")));
        linkedHashSet2.add(new r5x0("index_chats_view_sort_time", false, rcc.b("sort_time"), rcc.b("DESC")));
        s5x0 s5x0Var2 = new s5x0("chats_view", linkedHashMap2, p2, linkedHashSet2);
        s5x0 d2 = gkb1.d(oll0Var, "chats_view");
        if (!s5x0Var2.equals(d2)) {
            return new kne0(false, smw0.i("chats_view(com.yandex.messaging.core.db.chats.ChatViewEntity).\n Expected:\n", s5x0Var2, "\n Found:\n", d2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("sort_order", new p5x0(1, "sort_order", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap3.put("internal_chat_id", new p5x0(0, "internal_chat_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet p3 = smw0.p(linkedHashMap3, "user_id", new p5x0(0, "user_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new r5x0("admins_chat_id", false, rcc.b("internal_chat_id"), rcc.b("ASC")));
        s5x0 s5x0Var3 = new s5x0("admins", linkedHashMap3, p3, linkedHashSet3);
        s5x0 d3 = gkb1.d(oll0Var, "admins");
        if (!s5x0Var3.equals(d3)) {
            return new kne0(false, smw0.i("admins(com.yandex.messaging.core.db.members.AdminEntity).\n Expected:\n", s5x0Var3, "\n Found:\n", d3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("row_id", new p5x0(1, "row_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap4.put("cache_owner", new p5x0(0, "cache_owner", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap4.put("contacts_last_version", new p5x0(0, "contacts_last_version", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap4.put("last_message_timestamp", new p5x0(0, "last_message_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap4.put("last_thread_message_timestamp", new p5x0(0, "last_thread_message_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap4.put("max_role_version", new p5x0(0, "max_role_version", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap4.put("workspace_version", new p5x0(0, "workspace_version", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        s5x0 s5x0Var4 = new s5x0("revisions", linkedHashMap4, smw0.p(linkedHashMap4, "max_history_version", new p5x0(0, "max_history_version", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d4 = gkb1.d(oll0Var, "revisions");
        if (!s5x0Var4.equals(d4)) {
            return new kne0(false, smw0.i("revisions(com.yandex.messaging.core.db.revisions.RevisionsEntity).\n Expected:\n", s5x0Var4, "\n Found:\n", d4));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("user_id", new p5x0(1, "user_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap5.put("org_id", new p5x0(2, "org_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap5.put("shown_name", new p5x0(0, "shown_name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap5.put("has_private_chat", new p5x0(0, "has_private_chat", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap5.put("has_contact", new p5x0(0, "has_contact", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap5.put("user_search_key", new p5x0(0, "user_search_key", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet p4 = smw0.p(linkedHashMap5, "deleted", new p5x0(0, "deleted", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new r5x0("users_to_talk_shown_name_order", false, rcc.b("shown_name"), rcc.b("ASC")));
        linkedHashSet4.add(new r5x0("index_users_to_talk_org_id", false, rcc.b("org_id"), rcc.b("ASC")));
        s5x0 s5x0Var5 = new s5x0("users_to_talk", linkedHashMap5, p4, linkedHashSet4);
        s5x0 d5 = gkb1.d(oll0Var, "users_to_talk");
        if (!s5x0Var5.equals(d5)) {
            return new kne0(false, smw0.i("users_to_talk(com.yandex.messaging.core.db.userstotalk.UsersToTalkEntity).\n Expected:\n", s5x0Var5, "\n Found:\n", d5));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("row_id", new p5x0(1, "row_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap6.put("chat_internal_id", new p5x0(0, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap6.put("message_history_id", new p5x0(0, "message_history_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap6.put("message_sequence_number", new p5x0(0, "message_sequence_number", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap6.put("message_prev_history_id", new p5x0(0, "message_prev_history_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap6.put("msg_internal_id", new p5x0(0, "msg_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap6.put("flags", new p5x0(0, "flags", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap6.put("message_id", new p5x0(0, "message_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap6.put(RemoteBioParameters.TIME, new p5x0(0, RemoteBioParameters.TIME, "REAL", null, true, 1));
        linkedHashMap6.put("author", new p5x0(0, "author", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap6.put(Constants.KEY_DATA, new p5x0(0, Constants.KEY_DATA, BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap6.put("custom_payload", new p5x0(0, "custom_payload", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap6.put("reply_data", new p5x0(0, "reply_data", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap6.put("edit_time", new p5x0(0, "edit_time", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap6.put("views_count", new p5x0(0, "views_count", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap6.put("forwards_count", new p5x0(0, "forwards_count", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet p5 = smw0.p(linkedHashMap6, "notification_meta", new p5x0(0, "notification_meta", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new r5x0("chat_internal_id_message_id_message_history_id_unique", true, scc.g("chat_internal_id", "message_id", "message_history_id"), scc.g("ASC", "ASC", "ASC")));
        linkedHashSet5.add(new r5x0("index_messages_chat_internal_id_message_history_id", true, scc.g("chat_internal_id", "message_history_id"), scc.g("ASC", "DESC")));
        s5x0 s5x0Var6 = new s5x0("messages", linkedHashMap6, p5, linkedHashSet5);
        s5x0 d6 = gkb1.d(oll0Var, "messages");
        if (!s5x0Var6.equals(d6)) {
            return new kne0(false, smw0.i("messages(com.yandex.messaging.core.db.messages.MessagesEntity).\n Expected:\n", s5x0Var6, "\n Found:\n", d6));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("row_id", new p5x0(1, "row_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap7.put("chat_internal_id", new p5x0(0, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap7.put("chat_id", new p5x0(0, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap7.put("message_history_id", new p5x0(0, "message_history_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap7.put("message_sequence_number", new p5x0(0, "message_sequence_number", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap7.put("message_previous_history_id", new p5x0(0, "message_previous_history_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap7.put("msg_internal_id", new p5x0(0, "msg_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap7.put("message_version", new p5x0(0, "message_version", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap7.put("flags", new p5x0(0, "flags", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap7.put("message_id", new p5x0(0, "message_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put(RemoteBioParameters.TIME, new p5x0(0, RemoteBioParameters.TIME, "REAL", null, true, 1));
        linkedHashMap7.put("author", new p5x0(0, "author", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap7.put(Constants.KEY_DATA, new p5x0(0, Constants.KEY_DATA, BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put("data_type", new p5x0(0, "data_type", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap7.put("custom_payload", new p5x0(0, "custom_payload", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put("reply_data", new p5x0(0, "reply_data", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put("forwarded_author_id", new p5x0(0, "forwarded_author_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put("host_message_history_id", new p5x0(0, "host_message_history_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap7.put("views_count", new p5x0(0, "views_count", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap7.put("original_message_chat_id", new p5x0(0, "original_message_chat_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put("original_message_history_id", new p5x0(0, "original_message_history_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap7.put("fake_guid", new p5x0(0, "fake_guid", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put("forwards_count", new p5x0(0, "forwards_count", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap7.put("notification_meta", new p5x0(0, "notification_meta", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put("original_lang", new p5x0(0, "original_lang", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put("translated_lang", new p5x0(0, "translated_lang", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put("translated_text", new p5x0(0, "translated_text", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put("original_reply_lang", new p5x0(0, "original_reply_lang", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put("translated_reply_text", new p5x0(0, "translated_reply_text", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put("translated_suggests", new p5x0(0, "translated_suggests", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap7.put("forced_translated_text", new p5x0(0, "forced_translated_text", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        LinkedHashSet p6 = smw0.p(linkedHashMap7, "forced_translated_reply_text", new p5x0(0, "forced_translated_reply_text", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new r5x0("index_messages_view_chat_internal_id_message_history_id", true, scc.g("chat_internal_id", "message_history_id"), scc.g("ASC", "DESC")));
        s5x0 s5x0Var7 = new s5x0("messages_view", linkedHashMap7, p6, linkedHashSet6);
        s5x0 d7 = gkb1.d(oll0Var, "messages_view");
        if (!s5x0Var7.equals(d7)) {
            return new kne0(false, smw0.i("messages_view(com.yandex.messaging.core.db.messages.MessagesViewEntity).\n Expected:\n", s5x0Var7, "\n Found:\n", d7));
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("chat_internal_id", new p5x0(1, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap8.put("chat_id", new p5x0(0, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap8.put("create_time", new p5x0(0, "create_time", "REAL", null, true, 1));
        linkedHashMap8.put("addressee_id", new p5x0(0, "addressee_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap8.put("name", new p5x0(0, "name", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap8.put("avatar_id", new p5x0(0, "avatar_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap8.put("seen_marker", new p5x0(0, "seen_marker", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap8.put("owner_last_seen_sequence_number", new p5x0(0, "owner_last_seen_sequence_number", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap8.put("owner_seen_marker_version", new p5x0(0, "owner_seen_marker_version", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap8.put("flags", new p5x0(0, "flags", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap8.put("other_seen_marker", new p5x0(0, "other_seen_marker", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap8.put("version", new p5x0(0, "version", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap8.put("full_info_version", new p5x0(0, "full_info_version", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap8.put("invite_hash", new p5x0(0, "invite_hash", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap8.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, new p5x0(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap8.put("alias", new p5x0(0, "alias", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap8.put("current_profile_id", new p5x0(0, "current_profile_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap8.put("is_transient", new p5x0(0, "is_transient", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap8.put("min_message_timestamp", new p5x0(0, "min_message_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap8.put("parent_internal_id", new p5x0(0, "parent_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap8.put("parent_message_timestamp", new p5x0(0, "parent_message_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap8.put("last_timestamp", new p5x0(0, "last_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap8.put("last_seq_no", new p5x0(0, "last_seq_no", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap8.put("partner_id", new p5x0(0, "partner_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        LinkedHashSet p7 = smw0.p(linkedHashMap8, "has_guests", new p5x0(0, "has_guests", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new r5x0("chat_unique_id", true, rcc.b("chat_id"), rcc.b("ASC")));
        linkedHashSet7.add(new r5x0("index_chats_addressee_id", true, rcc.b("addressee_id"), rcc.b("ASC")));
        linkedHashSet7.add(new r5x0("index_chats_invite_hash", false, rcc.b("invite_hash"), rcc.b("ASC")));
        linkedHashSet7.add(new r5x0("index_chats_parent_internal_id", false, rcc.b("parent_internal_id"), rcc.b("ASC")));
        s5x0 s5x0Var8 = new s5x0("chats", linkedHashMap8, p7, linkedHashSet7);
        s5x0 d8 = gkb1.d(oll0Var, "chats");
        if (!s5x0Var8.equals(d8)) {
            return new kne0(false, smw0.i("chats(com.yandex.messaging.core.db.chats.ChatEntity).\n Expected:\n", s5x0Var8, "\n Found:\n", d8));
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("user_id", new p5x0(1, "user_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap9.put("display_name", new p5x0(0, "display_name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap9.put("avatar_url", new p5x0(0, "avatar_url", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap9.put("website", new p5x0(0, "website", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap9.put("average_response_time", new p5x0(0, "average_response_time", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap9.put("shown_name", new p5x0(0, "shown_name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap9.put("nickname", new p5x0(0, "nickname", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap9.put("user_reduced_version", new p5x0(0, "user_reduced_version", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap9.put("version", new p5x0(0, "version", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap9.put("phone_id", new p5x0(0, "phone_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap9.put("contact_id", new p5x0(0, "contact_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap9.put("lookup_id", new p5x0(0, "lookup_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap9.put("user_search_key", new p5x0(0, "user_search_key", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap9.put("robot", new p5x0(0, "robot", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap9.put("cannot_be_blocked", new p5x0(0, "cannot_be_blocked", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap9.put("is_support_bot", new p5x0(0, "is_support_bot", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap9.put("is_contact", new p5x0(0, "is_contact", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap9.put("disable_privates", new p5x0(0, "disable_privates", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap9.put("deleted", new p5x0(0, "deleted", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var9 = new s5x0(CSPDirectoryConstants.SUBDIRECTORY_USERS, linkedHashMap9, smw0.p(linkedHashMap9, "is_fake", new p5x0(0, "is_fake", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d9 = gkb1.d(oll0Var, CSPDirectoryConstants.SUBDIRECTORY_USERS);
        if (!s5x0Var9.equals(d9)) {
            return new kne0(false, smw0.i("users(com.yandex.messaging.core.db.users.UserEntity).\n Expected:\n", s5x0Var9, "\n Found:\n", d9));
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("row_id", new p5x0(1, "row_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap10.put("chat_id", new p5x0(0, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap10.put("user_id", new p5x0(0, "user_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap10.put("org_id", new p5x0(0, "org_id", BaseDatabaseHelper.TYPE_INTEGER, "0", true, 1));
        linkedHashMap10.put("display_name", new p5x0(0, "display_name", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        LinkedHashSet p8 = smw0.p(linkedHashMap10, "sort_time", new p5x0(0, "sort_time", BaseDatabaseHelper.TYPE_INTEGER, "-1", true, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new r5x0("index_objects_to_share_chat_id_org_id", true, scc.g("chat_id", "org_id"), scc.g("ASC", "ASC")));
        linkedHashSet8.add(new r5x0("index_objects_to_share_user_id_org_id", true, scc.g("user_id", "org_id"), scc.g("ASC", "ASC")));
        linkedHashSet8.add(new r5x0("index_objects_to_share_chat_id", false, rcc.b("chat_id"), rcc.b("ASC")));
        linkedHashSet8.add(new r5x0("index_objects_to_share_user_id", false, rcc.b("user_id"), rcc.b("ASC")));
        linkedHashSet8.add(new r5x0("index_objects_to_share_org_id", false, rcc.b("org_id"), rcc.b("ASC")));
        linkedHashSet8.add(new r5x0("objects_to_share_sort_time_name", false, scc.g("sort_time", "display_name"), scc.g("DESC", "ASC")));
        s5x0 s5x0Var10 = new s5x0("objects_to_share", linkedHashMap10, p8, linkedHashSet8);
        s5x0 d10 = gkb1.d(oll0Var, "objects_to_share");
        if (!s5x0Var10.equals(d10)) {
            return new kne0(false, smw0.i("objects_to_share(com.yandex.messaging.core.db.share.SharingEntity).\n Expected:\n", s5x0Var10, "\n Found:\n", d10));
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("chat_id", new p5x0(1, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet p9 = smw0.p(linkedHashMap11, "chats_order", new p5x0(0, "chats_order", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new r5x0("pinned_chat_order", false, rcc.b("chats_order"), rcc.b("ASC")));
        s5x0 s5x0Var11 = new s5x0("pinned_chats", linkedHashMap11, p9, linkedHashSet9);
        s5x0 d11 = gkb1.d(oll0Var, "pinned_chats");
        if (!s5x0Var11.equals(d11)) {
            return new kne0(false, smw0.i("pinned_chats(com.yandex.messaging.core.db.pinned.PinnedChatsEntity).\n Expected:\n", s5x0Var11, "\n Found:\n", d11));
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("chat_internal_id", new p5x0(1, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var12 = new s5x0("participants_count", linkedHashMap12, smw0.p(linkedHashMap12, "count", new p5x0(0, "count", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d12 = gkb1.d(oll0Var, "participants_count");
        if (!s5x0Var12.equals(d12)) {
            return new kne0(false, smw0.i("participants_count(com.yandex.messaging.core.db.participants.ParticipantsCountEntity).\n Expected:\n", s5x0Var12, "\n Found:\n", d12));
        }
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        linkedHashMap13.put("chat_internal_id", new p5x0(1, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap13.put(ClidProvider.TIMESTAMP, new p5x0(0, ClidProvider.TIMESTAMP, BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet p10 = smw0.p(linkedHashMap13, "last_action_timestamp", new p5x0(0, "last_action_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new r5x0("index_pinned_messages_last_action_timestamp", false, rcc.b("last_action_timestamp"), rcc.b("ASC")));
        s5x0 s5x0Var13 = new s5x0("pinned_messages", linkedHashMap13, p10, linkedHashSet10);
        s5x0 d13 = gkb1.d(oll0Var, "pinned_messages");
        if (!s5x0Var13.equals(d13)) {
            return new kne0(false, smw0.i("pinned_messages(com.yandex.messaging.core.db.pinned.PinnedMessagesEntity).\n Expected:\n", s5x0Var13, "\n Found:\n", d13));
        }
        LinkedHashMap linkedHashMap14 = new LinkedHashMap();
        linkedHashMap14.put("chat_internal_id", new p5x0(1, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap14.put("chat_id", new p5x0(0, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet p11 = smw0.p(linkedHashMap14, "unique_marker", new p5x0(0, "unique_marker", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet11 = new LinkedHashSet();
        linkedHashSet11.add(new r5x0("index_saved_messages_view_unique_marker", true, rcc.b("unique_marker"), rcc.b("ASC")));
        s5x0 s5x0Var14 = new s5x0("saved_messages_view", linkedHashMap14, p11, linkedHashSet11);
        s5x0 d14 = gkb1.d(oll0Var, "saved_messages_view");
        if (!s5x0Var14.equals(d14)) {
            return new kne0(false, smw0.i("saved_messages_view(com.yandex.messaging.core.db.chats.SavedMessagesEntity).\n Expected:\n", s5x0Var14, "\n Found:\n", d14));
        }
        LinkedHashMap linkedHashMap15 = new LinkedHashMap();
        linkedHashMap15.put("row_id", new p5x0(1, "row_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap15.put("unseen", new p5x0(0, "unseen", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap15.put("unseen_show", new p5x0(0, "unseen_show", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var15 = new s5x0("unseen_view", linkedHashMap15, smw0.p(linkedHashMap15, "threads_unseen_show", new p5x0(0, "threads_unseen_show", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d15 = gkb1.d(oll0Var, "unseen_view");
        if (!s5x0Var15.equals(d15)) {
            return new kne0(false, smw0.i("unseen_view(com.yandex.messaging.core.db.unseen.UnseenViewEntity).\n Expected:\n", s5x0Var15, "\n Found:\n", d15));
        }
        LinkedHashMap linkedHashMap16 = new LinkedHashMap();
        linkedHashMap16.put("field_name", new p5x0(1, "field_name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        s5x0 s5x0Var16 = new s5x0("privacy", linkedHashMap16, smw0.p(linkedHashMap16, "value", new p5x0(0, "value", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1)), new LinkedHashSet());
        s5x0 d16 = gkb1.d(oll0Var, "privacy");
        if (!s5x0Var16.equals(d16)) {
            return new kne0(false, smw0.i("privacy(com.yandex.messaging.core.db.bucket.PrivacyEntity).\n Expected:\n", s5x0Var16, "\n Found:\n", d16));
        }
        LinkedHashMap linkedHashMap17 = new LinkedHashMap();
        linkedHashMap17.put("user_id", new p5x0(1, "user_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        s5x0 s5x0Var17 = new s5x0("local_hidden_private_chats_bucket", linkedHashMap17, smw0.p(linkedHashMap17, "hide_timestamp", new p5x0(0, "hide_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d17 = gkb1.d(oll0Var, "local_hidden_private_chats_bucket");
        if (!s5x0Var17.equals(d17)) {
            return new kne0(false, smw0.i("local_hidden_private_chats_bucket(com.yandex.messaging.core.db.bucket.HiddenPrivateChatsEntity).\n Expected:\n", s5x0Var17, "\n Found:\n", d17));
        }
        LinkedHashMap linkedHashMap18 = new LinkedHashMap();
        linkedHashMap18.put("user_sticker_pack_order", new p5x0(1, "user_sticker_pack_order", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet p12 = smw0.p(linkedHashMap18, "user_sticker_pack_id", new p5x0(0, "user_sticker_pack_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet linkedHashSet12 = new LinkedHashSet();
        linkedHashSet12.add(new r5x0("index_user_sticker_packs_user_sticker_pack_id", true, rcc.b("user_sticker_pack_id"), rcc.b("ASC")));
        s5x0 s5x0Var18 = new s5x0("user_sticker_packs", linkedHashMap18, p12, linkedHashSet12);
        s5x0 d18 = gkb1.d(oll0Var, "user_sticker_packs");
        if (!s5x0Var18.equals(d18)) {
            return new kne0(false, smw0.i("user_sticker_packs(com.yandex.messaging.core.db.bucket.StickerPackBucketEntity).\n Expected:\n", s5x0Var18, "\n Found:\n", d18));
        }
        LinkedHashMap linkedHashMap19 = new LinkedHashMap();
        linkedHashMap19.put("user_id", new p5x0(1, "user_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        s5x0 s5x0Var19 = new s5x0("restrictions", linkedHashMap19, smw0.p(linkedHashMap19, "blacklisted", new p5x0(0, "blacklisted", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d19 = gkb1.d(oll0Var, "restrictions");
        if (!s5x0Var19.equals(d19)) {
            return new kne0(false, smw0.i("restrictions(com.yandex.messaging.core.db.bucket.RestrictionsEntity).\n Expected:\n", s5x0Var19, "\n Found:\n", d19));
        }
        LinkedHashMap linkedHashMap20 = new LinkedHashMap();
        linkedHashMap20.put("row_id", new p5x0(1, "row_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap20.put("user_id", new p5x0(0, "user_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap20.put("version", new p5x0(0, "version", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap20.put("avatar_url", new p5x0(0, "avatar_url", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap20.put("display_name", new p5x0(0, "display_name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap20.put("nickname", new p5x0(0, "nickname", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap20.put("phone", new p5x0(0, "phone", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap20.put("registration_status", new p5x0(0, "registration_status", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap20.put("is_empty", new p5x0(0, "is_empty", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap20.put("is_corporate", new p5x0(0, "is_corporate", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap20.put("is_onboarded", new p5x0(0, "is_onboarded", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap20.put("needs_migration_onboarding", new p5x0(0, "needs_migration_onboarding", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var20 = new s5x0("personal_user_info", linkedHashMap20, smw0.p(linkedHashMap20, "account_type", new p5x0(0, "account_type", BaseDatabaseHelper.TYPE_TEXT, null, false, 1)), new LinkedHashSet());
        s5x0 d20 = gkb1.d(oll0Var, "personal_user_info");
        if (!s5x0Var20.equals(d20)) {
            return new kne0(false, smw0.i("personal_user_info(com.yandex.messaging.core.db.personal.PersonalUserInfoEntity).\n Expected:\n", s5x0Var20, "\n Found:\n", d20));
        }
        LinkedHashMap linkedHashMap21 = new LinkedHashMap();
        linkedHashMap21.put("chat_internal_id", new p5x0(1, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap21.put("chatbar", new p5x0(0, "chatbar", "BLOB", null, false, 1));
        linkedHashMap21.put("calls_settings", new p5x0(0, "calls_settings", "BLOB", null, false, 1));
        linkedHashMap21.put("complain_action", new p5x0(0, "complain_action", "BLOB", null, false, 1));
        linkedHashMap21.put("miniapp_url", new p5x0(0, "miniapp_url", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap21.put("allow_unsafe_miniapp", new p5x0(0, "allow_unsafe_miniapp", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        s5x0 s5x0Var21 = new s5x0("chat_metadata", linkedHashMap21, smw0.p(linkedHashMap21, "view_importants_list", new p5x0(0, "view_importants_list", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1)), new LinkedHashSet());
        s5x0 d21 = gkb1.d(oll0Var, "chat_metadata");
        if (!s5x0Var21.equals(d21)) {
            return new kne0(false, smw0.i("chat_metadata(com.yandex.messaging.core.db.chats.ChatMetadataEntity).\n Expected:\n", s5x0Var21, "\n Found:\n", d21));
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        linkedHashMap22.put("user_guid", new p5x0(1, "user_guid", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap22.put("chatbar", new p5x0(0, "chatbar", "BLOB", null, false, 1));
        linkedHashMap22.put("calls_settings", new p5x0(0, "calls_settings", "BLOB", null, false, 1));
        linkedHashMap22.put("complain_action", new p5x0(0, "complain_action", "BLOB", null, false, 1));
        s5x0 s5x0Var22 = new s5x0("user_metadata", linkedHashMap22, smw0.p(linkedHashMap22, "view_importants_list", new p5x0(0, "view_importants_list", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1)), new LinkedHashSet());
        s5x0 d22 = gkb1.d(oll0Var, "user_metadata");
        if (!s5x0Var22.equals(d22)) {
            return new kne0(false, smw0.i("user_metadata(com.yandex.messaging.core.db.users.UserMetadataEntity).\n Expected:\n", s5x0Var22, "\n Found:\n", d22));
        }
        LinkedHashMap linkedHashMap23 = new LinkedHashMap();
        linkedHashMap23.put("bucket_name", new p5x0(1, "bucket_name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        s5x0 s5x0Var23 = new s5x0("bucket_version", linkedHashMap23, smw0.p(linkedHashMap23, "version", new p5x0(0, "version", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d23 = gkb1.d(oll0Var, "bucket_version");
        if (!s5x0Var23.equals(d23)) {
            return new kne0(false, smw0.i("bucket_version(com.yandex.messaging.core.db.bucket.BucketVersionEntity).\n Expected:\n", s5x0Var23, "\n Found:\n", d23));
        }
        LinkedHashMap linkedHashMap24 = new LinkedHashMap();
        linkedHashMap24.put("row_id", new p5x0(1, "row_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap24.put("remotes_user_id", new p5x0(0, "remotes_user_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap24.put("remotes_phone_id", new p5x0(0, "remotes_phone_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap24.put("remotes_deleted", new p5x0(0, "remotes_deleted", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet p13 = smw0.p(linkedHashMap24, "remotes_contact_name", new p5x0(0, "remotes_contact_name", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        LinkedHashSet linkedHashSet13 = new LinkedHashSet();
        linkedHashSet13.add(new r5x0("remotes_user_id_index", true, rcc.b("remotes_user_id"), rcc.b("ASC")));
        linkedHashSet13.add(new r5x0("remotes_phone_id_index", true, rcc.b("remotes_phone_id"), rcc.b("ASC")));
        s5x0 s5x0Var24 = new s5x0("remote_contacts", linkedHashMap24, p13, linkedHashSet13);
        s5x0 d24 = gkb1.d(oll0Var, "remote_contacts");
        if (!s5x0Var24.equals(d24)) {
            return new kne0(false, smw0.i("remote_contacts(com.yandex.messaging.core.db.contacts.RemoteContactEntity).\n Expected:\n", s5x0Var24, "\n Found:\n", d24));
        }
        LinkedHashMap linkedHashMap25 = new LinkedHashMap();
        linkedHashMap25.put("chat_id", new p5x0(1, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap25.put("not_spam", new p5x0(0, "not_spam", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var25 = new s5x0("chat_preferences", linkedHashMap25, smw0.p(linkedHashMap25, "approved_by_me", new p5x0(0, "approved_by_me", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d25 = gkb1.d(oll0Var, "chat_preferences");
        if (!s5x0Var25.equals(d25)) {
            return new kne0(false, smw0.i("chat_preferences(com.yandex.messaging.core.db.persistent.ChatPreferencesEntity).\n Expected:\n", s5x0Var25, "\n Found:\n", d25));
        }
        LinkedHashMap linkedHashMap26 = new LinkedHashMap();
        linkedHashMap26.put("chat_id", new p5x0(1, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap26.put("message_timestamp", new p5x0(2, "message_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var26 = new s5x0("message_moderation_user_choice", linkedHashMap26, smw0.p(linkedHashMap26, "choice", new p5x0(0, "choice", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d26 = gkb1.d(oll0Var, "message_moderation_user_choice");
        if (!s5x0Var26.equals(d26)) {
            return new kne0(false, smw0.i("message_moderation_user_choice(com.yandex.messaging.core.db.persistent.MessageModerationUserChoiceEntity).\n Expected:\n", s5x0Var26, "\n Found:\n", d26));
        }
        LinkedHashMap linkedHashMap27 = new LinkedHashMap();
        linkedHashMap27.put("order_value", new p5x0(1, "order_value", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap27.put(AppSettingsContract$Setting.COLUMN_PREFIX, new p5x0(0, AppSettingsContract$Setting.COLUMN_PREFIX, BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap27.put("key", new p5x0(0, "key", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet p14 = smw0.p(linkedHashMap27, "value", new p5x0(0, "value", "BLOB", null, true, 1));
        LinkedHashSet linkedHashSet14 = new LinkedHashSet();
        linkedHashSet14.add(new r5x0("index_persistent_queue_prefix_key", true, scc.g(AppSettingsContract$Setting.COLUMN_PREFIX, "key"), scc.g("ASC", "ASC")));
        s5x0 s5x0Var27 = new s5x0("persistent_queue", linkedHashMap27, p14, linkedHashSet14);
        s5x0 d27 = gkb1.d(oll0Var, "persistent_queue");
        if (!s5x0Var27.equals(d27)) {
            return new kne0(false, smw0.i("persistent_queue(com.yandex.messaging.core.db.persistentqueue.PersistentQueueEntity).\n Expected:\n", s5x0Var27, "\n Found:\n", d27));
        }
        LinkedHashMap linkedHashMap28 = new LinkedHashMap();
        linkedHashMap28.put("sticker_user_pack_order", new p5x0(1, "sticker_user_pack_order", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet p15 = smw0.p(linkedHashMap28, "sticker_user_pack_id", new p5x0(0, "sticker_user_pack_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet linkedHashSet15 = new LinkedHashSet();
        linkedHashSet15.add(new r5x0("index_sticker_user_packs_sticker_user_pack_id", true, rcc.b("sticker_user_pack_id"), rcc.b("ASC")));
        s5x0 s5x0Var28 = new s5x0("sticker_user_packs", linkedHashMap28, p15, linkedHashSet15);
        s5x0 d28 = gkb1.d(oll0Var, "sticker_user_packs");
        if (!s5x0Var28.equals(d28)) {
            return new kne0(false, smw0.i("sticker_user_packs(com.yandex.messaging.core.db.stickers.StickerUserPackEntity).\n Expected:\n", s5x0Var28, "\n Found:\n", d28));
        }
        LinkedHashMap linkedHashMap29 = new LinkedHashMap();
        linkedHashMap29.put("sticker_id", new p5x0(1, "sticker_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap29.put("sticker_pack_id", new p5x0(2, "sticker_pack_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap29.put("sticker_original_pack_id", new p5x0(0, "sticker_original_pack_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap29.put("sticker_text", new p5x0(0, "sticker_text", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap29.put("sticker_position", new p5x0(0, "sticker_position", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var29 = new s5x0("sticker_list", linkedHashMap29, smw0.p(linkedHashMap29, "sticker_added_timestamp", new p5x0(0, "sticker_added_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1)), new LinkedHashSet());
        s5x0 d29 = gkb1.d(oll0Var, "sticker_list");
        if (!s5x0Var29.equals(d29)) {
            return new kne0(false, smw0.i("sticker_list(com.yandex.messaging.core.db.stickers.StickerEntity).\n Expected:\n", s5x0Var29, "\n Found:\n", d29));
        }
        LinkedHashMap linkedHashMap30 = new LinkedHashMap();
        linkedHashMap30.put("row_id", new p5x0(1, "row_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap30.put("sticker_pack_id", new p5x0(0, "sticker_pack_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap30.put("sticker_pack_cover_id", new p5x0(0, "sticker_pack_cover_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap30.put("sticker_pack_title", new p5x0(0, "sticker_pack_title", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap30.put("sticker_pack_description", new p5x0(0, "sticker_pack_description", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        s5x0 s5x0Var30 = new s5x0("sticker_pack_list", linkedHashMap30, smw0.p(linkedHashMap30, "is_local_pack", new p5x0(0, "is_local_pack", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d30 = gkb1.d(oll0Var, "sticker_pack_list");
        if (!s5x0Var30.equals(d30)) {
            return new kne0(false, smw0.i("sticker_pack_list(com.yandex.messaging.core.db.stickers.StickerPackEntity).\n Expected:\n", s5x0Var30, "\n Found:\n", d30));
        }
        LinkedHashMap linkedHashMap31 = new LinkedHashMap();
        linkedHashMap31.put("sticker_item_position", new p5x0(1, "sticker_item_position", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap31.put("sticker_pack_id", new p5x0(0, "sticker_pack_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap31.put("sticker_original_pack_id", new p5x0(0, "sticker_original_pack_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap31.put("sticker_pack_position", new p5x0(0, "sticker_pack_position", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap31.put("sticker_header", new p5x0(0, "sticker_header", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap31.put("sticker_text", new p5x0(0, "sticker_text", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        s5x0 s5x0Var31 = new s5x0("sticker_panel_sticker_view", linkedHashMap31, smw0.p(linkedHashMap31, "sticker_id", new p5x0(0, "sticker_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1)), new LinkedHashSet());
        s5x0 d31 = gkb1.d(oll0Var, "sticker_panel_sticker_view");
        if (!s5x0Var31.equals(d31)) {
            return new kne0(false, smw0.i("sticker_panel_sticker_view(com.yandex.messaging.core.db.stickers.StickerViewEntity).\n Expected:\n", s5x0Var31, "\n Found:\n", d31));
        }
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        linkedHashMap32.put("sticker_item_position", new p5x0(1, "sticker_item_position", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap32.put("sticker_pack_cover_id", new p5x0(0, "sticker_pack_cover_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap32.put("sticker_pack_title", new p5x0(0, "sticker_pack_title", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap32.put("sticker_pack_id", new p5x0(0, "sticker_pack_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap32.put("sticker_pack_description", new p5x0(0, "sticker_pack_description", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        s5x0 s5x0Var32 = new s5x0("sticker_panel_pack_view", linkedHashMap32, smw0.p(linkedHashMap32, "sticker_item_position_in_panel", new p5x0(0, "sticker_item_position_in_panel", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d32 = gkb1.d(oll0Var, "sticker_panel_pack_view");
        if (!s5x0Var32.equals(d32)) {
            return new kne0(false, smw0.i("sticker_panel_pack_view(com.yandex.messaging.core.db.stickers.StickerPackViewEntity).\n Expected:\n", s5x0Var32, "\n Found:\n", d32));
        }
        LinkedHashMap linkedHashMap33 = new LinkedHashMap();
        linkedHashMap33.put("chat_internal_id", new p5x0(1, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap33.put("version", new p5x0(0, "version", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap33.put("role", new p5x0(0, "role", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var33 = new s5x0("user_roles", linkedHashMap33, smw0.p(linkedHashMap33, "rights", new p5x0(0, "rights", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d33 = gkb1.d(oll0Var, "user_roles");
        if (!s5x0Var33.equals(d33)) {
            return new kne0(false, smw0.i("user_roles(com.yandex.messaging.core.db.chats.ChatRoleEntity).\n Expected:\n", s5x0Var33, "\n Found:\n", d33));
        }
        LinkedHashMap linkedHashMap34 = new LinkedHashMap();
        linkedHashMap34.put("chat_internal_id", new p5x0(1, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var34 = new s5x0("chat_notifications", linkedHashMap34, smw0.p(linkedHashMap34, "last_shown_message_timestamp", new p5x0(0, "last_shown_message_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d34 = gkb1.d(oll0Var, "chat_notifications");
        if (!s5x0Var34.equals(d34)) {
            return new kne0(false, smw0.i("chat_notifications(com.yandex.messaging.core.db.chats.ChatNotificationsEntity).\n Expected:\n", s5x0Var34, "\n Found:\n", d34));
        }
        LinkedHashMap linkedHashMap35 = new LinkedHashMap();
        linkedHashMap35.put("locals_upload_id", new p5x0(1, "locals_upload_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap35.put("locals_system_id", new p5x0(0, "locals_system_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap35.put("locals_uploaded", new p5x0(0, "locals_uploaded", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap35.put("locals_display_name", new p5x0(0, "locals_display_name", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap35.put("locals_phone", new p5x0(0, "locals_phone", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap35.put("locals_phone_id", new p5x0(0, "locals_phone_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap35.put("locals_last_time_contacted", new p5x0(0, "locals_last_time_contacted", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap35.put("locals_dirty", new p5x0(0, "locals_dirty", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap35.put("locals_deleted", new p5x0(0, "locals_deleted", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet p16 = smw0.p(linkedHashMap35, "locals_lookup_id", new p5x0(0, "locals_lookup_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet linkedHashSet16 = new LinkedHashSet();
        linkedHashSet16.add(new r5x0("idx_local_contacts_phone_id", false, rcc.b("locals_phone_id"), rcc.b("ASC")));
        s5x0 s5x0Var35 = new s5x0("local_contacts", linkedHashMap35, p16, linkedHashSet16);
        s5x0 d35 = gkb1.d(oll0Var, "local_contacts");
        if (!s5x0Var35.equals(d35)) {
            return new kne0(false, smw0.i("local_contacts(com.yandex.messaging.core.db.contacts.LocalContactEntity).\n Expected:\n", s5x0Var35, "\n Found:\n", d35));
        }
        LinkedHashMap linkedHashMap36 = new LinkedHashMap();
        linkedHashMap36.put("message_order", new p5x0(1, "message_order", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap36.put("message_chat_request_id", new p5x0(0, "message_chat_request_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap36.put("message_id", new p5x0(0, "message_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap36.put("message_internal_id", new p5x0(0, "message_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap36.put("message_time", new p5x0(0, "message_time", "REAL", null, true, 1));
        linkedHashMap36.put("message_data", new p5x0(0, "message_data", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap36.put("message_attachment_uri", new p5x0(0, "message_attachment_uri", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap36.put("message_attachment_uris", new p5x0(0, "message_attachment_uris", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap36.put("message_force_as_file", new p5x0(0, "message_force_as_file", BaseDatabaseHelper.TYPE_INTEGER, "0", true, 1));
        linkedHashMap36.put("message_existing_attachments", new p5x0(0, "message_existing_attachments", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap36.put("message_voice_file_uri", new p5x0(0, "message_voice_file_uri", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap36.put("message_payload", new p5x0(0, "message_payload", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap36.put("message_mentioned_guids", new p5x0(0, "message_mentioned_guids", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap36.put("message_is_paused", new p5x0(0, "message_is_paused", BaseDatabaseHelper.TYPE_INTEGER, "0", true, 1));
        linkedHashMap36.put("chat_source", new p5x0(0, "chat_source", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap36.put("message_forwards", new p5x0(0, "message_forwards", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap36.put("is_starred", new p5x0(0, "is_starred", BaseDatabaseHelper.TYPE_INTEGER, "0", true, 1));
        linkedHashMap36.put("forced_translation", new p5x0(0, "forced_translation", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap36.put("is_silent", new p5x0(0, "is_silent", BaseDatabaseHelper.TYPE_INTEGER, "0", true, 1));
        s5x0 s5x0Var36 = new s5x0("pending_message_to_chat_request", linkedHashMap36, smw0.p(linkedHashMap36, "quoted_text", new p5x0(0, "quoted_text", BaseDatabaseHelper.TYPE_TEXT, null, false, 1)), new LinkedHashSet());
        s5x0 d36 = gkb1.d(oll0Var, "pending_message_to_chat_request");
        if (!s5x0Var36.equals(d36)) {
            return new kne0(false, smw0.i("pending_message_to_chat_request(com.yandex.messaging.core.db.pending.PendingMessageEntity).\n Expected:\n", s5x0Var36, "\n Found:\n", d36));
        }
        LinkedHashMap linkedHashMap37 = new LinkedHashMap();
        linkedHashMap37.put("chat_request_id", new p5x0(1, "chat_request_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        s5x0 s5x0Var37 = new s5x0("pending_chat_requests", linkedHashMap37, smw0.p(linkedHashMap37, "chat_request_json", new p5x0(0, "chat_request_json", BaseDatabaseHelper.TYPE_TEXT, null, true, 1)), new LinkedHashSet());
        s5x0 d37 = gkb1.d(oll0Var, "pending_chat_requests");
        if (!s5x0Var37.equals(d37)) {
            return new kne0(false, smw0.i("pending_chat_requests(com.yandex.messaging.core.db.pending.PendingChatRequestEntity).\n Expected:\n", s5x0Var37, "\n Found:\n", d37));
        }
        LinkedHashMap linkedHashMap38 = new LinkedHashMap();
        linkedHashMap38.put("unique_marker", new p5x0(1, "unique_marker", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var38 = new s5x0("last_message_view", linkedHashMap38, smw0.p(linkedHashMap38, "chat_id", new p5x0(0, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1)), new LinkedHashSet());
        s5x0 d38 = gkb1.d(oll0Var, "last_message_view");
        if (!s5x0Var38.equals(d38)) {
            return new kne0(false, smw0.i("last_message_view(com.yandex.messaging.core.db.messages.LastMessageViewEntity).\n Expected:\n", s5x0Var38, "\n Found:\n", d38));
        }
        LinkedHashMap linkedHashMap39 = new LinkedHashMap();
        linkedHashMap39.put("chat_internal_id", new p5x0(1, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var39 = new s5x0("cache_timeline_versions", linkedHashMap39, smw0.p(linkedHashMap39, "timeline_version", new p5x0(0, "timeline_version", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d39 = gkb1.d(oll0Var, "cache_timeline_versions");
        if (!s5x0Var39.equals(d39)) {
            return new kne0(false, smw0.i("cache_timeline_versions(com.yandex.messaging.core.db.versions.CacheTimelineVersionsEntity).\n Expected:\n", s5x0Var39, "\n Found:\n", d39));
        }
        LinkedHashMap linkedHashMap40 = new LinkedHashMap();
        linkedHashMap40.put("chat_id", new p5x0(1, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap40.put("mute", new p5x0(0, "mute", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap40.put("mute_mentions", new p5x0(0, "mute_mentions", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet p17 = smw0.p(linkedHashMap40, "version", new p5x0(0, "version", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        LinkedHashSet linkedHashSet17 = new LinkedHashSet();
        linkedHashSet17.add(new r5x0("chat_muting_chat_id", false, rcc.b("chat_id"), rcc.b("ASC")));
        s5x0 s5x0Var40 = new s5x0("chat_muting", linkedHashMap40, p17, linkedHashSet17);
        s5x0 d40 = gkb1.d(oll0Var, "chat_muting");
        if (!s5x0Var40.equals(d40)) {
            return new kne0(false, smw0.i("chat_muting(com.yandex.messaging.core.db.bucket.ChatMutingsEntity).\n Expected:\n", s5x0Var40, "\n Found:\n", d40));
        }
        LinkedHashMap linkedHashMap41 = new LinkedHashMap();
        linkedHashMap41.put("chat_internal_id", new p5x0(1, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap41.put("edit_history_server_max_timestamp", new p5x0(0, "edit_history_server_max_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var41 = new s5x0("cache_chat_edit_history_timestamps", linkedHashMap41, smw0.p(linkedHashMap41, "edit_history_client_max_timestamp", new p5x0(0, "edit_history_client_max_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d41 = gkb1.d(oll0Var, "cache_chat_edit_history_timestamps");
        if (!s5x0Var41.equals(d41)) {
            return new kne0(false, smw0.i("cache_chat_edit_history_timestamps(com.yandex.messaging.core.db.chats.ChatEditHistoryTimestampsEntity).\n Expected:\n", s5x0Var41, "\n Found:\n", d41));
        }
        LinkedHashMap linkedHashMap42 = new LinkedHashMap();
        s5x0 s5x0Var42 = new s5x0("hidden_namespaces", linkedHashMap42, smw0.p(linkedHashMap42, "namespace", new p5x0(1, "namespace", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d42 = gkb1.d(oll0Var, "hidden_namespaces");
        if (!s5x0Var42.equals(d42)) {
            return new kne0(false, smw0.i("hidden_namespaces(com.yandex.messaging.core.db.namespaces.HiddenNamespacesEntity).\n Expected:\n", s5x0Var42, "\n Found:\n", d42));
        }
        LinkedHashMap linkedHashMap43 = new LinkedHashMap();
        s5x0 s5x0Var43 = new s5x0("no_phone_namespaces", linkedHashMap43, smw0.p(linkedHashMap43, "namespace", new p5x0(1, "namespace", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d43 = gkb1.d(oll0Var, "no_phone_namespaces");
        if (!s5x0Var43.equals(d43)) {
            return new kne0(false, smw0.i("no_phone_namespaces(com.yandex.messaging.core.db.namespaces.NoPhoneNamespacesEntity).\n Expected:\n", s5x0Var43, "\n Found:\n", d43));
        }
        LinkedHashMap linkedHashMap44 = new LinkedHashMap();
        linkedHashMap44.put("id", new p5x0(1, "id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        s5x0 s5x0Var44 = new s5x0("stable_chat_internal_id", linkedHashMap44, smw0.p(linkedHashMap44, "internal_id", new p5x0(0, "internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d44 = gkb1.d(oll0Var, "stable_chat_internal_id");
        if (!s5x0Var44.equals(d44)) {
            return new kne0(false, smw0.i("stable_chat_internal_id(com.yandex.messaging.core.db.internalid.StableChatInternalIdEntity).\n Expected:\n", s5x0Var44, "\n Found:\n", d44));
        }
        LinkedHashMap linkedHashMap45 = new LinkedHashMap();
        linkedHashMap45.put("row_id", new p5x0(1, "row_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        s5x0 s5x0Var45 = new s5x0("internal_id", linkedHashMap45, smw0.p(linkedHashMap45, "next_internal_id", new p5x0(0, "next_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d45 = gkb1.d(oll0Var, "internal_id");
        if (!s5x0Var45.equals(d45)) {
            return new kne0(false, smw0.i("internal_id(com.yandex.messaging.core.db.internalid.InternalIdEntity).\n Expected:\n", s5x0Var45, "\n Found:\n", d45));
        }
        LinkedHashMap linkedHashMap46 = new LinkedHashMap();
        linkedHashMap46.put("message_timestamp", new p5x0(1, "message_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap46.put("chat_id", new p5x0(0, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap46.put("choices", new p5x0(0, "choices", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap46.put("operation_type", new p5x0(0, "operation_type", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap46.put("forward_message_timestamp", new p5x0(0, "forward_message_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        LinkedHashSet p18 = smw0.p(linkedHashMap46, "forward_chat_id", new p5x0(0, "forward_chat_id", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        LinkedHashSet linkedHashSet18 = new LinkedHashSet();
        linkedHashSet18.add(new r5x0("message_timestamp_chat_id_unique", true, scc.g("message_timestamp", "chat_id"), scc.g("ASC", "ASC")));
        s5x0 s5x0Var46 = new s5x0("pending_poll_votes", linkedHashMap46, p18, linkedHashSet18);
        s5x0 d46 = gkb1.d(oll0Var, "pending_poll_votes");
        if (!s5x0Var46.equals(d46)) {
            return new kne0(false, smw0.i("pending_poll_votes(com.yandex.messaging.core.db.poll.PendingPollVoteEntity).\n Expected:\n", s5x0Var46, "\n Found:\n", d46));
        }
        LinkedHashMap linkedHashMap47 = new LinkedHashMap();
        linkedHashMap47.put("row_id", new p5x0(1, "row_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap47.put("chat_id", new p5x0(0, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap47.put("message_timestamp", new p5x0(0, "message_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet p19 = smw0.p(linkedHashMap47, "is_thread", new p5x0(0, "is_thread", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet19 = new LinkedHashSet();
        linkedHashSet19.add(new r5x0("chat_id_message_timestamp_unique", true, scc.g("chat_id", "message_timestamp"), scc.g("ASC", "ASC")));
        linkedHashSet19.add(new r5x0("chat_id_is_thread", false, rcc.b("is_thread"), rcc.b("ASC")));
        s5x0 s5x0Var47 = new s5x0("personal_mentions", linkedHashMap47, p19, linkedHashSet19);
        s5x0 d47 = gkb1.d(oll0Var, "personal_mentions");
        if (!s5x0Var47.equals(d47)) {
            return new kne0(false, smw0.i("personal_mentions(com.yandex.messaging.core.db.personal.PersonalMentionsEntity).\n Expected:\n", s5x0Var47, "\n Found:\n", d47));
        }
        LinkedHashMap linkedHashMap48 = new LinkedHashMap();
        linkedHashMap48.put("organization_id", new p5x0(1, "organization_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap48.put("organization_name", new p5x0(0, "organization_name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap48.put("registration_status", new p5x0(0, "registration_status", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap48.put("is_public", new p5x0(0, "is_public", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap48.put("is_guest", new p5x0(0, "is_guest", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap48.put("organization_rights", new p5x0(0, "organization_rights", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var48 = new s5x0("organizations", linkedHashMap48, smw0.p(linkedHashMap48, BackendConfig.Restrictions.DISABLED, new p5x0(0, BackendConfig.Restrictions.DISABLED, BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d48 = gkb1.d(oll0Var, "organizations");
        if (!s5x0Var48.equals(d48)) {
            return new kne0(false, smw0.i("organizations(com.yandex.messaging.core.db.personal.PersonalOrganizationEntity).\n Expected:\n", s5x0Var48, "\n Found:\n", d48));
        }
        LinkedHashMap linkedHashMap49 = new LinkedHashMap();
        linkedHashMap49.put("user_id", new p5x0(1, "user_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap49.put("organization_id", new p5x0(2, "organization_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap49.put("organization_name", new p5x0(0, "organization_name", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap49.put("department_name", new p5x0(0, "department_name", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap49.put("position", new p5x0(0, "position", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap49.put("is_guest", new p5x0(0, "is_guest", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap49.put("deleted", new p5x0(0, "deleted", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap49.put("guest_organization_name", new p5x0(0, "guest_organization_name", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        LinkedHashSet p20 = smw0.p(linkedHashMap49, "display_name", new p5x0(0, "display_name", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        LinkedHashSet linkedHashSet20 = new LinkedHashSet();
        linkedHashSet20.add(new r5x0("index_user_employee_organization_id", false, rcc.b("organization_id"), rcc.b("ASC")));
        s5x0 s5x0Var49 = new s5x0("user_employee", linkedHashMap49, p20, linkedHashSet20);
        s5x0 d49 = gkb1.d(oll0Var, "user_employee");
        if (!s5x0Var49.equals(d49)) {
            return new kne0(false, smw0.i("user_employee(com.yandex.messaging.core.db.users.UserEmployeeEntity).\n Expected:\n", s5x0Var49, "\n Found:\n", d49));
        }
        LinkedHashMap linkedHashMap50 = new LinkedHashMap();
        linkedHashMap50.put("chat_internal_id", new p5x0(1, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet p21 = smw0.p(linkedHashMap50, "organization_id", new p5x0(2, "organization_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet21 = new LinkedHashSet();
        linkedHashSet21.add(new r5x0("index_chat_organization_cross_ref_organization_id", false, rcc.b("organization_id"), rcc.b("ASC")));
        s5x0 s5x0Var50 = new s5x0("chat_organization_cross_ref", linkedHashMap50, p21, linkedHashSet21);
        s5x0 d50 = gkb1.d(oll0Var, "chat_organization_cross_ref");
        if (!s5x0Var50.equals(d50)) {
            return new kne0(false, smw0.i("chat_organization_cross_ref(com.yandex.messaging.core.db.chats.ChatOrganizationCrossRefEntity).\n Expected:\n", s5x0Var50, "\n Found:\n", d50));
        }
        LinkedHashMap linkedHashMap51 = new LinkedHashMap();
        linkedHashMap51.put("row_id", new p5x0(1, "row_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap51.put("user_id", new p5x0(0, "user_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap51.put("organization_id", new p5x0(0, "organization_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap51.put("type", new p5x0(0, "type", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap51.put("value", new p5x0(0, "value", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet p22 = smw0.p(linkedHashMap51, "is_legal", new p5x0(0, "is_legal", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet22 = new LinkedHashSet();
        linkedHashSet22.add(new r5x0("index_user_contact_table_user_id_organization_id", false, scc.g("user_id", "organization_id"), scc.g("ASC", "ASC")));
        s5x0 s5x0Var51 = new s5x0("user_contact_table", linkedHashMap51, p22, linkedHashSet22);
        s5x0 d51 = gkb1.d(oll0Var, "user_contact_table");
        if (!s5x0Var51.equals(d51)) {
            return new kne0(false, smw0.i("user_contact_table(com.yandex.messaging.core.db.users.UserContactEntity).\n Expected:\n", s5x0Var51, "\n Found:\n", d51));
        }
        LinkedHashMap linkedHashMap52 = new LinkedHashMap();
        linkedHashMap52.put("thread_internal_id", new p5x0(1, "thread_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap52.put("thread_id", new p5x0(0, "thread_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap52.put("unseen", new p5x0(0, "unseen", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap52.put("first_unseen_row", new p5x0(0, "first_unseen_row", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap52.put("is_hidden", new p5x0(0, "is_hidden", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap52.put("is_member", new p5x0(0, "is_member", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap52.put("sort_time", new p5x0(0, "sort_time", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap52.put("parent_internal_id", new p5x0(0, "parent_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet p23 = smw0.p(linkedHashMap52, "parent_message_timestamp", new p5x0(0, "parent_message_timestamp", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet23 = new LinkedHashSet();
        linkedHashSet23.add(new r5x0("index_threads_view_thread_id", true, rcc.b("thread_id"), rcc.b("ASC")));
        linkedHashSet23.add(new r5x0("index_threads_view_sort_time", false, rcc.b("sort_time"), rcc.b("DESC")));
        linkedHashSet23.add(new r5x0("index_threads_view_is_hidden", false, rcc.b("is_hidden"), rcc.b("ASC")));
        linkedHashSet23.add(new r5x0("index_threads_view_parent_internal_id_parent_message_timestamp", false, scc.g("parent_internal_id", "parent_message_timestamp"), scc.g("ASC", "ASC")));
        s5x0 s5x0Var52 = new s5x0("threads_view", linkedHashMap52, p23, linkedHashSet23);
        s5x0 d52 = gkb1.d(oll0Var, "threads_view");
        if (!s5x0Var52.equals(d52)) {
            return new kne0(false, smw0.i("threads_view(com.yandex.messaging.core.db.chats.ThreadViewEntity).\n Expected:\n", s5x0Var52, "\n Found:\n", d52));
        }
        LinkedHashMap linkedHashMap53 = new LinkedHashMap();
        linkedHashMap53.put("rowid", new p5x0(1, "rowid", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap53.put("messages_view_history_id", new p5x0(0, "messages_view_history_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet p24 = smw0.p(linkedHashMap53, "thread_internal_id", new p5x0(0, "thread_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet24 = new LinkedHashSet();
        linkedHashSet24.add(new r5x0("index_threads_messages_view_thread_internal_id", false, rcc.b("thread_internal_id"), rcc.b("ASC")));
        s5x0 s5x0Var53 = new s5x0("threads_messages_view", linkedHashMap53, p24, linkedHashSet24);
        s5x0 d53 = gkb1.d(oll0Var, "threads_messages_view");
        if (!s5x0Var53.equals(d53)) {
            return new kne0(false, smw0.i("threads_messages_view(com.yandex.messaging.core.db.chats.ThreadMessagesViewEntity).\n Expected:\n", s5x0Var53, "\n Found:\n", d53));
        }
        LinkedHashMap linkedHashMap54 = new LinkedHashMap();
        linkedHashMap54.put("row_id", new p5x0(1, "row_id", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        linkedHashMap54.put("chat_internal_id", new p5x0(0, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap54.put("message_history_id", new p5x0(0, "message_history_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap54.put("version", new p5x0(0, "version", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap54.put("original_lang", new p5x0(0, "original_lang", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap54.put("translated_lang", new p5x0(0, "translated_lang", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap54.put("translated_text", new p5x0(0, "translated_text", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet p25 = smw0.p(linkedHashMap54, "translated_suggests", new p5x0(0, "translated_suggests", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        LinkedHashSet linkedHashSet25 = new LinkedHashSet();
        linkedHashSet25.add(new r5x0("index_message_translations_chat_internal_id_message_history_id_version", false, scc.g("chat_internal_id", "message_history_id", "version"), scc.g("ASC", "ASC", "ASC")));
        s5x0 s5x0Var54 = new s5x0("message_translations", linkedHashMap54, p25, linkedHashSet25);
        s5x0 d54 = gkb1.d(oll0Var, "message_translations");
        if (!s5x0Var54.equals(d54)) {
            return new kne0(false, smw0.i("message_translations(com.yandex.messaging.core.db.translations.MessageTranslationsEntity).\n Expected:\n", s5x0Var54, "\n Found:\n", d54));
        }
        LinkedHashMap linkedHashMap55 = new LinkedHashMap();
        linkedHashMap55.put("chat_internal_id", new p5x0(1, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var55 = new s5x0("chat_translations", linkedHashMap55, smw0.p(linkedHashMap55, "translation_lang", new p5x0(0, "translation_lang", BaseDatabaseHelper.TYPE_TEXT, null, false, 1)), new LinkedHashSet());
        s5x0 d55 = gkb1.d(oll0Var, "chat_translations");
        if (!s5x0Var55.equals(d55)) {
            return new kne0(false, smw0.i("chat_translations(com.yandex.messaging.core.db.translations.ChatTranslationsEntity).\n Expected:\n", s5x0Var55, "\n Found:\n", d55));
        }
        LinkedHashMap linkedHashMap56 = new LinkedHashMap();
        linkedHashMap56.put("chat_id", new p5x0(1, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap56.put("miniapp_url", new p5x0(0, "miniapp_url", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        s5x0 s5x0Var56 = new s5x0("chat_miniapp", linkedHashMap56, smw0.p(linkedHashMap56, "trusted", new p5x0(0, "trusted", BaseDatabaseHelper.TYPE_INTEGER, "0", true, 1)), new LinkedHashSet());
        s5x0 d56 = gkb1.d(oll0Var, "chat_miniapp");
        if (!s5x0Var56.equals(d56)) {
            return new kne0(false, smw0.i("chat_miniapp(com.yandex.messaging.core.db.miniapp.ChatMiniappEntity).\n Expected:\n", s5x0Var56, "\n Found:\n", d56));
        }
        LinkedHashMap linkedHashMap57 = new LinkedHashMap();
        linkedHashMap57.put("id", new p5x0(1, "id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap57.put("guid", new p5x0(0, "guid", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap57.put(ClidProvider.TIMESTAMP, new p5x0(0, ClidProvider.TIMESTAMP, BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap57.put("availability", new p5x0(0, "availability", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap57.put("notificationMode", new p5x0(0, "notificationMode", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap57.put("duration", new p5x0(0, "duration", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap57.put("custom_text", new p5x0(0, "custom_text", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap57.put("custom_emoji", new p5x0(0, "custom_emoji", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        linkedHashMap57.put("custom_icon", new p5x0(0, "custom_icon", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        LinkedHashSet p26 = smw0.p(linkedHashMap57, "locales", new p5x0(0, "locales", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        LinkedHashSet linkedHashSet26 = new LinkedHashSet();
        linkedHashSet26.add(new r5x0("status_unique_guid", true, rcc.b("guid"), rcc.b("ASC")));
        s5x0 s5x0Var57 = new s5x0("statuses", linkedHashMap57, p26, linkedHashSet26);
        s5x0 d57 = gkb1.d(oll0Var, "statuses");
        if (!s5x0Var57.equals(d57)) {
            return new kne0(false, smw0.i("statuses(com.yandex.messaging.core.db.users.UserStatusEntity).\n Expected:\n", s5x0Var57, "\n Found:\n", d57));
        }
        LinkedHashMap linkedHashMap58 = new LinkedHashMap();
        linkedHashMap58.put("id", new p5x0(1, "id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap58.put("text", new p5x0(0, "text", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap58.put("emoji", new p5x0(0, "emoji", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap58.put("availability", new p5x0(0, "availability", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap58.put("notificationMode", new p5x0(0, "notificationMode", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var58 = new s5x0("custom_statuses", linkedHashMap58, smw0.p(linkedHashMap58, "icon_name", new p5x0(0, "icon_name", BaseDatabaseHelper.TYPE_TEXT, null, false, 1)), new LinkedHashSet());
        s5x0 d58 = gkb1.d(oll0Var, "custom_statuses");
        if (!s5x0Var58.equals(d58)) {
            return new kne0(false, smw0.i("custom_statuses(com.yandex.messaging.core.db.users.CustomUserStatusEntity).\n Expected:\n", s5x0Var58, "\n Found:\n", d58));
        }
        LinkedHashMap linkedHashMap59 = new LinkedHashMap();
        linkedHashMap59.put("chat_internal_id", new p5x0(1, "chat_internal_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap59.put("events", new p5x0(0, "events", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var59 = new s5x0("chat_events", linkedHashMap59, smw0.p(linkedHashMap59, "version", new p5x0(0, "version", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d59 = gkb1.d(oll0Var, "chat_events");
        if (!s5x0Var59.equals(d59)) {
            return new kne0(false, smw0.i("chat_events(com.yandex.messaging.core.db.chats.ChatEventsEntity).\n Expected:\n", s5x0Var59, "\n Found:\n", d59));
        }
        LinkedHashMap linkedHashMap60 = new LinkedHashMap();
        linkedHashMap60.put("internal_chat_id", new p5x0(1, "internal_chat_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap60.put("user_id", new p5x0(2, "user_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet p27 = smw0.p(linkedHashMap60, "rights", new p5x0(0, "rights", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet27 = new LinkedHashSet();
        linkedHashSet27.add(new r5x0("index_member_rights_internal_chat_id", false, rcc.b("internal_chat_id"), rcc.b("ASC")));
        s5x0 s5x0Var60 = new s5x0("member_rights", linkedHashMap60, p27, linkedHashSet27);
        s5x0 d60 = gkb1.d(oll0Var, "member_rights");
        if (!s5x0Var60.equals(d60)) {
            return new kne0(false, smw0.i("member_rights(com.yandex.messaging.core.db.members.MemberRightsEntity).\n Expected:\n", s5x0Var60, "\n Found:\n", d60));
        }
        LinkedHashMap linkedHashMap61 = new LinkedHashMap();
        linkedHashMap61.put("organization_id", new p5x0(1, "organization_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var61 = new s5x0("main_folders", linkedHashMap61, smw0.p(linkedHashMap61, "excluded_folder_ids", new p5x0(0, "excluded_folder_ids", BaseDatabaseHelper.TYPE_TEXT, null, true, 1)), new LinkedHashSet());
        s5x0 d61 = gkb1.d(oll0Var, "main_folders");
        if (!s5x0Var61.equals(d61)) {
            return new kne0(false, smw0.i("main_folders(com.yandex.messaging.core.db.folders.MainFolderEntity).\n Expected:\n", s5x0Var61, "\n Found:\n", d61));
        }
        LinkedHashMap linkedHashMap62 = new LinkedHashMap();
        linkedHashMap62.put("folder_id", new p5x0(1, "folder_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap62.put("name", new p5x0(0, "name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap62.put("organization_id", new p5x0(2, "organization_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap62.put("sort_order", new p5x0(0, "sort_order", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap62.put("folder_icon", new p5x0(0, "folder_icon", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap62.put("included_chat_ids", new p5x0(0, "included_chat_ids", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet p28 = smw0.p(linkedHashMap62, "excluded_chat_ids", new p5x0(0, "excluded_chat_ids", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet linkedHashSet28 = new LinkedHashSet();
        linkedHashSet28.add(new r5x0("index_folders_organization_id", false, rcc.b("organization_id"), rcc.b("ASC")));
        s5x0 s5x0Var62 = new s5x0("folders", linkedHashMap62, p28, linkedHashSet28);
        s5x0 d62 = gkb1.d(oll0Var, "folders");
        if (!s5x0Var62.equals(d62)) {
            return new kne0(false, smw0.i("folders(com.yandex.messaging.core.db.folders.FolderEntity).\n Expected:\n", s5x0Var62, "\n Found:\n", d62));
        }
        LinkedHashMap linkedHashMap63 = new LinkedHashMap();
        linkedHashMap63.put("folder_id", new p5x0(1, "folder_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap63.put("organization_id", new p5x0(2, "organization_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap63.put("filter_id", new p5x0(3, "filter_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet p29 = smw0.p(linkedHashMap63, "inclusive", new p5x0(4, "inclusive", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        LinkedHashSet linkedHashSet29 = new LinkedHashSet();
        linkedHashSet29.add(new r5x0("index_folder_filter_cross_ref_filter_id", false, rcc.b("filter_id"), rcc.b("ASC")));
        s5x0 s5x0Var63 = new s5x0("folder_filter_cross_ref", linkedHashMap63, p29, linkedHashSet29);
        s5x0 d63 = gkb1.d(oll0Var, "folder_filter_cross_ref");
        if (!s5x0Var63.equals(d63)) {
            return new kne0(false, smw0.i("folder_filter_cross_ref(com.yandex.messaging.core.db.folders.FolderFilterCrossRefEntity).\n Expected:\n", s5x0Var63, "\n Found:\n", d63));
        }
        LinkedHashMap linkedHashMap64 = new LinkedHashMap();
        linkedHashMap64.put("filter_id", new p5x0(1, "filter_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet p30 = smw0.p(linkedHashMap64, "chat_id", new p5x0(2, "chat_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        LinkedHashSet linkedHashSet30 = new LinkedHashSet();
        linkedHashSet30.add(new r5x0("index_filter_chats_cross_ref_filter_id", false, rcc.b("filter_id"), rcc.b("ASC")));
        linkedHashSet30.add(new r5x0("index_filter_chats_cross_ref_chat_id", false, rcc.b("chat_id"), rcc.b("ASC")));
        s5x0 s5x0Var64 = new s5x0("filter_chats_cross_ref", linkedHashMap64, p30, linkedHashSet30);
        s5x0 d64 = gkb1.d(oll0Var, "filter_chats_cross_ref");
        if (!s5x0Var64.equals(d64)) {
            return new kne0(false, smw0.i("filter_chats_cross_ref(com.yandex.messaging.core.db.folders.FilterChatsCrossRefEntity).\n Expected:\n", s5x0Var64, "\n Found:\n", d64));
        }
        LinkedHashMap linkedHashMap65 = new LinkedHashMap();
        linkedHashMap65.put("filter_id", new p5x0(1, "filter_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap65.put("chat_types", new p5x0(0, "chat_types", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        s5x0 s5x0Var65 = new s5x0("filters", linkedHashMap65, smw0.p(linkedHashMap65, "namespaces", new p5x0(0, "namespaces", BaseDatabaseHelper.TYPE_TEXT, null, true, 1)), new LinkedHashSet());
        s5x0 d65 = gkb1.d(oll0Var, "filters");
        if (!s5x0Var65.equals(d65)) {
            return new kne0(false, smw0.i("filters(com.yandex.messaging.core.db.folders.FilterEntity).\n Expected:\n", s5x0Var65, "\n Found:\n", d65));
        }
        LinkedHashMap linkedHashMap66 = new LinkedHashMap();
        linkedHashMap66.put("row_id", new p5x0(1, "row_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap66.put("telemost_auto_status", new p5x0(0, "telemost_auto_status", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var66 = new s5x0("personal_preferences", linkedHashMap66, smw0.p(linkedHashMap66, "telemost_auto_status_notifications", new p5x0(0, "telemost_auto_status_notifications", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
        s5x0 d66 = gkb1.d(oll0Var, "personal_preferences");
        if (!s5x0Var66.equals(d66)) {
            return new kne0(false, smw0.i("personal_preferences(com.yandex.messaging.core.db.personal.PersonalPreferencesEntity).\n Expected:\n", s5x0Var66, "\n Found:\n", d66));
        }
        LinkedHashMap linkedHashMap67 = new LinkedHashMap();
        linkedHashMap67.put("user_id", new p5x0(1, "user_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        linkedHashMap67.put("loaded", new p5x0(0, "loaded", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        linkedHashMap67.put("descriptor", new p5x0(0, "descriptor", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
        s5x0 s5x0Var67 = new s5x0("localized_data", linkedHashMap67, smw0.p(linkedHashMap67, "localization_map", new p5x0(0, "localization_map", BaseDatabaseHelper.TYPE_TEXT, null, false, 1)), new LinkedHashSet());
        s5x0 d67 = gkb1.d(oll0Var, "localized_data");
        return !s5x0Var67.equals(d67) ? new kne0(false, smw0.i("localized_data(com.yandex.messaging.core.db.localization.UsersLocalizationEntity).\n Expected:\n", s5x0Var67, "\n Found:\n", d67)) : new kne0(true, (String) null);
    }

    @Override // defpackage.p2l
    public final void d(oll0 oll0Var) {
        switch (this.d) {
            case 0:
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `members` (`sort_order` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `internal_chat_id` INTEGER NOT NULL, `user_id` TEXT NOT NULL, `flags` INTEGER NOT NULL)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `members_chat_id` ON `members` (`internal_chat_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `chats_view` (`chat_internal_id` INTEGER NOT NULL, `chat_id` TEXT NOT NULL, `namespace` INTEGER, `url` TEXT, `unseen` INTEGER NOT NULL, `addressee_id` TEXT, `average_response_time` INTEGER, `first_unseen_row` INTEGER, `flags` INTEGER NOT NULL, `rights` INTEGER NOT NULL, `mute` INTEGER NOT NULL, `mute_mentions` INTEGER NOT NULL, `is_member` INTEGER NOT NULL, `is_blocked` INTEGER NOT NULL, `is_subscriber` INTEGER NOT NULL, `participants_count` INTEGER NOT NULL, `can_call` INTEGER NOT NULL, `is_admin` INTEGER NOT NULL, `is_phone_required_for_write` INTEGER NOT NULL, `current_profile_id` TEXT, `is_transient` INTEGER NOT NULL, `sort_time` INTEGER NOT NULL, `display_name` TEXT NOT NULL, `is_pinned` INTEGER NOT NULL, `is_hidden` INTEGER NOT NULL, `min_message_timestamp` INTEGER NOT NULL, `last_seq_no` INTEGER NOT NULL, `last_message_timestamp` INTEGER NOT NULL, `events` INTEGER NOT NULL, `has_guests` INTEGER NOT NULL, PRIMARY KEY(`chat_internal_id`))");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_chats_view_chat_id` ON `chats_view` (`chat_id`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_chats_view_namespace` ON `chats_view` (`namespace`)");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_chats_view_addressee_id` ON `chats_view` (`addressee_id`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_chats_view_is_hidden` ON `chats_view` (`is_hidden`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_chats_view_sort_time` ON `chats_view` (`sort_time` DESC)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `admins` (`sort_order` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `internal_chat_id` INTEGER NOT NULL, `user_id` TEXT NOT NULL)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `admins_chat_id` ON `admins` (`internal_chat_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `revisions` (`row_id` INTEGER, `cache_owner` TEXT, `contacts_last_version` INTEGER NOT NULL, `last_message_timestamp` INTEGER NOT NULL, `last_thread_message_timestamp` INTEGER NOT NULL, `max_role_version` INTEGER NOT NULL, `workspace_version` INTEGER, `max_history_version` INTEGER NOT NULL, PRIMARY KEY(`row_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `users_to_talk` (`user_id` TEXT NOT NULL, `org_id` INTEGER NOT NULL, `shown_name` TEXT NOT NULL COLLATE UNICODE, `has_private_chat` INTEGER NOT NULL, `has_contact` INTEGER NOT NULL, `user_search_key` TEXT NOT NULL, `deleted` INTEGER NOT NULL, PRIMARY KEY(`user_id`, `org_id`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `users_to_talk_shown_name_order` ON `users_to_talk` (`shown_name`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_users_to_talk_org_id` ON `users_to_talk` (`org_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `messages` (`row_id` INTEGER, `chat_internal_id` INTEGER NOT NULL, `message_history_id` INTEGER NOT NULL, `message_sequence_number` INTEGER NOT NULL, `message_prev_history_id` INTEGER NOT NULL, `msg_internal_id` INTEGER NOT NULL, `flags` INTEGER NOT NULL, `message_id` TEXT, `time` REAL NOT NULL, `author` TEXT NOT NULL, `data` TEXT, `custom_payload` TEXT, `reply_data` TEXT, `edit_time` INTEGER NOT NULL, `views_count` INTEGER NOT NULL, `forwards_count` INTEGER NOT NULL, `notification_meta` TEXT, PRIMARY KEY(`row_id`))");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `chat_internal_id_message_id_message_history_id_unique` ON `messages` (`chat_internal_id`, `message_id`, `message_history_id`)");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_messages_chat_internal_id_message_history_id` ON `messages` (`chat_internal_id` ASC, `message_history_id` DESC)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `messages_view` (`row_id` INTEGER, `chat_internal_id` INTEGER NOT NULL, `chat_id` TEXT NOT NULL, `message_history_id` INTEGER NOT NULL, `message_sequence_number` INTEGER NOT NULL, `message_previous_history_id` INTEGER NOT NULL, `msg_internal_id` INTEGER NOT NULL, `message_version` INTEGER NOT NULL, `flags` INTEGER NOT NULL, `message_id` TEXT, `time` REAL NOT NULL, `author` TEXT NOT NULL, `data` TEXT, `data_type` INTEGER, `custom_payload` TEXT, `reply_data` TEXT, `forwarded_author_id` TEXT, `host_message_history_id` INTEGER, `views_count` INTEGER NOT NULL, `original_message_chat_id` TEXT, `original_message_history_id` INTEGER, `fake_guid` TEXT, `forwards_count` INTEGER NOT NULL, `notification_meta` TEXT, `original_lang` TEXT, `translated_lang` TEXT, `translated_text` TEXT, `original_reply_lang` TEXT, `translated_reply_text` TEXT, `translated_suggests` TEXT, `forced_translated_text` TEXT, `forced_translated_reply_text` TEXT, PRIMARY KEY(`row_id`))");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_messages_view_chat_internal_id_message_history_id` ON `messages_view` (`chat_internal_id` ASC, `message_history_id` DESC)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `chats` (`chat_internal_id` INTEGER NOT NULL, `chat_id` TEXT NOT NULL, `create_time` REAL NOT NULL, `addressee_id` TEXT, `name` TEXT, `avatar_id` TEXT, `seen_marker` INTEGER, `owner_last_seen_sequence_number` INTEGER NOT NULL, `owner_seen_marker_version` INTEGER NOT NULL, `flags` INTEGER NOT NULL, `other_seen_marker` INTEGER, `version` INTEGER NOT NULL, `full_info_version` INTEGER NOT NULL, `invite_hash` TEXT, `description` TEXT, `alias` TEXT, `current_profile_id` TEXT, `is_transient` INTEGER NOT NULL, `min_message_timestamp` INTEGER, `parent_internal_id` INTEGER, `parent_message_timestamp` INTEGER, `last_timestamp` INTEGER, `last_seq_no` INTEGER, `partner_id` TEXT, `has_guests` INTEGER NOT NULL, PRIMARY KEY(`chat_internal_id`))");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `chat_unique_id` ON `chats` (`chat_id`)");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_chats_addressee_id` ON `chats` (`addressee_id`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_chats_invite_hash` ON `chats` (`invite_hash`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_chats_parent_internal_id` ON `chats` (`parent_internal_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `users` (`user_id` TEXT NOT NULL, `display_name` TEXT NOT NULL, `avatar_url` TEXT, `website` TEXT, `average_response_time` INTEGER, `shown_name` TEXT NOT NULL, `nickname` TEXT, `user_reduced_version` INTEGER, `version` INTEGER, `phone_id` TEXT, `contact_id` INTEGER, `lookup_id` TEXT, `user_search_key` TEXT NOT NULL, `robot` INTEGER NOT NULL, `cannot_be_blocked` INTEGER NOT NULL, `is_support_bot` INTEGER NOT NULL, `is_contact` INTEGER NOT NULL, `disable_privates` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `is_fake` INTEGER NOT NULL, PRIMARY KEY(`user_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `objects_to_share` (`row_id` INTEGER, `chat_id` TEXT, `user_id` TEXT, `org_id` INTEGER NOT NULL DEFAULT 0, `display_name` TEXT, `sort_time` INTEGER NOT NULL DEFAULT -1, PRIMARY KEY(`row_id`))");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_objects_to_share_chat_id_org_id` ON `objects_to_share` (`chat_id`, `org_id`)");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_objects_to_share_user_id_org_id` ON `objects_to_share` (`user_id`, `org_id`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_objects_to_share_chat_id` ON `objects_to_share` (`chat_id`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_objects_to_share_user_id` ON `objects_to_share` (`user_id`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_objects_to_share_org_id` ON `objects_to_share` (`org_id`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `objects_to_share_sort_time_name` ON `objects_to_share` (`sort_time` DESC, `display_name` ASC)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `pinned_chats` (`chat_id` TEXT NOT NULL, `chats_order` INTEGER NOT NULL, PRIMARY KEY(`chat_id`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `pinned_chat_order` ON `pinned_chats` (`chats_order`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `participants_count` (`chat_internal_id` INTEGER NOT NULL, `count` INTEGER NOT NULL, PRIMARY KEY(`chat_internal_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `pinned_messages` (`chat_internal_id` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `last_action_timestamp` INTEGER NOT NULL, PRIMARY KEY(`chat_internal_id`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_pinned_messages_last_action_timestamp` ON `pinned_messages` (`last_action_timestamp`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `saved_messages_view` (`chat_internal_id` INTEGER NOT NULL, `chat_id` TEXT NOT NULL, `unique_marker` INTEGER NOT NULL, PRIMARY KEY(`chat_internal_id`))");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_saved_messages_view_unique_marker` ON `saved_messages_view` (`unique_marker`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `unseen_view` (`row_id` INTEGER, `unseen` INTEGER NOT NULL, `unseen_show` INTEGER NOT NULL, `threads_unseen_show` INTEGER NOT NULL, PRIMARY KEY(`row_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `privacy` (`field_name` TEXT NOT NULL, `value` INTEGER, PRIMARY KEY(`field_name`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `local_hidden_private_chats_bucket` (`user_id` TEXT NOT NULL, `hide_timestamp` INTEGER NOT NULL, PRIMARY KEY(`user_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `user_sticker_packs` (`user_sticker_pack_order` INTEGER NOT NULL, `user_sticker_pack_id` TEXT NOT NULL, PRIMARY KEY(`user_sticker_pack_order`))");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_user_sticker_packs_user_sticker_pack_id` ON `user_sticker_packs` (`user_sticker_pack_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `restrictions` (`user_id` TEXT NOT NULL, `blacklisted` INTEGER NOT NULL, PRIMARY KEY(`user_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `personal_user_info` (`row_id` INTEGER NOT NULL, `user_id` TEXT NOT NULL, `version` INTEGER NOT NULL, `avatar_url` TEXT, `display_name` TEXT NOT NULL, `nickname` TEXT, `phone` TEXT, `registration_status` TEXT NOT NULL, `is_empty` INTEGER NOT NULL, `is_corporate` INTEGER NOT NULL, `is_onboarded` INTEGER NOT NULL, `needs_migration_onboarding` INTEGER NOT NULL, `account_type` TEXT, PRIMARY KEY(`row_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `chat_metadata` (`chat_internal_id` INTEGER NOT NULL, `chatbar` BLOB, `calls_settings` BLOB, `complain_action` BLOB, `miniapp_url` TEXT, `allow_unsafe_miniapp` INTEGER, `view_importants_list` INTEGER, PRIMARY KEY(`chat_internal_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `user_metadata` (`user_guid` TEXT NOT NULL, `chatbar` BLOB, `calls_settings` BLOB, `complain_action` BLOB, `view_importants_list` INTEGER, PRIMARY KEY(`user_guid`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `bucket_version` (`bucket_name` TEXT NOT NULL, `version` INTEGER NOT NULL, PRIMARY KEY(`bucket_name`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `remote_contacts` (`row_id` INTEGER, `remotes_user_id` TEXT NOT NULL, `remotes_phone_id` TEXT NOT NULL, `remotes_deleted` INTEGER NOT NULL, `remotes_contact_name` TEXT, PRIMARY KEY(`row_id`))");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `remotes_user_id_index` ON `remote_contacts` (`remotes_user_id`)");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `remotes_phone_id_index` ON `remote_contacts` (`remotes_phone_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `chat_preferences` (`chat_id` TEXT NOT NULL, `not_spam` INTEGER NOT NULL, `approved_by_me` INTEGER NOT NULL, PRIMARY KEY(`chat_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `message_moderation_user_choice` (`chat_id` TEXT NOT NULL, `message_timestamp` INTEGER NOT NULL, `choice` INTEGER NOT NULL, PRIMARY KEY(`chat_id`, `message_timestamp`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `persistent_queue` (`order_value` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `prefix` TEXT NOT NULL, `key` TEXT NOT NULL, `value` BLOB NOT NULL)");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_persistent_queue_prefix_key` ON `persistent_queue` (`prefix`, `key`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `sticker_user_packs` (`sticker_user_pack_order` INTEGER NOT NULL, `sticker_user_pack_id` TEXT NOT NULL, PRIMARY KEY(`sticker_user_pack_order`))");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_sticker_user_packs_sticker_user_pack_id` ON `sticker_user_packs` (`sticker_user_pack_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `sticker_list` (`sticker_id` TEXT NOT NULL, `sticker_pack_id` TEXT NOT NULL, `sticker_original_pack_id` TEXT NOT NULL, `sticker_text` TEXT COLLATE UNICODE, `sticker_position` INTEGER NOT NULL, `sticker_added_timestamp` INTEGER, PRIMARY KEY(`sticker_id`, `sticker_pack_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `sticker_pack_list` (`row_id` INTEGER, `sticker_pack_id` TEXT NOT NULL, `sticker_pack_cover_id` TEXT, `sticker_pack_title` TEXT NOT NULL, `sticker_pack_description` TEXT, `is_local_pack` INTEGER NOT NULL, PRIMARY KEY(`row_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `sticker_panel_sticker_view` (`sticker_item_position` INTEGER NOT NULL, `sticker_pack_id` TEXT NOT NULL, `sticker_original_pack_id` TEXT NOT NULL, `sticker_pack_position` INTEGER NOT NULL, `sticker_header` TEXT, `sticker_text` TEXT, `sticker_id` TEXT, PRIMARY KEY(`sticker_item_position`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `sticker_panel_pack_view` (`sticker_item_position` INTEGER NOT NULL, `sticker_pack_cover_id` TEXT NOT NULL, `sticker_pack_title` TEXT NOT NULL, `sticker_pack_id` TEXT NOT NULL, `sticker_pack_description` TEXT, `sticker_item_position_in_panel` INTEGER NOT NULL, PRIMARY KEY(`sticker_item_position`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `user_roles` (`chat_internal_id` INTEGER NOT NULL, `version` INTEGER NOT NULL, `role` INTEGER NOT NULL, `rights` INTEGER NOT NULL, PRIMARY KEY(`chat_internal_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `chat_notifications` (`chat_internal_id` INTEGER NOT NULL, `last_shown_message_timestamp` INTEGER NOT NULL, PRIMARY KEY(`chat_internal_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `local_contacts` (`locals_upload_id` TEXT NOT NULL, `locals_system_id` INTEGER NOT NULL, `locals_uploaded` INTEGER NOT NULL, `locals_display_name` TEXT, `locals_phone` TEXT NOT NULL, `locals_phone_id` TEXT, `locals_last_time_contacted` INTEGER NOT NULL, `locals_dirty` INTEGER NOT NULL, `locals_deleted` INTEGER NOT NULL, `locals_lookup_id` TEXT NOT NULL, PRIMARY KEY(`locals_upload_id`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `idx_local_contacts_phone_id` ON `local_contacts` (`locals_phone_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `pending_message_to_chat_request` (`message_order` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `message_chat_request_id` TEXT NOT NULL, `message_id` TEXT NOT NULL, `message_internal_id` INTEGER NOT NULL, `message_time` REAL NOT NULL, `message_data` TEXT NOT NULL, `message_attachment_uri` TEXT, `message_attachment_uris` TEXT, `message_force_as_file` INTEGER NOT NULL DEFAULT 0, `message_existing_attachments` TEXT, `message_voice_file_uri` TEXT, `message_payload` TEXT, `message_mentioned_guids` TEXT, `message_is_paused` INTEGER NOT NULL DEFAULT 0, `chat_source` TEXT NOT NULL, `message_forwards` TEXT, `is_starred` INTEGER NOT NULL DEFAULT 0, `forced_translation` TEXT, `is_silent` INTEGER NOT NULL DEFAULT 0, `quoted_text` TEXT)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `pending_chat_requests` (`chat_request_id` TEXT NOT NULL, `chat_request_json` TEXT NOT NULL, PRIMARY KEY(`chat_request_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `last_message_view` (`unique_marker` INTEGER NOT NULL, `chat_id` TEXT NOT NULL, PRIMARY KEY(`unique_marker`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `cache_timeline_versions` (`chat_internal_id` INTEGER NOT NULL, `timeline_version` INTEGER NOT NULL, PRIMARY KEY(`chat_internal_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `chat_muting` (`chat_id` TEXT NOT NULL, `mute` INTEGER NOT NULL, `mute_mentions` INTEGER NOT NULL, `version` INTEGER, PRIMARY KEY(`chat_id`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `chat_muting_chat_id` ON `chat_muting` (`chat_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `cache_chat_edit_history_timestamps` (`chat_internal_id` INTEGER NOT NULL, `edit_history_server_max_timestamp` INTEGER NOT NULL, `edit_history_client_max_timestamp` INTEGER NOT NULL, PRIMARY KEY(`chat_internal_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `hidden_namespaces` (`namespace` INTEGER NOT NULL, PRIMARY KEY(`namespace`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `no_phone_namespaces` (`namespace` INTEGER NOT NULL, PRIMARY KEY(`namespace`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `stable_chat_internal_id` (`id` TEXT NOT NULL, `internal_id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `internal_id` (`row_id` INTEGER, `next_internal_id` INTEGER NOT NULL, PRIMARY KEY(`row_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `pending_poll_votes` (`message_timestamp` INTEGER NOT NULL, `chat_id` TEXT NOT NULL, `choices` INTEGER NOT NULL, `operation_type` INTEGER NOT NULL, `forward_message_timestamp` INTEGER, `forward_chat_id` TEXT, PRIMARY KEY(`message_timestamp`))");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `message_timestamp_chat_id_unique` ON `pending_poll_votes` (`message_timestamp`, `chat_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `personal_mentions` (`row_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chat_id` TEXT NOT NULL, `message_timestamp` INTEGER NOT NULL, `is_thread` INTEGER NOT NULL)");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `chat_id_message_timestamp_unique` ON `personal_mentions` (`chat_id`, `message_timestamp`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `chat_id_is_thread` ON `personal_mentions` (`is_thread`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `organizations` (`organization_id` INTEGER NOT NULL, `organization_name` TEXT NOT NULL, `registration_status` TEXT NOT NULL, `is_public` INTEGER NOT NULL, `is_guest` INTEGER NOT NULL, `organization_rights` INTEGER NOT NULL, `disabled` INTEGER NOT NULL, PRIMARY KEY(`organization_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `user_employee` (`user_id` TEXT NOT NULL, `organization_id` INTEGER NOT NULL, `organization_name` TEXT, `department_name` TEXT, `position` TEXT, `is_guest` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `guest_organization_name` TEXT, `display_name` TEXT, PRIMARY KEY(`user_id`, `organization_id`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_user_employee_organization_id` ON `user_employee` (`organization_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `chat_organization_cross_ref` (`chat_internal_id` INTEGER NOT NULL, `organization_id` INTEGER NOT NULL, PRIMARY KEY(`chat_internal_id`, `organization_id`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_chat_organization_cross_ref_organization_id` ON `chat_organization_cross_ref` (`organization_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `user_contact_table` (`row_id` INTEGER, `user_id` TEXT NOT NULL, `organization_id` INTEGER NOT NULL, `type` TEXT NOT NULL, `value` TEXT NOT NULL, `is_legal` INTEGER NOT NULL, PRIMARY KEY(`row_id`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_user_contact_table_user_id_organization_id` ON `user_contact_table` (`user_id`, `organization_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `threads_view` (`thread_internal_id` INTEGER NOT NULL, `thread_id` TEXT NOT NULL, `unseen` INTEGER NOT NULL, `first_unseen_row` INTEGER, `is_hidden` INTEGER NOT NULL, `is_member` INTEGER NOT NULL, `sort_time` INTEGER NOT NULL, `parent_internal_id` INTEGER NOT NULL, `parent_message_timestamp` INTEGER NOT NULL, PRIMARY KEY(`thread_internal_id`))");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_threads_view_thread_id` ON `threads_view` (`thread_id`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_threads_view_sort_time` ON `threads_view` (`sort_time` DESC)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_threads_view_is_hidden` ON `threads_view` (`is_hidden`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_threads_view_parent_internal_id_parent_message_timestamp` ON `threads_view` (`parent_internal_id`, `parent_message_timestamp`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `threads_messages_view` (`rowid` INTEGER, `messages_view_history_id` INTEGER NOT NULL, `thread_internal_id` INTEGER NOT NULL, PRIMARY KEY(`rowid`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_threads_messages_view_thread_internal_id` ON `threads_messages_view` (`thread_internal_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `message_translations` (`row_id` INTEGER, `chat_internal_id` INTEGER NOT NULL, `message_history_id` INTEGER NOT NULL, `version` INTEGER NOT NULL, `original_lang` TEXT NOT NULL, `translated_lang` TEXT NOT NULL, `translated_text` TEXT NOT NULL, `translated_suggests` TEXT, PRIMARY KEY(`row_id`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_message_translations_chat_internal_id_message_history_id_version` ON `message_translations` (`chat_internal_id`, `message_history_id`, `version`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `chat_translations` (`chat_internal_id` INTEGER NOT NULL, `translation_lang` TEXT, PRIMARY KEY(`chat_internal_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `chat_miniapp` (`chat_id` TEXT NOT NULL, `miniapp_url` TEXT, `trusted` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`chat_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `statuses` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `guid` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `availability` INTEGER NOT NULL, `notificationMode` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `custom_text` TEXT, `custom_emoji` TEXT, `custom_icon` TEXT, `locales` TEXT)");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `status_unique_guid` ON `statuses` (`guid`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `custom_statuses` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `text` TEXT NOT NULL, `emoji` TEXT NOT NULL, `availability` INTEGER NOT NULL, `notificationMode` INTEGER NOT NULL, `icon_name` TEXT)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `chat_events` (`chat_internal_id` INTEGER NOT NULL, `events` INTEGER NOT NULL, `version` INTEGER NOT NULL, PRIMARY KEY(`chat_internal_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `member_rights` (`internal_chat_id` INTEGER NOT NULL, `user_id` TEXT NOT NULL, `rights` INTEGER NOT NULL, PRIMARY KEY(`internal_chat_id`, `user_id`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_member_rights_internal_chat_id` ON `member_rights` (`internal_chat_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `main_folders` (`organization_id` INTEGER NOT NULL, `excluded_folder_ids` TEXT NOT NULL, PRIMARY KEY(`organization_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `folders` (`folder_id` TEXT NOT NULL, `name` TEXT NOT NULL, `organization_id` INTEGER NOT NULL, `sort_order` INTEGER NOT NULL, `folder_icon` INTEGER NOT NULL, `included_chat_ids` TEXT NOT NULL, `excluded_chat_ids` TEXT NOT NULL, PRIMARY KEY(`folder_id`, `organization_id`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_folders_organization_id` ON `folders` (`organization_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `folder_filter_cross_ref` (`folder_id` TEXT NOT NULL, `organization_id` INTEGER NOT NULL, `filter_id` TEXT NOT NULL, `inclusive` INTEGER NOT NULL, PRIMARY KEY(`folder_id`, `organization_id`, `filter_id`, `inclusive`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_folder_filter_cross_ref_filter_id` ON `folder_filter_cross_ref` (`filter_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `filter_chats_cross_ref` (`filter_id` TEXT NOT NULL, `chat_id` TEXT NOT NULL, PRIMARY KEY(`filter_id`, `chat_id`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_filter_chats_cross_ref_filter_id` ON `filter_chats_cross_ref` (`filter_id`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_filter_chats_cross_ref_chat_id` ON `filter_chats_cross_ref` (`chat_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `filters` (`filter_id` TEXT NOT NULL, `chat_types` TEXT NOT NULL, `namespaces` TEXT NOT NULL, PRIMARY KEY(`filter_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `personal_preferences` (`row_id` INTEGER NOT NULL, `telemost_auto_status` INTEGER NOT NULL, `telemost_auto_status_notifications` INTEGER NOT NULL, PRIMARY KEY(`row_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `localized_data` (`user_id` TEXT NOT NULL, `loaded` INTEGER NOT NULL, `descriptor` TEXT, `localization_map` TEXT, PRIMARY KEY(`user_id`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                vez0.s(oll0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1095d3a8cabd2158674592de8dda9e23')");
                break;
            case 1:
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `exact_time_job` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `tag` TEXT NOT NULL, `time` INTEGER NOT NULL, `actions` TEXT NOT NULL, `network_criterion` TEXT NOT NULL)");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_exact_time_job_tag` ON `exact_time_job` (`tag`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                vez0.s(oll0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3bf4212879ac86c9040df3d3a8e41149')");
                break;
            case 2:
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `experiments` (`experiment_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `data` TEXT)");
                vez0.s(oll0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `exp_unique_name` ON `experiments` (`name`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                vez0.s(oll0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e3b684bbd4064478fab2fb8e1099074c')");
                break;
            default:
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `explorer_discovered_hex` (`hexId` INTEGER NOT NULL, `unlockedAt` INTEGER NOT NULL, `isConfirmed` INTEGER NOT NULL, `isViewed` INTEGER NOT NULL, PRIMARY KEY(`hexId`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                vez0.s(oll0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f2ad1ec35c783aedf4fda88fc8e2acad')");
                break;
        }
    }

    @Override // defpackage.p2l
    public final void e(oll0 oll0Var) {
        switch (this.d) {
            case 0:
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `members`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `chats_view`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `admins`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `revisions`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `users_to_talk`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `messages`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `messages_view`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `chats`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `users`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `objects_to_share`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `pinned_chats`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `participants_count`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `pinned_messages`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `saved_messages_view`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `unseen_view`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `privacy`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `local_hidden_private_chats_bucket`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `user_sticker_packs`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `restrictions`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `personal_user_info`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `chat_metadata`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `user_metadata`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `bucket_version`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `remote_contacts`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `chat_preferences`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `message_moderation_user_choice`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `persistent_queue`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `sticker_user_packs`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `sticker_list`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `sticker_pack_list`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `sticker_panel_sticker_view`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `sticker_panel_pack_view`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `user_roles`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `chat_notifications`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `local_contacts`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `pending_message_to_chat_request`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `pending_chat_requests`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `last_message_view`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `cache_timeline_versions`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `chat_muting`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `cache_chat_edit_history_timestamps`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `hidden_namespaces`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `no_phone_namespaces`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `stable_chat_internal_id`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `internal_id`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `pending_poll_votes`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `personal_mentions`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `organizations`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `user_employee`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `chat_organization_cross_ref`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `user_contact_table`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `threads_view`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `threads_messages_view`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `message_translations`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `chat_translations`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `chat_miniapp`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `statuses`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `custom_statuses`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `chat_events`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `member_rights`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `main_folders`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `folders`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `folder_filter_cross_ref`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `filter_chats_cross_ref`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `filters`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `personal_preferences`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `localized_data`");
                break;
            case 1:
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `exact_time_job`");
                break;
            case 2:
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `experiments`");
                break;
            default:
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `explorer_discovered_hex`");
                break;
        }
    }

    @Override // defpackage.p2l
    public final void i() {
        int i = this.d;
    }

    @Override // defpackage.p2l
    public final void j(oll0 oll0Var) {
        int i = this.d;
        RoomDatabase roomDatabase = this.e;
        switch (i) {
            case 0:
                ((AppDatabaseRoom_Impl) roomDatabase).L0(oll0Var);
                break;
            case 1:
                ((ExactTimeJobDatabase_Impl) roomDatabase).L0(oll0Var);
                break;
            case 2:
                ((ExperimentsDatabaseRoom_Impl) roomDatabase).L0(oll0Var);
                break;
            default:
                ((ExplorerDatabase_Impl) roomDatabase).L0(oll0Var);
                break;
        }
    }

    @Override // defpackage.p2l
    public final void k() {
        int i = this.d;
    }

    @Override // defpackage.p2l
    public final void l(oll0 oll0Var) {
        switch (this.d) {
            case 0:
                sub1.d(oll0Var);
                break;
            case 1:
                sub1.d(oll0Var);
                break;
            case 2:
                sub1.d(oll0Var);
                break;
            default:
                sub1.d(oll0Var);
                break;
        }
    }

    @Override // defpackage.p2l
    public final kne0 m(oll0 oll0Var) {
        switch (this.d) {
            case 0:
                break;
            case 1:
                HashMap hashMap = new HashMap(5);
                hashMap.put("id", new p5x0(1, "id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                hashMap.put("tag", new p5x0(0, "tag", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                hashMap.put(RemoteBioParameters.TIME, new p5x0(0, RemoteBioParameters.TIME, BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                hashMap.put("actions", new p5x0(0, "actions", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                hashMap.put("network_criterion", new p5x0(0, "network_criterion", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new r5x0("index_exact_time_job_tag", true, Arrays.asList("tag"), Arrays.asList("ASC")));
                s5x0 s5x0Var = new s5x0("exact_time_job", hashMap, hashSet, hashSet2);
                s5x0 d = gkb1.d(oll0Var, "exact_time_job");
                if (!s5x0Var.equals(d)) {
                    break;
                } else {
                    break;
                }
            case 2:
                HashMap hashMap2 = new HashMap(3);
                hashMap2.put("experiment_id", new p5x0(1, "experiment_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                hashMap2.put("name", new p5x0(0, "name", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
                hashMap2.put(Constants.KEY_DATA, new p5x0(0, Constants.KEY_DATA, BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new r5x0("exp_unique_name", true, Arrays.asList("name"), Arrays.asList("ASC")));
                s5x0 s5x0Var2 = new s5x0("experiments", hashMap2, hashSet3, hashSet4);
                s5x0 d2 = gkb1.d(oll0Var, "experiments");
                if (!s5x0Var2.equals(d2)) {
                    break;
                } else {
                    break;
                }
            default:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("hexId", new p5x0(1, "hexId", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                linkedHashMap.put("unlockedAt", new p5x0(0, "unlockedAt", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                linkedHashMap.put("isConfirmed", new p5x0(0, "isConfirmed", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                s5x0 s5x0Var3 = new s5x0("explorer_discovered_hex", linkedHashMap, smw0.p(linkedHashMap, "isViewed", new p5x0(0, "isViewed", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
                s5x0 d3 = gkb1.d(oll0Var, "explorer_discovered_hex");
                if (!s5x0Var3.equals(d3)) {
                    break;
                } else {
                    break;
                }
        }
        return new kne0(true, (String) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt2(ExactTimeJobDatabase_Impl exactTimeJobDatabase_Impl) {
        super(1, "3bf4212879ac86c9040df3d3a8e41149", "80719159e8c87966190d225e9ddd97ed");
        this.e = exactTimeJobDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt2(ExplorerDatabase_Impl explorerDatabase_Impl) {
        super(1, "f2ad1ec35c783aedf4fda88fc8e2acad", "a661ea543f3ccae269bfd73562da34e3");
        this.e = explorerDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt2(ExperimentsDatabaseRoom_Impl experimentsDatabaseRoom_Impl) {
        super(3, "e3b684bbd4064478fab2fb8e1099074c", "8d44737a5d0758130e8054be11be53ac");
        this.e = experimentsDatabaseRoom_Impl;
    }
}
