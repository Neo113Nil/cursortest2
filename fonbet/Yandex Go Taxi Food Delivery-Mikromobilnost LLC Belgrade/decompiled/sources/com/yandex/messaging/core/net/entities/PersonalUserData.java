package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.cex;
import defpackage.ok80;
import defpackage.wdz;

/* loaded from: classes15.dex */
public class PersonalUserData extends UserData {

    @Json(name = "is_onboarded")
    public boolean isOnboarded;

    @Json(name = "needs_migration_onboarding")
    public boolean needsMigrationOnboarding;

    @Json(name = "organizations")
    public Organization[] organizations;

    @Json(name = "phone")
    public String phone;

    @cex
    @Json(name = "registration_status")
    public String registrationStatus;

    public static class Organization {

        @Json(name = BackendConfig.Restrictions.DISABLED)
        public boolean disabled;

        @Json(name = "public")
        public boolean isPublic;

        @Json(name = "organization_name")
        public String organizationName;

        @Json(name = "rights")
        public long organizationRights;

        @Json(name = "registration_status")
        public String registrationStatus;

        @Json(name = "organization_id")
        public long organizationId = 0;

        @Json(name = "is_guest")
        public boolean isGuest = false;

        public Organization() {
            ok80.c.getClass();
            this.organizationRights = wdz.h();
            this.disabled = false;
        }
    }
}
