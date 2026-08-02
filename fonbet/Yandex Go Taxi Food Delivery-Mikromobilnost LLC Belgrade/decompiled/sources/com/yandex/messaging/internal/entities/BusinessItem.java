package com.yandex.messaging.internal.entities;

import defpackage.cvu0;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.n;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.uw51;
import defpackage.x4e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/messaging/internal/entities/BusinessItem;", "", "User", "Group", "Department", "Companion", "Lcom/yandex/messaging/internal/entities/BusinessItem$Department;", "Lcom/yandex/messaging/internal/entities/BusinessItem$Group;", "Lcom/yandex/messaging/internal/entities/BusinessItem$User;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class BusinessItem {
    public static final String a = "group:";
    public static final String b = "department:";

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/internal/entities/BusinessItem$Companion;", "", "", "kotlin.jvm.PlatformType", "GROUP_TAG", "Ljava/lang/String;", "DEPARTMENT_TAG", "GROUP_PREFIX", "DEPARTMENT_PREFIX", "", "GROUP_TYPE_HASH", CA20Status.STATUS_USER_I, "DEPARTMENT_TYPE_HASH", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Long a(String str) {
            List W;
            if (!cvu0.x(str, BusinessItem.b, false)) {
                str = null;
            }
            if (str != null) {
                W = evu0.W(str, new String[]{":"}, (r2 & 4) != 0 ? 0 : 2);
                String str2 = (String) a.Z(W);
                if (str2 != null) {
                    return Long.valueOf(Long.parseLong(str2));
                }
            }
            return null;
        }

        public static Long b(String str) {
            List W;
            if (!cvu0.x(str, BusinessItem.a, false)) {
                str = null;
            }
            if (str != null) {
                W = evu0.W(str, new String[]{":"}, (r2 & 4) != 0 ? 0 : 2);
                String str2 = (String) a.Z(W);
                if (str2 != null) {
                    return Long.valueOf(Long.parseLong(str2));
                }
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/BusinessItem$Department;", "Lcom/yandex/messaging/internal/entities/BusinessItem;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Department extends BusinessItem {
        public final boolean equals(Object obj) {
            return (obj instanceof Department) && 0 == 0 && 0 == 0;
        }

        public final int hashCode() {
            return Long.hashCode(0L) + qv10.c(62, 31, 0L);
        }

        public final String toString() {
            StringBuilder k = x4e.k("Department(id=", 0L, ", name=", null);
            n.A(k, ", membersCount=", 0, ", organizationId=");
            uw51.v(0L, ", organizationName=", null, k);
            k.append(Extension.C_BRAKE);
            return k.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/BusinessItem$Group;", "Lcom/yandex/messaging/internal/entities/BusinessItem;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Group extends BusinessItem {
        public final boolean equals(Object obj) {
            return (obj instanceof Group) && 0 == 0 && 0 == 0;
        }

        public final int hashCode() {
            return Long.hashCode(0L) + qv10.c(31, 31, 0L);
        }

        public final String toString() {
            StringBuilder k = x4e.k("Group(id=", 0L, ", name=", null);
            n.A(k, ", membersCount=", 0, ", organizationId=");
            uw51.v(0L, ", organizationName=", null, k);
            k.append(Extension.C_BRAKE);
            return k.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/BusinessItem$User;", "Lcom/yandex/messaging/internal/entities/BusinessItem;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class User extends BusinessItem {
        public final boolean equals(Object obj) {
            return (obj instanceof User) && jl40.l(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return oyr.p("User(guid=", null, Extension.C_BRAKE);
        }
    }
}
