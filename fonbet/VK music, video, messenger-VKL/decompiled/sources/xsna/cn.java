package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AuthBridge.kt */
/* loaded from: classes.dex */
public final class cn {
    private static final cn STUB = new cn(UserId.d, "DELETED", "", UserSex.UNKNOWN, "", "", 0, "", null, false, null, null);
    public final UserId a;
    public final String b;
    public final String c;
    public final UserSex d;
    public final String e;
    public final String f;
    public final long g;
    public final String h;
    public final ImageList i;
    public final boolean j;
    public final Boolean k;
    public final VerifyInfo l;
    public final bpn0 m = new bpn0(new an(this, 0));
    public final bpn0 n = new bpn0(new bn(this, 0));
    public final boolean o;

    public cn(UserId userId, String str, String str2, UserSex userSex, String str3, String str4, long j, String str5, ImageList imageList, boolean z, Boolean bool, VerifyInfo.VerifyInfoJSONSerialize verifyInfoJSONSerialize) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = userSex;
        this.e = str3;
        this.f = str4;
        this.g = j;
        this.h = str5;
        this.i = imageList;
        this.j = z;
        this.k = bool;
        this.l = verifyInfoJSONSerialize;
        this.o = userSex == UserSex.FEMALE;
    }

    public final String a() {
        return (String) this.m.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UserProfile b() {
        String str;
        ImageSize imageSize;
        fxj0 fxj0Var;
        UserProfile userProfile = new UserProfile();
        userProfile.d = a();
        userProfile.f = (String) this.n.getValue();
        userProfile.e = userProfile.d + ' ' + userProfile.f;
        userProfile.c = this.a;
        userProfile.h = this.c;
        ArrayList arrayList = null;
        ImageList imageList = this.i;
        if (imageList != null) {
            Iterator<fxj0> it = imageList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fxj0Var = null;
                    break;
                }
                fxj0Var = it.next();
                if (fxj0Var.c7()) {
                    break;
                }
            }
            fxj0 fxj0Var2 = fxj0Var;
            if (fxj0Var2 != null) {
                str = fxj0Var2.getUrl();
                userProfile.g = str;
                if (imageList != null) {
                    arrayList = new ArrayList(c5g.u(imageList, 10));
                    Iterator<fxj0> it2 = imageList.iterator();
                    while (it2.hasNext()) {
                        fxj0 next = it2.next();
                        if (next.c7()) {
                            m900<String, ImageSize> m900Var = ImageSize.e;
                            imageSize = ImageSize.b.a(next.getUrl());
                        } else {
                            imageSize = new ImageSize(next.getUrl(), next.getWidth(), next.getHeight(), null, (char) 0, false, 56, null);
                        }
                        arrayList.add(imageSize);
                    }
                }
                userProfile.O = new Image(arrayList);
                userProfile.i = this.d;
                userProfile.p = this.e;
                userProfile.Y = this.j;
                Boolean bool = this.k;
                userProfile.a0 = bool == null ? bool.booleanValue() : false;
                userProfile.b0 = bool != null;
                userProfile.B.Ab(this.l);
                return userProfile;
            }
        }
        str = null;
        userProfile.g = str;
        if (imageList != null) {
        }
        userProfile.O = new Image(arrayList);
        userProfile.i = this.d;
        userProfile.p = this.e;
        userProfile.Y = this.j;
        Boolean bool2 = this.k;
        userProfile.a0 = bool2 == null ? bool2.booleanValue() : false;
        userProfile.b0 = bool2 != null;
        userProfile.B.Ab(this.l);
        return userProfile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn)) {
            return false;
        }
        cn cnVar = (cn) obj;
        return epx.f(this.a, cnVar.a) && epx.f(this.b, cnVar.b) && epx.f(this.c, cnVar.c) && this.d == cnVar.d && epx.f(this.e, cnVar.e) && epx.f(this.f, cnVar.f) && this.g == cnVar.g && epx.f(this.h, cnVar.h) && epx.f(this.i, cnVar.i) && this.j == cnVar.j && epx.f(this.k, cnVar.k) && epx.f(this.l, cnVar.l);
    }

    public final int hashCode() {
        int a = urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
        String str = this.c;
        int a2 = urd0.a((this.d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e);
        String str2 = this.f;
        int a3 = bh10.a((a2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        String str3 = this.h;
        int hashCode = (a3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageList imageList = this.i;
        int b = qoy.b((hashCode + (imageList == null ? 0 : imageList.hashCode())) * 31, 31, this.j);
        Boolean bool = this.k;
        int hashCode2 = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        VerifyInfo verifyInfo = this.l;
        return hashCode2 + (verifyInfo != null ? verifyInfo.hashCode() : 0);
    }

    public final String toString() {
        return "Account(uid=" + this.a + ", name=" + this.b + ", avatarUrl=" + this.c + ", sex=" + this.d + ", birthDate=" + this.e + ", phone=" + this.f + ", joinedDate=" + this.g + ", domain=" + this.h + ", photoImage=" + this.i + ", avatarIsNft=" + this.j + ", isFollowersModeOn=" + this.k + ", verifyInfo=" + this.l + ')';
    }
}
