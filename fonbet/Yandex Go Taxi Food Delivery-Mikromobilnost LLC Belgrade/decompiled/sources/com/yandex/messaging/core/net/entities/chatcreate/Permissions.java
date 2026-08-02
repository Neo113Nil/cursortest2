package com.yandex.messaging.core.net.entities.chatcreate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.oyr;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/yandex/messaging/core/net/entities/chatcreate/Permissions;", "", CSPDirectoryConstants.SUBDIRECTORY_USERS, "", "", "groups", "", "departments", "<init>", "([Ljava/lang/String;[Ljava/lang/Long;[Ljava/lang/Long;)V", "getUsers", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getGroups", "()[Ljava/lang/Long;", "[Ljava/lang/Long;", "getDepartments", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "copy", "([Ljava/lang/String;[Ljava/lang/Long;[Ljava/lang/Long;)Lcom/yandex/messaging/core/net/entities/chatcreate/Permissions;", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Permissions {

    @Json(name = "departments")
    private final Long[] departments;

    @Json(name = "groups")
    private final Long[] groups;

    @Json(name = CSPDirectoryConstants.SUBDIRECTORY_USERS)
    private final String[] users;

    public /* synthetic */ Permissions(String[] strArr, Long[] lArr, Long[] lArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr, (i & 2) != 0 ? new Long[0] : lArr, (i & 4) != 0 ? new Long[0] : lArr2);
    }

    public static /* synthetic */ Permissions copy$default(Permissions permissions, String[] strArr, Long[] lArr, Long[] lArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = permissions.users;
        }
        if ((i & 2) != 0) {
            lArr = permissions.groups;
        }
        if ((i & 4) != 0) {
            lArr2 = permissions.departments;
        }
        return permissions.copy(strArr, lArr, lArr2);
    }

    /* renamed from: component1, reason: from getter */
    public final String[] getUsers() {
        return this.users;
    }

    /* renamed from: component2, reason: from getter */
    public final Long[] getGroups() {
        return this.groups;
    }

    /* renamed from: component3, reason: from getter */
    public final Long[] getDepartments() {
        return this.departments;
    }

    public final Permissions copy(String[] users, Long[] groups, Long[] departments) {
        return new Permissions(users, groups, departments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Permissions.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Permissions permissions = (Permissions) other;
        return Arrays.equals(this.users, permissions.users) && Arrays.equals(this.groups, permissions.groups) && Arrays.equals(this.departments, permissions.departments);
    }

    public final Long[] getDepartments() {
        return this.departments;
    }

    public final Long[] getGroups() {
        return this.groups;
    }

    public final String[] getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.users) * 31) + Arrays.hashCode(this.groups)) * 31) + Arrays.hashCode(this.departments);
    }

    public String toString() {
        String arrays = Arrays.toString(this.users);
        String arrays2 = Arrays.toString(this.groups);
        return oyr.t(b64.v("Permissions(users=", arrays, ", groups=", arrays2, ", departments="), Arrays.toString(this.departments), Extension.C_BRAKE);
    }

    public Permissions(String[] strArr, Long[] lArr, Long[] lArr2) {
        this.users = strArr;
        this.groups = lArr;
        this.departments = lArr2;
    }
}
