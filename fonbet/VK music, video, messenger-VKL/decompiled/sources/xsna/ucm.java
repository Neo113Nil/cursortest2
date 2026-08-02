package xsna;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteStatement;
import kotlin.Lazy;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: DialogContentWriter.kt */
/* loaded from: classes2.dex */
public final class ucm implements jcm {
    public static final ucm a = new ucm();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogContentWriter.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BAR_BACKGROUND;
        public static final a BAR_BUTTONS;
        public static final a BAR_CAN_HIDE;
        public static final a BAR_CONVERSATION_BUTTONS;
        public static final a BAR_CONVERSATION_CONTENT;
        public static final a BAR_CONVERSATION_ID;
        public static final a BAR_CONVERSATION_IMAGEURL;
        public static final a BAR_CONVERSATION_SUBTITLE;
        public static final a BAR_CONVERSATION_TITLE;
        public static final a BAR_CONVERSATION_TYPE;
        public static final a BAR_EXISTS;
        public static final a BAR_HIDDEN_LOCALLY;
        public static final a BAR_ICON;
        public static final a BAR_ICON_CENTERED;
        public static final a BAR_ICON_SIZE;
        public static final a BAR_LEGO_ICON;
        public static final a BAR_NAME;
        public static final a BAR_PAYLOAD;
        public static final a BAR_TEXT;
        public static final a BAR_TITLE;
        public static final a BUSINESS_NOTIFY_INFO_COUNT_UNREAD;
        public static final a BUSINESS_NOTIFY_INFO_DIALOG_ID;
        public static final a BUSINESS_NOTIFY_INFO_LAST_MSG_CNV_ID;
        public static final a BUSINESS_NOTIFY_INFO_VISIBLE;
        public static final a CAN_PROMO_GIFTS;
        public static final a CAN_RECEIVE_MONEY;
        public static final a CAN_SEND_MONEY;
        public static final a CHAT_PERMISSIONS_EXISTS;
        public static final a CHAT_PERMISSIONS_WHO_CAN_CALL;
        public static final a CHAT_PERMISSIONS_WHO_CAN_CHANGE_ADMINS;
        public static final a CHAT_PERMISSIONS_WHO_CAN_CHANGE_INFO;
        public static final a CHAT_PERMISSIONS_WHO_CAN_CHANGE_PIN;
        public static final a CHAT_PERMISSIONS_WHO_CAN_CHANGE_THEME;
        public static final a CHAT_PERMISSIONS_WHO_CAN_INVITE;
        public static final a CHAT_PERMISSIONS_WHO_CAN_SEE_INVITE_LINK;
        public static final a CHAT_PERMISSIONS_WHO_CAN_USE_MASS_MENTIONS;
        public static final a CHAT_SETTINGS_ADMINS;
        public static final a CHAT_SETTINGS_AVATAR;
        public static final a CHAT_SETTINGS_CAN_CALL;
        public static final a CHAT_SETTINGS_CAN_CHANGE_INFO;
        public static final a CHAT_SETTINGS_CAN_CHANGE_OWNER;
        public static final a CHAT_SETTINGS_CAN_CHANGE_PINNED_MSG;
        public static final a CHAT_SETTINGS_CAN_CHANGE_POPUP_STICKERS_AUTOPLAY;
        public static final a CHAT_SETTINGS_CAN_CHANGE_SERVICE_TYPE;
        public static final a CHAT_SETTINGS_CAN_CHANGE_THEME;
        public static final a CHAT_SETTINGS_CAN_COPY;
        public static final a CHAT_SETTINGS_CAN_DISABLE_FORWARD_MESSAGES;
        public static final a CHAT_SETTINGS_CAN_DISABLE_SERVICE_MESSAGES;
        public static final a CHAT_SETTINGS_CAN_FORWARD_MESSAGES;
        public static final a CHAT_SETTINGS_CAN_INVITE;
        public static final a CHAT_SETTINGS_CAN_MODERATE;
        public static final a CHAT_SETTINGS_CAN_PROMOTE_USERS;
        public static final a CHAT_SETTINGS_CAN_SEE_INVITE_LINK;
        public static final a CHAT_SETTINGS_CAN_SEND_REACTIONS;
        public static final a CHAT_SETTINGS_CAN_USE_MASS_MENTIONS;
        public static final a CHAT_SETTINGS_CASPER_CHAT_LINK;
        public static final a CHAT_SETTINGS_DONUT_OWNER_ID;
        public static final a CHAT_SETTINGS_EXISTS;
        public static final a CHAT_SETTINGS_IS_CASPER;
        public static final a CHAT_SETTINGS_IS_CHANNEL;
        public static final a CHAT_SETTINGS_IS_DISABLE_POPUP_STICKERS_AUTOPLAY;
        public static final a CHAT_SETTINGS_IS_DONUT;
        public static final a CHAT_SETTINGS_IS_INCOGNITO;
        public static final a CHAT_SETTINGS_IS_KICKED;
        public static final a CHAT_SETTINGS_IS_LEFT;
        public static final a CHAT_SETTINGS_IS_SERVICE;
        public static final a CHAT_SETTINGS_IS_SERVICE_MESSAGES_DISABLED;
        public static final a CHAT_SETTINGS_IS_WRITING_DISABLED;
        public static final a CHAT_SETTINGS_MEMBERS_COUNT;
        public static final a CHAT_SETTINGS_OWNER_ID;
        public static final a CHAT_SETTINGS_OWNER_TYPE;
        public static final a CHAT_SETTINGS_SHORT_POLL_REACTIONS;
        public static final a CHAT_SETTINGS_TITLE;
        public static final a CHAT_SETTINGS_WRITING_DISABLED_UNTIL;
        public static final a COUNT_UNREAD;
        public static final a COUNT_UNREAD_LOCAL;
        public static final C3798a Companion;
        public static final a DRAFT_MSG;
        public static final a EXPIRE_MSG_CNV_IDS;
        public static final a FLAGS;
        public static final a GROUP_CALL_BANNER_HIDDEN_LOCALLY;
        public static final a GROUP_CALL_CAN_FINISH_CALL;
        public static final a GROUP_CALL_JOIN_LINK;
        public static final a GROUP_CALL_PARTICIPANTS;
        public static final a GROUP_CALL_VK_JOIN_LINK;
        public static final a ID;
        public static final a IS_ARCHIVED;
        public static final a IS_DEAD;
        public static final a IS_NEW;
        public static final a IS_PROMO;
        public static final a KEYBOARD_AUTHOR_ID;
        public static final a KEYBOARD_AUTHOR_TYPE;
        public static final a KEYBOARD_BUTTONS;
        public static final a KEYBOARD_COLUMN_COUNT;
        public static final a KEYBOARD_EXISTS;
        public static final a KEYBOARD_ONE_TIME;
        public static final a KEYBOARD_VISIBLE;
        public static final a LAST_MSG_CNV_ID;
        public static final a LOCALLY_READ_REACTIONS;
        public static final a MARKED_AS_UNREAD_LOCAL;
        public static final a MARKED_AS_UNREAD_SERVER;
        public static final a MSG_REQUEST_DATE;
        public static final a MSG_REQUEST_INVITER_ID;
        public static final a MSG_REQUEST_INVITER_TYPE;
        public static final a MSG_REQUEST_STATUS;
        public static final a MSG_REQUEST_STATUS_DESIRED;
        public static final a MSG_REQUEST_STATUS_PENDING;
        public static final a PAYLOAD;
        public static final a PHASE_ID;
        public static final a PINNED_CAROUSEL;
        public static final a PINNED_MSG_ATTACHES;
        public static final a PINNED_MSG_BODY;
        public static final a PINNED_MSG_BODY_FORMAT;
        public static final a PINNED_MSG_CNV_MSG_ID;
        public static final a PINNED_MSG_EXISTS;
        public static final a PINNED_MSG_FROM_ID;
        public static final a PINNED_MSG_FROM_TYPE;
        public static final a PINNED_MSG_IS_UNAVAILABLE;
        public static final a PINNED_MSG_NESTED;
        public static final a PINNED_MSG_TIME;
        public static final a PINNED_MSG_TITLE;
        public static final a PINNED_MSG_VISIBLE;
        public static final a PUSH_LOCAL_DISABLED_UNTIL;
        public static final a PUSH_LOCAL_IS_USE_SOUND;
        public static final a PUSH_SERVER_DISABLED_UNTIL;
        public static final a PUSH_SERVER_IS_USE_SOUND;
        public static final a READ_TILL_IN_MSG_CNV_ID;
        public static final a READ_TILL_IN_MSG_CNV_ID_LOCAL;
        public static final a READ_TILL_OUT_MSG_CNV_ID;
        public static final a SORT_ID_LOCAL;
        public static final a SORT_ID_SERVER;
        public static final a SPAM_EXPIRATION;
        public static final a TAGS;
        public static final a THEME_ID;
        public static final a TIMESTAMP;
        public static final a TRANSITION_DATA;
        public static final a TYPE;
        public static final a UNREAD_MENTION_MSG_CNV_IDS;
        public static final a UNREAD_REACTIONS;
        public static final a VERSION;
        public static final a WEIGHT;
        public static final a WRITE_PERMISSION;
        public static final a WRITE_RESTRICTED_TILL;
        private static final a[] allColumns;
        private static final Lazy<String> rawStatement$delegate;
        private final yzs<SQLiteStatement, com.vk.im.engine.models.dialogs.b, Integer, s3q0> binding;
        private final String columnName;

        /* compiled from: DialogContentWriter.kt */
        /* renamed from: xsna.ucm$a$a, reason: collision with other inner class name */
        public static final class C3798a {
        }

        static {
            a aVar = new a("ID", 0, "id", new kbi(3));
            ID = aVar;
            a aVar2 = new a(CredentialProviderBaseController.TYPE_TAG, 1, "type", new mgi(1));
            TYPE = aVar2;
            a aVar3 = new a("SORT_ID_SERVER", 2, "sort_id_server", new dli(2));
            SORT_ID_SERVER = aVar3;
            a aVar4 = new a("SORT_ID_LOCAL", 3, "sort_id_local", new ybi(3));
            SORT_ID_LOCAL = aVar4;
            a aVar5 = new a("WEIGHT", 4, "weight", new rce(5));
            WEIGHT = aVar5;
            a aVar6 = new a("READ_TILL_IN_MSG_CNV_ID", 5, "read_till_in_msg_cnv_id", new pm(3));
            READ_TILL_IN_MSG_CNV_ID = aVar6;
            a aVar7 = new a("READ_TILL_OUT_MSG_CNV_ID", 6, "read_till_out_msg_cnv_id", new dli(1));
            READ_TILL_OUT_MSG_CNV_ID = aVar7;
            a aVar8 = new a("LAST_MSG_CNV_ID", 7, "last_msg_cnv_id", new xgi(1));
            LAST_MSG_CNV_ID = aVar8;
            a aVar9 = new a("COUNT_UNREAD", 8, "count_unread", new hci(2));
            COUNT_UNREAD = aVar9;
            a aVar10 = new a("READ_TILL_IN_MSG_CNV_ID_LOCAL", 9, "read_till_in_msg_cnv_id_local", new tei(2));
            READ_TILL_IN_MSG_CNV_ID_LOCAL = aVar10;
            a aVar11 = new a("COUNT_UNREAD_LOCAL", 10, "count_unread_local", new ybi(2));
            COUNT_UNREAD_LOCAL = aVar11;
            a aVar12 = new a("MARKED_AS_UNREAD_SERVER", 11, "marked_as_unread_server", new gfi(2));
            MARKED_AS_UNREAD_SERVER = aVar12;
            a aVar13 = new a("MARKED_AS_UNREAD_LOCAL", 12, "marked_as_unread_local", new ux6(4));
            MARKED_AS_UNREAD_LOCAL = aVar13;
            a aVar14 = new a("PUSH_SERVER_IS_USE_SOUND", 13, "push_server_is_use_sound", new qki(2));
            PUSH_SERVER_IS_USE_SOUND = aVar14;
            a aVar15 = new a("PUSH_SERVER_DISABLED_UNTIL", 14, "push_server_disabled_until", new qdi(2));
            PUSH_SERVER_DISABLED_UNTIL = aVar15;
            a aVar16 = new a("PUSH_LOCAL_IS_USE_SOUND", 15, "push_local_is_use_sound", new pmi(1));
            PUSH_LOCAL_IS_USE_SOUND = aVar16;
            a aVar17 = new a("PUSH_LOCAL_DISABLED_UNTIL", 16, "push_local_disabled_until", new sii(2));
            PUSH_LOCAL_DISABLED_UNTIL = aVar17;
            a aVar18 = new a("WRITE_PERMISSION", 17, "write_permission", new gbi(4));
            WRITE_PERMISSION = aVar18;
            a aVar19 = new a("WRITE_RESTRICTED_TILL", 18, "write_restricted_till", new qmi(1));
            WRITE_RESTRICTED_TILL = aVar19;
            a aVar20 = new a("CAN_SEND_MONEY", 19, "can_send_money", new smi(1));
            CAN_SEND_MONEY = aVar20;
            a aVar21 = new a("CAN_RECEIVE_MONEY", 20, "can_receive_money", new jbi(5));
            CAN_RECEIVE_MONEY = aVar21;
            a aVar22 = new a("PINNED_MSG_VISIBLE", 21, "pinned_msg_visible", new kbi(4));
            PINNED_MSG_VISIBLE = aVar22;
            a aVar23 = new a("PINNED_MSG_EXISTS", 22, "pinned_msg_exists", new mbi(4));
            PINNED_MSG_EXISTS = aVar23;
            a aVar24 = new a("PINNED_MSG_CNV_MSG_ID", 23, "pinned_msg_cnv_msg_id", new zii(2));
            PINNED_MSG_CNV_MSG_ID = aVar24;
            a aVar25 = new a("PINNED_MSG_IS_UNAVAILABLE", 24, "pinned_msg_is_unavailable", new pbi(3));
            PINNED_MSG_IS_UNAVAILABLE = aVar25;
            a aVar26 = new a("PINNED_MSG_FROM_TYPE", 25, "pinned_msg_from_type", new sbi(3));
            PINNED_MSG_FROM_TYPE = aVar26;
            final int i = 1;
            a aVar27 = new a("PINNED_MSG_FROM_ID", 26, "pinned_msg_from_id", new yzs() { // from class: xsna.kcm
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Peer peer;
                    int i2 = i;
                    SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                    com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i2) {
                        case 0:
                            ChatSettings chatSettings = bVar.z;
                            rdi.j(sQLiteStatement, intValue, chatSettings != null ? Boolean.valueOf(chatSettings.j) : null);
                            break;
                        default:
                            PinnedMsg pinnedMsg = bVar.t;
                            rdi.l(sQLiteStatement, intValue, (pinnedMsg == null || (peer = pinnedMsg.d) == null) ? null : Long.valueOf(peer.d));
                            break;
                    }
                    return s3q0.a;
                }
            });
            PINNED_MSG_FROM_ID = aVar27;
            a aVar28 = new a("PINNED_MSG_TIME", 27, "pinned_msg_time", new tdi(3));
            PINNED_MSG_TIME = aVar28;
            a aVar29 = new a("PINNED_MSG_TITLE", 28, "pinned_msg_title", new dih(3));
            PINNED_MSG_TITLE = aVar29;
            a aVar30 = new a("PINNED_MSG_BODY", 29, "pinned_msg_body", new nh5(2));
            PINNED_MSG_BODY = aVar30;
            a aVar31 = new a("PINNED_MSG_BODY_FORMAT", 30, "pinned_msg_body_format", new ec1(5));
            PINNED_MSG_BODY_FORMAT = aVar31;
            a aVar32 = new a("PINNED_MSG_ATTACHES", 31, "pinned_msg_attaches", new dji(2));
            PINNED_MSG_ATTACHES = aVar32;
            a aVar33 = new a("PINNED_MSG_NESTED", 32, "pinned_msg_nested", new ugi(2));
            PINNED_MSG_NESTED = aVar33;
            a aVar34 = new a("PINNED_CAROUSEL", 33, "pinned_carousel", new tbi(3));
            PINNED_CAROUSEL = aVar34;
            a aVar35 = new a("BAR_CONVERSATION_BUTTONS", 34, "conversation_bar_buttons", new fli(2));
            BAR_CONVERSATION_BUTTONS = aVar35;
            a aVar36 = new a("BAR_CONVERSATION_TYPE", 35, "conversation_bar_type", new gli(2));
            BAR_CONVERSATION_TYPE = aVar36;
            a aVar37 = new a("BAR_CONVERSATION_TITLE", 36, "conversation_bar_title", new ec0(5));
            BAR_CONVERSATION_TITLE = aVar37;
            a aVar38 = new a("BAR_CONVERSATION_SUBTITLE", 37, "conversation_bar_subtitle", new vgi(3));
            BAR_CONVERSATION_SUBTITLE = aVar38;
            a aVar39 = new a("BAR_CONVERSATION_CONTENT", 38, "conversation_bar_content", new wgi(3));
            BAR_CONVERSATION_CONTENT = aVar39;
            a aVar40 = new a("BAR_CONVERSATION_IMAGEURL", 39, "conversation_bar_imageurl", new msh(5));
            BAR_CONVERSATION_IMAGEURL = aVar40;
            a aVar41 = new a("BAR_CONVERSATION_ID", 40, "conversation_bar_id", new xgi(2));
            BAR_CONVERSATION_ID = aVar41;
            a aVar42 = new a("BAR_EXISTS", 41, "bar_exists", new cci(4));
            BAR_EXISTS = aVar42;
            a aVar43 = new a("BAR_NAME", 42, "bar_name", new dci(4));
            BAR_NAME = aVar43;
            a aVar44 = new a("BAR_TITLE", 43, "bar_title", new eci(5));
            BAR_TITLE = aVar44;
            a aVar45 = new a("BAR_TEXT", 44, "bar_text", new fci(3));
            BAR_TEXT = aVar45;
            a aVar46 = new a("BAR_ICON", 45, "bar_icon", new lcm(1));
            BAR_ICON = aVar46;
            a aVar47 = new a("BAR_LEGO_ICON", 46, "bar_lego_icon", new aei(2));
            BAR_LEGO_ICON = aVar47;
            a aVar48 = new a("BAR_ICON_SIZE", 47, "bar_icon_size", new bei(3));
            BAR_ICON_SIZE = aVar48;
            a aVar49 = new a("BAR_ICON_CENTERED", 48, "bar_icon_centered", new mcm(1));
            BAR_ICON_CENTERED = aVar49;
            a aVar50 = new a("BAR_BUTTONS", 49, "bar_buttons", new eei(2));
            BAR_BUTTONS = aVar50;
            a aVar51 = new a("BAR_CAN_HIDE", 50, "bar_can_hide", new hci(3));
            BAR_CAN_HIDE = aVar51;
            a aVar52 = new a("BAR_BACKGROUND", 51, "bar_background", new ici(4));
            BAR_BACKGROUND = aVar52;
            a aVar53 = new a("BAR_PAYLOAD", 52, "bar_payload", new kre(5));
            BAR_PAYLOAD = aVar53;
            a aVar54 = new a("BAR_HIDDEN_LOCALLY", 53, "bar_hidden_locally", new rni(2));
            BAR_HIDDEN_LOCALLY = aVar54;
            a aVar55 = new a("CHAT_SETTINGS_EXISTS", 54, "chat_settings_exists", new lci(3));
            CHAT_SETTINGS_EXISTS = aVar55;
            a aVar56 = new a("CHAT_SETTINGS_TITLE", 55, "chat_settings_title", new nci(3));
            CHAT_SETTINGS_TITLE = aVar56;
            a aVar57 = new a("CHAT_SETTINGS_AVATAR", 56, "chat_settings_avatar", new oci(6));
            CHAT_SETTINGS_AVATAR = aVar57;
            a aVar58 = new a("CHAT_SETTINGS_OWNER_TYPE", 57, "chat_settings_owner_type", new qci(4));
            CHAT_SETTINGS_OWNER_TYPE = aVar58;
            a aVar59 = new a("CHAT_SETTINGS_OWNER_ID", 58, "chat_settings_owner_id", new sci(6));
            CHAT_SETTINGS_OWNER_ID = aVar59;
            a aVar60 = new a("CHAT_SETTINGS_ADMINS", 59, "chat_settings_admins", new nli(3));
            CHAT_SETTINGS_ADMINS = aVar60;
            a aVar61 = new a("CHAT_SETTINGS_MEMBERS_COUNT", 60, "chat_settings_members_count", new tei(3));
            CHAT_SETTINGS_MEMBERS_COUNT = aVar61;
            a aVar62 = new a("CHAT_SETTINGS_IS_CASPER", 61, "chat_settings_is_casper", new mbi(3));
            CHAT_SETTINGS_IS_CASPER = aVar62;
            a aVar63 = new a("CHAT_SETTINGS_IS_WRITING_DISABLED", 62, "chat_settings_is_writing_disabled", new zii(1));
            CHAT_SETTINGS_IS_WRITING_DISABLED = aVar63;
            a aVar64 = new a("CHAT_SETTINGS_WRITING_DISABLED_UNTIL", 63, "chat_settings_writing_disabled_until", new pbi(2));
            CHAT_SETTINGS_WRITING_DISABLED_UNTIL = aVar64;
            a aVar65 = new a("CHAT_SETTINGS_IS_CHANNEL", 64, "chat_settings_is_channel", new qgi(2));
            CHAT_SETTINGS_IS_CHANNEL = aVar65;
            a aVar66 = new a("CHAT_SETTINGS_IS_KICKED", 65, "chat_settings_is_kicked", new sbi(2));
            CHAT_SETTINGS_IS_KICKED = aVar66;
            final int i2 = 0;
            a aVar67 = new a("CHAT_SETTINGS_IS_LEFT", 66, "chat_settings_is_left", new yzs() { // from class: xsna.kcm
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Peer peer;
                    int i22 = i2;
                    SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                    com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i22) {
                        case 0:
                            ChatSettings chatSettings = bVar.z;
                            rdi.j(sQLiteStatement, intValue, chatSettings != null ? Boolean.valueOf(chatSettings.j) : null);
                            break;
                        default:
                            PinnedMsg pinnedMsg = bVar.t;
                            rdi.l(sQLiteStatement, intValue, (pinnedMsg == null || (peer = pinnedMsg.d) == null) ? null : Long.valueOf(peer.d));
                            break;
                    }
                    return s3q0.a;
                }
            });
            CHAT_SETTINGS_IS_LEFT = aVar67;
            a aVar68 = new a("CHAT_SETTINGS_IS_SERVICE", 67, "chat_settings_is_service", new tdi(2));
            CHAT_SETTINGS_IS_SERVICE = aVar68;
            a aVar69 = new a("CHAT_SETTINGS_IS_DONUT", 68, "chat_settings_is_donut", new dih(2));
            CHAT_SETTINGS_IS_DONUT = aVar69;
            a aVar70 = new a("CHAT_SETTINGS_IS_INCOGNITO", 69, "chat_settings_is_incognito", new nh5(1));
            CHAT_SETTINGS_IS_INCOGNITO = aVar70;
            a aVar71 = new a("CHAT_SETTINGS_IS_DISABLE_POPUP_STICKERS_AUTOPLAY", 70, "chat_settings_is_disable_popup_stickers_autoplay", new dji(1));
            CHAT_SETTINGS_IS_DISABLE_POPUP_STICKERS_AUTOPLAY = aVar71;
            a aVar72 = new a("CHAT_SETTINGS_CAN_INVITE", 71, "chat_settings_can_invite", new ugi(1));
            CHAT_SETTINGS_CAN_INVITE = aVar72;
            a aVar73 = new a("CHAT_SETTINGS_CAN_CHANGE_INFO", 72, "chat_settings_can_change_info", new tbi(2));
            CHAT_SETTINGS_CAN_CHANGE_INFO = aVar73;
            a aVar74 = new a("CHAT_SETTINGS_CAN_CHANGE_OWNER", 73, "chat_settings_can_change_owner", new fji(2));
            CHAT_SETTINGS_CAN_CHANGE_OWNER = aVar74;
            a aVar75 = new a("CHAT_SETTINGS_CAN_CHANGE_THEME", 74, "chat_settings_can_change_theme", new fli(1));
            CHAT_SETTINGS_CAN_CHANGE_THEME = aVar75;
            a aVar76 = new a("CHAT_SETTINGS_CAN_CHANGE_PINNED_MSG", 75, "chat_settings_can_change_pinned_msg", new gli(1));
            CHAT_SETTINGS_CAN_CHANGE_PINNED_MSG = aVar76;
            a aVar77 = new a("CHAT_SETTINGS_CAN_PROMOTE_USERS", 76, "chat_settings_can_promote_users", new ec0(4));
            CHAT_SETTINGS_CAN_PROMOTE_USERS = aVar77;
            a aVar78 = new a("CHAT_SETTINGS_CAN_MODERATE", 77, "chat_settings_can_moderate", new vgi(2));
            CHAT_SETTINGS_CAN_MODERATE = aVar78;
            a aVar79 = new a("CHAT_SETTINGS_CAN_COPY", 78, "chat_settings_can_copy", new wgi(2));
            CHAT_SETTINGS_CAN_COPY = aVar79;
            a aVar80 = new a("CHAT_SETTINGS_CAN_CALL", 79, "chat_settings_can_call", new msh(4));
            CHAT_SETTINGS_CAN_CALL = aVar80;
            a aVar81 = new a("CHAT_SETTINGS_CAN_CHANGE_SERVICE_TYPE", 80, "chat_settings_can_change_service_type", new cci(3));
            CHAT_SETTINGS_CAN_CHANGE_SERVICE_TYPE = aVar81;
            a aVar82 = new a("CHAT_SETTINGS_CAN_CHANGE_POPUP_STICKERS_AUTOPLAY", 81, "chat_settings_can_change_stickers_popup_autoplay", new dci(3));
            CHAT_SETTINGS_CAN_CHANGE_POPUP_STICKERS_AUTOPLAY = aVar82;
            a aVar83 = new a("CHAT_SETTINGS_CAN_SEE_INVITE_LINK", 82, "chat_settings_can_see_invite_link", new yi4(6));
            CHAT_SETTINGS_CAN_SEE_INVITE_LINK = aVar83;
            a aVar84 = new a("CHAT_SETTINGS_CAN_USE_MASS_MENTIONS", 83, "chat_settings_can_use_mass_mentions", new eci(4));
            CHAT_SETTINGS_CAN_USE_MASS_MENTIONS = aVar84;
            a aVar85 = new a("CHAT_SETTINGS_CAN_DISABLE_SERVICE_MESSAGES", 84, "chat_settings_can_disable_service_messages", new fci(2));
            CHAT_SETTINGS_CAN_DISABLE_SERVICE_MESSAGES = aVar85;
            a aVar86 = new a("CHAT_SETTINGS_CASPER_CHAT_LINK", 85, "chat_settings_casper_chat_link", new lcm(0));
            CHAT_SETTINGS_CASPER_CHAT_LINK = aVar86;
            a aVar87 = new a("CHAT_SETTINGS_DONUT_OWNER_ID", 86, "chat_settings_donut_owner_id", new aei(1));
            CHAT_SETTINGS_DONUT_OWNER_ID = aVar87;
            a aVar88 = new a("CHAT_SETTINGS_CAN_SEND_REACTIONS", 87, "chat_settings_can_send_reactions", new bei(2));
            CHAT_SETTINGS_CAN_SEND_REACTIONS = aVar88;
            a aVar89 = new a("CHAT_SETTINGS_SHORT_POLL_REACTIONS", 88, "chat_settings_short_poll_reactions", new mcm(0));
            CHAT_SETTINGS_SHORT_POLL_REACTIONS = aVar89;
            a aVar90 = new a("CHAT_SETTINGS_IS_SERVICE_MESSAGES_DISABLED", 89, "chat_settings_is_service_messages_disabled", new rce(4));
            CHAT_SETTINGS_IS_SERVICE_MESSAGES_DISABLED = aVar90;
            a aVar91 = new a("CHAT_SETTINGS_CAN_FORWARD_MESSAGES", 90, "chat_settings_can_forward_messages", new ici(3));
            CHAT_SETTINGS_CAN_FORWARD_MESSAGES = aVar91;
            a aVar92 = new a("CHAT_SETTINGS_CAN_DISABLE_FORWARD_MESSAGES", 91, "chat_settings_can_disable_forward_messages", new qji(3));
            CHAT_SETTINGS_CAN_DISABLE_FORWARD_MESSAGES = aVar92;
            a aVar93 = new a("CHAT_PERMISSIONS_EXISTS", 92, "chat_permissions_exists", new kre(4));
            CHAT_PERMISSIONS_EXISTS = aVar93;
            a aVar94 = new a("CHAT_PERMISSIONS_WHO_CAN_INVITE", 93, "chat_permissions_who_can_invite", new rni(1));
            CHAT_PERMISSIONS_WHO_CAN_INVITE = aVar94;
            a aVar95 = new a("CHAT_PERMISSIONS_WHO_CAN_CHANGE_INFO", 94, "chat_permissions_who_can_change_info", new lci(2));
            CHAT_PERMISSIONS_WHO_CAN_CHANGE_INFO = aVar95;
            a aVar96 = new a("CHAT_PERMISSIONS_WHO_CAN_CHANGE_PIN", 95, "chat_permissions_who_can_change_pin", new nci(2));
            CHAT_PERMISSIONS_WHO_CAN_CHANGE_PIN = aVar96;
            a aVar97 = new a("CHAT_PERMISSIONS_WHO_CAN_USE_MASS_MENTIONS", 96, "chat_permissions_who_can_use_mass_mentions", new oci(5));
            CHAT_PERMISSIONS_WHO_CAN_USE_MASS_MENTIONS = aVar97;
            a aVar98 = new a("CHAT_PERMISSIONS_WHO_CAN_CHANGE_ADMINS", 97, "chat_permissions_who_can_change_admins", new qci(3));
            CHAT_PERMISSIONS_WHO_CAN_CHANGE_ADMINS = aVar98;
            a aVar99 = new a("CHAT_PERMISSIONS_WHO_CAN_SEE_INVITE_LINK", 98, "chat_permissions_who_can_see_invite_link", new nli(2));
            CHAT_PERMISSIONS_WHO_CAN_SEE_INVITE_LINK = aVar99;
            a aVar100 = new a("CHAT_PERMISSIONS_WHO_CAN_CALL", 99, "chat_permissions_who_can_call", new pm(2));
            CHAT_PERMISSIONS_WHO_CAN_CALL = aVar100;
            a aVar101 = new a("CHAT_PERMISSIONS_WHO_CAN_CHANGE_THEME", 100, "chat_permissions_who_can_change_theme", new thi(1));
            CHAT_PERMISSIONS_WHO_CAN_CHANGE_THEME = aVar101;
            a aVar102 = new a("GROUP_CALL_JOIN_LINK", 101, "group_call_join_link", new scm());
            GROUP_CALL_JOIN_LINK = aVar102;
            a aVar103 = new a("GROUP_CALL_VK_JOIN_LINK", 102, "group_call_vk_join_link", new pai(3));
            GROUP_CALL_VK_JOIN_LINK = aVar103;
            a aVar104 = new a("GROUP_CALL_CAN_FINISH_CALL", 103, "group_call_can_finish_call", new fgi(3));
            GROUP_CALL_CAN_FINISH_CALL = aVar104;
            a aVar105 = new a("GROUP_CALL_PARTICIPANTS", 104, "group_call_participants", new qgi(3));
            GROUP_CALL_PARTICIPANTS = aVar105;
            a aVar106 = new a("GROUP_CALL_BANNER_HIDDEN_LOCALLY", 105, "group_call_banner_hidden_locally", new fji(3));
            GROUP_CALL_BANNER_HIDDEN_LOCALLY = aVar106;
            a aVar107 = new a("THEME_ID", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, "theme_id", new yi4(7));
            THEME_ID = aVar107;
            a aVar108 = new a("KEYBOARD_EXISTS", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "keyboard_exists", new qji(4));
            KEYBOARD_EXISTS = aVar108;
            a aVar109 = new a("KEYBOARD_AUTHOR_TYPE", 108, "keyboard_author_type", new rm(2));
            KEYBOARD_AUTHOR_TYPE = aVar109;
            a aVar110 = new a("KEYBOARD_AUTHOR_ID", 109, "keyboard_author_id", new ec1(4));
            KEYBOARD_AUTHOR_ID = aVar110;
            a aVar111 = new a("KEYBOARD_ONE_TIME", 110, "keyboard_one_time", new eei(1));
            KEYBOARD_ONE_TIME = aVar111;
            a aVar112 = new a("KEYBOARD_COLUMN_COUNT", 111, "keyboard_column_count", new sci(5));
            KEYBOARD_COLUMN_COUNT = aVar112;
            a aVar113 = new a("KEYBOARD_BUTTONS", 112, "keyboard_buttons", new rch(4));
            KEYBOARD_BUTTONS = aVar113;
            a aVar114 = new a("KEYBOARD_VISIBLE", 113, "keyboard_visible", new ncm());
            KEYBOARD_VISIBLE = aVar114;
            a aVar115 = new a("DRAFT_MSG", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, "draft_msg", new ocm());
            DRAFT_MSG = aVar115;
            a aVar116 = new a("MSG_REQUEST_STATUS", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, "msg_request_status", new yji(1));
            MSG_REQUEST_STATUS = aVar116;
            a aVar117 = new a("MSG_REQUEST_STATUS_PENDING", 116, "msg_request_status_pending", new bdi(2));
            MSG_REQUEST_STATUS_PENDING = aVar117;
            a aVar118 = new a("MSG_REQUEST_STATUS_DESIRED", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "msg_request_status_desired", new pcm(0));
            MSG_REQUEST_STATUS_DESIRED = aVar118;
            a aVar119 = new a("MSG_REQUEST_DATE", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "msg_request_date", new ffi(2));
            MSG_REQUEST_DATE = aVar119;
            a aVar120 = new a("MSG_REQUEST_INVITER_TYPE", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "msg_request_inviter_type", new qcm());
            MSG_REQUEST_INVITER_TYPE = aVar120;
            a aVar121 = new a("MSG_REQUEST_INVITER_ID", 120, "msg_request_inviter_id", new yhi(1));
            MSG_REQUEST_INVITER_ID = aVar121;
            a aVar122 = new a("UNREAD_MENTION_MSG_CNV_IDS", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "unread_mention_msg_cnv_ids", new ddi(2));
            UNREAD_MENTION_MSG_CNV_IDS = aVar122;
            a aVar123 = new a("TAGS", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "tags", new jfi(1));
            TAGS = aVar123;
            a aVar124 = new a("EXPIRE_MSG_CNV_IDS", 123, "expire_msg_cnv_ids", new m35(3));
            EXPIRE_MSG_CNV_IDS = aVar124;
            a aVar125 = new a("BUSINESS_NOTIFY_INFO_DIALOG_ID", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, "business_notify_info_dialog_id", new eki(1));
            BUSINESS_NOTIFY_INFO_DIALOG_ID = aVar125;
            a aVar126 = new a("BUSINESS_NOTIFY_INFO_LAST_MSG_CNV_ID", 125, "business_notify_info_last_msg_cnv_id", new n35(1));
            BUSINESS_NOTIFY_INFO_LAST_MSG_CNV_ID = aVar126;
            a aVar127 = new a("BUSINESS_NOTIFY_INFO_COUNT_UNREAD", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, "business_notify_info_count_unread", new rcm(0));
            BUSINESS_NOTIFY_INFO_COUNT_UNREAD = aVar127;
            a aVar128 = new a("BUSINESS_NOTIFY_INFO_VISIBLE", 127, "business_notify_info_visible", new pfi(2));
            BUSINESS_NOTIFY_INFO_VISIBLE = aVar128;
            a aVar129 = new a("PHASE_ID", 128, "phase_id", new ath(3));
            PHASE_ID = aVar129;
            a aVar130 = new a("SPAM_EXPIRATION", 129, "spam_expiration", new fii(2));
            SPAM_EXPIRATION = aVar130;
            a aVar131 = new a("PAYLOAD", 130, "payload", new gii(1));
            PAYLOAD = aVar131;
            a aVar132 = new a("IS_NEW", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, "is_new", new ndi(3));
            IS_NEW = aVar132;
            a aVar133 = new a("IS_ARCHIVED", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, "is_archived", new iii(3));
            IS_ARCHIVED = aVar133;
            a aVar134 = new a("UNREAD_REACTIONS", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "unread_reactions", new jii(1));
            UNREAD_REACTIONS = aVar134;
            a aVar135 = new a("LOCALLY_READ_REACTIONS", 134, "locally_read_reactions", new tcm(0));
            LOCALLY_READ_REACTIONS = aVar135;
            a aVar136 = new a("FLAGS", 135, "flags", new nai(2));
            FLAGS = aVar136;
            a aVar137 = new a("IS_PROMO", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, "is_promo", new rai(3));
            IS_PROMO = aVar137;
            a aVar138 = new a("VERSION", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "version", new jmi(1));
            VERSION = aVar138;
            a aVar139 = new a("IS_DEAD", 138, "is_dead", new odi(3));
            IS_DEAD = aVar139;
            a aVar140 = new a("CAN_PROMO_GIFTS", 139, "can_promo_gifts", new pii(2));
            CAN_PROMO_GIFTS = aVar140;
            a aVar141 = new a("TRANSITION_DATA", VersionConstants.PRODUCT_MAJOR_VERSION, "transition_data", new sth(4));
            TRANSITION_DATA = aVar141;
            a aVar142 = new a("TIMESTAMP", 141, "timestamp", new mmi(1));
            TIMESTAMP = aVar142;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38, aVar39, aVar40, aVar41, aVar42, aVar43, aVar44, aVar45, aVar46, aVar47, aVar48, aVar49, aVar50, aVar51, aVar52, aVar53, aVar54, aVar55, aVar56, aVar57, aVar58, aVar59, aVar60, aVar61, aVar62, aVar63, aVar64, aVar65, aVar66, aVar67, aVar68, aVar69, aVar70, aVar71, aVar72, aVar73, aVar74, aVar75, aVar76, aVar77, aVar78, aVar79, aVar80, aVar81, aVar82, aVar83, aVar84, aVar85, aVar86, aVar87, aVar88, aVar89, aVar90, aVar91, aVar92, aVar93, aVar94, aVar95, aVar96, aVar97, aVar98, aVar99, aVar100, aVar101, aVar102, aVar103, aVar104, aVar105, aVar106, aVar107, aVar108, aVar109, aVar110, aVar111, aVar112, aVar113, aVar114, aVar115, aVar116, aVar117, aVar118, aVar119, aVar120, aVar121, aVar122, aVar123, aVar124, aVar125, aVar126, aVar127, aVar128, aVar129, aVar130, aVar131, aVar132, aVar133, aVar134, aVar135, aVar136, aVar137, aVar138, aVar139, aVar140, aVar141, aVar142};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
            Companion = new C3798a();
            allColumns = values();
            rawStatement$delegate = new bpn0(new iy2(18));
        }

        public a(String str, int i, String str2, yzs yzsVar) {
            this.columnName = str2;
            this.binding = yzsVar;
        }

        public static String a(a aVar) {
            return aVar.columnName;
        }

        public static String h() {
            StringBuilder sb = new StringBuilder("REPLACE INTO dialogs (");
            a[] aVarArr = allColumns;
            sb.append(rl3.Z(aVarArr, null, null, null, new af2(15), 31));
            sb.append(") VALUES (");
            return ho8.a(sb, rli0.r(rli0.y(dli0.f(new fc(10)), aVarArr.length), null, null, 63), ')');
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final void k(SQLiteStatement sQLiteStatement, com.vk.im.engine.models.dialogs.b bVar) {
            this.binding.invoke(sQLiteStatement, bVar, Integer.valueOf(ordinal() + 1));
        }
    }

    @Override // xsna.jcm
    public final void a(SQLiteStatement sQLiteStatement, long j, Attach attach) {
        sQLiteStatement.bindLong(1, j);
        sQLiteStatement.bindLong(2, attach.xb());
        Object obj = j14.a;
        sQLiteStatement.bindLong(3, j14.b(attach.getClass()));
        sQLiteStatement.bindLong(4, j14.a(attach));
        sQLiteStatement.bindLong(5, attach.q().b);
    }

    @Override // xsna.jcm
    public final SQLiteStatement b(e0w e0wVar) {
        return e0wVar.g("\n            REPLACE INTO dialog_pinned_msg_attaches(dialog_id,attach_local_id,content_type,content_id,content_owner_id)\n            VALUES (?,?,?,?,?)\n            ");
    }

    public final void c(SQLiteStatement sQLiteStatement, com.vk.im.engine.models.dialogs.b bVar) {
        a.Companion.getClass();
        for (a aVar : a.allColumns) {
            aVar.k(sQLiteStatement, bVar);
        }
    }
}
