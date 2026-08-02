package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import defpackage.cex;
import defpackage.kju0;
import java.util.Map;

/* loaded from: classes15.dex */
public class UserData {

    @Json(name = "account_type")
    public AccountType accountType;

    @Json(name = "avatar_id")
    public String avatarId;

    @Json(name = "average_response_time")
    public Long averageResponseTime;

    @Json(name = ContactsFragment.WEBVIEW_NAME)
    public Contact[] contacts;

    @cex
    @Json(name = "display_name")
    public String displayName;

    @Json(name = "employee_info")
    public EmployeeInfo employeeInfo;

    @Json(name = "employees_info")
    public EmployeeInfo[] employeesInfo;

    @Json(name = "is_display_restricted")
    public boolean isDisplayRestricted;

    @Json(name = "is_robot")
    public boolean isRobot;

    @Json(name = "localization_descriptor")
    public LocalizationDescriptor localizationDescriptor;

    @Json(name = "localization")
    public Map<String, LocalizedData> localizationMap;

    @Json(name = kju0.j)
    public Metadata metadata;

    @Json(name = "nickname")
    public String nickname;

    @Json(name = "phone_id")
    public String phoneId;

    @Json(name = "robot_info")
    public RobotInfo robotInfo;

    @Json(name = "role")
    public String role;

    @cex
    @Json(name = "guid")
    public String userId;

    @Json(name = "version")
    public long version;

    @Json(name = "website")
    public String website;

    @Json(name = "account_deleted")
    public boolean accountDeleted = false;

    @Json(name = "member_rights")
    public int memberRights = -1;

    public static class Contact {

        @Json(name = "default")
        public boolean isDefault;

        @Json(name = "is_legal")
        public Boolean isLegal;

        @Json(name = "organization_id")
        public Long organizationId;

        @cex
        @Json(name = "type")
        public String type;

        @cex
        @Json(name = "value")
        public String value;
    }

    public static class DepartmentInfo {

        @Json(name = "id")
        public String id;

        @Json(name = "name")
        public String name;
    }

    public static class EmployeeInfo {

        @Json(name = "department")
        public DepartmentInfo department;

        @Json(name = "display_name")
        public String displayName;

        @Json(name = "guest_organization_name")
        public String guestOrganizationName;

        @Json(name = "organization_id")
        public long organizationId;

        @Json(name = "organization_name")
        public String organizationName;

        @Json(name = "position")
        public String position;

        @Json(name = "is_guest")
        public boolean isGuest = false;

        @Json(name = "deleted")
        public boolean deleted = false;
    }

    /* loaded from: classes6.dex */
    public static class LocalizationDescriptor {

        @Json(name = "default")
        public String defaultLang;

        @Json(name = "langs")
        public String[] langs;

        @Json(name = "version")
        public long version;
    }

    public static class LocalizedData {

        @Json(name = "avatar_id")
        public String avatarId;

        @Json(name = "display_name")
        public String displayName;
    }

    public static class RobotInfo {

        @Json(name = "cannot_be_blocked")
        public boolean cannotBeBlocked;

        @Json(name = "disable_privates")
        public boolean disablePrivates;

        @Json(name = "is_support")
        public boolean isSupport;
    }
}
