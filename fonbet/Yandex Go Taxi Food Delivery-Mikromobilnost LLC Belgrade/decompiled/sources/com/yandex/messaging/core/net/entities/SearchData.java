package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import defpackage.cex;
import io.appmetrica.analytics.rtm.internal.Constants;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes15.dex */
public class SearchData {

    @Json(name = "messages")
    public Messages messages;

    @Json(name = "users_and_chats")
    public UsersAndChats usersAndChats;

    @Json(name = "users_groups_departments")
    public UsersGroupsDepartments usersGroupsDepartments;

    @Json(name = "warnings")
    public Warnings warnings;

    public static class CommonSearchData {

        @Json(name = "avatar_id")
        public String avatarId;

        @Json(name = "department_id")
        public Long departmentId;

        @Json(name = "display_name")
        public String displayName;

        @Json(name = "employees_info")
        public OrganizationSearchData[] employeesInfo;

        @Json(name = "group_id")
        public Long groupId;

        @Json(name = "guid")
        public String guid;

        @Json(name = "members_count")
        public Integer membersCount;

        @Json(name = "name")
        public String name;

        @Json(name = "organization_id")
        public Long organizationId;

        @Json(name = "organization_name")
        public String organizationName;

        @Json(name = "phone_id")
        public String phoneId;

        @Json(name = "version")
        public Long version;
    }

    public static class CommonSearchEntity {

        @Json(name = Constants.KEY_DATA)
        public CommonSearchData data;

        @Json(name = "entity")
        public String entity;

        @Json(name = "type")
        public String type;
    }

    public enum ItemType {
        USERS_PVP("users_pvp"),
        CHATS("chats"),
        CONTACTS(ContactsFragment.WEBVIEW_NAME),
        USERS_GLOBAL("users_global"),
        CHANNELS("channels");

        private final String mName;

        ItemType(String str) {
            this.mName = str;
        }

        public static ItemType a(String str) {
            for (ItemType itemType : values()) {
                if (itemType.mName.equals(str)) {
                    return itemType;
                }
            }
            return null;
        }
    }

    public static class Message {

        @cex
        @Json(name = Constants.KEY_DATA)
        public ServerMessage serverMessage;
    }

    public static class Messages {

        @Json(name = "items")
        public Message[] items;
    }

    public static class UserOrChat {
        public UserData a;
        public ChatData b;
        public ItemType c;
    }

    public static class UsersAndChats {

        @Json(name = "items")
        public UserOrChat[] items;
    }

    public static class UsersGroupsDepartments {

        @Json(name = "items")
        public CommonSearchEntity[] items;
    }

    public static class Warnings {

        @Json(name = CSPDirectoryConstants.SUBDIRECTORY_USERS)
        public UserData[] users;
    }
}
